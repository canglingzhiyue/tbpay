package okio;

import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class k {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    static j f25061a;
    static long b;

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static j a() {
        synchronized (k.class) {
            if (f25061a != null) {
                j jVar = f25061a;
                f25061a = jVar.f;
                jVar.f = null;
                b -= 8192;
                return jVar;
            }
            return new j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(j jVar) {
        if (jVar.f == null && jVar.g == null) {
            if (jVar.d) {
                return;
            }
            synchronized (k.class) {
                if (b + 8192 > 65536) {
                    return;
                }
                b += 8192;
                jVar.f = f25061a;
                jVar.c = 0;
                jVar.b = 0;
                f25061a = jVar;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
