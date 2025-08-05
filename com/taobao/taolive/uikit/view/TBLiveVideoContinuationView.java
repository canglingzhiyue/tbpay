package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.media.MediaConstant;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.taolive.uikit.homepage.e;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.prc;
import tb.prd;
import tb.pro;
import tb.prr;
import tb.prv;
import tb.pse;
import tb.psf;

/* loaded from: classes8.dex */
public class TBLiveVideoContinuationView extends TBLiveImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBottomLeftRadius;
    private int mBottomRightRadius;
    private com.taobao.taolive.uikit.homepage.a mCallback;
    private boolean mIsLiveVideo;
    private boolean mIsPlaying;
    private int mPlayDuration;
    private String mPlayUrl;
    private boolean mPlayVideo;
    private HashMap<String, Object> mPlayerData;
    private JSONObject mPlayerDataJSON;
    private String mProxyId;
    private int mTopLeftRadius;
    private int mTopRightRadius;
    private boolean mVideoLoop;

    static {
        kge.a(341718676);
    }

    public static /* synthetic */ Object ipc$super(TBLiveVideoContinuationView tBLiveVideoContinuationView, String str, Object... objArr) {
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

    public TBLiveVideoContinuationView(Context context) {
        super(context);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 0;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
    }

    public TBLiveVideoContinuationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 0;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
    }

    public TBLiveVideoContinuationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 0;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
        } else {
            this.mPlayVideo = z;
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void setLiveVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187caa0", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsLiveVideo = z;
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
        } else {
            this.mPlayUrl = str;
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoLoop = z;
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayDuration = i;
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue() : this.mPlayVideo;
    }

    public String getProxyId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("79b008e6", new Object[]{this}) : this.mProxyId;
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
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

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void setPlayerData(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45af8aff", new Object[]{this, hashMap});
        } else {
            this.mPlayerData = hashMap;
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
        } else {
            this.mPlayerDataJSON = jSONObject;
        }
    }

    public boolean playVideoIfNecessary(com.taobao.taolive.uikit.homepage.a aVar, String str, int i, boolean z, e eVar) {
        String str2;
        MediaData mediaData;
        JSONObject jSONObject;
        int i2;
        int i3;
        JSONArray jSONArray;
        HashMap<String, Object> hashMap;
        int i4;
        int i5;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b10ecf7", new Object[]{this, aVar, str, new Integer(i), new Boolean(z), eVar})).booleanValue();
        }
        TLog.loge("TBLiveVideoContinuationView: ", "playVideoIfNecessary");
        if (!this.mPlayVideo || !prc.b(getContext()) || prr.g()) {
            return false;
        }
        this.mCallback = aVar;
        String str4 = "";
        if (this.mIsLiveVideo && (hashMap = this.mPlayerData) != null && hashMap.size() > 0 && this.mPlayerData.containsKey("queryParams")) {
            int a2 = pro.a((String) this.mPlayerData.get("roomStatus"));
            String string = this.mPlayerDataJSON.getString("streamStatus");
            if (!pro.e(string)) {
                i5 = pro.a(string);
                i4 = 1;
            } else {
                i4 = 1;
                i5 = 1;
            }
            if (a2 == i4 && i5 == i4) {
                if (this.mPlayerData.get("liveConfigForStream") instanceof String) {
                    str4 = (String) this.mPlayerData.get("liveConfigForStream");
                }
                MediaData mediaData2 = new MediaData();
                Object obj = this.mPlayerData.get("queryParams");
                if (obj instanceof HashMap) {
                    HashMap hashMap2 = (HashMap) obj;
                    ArrayList arrayList = (ArrayList) hashMap2.get("liveUrlList");
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        mediaData2.h265 = pro.d((String) hashMap2.get("h265"));
                        mediaData2.rateAdapte = pro.d((String) hashMap2.get("rateAdapte"));
                        mediaData2.mediaConfig = (String) hashMap2.get(d.PARAM_MEDIA_INFO_MEDIACONFIG);
                        mediaData2.liveUrlList = new ArrayList<>();
                        for (int i6 = 0; i6 < size; i6++) {
                            HashMap hashMap3 = (HashMap) arrayList.get(i6);
                            if (hashMap3 != null) {
                                MediaData.QualityLiveItem qualityLiveItem = new MediaData.QualityLiveItem();
                                qualityLiveItem.artpUrl = (String) hashMap3.get("artpUrl");
                                qualityLiveItem.definition = (String) hashMap3.get("definition");
                                qualityLiveItem.flvUrl = (String) hashMap3.get("flvUrl");
                                qualityLiveItem.h265Url = (String) hashMap3.get("h265Url");
                                qualityLiveItem.hlsUrl = (String) hashMap3.get("hlsUrl");
                                qualityLiveItem.name = (String) hashMap3.get("name");
                                qualityLiveItem.wholeH265FlvUrl = (String) hashMap3.get("wholeH265FlvUrl");
                                qualityLiveItem.bfrtcUrl = (String) hashMap3.get(MediaConstant.BFRTC_URL_NAME);
                                qualityLiveItem.rtcLiveUrl = (String) hashMap3.get(MediaConstant.RTCLIVE_URL_NAME);
                                mediaData2.liveUrlList.add(qualityLiveItem);
                            }
                        }
                    }
                }
                mediaData = mediaData2;
                str3 = str4;
            } else {
                str3 = str4;
                mediaData = null;
            }
            str2 = str3;
        } else {
            if (this.mIsLiveVideo && (jSONObject = this.mPlayerDataJSON) != null && jSONObject.containsKey("queryParams")) {
                int intValue = this.mPlayerDataJSON.getIntValue("roomStatus");
                String string2 = this.mPlayerDataJSON.getString("streamStatus");
                if (!pro.e(string2)) {
                    i3 = pro.a(string2);
                    i2 = 1;
                } else {
                    i2 = 1;
                    i3 = 1;
                }
                if (intValue == i2 && i3 == i2) {
                    if (prr.v()) {
                        mediaData = com.taobao.taolive.sdk.model.common.a.a(this.mPlayerDataJSON.getJSONObject("queryParams"));
                        str2 = str4;
                    } else {
                        MediaData mediaData3 = new MediaData();
                        JSONObject jSONObject2 = this.mPlayerDataJSON.getJSONObject("queryParams");
                        str2 = this.mPlayerDataJSON.getString("liveConfigForStream");
                        if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray("liveUrlList")) != null && jSONArray.size() > 0) {
                            int size2 = jSONArray.size();
                            mediaData3.h265 = pro.d(jSONObject2.getString("h265"));
                            mediaData3.mediaConfig = jSONObject2.getString(d.PARAM_MEDIA_INFO_MEDIACONFIG);
                            mediaData3.rateAdapte = pro.d(jSONObject2.getString("rateAdapte"));
                            mediaData3.liveUrlList = new ArrayList<>();
                            for (int i7 = 0; i7 < size2; i7++) {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
                                if (jSONObject3 != null) {
                                    MediaData.QualityLiveItem qualityLiveItem2 = new MediaData.QualityLiveItem();
                                    qualityLiveItem2.artpUrl = jSONObject3.getString("artpUrl");
                                    qualityLiveItem2.definition = jSONObject3.getString("definition");
                                    qualityLiveItem2.flvUrl = jSONObject3.getString("flvUrl");
                                    qualityLiveItem2.h265Url = jSONObject3.getString("h265Url");
                                    qualityLiveItem2.hlsUrl = jSONObject3.getString("hlsUrl");
                                    qualityLiveItem2.name = jSONObject3.getString("name");
                                    qualityLiveItem2.wholeH265FlvUrl = jSONObject3.getString("wholeH265FlvUrl");
                                    qualityLiveItem2.bfrtcUrl = jSONObject3.getString(MediaConstant.BFRTC_URL_NAME);
                                    qualityLiveItem2.rtcLiveUrl = jSONObject3.getString(MediaConstant.RTCLIVE_URL_NAME);
                                    mediaData3.liveUrlList.add(qualityLiveItem2);
                                }
                            }
                        }
                        mediaData = mediaData3;
                    }
                }
            }
            str2 = str4;
            mediaData = null;
        }
        pse pseVar = new pse(this, this.mPlayUrl, mediaData, eVar);
        pseVar.n = str2;
        if (!this.mIsLiveVideo) {
            pseVar.k = this.mVideoLoop;
            pseVar.f = 2;
        }
        pseVar.h = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        pseVar.g = i;
        pseVar.l = new Rect();
        pseVar.i = str;
        pseVar.j = z;
        pseVar.d = this.mPlayDuration;
        getGlobalVisibleRect(pseVar.l);
        this.mProxyId = prv.a();
        return psf.a(getContext()).a(getContext(), pseVar, this.mProxyId);
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView
    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            psf.a(getContext()).e(this.mProxyId);
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView, com.taobao.uikit.extend.feature.view.TUrlImageView, tb.pqt
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        super.resume();
        psf.a(getContext()).a();
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView, com.taobao.uikit.extend.feature.view.TUrlImageView, tb.pqt
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        super.pause();
        if (!this.mIsPlaying) {
            return;
        }
        stopVideo();
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView, tb.pqt
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.mIsPlaying) {
        } else {
            stopVideo();
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView, com.taobao.taolive.uikit.homepage.a
    public void onVideoRequestAccept() {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49416702", new Object[]{this});
            return;
        }
        ViewGroup g = psf.a(getContext()).g(this.mProxyId);
        if (g != null) {
            ViewGroup viewGroup = (ViewGroup) g.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(g);
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
                    g.setAlpha(0.0f);
                    viewGroup2.addView(g, Math.max(0, indexOfChild - 1), layoutParams);
                } catch (Exception unused) {
                }
            }
        }
        com.taobao.taolive.uikit.homepage.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoRequestAccept();
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView, com.taobao.taolive.uikit.homepage.a
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.mIsPlaying = true;
        prd.a(this, 300L);
        ViewGroup g = psf.a(getContext()).g(this.mProxyId);
        if (g != null) {
            g.setAlpha(1.0f);
        }
        com.taobao.taolive.uikit.homepage.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStart();
    }

    public View getVideoView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fdace493", new Object[]{this}) : psf.a(getContext()).g(this.mProxyId);
    }

    public void setImageVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130c1020", new Object[]{this});
        } else {
            prd.b(this, 300L);
        }
    }

    @Override // com.taobao.taolive.uikit.view.TBLiveImageView, com.taobao.taolive.uikit.homepage.a
    public void onVideoStop() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("894a6d85", new Object[]{this});
            return;
        }
        if (this.mIsPlaying) {
            prd.b(this, 300L);
        }
        this.mIsPlaying = false;
        ViewGroup g = psf.a(getContext()).g(this.mProxyId);
        if (g != null && (viewGroup = (ViewGroup) g.getParent()) != null) {
            viewGroup.removeView(g);
        }
        com.taobao.taolive.uikit.homepage.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStop();
    }

    public String getPlayViewToken() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("eb14f76f", new Object[]{this}) : psf.a(getContext()).c(this.mProxyId);
    }

    public boolean videoIsPlaying() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa7ea574", new Object[]{this})).booleanValue() : psf.a(getContext()).h(this.mProxyId);
    }
}
