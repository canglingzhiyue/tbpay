package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetData implements IBizDataModel<AwesomeGetContainerData>, IMTOPDataObject {
    private Map<String, AwesomeGetContainerData> containers;
    private JSONObject currentPageParams;
    private JSONObject currentUTParams;
    private JSONObject ext;
    private JSONObject globalUTParams;

    static {
        kge.a(1961203516);
        kge.a(1983418164);
        kge.a(-350052935);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentPageParams() {
        return this.currentPageParams;
    }

    public void setCurrentPageParams(JSONObject jSONObject) {
        this.currentPageParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentUTParams() {
        return this.currentUTParams;
    }

    public void setCurrentUTParams(JSONObject jSONObject) {
        this.currentUTParams = jSONObject;
    }

    public JSONObject getGlobalUTParams() {
        return this.globalUTParams;
    }

    public void setGlobalUTParams(JSONObject jSONObject) {
        this.globalUTParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel
    public JSONObject getExt() {
        return this.ext;
    }

    public void setExt(JSONObject jSONObject) {
        this.ext = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel
    public Map<String, AwesomeGetContainerData> getContainers() {
        return this.containers;
    }

    public void setContainers(Map<String, AwesomeGetContainerData> map) {
        this.containers = map;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public AwesomeGetData m1105clone() {
        AwesomeGetData awesomeGetData = new AwesomeGetData();
        awesomeGetData.currentPageParams = this.currentPageParams;
        awesomeGetData.currentUTParams = this.currentUTParams;
        awesomeGetData.globalUTParams = this.globalUTParams;
        awesomeGetData.ext = this.ext;
        HashMap hashMap = new HashMap(this.containers.size());
        for (String str : this.containers.keySet()) {
            hashMap.put(str, this.containers.get(str).m1102clone());
        }
        awesomeGetData.containers = hashMap;
        return awesomeGetData;
    }
}
