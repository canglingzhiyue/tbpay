package com.taobao.analysis.stat;

import anet.channel.statist.Monitor;

@Monitor(module = "networkAnalysis", monitorPoint = "full_trace_mtop_monitor")
/* loaded from: classes4.dex */
public class FullTraceMonitor extends FullTraceStatistic {
    public FullTraceMonitor(FullTraceStatistic fullTraceStatistic) {
        super(fullTraceStatistic);
    }
}
