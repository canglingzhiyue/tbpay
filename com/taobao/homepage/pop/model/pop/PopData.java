package com.taobao.homepage.pop.model.pop;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.section.PopSectionModel;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.ucp.UCPConfig;
import java.io.Serializable;
import java.util.List;
import tb.lag;

/* loaded from: classes7.dex */
public class PopData implements IPopData<PopSectionModel>, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String POP_KEY_CLIENT_CACHE = "clientCache";
    private String businessID;
    private JSONObject ext;
    private JSONObject passParam;
    private PopConfig popConfig;
    private List<PopSectionModel> sections;
    private UCPConfig ucpConfig;
    private JSONObject uploadData;
    private JSONObject clientParams = new JSONObject(16);
    private boolean isResetData = false;
    private int showCount = 0;

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public String getBusinessID() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this}) : this.businessID;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public List<PopSectionModel> getSections() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("2802a8bc", new Object[]{this}) : this.sections;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public IPopConfig getPopConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopConfig) ipChange.ipc$dispatch("4702e6dc", new Object[]{this}) : this.popConfig;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public lag getUCPConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lag) ipChange.ipc$dispatch("623a013f", new Object[]{this}) : this.ucpConfig;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getUploadData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("4a14c868", new Object[]{this}) : this.uploadData;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isAllowShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b78f9e67", new Object[]{this})).booleanValue();
        }
        PopConfig popConfig = this.popConfig;
        return this.showCount < ((popConfig == null || popConfig.getShowMaxCount() == 0) ? 1 : this.popConfig.getShowMaxCount());
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isFirstShow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dabe76ce", new Object[]{this})).booleanValue() : this.showCount == 0;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public void recordShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da578875", new Object[]{this});
        } else {
            this.showCount++;
        }
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public void resetShowCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d677728a", new Object[]{this});
            return;
        }
        this.showCount = 0;
        PopSectionModel mo1070fetchPopSection = mo1070fetchPopSection();
        this.clientParams.clear();
        mo1070fetchPopSection.getExt().remove("clientCache");
        PopSectionModel popSectionModel = new PopSectionModel(mo1070fetchPopSection);
        this.sections.remove(0);
        this.sections.add(0, popSectionModel);
        this.isResetData = true;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getClientParams() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("851ff3ce", new Object[]{this}) : this.clientParams;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean valid() {
        PopConfig popConfig;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bdc1b687", new Object[]{this})).booleanValue() : (StringUtils.isEmpty(this.businessID) || (popConfig = this.popConfig) == null || (popConfig.getPopContentType() == 1 && mo1070fetchPopSection() == null)) ? false : true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    /* renamed from: fetchPopSection */
    public PopSectionModel mo1070fetchPopSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopSectionModel) ipChange.ipc$dispatch("c85c4eed", new Object[]{this});
        }
        List<PopSectionModel> list = this.sections;
        if (list != null && !list.isEmpty()) {
            return this.sections.get(0);
        }
        return null;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isDeltaRefreshWhiteList(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("447743af", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        PopConfig popConfig = this.popConfig;
        List<String> deltaWhiteList = popConfig == null ? null : popConfig.getDeltaWhiteList();
        if (deltaWhiteList != null && !deltaWhiteList.isEmpty()) {
            return deltaWhiteList.contains(str);
        }
        return false;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public boolean isResetShowCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9260558", new Object[]{this})).booleanValue() : this.isResetData;
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getPassParam() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d42f40ed", new Object[]{this}) : this.passParam;
    }

    public void setPassParam(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4396cf", new Object[]{this, jSONObject});
        } else {
            this.passParam = jSONObject;
        }
    }

    @Override // com.taobao.homepage.pop.protocol.model.pop.IPopData
    public JSONObject getExt() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a08ab512", new Object[]{this}) : this.ext;
    }

    public void setBusinessID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66ae5ae", new Object[]{this, str});
        } else {
            this.businessID = str;
        }
    }

    public void setSections(List<PopSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adf5e828", new Object[]{this, list});
        } else {
            this.sections = list;
        }
    }

    public void setPopConfig(PopConfig popConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd7f5f26", new Object[]{this, popConfig});
        } else {
            this.popConfig = popConfig;
        }
    }

    public void setUcpConfig(UCPConfig uCPConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feeacdad", new Object[]{this, uCPConfig});
        } else {
            this.ucpConfig = uCPConfig;
        }
    }

    public void setUploadData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8f901c", new Object[]{this, jSONObject});
        } else {
            this.uploadData = jSONObject;
        }
    }

    public void setClientParams(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41d4476", new Object[]{this, jSONObject});
        } else {
            this.clientParams = jSONObject;
        }
    }

    public int getShowCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e7a5c3d6", new Object[]{this})).intValue() : this.showCount;
    }

    public void setShowCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d509938c", new Object[]{this, new Integer(i)});
        } else {
            this.showCount = i;
        }
    }

    public void setExt(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef4a04a", new Object[]{this, jSONObject});
        } else {
            this.ext = jSONObject;
        }
    }
}
