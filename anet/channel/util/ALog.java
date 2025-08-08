package anet.channel.util;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class ALog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Object LOG_BREAK;
    private static boolean canUseTlog;
    private static boolean isPrintLog;
    private static volatile ILog log;
    public static Logcat logcat;

    /* loaded from: classes.dex */
    public interface ILog {
        void d(String str, String str2);

        void e(String str, String str2);

        void e(String str, String str2, Throwable th);

        void i(String str, String str2);

        boolean isPrintLog(int i);

        boolean isValid();

        void setLogLevel(int i);

        void w(String str, String str2);

        void w(String str, String str2, Throwable th);
    }

    /* loaded from: classes2.dex */
    public static class Level {
        public static final int D = 1;
        public static final int E = 4;
        public static final int I = 2;
        public static final int N = 5;
        public static final int V = 0;
        public static final int W = 3;

        static {
            kge.a(983892593);
        }
    }

    private static String buildLogTag(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("774883eb", new Object[]{str}) : str;
    }

    @Deprecated
    public static void setUseTlog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac80298", new Object[]{new Boolean(z)});
        }
    }

    /* loaded from: classes.dex */
    public static class Logcat implements ILog {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int defaultLevel = 1;

        static {
            kge.a(444685509);
            kge.a(-245469810);
        }

        @Override // anet.channel.util.ALog.ILog
        public void d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f180e7f", new Object[]{this, str, str2});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void i(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e38e584", new Object[]{this, str, str2});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isValid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // anet.channel.util.ALog.ILog
        public void w(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eefb3f92", new Object[]{this, str, str2});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void w(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void e(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            } else {
                Log.e(str, str2);
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public void e(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
            } else {
                Log.e(str, str2, th);
            }
        }

        @Override // anet.channel.util.ALog.ILog
        public boolean isPrintLog(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f917b75f", new Object[]{this, new Integer(i)})).booleanValue() : i >= this.defaultLevel;
        }

        @Override // anet.channel.util.ALog.ILog
        public void setLogLevel(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("addbd37a", new Object[]{this, new Integer(i)});
            } else if (i < 0 || i > 5) {
                this.defaultLevel = 5;
            } else {
                this.defaultLevel = i;
            }
        }
    }

    static {
        kge.a(1840675185);
        Logcat logcat2 = new Logcat();
        logcat = logcat2;
        log = logcat2;
        LOG_BREAK = "|";
        isPrintLog = true;
        canUseTlog = true;
    }

    public static void setLog(ILog iLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b3958a", new Object[]{iLog});
        } else if (iLog == null) {
        } else {
            if ((!canUseTlog && iLog.getClass().getSimpleName().toLowerCase().contains("tlog")) || !iLog.isValid()) {
                return;
            }
            log = iLog;
        }
    }

    public static ILog getLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ILog) ipChange.ipc$dispatch("97ddf778", new Object[0]) : log;
    }

    public static void setPrintLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80ec2f4", new Object[]{new Boolean(z)});
        } else {
            isPrintLog = z;
        }
    }

    public static void setLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e77c5a", new Object[]{new Integer(i)});
        } else if (log == null) {
        } else {
            log.setLogLevel(i);
        }
    }

    public static boolean isPrintLog(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f917b75f", new Object[]{new Integer(i)})).booleanValue();
        }
        if (!isPrintLog || log == null) {
            return false;
        }
        return log.isPrintLog(i);
    }

    public static void d(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85ce08", new Object[]{str, str2, str3, objArr});
        } else if (!isPrintLog(1) || log == null) {
        } else {
            log.d(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void i(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8c6623", new Object[]{str, str2, str3, objArr});
        } else if (!isPrintLog(2) || log == null) {
        } else {
            log.i(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void w(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289edcd5", new Object[]{str, str2, str3, objArr});
        } else if (!isPrintLog(3) || log == null) {
        } else {
            log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void w(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ccbdf8", new Object[]{str, str2, str3, th, objArr});
        } else if (!isPrintLog(3) || log == null) {
        } else {
            log.w(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }

    public static void e(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66871fa7", new Object[]{str, str2, str3, objArr});
        } else if (!isPrintLog(4) || log == null) {
        } else {
            log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr));
        }
    }

    public static void e(String str, String str2, String str3, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb4d266", new Object[]{str, str2, str3, th, objArr});
        } else if (!isPrintLog(4) || log == null) {
        } else {
            log.e(buildLogTag(str), buildLogMsg(str2, str3, objArr), th);
        }
    }

    private static String buildLogMsg(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f9d5f55", new Object[]{str, str2, objArr});
        }
        if (str == null && str2 == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(64);
        if (!StringUtils.isEmpty(str2)) {
            sb.append(LOG_BREAK);
            sb.append("[seq:");
            sb.append(str2);
            sb.append(riy.ARRAY_END_STR);
        }
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
                sb.append(objArr[i] != null ? objArr[i] : "");
                sb.append(":");
                sb.append(objArr[i2] != null ? objArr[i2] : "");
                i += 2;
            }
            if (i < objArr.length) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }
}
