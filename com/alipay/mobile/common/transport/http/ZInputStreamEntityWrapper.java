package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.InputStreamEntity;

/* loaded from: classes3.dex */
public class ZInputStreamEntityWrapper extends InputStreamEntity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HttpEntity f5564a;

    public ZInputStreamEntityWrapper(InputStream inputStream, HttpEntity httpEntity) {
        super(inputStream, httpEntity.getContentLength());
        this.f5564a = httpEntity;
    }

    public static /* synthetic */ Object ipc$super(ZInputStreamEntityWrapper zInputStreamEntityWrapper, String str, Object... objArr) {
        if (str.hashCode() == 1706191588) {
            super.consumeContent();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void consumeContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b26ae4", new Object[]{this});
            return;
        }
        try {
            this.f5564a.consumeContent();
        } catch (Throwable th) {
            LogCatUtil.warn("ZInputStreamEntityWrapper", "mOriginHttpEntity consumeContent exception." + th.toString());
        }
        try {
            super.consumeContent();
        } catch (Throwable th2) {
            LogCatUtil.warn("ZInputStreamEntityWrapper", "consumeContent exception." + th2.toString());
        }
    }
}
