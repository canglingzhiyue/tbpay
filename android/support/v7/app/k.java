package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.view.menu.e;
import android.support.v7.view.menu.j;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import tb.acu;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class k extends ActionBar {

    /* renamed from: a  reason: collision with root package name */
    DecorToolbar f1339a;
    boolean b;
    Window.Callback c;
    private boolean d;
    private boolean e;
    private ArrayList<Object> f = new ArrayList<>();
    private final Runnable g = new Runnable() { // from class: android.support.v7.app.k.1
        @Override // java.lang.Runnable
        public void run() {
            k.this.o();
        }
    };
    private final Toolbar.OnMenuItemClickListener h = new Toolbar.OnMenuItemClickListener() { // from class: android.support.v7.app.k.2
        @Override // android.support.v7.widget.Toolbar.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return k.this.c.onMenuItemSelected(0, menuItem);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class a implements j.a {
        private boolean b;

        a() {
        }

        @Override // android.support.v7.view.menu.j.a
        public void a(android.support.v7.view.menu.e eVar, boolean z) {
            if (this.b) {
                return;
            }
            this.b = true;
            k.this.f1339a.dismissPopupMenus();
            if (k.this.c != null) {
                k.this.c.onPanelClosed(108, eVar);
            }
            this.b = false;
        }

        @Override // android.support.v7.view.menu.j.a
        public boolean a(android.support.v7.view.menu.e eVar) {
            if (k.this.c != null) {
                k.this.c.onMenuOpened(108, eVar);
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public final class b implements e.a {
        b() {
        }

        @Override // android.support.v7.view.menu.e.a
        public void a(android.support.v7.view.menu.e eVar) {
            if (k.this.c != null) {
                if (k.this.f1339a.isOverflowMenuShowing()) {
                    k.this.c.onPanelClosed(108, eVar);
                } else if (!k.this.c.onPreparePanel(0, null, eVar)) {
                } else {
                    k.this.c.onMenuOpened(108, eVar);
                }
            }
        }

        @Override // android.support.v7.view.menu.e.a
        public boolean a(android.support.v7.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }
    }

    /* loaded from: classes2.dex */
    private class c extends acu {
        public c(Window.Callback callback) {
            super(callback);
        }

        @Override // tb.acu, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(k.this.f1339a.getContext()) : super.onCreatePanelView(i);
        }

        @Override // tb.acu, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !k.this.b) {
                k.this.f1339a.setMenuPrepared();
                k.this.b = true;
            }
            return onPreparePanel;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f1339a = new ToolbarWidgetWrapper(toolbar, false);
        this.c = new c(callback);
        this.f1339a.setWindowCallback(this.c);
        toolbar.setOnMenuItemClickListener(this.h);
        this.f1339a.setWindowTitle(charSequence);
    }

    private Menu p() {
        if (!this.d) {
            this.f1339a.setMenuCallbacks(new a(), new b());
            this.d = true;
        }
        return this.f1339a.getMenu();
    }

    @Override // android.support.v7.app.ActionBar
    public CharSequence a() {
        return this.f1339a.getTitle();
    }

    @Override // android.support.v7.app.ActionBar
    public void a(float f) {
        ViewCompat.setElevation(this.f1339a.getViewGroup(), f);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(int i) {
        a(LayoutInflater.from(this.f1339a.getContext()).inflate(i, this.f1339a.getViewGroup(), false));
    }

    public void a(int i, int i2) {
        this.f1339a.setDisplayOptions((i & i2) | ((~i2) & this.f1339a.getDisplayOptions()));
    }

    @Override // android.support.v7.app.ActionBar
    public void a(Configuration configuration) {
        super.a(configuration);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(Drawable drawable) {
        this.f1339a.setIcon(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(View view) {
        a(view, new ActionBar.LayoutParams(-2, -2));
    }

    @Override // android.support.v7.app.ActionBar
    public void a(View view, ActionBar.LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.f1339a.setCustomView(view);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(CharSequence charSequence) {
        this.f1339a.setTitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void a(boolean z) {
        a(z ? 1 : 0, 1);
    }

    @Override // android.support.v7.app.ActionBar
    public boolean a(int i, KeyEvent keyEvent) {
        Menu p = p();
        if (p != null) {
            boolean z = true;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
                z = false;
            }
            p.setQwertyMode(z);
            return p.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // android.support.v7.app.ActionBar
    public boolean a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            i();
        }
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    public int b() {
        return this.f1339a.getDisplayOptions();
    }

    @Override // android.support.v7.app.ActionBar
    public void b(int i) {
        DecorToolbar decorToolbar = this.f1339a;
        decorToolbar.setTitle(i != 0 ? decorToolbar.getContext().getText(i) : null);
    }

    @Override // android.support.v7.app.ActionBar
    public void b(Drawable drawable) {
        this.f1339a.setBackgroundDrawable(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void b(CharSequence charSequence) {
        this.f1339a.setSubtitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void b(boolean z) {
        a(z ? 2 : 0, 2);
    }

    @Override // android.support.v7.app.ActionBar
    public int c() {
        return this.f1339a.getHeight();
    }

    @Override // android.support.v7.app.ActionBar
    public void c(int i) {
        a(i, -1);
    }

    @Override // android.support.v7.app.ActionBar
    public void c(Drawable drawable) {
        this.f1339a.setNavigationIcon(drawable);
    }

    @Override // android.support.v7.app.ActionBar
    public void c(CharSequence charSequence) {
        this.f1339a.setWindowTitle(charSequence);
    }

    @Override // android.support.v7.app.ActionBar
    public void c(boolean z) {
        a(z ? 4 : 0, 4);
    }

    @Override // android.support.v7.app.ActionBar
    public void d() {
        this.f1339a.setVisibility(0);
    }

    @Override // android.support.v7.app.ActionBar
    public void d(int i) {
        this.f1339a.setNavigationContentDescription(i);
    }

    @Override // android.support.v7.app.ActionBar
    public void d(boolean z) {
        a(z ? 8 : 0, 8);
    }

    @Override // android.support.v7.app.ActionBar
    public void e() {
        this.f1339a.setVisibility(8);
    }

    @Override // android.support.v7.app.ActionBar
    public void e(boolean z) {
        a(z ? 16 : 0, 16);
    }

    @Override // android.support.v7.app.ActionBar
    public void f(boolean z) {
    }

    @Override // android.support.v7.app.ActionBar
    public boolean f() {
        return this.f1339a.getVisibility() == 0;
    }

    @Override // android.support.v7.app.ActionBar
    public Context g() {
        return this.f1339a.getContext();
    }

    @Override // android.support.v7.app.ActionBar
    public void h(boolean z) {
    }

    @Override // android.support.v7.app.ActionBar
    public void i(boolean z) {
    }

    @Override // android.support.v7.app.ActionBar
    public boolean i() {
        return this.f1339a.showOverflowMenu();
    }

    @Override // android.support.v7.app.ActionBar
    public void j(boolean z) {
        if (z == this.e) {
            return;
        }
        this.e = z;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            this.f.get(i);
        }
    }

    @Override // android.support.v7.app.ActionBar
    public boolean j() {
        return this.f1339a.hideOverflowMenu();
    }

    @Override // android.support.v7.app.ActionBar
    public boolean k() {
        this.f1339a.getViewGroup().removeCallbacks(this.g);
        ViewCompat.postOnAnimation(this.f1339a.getViewGroup(), this.g);
        return true;
    }

    @Override // android.support.v7.app.ActionBar
    public boolean l() {
        if (this.f1339a.hasExpandedActionView()) {
            this.f1339a.collapseActionView();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.app.ActionBar
    public void m() {
        this.f1339a.getViewGroup().removeCallbacks(this.g);
    }

    public Window.Callback n() {
        return this.c;
    }

    void o() {
        Menu p = p();
        android.support.v7.view.menu.e eVar = p instanceof android.support.v7.view.menu.e ? (android.support.v7.view.menu.e) p : null;
        if (eVar != null) {
            eVar.g();
        }
        try {
            p.clear();
            if (!this.c.onCreatePanelMenu(0, p) || !this.c.onPreparePanel(0, null, p)) {
                p.clear();
            }
        } finally {
            if (eVar != null) {
                eVar.h();
            }
        }
    }
}
