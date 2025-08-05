package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.g;
import android.view.SubMenu;

/* loaded from: classes2.dex */
public class b extends android.support.v7.view.menu.e {
    public b(Context context) {
        super(context);
    }

    @Override // android.support.v7.view.menu.e, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        g gVar = (g) a(i, i2, i3, charSequence);
        d dVar = new d(e(), this, gVar);
        gVar.a(dVar);
        return dVar;
    }
}
