package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.d;
import com.taobao.android.detail.wrapper.nav.c;
import com.taobao.android.purchase.aura.ability.AbilityParams;
import com.taobao.android.purchase.aura.utils.b;
import com.taobao.android.tbabilitykit.m;
import java.util.HashMap;
import java.util.Map;
import tb.arc;

/* loaded from: classes6.dex */
public class bxe {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static bxe b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, a> f26155a = new HashMap();

    /* loaded from: classes6.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f26158a;
        public String b;

        static {
            kge.a(-644811701);
        }

        public a(String str, String str2) {
            this.f26158a = str;
            this.b = str2;
        }
    }

    static {
        kge.a(1335251127);
    }

    public static bxe a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxe) ipChange.ipc$dispatch("f03002f", new Object[0]);
        }
        if (b == null) {
            b = new bxe();
        }
        return b;
    }

    public void a(Context context, AbilityParams abilityParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318d48df", new Object[]{this, context, abilityParams, str});
        } else {
            a(context, abilityParams, str, null);
        }
    }

    public void a(final Context context, AbilityParams abilityParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dfb98e9", new Object[]{this, context, abilityParams, str, str2});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        if (StringUtils.isEmpty(str2)) {
            str2 = "TBBuyHalfScreenFragment" + identityHashCode;
        }
        this.f26155a.put(Integer.valueOf(identityHashCode), new a(str2, str));
        alu aluVar = new alu(new alr(str, "nativeFragment").a(context));
        AbilityParams abilityParams2 = new AbilityParams();
        abilityParams2.popId = str2;
        abilityParams2.bizId = str;
        abilityParams2.extConfig = abilityParams.extConfig;
        JSONObject c = b.c(fke.b(context));
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.h = a(c, "shouldBlockClose", "true");
        bVar.i = a(c, "droidFullScreen", "true");
        bVar.j = a(c, c.STDPOP_CONFIG_BACK, "false");
        bVar.f14730a = a(c, "animation", d.KEY_BOTTOM_IN_OUT);
        bVar.b = a(c, "panEnable", "false");
        bVar.d = a(c, "contentBackColor", "#00000000");
        bVar.e = Float.parseFloat(a(c, "maxHeight", "0.75"));
        bVar.c = a(c, "attachMode", "");
        bVar.f = a(c, "backgroundMode", "");
        bVar.g = a(c, "backgroundStyle", "");
        bVar.k = Float.parseFloat(a(c, "cornerRadius", "16"));
        HashMap hashMap = new HashMap();
        hashMap.put("popId", str2);
        abilityParams2.content = hashMap;
        abilityParams2.popConfig = bVar;
        aluVar.b("stdPop", m.API_NATIVE, new alq().a((View) null), (JSONObject) JSON.toJSON(abilityParams2), new alo() { // from class: tb.bxe.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                String str3;
                String str4;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                } else if (executeResult instanceof FinishResult) {
                    if (!"onClose".equalsIgnoreCase(executeResult.f())) {
                        return;
                    }
                    fke.a(context);
                } else {
                    String str5 = "";
                    if (executeResult instanceof ErrorResult) {
                        ErrorResult errorResult = (ErrorResult) executeResult;
                        str5 = errorResult.a();
                        str4 = errorResult.b();
                        str3 = errorResult.f();
                    } else {
                        str3 = str5;
                        str4 = str3;
                    }
                    arc.a().b("以浮层模式打开下单", arc.a.a().a("code", str5).a("info", str4).a("type", str3).b());
                }
            }
        });
    }

    private String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f883384", new Object[]{this, jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        String string = jSONObject.getString(str);
        return StringUtils.isEmpty(string) ? str2 : string;
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
            return;
        }
        a remove = this.f26155a.remove(Integer.valueOf(System.identityHashCode(context)));
        if (remove == null) {
            fke.a(context);
            return;
        }
        alu aluVar = new alu(new alr(remove.b, "nativeFragment").a(context));
        AbilityParams abilityParams = new AbilityParams();
        abilityParams.popId = remove.f26158a;
        if (!(aluVar.a("stdPop", "close", new alq(), (JSONObject) JSON.toJSON(abilityParams), new alo() { // from class: tb.bxe.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                }
            }
        }) instanceof ErrorResult)) {
            return;
        }
        fke.a(context);
    }
}
