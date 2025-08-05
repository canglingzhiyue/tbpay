package com.taobao.taolive.sdk.business;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import tb.kge;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private f f21806a;

    static {
        kge.a(1443443943);
    }

    public i(f fVar) {
        this.f21806a = fVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a aVar = new a();
        aVar.a(this.f21806a);
        aVar.execute(str);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f21806a = null;
        }
    }

    /* loaded from: classes8.dex */
    public static class a extends AsyncTask<String, Integer, C0904a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private f f21807a;
        private boolean b = false;

        static {
            kge.a(855598826);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.taobao.taolive.sdk.business.i$a$a] */
        @Override // android.os.AsyncTask
        public /* synthetic */ C0904a doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(C0904a c0904a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, c0904a});
            } else {
                a(c0904a);
            }
        }

        public void a(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1eb3ab9", new Object[]{this, fVar});
            } else {
                this.f21807a = fVar;
            }
        }

        public C0904a a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0904a) ipChange.ipc$dispatch("cbf103ab", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            this.b = true;
            try {
                return new C0904a(a(new URL(strArr[0])));
            } catch (Exception e) {
                return new C0904a(e);
            }
        }

        public void a(C0904a c0904a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23dd305c", new Object[]{this, c0904a});
                return;
            }
            this.b = false;
            if (this.f21807a == null) {
                return;
            }
            if (c0904a != null && c0904a.f21808a != null) {
                this.f21807a.onSuccess(c0904a.f21808a);
            } else {
                this.f21807a.onError(c0904a);
            }
        }

        /* renamed from: com.taobao.taolive.sdk.business.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes8.dex */
        public class C0904a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public String f21808a;
            public Exception b;

            static {
                kge.a(-303569097);
            }

            public C0904a(String str) {
                this.f21808a = str;
            }

            public C0904a(Exception exc) {
                this.b = exc;
            }

            public String toString() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
                }
                return "Result{mResultValue='" + this.f21808a + "', mException=" + this.b + '}';
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
                    httpsURLConnection.setReadTimeout(3000);
                    httpsURLConnection.setConnectTimeout(3000);
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
