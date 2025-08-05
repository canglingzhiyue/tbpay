package com.alipay.mobile.common.transport.http;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.Socket;
import org.apache.http.impl.io.AbstractSessionOutputBuffer;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.params.HttpParams;
import org.apache.http.util.ByteArrayBuffer;

/* loaded from: classes3.dex */
public class ZHttpClientSocketOutputBuffer extends AbstractSessionOutputBuffer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ByteArrayBuffer f5561a;
    private OutputStream b;
    private HttpTransportMetricsImpl c;

    public static /* synthetic */ Object ipc$super(ZHttpClientSocketOutputBuffer zHttpClientSocketOutputBuffer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -904563285) {
            if (hashCode != 136713985) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.init((OutputStream) objArr[0], ((Number) objArr[1]).intValue(), (HttpParams) objArr[2]);
            return null;
        }
        return super.getMetrics();
    }

    public ZHttpClientSocketOutputBuffer(Socket socket, int i, HttpParams httpParams) {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null");
        }
        init(socket.getOutputStream(), 8192, httpParams);
        getInnerMetrics();
        a();
    }

    public void init(OutputStream outputStream, int i, HttpParams httpParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8261701", new Object[]{this, outputStream, new Integer(i), httpParams});
            return;
        }
        super.init(outputStream, i, httpParams);
        this.b = outputStream;
    }

    public void write(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b94b14d", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else if (bArr == null) {
        } else {
            if (i2 > a().capacity()) {
                flushBuffer();
                this.b.write(bArr, i, i2);
                HttpTransportMetricsImpl innerMetrics = getInnerMetrics();
                if (innerMetrics == null) {
                    return;
                }
                innerMetrics.incrementBytesTransferred(i2);
                return;
            }
            if (i2 > a().capacity() - a().length()) {
                flushBuffer();
            }
            a().append(bArr, i, i2);
        }
    }

    public HttpTransportMetricsImpl getInnerMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpTransportMetricsImpl) ipChange.ipc$dispatch("266ea82e", new Object[]{this});
        }
        HttpTransportMetricsImpl httpTransportMetricsImpl = this.c;
        if (httpTransportMetricsImpl != null) {
            return httpTransportMetricsImpl;
        }
        HttpTransportMetricsImpl metrics = super.getMetrics();
        if (metrics != null && (metrics instanceof HttpTransportMetricsImpl)) {
            this.c = metrics;
            return this.c;
        }
        throw new IOException("getInnerMetrics fail");
    }

    private ByteArrayBuffer a() {
        ByteArrayBuffer byteArrayBuffer = this.f5561a;
        if (byteArrayBuffer != null) {
            return byteArrayBuffer;
        }
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField(a.ATOM_EXT_buffer);
            declaredField.setAccessible(true);
            this.f5561a = (ByteArrayBuffer) declaredField.get(this);
            return this.f5561a;
        } catch (Throwable th) {
            LogCatUtil.error("ZHttpClientSocketOutputBuffer", "getInnerBuffer fail", th);
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(th);
            throw interruptedIOException;
        }
    }
}
