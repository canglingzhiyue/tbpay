package com.taobao.taopai.material.config;

import com.alibaba.fastjson.annotation.JSONField;
import com.taobao.taopai.business.util.y;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class MaterialConfig implements Serializable {
    @JSONField(name = "device_levels")
    public DeviceList deviceLevels;
    @JSONField(name = "whitelist")
    public DeviceList deviceList;
    @JSONField(name = "material_type")
    public int materialType;
    @JSONField(name = "net_strategy_weighted")
    public String netPolicyWeight;
    @JSONField(name = "net_strategies")
    public List<NetStrategy> strategyList;
    @JSONField(name = y.TEMPLATE_ID)
    public int templateId;
    public int version;

    /* loaded from: classes8.dex */
    public static class DeviceList implements Serializable {
        public int enable;
        public List<String> list;

        static {
            kge.a(1060282052);
            kge.a(1028243835);
        }
    }

    /* loaded from: classes8.dex */
    public static class NetStrategy implements Serializable {
        public int guaranteed;
        public String key;
        public String relation;
        public String threshold;
        public int version;

        static {
            kge.a(-53271680);
            kge.a(1028243835);
        }
    }

    static {
        kge.a(1700066324);
        kge.a(1028243835);
    }
}
