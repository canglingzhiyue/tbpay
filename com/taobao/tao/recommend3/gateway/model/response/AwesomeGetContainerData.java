package com.taobao.tao.recommend3.gateway.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.gateway.util.d;
import com.taobao.android.home.component.utils.e;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.opb;

/* loaded from: classes.dex */
public class AwesomeGetContainerData implements IContainerDataModel<SectionModel>, Serializable, IMTOPDataObject {
    private static final String TAG = "AwesomeGetContainerData";
    public AwesomeGetContainerInnerData base;
    public String containerId;
    public AwesomeGetContainerInnerData delta;
    public JSONObject parentExt;
    public int r4uAnchor = Integer.MAX_VALUE;
    public List<SectionModel> totalSectionList = new ArrayList();

    static {
        kge.a(-889189485);
        kge.a(1028243835);
        kge.a(-350052935);
        kge.a(1421315462);
    }

    public JSONObject getExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.ext;
    }

    public JSONObject getParentExt() {
        JSONObject jSONObject = this.parentExt;
        return jSONObject == null ? new JSONObject() : jSONObject;
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

    public JSONObject getVersionInfo() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.versionInfo;
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
        try {
            if (this.delta != null && this.delta.sections != null && !this.delta.sections.isEmpty()) {
                return this.delta.sections;
            }
            return null;
        } catch (Throwable th) {
            e.e(TAG, th.getMessage());
            return null;
        }
    }

    public synchronized void setBaseSync(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        this.base = awesomeGetContainerInnerData;
    }

    public synchronized void setTotalSectionListSync(List<SectionModel> list) {
        this.totalSectionList = list;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public List<SectionModel> getTotalData() {
        if (this.totalSectionList == null) {
            this.totalSectionList = new ArrayList();
        }
        return this.totalSectionList;
    }

    public AwesomeGetPageData getPageParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.pageParams == null) {
            return null;
        }
        return this.base.pageParams;
    }

    public JSONObject getBaseRemind() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.remindSection == null) {
            return null;
        }
        return this.base.remindSection;
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
        return d.a(this.base.pageParams.isLastPage);
    }

    public int getRequestInAdvanceNum() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.pageParams == null) {
            return 10;
        }
        return this.base.pageParams.requestInAdvance;
    }

    public int getR4uAnchor() {
        return this.r4uAnchor;
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

    public boolean isEmpty() {
        return getTotalData().isEmpty();
    }

    public synchronized boolean isEmptySync() {
        return getTotalData().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public AwesomeGetContainerData m1278clone() {
        AwesomeGetContainerData awesomeGetContainerData = new AwesomeGetContainerData();
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerData.base = awesomeGetContainerInnerData.m1279clone();
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = this.delta;
        if (awesomeGetContainerInnerData2 != null) {
            awesomeGetContainerData.delta = awesomeGetContainerInnerData2.m1279clone();
        }
        return awesomeGetContainerData;
    }

    public String toString() {
        return (this.delta == null || this.base == null) ? this.delta != null ? "[delta]" : this.base != null ? "[base]" : MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : "[delta,base]";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public IContainerInnerDataModel<SectionModel> getBase() {
        return this.base;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public IContainerInnerDataModel<SectionModel> getDelta() {
        return this.delta;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public void updateBaseSections(List<SectionModel> list) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return;
        }
        awesomeGetContainerInnerData.sections = list;
        this.totalSectionList = opb.a(this.containerId, this, this);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public void updateDeltaSections(List<SectionModel> list) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return;
        }
        awesomeGetContainerInnerData.sections = list;
        this.totalSectionList = opb.a(this.containerId, this, this);
    }

    public boolean supportInsertSections() {
        if (this.base == null) {
            return false;
        }
        JSONObject insertParam = getInsertParam();
        return this.base.insertSections != null && !this.base.insertSections.isEmpty() && insertParam != null && !insertParam.getBooleanValue("hasInsert");
    }

    public List<SectionModel> getInsertSections() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.insertSections == null) {
            return null;
        }
        return this.base.insertSections;
    }

    public JSONObject getInsertParam() {
        JSONObject ext = getExt();
        if (ext == null) {
            return null;
        }
        return ext.getJSONObject("insertExpParams");
    }
}
