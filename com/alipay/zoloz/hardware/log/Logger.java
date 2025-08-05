package com.alipay.zoloz.hardware.log;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class Logger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    /* renamed from: a  reason: collision with root package name */
    private int f6255a = 2;

    public abstract String a(Throwable th);

    public abstract int debug(String str, String str2);

    public abstract int error(String str, String str2);

    public abstract int info(String str, String str2);

    public abstract int verbose(String str, String str2);

    public abstract int warn(String str, String str2);

    public void setLogLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addbd37a", new Object[]{this, new Integer(i)});
        } else if (i >= 2 && i <= 7) {
            this.f6255a = i;
        } else {
            throw new RuntimeException("The level value should between [2 , 7]");
        }
    }

    public int v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("625b1484", new Object[]{this, str, str2})).intValue();
        }
        if (this.f6255a > 2) {
            return -1;
        }
        return verbose(str, str2);
    }

    public int v(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed5013f7", new Object[]{this, str, str2, th})).intValue();
        }
        if (this.f6255a > 2) {
            return -1;
        }
        return verbose(str, str2 + '\n' + a(th));
    }

    public int v(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fb7c3fc1", new Object[]{this, str, th})).intValue();
        }
        if (this.f6255a > 2) {
            return -1;
        }
        return verbose(str, a(th));
    }

    public int d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f180e72", new Object[]{this, str, str2})).intValue();
        }
        if (this.f6255a > 3) {
            return -1;
        }
        return debug(str, str2);
    }

    public int d(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80ec3ac9", new Object[]{this, str, str2, th})).intValue();
        }
        if (this.f6255a > 3) {
            return -1;
        }
        return debug(str, str2 + '\n' + a(th));
    }

    public int d(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46dcd713", new Object[]{this, str, th})).intValue();
        }
        if (this.f6255a > 3) {
            return -1;
        }
        return debug(str, a(th));
    }

    public int i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e38e577", new Object[]{this, str, str2})).intValue();
        }
        if (this.f6255a > 4) {
            return -1;
        }
        return info(str, str2);
    }

    public int i(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("662468e4", new Object[]{this, str, str2, th})).intValue();
        }
        if (this.f6255a > 4) {
            return -1;
        }
        return info(str, str2 + '\n' + a(th));
    }

    public int i(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("157ae5ee", new Object[]{this, str, th})).intValue();
        }
        if (this.f6255a > 4) {
            return -1;
        }
        return info(str, a(th));
    }

    public int w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eefb3f85", new Object[]{this, str, str2})).intValue();
        }
        if (this.f6255a > 5) {
            return -1;
        }
        return warn(str, str2);
    }

    public int w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("818e8396", new Object[]{this, str, str2, th})).intValue();
        }
        if (this.f6255a > 5) {
            return -1;
        }
        return warn(str, str2 + '\n' + a(th));
    }

    public int w(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be68a920", new Object[]{this, str, th})).intValue();
        }
        if (this.f6255a > 5) {
            return -1;
        }
        return warn(str, a(th));
    }

    public int e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb83973", new Object[]{this, str, str2})).intValue();
        }
        if (this.f6255a > 6) {
            return -1;
        }
        return error(str, str2);
    }

    public int e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("152aaa68", new Object[]{this, str, str2, th})).intValue();
        }
        if (this.f6255a > 6) {
            return -1;
        }
        return error(str, str2 + '\n' + a(th));
    }

    public int e(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c94072", new Object[]{this, str, th})).intValue();
        }
        if (this.f6255a > 6) {
            return -1;
        }
        return error(str, a(th));
    }
}
