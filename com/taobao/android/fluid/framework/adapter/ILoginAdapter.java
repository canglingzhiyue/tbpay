package com.taobao.android.fluid.framework.adapter;

/* loaded from: classes5.dex */
public interface ILoginAdapter extends IAdapter {
    public static final String ADAPTER_NAME = "ILoginAdapter";

    String getNick();

    String getUserId();

    String getUserNickLink();

    boolean isSessionValid();
}
