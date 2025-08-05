package com.alipay.android.msp.framework.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class FwUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static <V> List<V> concatList(List<V> list, List<V> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("684223ac", new Object[]{list, list2});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return arrayList;
    }

    public static <V> List<V> concatMultiList(List<V>... listArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("341433cb", new Object[]{listArr});
        }
        ArrayList arrayList = new ArrayList();
        if (listArr != null && listArr.length > 0) {
            for (List<V> list : listArr) {
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
        }
        return arrayList;
    }
}
