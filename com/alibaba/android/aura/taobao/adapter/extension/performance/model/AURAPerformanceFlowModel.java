package com.alibaba.android.aura.taobao.adapter.extension.performance.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes2.dex */
public final class AURAPerformanceFlowModel implements b, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "bizCode")
    private final String mBizCode;
    @JSONField(name = "bizName")
    private final String mBizName;
    @JSONField(name = "childBizCode")
    private final String mChildBizCode;
    @JSONField(name = "childBizName")
    private final String mChildBizName;
    @JSONField(name = NWFullTracePlugin.FullTraceJSParam.STAGES)
    private List<AURAPerformanceStageModel> mChildStages;
    @JSONField(name = "commonArgs")
    private Map<String, String> mCommonArgs;
    @JSONField(name = "flowCode")
    private final String mFlowCode;
    @JSONField(name = "startTimeMills")
    private long mStartMills = -1;
    @JSONField(name = "endTimeMills")
    private long mEndMills = -1;
    @JSONField(name = "durationMills")
    private long mDurationMills = -1;

    static {
        kge.a(-1069597671);
        kge.a(384726074);
        kge.a(1028243835);
    }

    public AURAPerformanceFlowModel(String str, String str2, String str3, String str4, String str5) {
        this.mBizCode = str;
        this.mBizName = str2;
        this.mChildBizCode = str3;
        this.mChildBizName = str4;
        this.mFlowCode = str5;
    }

    public void addChildStage(AURAPerformanceStageModel aURAPerformanceStageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04d5eca", new Object[]{this, aURAPerformanceStageModel});
            return;
        }
        if (this.mChildStages == null) {
            this.mChildStages = new ArrayList();
        }
        if (this.mChildStages.contains(aURAPerformanceStageModel)) {
            return;
        }
        this.mChildStages.add(aURAPerformanceStageModel);
        aURAPerformanceStageModel.setParentModel(this);
    }

    public List<AURAPerformanceStageModel> getChildStages() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("65f0b6c5", new Object[]{this}) : this.mChildStages;
    }

    public AURAPerformanceStageModel getChildStage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPerformanceStageModel) ipChange.ipc$dispatch("a182384d", new Object[]{this, str});
        }
        List<AURAPerformanceStageModel> list = this.mChildStages;
        if (list == null) {
            return null;
        }
        for (AURAPerformanceStageModel aURAPerformanceStageModel : list) {
            if (str.equals(aURAPerformanceStageModel.getStageCode())) {
                return aURAPerformanceStageModel;
            }
        }
        return null;
    }

    public Map<String, String> getCommonArgs() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("8b2b7c5a", new Object[]{this}) : this.mCommonArgs;
    }

    public void addCommonArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8130b495", new Object[]{this, map});
        } else if (map == null) {
        } else {
            if (this.mCommonArgs == null) {
                this.mCommonArgs = new ConcurrentHashMap();
            }
            this.mCommonArgs.putAll(map);
        }
    }

    public void setStartMills(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acbeae6", new Object[]{this, new Long(j)});
        } else {
            this.mStartMills = j;
        }
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

    public String getBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this}) : this.mBizCode;
    }

    public String getBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this}) : this.mBizName;
    }

    public String getChildBizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6a644fdf", new Object[]{this}) : this.mChildBizCode;
    }

    public String getChildBizName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec203201", new Object[]{this}) : this.mChildBizName;
    }

    public String getFlowCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9670bde8", new Object[]{this}) : this.mFlowCode;
    }

    public long getStartMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5ce1786", new Object[]{this})).longValue() : this.mStartMills;
    }

    public long getEndMills() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14c510ad", new Object[]{this})).longValue() : this.mEndMills;
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

    @JSONField(serialize = false)
    public boolean isRecordFinished() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edc81db8", new Object[]{this})).booleanValue() : getStartMills() > 0 && getEndMills() > 0;
    }
}
