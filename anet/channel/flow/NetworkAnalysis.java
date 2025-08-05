package anet.channel.flow;

import anet.channel.statist.RequestStatistic;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class NetworkAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile INetworkAnalysis networkAnalysis;

    static {
        kge.a(1304463688);
        networkAnalysis = new AnalysisProxy(null);
    }

    public static INetworkAnalysis getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (INetworkAnalysis) ipChange.ipc$dispatch("7b8b3570", new Object[0]) : networkAnalysis;
    }

    public static void setInstance(INetworkAnalysis iNetworkAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401fec4a", new Object[]{iNetworkAnalysis});
        } else {
            networkAnalysis = new AnalysisProxy(iNetworkAnalysis);
        }
    }

    /* loaded from: classes.dex */
    public static class AnalysisProxy implements INetworkAnalysis {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private INetworkAnalysis networkAnalysis;

        static {
            kge.a(1133004406);
            kge.a(-1040795357);
        }

        public AnalysisProxy(INetworkAnalysis iNetworkAnalysis) {
            this.networkAnalysis = null;
            this.networkAnalysis = iNetworkAnalysis;
        }

        @Override // anet.channel.flow.INetworkAnalysis
        public void commitFlow(FlowStat flowStat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb30c677", new Object[]{this, flowStat});
                return;
            }
            INetworkAnalysis iNetworkAnalysis = this.networkAnalysis;
            if (iNetworkAnalysis == null) {
                return;
            }
            iNetworkAnalysis.commitFlow(flowStat);
        }

        @Override // anet.channel.flow.INetworkAnalysis
        public void commitFlow(RequestStatistic requestStatistic) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efc2bb5c", new Object[]{this, requestStatistic});
                return;
            }
            INetworkAnalysis iNetworkAnalysis = this.networkAnalysis;
            if (iNetworkAnalysis == null) {
                return;
            }
            iNetworkAnalysis.commitFlow(requestStatistic);
        }

        @Override // anet.channel.flow.INetworkAnalysis
        public void createConnectCount(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d0ed546", new Object[]{this, str, str2, str3});
                return;
            }
            INetworkAnalysis iNetworkAnalysis = this.networkAnalysis;
            if (iNetworkAnalysis == null) {
                return;
            }
            iNetworkAnalysis.createConnectCount(str, str2, str3);
        }
    }
}
