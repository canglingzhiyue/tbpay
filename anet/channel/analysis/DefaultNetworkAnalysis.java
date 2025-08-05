package anet.channel.analysis;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anetwork.channel.config.NetworkConfigCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.FlowCenter;
import tb.kge;

/* loaded from: classes.dex */
public class DefaultNetworkAnalysis implements INetworkAnalysis {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DefaultNetworkAnalysis";
    private boolean isNetAnalysisValid;

    static {
        kge.a(-1170335523);
        kge.a(-1040795357);
    }

    public DefaultNetworkAnalysis() {
        try {
            Class.forName("com.taobao.analysis.FlowCenter");
            FlowCenter.getInstance();
            this.isNetAnalysisValid = true;
        } catch (Exception unused) {
            this.isNetAnalysisValid = false;
            ALog.e(TAG, "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(FlowStat flowStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb30c677", new Object[]{this, flowStat});
        } else if (!this.isNetAnalysisValid) {
        } else {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(RequestStatistic requestStatistic) {
        int i;
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc2bb5c", new Object[]{this, requestStatistic});
        } else if (!this.isNetAnalysisValid) {
        } else {
            ALog.d(TAG, "commitFlow", null, new Object[0]);
            if (!NetworkConfigCenter.isNetworkAnalysisMonitor() || (requestStatistic.useMultiPath != 1 && !requestStatistic.isUseMPQuic)) {
                i = 0;
            } else {
                ALog.d(TAG, "multiPath commitFlow", null, new Object[0]);
                if (requestStatistic.useMultiPath != 1) {
                    i2 = 0;
                }
                i = requestStatistic.isUseMPQuic ? 2 : i2;
            }
            FlowCenter.getInstance().commitFlow(i, requestStatistic.f_refer, requestStatistic.url, requestStatistic.sendDataSize, requestStatistic.recDataSize, requestStatistic.rspEnd, requestStatistic.sendStart);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void createConnectCount(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0ed546", new Object[]{this, str, str2, str3});
        } else if (!this.isNetAnalysisValid) {
        } else {
            ALog.d(TAG, "createConnect", null, new Object[0]);
            FlowCenter.getInstance().createConnectCount(str, str2, str3);
        }
    }
}
