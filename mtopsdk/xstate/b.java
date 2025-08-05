package mtopsdk.xstate;

import android.content.Context;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.xstate.network.NetworkStateReceiver;
import tb.kge;

/* loaded from: classes9.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, String> f25045a;
    private static NetworkStateReceiver b;
    private static Context c;
    private static volatile boolean d;

    static {
        kge.a(-669885289);
        f25045a = null;
        d = false;
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
            return;
        }
        try {
            if (d) {
                return;
            }
            if (context == null) {
                TBSdkLog.e("mtopsdk.XStateDelegate", "[checkInit]parameter context for init(Context context) is null.");
                return;
            }
            if (f25045a == null) {
                f25045a = new ConcurrentHashMap<>();
            }
            c = context;
            if (b == null) {
                b = new NetworkStateReceiver();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(b, intentFilter);
            }
            d = true;
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.XStateDelegate", "[checkInit] init XState OK,isInit=" + d);
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.XStateDelegate", "[checkInit] checkInit error --" + th.toString());
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (d) {
        } else {
            b(context);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!d) {
        } else {
            try {
                if (!d) {
                    return;
                }
                if (f25045a != null) {
                    f25045a.clear();
                    f25045a = null;
                }
                if (c == null) {
                    TBSdkLog.e("mtopsdk.XStateDelegate", "[unInit] context in Class XState is null.");
                    return;
                }
                if (b != null) {
                    c.unregisterReceiver(b);
                    b = null;
                }
                d = false;
                if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    return;
                }
                TBSdkLog.i("mtopsdk.XStateDelegate", "[unInit] unInit XState OK,isInit=" + d);
            } catch (Exception e) {
                TBSdkLog.e("mtopsdk.XStateDelegate", "[unInit] unInit error --" + e.toString());
            }
        }
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f25045a;
        if (concurrentHashMap != null && str != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = f25045a;
        if (concurrentHashMap != null && str != null && str2 != null) {
            concurrentHashMap.put(str, str2);
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                return;
            }
            TBSdkLog.d("mtopsdk.XStateDelegate", "[setValue]set  XStateID succeed," + str + "=" + str2);
        } else if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
        } else {
            TBSdkLog.d("mtopsdk.XStateDelegate", "[setValue]set  XStateID failed,key=" + str + ",value=" + str2);
        }
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (f25045a == null || str == null) {
            return null;
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
            TBSdkLog.d("mtopsdk.XStateDelegate", "remove XState key=" + str);
        }
        return f25045a.remove(str);
    }
}
