package android.support.v7.widget;

import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
class ViewBoundsCheck {

    /* renamed from: a  reason: collision with root package name */
    final b f1467a;
    a b = new a();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ViewBounds {
    }

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1468a = 0;
        int b;
        int c;
        int d;
        int e;

        a() {
        }

        int a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        void a() {
            this.f1468a = 0;
        }

        void a(int i) {
            this.f1468a = i | this.f1468a;
        }

        void a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        boolean b() {
            int i = this.f1468a;
            if ((i & 7) == 0 || (i & a(this.d, this.b)) != 0) {
                int i2 = this.f1468a;
                if ((i2 & 112) != 0 && (i2 & (a(this.d, this.c) << 4)) == 0) {
                    return false;
                }
                int i3 = this.f1468a;
                if ((i3 & 1792) != 0 && (i3 & (a(this.e, this.b) << 8)) == 0) {
                    return false;
                }
                int i4 = this.f1468a;
                return (i4 & 28672) == 0 || (i4 & (a(this.e, this.c) << 12)) != 0;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ViewBoundsCheck(b bVar) {
        this.f1467a = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View a(int i, int i2, int i3, int i4) {
        int a2 = this.f1467a.a();
        int b2 = this.f1467a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.f1467a.a(i);
            this.b.a(a2, b2, this.f1467a.a(a3), this.f1467a.b(a3));
            if (i3 != 0) {
                this.b.a();
                this.b.a(i3);
                if (this.b.b()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                this.b.a();
                this.b.a(i4);
                if (this.b.b()) {
                    view = a3;
                }
            }
            i += i5;
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(View view, int i) {
        this.b.a(this.f1467a.a(), this.f1467a.b(), this.f1467a.a(view), this.f1467a.b(view));
        if (i != 0) {
            this.b.a();
            this.b.a(i);
            return this.b.b();
        }
        return false;
    }
}
