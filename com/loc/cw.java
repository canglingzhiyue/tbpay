package com.loc;

import android.os.SystemClock;
import com.loc.cz;
import java.util.List;

/* loaded from: classes4.dex */
public final class cw extends cv {
    public cw() {
        super(2048);
    }

    private int a(long j, List<eg> list) {
        b(list);
        int size = list.size();
        if (size > 0) {
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                eg egVar = list.get(i);
                iArr[i] = ds.a(this.f7733a, egVar.f7758a == j && egVar.f7758a != -1, egVar.f7758a, (short) egVar.c, this.f7733a.a(egVar.b), egVar.g, (short) egVar.d);
            }
            return dr.a(this.f7733a, dr.a(this.f7733a, iArr));
        }
        return -1;
    }

    private int a(cz.a aVar) {
        int i;
        int i2;
        cx cxVar;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b;
        a(aVar.f);
        int size = aVar.f.size();
        int[] iArr = new int[size];
        for (int i7 = 0; i7 < size; i7++) {
            dz dzVar = aVar.f.get(i7);
            if (dzVar instanceof eb) {
                eb ebVar = (eb) dzVar;
                i6 = !ebVar.i ? dm.a(this.f7733a, ebVar.j, ebVar.k, ebVar.c, ebVar.l) : dm.a(this.f7733a, ebVar.b(), ebVar.c(), ebVar.j, ebVar.k, ebVar.c, ebVar.m, ebVar.n, ebVar.d, ebVar.l);
                i5 = -1;
                b = 1;
            } else if (dzVar instanceof ec) {
                ec ecVar = (ec) dzVar;
                i6 = dn.a(this.f7733a, ecVar.b(), ecVar.c(), ecVar.j, ecVar.k, ecVar.l, ecVar.c, ecVar.m, ecVar.d);
                i5 = -1;
                b = 3;
            } else if (dzVar instanceof ea) {
                ea eaVar = (ea) dzVar;
                i6 = !eaVar.i ? dg.a(this.f7733a, eaVar.j, eaVar.k, eaVar.l, eaVar.m, eaVar.n, eaVar.c) : dg.a(this.f7733a, eaVar.j, eaVar.k, eaVar.l, eaVar.m, eaVar.n, eaVar.c, eaVar.d);
                i5 = -1;
                b = 2;
            } else if (dzVar instanceof ed) {
                ed edVar = (ed) dzVar;
                i6 = dq.a(this.f7733a, edVar.b(), edVar.c(), edVar.j, edVar.k, edVar.l, edVar.c, edVar.m, edVar.d);
                i5 = -1;
                b = 4;
            } else {
                i5 = -1;
                i6 = -1;
                b = 0;
            }
            if (i6 == i5) {
                return i5;
            }
            iArr[i7] = dj.a(this.f7733a, dzVar.h ? (byte) 1 : (byte) 0, dzVar.i ? (byte) 1 : (byte) 0, (short) dzVar.g, b, i6);
        }
        int a2 = this.f7733a.a(aVar.b);
        int a3 = dh.a(this.f7733a, iArr);
        int size2 = aVar.g.size();
        int[] iArr2 = new int[size2];
        for (int i8 = 0; i8 < size2; i8++) {
            dz dzVar2 = aVar.g.get(i8);
            long elapsedRealtime = (SystemClock.elapsedRealtime() - dzVar2.e) / 1000;
            if (elapsedRealtime > 32767 || elapsedRealtime < 0) {
                elapsedRealtime = 32767;
            }
            if (dzVar2 instanceof eb) {
                eb ebVar2 = (eb) dzVar2;
                cxVar = this.f7733a;
                i3 = ebVar2.j;
                i4 = ebVar2.k;
            } else if (dzVar2 instanceof ec) {
                ec ecVar2 = (ec) dzVar2;
                cxVar = this.f7733a;
                i3 = ecVar2.j;
                i4 = ecVar2.k;
            } else {
                if (dzVar2 instanceof ea) {
                    ea eaVar2 = (ea) dzVar2;
                    i2 = Cdo.a(this.f7733a, eaVar2.j, eaVar2.k, eaVar2.l, (short) elapsedRealtime);
                    i = 2;
                } else if (dzVar2 instanceof ed) {
                    ed edVar2 = (ed) dzVar2;
                    cxVar = this.f7733a;
                    i3 = edVar2.j;
                    i4 = edVar2.k;
                } else {
                    i = 0;
                    i2 = 0;
                }
                iArr2[i8] = di.a(this.f7733a, (byte) i, i2);
            }
            i2 = dp.a(cxVar, i3, i4, (short) elapsedRealtime);
            i = 1;
            iArr2[i8] = di.a(this.f7733a, (byte) i, i2);
        }
        return dh.a(this.f7733a, a2, aVar.f7735a, a3, dh.b(this.f7733a, iArr2));
    }

    private int a(ef efVar) {
        long j = efVar.k;
        int i = (int) efVar.i;
        int i2 = (int) efVar.g;
        short s = (short) efVar.h;
        byte b = efVar.l;
        return dl.a(this.f7733a, efVar.c, j, (int) (efVar.e * 1000000.0d), (int) (efVar.d * 1000000.0d), (int) efVar.f, i, i2, s, b);
    }

    private static void a(List<dz> list) {
        int i;
        int i2;
        if (list == null || list.size() == 0) {
            return;
        }
        for (dz dzVar : list) {
            if (dzVar instanceof eb) {
                eb ebVar = (eb) dzVar;
                i = ebVar.j;
                i2 = ebVar.k;
            } else if (dzVar instanceof ec) {
                ec ecVar = (ec) dzVar;
                i = ecVar.j;
                i2 = ecVar.k;
            } else if (dzVar instanceof ed) {
                ed edVar = (ed) dzVar;
                i = edVar.j;
                i2 = edVar.k;
            } else if (dzVar instanceof ea) {
                ea eaVar = (ea) dzVar;
                i = eaVar.k;
                i2 = eaVar.l;
            }
            dzVar.g = dv.a(dv.a(i, i2));
        }
    }

    private static void b(List<eg> list) {
        for (eg egVar : list) {
            egVar.g = dv.b(egVar.f7758a);
        }
    }

    public final byte[] a(ef efVar, cz.a aVar, long j, List<eg> list) {
        super.a();
        try {
            int a2 = a(efVar);
            int i = -1;
            int a3 = (aVar == null || aVar.f == null || aVar.f.size() <= 0) ? -1 : a(aVar);
            if (list != null && list.size() > 0) {
                i = a(j, list);
            }
            de.a(this.f7733a);
            de.a(this.f7733a, a2);
            if (a3 > 0) {
                de.c(this.f7733a, a3);
            }
            if (i > 0) {
                de.b(this.f7733a, i);
            }
            this.f7733a.c(de.b(this.f7733a));
            return this.f7733a.c();
        } catch (Throwable th) {
            ej.a(th);
            return null;
        }
    }
}
