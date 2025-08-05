package com.taobao.taolive.message_sdk.cdn;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import tb.pex;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.taolive.message_sdk.cdn.a f21433a;
    private int b;

    public b(com.taobao.taolive.message_sdk.cdn.a aVar, int i) {
        this.b = 3000;
        this.f21433a = aVar;
        this.b = i;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        pex.b("TLiveCDNFetchBusiness", "setTimeOut: " + i);
        this.b = i;
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        a aVar = new a(this.b);
        aVar.a(this.f21433a);
        aVar.execute(str, str2, str3, str4);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f21433a = null;
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends AsyncTask<String, Integer, C0894a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.taolive.message_sdk.cdn.a f21434a;
        private boolean b = false;
        private int c;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.taolive.message_sdk.cdn.b$a$a] */
        @Override // android.os.AsyncTask
        public /* synthetic */ C0894a doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(C0894a c0894a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, c0894a});
            } else {
                a(c0894a);
            }
        }

        public a(int i) {
            this.c = 3000;
            this.c = i;
        }

        public void a(com.taobao.taolive.message_sdk.cdn.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fcf79", new Object[]{this, aVar});
            } else {
                this.f21434a = aVar;
            }
        }

        public C0894a a(String... strArr) {
            String str;
            Exception exc;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0894a) ipChange.ipc$dispatch("2434f7f5", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            this.b = true;
            String str7 = strArr[0];
            try {
                str = strArr[1];
                try {
                    str5 = strArr[2];
                    try {
                        str6 = strArr[3];
                    } catch (Exception e) {
                        exc = e;
                        str3 = "0";
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    str2 = "0";
                    str3 = str2;
                    str4 = str;
                    return new C0894a(str7, str4, str2, str3, exc);
                }
            } catch (Exception e3) {
                e = e3;
                str = "";
            }
            try {
                URL url = new URL(str7);
                pex.a("TLiveCDNFetchBusiness", "urlString:" + str7);
                return new C0894a(str7, str, str5, str6, a(url));
            } catch (Exception e4) {
                str3 = str6;
                exc = e4;
                str4 = str;
                str2 = str5;
                return new C0894a(str7, str4, str2, str3, exc);
            }
        }

        public void a(C0894a c0894a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c670b5e", new Object[]{this, c0894a});
                return;
            }
            this.b = false;
            if (this.f21434a == null) {
                return;
            }
            if (c0894a != null && c0894a.b != null) {
                this.f21434a.a(c0894a.f21435a, c0894a.d, c0894a.e, c0894a.f, c0894a.b);
            } else {
                this.f21434a.b(c0894a.f21435a, c0894a.d, c0894a.e, c0894a.f, c0894a);
            }
        }

        /* renamed from: com.taobao.taolive.message_sdk.cdn.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public class C0894a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f21435a;
            public String b;
            public Exception c;
            public String d;
            public String e;
            public String f;

            public C0894a(String str, String str2, String str3, String str4, String str5) {
                this.f21435a = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
                this.b = str5;
            }

            public C0894a(String str, String str2, String str3, String str4, Exception exc) {
                this.f21435a = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
                this.c = exc;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "Result{url='" + this.f21435a + "'mResultValue='" + this.b + "', mException=" + this.c + '}';
            }
        }

        private String a(URL url) throws IOException {
            Throwable th;
            HttpsURLConnection httpsURLConnection;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8e9c4799", new Object[]{this, url});
            }
            InputStream inputStream = null;
            String a2 = null;
            inputStream = null;
            try {
                httpsURLConnection = (HttpsURLConnection) url.openConnection();
                try {
                    httpsURLConnection.setReadTimeout(this.c);
                    httpsURLConnection.setConnectTimeout(this.c);
                    httpsURLConnection.setRequestMethod("GET");
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("HTTP error code: " + responseCode);
                    }
                    InputStream inputStream2 = httpsURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        try {
                            a2 = a(inputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    return a2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                httpsURLConnection = null;
            }
        }

        public String a(InputStream inputStream) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("172620d5", new Object[]{this, inputStream});
            }
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            char[] cArr = new char[1024];
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    stringBuffer.append(cArr, 0, read);
                } else {
                    return stringBuffer.toString();
                }
            }
        }
    }
}
