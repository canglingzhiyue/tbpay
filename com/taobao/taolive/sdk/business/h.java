package com.taobao.taolive.sdk.business;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import tb.kge;
import tb.pmd;

@Deprecated
/* loaded from: classes8.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public interface a {
        void a(Object obj);

        void b(Object obj);
    }

    static {
        kge.a(-1116010207);
    }

    @Deprecated
    public void a(final String str, final String str2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5ffd546", new Object[]{this, str, str2, aVar});
            return;
        }
        b bVar = new b();
        bVar.a(new a() { // from class: com.taobao.taolive.sdk.business.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.business.h.a
            public void a(Object obj) {
                String str3 = "";
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (!(obj instanceof b.a)) {
                } else {
                    try {
                        HashMap hashMap = new HashMap();
                        if (!TextUtils.isEmpty(((b.a) obj).f21805a) && aVar != null) {
                            HashMap hashMap2 = (HashMap) JSONObject.parseObject(((b.a) obj).f21805a, HashMap.class);
                            if (hashMap2 != null && hashMap2.get("list") != null) {
                                aVar.a(JSONArray.parseArray(JSON.toJSONString(hashMap2.get("list")), ShareGoodsListMessage.class));
                            } else {
                                hashMap.put("errorMsg", "map is empty");
                                aVar.b(null);
                            }
                        } else if (aVar != null) {
                            hashMap.put("errorMsg", "result is empty");
                            aVar.b(null);
                        }
                        if (pmd.a().e() == null) {
                            return;
                        }
                        hashMap.put("url", str2);
                        hashMap.put("success", true);
                        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
                        hashMap.put("userId", pmd.a().q() != null ? pmd.a().q().a() : str3);
                        pmd.a().e().a("Page_TaobaoLiveWatch", "fetchedItemInfo", hashMap);
                    } catch (Exception e) {
                        e.printStackTrace();
                        a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.b(null);
                        }
                        if (pmd.a().e() == null) {
                            return;
                        }
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("url", str2);
                        hashMap3.put("success", false);
                        hashMap3.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
                        hashMap3.put("errorMsg", e.getMessage());
                        if (pmd.a().q() != null) {
                            str3 = pmd.a().q().a();
                        }
                        hashMap3.put("userId", str3);
                        pmd.a().e().a("Page_TaobaoLiveWatch", "fetchedItemInfo", hashMap3);
                    }
                }
            }

            @Override // com.taobao.taolive.sdk.business.h.a
            public void b(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f056ab85", new Object[]{this, obj});
                    return;
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b(null);
                }
                if (pmd.a().e() == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("url", str2);
                hashMap.put("success", false);
                hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
                hashMap.put("errorMsg", "networkFailure");
                hashMap.put("userId", pmd.a().q() != null ? pmd.a().q().a() : "");
                pmd.a().e().a("Page_TaobaoLiveWatch", "fetchedItemInfo", hashMap);
            }
        });
        bVar.execute(str2);
        if (pmd.a().e() == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str2);
        hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, str);
        hashMap.put("userId", pmd.a().q() != null ? pmd.a().q().a() : "");
        pmd.a().e().a("Page_TaobaoLiveWatch", "startFetchItemInfo", hashMap);
    }

    /* loaded from: classes8.dex */
    public class b extends AsyncTask<String, Integer, a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private a b;
        private boolean c = false;

        static {
            kge.a(40222960);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.taolive.sdk.business.h$b$a, java.lang.Object] */
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

        public b() {
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("364619da", new Object[]{this, aVar});
            } else {
                this.b = aVar;
            }
        }

        public a a(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ca3c9f6b", new Object[]{this, strArr});
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
                ipChange.ipc$dispatch("bdb0dc1c", new Object[]{this, aVar});
                return;
            }
            this.c = false;
            if (this.b == null) {
                return;
            }
            if (!TextUtils.isEmpty(aVar.f21805a)) {
                this.b.a(aVar);
            } else {
                this.b.b(aVar);
            }
        }

        /* loaded from: classes8.dex */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public String f21805a;
            public Exception b;

            static {
                kge.a(-1194370447);
            }

            public a(String str) {
                this.f21805a = str;
            }

            public a(Exception exc) {
                this.b = exc;
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
