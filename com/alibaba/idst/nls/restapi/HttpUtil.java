package com.alibaba.idst.nls.restapi;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import tb.kge;

/* loaded from: classes2.dex */
public class HttpUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int STATUS_OK = 200;
    private static final String TAG = "AliSpeechSDK";

    static {
        kge.a(1913170111);
    }

    public static HttpResponse send(HttpRequest httpRequest) throws IOException {
        OutputStream outputStream;
        HttpResponse parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpResponse) ipChange.ipc$dispatch("15b4203f", new Object[]{httpRequest});
        }
        InputStream inputStream = null;
        try {
            URL url = new URL(httpRequest.getUrl());
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            httpsURLConnection.setRequestMethod(httpRequest.getMethod());
            if ("POST".equals(httpRequest.getMethod())) {
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setDoInput(true);
            }
            httpsURLConnection.setUseCaches(false);
            if (httpRequest.getHeader() != null) {
                Map<String, String> header = httpRequest.getHeader();
                for (String str : header.keySet()) {
                    httpsURLConnection.setRequestProperty(str, header.get(str));
                }
            }
            String bodyString = httpRequest.getBodyString();
            if (bodyString == null) {
                return null;
            }
            if (bodyString != null) {
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    outputStream.write(bodyString.getBytes());
                    outputStream.flush();
                } catch (Throwable th) {
                    th = th;
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                            throw th;
                        }
                    }
                    if (0 != 0) {
                        inputStream.close();
                    }
                    throw th;
                }
            } else {
                outputStream = null;
            }
            int responseCode = httpsURLConnection.getResponseCode();
            String responseMessage = httpsURLConnection.getResponseMessage();
            if (responseCode == 200) {
                Map headerFields = httpsURLConnection.getHeaderFields();
                ((List) headerFields.get("Content-Type")).get(0);
                if (((String) ((List) headerFields.get("Content-Type")).get(0)).equals("audio/mpeg")) {
                    inputStream = httpsURLConnection.getInputStream();
                    parse = httpRequest.parse(responseCode, readAll(inputStream), true);
                } else if (((String) ((List) headerFields.get("Content-Type")).get(0)).equals("application/json")) {
                    inputStream = httpsURLConnection.getInputStream();
                    parse = httpRequest.parse(responseCode, readAll(inputStream), false);
                } else {
                    parse = null;
                }
            } else {
                Log.e(TAG, "error, rest get status :" + responseCode + responseMessage);
                inputStream = httpsURLConnection.getErrorStream();
                parse = httpRequest.parse(responseCode, readAll(inputStream), false);
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return parse;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    private static byte[] readAll(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("40a2e65c", new Object[]{inputStream});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        while (read > 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
