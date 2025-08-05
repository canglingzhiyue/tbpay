package com.taobao.message.lab.comfrm.event;

/* loaded from: classes7.dex */
public interface StateService {
    <T> T getPrivateState(Class<T> cls);

    void setPrivateState(Object obj);
}
