package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.presenter.a;
import com.taobao.android.abilitykit.ability.pop.presenter.b;
import com.taobao.android.abilitykit.ability.pop.presenter.d;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.nav.Nav;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.mini.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class jal {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ARG1 = "arg1";
    public static final String KEY_ARG2 = "arg2";
    public static final String KEY_ARG3 = "arg3";
    public static final String KEY_ARGS = "args";

    static {
        kge.a(-294120258);
    }

    public static /* synthetic */ void a(c cVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdef179b", new Object[]{cVar, dllVar});
        } else {
            b(cVar, dllVar);
        }
    }

    public static Intent a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("11ab37a9", new Object[]{context, str});
        }
        Intent intentForUri = Nav.from(context).intentForUri(Uri.parse(str));
        if (intentForUri != null) {
            intentForUri.putExtra("NAV_TO_URL_START_UPTIME", SystemClock.uptimeMillis());
            intentForUri.putExtra("NAV_TO_URL_START_TIME", System.currentTimeMillis());
        }
        return intentForUri;
    }

    public static JSONObject a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb9346ae", new Object[]{str, obj});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        jSONObject.put("data", obj);
        return jSONObject;
    }

    public static JSONObject a(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d21593bb", new Object[]{str, new Integer(i), str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", (Object) Integer.valueOf(i));
        jSONObject2.put("domain", (Object) "ability-kit");
        jSONObject2.put("description", (Object) str2);
        jSONObject.put("data", (Object) jSONObject2);
        return jSONObject;
    }

    public static <PARAMS extends c, CONTEXT extends dlr> dkx a(PARAMS params, IAKPopRender<PARAMS, CONTEXT> iAKPopRender, dlh dlhVar, CONTEXT context, dll dllVar) {
        a bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("533ec25b", new Object[]{params, iAKPopRender, dlhVar, context, dllVar});
        }
        String n = params.f8913a.n();
        if ("view".equals(n) || "activity".equals(n)) {
            bVar = new b();
        } else {
            if (n != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("inputJson", (Object) dlhVar.d().toJSONString());
                jSONObject.put("mode", (Object) n);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("arg1", (Object) "WindowAttachMode");
                jSONObject2.put("args", (Object) jSONObject);
                a(2201, "Page_StdSemiPop", jSONObject2);
            }
            if (dmr.m()) {
                bVar = new b();
            } else {
                bVar = new com.taobao.android.abilitykit.ability.pop.presenter.c();
            }
        }
        bVar.a(iAKPopRender);
        return a(bVar, params, dlhVar, context, dllVar);
    }

    public static <PARAMS extends c, CONTEXT extends dlr> dkx a(final d<PARAMS, CONTEXT> dVar, final PARAMS params, dlh dlhVar, final CONTEXT context, final dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("f83395eb", new Object[]{dVar, params, dlhVar, context, dllVar});
        }
        Context a2 = context.a();
        if (a2 == null) {
            dkv dkvVar = new dkv(90001, "AppCtxNull");
            dmn.a(dlhVar, dkvVar);
            return new dkw(dkvVar, true);
        }
        params.a(a2);
        ffz.a(a2);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        String currentPageName = l.getInstance().getCurrentPageName();
        if (StringUtils.isEmpty(currentPageName)) {
            currentPageName = a2.getClass().getName();
        }
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("fromPageName", (Object) currentPageName);
        jSONObject.put("inputJson", (Object) dlhVar.d().toJSONString());
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("arg1", (Object) "StdSemiPop_CallStdPop");
        jSONObject2.put("args", (Object) jSONObject);
        a(2201, "Page_StdSemiPop", jSONObject2);
        dVar.a(new d.a() { // from class: tb.jal.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.abilitykit.ability.pop.presenter.d.a
            public void a(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                    return;
                }
                dll dllVar2 = dll.this;
                if (dllVar2 != null) {
                    dllVar2.callback("onClose", new dla(jSONObject3));
                }
                jSONObject.put(StEvent.SHOW_TIME, (Object) Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                jSONObject2.put("arg1", (Object) "StdSemiPop_ShowStdPop");
                jal.a(2201, "Page_StdSemiPop", jSONObject2);
            }

            @Override // com.taobao.android.abilitykit.ability.pop.presenter.d.a
            public void b(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("63b99827", new Object[]{this, jSONObject3});
                    return;
                }
                dll dllVar2 = dll.this;
                if (dllVar2 == null) {
                    return;
                }
                dllVar2.callback("onBlockBackDismissed", new dla(jSONObject3));
            }
        });
        if (params.d()) {
            com.taobao.android.tbabilitykit.pop.a.a(context, new com.taobao.android.tbabilitykit.pop.d() { // from class: tb.jal.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbabilitykit.pop.d
                public d<PARAMS, CONTEXT> a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (d) ipChange2.ipc$dispatch("65ee47cf", new Object[]{this}) : d.this;
                }

                @Override // com.taobao.android.tbabilitykit.pop.d
                public c b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (c) ipChange2.ipc$dispatch("b8578950", new Object[]{this}) : params;
                }

                @Override // com.taobao.android.tbabilitykit.pop.d
                public void a(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("68a25ba", new Object[]{this, activity});
                        return;
                    }
                    context.a(activity);
                    if (!d.this.a(context, params, null, 0)) {
                        return;
                    }
                    jal.a(params, dllVar);
                }
            }, params.h);
        } else if (dVar.a(context, params, null, 0)) {
            b(params, dllVar);
        }
        return new dky();
    }

    private static void b(c cVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c501b7a", new Object[]{cVar, dllVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("popId", (Object) cVar.b);
        if (dllVar == null) {
            return;
        }
        dllVar.callback("onPopAppear", new dky(jSONObject));
    }

    public static dkx a(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("12eee68a", new Object[]{new Integer(i), str, jSONObject});
        }
        if (StringUtils.isEmpty(str)) {
            return new dkw(new dkv(10004, "ut异常error send pageName 不为空"), false);
        }
        String string = jSONObject.getString("arg1");
        String string2 = jSONObject.getString("arg2");
        String string3 = jSONObject.getString("arg3");
        String str2 = StringUtils.isEmpty(string2) ? "" : string2;
        String str3 = StringUtils.isEmpty(string3) ? "" : string3;
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        HashMap hashMap = new HashMap();
        if (jSONObject2 != null) {
            for (Map.Entry<String, Object> entry : jSONObject2.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!StringUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, String.valueOf(value));
                }
            }
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, string, str2, str3, hashMap).build());
            return new dla();
        } catch (Throwable unused) {
            return new dkw(new dkv(10004, "ut异常error send"), false);
        }
    }
}
