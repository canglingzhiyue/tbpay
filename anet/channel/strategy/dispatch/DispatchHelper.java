package anet.channel.strategy.dispatch;

import anet.channel.AwcnConfig;
import anet.channel.detect.Ipv6Detector;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.Utils;
import anet.channel.util.HttpConstant;
import anet.channel.util.Inet64Util;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import tb.kge;

/* loaded from: classes2.dex */
public class DispatchHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Random random;

    static {
        kge.a(-1318072544);
        random = new Random();
    }

    public static List<IConnStrategy> prepareConnStrategy(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("65c1c2a6", new Object[]{str, str2});
        }
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        if (!NetworkStatusHelper.isProxy()) {
            list = StrategyCenter.getInstance().getConnStrategyListByHost(str2);
            ListIterator<IConnStrategy> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                IConnStrategy next = listIterator.next();
                if (next.getProtocol().protocol.equalsIgnoreCase(str) && (!Inet64Util.isIPv6OnlyNetwork() || !Utils.isIPV4Address(next.getIp()))) {
                    if ((!Inet64Util.isIPv6OnlyNetwork() && AwcnConfig.isAmdcNotUseIpv6Opened()) || Inet64Util.isIPv4OnlyNetwork() || Ipv6Detector.detectIpv6Status() == 0) {
                        if (Utils.isIPV6Address(next.getIp())) {
                        }
                    }
                }
                listIterator.remove();
            }
        }
        return list;
    }

    public static String buildRequestUrl(String str, String str2, int i, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aecdff7a", new Object[]{str, str2, new Integer(i), str3, str4, new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder(64);
        if (z && "https".equalsIgnoreCase(str) && random.nextBoolean()) {
            str = "http";
        }
        sb.append(str);
        sb.append(HttpConstant.SCHEME_SPLIT);
        if (str2 != null) {
            if (AwcnConfig.isAllowConvertIPv4ToIPv6() && Inet64Util.isIPv6OnlyNetwork() && Utils.isIPV4Address(str2)) {
                try {
                    str2 = Inet64Util.convertToIPv6ThrowsException(str2);
                } catch (Exception unused) {
                }
            }
            if (Utils.isIPV6Address(str2)) {
                sb.append('[');
                sb.append(str2);
                sb.append(']');
            } else {
                sb.append(str2);
            }
            if (i == 0) {
                i = "https".equalsIgnoreCase(str) ? 443 : 80;
            }
            sb.append(":");
            sb.append(i);
        } else {
            sb.append(str3);
        }
        sb.append(str4);
        return sb.toString();
    }
}
