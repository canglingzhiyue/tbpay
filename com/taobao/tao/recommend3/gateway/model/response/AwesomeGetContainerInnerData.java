package com.taobao.tao.recommend3.gateway.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes.dex */
public class AwesomeGetContainerInnerData implements IContainerInnerDataModel<SectionModel>, Serializable, IMTOPDataObject {
    public long cacheTime;
    public JSONObject clientCache;
    public long dataCacheTime;
    public String dataType;
    public long expTimeInterval;
    public String expireType;
    public JSONObject ext;
    public JSONObject extSections;
    public List<JSONObject> homePagePopDatas;
    public String infoFlowCardPopBizCode;
    public String infoFlowCardStartBizCode;
    public List<SectionModel> insertSections;
    public String pageName;
    public AwesomeGetPageData pageParams;
    public JSONObject passParams;
    public JSONObject rangerParams;
    public JSONObject remindSection;
    public List<SectionModel> sections;
    public JSONObject stayTimeParams;
    public JSONObject topViewSplashSection;
    public JSONObject versionInfo;
    public boolean dataChange = true;
    public int infoFlowCardStartOffset = 0;
    public boolean isFirstPage = false;
    public boolean isCacheData = false;

    static {
        kge.a(-792623913);
        kge.a(-350052935);
        kge.a(1028243835);
        kge.a(1806403682);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getFloatLayerSection() {
        return null;
    }

    /* renamed from: clone */
    public AwesomeGetContainerInnerData m1279clone() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = new AwesomeGetContainerInnerData();
        awesomeGetContainerInnerData.cacheTime = this.cacheTime;
        awesomeGetContainerInnerData.dataCacheTime = this.dataCacheTime;
        awesomeGetContainerInnerData.dataType = this.dataType;
        awesomeGetContainerInnerData.expTimeInterval = this.expTimeInterval;
        awesomeGetContainerInnerData.dataChange = this.dataChange;
        List<SectionModel> list = this.sections;
        if (list != null) {
            awesomeGetContainerInnerData.sections = new ArrayList(list);
        }
        awesomeGetContainerInnerData.ext = this.ext;
        awesomeGetContainerInnerData.rangerParams = this.rangerParams;
        awesomeGetContainerInnerData.passParams = this.passParams;
        awesomeGetContainerInnerData.pageParams = this.pageParams;
        awesomeGetContainerInnerData.clientCache = this.clientCache;
        awesomeGetContainerInnerData.stayTimeParams = this.stayTimeParams;
        awesomeGetContainerInnerData.pageName = this.pageName;
        awesomeGetContainerInnerData.expireType = this.expireType;
        awesomeGetContainerInnerData.remindSection = this.remindSection;
        awesomeGetContainerInnerData.versionInfo = this.versionInfo;
        awesomeGetContainerInnerData.topViewSplashSection = this.topViewSplashSection;
        awesomeGetContainerInnerData.extSections = this.extSections;
        awesomeGetContainerInnerData.infoFlowCardStartOffset = this.infoFlowCardStartOffset;
        awesomeGetContainerInnerData.infoFlowCardStartBizCode = this.infoFlowCardStartBizCode;
        awesomeGetContainerInnerData.infoFlowCardPopBizCode = this.infoFlowCardPopBizCode;
        awesomeGetContainerInnerData.isFirstPage = this.isFirstPage;
        awesomeGetContainerInnerData.isCacheData = this.isCacheData;
        awesomeGetContainerInnerData.homePagePopDatas = this.homePagePopDatas;
        awesomeGetContainerInnerData.insertSections = this.insertSections;
        return awesomeGetContainerInnerData;
    }

    public int getFirstRequestInAdvance() {
        AwesomeGetPageData awesomeGetPageData = this.pageParams;
        if (awesomeGetPageData == null) {
            return -1;
        }
        return awesomeGetPageData.firstRequestInAdvance;
    }

    public void initCacheRequestInAdvance() {
        AwesomeGetPageData awesomeGetPageData = this.pageParams;
        if (awesomeGetPageData == null || awesomeGetPageData.firstRequestInAdvance < 0) {
            setRequestInAdvance(j.a("cacheRequestInAdvance", 0));
        }
    }

    public void setRequestInAdvance(int i) {
        AwesomeGetPageData awesomeGetPageData = this.pageParams;
        if (awesomeGetPageData != null) {
            awesomeGetPageData.requestInAdvance = i;
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getDataType() {
        return this.dataType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getCacheTime() {
        return this.cacheTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getDataCacheTime() {
        return this.dataCacheTime;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public long getExpTimeInterval() {
        return this.expTimeInterval;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isDataChange() {
        return this.dataChange;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public List<SectionModel> getSections() {
        return this.sections;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getExt() {
        return this.ext;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getRangerParams() {
        return this.rangerParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getPassParams() {
        return this.passParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    /* renamed from: getPageParams  reason: collision with other method in class */
    public AwesomeGetPageData mo1280getPageParams() {
        return this.pageParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getClientCache() {
        return this.clientCache;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getStayTimeParams() {
        return this.stayTimeParams;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getPageName() {
        return this.pageName;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public String getExpireType() {
        return this.expireType;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getRemindSection() {
        return this.remindSection;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getVersionInfo() {
        return this.versionInfo;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public JSONObject getTopViewSplashSection() {
        return this.topViewSplashSection;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isAbandoned() {
        return getCacheTime() + getExpTimeInterval() <= System.currentTimeMillis();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public void abandonData(String str) {
        this.cacheTime = 0L;
        this.expireType = str;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public boolean isRemote() {
        return !this.isCacheData;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel
    public List<JSONObject> getPopData() {
        return this.homePagePopDatas;
    }
}
