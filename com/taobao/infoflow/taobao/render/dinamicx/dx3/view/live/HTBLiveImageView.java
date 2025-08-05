package com.taobao.infoflow.taobao.render.dinamicx.dx3.view.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.kge;
import tb.ldf;
import tb.ldk;
import tb.pqt;
import tb.prd;

/* loaded from: classes7.dex */
public class HTBLiveImageView extends TUrlImageView implements ITbLiveCardService.c, pqt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HTBLiveImageView";
    private Context activityContext;
    private boolean enablePlayVideo;
    private int mBottomLeftRadius;
    private int mBottomRightRadius;
    private boolean mIsLiveVideo;
    private boolean mIsPlaying;
    private boolean mIsVideoRequestAccept;
    private int mPlayDuration;
    private String mPlayUrl;
    private JSONObject mPlayerDataJSON;
    private ITbLiveCardService mTbLiveService;
    private int mTopLeftRadius;
    private int mTopRightRadius;
    private boolean mVideoLoop;

    static {
        kge.a(542021909);
        kge.a(-125540484);
        kge.a(1813936526);
    }

    public static /* synthetic */ Object ipc$super(HTBLiveImageView hTBLiveImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 828227453) {
            super.pause();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ JSONObject access$000(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("32b48a95", new Object[]{hTBLiveImageView}) : hTBLiveImageView.mPlayerDataJSON;
    }

    public static /* synthetic */ String access$100(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5dbf18c", new Object[]{hTBLiveImageView}) : hTBLiveImageView.mPlayUrl;
    }

    public HTBLiveImageView(Context context) {
        super(context);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mIsVideoRequestAccept = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 10;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
    }

    public HTBLiveImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mIsVideoRequestAccept = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 10;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
    }

    public HTBLiveImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mIsVideoRequestAccept = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 10;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
        } else {
            this.enablePlayVideo = z;
        }
    }

    public void setTbLiveCardService(ITbLiveCardService iTbLiveCardService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5801b87e", new Object[]{this, iTbLiveCardService});
        } else {
            this.mTbLiveService = iTbLiveCardService;
        }
    }

    public void setLiveVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187caa0", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLiveVideo = z;
        }
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
        } else {
            this.mPlayUrl = str;
        }
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoLoop = z;
        }
    }

    public boolean isEnablePlayVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7d65f065", new Object[]{this})).booleanValue() : this.enablePlayVideo;
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

    public void setPlayData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b8ffc9", new Object[]{this, jSONObject});
        } else {
            this.mPlayerDataJSON = jSONObject;
        }
    }

    public boolean playVideoIfNecessary() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71d85196", new Object[]{this})).booleanValue();
        }
        if (this.mTbLiveService == null || !this.enablePlayVideo) {
            return false;
        }
        final Rect rect = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        final Rect rect2 = new Rect();
        getGlobalVisibleRect(rect2);
        if (getActivityContext() != null) {
            return this.mTbLiveService.startVideo(this.activityContext, new ITbLiveCardService.b() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.live.HTBLiveImageView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService.b
                public JSONObject a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this}) : HTBLiveImageView.access$000(HTBLiveImageView.this);
                }

                @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : HTBLiveImageView.access$100(HTBLiveImageView.this);
                }
            }, new ITbLiveCardService.a() { // from class: com.taobao.infoflow.taobao.render.dinamicx.dx3.view.live.HTBLiveImageView.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService.a
                public Rect a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Rect) ipChange2.ipc$dispatch("ef387fb1", new Object[]{this}) : rect2;
                }

                @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService.a
                public Rect b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Rect) ipChange2.ipc$dispatch("28899072", new Object[]{this}) : rect;
                }
            }, this);
        }
        return false;
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else if (this.mTbLiveService == null || getActivityContext() == null) {
        } else {
            this.mTbLiveService.stopVideo();
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, tb.pqt
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        super.pause();
        if (!this.mIsPlaying && !this.mIsVideoRequestAccept) {
            return;
        }
        stopVideo();
    }

    @Override // tb.pqt
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.mIsPlaying && !this.mIsVideoRequestAccept) {
        } else {
            stopVideo();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService.c
    public void onVideoPrepare() {
        ITbLiveCardService iTbLiveCardService;
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1f292", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onVideoRequestAccept invoke. class = " + this);
        if (getActivityContext() == null || (iTbLiveCardService = this.mTbLiveService) == null) {
            return;
        }
        this.mIsVideoRequestAccept = true;
        View videoView = iTbLiveCardService.getVideoView();
        if (videoView == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) videoView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(videoView);
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (layoutParams2 != null) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams != null) {
            layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
            layoutParams.setMargins(getLeft(), getTop(), 0, 0);
        } else {
            layoutParams = new FrameLayout.LayoutParams(getWidth(), getHeight());
        }
        ViewGroup viewGroup2 = (ViewGroup) getParent();
        if (viewGroup2 == null) {
            return;
        }
        try {
            int indexOfChild = ((ViewGroup) getParent()).indexOfChild(this);
            videoView.setAlpha(0.0f);
            viewGroup2.addView(videoView, Math.max(0, indexOfChild - 1), layoutParams);
        } catch (Exception e) {
            e.printStackTrace();
            ldf.a(TAG, "onVideoRequestAccept exception", e);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService.c
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onVideoStart invoke. class = " + this);
        if (getActivityContext() == null || this.mTbLiveService == null) {
            return;
        }
        this.mIsPlaying = true;
        prd.a(this, 300L);
        View videoView = this.mTbLiveService.getVideoView();
        if (videoView == null) {
            return;
        }
        videoView.setAlpha(1.0f);
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ITbLiveCardService.c
    public void onVideoStop() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        ldf.d(TAG, "onVideoStop invoke. class = " + this);
        if (getActivityContext() == null || this.mTbLiveService == null) {
            return;
        }
        if (this.mIsPlaying) {
            startCoverViewShowAnimation(this);
        }
        this.mIsVideoRequestAccept = false;
        this.mIsPlaying = false;
        View videoView = this.mTbLiveService.getVideoView();
        if (videoView == null || (viewGroup = (ViewGroup) videoView.getParent()) == null) {
            return;
        }
        viewGroup.removeView(videoView);
    }

    public Context getActivityContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2fdd88e9", new Object[]{this});
        }
        if (getContext() instanceof Activity) {
            return getContext();
        }
        Context context = this.activityContext;
        if (!(context instanceof Activity)) {
            return null;
        }
        return context;
    }

    public void setActivityContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebc6b03", new Object[]{this, context});
        } else {
            this.activityContext = context;
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        ldk.a("live", "live_exposure", "", "Page_Home_VideoPlayer_Count", "", null);
    }

    private void startCoverViewShowAnimation(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc8aa58", new Object[]{this, hTBLiveImageView});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
        alphaAnimation.setDuration(10L);
        alphaAnimation.setFillAfter(true);
        hTBLiveImageView.startAnimation(alphaAnimation);
    }
}
