package com.flybird.support.basics;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.cun;
import tb.riy;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f7234a = SystemClock.elapsedRealtimeNanos();
    public boolean b = false;

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("4050dc31", new Object[0]) : new e();
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        this.b = true;
        return SystemClock.elapsedRealtimeNanos() - this.f7234a;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b && AppContextHolder.b) {
            throw new RuntimeException("Timing already used!");
        }
    }

    public static void c(e eVar, TimeUnit timeUnit, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25b2d3f", new Object[]{eVar, timeUnit, str, str2});
            return;
        }
        eVar.c();
        long convert = timeUnit.convert(eVar.b(), TimeUnit.NANOSECONDS);
        cun.b(str, str2 + " (" + convert + " " + timeUnit.name() + riy.BRACKET_END_STR);
    }

    public static void a(e eVar, TimeUnit timeUnit, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519ee401", new Object[]{eVar, timeUnit, str, str2});
            return;
        }
        eVar.c();
        long convert = timeUnit.convert(SystemClock.elapsedRealtimeNanos() - eVar.f7234a, TimeUnit.NANOSECONDS);
        cun.b(str, str2 + " (" + convert + " " + timeUnit.name() + ") ...");
    }

    public static void b(e eVar, TimeUnit timeUnit, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19fd08a0", new Object[]{eVar, timeUnit, str, str2});
            return;
        }
        eVar.c();
        long convert = timeUnit.convert(eVar.b(), TimeUnit.NANOSECONDS);
        if (!AppContextHolder.b) {
            return;
        }
        cun.c(str, str2 + " (" + convert + " " + timeUnit.name() + riy.BRACKET_END_STR);
    }
}
