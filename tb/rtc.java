package tb;

import java.io.PrintStream;

/* loaded from: classes9.dex */
public final class rtc {

    /* renamed from: a  reason: collision with root package name */
    private static rtc f33353a;
    private static boolean b;
    private boolean c;
    private rtg d;

    /* loaded from: classes9.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f33354a = true;
        private rtg b;

        static {
            kge.a(-1226328889);
        }

        private void b() {
            if (this.b == null) {
                this.b = new rtg();
            }
        }

        public rtc a() {
            b();
            PrintStream printStream = System.out;
            printStream.println("should load native is " + this.f33354a);
            return new rtc(this.f33354a, this.b);
        }
    }

    static {
        kge.a(-499790352);
    }

    private rtc(boolean z, rtg rtgVar) {
        this.c = z;
        this.d = rtgVar;
    }

    public static rtc a() {
        b = true;
        if (f33353a == null) {
            f33353a = new a().a();
        }
        return f33353a;
    }

    public boolean b() {
        return this.c;
    }

    public rtg c() {
        return this.d;
    }
}
