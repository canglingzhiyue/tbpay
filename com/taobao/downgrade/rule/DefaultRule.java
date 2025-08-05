package com.taobao.downgrade.rule;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.downgrade.e;
import com.taobao.tbdeviceevaluator.c;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes.dex */
public class DefaultRule implements Serializable {
    @JSONField(name = "androidCpuOpen")
    public boolean androidCpuOpen;
    @JSONField(name = "dataPickRate")
    public String dataPickRate;
    @JSONField(name = "degrade")
    public boolean degrade;
    @JSONField(name = "globalId")
    public String globalId;
    @JSONField(name = c.KEY_OLD_SCORE)
    public OldDeviceScore oldDeviceScore;
    @JSONField(name = "performanceWeights")
    public PerformanceWeights performanceWeights;
    @JSONField(name = "power")
    public boolean power;
    @JSONField(name = "scoreLevelVariable")
    public ScoreLevelVariable scoreLevelVariable;
    @JSONField(name = "scoreTacticsMapping")
    public ScoreTacticsMapping scoreTacticsMapping;

    /* loaded from: classes.dex */
    public static class OldDeviceScore implements Serializable {
        @JSONField(name = "high")
        public String high;
        @JSONField(name = "low")
        public String low;
        @JSONField(name = "middle")
        public String middle;
        @JSONField(name = "oldDeviceScoreId")
        public String oldDeviceScoreId;
    }

    /* loaded from: classes.dex */
    public static class PerformanceWeights implements Serializable {
        @JSONField(name = "coldLaunch")
        public String coldLaunch;
        @JSONField(name = e.HARDWARE)
        public String hardware;
        @JSONField(name = "performanceWeightsId")
        public String performanceWeightsId;
        @JSONField(name = "runtimeCPU")
        public String runtimeCPU;
        @JSONField(name = "runtimeMEM")
        public String runtimeMEM;
    }

    /* loaded from: classes.dex */
    public static class ScoreLevelVariable implements Serializable {
        @JSONField(name = "coldLaunch")
        public List<String> coldLaunch;
        @JSONField(name = "runtimeCPU")
        public List<String> runtimeCPU;
        @JSONField(name = "runtimeMEM")
        public List<String> runtimeMEM;
        @JSONField(name = "scoreLevelVariableId")
        public String scoreLevelVariableId;
    }

    /* loaded from: classes.dex */
    public static class ScoreTacticsMapping implements Serializable {
        @JSONField(name = "high")
        public String high;
        @JSONField(name = "low")
        public String low;
        @JSONField(name = "scoreTacticsMappingId")
        public String scoreTacticsMappingId;
    }
}
