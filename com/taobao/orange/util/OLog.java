package com.taobao.orange.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OConstant;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes.dex */
public class OLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean isUseTlog;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int D = 1;
        public static final int E = 4;
        public static final int I = 2;
        public static final int L = 5;
        public static final int V = 0;
        public static final int W = 3;

        static {
            kge.a(1956517556);
        }

        public static int a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
            }
            char charAt = str.charAt(0);
            if (charAt == 'D') {
                return 1;
            }
            if (charAt == 'E') {
                return 4;
            }
            if (charAt == 'I') {
                return 2;
            }
            if (charAt == 'V') {
                return 0;
            }
            return charAt != 'W' ? 5 : 3;
        }
    }

    @Deprecated
    public static void setPrintLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80ec2f4", new Object[]{new Boolean(z)});
        }
    }

    @Deprecated
    public static void setUseTlog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac80298", new Object[]{new Boolean(z)});
        }
    }

    static {
        kge.a(202947572);
        isUseTlog = false;
        try {
            Class.forName(OConstant.REFLECT_TLOG);
            isUseTlog = true;
        } catch (ClassNotFoundException unused) {
            isUseTlog = false;
        }
    }

    public static boolean isPrintLog(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f917b75f", new Object[]{new Integer(i)})).booleanValue() : !isUseTlog || i >= a.a(AdapterForTLog.getLogLevel());
    }

    public static void v(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741ce300", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(0)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.logv(a(str), a(str2, objArr));
                return;
            }
            a(str);
            a(str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(1)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.logd(a(str), a(str2, objArr));
                return;
            }
            a(str);
            a(str2, objArr);
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(2)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.logi(a(str), a(str2, objArr));
                return;
            }
            a(str);
            a(str2, objArr);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(3)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.logw(a(str), a(str2, objArr));
                return;
            }
            a(str);
            a(str2, objArr);
        }
    }

    public static void w(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5e26ae", new Object[]{str, str2, th, objArr});
        } else if (!isPrintLog(3)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.logw(a(str), a(str2, objArr), th);
                return;
            }
            a(str);
            a(str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else if (!isPrintLog(4)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.loge(a(str), a(str2, objArr));
            } else {
                Log.e(a(str), a(str2, objArr));
            }
        }
    }

    public static void e(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d61a9c", new Object[]{str, str2, th, objArr});
        } else if (!isPrintLog(4)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.loge(a(str), a(str2, objArr), th);
            } else {
                Log.e(a(str), a(str2, objArr), th);
            }
        }
    }

    private static String a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("144cdf80", new Object[]{obj, obj2});
        }
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        return "NOrange." + str;
    }

    private static String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(a(objArr[i], objArr[i2]));
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }
}
