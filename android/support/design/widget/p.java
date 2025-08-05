package android.support.design.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

/* loaded from: classes2.dex */
class p {

    /* renamed from: a  reason: collision with root package name */
    private final View f1229a;
    private int b;
    private int c;
    private int d;
    private int e;

    public p(View view) {
        this.f1229a = view;
    }

    private void d() {
        View view = this.f1229a;
        ViewCompat.offsetTopAndBottom(view, this.d - (view.getTop() - this.b));
        View view2 = this.f1229a;
        ViewCompat.offsetLeftAndRight(view2, this.e - (view2.getLeft() - this.c));
    }

    public void a() {
        this.b = this.f1229a.getTop();
        this.c = this.f1229a.getLeft();
        d();
    }

    public boolean a(int i) {
        if (this.d != i) {
            this.d = i;
            d();
            return true;
        }
        return false;
    }

    public int b() {
        return this.d;
    }

    public boolean b(int i) {
        if (this.e != i) {
            this.e = i;
            d();
            return true;
        }
        return false;
    }

    public int c() {
        return this.b;
    }
}
