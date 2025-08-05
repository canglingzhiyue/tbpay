package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class HttpDnsAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-664616629);
    }

    public static void setHosts(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe3afb1a", new Object[]{arrayList});
        } else {
            HttpDispatcher.getInstance().addHosts(arrayList);
        }
    }

    public static HttpDnsOrigin getOriginByHttpDnsNoWait(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsOrigin) ipChange.ipc$dispatch("77f52162", new Object[]{str});
        }
        List<IConnStrategy> connStrategyListWithoutWait = StrategyCenter.getInstance().getConnStrategyListWithoutWait(str);
        if (connStrategyListWithoutWait != null && connStrategyListWithoutWait.size() != 0) {
            return new HttpDnsOrigin(connStrategyListWithoutWait.get(0));
        }
        return null;
    }

    public static HttpDnsOrigin getOriginByHttpDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpDnsOrigin) ipChange.ipc$dispatch("40817918", new Object[]{str});
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (!connStrategyListByHost.isEmpty()) {
            return new HttpDnsOrigin(connStrategyListByHost.get(0));
        }
        return null;
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDnsNoWait(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b0c0b074", new Object[]{str}) : getOriginsByHttpDnsNoWait(str, true);
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDnsNoWait(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4f2dab54", new Object[]{str, new Boolean(z)});
        }
        List<IConnStrategy> connStrategyListWithoutWait = StrategyCenter.getInstance().getConnStrategyListWithoutWait(str);
        if (connStrategyListWithoutWait == null || connStrategyListWithoutWait.size() == 0) {
            return null;
        }
        ArrayList<HttpDnsOrigin> arrayList = new ArrayList<>(connStrategyListWithoutWait.size());
        for (IConnStrategy iConnStrategy : connStrategyListWithoutWait) {
            if (z || iConnStrategy.getIpSource() != 1) {
                arrayList.add(new HttpDnsOrigin(iConnStrategy));
            }
        }
        return arrayList;
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDns(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("c2bb973e", new Object[]{str}) : getOriginsByHttpDns(str, true);
    }

    public static ArrayList<HttpDnsOrigin> getOriginsByHttpDns(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("7c8f9dca", new Object[]{str, new Boolean(z)});
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (connStrategyListByHost.isEmpty()) {
            return null;
        }
        ArrayList<HttpDnsOrigin> arrayList = new ArrayList<>(connStrategyListByHost.size());
        for (IConnStrategy iConnStrategy : connStrategyListByHost) {
            if (z || iConnStrategy.getIpSource() != 1) {
                arrayList.add(new HttpDnsOrigin(iConnStrategy));
            }
        }
        return arrayList;
    }

    public static String getIpByHttpDns(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea46102", new Object[]{str});
        }
        List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
        if (!connStrategyListByHost.isEmpty()) {
            return connStrategyListByHost.get(0).getIp();
        }
        return null;
    }

    public static void notifyConnEvent(String str, HttpDnsOrigin httpDnsOrigin, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e3c23d", new Object[]{str, httpDnsOrigin, new Boolean(z)});
        } else if (TextUtils.isEmpty(str) || httpDnsOrigin == null || !AwcnConfig.isAllowHttpDnsNotify(str)) {
        } else {
            ConnEvent connEvent = new ConnEvent();
            connEvent.isSuccess = z;
            StrategyCenter.getInstance().notifyConnEvent(str, httpDnsOrigin.connStrategy, connEvent);
        }
    }

    /* loaded from: classes2.dex */
    public static final class HttpDnsOrigin {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final IConnStrategy connStrategy;

        static {
            kge.a(1160952398);
        }

        public HttpDnsOrigin(IConnStrategy iConnStrategy) {
            this.connStrategy = iConnStrategy;
        }

        public String getOriginIP() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a0c296", new Object[]{this}) : this.connStrategy.getIp();
        }

        public int getOriginPort() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3ab54eb7", new Object[]{this})).intValue() : this.connStrategy.getPort();
        }

        public String getOriginProtocol() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1122d2a5", new Object[]{this}) : this.connStrategy.getProtocol().protocol;
        }

        public boolean canWithSPDY() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1c6a71f3", new Object[]{this})).booleanValue();
            }
            String str = this.connStrategy.getProtocol().protocol;
            return !str.equalsIgnoreCase("http") && !str.equalsIgnoreCase("https");
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.connStrategy.toString();
        }
    }
}
