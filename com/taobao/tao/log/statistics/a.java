package com.taobao.tao.log.statistics;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1501125363);
        kge.a(-361303461);
    }

    @Override // com.taobao.tao.log.statistics.b
    public void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = map != null ? map.toString() : "";
        String.format("TLog UT: eventName=%s, data=%s", objArr);
    }
}
