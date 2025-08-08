package com.taobao.tao.recommend3.gateway.model.response;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SubSectionModel;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.oqc;

/* loaded from: classes8.dex */
public class AwesomeGetData implements IBizDataModel<AwesomeGetContainerData>, Serializable, IMTOPDataObject {
    public Map<String, AwesomeGetContainerData> containers;
    public JSONObject currentPageParams;
    public JSONObject currentUTParams;
    public JSONObject ext;
    public SecondExtraParamsData extraParams;
    public JSONObject globalUTParams;
    public boolean isFirstReturn = false;
    public boolean isSecondReturn = false;
    public SecondRenderData renderParams;

    static {
        kge.a(1584630498);
        kge.a(-350052935);
        kge.a(1028243835);
        kge.a(1983418164);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public AwesomeGetData m1281clone() {
        AwesomeGetData awesomeGetData = new AwesomeGetData();
        awesomeGetData.currentPageParams = this.currentPageParams;
        awesomeGetData.currentUTParams = this.currentUTParams;
        awesomeGetData.globalUTParams = this.globalUTParams;
        awesomeGetData.ext = this.ext;
        HashMap hashMap = new HashMap(this.containers.size());
        for (String str : this.containers.keySet()) {
            hashMap.put(str, this.containers.get(str).m1278clone());
        }
        awesomeGetData.containers = hashMap;
        return awesomeGetData;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel
    public JSONObject getExt() {
        return this.ext;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel
    public Map<String, AwesomeGetContainerData> getContainers() {
        return this.containers;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentPageParams() {
        return this.currentPageParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.a
    public JSONObject getCurrentUTParams() {
        return this.currentUTParams;
    }

    public JSONObject getGlobalUTParams() {
        return this.globalUTParams;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r1v28, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData] */
    public void mergeSecondReturnData(AwesomeGetData awesomeGetData) {
        int i;
        Map<String, AwesomeGetContainerData> map;
        if (awesomeGetData != null && (map = awesomeGetData.containers) != null) {
            HashMap hashMap = new HashMap(map.size());
            for (String str : awesomeGetData.containers.keySet()) {
                hashMap.put(str, awesomeGetData.containers.get(str).m1278clone());
            }
            this.containers = hashMap;
        }
        this.currentPageParams = awesomeGetData.currentPageParams;
        this.currentUTParams = awesomeGetData.currentUTParams;
        this.globalUTParams = awesomeGetData.globalUTParams;
        this.ext = awesomeGetData.ext;
        Map<String, AwesomeGetContainerData> map2 = this.containers;
        if (map2 == null) {
            return;
        }
        AwesomeGetContainerData awesomeGetContainerData = map2.get(oqc.j().f30287a);
        if (awesomeGetContainerData != null && awesomeGetContainerData.getBase() != null) {
            if (this.extraParams != null) {
                awesomeGetContainerData.getBase().passParams = this.extraParams.getSubPassParam();
                if (awesomeGetContainerData.getBase().getExt() != null) {
                    awesomeGetContainerData.getBase().getExt().put("updatePassParams", (Object) this.extraParams.getSubUpdatePassParams());
                }
                if (awesomeGetContainerData.getBase().mo1280getPageParams() != null) {
                    awesomeGetContainerData.getBase().mo1280getPageParams().requestInAdvance = this.extraParams.getRequestInAdvance();
                }
            }
            if (this.extraParams != null && this.renderParams != null && awesomeGetContainerData != null && awesomeGetContainerData.getBase() != null && awesomeGetContainerData.getBase().sections != null) {
                JSONObject overlaysMap = this.extraParams.getOverlaysMap();
                handleOverlayMap(awesomeGetContainerData.getBase().sections, overlaysMap);
                if (this.renderParams.getSections() != null) {
                    handleOverlayMap(this.renderParams.getSections(), overlaysMap);
                    if (awesomeGetContainerData.getBase().mo1280getPageParams() != null && awesomeGetContainerData.getBase().mo1280getPageParams().pageNum == 0) {
                        awesomeGetContainerData.getBase().sections.addAll(this.renderParams.getSections());
                    }
                }
            }
            if (awesomeGetContainerData.getPageParams() != null && ((i = awesomeGetContainerData.getPageParams().requestInAdvance) < 0 || i > 10)) {
                awesomeGetContainerData.getPageParams().firstRequestInAdvance = -1;
                awesomeGetContainerData.getBase().initCacheRequestInAdvance();
            }
        }
        AwesomeGetContainerData awesomeGetContainerData2 = this.containers.get(oqc.a().l());
        if (awesomeGetContainerData2 == null || awesomeGetContainerData2.getBase() == null || this.extraParams == null) {
            return;
        }
        if (awesomeGetContainerData2.getBase().getExt() != null) {
            awesomeGetContainerData2.getBase().getExt().put("updatePassParams", (Object) this.extraParams.getMainUpdatePassParams());
        }
        awesomeGetContainerData2.getBase().passParams = this.extraParams.getMainPassParam();
    }

    private void handleOverlayMap(List<SectionModel> list, JSONObject jSONObject) {
        if (list == null || jSONObject == null || list.isEmpty() || jSONObject.isEmpty()) {
            return;
        }
        for (SectionModel sectionModel : list) {
            String str = null;
            if (sectionModel.containsKey("index")) {
                str = sectionModel.getString("index");
            }
            if (!StringUtils.isEmpty(str)) {
                SubSectionModel mo1098getSubSection = sectionModel.mo1098getSubSection();
                if (mo1098getSubSection == null) {
                    mo1098getSubSection = new SubSectionModel(new JSONObject(1));
                    sectionModel.put("subSection", (Object) mo1098getSubSection);
                }
                mo1098getSubSection.put("overlay", (Object) jSONObject.getJSONObject(str));
            }
        }
    }

    public static <T> T getTFromJsonObj(JSONObject jSONObject, Class<T> cls, String... strArr) {
        T t = null;
        if (jSONObject == null) {
            return null;
        }
        if (strArr != null && strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                if (i == strArr.length - 1) {
                    if (cls == String.class) {
                        t = (T) jSONObject.getString(strArr[i]);
                    } else if (cls == JSONObject.class) {
                        t = (T) jSONObject.getJSONObject(strArr[i]);
                    }
                } else {
                    jSONObject = jSONObject.getJSONObject(strArr[i]);
                    if (jSONObject == null) {
                        break;
                    }
                }
            }
        }
        return t;
    }
}
