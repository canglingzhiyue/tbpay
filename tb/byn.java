package tb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class byn {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Float> f26180a;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final byn f26181a;

        static {
            kge.a(-1788780236);
            f26181a = new byn();
        }
    }

    static {
        kge.a(31257148);
    }

    private byn() {
        this.f26180a = new ConcurrentHashMap();
    }

    public static byn a() {
        return a.f26181a;
    }

    public float a(String str) {
        Float f = this.f26180a.get(str);
        if (f != null) {
            return Math.min(f.floatValue(), 1.0f);
        }
        return 1.0f;
    }

    public void a(String str, float f) {
        if (f < 0.0f || f > 1.0f) {
            this.f26180a.put(str, Float.valueOf(1.0f));
        } else {
            this.f26180a.put(str, Float.valueOf(f));
        }
    }
}
