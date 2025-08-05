package anet.channel.strategy;

import android.content.Context;
import android.net.Uri;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.SessionCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyTemplate {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "anet.StrategyTemplate";
    public Map<String, ConnProtocol> templateMap = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public enum LocalDnsSessionType {
        SHORT_LINK,
        USE_HTT2,
        USE_HTT3
    }

    /* loaded from: classes.dex */
    public static class holder {
        public static StrategyTemplate instance;

        static {
            kge.a(1286831366);
            instance = new StrategyTemplate();
        }
    }

    static {
        kge.a(-1081010550);
    }

    public static StrategyTemplate getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StrategyTemplate) ipChange.ipc$dispatch("ea56c8e9", new Object[0]) : holder.instance;
    }

    public void registerConnProtocol(String str, ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86841926", new Object[]{this, str, connProtocol});
        } else {
            registerConnProtocol(GlobalAppRuntimeInfo.getContext(), str, connProtocol);
        }
    }

    public void registerConnProtocol(Context context, String str, ConnProtocol connProtocol) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2443152", new Object[]{this, context, str, connProtocol});
            return;
        }
        ALog.e(TAG, "registerConnProtocol", null, "protocol=", connProtocol, " host=", str);
        if (connProtocol == null) {
            return;
        }
        this.templateMap.put(str, connProtocol);
        try {
            IStrategyInstance strategyCenter = StrategyCenter.getInstance();
            if (!(strategyCenter instanceof StrategyInstance)) {
                return;
            }
            if (((StrategyInstance) strategyCenter).holder == null) {
                strategyCenter.initialize(context);
            }
            if (((StrategyInstance) strategyCenter).holder == null) {
                return;
            }
            ((StrategyInstance) strategyCenter).holder.localDnsStrategyTable.setProtocolForHost(str, connProtocol);
        } catch (Exception e) {
            ALog.e(TAG, "registerConnProtocol fail", null, e, e.toString());
        }
    }

    public void registerHTTP3ConnProtocol(Context context, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c1a6da", new Object[]{this, context, str, str2, new Integer(i)});
        } else if (str == null || context == null) {
        } else {
            ALog.e(TAG, "registerHTTP3ConnProtocol", null, "host=", str, "degradeHTTP2Publickey=", str2);
            try {
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (!(strategyCenter instanceof StrategyInstance)) {
                    return;
                }
                if (((StrategyInstance) strategyCenter).holder == null) {
                    strategyCenter.initialize(context);
                }
                if (((StrategyInstance) strategyCenter).holder == null) {
                    return;
                }
                if (SessionCenter.getInstance().isExistH3Session(str)) {
                    ALog.e(TAG, "registerHTTP3ConnProtocol, exist avail h3 strategy", null, new Object[0]);
                } else {
                    ((StrategyInstance) strategyCenter).holder.localDnsStrategyTable.setHTTP3ProtocolForHost(str, str2, i);
                }
            } catch (Exception e) {
                ALog.e(TAG, "registerHTTP3ConnProtocol fail", null, e, e.toString());
            }
        }
    }

    public void registerLocalDnsLookup(Uri uri, String str) {
        List<String> matchHostListByOption;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("835b4eaf", new Object[]{this, uri, str});
            return;
        }
        try {
            IStrategyInstance strategyCenter = StrategyCenter.getInstance();
            if (!(strategyCenter instanceof StrategyInstance)) {
                return;
            }
            if (((StrategyInstance) strategyCenter).holder == null) {
                strategyCenter.initialize(GlobalAppRuntimeInfo.getContext());
            }
            if (((StrategyInstance) strategyCenter).holder != null && (matchHostListByOption = AwcnConfig.getMatchHostListByOption(uri, str)) != null && !matchHostListByOption.isEmpty()) {
                for (String str2 : matchHostListByOption) {
                    ((StrategyInstance) strategyCenter).holder.localDnsStrategyTable.queryLocalDnsByHost(str2);
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "registerLocalDnsLookup fail", null, e, e.toString());
        }
    }

    public ConnProtocol getConnProtocol(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ConnProtocol) ipChange.ipc$dispatch("6ae4f379", new Object[]{this, str}) : this.templateMap.get(str);
    }

    public void localDnsLookupByHost(List<String> list) {
        String str;
        int i;
        int i2;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c290f8f", new Object[]{this, list});
        } else if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (!(strategyCenter instanceof StrategyInstance)) {
                    return;
                }
                if (((StrategyInstance) strategyCenter).holder == null) {
                    strategyCenter.initialize(GlobalAppRuntimeInfo.getContext());
                }
                if (((StrategyInstance) strategyCenter).holder == null) {
                    return;
                }
                for (String str2 : list) {
                    int ordinal = LocalDnsSessionType.SHORT_LINK.ordinal();
                    if (AwcnConfig.isOrangeOptEnable()) {
                        List<IConnStrategy> queryByHost = ((StrategyInstance) strategyCenter).holder.getCurrStrategyTable().queryByHost(str2);
                        for (IConnStrategy iConnStrategy : queryByHost) {
                            if (!"http".equalsIgnoreCase(iConnStrategy.getProtocol().protocol) && !"https".equalsIgnoreCase(iConnStrategy.getProtocol().protocol)) {
                                ALog.e(TAG, "[strategy listener opt] exist strategy! return! ", null, "strategies", queryByHost);
                                StrategyCallBackHelper.notifyStrategyCallBack(str2);
                                return;
                            }
                        }
                        ConcurrentHashMap<String, List<String>> presetHostWhiteList = AwcnConfig.getPresetHostWhiteList();
                        if (presetHostWhiteList != null && !presetHostWhiteList.isEmpty()) {
                            List<String> list2 = presetHostWhiteList.get(str2);
                            int parseInt = Integer.parseInt(list2.get(1));
                            boolean parseBoolean = Boolean.parseBoolean(list2.get(2));
                            i2 = Integer.parseInt(list2.get(3));
                            z = parseBoolean;
                            i = parseInt;
                            str = list2.get(0);
                            ((StrategyInstance) strategyCenter).holder.localDnsStrategyTable.localDnsLookupByHost(str2, str, i, i2, z);
                        }
                    }
                    str = null;
                    i = ordinal;
                    i2 = 0;
                    z = false;
                    ((StrategyInstance) strategyCenter).holder.localDnsStrategyTable.localDnsLookupByHost(str2, str, i, i2, z);
                }
            } catch (Exception e) {
                ALog.e(TAG, "[Ipv6_H3] localDnsLookupByHost fail", null, e, e.toString());
            }
        }
    }

    public void loadStrategyInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4f4330", new Object[]{this});
            return;
        }
        try {
            ThreadPoolExecutorFactory.submitScheduledTask(new Runnable() { // from class: anet.channel.strategy.StrategyTemplate.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                    if (!(strategyCenter instanceof StrategyInstance) || ((StrategyInstance) strategyCenter).holder != null) {
                        return;
                    }
                    ALog.e(StrategyTemplate.TAG, "[Launcher] loadStrategyInit, StrategyInstance initialize start!!!", null, new Object[0]);
                    strategyCenter.initialize(GlobalAppRuntimeInfo.getContext());
                    ALog.e(StrategyTemplate.TAG, "[Launcher] loadStrategyInit, StrategyInstance initialize end!!!", null, new Object[0]);
                }
            });
        } catch (Exception e) {
            ALog.e(TAG, "[Launcher] loadStrategyInit start fail", null, e, e.toString());
        }
    }

    public void sendAmdcRequest(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff23701c", new Object[]{this, set});
        } else if (set == null) {
        } else {
            try {
                if (set.isEmpty()) {
                    return;
                }
                IStrategyInstance strategyCenter = StrategyCenter.getInstance();
                if (!(strategyCenter instanceof StrategyInstance)) {
                    return;
                }
                if (((StrategyInstance) strategyCenter).holder == null) {
                    ALog.e(TAG, "[Launcher] sendAmdcRequest, StrategyInstance initialize start!!!", null, new Object[0]);
                    strategyCenter.initialize(GlobalAppRuntimeInfo.getContext());
                    ALog.e(TAG, "[Launcher] sendAmdcRequest, StrategyInstance initialize end!!!", null, new Object[0]);
                }
                if (((StrategyInstance) strategyCenter).holder == null) {
                    return;
                }
                ((StrategyInstance) strategyCenter).holder.getCurrStrategyTable().sendAmdcRequest(set, false, true);
                ALog.e(TAG, "[Launcher] force amdc start!!!", null, new Object[0]);
            } catch (Exception e) {
                ALog.e(TAG, "[Launcher] force amdc start fail", null, e, e.toString());
            }
        }
    }
}
