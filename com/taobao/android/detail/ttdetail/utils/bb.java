package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes5.dex */
public class bb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int b;
    private static LinkedList<Activity> c;

    static {
        kge.a(-751103815);
        b = 2;
        c = new LinkedList<>();
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
            return;
        }
        c(activity);
        b(activity);
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else if (activity == null || c.contains(activity)) {
        } else {
            c.add(activity);
            if (c.size() <= b) {
                return;
            }
            c.poll().finish();
        }
    }

    public static void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{activity});
        } else if (activity == null) {
        } else {
            c.remove(activity);
        }
    }

    public static Activity a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("23df81b6", new Object[]{str});
        }
        Iterator<Activity> it = c.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next.toString().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
