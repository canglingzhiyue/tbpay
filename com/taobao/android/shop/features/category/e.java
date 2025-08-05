package com.taobao.android.shop.features.category;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2017652946);
    }

    public static List<c> a(CategoryDataItem[] categoryDataItemArr) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5e41d52b", new Object[]{categoryDataItemArr});
        }
        ArrayList arrayList = new ArrayList();
        if (categoryDataItemArr != null && categoryDataItemArr.length > 0) {
            int length = categoryDataItemArr.length;
            int i2 = 0;
            int i3 = -1;
            while (i2 < length) {
                CategoryDataItem categoryDataItem = categoryDataItemArr[i2];
                if (categoryDataItem.subCats == null || categoryDataItem.subCats.length == 0) {
                    int i4 = i3 + 1;
                    arrayList.add(new c(categoryDataItem.id, categoryDataItem.name, categoryDataItem.mcatImg, categoryDataItem.imagePath, categoryDataItem.parID, 0, i4, false));
                    i3 = i4;
                } else {
                    i3++;
                    arrayList.add(new c(categoryDataItem.id, categoryDataItem.name, categoryDataItem.mcatImg, categoryDataItem.imagePath, categoryDataItem.parID, 1, i3, false));
                    int i5 = 1;
                    int i6 = -1;
                    while (i5 <= categoryDataItem.subCats.length) {
                        i6 += i;
                        CategoryDataItem categoryDataItem2 = categoryDataItem.subCats[i5 - 1];
                        arrayList.add(new c(categoryDataItem2.id, categoryDataItem2.name, categoryDataItem2.mcatImg, categoryDataItem2.imagePath, categoryDataItem2.parID, 2, i6, i5 % 2 != 0 && categoryDataItem.subCats.length == i5));
                        i5++;
                        i = 1;
                    }
                }
                i2++;
                i = 1;
            }
        }
        return arrayList;
    }
}
