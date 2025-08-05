package com.ali.user.mobile.ui.widget;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class MenuItemOnClickListener implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private BottomMenuFragment bottomMenuFragment;
    private MenuItem menuItem;

    static {
        kge.a(1257274131);
        kge.a(-1201612728);
    }

    public abstract void onClickMenuItem(View view, MenuItem menuItem);

    public MenuItemOnClickListener(BottomMenuFragment bottomMenuFragment, MenuItem menuItem) {
        this.bottomMenuFragment = bottomMenuFragment;
        this.menuItem = menuItem;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        BottomMenuFragment bottomMenuFragment = this.bottomMenuFragment;
        if (bottomMenuFragment != null && bottomMenuFragment.isVisible()) {
            try {
                this.bottomMenuFragment.dismiss();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        onClickMenuItem(view, this.menuItem);
    }
}
