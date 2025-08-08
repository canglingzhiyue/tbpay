package com.taobao.android.dinamicx.monitor;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.ci;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.monitor.procedure.v;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fxd;
import tb.fxe;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final int f11893a;
    private static j b;
    private static int c;

    private static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : "3.0";
    }

    public static /* synthetic */ JSONObject a(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("8d1c4956", new Object[]{str, str2, str3, dXTemplateItem, map}) : b(str, str2, str3, dXTemplateItem, map);
    }

    public static /* synthetic */ String a(String str, String str2, DXTemplateItem dXTemplateItem, Map map, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a7c70f56", new Object[]{str, str2, dXTemplateItem, map, str3}) : b(str, str2, dXTemplateItem, map, str3);
    }

    public static /* synthetic */ void a(String str, DXTemplateItem dXTemplateItem, String str2, String str3, Map map, int i, String str4, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f883967", new Object[]{str, dXTemplateItem, str2, str3, map, new Integer(i), str4, new Long(j), new Boolean(z)});
        } else {
            b(str, dXTemplateItem, str2, str3, map, i, str4, j, z);
        }
    }

    public static /* synthetic */ j b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("ce380698", new Object[0]) : b;
    }

    static {
        kge.a(2107241109);
        f11893a = R.id.apm_view_token;
        c = 0;
    }

    public static void a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c02b1d7", new Object[]{jVar});
        } else {
            b = jVar;
        }
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else {
            a(view, v.APM_VIEW_VALID);
        }
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{view});
        } else {
            a(view, v.APM_VIEW_INVALID);
        }
    }

    private static void a(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293f8cc6", new Object[]{view, obj});
        } else if (view == null) {
        } else {
            view.setTag(f11893a, obj);
        }
    }

    public static void a(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76162bb9", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d), new Boolean(z)});
        } else if (bx.f()) {
        } else {
            b(i, str, str2, str3, dXTemplateItem, map, d, z);
            if (!bx.a()) {
                a(i, str, str2, str3, dXTemplateItem, map, d);
            }
            l.a().a(i, str, str2, str3, dXTemplateItem, d);
        }
    }

    public static void c(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b85713b", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d), new Boolean(z)});
        } else if (bx.u()) {
        } else {
            b(i, str, str2, str3, dXTemplateItem, map, d, z);
            if (!bx.a()) {
                a(i, str, str2, str3, dXTemplateItem, map, d);
            }
            l.a().a(i, str, str2, str3, dXTemplateItem, d);
        }
    }

    public static void a(int i, final String str, final String str2, final String str3, final DXTemplateItem dXTemplateItem, final ci ciVar, final double d, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4596e0e", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, ciVar, new Double(d), new Boolean(z)});
        } else if (bx.f()) {
        } else {
            try {
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
            if (bx.f()) {
                return;
            }
            if (c != i && 2 != i) {
                return;
            }
            fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (str3 != null) {
                        fuw.b(str2, riy.ARRAY_START_STR + str + "]：" + str2 + "性能埋点: " + str3 + ResponseProtocolType.COMMENT + (d / 1000000.0d) + "ms templateinfo: " + (dXTemplateItem == null ? "" : dXTemplateItem.f11925a + "_:" + dXTemplateItem.b));
                        if (b.b() == null) {
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, Object> entry : ciVar.a().entrySet()) {
                            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                        for (Map.Entry<String, Long> entry2 : ciVar.b().entrySet()) {
                            hashMap.put(entry2.getKey(), String.valueOf(((float) entry2.getValue().longValue()) / 1000000.0f));
                        }
                        if (b.a(dXTemplateItem) && !DinamicXEngine.j()) {
                            JSONObject a2 = b.a(str, str2, str3, dXTemplateItem, hashMap);
                            a2.put(DXMonitorConstant.DX_MONITOR_CONSUMING_TIME, (Object) String.valueOf(d / 1000000.0d));
                            b.b().a(DXMonitorConstant.DX_MONITOR_PAGE, "DinamicX", a2.toString());
                            if (d > mto.a.GEO_NOT_SUPPORT) {
                                b.b().a(DXMonitorConstant.DX_MONITOR_PAGE, "DinamicX", a2.toString(), d / 1000000.0d);
                            }
                        }
                        if (!z) {
                            return;
                        }
                        fux.a("DinamicX", "DinamicX", b.a(str, str3, dXTemplateItem, hashMap, ""));
                    }
                }
            });
            if (!bx.a()) {
                if (bx.f()) {
                    return;
                }
                h.a(i, str, str2, str3, dXTemplateItem, ciVar);
            }
            l.a().a(i, str, str2, str3, dXTemplateItem, d);
        }
    }

    private static void a(int i, String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c95567b", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d)});
        } else if (bx.f()) {
        } else {
            h.a(i, str, str2, str3, dXTemplateItem, map, d);
        }
    }

    private static void b(int i, final String str, final String str2, final String str3, final DXTemplateItem dXTemplateItem, final Map<String, String> map, final double d, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40cdce7a", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d), new Boolean(z)});
            return;
        }
        try {
            if (c != i && 2 != i) {
                return;
            }
            fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:67:0x00ef A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:68:0x00f0  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 342
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.monitor.b.AnonymousClass2.run():void");
                }
            });
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public static void a(int i, final String str, final String str2, final String str3, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82762f2c", new Object[]{new Integer(i), str, str2, str3, map});
            return;
        }
        try {
            if (c != i) {
                return;
            }
            fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!b.a((DXTemplateItem) null) || DinamicXEngine.j()) {
                    } else {
                        b.a(str, str2, str3, (DXTemplateItem) null, map);
                    }
                }
            });
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public static void a(String str, DXTemplateItem dXTemplateItem, String str2, String str3, int i, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32cc1be", new Object[]{str, dXTemplateItem, str2, str3, new Integer(i), str4});
            return;
        }
        try {
            if (bx.f()) {
                return;
            }
            s sVar = new s(str);
            sVar.b = dXTemplateItem;
            s.a aVar = new s.a(str2, str3, i);
            aVar.e = str4;
            sVar.c.add(aVar);
            a(sVar);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public static void a(DXRuntimeContext dXRuntimeContext, String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc753680", new Object[]{dXRuntimeContext, str, str2, new Integer(i), str3});
            return;
        }
        try {
            if (bx.f()) {
                return;
            }
            s sVar = new s(dXRuntimeContext.A());
            if (dXRuntimeContext.n() != null) {
                sVar.a(dXRuntimeContext.n().a());
            }
            sVar.b = dXRuntimeContext.c();
            s.a aVar = new s.a(str, str2, i);
            aVar.e = str3;
            sVar.c.add(aVar);
            a(sVar);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public static void a(s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea75199", new Object[]{sVar});
        } else if (bx.f()) {
        } else {
            a(sVar, false);
        }
    }

    public static void a(s sVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643945b", new Object[]{sVar, new Boolean(z)});
        } else if (bx.f()) {
        } else {
            c(sVar, z);
            if (!bx.a()) {
                b(sVar, z);
            }
            l.a().a(sVar, z);
        }
    }

    private static void b(s sVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29eb67dc", new Object[]{sVar, new Boolean(z)});
        } else {
            h.a(sVar, z);
        }
    }

    private static void c(final s sVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d933b5d", new Object[]{sVar, new Boolean(z)});
            return;
        }
        try {
            if (!bx.f() && b != null && sVar != null && sVar.f11919a != null && sVar.c != null && sVar.c.size() > 0) {
                fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.DXAppMonitor$4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String str = s.this.f11919a;
                        List<s.a> list = s.this.c;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            s.a aVar = list.get(i);
                            if (aVar != null && !StringUtils.isEmpty(aVar.b)) {
                                if (aVar.f == null) {
                                    aVar.f = new HashMap();
                                }
                                aVar.f.put("eventId", s.this.a());
                                if (z) {
                                    aVar.c = DXMonitorConstant.DX_MONITOR_SIMPLE_PIPELINE + aVar.c;
                                }
                                b.a(str, s.this.b, aVar.c, aVar.b, aVar.f, aVar.d, aVar.e, aVar.f11920a, aVar.g);
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    private static void b(String str, DXTemplateItem dXTemplateItem, String str2, String str3, Map<String, String> map, int i, String str4, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69cf0de8", new Object[]{str, dXTemplateItem, str2, str3, map, new Integer(i), str4, new Long(j), new Boolean(z)});
        } else if (bx.f()) {
        } else {
            JSONObject b2 = b(str, str2, str3, dXTemplateItem, map);
            if (b2 != null) {
                b2.put("timeStamp", (Object) Long.valueOf(j));
                if (str4 != null) {
                    b2.put("errorMsg", (Object) str4);
                }
            }
            if (!DinamicXEngine.j()) {
                j jVar = b;
                String jSONString = b2.toJSONString();
                jVar.a(DXMonitorConstant.DX_MONITOR_PAGE, "DinamicX", jSONString, i + "", str4);
            }
            String b3 = b(str, str3, dXTemplateItem, map, "errorCode:" + i + "_errorMsg:" + str4);
            if (!z) {
                return;
            }
            fux.b("DinamicX", "DinamicX", b3);
        }
    }

    private static String b(String str, String str2, DXTemplateItem dXTemplateItem, Map<String, String> map, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7de64c57", new Object[]{str, str2, dXTemplateItem, map, str3});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.ARRAY_START_STR);
        sb.append(str);
        sb.append("]:");
        sb.append(str2);
        sb.append("|");
        JSONObject jSONObject = new JSONObject();
        if (dXTemplateItem != null) {
            jSONObject.put("template", (Object) dXTemplateItem.f11925a);
            jSONObject.put("version", (Object) Long.valueOf(dXTemplateItem.b));
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
        }
        if (str3 != null) {
            jSONObject.put("error", (Object) str3);
        }
        sb.append(jSONObject.toJSONString());
        return sb.toString();
    }

    private static JSONObject b(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("788d4a35", new Object[]{str, str2, str3, dXTemplateItem, map});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizName", (Object) "DinamicX");
        if (!StringUtils.isEmpty(str)) {
            jSONObject.put(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, (Object) str);
        }
        if (!StringUtils.isEmpty(str3)) {
            jSONObject.put("serviceId", (Object) str3);
        } else {
            jSONObject.put("serviceId", (Object) DXMonitorConstant.DX_DEFAULT_SERVICE_ID);
        }
        if (!StringUtils.isEmpty(str2)) {
            jSONObject.put("featureType", (Object) str2);
        }
        jSONObject.put("version", (Object) c());
        jSONObject.put("samplingRate", (Object) "1.0");
        if (dXTemplateItem != null) {
            if (!StringUtils.isEmpty(dXTemplateItem.f11925a)) {
                jSONObject.put("templateName", (Object) dXTemplateItem.f11925a);
            }
            jSONObject.put("templateVersion", (Object) (dXTemplateItem.b + ""));
            if (!StringUtils.isEmpty(dXTemplateItem.c)) {
                jSONObject.put(WVMicorPublishPlugin.TEMPLATE_URL, (Object) dXTemplateItem.c);
            }
            jSONObject.put("templateType", (Object) Integer.valueOf(dXTemplateItem.e()));
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    jSONObject.put(entry.getKey(), (Object) entry.getValue());
                }
            }
        }
        return jSONObject;
    }

    public static boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{dXTemplateItem})).booleanValue();
        }
        double doubleValue = fqi.be().doubleValue();
        if (dXTemplateItem != null && fqi.b(dXTemplateItem.f11925a)) {
            doubleValue = fqi.e().doubleValue();
        }
        return doubleValue > Math.random();
    }
}
