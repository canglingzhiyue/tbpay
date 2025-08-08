package com.alipay.android.msp.framework.statistics;

import mtopsdk.common.util.StringUtils;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;

/* loaded from: classes3.dex */
public class NetworkHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DefaultHttpClient f4848a = new DefaultHttpClient();

    public byte[] fetch(String str, byte[] bArr, String str2, List<Header> list) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("aed00c70", new Object[]{this, str, bArr, str2, list});
        }
        HttpResponse fetchResponse = fetchResponse(str, bArr, str2, list);
        if (fetchResponse == null) {
            return null;
        }
        return read(fetchResponse);
    }

    public byte[] read(HttpResponse httpResponse) throws IllegalStateException, IOException {
        InputStream inputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("29eb740b", new Object[]{this, httpResponse});
        }
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            inputStream = httpResponse.getEntity().getContent();
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream2.write(bArr, 0, read);
                    } catch (Throwable th) {
                        th = th;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception e) {
                                LogUtil.printExceptionStackTrace(e);
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Exception e2) {
                                LogUtil.printExceptionStackTrace(e2);
                            }
                        }
                        throw th;
                    }
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e3) {
                        LogUtil.printExceptionStackTrace(e3);
                    }
                }
                try {
                    byteArrayOutputStream2.close();
                } catch (Exception e4) {
                    LogUtil.printExceptionStackTrace(e4);
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public HttpResponse fetchResponse(String str, byte[] bArr, String str2, List<Header> list) {
        HttpPost httpGet;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("7d55b75d", new Object[]{this, str, bArr, str2, list});
        }
        if (bArr == null || bArr.length == 0) {
            httpGet = new HttpGet(str);
        } else {
            httpGet = new HttpPost(str);
            if (StringUtils.isEmpty(str2)) {
                str2 = MspNetConstants.Request.DEFAULT_CONTENT_TYPE;
            }
            ByteArrayEntity byteArrayEntity = new ByteArrayEntity(bArr);
            byteArrayEntity.setContentType(str2);
            httpGet.setEntity(byteArrayEntity);
        }
        if (list != null) {
            for (Header header : list) {
                httpGet.addHeader(header);
            }
        }
        HttpResponse httpResponse = null;
        try {
            try {
                httpResponse = this.f4848a.execute(httpGet);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
            return httpResponse;
        } finally {
            this.f4848a.getConnectionManager().shutdown();
        }
    }
}
