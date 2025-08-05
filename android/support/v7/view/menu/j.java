package android.support.v7.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public interface j {

    /* loaded from: classes2.dex */
    public interface a {
        void a(e eVar, boolean z);

        boolean a(e eVar);
    }

    boolean collapseItemActionView(e eVar, g gVar);

    boolean expandItemActionView(e eVar, g gVar);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, e eVar);

    void onCloseMenu(e eVar, boolean z);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(o oVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z);
}
