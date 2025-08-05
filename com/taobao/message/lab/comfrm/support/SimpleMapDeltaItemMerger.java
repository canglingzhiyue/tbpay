package com.taobao.message.lab.comfrm.support;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.DeltaItemMerger;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMapDeltaItemMerger implements DeltaItemMerger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(733203277);
        kge.a(-2030239868);
    }

    @Override // com.taobao.message.lab.comfrm.inner2.DeltaItemMerger
    public DeltaItem merge(DeltaItem... deltaItemArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeltaItem) ipChange.ipc$dispatch("a3d8e740", new Object[]{this, deltaItemArr});
        }
        if (deltaItemArr.length != 2) {
            throw new IllegalArgumentException("ListDeltaItemMerger|NOTSUPPORT");
        }
        HashSet hashSet = new HashSet((Set) deltaItemArr[0].getDataChange());
        hashSet.addAll((Set) deltaItemArr[1].getDataChange());
        return new DeltaItem(deltaItemArr[0].getDataType(), hashSet);
    }
}
