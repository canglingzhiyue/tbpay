package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.b;
import com.taobao.android.riverlogger.e;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class jqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ThreadPoolExecutor b;

    static {
        kge.a(903658158);
        b = jqh.a(1, 5, 3L, TimeUnit.SECONDS, new Runnable() { // from class: tb.jqg.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    UnifyLog.d("UltronRVLogger", "rejected");
                }
            }
        }, "UltronRVLogger");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            a("ultron", str, str2, null);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            a(str, str2, str3, null);
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
        b(str2, str + "#" + str3, System.currentTimeMillis(), map);
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
            b(str, sb.toString(), null);
        }
    }

    public static void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
        } else {
            b(str, str2, System.currentTimeMillis(), map);
        }
    }

    public static void b(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ae8ccc", new Object[]{str, strArr});
        } else if (ifp.a()) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArr) {
                sb.append(str2);
            }
            b(str, sb.toString(), System.currentTimeMillis(), null);
        }
    }

    public static void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else if (!ifp.a()) {
        } else {
            b(str, str2, System.currentTimeMillis(), map);
        }
    }

    private static void b(final String str, final String str2, final long j, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9da2be", new Object[]{str, str2, new Long(j), map});
            return;
        }
        try {
            final boolean a2 = jqh.a();
            b.execute(new Runnable() { // from class: tb.jqg.2
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
                        b a3 = e.a(rVLLevel, sb.toString()).a(RVLLevel.Error);
                        a3.a(j <= 0 ? System.currentTimeMillis() : j);
                        a3.a("message", (Object) str2);
                        a3.a("isMainThread", Boolean.valueOf(a2));
                        a3.a(map);
                        a3.a();
                    } catch (Exception e) {
                        UnifyLog.d("UltronRVLogger", e.getMessage());
                    }
                }
            });
        } catch (Exception e) {
            UnifyLog.d("UltronRVLogger", e.getMessage());
        }
    }
}
