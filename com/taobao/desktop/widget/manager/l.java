package com.taobao.desktop.widget.manager;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.template.combine.WidgetCombineMiuiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoCaiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgNewReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoVideoReceiver;
import com.taobao.desktop.widget.template.gold.WidgetTaoGoldReceiver;
import com.taobao.desktop.widget.template.standard.WidgetMainInteractionReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardMiuiReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoCartReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGameReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGuessReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoShakeReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoSignReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoVideoSmallReceiver;
import com.taobao.desktop.widget.template.taolife.WidgetTaoLifeReceiver;
import com.taobao.wireless.link.widget.combine.WidgetCombineReceiver;
import com.taobao.wireless.link.widget.dynamic.WidgetDynamicReceiver;
import com.taobao.wireless.link.widget.farm.WidgetFarmReceiver;
import com.taobao.wireless.link.widget.live.WidgetLiveReceiver;
import com.taobao.wireless.link.widget.order.WidgetOrderReceiver;
import com.taobao.wireless.link.widget.tjb.TjbWidgetReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.kib;
import tb.kid;
import tb.kif;

/* loaded from: classes7.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f16993a;
    public static List<String> b;
    private static Map<String, Class<?>> c;

    static {
        kge.a(2027766718);
        c = new HashMap();
        f16993a = new ArrayList();
        b = new ArrayList();
        c.put("widget_dynamic", WidgetDynamicReceiver.class);
        c.put("widget_combine", WidgetCombineReceiver.class);
        c.put("widget_combine_miui", WidgetCombineMiuiReceiver.class);
        c.put("widget_standard", WidgetStandardReceiver.class);
        c.put("widget_standard_miui", WidgetStandardMiuiReceiver.class);
        c.put("widget_gold", TjbWidgetReceiver.class);
        c.put("widget_live", WidgetLiveReceiver.class);
        c.put("widget_life", WidgetTaoLifeReceiver.class);
        c.put("widget_gold_miui", WidgetTaoGoldReceiver.class);
        c.put("widget_new_order", WidgetOrderReceiver.class);
        c.put("widget_farm", WidgetFarmReceiver.class);
        c.put("widget_tao_sign", WidgetTaoSignReceiver.class);
        c.put("widget_tao_game", WidgetTaoGameReceiver.class);
        c.put("widget_taoVideo", WidgetTaoVideoReceiver.class);
        c.put("widget_taoCai", WidgetTaoCaiReceiver.class);
        c.put("widget_taoMessage", WidgetTaoMsgReceiver.class);
        c.put("widget_taoGuess", WidgetTaoGuessReceiver.class);
        c.put("widget_mainInteraction", WidgetMainInteractionReceiver.class);
        c.put("widget_taoMsgNew", WidgetTaoMsgNewReceiver.class);
        c.put("widget_taoVideoMini", WidgetTaoVideoSmallReceiver.class);
        c.put("widget_taoShake", WidgetTaoShakeReceiver.class);
        c.put("widget_taoCart", WidgetTaoCartReceiver.class);
        f16993a.add(WidgetTaoGoldReceiver.class.getName());
        f16993a.add(WidgetCombineReceiver.class.getName());
        f16993a.add(WidgetCombineMiuiReceiver.class.getName());
        f16993a.add(WidgetStandardReceiver.class.getName());
        f16993a.add(WidgetStandardMiuiReceiver.class.getName());
        f16993a.add(WidgetOrderReceiver.class.getName());
        f16993a.add(WidgetTaoLifeReceiver.class.getName());
        f16993a.add(WidgetFarmReceiver.class.getName());
        f16993a.add(WidgetDynamicReceiver.class.getName());
        f16993a.add(TjbWidgetReceiver.class.getName());
        f16993a.add(WidgetLiveReceiver.class.getName());
        f16993a.add(WidgetTaoSignReceiver.class.getName());
        f16993a.add(WidgetTaoGameReceiver.class.getName());
        f16993a.add(WidgetTaoVideoReceiver.class.getName());
        f16993a.add(WidgetTaoCaiReceiver.class.getName());
        f16993a.add(WidgetTaoMsgReceiver.class.getName());
        f16993a.add(WidgetTaoGuessReceiver.class.getName());
        f16993a.add(WidgetMainInteractionReceiver.class.getName());
        f16993a.add(WidgetTaoMsgNewReceiver.class.getName());
        f16993a.add(WidgetTaoVideoSmallReceiver.class.getName());
        f16993a.add(WidgetTaoShakeReceiver.class.getName());
        f16993a.add(WidgetTaoCartReceiver.class.getName());
    }

    public static String a(String str) {
        Class<?> cls;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : (!c.containsKey(str) || (cls = c.get(str)) == null) ? "" : cls.getName();
    }

    public static Class<?> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("6e32a629", new Object[]{str, str2});
        }
        Class<?> b2 = b(str2);
        if (b2 == null && c.containsKey(str) && (b2 = c(str)) == null) {
            b2 = c.get(str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getWidgetReceiver: typeId: ");
        sb.append(str2);
        sb.append(",receiver: ");
        sb.append(b2 == null ? null : b2.getName());
        kif.a(sb.toString());
        return b2;
    }

    public static Class<?> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("212a3020", new Object[]{str});
        }
        Class<?> cls = null;
        if (kid.b(kib.a().b())) {
            for (Map.Entry<Class<?>, String> entry : f.d.entrySet()) {
                if (entry.getValue().equals(str)) {
                    cls = entry.getKey();
                }
            }
        } else {
            for (Map.Entry<Class<?>, String> entry2 : f.b.entrySet()) {
                if (entry2.getValue().equals(str)) {
                    cls = entry2.getKey();
                }
            }
        }
        return cls;
    }

    private static Class<?> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("ea2b2761", new Object[]{str});
        }
        if (!e.q(kib.a().b()) || !kid.b(kib.a().b())) {
            return null;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -923424389) {
            if (hashCode != 275479108) {
                if (hashCode == 1875001944 && str.equals("widget_standard")) {
                    c2 = 2;
                }
            } else if (str.equals("widget_combine")) {
                c2 = 1;
            }
        } else if (str.equals("widget_gold")) {
            c2 = 0;
        }
        if (c2 == 0) {
            return c.get("widget_gold_miui");
        }
        if (c2 == 1) {
            return c.get("widget_combine_miui");
        }
        if (c2 == 2) {
            return c.get("widget_standard_miui");
        }
        return null;
    }
}
