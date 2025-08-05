package com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.expose;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1650885641);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        FreqControlExposeRequest freqControlExposeRequest = new FreqControlExposeRequest();
        freqControlExposeRequest.key = str;
        a(0, freqControlExposeRequest, TemplateListResponse.class);
    }
}
