package android.support.v7.app;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.graphics.drawable.DrawerArrowDrawable;
import android.view.View;

/* loaded from: classes2.dex */
public class a implements DrawerLayout.DrawerListener {

    /* renamed from: a  reason: collision with root package name */
    boolean f1328a;
    private final InterfaceC0011a b;
    private DrawerArrowDrawable c;
    private boolean d;
    private final int e;
    private final int f;

    /* renamed from: android.support.v7.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0011a {
        void a(int i);
    }

    private void a(float f) {
        DrawerArrowDrawable drawerArrowDrawable;
        boolean z;
        if (f != 1.0f) {
            if (f == 0.0f) {
                drawerArrowDrawable = this.c;
                z = false;
            }
            this.c.c(f);
        }
        drawerArrowDrawable = this.c;
        z = true;
        drawerArrowDrawable.b(z);
        this.c.c(f);
    }

    void a(int i) {
        this.b.a(i);
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerClosed(View view) {
        a(0.0f);
        if (this.f1328a) {
            a(this.e);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerOpened(View view) {
        a(1.0f);
        if (this.f1328a) {
            a(this.f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerSlide(View view, float f) {
        if (this.d) {
            a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            a(0.0f);
        }
    }

    @Override // android.support.v4.widget.DrawerLayout.DrawerListener
    public void onDrawerStateChanged(int i) {
    }
}
