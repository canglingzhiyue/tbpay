package com.taobao.informationflowdataservice.dataservice.core.datasource.model.response;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.media.MediaConstant;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.kge;
import tb.lwg;
import tb.lwz;
import tb.lxo;
import tb.tim;

/* loaded from: classes7.dex */
public class AwesomeGetContainerData implements IContainerDataModel<SectionModel>, IMTOPDataObject {
    public static final String FLAG_CACHE = "1";
    private static final String TAG = "AwesomeGetContainerData";
    private AwesomeGetContainerInnerData base;
    private String containerId;
    private AwesomeGetContainerInnerData delta;
    private boolean isContainsTab;
    private List<SectionModel> totalSectionList = new ArrayList();

    static {
        kge.a(669860985);
        kge.a(1421315462);
        kge.a(-350052935);
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
        awesomeGetContainerInnerData.setSections(list);
        this.totalSectionList = new lwg().a((lwz) null, this.containerId, this, this);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public void updateDeltaSections(List<SectionModel> list) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return;
        }
        awesomeGetContainerInnerData.setSections(list);
        this.totalSectionList = new lwg().a((lwz) null, this.containerId, this, this);
    }

    public void setContainerId(String str) {
        this.containerId = str;
    }

    public void setBase(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        this.base = awesomeGetContainerInnerData;
    }

    public void setDelta(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        this.delta = awesomeGetContainerInnerData;
    }

    public JSONObject getExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getExt();
    }

    public JSONObject getDeltaExt() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getExt();
    }

    public JSONObject getRangerParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getRangerParams();
    }

    public JSONObject getPassParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getPassParams();
    }

    public JSONObject getVersionInfo() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getVersionInfo();
    }

    public JSONObject getClientCache() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getClientCache();
    }

    public JSONObject getClientCacheDelta() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.delta;
        if (awesomeGetContainerInnerData == null) {
            return null;
        }
        return awesomeGetContainerInnerData.getClientCache();
    }

    public List<SectionModel> getBaseData() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getSections() == null || this.base.getSections().isEmpty()) {
            return null;
        }
        return this.base.getSections();
    }

    public List<SectionModel> getDeltaData() {
        try {
            if (this.delta != null && this.delta.getSections() != null && !this.delta.getSections().isEmpty()) {
                return this.delta.getSections();
            }
            return null;
        } catch (Throwable th) {
            lxo.a(TAG, th.getMessage());
            return null;
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel
    public List<SectionModel> getTotalData() {
        if (this.totalSectionList == null) {
            this.totalSectionList = new ArrayList();
        }
        return this.totalSectionList;
    }

    public void setTotalData(List<SectionModel> list) {
        this.totalSectionList = list;
    }

    public AwesomeGetPageData getPageParams() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.mo1280getPageParams() == null) {
            return null;
        }
        return this.base.mo1280getPageParams();
    }

    public JSONObject getBaseRemind() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getRemindSection() == null) {
            return null;
        }
        return this.base.getRemindSection();
    }

    public int getPageNum() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.mo1280getPageParams() == null) {
            return 0;
        }
        return this.base.mo1280getPageParams().getPageNum();
    }

    public boolean isLastPage() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.mo1280getPageParams() == null) {
            return true;
        }
        return this.base.mo1280getPageParams().isLastPage();
    }

    public int getRequestInAdvanceNum() {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.mo1280getPageParams() == null) {
            return 10;
        }
        return this.base.mo1280getPageParams().getRequestInAdvance();
    }

    public void abandonData(String str) {
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        if (awesomeGetContainerInnerData != null) {
            awesomeGetContainerInnerData.setCacheTime(0L);
            this.base.setExpireType(str);
        }
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = this.delta;
        if (awesomeGetContainerInnerData2 != null) {
            awesomeGetContainerInnerData2.setCacheTime(0L);
        }
    }

    public boolean isDeltaAbandoned() {
        return isCacheTimeout(this.delta);
    }

    public boolean isBaseAbandoned() {
        return isCacheTimeout(this.base);
    }

    public boolean isContainsTab() {
        return this.isContainsTab;
    }

    public void setContainsTab(boolean z) {
        this.isContainsTab = z;
    }

    private boolean isCacheTimeout(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        return awesomeGetContainerInnerData == null || awesomeGetContainerInnerData.getCacheTime() + awesomeGetContainerInnerData.getExpTimeInterval() <= System.currentTimeMillis();
    }

    public boolean isRemoteData() {
        JSONObject jSONObject;
        try {
            if (this.base != null && this.base.getSections() != null && this.base.getSections().size() > 0 && (jSONObject = this.base.getSections().get(0).getJSONObject("args")) != null) {
                if (!"1".equals(jSONObject.get(tim.S_ARGS_IS_CLIENT_CACHE))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            lxo.a(TAG, "isRemoteData error : " + th.getMessage());
        }
        return false;
    }

    public boolean isBaseDataChange() {
        return getBase() != null && getBase().isDataChange();
    }

    public boolean isDeltaDataChange() {
        return getDelta() != null && getDelta().isDataChange();
    }

    /* renamed from: clone */
    public AwesomeGetContainerData m1102clone() {
        AwesomeGetContainerData awesomeGetContainerData = new AwesomeGetContainerData();
        AwesomeGetContainerInnerData awesomeGetContainerInnerData = this.base;
        AwesomeGetContainerInnerData awesomeGetContainerInnerData2 = null;
        awesomeGetContainerData.base = awesomeGetContainerInnerData == null ? null : awesomeGetContainerInnerData.m1103clone();
        AwesomeGetContainerInnerData awesomeGetContainerInnerData3 = this.delta;
        if (awesomeGetContainerInnerData3 != null) {
            awesomeGetContainerInnerData2 = awesomeGetContainerInnerData3.m1103clone();
        }
        awesomeGetContainerData.delta = awesomeGetContainerInnerData2;
        return awesomeGetContainerData;
    }

    public String toString() {
        return (this.delta == null || this.base == null) ? this.delta != null ? "[delta]" : this.base != null ? "[base]" : MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : "[delta,base]";
    }
}
