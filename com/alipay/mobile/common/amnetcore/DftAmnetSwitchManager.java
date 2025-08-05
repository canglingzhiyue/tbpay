package com.alipay.mobile.common.amnetcore;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DftAmnetSwitchManager implements AmnetSwitchManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public long downgradePeriod() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("666af011", new Object[]{this})).longValue();
        }
        return 7200L;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean enableBifrostUseWakeLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c136de7", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean enableListenNetworkSignalStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b826bd8", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean forceTlsVerify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38f002b4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public int getLonglinkConnMax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3677d86", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableInitMergeSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a3fbb01", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableSFC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("29ea4ee", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableST() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2c1ff9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableShortLink(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25e17b08", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean isEnableZstd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb6fb9e1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean needCheckSpannerZstd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7864c33", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public <T> T pullSwitch(String str, T t) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("721ebeec", new Object[]{this, str, t}) : t;
    }

    @Override // com.alipay.mobile.common.amnetcore.AmnetSwitchManager
    public boolean useBifrost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d782ce1", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
