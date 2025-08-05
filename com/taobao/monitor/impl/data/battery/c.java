package com.taobao.monitor.impl.data.battery;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.util.h;
import com.taobao.monitor.performance.cpu.e;
import com.taobao.monitor.performance.cpu.g;
import tb.mnd;
import tb.mog;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean b;
    private String c;
    private long e;
    private g f;
    private long[] g;

    /* renamed from: a  reason: collision with root package name */
    private final e f18161a = new e(com.taobao.monitor.impl.common.e.a().b().getPackageName());
    private long d = mnd.m;

    public c(boolean z, String str) {
        this.b = z;
        this.c = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = h.a();
        this.d = this.e;
        this.f = this.f18161a.b();
        this.g = mog.a();
    }

    public void a(String str) {
        long[] jArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        long a2 = h.a();
        g b = this.f18161a.b();
        Intent a3 = com.taobao.monitor.impl.util.a.a(com.taobao.monitor.impl.common.e.a().b());
        long[] a4 = mog.a();
        if (b != null) {
            b b2 = b.a().a(str).b(this.c);
            long j = this.e;
            if (j == 0) {
                j = mnd.m;
            }
            b a5 = b2.a(a2 - j).a(e.a(this.f, b)).a(a3 == null ? -1.0f : a3.getIntExtra("temperature", -1) / 10.0f);
            if (a(this.g, a4)) {
                long j2 = a4[0];
                long[] jArr2 = this.g;
                jArr = new long[]{j2 - jArr2[0], a4[1] - jArr2[1]};
            } else {
                jArr = a4;
            }
            a5.a(jArr).b();
        }
        this.e = a2;
        this.f = b;
        this.g = a4;
    }

    private boolean a(long[] jArr, long[] jArr2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bbe3a64a", new Object[]{this, jArr, jArr2})).booleanValue() : jArr != null && jArr.length == 2 && jArr[0] > 0 && jArr[1] > 0 && jArr2 != null && jArr2.length == 2 && jArr2[0] > 0 && jArr2[1] > 0;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        long j = this.e;
        return j == 0 ? this.d : j;
    }
}
