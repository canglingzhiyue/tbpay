package com.taobao.informationflowdataservice.dataservice.core.datasource.model.card;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.h;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class SectionModel extends BaseSectionModel<UpdateRuleModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isRemote;
    private ItemModel mItemModel;
    private int mRealExposeIndex;
    private SubSectionModel mSubSectionModel;
    private TemplateModel mTemplateModel;
    private List<UpdateRuleModel> mUpdateRuleModels;
    private UtModel mUtModel;

    static {
        kge.a(1421854228);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject toJsonObject() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3f8765c9", new Object[]{this}) : this;
    }

    public SectionModel() {
        this.isRemote = true;
        this.mRealExposeIndex = -1;
    }

    public SectionModel(JSONObject jSONObject) {
        super(jSONObject);
        this.isRemote = true;
        this.mRealExposeIndex = -1;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public JSONObject getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7c869f7a", new Object[]{this}) : getJSONObject("args");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getExposureParam  reason: collision with other method in class */
    public UtModel mo1096getExposureParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UtModel) ipChange.ipc$dispatch("26118e14", new Object[]{this});
        }
        if (this.mUtModel == null) {
            JSONObject jSONObject = getJSONObject(h.TRACK_EXPOSURE_PARAM);
            if (jSONObject == null) {
                return null;
            }
            this.mUtModel = new UtModel(jSONObject);
        }
        return this.mUtModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
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

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public String getSectionBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("275317a8", new Object[]{this}) : getString("sectionBizCode");
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getTemplate  reason: collision with other method in class */
    public TemplateModel mo1099getTemplate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateModel) ipChange.ipc$dispatch("c83bd38f", new Object[]{this});
        }
        if (this.mTemplateModel == null) {
            JSONObject jSONObject = getJSONObject("template");
            if (jSONObject == null) {
                return null;
            }
            this.mTemplateModel = new TemplateModel(jSONObject);
        }
        return this.mTemplateModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getSubSection  reason: collision with other method in class */
    public SubSectionModel mo1098getSubSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubSectionModel) ipChange.ipc$dispatch("fde0f56f", new Object[]{this});
        }
        if (this.mSubSectionModel == null) {
            JSONObject jSONObject = getJSONObject("subSection");
            if (jSONObject == null) {
                return null;
            }
            this.mSubSectionModel = new SubSectionModel(jSONObject);
        }
        return this.mSubSectionModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: getItem  reason: collision with other method in class */
    public ItemModel mo1097getItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemModel) ipChange.ipc$dispatch("84ec3baf", new Object[]{this});
        }
        if (this.mItemModel == null) {
            JSONObject jSONObject = getJSONObject("item");
            if (jSONObject == null) {
                return null;
            }
            this.mItemModel = new ItemModel(jSONObject);
        }
        return this.mItemModel;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
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

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public void setRealExposeIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe8a1ee", new Object[]{this, new Integer(i)});
        } else {
            this.mRealExposeIndex = i;
        }
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public int getRealExposeIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("87ec0834", new Object[]{this})).intValue() : this.mRealExposeIndex;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
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

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public List<UpdateRuleModel> getUpdateRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ef454f68", new Object[]{this});
        }
        if (this.mUpdateRuleModels == null) {
            JSONArray jSONArray = getJSONArray("updateRules");
            if (jSONArray == null || jSONArray.size() <= 0) {
                return null;
            }
            this.mUpdateRuleModels = new ArrayList();
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    this.mUpdateRuleModels.add(new UpdateRuleModel((JSONObject) next));
                }
            }
        }
        return this.mUpdateRuleModels;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    /* renamed from: createBaseSubItemModel  reason: collision with other method in class */
    public SubItemModel mo1095createBaseSubItemModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SubItemModel) ipChange.ipc$dispatch("27a612d1", new Object[]{this, jSONObject}) : new SubItemModel(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public BaseSectionModel createBaseSectionModel(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseSectionModel) ipChange.ipc$dispatch("f9f699c6", new Object[]{this, jSONObject}) : new SectionModel(jSONObject);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel
    public void setCustomSubSection(BaseSubSectionModel baseSubSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7f59321", new Object[]{this, baseSubSectionModel});
        } else if (baseSubSectionModel == null || !(baseSubSectionModel instanceof SubSectionModel)) {
        } else {
            this.mSubSectionModel = (SubSectionModel) baseSubSectionModel;
        }
    }
}
