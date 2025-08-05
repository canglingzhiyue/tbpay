package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import java.net.URL;
import java.util.HashMap;
import tb.jyx;
import tb.knb;

/* loaded from: classes7.dex */
public class kne {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f30182a;
    private boolean b;
    private String c;
    private String d;
    private String e;
    private kmm f;
    private kml g;
    private final long h = System.currentTimeMillis();

    public kne(String str, kmm kmmVar, kml kmlVar) {
        this.e = str;
        this.f = kmmVar;
        this.g = kmlVar;
    }

    public void a(kmr kmrVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1604d88", new Object[]{this, kmrVar});
        } else if (kmrVar == null) {
        } else {
            try {
                if (kmrVar.f30170a) {
                    kmv.a("Callback", "onDownloadFinish", "task", kmrVar);
                    this.g.onDownloadFinish(kmrVar.e.f30167a, kmrVar.d);
                } else {
                    kmv.a("Callback", "onDownloadError", "task", kmrVar);
                    this.g.onDownloadError(kmrVar.e.f30167a, kmrVar.b, kmrVar.c);
                    this.b = true;
                    this.c = String.valueOf(kmrVar.b);
                    this.d = kmrVar.e.f30167a;
                }
                if (this.g instanceof kmn) {
                    HashMap<String, String> b = b(kmrVar);
                    ((kmn) this.g).a(kmrVar.e.f30167a, b);
                    kmv.a("Callback", "onDownloadFinish", "task", b.toString());
                }
                kmrVar.k.o = System.currentTimeMillis() - this.h;
                knb.a(kmrVar.k, "download_task");
                int i = this.f30182a + 1;
                this.f30182a = i;
                if (i != this.f.f30166a.size()) {
                    return;
                }
                kmv.a("onFinish", "task", kmrVar);
                if (this.b) {
                    knb.a(klh.POINT_ALL_CALLBACK, kmrVar.f.t + this.e, this.c, this.d);
                } else {
                    knb.a(klh.POINT_ALL_CALLBACK, kmrVar.f.t + this.e);
                }
                kml kmlVar = this.g;
                if (this.b) {
                    z = false;
                }
                kmlVar.onFinish(z);
            } catch (Throwable th) {
                kmv.a("Callback", "on callback", th, new Object[0]);
            }
        }
    }

    private HashMap<String, String> b(kmr kmrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("3dcef92c", new Object[]{this, kmrVar});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (kmrVar == null) {
            return hashMap;
        }
        int i = kmrVar.b;
        String str = kmrVar.c;
        boolean z = kmrVar.f30170a;
        hashMap.put("errorCode", String.valueOf(i));
        hashMap.put("errorMsg", str);
        hashMap.put("success", String.valueOf(z));
        knb.a aVar = kmrVar.k;
        if (aVar != null) {
            String str2 = aVar.s;
            String str3 = aVar.t;
            boolean z2 = aVar.d;
            boolean z3 = aVar.e;
            long j = aVar.f;
            long j2 = aVar.g;
            long j3 = aVar.b;
            URL url = aVar.f30178a;
            String str4 = aVar.j;
            boolean z4 = aVar.m;
            hashMap.put("error_code", str2);
            hashMap.put(MUSAppMonitor.ERROR_MSG, str3);
            hashMap.put("range", String.valueOf(z2));
            hashMap.put("retry", String.valueOf(z3));
            hashMap.put("connectTime", String.valueOf(j));
            hashMap.put(jyx.c.POINT_NAME, String.valueOf(j2));
            hashMap.put("size", String.valueOf(j3));
            hashMap.put("url", url == null ? "" : url.toString());
            hashMap.put("biz", str4);
            hashMap.put("prefetch", String.valueOf(z4));
        }
        return hashMap;
    }
}
