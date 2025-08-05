package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import tb.kge;

/* loaded from: classes7.dex */
public class SlideCardData extends BaseCardModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final JSONObject originData;

    static {
        kge.a(-1835525198);
    }

    public SlideCardData(JSONObject jSONObject) {
        this.originData = jSONObject;
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.BaseCardModel, com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        JSONObject jSONObject = this.originData;
        if (jSONObject != null) {
            return jSONObject.getJSONObject("args");
        }
        return null;
    }

    @Override // com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model.BaseCardModel, com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getExposureParam */
    public BaseUtModel mo1096getExposureParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseUtModel) ipChange.ipc$dispatch("aa23cc41", new Object[]{this});
        }
        JSONObject jSONObject = this.originData;
        if (jSONObject != null) {
            return new ExposureParam(jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM));
        }
        return null;
    }
}
