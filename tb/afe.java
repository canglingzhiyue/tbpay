package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightbuy.performance.LightBuyStage;
import com.taobao.android.lightbuy.performance.a;
import com.taobao.android.purchase.aura.b;
import tb.afd;
import tb.arc;

/* loaded from: classes5.dex */
public class afe implements afd, afd.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GO_BACK = "goBack";
    private final afh b;

    static {
        kge.a(696135136);
        kge.a(-1761500735);
        kge.a(565131565);
    }

    public static /* synthetic */ void a(afe afeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5a0ff8", new Object[]{afeVar, jSONObject});
        } else {
            afeVar.a(jSONObject);
        }
    }

    private Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75941360", new Object[]{this});
        }
        afh afhVar = this.b;
        if (afhVar == null) {
            return null;
        }
        return afhVar.b();
    }

    public afe(afh afhVar) {
        this.b = afhVar;
        afg.a().a(this);
    }

    public void a(JSONObject jSONObject, final aff affVar, final aff affVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39e0066", new Object[]{this, jSONObject, affVar, affVar2});
            return;
        }
        Log.e("MessageChannel", "onReceiveMessage event = getInitData");
        arc.a().b("onReceiveMessage event = getInitData", arc.a.a().b("MessageChannel").a("LightBuy/event").a("receive", "getInitData").b());
        if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("failTest")) && affVar2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) "code");
            jSONObject2.put("message", (Object) "message");
            affVar2.invoke(jSONObject2);
        }
        a.a().a(LightBuyStage.WEEX_REQ_INVOKED);
        if (a() == null) {
            return;
        }
        afa.a().a(a(), new aez() { // from class: tb.afe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aez
            public void a(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                    return;
                }
                if (jSONObject3.get("mainResponse") != null) {
                    a.a().a(LightBuyStage.WEEX_REQ_INVOKED);
                }
                affVar.invokeAndKeepAlive(jSONObject3);
            }

            @Override // tb.aez
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else if (affVar2 == null) {
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("code", (Object) str);
                    jSONObject3.put("message", (Object) str2);
                    affVar2.invoke(jSONObject3);
                }
            }
        });
    }

    @Override // tb.afd.a
    public boolean a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6635bd02", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (this.b == null) {
            return true;
        }
        char c = 65535;
        if (str.hashCode() == -1241591313 && str.equals("goBack")) {
            c = 0;
        }
        if (c == 0) {
            return this.b.a();
        }
        this.b.a(str, jSONObject);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
        if (r10.equals("viewDidAppear") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r10, final com.alibaba.fastjson.JSONObject r11, tb.aff r12) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.afe.a(java.lang.String, com.alibaba.fastjson.JSONObject, tb.aff):void");
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (!"auraEvent".equalsIgnoreCase(jSONObject.getString("event"))) {
            arc.a().a("invokeAuraEvent event is not auraEventNotification");
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("param");
            if (jSONObject2 == null) {
                arc.a().a("invokeAuraEvent param is null");
                return;
            }
            String string = jSONObject2.getString("type");
            if (TextUtils.isEmpty(string)) {
                arc.a().a("invokeAuraEvent eventType is null");
                return;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("fields");
            if (!(a() instanceof b)) {
                return;
            }
            ((b) a()).invokeEvent(string, jSONObject3);
        }
    }
}
