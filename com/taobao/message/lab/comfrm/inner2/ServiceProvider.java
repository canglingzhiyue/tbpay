package com.taobao.message.lab.comfrm.inner2;

/* loaded from: classes7.dex */
public interface ServiceProvider {
    <T> T service(Class<T> cls);

    <T> T service(String str);
}
