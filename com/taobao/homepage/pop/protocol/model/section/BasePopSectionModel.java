package com.taobao.homepage.pop.protocol.model.section;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.section.BasePopUpdateRuleModel;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public abstract class BasePopSectionModel<UPDATE_RULE extends BasePopUpdateRuleModel> extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(997315177);
    }

    public abstract BasePopSectionModel createBaseSectionModel(JSONObject jSONObject);

    /* renamed from: createBaseSubItemModel */
    public abstract BasePopSubItemModel mo1072createBaseSubItemModel(JSONObject jSONObject);

    public abstract JSONObject getArgs();

    /* renamed from: getExposureParam */
    public abstract BasePopUtModel mo1073getExposureParam();

    public abstract JSONObject getExt();

    public abstract int getIndex();

    /* renamed from: getItem */
    public abstract BasePopItemModel mo1074getItem();

    public abstract int getRealExposeIndex();

    public abstract String getSectionBizCode();

    /* renamed from: getSectionConfig */
    public abstract BasePopSectionConfigModel mo1075getSectionConfig();

    /* renamed from: getSubSection */
    public abstract BasePopSubSectionModel mo1076getSubSection();

    /* renamed from: getTemplate */
    public abstract BasePopTemplateModel mo1077getTemplate();

    public abstract List<UPDATE_RULE> getUpdateRules();

    public abstract boolean isRemote();

    public abstract void setRealExposeIndex(int i);

    public abstract JSONObject toJsonObject();

    public BasePopSectionModel() {
    }

    public BasePopSectionModel(JSONObject jSONObject) {
        super(jSONObject);
    }
}
