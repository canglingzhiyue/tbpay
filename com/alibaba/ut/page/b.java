package com.alibaba.ut.page;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f4229a;
    public static Stack<VirtualPageObject> b = new Stack<>();

    public static void a(VirtualPageObject virtualPageObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70532eb1", new Object[]{virtualPageObject});
        } else if (virtualPageObject == null) {
        } else {
            b.remove(virtualPageObject);
        }
    }

    public static List<VirtualPageObject> a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc8414d", new Object[]{activity});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<VirtualPageObject> it = b.iterator();
        while (it.hasNext()) {
            VirtualPageObject next = it.next();
            if (next.b == activity.hashCode()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
