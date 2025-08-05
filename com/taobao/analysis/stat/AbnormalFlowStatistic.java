package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;
import com.taobao.analysis.flow.b;
import java.util.Map;
import tb.riy;

@Monitor(module = "networkPrefer", monitorPoint = "AbnormalFlowMonitor")
/* loaded from: classes4.dex */
public class AbnormalFlowStatistic extends StatObject {
    @Dimension
    public volatile String activityName;
    @Measure
    public double bgDataSize;
    @Dimension
    public volatile long currentTime;
    @Measure
    public double fgDataSize;
    @Dimension
    public int flowType;
    @Dimension
    public volatile String refer;
    @Measure
    public double useTime;
    @Dimension
    public String abnormalFlag = "abnormalUser";
    @Dimension
    public String bgUrl = "";
    @Dimension
    public String fgUrl = "";

    public AbnormalFlowStatistic(String str, String str2, b.a aVar, long j, int i, double d) {
        this.flowType = i;
        this.currentTime = j;
        this.useTime = d;
        this.refer = str;
        this.activityName = str2;
        this.bgDataSize = aVar.f8544a;
        this.fgDataSize = aVar.b;
        for (Map.Entry<String, Integer> entry : aVar.d.entrySet()) {
            this.fgUrl += "[(reqCount:" + entry.getValue() + riy.BRACKET_END_STR + entry.getKey() + riy.ARRAY_END_STR;
        }
        for (Map.Entry<String, Integer> entry2 : aVar.c.entrySet()) {
            this.bgUrl += "[(reqCount:" + entry2.getValue() + riy.BRACKET_END_STR + entry2.getKey() + riy.ARRAY_END_STR;
        }
    }
}
