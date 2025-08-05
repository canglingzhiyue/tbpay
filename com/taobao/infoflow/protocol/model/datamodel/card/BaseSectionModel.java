package com.taobao.infoflow.protocol.model.datamodel.card;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUpdateRuleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public abstract class BaseSectionModel<UPDATE_RULE extends BaseUpdateRuleModel> extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1998703751);
    }

    public abstract BaseSectionModel createBaseSectionModel(JSONObject jSONObject);

    /* renamed from: createBaseSubItemModel */
    public abstract BaseSubItemModel mo1095createBaseSubItemModel(JSONObject jSONObject);

    public abstract JSONObject getArgs();

    /* renamed from: getExposureParam */
    public abstract BaseUtModel mo1096getExposureParam();

    public abstract JSONObject getExt();

    public abstract int getIndex();

    /* renamed from: getItem */
    public abstract BaseItemModel mo1097getItem();

    public abstract int getRealExposeIndex();

    public abstract String getSectionBizCode();

    /* renamed from: getSubSection */
    public abstract BaseSubSectionModel mo1098getSubSection();

    /* renamed from: getTemplate */
    public abstract BaseTemplateModel mo1099getTemplate();

    public abstract List<UPDATE_RULE> getUpdateRules();

    public abstract boolean isRemote();

    public abstract void setCustomSubSection(BaseSubSectionModel baseSubSectionModel);

    public abstract void setRealExposeIndex(int i);

    public abstract JSONObject toJsonObject();

    public BaseSectionModel() {
    }

    public BaseSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
