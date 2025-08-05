package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;
import tb.tmv;

/* loaded from: classes7.dex */
public interface IIconService extends ISubService {
    public static final String SERVICE_NAME = "IconService";

    void clearPopLayerData(String str);

    int getInitPageIndex();

    int getPageIndex();

    JSONObject getPopLayerData(String str);

    boolean isPassPopLayerDataAvailable(String str);

    void passPopLayerData(tmv tmvVar, String str);

    void setPageIndex(int i);

    void setSectionBizCode(String str);
}
