package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.android.alibaba.ip.runtime.IpChange;

@Monitor(module = "Falco", monitorPoint = "jankContinuous")
/* loaded from: classes4.dex */
public class FalcoJankStatistic extends StatObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @Dimension
    public String afc_id;
    @Dimension
    public String apiList;
    @Measure
    public int jankCount;
    @Dimension
    public String pageList;
    @Measure
    public int popCount;
    @Dimension
    public int processId;
    @Dimension
    public long processStart;
    @Dimension
    public String processType;
    @Measure
    public int pushCount;
    @Measure
    public int slowJankCount;
    @Measure
    public int totalCount;
    @Dimension
    public String type;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FalcoJankStatistic{afc_id='" + this.afc_id + "', processId=" + this.processId + ", processType='" + this.processType + "', processStart=" + this.processStart + ", pushCount=" + this.pushCount + ", popCount=" + this.popCount + ", pageList='" + this.pageList + "', type='" + this.type + "', totalCount=" + this.totalCount + ", jankCount=" + this.jankCount + ", slowJankCount=" + this.slowJankCount + ", apiList='" + this.apiList + "'}";
    }
}
