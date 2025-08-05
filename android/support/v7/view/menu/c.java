package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.support.v4.util.ArrayMap;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
abstract class c<T> extends d<T> {

    /* renamed from: a  reason: collision with root package name */
    final Context f1368a;
    private Map<SupportMenuItem, MenuItem> c;
    private Map<SupportSubMenu, SubMenu> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, T t) {
        super(t);
        this.f1368a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof SupportMenuItem) {
            SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
            if (this.c == null) {
                this.c = new ArrayMap();
            }
            MenuItem menuItem2 = this.c.get(menuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            MenuItem a2 = l.a(this.f1368a, supportMenuItem);
            this.c.put(supportMenuItem, a2);
            return a2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (subMenu instanceof SupportSubMenu) {
            SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
            if (this.d == null) {
                this.d = new ArrayMap();
            }
            SubMenu subMenu2 = this.d.get(supportSubMenu);
            if (subMenu2 != null) {
                return subMenu2;
            }
            SubMenu a2 = l.a(this.f1368a, supportSubMenu);
            this.d.put(supportSubMenu, a2);
            return a2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Map<SupportMenuItem, MenuItem> map = this.c;
        if (map != null) {
            map.clear();
        }
        Map<SupportSubMenu, SubMenu> map2 = this.d;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        Map<SupportMenuItem, MenuItem> map = this.c;
        if (map == null) {
            return;
        }
        Iterator<SupportMenuItem> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getGroupId()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        Map<SupportMenuItem, MenuItem> map = this.c;
        if (map == null) {
            return;
        }
        Iterator<SupportMenuItem> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (i == it.next().getItemId()) {
                it.remove();
                return;
            }
        }
    }
}
