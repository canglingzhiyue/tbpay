package com.taobao.tao.navigation;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.navigation.view.IconForegroundImageView;
import tb.hut;
import tb.omn;

/* loaded from: classes8.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, Drawable drawable, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17753ea0", new Object[]{str, drawable, str2});
        } else {
            a(str, drawable, str2, 12);
        }
    }

    private static NavigationTabIndicatorView d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NavigationTabIndicatorView) ipChange.ipc$dispatch("6096182", new Object[]{str});
        }
        TBFragmentTabHost c = e.c();
        if (c == null) {
            hut.b("NavigationIntroductoryApi", "getIndicatorView: tabHost is null");
            return null;
        }
        return c.getTabViewAtIndex(omn.a(str));
    }

    public static void a(String str, Drawable drawable, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7330863", new Object[]{str, drawable, str2, new Integer(i)});
            return;
        }
        IconForegroundImageView iconForegroundImageView = null;
        if (drawable != null) {
            iconForegroundImageView = new IconForegroundImageView(e.c().getContext());
            iconForegroundImageView.setImageDrawable(drawable, i);
        }
        hut.b("NavigationIntroductoryApi", "updateForegroundView: " + drawable);
        NavigationTabIndicatorView d = d(str);
        if (d == null) {
            hut.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        } else {
            d.setForegroundView(iconForegroundImageView, false, str2);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, null, null);
        }
    }

    public static void a(String str, String str2, NavigationTabMsgMode navigationTabMsgMode, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59135197", new Object[]{str, str2, navigationTabMsgMode, str3});
            return;
        }
        hut.b("NavigationIntroductoryApi", "updateMessage: " + str + " " + str2);
        NavigationTabIndicatorView d = d(str);
        if (d == null) {
            hut.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        } else {
            d.updateMessage(navigationTabMsgMode, str2, str3);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        hut.b("NavigationIntroductoryApi", "clearMessage: " + str);
        NavigationTabIndicatorView d = d(str);
        if (d == null) {
            hut.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        } else {
            d.updateMessage(NavigationTabMsgMode.NONE, null);
        }
    }

    public static Boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("5a4bcb31", new Object[]{str});
        }
        NavigationTabIndicatorView d = d(str);
        if (d == null) {
            hut.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
            return null;
        }
        return Boolean.valueOf(d.isSelected());
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{str});
            return;
        }
        NavigationTabIndicatorView d = d(str);
        if (d == null) {
            hut.b("NavigationIntroductoryApi", "updateForegroundView: indicatorView is null");
        } else {
            d.resetGuardianForegroundView();
        }
    }
}
