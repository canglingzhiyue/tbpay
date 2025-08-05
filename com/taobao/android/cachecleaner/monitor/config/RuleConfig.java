package com.taobao.android.cachecleaner.monitor.config;

import android.taobao.windvane.cache.d;
import com.alibaba.ability.impl.file.FileAbility;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizQuotaData;
import com.taobao.android.cachecleaner.autoclear.biz.data.BizTaskData;
import com.taobao.android.cachecleaner.autoclear.data.MatchBasedData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.dvq;
import tb.kge;

/* loaded from: classes.dex */
public class RuleConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long KB_2_BYTE = 1024;
    public static final long MB_2_KB = 1024;
    private final String[] DEFAULT_BIZ_DIR_WHIT_LIST = {dvq.INNER_ROOT_DIR + "/com.taobao.taobao/app_zcache"};
    private final String[] EXPIRED_FILE_PATH_LIST = {"databases/MLTK.db"};
    private final String[] SOFT_LINK_DIR_LIST = {"app_swallows"};
    private final String[] SOFT_LINK_EXCLUDE_BRAND = {"HONOR"};
    private final String[] DEFAULT_FULL_CACHE_CLEAR_DIR = {"InnerStorage/cache", "ExternalCache/", "InnerStorage/app_jsi", "ExternalFiles/AVFSCache"};
    private boolean enable = true;
    private boolean innerCacheEnable = true;
    private boolean externalCacheEnable = true;
    private boolean externalFileEnable = true;
    private boolean apkFileEnable = true;
    private boolean libsFileEnable = true;
    private boolean innerCacheDifferEnable = true;
    private boolean trackEnable = true;
    private int maxDeepLevel = 10;
    private long largeFileSizeThreshold = FileAbility.MAX_FILE_SIZE;
    private long hugeFileSizeThreshold = 209715200;
    private long fileLastModifiedThreshold = d.DEFAULT_MAX_AGE;
    private long newInstallThreshold = 604800000;
    private long spFileSizeThreshold = 15360;
    private long dataBaseSizeThreshold = 30720;
    private long sizeIncreaseThreshold = FileAbility.MAX_FILE_SIZE;
    private int maxFilesSize = 150;
    private List<String> bizWhiteList = Arrays.asList(this.DEFAULT_BIZ_DIR_WHIT_LIST);
    private long hugeBizDirSizeThreshold = 104857600;
    private boolean enableSymbolicLink = true;
    private List<String> softLinkDir = Arrays.asList(this.SOFT_LINK_DIR_LIST);
    private List<String> softLinkExcludeBrand = Arrays.asList(this.SOFT_LINK_EXCLUDE_BRAND);
    private int softLinkCheckMaxDepth = 6;
    private boolean enableOatMonitor = true;
    private boolean enableApkSizeMonitor = true;
    private boolean enableAppDataMonitor = true;
    private long occupationSizeThreshold = 1048576;
    private long availableSizeThreshold = 1048576;
    private double availableSizeRateThreshold = 0.1d;
    private long silenceTime = 432000000;
    public boolean enableZcacheClear = true;
    public boolean enableVFSClear = true;
    private boolean enableMsgClear = true;
    private long clearWaitTime = 2000;
    private boolean enableFore2BackGroundClear = true;
    private boolean enableDeleteExpiredFiles = true;
    private boolean enableMatchBasedClear = false;
    private List<String> expiredFilePathList = Arrays.asList(this.EXPIRED_FILE_PATH_LIST);
    private List<MatchBasedData> matchBasedDataList = new ArrayList();
    private List<String> fullCacheClearDir = Arrays.asList(this.DEFAULT_FULL_CACHE_CLEAR_DIR);
    private List<String> exceptFileSuffixes = new ArrayList();
    private List<BizTaskData> quotaClean = new ArrayList();
    private long fullCacheClearSilenceTime = 86400;
    private Map<String, List<BizQuotaData>> quotaSizeMap = new HashMap();
    private boolean enableSoftLinkApi = true;
    private long maxReportSize = 1048576;
    private boolean enableNewZcacheV1 = true;
    @JSONField(name = "iopm")
    private boolean ioPeriodMonitorEnable = false;
    @JSONField(name = "iolm")
    private boolean ioLifeCycleMonitorEnable = false;
    @JSONField(name = "iosm")
    private boolean ioSetupMonitorEnable = false;
    @JSONField(name = "dh")
    private String hashSampleRate = "1000000_0_500";
    @JSONField(name = "iopmi")
    private long ioPeriodMonitorInterval = 30000;

    static {
        kge.a(2054307374);
    }

    public boolean getApkFileEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d3f43b0", new Object[]{this})).booleanValue() : this.apkFileEnable;
    }

    public boolean getLibsFileEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4922a34e", new Object[]{this})).booleanValue() : this.libsFileEnable;
    }

    public long getIoPeriodMonitorInterval() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88a5e5fd", new Object[]{this})).longValue() : this.ioPeriodMonitorInterval;
    }

    public void setIoPeriodMonitorInterval(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8700b4e7", new Object[]{this, new Long(j)});
        } else {
            this.ioPeriodMonitorInterval = j;
        }
    }

    public boolean getIoSetupMonitorEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32585ac7", new Object[]{this})).booleanValue() : this.ioSetupMonitorEnable;
    }

    public void setIoSetupMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628008e5", new Object[]{this, new Boolean(z)});
        } else {
            this.ioSetupMonitorEnable = z;
        }
    }

    public boolean getIoPeriodMonitorEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("140b430b", new Object[]{this})).booleanValue() : this.ioPeriodMonitorEnable;
    }

    public void setIoPeriodMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d1c86b9", new Object[]{this, new Boolean(z)});
        } else {
            this.ioPeriodMonitorEnable = z;
        }
    }

    public boolean getIoLifeCycleMonitorEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cfeb39a", new Object[]{this})).booleanValue() : this.ioLifeCycleMonitorEnable;
    }

    public void setIoLifeCycleMonitorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a51b7072", new Object[]{this, new Boolean(z)});
        } else {
            this.ioLifeCycleMonitorEnable = z;
        }
    }

    public String getHashSampleRate() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a881096b", new Object[]{this}) : this.hashSampleRate;
    }

    public void setHashSampleRate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("786c456b", new Object[]{this, str});
        } else {
            this.hashSampleRate = str;
        }
    }

    public boolean getEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f06e884", new Object[]{this})).booleanValue() : this.enable;
    }

    public boolean getExternalCacheEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eff0e2f", new Object[]{this})).booleanValue() : this.innerCacheEnable;
    }

    public boolean getExternalFileEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8bc2fecb", new Object[]{this})).booleanValue() : this.externalFileEnable;
    }

    public boolean getInnerCacheEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e72ab0f0", new Object[]{this})).booleanValue() : this.externalCacheEnable;
    }

    public boolean getInnerCacheDifferEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6394082", new Object[]{this})).booleanValue() : this.innerCacheDifferEnable;
    }

    public boolean getTrackEnable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ad18ee03", new Object[]{this})).booleanValue() : this.trackEnable;
    }

    public long getLargeFileSizeThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("50174a44", new Object[]{this})).longValue() : this.largeFileSizeThreshold;
    }

    public long getFileLastModifiedThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6c028455", new Object[]{this})).longValue() : this.fileLastModifiedThreshold;
    }

    public long getSpFileSizeThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec4dfc36", new Object[]{this})).longValue() : this.spFileSizeThreshold;
    }

    public long getSizeIncreaseThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8287700d", new Object[]{this})).longValue() : this.sizeIncreaseThreshold;
    }

    public long getNewInstallThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1e59af15", new Object[]{this})).longValue() : this.newInstallThreshold;
    }

    public long getDataBaseSizeThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a5da35d4", new Object[]{this})).longValue() : this.dataBaseSizeThreshold;
    }

    public int getMaxFilesSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1350804", new Object[]{this})).intValue() : this.maxFilesSize;
    }

    public int getMaxDeepLevel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b5f57ee4", new Object[]{this})).intValue() : this.maxDeepLevel;
    }

    public long getHugeFileSizeThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8c169228", new Object[]{this})).longValue() : this.hugeFileSizeThreshold;
    }

    public List<String> getBizWhiteList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f308df96", new Object[]{this}) : this.bizWhiteList;
    }

    public long getOccupationSizeThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54a7fda4", new Object[]{this})).longValue() : this.occupationSizeThreshold;
    }

    public long getAvailableSizeThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("985ce112", new Object[]{this})).longValue() : this.availableSizeThreshold;
    }

    public double getAvailableSizeRateThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dceffa0c", new Object[]{this})).doubleValue() : this.availableSizeRateThreshold;
    }

    public void setAvailableSizeRateThreshold(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8cdb54", new Object[]{this, new Double(d)});
        } else {
            this.availableSizeRateThreshold = d;
        }
    }

    public long getSilenceTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e8a253", new Object[]{this})).longValue() : this.silenceTime;
    }

    public boolean getEnableZcacheClear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("11ef0037", new Object[]{this})).booleanValue() : this.enableZcacheClear;
    }

    public boolean getEnableVFSClear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3713e2ee", new Object[]{this})).booleanValue() : this.enableVFSClear;
    }

    public long getClearWaitTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("de80df94", new Object[]{this})).longValue() : this.clearWaitTime;
    }

    public boolean getEnableFore2BackGroundClear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("12a8916d", new Object[]{this})).booleanValue() : this.enableFore2BackGroundClear;
    }

    public boolean getEnableDeleteExpiredFiles() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9aa15581", new Object[]{this})).booleanValue() : this.enableDeleteExpiredFiles;
    }

    public List<String> getExpiredFilePathList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("56e5e392", new Object[]{this}) : this.expiredFilePathList;
    }

    public long getHugeBizDirSizeThreshold() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("261ff52a", new Object[]{this})).longValue() : this.hugeBizDirSizeThreshold;
    }

    public boolean getEnableMatchBasedClear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("97d28dd1", new Object[]{this})).booleanValue() : this.enableMatchBasedClear;
    }

    public List<MatchBasedData> getMatchBasedDataList() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("39ee3af4", new Object[]{this}) : this.matchBasedDataList;
    }

    public boolean getEnableSymbolicLink() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("350c30f0", new Object[]{this})).booleanValue() : this.enableSymbolicLink;
    }

    public boolean getEnableMsgClear() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("33c554f0", new Object[]{this})).booleanValue() : this.enableMsgClear;
    }

    public List<String> getSoftLinkDir() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9e27128d", new Object[]{this}) : this.softLinkDir;
    }

    public List<String> getSoftLinkExcludeBrand() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("7d5e73d9", new Object[]{this}) : this.softLinkExcludeBrand;
    }

    public int getSoftLinkCheckMaxDepth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c0dc847", new Object[]{this})).intValue() : this.softLinkCheckMaxDepth;
    }

    public boolean getEnableOatMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ba56cb7c", new Object[]{this})).booleanValue() : this.enableOatMonitor;
    }

    public boolean getEnableApkSizeMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc25ecc1", new Object[]{this})).booleanValue() : this.enableApkSizeMonitor;
    }

    public boolean getEnableAppDataMonitor() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b5cfed3", new Object[]{this})).booleanValue() : this.enableAppDataMonitor;
    }

    public List<String> getFullCacheClearDir() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("966baa23", new Object[]{this}) : this.fullCacheClearDir;
    }

    public List<String> getExceptFileSuffixes() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("f6aa5f96", new Object[]{this}) : this.exceptFileSuffixes;
    }

    public List<BizTaskData> getQuotaClean() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("81f5dcd9", new Object[]{this}) : this.quotaClean;
    }

    public long getFullCacheClearSilenceTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec0db199", new Object[]{this})).longValue() : this.fullCacheClearSilenceTime;
    }

    public Map<String, List<BizQuotaData>> getQuotaSizeMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e74348b5", new Object[]{this}) : this.quotaSizeMap;
    }

    public boolean getEnableSoftLinkApi() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f28e008", new Object[]{this})).booleanValue() : this.enableSoftLinkApi;
    }

    public void setQuotaSizeMap(Map<String, List<BizQuotaData>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d664a679", new Object[]{this, map});
        } else {
            this.quotaSizeMap = map;
        }
    }

    public void setFullCacheClearSilenceTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc5c9cb", new Object[]{this, new Long(j)});
        } else {
            this.fullCacheClearSilenceTime = j;
        }
    }

    public void setQuotaClean(List<BizTaskData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9ca4ab", new Object[]{this, list});
        } else {
            this.quotaClean = list;
        }
    }

    public void setExceptFileSuffixes(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ddad8e", new Object[]{this, list});
        } else {
            this.exceptFileSuffixes = list;
        }
    }

    public void setFullCacheClearDir(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272afb09", new Object[]{this, list});
        } else {
            this.fullCacheClearDir = list;
        }
    }

    public void setEnableAppDataMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a0fe659", new Object[]{this, new Boolean(z)});
        } else {
            this.enableAppDataMonitor = z;
        }
    }

    public void setEnableApkSizeMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f264b62b", new Object[]{this, new Boolean(z)});
        } else {
            this.enableApkSizeMonitor = z;
        }
    }

    public void setEnableOatMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609608d0", new Object[]{this, new Boolean(z)});
        } else {
            this.enableOatMonitor = z;
        }
    }

    public void setSoftLinkCheckMaxDepth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656a6b3b", new Object[]{this, new Integer(i)});
        } else {
            this.softLinkCheckMaxDepth = i;
        }
    }

    public void setSoftLinkExcludeBrand(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83b4eab", new Object[]{this, list});
        } else {
            this.softLinkExcludeBrand = list;
        }
    }

    public void setSoftLinkDir(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("def286df", new Object[]{this, list});
        } else {
            this.softLinkDir = list;
        }
    }

    public void setEnableMsgClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("932abadc", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMsgClear = z;
        }
    }

    public void setEnableSymbolicLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82aa84dc", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSymbolicLink = z;
        }
    }

    public void setApkFileEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d566b4", new Object[]{this, new Boolean(z)});
        } else {
            this.apkFileEnable = z;
        }
    }

    public void setLibsFileEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2977383e", new Object[]{this, new Boolean(z)});
        } else {
            this.libsFileEnable = z;
        }
    }

    public void setMatchBasedDataList(List<MatchBasedData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76153df0", new Object[]{this, list});
        } else {
            this.matchBasedDataList = list;
        }
    }

    public void setEnableMatchBasedClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523e94b3", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMatchBasedClear = z;
        }
    }

    public void setHugeBizDirSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c88b5a", new Object[]{this, new Long(j)});
        } else {
            this.hugeBizDirSizeThreshold = j;
        }
    }

    public void setEnableDeleteExpiredFiles(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcd0b6b", new Object[]{this, new Boolean(z)});
        } else {
            this.enableDeleteExpiredFiles = z;
        }
    }

    public void setExpiredFilePathList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94f227a", new Object[]{this, list});
        } else {
            this.expiredFilePathList = list;
        }
    }

    public void setEnableFore2BackGroundClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe77fff", new Object[]{this, new Boolean(z)});
        } else {
            this.enableFore2BackGroundClear = z;
        }
    }

    public void setClearWaitTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c70d30", new Object[]{this, new Long(j)});
        } else {
            this.clearWaitTime = j;
        }
    }

    public void setEnableVFSClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9adec9e", new Object[]{this, new Boolean(z)});
        } else {
            this.enableVFSClear = z;
        }
    }

    public void setEnableZcacheClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e35550d", new Object[]{this, new Boolean(z)});
        } else {
            this.enableZcacheClear = z;
        }
    }

    public void setSilenceTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9928b551", new Object[]{this, new Long(j)});
        } else {
            this.silenceTime = j;
        }
    }

    public void setAvailableSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b57c4da", new Object[]{this, new Long(j)});
        } else {
            this.availableSizeThreshold = j;
        }
    }

    public void setOccupationSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b419220", new Object[]{this, new Long(j)});
        } else {
            this.occupationSizeThreshold = j;
        }
    }

    public void setBizWhiteList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af6268e", new Object[]{this, list});
        } else {
            this.bizWhiteList = list;
        }
    }

    public void setHugeFileSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67ae11c", new Object[]{this, new Long(j)});
        } else {
            this.hugeFileSizeThreshold = j;
        }
    }

    public void setMaxDeepLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e450dea6", new Object[]{this, new Integer(i)});
        } else {
            this.maxDeepLevel = i;
        }
    }

    public void setLargeFileSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baea81e8", new Object[]{this, new Long(j)});
        } else {
            this.largeFileSizeThreshold = j;
        }
    }

    public void setSpFileSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3ecbce", new Object[]{this, new Long(j)});
        } else {
            this.spFileSizeThreshold = j;
        }
    }

    public void setFileLastModifiedThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa6b4e8f", new Object[]{this, new Long(j)});
        } else {
            this.fileLastModifiedThreshold = j;
        }
    }

    public void setSizeIncreaseThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be25bfd7", new Object[]{this, new Long(j)});
        } else {
            this.sizeIncreaseThreshold = j;
        }
    }

    public void setNewInstallThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca974cf", new Object[]{this, new Long(j)});
        } else {
            this.newInstallThreshold = j;
        }
    }

    public void setDataBaseSizeThreshold(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bb2f0", new Object[]{this, new Long(j)});
        } else {
            this.dataBaseSizeThreshold = j;
        }
    }

    public void setMaxFilesSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1027986", new Object[]{this, new Integer(i)});
        } else {
            this.maxFilesSize = i;
        }
    }

    public void setEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.enable = z;
        }
    }

    public void setInnerCacheEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce3ed1dc", new Object[]{this, new Boolean(z)});
        } else {
            this.innerCacheEnable = z;
        }
    }

    public void setExternalCacheEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b03315", new Object[]{this, new Boolean(z)});
        } else {
            this.externalCacheEnable = z;
        }
    }

    public void setExternalFileEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cd7261", new Object[]{this, new Boolean(z)});
        } else {
            this.externalFileEnable = z;
        }
    }

    public void setInnerCacheDifferEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19078d8a", new Object[]{this, new Boolean(z)});
        } else {
            this.innerCacheDifferEnable = z;
        }
    }

    public void setTrackEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0219c1", new Object[]{this, new Boolean(z)});
        } else {
            this.trackEnable = z;
        }
    }

    public void setEnableSoftLinkApi(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8376f5c", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSoftLinkApi = z;
        }
    }

    public long getMaxReportSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d03f7b1e", new Object[]{this})).longValue() : this.maxReportSize;
    }

    public void setMaxReportSize(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cedbe2e6", new Object[]{this, new Long(j)});
        } else {
            this.maxReportSize = j;
        }
    }

    public boolean isEnableNewZcacheV1() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("301829a1", new Object[]{this})).booleanValue() : this.enableNewZcacheV1;
    }

    public void setEnableNewZcacheV1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ecbb20f", new Object[]{this, new Boolean(z)});
        } else {
            this.enableNewZcacheV1 = z;
        }
    }
}
