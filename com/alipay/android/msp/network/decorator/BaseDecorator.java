package com.alipay.android.msp.network.decorator;

import com.alibaba.fastjson.JSONException;
import com.alipay.android.msp.network.model.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f4923a;
    public BaseDecorator b;
    public RequestConfig c;

    public abstract byte[] todo(byte[] bArr, String str) throws JSONException;

    /* renamed from: undo */
    public abstract Object mo541undo(Object obj) throws Exception;

    public void setRequestConfig(RequestConfig requestConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b50237", new Object[]{this, requestConfig});
        } else {
            this.c = requestConfig;
        }
    }

    public BaseDecorator() {
    }

    public BaseDecorator(int i, BaseDecorator baseDecorator) {
        this.f4923a = i;
        this.b = baseDecorator;
    }
}
