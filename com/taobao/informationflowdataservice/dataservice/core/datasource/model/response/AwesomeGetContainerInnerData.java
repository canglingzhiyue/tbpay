package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetContainerInnerData implements IContainerInnerDataModel<SectionModel>, IMTOPDataObject {
    private long cacheTime;
    private JSONObject clientCache;
    private long dataCacheTime;
    private String dataType;
    private long expTimeInterval;
    private String expireType;
    private JSONObject ext;
    private JSONObject floatLayerSection;
    private List<JSONObject> homePagePopDatas;
    private String pageName;
    private AwesomeGetPageData pageParams;
    private JSONObject passParams;
    private JSONObject rangerParams;
    private JSONObject remindSection;
    private List<SectionModel> sections;
    private JSONObject stayTimeParams;
    private JSONObject topViewSplashSection;
    private JSONObject versionInfo;
    private boolean dataChange = true;
    private boolean isRemote = true;

    static {
        kge.a(-1747850319);
        kge.a(1806403682);
        kge.a(-350052935);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getCacheTime() {
        return this.cacheTime;
    }

    public void setCacheTime(long j) {
        this.cacheTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getDataCacheTime() {
        return this.dataCacheTime;
    }

    public void setDataCacheTime(long j) {
        this.dataCacheTime = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getDataType() {
        return this.dataType;
    }

    public void setDataType(String str) {
        this.dataType = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getExpTimeInterval() {
        return this.expTimeInterval;
    }

    public void setExpTimeInterval(long j) {
        this.expTimeInterval = j;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isDataChange() {
        return this.dataChange;
    }

    public void setDataChange(boolean z) {
        this.dataChange = z;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public List<SectionModel> getSections() {
        return this.sections;
    }

    public void setSections(List<SectionModel> list) {
        this.sections = list;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getExt() {
        return this.ext;
    }

    public void setExt(JSONObject jSONObject) {
        this.ext = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getRangerParams() {
        return this.rangerParams;
    }

    public void setRangerParams(JSONObject jSONObject) {
        this.rangerParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getPassParams() {
        return this.passParams;
    }

    public void setPassParams(JSONObject jSONObject) {
        this.passParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    /* renamed from: getPageParams  reason: collision with other method in class */
    public AwesomeGetPageData mo1280getPageParams() {
        return this.pageParams;
    }

    public void setPageParams(AwesomeGetPageData awesomeGetPageData) {
        this.pageParams = awesomeGetPageData;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getClientCache() {
        return this.clientCache;
    }

    public void setClientCache(JSONObject jSONObject) {
        this.clientCache = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getStayTimeParams() {
        return this.stayTimeParams;
    }

    public void setStayTimeParams(JSONObject jSONObject) {
        this.stayTimeParams = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getPageName() {
        return this.pageName;
    }

    public void setPageName(String str) {
        this.pageName = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getExpireType() {
        return this.expireType;
    }

    public void setExpireType(String str) {
        this.expireType = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getRemindSection() {
        return this.remindSection;
    }

    public void setRemindSection(JSONObject jSONObject) {
        this.remindSection = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getVersionInfo() {
        return this.versionInfo;
    }

    public void setVersionInfo(JSONObject jSONObject) {
        this.versionInfo = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getTopViewSplashSection() {
        return this.topViewSplashSection;
    }

    public void setTopViewSplashSection(JSONObject jSONObject) {
        this.topViewSplashSection = jSONObject;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getFloatLayerSection() {
        return this.floatLayerSection;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public List<JSONObject> getPopData() {
        return this.homePagePopDatas;
    }

    public List<JSONObject> getHomePagePopDatas() {
        return this.homePagePopDatas;
    }

    public void setHomePagePopDatas(List<JSONObject> list) {
        this.homePagePopDatas = list;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isAbandoned() {
        return getCacheTime() + getExpTimeInterval() <= System.currentTimeMillis();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public void abandonData(String str) {
        setCacheTime(0L);
        setExpireType(str);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isRemote() {
        return this.isRemote;
    }

    public void setRemote(boolean z) {
        this.isRemote = z;
    }

    public void setFloatLayerSection(JSONObject jSONObject) {
        this.floatLayerSection = jSONObject;
    }

    /* renamed from: clone */
    public AwesomeGetContainerInnerData m1103clone() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = new AwesomeGetContainerInnerData();
        awesomeGetContainerInnerData.cacheTime = this.cacheTime;
        awesomeGetContainerInnerData.clientCache = this.clientCache;
        awesomeGetContainerInnerData.dataType = this.dataType;
        awesomeGetContainerInnerData.expTimeInterval = this.expTimeInterval;
        awesomeGetContainerInnerData.dataChange = this.dataChange;
        List<SectionModel> list = this.sections;
        JSONObject jSONObject = null;
        awesomeGetContainerInnerData.sections = list == null ? null : new ArrayList(list);
        awesomeGetContainerInnerData.ext = this.ext;
        awesomeGetContainerInnerData.rangerParams = this.rangerParams;
        awesomeGetContainerInnerData.passParams = this.passParams;
        awesomeGetContainerInnerData.pageParams = this.pageParams.m1106clone();
        awesomeGetContainerInnerData.stayTimeParams = this.stayTimeParams;
        awesomeGetContainerInnerData.expireType = this.expireType;
        awesomeGetContainerInnerData.clientCache = this.clientCache;
        awesomeGetContainerInnerData.remindSection = this.remindSection;
        awesomeGetContainerInnerData.versionInfo = this.versionInfo;
        awesomeGetContainerInnerData.topViewSplashSection = this.topViewSplashSection;
        JSONObject jSONObject2 = this.floatLayerSection;
        if (jSONObject2 != null) {
            jSONObject = new JSONObject(jSONObject2);
        }
        awesomeGetContainerInnerData.floatLayerSection = jSONObject;
        awesomeGetContainerInnerData.homePagePopDatas = this.homePagePopDatas;
        return awesomeGetContainerInnerData;
    }
}
