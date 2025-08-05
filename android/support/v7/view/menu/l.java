package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public final class l {
    public static Menu a(Context context, SupportMenu supportMenu) {
        return new m(context, supportMenu);
    }

    public static MenuItem a(Context context, SupportMenuItem supportMenuItem) {
        return Build.VERSION.SDK_INT >= 16 ? new h(context, supportMenuItem) : new MenuItemWrapperICS(context, supportMenuItem);
    }

    public static SubMenu a(Context context, SupportSubMenu supportSubMenu) {
        return new p(context, supportSubMenu);
    }
}
