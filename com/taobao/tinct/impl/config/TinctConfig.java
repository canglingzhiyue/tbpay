package com.taobao.tinct.impl.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.poplayer.config.model.keep.KeepModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class TinctConfig {
    public static final int DEFAULT_FULL_EXPIRE_DAY = 3;
    public static final int DEFAULT_GRAY_EXPIRE_DAY = 2;
    public static final int DEFAULT_GRAY_EXPIRE_HOUR = 48;
    @JSONField(name = "orangeConfig")
    public OrangeConfig orangeStatisticsConfig = new OrangeConfig();
    @JSONField(name = "abTestConfig")
    public ABTestConfig abTestStatisticsConfig = new ABTestConfig();
    @JSONField(name = "instantConfig")
    public SimpleConfig instantStatisticsConfig = new SimpleConfig();
    @JSONField(name = "inlineConfig")
    public SimpleConfig inlineStatisticsConfig = new SimpleConfig();
    @JSONField(name = "touchstoneConfig")
    public TouchstoneConfig touchstoneConfig = new TouchstoneConfig();
    public CustomConfig customConfig = new CustomConfig();
    public SimpleConfig dynamicConfig = new SimpleConfig();

    /* loaded from: classes.dex */
    public static class ABTestConfig extends CommonConfig {
        public ABTestConfig() {
            this.whiteList = new ArrayList();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class CommonConfig extends SimpleConfig {
        @JSONField(name = KeepModel.STRATEGY_BLACK_LIST)
        public List<String> blackList = null;
        @JSONField(name = KeepModel.STRATEGY_WHITE_LIST)
        public List<String> whiteList = null;
    }

    /* loaded from: classes.dex */
    public static class CustomConfig {
        public boolean enable = true;
        public int fullExpire = 3;
        public Map<String, CustomItemConfig> config = new ConcurrentHashMap();
    }

    /* loaded from: classes.dex */
    public static class CustomItemConfig {
        public int monitorType = 0;
        public List<CustomMonitor> monitor = null;
        public int sampling = 10000;
        public boolean statistics = false;
        public boolean launchStatistics = false;
        public int grayExpire = 48;
        public int statisticsType = 1;
        public int expire = 3;
    }

    /* loaded from: classes.dex */
    public static class CustomMonitor {
        public String configType;
        public boolean isGray;
        public String ver;
    }

    /* loaded from: classes.dex */
    public static class OrangeConfig extends CommonConfig {
        @JSONField(name = "expire")
        public int orangeExpire = 3;
        @JSONField(name = "grayExpire")
        public int grayExpire = 2;
        @JSONField(name = com.taobao.android.weex_framework.util.a.ATOM_EXT_gray)
        public boolean onlyGray = true;

        public OrangeConfig() {
            this.blackList = new ArrayList();
        }
    }

    /* loaded from: classes.dex */
    public static class SimpleConfig {
        @JSONField(name = "monitor")
        public boolean isMonitorEnable = true;
        @JSONField(name = "statistics")
        public boolean isStatisticsEnable = true;
        @JSONField(name = "sampling")
        public int sampling = 10000;
    }

    /* loaded from: classes.dex */
    public static class TouchstoneConfig extends CommonConfig {
        public TouchstoneConfig() {
            this.whiteList = new ArrayList();
        }
    }
}
