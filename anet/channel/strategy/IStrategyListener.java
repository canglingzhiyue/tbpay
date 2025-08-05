package anet.channel.strategy;

import anet.channel.strategy.StrategyResultParser;

/* loaded from: classes.dex */
public interface IStrategyListener {
    void onStrategyUpdated(StrategyResultParser.HttpDnsResponse httpDnsResponse);
}
