package com.taobao.android.tbuprofen.common;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import tb.kge;

/* loaded from: classes.dex */
public class f implements com.taobao.android.tbuprofen.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final TBPLogLevel f15486a;

    /* renamed from: com.taobao.android.tbuprofen.common.f$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15487a = new int[TBPLogLevel.values().length];

        static {
            try {
                f15487a[TBPLogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15487a[TBPLogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15487a[TBPLogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15487a[TBPLogLevel.WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15487a[TBPLogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        kge.a(-952953941);
        kge.a(1899958528);
    }

    public f() {
        this(TBPLogLevel.INFO);
    }

    public f(TBPLogLevel tBPLogLevel) {
        this.f15486a = tBPLogLevel;
        a(tBPLogLevel);
    }

    private static String a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee72cc1", new Object[]{str, objArr}) : StringUtils.isEmpty(str) ? "" : String.format(str, objArr);
    }

    @Override // com.taobao.android.tbuprofen.d
    public void a(String str, Throwable th, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee268404", new Object[]{this, str, th, str2, objArr});
        } else {
            TLog.loge("TBUPROF", str, a(str2, objArr), th);
        }
    }

    @Override // com.taobao.android.tbuprofen.d
    public void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5cd3435", new Object[]{this, str, str2, objArr});
        } else {
            TLog.loge("TBUPROF", str, a(str2, objArr));
        }
    }

    @Override // com.taobao.android.tbuprofen.d
    public void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd0ff94", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logw("TBUPROF", str, a(str2, objArr));
        }
    }

    @Override // com.taobao.android.tbuprofen.d
    public void c(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4caf3", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logi("TBUPROF", str, a(str2, objArr));
        }
    }

    @Override // com.taobao.android.tbuprofen.d
    public void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logd("TBUPROF", str, a(str2, objArr));
        }
    }

    @Override // com.taobao.android.tbuprofen.d
    public void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{this, str, str2, objArr});
        } else {
            TLog.logv("TBUPROF", str, a(str2, objArr));
        }
    }

    public void a(TBPLogLevel tBPLogLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ed6739", new Object[]{this, tBPLogLevel});
            return;
        }
        LogLevel logLevel = LogLevel.E;
        int i = AnonymousClass1.f15487a[tBPLogLevel.ordinal()];
        if (i == 1) {
            logLevel = LogLevel.V;
        } else if (i == 2) {
            logLevel = LogLevel.D;
        } else if (i == 3) {
            logLevel = LogLevel.I;
        } else if (i == 4) {
            logLevel = LogLevel.W;
        } else if (i == 5) {
            logLevel = LogLevel.E;
        }
        com.taobao.tao.log.e.a().a("TBUPROF", logLevel);
    }

    @Override // com.taobao.android.tbuprofen.d
    public TBPLogLevel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPLogLevel) ipChange.ipc$dispatch("2e0d8b7f", new Object[]{this}) : this.f15486a;
    }
}
