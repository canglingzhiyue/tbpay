package com.alipay.mobile.common.amnetcore;

/* loaded from: classes3.dex */
public interface AmnetSwitchManager {
    long downgradePeriod();

    boolean enableBifrostUseWakeLock();

    boolean enableListenNetworkSignalStrength();

    boolean forceTlsVerify();

    int getLonglinkConnMax();

    boolean isEnableInitMergeSync();

    boolean isEnableSFC();

    boolean isEnableST();

    boolean isEnableShortLink(boolean z);

    boolean isEnableZstd();

    boolean needCheckSpannerZstd();

    <T> T pullSwitch(String str, T t);

    boolean useBifrost();
}
