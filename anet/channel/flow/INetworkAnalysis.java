package anet.channel.flow;

import anet.channel.statist.RequestStatistic;

/* loaded from: classes.dex */
public interface INetworkAnalysis {
    void commitFlow(FlowStat flowStat);

    void commitFlow(RequestStatistic requestStatistic);

    void createConnectCount(String str, String str2, String str3);
}
