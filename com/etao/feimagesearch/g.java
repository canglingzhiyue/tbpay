package com.etao.feimagesearch;

import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.taobao.android.task.Coordinator;
import java.io.File;
import tb.com;
import tb.cuj;
import tb.kge;

/* loaded from: classes3.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f6670a;
    private String b;

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final g f6673a;

        static {
            kge.a(-84841927);
            f6673a = new g();
        }

        public static /* synthetic */ g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("be604405", new Object[0]) : f6673a;
        }
    }

    static {
        kge.a(-773794601);
    }

    public static /* synthetic */ String a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62e03bc1", new Object[]{gVar}) : gVar.b;
    }

    public static /* synthetic */ String a(g gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81a178f7", new Object[]{gVar, str});
        }
        gVar.b = str;
        return str;
    }

    private g() {
        this.f6670a = new Handler(Looper.getMainLooper());
        this.b = cuj.b(com.b(), "plt_cache", "");
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("be604405", new Object[0]) : a.a();
    }

    public synchronized void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!b.ac()) {
        } else {
            this.f6670a.post(new com.taobao.android.weex_framework.util.o() { // from class: com.etao.feimagesearch.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    g gVar;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    if (StringUtils.isEmpty(g.a(g.this))) {
                        gVar = g.this;
                        str2 = str;
                    } else {
                        gVar = g.this;
                        str2 = g.a(g.this) + "," + str;
                    }
                    g.a(gVar, str2);
                    k.a(com.b(), "plt_cache", g.a(g.this));
                }
            });
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!b.ac()) {
        } else {
            final String str = this.b;
            this.b = "";
            k.a(com.b(), "plt_cache", this.b);
            if (StringUtils.isEmpty(str)) {
                return;
            }
            Coordinator.execute(new com.taobao.android.weex_framework.util.o() { // from class: com.etao.feimagesearch.g.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    String[] split = str.split(",");
                    if (split == null || split.length == 0) {
                        return;
                    }
                    for (String str2 : split) {
                        try {
                            File file = new File(str2);
                            if (file.exists()) {
                                boolean delete = file.delete();
                                if (com.a()) {
                                    String str3 = "delete file " + str2 + " result is " + delete;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }
}
