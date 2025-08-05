package com.taobao.popupcenter.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class PopStrategyGroup {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final PopStrategyGroup EMPTY_GROUP = new PopStrategyGroup();
    public boolean hasShowFirst;
    public String page;
    public long showFirstTimeout;
    private PopStrategy[] strategies;
    private Map<String, PopStrategy> strategyMap = new ConcurrentHashMap();
    public boolean isFirstShowFinish = true;

    public void setStrategies(PopStrategy[] popStrategyArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a6005d", new Object[]{this, popStrategyArr});
            return;
        }
        this.strategies = popStrategyArr;
        this.strategyMap.clear();
        if (popStrategyArr == null) {
            return;
        }
        for (PopStrategy popStrategy : popStrategyArr) {
            if (popStrategy != null) {
                if (popStrategy.firstShow) {
                    this.hasShowFirst = true;
                    this.showFirstTimeout = popStrategy.firstShowTimeout;
                    this.isFirstShowFinish = false;
                }
                this.strategyMap.put(popStrategy.identifier, popStrategy);
            }
        }
    }

    public PopStrategy getStrategyByIdentifier(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopStrategy) ipChange.ipc$dispatch("466f2362", new Object[]{this, str});
        }
        PopStrategy popStrategy = this.strategyMap.get(str);
        if (popStrategy != null) {
            return popStrategy;
        }
        PopStrategy popStrategy2 = new PopStrategy();
        popStrategy2.identifier = str;
        return popStrategy2;
    }

    public int compare(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue() : compare(getStrategyByIdentifier(str), getStrategyByIdentifier(str2));
    }

    public int compare(PopStrategy popStrategy, PopStrategy popStrategy2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc802adf", new Object[]{this, popStrategy, popStrategy2})).intValue();
        }
        if (popStrategy == popStrategy2) {
            return 0;
        }
        if (popStrategy == null) {
            return -1;
        }
        if (popStrategy2 == null) {
            return 1;
        }
        if (popStrategy.priority > popStrategy2.priority) {
            return -1;
        }
        return popStrategy.priority == popStrategy2.priority ? 0 : 1;
    }
}
