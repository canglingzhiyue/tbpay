package com.taobao.taolive.uikit.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taolive.sdk.playcontrol.card.TBLOpenPlatformView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import tb.kge;
import tb.pqt;
import tb.psb;

/* loaded from: classes8.dex */
public class TBLiveOpenCardView extends RelativeLayout implements c, pqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private JSONObject mChatData;
    private Object mPageID;
    private RelativeLayout mRootView;
    private TBLOpenPlatformView mTBLOpenPlatformView;
    private TBLiveMessageView mTbLiveMessageView;

    static {
        kge.a(-1740336529);
        kge.a(940347998);
        kge.a(-125540484);
    }

    @Override // tb.pqt
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        }
    }

    @Override // tb.pqt
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        }
    }

    @Deprecated
    public void setLiveVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3187caa0", new Object[]{this, new Boolean(z)});
        }
    }

    public TBLiveOpenCardView(Context context) {
        super(context);
        initView(context);
    }

    public TBLiveOpenCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
    }

    public TBLiveOpenCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        this.mRootView = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.mTBLOpenPlatformView = new TBLOpenPlatformView(context);
        this.mTBLOpenPlatformView.setLayoutParams(layoutParams);
        this.mRootView.addView(this.mTBLOpenPlatformView);
        addView(this.mRootView);
    }

    @Override // com.taobao.taolive.uikit.api.c
    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        this.mPageID = obj;
        tBLOpenPlatformView.setPageId(obj);
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject.getJSONObject("queryParams") == null && jSONObject.getJSONObject("queryParam") != null) {
            jSONObject.put("queryParams", (Object) jSONObject.getJSONObject("queryParam"));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("playParams", (Object) jSONObject);
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setData(jSONObject2);
    }

    public void setEnableKeepLastFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b948960", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setEnableKeepLastFrame(z);
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setPlayUrl(str);
    }

    public void setChatData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ace37025", new Object[]{this, jSONObject});
        } else {
            this.mChatData = jSONObject;
        }
    }

    public void setViewInfoLifeCycleSyncOpenCard(DinamicXEngine dinamicXEngine, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be9097", new Object[]{this, dinamicXEngine, dXWidgetNode, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setViewInfoLifeCycleSyncOpenCard(dinamicXEngine, dXWidgetNode, str);
    }

    @Override // com.taobao.taolive.uikit.api.c
    public boolean playVideo(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8e07e99", new Object[]{this, aVar, bVar})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.setTBLiveOpenCardViewCallback(aVar);
            this.mTBLOpenPlatformView.setPlayerCallback(bVar);
            z = this.mTBLOpenPlatformView.playVideo();
            if (this.mChatData != null && z) {
                RelativeLayout relativeLayout = this.mRootView;
                if (relativeLayout != null && relativeLayout.getChildCount() > 0) {
                    for (int i = 0; i < this.mRootView.getChildCount(); i++) {
                        if (this.mRootView.getChildAt(i) instanceof TBLiveMessageView) {
                            ((TBLiveMessageView) this.mRootView.getChildAt(i)).destroy();
                            this.mRootView.removeViewAt(i);
                        }
                    }
                }
                this.mTbLiveMessageView = new TBLiveMessageView(getContext());
                this.mTbLiveMessageView.setData(this.mChatData);
                this.mRootView.addView(this.mTbLiveMessageView);
                psb.a().a(this.mPageID, this.mTbLiveMessageView);
            }
        }
        return z;
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.stopVideo();
    }

    @Override // com.taobao.taolive.uikit.api.c, tb.pqt
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView != null) {
            tBLOpenPlatformView.destroy();
        }
        TBLiveMessageView tBLiveMessageView = this.mTbLiveMessageView;
        if (tBLiveMessageView == null) {
            return;
        }
        tBLiveMessageView.setVisibility(8);
        this.mTbLiveMessageView.destroy();
        psb.a().b(this.mPageID, this.mTbLiveMessageView);
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout != null) {
            relativeLayout.removeView(this.mTbLiveMessageView);
        }
        this.mTbLiveMessageView = null;
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setPlayVideo(z);
    }

    public Bitmap getCurrentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return null;
        }
        return tBLOpenPlatformView.getCurrentFrame();
    }

    @Override // com.taobao.taolive.uikit.api.c
    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setVideoLoop(z);
    }

    @Override // com.taobao.taolive.uikit.api.c
    public void setCloseSkipPlaySwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddf5290", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setCloseSkipPlaySwitch(z);
    }

    @Override // com.taobao.taolive.uikit.api.c
    public void setAnimateTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd97b50", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setAnimateTime(i);
    }

    @Override // com.taobao.taolive.uikit.api.c
    public void setEnableCoverFade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be301c1f", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setEnableCoverFade(z);
    }

    @Override // com.taobao.taolive.uikit.api.c
    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setPlayDuration(i);
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return false;
        }
        return tBLOpenPlatformView.isPlayVideo();
    }

    @Override // com.taobao.taolive.uikit.api.c
    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setSubBusinessType(str);
    }

    public void setEnableConsumePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9960b5", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setEnableConsumePlayer(z);
    }

    @Override // com.taobao.taolive.uikit.api.c
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return false;
        }
        return tBLOpenPlatformView.isPlaying();
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setMuted(z);
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return false;
        }
        return tBLOpenPlatformView.isMuted();
    }

    public ViewGroup getPlayerRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bcf1150", new Object[]{this});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return null;
        }
        return tBLOpenPlatformView.getPlayerRootView();
    }

    public TUrlImageView getCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e99e40f4", new Object[]{this});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return null;
        }
        return tBLOpenPlatformView.getCover();
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setImageUrl(str);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setScaleType(scaleType);
    }

    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setImageResource(i);
    }

    public AbsFeature<? super ImageView> findFeature(Class<? extends AbsFeature<? super ImageView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return null;
        }
        return tBLOpenPlatformView.findFeature(cls);
    }

    public boolean addFeature(AbsFeature<? super ImageView> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return false;
        }
        return tBLOpenPlatformView.addFeature(absFeature);
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setPlaceHoldImageResId(i);
    }

    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setCornerRadius(i, i2, i3, i4);
    }

    public void setColorFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca662803", new Object[]{this, new Integer(i)});
            return;
        }
        TBLOpenPlatformView tBLOpenPlatformView = this.mTBLOpenPlatformView;
        if (tBLOpenPlatformView == null) {
            return;
        }
        tBLOpenPlatformView.setColorFilter(i);
    }
}
