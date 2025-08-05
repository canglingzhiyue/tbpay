package com.taobao.android.ultron.performence.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public final class UltronPerformanceStageModel implements d, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "args")
    private Map<String, String> mArgs;
    @JSONField(name = NWFullTracePlugin.FullTraceJSParam.STAGES)
    public List<UltronPerformanceStageModel> mChildStages;
    @JSONField(serialize = false)
    private d mParentStageModel;
    @JSONField(name = "stageCode")
    private final String mStageCode;
    @JSONField(deserialize = false, serialize = false)
    private long mStartMills = -1;
    @JSONField(deserialize = false, serialize = false)
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    private long mDurationMills = -1;
    @JSONField(deserialize = false, serialize = false)
    private boolean mIsFreeStage = false;

    static {
        kge.a(1832078934);
        kge.a(855200517);
        kge.a(1028243835);
    }

    public UltronPerformanceStageModel(String str) {
        this.mStageCode = str;
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

    public void removeFromParentStage() {
        List<UltronPerformanceStageModel> childStages;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa573ecd", new Object[]{this});
            return;
        }
        d dVar = this.mParentStageModel;
        if (dVar instanceof UltronPerformanceFlowModel) {
            List<UltronPerformanceStageModel> childStages2 = ((UltronPerformanceFlowModel) dVar).getChildStages();
            if (childStages2 == null) {
                return;
            }
            childStages2.remove(this);
        } else if (!(dVar instanceof UltronPerformanceStageModel) || (childStages = ((UltronPerformanceStageModel) dVar).getChildStages()) == null) {
        } else {
            childStages.remove(this);
        }
    }

    public String getStageCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72cddec4", new Object[]{this}) : this.mStageCode;
    }

    @JSONField(deserialize = false, serialize = false)
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

    @JSONField(deserialize = false, serialize = false)
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
        reCalculateParentStageEndMills(this.mParentStageModel, j);
    }

    public boolean isFreeStage() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("faa07273", new Object[]{this})).booleanValue() : this.mIsFreeStage || ((map = this.mArgs) != null && Boolean.parseBoolean(map.get("doNotCalculateInFlow")));
    }

    public void setFreeStage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69513b7d", new Object[]{this, new Boolean(z)});
        } else {
            this.mIsFreeStage = z;
        }
    }

    private void reCalculateParentStageEndMills(d dVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d1ba5a", new Object[]{this, dVar, new Long(j)});
        } else if (isFreeStage() || !(dVar instanceof UltronPerformanceStageModel)) {
        } else {
            UltronPerformanceStageModel ultronPerformanceStageModel = (UltronPerformanceStageModel) dVar;
            long endMills = ultronPerformanceStageModel.getEndMills();
            if (!ultronPerformanceStageModel.isRecordFinished() || j <= endMills) {
                return;
            }
            ultronPerformanceStageModel.setEndMills(j);
        }
    }

    public void setArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6655f", new Object[]{this, map});
        } else {
            this.mArgs = map;
        }
    }

    public Map<String, String> getArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("46c4490f", new Object[]{this}) : this.mArgs;
    }

    public List<UltronPerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this}) : this.mChildStages;
    }

    public void setParentModel(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c55daa", new Object[]{this, dVar});
        } else {
            this.mParentStageModel = dVar;
        }
    }

    @JSONField(serialize = false)
    public boolean isRecordFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edc81db8", new Object[]{this})).booleanValue() : (this.mStartMills >= 0 && this.mEndMills >= 0) || this.mDurationMills >= 0;
    }

    public long getDurationMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8bb380e8", new Object[]{this})).longValue() : this.mDurationMills;
    }
}
