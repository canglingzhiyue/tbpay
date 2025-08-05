package com.taobao.android.resourceguardian.data.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.eoe;
import tb.kge;

/* loaded from: classes6.dex */
public class RGCategoryInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CATEGORY_ALL = 9;
    public static final int CATEGORY_CPU = 1;
    public static final int CATEGORY_ENERGY = 4;
    public static final int CATEGORY_LIFECYCLE = 3;
    public static final int CATEGORY_MEMORY = 2;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface RGCategory {
    }

    static {
        kge.a(965052207);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)}) : i != 1 ? i != 2 ? i != 4 ? "errorCategory" : "energy" : "memory" : eoe.TYPE_CPU;
    }
}
