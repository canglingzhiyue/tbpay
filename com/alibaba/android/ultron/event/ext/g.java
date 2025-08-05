package com.alibaba.android.ultron.event.ext;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class g extends p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1046961429);
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "-8203083868611759859";
    }

    @Override // com.alibaba.android.ultron.event.ext.p
    public void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
        } else if ("true".equals(e(eVar).getString("condition"))) {
            a(eVar, com.taobao.android.weex_framework.util.a.ATOM_EXT_match);
        } else {
            a(eVar, "notMatch");
        }
    }
}
