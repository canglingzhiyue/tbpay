package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.detect.HttpStrategyDetector;
import anet.channel.quic.Http3ConnectionDetector;
import anet.channel.statist.StrategyStatObject;
import anet.channel.statist.StrategyStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.strategy.dispatch.HttpDispatcher;
import anet.channel.strategy.utils.AmdcThreadPoolExecutor;
import anet.channel.strategy.utils.SerialLruCache;
import anet.channel.util.ALog;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyInfoHolder implements NetworkStatusHelper.INetworkStatusChangeListener, NetworkStatusHelper.IVpnProxyStatusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_FILE = "StrategyConfig";
    private static final String DEFAULT_BSSID = "02:00:00:00:00:00";
    public static final int HOT_SEND_AMDC = 1;
    public static final int LUNCH_AFTER_SEND_AMDC = 0;
    public static final int MAX_TABLE_NUM_IN_MEM = 3;
    private static final String TAG = "awcn.StrategyInfoHolder";
    public static Map<String, String> strategyClientIpMap;
    private volatile NetworkStatusHelper.NetworkStatus currentNetworkStatus;
    private String defaultUniqueId;
    public Map<String, StrategyTable> strategyTableMap = new LruStrategyMap();
    public volatile StrategyConfig strategyConfig = null;
    public final LocalDnsStrategyTable localDnsStrategyTable = new LocalDnsStrategyTable();
    private final StrategyTable unknownStrategyTable = new StrategyTable("Unknown");
    private final Set<String> loadingFiles = new HashSet();
    private volatile String uniqueId = "";
    private volatile boolean isSendAMDCEnable = false;

    public static /* synthetic */ void access$000(StrategyInfoHolder strategyInfoHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48e9ba5c", new Object[]{strategyInfoHolder});
        } else {
            strategyInfoHolder.loadUniqueId();
        }
    }

    public static /* synthetic */ String access$100(StrategyInfoHolder strategyInfoHolder) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dc5845e3", new Object[]{strategyInfoHolder}) : strategyInfoHolder.uniqueId;
    }

    static {
        kge.a(-1909822966);
        kge.a(-971120945);
        kge.a(-850519803);
        strategyClientIpMap = null;
    }

    public static StrategyInfoHolder newInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StrategyInfoHolder) ipChange.ipc$dispatch("68ab075f", new Object[0]) : new StrategyInfoHolder();
    }

    private StrategyInfoHolder() {
        try {
            init();
            restore();
            checkInit();
        } catch (Throwable unused) {
            checkInit();
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        NetworkStatusHelper.removeStatusChangeListener(this);
        NetworkStatusHelper.unregisterVpnProxyStatusListener(this);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        NetworkStatusHelper.addStatusChangeListener(this);
        NetworkStatusHelper.registerVpnProxyStatusListener(this);
        this.currentNetworkStatus = NetworkStatusHelper.getStatus();
        if (AwcnConfig.isVpnOptOpened()) {
            StringBuilder sb = new StringBuilder(NetworkStatusHelper.getMcc() + "WIFI.");
            sb.append(GlobalAppRuntimeInfo.getUtdid());
            this.defaultUniqueId = sb.toString();
            return;
        }
        this.defaultUniqueId = "WIFI$" + GlobalAppRuntimeInfo.getUtdid();
    }

    private void checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
            return;
        }
        synchronized (this.strategyTableMap) {
            for (Map.Entry<String, StrategyTable> entry : this.strategyTableMap.entrySet()) {
                entry.getValue().checkInit();
            }
        }
        synchronized (this) {
            if (this.strategyConfig == null) {
                StrategyConfig strategyConfig = new StrategyConfig();
                strategyConfig.checkInit();
                strategyConfig.setHolder(this);
                this.strategyConfig = strategyConfig;
            }
        }
    }

    private void restore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13986015", new Object[]{this});
            return;
        }
        ALog.i(TAG, "restore", null, new Object[0]);
        if (!AwcnConfig.isAsyncLoadStrategyEnable()) {
            this.strategyConfig = (StrategyConfig) StrategySerializeHelper.restore(CONFIG_FILE, null);
            if (this.strategyConfig != null) {
                this.strategyConfig.checkInit();
                this.strategyConfig.setHolder(this);
            }
            loadUniqueId();
            String str = this.uniqueId;
            if (!TextUtils.isEmpty(str)) {
                ALog.e(TAG, "[amdc_file] restore loadFile 1, filename= " + str, null, new Object[0]);
                loadFile(str, true);
            }
        }
        AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    ALog.i(StrategyInfoHolder.TAG, "start loading strategy files", null, new Object[0]);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (AwcnConfig.isAsyncLoadStrategyEnable()) {
                        ALog.i(StrategyInfoHolder.TAG, "load strategy async", null, new Object[0]);
                        StrategyConfig strategyConfig = (StrategyConfig) StrategySerializeHelper.restore(StrategyInfoHolder.CONFIG_FILE, null);
                        if (strategyConfig != null) {
                            strategyConfig.checkInit();
                            strategyConfig.setHolder(StrategyInfoHolder.this);
                            synchronized (StrategyInfoHolder.this) {
                                StrategyInfoHolder.this.strategyConfig = strategyConfig;
                            }
                        }
                        StrategyInfoHolder.access$000(StrategyInfoHolder.this);
                        String access$100 = StrategyInfoHolder.access$100(StrategyInfoHolder.this);
                        if (!TextUtils.isEmpty(access$100)) {
                            ALog.e(StrategyInfoHolder.TAG, "[amdc_file] restore loadFile 2, filename= " + access$100, null, new Object[0]);
                            StrategyInfoHolder.this.loadFile(access$100, true);
                        }
                    }
                    File[] sortedFiles = StrategySerializeHelper.getSortedFiles();
                    if (sortedFiles == null) {
                        return;
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < sortedFiles.length && i < 2; i2++) {
                        File file = sortedFiles[i2];
                        if (!file.isDirectory()) {
                            String name = file.getName();
                            if (!name.equals(StrategyInfoHolder.access$100(StrategyInfoHolder.this)) && !name.startsWith(StrategyInfoHolder.CONFIG_FILE)) {
                                ALog.e(StrategyInfoHolder.TAG, "[amdc_file] restore loadFile 3, filename= " + name, null, new Object[0]);
                                StrategyInfoHolder.this.loadFile(name, false);
                                i++;
                            }
                        }
                    }
                    ALog.i(StrategyInfoHolder.TAG, "end loading strategy files", null, "total cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Exception unused) {
                }
            }
        });
    }

    public void loadFile(String str, boolean z) {
        StrategyStatObject strategyStatObject;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79d7aca1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        synchronized (this.loadingFiles) {
            if (!this.loadingFiles.contains(str)) {
                this.loadingFiles.add(str);
                if (z) {
                    strategyStatObject = new StrategyStatObject(0);
                    strategyStatObject.readStrategyFileId = str;
                } else {
                    strategyStatObject = null;
                }
                StrategyTable strategyTable = (StrategyTable) StrategySerializeHelper.restore(str, strategyStatObject);
                if (strategyTable != null) {
                    strategyTable.checkInit();
                    strategyTable.parseStrategyData();
                    synchronized (this.strategyTableMap) {
                        ALog.e(TAG, "[amdc_file] FILEIO loadFile uniqueId:" + strategyTable.uniqueId, null, new Object[0]);
                        this.strategyTableMap.put(strategyTable.uniqueId, strategyTable);
                    }
                }
                synchronized (this.loadingFiles) {
                    this.loadingFiles.remove(str);
                }
                if (!z) {
                    return;
                }
                if (strategyTable == null) {
                    i = 0;
                }
                strategyStatObject.isSucceed = i;
                AppMonitor.getInstance().commitStat(strategyStatObject);
                return;
            }
            ALog.e(TAG, "[amdc_file] FILEIO loadFile contains(filename)", null, new Object[0]);
        }
    }

    public void saveData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b9e7ce", new Object[]{this});
            return;
        }
        synchronized (this.strategyTableMap) {
            for (StrategyTable strategyTable : this.strategyTableMap.values()) {
                if (strategyTable.isChanged) {
                    if (!AwcnConfig.isUseClientIpOpened() || strategyClientIpMap == null || strategyClientIpMap.isEmpty() || strategyTable.clientIp == null || strategyTable.clientIp.isEmpty() || (str = strategyClientIpMap.get(strategyTable.clientIp)) == null || str.isEmpty() || !str.equalsIgnoreCase(strategyTable.uniqueId)) {
                        strategyTable.lastModified = System.currentTimeMillis();
                        StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                        strategyStatObject.writeStrategyFileId = strategyTable.uniqueId;
                        ALog.e(TAG, "[amdc_file][strategy opt] persist saveData.", null, "file", strategyTable.uniqueId, "lastModified", Long.valueOf(strategyTable.lastModified));
                        StrategySerializeHelper.persist(strategyTable, strategyTable.uniqueId, strategyStatObject);
                        strategyTable.isChanged = false;
                    } else {
                        ALog.e(TAG, "[amdc_file] not need persist saveData.", null, "file", strategyTable.uniqueId, "clientIp", strategyTable.clientIp);
                    }
                }
            }
            StrategySerializeHelper.persist(this.strategyConfig.createSelf(), CONFIG_FILE, null);
        }
    }

    public StrategyTable getCurrStrategyTable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyTable) ipChange.ipc$dispatch("693b718d", new Object[]{this});
        }
        StrategyTable strategyTable = this.unknownStrategyTable;
        String str = this.uniqueId;
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.strategyTableMap) {
                ALog.d(TAG, "[uniqueId] cur uniqueId=" + this.uniqueId, null, new Object[0]);
                strategyTable = this.strategyTableMap.get(str);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(str);
                    this.strategyTableMap.put(str, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    public StrategyTable getCellularStrategyTable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyTable) ipChange.ipc$dispatch("e1e63c55", new Object[]{this});
        }
        StrategyTable strategyTable = this.unknownStrategyTable;
        NetworkStatusHelper.NetworkStatus networkStatus = NetworkStatusHelper.getNetworkStatus(NetworkStatusHelper.getCellularNetwork());
        String uniqueId = networkStatus == null ? this.uniqueId : getUniqueId(networkStatus);
        if (!TextUtils.isEmpty(uniqueId)) {
            synchronized (this.strategyTableMap) {
                ALog.d(TAG, "[uniqueId] cellular uniqueId=" + this.uniqueId, null, new Object[0]);
                strategyTable = this.strategyTableMap.get(uniqueId);
                if (strategyTable == null) {
                    strategyTable = new StrategyTable(uniqueId);
                    this.strategyTableMap.put(uniqueId, strategyTable);
                }
            }
        }
        return strategyTable;
    }

    public String getUniqueId(NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75163034", new Object[]{this, networkStatus});
        }
        String str = "";
        if (!AwcnConfig.isVpnOptOpened()) {
            if (networkStatus.isWifi()) {
                String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
                if (this.strategyConfig != null && !TextUtils.isEmpty(wifiBSSID) && !DEFAULT_BSSID.equals(wifiBSSID)) {
                    str = this.strategyConfig.getUniqueIdByBssid(StringUtils.md5ToHex(wifiBSSID));
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
                this.isSendAMDCEnable = true;
                return getLastUniqueId("WIFI");
            } else if (!networkStatus.isMobile()) {
                return str;
            } else {
                return networkStatus.getType() + "$" + NetworkStatusHelper.getApn();
            }
        }
        this.isSendAMDCEnable = true;
        return getLastUniqueId(NetworkStatusHelper.getMcc() + networkStatus.getType());
    }

    public void update(boolean z, StrategyResultParser.HttpDnsResponse httpDnsResponse) {
        StrategyTable currStrategyTable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18b33129", new Object[]{this, new Boolean(z), httpDnsResponse});
            return;
        }
        if (httpDnsResponse.fcLevel != 0) {
            AmdcRuntimeInfo.updateAmdcLimit(httpDnsResponse.fcLevel, httpDnsResponse.fcTime);
        }
        updateUniqueId(httpDnsResponse.accessPoint, httpDnsResponse.clientIp);
        if (z) {
            currStrategyTable = getCellularStrategyTable();
        } else {
            currStrategyTable = getCurrStrategyTable();
        }
        currStrategyTable.update(httpDnsResponse);
        this.strategyConfig.update(httpDnsResponse);
    }

    public void updateUniqueId(String str, String str2) {
        boolean z;
        int lastIndexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac4e51d0", new Object[]{this, str, str2});
        } else if (!AwcnConfig.isVpnOptOpened()) {
            if (!this.currentNetworkStatus.isWifi()) {
                return;
            }
            String str3 = "WIFI$" + str;
            if (TextUtils.isEmpty(str)) {
                str3 = this.defaultUniqueId;
            }
            if (str3.equals(this.uniqueId)) {
                return;
            }
            ALog.i(TAG, "update uniqueId old uniqueId :" + this.uniqueId, str3, new Object[0]);
            this.uniqueId = str3;
            String wifiBSSID = NetworkStatusHelper.getWifiBSSID();
            if (!TextUtils.isEmpty(wifiBSSID) && !DEFAULT_BSSID.equals(wifiBSSID) && !this.uniqueId.equals(this.defaultUniqueId)) {
                this.strategyConfig.updateBssidUniqueIdMap(StringUtils.md5ToHex(wifiBSSID), this.uniqueId);
            }
            synchronized (this.strategyTableMap) {
                if (!this.strategyTableMap.containsKey(this.uniqueId)) {
                    ALog.e(TAG, "[amdc_file] updateUniqueId loadFile 1, filename= " + this.uniqueId, null, new Object[0]);
                    loadFile(this.uniqueId, true);
                }
            }
        } else {
            String str4 = NetworkStatusHelper.getMcc() + this.currentNetworkStatus.getType() + ".";
            if (str != null && !str.isEmpty()) {
                if (str.lastIndexOf("_") != -1) {
                    str4 = str4 + str.substring(0, lastIndexOf);
                }
            } else if (AwcnConfig.isUseClientIpOpened() && str2 != null && !str2.isEmpty()) {
                if (strategyClientIpMap == null) {
                    strategyClientIpMap = new ConcurrentHashMap();
                }
                String str5 = strategyClientIpMap.get(str2);
                if (str5 != null && !str5.isEmpty()) {
                    ALog.e(TAG, "[amdc_file] parseAccessPointClientIp, clientIpMd5Str exist!!! clientIp= " + str2, null, "m5(clientIp)", str5);
                } else {
                    str5 = StringUtils.md5ToHex(str2);
                    strategyClientIpMap.put(str2, str4 + str5);
                    ALog.e(TAG, "[amdc_file] parseAccessPointClientIp, clientIpMd5Str not exist!!! put clientIp= " + str2, null, "m5(clientIp)", str5);
                }
                str4 = str4 + str5;
                z = true;
                if (z || str4 == null || str4.equals(this.uniqueId)) {
                    return;
                }
                this.uniqueId = str4;
                synchronized (this.strategyTableMap) {
                    if (!this.strategyTableMap.containsKey(this.uniqueId)) {
                        ALog.e(TAG, "[amdc_file] updateUniqueId loadFile 2, filename= " + this.uniqueId, null, new Object[0]);
                        loadFile(this.uniqueId, true);
                    }
                }
                return;
            } else {
                str4 = str4 + "default";
            }
            z = false;
            if (z) {
            }
        }
    }

    public void startHttp3Detect(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff04c787", new Object[]{this, str, str2});
        } else if (!AwcnConfig.isVpnChangeDetectOpened() || !NetworkStatusHelper.isAccessPointChange(str, str2, this.uniqueId)) {
        } else {
            Http3ConnectionDetector.startDetect(this.currentNetworkStatus);
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(final NetworkStatusHelper.NetworkStatus networkStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
            return;
        }
        this.currentNetworkStatus = networkStatus;
        loadUniqueId();
        final String str = this.uniqueId;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.strategyTableMap) {
            if (!this.strategyTableMap.containsKey(str)) {
                AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (AwcnConfig.isVpnOptOpened()) {
                            StrategyInfoHolder.this.sendAmdcHotDomainRequest("(onNetworkStatusChanged)", 1);
                        }
                        ALog.e(StrategyInfoHolder.TAG, "[amdc_file] onNetworkStatusChanged loadFile, filename= " + StrategyInfoHolder.access$100(StrategyInfoHolder.this), null, new Object[0]);
                        StrategyInfoHolder.this.loadFile(str, true);
                        if (!AwcnConfig.isVpnChangeDetectOpened()) {
                            Http3ConnectionDetector.startDetect(networkStatus);
                        }
                        HttpStrategyDetector.startHttpDetect();
                        StrategyInfoHolder.this.clearStrategy(str);
                        StrategyInfoHolder.this.commitStrategyMonitor();
                    }
                });
            } else {
                if (!AwcnConfig.isVpnChangeDetectOpened()) {
                    Http3ConnectionDetector.startDetect(networkStatus);
                }
                HttpStrategyDetector.startHttpDetect();
                AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        StrategyInfoHolder.this.clearStrategy(str);
                        StrategyInfoHolder.this.commitStrategyMonitor();
                    }
                });
            }
        }
    }

    @Override // anet.channel.status.NetworkStatusHelper.IVpnProxyStatusChangeListener
    public void onVpnProxyStatusChanged(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd51090", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!AwcnConfig.isVpnOptOpened()) {
        } else {
            this.currentNetworkStatus = NetworkStatusHelper.getStatus();
            loadUniqueId();
            String str = this.uniqueId;
            if (!TextUtils.isEmpty(str)) {
                synchronized (this.strategyTableMap) {
                    if (!this.strategyTableMap.containsKey(str)) {
                        ALog.e(TAG, "[amdc_file] onVpnProxyStatusChanged loadFile, filename= " + this.uniqueId, null, new Object[0]);
                        loadFile(str, true);
                    }
                }
            }
            sendAmdcHotDomainRequest("(onVpnProxyStatusChanged)", 1);
        }
    }

    public void sendAmdcHotDomainRequest(String str, int i) {
        CopyOnWriteArraySet<String> lunchAfterAmdcList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f259221", new Object[]{this, str, new Integer(i)});
        } else if (i == 1) {
            Set<String> initHosts = HttpDispatcher.getInstance().getInitHosts();
            if (initHosts == null || initHosts.isEmpty()) {
                return;
            }
            AwcnConfig.initSetAccessPointStatus(true);
            getCurrStrategyTable().sendAmdcRequest(initHosts, true, true);
            ALog.e(TAG, "[ap][VPN] sendAmdcRequest isVpnProxyChange=true " + str, null, "amdcList", initHosts);
        } else if (i != 0 || (lunchAfterAmdcList = AwcnConfig.getLunchAfterAmdcList()) == null || lunchAfterAmdcList.isEmpty()) {
        } else {
            getCurrStrategyTable().sendAmdcRequest((Set<String>) lunchAfterAmdcList, false, true);
            ALog.e(TAG, "[ap][VPN] sendAmdcRequest isLunchAfterAmdc=true " + str, null, "amdcList", lunchAfterAmdcList);
        }
    }

    public synchronized void saveData(StrategyTable strategyTable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c67b5", new Object[]{this, strategyTable});
            return;
        }
        if (strategyTable.isChanged) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.uniqueId;
            StrategySerializeHelper.persist(strategyTable, strategyTable.uniqueId, strategyStatObject);
            strategyTable.isChanged = false;
            strategyTable.lastModified = System.currentTimeMillis();
            StrategySerializeHelper.persist(this.strategyConfig.createSelf(), CONFIG_FILE, null);
        }
    }

    public synchronized void clearStrategy(String str) {
        StrategyTable value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb87371", new Object[]{this, str});
            return;
        }
        try {
            if ("com.taobao.taobao:channel".equals(GlobalAppRuntimeInfo.getCurrentProcess())) {
                for (Map.Entry<String, StrategyTable> entry : this.strategyTableMap.entrySet()) {
                    if (!entry.getKey().equals(str) && (value = entry.getValue()) != null) {
                        value.clearStrategy();
                        saveData(value);
                    }
                }
            }
        } catch (Exception e) {
            ALog.e(TAG, "[channel process] clear not uniqueId=[" + str + "] strategy, error=" + e.toString(), null, new Object[0]);
        }
    }

    public void commitStrategyMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d680b7", new Object[]{this});
            return;
        }
        try {
            for (Map.Entry<String, StrategyTable> entry : this.strategyTableMap.entrySet()) {
                StrategyStatistic strategyStatistic = new StrategyStatistic();
                strategyStatistic.netType = NetworkStatusHelper.getNetworkSubType();
                strategyStatistic.process = GlobalAppRuntimeInfo.isChannelProcess() ? "channel" : "main";
                strategyStatistic.hostStrategyMapSize = this.strategyTableMap.entrySet().size();
                strategyStatistic.nameType = entry.getKey();
                entry.getValue().commitStrategyMonitor(strategyStatistic);
            }
        } catch (Exception e) {
            ALog.e(TAG, "[StrategyStatistic] commitStrategyMonitor fail ! e = " + e.toString(), null, new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public static class LruStrategyMap extends SerialLruCache<String, StrategyTable> {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final long serialVersionUID = 1866478394612290927L;

        static {
            kge.a(-1104420940);
        }

        public LruStrategyMap() {
            super(3);
        }

        @Override // anet.channel.strategy.utils.SerialLruCache
        public boolean entryRemoved(final Map.Entry<String, StrategyTable> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d28ca266", new Object[]{this, entry})).booleanValue();
            }
            AmdcThreadPoolExecutor.submitTask(new Runnable() { // from class: anet.channel.strategy.StrategyInfoHolder.LruStrategyMap.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    StrategyTable strategyTable = (StrategyTable) entry.getValue();
                    if (!strategyTable.isChanged) {
                        return;
                    }
                    StrategyStatObject strategyStatObject = new StrategyStatObject(1);
                    strategyStatObject.writeStrategyFileId = strategyTable.uniqueId;
                    strategyTable.lastModified = System.currentTimeMillis();
                    StrategySerializeHelper.persist((Serializable) entry.getValue(), strategyTable.uniqueId, strategyStatObject);
                    strategyTable.isChanged = false;
                }
            });
            return true;
        }
    }

    private void loadUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7611359", new Object[]{this});
            return;
        }
        this.uniqueId = getUniqueId(this.currentNetworkStatus);
        if (!this.currentNetworkStatus.isWifi() || !this.isSendAMDCEnable) {
            return;
        }
        getCurrStrategyTable().sendAmdcRequest(DispatchConstants.getAmdcServerDomain(), true);
        this.isSendAMDCEnable = false;
    }

    private String getLastUniqueId(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c9b0f37", new Object[]{this, str});
        }
        File[] sortedFiles = StrategySerializeHelper.getSortedFiles();
        if (sortedFiles == null) {
            return this.defaultUniqueId;
        }
        while (true) {
            if (i >= sortedFiles.length) {
                str2 = "";
                break;
            }
            File file = sortedFiles[i];
            if (!file.isDirectory()) {
                str2 = file.getName();
                if (str2.startsWith(str)) {
                    break;
                }
            }
            i++;
        }
        return TextUtils.isEmpty(str2) ? this.defaultUniqueId : str2;
    }
}
