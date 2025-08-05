package com.taobao.uikit.extend.component.unify.Dialog;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class ThemeSingleton {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static ThemeSingleton singleton;
    public boolean darkTheme = false;
    public int titleColor = 0;
    public int contentColor = 0;
    public ColorStateList positiveColor = null;
    public ColorStateList neutralColor = null;
    public ColorStateList negativeColor = null;
    public int widgetColor = 0;
    public int itemColor = 0;
    public Drawable icon = null;
    public int backgroundColor = 0;
    public int dividerColor = 0;
    public ColorStateList linkColor = null;
    public int listSelector = 0;
    public int btnSelectorStacked = 0;
    public int btnSelectorPositive = 0;
    public int btnSelectorNeutral = 0;
    public int btnSelectorNegative = 0;
    public GravityEnum titleGravity = GravityEnum.START;
    public GravityEnum contentGravity = GravityEnum.START;
    public GravityEnum btnStackedGravity = GravityEnum.END;
    public GravityEnum itemsGravity = GravityEnum.START;
    public GravityEnum buttonsGravity = GravityEnum.START;

    static {
        kge.a(-920008714);
    }

    public static ThemeSingleton get(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeSingleton) ipChange.ipc$dispatch("4b00a3d2", new Object[]{new Boolean(z)});
        }
        if (singleton == null && z) {
            singleton = new ThemeSingleton();
        }
        return singleton;
    }

    public static ThemeSingleton get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThemeSingleton) ipChange.ipc$dispatch("858ab098", new Object[0]) : get(true);
    }
}
