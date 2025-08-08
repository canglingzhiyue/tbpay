package com.taobao.mediaplay.playercontrol;

import android.os.Handler;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.media.MediaTimeUtils;
import com.taobao.mediaplay.MediaContext;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.taobao.R;
import tb.kge;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes7.dex */
public class MediaPlayNormalController implements Handler.Callback, SeekBar.OnSeekBarChangeListener, com.taobao.mediaplay.player.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int HIDE_DELAY_TIME = 4000;
    private static final int MSG_HIDE_CONTROLLER = 0;
    private static final String TAG = "MediaPlayController";
    public int duration;
    public com.taobao.mediaplay.playercontrol.a mControllerHolder;
    private MediaContext mDWContext;
    private Handler mHandler;
    private FrameLayout mHost;
    private b mMediaPlayControlListener;
    private a mNormalControllerListener;
    private int mTotalTime;
    public boolean startTracking;
    private boolean mHideControllerView = false;
    private int newPosition = 0;

    /* loaded from: classes7.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        kge.a(303893598);
        kge.a(-1043440182);
        kge.a(-613305621);
        kge.a(-1967544404);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        }
    }

    public static /* synthetic */ b access$000(MediaPlayNormalController mediaPlayNormalController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("418c3278", new Object[]{mediaPlayNormalController}) : mediaPlayNormalController.mMediaPlayControlListener;
    }

    public MediaPlayNormalController(MediaContext mediaContext) {
        this.mDWContext = mediaContext;
        initView();
        this.mHandler = new Handler(this);
    }

    public void setIMediaPlayControlListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("717fca11", new Object[]{this, bVar});
        } else {
            this.mMediaPlayControlListener = bVar;
        }
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mHost;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.mHost = (FrameLayout) LayoutInflater.from(this.mDWContext.getContext()).inflate(R.layout.media_play_bottom_controller, (ViewGroup) null, false);
        this.mControllerHolder = new com.taobao.mediaplay.playercontrol.a();
        com.taobao.mediaplay.playercontrol.a aVar = this.mControllerHolder;
        FrameLayout frameLayout = this.mHost;
        aVar.f18059a = frameLayout;
        aVar.b = frameLayout.findViewById(R.id.mediaplay_controller_layout);
        this.mControllerHolder.d = (TextView) this.mHost.findViewById(R.id.mediaplay_controller_current_time);
        this.mControllerHolder.c = (TextView) this.mHost.findViewById(R.id.mediaplay_controller_total_time);
        this.mControllerHolder.e = (SeekBar) this.mHost.findViewById(R.id.mediaplay_controller_seekBar);
        this.mControllerHolder.g = (FrameLayout) this.mHost.findViewById(R.id.video_controller_fullscreen);
        this.mControllerHolder.f = new ImageView(this.mDWContext.getContext());
        int dip2px = DWViewUtil.dip2px(this.mDWContext.getContext(), 2.0f);
        this.mControllerHolder.f.setPadding(dip2px, dip2px, dip2px, dip2px);
        this.mControllerHolder.g.addView(this.mControllerHolder.f, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = this.mControllerHolder.g;
        if (!this.mDWContext.mNeedScreenButton) {
            i = 4;
        }
        frameLayout2.setVisibility(i);
        if (!this.mDWContext.mNeedScreenButton) {
            this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 12.0f);
        }
        if (this.mControllerHolder.e != null) {
            this.mControllerHolder.e.setOnSeekBarChangeListener(this);
            this.mControllerHolder.e.setMax(1000);
        }
        if (this.mDWContext.getVideo() != null) {
            int i2 = this.duration;
            if (i2 == 0) {
                i2 = this.mDWContext.getVideo().d();
            }
            this.duration = i2;
            if (this.duration >= 0) {
                this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(this.duration));
            }
        }
        this.mControllerHolder.h = R.drawable.mediaplay_sdk_fullscreen;
        this.mControllerHolder.i = R.drawable.mediaplay_sdk_unfullscreen;
        this.mControllerHolder.f.setImageResource(this.mControllerHolder.h);
        if (this.mControllerHolder.f == null) {
            return;
        }
        this.mControllerHolder.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.mediaplay.playercontrol.MediaPlayNormalController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (MediaPlayNormalController.access$000(MediaPlayNormalController.this) == null) {
                } else {
                    MediaPlayNormalController.access$000(MediaPlayNormalController.this).c();
                }
            }
        });
    }

    public boolean showing() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27ce99d0", new Object[]{this})).booleanValue() : this.mControllerHolder.b.getVisibility() == 0;
    }

    public void addFullScreenCustomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
        } else if (view == null || this.mControllerHolder.g == null) {
        } else {
            this.mControllerHolder.g.removeAllViews();
            this.mControllerHolder.g.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void removeFullScreenCustomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
        } else if (this.mControllerHolder.g == null) {
        } else {
            this.mControllerHolder.g.removeAllViews();
            this.mControllerHolder.g.addView(this.mControllerHolder.f);
        }
    }

    public void hideControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f2dd4a", new Object[]{this});
            return;
        }
        this.mHideControllerView = true;
        hideControllerInner();
    }

    public void showControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67080245", new Object[]{this});
            return;
        }
        this.mHideControllerView = false;
        showControllerInner();
    }

    public void setNormalControllerListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a438b74", new Object[]{this, aVar});
        } else {
            this.mNormalControllerListener = aVar;
        }
    }

    public void showControllerInner() {
        com.taobao.mediaplay.playercontrol.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb064d64", new Object[]{this});
        } else if (this.mHideControllerView || showing() || (aVar = this.mControllerHolder) == null) {
        } else {
            aVar.b.setVisibility(0);
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
                this.mHandler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
            }
            a aVar2 = this.mNormalControllerListener;
            if (aVar2 == null) {
                return;
            }
            aVar2.b();
        }
    }

    public void hideControllerInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d76d2ff", new Object[]{this});
        } else if (!showing()) {
        } else {
            this.mControllerHolder.b.setVisibility(8);
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeMessages(0);
            }
            a aVar = this.mNormalControllerListener;
            if (aVar == null) {
                return;
            }
            aVar.a();
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            this.duration = this.mDWContext.getVideo().d();
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(this.duration));
        }
        this.mControllerHolder.e.setEnabled(true);
        hideControllerInner();
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, Constants.STARTUP_TIME_LEVEL_1);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(this.mDWContext.getVideoToken()) && this.duration == 0) {
            this.duration = this.mDWContext.getVideo().d();
            this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(this.duration));
        }
        this.mControllerHolder.e.setEnabled(true);
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            return;
        }
        this.mControllerHolder.e.setEnabled(true);
        int i = this.duration;
        if (i == 0) {
            i = (int) ((AbstractMediaPlayer) iMediaPlayer).getDuration();
        }
        this.duration = i;
        if (this.duration < 0) {
            return;
        }
        this.mControllerHolder.c.setText(MediaTimeUtils.msStringForTime(this.duration));
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else {
            resetViewState();
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        } else {
            this.mControllerHolder.e.setEnabled(false);
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        } else {
            this.newPosition = 0;
        }
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        } else if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
            onVideoNormalScreen();
        } else {
            onVideoFullScreen(mediaPlayScreenType);
        }
    }

    private void onVideoFullScreen(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("968edf99", new Object[]{this, mediaPlayScreenType});
            return;
        }
        if (MediaPlayScreenType.LANDSCAPE_FULL_SCREEN == mediaPlayScreenType) {
            updatePlayerController(true);
        }
        if (this.mControllerHolder.f == null) {
            return;
        }
        this.mControllerHolder.f.setImageResource(this.mControllerHolder.i);
    }

    private void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        updatePlayerController(false);
        if (this.mControllerHolder.f == null) {
            return;
        }
        this.mControllerHolder.f.setImageResource(this.mControllerHolder.h);
    }

    private void updatePlayerController(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404bbaa7", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null) {
            return;
        }
        if (z) {
            aVar.b.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getContext(), 68.0f);
            this.mControllerHolder.d.setTextSize(2, 14.0f);
            this.mControllerHolder.c.setTextSize(2, 14.0f);
            if (this.mDWContext.mNeedScreenButton) {
                this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 40.0f);
            } else {
                this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 14.0f);
            }
            this.mControllerHolder.g.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getContext(), 40.0f);
            this.mControllerHolder.f18059a.requestLayout();
            return;
        }
        aVar.b.getLayoutParams().height = DWViewUtil.dip2px(this.mDWContext.getContext(), 48.0f);
        this.mControllerHolder.d.setTextSize(2, 10.0f);
        this.mControllerHolder.c.setTextSize(2, 10.0f);
        if (this.mDWContext.mNeedScreenButton) {
            this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 30.0f);
        } else {
            this.mControllerHolder.g.getLayoutParams().width = DWViewUtil.dip2px(this.mDWContext.getContext(), 12.0f);
        }
        this.mControllerHolder.g.getLayoutParams().height = -1;
        this.mControllerHolder.f18059a.requestLayout();
    }

    @Override // com.taobao.mediaplay.player.e
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (this.startTracking) {
        } else {
            this.mTotalTime = i3;
            if (i > i3) {
                i = i3;
            }
            this.mControllerHolder.d.setText(MediaTimeUtils.msStringForTime(i));
            this.mControllerHolder.e.setProgress((int) Math.ceil(((i * 1.0f) / i3) * 1000.0f));
            this.mControllerHolder.e.setSecondaryProgress(i2 * 10);
            this.newPosition = i;
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb0524b", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = true;
        if (!MediaSystemUtils.isApkDebuggable()) {
            return;
        }
        com.taobao.taobaoavsdk.util.c.a(TAG, "onProgressChanged --- onStartTrackingTouch ");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49e629f", new Object[]{this, seekBar, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = this.mTotalTime;
        if (i2 < 0 || !z) {
            return;
        }
        this.newPosition = (int) (i2 * (i / 1000.0f));
        if (MediaSystemUtils.isApkDebuggable()) {
            com.taobao.taobaoavsdk.util.c.a(TAG, "onProgressChanged >>> progress:" + i + ", newPosition:" + this.newPosition);
        }
        com.taobao.mediaplay.playercontrol.a aVar = this.mControllerHolder;
        if (aVar == null) {
            return;
        }
        aVar.d.setText(MediaTimeUtils.msStringForTime(this.newPosition));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e63d74d", new Object[]{this, seekBar});
            return;
        }
        this.startTracking = false;
        b bVar = this.mMediaPlayControlListener;
        if (bVar != null) {
            bVar.a(this.newPosition);
        }
        showControllerInner();
    }

    private void resetViewState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdd1264", new Object[]{this});
            return;
        }
        this.newPosition = 0;
        this.mControllerHolder.d.setText(MediaTimeUtils.msStringForTime(0));
        this.mControllerHolder.e.setProgress(0);
        this.mControllerHolder.e.setSecondaryProgress(0);
        this.mControllerHolder.e.setEnabled(false);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (MediaSystemUtils.isApkDebuggable()) {
            com.taobao.taobaoavsdk.util.c.a(TAG, "handleMessage >>> what:" + String.valueOf(message.what) + "," + message.toString());
        }
        if (message.what == 0) {
            hideControllerInner();
        }
        return false;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.mHandler = null;
    }
}
