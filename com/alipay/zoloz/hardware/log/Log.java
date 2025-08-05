package com.alipay.zoloz.hardware.log;

import com.android.alibaba.ip.runtime.IpChange;
import tb.riy;

/* loaded from: classes3.dex */
public final class Log {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIRM = "confirm";
    public static final String DIAGNOSE = "diagnose";

    /* renamed from: a  reason: collision with root package name */
    private static Logger f6254a = new AndroidLogger();

    /* loaded from: classes3.dex */
    public static final class AndroidLogger extends Logger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private AndroidLogger() {
        }

        @Override // com.alipay.zoloz.hardware.log.Logger
        public int verbose(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("921d9190", new Object[]{this, str, str2})).intValue();
            }
            return android.util.Log.v(str, riy.ARRAY_START_STR + Thread.currentThread().getName() + riy.ARRAY_END_STR + str2);
        }

        @Override // com.alipay.zoloz.hardware.log.Logger
        public int debug(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9757c961", new Object[]{this, str, str2})).intValue();
            }
            return android.util.Log.d(str, riy.ARRAY_START_STR + Thread.currentThread().getName() + riy.ARRAY_END_STR + str2);
        }

        @Override // com.alipay.zoloz.hardware.log.Logger
        public int info(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f161e0bc", new Object[]{this, str, str2})).intValue();
            }
            return android.util.Log.i(str, riy.ARRAY_START_STR + Thread.currentThread().getName() + riy.ARRAY_END_STR + str2);
        }

        @Override // com.alipay.zoloz.hardware.log.Logger
        public int warn(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c21b5694", new Object[]{this, str, str2})).intValue();
            }
            return android.util.Log.w(str, riy.ARRAY_START_STR + Thread.currentThread().getName() + riy.ARRAY_END_STR + str2);
        }

        @Override // com.alipay.zoloz.hardware.log.Logger
        public int error(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a936c16", new Object[]{this, str, str2})).intValue();
            }
            return android.util.Log.e(str, riy.ARRAY_START_STR + Thread.currentThread().getName() + riy.ARRAY_END_STR + str2);
        }

        @Override // com.alipay.zoloz.hardware.log.Logger
        public String a(Throwable th) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th}) : android.util.Log.getStackTraceString(th);
        }
    }

    private Log() {
    }

    public static void setLogLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addbd37a", new Object[]{new Integer(i)});
            return;
        }
        Logger logger = f6254a;
        if (logger == null) {
            return;
        }
        logger.setLogLevel(i);
    }

    public static void setLogger(Logger logger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6587feea", new Object[]{logger});
        } else {
            f6254a = logger;
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7de87", new Object[]{str});
        } else {
            f6254a.v("HD", str);
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
            return;
        }
        Logger logger = f6254a;
        logger.v("HD_" + str, str2);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            f6254a.d("HD", str);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        Logger logger = f6254a;
        logger.d("HD_" + str, str2);
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            f6254a.i("HD", str);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        Logger logger = f6254a;
        logger.i("HD_" + str, str2);
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        } else {
            f6254a.w("HD", str);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        Logger logger = f6254a;
        logger.w("HD_" + str, str2);
    }

    public static void w(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2447fd37", new Object[]{th});
        } else {
            f6254a.w("HD", th);
        }
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
            return;
        }
        Logger logger = f6254a;
        logger.w("HD_" + str, th);
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
            return;
        }
        Logger logger = f6254a;
        logger.w("HD_" + str, str2, th);
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            f6254a.e("HD", str);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        Logger logger = f6254a;
        logger.e("HD_" + str, str2);
    }

    public static void e(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3002509", new Object[]{th});
        } else {
            f6254a.e("HD", th);
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        Logger logger = f6254a;
        logger.e("HD_" + str, th);
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        Logger logger = f6254a;
        logger.e("HD_" + str, str2, th);
    }
}
