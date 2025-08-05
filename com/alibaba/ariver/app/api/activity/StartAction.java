package com.alibaba.ariver.app.api.activity;

/* loaded from: classes2.dex */
public enum StartAction {
    SHOW_LOADING,
    SHOW_ERROR,
    DIRECT_START;

    public boolean needWaitIpc() {
        return this == SHOW_LOADING;
    }
}
