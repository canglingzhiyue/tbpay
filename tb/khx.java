package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.trigger.g;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.model.c;
import com.taobao.android.abilitykit.ability.pop.model.d;
import com.taobao.android.tbabilitykit.m;
import com.taobao.desktop.widget.manager.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class khx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2054175359);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            b(context, str);
        } catch (Exception e) {
            kif.a("GlobalNavigationService addDesktop error: " + e.getMessage());
        }
    }

    private static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        Variation variation = UTABTest.activate("AB_", "202301301925_1833").getVariation("addDesktopNewMode");
        if (e.a() && variation != null && variation.getValueAsBoolean(false)) {
            kif.a("GlobalNavigationService addRouter isNewMode true");
            c(context, str);
            return;
        }
        kif.a("GlobalNavigationService addRouter isNewMode false");
        a(str);
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        String a2 = a("poplayer://tbShortcutGuide", (HashMap) JSON.parseObject(str, new TypeReference<HashMap<String, String>>() { // from class: tb.khx.1
        }, new Feature[0]));
        kif.a("GlobalNavigationService addShortcut uri: " + a2);
        g.a(a2, a2).a(new g.a() { // from class: tb.khx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.poplayer.trigger.g.a
            public void a(String str2, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str2, str3, str4});
                    return;
                }
                kif.b("PopLayerTrigger onDisplayed protocol: " + str3);
            }

            @Override // com.alibaba.poplayer.trigger.g.a
            public void a(String str2, boolean z, boolean z2, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e47be646", new Object[]{this, str2, new Boolean(z), new Boolean(z2), str3, str4});
                    return;
                }
                kif.b("PopLayerTrigger onClosed closeReason: " + str3);
            }

            @Override // com.alibaba.poplayer.trigger.g.a
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                kif.b("PopLayerTrigger onTriggerFailed reason: " + str2);
            }
        }).a();
    }

    private static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
            return;
        }
        String a2 = a("https://market.m.taobao.com/app/starlink/universal-tb-shortcut/swiper-guide", (HashMap) JSON.parseObject(str, new TypeReference<HashMap<String, String>>() { // from class: tb.khx.3
        }, new Feature[0]));
        kif.a("GlobalNavigationService addWidget uri: " + a2);
        alu aluVar = new alu(new alr("manufacturer", "manufacturer").a(context));
        Map<String, ? extends Object> jSONObject = new JSONObject(2);
        jSONObject.put("url", (Object) a2);
        jSONObject.put("popId", (Object) "float-layer-pop");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("animation", (Object) d.KEY_BOTTOM_IN_OUT);
        jSONObject2.put("panEnable", (Object) "true");
        jSONObject2.put("originHeight", (Object) "0.8");
        jSONObject.put(c.KEY_POP_CONFIG, (Object) jSONObject2);
        aluVar.b("stdPop", m.API_H5, new alq(), jSONObject, new alo() { // from class: tb.khx.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.alo
            public void onCallback(ExecuteResult executeResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                    return;
                }
                kif.a("AbilityHubAdapter.call result：" + JSON.toJSONString(executeResult.c()));
            }
        });
    }

    private static String a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dcf7ed", new Object[]{str, map});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, map.get(str2));
        }
        buildUpon.build();
        return buildUpon.toString();
    }
}
