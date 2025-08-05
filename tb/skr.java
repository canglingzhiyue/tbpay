package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.monitor.b;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class skr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1992836353);
    }

    public static /* synthetic */ Map a(Map map, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("85c7b09c", new Object[]{map, str}) : b(map, str);
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f33663a;
        private ThreadPoolExecutor b;

        static {
            kge.a(2141436988);
            f33663a = new a();
        }

        public static void a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("39112e6", new Object[]{runnable});
            } else {
                f33663a.a(1, 60, "TTDetailMonitor").execute(runnable);
            }
        }

        public synchronized ExecutorService a(int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ExecutorService) ipChange.ipc$dispatch("c9c7a3c9", new Object[]{this, new Integer(i), new Integer(i2), str});
            }
            if (this.b == null) {
                this.b = new ThreadPoolExecutor(i, Integer.MAX_VALUE, i2, TimeUnit.SECONDS, new LinkedBlockingDeque(), a(str, false));
                this.b.allowCoreThreadTimeOut(true);
            }
            return this.b;
        }

        private static ThreadFactory a(final String str, final boolean z) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ThreadFactory) ipChange.ipc$dispatch("f2e0e9fb", new Object[]{str, new Boolean(z)}) : new ThreadFactory() { // from class: tb.skr.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Thread) ipChange2.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                    }
                    Thread thread = new Thread(runnable, str);
                    thread.setDaemon(z);
                    return thread;
                }
            };
        }
    }

    public static void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{map});
        } else {
            a("Page_TTDetail", "TTDetailSuccessStat", map);
        }
    }

    private static void a(final String str, final String str2, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            a.a(new Runnable() { // from class: tb.skr.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str3 = "";
                        if (map != null && !map.isEmpty()) {
                            str3 = JSON.toJSONString(map);
                        }
                        AppMonitor.Alarm.commitSuccess(str, str2, str3);
                        i.a("TTDetailMonitor", "monitor commitSuccess monitorPoint:" + str2);
                        i.a("TTDetailMonitor", "monitor commitSuccess msg:" + str3);
                    } catch (Throwable th) {
                        i.a("TTDetailMonitor", "monitor commitSuccess 异常", th);
                    }
                }
            });
        }
    }

    public static void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{new Integer(i), str});
        } else {
            a("Page_TTDetail", "TTDetailExceptionStat", null, i, str);
        }
    }

    public static void a(Map<String, String> map, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be93f8d0", new Object[]{map, new Integer(i), str});
        } else {
            a("Page_TTDetail", "TTDetailExceptionStat", map, i, str);
        }
    }

    private static void a(final String str, final String str2, final Map<String, String> map, final int i, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d945d4e4", new Object[]{str, str2, map, new Integer(i), str3});
        } else {
            a.a(new Runnable() { // from class: tb.skr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str4 = "";
                        Map<String, String> a2 = skr.a(map, str3);
                        if (a2 != null) {
                            str4 = JSON.toJSONString(a2);
                        }
                        AppMonitor.Alarm.commitFail(str, str2, str4, String.valueOf(i), str3);
                        if (j.J()) {
                            b.Companion.a(a2, Integer.valueOf(i));
                        }
                        i.a("TTDetailMonitor", "monitor commitFail errorCode:" + i);
                        i.a("TTDetailMonitor", "monitor commitFail errorMsg:" + str4);
                    } catch (Throwable th) {
                        i.a("TTDetailMonitor", "monitor commitFail 异常", th);
                    }
                }
            });
        }
    }

    private static Map<String, String> b(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b3a04afb", new Object[]{map, str});
        }
        HashMap hashMap = null;
        if (TextUtils.isEmpty(str) && map == null) {
            z = false;
        }
        if (z) {
            hashMap = new HashMap();
        }
        if (hashMap != null && map != null) {
            hashMap.putAll(map);
        }
        if (hashMap != null && !TextUtils.isEmpty(str)) {
            hashMap.put("_errorMsg_", str);
        }
        return hashMap;
    }
}
