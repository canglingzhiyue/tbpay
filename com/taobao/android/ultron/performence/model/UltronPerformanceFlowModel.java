package com.taobao.android.ultron.performence.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.jqg;
import tb.kge;

/* loaded from: classes6.dex */
public final class UltronPerformanceFlowModel implements d, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String sDimensionSplit = ",";
    @JSONField(name = "bizCode")
    public final String mBizCode;
    @JSONField(name = "bizName")
    public final String mBizName;
    @JSONField(name = NWFullTracePlugin.FullTraceJSParam.STAGES)
    public List<UltronPerformanceStageModel> mChildStages;
    private StringBuilder mDimensions;
    @JSONField(name = "flowCode")
    public final String mFlowCode;
    @JSONField(deserialize = false, serialize = false)
    private g mJSTrackerModel;
    private long mStartMills = -1;
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    public long mDurationMills = -1;
    @JSONField(name = "commonArgs")
    public final ConcurrentHashMap<String, String> mCommonArgs = new ConcurrentHashMap<>();
    @JSONField(deserialize = false, serialize = false)
    private boolean mForceFinish = false;

    static {
        kge.a(2109022640);
        kge.a(855200517);
        kge.a(1028243835);
    }

    public UltronPerformanceFlowModel(String str, String str2, String str3) {
        this.mBizCode = str;
        this.mBizName = str2;
        this.mFlowCode = str3;
    }

    public void addChildStage(UltronPerformanceStageModel ultronPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("607dee21", new Object[]{this, ultronPerformanceStageModel});
            return;
        }
        if (this.mChildStages == null) {
            this.mChildStages = new ArrayList();
        }
        if (this.mChildStages.contains(ultronPerformanceStageModel)) {
            return;
        }
        this.mChildStages.add(ultronPerformanceStageModel);
        ultronPerformanceStageModel.setParentModel(this);
    }

    public void addCommonArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8130b495", new Object[]{this, map});
        } else if (map != null) {
            for (String str : map.keySet()) {
                if (str != null) {
                    addCommonArgs(str, map.get(str));
                }
            }
        }
    }

    public void addCommonArgs(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d1a604", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            this.mCommonArgs.put(str, str2);
            insertToDimensionKeysOfCommonArgs(str, str2);
        }
    }

    private void insertToDimensionKeysOfCommonArgs(String str, String str2) {
        Map<String, e> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7378a0", new Object[]{this, str, str2});
            return;
        }
        g jSTrackerModel = getJSTrackerModel();
        if (jSTrackerModel == null || (f = jSTrackerModel.f()) == null || !f.containsKey(str)) {
            return;
        }
        e eVar = f.get(str);
        addDimension(eVar.c(), str2);
        jSTrackerModel.a(eVar.a(), eVar.c(), str2);
    }

    public g getJSTrackerModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("5ae2c432", new Object[]{this}) : this.mJSTrackerModel;
    }

    public g ensureGetJSTrackerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("9f634f14", new Object[]{this});
        }
        if (this.mJSTrackerModel == null) {
            this.mJSTrackerModel = new g();
        }
        return this.mJSTrackerModel;
    }

    public long getStartMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5ce1786", new Object[]{this})).longValue() : this.mStartMills;
    }

    public void setStartMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acbeae6", new Object[]{this, new Long(j)});
            return;
        }
        this.mStartMills = j;
        this.mDurationMills = this.mEndMills - this.mStartMills;
    }

    public long getEndMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14c510ad", new Object[]{this})).longValue() : this.mEndMills;
    }

    public void setEndMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b3e39f", new Object[]{this, new Long(j)});
            return;
        }
        this.mEndMills = j;
        this.mDurationMills = this.mEndMills - this.mStartMills;
    }

    @JSONField(serialize = false)
    public boolean isRecordFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edc81db8", new Object[]{this})).booleanValue() : this.mStartMills > 0 && this.mEndMills > 0;
    }

    public List<UltronPerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this}) : this.mChildStages;
    }

    public boolean isForceFinish() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9504fe5f", new Object[]{this})).booleanValue() : this.mForceFinish;
    }

    public void setForceFinish(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad87bf11", new Object[]{this, new Boolean(z)});
        } else {
            this.mForceFinish = z;
        }
    }

    @JSONField(name = "dimensions")
    public String getDimensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a85bf16", new Object[]{this});
        }
        StringBuilder sb = this.mDimensions;
        return sb == null ? "" : sb.toString();
    }

    public void addDimension(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28de92e0", new Object[]{this, str, str2});
        } else if (str == null || str2 == null) {
        } else {
            if (str.contains(",") || str2.contains(",")) {
                jqg.a(this.mBizCode, "维度的name和value都不能包含英文逗号");
                return;
            }
            if (this.mDimensions == null) {
                this.mDimensions = new StringBuilder();
            }
            if (this.mDimensions.length() > 0) {
                this.mDimensions.append(",");
            }
            StringBuilder sb = this.mDimensions;
            sb.append(str);
            sb.append(":");
            sb.append(str2);
        }
    }

    public String getCommonArg(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c8e63eda", new Object[]{this, str}) : this.mCommonArgs.get(str);
    }
}
