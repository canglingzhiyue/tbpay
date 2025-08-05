package com.taobao.uc;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.kge;

/* loaded from: classes9.dex */
public class UCSoSettings implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static UCSoSettings instance;
    public String UC_CORE_URL_32;
    public String UC_CORE_URL_64;
    public String UC_CORE_URL_DEBUG_32;
    public String UC_CORE_URL_DEBUG_64;
    public String UC_CORE_URL_DEBUG_X86;
    public String UC_PLAYER_URL;
    public String UC_CORE_TYPE = "thin";
    public String UC_CORE_THICK = "false";
    public String UC_DEBUGGABLE = "false";

    static {
        kge.a(1211398939);
        kge.a(1028243835);
    }

    public static UCSoSettings getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCSoSettings) ipChange.ipc$dispatch("ea8b2a78", new Object[0]);
        }
        if (instance == null) {
            synchronized (UCSoSettings.class) {
                if (instance == null) {
                    instance = new UCSoSettings();
                }
            }
        }
        return instance;
    }

    public UCSoSettings setUCPlayerUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCSoSettings) ipChange.ipc$dispatch("e72deb1b", new Object[]{this, str});
        }
        this.UC_PLAYER_URL = str;
        return this;
    }

    public UCSoSettings setUCCoreDebug32(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCSoSettings) ipChange.ipc$dispatch("a8365536", new Object[]{this, str});
        }
        this.UC_CORE_URL_DEBUG_32 = str;
        return this;
    }

    public UCSoSettings setUCCoreDebug64(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCSoSettings) ipChange.ipc$dispatch("562afab7", new Object[]{this, str});
        }
        this.UC_CORE_URL_DEBUG_64 = str;
        return this;
    }

    public UCSoSettings setUCCoreRelease32(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCSoSettings) ipChange.ipc$dispatch("241c9742", new Object[]{this, str});
        }
        this.UC_CORE_URL_32 = str;
        return this;
    }

    public UCSoSettings setUCCoreRelease64(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCSoSettings) ipChange.ipc$dispatch("d2113cc3", new Object[]{this, str});
        }
        this.UC_CORE_URL_64 = str;
        return this;
    }
}
