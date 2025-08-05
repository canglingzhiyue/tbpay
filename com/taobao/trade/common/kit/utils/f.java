package com.taobao.trade.common.kit.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadPoolExecutor f22985a;

    static {
        kge.a(-1393994651);
        f22985a = g.a(1, 5, 3L, TimeUnit.SECONDS, new Runnable() { // from class: com.taobao.trade.common.kit.utils.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UnifyLog.a("UltronRVLogger", "rejected");
                }
            }
        }, "UltronRVLogger");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a("ultron", str, str2, (Map<String, Object>) null);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a(str, str2, str3, (Map<String, Object>) null);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        if (str == null) {
            str = "ultron";
        }
        a(str2, str + "#" + str3, System.currentTimeMillis(), map);
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            a(str, str2, "");
        }
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else if (str != null && strArr != null) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            a(str, sb.toString(), (Map<String, Object>) null);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            a(str, str2, System.currentTimeMillis(), map);
        }
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ae8ccc", new Object[]{str, strArr});
        } else if (c.a()) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            a(str, sb.toString(), System.currentTimeMillis(), (Map<String, Object>) null);
        }
    }

    private static void a(final String str, final String str2, final long j, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550999bd", new Object[]{str, str2, new Long(j), map});
            return;
        }
        try {
            final boolean a2 = g.a();
            f22985a.execute(new Runnable() { // from class: com.taobao.trade.common.kit.utils.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        RVLLevel rVLLevel = RVLLevel.Error;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Ultron/");
                        sb.append(TextUtils.isEmpty(str) ? "common" : str);
                        com.taobao.android.riverlogger.b a3 = com.taobao.android.riverlogger.e.a(rVLLevel, sb.toString()).a(RVLLevel.Error);
                        a3.a(j <= 0 ? System.currentTimeMillis() : j);
                        a3.a("message", (Object) str2);
                        a3.a("isMainThread", Boolean.valueOf(a2));
                        a3.a(map);
                        a3.a();
                    } catch (Exception e) {
                        UnifyLog.a("UltronRVLogger", e.getMessage());
                    }
                }
            });
        } catch (Exception e) {
            UnifyLog.a("UltronRVLogger", e.getMessage());
        }
    }
}
