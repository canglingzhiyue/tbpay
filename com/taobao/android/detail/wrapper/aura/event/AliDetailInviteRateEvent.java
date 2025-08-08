package com.taobao.android.detail.wrapper.aura.event;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.p;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.arc;
import tb.arv;
import tb.emu;
import tb.epj;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.inviteRate")
/* loaded from: classes5.dex */
public final class AliDetailInviteRateEvent extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "invateRate";

    static {
        kge.a(1573940476);
    }

    public static /* synthetic */ Object ipc$super(AliDetailInviteRateEvent aliDetailInviteRateEvent, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "invateRate";
    }

    public AliDetailInviteRateEvent() {
        emu.a("com.taobao.android.detail.wrapper.aura.event.AliDetailInviteRateEvent");
    }

    @Override // tb.arv
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
            return;
        }
        com.taobao.android.detail.datasdk.protocol.adapter.core.d c = epj.c();
        if (c != null && !c.b()) {
            c.a(true);
            return;
        }
        JSONObject c2 = aURAEventIO.getEventModel().c();
        if (c2 == null) {
            return;
        }
        String string = c2.getString("itemId");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        Context e = b().e();
        if (e instanceof Activity) {
            a((Activity) b().e(), string);
        } else {
            arc.a().a("AliDetailInviteRateEvent", "innerHandleEvent", "context is not activity");
        }
        p.a(e, "invateRate");
    }

    private void a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bb1504", new Object[]{this, activity, str});
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
        build.mo1305reqMethod(MethodEnum.POST);
        build.mo1335useWua();
        build.registerListener((IRemoteListener) new InnerRequestCallback(activity));
        build.startRequest();
    }

    /* loaded from: classes5.dex */
    public static class InnerRequestCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Activity mActivity;

        static {
            kge.a(2109091206);
            kge.a(-525336021);
        }

        public InnerRequestCallback(Activity activity) {
            this.mActivity = activity;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                showToast(this.mActivity, "服务器开小差了，请稍后再试一下吧～");
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                showToast(this.mActivity, "服务器开小差了，请稍后再试一下吧～");
            } else {
                try {
                    JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                    if (parseObject == null) {
                        showToast(this.mActivity, "服务器开小差了，请稍后再试一下吧～");
                        return;
                    }
                    JSONObject jSONObject = parseObject.getJSONObject("data");
                    if (jSONObject != null && jSONObject.getBooleanValue("result")) {
                        showToast(this.mActivity, "邀请成功！新评价会给亲发消息哦～");
                        return;
                    }
                    showToast(this.mActivity, "服务器开小差了，请稍后再试一下吧～");
                } catch (Exception unused) {
                    showToast(this.mActivity, "服务器开小差了，请稍后再试一下吧～");
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                showToast(this.mActivity, "服务器开小差了，请稍后再试一下吧～");
            }
        }

        private void showToast(final Activity activity, final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af33ec4d", new Object[]{this, activity, str});
            } else {
                activity.runOnUiThread(new Runnable() { // from class: com.taobao.android.detail.wrapper.aura.event.AliDetailInviteRateEvent.InnerRequestCallback.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            Toast.makeText(activity, str, 0).show();
                        }
                    }
                });
            }
        }
    }
}
