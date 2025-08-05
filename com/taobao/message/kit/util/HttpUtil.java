package com.taobao.message.kit.util;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import tb.ado;
import tb.kge;

/* loaded from: classes7.dex */
public class HttpUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HttpUtil";

    static {
        kge.a(-997211677);
    }

    public static String checkHttpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46cef7b0", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        TLog.logv(TAG, "url before:" + str);
        StringBuilder sb = new StringBuilder();
        if (str.startsWith(ado.URL_SEPARATOR)) {
            sb.append("http:");
            sb.append(str);
        } else {
            sb.append(str);
        }
        String sb2 = sb.toString();
        TLog.logv(TAG, "url after:" + sb2);
        return sb2;
    }

    public static boolean isAnimationPic(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d4a10845", new Object[]{str})).booleanValue() : isApng(str) || isGifUrl(str);
    }

    public static boolean isApng(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbf19f87", new Object[]{str})).booleanValue() : checkUrlPathSuffix(str, ".apng");
    }

    public static boolean isGifUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1f0925aa", new Object[]{str})).booleanValue() : checkUrlPathSuffix(str, ".gif");
    }

    private static boolean checkUrlPathSuffix(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8635b39c", new Object[]{str, str2})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.endsWith(str2)) {
            return true;
        }
        try {
        } catch (Exception e) {
            TLog.loge(Log.getStackTraceString(e), new String[0]);
        }
        return Uri.parse(str).getLastPathSegment().endsWith(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String httpRequest(java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.kit.util.HttpUtil.httpRequest(java.lang.String, java.lang.String, java.util.Map):java.lang.String");
    }

    public static HttpURLConnection create(URL url) throws NoSuchAlgorithmException, KeyManagementException, IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HttpURLConnection) ipChange.ipc$dispatch("7cfd347d", new Object[]{url});
        }
        if (url.getProtocol().startsWith("https")) {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new TrustAllManager()}, null);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
            if (TextUtils.equals("true", ConfigUtil.getValue("mpm_business_switch", "ignorehttpscheck", "false"))) {
                httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            }
            httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.taobao.message.kit.util.HttpUtil.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // javax.net.ssl.HostnameVerifier
                public boolean verify(String str, SSLSession sSLSession) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("563b2905", new Object[]{this, str, sSLSession})).booleanValue();
                    }
                    return true;
                }
            });
            return httpsURLConnection;
        }
        return (HttpURLConnection) url.openConnection();
    }

    /* loaded from: classes7.dex */
    public static class TrustAllManager implements X509TrustManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(279501411);
            kge.a(524502825);
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee06893b", new Object[]{this, x509CertificateArr, str});
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ab6d06b3", new Object[]{this, x509CertificateArr, str});
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (X509Certificate[]) ipChange.ipc$dispatch("cdefad90", new Object[]{this}) : new X509Certificate[0];
        }
    }
}
