package com.taobao.homepage.pop.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.pop.PopData;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static IPopData<PopSectionModel> a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopData) ipChange.ipc$dispatch("586c3634", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        try {
            return (IPopData) JSONObject.parseObject(JSON.toJSONString(obj), PopData.class);
        } catch (Throwable unused) {
            return null;
        }
    }
}
