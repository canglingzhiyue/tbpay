package com.alipay.mobile.common.utils.config;

/* loaded from: classes3.dex */
public interface ConfigureCtrlManager {
    void addConfigureChangedListener(ConfigureChangedListener configureChangedListener);

    String getConfgureVersion();

    void notifyConfigureChangedEvent();

    void removeConfigureChangedListener(ConfigureChangedListener configureChangedListener);
}
