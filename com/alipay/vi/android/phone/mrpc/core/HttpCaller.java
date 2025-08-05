package com.alipay.vi.android.phone.mrpc.core;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.vi.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* loaded from: classes3.dex */
public class HttpCaller extends AbstractRpcCaller {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Config f6198a;

    public HttpCaller(Config config, Method method, int i, String str, byte[] bArr, boolean z, Map<String, String> map) {
        super(method, i, str, bArr, HeaderConstant.HEADER_VALUE_OLD_TYPE, z, map);
        this.f6198a = config;
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.RpcCaller
    public Object call() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        HttpUrlRequest httpUrlRequest = new HttpUrlRequest(this.f6198a.getUrl());
        httpUrlRequest.setReqData(this.mReqData);
        httpUrlRequest.setContentType(this.mContentType);
        httpUrlRequest.setResetCookie(this.mResetCookie);
        httpUrlRequest.addTags("id", String.valueOf(this.mId));
        httpUrlRequest.addTags("operationType", this.mOperationType);
        httpUrlRequest.addTags("gzip", String.valueOf(this.f6198a.isGzip()));
        httpUrlRequest.addHeader(new BasicHeader("uuid", UUID.randomUUID().toString()));
        if (this.mRpcHeaders != null && this.mRpcHeaders.size() > 0) {
            for (String str : this.mRpcHeaders.keySet()) {
                if (TextUtils.equals(str, HeaderConstant.HEADER_KEY_APPID)) {
                    z = true;
                }
                httpUrlRequest.addHeader(new BasicHeader(str, this.mRpcHeaders.get(str)));
            }
        }
        List<Header> headers = this.f6198a.getRpcParams().getHeaders();
        if (headers != null && !headers.isEmpty()) {
            for (Header header : headers) {
                if (!TextUtils.equals(header.getName(), HeaderConstant.HEADER_KEY_APPID) || !z) {
                    httpUrlRequest.addHeader(header);
                }
            }
        }
        StringBuilder sb = new StringBuilder("threadid = ");
        sb.append(Thread.currentThread().getId());
        sb.append("; ");
        sb.append(httpUrlRequest.toString());
        try {
            Response response = this.f6198a.getTransport().execute(httpUrlRequest).get();
            if (response == null) {
                throw new RpcException((Integer) 9, "response is null");
            }
            RpcThreadParamsHelper.setResponseHeaders(((HttpUrlResponse) response).getHeader());
            return response.getResData();
        } catch (InterruptedException e) {
            throw new RpcException((Integer) 13, String.valueOf(e));
        } catch (CancellationException e2) {
            throw new RpcException((Integer) 13, String.valueOf(e2));
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException((Integer) 9, String.valueOf(e3));
            }
            HttpException httpException = (HttpException) cause;
            int code = httpException.getCode();
            switch (code) {
                case 1:
                    code = 2;
                    break;
                case 2:
                    code = 3;
                    break;
                case 3:
                    code = 4;
                    break;
                case 4:
                    code = 5;
                    break;
                case 5:
                    code = 6;
                    break;
                case 6:
                    code = 7;
                    break;
                case 7:
                    code = 8;
                    break;
                case 8:
                    code = 15;
                    break;
                case 9:
                    code = 16;
                    break;
            }
            throw new RpcException(Integer.valueOf(code), httpException.getMsg());
        }
    }
}
