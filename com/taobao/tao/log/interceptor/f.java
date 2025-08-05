package com.taobao.tao.log.interceptor;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.interceptor.b;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes8.dex */
public class f implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f20696a;
    private final b b;
    private RealTimeLogConfig c;
    private final AtomicInteger d = new AtomicInteger(0);

    static {
        kge.a(-1974336849);
        kge.a(-688827008);
    }

    /* renamed from: lambda$-Ij-W_nqDN1y7CL2mbhcETd2L64 */
    public static /* synthetic */ void m1272lambda$IjW_nqDN1y7CL2mbhcETd2L64(f fVar, int i, String str) {
        fVar.a(i, str);
    }

    public f(Context context, RealTimeLogConfig realTimeLogConfig, b bVar) {
        this.f20696a = context;
        this.b = bVar;
        this.c = realTimeLogConfig;
    }

    public void a(RealTimeLogConfig realTimeLogConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b5cdd1", new Object[]{this, realTimeLogConfig});
            return;
        }
        this.c = realTimeLogConfig;
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(realTimeLogConfig);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a(this.f20696a, this.c, new b.a() { // from class: com.taobao.tao.log.interceptor.-$$Lambda$f$-Ij-W_nqDN1y7CL2mbhcETd2L64
            @Override // com.taobao.tao.log.interceptor.b.a
            public final void onUploadStop(int i, String str) {
                f.m1272lambda$IjW_nqDN1y7CL2mbhcETd2L64(f.this, i, str);
            }
        });
        g.a(this.f20696a, this);
    }

    public /* synthetic */ void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        String.format("onUploadStop! reason: %d, errCode: %s", Integer.valueOf(i), str);
        d.a(this.f20696a, i);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        g.a(this);
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    @Override // com.taobao.tao.log.interceptor.c
    public void a(long j, long j2, long j3, LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd0bd90", new Object[]{this, new Long(j), new Long(j2), new Long(j3), logLevel, logCategory, str, str2, str3});
        } else if (!a(logCategory, logLevel, str, str2)) {
        } else {
            this.b.a(b(j, j2, j3, logLevel, logCategory, str, str2, str3));
        }
    }

    private boolean a(LogCategory logCategory, LogLevel logLevel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86e8688e", new Object[]{this, logCategory, logLevel, str, str2})).booleanValue();
        }
        RealTimeLogConfig realTimeLogConfig = this.c;
        if (realTimeLogConfig == null || (realTimeLogConfig.expireTime != -1 && this.c.expireTime < System.currentTimeMillis())) {
            d.a(this.f20696a, 6);
            return false;
        } else if (this.b == null || !this.c.enable) {
            return false;
        } else {
            if (logCategory == LogCategory.CodeLog && logLevel.ordinal() < this.c.level) {
                return false;
            }
            if (this.c.moduleList != null && !this.c.moduleList.contains(str)) {
                return false;
            }
            return this.c.tagList == null || this.c.tagList.contains(str2);
        }
    }

    private String b(long j, long j2, long j3, LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("47a6be6f", new Object[]{this, new Long(j), new Long(j2), new Long(j3), logLevel, logCategory, str, str2, str3}) : String.format("%s%s%d%s%s%s%d%s%d%s%d%s%s%s%s%s%s%s", logLevel.getName(), "\u0001", Long.valueOf(j), "\u0001", logCategory.getName(), "\u0001", Integer.valueOf(this.d.incrementAndGet()), "\u0001", Long.valueOf(j2), "\u0001", Long.valueOf(j3), "\u0001", str, "\u0001", str2, "\u0001", str3, "\u0003");
    }
}
