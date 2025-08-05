package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.menu.j;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1373a;
    private final e b;
    private final boolean c;
    private final int d;
    private final int e;
    private View f;
    private int g;
    private boolean h;
    private j.a i;
    private MenuPopup j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    public i(Context context, e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    public i(Context context, e eVar, View view, boolean z, int i, int i2) {
        this.g = GravityCompat.START;
        this.l = new PopupWindow.OnDismissListener() { // from class: android.support.v7.view.menu.MenuPopupHelper$1
            {
                i.this = this;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                i.this.f();
            }
        };
        this.f1373a = context;
        this.b = eVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    private void a(int i, int i2, boolean z, boolean z2) {
        MenuPopup c = c();
        c.setShowTitle(z2);
        if (z) {
            if ((GravityCompat.getAbsoluteGravity(this.g, ViewCompat.getLayoutDirection(this.f)) & 7) == 5) {
                i += this.f.getWidth();
            }
            c.setHorizontalOffset(i);
            c.setVerticalOffset(i2);
            int i3 = (int) ((this.f1373a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c.setEpicenterBounds(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        c.show();
    }

    private MenuPopup i() {
        Display defaultDisplay = ((WindowManager) this.f1373a.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window)).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        MenuPopup cascadingMenuPopup = Math.min(point.x, point.y) >= this.f1373a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new CascadingMenuPopup(this.f1373a, this.f, this.d, this.e, this.c) : new StandardMenuPopup(this.f1373a, this.b, this.f, this.d, this.e, this.c);
        cascadingMenuPopup.addMenu(this.b);
        cascadingMenuPopup.setOnDismissListener(this.l);
        cascadingMenuPopup.setAnchorView(this.f);
        cascadingMenuPopup.setCallback(this.i);
        cascadingMenuPopup.setForceShowIcon(this.h);
        cascadingMenuPopup.setGravity(this.g);
        return cascadingMenuPopup;
    }

    public int a() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public void a(j.a aVar) {
        this.i = aVar;
        MenuPopup menuPopup = this.j;
        if (menuPopup != null) {
            menuPopup.setCallback(aVar);
        }
    }

    public void a(View view) {
        this.f = view;
    }

    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void a(boolean z) {
        this.h = z;
        MenuPopup menuPopup = this.j;
        if (menuPopup != null) {
            menuPopup.setForceShowIcon(z);
        }
    }

    public boolean a(int i, int i2) {
        if (g()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(i, i2, true, true);
        return true;
    }

    public void b() {
        if (d()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public MenuPopup c() {
        if (this.j == null) {
            this.j = i();
        }
        return this.j;
    }

    public boolean d() {
        if (g()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public void e() {
        if (g()) {
            this.j.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean g() {
        MenuPopup menuPopup = this.j;
        return menuPopup != null && menuPopup.isShowing();
    }

    public ListView h() {
        return c().getListView();
    }
}
