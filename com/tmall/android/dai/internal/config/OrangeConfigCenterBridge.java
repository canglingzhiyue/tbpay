package com.tmall.android.dai.internal.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.DAIKVStoreage;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public class OrangeConfigCenterBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean LOCAL_DEBUG = false;
    public static final String TAG = "OrangeConfigCenter";
    private static volatile OrangeConfigCenterBridge sInstance;

    static {
        kge.a(-49941087);
    }

    public native void onOrangeUpdateNative(long j, String str, boolean z);

    private OrangeConfigCenterBridge() {
    }

    public static OrangeConfigCenterBridge getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OrangeConfigCenterBridge) ipChange.ipc$dispatch("1f3164b2", new Object[0]);
        }
        if (sInstance == null) {
            synchronized (d.class) {
                if (sInstance == null) {
                    sInstance = new OrangeConfigCenterBridge();
                }
            }
        }
        return sInstance;
    }

    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3}) : OrangeConfig.getInstance().getConfig(str, str2, str3);
    }

    public String getCustomConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3a44377c", new Object[]{this, str, str2}) : OrangeConfig.getInstance().getCustomConfig(str, str2);
    }

    public void registerGroupListener(final long j, HashMap<String, String> hashMap, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a435dd", new Object[]{this, new Long(j), hashMap, new Integer(i)});
            return;
        }
        synchronized (this) {
            final String str = hashMap.get("name");
            final boolean equals = "kv".equals(hashMap.get("content_type"));
            final boolean equals2 = "true".equals(hashMap.get("enable_cache"));
            OrangeConfig.getInstance().registerListener(new String[]{str}, new com.taobao.orange.d() { // from class: com.tmall.android.dai.internal.config.OrangeConfigCenterBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.orange.d
                public void onConfigUpdate(String str2, final Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4f2fc4ea", new Object[]{this, str2, map});
                    } else if (i != 1) {
                    } else {
                        com.taobao.android.jarviswe.a.a().d().execute(new Runnable() { // from class: com.tmall.android.dai.internal.config.OrangeConfigCenterBridge.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                Map<String, String> map2;
                                String[] split;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                boolean z = !"true".equals(map.get("fromCache"));
                                if (equals2) {
                                    String str3 = (String) map.get("configVersion");
                                    String diskValue = DAIKVStoreage.getDiskValue("walle_orange_config_cache_group_name", str + "_inner_version__");
                                    if (!str3.equals(diskValue)) {
                                        if (equals) {
                                            map2 = OrangeConfig.getInstance().getConfigs(str);
                                        } else {
                                            String customConfig = OrangeConfig.getInstance().getCustomConfig(str, "");
                                            HashMap hashMap2 = new HashMap();
                                            hashMap2.put("inner_custom_key__", customConfig);
                                            map2 = hashMap2;
                                        }
                                        if (map2 == null) {
                                            return;
                                        }
                                        for (String str4 : map2.keySet()) {
                                            DAIKVStoreage.putToDisk("walle_orange_config_cache_group_name", str + "_" + str4, map2.get(str4));
                                        }
                                        if (diskValue != null && diskValue.length() > 0) {
                                            String diskValue2 = DAIKVStoreage.getDiskValue("walle_orange_config_cache_group_name", str + "_inner_key_list__");
                                            if (diskValue2 != null) {
                                                for (String str5 : diskValue2.split(",")) {
                                                    if (!map2.containsKey(str5)) {
                                                        DAIKVStoreage.removeFromDisk("walle_orange_config_cache_group_name", str + "_" + str5);
                                                    }
                                                }
                                            }
                                        }
                                        DAIKVStoreage.putToDisk("walle_orange_config_cache_group_name", str + "_inner_version__", str3);
                                        DAIKVStoreage.putToDisk("walle_orange_config_cache_group_name", str + "_inner_key_list__", a(map2.keySet()));
                                    }
                                }
                                OrangeConfigCenterBridge.this.onOrangeUpdateNative(j, str, z);
                            }

                            private String a(Collection<String> collection) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    return (String) ipChange3.ipc$dispatch("2afc0da7", new Object[]{this, collection});
                                }
                                StringBuilder sb = null;
                                for (String str3 : collection) {
                                    if (sb == null) {
                                        sb = new StringBuilder(str3);
                                    } else {
                                        sb.append(',');
                                        sb.append(str3);
                                    }
                                }
                                return sb == null ? "" : sb.toString();
                            }
                        });
                    }
                }
            }, true);
        }
    }
}
