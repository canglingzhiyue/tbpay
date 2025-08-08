package com.alipay.mobile.common.transport.httpdns;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.alipay.mobile.common.netsdkextdependapi.monitorinfo.MonitorLoggerModel;
import com.alipay.mobile.common.netsdkextdependapi.userinfo.UserInfoUtil;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.context.TransportContext;
import com.alipay.mobile.common.transport.ext.ExtTransportOffice;
import com.alipay.mobile.common.transport.http.HttpContextExtend;
import com.alipay.mobile.common.transport.httpdns.downloader.ConfigSelector;
import com.alipay.mobile.common.transport.httpdns.downloader.StrategyRequest;
import com.alipay.mobile.common.transport.monitor.MonitorLoggerUtils;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MpaasPropertiesUtil;
import com.alipay.mobile.common.transport.utils.NetworkAsyncTaskExecutor;
import com.alipay.mobile.common.transport.utils.NetworkUtils;
import com.alipay.mobile.common.transport.utils.NwSharedSwitchUtil;
import com.alipay.mobile.common.transport.utils.SwitchMonitorLogUtil;
import com.alipay.mobile.common.transport.utils.TransportContextThreadLocalUtils;
import com.alipay.mobile.common.transport.utils.TransportEnvUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.core.Constrant;
import com.taobao.search.common.util.k;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import tb.riy;

/* loaded from: classes3.dex */
public class HttpDns {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static int IP_TYPE_V4 = 4;
    public static int IP_TYPE_V6 = 6;
    public static final int REQ_STATUS_BUSY = 1;
    public static final int REQ_STATUS_IDLE = 0;
    public static final String TAG = "HDNS";
    public static long localDnsExpire = 300000;

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<String> f5579a;
    private String b;
    private ArgType c;
    private DnsLocalManager d;
    private GetAllByNameHelper e;
    private Context f;
    public boolean fail;
    private int g;
    private int h;
    public boolean hashost;
    public String httpServerUrl;
    public String httpdns_domain;
    public int httpdns_port;
    private long i;
    private long j;
    private boolean k;
    public String path;
    public final String schema;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum ArgType {
        LIST_INIT,
        ADD_NEW,
        HAS_FAIL
    }

    /* loaded from: classes3.dex */
    public class DnsReqTask implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DnsReqTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HttpDns.access$200(HttpDns.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class DnsReqTaskStrong implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ConfigSelector f5581a;

        public DnsReqTaskStrong(ConfigSelector configSelector) {
            this.f5581a = configSelector;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                HttpDns.access$300(HttpDns.this, this.f5581a);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class SimpleLocalDnsModel {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long expirTime = -1;
        public InetAddress[] inetAddressesCache;

        public SimpleLocalDnsModel() {
        }

        public boolean isExpiration() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ec36784", new Object[]{this})).booleanValue() : System.currentTimeMillis() > this.expirTime;
        }
    }

    /* loaded from: classes3.dex */
    public static class Singleton {
        public static HttpDns instance = new HttpDns();

        private Singleton() {
        }
    }

    public static /* synthetic */ Context access$100(HttpDns httpDns) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cd146240", new Object[]{httpDns}) : httpDns.f;
    }

