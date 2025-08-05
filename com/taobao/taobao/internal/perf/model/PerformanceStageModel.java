package com.taobao.taobao.internal.perf.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class PerformanceStageModel implements a, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = NWFullTracePlugin.FullTraceJSParam.STAGES)
    private List<PerformanceStageModel> mChildStages;
    @JSONField(serialize = false)
    private a mParentStageModel;
    @JSONField(name = "stageCode")
    private final String mStageCode;
    @JSONField(name = "startTimeMills")
    private long mStartMills = -1;
    @JSONField(name = "endTimeMills")
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    private long mDurationMills = -1;

    public PerformanceStageModel(String str) {
        this.mStageCode = str;
    }

    public void addChildStage(PerformanceStageModel performanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de333dc4", new Object[]{this, performanceStageModel});
            return;
        }
        if (this.mChildStages == null) {
            this.mChildStages = new ArrayList();
        }
        if (this.mChildStages.contains(performanceStageModel)) {
            return;
        }
        this.mChildStages.add(performanceStageModel);
        performanceStageModel.setParentModel(this);
    }

    public void removeFromParentStage() {
        List<PerformanceStageModel> childStages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa573ecd", new Object[]{this});
            return;
        }
        a aVar = this.mParentStageModel;
        if (aVar instanceof PerformanceFlowModel) {
            List<PerformanceStageModel> childStages2 = ((PerformanceFlowModel) aVar).getChildStages();
            if (childStages2 == null) {
                return;
            }
            childStages2.remove(this);
        } else if (!(aVar instanceof PerformanceStageModel) || (childStages = ((PerformanceStageModel) aVar).getChildStages()) == null) {
        } else {
            childStages.remove(this);
        }
    }

    public String getStageCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72cddec4", new Object[]{this}) : this.mStageCode;
    }

    public long getStartMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5ce1786", new Object[]{this})).longValue() : this.mStartMills;
    }

    public void setStartMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acbeae6", new Object[]{this, new Long(j)});
        } else {
            this.mStartMills = j;
        }
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

    public long getDurationMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8bb380e8", new Object[]{this})).longValue() : this.mDurationMills;
    }

    public void setDurationMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e8965c", new Object[]{this, new Long(j)});
        } else {
            this.mDurationMills = j;
        }
    }

    public Map<String, String> getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this}) : this.mArgs;
    }

    public void setArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.mArgs = map;
        }
    }

    public List<PerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this}) : this.mChildStages;
    }

    @JSONField(serialize = false)
    public a getParentModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b7849f48", new Object[]{this}) : this.mParentStageModel;
    }

    public void setParentModel(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687b7e44", new Object[]{this, aVar});
        } else {
            this.mParentStageModel = aVar;
        }
    }

    @JSONField(serialize = false)
    public boolean isRecordFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edc81db8", new Object[]{this})).booleanValue() : getStartMills() > 0 && getEndMills() > 0;
    }
}
