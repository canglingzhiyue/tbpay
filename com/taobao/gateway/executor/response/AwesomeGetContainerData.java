package com.taobao.gateway.executor.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;

/* loaded from: classes7.dex */
public class AwesomeGetContainerData implements Serializable, IMTOPDataObject {
    public AwesomeGetContainerInnerData base;
    public AwesomeGetContainerInnerData delta;
    public List<SectionModel> totalSectionList = new ArrayList();

    static {
        kge.a(645472392);
        kge.a(1028243835);
        kge.a(-350052935);
    }

    public JSONObject getExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.ext;
    }

    public JSONObject getDeltaExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.ext;
    }

    public JSONObject getRangerParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.rangerParams;
    }

    public JSONObject getPassParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.passParams;
    }

    public JSONObject getClientCache() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.clientCache;
    }

    public JSONObject getClientCacheDelta() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.clientCache;
    }

    public List<SectionModel> getBaseData() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.sections == null || this.base.sections.isEmpty()) {
            return null;
        }
        return this.base.sections;
    }

    public List<SectionModel> getDeltaData() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.sections == null || this.delta.sections.isEmpty()) {
            return null;
        }
        return this.delta.sections;
    }

    public List<SectionModel> getTotalData() {
        if (this.totalSectionList == null) {
            this.totalSectionList = new ArrayList();
        }
        return this.totalSectionList;
    }

    public int getPageNum() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.pageParams == null) {
            return 0;
        }
        return this.base.pageParams.pageNum;
    }

    public boolean isLastPage() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.pageParams == null) {
            return true;
        }
        return HomePageUtility.a(this.base.pageParams.isLastPage);
    }

    public void abandonData() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerInnerData.cacheTime = 0L;
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = this.delta;
        if (awesomeGetContainerInnerData2 != null) {
            awesomeGetContainerInnerData2.cacheTime = 0L;
        }
    }

    public boolean isDeltaAbandoned() {
        return isCacheTimeout(this.delta);
    }

    public boolean isBaseAbandoned() {
        return isCacheTimeout(this.base);
    }

    private boolean isCacheTimeout(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        return awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.cacheTime + awesomeGetContainerInnerData.expTimeInterval <= System.currentTimeMillis();
    }

    public JSONObject getVersionInfo() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.versionInfo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public AwesomeGetContainerData m1064clone() {
        AwesomeGetContainerData awesomeGetContainerData = new AwesomeGetContainerData();
        awesomeGetContainerData.base = this.base.m1065clone();
        awesomeGetContainerData.delta = this.delta.m1065clone();
        return awesomeGetContainerData;
    }

    public String toString() {
        return (this.delta == null || this.base == null) ? this.delta != null ? "[delta]" : this.base != null ? "[base]" : MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : "[delta,base]";
    }
}
