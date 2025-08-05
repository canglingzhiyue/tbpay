package com.taobao.global.setting.data;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.orange.OrangeConfig;

/* loaded from: classes7.dex */
public class e extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CACHE_MODULE_NAME = "MyTaobao";
    private static e b;

    private e() {
        this.f17210a = AVFSCacheManager.getInstance().cacheForModule("MyTaobao").a(e.class.getClassLoader()).a(new com.taobao.alivfssdk.cache.c()).a(true);
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("1a1cbb25", new Object[0]);
        }
        if (b == null) {
            synchronized (e.class) {
                if (b == null) {
                    b = new e();
                }
            }
        }
        return b;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig("mytaobao_setting_sdk", "enableCacheUserProfile", "true"));
        } catch (Exception unused) {
            return false;
        }
    }
}
