package com.taobao.android.live.plugin.atype.flexalocal.liveend;

import android.content.Context;
import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;
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
import com.taobao.taolive.sdk.model.d;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.utils.q;
import com.taobao.taolive.sdk.utils.w;
import java.util.HashMap;
import tb.gbg;
import tb.hhs;
import tb.hjw;
import tb.kge;
import tb.nmf;
import tb.phg;
import tb.pmd;
import tb.pmt;

/* loaded from: classes6.dex */
public class LiveEndRecommendFrame extends BaseFrame implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LiveEndRecommendFrame";
    private d.a mMessageListener;

    static {
        kge.a(-2120500908);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(LiveEndRecommendFrame liveEndRecommendFrame, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode != 91531079) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewCreated((View) objArr[0]);
            return null;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean lazyInflate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f4de9efe", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void access$000(LiveEndRecommendFrame liveEndRecommendFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89eeb5d6", new Object[]{liveEndRecommendFrame});
        } else {
            liveEndRecommendFrame.startRequestLiveEndData();
        }
    }

    public static /* synthetic */ void access$100(LiveEndRecommendFrame liveEndRecommendFrame, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9e87d1", new Object[]{liveEndRecommendFrame, str, jSONObject});
        } else {
            liveEndRecommendFrame.renderDXView(str, jSONObject);
        }
    }

    public LiveEndRecommendFrame(Context context, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, aVar);
        this.mMessageListener = new d.a() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.core.c
            public void onMessageReceived(int i, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
                } else if (i == 1004) {
                    LiveEndRecommendFrame.access$000(LiveEndRecommendFrame.this);
                } else if (i != 1006) {
                } else {
                    q.b(LiveEndRecommendFrame.TAG, "anchorLeave");
                }
            }
        };
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
        } else {
            super.onViewCreated(view);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue() : R.layout.taolive_live_end_recommend_container_flexalocal;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (this.mFrameContext != null && this.mFrameContext.f() != null) {
            this.mFrameContext.f().registerMessageListener(this.mMessageListener, new MessageTypeFilter() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
                public boolean filter(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue() : i == 1004 || i == 1006;
                }
            });
        }
        hhs.a().c().a(hjw.DX_EVENT_TAOLIVEENDRECOMMENDACTION, new hjw(this.mFrameContext, tBLiveDataModel));
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.mContainer instanceof ViewGroup) {
            ((ViewGroup) this.mContainer).removeAllViews();
            this.mContainer.setVisibility(8);
        }
        if (this.mFrameContext == null || this.mFrameContext.f() == null) {
            return;
        }
        this.mFrameContext.f().unRegisterMessageListener(this.mMessageListener);
    }

    private void startRequestLiveEndData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cbe6d13", new Object[]{this});
            return;
        }
        String str = "";
        String str2 = (this.mLiveDataModel == null || this.mLiveDataModel.mVideoInfo == null) ? str : this.mLiveDataModel.mVideoInfo.liveId;
        if (!phg.d().a() && (this.mFrameContext instanceof e)) {
            str = JSON.toJSONString(((e) this.mFrameContext).y().g);
        }
        new a(this).a(str2, str);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo == null || !(netBaseOutDo.mo1437getData() instanceof LiveEndRecommendDataBean)) {
        } else {
            startRendEndView((LiveEndRecommendDataBean) netBaseOutDo.mo1437getData());
        }
    }

    private void startRendEndView(LiveEndRecommendDataBean liveEndRecommendDataBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2978d8", new Object[]{this, liveEndRecommendDataBean});
            return;
        }
        inflateViewOnNeed();
        if (this.mContainer == null) {
            return;
        }
        this.mContainer.setVisibility(0);
        this.mContainer.setBackgroundColor(Color.parseColor("#32323C"));
        this.mContainer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    q.b(LiveEndRecommendFrame.TAG, "resume onClick listener");
                }
            }
        });
        final String str = liveEndRecommendDataBean.dxTemplateName;
        final JSONObject jSONObject = liveEndRecommendDataBean.dxData;
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
        String string = jSONObject.getString("preLiveId");
        if (StringUtils.isEmpty(string)) {
            renderDXView(str, jSONObject);
        } else if (phg.d().a()) {
            com.taobao.android.live.plugin.atype.flexalocal.subscribe.a.a(string, "taoLiveStartNotify", null, "tblive_inline", new IObserverX() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                public void onNext(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, obj});
                    } else if (!(obj instanceof SubScribeCenterResultDTO) || !"SUCCESS".equals(((SubScribeCenterResultDTO) obj).getRetCode())) {
                    } else {
                        jSONObject.put("isPreview", (Object) "false");
                        LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, str, jSONObject);
                    }
                }

                @Override // com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        return;
                    }
                    jSONObject.put("isPreview", (Object) "true");
                    LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, str, jSONObject);
                }
            });
        } else {
            SubscribeUtils.INSTANCE.querySubscribe(string, "taoLiveStartNotify", null, "tblive_inline", new IObserver<SubScribeCenterResultDTO>() { // from class: com.taobao.android.live.plugin.atype.flexalocal.liveend.LiveEndRecommendFrame.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.message.kit.core.IObserver
                public void onComplete() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5cbffcbf", new Object[]{this});
                    }
                }

                @Override // com.taobao.message.kit.core.IObserver
                public /* synthetic */ void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4b8495", new Object[]{this, subScribeCenterResultDTO});
                    } else {
                        a(subScribeCenterResultDTO);
                    }
                }

                public void a(SubScribeCenterResultDTO subScribeCenterResultDTO) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("962936cf", new Object[]{this, subScribeCenterResultDTO});
                        return;
                    }
                    q.b(LiveEndRecommendFrame.TAG, "querySubscribe onNext");
                    if (!(subScribeCenterResultDTO instanceof SubScribeCenterResultDTO) || !"SUCCESS".equals(subScribeCenterResultDTO.getRetCode())) {
                        return;
                    }
                    jSONObject.put("isPreview", (Object) "false");
                    LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, str, jSONObject);
                }

                @Override // com.taobao.message.kit.core.IObserver
                public void onError(Throwable th) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cf54aa85", new Object[]{this, th});
                        return;
                    }
                    q.b(LiveEndRecommendFrame.TAG, "querySubscribe onError");
                    jSONObject.put("isPreview", (Object) "true");
                    LiveEndRecommendFrame.access$100(LiveEndRecommendFrame.this, str, jSONObject);
                }
            });
        }
    }

    private void reportPageShow(JSONObject jSONObject) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a983bc9", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString(nmf.MTOP_ISFOLLOW);
        HashMap<String, String> hashMap = new HashMap<>();
        if (StringUtils.equals(string, "true")) {
            hashMap.put("follow_type", "follow");
        } else {
            hashMap.put("follow_type", com.alibaba.triver.triver_shop.newShop.event.broadcast.c.MSG_UNFOLLOWED);
        }
        if (StringUtils.equals(jSONObject.getString("isPreview"), "true")) {
            hashMap.put("order_type", "order");
        } else {
            hashMap.put("order_type", "unorder");
        }
        if (jSONObject.containsKey("recommendList") && (jSONArray = jSONObject.getJSONArray("recommendList")) != null) {
            String str = "";
            for (int i = 0; i < jSONArray.size(); i++) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if (i != 0) {
                        str = str + "_";
                    }
                    str = str + jSONObject2.getString(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID);
                }
            }
            hashMap.put("recommendLiveId", str);
        }
        if (phg.a() == null) {
            return;
        }
        phg.a().a(this.mFrameContext, "off_live-exp", hashMap);
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
        if ((this.mContainer instanceof FrameLayout) && createDX != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            ATaoLiveOpenEntity o = this.mFrameContext.o();
            if (o != null && o.uiCompontent != null && o.uiCompontent.a() != null && (aR_ = o.uiCompontent.a().aR_()) != null) {
                layoutParams.topMargin = (int) (layoutParams.topMargin + aR_.floatValue());
            }
            ((ViewGroup) this.mContainer).addView(createDX, layoutParams);
        }
        try {
            reportPageShow(jSONObject);
        } catch (Exception e) {
            q.b(TAG, "reportPageShow error:" + e.getMessage());
        }
    }

    private pmt buildFollowParams() {
        String str;
        String str2;
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
        String str3 = "";
        if (videoInfo != null) {
            if (videoInfo.broadCaster != null) {
                str3 = videoInfo.broadCaster.accountId;
                str2 = videoInfo.broadCaster.type;
            } else {
                str2 = str3;
            }
            str = videoInfo.liveId;
        } else {
            str = str3;
            str2 = str;
        }
        if (StringUtils.isEmpty(str3) || StringUtils.isEmpty(str2)) {
            return new pmt();
        }
        pmt pmtVar = new pmt();
        pmtVar.c = str;
        pmtVar.b = str2;
        pmtVar.f32764a = str3;
        pmtVar.p = pmt.FOLLOW_COMMENT;
        return phg.a().a(pmtVar);
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            w.a(this.mContext, "网络开小差了");
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            w.a(this.mContext, "网络开小差了");
        }
    }
}
