package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.k;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements k {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.support.v7.view.menu.k
    public void initialize(android.support.v7.view.menu.e eVar) {
    }
}
