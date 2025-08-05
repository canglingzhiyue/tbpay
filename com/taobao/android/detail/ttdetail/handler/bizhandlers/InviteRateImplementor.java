package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.ezm;
import tb.kge;

/* loaded from: classes5.dex */
public class InviteRateImplementor implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "invateRate";

    /* renamed from: a  reason: collision with root package name */
    private Context f10666a;
    private eyx b;

    static {
        kge.a(-245156526);
        kge.a(1967244270);
    }

    public InviteRateImplementor(Context context, eyx eyxVar) {
        this.f10666a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        if (!com.taobao.android.detail.ttdetail.utils.ao.c()) {
            com.taobao.android.detail.ttdetail.utils.ao.a(true);
            return true;
        }
        JSONObject b = aVar.b();
        if (b == null) {
            return false;
        }
        String string = b.getString("itemId");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        a(this.f10666a, this.b, string);
        return true;
    }

    private void a(Context context, eyx eyxVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1deccd6", new Object[]{this, context, eyxVar, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", (Object) "taobao_item_rate_invite");
        jSONObject.put("source", (Object) "ali.china.taobao");
        jSONObject.put("targetId", (Object) str);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.setApiName("mtop.taobao.rate.invite");
        mtopRequest.setVersion("1.0");
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.mo1305reqMethod(MethodEnum.POST).mo1335useWua().registerListener((IRemoteListener) new InviteRateRequestCallback(context, eyxVar));
        build.startRequest();
    }

    /* loaded from: classes5.dex */
    public static class InviteRateRequestCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context mContext;
        private eyx mDetailContext;

        static {
            kge.a(1089580089);
            kge.a(-525336021);
        }

        public static /* synthetic */ Context access$000(InviteRateRequestCallback inviteRateRequestCallback) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("baf30d45", new Object[]{inviteRateRequestCallback}) : inviteRateRequestCallback.mContext;
        }

        public InviteRateRequestCallback(Context context, eyx eyxVar) {
            this.mContext = context;
            this.mDetailContext = eyxVar;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                showToast("服务器开小差了，请稍后再试一下吧～");
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                showToast("服务器开小差了，请稍后再试一下吧～");
            } else {
                JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                if (parseObject == null) {
                    showToast("服务器开小差了，请稍后再试一下吧～");
                    return;
                }
                JSONObject jSONObject = parseObject.getJSONObject("data");
                if (jSONObject == null || !jSONObject.getBooleanValue("result")) {
                    showToast("服务器开小差了，请稍后再试一下吧～");
                } else {
                    showToast("邀请成功！新评价会给亲发消息哦～");
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                showToast("服务器开小差了，请稍后再试一下吧～");
            }
        }

        private void showToast(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
            } else {
                this.mDetailContext.b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.InviteRateImplementor.InviteRateRequestCallback.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(InviteRateRequestCallback.access$000(InviteRateRequestCallback.this), str, 0).show();
                        }
                    }
                });
            }
        }
    }
}
