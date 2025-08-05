package com.taobao.taopai2.material.request;

import mtopsdk.mtop.domain.BaseOutDo;
import tb.kge;

/* loaded from: classes8.dex */
public class Response<R> extends BaseOutDo {
    public R data;
    public int errorCode;
    public String errorMsg;

    static {
        kge.a(168147171);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Response() {
    }

    public Response(R r) {
        this.data = r;
    }

    public Response(int i, String str) {
        this.errorCode = i;
        this.errorMsg = str;
    }

    @Override // mtopsdk.mtop.domain.BaseOutDo
    /* renamed from: getData */
    public R mo2429getData() {
        return this.data;
    }

    public void from(Response<?> response) {
        setApi(response.getApi());
        setRet(response.getRet());
        setV(response.getV());
    }
}
