package com.alibaba.aliweex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import tb.aks;
import tb.kge;

/* loaded from: classes2.dex */
public class MemoryMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static MemoryStatus f2026a;
    private static MemoryStatus b;
    private static String c;
    private static String d;
    private static boolean f;

    /* loaded from: classes2.dex */
    enum MemoryStatus {
        NORMAL("good"),
        HIGH("normal"),
        DANGEROUS("dangerous"),
        CRITICAL("fatal");
        
        String status;

        MemoryStatus(String str) {
            this.status = str;
        }

        boolean dangerous() {
            return equals(DANGEROUS);
        }

        boolean fatal() {
            return equals(CRITICAL);
        }

        boolean good() {
            return equals(NORMAL);
        }

        boolean normal() {
            return equals(HIGH);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        }
    }

    static {
        kge.a(-564250902);
        f2026a = MemoryStatus.NORMAL;
        b = MemoryStatus.NORMAL;
        c = "MemoryMonitor";
        d = MemoryStatus.NORMAL.status;
        f = true;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if (f2026a.good() && b.good()) {
            return MemoryStatus.NORMAL.status;
        }
        if (f2026a.fatal() || b.fatal()) {
            return MemoryStatus.CRITICAL.status;
        }
        if (f2026a.dangerous() || b.dangerous()) {
            return MemoryStatus.DANGEROUS.status;
        }
        if (f2026a.normal() || b.normal()) {
            return MemoryStatus.HIGH.status;
        }
        return MemoryStatus.NORMAL.status;
    }

    public static String c() {
        aks.d g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (!f) {
            return "unknown";
        }
        try {
            aks a2 = aks.a();
            if (a2 == null || (g = a2.g()) == null) {
                return "unknown";
            }
            int i = g.f25407a;
            return i != -1 ? i != 0 ? i != 2 ? "medium" : "low_end" : "high_end" : "unknown";
        } catch (Throwable unused) {
            f = false;
            return "unknown";
        }
    }
}
