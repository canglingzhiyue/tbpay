package com.taobao.android.layoutmanager.container;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.view.tabbar.PreloadDelegate;
import com.taobao.uikit.extend.utils.NavigationBarUtils;
import java.util.List;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ohd;
import tb.ohh;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CHECK_PRELOAD = "CHECK_TNODE_PRELOAD";
    public static final String MAIN_PAGE_HEIGHT = "tnode_main_page_height";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f13208a;

    static {
        kge.a(1675362988);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            ab.a(new ab.b() { // from class: com.taobao.android.layoutmanager.container.d.1
            });
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        ogg.a("startPreloadGuang");
        if (TextUtils.isEmpty(str)) {
            ogg.b("page url is empty, cancel preload");
        } else if (oeb.bG() && com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b().a() == null) {
            ogg.b("TBMain is null, cancel preload");
        } else if (b()) {
        } else {
            final com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            final PreloadDelegate preloadDelegate = new PreloadDelegate(context, null, str, null, null, false, 1, null);
            if (b != null && b.a() != null && oeb.a()) {
                Runnable runnable = new Runnable() { // from class: com.taobao.android.layoutmanager.container.d.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        Activity a2 = com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d.this.a();
                        if (a2 == null) {
                            ogg.a("mainActivity exit, cancel preload");
                            return;
                        }
                        int b2 = ohd.b((Context) a2);
                        int a3 = d.a(a2);
                        if (d.b()) {
                            return;
                        }
                        preloadDelegate.a(b2, a3);
                    }
                };
                if (oeb.aE()) {
                    runnable.run();
                } else {
                    oec.a(runnable);
                }
            } else if (b()) {
            } else {
                preloadDelegate.b();
            }
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f13208a = z;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (f13208a) {
            return true;
        }
        try {
            com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
            if (b != null) {
                if (b.a(1)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static int a(Activity activity) {
        int i;
        List<Fragment> e;
        Fragment fragment;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        if (!(Build.VERSION.SDK_INT >= 23 ? oec.a((Context) activity, activity.getWindow().getDecorView().getRootWindowInsets()) : false)) {
            if (b(activity)) {
                i2 = NavigationBarUtils.getNavigationBarHeight(activity);
            }
            return (ohd.g(activity) - i2) - ohd.b((Context) activity, 48);
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.d b = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().b();
        if (b == null || (e = b.e()) == null || e.size() <= 0 || (fragment = e.get(0)) == null || fragment.getView() == null) {
            i = 0;
        } else {
            i = fragment.getView().getHeight();
            ogg.a("homePageViewHeight:" + i);
        }
        if (!oeb.i()) {
            return 0;
        }
        return (i != 0 || !oeb.p()) ? i : oec.a(ohh.b(MAIN_PAGE_HEIGHT), 0);
    }

    public static boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{activity})).booleanValue();
        }
        if (oec.a()) {
            if (Build.VERSION.SDK_INT < 17) {
                return !ViewConfiguration.get(activity).hasPermanentMenuKey() && !KeyCharacterMap.deviceHasKey(4);
            }
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            Point point2 = new Point();
            defaultDisplay.getSize(point);
            defaultDisplay.getRealSize(point2);
            return point2.y != point.y;
        }
        return NavigationBarUtils.isNavigationBarShown(activity);
    }
}
