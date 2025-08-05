package com.taobao.android.detail.ttdetail.communication;

import com.taobao.android.detail.ttdetail.communication.d;

/* loaded from: classes4.dex */
public interface g<T extends d> {
    ThreadMode onRunThreadMode();

    boolean receiveMessage(T t);
}
