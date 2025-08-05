package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import tb.kge;

/* loaded from: classes7.dex */
public class SubSectionModel extends BaseSubSectionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private SectionModel mGuide;
    private SectionModel mOverlay;
    private BaseSectionModel mWindVaneOverlay;

    static {
        kge.a(-1453891372);
    }

    public SubSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    /* renamed from: getOverlay  reason: collision with other method in class */
    public SectionModel mo1101getOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SectionModel) ipChange.ipc$dispatch("d09a4d7e", new Object[]{this});
        }
        if (this.mOverlay == null) {
            this.mOverlay = new SectionModel(getJSONObject("overlay"));
        }
        return this.mOverlay;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    public BaseSectionModel getGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("48be6ef1", new Object[]{this});
        }
        if (this.mGuide == null) {
            this.mGuide = new SectionModel(getJSONObject(ALBiometricsActivityParentView.n));
        }
        return this.mGuide;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    public BaseSectionModel getWindvaneOverlay() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("6f1b57e7", new Object[]{this}) : this.mWindVaneOverlay;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel
    public void setWindVaneOverlay(BaseSectionModel baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ed74b3", new Object[]{this, baseSectionModel});
        } else {
            this.mWindVaneOverlay = baseSectionModel;
        }
    }
}
