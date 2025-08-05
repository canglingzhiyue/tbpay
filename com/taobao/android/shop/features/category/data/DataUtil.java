package com.taobao.android.shop.features.category.data;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.shop.features.category.CategoryData;
import tb.kge;

/* loaded from: classes6.dex */
public class DataUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes6.dex */
    public enum ContainerType {
        ContainerType_Native,
        ContainerType_Weex
    }

    static {
        kge.a(142168236);
    }

    public static ContainerType a(CategoryData categoryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContainerType) ipChange.ipc$dispatch("e10320b8", new Object[]{categoryData});
        }
        ContainerType containerType = ContainerType.ContainerType_Native;
        if (categoryData == null) {
            return containerType;
        }
        String str = categoryData.type;
        return !TextUtils.isEmpty(str) ? str.equals("native") ? ContainerType.ContainerType_Native : str.equals("weex") ? ContainerType.ContainerType_Weex : containerType : containerType;
    }
}
