package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.e;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes2.dex */
public class o extends e implements SubMenu {
    private e d;
    private g e;

    public o(Context context, e eVar, g gVar) {
        super(context);
        this.d = eVar;
        this.e = gVar;
    }

    @Override // android.support.v7.view.menu.e
    public String a() {
        g gVar = this.e;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.a() + ":" + itemId;
    }

    @Override // android.support.v7.view.menu.e
    public void a(e.a aVar) {
        this.d.a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.v7.view.menu.e
    public boolean a(e eVar, MenuItem menuItem) {
        return super.a(eVar, menuItem) || this.d.a(eVar, menuItem);
    }

    @Override // android.support.v7.view.menu.e
    public boolean b() {
        return this.d.b();
    }

    @Override // android.support.v7.view.menu.e
    public boolean c() {
        return this.d.c();
    }

    @Override // android.support.v7.view.menu.e
    public boolean c(g gVar) {
        return this.d.c(gVar);
    }

    @Override // android.support.v7.view.menu.e
    public boolean d(g gVar) {
        return this.d.d(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.e;
    }

    @Override // android.support.v7.view.menu.e
    public e p() {
        return this.d.p();
    }

    public Menu s() {
        return this.d;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.e(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.d(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.a(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.e.setIcon(drawable);
        return this;
    }

    @Override // android.support.v7.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.d.setQwertyMode(z);
    }
}
