package com.taobao.aranger.intf;

/* loaded from: classes.dex */
public interface IServiceProxy {
    void create(String str, Object... objArr) throws Exception;

    Object invoke(String str, Object[] objArr) throws Exception;
}
