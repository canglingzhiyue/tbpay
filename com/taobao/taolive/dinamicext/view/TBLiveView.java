package com.taobao.taolive.dinamicext.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.global.setting.c;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.dinamicext.view.a;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import tb.kge;
import tb.ksz;
import tb.mxf;
import tb.pqu;
import tb.pqy;
import tb.prc;
import tb.prd;
import tb.pro;
import tb.prr;
import tb.prz;
import tb.psh;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* loaded from: classes8.dex */
public class TBLiveView extends TUrlImageView implements a.InterfaceC0893a, pqu {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBottomLeftRadius;
    private int mBottomRightRadius;
    private Context mContext;
    private pqy mHandler;
    private boolean mHasStarted;
    private boolean mHasStop;
    private boolean mIsAttachedToWindow;
    private boolean mIsPlaying;
    private boolean mMute;
    private JSONObject mPlayerDataJSON;
    private a mRTCHandler;
    private int mRetryNum;
    private int mTopLeftRadius;
    private int mTopRightRadius;
    private prz mVideoView;
    public ksz provider;

    static {
        kge.a(-1436414496);
        kge.a(-1317704444);
        kge.a(936581251);
    }

    public static /* synthetic */ Object ipc$super(TBLiveView tBLiveView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // tb.pqu
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public static /* synthetic */ pqy access$000(TBLiveView tBLiveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pqy) ipChange.ipc$dispatch("cf1e31e4", new Object[]{tBLiveView}) : tBLiveView.mHandler;
    }

