package com.taobao.android.preload;

import android.support.v4.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.preload.c;
import java.util.Map;
import tb.jqm;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f14692a = new c();
    private final String[] b = {"refresh", "preload"};
    private final String[] c = {"high", "low"};

    public void a(c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf66310", new Object[]{this, aVar});
        } else {
            this.f14692a.a(aVar);
        }
    }

    public g a(g gVar) {
        g gVar2;
        LruCache<String, g> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("1b7664e", new Object[]{this, gVar});
        }
        try {
            gVar2 = this.f14692a.a(gVar).put(gVar.d, gVar);
            try {
                if (jqm.a()) {
                    f.b(e.a("PreloadTaskStore"), "save cache success" + gVar.toString());
                }
                f.b(e.a("PreloadTaskStore"), "save cache success: cache_size:" + a2.size() + "max_size:" + a2.maxSize());
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                f.a(e.a("PreloadTaskStore"), "save cache error", e);
                return gVar2;
            }
        } catch (Exception e2) {
            e = e2;
            gVar2 = null;
        }
        return gVar2;
    }

    public g a(String str) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("114f0665", new Object[]{this, str});
        }
        try {
            String[] strArr = this.b;
            int length = strArr.length;
            gVar = null;
            int i = 0;
            while (i < length) {
                try {
                    String str2 = strArr[i];
                    g gVar2 = gVar;
                    for (String str3 : this.c) {
                        try {
                            LruCache<String, g> a2 = this.f14692a.a(str2, str3);
                            if (a2 != null) {
                                g gVar3 = a2.get(str);
                                if (gVar3 != null) {
                                    try {
                                        if (!gVar3.a()) {
                                            return gVar3;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        gVar = gVar3;
                                        e.printStackTrace();
                                        f.a(e.a("PreloadTaskStore"), "get cache error", e);
                                        return gVar;
                                    }
                                }
                                gVar2 = gVar3;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            gVar = gVar2;
                        }
                    }
                    i++;
                    gVar = gVar2;
                } catch (Exception e3) {
                    e = e3;
                }
            }
        } catch (Exception e4) {
            e = e4;
            gVar = null;
        }
        return gVar;
    }

    public void a(String str, String str2) {
        g value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        LruCache<String, g> a2 = this.f14692a.a(str, str2);
        if (a2 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cacheType: ");
        sb.append(str);
        sb.append(", cacheHit: ");
        sb.append(str2);
        sb.append("当前队列：");
        for (Map.Entry<String, g> entry : a2.snapshot().entrySet()) {
            if (entry != null && (value = entry.getValue()) != null) {
                sb.append(value.d);
                sb.append(",");
            }
        }
        f.b(e.a("PreloadTaskStore"), sb.toString());
    }

    public void a() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        for (String str : this.b) {
            for (String str2 : this.c) {
                a(str, str2);
            }
        }
    }
}
