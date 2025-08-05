package anet.channel.util;

import anet.channel.AwcnConfig;
import anet.channel.Session;
import anet.channel.entity.ConnInfo;
import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import tb.kge;

/* loaded from: classes.dex */
public class ComplexUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int IP_COMPLEX = 2;
    public static final int IP_DEGRADE = 1;
    private static final String TAG = "awcn.ComplexUtils";

    static {
        kge.a(1583165999);
    }

    public static boolean isAllowComplexConnect(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b711d58", new Object[]{str, str2})).booleanValue() : AwcnConfig.isComplexConnectEnable() && AwcnConfig.isAllowComplexConnect(str) && (AwcnConfig.isConnRacingEnable() || Inet64Util.getStackType() == 3) && anet.channel.strategy.utils.Utils.isIPV6Address(str2);
    }

    public static long getComplexConnectDelayTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b2196a3b", new Object[0])).longValue() : AwcnConfig.getComplexConnectDelayTime();
    }

    public static List<ConnInfo> getComplexIpList(Session session, List<ConnInfo> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("af2eb0f3", new Object[]{session, list, new Integer(i)});
        }
        if (i != 1) {
            return null;
        }
        return getIpDegradeList(session, list);
    }

    private static List<ConnInfo> getIpDegradeList(Session session, List<ConnInfo> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a7115080", new Object[]{session, list});
        }
        ArrayList arrayList = new ArrayList();
        if (session == null) {
            return arrayList;
        }
        try {
            boolean isHttpType = session.getConnType().isHttpType();
            if (list != null && list.size() != 0) {
                ListIterator<ConnInfo> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    ConnInfo next = listIterator.next();
                    if (anet.channel.strategy.utils.Utils.isIPV4Address(next.getIp()) && !(next.getConnType().isHttpType() ^ isHttpType)) {
                        String host = next.getHost();
                        arrayList.add(new ConnInfo(host, "COMPLEX-" + next.getSeq(), next.strategy));
                    }
                }
            }
            if (arrayList.isEmpty() && session != null) {
                List<IConnStrategy> ipv4ConnStrategyListByHost = StrategyCenter.getInstance().getIpv4ConnStrategyListByHost(session.getRealHost(), session.getHost().startsWith("https"), session.getConnType().getType());
                if (ipv4ConnStrategyListByHost.isEmpty()) {
                    return arrayList;
                }
                int i = 0;
                for (int i2 = 0; i2 < ipv4ConnStrategyListByHost.size(); i2++) {
                    IConnStrategy iConnStrategy = ipv4ConnStrategyListByHost.get(i2);
                    if (!(ConnType.valueOf(iConnStrategy.getProtocol()).isHttpType() ^ isHttpType)) {
                        int retryTimes = iConnStrategy.getRetryTimes();
                        int i3 = i;
                        for (int i4 = 0; i4 <= retryTimes; i4++) {
                            i3++;
                            String host2 = session.getHost();
                            ConnInfo connInfo = new ConnInfo(host2, "COMPLEX-" + session.mSeq + "_" + i3, iConnStrategy);
                            connInfo.retryTime = i4;
                            connInfo.maxRetryTime = retryTimes;
                            arrayList.add(connInfo);
                        }
                        i = i3;
                    }
                }
            }
            str = null;
        } catch (Exception e) {
            str = null;
            ALog.e(TAG, "getIpDegradeList failed", null, e, new Object[0]);
        }
        ALog.d(TAG, "getIpDegradeList" + arrayList.toString(), str, new Object[0]);
        return arrayList;
    }
}
