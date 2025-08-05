package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.taobao.android.gateway.util.d;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetPageData implements IPageDataModel, IMTOPDataObject {
    private String isLastPage;
    private String itemLastCount;
    private int pageNum;
    private int requestInAdvance = 10;

    static {
        kge.a(-1773701781);
        kge.a(450568040);
        kge.a(-350052935);
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

    public void setIsLastPage(String str) {
        this.isLastPage = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public String getItemLastCount() {
        return this.itemLastCount;
    }

    public void setItemLastCount(String str) {
        this.itemLastCount = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel
    public int getRequestInAdvance() {
        return this.requestInAdvance;
    }

    public void setRequestInAdvance(int i) {
        this.requestInAdvance = i;
    }

    /* renamed from: clone */
    public AwesomeGetPageData m1106clone() {
        AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
        awesomeGetPageData.pageNum = this.pageNum;
        awesomeGetPageData.isLastPage = this.isLastPage;
        awesomeGetPageData.itemLastCount = this.itemLastCount;
        awesomeGetPageData.requestInAdvance = this.requestInAdvance;
        return awesomeGetPageData;
    }

    public String toString() {
        return "AwesomeGetPageData{pageNum=" + this.pageNum + ", isLastPage='" + this.isLastPage + "', itemLastCount='" + this.itemLastCount + "', requestInAdvance='" + this.requestInAdvance + "'}";
    }
}
