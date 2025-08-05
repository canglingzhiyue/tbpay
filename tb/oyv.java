package tb;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.h;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.Tracer.c;
import com.taobao.taobaoavsdk.cache.library.ProxyCacheException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;

/* loaded from: classes8.dex */
public class oyv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f32497a;

    static {
        kge.a(-1323298074);
    }

    public static /* synthetic */ void a(oyv oyvVar, String str, String str2, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e7cc63", new Object[]{oyvVar, str, str2, new Integer(i)});
        } else {
            oyvVar.b(str, str2, i);
        }
    }

    public oyv() {
        h hVar = new h() { // from class: tb.oyv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.virtual_thread.face.h
            public String newThreadName() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this}) : "http_cache_client_thread";
            }
        };
        synchronized (this) {
            if (f32497a == null) {
                f32497a = com.taobao.taobaoavsdk.util.a.a(12, hVar);
            }
        }
    }

    public void a(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba9507", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        try {
            f32497a.submit(new a(str, str2, i));
        } catch (OutOfMemoryError e) {
            AVSDKLog.e(c.MODULE_SDK_PAGE, "addHttpRequest fail " + str + ", " + e.toString());
        }
    }

    /* loaded from: classes8.dex */
    public final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String b;
        private final String c;
        private final int d;

        static {
            kge.a(607165678);
            kge.a(-1390502639);
        }

        public a(String str, String str2, int i) {
            this.b = str;
            this.c = str2;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                oyv.a(oyv.this, this.b, this.c, this.d);
            } catch (ProxyCacheException unused) {
            }
        }
    }

    private void b(String str, String str2, int i) throws ProxyCacheException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("551fca26", new Object[]{this, str, str2, new Integer(i)});
            return;
        }
        Uri.parse(str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            if (i <= 0) {
                httpURLConnection.setRequestProperty(HttpConstant.RANGE, "bytes=0-");
            } else {
                httpURLConnection.setRequestProperty(HttpConstant.RANGE, "bytes=0-" + (i - 1));
            }
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setRequestProperty(HttpConstant.USER_AGENT, str2);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200 || responseCode == 206) {
                return;
            }
            AVSDKLog.e("HttpCacheClients", " httpRequest error, code =" + responseCode);
        } catch (Exception e) {
            throw new ProxyCacheException("Error opening connection for " + str + " error message:" + e.getMessage(), e);
        }
    }
}
