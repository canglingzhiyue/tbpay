package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.g;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public final class a extends android.support.v7.view.menu.e {
    public static final int MAX_ITEM_COUNT = 5;

    public a(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.view.menu.e
    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            g();
            MenuItem a2 = super.a(i, i2, i3, charSequence);
            if (a2 instanceof g) {
                ((g) a2).a(true);
            }
            h();
            return a2;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    @Override // android.support.v7.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
