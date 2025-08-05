package com.taobao.analysis.stat;

import anet.channel.statist.Monitor;

@Monitor(module = "networkAnalysis", monitorPoint = "full_trace_mtop_ssr")
/* loaded from: classes4.dex */
public class FullTraceSSRMonitor extends FullTraceStatistic {
    public FullTraceSSRMonitor(FullTraceStatistic fullTraceStatistic) {
        super(fullTraceStatistic);
    }
}
