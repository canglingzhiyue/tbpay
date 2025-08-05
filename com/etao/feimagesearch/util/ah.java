package com.etao.feimagesearch.util;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes4.dex */
public class ah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2113086085);
    }

    public static <T> T a(View view, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4fe0a7f", new Object[]{view, cls});
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.poll();
            if (view2.getClass() == cls) {
                return cls.cast(view2);
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
        }
        return null;
    }

    public static void a(Context context) {
        Object systemService = context.getSystemService("statusbar");
        if (systemService == null) {
            return;
        }
        try {
            Method method = Class.forName("android.app.StatusBarManager").getMethod("expandSettingsPanel", new Class[0]);
            method.setAccessible(true);
            method.invoke(systemService, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void b(Context context) {
        Object systemService = context.getSystemService("statusbar");
        if (systemService == null) {
            return;
        }
        try {
            Method method = Class.forName("android.app.StatusBarManager").getMethod("collapsePanels", new Class[0]);
            method.setAccessible(true);
            method.invoke(systemService, new Object[0]);
        } catch (Exception unused) {
        }
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
        } else if (Build.VERSION.SDK_INT < 29) {
        } else {
            view.setForceDarkAllowed(false);
        }
    }
}
