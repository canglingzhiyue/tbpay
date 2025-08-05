package com.taobao.taolive.uikit.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.d;
import com.taobao.media.MediaConstant;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.QualityLiveItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.pqt;
import tb.prc;
import tb.prd;
import tb.pro;
import tb.prr;
import tb.prz;
import tb.psg;
import tb.psh;

/* loaded from: classes8.dex */
public class TBLiveImageView extends TUrlImageView implements com.taobao.taolive.uikit.homepage.a, pqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBottomLeftRadius;
    private int mBottomRightRadius;
    private com.taobao.taolive.uikit.homepage.a mCallback;
    private boolean mIsLiveVideo;
    private boolean mIsPlaying;
    private int mPlayDuration;
    private int mPlayNetWork;
    private String mPlayUrl;
    private boolean mPlayVideo;
    private HashMap<String, Object> mPlayerData;
    private JSONObject mPlayerDataJSON;
    private int mTopLeftRadius;
    private int mTopRightRadius;
    private boolean mVideoLoop;

    static {
        kge.a(-467122019);
        kge.a(-125540484);
        kge.a(-681693059);
    }

    public static /* synthetic */ Object ipc$super(TBLiveImageView tBLiveImageView, String str, Object... objArr) {
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

    public TBLiveImageView(Context context) {
        super(context);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 10;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
        this.mPlayNetWork = 0;
    }

    public TBLiveImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 10;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
        this.mPlayNetWork = 0;
    }

    public TBLiveImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsLiveVideo = true;
        this.mIsPlaying = false;
        this.mVideoLoop = false;
        this.mPlayDuration = 10;
        this.mTopLeftRadius = 0;
        this.mTopRightRadius = 0;
        this.mBottomLeftRadius = 0;
        this.mBottomRightRadius = 0;
        this.mPlayNetWork = 0;
    }

    public int getPlayNetWork() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("741421be", new Object[]{this})).intValue() : this.mPlayNetWork;
    }

    public void setPlayNetWork(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b26d1fa4", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayNetWork = i;
        }
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
        JSONObject jSONObject;
        String string;
        MediaLiveInfo mediaLiveInfo;
        JSONArray jSONArray;
        HashMap<String, Object> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a94ebd4d", new Object[]{this, aVar, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (this.mPlayNetWork == 0 && !prc.c(getContext())) {
            return false;
        }
        if (this.mPlayNetWork == 1 && !prc.b(getContext())) {
            return false;
        }
        if ((this.mPlayNetWork == 2 && !prc.e(getContext())) || !this.mPlayVideo || prr.g()) {
            return false;
        }
        this.mCallback = aVar;
        String str2 = "";
        if (this.mIsLiveVideo && (hashMap = this.mPlayerData) != null && hashMap.size() > 0 && this.mPlayerData.containsKey("queryParams")) {
            if (pro.a((String) this.mPlayerData.get("roomStatus")) == 1) {
                if (this.mPlayerData.get("liveConfigForStream") instanceof String) {
                    str2 = (String) this.mPlayerData.get("liveConfigForStream");
                }
                MediaLiveInfo mediaLiveInfo2 = new MediaLiveInfo();
                Object obj = this.mPlayerData.get("queryParams");
                if (obj instanceof HashMap) {
                    HashMap hashMap2 = (HashMap) obj;
                    ArrayList arrayList = (ArrayList) hashMap2.get("liveUrlList");
                    if (arrayList != null && arrayList.size() > 0) {
                        int size = arrayList.size();
                        mediaLiveInfo2.h265 = pro.d((String) hashMap2.get("h265"));
                        mediaLiveInfo2.rateAdapte = pro.d((String) hashMap2.get("rateAdapte"));
                        mediaLiveInfo2.mediaConfig = (String) hashMap2.get(d.PARAM_MEDIA_INFO_MEDIACONFIG);
                        mediaLiveInfo2.liveUrlList = new ArrayList<>();
                        for (int i2 = 0; i2 < size; i2++) {
                            HashMap hashMap3 = (HashMap) arrayList.get(i2);
                            if (hashMap3 != null) {
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
                                mediaLiveInfo2.liveUrlList.add(qualityLiveItem);
                            }
                        }
                    }
                }
                mediaLiveInfo = mediaLiveInfo2;
                string = str2;
            }
            string = str2;
            mediaLiveInfo = null;
        } else {
            if (this.mIsLiveVideo && (jSONObject = this.mPlayerDataJSON) != null && jSONObject.containsKey("queryParams") && this.mPlayerDataJSON.getIntValue("roomStatus") == 1) {
                MediaLiveInfo mediaLiveInfo3 = new MediaLiveInfo();
                JSONObject jSONObject2 = this.mPlayerDataJSON.getJSONObject("queryParams");
                string = this.mPlayerDataJSON.getString("liveConfigForStream");
                if (jSONObject2 != null && (jSONArray = jSONObject2.getJSONArray("liveUrlList")) != null && jSONArray.size() > 0) {
                    int size2 = jSONArray.size();
                    mediaLiveInfo3.h265 = pro.d(jSONObject2.getString("h265"));
                    mediaLiveInfo3.mediaConfig = jSONObject2.getString(d.PARAM_MEDIA_INFO_MEDIACONFIG);
                    mediaLiveInfo3.rateAdapte = pro.d(jSONObject2.getString("rateAdapte"));
                    mediaLiveInfo3.liveUrlList = new ArrayList<>();
                    for (int i3 = 0; i3 < size2; i3++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                        if (jSONObject3 != null) {
                            QualityLiveItem qualityLiveItem2 = new QualityLiveItem();
                            qualityLiveItem2.artpUrl = jSONObject3.getString("artpUrl");
                            qualityLiveItem2.definition = jSONObject3.getString("definition");
                            qualityLiveItem2.flvUrl = jSONObject3.getString("flvUrl");
                            qualityLiveItem2.h265Url = jSONObject3.getString("h265Url");
                            qualityLiveItem2.hlsUrl = jSONObject3.getString("hlsUrl");
                            qualityLiveItem2.name = jSONObject3.getString("name");
                            qualityLiveItem2.wholeH265FlvUrl = jSONObject3.getString("wholeH265FlvUrl");
                            qualityLiveItem2.bfrtcUrl = jSONObject3.getString(MediaConstant.BFRTC_URL_NAME);
                            qualityLiveItem2.rtcLiveUrl = jSONObject3.getString(MediaConstant.RTCLIVE_URL_NAME);
                            mediaLiveInfo3.liveUrlList.add(qualityLiveItem2);
                        }
                    }
                }
                mediaLiveInfo = mediaLiveInfo3;
            }
            string = str2;
            mediaLiveInfo = null;
        }
        psh pshVar = new psh(this, this.mPlayUrl, mediaLiveInfo);
        pshVar.m = string;
        if (!this.mIsLiveVideo) {
            pshVar.j = this.mVideoLoop;
            pshVar.e = 2;
        }
        pshVar.g = new Rect(this.mTopLeftRadius, this.mTopRightRadius, this.mBottomRightRadius, this.mBottomLeftRadius);
        pshVar.f = i;
        pshVar.k = new Rect();
        pshVar.h = str;
        pshVar.i = z;
        pshVar.c = this.mPlayDuration;
        getGlobalVisibleRect(pshVar.k);
        return psg.a(getContext()).a(pshVar);
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            psg.a(getContext()).b();
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
        if (!this.mIsPlaying) {
            return;
        }
        stopVideo();
    }

    @Override // tb.pqt
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.mIsPlaying) {
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
        prz d = psg.a(getContext()).d();
        if (d != null && d.f() != null) {
            ViewGroup viewGroup = (ViewGroup) d.f().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(d.f());
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
                    d.f().setAlpha(0.0f);
                    viewGroup2.addView(d.f(), Math.max(0, indexOfChild - 1), layoutParams);
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

    @Override // com.taobao.taolive.uikit.homepage.a
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        String str = "onVideoStart ==== this = " + this;
        this.mIsPlaying = true;
        prd.a(this, 300L);
        prz d = psg.a(getContext()).d();
        if (d != null && d.f() != null) {
            d.f().setAlpha(1.0f);
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
        String str = "onVideoStop ==== this = " + this;
        if (this.mIsPlaying) {
            prd.b(this, 300L);
        }
        this.mIsPlaying = false;
        prz d = psg.a(getContext()).d();
        if (d != null && d.f() != null && (viewGroup = (ViewGroup) d.f().getParent()) != null) {
            viewGroup.removeView(d.f());
        }
        com.taobao.taolive.uikit.homepage.a aVar = this.mCallback;
        if (aVar == null) {
            return;
        }
        aVar.onVideoStop();
    }
}
