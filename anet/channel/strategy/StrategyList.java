package anet.channel.strategy;

import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyList implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "awcn.StrategyList";
    private static final long serialVersionUID = -258058881561327174L;
    private boolean containsStaticIp;
    private Map<Integer, ConnHistoryItem> historyItemMap;
    private List<IPConnStrategy> ipStrategyList;
    public transient boolean isChanged;

    static {
        kge.a(-1663008082);
        kge.a(1028243835);
    }

    public StrategyList() {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.isChanged = false;
    }

    public StrategyList(List<IPConnStrategy> list) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.isChanged = false;
        this.ipStrategyList = list;
    }

    public StrategyList(List<IPConnStrategy> list, Map<Integer, ConnHistoryItem> map, boolean z) {
        this.ipStrategyList = new ArrayList();
        this.historyItemMap = new SerialLruCache(40);
        this.containsStaticIp = false;
        this.isChanged = false;
        this.ipStrategyList = list;
        this.historyItemMap = map;
        this.containsStaticIp = z;
    }

    public synchronized boolean clearStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e69356b", new Object[]{this})).booleanValue();
        }
        ALog.e(TAG, "[channel process] clearStrategy", null, new Object[0]);
        this.isChanged = false;
        synchronized (this.ipStrategyList) {
            Iterator<IPConnStrategy> it = this.ipStrategyList.iterator();
            int i = 0;
            while (it.hasNext()) {
                IPConnStrategy next = it.next();
                ConnHistoryItem connHistoryItem = this.historyItemMap.get(Integer.valueOf(next.getUniqueId()));
                if (connHistoryItem != null) {
                    if (connHistoryItem.isUsed() && (!connHistoryItem.isUsed() || connHistoryItem.isExpireStrategy())) {
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        it.remove();
                        this.isChanged = true;
                        ALog.e(TAG, "[channel process] clearIpStrategyList 2，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                    i++;
                    if (i > 2) {
                        this.historyItemMap.remove(Integer.valueOf(next.getUniqueId()));
                        it.remove();
                        this.isChanged = true;
                        ALog.e(TAG, "[channel process] clearIpStrategyList 1，remove ipStrategy=" + next.toString(), null, new Object[0]);
                    }
                }
            }
        }
        return this.isChanged;
    }

    public synchronized void clearIpStrategyList(IPConnStrategy iPConnStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95e4698", new Object[]{this, iPConnStrategy});
            return;
        }
        ALog.e(TAG, "[channel process] clearIpStrategyList", null, new Object[0]);
        if (iPConnStrategy == null) {
            return;
        }
        if (this.historyItemMap.get(Integer.valueOf(iPConnStrategy.getUniqueId())) != null) {
            this.historyItemMap.remove(Integer.valueOf(iPConnStrategy.getUniqueId()));
            this.ipStrategyList.remove(iPConnStrategy);
            ALog.e(TAG, "[channel process] clearIpStrategyList，remove ipStrategy=" + iPConnStrategy.toString(), null, new Object[0]);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : new ArrayList(this.ipStrategyList).toString();
    }

    public List<IPConnStrategy> getIpStrategyList(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("788a0de8", new Object[]{this, str}) : this.ipStrategyList;
    }

    public Map<Integer, ConnHistoryItem> getHistoryItemMap(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6cedf891", new Object[]{this, str}) : this.historyItemMap;
    }

    public boolean isContainsStaticIp() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7324f249", new Object[]{this})).booleanValue() : this.containsStaticIp;
    }
}
