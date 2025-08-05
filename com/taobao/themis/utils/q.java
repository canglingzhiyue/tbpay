package com.taobao.themis.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import tb.kge;

/* loaded from: classes9.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1085385885);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.utils.q.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r5
            java.lang.String r5 = "9f352ae"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.String r5 = (java.lang.String) r5
            return r5
        L15:
            r0 = 0
            if (r5 == 0) goto L66
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L1f
            goto L66
        L1f:
            java.lang.String r1 = ""
            java.net.URL r4 = new java.net.URL     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L56
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L56
            java.net.URLConnection r5 = r4.openConnection()     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L56
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L49 java.io.IOException -> L56
            r4 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L57
            r5.setReadTimeout(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L57
            java.io.InputStream r4 = r5.getInputStream()     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L57
            java.lang.String r1 = a(r4)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L57
            if (r5 == 0) goto L62
            r5.disconnect()     // Catch: java.lang.Exception -> L42 java.lang.Throwable -> L66
            goto L62
        L42:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L66
            goto L62
        L47:
            r1 = move-exception
            goto L4b
        L49:
            r1 = move-exception
            r5 = r0
        L4b:
            if (r5 == 0) goto L55
            r5.disconnect()     // Catch: java.lang.Exception -> L51 java.lang.Throwable -> L66
            goto L55
        L51:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L66
        L55:
            throw r1     // Catch: java.lang.Throwable -> L66
        L56:
            r5 = r0
        L57:
            if (r5 == 0) goto L61
            r5.disconnect()     // Catch: java.lang.Exception -> L5d java.lang.Throwable -> L66
            goto L61
        L5d:
            r5 = move-exception
            r5.printStackTrace()     // Catch: java.lang.Throwable -> L66
        L61:
            r2 = 1
        L62:
            if (r2 == 0) goto L65
            return r0
        L65:
            return r1
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.utils.q.a(java.lang.String):java.lang.String");
    }

    private static String a(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("172620d5", new Object[]{inputStream});
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                StringBuilder sb = new StringBuilder(inputStream.available() + 10);
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                try {
                    char[] cArr = new char[4096];
                    while (true) {
                        int read = bufferedReader2.read(cArr);
                        if (read <= 0) {
                            break;
                        }
                        sb.append(cArr, 0, read);
                    }
                    String sb2 = sb.toString();
                    try {
                        bufferedReader2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    return sb2;
                } catch (IOException e3) {
                    e = e3;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (inputStream == null) {
                        return "";
                    }
                    try {
                        inputStream.close();
                        return "";
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        return "";
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }
}
