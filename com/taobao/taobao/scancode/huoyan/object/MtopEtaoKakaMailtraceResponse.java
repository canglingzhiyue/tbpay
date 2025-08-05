package com.taobao.taobao.scancode.huoyan.object;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class MtopEtaoKakaMailtraceResponse extends BaseOutDo {
    private MailTraceWrapper data;

    static {
        kge.a(-538941406);
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public MailTraceWrapper mo2429getData() {
        return this.data;
    }

    public void setData(MailTraceWrapper mailTraceWrapper) {
        this.data = mailTraceWrapper;
    }
}
