package com.meizu.cloud.pushsdk.e.f;

import com.meizu.cloud.pushsdk.e.b.e;
import com.meizu.cloud.pushsdk.e.d.k;

/* loaded from: classes4.dex */
public final class c {
    public static <T> com.meizu.cloud.pushsdk.e.b.c<T> a(com.meizu.cloud.pushsdk.e.b.b bVar) {
        int l = bVar.l();
        return l != 0 ? l != 1 ? l != 2 ? new com.meizu.cloud.pushsdk.e.b.c<>(new com.meizu.cloud.pushsdk.e.c.a()) : d(bVar) : b(bVar) : c(bVar);
    }

    private static <T> com.meizu.cloud.pushsdk.e.b.c<T> b(com.meizu.cloud.pushsdk.e.b.b bVar) {
        try {
            k a2 = a.a(bVar);
            if (a2 == null) {
                return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a()));
            }
            if (a2.b() >= 400) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a(a2), bVar, a2.b()));
                cVar.a(a2);
                return cVar;
            }
            com.meizu.cloud.pushsdk.e.b.c<T> cVar2 = new com.meizu.cloud.pushsdk.e.b.c<>("success");
            cVar2.a(a2);
            return cVar2;
        } catch (com.meizu.cloud.pushsdk.e.c.a e) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a(e)));
        } catch (Exception e2) {
            return new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e2));
        }
    }

    private static <T> com.meizu.cloud.pushsdk.e.b.c<T> c(com.meizu.cloud.pushsdk.e.b.b bVar) {
        try {
            try {
                k b = a.b(bVar);
                if (b == null) {
                    com.meizu.cloud.pushsdk.e.b.c<T> cVar = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a()));
                    com.meizu.cloud.pushsdk.e.i.a.a(b, bVar);
                    return cVar;
                } else if (bVar.m() == e.OK_HTTP_RESPONSE) {
                    com.meizu.cloud.pushsdk.e.b.c<T> cVar2 = new com.meizu.cloud.pushsdk.e.b.c<>(b);
                    cVar2.a(b);
                    com.meizu.cloud.pushsdk.e.i.a.a(b, bVar);
                    return cVar2;
                } else if (b.b() >= 400) {
                    com.meizu.cloud.pushsdk.e.b.c<T> cVar3 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a(b), bVar, b.b()));
                    cVar3.a(b);
                    com.meizu.cloud.pushsdk.e.i.a.a(b, bVar);
                    return cVar3;
                } else {
                    com.meizu.cloud.pushsdk.e.b.c<T> a2 = bVar.a(b);
                    a2.a(b);
                    com.meizu.cloud.pushsdk.e.i.a.a(b, bVar);
                    return a2;
                }
            } catch (com.meizu.cloud.pushsdk.e.c.a e) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar4 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a(e)));
                com.meizu.cloud.pushsdk.e.i.a.a(null, bVar);
                return cVar4;
            } catch (Exception e2) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar5 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e2));
                com.meizu.cloud.pushsdk.e.i.a.a(null, bVar);
                return cVar5;
            }
        } catch (Throwable th) {
            com.meizu.cloud.pushsdk.e.i.a.a(null, bVar);
            throw th;
        }
    }

    private static <T> com.meizu.cloud.pushsdk.e.b.c<T> d(com.meizu.cloud.pushsdk.e.b.b bVar) {
        try {
            try {
                k c = a.c(bVar);
                if (c == null) {
                    com.meizu.cloud.pushsdk.e.b.c<T> cVar = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a()));
                    com.meizu.cloud.pushsdk.e.i.a.a(c, bVar);
                    return cVar;
                } else if (bVar.m() == e.OK_HTTP_RESPONSE) {
                    com.meizu.cloud.pushsdk.e.b.c<T> cVar2 = new com.meizu.cloud.pushsdk.e.b.c<>(c);
                    cVar2.a(c);
                    com.meizu.cloud.pushsdk.e.i.a.a(c, bVar);
                    return cVar2;
                } else if (c.b() >= 400) {
                    com.meizu.cloud.pushsdk.e.b.c<T> cVar3 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(new com.meizu.cloud.pushsdk.e.c.a(c), bVar, c.b()));
                    cVar3.a(c);
                    com.meizu.cloud.pushsdk.e.i.a.a(c, bVar);
                    return cVar3;
                } else {
                    com.meizu.cloud.pushsdk.e.b.c<T> a2 = bVar.a(c);
                    a2.a(c);
                    com.meizu.cloud.pushsdk.e.i.a.a(c, bVar);
                    return a2;
                }
            } catch (com.meizu.cloud.pushsdk.e.c.a e) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar4 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e));
                com.meizu.cloud.pushsdk.e.i.a.a(null, bVar);
                return cVar4;
            } catch (Exception e2) {
                com.meizu.cloud.pushsdk.e.b.c<T> cVar5 = new com.meizu.cloud.pushsdk.e.b.c<>(com.meizu.cloud.pushsdk.e.i.b.a(e2));
                com.meizu.cloud.pushsdk.e.i.a.a(null, bVar);
                return cVar5;
            }
        } catch (Throwable th) {
            com.meizu.cloud.pushsdk.e.i.a.a(null, bVar);
            throw th;
        }
    }
}
