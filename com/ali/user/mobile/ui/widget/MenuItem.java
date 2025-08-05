package com.ali.user.mobile.ui.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class MenuItem {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MenuItemOnClickListener menuItemOnClickListener;
    private String text;
    public int textColor;
    public float textSize;

    static {
        kge.a(1521281610);
    }

    public MenuItem() {
    }

    public MenuItem(String str, MenuItemOnClickListener menuItemOnClickListener) {
        this.text = str;
        this.menuItemOnClickListener = menuItemOnClickListener;
    }

    public String getText() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("97297536", new Object[]{this}) : this.text;
    }

    public void setText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
        } else {
            this.text = str;
        }
    }

    public MenuItemOnClickListener getMenuItemOnClickListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuItemOnClickListener) ipChange.ipc$dispatch("8018bf1a", new Object[]{this}) : this.menuItemOnClickListener;
    }

    public void setMenuItemOnClickListener(MenuItemOnClickListener menuItemOnClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f76087e", new Object[]{this, menuItemOnClickListener});
        } else {
            this.menuItemOnClickListener = menuItemOnClickListener;
        }
    }
}
