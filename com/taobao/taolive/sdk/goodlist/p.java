package com.taobao.taolive.sdk.goodlist;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class p extends com.taobao.taolive.sdk.business.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-498057021);
    }

    public p(com.taobao.taolive.sdk.adapter.network.d dVar) {
        super(dVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TemplateListRequest templateListRequest = new TemplateListRequest();
        if (!StringUtils.isEmpty(d.d())) {
            templateListRequest.appVersion = d.d();
        }
        a(1, templateListRequest, TemplateListResponse.class);
    }
}