    public static /* synthetic */ void access$200(HttpDns httpDns) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edc92809", new Object[]{httpDns});
        } else {
            httpDns.c();
        }
    }

    public static /* synthetic */ void access$300(HttpDns httpDns, ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fce740", new Object[]{httpDns, configSelector});
        } else {
            httpDns.b(configSelector);
        }
    }

    public static HttpDns getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HttpDns) ipChange.ipc$dispatch("fe9831d4", new Object[0]) : Singleton.instance;
    }

    public ArrayList<String> getHosts() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("eeef95f6", new Object[]{this}) : this.f5579a;
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.f = context;
        HttpContextExtend.createInstance(context);
    }

    private HttpDns() {
        this.schema = k.HTTP_PREFIX;
        this.g = 0;
        this.httpServerUrl = null;
        this.h = 0;
        this.i = System.currentTimeMillis();
        this.j = 3600000L;
        this.k = false;
        this.httpdns_domain = DnsUtil.getAmdcHost();
        this.httpServerUrl = k.HTTP_PREFIX + this.httpdns_domain + "/query";
        this.path = "/query";
        this.httpdns_port = 80;
        this.fail = false;
        this.b = "";
        this.hashost = true;
        this.c = ArgType.LIST_INIT;
        this.f5579a = new ArrayList<>();
        this.h = 0;
        this.i = System.currentTimeMillis();
        this.k = false;
    }

    private synchronized String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
        }
        String a2 = a();
        if (StringUtils.isEmpty(a2)) {
            a2 = b(i);
        }
        if (DnsUtil.isUseSign()) {
            a2 = a2.replace("query", "squery");
        }
        if (DnsUtil.amdcUp2Https()) {
            a2 = c(i);
        }
        if (!this.f5579a.contains(this.httpdns_domain)) {
            this.f5579a.add(this.httpdns_domain);
        }
        return a2;
    }

    private String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da9643a6", new Object[]{this, new Integer(i)});
        }
        try {
            HttpdnsIP queryLocalIPByHost = AlipayHttpDnsClient.getDnsClient().queryLocalIPByHost(this.httpdns_domain);
            if (queryLocalIPByHost != null) {
                return a(i, queryLocalIPByHost);
            }
            if (!StringUtils.isEmpty(MpaasPropertiesUtil.getWorkspaceId(TransportEnvUtil.getContext()))) {
                return this.httpServerUrl;
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.HTTP_DNS_AMDC_IP);
            if (StringUtils.isEmpty(stringValue)) {
                return this.httpServerUrl;
            }
            String str = k.HTTP_PREFIX + stringValue + ":" + String.valueOf(this.httpdns_port) + this.path;
            try {
                if (!Arrays.asList(InetAddress.getAllByName(this.httpdns_domain)).contains(InetAddress.getByName("0.0.0.0"))) {
                    return this.httpServerUrl;
                }
                LogCatUtil.debug(TAG, "isp break,use embedded ip,url= " + str);
                this.k = true;
                return str;
            } catch (UnknownHostException unused) {
                LogCatUtil.debug(TAG, "UnknownHostException,use embedded ip,url= " + str);
                this.k = true;
                return str;
            }
        } catch (Throwable th) {
            LogCatUtil.error(TAG, "getOnlieUrl ex:" + th.toString());
            return this.httpServerUrl;
        }
    }

    private String a(int i, HttpdnsIP httpdnsIP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("532429d9", new Object[]{this, new Integer(i), httpdnsIP});
        }
        String[] ips = httpdnsIP.getIps();
        int length = ips.length;
        if (length <= 0) {
            LogCatUtil.info(TAG, "length <= 0,use host " + this.httpdns_domain);
            return this.httpServerUrl;
        } else if (i == 1) {
            String str = ips[0];
            return k.HTTP_PREFIX + str + ":" + String.valueOf(this.httpdns_port) + this.path;
        } else if (i != 2) {
            return this.httpServerUrl;
        } else {
            if (length >= 2) {
                String str2 = ips[1];
                return k.HTTP_PREFIX + str2 + ":" + String.valueOf(this.httpdns_port) + this.path;
            }
            return this.httpServerUrl;
        }
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        try {
            if (!MiscUtils.isDebugger(this.f)) {
                return "";
            }
            String httpdnsServerUrl = DnsUtil.getHttpdnsServerUrl(this.f);
            if (StringUtils.isEmpty(httpdnsServerUrl)) {
                return null;
            }
            String host = new URL(httpdnsServerUrl).getHost();
            if (!this.f5579a.contains(host)) {
                this.f5579a.add(host);
            }
            LogCatUtil.debug(TAG, "debug mode,url:" + httpdnsServerUrl);
            return httpdnsServerUrl;
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
            return null;
        }
    }

    private String c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24c7dce7", new Object[]{this, new Integer(i)});
        }
        if (i > 2) {
            return DnsUtil.getAmdcBackupHttpsServerUrl();
        }
        return DnsUtil.getAmdcHttpsServerUrl();
    }

    public synchronized void setHosts(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e998bfba", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (str != null && this.f5579a != null) {
            a(str);
            if (this.hashost && z) {
                this.c = ArgType.LIST_INIT;
                if (AlipayHttpDnsClient.getDnsClient().getFlag() == 1 && MiscUtils.isMainProcessRuning(TransportEnvUtil.getContext())) {
                    ExtTransportOffice.getInstance().notifyPush2UpdateInfo(this.f, true);
                    LogCatUtil.warn(TAG, "setHosts, workMode: NO_COMPLETE, not allowed httpdns request,notify push to update ...");
                    return;
                }
                delayRequestStrong(1);
                LogCatUtil.debug(TAG, "Start polling everything");
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        String[] split = str.split(",");
        if (split == null) {
            return;
        }
        for (int i = 0; i < split.length; i++) {
            if (DnsUtil.isLogicHost(split[i])) {
                this.hashost = true;
                if (!this.f5579a.contains(split[i])) {
                    this.f5579a.add(split[i]);
                }
            }
        }
    }

    public synchronized void setHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2fc43b", new Object[]{this, str});
        } else if (this.f5579a == null) {
        } else {
            if (DnsUtil.isLogicHost(str) && (str.contains("cdn") || str.contains("mobilegw") || str.contains("alipayobjects"))) {
                this.c = ArgType.ADD_NEW;
                this.hashost = true;
                if (!this.f5579a.contains(str)) {
                    this.f5579a.add(str);
                }
                httpDnsRequest();
            }
        }
    }

    public synchronized List<String> getDomains() {
        int size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14e2f247", new Object[]{this});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.c != ArgType.LIST_INIT && this.c != ArgType.HAS_FAIL) {
            if (this.c == ArgType.ADD_NEW && (size = this.f5579a.size()) > 1) {
                arrayList.add(this.f5579a.get(size - 1));
            }
            return arrayList;
        }
        arrayList = this.f5579a;
        return arrayList;
    }

    private StrategyRequest a(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyRequest) ipChange.ipc$dispatch("8b7f5f0b", new Object[]{this, configSelector});
        }
        StrategyRequest strategyRequest = new StrategyRequest();
        if (configSelector != ConfigSelector.GET_ALL) {
            strategyRequest.setS(configSelector.ordinal());
            LogCatUtil.debug(TAG, "Request Opt:" + configSelector);
        }
        if (StringUtils.equals(TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.HTTP_DNS_V2), "T")) {
            strategyRequest.setDg(DnsUtil.getDomainGroup());
        } else {
            List<String> domains = getDomains();
            if (domains == null || domains.size() == 0) {
                LogCatUtil.info(TAG, "domains is null");
            } else {
                strategyRequest.setDomains(domains);
            }
        }
        String lastUserId = UserInfoUtil.getLastUserId();
        if (StringUtils.isEmpty(lastUserId)) {
            lastUserId = DnsEnv.getInstance().getAmdcUid();
        }
        if (!StringUtils.isEmpty(lastUserId)) {
            strategyRequest.setUid(lastUserId);
        }
        String tradeNo = DnsEnv.getInstance().getTradeNo();
        if (!StringUtils.isEmpty(tradeNo)) {
            strategyRequest.setTradeNo(tradeNo);
        }
        strategyRequest.setClientVersion(a(this.f));
        try {
            strategyRequest.setUtdid(HttpContextExtend.getInstance().getDid());
        } catch (Exception e) {
            LogCatUtil.error(TAG, e);
        }
        String wsid = DnsUtil.getWsid();
        if (!StringUtils.isEmpty(wsid)) {
            strategyRequest.setWsid(wsid);
        }
        String configVersion = DnsUtil.getConfigVersion();
        if (!StringUtils.isEmpty(configVersion)) {
            strategyRequest.setConfigVersion(configVersion);
        }
        strategyRequest.setNetType(NetworkUtils.getNetworkType(this.f));
        strategyRequest.setIpType(10);
        return strategyRequest;
    }

    public void sendRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fa6eaee", new Object[]{this});
        } else {
            sendRequest(ConfigSelector.GET_ALL);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    public void sendRequest(com.alipay.mobile.common.transport.httpdns.downloader.ConfigSelector r24) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.transport.httpdns.HttpDns.sendRequest(com.alipay.mobile.common.transport.httpdns.downloader.ConfigSelector):void");
    }

    private long a(long j, Map<String, HttpdnsIP> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("445b209d", new Object[]{this, new Long(j), map})).longValue();
        }
        if (this.d == null) {
            return j;
        }
        this.fail = false;
        this.b = "";
        long uptimeMillis = SystemClock.uptimeMillis();
        this.d.storeIp2CacheAndDB(map);
        return SystemClock.uptimeMillis() - uptimeMillis;
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!TransportStrategy.isOpenAmdcSwitch()) {
            LogCatUtil.debug(TAG, "dnsSwitch is off");
            return false;
        } else if (!NetworkUtils.isNetworkAvailable(this.f)) {
            LogCatUtil.info(TAG, "network is not available...");
            return false;
        } else if ((!MiscUtils.isInAlipayClient(this.f) && !TransportStrategy.isEnabledEnhanceNetworkModule()) || TransportStrategy.isNetworkRunInSingleProcess(this.f)) {
            return true;
        } else {
            if (AlipayHttpDnsClient.getDnsClient().getFlag() == 1) {
                ExtTransportOffice.getInstance().notifyPush2UpdateInfo(this.f, false);
                LogCatUtil.warn(TAG, "sendRequest,workMode: NO_COMPLETE, not allowed httpdns request,notify push to update...");
                return false;
            } else if (!MiscUtils.isRealPushProcess(this.f)) {
                LogCatUtil.debug(TAG, "wallet not push process, ingore httpdns request");
                return false;
            } else {
                if (this.h > 20) {
                    if (this.i + this.j < System.currentTimeMillis()) {
                        this.h = 0;
                        this.i = System.currentTimeMillis();
                    } else {
                        LogCatUtil.debug(TAG, "already request 20 an hour,return");
                        return false;
                    }
                }
                this.h++;
                return true;
            }
        }
    }

    public void notifyUpdateConfig(final String str, ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834e111b", new Object[]{this, str, configSelector});
        } else if (StringUtils.isEmpty(str) || configSelector == ConfigSelector.GET_IPLIST_ONLY) {
        } else {
            NetworkAsyncTaskExecutor.executeLowPri(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.HttpDns.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    SwitchMonitorLogUtil.monitorCoreSwitchRecvLog(HttpDns.access$100(HttpDns.this), str, SwitchMonitorLogUtil.SRC_AMDC);
                    NwSharedSwitchUtil.putSwitchSrc(SwitchMonitorLogUtil.SRC_AMDC);
                    TransportConfigureManager.getInstance().updateConfig(HttpDns.access$100(HttpDns.this), str, true);
                    SwitchMonitorLogUtil.monitorSwitchUpdatedLog(HttpDns.access$100(HttpDns.this), SwitchMonitorLogUtil.SRC_AMDC);
                    LogCatUtil.debug(HttpDns.TAG, "收到服务器紧急开关：" + str);
                }
            });
        }
    }

    private void a(long j, long j2, String str, boolean z, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6054546b", new Object[]{this, new Long(j), new Long(j2), str, new Boolean(z), new Integer(i), str2});
            return;
        }
        try {
            MonitorLoggerModel monitorLoggerModel = new MonitorLoggerModel();
            monitorLoggerModel.setSubType("HTTPDNS");
            monitorLoggerModel.setParam1(MonitorLoggerUtils.getLogBizType("HTTPDNS"));
            monitorLoggerModel.setParam2("INFO");
            monitorLoggerModel.setParam3("http");
            Map<String, String> extPramas = monitorLoggerModel.getExtPramas();
            extPramas.put(RPCDataItems.DNS_STORE_TIME, j2 + "ms");
            Map<String, String> extPramas2 = monitorLoggerModel.getExtPramas();
            extPramas2.put(RPCDataItems.DNS_RTT, j + "ms");
            monitorLoggerModel.getExtPramas().put("RESULT", this.fail ? UTConstant.Args.UT_SUCCESS_F : "T");
            monitorLoggerModel.getExtPramas().put(RPCDataItems.CLIENT_IP, str);
            monitorLoggerModel.getExtPramas().put("OVERSEA", String.valueOf(z));
            monitorLoggerModel.getExtPramas().put("TTD", String.valueOf(i));
            monitorLoggerModel.getExtPramas().put("REQNUM", String.valueOf(this.h));
            monitorLoggerModel.getExtPramas().put(MonitorItemConstants.KEY_URL, str2);
            monitorLoggerModel.getExtPramas().put("BACKUP", String.valueOf(this.k));
            monitorLoggerModel.getExtPramas().put("DG", DnsUtil.getDomainGroup());
            monitorLoggerModel.getExtPramas().put("UID", DnsEnv.getInstance().getAmdcUid());
            Context context = TransportEnvUtil.getContext();
            if (!MiscUtils.isInAlipayClient(context)) {
                monitorLoggerModel.getExtPramas().put("APP_SYS_ID", context.getPackageName());
                monitorLoggerModel.getExtPramas().put("x-appid", DnsUtil.getAppId());
            }
            if (!StringUtils.isEmpty(DnsUtil.getConfigVersion())) {
                monitorLoggerModel.getExtPramas().put("CONFIGVER", DnsUtil.getConfigVersion());
            }
            if (MiscUtils.isAtFrontDesk(TransportEnvUtil.getContext())) {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.GROUND, "FG");
            } else {
                monitorLoggerModel.getExtPramas().put(RPCDataItems.GROUND, Constrant.ChangeType.BG);
            }
            if (!StringUtils.isEmpty(this.b)) {
                monitorLoggerModel.getExtPramas().put("ERROR", this.b);
            }
            String localIPv6Address = NetworkUtils.getLocalIPv6Address();
            if (!StringUtils.isEmpty(localIPv6Address)) {
                monitorLoggerModel.getExtPramas().put("IPv6", localIPv6Address);
            }
            this.fail = false;
            this.b = "";
            this.k = false;
            LogCatUtil.debug(TAG, monitorLoggerModel.toString());
            MonitorLoggerUtils.uploadPerfLog(monitorLoggerModel);
        } catch (Throwable th) {
            LogCatUtil.error(TAG, th);
        }
    }

    private String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo != null ? packageInfo.versionName : "";
        } catch (Exception e) {
            LogCatUtil.error(TAG, "getApplicationVersion exception", e);
            return "";
        }
    }

    public InetAddress[] getAllByNameFromInetAddr(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetAddress[]) ipChange.ipc$dispatch("54900540", new Object[]{this, str}) : getGetAllByNameHelper().getAllByName(str);
    }

    public InetAddress[] getAllByNameFromInetAddr(String str, TransportContext transportContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InetAddress[]) ipChange.ipc$dispatch("47e9becd", new Object[]{this, str, transportContext}) : getGetAllByNameHelper().getAllByName(str, transportContext);
    }

    public synchronized void setErrorByHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc59bdd6", new Object[]{this, str});
            return;
        }
        AlipayHttpDnsClient.getDnsClient().httpdnsStorage.deleteIpByHost(str);
        this.c = ArgType.HAS_FAIL;
        httpDnsRequestStrong();
    }

    public synchronized void cleanErrorIp(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2472eae1", new Object[]{this, str, str2});
            return;
        }
        AlipayHttpDnsClient.getDnsClient().httpdnsStorage.deleteSingleIpFromDB(str, str2);
        this.c = ArgType.HAS_FAIL;
        httpDnsRequest();
    }

    public void requestWeak(ThreadType threadType) {
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1586ed", new Object[]{this, threadType});
        } else if (threadType == ThreadType.HTTPDNSREQUEST_TIMEOUT || threadType == ThreadType.HTTPDNSREQUEST_INIT) {
            ArrayList<String> arrayList2 = this.f5579a;
            if (arrayList2 == null || arrayList2.size() == 0) {
                return;
            }
            this.hashost = true;
            this.c = ArgType.LIST_INIT;
            httpDnsRequest();
        } else if (threadType != ThreadType.HTTPDNSREQUEST_NEWADD || (arrayList = this.f5579a) == null || arrayList.size() == 0) {
        } else {
            this.hashost = true;
            this.c = ArgType.ADD_NEW;
            httpDnsRequest();
        }
    }

    public void httpDnsRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("863b5d55", new Object[]{this});
        } else if (!this.hashost) {
        } else {
            addTaskToPool();
        }
    }

    public void addTaskToPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f453ca4", new Object[]{this});
        } else {
            NetworkAsyncTaskExecutor.execute(new DnsReqTask());
        }
    }

    public void requestStrong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae9ff8d", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.f5579a;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        this.hashost = true;
        this.c = ArgType.LIST_INIT;
        httpDnsRequestStrong();
    }

    public void delayRequestStrong(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89e9ff9", new Object[]{this, new Integer(i)});
        } else {
            delayRequestStrong(i, ConfigSelector.GET_ALL);
        }
    }

    public void delayRequestStrong(final int i, final ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9e3b2f", new Object[]{this, new Integer(i), configSelector});
            return;
        }
        ArrayList<String> arrayList = this.f5579a;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        this.hashost = true;
        this.c = ArgType.LIST_INIT;
        NetworkAsyncTaskExecutor.execute(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.HttpDns.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    Thread.sleep(i * 1000);
                } catch (InterruptedException e) {
                    LogCatUtil.warn(HttpDns.TAG, e.toString());
                }
                HttpDns.this.httpDnsRequestStrong(configSelector);
            }
        });
    }

    public void httpDnsRequestStrong() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0093a0c", new Object[]{this});
        } else {
            httpDnsRequestStrong(ConfigSelector.GET_ALL);
        }
    }

    public void httpDnsRequestStrong(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b19ba302", new Object[]{this, configSelector});
        } else if (!this.hashost) {
        } else {
            addStrongTaskToPool(configSelector);
        }
    }

    public void addStrongTaskToPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e3fa65b", new Object[]{this});
        } else {
            addStrongTaskToPool(ConfigSelector.GET_ALL);
        }
    }

    public void addStrongTaskToPool(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d6011", new Object[]{this, configSelector});
        } else {
            NetworkAsyncTaskExecutor.execute(new DnsReqTaskStrong(configSelector));
        }
    }

    /* loaded from: classes3.dex */
    public static class HttpdnsIP {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f5583a;
        private long b;
        private long c;
        public String cname;
        private int d;
        public HttpdnsIPEntry[] ipEntries;
        public int ttd;

        public HttpdnsIP() {
            this.ttd = 3;
        }

        public HttpdnsIP(String str, long j) {
            this.f5583a = str;
            this.b = j;
            this.c = System.currentTimeMillis();
            this.ttd = 3;
        }

        public boolean isTimeOut(long j) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e773c0ca", new Object[]{this, new Long(j)})).booleanValue() : System.currentTimeMillis() > this.c + j;
        }

        public boolean isTimeOut() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("93da6dc2", new Object[]{this})).booleanValue() : System.currentTimeMillis() > this.b;
        }

        public boolean isDie() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40321081", new Object[]{this})).booleanValue() : System.currentTimeMillis() > this.c + ((long) ((((this.ttd * 24) * 60) * 60) * 1000));
        }

        public String getIp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d02517fc", new Object[]{this});
            }
            try {
                if (!StringUtils.isEmpty(this.cname)) {
                    return getIps()[0];
                }
                return this.f5583a;
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "getIp ex:" + th.toString());
                return "";
            }
        }

        public void setIp(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("890b3afa", new Object[]{this, str});
            } else {
                this.f5583a = str;
            }
        }

        public long getTtl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("219ac31", new Object[]{this})).longValue() : this.b;
        }

        public void setTtl(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bd4b333", new Object[]{this, new Long(j)});
            } else {
                this.b = j;
            }
        }

        public long getTime() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue() : this.c;
        }

        public void setTime(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b1b1a2e", new Object[]{this, new Long(j)});
            } else {
                this.c = j;
            }
        }

        public String getCname() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c0bd7a41", new Object[]{this}) : this.cname;
        }

        public void setCname(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ca63bd", new Object[]{this, str});
            } else {
                this.cname = str;
            }
        }

        public String[] getIps() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("48f1710c", new Object[]{this});
            }
            try {
                HttpdnsIPEntry[] ipEntries = getIpEntries();
                if (ipEntries == null) {
                    return null;
                }
                String[] strArr = new String[ipEntries.length];
                for (int i = 0; i < ipEntries.length; i++) {
                    strArr[i] = ipEntries[i].ip;
                }
                LogCatUtil.debug(HttpDns.TAG, "getIps :" + Arrays.toString(strArr));
                return strArr;
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "getIps ex:" + th.toString());
                LogCatUtil.info(HttpDns.TAG, "getIps return null");
                return null;
            }
        }

        public HttpdnsIPEntry[] getIpEntries() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("74dbd79c", new Object[]{this});
            }
            HttpdnsIPEntry[] httpdnsIPEntryArr = this.ipEntries;
            return httpdnsIPEntryArr != null ? httpdnsIPEntryArr : a();
        }

        private HttpdnsIPEntry[] a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HttpdnsIPEntry[]) ipChange.ipc$dispatch("9f05102e", new Object[]{this});
            }
            try {
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "getHttpdnsIpEntrys ex:" + th.toString());
            }
            if (!StringUtils.isEmpty(this.cname)) {
                InetAddress[] allByName = DnsUtil.getAllByName(this.cname);
                HttpdnsIPEntry[] httpdnsIPEntryArr = new HttpdnsIPEntry[allByName.length];
                for (int i = 0; i < allByName.length; i++) {
                    httpdnsIPEntryArr[i] = new HttpdnsIPEntry(String.valueOf(allByName[i].getHostAddress()), 4, -1);
                }
                LogCatUtil.debug(HttpDns.TAG, "getHttpdnsIpEntrys cname:" + this.cname + ",local dns result:" + Arrays.toString(httpdnsIPEntryArr));
                if (httpdnsIPEntryArr.length > 0) {
                    setIpEntries(httpdnsIPEntryArr);
                    setIp(httpdnsIPEntryArr[0].ip);
                }
                return httpdnsIPEntryArr;
            }
            if (this.ipEntries != null && this.ipEntries.length > 0) {
                return this.ipEntries;
            }
            LogCatUtil.info(HttpDns.TAG, "getHttpdnsIpEntrys return null");
            return null;
        }

        public void setIpEntries(HttpdnsIPEntry[] httpdnsIPEntryArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("33f2f02e", new Object[]{this, httpdnsIPEntryArr});
            } else {
                this.ipEntries = httpdnsIPEntryArr;
            }
        }

        public int getNetType() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3f8f4e3b", new Object[]{this})).intValue() : this.d;
        }

        public void setNetType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e8a3e8c7", new Object[]{this, new Integer(i)});
            } else {
                this.d = i;
            }
        }

        public int getTtd() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1a8f028", new Object[]{this})).intValue() : this.ttd;
        }

        public void setTtd(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e2dea7a", new Object[]{this, new Integer(i)});
            } else {
                this.ttd = i;
            }
        }

        public boolean isHasIPv6() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("47019802", new Object[]{this})).booleanValue();
            }
            HttpdnsIPEntry[] httpdnsIPEntryArr = this.ipEntries;
            if (httpdnsIPEntryArr != null && httpdnsIPEntryArr.length > 0) {
                int i = 0;
                while (true) {
                    HttpdnsIPEntry[] httpdnsIPEntryArr2 = this.ipEntries;
                    if (i >= httpdnsIPEntryArr2.length) {
                        break;
                    } else if (httpdnsIPEntryArr2[i].ipType == HttpDns.IP_TYPE_V6) {
                        return true;
                    } else {
                        i++;
                    }
                }
            }
            return false;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "HttpdnsIP{ip='" + this.f5583a + "', ttl=" + this.b + ", time=" + this.c + ", netType=" + this.d + ", ipEntries=" + Arrays.toString(this.ipEntries) + ", cname='" + this.cname + "', ttd=" + this.ttd + ", hasIPv6=" + isHasIPv6() + '}';
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (System.currentTimeMillis() - this.d.getLastUpdateTime() < Long.valueOf(TransportConfigureManager.getInstance().getLongValue(TransportConfigureItem.HTTPDNS_REQUEST_INTERVAL)).longValue()) {
            LogCatUtil.info(TAG, "weakSyncSendRequest ,(System.currentTimeMillis() - reqLastTime) < 10m, return.");
        } else {
            synchronized (this) {
                if (this.g == 1) {
                    LogCatUtil.info(TAG, "REQ_STATUS_BUSY, return.");
                    return;
                }
                this.g = 1;
                try {
                    LogCatUtil.info(TAG, "开始执行弱请求...");
                    sendRequest();
                } finally {
                    this.g = 0;
                }
            }
        }
    }

    private void b(ConfigSelector configSelector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e923eb1f", new Object[]{this, configSelector});
            return;
        }
        synchronized (this) {
            if (this.g == 1) {
                LogCatUtil.info(TAG, "REQ_STATUS_BUSY, return.");
                return;
            }
            this.g = 1;
            try {
                sendRequest(configSelector);
            } finally {
                this.g = 0;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class InetAddrGetAllByNameTask implements Callable<InetAddress[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f5584a;

        public InetAddrGetAllByNameTask(String str) {
            this.f5584a = str;
        }

        @Override // java.util.concurrent.Callable
        public InetAddress[] call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("652e36b8", new Object[]{this});
            }
            InetAddress[] allByName = DnsUtil.getAllByName(this.f5584a);
            if (allByName != null) {
                try {
                    if (allByName.length > 0) {
                        LogCatUtil.info(HttpDns.TAG, "InetAddrGetAllByNameTask#call. From local dns get " + this.f5584a + ", ips=[" + Arrays.toString(allByName) + riy.ARRAY_END_STR);
                        HttpDns.this.getGetAllByNameHelper().store2Cache(this.f5584a, allByName);
                    }
                } catch (Throwable th) {
                    LogCatUtil.warn(HttpDns.TAG, "InetAddrGetAllByNameTask#call fail.", th);
                }
            }
            return allByName;
        }
    }

    public void setDnsLocalManager(DnsLocalManager dnsLocalManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f67fa16", new Object[]{this, dnsLocalManager});
        } else {
            this.d = dnsLocalManager;
        }
    }

    public DnsLocalManager getDnsLocalManager() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DnsLocalManager) ipChange.ipc$dispatch("d5449480", new Object[]{this}) : this.d;
    }

    public GetAllByNameHelper getGetAllByNameHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GetAllByNameHelper) ipChange.ipc$dispatch("e3411709", new Object[]{this});
        }
        if (this.e == null) {
            this.e = new GetAllByNameHelper();
        }
        return this.e;
    }

    /* loaded from: classes3.dex */
    public class GetAllByNameHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Map<String, SimpleLocalDnsModel> f5582a = new HashMap(4);

        public GetAllByNameHelper() {
        }

        public InetAddress[] getAllByName(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("a258dab1", new Object[]{this, str});
            }
            if (StringUtils.equals("T", TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPRANK_MODEL_SWITCH))) {
                return DnsUtil.getAllByName(str);
            }
            return a(str);
        }

        public InetAddress[] getAllByName(String str, TransportContext transportContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("b1904efc", new Object[]{this, str, transportContext});
            }
            String stringValue = TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPRANK_H5_SWITCH);
            if (transportContext != null && transportContext.bizType == 2 && !StringUtils.equals("T", stringValue)) {
                LogCatUtil.debug(HttpDns.TAG, "H5 don't use ip rank");
                return a(str);
            } else if (StringUtils.equals("T", TransportConfigureManager.getInstance().getStringValue(TransportConfigureItem.IPRANK_MODEL_SWITCH))) {
                return DnsUtil.getAllByName(str);
            } else {
                return a(str);
            }
        }

        private InetAddress[] a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("b992fb45", new Object[]{this, str});
            }
            InetAddress[] cache = getCache(str);
            if (cache != null) {
                LogCatUtil.info(HttpDns.TAG, "getAllByName. From memcache get " + str + " IP");
                return cache;
            }
            synchronized (str) {
                InetAddress[] cache2 = getCache(str);
                if (cache2 != null) {
                    LogCatUtil.info(HttpDns.TAG, "getAllByName. From memcache get " + str + " IP");
                    return cache2;
                }
                return b(str);
            }
        }

        public void asyncLocalDns2Cache(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("782ac65b", new Object[]{this, str});
                return;
            }
            final Future submit = NetworkAsyncTaskExecutor.submit(new InetAddrGetAllByNameTask(str));
            if (submit == null || submit.isDone()) {
                return;
            }
            NetworkAsyncTaskExecutor.schedule(new Runnable() { // from class: com.alipay.mobile.common.transport.httpdns.HttpDns.GetAllByNameHelper.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Future future = submit;
                    if (future == null || future.isDone()) {
                        return;
                    }
                    try {
                        submit.cancel(true);
                    } catch (Throwable th) {
                        LogCatUtil.warn(HttpDns.TAG, "asyncRequestInetAddresses#run fail.", th);
                    }
                }
            }, TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.GET_ALL_BY_NAME_TIME_OUT), TimeUnit.SECONDS);
        }

        private InetAddress[] b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("5433bdc6", new Object[]{this, str});
            }
            Future<InetAddress[]> future = null;
            try {
                TransportContextThreadLocalUtils.addDnsType(RPCDataItems.VALUE_DT_LOCALDNS);
                int intValue = TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.GET_ALL_BY_NAME_TIME_OUT);
                future = NetworkAsyncTaskExecutor.submit(new InetAddrGetAllByNameTask(str));
                return future.get(intValue, TimeUnit.SECONDS);
            } catch (Throwable th) {
                try {
                    if (th instanceof UnknownHostException) {
                        throw a(str, th);
                    }
                    Throwable rootCause = MiscUtils.getRootCause(th);
                    if (rootCause != null && (rootCause instanceof UnknownHostException)) {
                        throw a(str, rootCause);
                    }
                    throw a(str, th);
                } finally {
                    a(future);
                }
            }
        }

        public void store2Cache(String str, InetAddress[] inetAddressArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9cb46c1", new Object[]{this, str, inetAddressArr});
            } else if (inetAddressArr == null || inetAddressArr.length <= 0) {
            } else {
                SimpleLocalDnsModel simpleLocalDnsModel = new SimpleLocalDnsModel();
                simpleLocalDnsModel.inetAddressesCache = inetAddressArr;
                simpleLocalDnsModel.expirTime = System.currentTimeMillis() + HttpDns.localDnsExpire;
                synchronized (this) {
                    this.f5582a.put(str, simpleLocalDnsModel);
                    LogCatUtil.printInfo(HttpDns.TAG, "store2Cache. host=" + str + ", inetAddresses len=" + inetAddressArr.length);
                }
            }
        }

        private void a(Future<InetAddress[]> future) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6f9effe", new Object[]{this, future});
            } else if (future == null) {
            } else {
                try {
                    if (future.isDone()) {
                        return;
                    }
                    future.cancel(true);
                } catch (Throwable unused) {
                    LogCatUtil.info(HttpDns.TAG, "requestInetAddresses exception");
                }
            }
        }

        private UnknownHostException a(String str, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnknownHostException) ipChange.ipc$dispatch("fceb48f8", new Object[]{this, str, th});
            }
            UnknownHostException unknownHostException = new UnknownHostException("original hostname: " + str);
            try {
                unknownHostException.initCause(th);
                return unknownHostException;
            } catch (Exception unused) {
                if (th instanceof UnknownHostException) {
                    throw ((UnknownHostException) th);
                }
                throw new UnknownHostException(" host:" + str + "  message: " + th.toString());
            }
        }

        public InetAddress[] getCache(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InetAddress[]) ipChange.ipc$dispatch("4a971c30", new Object[]{this, str});
            }
            try {
                SimpleLocalDnsModel simpleLocalDnsModel = this.f5582a.get(str);
                if (simpleLocalDnsModel == null) {
                    return null;
                }
                if (simpleLocalDnsModel.isExpiration()) {
                    LogCatUtil.info(HttpDns.TAG, "getCache. cache expire host: " + str);
                    synchronized (this) {
                        this.f5582a.remove(str);
                    }
                    return null;
                }
                InetAddress[] inetAddressArr = simpleLocalDnsModel.inetAddressesCache;
                if (inetAddressArr != null && inetAddressArr.length > 0) {
                    TransportContextThreadLocalUtils.addDnsType(RPCDataItems.VALUE_DT_LOCAL_CACHE_DNS);
                    LogCatUtil.printInfo(HttpDns.TAG, "getCache. host=" + str + ", address len=" + inetAddressArr.length);
                    return inetAddressArr;
                }
                return null;
            } catch (Throwable th) {
                LogCatUtil.warn(HttpDns.TAG, "getCache fail", th);
                return null;
            }
        }

        public void clearCache() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8aded33c", new Object[]{this});
                return;
            }
            try {
                if (this.f5582a != null && !this.f5582a.isEmpty()) {
                    synchronized (this) {
                        this.f5582a.clear();
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "clearCache error, msg: " + th.toString());
            }
        }

        public void removeCache(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53ae396f", new Object[]{this, str});
                return;
            }
            try {
                if (this.f5582a != null && !this.f5582a.isEmpty()) {
                    synchronized (this) {
                        this.f5582a.remove(str);
                    }
                }
            } catch (Throwable th) {
                LogCatUtil.error(HttpDns.TAG, "removeCache error, host:" + str + "  msg: " + th.toString());
            }
        }
    }
}
