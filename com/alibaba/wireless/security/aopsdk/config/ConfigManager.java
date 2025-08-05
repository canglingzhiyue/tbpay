package com.alibaba.wireless.security.aopsdk.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class ConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static boolean DEBUG = false;
    public static ConfigManager mInstance;

    public static synchronized ConfigManager getInstance() {
        synchronized (ConfigManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ConfigManager) ipChange.ipc$dispatch("aa05af6d", new Object[0]);
            }
            if (mInstance == null) {
                mInstance = new ConfigManager();
            }
            return mInstance;
        }
    }

    public void forceDisable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c89f84", new Object[]{this});
        }
    }

    public void forceEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92752dd5", new Object[]{this});
        }
    }

    public void onConfigChanged(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("951e77cb", new Object[]{this, map});
        }
    }
}
