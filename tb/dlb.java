package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.ModalAbility;
import com.taobao.android.abilitykit.ability.ToastAbility;
import com.taobao.android.abilitykit.ability.c;
import com.taobao.android.abilitykit.ability.e;
import com.taobao.android.abilitykit.ability.i;
import com.taobao.android.abilitykit.ability.j;
import com.taobao.android.abilitykit.ability.l;
import com.taobao.android.abilitykit.ability.m;
import com.taobao.android.abilitykit.ability.n;
import com.taobao.android.abilitykit.ability.o;
import com.taobao.android.abilitykit.ability.q;
import com.taobao.android.abilitykit.ability.r;
import com.taobao.android.abilitykit.ability.s;
import com.taobao.android.abilitykit.mega.a;
import com.taobao.android.abilitykit.mega.b;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class dlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, dln> f26823a;
    public static dlm b;
    public static dlp c;
    public static dld d;
    public static dlt e;
    public static dlf f;

    static {
        kge.a(1886798344);
        f26823a = new HashMap(0);
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }

    public static void a(Map<String, dln> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
            return;
        }
        if (map != null) {
            f26823a = map;
        } else {
            f26823a = new HashMap(200);
        }
        b bVar = new b("toast", "show");
        f26823a.put(ToastAbility.TOAST_KEY, bVar);
        f26823a.put("toast", bVar);
        dli dliVar = new dli(e.class);
        f26823a.put(e.UT_KEY, dliVar);
        f26823a.put(BHRTaskConfigBase.TYPE_CONFIG_UT, dliVar);
        dli dliVar2 = new dli(c.class);
        f26823a.put(c.OPEN_URL_KEY, dliVar2);
        f26823a.put("openUrl", dliVar2);
        dli dliVar3 = new dli(com.taobao.android.abilitykit.ability.b.class);
        f26823a.put(com.taobao.android.abilitykit.ability.b.CHAIN_STORAGE_SET_KEY, dliVar3);
        f26823a.put("chainStorageSet", dliVar3);
        f26823a.put("engineStorageGet", new a(new com.alibaba.ability.builder.a(n.class), "get"));
        a aVar = new a(new com.alibaba.ability.builder.a(n.class), "set");
        f26823a.put("-5501025549152042105", aVar);
        f26823a.put("engineStorageSet", aVar);
        a aVar2 = new a(new com.alibaba.ability.builder.a(n.class), "remove");
        f26823a.put("-7356852182257447732", aVar2);
        f26823a.put("engineStorageRemove", aVar2);
        dli dliVar4 = new dli(com.taobao.android.abilitykit.ability.a.class);
        f26823a.put(com.taobao.android.abilitykit.ability.a.CHAIN_STORAGE_REMOVE_KEY, dliVar4);
        f26823a.put("chainStorageRemove", dliVar4);
        b bVar2 = new b("modal", "confirm");
        f26823a.put(ModalAbility.ALERT_KEY, bVar2);
        f26823a.put("alert", bVar2);
        b bVar3 = new b("clipboard", "set", new iqx());
        f26823a.put("33283577007", bVar3);
        f26823a.put("copy", bVar3);
        dli dliVar5 = new dli(r.class);
        f26823a.put(r.SUBSCRIBEMSG_KEY, dliVar5);
        f26823a.put("subscribeMsg", dliVar5);
        dli dliVar6 = new dli(q.class);
        f26823a.put(q.POSTMSG_KEY, dliVar6);
        f26823a.put("postMsg", dliVar6);
        f26823a.put(o.GETABILITYRESULT, new dli(o.class));
        dli dliVar7 = new dli(l.class);
        f26823a.put(l.DELAY, dliVar7);
        f26823a.put("delay", dliVar7);
        dli dliVar8 = new dli(j.class);
        f26823a.put("batchEngineStorageSet", dliVar8);
        f26823a.put(j.BATCHENGINESTORAGESET, dliVar8);
        dli dliVar9 = new dli(i.class);
        f26823a.put("batchChainStorageSet", dliVar9);
        f26823a.put(i.BATCHCHAINSTORAGESET, dliVar9);
        a aVar3 = new a(new com.alibaba.ability.builder.a(m.class), m.UNSUBSCRIBE);
        f26823a.put("3543788934920872410", aVar3);
        f26823a.put(m.UNSUBSCRIBE, aVar3);
        com.alibaba.ability.builder.a aVar4 = new com.alibaba.ability.builder.a(dmi.class);
        a aVar5 = new a(aVar4, "set");
        f26823a.put("localStorageSet", aVar5);
        f26823a.put("5790826678801003547", aVar5);
        a aVar6 = new a(aVar4, "remove");
        f26823a.put("localStorageRemove", aVar6);
        f26823a.put("1205113155689526880", aVar6);
        f26823a.put("localStorageGet", new a(aVar4, "get"));
        b bVar4 = new b("loading", "show");
        f26823a.put("-2939618971112730742", bVar4);
        f26823a.put("showLoading", bVar4);
        b bVar5 = new b("loading", "hide");
        f26823a.put("8835679324859276387", bVar5);
        f26823a.put("hideLoading", bVar5);
        f26823a.put(s.PHONECALL, new b("telephone", "call"));
        com.alibaba.ability.builder.a aVar7 = new com.alibaba.ability.builder.a(dlv.class);
        a aVar8 = new a(aVar7, "checkStatus");
        f26823a.put("108007756778224807", aVar8);
        f26823a.put("nfcCheckStatus", aVar8);
        a aVar9 = new a(aVar7, "subscribe");
        f26823a.put("5117748265580200421", aVar9);
        f26823a.put("nfcSubscribe", aVar9);
        a aVar10 = new a(aVar7, dlv.API_UNSUBSCRIBE);
        f26823a.put("6484524228157736106", aVar10);
        f26823a.put("nfcUnSubscribe", aVar10);
        f26823a.put("-8650336092319702444", new b("hapticsEngine", dlu.API_IMPACT_LIGHT));
        f26823a.put("-7245659340636260162", new b("hapticsEngine", dlu.API_IMPACT_MEDIUM));
        f26823a.put("-8654928393693493159", new b("hapticsEngine", dlu.API_IMPACT_HEAVY));
        f26823a.put("4199085201809887479", new b("hapticsEngine", dlu.API_IMPACT_SOFT));
        f26823a.put("-8643474493436904629", new b("hapticsEngine", dlu.API_IMPACT_RIGID));
        f26823a.put("-4519297587126488378", new b("hapticsEngine", dlu.API_NOTIFICATION_SUCCESS));
        f26823a.put("5513535128116053699", new b("hapticsEngine", dlu.API_NOTIFICATION_WARNING));
        f26823a.put("-2061066385349986315", new b("hapticsEngine", dlu.API_NOTIFICATION_ERROR));
        f26823a.put("5385686896002704622", new b("hapticsEngine", dlu.API_SELECTION_CHANGE));
        f26823a.put("-4656032954816542521", new b("hapticsEngine", dlu.API_VIBRATE));
        f26823a.put("-1969902236801825729", new b("hapticsEngine", "cancel"));
    }

    public static dlp a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlp) ipChange.ipc$dispatch("f03bd36", new Object[0]) : c;
    }

    public static dlm b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dlm) ipChange.ipc$dispatch("16b56238", new Object[0]) : b;
    }

    public static dld c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dld) ipChange.ipc$dispatch("1e670680", new Object[0]) : d;
    }

    public static dlt d() {
        try {
            return (dlt) e.getClass().newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static dlf e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dlf) ipChange.ipc$dispatch("2dca517c", new Object[0]);
        }
        if (f == null) {
            f = new dlf() { // from class: tb.dlb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dlf
                public String a(dkt dktVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9728ad15", new Object[]{this, dktVar}) : dktVar == null ? "AbilityKit" : dktVar.a().d();
                }
            };
        }
        return f;
    }
}
