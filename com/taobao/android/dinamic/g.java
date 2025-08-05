package com.taobao.android.dinamic;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.fnk;
import tb.fpa;
import tb.fpd;
import tb.fpq;
import tb.kge;

/* loaded from: classes5.dex */
public final class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-123509168);
    }

    public static void a(View view, fpd fpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb350c0", new Object[]{view, fpdVar});
            return;
        }
        fpq a2 = l.a(view);
        Map<String, String> map = a2.c;
        Map<String, String> map2 = a2.d;
        com.taobao.android.dinamic.dinamic.h b = e.b(a2.f28098a);
        if (!map.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList<String> arrayList = new ArrayList<>(10);
            for (String str : map.keySet()) {
                Object a3 = fnk.a(map.get(str), a2.f28098a, fpdVar);
                hashMap.put(str, a3);
                if (a3 == null && e.a()) {
                    fpa.b(e.TAG, String.format("表达式 %s=%s 解析出来的结果为null", str, map.get(str)));
                }
            }
            arrayList.addAll(hashMap.keySet());
            hashMap.putAll(a2.b);
            b.bindDataImpl(view, hashMap, arrayList, fpdVar);
        }
        if (map2.isEmpty()) {
            return;
        }
        view.setTag(j.SUBDATA, fpdVar.a());
        b.setEvents(view, fpdVar);
    }
}
