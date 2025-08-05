package com.taobao.android.behavir.config;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.behavixswitch.c;
import tb.kge;

/* loaded from: classes4.dex */
public class BHRTaskConfig extends BHRTaskConfigBase implements Comparable<BHRTaskConfig> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final BHRTaskConfig EMPTY_CONFIG;
    private JSONArray actionNameIn;
    private JSONArray actionTypeIn;
    private JSONObject bizArgsIn;
    private JSONObject bizArgsNIn;
    private JSONArray bizIdIn;
    private c configModel;
    private JSONObject intentionIn;
    private JSONArray sceneIn;
    private JSONArray sceneNIn;

    @Override // com.taobao.android.behavir.config.BHRTaskConfigBase
    public String getTaskType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("68802a44", new Object[]{this}) : "br";
    }

    public BHRTaskConfig(JSONObject jSONObject) {
        super(jSONObject);
        this.sceneIn = jSONObject.getJSONArray("sceneIn");
        this.sceneNIn = jSONObject.getJSONArray("sceneNIn");
        this.actionTypeIn = jSONObject.getJSONArray("actionTypeIn");
        this.actionNameIn = jSONObject.getJSONArray("actionNameIn");
        this.bizIdIn = jSONObject.getJSONArray("bizIdIn");
        this.bizArgsIn = jSONObject.getJSONObject("bizArgsIn");
        this.bizArgsNIn = jSONObject.getJSONObject("bizArgsNIn");
        this.intentionIn = jSONObject.getJSONObject("intentionIn");
        this.configModel = new c(this.sceneIn, this.sceneNIn, this.actionTypeIn, this.actionNameIn, this.bizArgsIn, this.bizArgsNIn, this.intentionIn);
    }

    @Override // com.taobao.android.behavir.config.BHRTaskConfigBase
    public BHRTaskConfigType getConfigType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRTaskConfigType) ipChange.ipc$dispatch("e116d30b", new Object[]{this}) : BHRTaskConfigType.kBHRTaskConfigTypeBR;
    }

    public JSONArray getSceneIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("485d3c5c", new Object[]{this}) : this.sceneIn;
    }

    public JSONArray getSceneNIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("60ccf43a", new Object[]{this}) : this.sceneNIn;
    }

    public JSONArray getActionTypeIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("6830daac", new Object[]{this}) : this.actionTypeIn;
    }

    public JSONArray getActionNameIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("969e5dfb", new Object[]{this}) : this.actionNameIn;
    }

    public JSONArray getBizIdIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("cd64209a", new Object[]{this}) : this.bizIdIn;
    }

    public JSONObject getBizArgsIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("beb10746", new Object[]{this}) : this.bizArgsIn;
    }

    public JSONObject getBizArgsNIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("a0a726a0", new Object[]{this}) : this.bizArgsNIn;
    }

    public c getConfigModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("319ce955", new Object[]{this}) : this.configModel;
    }

    @Override // java.lang.Comparable
    public int compareTo(BHRTaskConfig bHRTaskConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c4f67e8", new Object[]{this, bHRTaskConfig})).intValue();
        }
        if (bHRTaskConfig == null) {
            return 0;
        }
        JSONObject taskInfo = bHRTaskConfig.getTaskInfo();
        JSONObject taskInfo2 = getTaskInfo();
        if (taskInfo != null && taskInfo2 != null) {
            return taskInfo.getIntValue("priority") - taskInfo2.getIntValue("priority");
        }
        return 0;
    }

    static {
        kge.a(-219691067);
        kge.a(415966670);
        EMPTY_CONFIG = new BHRTaskConfig(new JSONObject(0));
    }
}
