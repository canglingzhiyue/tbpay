package com.taobao.android.fluid.framework.adapter;

/* loaded from: classes5.dex */
public interface IRemoteConfigAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "IRemoteConfigAdapter";
    public static final String ORANGE_CONFIG_GROUP_NAME = "ShortVideo";

    boolean getABTestBooleanConfig(String str, boolean z);

    Object getABTestObjectConfig(String str, Object obj);

    String getABTestStringConfig(String str, String str2);

    boolean getOrangeBooleanConfig(String str, boolean z);

    int getOrangeIntConfig(String str, int i);

    long getOrangeLongConfig(String str, long j);

    String getOrangeStringConfig(String str, String str2);
}
