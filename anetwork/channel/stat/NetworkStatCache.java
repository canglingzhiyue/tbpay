package anetwork.channel.stat;

import anet.channel.util.StringUtils;
import anetwork.channel.statist.StatisticData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class NetworkStatCache implements INetworkStat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_SIZE = 100;
    private static final String RESET_STAT = "{\"oneWayTime\" : 0, \"totalSize\" : 0}";
    private Map<String, String> lruCache;

    /* loaded from: classes.dex */
    public static class holder {
        public static NetworkStatCache instance;

        static {
            kge.a(-107944797);
            instance = new NetworkStatCache();
        }

        private holder() {
        }
    }

    static {
        kge.a(1531073933);
        kge.a(105989766);
    }

    public static NetworkStatCache getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NetworkStatCache) ipChange.ipc$dispatch("c4cd6a46", new Object[0]) : holder.instance;
    }

    private NetworkStatCache() {
        this.lruCache = Collections.synchronizedMap(new LinkedHashMap<String, String>() { // from class: anetwork.channel.stat.NetworkStatCache.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<String, String> entry) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue() : size() > 100;
            }
        });
    }

    @Override // anetwork.channel.stat.INetworkStat
    public void put(String str, StatisticData statisticData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc492bc", new Object[]{this, str, statisticData});
        } else if (StringUtils.isBlank(str)) {
        } else {
            StringBuilder sb = new StringBuilder(48);
            sb.append("{\"oneWayTime\" : ");
            sb.append(statisticData.oneWayTime_ANet);
            sb.append(", \"totalSize\" : ");
            sb.append(statisticData.totalSize);
            sb.append(riy.BLOCK_END_STR);
            this.lruCache.put(str, sb.toString());
        }
    }

    @Override // anetwork.channel.stat.INetworkStat
    public void reset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("847be2a0", new Object[]{this, str});
        } else if (!this.lruCache.containsKey(str)) {
        } else {
            this.lruCache.put(str, RESET_STAT);
        }
    }

    @Override // anetwork.channel.stat.INetworkStat
    public String get(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str}) : this.lruCache.get(str);
    }
}
