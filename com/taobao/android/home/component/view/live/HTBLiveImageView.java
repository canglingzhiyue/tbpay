package com.taobao.android.home.component.view.live;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.pqt;
import tb.prd;
import tb.pro;
import tb.psh;

/* loaded from: classes5.dex */
public class HTBLiveImageView extends TUrlImageView implements com.taobao.taolive.uikit.homepage.a, pqt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HTBLiveImageView";
    private Context activityContext;
    private int mBottomLeftRadius;
    private int mBottomRightRadius;
    private com.taobao.taolive.uikit.homepage.a mCallback;
    private boolean mIsLiveVideo;
    private boolean mIsPlaying;
    private boolean mIsVideoRequestAccept;
    private int mPlayDuration;
    private String mPlayUrl;
    private boolean mPlayVideo;
    private HashMap<String, Object> mPlayerData;
    private JSONObject mPlayerDataJSON;
    private int mTopLeftRadius;
    private int mTopRightRadius;
    private boolean mVideoLoop;

    static {
        kge.a(-2114898202);
        kge.a(-125540484);
        kge.a(-681693059);
    }

    public static /* synthetic */ Object ipc$super(HTBLiveImageView hTBLiveImageView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode != 828227453) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.pause();
            return null;
        }
    }

    public HTBLiveImageView(Context context) {
        super(context);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mIsVideoRequestAccept = false;
        this.mVideoLoop = false;
        this.mPlayDuration = j.a("livePlayDuration", 10000);
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
        this.mPlayDuration = j.a("livePlayDuration", 10000);
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
        this.mPlayDuration = j.a("livePlayDuration", 10000);
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
            this.mPlayVideo = z;
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

    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayDuration = i;
        }
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue() : this.mPlayVideo;
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

    public void setPlayerData(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45af8aff", new Object[]{this, hashMap});
        } else {
            this.mPlayerData = hashMap;
        }
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
        } else {
            this.mPlayerDataJSON = jSONObject;
        }
    }

    public boolean playVideoIfNecessary(com.taobao.taolive.uikit.homepage.a aVar, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94ebd4d", new Object[]{this, aVar, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (!this.mPlayVideo) {
            return false;
        }
        this.mCallback = aVar;
        psh pshVar = new psh(this, this.mPlayUrl, parseMediaLiveInfo());
        if (!this.mIsLiveVideo) {
            pshVar.j = this.mVideoLoop;
            pshVar.e = 2;
        }
        pshVar.g = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        pshVar.d = j.a("liveVideoBusinessType", "homepageLiveCard");
        pshVar.f = i;
        pshVar.k = new Rect();
        pshVar.h = str;
        pshVar.i = z;
        pshVar.c = this.mPlayDuration;
        getGlobalVisibleRect(pshVar.k);
        if (getActivityContext() != null) {
            return b.a(getActivityContext()).a(pshVar);
        }
        return false;
    }

    private MediaLiveInfo parseMediaLiveInfo() {
        JSONObject jSONObject;
        HashMap<String, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaLiveInfo) ipChange.ipc$dispatch("7549f5c5", new Object[]{this});
        }
        if (this.mIsLiveVideo && (hashMap = this.mPlayerData) != null && hashMap.size() > 0 && this.mPlayerData.containsKey("queryParams")) {
            if (pro.a((String) this.mPlayerData.get("roomStatus")) == 1) {
                MediaLiveInfo mediaLiveInfo = new MediaLiveInfo();
                Object obj = this.mPlayerData.get("queryParams");
                if (!(obj instanceof HashMap)) {
                    return mediaLiveInfo;
                }
                HashMap hashMap2 = (HashMap) obj;
                ArrayList arrayList = (ArrayList) hashMap2.get("liveUrlList");
                if (arrayList == null) {
                    return mediaLiveInfo;
                }
                int size = arrayList.size();
                mediaLiveInfo.h265 = pro.d((String) hashMap2.get("h265"));
                mediaLiveInfo.rateAdapte = pro.d((String) hashMap2.get("rateAdapte"));
                mediaLiveInfo.mediaConfig = (String) hashMap2.get(d.PARAM_MEDIA_INFO_MEDIACONFIG);
                mediaLiveInfo.liveUrlList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    HashMap hashMap3 = (HashMap) arrayList.get(i);
                    QualityLiveItem qualityLiveItem = new QualityLiveItem();
                    qualityLiveItem.artpUrl = (String) hashMap3.get("artpUrl");
                    qualityLiveItem.definition = (String) hashMap3.get("definition");
                    qualityLiveItem.flvUrl = (String) hashMap3.get("flvUrl");
                    qualityLiveItem.h265Url = (String) hashMap3.get("h265Url");
                    qualityLiveItem.hlsUrl = (String) hashMap3.get("hlsUrl");
                    qualityLiveItem.name = (String) hashMap3.get("name");
                    qualityLiveItem.wholeH265FlvUrl = (String) hashMap3.get("wholeH265FlvUrl");
                    qualityLiveItem.bfrtcUrl = (String) hashMap3.get(MediaConstant.BFRTC_URL_NAME);
                    qualityLiveItem.rtcLiveUrl = (String) hashMap3.get(MediaConstant.RTCLIVE_URL_NAME);
                    mediaLiveInfo.liveUrlList.add(qualityLiveItem);
                }
                return mediaLiveInfo;
            }
        } else if (this.mIsLiveVideo && (jSONObject = this.mPlayerDataJSON) != null && jSONObject.containsKey("queryParams") && this.mPlayerDataJSON.getIntValue("roomStatus") == 1) {
            MediaLiveInfo mediaLiveInfo2 = new MediaLiveInfo();
            JSONObject jSONObject2 = this.mPlayerDataJSON.getJSONObject("queryParams");
            if (jSONObject2 == null) {
                return mediaLiveInfo2;
            }
            JSONArray jSONArray = jSONObject2.getJSONArray("liveUrlList");
            int size2 = jSONArray.size();
            mediaLiveInfo2.h265 = jSONObject2.getBoolean("h265").booleanValue();
            mediaLiveInfo2.mediaConfig = jSONObject2.getString(d.PARAM_MEDIA_INFO_MEDIACONFIG);
            mediaLiveInfo2.rateAdapte = jSONObject2.getBoolean("rateAdapte").booleanValue();
            mediaLiveInfo2.liveUrlList = new ArrayList<>();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                QualityLiveItem qualityLiveItem2 = new QualityLiveItem();
                qualityLiveItem2.artpUrl = jSONObject3.getString("artpUrl");
                qualityLiveItem2.definition = jSONObject3.getString("definition");
                qualityLiveItem2.flvUrl = jSONObject3.getString("flvUrl");
                qualityLiveItem2.h265Url = jSONObject3.getString("h265Url");
                qualityLiveItem2.hlsUrl = jSONObject3.getString("hlsUrl");
                qualityLiveItem2.name = jSONObject3.getString("name");
                qualityLiveItem2.wholeH265FlvUrl = jSONObject3.getString("wholeH265FlvUrl");
                qualityLiveItem2.bfrtcUrl = (String) jSONObject3.get(MediaConstant.BFRTC_URL_NAME);
                qualityLiveItem2.rtcLiveUrl = (String) jSONObject3.get(MediaConstant.RTCLIVE_URL_NAME);
                mediaLiveInfo2.liveUrlList.add(qualityLiveItem2);
            }
            return mediaLiveInfo2;
        }
        return null;
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else if (getActivityContext() == null) {
        } else {
            b.a(getActivityContext()).b();
        }
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, tb.pqt
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            super.resume();
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

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoRequestAccept() {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
            return;
        }
        e.e(TAG, "onVideoRequestAccept invoke. class = " + this);
        if (getActivityContext() == null) {
            return;
        }
        this.mIsVideoRequestAccept = true;
        a d = b.a(getActivityContext()).d();
        if (d != null && d.e() != null) {
            ViewGroup viewGroup = (ViewGroup) d.e().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(d.e());
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
            if (viewGroup2 != null) {
                try {
                    int indexOfChild = ((ViewGroup) getParent()).indexOfChild(this);
                    d.e().setAlpha(0.0f);
                    viewGroup2.addView(d.e(), Math.max(0, indexOfChild - 1), layoutParams);
                } catch (Exception e) {
                    e.printStackTrace();
                    e.a(TAG, "onVideoRequestAccept exception", e);
                }
            }
        }
        com.taobao.taolive.uikit.homepage.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoRequestAccept();
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        e.e(TAG, "onVideoStart invoke. class = " + this);
        if (getActivityContext() == null) {
            return;
        }
        this.mIsPlaying = true;
        prd.a(this, 300L);
        a d = b.a(getActivityContext()).d();
        if (d != null && d.e() != null) {
            d.e().setAlpha(1.0f);
        }
        com.taobao.taolive.uikit.homepage.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStart();
    }

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoStop() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        e.e(TAG, "onVideoStop invoke. class = " + this);
        if (getActivityContext() == null) {
            return;
        }
        if (this.mIsPlaying) {
            startCoverViewShowAnimation(this);
        }
        this.mIsVideoRequestAccept = false;
        this.mIsPlaying = false;
        a d = b.a(getActivityContext()).d();
        if (d != null && d.e() != null && (viewGroup = (ViewGroup) d.e().getParent()) != null) {
            viewGroup.removeView(d.e());
        }
        com.taobao.taolive.uikit.homepage.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStop();
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

    private void startCoverViewShowAnimation(HTBLiveImageView hTBLiveImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692da93d", new Object[]{this, hTBLiveImageView});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.8f, 1.0f);
        alphaAnimation.setDuration(10L);
        alphaAnimation.setFillAfter(true);
        hTBLiveImageView.startAnimation(alphaAnimation);
    }
}
