package com.alibaba.analytics.core.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aob;
import tb.kge;

/* loaded from: classes.dex */
public class h extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-241565592);
    }

    @Override // com.alibaba.analytics.core.config.n
    public void a(String str, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else if (!map.containsKey("tpk") || (str2 = map.get("tpk")) == null) {
        } else {
            aob.a().a(str2);
            i.a("tpk_string", str2);
            i.a("tpk_md5", aob.a().h());
        }
    }

    @Override // com.alibaba.analytics.core.config.n
    public String[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this}) : new String[]{"ut_bussiness"};
    }
}
