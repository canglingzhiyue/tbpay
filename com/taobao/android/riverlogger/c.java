package com.taobao.android.riverlogger;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.TTraceLog;
import tb.kge;

/* loaded from: classes.dex */
public class c implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c instance;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f14900a;
    private final boolean b;
    private RVLLevel d = RVLLevel.Info;

    /* renamed from: com.taobao.android.riverlogger.c$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14901a = new int[RVLLevel.values().length];

        static {
            try {
                f14901a[RVLLevel.Error.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14901a[RVLLevel.Warn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14901a[RVLLevel.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14901a[RVLLevel.Debug.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        kge.a(-483792827);
        kge.a(-1791990569);
        instance = new c();
    }

    public c() {
        boolean z = false;
        try {
            if (TTraceLog.class.getMethod("event", LogLevel.class, String.class, String.class, String.class, String.class, Long.TYPE, String.class, String.class, String.class, Integer.TYPE, String.class, String.class) != null) {
                z = true;
            }
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.f14900a = z;
        this.b = true;
    }

    @Override // com.taobao.android.riverlogger.f
    public RVLLevel a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RVLLevel) ipChange.ipc$dispatch("bc18a397", new Object[]{this}) : this.d;
    }

    public void a(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64defcd7", new Object[]{this, rVLLevel});
            return;
        }
        this.d = rVLLevel;
        e.b();
    }

    @Override // com.taobao.android.riverlogger.f
    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f250d9", new Object[]{this, dVar});
        } else if (dVar.f14902a.value > this.d.value && !com.taobao.android.riverlogger.internal.b.a()) {
        } else {
            if (this.f14900a && !StringUtils.isEmpty(dVar.e)) {
                TTraceLog.event(b(dVar.f14902a), dVar.c, dVar.d, dVar.b, dVar.b, dVar.h, dVar.e, dVar.f, dVar.g, 0, com.taobao.android.riverlogger.inspector.g.RVLModuleName, dVar.i);
            } else if (this.b) {
                int i = AnonymousClass1.f14901a[dVar.f14902a.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    TLog.loge(dVar.b, dVar.b, dVar.a());
                } else if (i == 4) {
                    TLog.logd(dVar.b, dVar.b, dVar.a());
                } else {
                    TLog.logv(dVar.b, dVar.b, dVar.a());
                }
            } else if (!com.taobao.android.riverlogger.internal.b.a()) {
            } else {
                int i2 = AnonymousClass1.f14901a[dVar.f14902a.ordinal()];
                if (i2 == 1) {
                    Log.e(dVar.b, dVar.a());
                } else if (i2 == 2) {
                    dVar.a();
                } else if (i2 == 3) {
                    dVar.a();
                } else if (i2 == 4) {
                    dVar.a();
                } else {
                    dVar.a();
                }
            }
        }
    }

    private LogLevel b(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogLevel) ipChange.ipc$dispatch("ee914f5c", new Object[]{this, rVLLevel});
        }
        int i = AnonymousClass1.f14901a[rVLLevel.ordinal()];
        if (i == 1) {
            return LogLevel.E;
        }
        if (i == 2) {
            return LogLevel.W;
        }
        if (i == 3) {
            return LogLevel.I;
        }
        if (i == 4) {
            return LogLevel.D;
        }
        return LogLevel.V;
    }
}
