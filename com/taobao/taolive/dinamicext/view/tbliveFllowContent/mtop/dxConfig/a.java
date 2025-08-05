package com.taobao.taolive.dinamicext.view.tbliveFllowContent.mtop.dxConfig;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1776195589);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        TemplateListRequest templateListRequest = new TemplateListRequest();
        templateListRequest.appVersion = "tblFllowContent_20230909";
        a(1, templateListRequest, TemplateListResponse.class);
    }
}
