package com.taobao.android.trade.cart;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static LinkedList<Activity> f15605a;

    static {
        kge.a(-1354523216);
        f15605a = new LinkedList<>();
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else if (activity == null) {
        } else {
            Iterator<Activity> it = f15605a.iterator();
            while (it.hasNext()) {
                if (it.next() == activity) {
                    return;
                }
            }
            f15605a.add(activity);
            if (f15605a.size() <= 2) {
                return;
            }
            f15605a.poll().finish();
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{activity});
        } else {
            f15605a.remove(activity);
        }
    }
}
