package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import tb.kge;

/* loaded from: classes5.dex */
public class bt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1597827025);
    }

    public static boolean a(Item item) {
        JSONObject moduleDescParams;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("720e4292", new Object[]{item})).booleanValue() : (item == null || (moduleDescParams = item.getModuleDescParams()) == null || moduleDescParams.isEmpty()) ? false : true;
    }
}
