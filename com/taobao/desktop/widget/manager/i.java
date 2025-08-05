package com.taobao.desktop.widget.manager;

import android.content.Context;
import android.content.Intent;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.ditto.data.WidgetContentData;
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
import com.taobao.login4android.api.Login;
import com.taobao.widgetvivo.server.WidgetVivoService;
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
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.khf;
import tb.khg;
import tb.khm;
import tb.khn;
import tb.khp;
import tb.khv;
import tb.kia;
import tb.kid;
import tb.kie;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class i extends b implements khf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile i b;
    private kia c;
    private final ConcurrentHashMap<String, kia> d = new ConcurrentHashMap<>();

    static {
        kge.a(-2093867511);
        kge.a(1762741535);
        kge.a(-1800020421);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.khf
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        }
    }

    public static /* synthetic */ void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b35957", new Object[]{iVar});
        } else {
            iVar.d();
        }
    }

    public static /* synthetic */ void a(i iVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9b7b61", new Object[]{iVar, str});
        } else {
            iVar.d(str);
        }
    }

    public static /* synthetic */ void b(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8188e76", new Object[]{iVar});
        } else {
            iVar.c();
        }
    }

    public static i a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("ea094a8f", new Object[]{context});
        }
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = new i(context);
                }
            }
        }
        return b;
    }

    private i(Context context) {
        if (context.getApplicationContext() != null) {
            this.f16975a = context.getApplicationContext();
        } else {
            this.f16975a = context;
        }
        khm.a().a(this.f16975a);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (!g.a(this.f16975a).i(str)) {
        } else {
            a(str, (Intent) null);
        }
    }

    public void a(String str, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
            return;
        }
        if (this.d.get(str) == null) {
            if (str.equals(WidgetDynamicReceiver.class.getName())) {
                this.c = new com.taobao.desktop.widget.template.dynamic.b(this.f16975a, str);
            } else if (str.equals(WidgetCombineReceiver.class.getName()) || str.equals(WidgetCombineMiuiReceiver.class.getName()) || str.equals(WidgetTaoVideoReceiver.class.getName()) || str.equals(WidgetTaoCaiReceiver.class.getName()) || str.equals(WidgetTaoMsgReceiver.class.getName()) || str.equals(WidgetTaoMsgNewReceiver.class.getName())) {
                this.c = new com.taobao.desktop.widget.template.combine.a(this.f16975a, str);
            } else if (str.equals(WidgetStandardReceiver.class.getName()) || str.equals(WidgetStandardMiuiReceiver.class.getName()) || str.equals(WidgetTaoLifeReceiver.class.getName()) || str.equals(WidgetOrderReceiver.class.getName()) || str.equals(WidgetFarmReceiver.class.getName()) || str.equals(WidgetTaoSignReceiver.class.getName()) || str.equals(WidgetTaoGameReceiver.class.getName()) || str.equals(WidgetTaoGuessReceiver.class.getName()) || str.equals(WidgetMainInteractionReceiver.class.getName()) || str.equals(TjbWidgetReceiver.class.getName()) || str.equals(WidgetTaoGoldReceiver.class.getName()) || str.equals(WidgetTaoVideoSmallReceiver.class.getName()) || str.equals(WidgetTaoShakeReceiver.class.getName()) || str.equals(WidgetTaoCartReceiver.class.getName()) || str.equals(WidgetLiveReceiver.class.getName())) {
                this.c = new com.taobao.desktop.widget.template.standard.a(this.f16975a, str);
            }
            kia kiaVar = this.c;
            if (kiaVar == null) {
                kif.a(getClass(), "register mWidgetDataUpdate == null");
                return;
            }
            this.d.put(str, kiaVar);
            Class<?> cls = getClass();
            kif.a(cls, "register mWidgetProviderMap: " + this.d);
        }
        if (intent == null) {
            return;
        }
        kie.a().execute(new Runnable() { // from class: com.taobao.desktop.widget.manager.i.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    i.this.a(intent);
                }
            }
        });
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (String str : l.b) {
            c(str);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (String str : l.f16993a) {
            c(str);
        }
    }

    public void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            kie.a().execute(new Runnable() { // from class: com.taobao.desktop.widget.manager.i.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (z) {
                        i.a(i.this);
                    } else {
                        i.b(i.this);
                    }
                    i.this.a();
                }
            });
        } catch (Exception e) {
            Class<?> cls = getClass();
            kif.a(cls, "requestBackground error: " + e.getMessage());
        }
    }

    public void c(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6eda09", new Object[]{this, hashMap});
            return;
        }
        try {
            f();
            g();
            a(false);
            e();
            b();
        } catch (Throwable th) {
            Class<?> cls = getClass();
            kif.a(cls, "workBackground error: " + th.getMessage());
        }
    }

    @Override // com.taobao.desktop.widget.manager.b
    public void a(List<String> list, String str, khg khgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2235cf69", new Object[]{this, list, str, khgVar});
        } else if (list == null || list.size() == 0) {
        } else {
            if (khv.a() && e.h(this.f16975a)) {
                kif.b("requestData widgetProcess");
                j.a(list, str, true, this, khgVar);
                return;
            }
            j.a(list, str, false, this, khgVar);
        }
    }

    @Override // com.taobao.desktop.widget.manager.b
    public void a(String str, Integer num, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515d7f8f", new Object[]{this, str, num, str2});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(num);
        a(str, arrayList, str2);
    }

    @Override // com.taobao.desktop.widget.manager.b
    public void a(String str, List<Integer> list, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52777c2d", new Object[]{this, str, list, str2});
            return;
        }
        try {
            if (khp.c()) {
                if (!((JSONObject) JSON.parse(str2)).containsKey("id")) {
                    if (this.d.size() <= 0) {
                        return;
                    }
                    Class<?> cls = getClass();
                    kif.a(cls, "widgetDataUpdate mWidgetProviderMap old: " + this.d);
                    for (Map.Entry<String, kia> entry : this.d.entrySet()) {
                        entry.getValue().a(str, list, str2);
                    }
                    return;
                }
                WidgetContentData widgetContentData = (WidgetContentData) JSON.parseObject(str2, WidgetContentData.class);
                if (this.d.size() <= 0) {
                    return;
                }
                Class<?> cls2 = getClass();
                kif.a(cls2, "widgetDataUpdate mWidgetProviderMap: " + this.d);
                for (Map.Entry<String, kia> entry2 : this.d.entrySet()) {
                    if (widgetContentData.isDynamic()) {
                        entry2.getValue().a(str, list, widgetContentData);
                        Class<?> cls3 = getClass();
                        kif.a(cls3, "widgetDataUpdate notifyDataUpdate isDynamic=true, name=" + entry2.getKey());
                    } else {
                        JSONArray jSONArray = ((JSONObject) JSON.parse(widgetContentData.getJsonContent())).getJSONArray("data");
                        if (jSONArray != null && jSONArray.size() != 0) {
                            entry2.getValue().a(str, list, ((JSONObject) jSONArray.get(0)).toString());
                            Class<?> cls4 = getClass();
                            kif.a(cls4, "widgetDataUpdate notifyDataUpdate isDynamic=false, name=" + entry2.getKey());
                        }
                        return;
                    }
                }
            } else if (this.d.size() > 0) {
                Class<?> cls5 = getClass();
                kif.a(cls5, "widgetDataUpdate mWidgetProviderMap: " + this.d);
                for (Map.Entry<String, kia> entry3 : this.d.entrySet()) {
                    entry3.getValue().a(str, list, str2);
                }
            }
        } catch (Exception e) {
            Class<?> cls6 = getClass();
            kif.a(cls6, "widgetDataUpdate error" + e.getMessage());
            kih.a("widget_catch_error", "widgetDataUpdate error", e.getMessage(), null);
        }
    }

    @Override // tb.khf
    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            kie.a().execute(new Runnable() { // from class: com.taobao.desktop.widget.manager.i.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(i.this, str);
                    }
                }
            });
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        HashMap<String, String> a2 = h.a(this.f16975a).a(str);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        if (e.r(this.f16975a)) {
            b(a2);
        } else {
            a(a2);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            g.a(this.f16975a).f();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        if (kid.b(this.f16975a)) {
            kih.a("widget_xiaomi_support");
        }
        if (!kid.c(this.f16975a, "")) {
            return;
        }
        kih.a("widget_vivo_support");
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            khn.a(this.f16975a).a(Login.getUserId());
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!e.f(this.f16975a)) {
        } else {
            WidgetVivoService.a(this.f16975a, "");
        }
    }
}
