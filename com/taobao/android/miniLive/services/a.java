package com.taobao.android.miniLive.services;

import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.tao.Globals;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import tb.hud;
import tb.hue;
import tb.kge;
import tb.pmd;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Page_MiniLive";

    /* renamed from: a  reason: collision with root package name */
    private boolean f14344a = false;

    /* renamed from: com.taobao.android.miniLive.services.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC0554a {
        void a(Object obj);

        void b(Object obj);
    }

    static {
        kge.a(726375845);
        kge.a(-1071347259);
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1319292", new Object[]{aVar})).booleanValue() : aVar.f14344a;
    }

    public void a(final String str, String str2, final InterfaceC0554a interfaceC0554a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885aa745", new Object[]{this, str, str2, interfaceC0554a});
            return;
        }
        String m = hud.m();
        if (StringUtils.isEmpty(m)) {
            return;
        }
        String str3 = "";
        final String str4 = m + str + (StringUtils.equals("detail", str2) ? "?bizCode=TAOBAO_DETAIL" : StringUtils.equals("shop", str2) ? "?bizCode=SHOP" : str3);
        b bVar = new b();
        bVar.a(new InterfaceC0554a() { // from class: com.taobao.android.miniLive.services.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.miniLive.services.a.InterfaceC0554a
            public void a(Object obj) {
                String str5 = "";
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (a.a(a.this) || !(obj instanceof b.C0555a)) {
                } else {
                    hue.a("TBLiveService", "onSuccess");
                    try {
                        HashMap hashMap = new HashMap();
                        if ((((b.C0555a) obj).f14347a instanceof SimpleLiveInfo) && interfaceC0554a != null) {
                            SimpleLiveInfo simpleLiveInfo = ((b.C0555a) obj).f14347a;
                            if (simpleLiveInfo != null) {
                                interfaceC0554a.a(simpleLiveInfo);
                            } else {
                                hashMap.put("errorMsg", "result is empty");
                                interfaceC0554a.b(null);
                            }
                        } else if (interfaceC0554a != null) {
                            hashMap.put("errorMsg", "result is empty");
                            interfaceC0554a.b(null);
                        }
                        if (pmd.a().e() == null) {
                            return;
                        }
                        hashMap.put("url", str4);
                        hashMap.put("success", true);
                        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
                        hashMap.put("userId", pmd.a().q() != null ? pmd.a().q().a() : str5);
                        pmd.a().e().a(a.UT_PAGE_NAME, "fetchLiveInfo", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                        InterfaceC0554a interfaceC0554a2 = interfaceC0554a;
                        if (interfaceC0554a2 != null) {
                            interfaceC0554a2.b(null);
                        }
                        if (pmd.a().e() == null) {
                            return;
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("url", str4);
                        hashMap2.put("success", false);
                        hashMap2.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
                        hashMap2.put("errorMsg", e.getMessage());
                        if (pmd.a().q() != null) {
                            str5 = pmd.a().q().a();
                        }
                        hashMap2.put("userId", str5);
                        pmd.a().e().a(a.UT_PAGE_NAME, "fetchLiveInfo", hashMap2);
                    }
                }
            }

            @Override // com.taobao.android.miniLive.services.a.InterfaceC0554a
            public void b(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                } else if (a.a(a.this)) {
                } else {
                    InterfaceC0554a interfaceC0554a2 = interfaceC0554a;
                    if (interfaceC0554a2 != null) {
                        interfaceC0554a2.b(null);
                    }
                    if (com.taobao.taolive.sdk.utils.b.d(Globals.getApplication())) {
                        Toast.makeText(Globals.getApplication(), "接口请求失败!", 1).show();
                    }
                    hue.a("TBLiveService", "onError");
                    if (pmd.a().e() == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", str4);
                    hashMap.put("success", false);
                    hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
                    hashMap.put("errorMsg", "networkFailure");
                    hashMap.put("userId", pmd.a().q() != null ? pmd.a().q().a() : "");
                    pmd.a().e().a(a.UT_PAGE_NAME, "fetchLiveInfo", hashMap);
                }
            }
        });
        bVar.execute(str4);
        if (pmd.a().e() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str4);
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
            if (pmd.a().q() != null) {
                str3 = pmd.a().q().a();
            }
            hashMap.put("userId", str3);
            pmd.a().e().a(UT_PAGE_NAME, "startFetchLiveInfo", hashMap);
        }
        hue.a("TBLiveService", "startFetchLiveInfo");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f14344a = z;
        }
    }

    /* loaded from: classes6.dex */
    public class b extends AsyncTask<String, Integer, C0555a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private InterfaceC0554a b;
        private boolean c = false;

        static {
            kge.a(897688300);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.android.miniLive.services.a$b$a, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ C0555a doInBackground(String[] strArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(C0555a c0555a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, c0555a});
            } else {
                a(c0555a);
            }
        }

        public b() {
        }

        public void a(InterfaceC0554a interfaceC0554a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49ec1f31", new Object[]{this, interfaceC0554a});
            } else {
                this.b = interfaceC0554a;
            }
        }

        public C0555a a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0555a) ipChange.ipc$dispatch("85c0c8a", new Object[]{this, strArr});
            }
            if (isCancelled() || strArr == null || strArr.length <= 0) {
                return null;
            }
            this.c = true;
            try {
                String a2 = a(new URL(strArr[0]));
                if (a2 != null && a2.length() > 2) {
                    return new C0555a((SimpleLiveInfo) JSONObject.parseObject(a2, SimpleLiveInfo.class));
                }
                return null;
            } catch (Exception e) {
                return new C0555a(e);
            }
        }

        public void a(C0555a c0555a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7feae7b3", new Object[]{this, c0555a});
                return;
            }
            this.c = false;
            if (this.b == null) {
                return;
            }
            if (c0555a != null && (c0555a.f14347a instanceof SimpleLiveInfo)) {
                this.b.a(c0555a);
            } else {
                this.b.b(c0555a);
            }
        }

        /* renamed from: com.taobao.android.miniLive.services.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public class C0555a {

            /* renamed from: a  reason: collision with root package name */
            public SimpleLiveInfo f14347a;
            public Exception b;

            static {
                kge.a(191661301);
            }

            public C0555a(SimpleLiveInfo simpleLiveInfo) {
                this.f14347a = simpleLiveInfo;
            }

            public C0555a(Exception exc) {
                this.b = exc;
            }
        }

        private String a(URL url) throws IOException {
            Throwable th;
            HttpURLConnection httpURLConnection;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8e9c4799", new Object[]{this, url});
            }
            InputStream inputStream = null;
            String a2 = null;
            inputStream = null;
            try {
                if (StringUtils.equals(url.getProtocol(), "https")) {
                    httpURLConnection = (HttpsURLConnection) url.openConnection();
                } else {
                    httpURLConnection = (HttpURLConnection) url.openConnection();
                }
                try {
                    httpURLConnection.setReadTimeout(3000);
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("HTTP error code: " + responseCode);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        try {
                            a2 = a(inputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return a2;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = null;
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
