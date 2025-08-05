package com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseTemplateModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseUtModel;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class BaseCardModel extends BaseSectionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(301797935);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: createBaseSubItemModel */
    public BaseSubItemModel mo1095createBaseSubItemModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubItemModel) ipChange.ipc$dispatch("eeddb606", new Object[]{this, jSONObject});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getExposureParam */
    public BaseUtModel mo1096getExposureParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseUtModel) ipChange.ipc$dispatch("aa23cc41", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getItem */
    public BaseItemModel mo1097getItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseItemModel) ipChange.ipc$dispatch("57f770ae", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public int getRealExposeIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ec0834", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public String getSectionBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("275317a8", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getSubSection */
    public BaseSubSectionModel mo1098getSubSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSubSectionModel) ipChange.ipc$dispatch("d5b66c52", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getTemplate */
    public BaseTemplateModel mo1099getTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseTemplateModel) ipChange.ipc$dispatch("cc7003bc", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public List getUpdateRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef454f68", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public boolean isRemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public void setCustomSubSection(BaseSubSectionModel baseSubSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f59321", new Object[]{this, baseSubSectionModel});
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public void setRealExposeIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe8a1ee", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f8765c9", new Object[]{this});
        }
        return null;
    }

    public BaseCardModel() {
    }

    public BaseCardModel(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public BaseSectionModel createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject}) : new BaseCardModel(jSONObject);
    }
}
