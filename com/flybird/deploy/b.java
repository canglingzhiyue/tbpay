package com.flybird.deploy;

import com.alipay.birdnest.platform.Platform;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.cum;
import tb.cun;
import tb.ieb;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, HashSet<cum<a, Void, Throwable>>> f7207a = new HashMap<>();

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f7209a;
        public final int b;
        public final byte[] c;

        public a(String str, Map<String, List<String>> map, int i, byte[] bArr) {
            this.f7209a = str;
            this.b = i;
            this.c = bArr;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            StringBuilder sb = new StringBuilder();
            sb.append("<CdnHttpResponse of ");
            sb.append(this.f7209a);
            sb.append(", status = ");
            sb.append(this.b);
            sb.append(", response length = ");
            byte[] bArr = this.c;
            sb.append(bArr != null ? bArr.length : -1);
            sb.append(">");
            return sb.toString();
        }
    }

    public static a a(String str) throws Exception {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6bb18b0b", new Object[]{str});
        }
        cun.b("FBCDNDownloader", "doHttpRequestSync: " + str);
        ieb.a();
        String str2 = Platform.f5257a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        try {
            int responseCode = httpURLConnection.getResponseCode();
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (responseCode == 200) {
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(32768);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 1024);
                        if (read != -1) {
                            byteArrayOutputStream.write(bArr, 0, read);
                        } else {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    bufferedInputStream.close();
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused2) {
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused3) {
                    }
                    a aVar = new a(str, headerFields, responseCode, byteArray);
                    cun.b("FBCDNDownloader", "doHttpRequestSync: " + str + " success -> " + aVar);
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        cun.a("FBCDNDownloader", "doHttpRequestSync: " + str + " failed", th);
                        throw th;
                    } catch (Throwable th3) {
                        try {
                            if (bufferedInputStream == null) {
                                if (httpURLConnection.getErrorStream() != null) {
                                    httpURLConnection.getErrorStream().close();
                                }
                            } else {
                                bufferedInputStream.close();
                            }
                        } catch (Throwable unused4) {
                        }
                        throw th3;
                    }
                }
            }
            throw new RuntimeException("failed to request url" + str + " status code:" + responseCode);
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
        }
    }

    public static void a(final String str, cum<a, Void, Throwable> cumVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24127487", new Object[]{str, cumVar});
            return;
        }
        HashMap<String, HashSet<cum<a, Void, Throwable>>> hashMap = f7207a;
        synchronized (hashMap) {
            HashSet<cum<a, Void, Throwable>> hashSet = hashMap.get(str);
            if (hashSet != null) {
                hashSet.add(cumVar);
            } else {
                HashSet<cum<a, Void, Throwable>> hashSet2 = new HashSet<>();
                hashSet2.add(cumVar);
                hashMap.put(str, hashSet2);
                z = false;
            }
        }
        if (!z) {
            cun.b("FBCDNDownloader", "doUniqueHttpRequestAsync: post " + str);
            ieb.b.submit(new Runnable() { // from class: com.flybird.deploy.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    HashSet<cum<a, Void, Throwable>> remove;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    a aVar = null;
                    try {
                        e = null;
                        aVar = b.a(str);
                    } catch (Exception e) {
                        e = e;
                    }
                    String str2 = str;
                    HashMap<String, HashSet<cum<a, Void, Throwable>>> hashMap2 = b.f7207a;
                    synchronized (hashMap2) {
                        remove = hashMap2.remove(str2);
                    }
                    if (remove == null) {
                        return;
                    }
                    Iterator<cum<a, Void, Throwable>> it = remove.iterator();
                    while (it.hasNext()) {
                        cum<a, Void, Throwable> next = it.next();
                        if (next != null) {
                            if (e != null) {
                                try {
                                    next.error(e);
                                } catch (Throwable th) {
                                    cun.a("error while executing CDNDownloader cb", th);
                                }
                            } else {
                                next.apply(aVar);
                            }
                        }
                    }
                }
            });
            return;
        }
        cun.b("FBCDNDownloader", "doUniqueHttpRequestAsync: already has task running for url: " + str);
    }
}
