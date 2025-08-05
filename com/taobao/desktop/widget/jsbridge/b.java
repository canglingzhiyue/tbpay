package com.taobao.desktop.widget.jsbridge;

import android.content.Context;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.e;
import com.taobao.desktop.widget.manager.f;
import com.taobao.desktop.widget.manager.g;
import com.taobao.desktop.widget.manager.l;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.monitor.a;
import com.taobao.desktop.widget.service.RemoteData;
import tb.kge;
import tb.khn;
import tb.khz;
import tb.kib;
import tb.kif;
import tb.kih;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(541671580);
    }

    public static boolean b(Context context, String str, String str2, c cVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c02d3e9b", new Object[]{context, str, str2, cVar})).booleanValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 104792645:
                if (str.equals("addWidget")) {
                    c = 2;
                    break;
                }
                break;
            case 1158616740:
                if (str.equals("isSupported")) {
                    c = 0;
                    break;
                }
                break;
            case 1207466352:
                if (str.equals("isInstalled")) {
                    c = 1;
                    break;
                }
                break;
            case 2043643118:
                if (str.equals("editWidget")) {
                    c = 3;
                    break;
                }
                break;
        }
        if (c == 0) {
            z = b(str2);
        } else if (c != 1) {
            if (c == 2) {
                c(context, "widget_common_add", str2);
            } else if (c == 3) {
                a(context, str2, cVar);
            }
            z = true;
        } else {
            z = a(context, str2);
        }
        if (cVar != null) {
            cVar.a(String.valueOf(z));
        }
        kif.a("WidgetServiceHubMega action: " + str + ",params: " + str2 + ",enabled: " + z);
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
        if (r9.equals("widget_vivo_add_support") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r8, java.lang.String r9, java.lang.String r10, com.taobao.desktop.widget.jsbridge.c r11) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.widget.jsbridge.b.a(android.content.Context, java.lang.String, java.lang.String, com.taobao.desktop.widget.jsbridge.c):boolean");
    }

    public static Object b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b0ee9dff", new Object[]{context, str, str2});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 1226188408) {
            if (hashCode == 1544639838 && str.equals("mockQuery")) {
                c = 0;
            }
        } else if (str.equals("mockSet")) {
            c = 1;
        }
        if (c == 0) {
            return a(context);
        }
        if (c != 1) {
            return null;
        }
        c(context, str2);
        return null;
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            return khz.b(JSON.parseObject(str).getString("typeId"));
        } catch (Exception e) {
            kif.a("TBWidgetServiceBridge isWidgetInstallSupport error：" + e.getMessage());
            return false;
        }
    }

    private static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            return g.a(context).b(parseObject.getString("widgetType"), parseObject.getString("typeId"));
        } catch (Exception e) {
            kif.a("TBWidgetServiceBridge isWidgetInstalled error：" + e.getMessage());
            return false;
        }
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        try {
            return g.a(kib.a().b()).c(str);
        } catch (Exception e) {
            kif.a("WidgetServiceHub isWidgetInstalled error：" + e);
            return false;
        }
    }

    private static void c(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ecf9b2", new Object[]{context, str, str2});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            String string = parseObject.getString("typeId");
            String string2 = parseObject.getString("channel");
            String string3 = parseObject.getString("widgetType");
            if (str.equals("widget_common_add")) {
                f.a(context, l.a(string3, string), string, string2);
            } else {
                f.a(context, f.b(str), string, string2);
            }
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(string).b(string2).d("widget_state_execute"));
        } catch (Exception e) {
            kif.a("WidgetOpenJsBridge nativeWidgetAdd error：" + e.getMessage());
        }
    }

    private static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
            return;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("widgetType");
            String string2 = parseObject.getString("typeId");
            String string3 = parseObject.getString("channel");
            g.a(context).a(string, string2, string3);
            kih.a("widget_pre_add", string2, string3, null);
        } catch (Exception e) {
            kif.a("WidgetOpenJsBridge nativeWidgetAdd error：" + e.getMessage());
        }
    }

    private static Object a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c902fed2", new Object[]{context});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String b = khn.a(context).b();
            if (!TextUtils.isEmpty(b)) {
                JSONObject parseObject = JSON.parseObject(b);
                boolean booleanValue = parseObject.getBoolean("enable").booleanValue();
                jSONObject.put("status", (Object) Boolean.valueOf(booleanValue));
                if (!booleanValue) {
                    return jSONObject;
                }
                jSONObject.put("content", (Object) parseObject.getJSONObject("mockData"));
            }
        } catch (Exception e) {
            kif.a("WidgetOpenJsBridge serverMockQuery error：" + e.getMessage());
        }
        return jSONObject;
    }

    private static void c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54b79e8", new Object[]{context, str});
            return;
        }
        khn.a(context).b(str);
        g.a(context).g();
    }

    private static void a(Context context, String str, final c cVar) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f904d9ee", new Object[]{context, str, cVar});
            return;
        }
        try {
            if (!e.l(context).booleanValue() || (parseObject = JSON.parseObject(str)) == null) {
                return;
            }
            String string = parseObject.getString("widgetId");
            String string2 = parseObject.getString("typeId");
            RemoteData remoteData = new RemoteData();
            remoteData.setChangeWidgetId(string);
            remoteData.setTypeId(string2);
            com.taobao.desktop.widget.service.a.a(context).a(3, remoteData, new com.taobao.desktop.widget.service.b() { // from class: com.taobao.desktop.widget.jsbridge.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.widget.service.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    kif.a("[widgetDefault] changeWidgetTypeId success");
                    new r().a("result", "success");
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a("success");
                }
            });
            com.taobao.desktop.widget.monitor.a.a().a(MonitorType.WIDGET_STATE, new a.C0652a().a(string2).d("widget_state_default_change"));
        } catch (Throwable th) {
            kif.a("changeWidgetTypeId error：" + th.getMessage());
        }
    }
}
