package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.alivfssdk.cache.b;
import com.taobao.alivfssdk.cache.h;
import com.taobao.pha.core.p;

/* loaded from: classes7.dex */
public class nhh implements nft {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f31468a;

    static {
        kge.a(-1895980281);
        kge.a(1356058749);
    }

    public nhh(Uri uri) {
        this.f31468a = null;
        b cacheForModule = AVFSCacheManager.getInstance().cacheForModule(a(uri));
        if (cacheForModule != null) {
            this.f31468a = cacheForModule.a(true);
        }
    }

    public static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (scheme == null) {
            scheme = "";
        }
        if (host == null) {
            host = "";
        }
        String lowerCase = scheme.toLowerCase();
        String lowerCase2 = host.toLowerCase();
        if (port == -1) {
            if ("http".equals(lowerCase)) {
                port = 80;
            } else if ("https".equals(lowerCase)) {
                port = 443;
            }
        }
        String format = String.format("%s/%s/%s", lowerCase, lowerCase2, Integer.valueOf(port));
        return com.taobao.android.tschedule.protocol.b.PROTOCOL_BIZ_CODE_PHA + ngn.h(format);
    }

    @Override // tb.nft
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (this.f31468a != null && b()) {
            return (String) this.f31468a.b(str);
        }
        return null;
    }

    @Override // tb.nft
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : this.f31468a != null && b() && this.f31468a.a(str, (Object) str2);
    }

    @Override // tb.nft
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.f31468a != null && b() && this.f31468a.c(str);
    }

    @Override // tb.nft
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f31468a != null && b() && this.f31468a.b();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : p.c().g();
    }
}
