package com.taobao.desktop.widget.manager;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
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
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.kib;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Class<?>> f16981a;
    public static Map<Class<?>, String> b;
    public static boolean c;
    public static Map<Class<?>, String> d;

    static {
        kge.a(1721100442);
        f16981a = new HashMap();
        b = new HashMap();
        d = new HashMap();
        c = false;
        f16981a.put("widget_dynamic_add", WidgetDynamicReceiver.class);
        f16981a.put("widget_add", TjbWidgetReceiver.class);
        f16981a.put("widget_combine_add", WidgetCombineReceiver.class);
        f16981a.put("widget_live_add", WidgetLiveReceiver.class);
        f16981a.put("widget_standard_add", WidgetStandardReceiver.class);
        f16981a.put("widget_gold_miui_add", WidgetTaoGoldReceiver.class);
        f16981a.put("widget_new_order_add", WidgetOrderReceiver.class);
        f16981a.put("widget_farm_add", WidgetFarmReceiver.class);
        b.put(TjbWidgetReceiver.class, "43");
        b.put(WidgetCombineReceiver.class, "131");
        b.put(WidgetLiveReceiver.class, "88");
        b.put(WidgetTaoLifeReceiver.class, "94");
        b.put(WidgetOrderReceiver.class, "taoLogistics");
        b.put(WidgetFarmReceiver.class, "tmallFarm");
        b.put(WidgetTaoSignReceiver.class, "taoQiandao");
        b.put(WidgetTaoGameReceiver.class, "xiaoxiaole");
        b.put(WidgetTaoVideoReceiver.class, "taoVideo");
        b.put(WidgetTaoCaiReceiver.class, "taoCaicai");
        b.put(WidgetTaoMsgReceiver.class, "taoInterest");
        b.put(WidgetTaoGuessReceiver.class, "guess");
        b.put(WidgetMainInteractionReceiver.class, "mainInteraction");
        b.put(WidgetTaoMsgNewReceiver.class, "taoMessage");
        b.put(WidgetTaoVideoSmallReceiver.class, "taoVideoMini");
        b.put(WidgetTaoShakeReceiver.class, "taoShake");
        b.put(WidgetTaoCartReceiver.class, "taoCartsMini");
        d.put(WidgetTaoGoldReceiver.class, "43");
        d.put(WidgetStandardMiuiReceiver.class, "tmallFarm");
        d.put(WidgetCombineMiuiReceiver.class, "131");
        d.put(WidgetOrderReceiver.class, "taoLogistics");
        d.put(WidgetTaoVideoReceiver.class, "taoVideo");
    }

    public static void a(Context context, Class<?> cls, String str, String str2) {
        PendingIntent b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c70971", new Object[]{context, cls, str, str2});
        } else if (cls == null) {
        } else {
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    return;
                }
                AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                ComponentName componentName = new ComponentName(context, cls);
                if (!appWidgetManager.isRequestPinAppWidgetSupported()) {
                    return;
                }
                Intent intent = new Intent(context, cls);
                intent.setAction("com.taobao.widget_receiver_action");
                intent.putExtra("widget_type_id", str);
                intent.putExtra("widget_channel", str2);
                if (e.s(context)) {
                    b2 = com.android.taobao.aop.a.b(context, 0, intent, 167772160);
                } else {
                    b2 = com.android.taobao.aop.a.b(context, 0, intent, 134217728);
                }
                boolean requestPinAppWidget = appWidgetManager.requestPinAppWidget(componentName, a(cls.getName(), str, str2), b2);
                c = true;
                kih.a("widget_dynamic_add_success", str, str2, null);
                com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(str).d("widget_state_create"));
                kif.a("requestPinAppWidget:" + requestPinAppWidget);
            } catch (Throwable th) {
                kif.a("requestPinAppWidget:" + th.getMessage());
                kih.a("widget_catch_error", "requestPinAppWidget", th.getMessage(), new kih.a().a(str).b(str2));
            }
        }
    }

    public static String a(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe97b16b", new Object[]{cls});
        }
        if (b.containsKey(cls)) {
            return b.get(cls);
        }
        return d.containsKey(cls) ? d.get(cls) : "";
    }

    public static Class<?> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("212a3020", new Object[]{str});
        }
        if (!f16981a.containsKey(str)) {
            return null;
        }
        return f16981a.get(str);
    }

    private static Bundle a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("ecdfe78a", new Object[]{str, str2, str3});
        }
        Bundle bundle = new Bundle();
        bundle.putString("addType", "appWidgetDetail");
        bundle.putString(com.alibaba.triver.triver_shop.newShop.event.broadcast.c.WIDGET_NAME, kib.a().b().getPackageName() + "/" + str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("widget_type_id", str2);
        bundle2.putString("widget_channel", str3);
        bundle.putBundle("widgetExtraData", bundle2);
        return bundle;
    }
}
