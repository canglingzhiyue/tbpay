package com.taobao.android.litecreator.sdk.framework.container;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1094105987);
    }

    public static List<PluginInfo> a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str}) : JSON.parseArray(str, PluginInfo.class);
    }
}
