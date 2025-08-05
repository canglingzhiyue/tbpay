package com.taobao.message.init.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.config.IDefaultConfig;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class TBIMConfig implements IDefaultConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static String NAV_AGOO_PUSH_BACK_TO_URL;
    private Map<String, String> configMap;

    @Override // com.taobao.message.kit.config.IDefaultConfig
    public String getRuntimeValue(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a8717d6", new Object[]{this, str, str2});
        }
        return null;
    }

    static {
        kge.a(-1317477987);
        kge.a(1959986995);
        NAV_AGOO_PUSH_BACK_TO_URL = "https://m.taobao.com/index.htm?scrollto=recmd&forceRefresh=true&recmdparams=%7B%22tabindex%22:0,%22totabid%22:%221001%22,%22bizparams%22:%7B%22outPushPlanId%22:%22YBb6Vz%22,%20%22test%22:%22testvalue%22%7D%7D";
    }

    private TBIMConfig() {
        this.configMap = null;
    }

    public static TBIMConfig getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBIMConfig) ipChange.ipc$dispatch("fa17e146", new Object[0]) : SingltonHolder.access$000();
    }

    /* loaded from: classes7.dex */
    public static class SingltonHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static TBIMConfig sDefaultIMConfig;

        private SingltonHolder() {
        }

        public static /* synthetic */ TBIMConfig access$000() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TBIMConfig) ipChange.ipc$dispatch("35dcc16b", new Object[0]) : sDefaultIMConfig;
        }

        static {
            kge.a(647081929);
            sDefaultIMConfig = new TBIMConfig();
        }
    }

    @Override // com.taobao.message.kit.config.IDefaultConfig
    public Map<String, String> getDefaultConfigMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("195bd5ab", new Object[]{this});
        }
        if (this.configMap == null) {
            this.configMap = new HashMap(8);
            this.configMap.put(IDefaultConfig.AGOO_PUSH_BACK_TO_URL, NAV_AGOO_PUSH_BACK_TO_URL);
        }
        return this.configMap;
    }
}
