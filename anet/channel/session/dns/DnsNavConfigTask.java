package anet.channel.session.dns;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class DnsNavConfigTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Domain = "domain";
    public static final String MatchKey = "matchKey";
    public static final String MatchType = "matchType";
    public static final String PathComplete = "path-complete";
    public static final String PathPrefix = "path-prefix";
    public static final String PreCONN = "preConnectHost";
    public static final String PreDNS = "preDnsHost";
    public static final String URLComplete = "url-complete";
    public static final String URLPrefix = "url-prefix";
    private String matchKey;
    private String matchType;
    private List<String> preConnectHost;
    private List<String> preDnsHost;

    static {
        kge.a(-784611585);
    }

    public DnsNavConfigTask(String str, String str2, List<String> list, List<String> list2) {
        this.preConnectHost = null;
        this.preDnsHost = null;
        this.matchKey = str;
        this.matchType = str2;
        this.preConnectHost = list;
        this.preDnsHost = list2;
    }

    public String getMatchKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cfa6b929", new Object[]{this}) : this.matchKey;
    }

    public String getMatchType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("773706b0", new Object[]{this}) : this.matchType;
    }

    public List<String> getHostListByOption(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("21fe7cee", new Object[]{this, str});
        }
        if (PreDNS.equalsIgnoreCase(str)) {
            return this.preDnsHost;
        }
        if (!PreCONN.equalsIgnoreCase(str)) {
            return null;
        }
        return this.preConnectHost;
    }
}
