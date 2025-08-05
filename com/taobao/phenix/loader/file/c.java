package com.taobao.phenix.loader.file;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.d;
import tb.kge;
import tb.nhx;
import tb.niw;
import tb.njc;
import tb.njd;
import tb.njf;
import tb.njj;
import tb.nmv;
import tb.nmx;

/* loaded from: classes.dex */
public class c extends nmx<njd, njd, com.taobao.phenix.request.b> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final b f18933a;

    static {
        kge.a(-329406459);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public c(b bVar) {
        super(1, 0);
        this.f18933a = bVar;
    }

    private njc a(nmv<njd, com.taobao.phenix.request.b> nmvVar, boolean z, d dVar, String str) throws Exception {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (njc) ipChange.ipc$dispatch("9f36a83f", new Object[]{this, nmvVar, new Boolean(z), dVar, str});
        }
        com.taobao.phenix.request.b e = nmvVar.e();
        njf a2 = this.f18933a.a(dVar, str, e.B());
        if (e.K()) {
            niw.b("LocalFile", e, "Request is cancelled before reading file", new Object[0]);
            nmvVar.d();
            a2.h();
            return null;
        }
        int i2 = a2.l;
        if (!z) {
            i = e.i();
        }
        njj njjVar = new njj(nmvVar, i2, i);
        njc a3 = njc.a(a2, njjVar);
        if (!njjVar.b()) {
            return a3;
        }
        return null;
    }

    @Override // tb.nmy
    public boolean a(nmv<njd, com.taobao.phenix.request.b> nmvVar) {
        njc njcVar;
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        com.taobao.phenix.request.b e = nmvVar.e();
        com.taobao.phenix.request.c y = e.y();
        com.taobao.phenix.request.c A = e.A();
        d i = y.i();
        char c = i.a() ? (char) 1 : (A == null || !A.i().a()) ? (char) 0 : (char) 2;
        if (c == 0) {
            return false;
        }
        njc njcVar2 = null;
        String g = y.g();
        d(nmvVar);
        niw.a("Phenix", "LocalImage started.", e);
        if (c != 1) {
            if (c == 2) {
                try {
                    g = A.g();
                    njcVar2 = a(nmvVar, true, A.i(), g);
                    nmvVar.e().z();
                    Object[] objArr = new Object[1];
                    objArr[0] = Boolean.valueOf(njcVar2 != null && njcVar2.a());
                    niw.a("LocalFile", g, "load file(secondary) result=%B", objArr);
                } catch (Exception e2) {
                    niw.d("LocalFile", g, "load file(secondary) error=%s", e2);
                }
            }
            njcVar = njcVar2;
            str = g;
            z = false;
        } else {
            try {
                njcVar2 = a(nmvVar, false, i, g);
                Object[] objArr2 = new Object[1];
                objArr2[0] = Boolean.valueOf(njcVar2 != null && njcVar2.a());
                niw.a("LocalFile", g, "load file result=%B", objArr2);
            } catch (Exception e3) {
                niw.d("LocalFile", g, "load file error=%s", e3);
                nmvVar.b(e3);
            }
            njcVar = njcVar2;
            str = g;
            z = true;
        }
        a(nmvVar, z);
        niw.a("Phenix", "LocalImage Finished.", e);
        if (njcVar != null) {
            if (z) {
                e.b().b(njcVar.l);
                e.b().j = njcVar.l;
                nhx.c(e.b());
            }
            njd njdVar = new njd(njcVar, str, 1, true, y.l());
            if (c != 2) {
                z2 = false;
            }
            njdVar.j = z2;
            nmvVar.b(njdVar, z);
        }
        return z;
    }
}
