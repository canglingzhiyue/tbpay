package tb;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.Utils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class dir {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NET_TYPE_2G = 2;
    public static final int NET_TYPE_3G = 3;
    public static final int NET_TYPE_4G = 4;
    public static final int NET_TYPE_5G = 5;
    public static final int NET_TYPE_UNKNOWN = 0;
    public static final int NET_TYPE_WIFI = 1;

    /* renamed from: a  reason: collision with root package name */
    public static int f26790a = 0;
    public static volatile Context b = null;
    public static boolean c = false;
    private static String d;

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (b == null) {
        } else {
            try {
                f26790a = f();
            } catch (Exception unused) {
            }
        }
    }

    private static int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[0])).intValue();
        }
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        if (status.isWifi()) {
            return 1;
        }
        if (status.isMobile()) {
            String type = status.getType();
            char c2 = 65535;
            int hashCode = type.hashCode();
            if (hashCode != 1621) {
                if (hashCode != 1652) {
                    if (hashCode != 1683) {
                        if (hashCode == 1714 && type.equals("5G")) {
                            c2 = 3;
                        }
                    } else if (type.equals("4G")) {
                        c2 = 2;
                    }
                } else if (type.equals("3G")) {
                    c2 = 1;
                }
            } else if (type.equals("2G")) {
                c2 = 0;
            }
            if (c2 == 0) {
                return 2;
            }
            if (c2 == 1) {
                return 3;
            }
            if (c2 == 2) {
                return 4;
            }
            if (c2 == 3) {
                return 5;
            }
        }
        return 0;
    }

    public static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.split("_");
        }
        return null;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(ado.URL_SEPARATOR)) {
                str = "http:" + str;
            }
            try {
                int indexOf = str.indexOf("?");
                if (indexOf != -1) {
                    str = str.substring(0, indexOf);
                } else {
                    int indexOf2 = str.indexOf("#");
                    if (indexOf2 != -1) {
                        str = str.substring(0, indexOf2);
                    }
                }
                return str;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        try {
            d = Utils.getMainProcessName(b);
            String processName = Utils.getProcessName(b, Process.myPid());
            if (!TextUtils.isEmpty(d) && !TextUtils.isEmpty(processName)) {
                return processName.equalsIgnoreCase(d);
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : GlobalAppRuntimeInfo.getCurrentProcess().contains(":channel");
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        if (TextUtils.isEmpty(d)) {
            d = Utils.getMainProcessName(b);
        }
        return d;
    }

    public static Context e() {
        if (b != null) {
            return b;
        }
        Context context = GlobalAppRuntimeInfo.getContext();
        b = context;
        if (context == null) {
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                b = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return b;
    }
}
