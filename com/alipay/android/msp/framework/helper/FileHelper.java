package com.alipay.android.msp.framework.helper;

import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class FileHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public interface GetFilterInputStream {
        InputStream getFilter(InputStream inputStream) throws IOException;
    }

    public static FileResponse httpGet(URL url, Map<String, String> map) throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FileResponse) ipChange.ipc$dispatch("85322ca3", new Object[]{url, map}) : httpGet(url, map, null);
    }

    public static FileResponse httpGet(URL url, Map<String, String> map, GetFilterInputStream getFilterInputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FileResponse) ipChange.ipc$dispatch("be31b766", new Object[]{url, map, getFilterInputStream});
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        FileResponse fileResponse = new FileResponse();
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setUseCaches(false);
        if (map == null || !map.containsKey("connection")) {
            httpURLConnection.addRequestProperty("connection", "keep-alive");
        } else if (map != null) {
            for (String str : map.keySet()) {
                httpURLConnection.addRequestProperty(str, map.get(str));
            }
        }
        try {
            httpURLConnection.connect();
            fileResponse.setRespCode(httpURLConnection.getResponseCode());
            if (fileResponse.getRespCode() != 200) {
                return fileResponse;
            }
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            HashMap hashMap = new HashMap();
            if (headerFields != null) {
                for (String str2 : headerFields.keySet()) {
                    List<String> list = headerFields.get(str2);
                    if (list != null && list.size() > 0) {
                        hashMap.put(str2, list.get(0));
                    }
                }
            }
            fileResponse.setRespHeaders(hashMap);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream inputStream = httpURLConnection.getInputStream();
            if (getFilterInputStream != null) {
                inputStream = getFilterInputStream.getFilter(inputStream);
            }
            byte[] bArr = new byte[512];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.close();
            if (inputStream != null) {
                inputStream.close();
            } else if (httpURLConnection.getErrorStream() != null) {
                httpURLConnection.getErrorStream().close();
            }
            fileResponse.setRespBody(byteArrayOutputStream.toByteArray());
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            return fileResponse;
        } finally {
            try {
                httpURLConnection.disconnect();
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
            }
        }
    }
}
