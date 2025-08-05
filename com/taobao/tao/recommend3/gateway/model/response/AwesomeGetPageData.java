package com.taobao.tao.recommend3.gateway.model.response;

import com.taobao.android.gateway.util.d;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes.dex */
public class AwesomeGetPageData implements IPageDataModel, Serializable, IMTOPDataObject {
    public String isLastPage;
    public String itemLastCount;
    public int pageNum;
    public int virtualPageNum;
    public int requestInAdvance = 10;
    public int firstRequestInAdvance = -1;

    static {
        kge.a(1523000849);
        kge.a(1028243835);
        kge.a(-350052935);
        kge.a(450568040);
    }

    /* renamed from: clone */
    public AwesomeGetPageData m1282clone() {
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.pageNum = this.pageNum;
        awesomeGetPageData.virtualPageNum = this.virtualPageNum;
        awesomeGetPageData.isLastPage = this.isLastPage;
        awesomeGetPageData.itemLastCount = this.itemLastCount;
        awesomeGetPageData.requestInAdvance = this.requestInAdvance;
        awesomeGetPageData.firstRequestInAdvance = this.firstRequestInAdvance;
        return awesomeGetPageData;
    }

    public String toString() {
        return "AwesomeGetPageData{pageNum=" + this.pageNum + "virtualPageNum=" + this.virtualPageNum + ", isLastPage='" + this.isLastPage + "', itemLastCount='" + this.itemLastCount + "', requestInAdvance='" + this.requestInAdvance + "', firstRequestInAdvance='" + this.firstRequestInAdvance + "'}";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public int getPageNum() {
        return this.pageNum;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public void setPageNum(int i) {
        this.pageNum = i;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public boolean isLastPage() {
        return d.a(this.isLastPage);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public String getItemLastCount() {
        return this.itemLastCount;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public int getRequestInAdvance() {
        return this.requestInAdvance;
    }
}
