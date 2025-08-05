package com.alipay.literpc.android.phone.mrpc.core;

import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class HttpCaller extends AbstractRpcCaller {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Config g;

    private int a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue();
        }
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 15;
            case 9:
                return 16;
            default:
                return i;
        }
    }

    public static /* synthetic */ Object ipc$super(HttpCaller httpCaller, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public HttpCaller(Config config, Method method, int i, String str, byte[] bArr, boolean z) {
        super(method, i, str, bArr, HeaderConstant.HEADER_VALUE_OLD_TYPE, z);
        this.g = config;
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.RpcCaller
    public Object call() throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        HttpUrlRequest httpUrlRequest = new HttpUrlRequest(this.g.getUrl());
        httpUrlRequest.setReqData(this.b);
        httpUrlRequest.setContentType(this.e);
        httpUrlRequest.setResetCookie(this.f);
        httpUrlRequest.addTags("id", String.valueOf(this.d));
        httpUrlRequest.addTags("operationType", this.c);
        httpUrlRequest.addTags("gzip", String.valueOf(this.g.isGzip()));
        a(httpUrlRequest);
        String str = "threadid = " + Thread.currentThread().getId() + "; " + httpUrlRequest.toString();
        try {
            Response response = a().execute(httpUrlRequest).get();
            if (response == null) {
                throw new RpcException((Integer) 9, "response is null");
            }
            return response.getResData();
        } catch (InterruptedException e) {
            throw new RpcException(13, "", e);
        } catch (CancellationException e2) {
            throw new RpcException(13, "", e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause != null && (cause instanceof HttpException)) {
                HttpException httpException = (HttpException) cause;
                throw new RpcException(Integer.valueOf(a(httpException.getCode())), httpException.getMsg());
            }
            throw new RpcException(9, "", e3);
        }
    }

    private void a(HttpUrlRequest httpUrlRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85efc048", new Object[]{this, httpUrlRequest});
            return;
        }
        httpUrlRequest.addHeader(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> headers = this.g.getRpcParams().getHeaders();
        if (headers == null || headers.isEmpty()) {
            return;
        }
        for (Header header : headers) {
            httpUrlRequest.addHeader(header);
        }
    }

    private Transport a() throws RpcException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Transport) ipChange.ipc$dispatch("c9f7837d", new Object[]{this}) : this.g.getTransport();
    }
}
