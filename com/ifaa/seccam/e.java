package com.ifaa.seccam;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cyy;
import tb.cyz;
import tb.cza;

/* loaded from: classes4.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f7633a = false;
    private static e b = new e();

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("8564e3e1", new Object[0]) : b;
    }

    private e() {
    }

    public synchronized void a(Context context, byte[] bArr, cyz cyzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4760eb53", new Object[]{this, context, bArr, cyzVar});
            return;
        }
        f.a("SecCamInterface", "init start!");
        if (f7633a) {
            return;
        }
        f7633a = true;
        g.a().a(context);
        g.a().a(bArr, cyzVar);
        f.a("SecCamInterface", "init end!");
    }

    public synchronized void a(int i, cza czaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a94401", new Object[]{this, new Integer(i), czaVar});
            return;
        }
        f.a("SecCamInterface", "openSecCamera!");
        g.a().a(i, czaVar);
    }

    public synchronized c a(int i, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("520dea5d", new Object[]{this, new Integer(i), bArr});
        }
        f.a("SecCamInterface", "getSecRawImage!");
        return g.a().a(i, bArr, true);
    }

    public synchronized int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        f.a("SecCamInterface", "close start!");
        f7633a = false;
        return g.a().b();
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : g.a().c();
    }

    public synchronized void a(Context context, cyy cyyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("767b512d", new Object[]{this, context, cyyVar});
            return;
        }
        g.a().a(context);
        g.a().a(cyyVar);
    }
}
