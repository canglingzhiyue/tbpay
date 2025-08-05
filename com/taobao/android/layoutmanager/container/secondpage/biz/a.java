package com.taobao.android.layoutmanager.container.secondpage.biz;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.ut.mini.UTAnalytics;
import tb.kge;
import tb.oga;
import tb.ogb;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1467615469);
    }

    public static b a(ogb ogbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d271e9d8", new Object[]{ogbVar});
        }
        if (ogbVar == null) {
            return null;
        }
        oga<?> findSecPageWrapper = ogbVar.findSecPageWrapper();
        if (findSecPageWrapper instanceof b) {
            return (b) findSecPageWrapper;
        }
        return null;
    }

    public static void a(Activity activity, Object obj, String str) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7002ab60", new Object[]{activity, obj, str});
        } else if (!(activity instanceof ogb) || (a2 = a((ogb) activity)) == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(activity);
            a2.c().a(obj, str);
            a2.h();
        }
    }

    public static void a(f fVar, Object obj, String str) {
        b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9485a42e", new Object[]{fVar, obj, str});
        } else if (!(fVar instanceof ogb) || (a2 = a((ogb) fVar)) == null) {
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(fVar.getActivity());
            a2.c().a(obj, str);
            a2.h();
        }
    }
}
