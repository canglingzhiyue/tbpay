package com.taobao.android.dinamicx.monitor;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.ci;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ugc.h5.WVMicorPublishPlugin;
import com.taobao.avplayer.TBPlayerConst;
import java.util.HashMap;
import java.util.Map;
import tb.fxd;
import tb.fxe;
import tb.kge;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f11905a;

    static {
        kge.a(-144103678);
    }

    private static String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : "3.0";
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : c();
    }

    public static /* synthetic */ String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : b(str);
    }

    public static /* synthetic */ Map a(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("5387f1eb", new Object[]{str, str2, str3, dXTemplateItem, map}) : b(str, str2, str3, dXTemplateItem, map);
    }

    public static /* synthetic */ void a(String str, DXTemplateItem dXTemplateItem, s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141de9", new Object[]{str, dXTemplateItem, aVar});
        } else {
            d(str, dXTemplateItem, aVar);
        }
    }

    public static /* synthetic */ a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ce380581", new Object[0]) : f11905a;
    }

    public static /* synthetic */ void b(String str, DXTemplateItem dXTemplateItem, s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492b2488", new Object[]{str, dXTemplateItem, aVar});
        } else {
            c(str, dXTemplateItem, aVar);
        }
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfe9a80", new Object[]{aVar});
        } else {
            f11905a = aVar;
        }
    }

    public static void a(int i, final String str, final String str2, final String str3, final DXTemplateItem dXTemplateItem, final Map<String, String> map, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c95567b", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, map, new Double(d)});
        } else if (f11905a == null) {
        } else {
            fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        h.b().a(str2, str3, h.a(), "DinamicX", str, h.a(str, h.a(str2), str3, dXTemplateItem, map));
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            });
        }
    }

    public static void a(int i, final String str, final String str2, final String str3, final DXTemplateItem dXTemplateItem, final ci ciVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456ea1b8", new Object[]{new Integer(i), str, str2, str3, dXTemplateItem, ciVar});
        } else if (f11905a == null) {
        } else {
            fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String a2 = h.a(str2);
                        String str4 = str3;
                        String a3 = h.a();
                        String str5 = str;
                        HashMap hashMap = new HashMap();
                        for (Map.Entry<String, Object> entry : ciVar.a().entrySet()) {
                            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
                        }
                        for (Map.Entry<String, Long> entry2 : ciVar.b().entrySet()) {
                            hashMap.put(entry2.getKey(), String.valueOf(((float) entry2.getValue().longValue()) / 1000000.0f));
                        }
                        h.b().a(str2, str4, a3, "DinamicX", str5, h.a(str, a2, str3, dXTemplateItem, hashMap));
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            });
        }
    }

    public static void a(final s sVar, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1643945b", new Object[]{sVar, new Boolean(z)});
        } else if (f11905a == null) {
        } else {
            fxe.a(new fxd() { // from class: com.taobao.android.dinamicx.monitor.h.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (s.this != null && s.this.c != null && !s.this.c.isEmpty()) {
                            int size = s.this.c.size();
                            int i = size - 1;
                            for (int i2 = 0; i2 < size; i2++) {
                                s.a aVar = s.this.c.get(i2);
                                if (aVar != null) {
                                    if (z) {
                                        aVar.c = DXMonitorConstant.DX_MONITOR_SIMPLE_PIPELINE + aVar.c;
                                    }
                                    if (i2 == i) {
                                        h.a(s.this.f11919a, s.this.b, aVar);
                                        h.b(s.this.f11919a, s.this.b, aVar);
                                        return;
                                    }
                                    h.a(s.this.f11919a, s.this.b, aVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        com.taobao.android.dinamicx.exception.a.b(th);
                    }
                }
            });
        }
    }

    private static void c(String str, DXTemplateItem dXTemplateItem, s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92422b27", new Object[]{str, dXTemplateItem, aVar});
        } else if (aVar == null) {
        } else {
            String b = b(aVar.c);
            String str2 = aVar.b;
            String c = c();
            Map<String, String> b2 = b(str, b, aVar.b, dXTemplateItem, aVar.f);
            String str3 = "" + aVar.d;
            String str4 = aVar.e;
            if (b2 != null) {
                b2.put("errorMsg", str4);
                b2.put("errorCode", str3);
            }
            f11905a.a(b, str2, c, "DinamicX", str, b2, str3, str4);
        }
    }

    private static void d(String str, DXTemplateItem dXTemplateItem, s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db5931c6", new Object[]{str, dXTemplateItem, aVar});
        } else if (aVar == null) {
        } else {
            String b = b(aVar.c);
            String str2 = "" + aVar.d;
            String str3 = aVar.e;
            Map<String, Object> a2 = a(dXTemplateItem, aVar);
            HashMap hashMap = new HashMap();
            Map<String, String> b2 = b(str, b, aVar.b, dXTemplateItem, aVar.f);
            if (b2 != null) {
                b2.put("errorMsg", str3);
                b2.put("errorCode", str2);
            }
            hashMap.put("args", b2);
            f11905a.a("DinamicX", str, b, (String) null, str2, str3, a2, hashMap);
        }
    }

    private static Map<String, Object> a(DXTemplateItem dXTemplateItem, s.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ab2793e8", new Object[]{dXTemplateItem, aVar});
        }
        HashMap hashMap = new HashMap();
        if (dXTemplateItem != null) {
            hashMap.put(g.f11904a, dXTemplateItem.f11925a);
            hashMap.put(g.b, Long.valueOf(dXTemplateItem.b));
            hashMap.put(g.c, dXTemplateItem.c);
        }
        if (aVar != null) {
            hashMap.put(g.d, aVar.b);
        }
        return hashMap;
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        return str + "_umbrella2";
    }

    private static Map<String, String> b(String str, String str2, String str3, DXTemplateItem dXTemplateItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b804bc8a", new Object[]{str, str2, str3, dXTemplateItem, map});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bizName", "DinamicX");
        if (!StringUtils.isEmpty(str)) {
            hashMap.put(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName, str);
        }
        if (!StringUtils.isEmpty(str3)) {
            hashMap.put("serviceId", str3);
        } else {
            hashMap.put("serviceId", DXMonitorConstant.DX_DEFAULT_SERVICE_ID);
        }
        if (!StringUtils.isEmpty(str2)) {
            hashMap.put("featureType", str2);
        }
        hashMap.put("version", c());
        hashMap.put("samplingRate", "1.0");
        if (dXTemplateItem != null) {
            if (!StringUtils.isEmpty(dXTemplateItem.f11925a)) {
                hashMap.put("templateName", dXTemplateItem.f11925a);
            }
            hashMap.put("templateVersion", dXTemplateItem.b + "");
            if (!StringUtils.isEmpty(dXTemplateItem.c)) {
                hashMap.put(WVMicorPublishPlugin.TEMPLATE_URL, dXTemplateItem.c);
            }
        }
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return hashMap;
    }
}
