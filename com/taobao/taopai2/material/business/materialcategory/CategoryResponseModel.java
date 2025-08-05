package com.taobao.taopai2.material.business.materialcategory;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import tb.kge;
import tb.qfg;

/* loaded from: classes8.dex */
public class CategoryResponseModel implements Serializable, qfg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<CategoryInfo> categoryList;

    static {
        kge.a(-931698835);
        kge.a(1028243835);
        kge.a(-1137413742);
    }

    @Override // tb.qfg
    public boolean isValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue() : this.categoryList != null;
    }
}
