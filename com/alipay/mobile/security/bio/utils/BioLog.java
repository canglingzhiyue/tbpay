package com.alipay.mobile.security.bio.utils;

import android.util.Log;
import com.alipay.mobile.security.bio.config.Constant;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class BioLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIAGNOSE = "diagnose";

    /* renamed from: a  reason: collision with root package name */
    private static Logger f5823a = new AndroidLogger();

    /* loaded from: classes3.dex */
    public static final class AndroidLogger extends Logger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private AndroidLogger() {
        }

        @Override // com.alipay.mobile.security.bio.utils.Logger
        public int verbose(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("921d9190", new Object[]{this, str, str2})).intValue() : Log.v(str, str2);
        }

        @Override // com.alipay.mobile.security.bio.utils.Logger
        public int debug(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9757c961", new Object[]{this, str, str2})).intValue() : Log.d(str, str2);
        }

        @Override // com.alipay.mobile.security.bio.utils.Logger
        public int info(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f161e0bc", new Object[]{this, str, str2})).intValue() : Log.i(str, str2);
        }

        @Override // com.alipay.mobile.security.bio.utils.Logger
        public int warn(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c21b5694", new Object[]{this, str, str2})).intValue() : Log.w(str, str2);
        }

        @Override // com.alipay.mobile.security.bio.utils.Logger
        public int error(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a936c16", new Object[]{this, str, str2})).intValue() : Log.e(str, str2);
        }

        @Override // com.alipay.mobile.security.bio.utils.Logger
        public String a(Throwable th) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th}) : Log.getStackTraceString(th);
        }
    }

    private BioLog() {
    }

    public static void setLogger(Logger logger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d028213a", new Object[]{logger});
        } else {
            f5823a = logger;
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7de87", new Object[]{str});
        } else {
            f5823a.v(Constant.DEBUG_LOG_TAG, str);
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
            return;
        }
        Logger logger = f5823a;
        logger.v("BIOLOGY_" + str, str2);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            f5823a.d(Constant.DEBUG_LOG_TAG, str);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        Logger logger = f5823a;
        logger.d("BIOLOGY_" + str, str2);
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            f5823a.i(Constant.DEBUG_LOG_TAG, str);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        Logger logger = f5823a;
        logger.i("BIOLOGY_" + str, str2);
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        } else {
            f5823a.w(Constant.DEBUG_LOG_TAG, str);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        Logger logger = f5823a;
        logger.w("BIOLOGY_" + str, str2);
    }

    public static void w(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2447fd37", new Object[]{th});
        } else {
            f5823a.w(Constant.DEBUG_LOG_TAG, th);
        }
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
            return;
        }
        Logger logger = f5823a;
        logger.w("BIOLOGY_" + str, th);
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
            return;
        }
        Logger logger = f5823a;
        logger.w("BIOLOGY_" + str, str2, th);
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            f5823a.e(Constant.DEBUG_LOG_TAG, str);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        Logger logger = f5823a;
        logger.e("BIOLOGY_" + str, str2);
    }

    public static void e(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3002509", new Object[]{th});
        } else {
            f5823a.e(Constant.DEBUG_LOG_TAG, th);
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        Logger logger = f5823a;
        logger.e("BIOLOGY_" + str, th);
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        Logger logger = f5823a;
        logger.e("BIOLOGY_" + str, str2, th);
    }
}
