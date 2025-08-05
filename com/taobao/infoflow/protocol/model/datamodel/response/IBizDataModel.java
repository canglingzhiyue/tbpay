package com.taobao.infoflow.protocol.model.datamodel.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes7.dex */
public interface IBizDataModel<CDM extends IContainerDataModel> extends a, Serializable {
    Map<String, CDM> getContainers();

    JSONObject getExt();
}
