package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.net.URL;

/* loaded from: classes7.dex */
public class knb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public URL f30178a;
        public long b;
        public boolean c;
        public boolean d;
        public boolean e;
        public long f;
        public long g;
        public long h = System.currentTimeMillis();
        public double i;
        public String j;
        public long k;
        public boolean l;
        public boolean m;
        public String n;
        public long o;
        public String p;
        public String q;
        public long r;
        public String s;
        public String t;
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        try {
            if (com.taobao.downloader.a.e == null || !(com.taobao.downloader.a.e instanceof klh)) {
                return;
            }
            com.taobao.downloader.a.e.a("download-sdk", str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else if (com.taobao.downloader.a.e == null) {
        } else {
            com.taobao.downloader.a.e.a("download-sdk", str, str2, str3, str4);
        }
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a2917c6", new Object[]{aVar, str});
        } else if (com.taobao.downloader.a.e == null) {
        } else {
            try {
                com.taobao.downloader.a.e.a(aVar, str);
            } catch (Throwable th) {
                kmv.a("stat", "on exception", th, new Object[0]);
            }
        }
    }
}
