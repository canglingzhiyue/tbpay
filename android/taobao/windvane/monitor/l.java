package android.taobao.windvane.monitor;

import android.net.Uri;
import android.taobao.windvane.monitor.q;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.ag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String url;
    public boolean isInit = false;
    public long startTime = 0;
    public long init = 0;
    public String performanceInfo = "";
    public int wvAppMonitor = 1;
    public c stat = new c();
    public a args = new a();
    public String protocolType = "";

    /* loaded from: classes2.dex */
    public class a {
        public int statusCode;
        public String via;
        public q.a netStat = null;
        public Map<String, Long> selfDefine = new ConcurrentHashMap();
        public Map<String, b> resStat = new ConcurrentHashMap();

        static {
            kge.a(679819256);
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public class c {
        public long onLoad = 0;
        public long onDomLoad = 0;
        public int finish = 0;
        public int fromType = 1;
        public long firstByteTime = 0;
        public String packageAppVersion = "";
        public String packageAppName = "";
        public String appSeq = "";
        public long matchCost = -1;
        public int verifyError = 0;
        public long verifyResTime = 0;
        public long verifyTime = 0;
        public long allVerifyTime = 0;
        public int verifyCacheSize = 0;

        static {
            kge.a(-1363131028);
        }

        public c() {
        }
    }

    static {
        kge.a(628311692);
    }

    public HashMap<String, Object> toJsonStringMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8b7680f2", new Object[]{this});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("url", this.url);
        hashMap.put(ag.KEY_LOAD_TIME, Long.valueOf(this.stat.onLoad));
        hashMap.put(com.taobao.android.fluid.business.usertrack.track.b.PROPERTY_IS_FINISH, Integer.valueOf(this.stat.finish));
        hashMap.put("firstByte", Long.valueOf(this.stat.firstByteTime));
        hashMap.put("domLoad", Long.valueOf(this.stat.onDomLoad));
        hashMap.put(RVStartParams.KEY_FROM_TYPE, Integer.valueOf(this.stat.fromType));
        hashMap.put("matchCost", Long.valueOf(this.stat.matchCost));
        hashMap.put("statusCode", Integer.valueOf(this.args.statusCode));
        hashMap.put("packageappversion", this.stat.packageAppVersion);
        hashMap.put("packageAppName", this.stat.packageAppName);
        hashMap.put("verifyCacheSize", Integer.valueOf(this.stat.verifyCacheSize));
        hashMap.put("via", this.args.via);
        hashMap.put("verifyError", Integer.valueOf(this.stat.verifyError));
        hashMap.put("verifyResTime", Long.valueOf(this.stat.verifyResTime));
        hashMap.put("verifyTime", Long.valueOf(this.stat.verifyTime));
        hashMap.put("allVerifyTime", Long.valueOf(this.stat.allVerifyTime));
        if (this.args.netStat != null) {
            hashMap.put("netStat", toUtArray(this.args.netStat));
        }
        if (!this.args.resStat.isEmpty() && ((int) Math.ceil((Math.random() * 100.0d) + 0.5d)) <= k.getInstance().config.stat.resSample) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, b> entry : this.args.resStat.entrySet()) {
                if (entry.getValue().end - entry.getValue().start > k.getInstance().config.stat.resTime) {
                    Map<String, String> utMap = entry.getValue().toUtMap();
                    String key = entry.getKey();
                    Uri parse = Uri.parse(key);
                    if (parse != null && parse.isHierarchical()) {
                        utMap.put("url", key);
                        arrayList.add(utMap);
                    }
                }
            }
            hashMap.put("resStat", arrayList);
        }
        return hashMap;
    }

    public String[] toJsonStringDict() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("dccbaee0", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("fromType=" + this.stat.fromType);
        if (!StringUtils.isEmpty(this.stat.appSeq)) {
            arrayList.add("PackageApp-Seq=" + this.stat.appSeq);
            arrayList.add("PackageApp-Version=" + this.stat.packageAppVersion);
            arrayList.add("PackageApp-Name=" + this.stat.packageAppName);
        }
        if (this.stat.onDomLoad > 0) {
            arrayList.add("domLoad=" + this.stat.onDomLoad);
        }
        if (((int) Math.ceil((Math.random() * 100.0d) + 0.5d)) <= k.getInstance().config.stat.resSample && !this.args.resStat.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, b> entry : this.args.resStat.entrySet()) {
                if (entry.getValue().end - entry.getValue().start >= k.getInstance().config.stat.resTime) {
                    Map<String, String> utMap = entry.getValue().toUtMap();
                    utMap.put("url", entry.getKey());
                    jSONArray.put(new JSONObject(utMap));
                }
            }
            arrayList.add("resStat=" + jSONArray.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static b createNewResStatInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("411561cc", new Object[0]) : new b();
    }

    /* loaded from: classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long end;
        public int fromType;
        public q.a netStat;
        public long start;
        public int statusCode;
        public String via;
        public int verifyError = 0;
        public long verifyResTime = 0;
        public long verifyTime = 0;
        public long tcpTime = 0;
        public String protocolType = "";

        static {
            kge.a(-1421857540);
        }

        public Map<String, String> toUtMap() {
            Map<String, String> utMap;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("fd04be7e", new Object[]{this});
            }
            q.a aVar = this.netStat;
            if (aVar == null) {
                utMap = new HashMap<>();
            } else {
                utMap = l.toUtMap(aVar);
            }
            int i = this.statusCode;
            if (i > 0) {
                utMap.put("statusCode", String.valueOf(i));
            }
            String str = this.via;
            if (str != null) {
                utMap.put("via", str);
            }
            long j = this.start;
            if (j > 0) {
                utMap.put("start", String.valueOf(j));
            }
            long j2 = this.end;
            if (j2 > 0) {
                utMap.put("end", String.valueOf(j2));
            }
            utMap.put(RVStartParams.KEY_FROM_TYPE, String.valueOf(this.fromType));
            utMap.put("protocolType", this.protocolType);
            utMap.put("tcpTime", String.valueOf(this.tcpTime));
            utMap.put("verifyError", String.valueOf(this.verifyError));
            utMap.put("verifyResTime", String.valueOf(this.verifyResTime));
            utMap.put("verifyTime", String.valueOf(this.verifyTime));
            return utMap;
        }
    }

    public static Map<String, String> toUtMap(q.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6c639538", new Object[]{aVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("net_dnsTime", String.valueOf(aVar.dnsTime));
        hashMap.put("net_isDNSTimeout", String.valueOf((int) aVar.isDNSTimeout));
        hashMap.put("net_oneWayTime", String.valueOf(aVar.oneWayTime));
        hashMap.put("net_tcpLinkDate", String.valueOf(aVar.tcpLinkDate));
        hashMap.put("net_waitTime", String.valueOf(aVar.waitTime));
        hashMap.put("net_postBodyTime", String.valueOf(aVar.postBodyTime));
        hashMap.put("net_firstDataTime", String.valueOf(aVar.firstDataTime));
        hashMap.put("net_serverRT", String.valueOf(aVar.serverRT));
        hashMap.put("net_totalSize", String.valueOf(aVar.totalSize));
        hashMap.put("net_recDataTime", String.valueOf(aVar.recDataTime));
        hashMap.put("net_isSSL", String.valueOf(aVar.isSSL));
        hashMap.put("net_dataSpeed", String.valueOf(aVar.dataSpeed));
        hashMap.put("net_spdy", String.valueOf(aVar.spdy));
        return hashMap;
    }

    public static ArrayList<String> toUtArray(q.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1f619e40", new Object[]{aVar});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, String> entry : toUtMap(aVar).entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        return arrayList;
    }
}
