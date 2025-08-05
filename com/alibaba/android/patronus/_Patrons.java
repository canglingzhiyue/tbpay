package com.alibaba.android.patronus;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.alibaba.android.patronus.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import tb.riy;

/* loaded from: classes2.dex */
public class _Patrons {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "Patrons";
    private static boolean d;
    private static long e;

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f2404a = Pattern.compile("[^0-9]");
    private static b.a b = new b.a();
    private static Timer c = null;
    private static final AtomicInteger f = new AtomicInteger(0);
    private static volatile boolean g = false;
    private static volatile boolean h = false;

    /* loaded from: classes2.dex */
    public static class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
            if (_Patrons.f().get() != 0 && _Patrons.f().addAndGet(1) > 5) {
                _Patrons.f().set(0);
                Log.e(_Patrons.TAG, "exit strict mode after check 5 times");
                _Patrons.b(_Patrons.g().e);
            }
            long b = _Patrons.b();
            float f = ((float) b) / 4.2949673E9f;
            if (_Patrons.h() - _Patrons.g().d < _Patrons.g().f) {
                Log.e(_Patrons.TAG, "vss has no space to resize, stop watching. current space = " + _Patrons.h());
                _Patrons.i();
            } else if (f <= _Patrons.g().c) {
                if (_Patrons.getCurrentRegionSpaceSize() / 1048576 < _Patrons.g().f) {
                    Log.e(_Patrons.TAG, "current heap size (" + (_Patrons.getCurrentRegionSpaceSize() / 1048576) + ") less than lower limit (" + _Patrons.g().f + ") stop watching.");
                    _Patrons.i();
                    return;
                }
                Log.e(_Patrons.TAG, riy.ARRAY_START_STR + _Patrons.f().get() + "] every thing is OK, vss = " + (b / 1048576) + " mb, current period = " + f + ", heap = " + (_Patrons.getCurrentRegionSpaceSize() / 1048576) + " mb");
            } else {
                Log.e(_Patrons.TAG, "vss has over the period, current vss = " + (b / 1048576) + "mb, period = " + f);
                if (!_Patrons.shrinkRegionSpace((int) _Patrons.a(_Patrons.h() - _Patrons.g().d))) {
                    Log.e(_Patrons.TAG, "vss resize failed, stop watching.");
                    _Patrons.i();
                    return;
                }
                if (Build.VERSION.SDK_INT <= 25) {
                    _Patrons.a(_Patrons.getCurrentRegionSpaceSize());
                }
                long b2 = _Patrons.b();
                crashCaughtHeader.addHeaderInfo("patrons resizeResult", String.valueOf(b2));
                Log.e(_Patrons.TAG, "resize success, step = " + _Patrons.g().d + "mb, current vss = " + (b2 / 1048576) + "mb");
                Log.e(_Patrons.TAG, "enter strict mode after resize");
                _Patrons.f().set(1);
                _Patrons.b(_Patrons.g().e / 2);
            }
        }
    }

    private static native int __init(boolean z, boolean z2, boolean z3);

    public static native int deleteWebViewReservation();

    public static native String dumpLogs();

    public static native long getCurrentRegionSpaceSize();

    public static native boolean resetThreadSize(int i);

    private static native int reuseApkMap();

    public static native boolean shrinkRegionSpace(int i);

    private static native int shrinkTTF(int i, int[] iArr);

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue();
        }
        e = j;
        return j;
    }

    public static /* synthetic */ void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            b(str, str2);
        }
    }

    public static /* synthetic */ void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
        } else {
            c(i);
        }
    }

    public static /* synthetic */ AtomicInteger f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicInteger) ipChange.ipc$dispatch("3fbd2c97", new Object[0]) : f;
    }

    public static /* synthetic */ b.a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b.a) ipChange.ipc$dispatch("ad456f3a", new Object[0]) : b;
    }

    public static /* synthetic */ long h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e3", new Object[0])).longValue() : e;
    }

    public static /* synthetic */ void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
        } else {
            j();
        }
    }

    static {
        d = false;
        if (Build.VERSION.SDK_INT <= 34) {
            try {
                System.loadLibrary("patrons");
                d = true;
            } catch (Throwable th) {
                Log.e(TAG, "e", th);
            }
        }
    }

    public static synchronized int a(Context context, b.a aVar) {
        synchronized (_Patrons.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d3c0b865", new Object[]{context, aVar})).intValue();
            }
            if (aVar != null) {
                b = aVar;
            }
            String str = "Patrons start init, config = " + b.toString();
            int a2 = a();
            if (b.h) {
                a(context, a2);
            }
            return a2;
        }
    }

    public static synchronized int a() {
        synchronized (_Patrons.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
            } else if (!k()) {
                return 2001;
            } else {
                int __init = __init(true, b.f2407a, b.g);
                if (__init != 0) {
                    Log.e(TAG, "Patrons native init failed !");
                    return __init;
                }
                long currentRegionSpaceSize = getCurrentRegionSpaceSize() / 1048576;
                e = currentRegionSpaceSize;
                if (currentRegionSpaceSize > 0 && e <= 1024) {
                    if (e < b.f) {
                        return 2003;
                    }
                    if (b.b) {
                        if (b() < 0) {
                            Log.e(TAG, "Patrons read vss failed !");
                            return 1001;
                        }
                        d();
                    }
                    String str = "Patrons init finish, vss = " + (b() / 1048576) + " mb, heap = " + e + " mb";
                    return 0;
                }
                return 2002;
            }
        }
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        long j = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String lowerCase = readLine.toLowerCase();
                if (lowerCase.contains("vmsize")) {
                    j = Integer.parseInt(f2404a.matcher(lowerCase).replaceAll("").trim()) << 10;
                    break;
                }
            }
            fileInputStream.close();
            bufferedReader.close();
        } catch (Exception unused) {
            Log.e(TAG, "read current status failed.");
        }
        return j;
    }

    public static void c() {
        Timer timer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (!b.b || (timer = c) == null) {
        } else {
            timer.cancel();
            c = null;
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[0]);
            return;
        }
        Log.e(TAG, "toForeground");
        f.set(0);
        c(b.e);
    }

    private static void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{new Integer(i)});
        } else if (!b.b) {
        } else {
            Log.e(TAG, "_start");
            Timer timer = c;
            if (timer != null) {
                timer.cancel();
                c = null;
            }
            Timer timer2 = new Timer(TAG);
            timer2.schedule(new a(), 0L, i * 1000);
            c = timer2;
        }
    }

    public static int a(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c198169", new Object[]{iArr})).intValue();
        }
        if (!d || g) {
            return 0;
        }
        g = true;
        return shrinkTTF(Build.VERSION.SDK_INT, iArr);
    }

    public static int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[0])).intValue();
        }
        if (!d || h) {
            return 0;
        }
        h = true;
        return reuseApkMap();
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i >= 1024 && i <= 1048576) {
            return resetThreadSize(i);
        }
        return false;
    }

    private static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[0]);
            return;
        }
        c();
        b.b = false;
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[0]) : d ? dumpLogs() : "can not dump logs without native libs";
    }

    private static boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[0])).booleanValue() : Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT <= 30;
    }

    private static void a(final Context context, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258f9aa3", new Object[]{context, new Integer(i)});
        } else {
            new Thread(new Runnable() { // from class: com.alibaba.android.patronus._Patrons.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String str = context.getDir("patrons", 0).getAbsolutePath() + File.separator;
                        _Patrons.a(String.valueOf(i), str + "code.txt");
                        if (i == 0) {
                            return;
                        }
                        _Patrons.a(_Patrons.e(), str + "msg.txt");
                    } catch (Exception e2) {
                        Log.e(_Patrons.TAG, "record init result failed, code = " + i, e2);
                    }
                }
            }, "patrons").start();
        }
    }

    private static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
            fileOutputStream.write((str + "\n\n").getBytes());
            fileOutputStream.close();
        } catch (Exception e2) {
            Log.e(TAG, "write content to file: " + str2 + " failed.", e2);
        }
    }
}
