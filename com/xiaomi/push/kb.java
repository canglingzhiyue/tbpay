package com.xiaomi.push;

/* loaded from: classes9.dex */
public class kb {

    /* renamed from: a  reason: collision with root package name */
    private static int f24589a = Integer.MAX_VALUE;

    public static void a(jy jyVar, byte b) {
        a(jyVar, b, f24589a);
    }

    public static void a(jy jyVar, byte b, int i) {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    jyVar.m2203a();
                    return;
                case 3:
                    jyVar.mo2206a();
                    return;
                case 4:
                    jyVar.a();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    jyVar.m2201a();
                    return;
                case 8:
                    jyVar.m2192a();
                    return;
                case 10:
                    jyVar.m2193a();
                    return;
                case 11:
                    jyVar.m2200a();
                    return;
                case 12:
                    jyVar.m2198a();
                    while (true) {
                        jv m2194a = jyVar.m2194a();
                        if (m2194a.f24584a == 0) {
                            jyVar.f();
                            return;
                        } else {
                            a(jyVar, m2194a.f24584a, i - 1);
                            jyVar.g();
                        }
                    }
                case 13:
                    jx m2196a = jyVar.m2196a();
                    while (i2 < m2196a.f842a) {
                        int i3 = i - 1;
                        a(jyVar, m2196a.f24586a, i3);
                        a(jyVar, m2196a.b, i3);
                        i2++;
                    }
                    jyVar.h();
                    return;
                case 14:
                    kc m2197a = jyVar.m2197a();
                    while (i2 < m2197a.f843a) {
                        a(jyVar, m2197a.f24590a, i - 1);
                        i2++;
                    }
                    jyVar.j();
                    return;
                case 15:
                    jw m2195a = jyVar.m2195a();
                    while (i2 < m2195a.f841a) {
                        a(jyVar, m2195a.f24585a, i - 1);
                        i2++;
                    }
                    jyVar.i();
                    return;
            }
        } else {
            throw new js("Maximum skip depth exceeded");
        }
    }
}
