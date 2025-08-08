package com.taobao.android.live.plugin.atype.flexalocal.liveready;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendDataBean;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taobao.R;
import com.taobao.taolive.room.c;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.core.e;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.q;
import tb.gbg;
import tb.hjw;
import tb.kge;
import tb.nmf;
import tb.phg;
import tb.pmd;
import tb.pmt;

/* loaded from: classes6.dex */
public class TaoLiveReadyRecommendFrame extends BaseFrame implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LiveReadyRecommendFrame";

    static {
        kge.a(813260714);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveReadyRecommendFrame taoLiveReadyRecommendFrame, String str, Object... objArr) {
        if (str.hashCode() == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this}) : "tl-live-ready-recommend";
    }

    public TaoLiveReadyRecommendFrame(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_live_ready_recommend_container_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (this.mContainer instanceof ViewGroup) {
            ((ViewGroup) this.mContainer).removeAllViews();
            this.mContainer.setVisibility(8);
        }
        if (tBLiveDataModel.mVideoInfo.trialBroadcast == null || !tBLiveDataModel.mVideoInfo.trialBroadcast.booleanValue()) {
            return;
        }
        f.m().getDynamicXEngine().a(hjw.DX_EVENT_TAOLIVEENDRECOMMENDACTION, new hjw(this.mFrameContext, tBLiveDataModel));
        startRequestLiveEndData();
    }

    private void startRequestLiveEndData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbe6d13", new Object[]{this});
            return;
        }
        this.mContainer.setBackgroundColor(Color.parseColor("#32323C"));
        this.mContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveready.TaoLiveReadyRecommendFrame.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    q.b(TaoLiveReadyRecommendFrame.TAG, "resume onClick listener");
                }
            }
        });
        String str = "";
        String str2 = (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) ? str : this.mLiveDataModel.mVideoInfo.liveId;
        if (this.mFrameContext instanceof e) {
            str = JSON.toJSONString(((e) this.mFrameContext).y().g);
        }
        new com.taobao.android.live.plugin.atype.flexalocal.liveend.a(this).a(str2, str);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo == null || !(netBaseOutDo.mo1437getData() instanceof LiveEndRecommendDataBean)) {
        } else {
            startRendReadyView((LiveEndRecommendDataBean) netBaseOutDo.mo1437getData());
        }
    }

    private void startRendReadyView(LiveEndRecommendDataBean liveEndRecommendDataBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f112ae60", new Object[]{this, liveEndRecommendDataBean});
            return;
        }
        String str = liveEndRecommendDataBean.dxTemplateName;
        JSONObject jSONObject = liveEndRecommendDataBean.dxData;
        int max = Math.max(c.b, c.c);
        int f = com.taobao.taolive.room.utils.d.f();
        if (jSONObject == null) {
            return;
        }
        if (this.mFrameContext != null && this.mFrameContext.o() != null && this.mFrameContext.o().bizCode != null && (this.mFrameContext.o().bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString()) || this.mFrameContext.o().bizCode.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString()))) {
            jSONObject.put("topOffset", (Object) 0);
        } else {
            jSONObject.put("topOffset", (Object) String.valueOf(gbg.c(this.mContext, max)));
        }
        jSONObject.put("height", (Object) String.valueOf(gbg.c(this.mContext, com.taobao.taolive.room.utils.d.a(this.mContext, f))));
        jSONObject.put(nmf.MTOP_ISFOLLOW, (Object) String.valueOf(pmd.a().B().a(buildFollowParams())));
        renderDXView(str, jSONObject);
    }

    private pmt buildFollowParams() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmt) ipChange.ipc$dispatch("f9a4f5a3", new Object[]{this});
        }
        if (this.mLiveDataModel == null) {
            return new pmt();
        }
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        if (videoInfo == null) {
            return new pmt();
        }
        String str2 = "";
        if (videoInfo.broadCaster != null) {
            str2 = videoInfo.broadCaster.accountId;
            str = videoInfo.broadCaster.type;
        } else {
            str = str2;
        }
        String str3 = videoInfo.liveId;
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str)) {
            return new pmt();
        }
        pmt pmtVar = new pmt();
        pmtVar.c = str3;
        pmtVar.b = str;
        pmtVar.f32764a = str2;
        pmtVar.p = pmt.FOLLOW_COMMENT;
        return phg.a().a(pmtVar);
    }

    private void renderDXView(String str, JSONObject jSONObject) {
        Float aR_;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a7ff30", new Object[]{this, str, jSONObject});
            return;
        }
        DXRootView createDX = f.m().createDX(this.mContext, str);
        if (createDX != null) {
            f.m().renderDX(createDX, jSONObject);
        }
        if (!(this.mContainer instanceof FrameLayout) || createDX == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        ATaoLiveOpenEntity o = this.mFrameContext.o();
        if (o != null && o.uiCompontent != null && o.uiCompontent.a() != null && (aR_ = o.uiCompontent.a().aR_()) != null) {
            layoutParams.topMargin = (int) (layoutParams.topMargin + aR_.floatValue());
        }
        ((ViewGroup) this.mContainer).addView(createDX, layoutParams);
        this.mContainer.setVisibility(0);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            q.b(TAG, "LiveEndRecommendRequest onError");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            q.b(TAG, "LiveEndRecommendRequest onSystemError");
        }
    }
}
