package com.taobao.android.behavir.config;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.util.Utils;
import com.taobao.android.behavir.util.g;
import com.taobao.android.behavix.utils.d;
import com.taobao.orange.OConstant;
import com.taobao.tao.log.TLog;
import java.io.Serializable;
import tb.dsj;
import tb.kge;
import tb.mto;

/* loaded from: classes4.dex */
public abstract class BHRTaskConfigBase implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BHRTaskConfigBase";
    public static final String TYPE_CONFIG_BR = "br";
    public static final String TYPE_CONFIG_UT = "ut";
    private JSONObject attributes;
    private final String configId;
    private final String configName;
    private final Boolean hasDynamicString;
    private boolean isBatchUpload;
    private boolean isDebugLog;
    private final transient JSONObject original;
    private final JSONObject originalTaskInfo;
    private JSONObject taskInfo;
    private double UCPTrackSampling = mto.a.GEO_NOT_SUPPORT;
    private final String taskType = getTaskType();
    public final BHRTaskConfigType configType = getConfigType();

    static {
        kge.a(648271926);
        kge.a(1028243835);
    }

    public boolean checkHasDynamicString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e98e769", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public BHRTaskConfigBase(JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.original = jSONObject;
        this.configId = jSONObject.getString("configId");
        this.configName = jSONObject.getString(OConstant.DIMEN_CONFIG_NAME);
        Object obj = jSONObject.get("task");
        obj = obj == null ? jSONObject.get("taskArray") : obj;
        if (obj instanceof JSONObject) {
            this.taskInfo = (JSONObject) obj;
        } else if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.size() > 0) {
                this.taskInfo = jSONArray.getJSONObject(0);
            } else {
                this.taskInfo = null;
            }
        } else {
            this.taskInfo = null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("attributes");
        if (jSONObject3 != null && (jSONObject2 = this.taskInfo) != null) {
            jSONObject2.putAll(jSONObject3);
        }
        this.originalTaskInfo = this.taskInfo;
        this.hasDynamicString = Boolean.valueOf(checkHasDynamicString());
    }

    public BHRTaskConfigType getConfigType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BHRTaskConfigType) ipChange.ipc$dispatch("e116d30b", new Object[]{this});
        }
        String str = this.taskType;
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 3152) {
            if (hashCode == 3743 && str.equals(TYPE_CONFIG_UT)) {
                c = 0;
            }
        } else if (str.equals("br")) {
            c = 1;
        }
        if (c == 0) {
            return BHRTaskConfigType.kBHRTaskConfigTypeUT;
        }
        if (c == 1) {
            return BHRTaskConfigType.kBHRTaskConfigTypeBR;
        }
        return BHRTaskConfigType.kBHRTaskConfigTypeUndefined;
    }

    public String getTaskType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68802a44", new Object[]{this});
        }
        JSONObject jSONObject = this.original;
        return jSONObject == null ? "" : Utils.a(jSONObject.getString("type"));
    }

    public String getConfigId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f992a366", new Object[]{this}) : this.configId;
    }

    public String getConfigName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d054f1f6", new Object[]{this}) : this.configName;
    }

    public JSONObject getTaskInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ee9a2470", new Object[]{this});
        }
        JSONObject jSONObject = this.taskInfo;
        return jSONObject != null ? jSONObject : g.EMPTY_JSON;
    }

    public JSONObject getOriginal() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("9f09436e", new Object[]{this}) : this.original;
    }

    public JSONObject toJson() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("705c882a", new Object[]{this}) : this.original;
    }

    public boolean enableDebugLog() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbfe011f", new Object[]{this})).booleanValue() : this.isDebugLog;
    }

    public boolean shouldUploadTrackSampling() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("503392a9", new Object[]{this})).booleanValue();
        }
        if (d.a()) {
            return true;
        }
        if (this.UCPTrackSampling > mto.a.GEO_NOT_SUPPORT) {
            if (isMatchTrackSampling()) {
                return true;
            }
        } else if (enableDebugLog()) {
            return true;
        }
        return false;
    }

    private boolean isMatchTrackSampling() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("584d5c62", new Object[]{this})).booleanValue() : isMatchTrackSimpling(this.UCPTrackSampling);
    }

    public static boolean isMatchTrackSimpling(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeebba9c", new Object[]{new Double(d)})).booleanValue();
        }
        if (Double.compare(d, 1.0d) >= 0) {
            return true;
        }
        if (TextUtils.isEmpty(dsj.f26943a)) {
            return false;
        }
        try {
            return ((double) (Long.parseLong(dsj.f26943a) % 10000)) < d * 10000.0d;
        } catch (Throwable th) {
            TLog.loge("UtUtils", "parse user id error.", th);
            return false;
        }
    }

    public boolean isBatchUpload() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c0a8e5c", new Object[]{this})).booleanValue() : this.isBatchUpload;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : new Pair(this.configId, this.configName).hashCode();
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof BHRTaskConfigBase) {
            BHRTaskConfigBase bHRTaskConfigBase = (BHRTaskConfigBase) obj;
            if (TextUtils.equals(this.configId, bHRTaskConfigBase.configId) && TextUtils.equals(this.configName, bHRTaskConfigBase.configName)) {
                return true;
            }
        }
        return false;
    }
}
