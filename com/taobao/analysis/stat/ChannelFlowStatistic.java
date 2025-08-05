package com.taobao.analysis.stat;

import anet.channel.statist.Dimension;
import anet.channel.statist.Measure;
import anet.channel.statist.Monitor;
import anet.channel.statist.StatObject;

@Monitor(module = "networkPrefer", monitorPoint = "channel_flow")
/* loaded from: classes4.dex */
public class ChannelFlowStatistic extends StatObject {
    @Dimension
    public String biz;
    @Measure
    public long downstream;
    @Dimension
    public boolean isBackground;
    @Dimension
    public boolean isMainProcessAlive;
    @Dimension
    public String protocolType;
    @Dimension
    public String refer;
    @Dimension
    public String reqIdentifier;
    @Measure
    public long upstream;

    public ChannelFlowStatistic(SingleFlowStatistic singleFlowStatistic) {
        this.refer = singleFlowStatistic.f_refer;
        this.biz = singleFlowStatistic.f_biz;
        this.protocolType = singleFlowStatistic.f_protocoltype;
        this.reqIdentifier = singleFlowStatistic.f_req_identifier;
        this.upstream = singleFlowStatistic.f_upstream;
        this.downstream = singleFlowStatistic.f_downstream;
    }
}
