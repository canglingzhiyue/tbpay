package com.taobao.homepage.pop.model.section;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class PopSectionModel extends BasePopSectionModel<PopUpdateRuleModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isRemote;
    private PopItemModel mItemModel;
    private int mRealExposeIndex;
    private PopSectionConfigModel mSectionConfig;
    private PopSubSectionModel mSubSectionModel;
    private PopTemplateModel mTemplateModel;
    private List<PopUpdateRuleModel> mUpdateRuleModels;
    private PopUtModel mUtModel;

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3f8765c9", new Object[]{this}) : this;
    }

    public PopSectionModel() {
        this.isRemote = true;
        this.mRealExposeIndex = -1;
    }

    public PopSectionModel(JSONObject jSONObject) {
        super(jSONObject);
        this.isRemote = true;
        this.mRealExposeIndex = -1;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this}) : getJSONObject("args");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    /* renamed from: getExposureParam */
    public PopUtModel mo1073getExposureParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopUtModel) ipChange.ipc$dispatch("9fbc0559", new Object[]{this});
        }
        if (this.mUtModel == null) {
            JSONObject jSONObject = getJSONObject(h.TRACK_EXPOSURE_PARAM);
            if (jSONObject == null) {
                return null;
            }
            this.mUtModel = new PopUtModel(jSONObject);
        }
        return this.mUtModel;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this});
        }
        JSONObject jSONObject = getJSONObject("ext");
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        put("ext", (Object) jSONObject2);
        return jSONObject2;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public String getSectionBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("275317a8", new Object[]{this}) : getString("sectionBizCode");
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    /* renamed from: getTemplate */
    public PopTemplateModel mo1077getTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopTemplateModel) ipChange.ipc$dispatch("2e4b9314", new Object[]{this});
        }
        if (this.mTemplateModel == null) {
            JSONObject jSONObject = getJSONObject("template");
            if (jSONObject == null) {
                return null;
            }
            this.mTemplateModel = new PopTemplateModel(jSONObject);
        }
        return this.mTemplateModel;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    /* renamed from: getSubSection */
    public PopSubSectionModel mo1076getSubSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSubSectionModel) ipChange.ipc$dispatch("50302e34", new Object[]{this});
        }
        if (this.mSubSectionModel == null) {
            JSONObject jSONObject = getJSONObject("subSection");
            if (jSONObject == null) {
                return null;
            }
            this.mSubSectionModel = new PopSubSectionModel(jSONObject);
        }
        return this.mSubSectionModel;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    /* renamed from: getItem */
    public PopItemModel mo1074getItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopItemModel) ipChange.ipc$dispatch("558ddd34", new Object[]{this});
        }
        if (this.mItemModel == null) {
            JSONObject jSONObject = getJSONObject("item");
            if (jSONObject == null) {
                return null;
            }
            this.mItemModel = new PopItemModel(jSONObject);
        }
        return this.mItemModel;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public boolean isRemote() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bf69e69b", new Object[]{this})).booleanValue() : this.isRemote;
    }

    public void setRemote(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f21abce5", new Object[]{this, new Boolean(z)});
        } else {
            this.isRemote = z;
        }
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public void setRealExposeIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe8a1ee", new Object[]{this, new Integer(i)});
        } else {
            this.mRealExposeIndex = i;
        }
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public int getRealExposeIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87ec0834", new Object[]{this})).intValue() : this.mRealExposeIndex;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue();
        }
        try {
            return Integer.parseInt(getString("index"));
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public List<PopUpdateRuleModel> getUpdateRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef454f68", new Object[]{this});
        }
        if (this.mUpdateRuleModels == null) {
            JSONArray jSONArray = getJSONArray("updateRule");
            if (jSONArray == null || jSONArray.size() <= 0) {
                return null;
            }
            this.mUpdateRuleModels = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    this.mUpdateRuleModels.add(new PopUpdateRuleModel((JSONObject) next));
                }
            }
        }
        return this.mUpdateRuleModels;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    /* renamed from: getSectionConfig */
    public PopSectionConfigModel mo1075getSectionConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSectionConfigModel) ipChange.ipc$dispatch("fa2305b2", new Object[]{this});
        }
        if (this.mSectionConfig == null) {
            JSONObject jSONObject = getJSONObject("sectionConfig");
            if (jSONObject == null || jSONObject.size() <= 0) {
                return null;
            }
            this.mSectionConfig = new PopSectionConfigModel(jSONObject);
        }
        return this.mSectionConfig;
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    /* renamed from: createBaseSubItemModel */
    public PopSubItemModel mo1072createBaseSubItemModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopSubItemModel) ipChange.ipc$dispatch("b4f79a2c", new Object[]{this, jSONObject}) : new PopSubItemModel(jSONObject);
    }

    @Override // com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel
    public BasePopSectionModel createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BasePopSectionModel) ipChange.ipc$dispatch("bfa75024", new Object[]{this, jSONObject}) : new PopSectionModel(jSONObject);
    }
}
