package com.taobao.analysis.monitor;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

@Monitor(module = "networkPrefer", monitorPoint = "MultiPathFlowMonitor")
/* loaded from: classes4.dex */
public class MultiPathFlowStatistic extends StatObject {
    @Dimension(name = "date")
    public String date;
    @Measure(name = "dayFlow")
    public double dayFlowSize;
    @Dimension
    public int flowType;
    @Dimension
    public String ipList;
}
