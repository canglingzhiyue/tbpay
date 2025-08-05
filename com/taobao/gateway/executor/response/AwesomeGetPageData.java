package com.taobao.gateway.executor.response;

import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetPageData implements Serializable, IMTOPDataObject {
    public String isLastPage;
    public String itemLastCount;
    public int pageNum;

    static {
        kge.a(672664572);
        kge.a(1028243835);
        kge.a(-350052935);
    }

    /* renamed from: clone */
    public AwesomeGetPageData m1066clone() {
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.pageNum = this.pageNum;
        awesomeGetPageData.isLastPage = this.isLastPage;
        awesomeGetPageData.itemLastCount = this.itemLastCount;
        return awesomeGetPageData;
    }

    public String toString() {
        return "AwesomeGetPageData{pageNum=" + this.pageNum + ", isLastPage='" + this.isLastPage + "', itemLastCount='" + this.itemLastCount + "'}";
    }
}
