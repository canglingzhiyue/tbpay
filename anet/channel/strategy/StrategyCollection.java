package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.PolicyVersionStat;
import anet.channel.statist.StrategyStatistic;
import anet.channel.strategy.StrategyResultParser;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class StrategyCollection implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_STRATEGY_MODE = 0;
    private static final long MAX_AVAILABLE_PERIOD = 172800000;
    private static final String TAG = "awcn.StrategyCollection";
    private static final int UPDATE_MODE_DEFAULT = 0;
    private static final int UPDATE_MODE_LAZY = 2;
    private static final int UPDATE_MODE_ONCE = 3;
    private static final int UPDATE_MODE_PRE = 1;
    private static final long serialVersionUID = 1454976454894208229L;
    public Map<String, Boolean> abStrategy;
    public volatile String cname;
    public String host;
    private transient boolean isFirstUsed;
    public boolean isFixed;
    private transient boolean isUpdated;
    private transient long lastAmdcRequestSend;
    public volatile long lastLongModified;
    public volatile long lastMtopModified;
    public volatile long lastOtherModified;
    private StrategyEntity strategyEntity;
    private StrategyList strategyList;
    public volatile long ttl;
    public int updateMode;
    public int version;

    /* loaded from: classes2.dex */
    public enum StrategyClear {
        UNKNOWN,
        NO,
        YES
    }

    /* loaded from: classes2.dex */
    public enum StrategyType {
        DEFAULT_STRATEGY,
        MTOP_STRATEGY,
        OTHER_STRATEGY,
        LONG_STRATEGY
    }

    /* loaded from: classes2.dex */
    public enum StrategyValid {
        NO,
        VALID,
        INVALID
    }

    static {
        kge.a(1780593838);
        kge.a(1028243835);
    }

    public boolean isSupportUpdateMode(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4f9d6acf", new Object[]{this, new Integer(i)})).booleanValue() : i == 1 || i == 2 || i == 3;
    }

    /* loaded from: classes2.dex */
    public static class StrategyTypeStat {
        public long strategyClearThreshold;
        public long strategyThreshold;
        public StrategyType strategyType;
        public StrategyValid strategyValid = StrategyValid.NO;
        public StrategyClear strategyClear = StrategyClear.UNKNOWN;

        static {
            kge.a(-1001342313);
        }

        public StrategyTypeStat(StrategyType strategyType, long j, long j2) {
            this.strategyType = StrategyType.DEFAULT_STRATEGY;
            this.strategyClearThreshold = -1L;
            this.strategyThreshold = -1L;
            this.strategyType = strategyType;
            this.strategyClearThreshold = j;
            this.strategyThreshold = j2;
        }

        public StrategyTypeStat(StrategyType strategyType) {
            this.strategyType = StrategyType.DEFAULT_STRATEGY;
            this.strategyClearThreshold = -1L;
            this.strategyThreshold = -1L;
            this.strategyType = strategyType;
            this.strategyClearThreshold = 172800000L;
            this.strategyThreshold = 172800000L;
        }
    }

    public StrategyCollection() {
        this.strategyList = null;
        this.strategyEntity = null;
        this.ttl = 0L;
        this.cname = null;
        this.isFixed = false;
        this.version = 0;
        this.updateMode = 0;
        this.lastAmdcRequestSend = 0L;
        this.isFirstUsed = true;
        this.isUpdated = false;
        this.lastLongModified = 0L;
        this.lastMtopModified = 0L;
        this.lastOtherModified = 0L;
    }

    public StrategyCollection(String str) {
        this.strategyList = null;
        this.strategyEntity = null;
        this.ttl = 0L;
        this.cname = null;
        this.isFixed = false;
        this.version = 0;
        this.updateMode = 0;
        this.lastAmdcRequestSend = 0L;
        this.isFirstUsed = true;
        this.isUpdated = false;
        this.lastLongModified = 0L;
        this.lastMtopModified = 0L;
        this.lastOtherModified = 0L;
        this.host = str;
        this.isFixed = DispatchConstants.isAmdcServerDomain(str);
    }

    public StrategyCollection(String str, long j) {
        this.strategyList = null;
        this.strategyEntity = null;
        this.ttl = 0L;
        this.cname = null;
        this.isFixed = false;
        this.version = 0;
        this.updateMode = 0;
        this.lastAmdcRequestSend = 0L;
        this.isFirstUsed = true;
        this.isUpdated = false;
        this.lastLongModified = 0L;
        this.lastMtopModified = 0L;
        this.lastOtherModified = 0L;
        this.host = str;
        this.isFixed = DispatchConstants.isAmdcServerDomain(str);
        this.ttl = j;
    }

    public boolean isAllowUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9119a649", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!AmdcRuntimeInfo.isUpdateModeEnable()) {
            return true;
        }
        int i = this.updateMode;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    z = !this.isUpdated;
                }
            }
            ALog.i(TAG, "[isAllowUpdate]", null, "host", this.host, "updateMode", Integer.valueOf(this.updateMode), "status", Boolean.valueOf(z));
            return z;
        }
        z = true;
        ALog.i(TAG, "[isAllowUpdate]", null, "host", this.host, "updateMode", Integer.valueOf(this.updateMode), "status", Boolean.valueOf(z));
        return z;
    }

    public synchronized void checkInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdaa2bf", new Object[]{this});
            return;
        }
        if (System.currentTimeMillis() - this.ttl > (AwcnConfig.isAmdcStrategyOptEnable() ? AwcnConfig.getLongAmdcThreshold() : 172800000L)) {
            this.strategyList = null;
            this.strategyEntity = null;
            return;
        }
        if (this.strategyEntity != null) {
            this.strategyEntity.checkInit();
        }
    }

    public synchronized boolean clearStrategy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e69356b", new Object[]{this})).booleanValue();
        } else if (this.strategyEntity != null) {
            return this.strategyEntity.clearStrategy(this.strategyList);
        } else if (this.strategyList == null) {
            return false;
        } else {
            return this.strategyList.clearStrategy();
        }
    }

    public synchronized List<IConnStrategy> queryStrategyList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("14536a7", new Object[]{this});
        }
        return queryStrategyList("", false, "", null);
    }

    public synchronized List<IConnStrategy> queryStrategyList(String str, boolean z, String str2, StrategyTypeStat strategyTypeStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("73e9c971", new Object[]{this, str, new Boolean(z), str2, strategyTypeStat});
        } else if (this.strategyEntity == null) {
            ALog.e(TAG, "[strategy opt] queryStrategyList, strategyEntity null", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", str, "uniqueId", str2);
            return Collections.EMPTY_LIST;
        } else {
            if (this.isFirstUsed) {
                this.isFirstUsed = false;
                PolicyVersionStat policyVersionStat = new PolicyVersionStat(str, this.version);
                policyVersionStat.reportType = 0;
                AppMonitor.getInstance().commitStat(policyVersionStat);
            }
            return this.strategyEntity.getStrategyList(str, z, str2, strategyTypeStat);
        }
    }

    public synchronized boolean getAbStrategyStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("350994d1", new Object[]{this, str})).booleanValue();
        } else if (this.abStrategy == null) {
            return false;
        } else {
            Boolean bool = this.abStrategy.get(str);
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        }
    }

    public synchronized void notifyConnEvent(IConnStrategy iConnStrategy, ConnEvent connEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f61186", new Object[]{this, iConnStrategy, connEvent});
            return;
        }
        if (this.strategyEntity != null) {
            this.strategyEntity.notifyConnEvent(iConnStrategy, connEvent);
            if (!connEvent.isSuccess && this.strategyEntity.shouldRefresh()) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastAmdcRequestSend > 60000) {
                    StrategyCenter.getInstance().forceRefreshStrategy(this.host);
                    this.lastAmdcRequestSend = currentTimeMillis;
                }
            }
        }
    }

    public boolean isExpired() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a65eada6", new Object[]{this})).booleanValue() : System.currentTimeMillis() > this.ttl;
    }

    public boolean isExpiredStrategy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7a8368b9", new Object[]{this})).booleanValue() : System.currentTimeMillis() - this.ttl >= 86400000;
    }

    public void commitStrategyMonitor(StrategyStatistic strategyStatistic) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c67ea21", new Object[]{this, strategyStatistic});
            return;
        }
        StrategyEntity strategyEntity = this.strategyEntity;
        if (strategyEntity != null && strategyEntity.getIpStrategyList() != null) {
            strategyStatistic.ipStrategyListSize += this.strategyEntity.getIpStrategyList().size();
        }
        StrategyEntity strategyEntity2 = this.strategyEntity;
        if (strategyEntity2 == null || strategyEntity2.getHistoryItemMap() == null) {
            return;
        }
        strategyStatistic.historyItemMapSize += this.strategyEntity.getHistoryItemMap().size();
        strategyStatistic.connHistoryItemSize += this.strategyEntity.getHistoryItemMap().entrySet().size();
    }

    public synchronized void updateStrategy(StrategyResultParser.Dns dns, String str, String str2, StrategyTypeStat strategyTypeStat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619c80f5", new Object[]{this, dns, str, str2, strategyTypeStat});
            return;
        }
        if (AwcnConfig.isAmdcReduceFrequencyEnable() && (GlobalAppRuntimeInfo.isChannelProcess() || GlobalAppRuntimeInfo.isLightMainProcess())) {
            this.ttl = System.currentTimeMillis() + (AwcnConfig.getChannelAmdcTtl() * dns.ttl * 1000);
            ALog.e(TAG, "amdc reduce frequency enable!", null, "host", this.host, "dnsInfo.host", dns.host, "channelAmdcTtl", Long.valueOf(AwcnConfig.getChannelAmdcTtl()), RemoteMessageConst.TTL, Integer.valueOf(dns.ttl));
        } else {
            this.ttl = System.currentTimeMillis() + (dns.ttl * 1000);
        }
        if (!dns.host.equalsIgnoreCase(this.host)) {
            ALog.e(TAG, "update error!", null, "host", this.host, "dnsInfo.host", dns.host);
            return;
        }
        if (this.version != dns.version) {
            this.version = dns.version;
            PolicyVersionStat policyVersionStat = new PolicyVersionStat(this.host, this.version);
            policyVersionStat.reportType = 1;
            AppMonitor.getInstance().commitStat(policyVersionStat);
        }
        this.cname = dns.cname;
        if (dns.abStrategy != null && dns.abStrategy.size() > 0) {
            if (this.abStrategy == null) {
                this.abStrategy = new ConcurrentHashMap();
            }
            this.abStrategy.putAll(dns.abStrategy);
        }
        if (isSupportUpdateMode(dns.updateMode)) {
            this.updateMode = dns.updateMode;
        }
        this.isUpdated = true;
        if (dns.servers != null && dns.servers.length != 0) {
            if (this.strategyEntity == null) {
                ALog.e(TAG, "[strategy opt] updateStrategy, strategyEntity is null！", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "expireType", strategyTypeStat);
                this.strategyEntity = new StrategyEntity();
            }
            if (strategyTypeStat != null) {
                if (strategyTypeStat.strategyType == StrategyType.LONG_STRATEGY) {
                    this.lastLongModified = System.currentTimeMillis();
                    ALog.e(TAG, "[strategy opt] updateStrategy, update lastLongModified", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "expireType", strategyTypeStat);
                } else if (strategyTypeStat.strategyType == StrategyType.MTOP_STRATEGY) {
                    this.lastMtopModified = System.currentTimeMillis();
                    ALog.e(TAG, "[strategy opt] updateStrategy, update lastMtopModified", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "expireType", strategyTypeStat);
                } else if (strategyTypeStat.strategyType == StrategyType.OTHER_STRATEGY) {
                    this.lastOtherModified = System.currentTimeMillis();
                    ALog.e(TAG, "[strategy opt] updateStrategy, update lastOtherModified", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "expireType", strategyTypeStat);
                }
            }
            this.strategyEntity.update(dns, str, str2);
            return;
        }
        ALog.e(TAG, "[strategy opt] updateStrategy, servers is null！", null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", dns.host, "expireType", strategyTypeStat);
        this.strategyEntity = null;
    }

    public StrategyEntity parseToStrategyEntity(StrategyList strategyList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyEntity) ipChange.ipc$dispatch("26c359c6", new Object[]{this, strategyList});
        }
        try {
            return new StrategyEntity(strategyList.getIpStrategyList(this.host), strategyList.getHistoryItemMap(this.host), strategyList.isContainsStaticIp());
        } catch (Exception e) {
            ALog.e(TAG, "parseToStrategyEntity error!", null, e, new Object[0]);
            return null;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("\nStrategyCollection = ");
        sb.append(this.ttl);
        if (this.strategyList != null) {
            sb.append("\nStrategyList = ");
            sb.append(this.strategyList.toString());
        } else if (this.strategyEntity != null) {
            sb.append("\nstrategyEntity = ");
            sb.append(this.strategyEntity.toString());
        } else if (this.cname != null) {
            sb.append('[');
            sb.append(this.host);
            sb.append("=>");
            sb.append(this.cname);
            sb.append(']');
        } else {
            sb.append(MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264);
        }
        return sb.toString();
    }

    public boolean parseStrategyData() {
        StrategyList strategyList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d40c9b", new Object[]{this})).booleanValue();
        }
        if (this.strategyEntity != null || (strategyList = this.strategyList) == null) {
            return false;
        }
        this.strategyEntity = parseToStrategyEntity(strategyList);
        this.strategyList = null;
        ALog.e(TAG, "parseStrategyData to strategyEntity success.", null, new Object[0]);
        return true;
    }

    public StrategyTypeStat getExpireType(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyTypeStat) ipChange.ipc$dispatch("e0810c7e", new Object[]{this, str, new Long(j)});
        }
        if (AwcnConfig.isAmdcStrategyOptEnable()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (AwcnConfig.isHostInLongAmdcWhiteList(this.host)) {
                return dueToExpireType(str + " long ", this.lastLongModified, j, currentTimeMillis, new StrategyTypeStat(StrategyType.LONG_STRATEGY, AwcnConfig.getLongAmdcThreshold(), AwcnConfig.getLongAmdcThreshold()));
            } else if (AwcnConfig.isHostInMtopAmdcWhiteList(this.host)) {
                return dueToExpireType(str + " mtop ", this.lastMtopModified, j, currentTimeMillis, new StrategyTypeStat(StrategyType.MTOP_STRATEGY, AwcnConfig.getAmdcClearThreshold(), AwcnConfig.getMtopAmdcThreshold()));
            } else {
                return dueToExpireType(str + " other ", this.lastOtherModified, j, currentTimeMillis, new StrategyTypeStat(StrategyType.OTHER_STRATEGY, AwcnConfig.getAmdcClearThreshold(), AwcnConfig.getOtherAmdcThreshold()));
            }
        }
        return new StrategyTypeStat(StrategyType.DEFAULT_STRATEGY);
    }

    private StrategyTypeStat dueToExpireType(String str, long j, long j2, long j3, StrategyTypeStat strategyTypeStat) {
        long j4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StrategyTypeStat) ipChange.ipc$dispatch("c16b80b9", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3), strategyTypeStat});
        }
        long j5 = j2;
        if (strategyTypeStat == null) {
            ALog.e(TAG, "[strategy opt] dueToExpireType, st is null!!" + str, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
            return null;
        }
        if (j != 0) {
            j5 = j;
        }
        if (AwcnConfig.isAmdcStrategyUpdateEnable()) {
            int i = (j5 > 0L ? 1 : (j5 == 0L ? 0 : -1));
            if (i != 0) {
                long j6 = j3 - j5;
                j4 = j5;
                if (j6 > strategyTypeStat.strategyClearThreshold) {
                    ALog.e(TAG, "[strategy opt] [clear strategy!] " + str + " ,strategy curTime - lastModified = " + j6, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
                    strategyTypeStat.strategyValid = StrategyValid.INVALID;
                    strategyTypeStat.strategyClear = StrategyClear.YES;
                    return strategyTypeStat;
                }
            } else {
                j4 = j5;
            }
            if (i != 0) {
                long j7 = j3 - j4;
                if (j7 > strategyTypeStat.strategyThreshold) {
                    ALog.e(TAG, "[strategy opt] [clear strategy!] " + str + " ,strategy curTime - lastModified = " + j7, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
                    strategyTypeStat.strategyValid = StrategyValid.INVALID;
                    strategyTypeStat.strategyClear = StrategyClear.NO;
                    return strategyTypeStat;
                }
            }
            strategyTypeStat.strategyClear = StrategyClear.NO;
        } else {
            long j8 = j5;
            if (j8 != 0) {
                long j9 = j3 - j8;
                if (j9 > strategyTypeStat.strategyThreshold) {
                    ALog.e(TAG, "[strategy opt] " + str + " ,strategy curTime - lastModified = " + j9, null, "evnMode", Integer.valueOf(GlobalAppRuntimeInfo.getEnv().getEnvMode()), "host", this.host);
                    strategyTypeStat.strategyValid = StrategyValid.INVALID;
                    return strategyTypeStat;
                }
            }
        }
        strategyTypeStat.strategyValid = StrategyValid.VALID;
        return strategyTypeStat;
    }
}
