package tv.danmaku.ijk.media.player;

import android.os.Handler;
import android.os.Message;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.util.b;
import com.taobao.vpm.VPMManagerInstance;
import java.util.HashMap;
import tb.kge;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes.dex */
public class AdaptiveLiveController implements Handler.Callback, IMediaPlayer.OnInfoListener, IMediaPlayer.OnPlayerEventListener {
    private static final float DECISE_DOWN_SHIFT_THRESHOLD = 0.2f;
    private static final int DECISE_FREEZE_THRESHOLD = 30000;
    private static final int DECISE_MIM_STEP_INTERVAL = 1000;
    private static final int DECISE_NORMAL_STEP_INTERVAL = 10000;
    private static final int DECISE_TIME_MSG = 0;
    private static final float DECISE_UP_SHIFT_THRESHOLD = 0.0f;
    private int mABId;
    private boolean mEnableAdaptiveLive;
    private long mFreezeTimeAfterDeciseResult;
    private boolean mHasFirstRender;
    private TaobaoMediaPlayer mPlayer;
    private long mStallStartTime;
    private long mStartTime;
    private long mVpmSessioinId;
    private int mDeciseNoramlStepInterval = 10000;
    private float mUpShiftThreshold = 0.0f;
    private float mDownShiftThreshold = 0.2f;
    private int mDeciseFreezeTHRESHOLD = 30000;
    private Handler mHandler = new Handler(this);

    static {
        kge.a(1849982255);
        kge.a(-121259976);
        kge.a(-1043440182);
        kge.a(552114839);
    }

    public AdaptiveLiveController(TaobaoMediaPlayer taobaoMediaPlayer) {
        this.mPlayer = taobaoMediaPlayer;
    }

    private boolean canDecise() {
        if (!this.mEnableAdaptiveLive || this.mVpmSessioinId == 0 || !this.mHasFirstRender || this.mStartTime == 0) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.mFreezeTimeAfterDeciseResult;
        if (j == 0) {
            j = this.mStallStartTime;
        }
        long j2 = currentTimeMillis - j;
        if (this.mFreezeTimeAfterDeciseResult > 0 && j2 < this.mDeciseFreezeTHRESHOLD) {
            return false;
        }
        long curStallTime = getCurStallTime();
        long j3 = currentTimeMillis - this.mStartTime;
        return curStallTime != 0 || j3 >= ((long) this.mDeciseNoramlStepInterval) || j3 <= 0;
    }

    private void colloectVideoBufferStall(long j) {
        if (this.mVpmSessioinId > 0) {
            VPMManagerInstance.getInstance().collectInfo(this.mVpmSessioinId, "abr_stall_duration", ((float) j) / 1000.0f, 10.0f);
        }
    }

    private int decise() {
        int i = 0;
        if (!canDecise()) {
            return 0;
        }
        HashMap<String, String> hAMetrics = VPMManagerInstance.getInstance().getHAMetrics(this.mVpmSessioinId, "PlayerBufferRate");
        long curStallTime = getCurStallTime();
        long j = 0;
        if (hAMetrics.containsKey("abr_stall_duration")) {
            j = b.d(hAMetrics.get("abr_stall_duration")) * 1000.0f;
        }
        long j2 = curStallTime + j;
        int i2 = this.mDeciseNoramlStepInterval;
        if (j2 <= i2 * this.mUpShiftThreshold) {
            i = 1;
        } else if (j2 > i2 * this.mDownShiftThreshold) {
            i = -1;
        }
        AVSDKLog.e(c.MODULE_SDK_PAGE, "decise metrics=" + hAMetrics + ", switchLevel=" + i);
        return i;
    }

    private long getCurStallTime() {
        if (this.mStallStartTime > 0) {
            return System.currentTimeMillis() - this.mStallStartTime;
        }
        return 0L;
    }

    private void startTimer() {
        if (this.mStartTime > 0) {
            this.mHandler.sendEmptyMessageDelayed(0, 1000L);
        }
    }

    private void stopTimer() {
        this.mHandler.removeMessages(0);
    }

    public int getDeciseWindow() {
        return this.mDeciseNoramlStepInterval;
    }

    public String getPlayExStat() {
        if (!this.mEnableAdaptiveLive) {
            return "";
        }
        return "abr_id=" + this.mABId;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.mEnableAdaptiveLive && message.what == 0) {
            int decise = decise();
            if (decise == 1 || decise == -1) {
                this.mPlayer.notifySwitchLiveLevel(decise);
            }
            startTimer();
        }
        return false;
    }

    public void initParam(boolean z, int i, int i2, float f, float f2) {
        this.mEnableAdaptiveLive = z;
        this.mABId = i;
        this.mDeciseNoramlStepInterval = i2;
        this.mUpShiftThreshold = f;
        this.mDownShiftThreshold = f2;
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnPlayerEventListener
    public int onEvent(IMediaPlayer iMediaPlayer, int i) {
        if (i == 2) {
            this.mStartTime = System.currentTimeMillis();
            startTimer();
            return 0;
        } else if (i != 3) {
            return 0;
        } else {
            stop();
            return 0;
        }
    }

    @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
    public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        long j4;
        if (!this.mEnableAdaptiveLive) {
            return false;
        }
        if (j == 3) {
            this.mHasFirstRender = true;
            this.mVpmSessioinId = this.mPlayer.getVPMSessioinId();
        } else {
            if (j == 741) {
                j4 = System.currentTimeMillis();
            } else if (j == 742) {
                colloectVideoBufferStall(System.currentTimeMillis() - this.mStallStartTime);
                j4 = 0;
            }
            this.mStallStartTime = j4;
        }
        return false;
    }

    public void stop() {
        this.mStartTime = 0L;
        stopTimer();
    }

    public void useDeciseResult() {
        this.mFreezeTimeAfterDeciseResult = System.currentTimeMillis();
    }
}
