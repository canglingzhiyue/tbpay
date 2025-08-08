package com.taobao.android.live.plugin.atype.flexalocal.input.member;

import android.content.Context;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereRealResponse;
import com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.AtmosphereRealResponseData;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.f;
import java.util.HashMap;
import tb.ddw;
import tb.hkl;
import tb.kge;
import tb.pmd;
import tb.rir;
import tb.ris;
import tb.xkw;

/* loaded from: classes6.dex */
public class MemberGuideFrame2 extends BaseFrame implements d, a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MSG_UI = 10001;
    private f mHandler;
    private Runnable mRunnable;
    private ris messageChannel;

    static {
        kge.a(-214894205);
        kge.a(-1905361424);
        kge.a(-797454141);
    }

    public static /* synthetic */ Object ipc$super(MemberGuideFrame2 memberGuideFrame2, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    public static /* synthetic */ void access$000(MemberGuideFrame2 memberGuideFrame2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b45275c3", new Object[]{memberGuideFrame2});
        } else {
            memberGuideFrame2.showJoinMemberCard();
        }
    }

    public static /* synthetic */ f access$100(MemberGuideFrame2 memberGuideFrame2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("302ab8ca", new Object[]{memberGuideFrame2}) : memberGuideFrame2.mHandler;
    }

    private void showJoinMemberCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd8b5f8", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msgType", "10086");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "alivemodx-live-join-member-card");
        jSONObject.put("messageSubType", "10086");
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("action", "start");
        jSONObject2.put("name", "alivemodx-live-join-member-card");
        jSONObject2.put("type", "h5_v2");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("delayDuration", (Object) 7000);
        String str = null;
        if (hkl.a().b() != null && hkl.a().b().liveDetailMessInfoIsLegal()) {
            str = hkl.a().b().liveDetailMessInfoGetSNSNick();
        }
        if (StringUtils.isEmpty(str)) {
            str = pmd.a().q().b();
        }
        jSONObject3.put("userNick", (Object) str);
        jSONObject2.put("data", (Object) jSONObject3);
        jSONArray.add(jSONObject2);
        jSONObject.put("components", (Object) jSONArray);
        hashMap.put("data", jSONObject.toJSONString());
        if (hkl.a().b() == null) {
            return;
        }
        hkl.a().b().tbLiveContainerManagerNotifyMsg("TBLiveWeex.Event.callInteractiveMessageComponent", hashMap);
    }

    @Deprecated
    public MemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel) {
        super(context, z, tBLiveDataModel);
        this.mRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.member.MemberGuideFrame2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                VideoInfo videoInfo = MemberGuideFrame2.this.mLiveDataModel != null ? MemberGuideFrame2.this.mLiveDataModel.mVideoInfo : null;
                if (videoInfo == null || videoInfo.broadCaster == null || hkl.a().b() == null || hkl.a().b().userActionManagerHasUserAction(MemberGuideFrame2.this.mContext, videoInfo.broadCaster.accountId, "member")) {
                    return;
                }
                hkl.a().b().userActionManagerAddUserAction(MemberGuideFrame2.this.mContext, videoInfo.broadCaster.accountId, "member");
                MemberGuideFrame2.access$000(MemberGuideFrame2.this);
            }
        };
        this.mHandler = new f(this);
    }

    public MemberGuideFrame2(Context context, boolean z, TBLiveDataModel tBLiveDataModel, com.taobao.alilive.aliliveframework.frame.a aVar) {
        super(context, z, tBLiveDataModel, aVar);
        this.mRunnable = new Runnable() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.member.MemberGuideFrame2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                VideoInfo videoInfo = MemberGuideFrame2.this.mLiveDataModel != null ? MemberGuideFrame2.this.mLiveDataModel.mVideoInfo : null;
                if (videoInfo == null || videoInfo.broadCaster == null || hkl.a().b() == null || hkl.a().b().userActionManagerHasUserAction(MemberGuideFrame2.this.mContext, videoInfo.broadCaster.accountId, "member")) {
                    return;
                }
                hkl.a().b().userActionManagerAddUserAction(MemberGuideFrame2.this.mContext, videoInfo.broadCaster.accountId, "member");
                MemberGuideFrame2.access$000(MemberGuideFrame2.this);
            }
        };
        this.mHandler = new f(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        init(tBLiveDataModel);
    }

    public void init(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f34137d0", new Object[]{this, tBLiveDataModel});
            return;
        }
        VideoInfo videoInfo = tBLiveDataModel != null ? tBLiveDataModel.mVideoInfo : null;
        if (videoInfo != null && videoInfo.broadCaster != null && videoInfo.shopHasVip && !videoInfo.shopVip && videoInfo.followBroadCaster) {
            this.mHandler.postDelayed(this.mRunnable, 10000L);
        }
        this.messageChannel = new ris(this.mContext, "member_auth_poplayer", new rir() { // from class: com.taobao.android.live.plugin.atype.flexalocal.input.member.MemberGuideFrame2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.rir
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    return;
                }
                Message obtainMessage = MemberGuideFrame2.access$100(MemberGuideFrame2.this).obtainMessage();
                obtainMessage.what = 10001;
                obtainMessage.obj = obj;
                MemberGuideFrame2.access$100(MemberGuideFrame2.this).sendMessage(obtainMessage);
            }
        });
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 10001) {
        } else {
            procMessageCallback(message.obj);
        }
    }

    private void procMessageCallback(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abdadf59", new Object[]{this, obj});
        } else if (!(obj instanceof JSONObject)) {
        } else {
            String string = ((JSONObject) obj).getString("name");
            char c = 65535;
            if (string.hashCode() == 1721945403 && string.equals("authSuccess")) {
                c = 0;
            }
            if (c != 0) {
                return;
            }
            VideoInfo videoInfo = this.mLiveDataModel != null ? this.mLiveDataModel.mVideoInfo : null;
            if (videoInfo == null || videoInfo.broadCaster == null) {
                return;
            }
            new com.taobao.android.live.plugin.atype.flexalocal.input.atmosphere.business.a(this).b(videoInfo.liveId, videoInfo.broadCaster.accountId);
        }
    }

    private void joinMemberFeedback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fd5010", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", (Object) "加入会员，解锁专属权益");
        HashMap hashMap = new HashMap();
        hashMap.put(aw.PARAM_CHAT_RENDERS_ENHANCE, "joinMember");
        jSONObject.put("extendVal", (Object) hashMap);
        ddw.a().a(xkw.EVENT_SEND_COMMENT, jSONObject, this.mFrameContext == null ? null : this.mFrameContext.G());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        destroy();
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        ris risVar = this.messageChannel;
        if (risVar == null) {
            return;
        }
        risVar.b();
        this.messageChannel = null;
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        AtmosphereRealResponseData atmosphereRealResponseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if ((netBaseOutDo instanceof AtmosphereRealResponse) && (atmosphereRealResponseData = (AtmosphereRealResponseData) netBaseOutDo.mo1437getData()) != null) {
            VideoInfo videoInfo = this.mLiveDataModel != null ? this.mLiveDataModel.mVideoInfo : null;
            if (videoInfo != null) {
                videoInfo.commentIcons = atmosphereRealResponseData.commentIcons;
            }
        }
        joinMemberFeedback();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            joinMemberFeedback();
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        super.onDidDisappear();
        destroy();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            return;
        }
        super.onStatusChange(i, obj);
        if (i != 1) {
            return;
        }
        init(this.mLiveDataModel);
    }
}
