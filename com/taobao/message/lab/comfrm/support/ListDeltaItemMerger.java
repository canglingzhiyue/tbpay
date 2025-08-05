package com.taobao.message.lab.comfrm.support;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner2.DeltaItem;
import com.taobao.message.lab.comfrm.inner2.DeltaItemMerger;
import com.taobao.message.lab.comfrm.util.ChangedUtil;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class ListDeltaItemMerger implements DeltaItemMerger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1112388949);
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
        List list = (List) deltaItemArr[0].getDataChange();
        List list2 = (List) deltaItemArr[1].getDataChange();
        if (ChangedUtil.reload(list)) {
            return deltaItemArr[0];
        }
        if (ChangedUtil.reload(list2)) {
            return deltaItemArr[1];
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        List list3 = (List) deltaItemArr[0].getReasons();
        List list4 = (List) deltaItemArr[1].getReasons();
        ArrayList arrayList2 = null;
        if (list3 != null || list4 != null) {
            arrayList2 = new ArrayList();
            if (list3 != null) {
                arrayList2.addAll(list3);
            }
            if (list4 != null) {
                arrayList2.addAll(list4);
            }
        }
        return new DeltaItem(deltaItemArr[0].getDataType(), arrayList, arrayList2);
    }
}
