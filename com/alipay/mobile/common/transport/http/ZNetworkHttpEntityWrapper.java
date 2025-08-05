package com.alipay.mobile.common.transport.http;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

/* loaded from: classes3.dex */
public class ZNetworkHttpEntityWrapper extends HttpEntityWrapper implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HttpWorker f5565a;
    private ZHttpOutputStream b;
    private HttpEntity c;

    public static /* synthetic */ Object ipc$super(ZNetworkHttpEntityWrapper zNetworkHttpEntityWrapper, String str, Object... objArr) {
        if (str.hashCode() == -1862539917) {
            super.writeTo((OutputStream) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ZNetworkHttpEntityWrapper(HttpEntity httpEntity) {
        super(httpEntity);
        this.c = httpEntity;
    }

    public void writeTo(OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90fbe573", new Object[]{this, outputStream});
            return;
        }
        this.b = new ZHttpOutputStream(outputStream);
        HttpWorker httpWorker = this.f5565a;
        if (httpWorker != null) {
            this.b.setHttpWorker(httpWorker);
        }
        super.writeTo(this.b);
    }

    public void setHttpWorker(HttpWorker httpWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94895a45", new Object[]{this, httpWorker});
            return;
        }
        this.f5565a = httpWorker;
        ZHttpOutputStream zHttpOutputStream = this.b;
        if (zHttpOutputStream == null) {
            return;
        }
        zHttpOutputStream.setHttpWorker(this.f5565a);
    }

    public Object clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        if (!this.c.isRepeatable()) {
            throw new CloneNotSupportedException("Entity isRepeatable returnc false.");
        }
        return this;
    }

    public Object clone(Class[] clsArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bcaf0d06", new Object[]{this, clsArr}) : clone();
    }
}
