package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSubSectionModel;

/* loaded from: classes7.dex */
public class PopSubSectionModel extends BasePopSubSectionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PopSectionModel mGuide;
    private PopSectionModel mOverlay;

    public PopSubSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubSectionModel
    /* renamed from: getOverlay */
    public PopSectionModel mo1079getOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSectionModel) ipChange.ipc$dispatch("ba921659", new Object[]{this});
        }
        if (this.mOverlay == null) {
            this.mOverlay = new PopSectionModel(getJSONObject("overlay"));
        }
        return this.mOverlay;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSubSectionModel
    public BasePopSectionModel getGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopSectionModel) ipChange.ipc$dispatch("e6f254f", new Object[]{this});
        }
        if (this.mGuide == null) {
            this.mGuide = new PopSectionModel(getJSONObject(ALBiometricsActivityParentView.n));
        }
        return this.mGuide;
    }
}
