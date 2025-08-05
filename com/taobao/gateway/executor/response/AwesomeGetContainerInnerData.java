package com.taobao.gateway.executor.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetContainerInnerData implements Serializable, IMTOPDataObject {
    public long cacheTime;
    public JSONObject clientCache;
    public long dataCacheTime;
    public boolean dataChange = true;
    public String dataType;
    public long expTimeInterval;
    public JSONObject ext;
    public String pageName;
    public AwesomeGetPageData pageParams;
    public JSONObject passParams;
    public JSONObject rangerParams;
    public JSONObject remindSection;
    public List<SectionModel> sections;
    public JSONObject splashSection;
    public JSONObject stayTimeParams;
    public JSONObject versionInfo;

    static {
        kge.a(2078818562);
        kge.a(-350052935);
        kge.a(1028243835);
    }

    /* renamed from: clone */
    public AwesomeGetContainerInnerData m1065clone() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = new AwesomeGetContainerInnerData();
        awesomeGetContainerInnerData.cacheTime = this.cacheTime;
        awesomeGetContainerInnerData.dataType = this.dataType;
        awesomeGetContainerInnerData.expTimeInterval = this.expTimeInterval;
        awesomeGetContainerInnerData.dataChange = this.dataChange;
        awesomeGetContainerInnerData.sections = new ArrayList(this.sections);
        awesomeGetContainerInnerData.ext = this.ext;
        awesomeGetContainerInnerData.rangerParams = this.rangerParams;
        awesomeGetContainerInnerData.passParams = this.passParams;
        awesomeGetContainerInnerData.stayTimeParams = this.stayTimeParams;
        awesomeGetContainerInnerData.remindSection = this.remindSection;
        awesomeGetContainerInnerData.splashSection = this.splashSection;
        awesomeGetContainerInnerData.versionInfo = this.versionInfo;
        return awesomeGetContainerInnerData;
    }
}
