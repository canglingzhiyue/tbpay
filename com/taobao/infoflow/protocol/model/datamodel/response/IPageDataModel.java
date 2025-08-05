package com.taobao.infoflow.protocol.model.datamodel.response;

import java.io.Serializable;

/* loaded from: classes.dex */
public interface IPageDataModel extends Serializable {
    String getItemLastCount();

    int getPageNum();

    int getRequestInAdvance();

    boolean isLastPage();

    void setPageNum(int i);
}
