package tb;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class byr {

    /* renamed from: a  reason: collision with root package name */
    private int f26186a;
    private float b;
    private final Map<String, Float> c;
    private boolean d;
    private boolean e;
    private int f;

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final byr f26187a;

        static {
            kge.a(1402464143);
            f26187a = new byr();
        }
    }

    static {
        kge.a(266013761);
    }

    private byr() {
        this.f26186a = 40960;
        this.b = 1.0f;
        this.c = new ConcurrentHashMap();
        this.d = false;
        this.e = true;
        this.f = 50;
    }

    public static byr a() {
        return a.f26187a;
    }

    public float a(String str) {
        Float f = this.c.get(str);
        return Math.min(f != null ? f.floatValue() : 1.0f, this.b);
    }

    public void a(float f) {
        if (f < 0.0f || f > 1.0f) {
            this.b = 1.0f;
        } else {
            this.b = f;
        }
    }

    public void a(int i) {
        if (i <= 0 || i > 1048576) {
            this.f26186a = 40960;
        } else {
            this.f26186a = i;
        }
    }

    public void a(String str, float f) {
        if (f < 0.0f || f > 1.0f) {
            this.c.put(str, Float.valueOf(1.0f));
        } else {
            this.c.put(str, Float.valueOf(f));
        }
    }

    public void a(boolean z) {
        this.d = z;
    }

    public int b() {
        int i = this.f26186a;
        if (i <= 0 || i > 1048576) {
            return 40960;
        }
        return i;
    }

    public void b(int i) {
        if (i <= 0 || i > 500) {
            this.f = 50;
        } else {
            this.f = i;
        }
    }

    public void b(boolean z) {
        this.e = z;
    }

    public boolean c() {
        return this.d;
    }

    public int d() {
        int i = this.f;
        if (i <= 0 || i > 500) {
            return 50;
        }
        return i;
    }
}
