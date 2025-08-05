package android.support.v7.widget;

/* loaded from: classes2.dex */
class x {
    public static final int UNDEFINED = Integer.MIN_VALUE;

    /* renamed from: a  reason: collision with root package name */
    private int f1511a = 0;
    private int b = 0;
    private int c = Integer.MIN_VALUE;
    private int d = Integer.MIN_VALUE;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;

    public int a() {
        return this.f1511a;
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1511a = i2;
            }
            if (i == Integer.MIN_VALUE) {
                return;
            }
            this.b = i;
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1511a = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            return;
        }
        this.b = i2;
    }

    public void a(boolean z) {
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (!this.h) {
            this.f1511a = this.e;
            this.b = this.f;
        } else if (z) {
            int i = this.d;
            if (i == Integer.MIN_VALUE) {
                i = this.e;
            }
            this.f1511a = i;
            int i2 = this.c;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f;
            }
            this.b = i2;
        } else {
            int i3 = this.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.e;
            }
            this.f1511a = i3;
            int i4 = this.d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f;
            }
            this.b = i4;
        }
    }

    public int b() {
        return this.b;
    }

    public void b(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.f1511a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
            this.b = i2;
        }
    }

    public int c() {
        return this.g ? this.b : this.f1511a;
    }

    public int d() {
        return this.g ? this.f1511a : this.b;
    }
}
