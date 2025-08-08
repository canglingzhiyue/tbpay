package com.taobao.taolive.sdk.business;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponse;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponseData;
import com.taobao.taolive.sdk.utils.u;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f21793a = "";
    private String b = "";
    private com.taobao.taolive.sdk.business.interact.comment.a c;

    /* loaded from: classes8.dex */
    public interface a {
        void a(Object obj);

        void b(Object obj);
    }

    static {
        kge.a(709779097);
    }

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ef8b8284", new Object[]{cVar}) : cVar.f21793a;
    }

    public static /* synthetic */ String a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("990fb4fa", new Object[]{cVar, str});
        }
        cVar.f21793a = str;
        return str;
    }

    public static /* synthetic */ String b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("151f8b85", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ String b(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccbddfbb", new Object[]{cVar, str});
        }
        cVar.b = str;
        return str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f21793a = "";
        this.b = "";
    }

    public void a(String str, int i, boolean z, com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0c2578", new Object[]{this, str, new Integer(i), new Boolean(z), dVar});
        } else {
            a(str, "", false, z, dVar);
        }
    }

    public void a(String str, String str2, boolean z, boolean z2, final com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e88751", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), dVar});
            return;
        }
        String str3 = null;
        if (z2) {
            str3 = u.e() + str + "/200000";
        }
        a(z, z2, str, str2, this.f21793a, str3, new com.taobao.taolive.sdk.adapter.network.d() { // from class: com.taobao.taolive.sdk.business.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                } else if (netBaseOutDo != null) {
                    FetchCommentResponseData fetchCommentResponseData = (FetchCommentResponseData) netBaseOutDo.mo1437getData();
                    com.taobao.taolive.sdk.adapter.network.d dVar2 = dVar;
                    if (dVar2 != null) {
                        dVar2.onSuccess(i, netResponse, netBaseOutDo, c.a(c.this));
                    }
                    if (fetchCommentResponseData != null && !StringUtils.isEmpty(fetchCommentResponseData.paginationContext)) {
                        c.a(c.this, fetchCommentResponseData.paginationContext);
                    }
                    if (!StringUtils.isEmpty(c.b(c.this)) || fetchCommentResponseData == null || fetchCommentResponseData.comments == null || fetchCommentResponseData.comments.isEmpty()) {
                        return;
                    }
                    c.b(c.this, fetchCommentResponseData.comments.get(0).paginationContext);
                } else {
                    com.taobao.taolive.sdk.adapter.network.d dVar3 = dVar;
                    if (dVar3 == null) {
                        return;
                    }
                    dVar3.onError(i, netResponse, obj);
                }
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                com.taobao.taolive.sdk.adapter.network.d dVar2 = dVar;
                if (dVar2 == null) {
                    return;
                }
                dVar2.onError(i, netResponse, obj);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    return;
                }
                com.taobao.taolive.sdk.adapter.network.d dVar2 = dVar;
                if (dVar2 == null) {
                    return;
                }
                dVar2.onSystemError(i, netResponse, obj);
            }
        });
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.taolive.sdk.business.interact.comment.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    private void a(boolean z, boolean z2, String str, String str2, String str3, String str4, final com.taobao.taolive.sdk.adapter.network.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9704ca65", new Object[]{this, new Boolean(z), new Boolean(z2), str, str2, str3, str4, dVar});
        } else if (z2) {
            b bVar = new b(str2);
            bVar.a(new a() { // from class: com.taobao.taolive.sdk.business.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.business.c.a
                public void a(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                    } else if (!(obj instanceof b.a)) {
                    } else {
                        try {
                            if (!StringUtils.isEmpty(((b.a) obj).f21797a)) {
                                FetchCommentResponse fetchCommentResponse = new FetchCommentResponse();
                                fetchCommentResponse.setData((FetchCommentResponseData) JSON.parseObject(String.valueOf(((b.a) obj).f21797a), FetchCommentResponseData.class));
                                dVar.onSuccess(1, null, fetchCommentResponse, null);
                                return;
                            }
                            dVar.onError(1, null, obj);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }

                @Override // com.taobao.taolive.sdk.business.c.a
                public void b(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    } else {
                        dVar.onError(1, null, obj);
                    }
                }
            });
            bVar.execute(str4);
        } else {
            if (this.c == null) {
                this.c = new com.taobao.taolive.sdk.business.interact.comment.a(dVar);
            }
            this.c.a(str, str2, str3);
        }
    }

    /* loaded from: classes8.dex */
    public class b extends AsyncTask<String, Integer, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a b;
        private boolean c = false;
        private String d;

        static {
            kge.a(-933556616);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.taolive.sdk.business.c$b$a, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ a doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, aVar});
            } else {
                a(aVar);
            }
        }

        public b(String str) {
            this.d = null;
            this.d = str;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2dbddebf", new Object[]{this, aVar});
            } else {
                this.b = aVar;
            }
        }

        public a a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c1b46450", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            this.c = true;
            try {
                String a2 = a(new URL(strArr[0]));
                if (a2 == null) {
                    return null;
                }
                return new a(a2);
            } catch (Exception e) {
                return new a(e);
            }
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b64afbc1", new Object[]{this, aVar});
                return;
            }
            this.c = false;
            if (this.b == null) {
                return;
            }
            if (!StringUtils.isEmpty(aVar.f21797a)) {
                this.b.a(aVar);
            } else {
                this.b.b(aVar);
            }
        }

        /* loaded from: classes8.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public String f21797a;
            public Exception b;

            static {
                kge.a(794379241);
            }

            public a(String str) {
                this.f21797a = str;
            }

            public a(Exception exc) {
                this.b = exc;
            }
        }

        private String a(URL url) throws IOException {
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
                    if (!StringUtils.isEmpty(this.d)) {
                        httpsURLConnection.setRequestProperty("anchorSideKey", this.d);
                    }
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
                        } catch (Throwable th) {
                            th = th;
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
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
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
