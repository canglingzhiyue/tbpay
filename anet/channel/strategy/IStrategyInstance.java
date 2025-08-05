package anet.channel.strategy;

import android.content.Context;
import anet.channel.status.NetworkStatusHelper;
import java.util.List;

/* loaded from: classes.dex */
public interface IStrategyInstance {
    void forceRefreshStrategy(String str);

    boolean getAbStrategyStatusByHost(String str, String str2);

    String getAccessPointByHost(String str);

    String getCNameByHost(String str);

    String getClientIp();

    List<IConnStrategy> getConnStrategyListByHost(String str);

    List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter);

    List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter, boolean z);

    List<IConnStrategy> getConnStrategyListByHost(String str, boolean z);

    List<IConnStrategy> getConnStrategyListByHost(boolean z, String str);

    List<IConnStrategy> getConnStrategyListWithoutWait(String str);

    int getDetectHttp3Status();

    String getFormalizeUrl(String str);

    List<IConnStrategy> getIpv4ConnStrategyListByHost(String str, boolean z, int i);

    List<IConnStrategy> getLocalDnsConnStrategyListByHost(String str);

    @Deprecated
    String getSchemeByHost(String str);

    String getSchemeByHost(String str, String str2);

    String getSchemeByHost(String str, String str2, boolean z);

    String getUniqueId(NetworkStatusHelper.NetworkStatus networkStatus);

    String getUnitByHost(String str);

    void initialize(Context context);

    boolean isContainHttp3();

    void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent);

    void registerListener(IStrategyListener iStrategyListener);

    void saveData();

    void switchEnv();

    void unregisterListener(IStrategyListener iStrategyListener);
}