    public static /* synthetic */ boolean access$102(TBLiveView tBLiveView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7c89691", new Object[]{tBLiveView, new Boolean(z)})).booleanValue();
        }
        tBLiveView.mHasStarted = z;
        return z;
    }

    public static /* synthetic */ void access$200(TBLiveView tBLiveView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deaa8b08", new Object[]{tBLiveView});
        } else {
            tBLiveView.onVideoStart();
        }
    }

    public static /* synthetic */ a access$300(TBLiveView tBLiveView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5db8c51e", new Object[]{tBLiveView}) : tBLiveView.mRTCHandler;
    }

    public TBLiveView(Context context) {
        super(context);
        this.mIsPlaying = false;
        this.mHasStarted = false;
        this.mIsAttachedToWindow = false;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
        this.mMute = true;
        this.mHandler = new pqy(this);
        this.mRetryNum = 0;
        this.provider = c.a(Globals.getApplication(), "tbLiveCard").b();
        this.mContext = context;
        init(context);
    }

    public TBLiveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsPlaying = false;
        this.mHasStarted = false;
        this.mIsAttachedToWindow = false;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
        this.mMute = true;
        this.mHandler = new pqy(this);
        this.mRetryNum = 0;
        this.provider = c.a(Globals.getApplication(), "tbLiveCard").b();
        this.mContext = context;
        init(context);
    }

    public TBLiveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsPlaying = false;
        this.mHasStarted = false;
        this.mIsAttachedToWindow = false;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
        this.mMute = true;
        this.mHandler = new pqy(this);
        this.mRetryNum = 0;
        this.provider = c.a(Globals.getApplication(), "tbLiveCard").b();
        this.mContext = context;
        init(context);
    }

    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.mTopLeftRadius = i;
        this.mTopRightRadius = i2;
        this.mBottomLeftRadius = i3;
        this.mBottomRightRadius = i4;
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
            return;
        }
        this.mPlayerDataJSON = jSONObject;
        this.mRTCHandler = null;
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        TLog.loge("TBLiveView", "init ");
        this.mVideoView = new prz((Activity) context, MediaConstant.LBLIVE_SOURCE);
        this.mVideoView.a(false, 2, 0, 0, 0);
        this.mVideoView.a(this.mMute);
        this.mVideoView.b(prr.n());
        this.mVideoView.c(prr.o());
        IMediaPlayer.OnInfoListener onInfoListener = new IMediaPlayer.OnInfoListener() { // from class: com.taobao.taolive.dinamicext.view.TBLiveView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
            public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
                }
                if (j == 3 && TBLiveView.access$000(TBLiveView.this) != null) {
                    TBLiveView.access$000(TBLiveView.this).post(new Runnable() { // from class: com.taobao.taolive.dinamicext.view.TBLiveView.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            TBLiveView.access$102(TBLiveView.this, false);
                            TBLiveView.access$200(TBLiveView.this);
                        }
                    });
                }
                return false;
            }
        };
        this.mVideoView.a(new IMediaPlayer.OnErrorListener() { // from class: com.taobao.taolive.dinamicext.view.TBLiveView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
            public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
                }
                TBLiveView.access$102(TBLiveView.this, false);
                if (TBLiveView.access$300(TBLiveView.this) != null && TBLiveView.access$300(TBLiveView.this).a(iMediaPlayer, i, i2)) {
                    return true;
                }
                TLog.loge("TBLiveView", "onError " + i);
                return false;
            }
        });
        this.mVideoView.a(onInfoListener);
    }

    private void restart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
            return;
        }
        destroy();
        init(this.mContext);
        initView();
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", mxf.initView);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return;
        }
        try {
            viewGroup.addView(this.mVideoView.f(), Math.max(0, ((ViewGroup) getParent()).indexOfChild(this) - 1), layoutParams);
        } catch (Exception unused) {
        }
    }

    public boolean playVideoIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71d85196", new Object[]{this})).booleanValue();
        }
        this.mRetryNum = 0;
        TLog.loge("TBLiveView", "playVideoIfNecessary");
        if (!prc.a() || !this.mIsAttachedToWindow || prc.d(getContext()) || this.mPlayerDataJSON == null) {
            return false;
        }
        TLog.loge("TBLiveView", "playVideoIfNecessary 1");
        MediaLiveInfo convert = convert(this.mPlayerDataJSON);
        if (convert == null) {
            TLog.loge("TBLiveView", "playVideoIfNecessary mediaInfo == null");
            return false;
        }
        if (this.mHasStop) {
            restart();
        }
        if (this.mRTCHandler == null) {
            this.mRTCHandler = new a(convert);
            this.mRTCHandler.a(this);
        }
        psh pshVar = new psh(null, "", convert);
        pshVar.m = this.mPlayerDataJSON.getString("liveConfigForStream");
        pshVar.g = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        pshVar.h = this.mPlayerDataJSON.getString("feedId");
        return startVideo(pshVar);
    }

    private boolean startVideo(psh pshVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("692bd2cf", new Object[]{this, pshVar})).booleanValue();
        }
        TLog.loge("TBLiveView", "startVideo");
        if (pshVar == null) {
            return false;
        }
        ksz kszVar = this.provider;
        if (kszVar != null) {
            int intValue = ((Integer) kszVar.a("tbLiveCard", "video", 1, null)).intValue();
            if (intValue == 2) {
                TLog.loge("TBLiveView", "startVideo iAppSetting == 2");
                return false;
            } else if (intValue == 0 && !isWiFiType(getContext().getApplicationContext())) {
                TLog.loge("TBLiveView", "startVideo iAppSetting == 0");
                return false;
            }
        }
        if (this.mVideoView == null || this.mHasStarted) {
            return false;
        }
        TLog.loge("TBLiveView", "startVideo start");
        this.mVideoView.a(pshVar.d);
        this.mVideoView.a(0);
        this.mVideoView.b(pshVar.h);
        this.mVideoView.a(this.mMute);
        this.mVideoView.a(pshVar.l, null);
        this.mVideoView.a(pro.f(pshVar.m));
        this.mVideoView.a();
        this.mVideoView.b();
        this.mHasStarted = true;
        return true;
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        this.mHasStop = true;
        this.mHasStarted = false;
        if (this.mRTCHandler != null) {
            this.mRTCHandler = null;
        }
        prz przVar = this.mVideoView;
        if (przVar != null) {
            przVar.d();
        }
        onVideoStop();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", "destroy ====");
        if (this.mRTCHandler != null) {
            this.mRTCHandler = null;
        }
        pqy pqyVar = this.mHandler;
        if (pqyVar != null) {
            pqyVar.removeCallbacksAndMessages(null);
        }
        stopVideo();
        prz przVar = this.mVideoView;
        if (przVar != null) {
            przVar.e();
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return;
        }
        try {
            viewGroup.removeView(this.mVideoView.f());
        } catch (Exception unused) {
        }
    }

    private void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", "onVideoStart ====");
        this.mIsPlaying = true;
        prd.a(this, 300L);
    }

    private void onVideoStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        TLog.loge("TBLiveView", "onVideoStop ====");
        if (this.mIsPlaying) {
            prd.b(this, 300L);
        }
        this.mIsPlaying = false;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mIsAttachedToWindow = true;
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mIsAttachedToWindow = false;
        destroy();
    }

    public static boolean isWiFiType(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2704346c", new Object[]{context})).booleanValue();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isConnected()) && activeNetworkInfo.getType() == 1;
    }

    @Override // com.taobao.taolive.dinamicext.view.a.InterfaceC0893a
    public void retry(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74412c5", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        prz przVar = this.mVideoView;
        if (przVar == null || this.mRetryNum >= 2) {
            return;
        }
        przVar.d();
        this.mVideoView.b(z2);
        this.mVideoView.c(z3);
        retryVideo();
        this.mRetryNum++;
        TLog.loge("TBLiveView", "retry");
    }

    private boolean retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6555dbe", new Object[]{this})).booleanValue();
        }
        TLog.loge("TBLiveView", "retryVideo");
        if (!prc.a() || !this.mIsAttachedToWindow || prc.d(getContext()) || this.mPlayerDataJSON == null) {
            return false;
        }
        TLog.loge("TBLiveView", "retryVideo 1");
        MediaLiveInfo convert = convert(this.mPlayerDataJSON);
        if (convert == null) {
            TLog.loge("TBLiveView", "retryVideo mediaInfo == null");
            return false;
        }
        psh pshVar = new psh(null, "", convert);
        pshVar.m = this.mPlayerDataJSON.getString("liveConfigForStream");
        pshVar.g = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        pshVar.h = this.mPlayerDataJSON.getString("feedId");
        return startVideo(pshVar);
    }

    private MediaLiveInfo convert(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("a04b6fa1", new Object[]{this, jSONObject});
        }
        MediaLiveInfo mediaLiveInfo = null;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.getIntValue("roomStatus") == 1) {
            mediaLiveInfo = new MediaLiveInfo();
            JSONArray jSONArray = jSONObject.getJSONArray("liveUrlList");
            int size = jSONArray.size();
            mediaLiveInfo.h265 = pro.d(jSONObject.getString("h265"));
            mediaLiveInfo.mediaConfig = jSONObject.getString(d.PARAM_MEDIA_INFO_MEDIACONFIG);
            mediaLiveInfo.rateAdapte = pro.d(jSONObject.getString("rateAdapte"));
            mediaLiveInfo.liveUrlList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                QualityLiveItem qualityLiveItem = new QualityLiveItem();
                qualityLiveItem.artpUrl = jSONObject2.getString("artpUrl");
                qualityLiveItem.definition = jSONObject2.getString("definition");
                qualityLiveItem.flvUrl = jSONObject2.getString("flvUrl");
                qualityLiveItem.h265Url = jSONObject2.getString("h265Url");
                qualityLiveItem.hlsUrl = jSONObject2.getString("hlsUrl");
                qualityLiveItem.name = jSONObject2.getString("name");
                qualityLiveItem.wholeH265FlvUrl = jSONObject2.getString("wholeH265FlvUrl");
                qualityLiveItem.bfrtcUrl = jSONObject2.getString(MediaConstant.BFRTC_URL_NAME);
                qualityLiveItem.rtcLiveUrl = jSONObject2.getString(MediaConstant.RTCLIVE_URL_NAME);
                mediaLiveInfo.liveUrlList.add(qualityLiveItem);
            }
        }
        return mediaLiveInfo;
    }
}
