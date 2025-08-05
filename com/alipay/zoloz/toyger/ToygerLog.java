package com.alipay.zoloz.toyger;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ToygerLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIAGNOSE = "diagnose";

    /* renamed from: a  reason: collision with root package name */
    private static ToygerLogger f6265a = new AndroidLogger();

    /* loaded from: classes3.dex */
    public static final class AndroidLogger extends ToygerLogger {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private AndroidLogger() {
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int verbose(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("921d9190", new Object[]{this, str, str2})).intValue() : Log.v(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int debug(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9757c961", new Object[]{this, str, str2})).intValue() : Log.d(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int info(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f161e0bc", new Object[]{this, str, str2})).intValue() : Log.i(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int warn(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c21b5694", new Object[]{this, str, str2})).intValue() : Log.w(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public int error(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4a936c16", new Object[]{this, str, str2})).intValue() : Log.e(str, str2);
        }

        @Override // com.alipay.zoloz.toyger.ToygerLogger
        public String a(Throwable th) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th}) : Log.getStackTraceString(th);
        }
    }

    private ToygerLog() {
    }

    public static void setLogger(ToygerLogger toygerLogger) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d8ac6d", new Object[]{toygerLogger});
        } else {
            f6265a = toygerLogger;
        }
    }

    public static void v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7de87", new Object[]{str});
        } else {
            f6265a.v("Toyger", str);
        }
    }

    public static void v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.v("Toyger_" + str, str2);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{str});
        } else {
            f6265a.d("Toyger", str);
        }
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.d("Toyger_" + str, str2);
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{str});
        } else {
            f6265a.i("Toyger", str);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.i("Toyger_" + str, str2);
    }

    public static void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53e977c8", new Object[]{str});
        } else {
            f6265a.w("Toyger", str);
        }
    }

    public static void w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.w("Toyger_" + str, str2);
    }

    public static void w(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2447fd37", new Object[]{th});
        } else {
            f6265a.w("Toyger", th);
        }
    }

    public static void w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be68a92d", new Object[]{str, th});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.w("Toyger_" + str, th);
    }

    public static void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{str, str2, th});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.w("Toyger_" + str, str2, th);
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
        } else {
            f6265a.e("Toyger", str);
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.e("Toyger_" + str, str2);
    }

    public static void e(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3002509", new Object[]{th});
        } else {
            f6265a.e("Toyger", th);
        }
    }

    public static void e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9407f", new Object[]{str, th});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.e("Toyger_" + str, th);
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        ToygerLogger toygerLogger = f6265a;
        toygerLogger.e("Toyger_" + str, str2, th);
    }
}
