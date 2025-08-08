package com.taobao.taolive.movehighlight.bussiness.highlight.contentListModel;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.business.b;
import tb.kge;
import tb.poy;
import tb.poz;

/* loaded from: classes8.dex */
public class a extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1938877627);
    }

    public a(d dVar) {
        super(dVar);
    }

    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, int i, int i2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87cf9b", new Object[]{this, aVar, str, str2, new Integer(i), new Integer(i2), str3});
        } else if (StringUtils.isEmpty(str) || !StringUtils.isDigitsOnly(str)) {
        } else {
            HighlightContentRequest highlightContentRequest = new HighlightContentRequest();
            highlightContentRequest.liveId = str;
            highlightContentRequest.s = i;
            highlightContentRequest.n = i2;
            highlightContentRequest.transParams = str3;
            highlightContentRequest.entryLiveSource = poz.f(n.b(aVar));
            highlightContentRequest.liveSource = poy.ac(aVar);
            highlightContentRequest.keyPointId = str2;
            a(0, highlightContentRequest, HighlightContentResponse.class);
        }
    }
}
