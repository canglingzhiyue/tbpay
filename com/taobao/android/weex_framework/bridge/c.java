package com.taobao.android.weex_framework.bridge;

import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.p;

/* loaded from: classes6.dex */
public interface c<T> {
    MUSThreadStrategy a();

    Object a(MUSDKInstance mUSDKInstance, T t, MUSValue mUSValue) throws Exception;

    Object a(MUSDKInstance mUSDKInstance, T t, Object obj) throws Exception;

    Object a(MUSDKInstance mUSDKInstance, Object obj, T t, MUSValue[] mUSValueArr) throws Exception;

    Object a(p pVar, Object obj, T t, MUSValue[] mUSValueArr) throws Exception;
}
