package com.taobao.android.detail.wrapper.ultronengine.event;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.epj;
import tb.kge;

/* loaded from: classes5.dex */
public class e extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "invateRate";

    /* renamed from: a */
    private static String f11454a;
    private static String b;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static String r;

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ JSONObject a(e eVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("fec2485e", new Object[]{eVar, mtopResponse}) : eVar.a(mtopResponse);
    }

    public static /* synthetic */ void a(e eVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19da5239", new Object[]{eVar, context, str});
        } else {
            eVar.b(context, str);
        }
    }

    public static /* synthetic */ String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : q;
    }

    public static /* synthetic */ String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : r;
    }

    static {
        kge.a(-655051220);
        f11454a = "mtop.taobao.rate.invite";
        b = "1.0";
        l = "targetId";
        m = "source";
        n = "scene";
        o = "ali.china.taobao";
        p = "taobao_item_rate_invite";
        q = "服务器开小差了，请稍后再试一下吧～";
        r = "邀请成功！新评价会给亲发消息哦～";
    }

    public e() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.InviteRateUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        String g = g();
        if (StringUtils.isEmpty(g) || eVar == null) {
            return;
        }
        com.taobao.android.detail.datasdk.protocol.adapter.core.d c = epj.c();
        if (c != null && !c.b()) {
            c.a(true);
        } else {
            a(eVar.a(), g);
        }
    }

    private String g() {
        JSONObject fields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        com.taobao.android.ultron.common.model.b b2 = b();
        if (b2 == null || (fields = b2.getFields()) == null) {
            return null;
        }
        String string = fields.getString("itemId");
        if (!StringUtils.isEmpty(string)) {
            return string;
        }
        return null;
    }

    private void a(final Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (context == null) {
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(n, (Object) p);
            jSONObject.put(m, (Object) o);
            jSONObject.put(l, (Object) str);
            a(mtopRequest, jSONObject);
            mtopRequest.setApiName(f11454a);
            mtopRequest.setVersion(b);
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.mo1305reqMethod(MethodEnum.POST);
            build.mo1335useWua();
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.InviteRateUltronSubscriber$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    try {
                        e.a(e.this, context, e.e());
                        com.taobao.android.detail.core.utils.i.a("OpenRateUltronSubscriber", "class:InviteRateUltronSubscriber " + mtopResponse.getApi() + " onSystemError: " + mtopResponse.getRetMsg());
                    } catch (Throwable th) {
                        com.taobao.android.detail.core.utils.i.a("OpenRateUltronSubscriber", "class:InviteRateUltronSubscriber，method : onSystemError catch exception : " + th.toString());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    JSONObject a2 = e.a(e.this, mtopResponse);
                    JSONObject jSONObject2 = a2 != null ? a2.getJSONObject("data") : null;
                    String e = e.e();
                    if (jSONObject2 != null && jSONObject2.getBooleanValue("result")) {
                        e = e.f();
                    }
                    e.a(e.this, context, e);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    try {
                        com.taobao.android.detail.core.utils.i.a("OpenRateUltronSubscriber", "class:InviteRateUltronSubscriber " + mtopResponse.getApi() + " onError: " + mtopResponse.getRetMsg());
                        e.a(e.this, context, e.e());
                    } catch (Throwable th) {
                        com.taobao.android.detail.core.utils.i.a("OpenRateUltronSubscriber", "class:InviteRateUltronSubscriber，method : onError catch exception : " + th.toString());
                    }
                }
            });
            build.startRequest();
        }
    }

    private boolean a(MtopRequest mtopRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2e4381", new Object[]{this, mtopRequest, jSONObject})).booleanValue();
        }
        if (mtopRequest == null || jSONObject == null) {
            return false;
        }
        mtopRequest.setData(jSONObject.toJSONString());
        return true;
    }

    private JSONObject a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("afae854d", new Object[]{this, mtopResponse});
        }
        if (mtopResponse == null) {
            return null;
        }
        try {
            return JSON.parseObject(new String(mtopResponse.getBytedata()));
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("OpenRateUltronSubscriber", "class:InviteRateUltronSubscriber " + mtopResponse.getApi() + " 结果解析异常 exception : " + th.toString());
            return null;
        }
    }

    private void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{this, context, str});
        } else if (StringUtils.isEmpty(str) || context == null) {
        } else {
            Toast.makeText(context, str, 0).show();
        }
    }
}
