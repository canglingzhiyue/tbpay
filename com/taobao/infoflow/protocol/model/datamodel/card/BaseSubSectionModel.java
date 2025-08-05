package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class BaseSubSectionModel extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-693902975);
    }

    public abstract BaseSectionModel getGuide();

    /* renamed from: getOverlay */
    public abstract BaseSectionModel mo1101getOverlay();

    public abstract BaseSectionModel getWindvaneOverlay();

    public abstract void setWindVaneOverlay(BaseSectionModel<?> baseSectionModel);

    public BaseSubSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
