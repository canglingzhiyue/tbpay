package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes9.dex */
public class rgd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(316881785);
    }

    public String getResponse(String str) {
        HttpURLConnection httpURLConnection;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee87cc98", new Object[]{this, str});
        }
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    if (httpURLConnection == null) {
                        return "";
                    }
                    httpURLConnection.disconnect();
                    return "";
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = httpURLConnection.getInputStream().read(bArr);
                    if (-1 == read) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                return new String(byteArrayOutputStream.toByteArray(), "UTF-8");
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }
}
