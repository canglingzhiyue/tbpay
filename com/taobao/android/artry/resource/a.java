package com.taobao.android.artry.resource;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.LinkedList;
import java.util.List;
import tb.dqd;
import tb.kge;
import tb.kml;
import tb.kmm;
import tb.kmo;
import tb.kmq;
import tb.kna;

/* loaded from: classes4.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f9060a;
    private C0350a b;

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void a(int i);

        void a(String str);

        void a(String str, String str2);

        void b(String str);
    }

    static {
        kge.a(-70674538);
    }

    public static /* synthetic */ C0350a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (C0350a) ipChange.ipc$dispatch("c2089e3d", new Object[]{aVar}) : aVar.b;
    }

    private a(C0350a c0350a) {
        this.b = c0350a;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            File file = new File(C0350a.a(this.b));
            if (file.isFile()) {
                file.delete();
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            List<kmo> a2 = a(file);
            if (a2 != null && a2.size() != 0) {
                kmm kmmVar = new kmm();
                kmmVar.f30166a = a2;
                kmmVar.b = new kmq();
                kmmVar.b.f30169a = C0350a.c(this.b);
                kmmVar.b.h = file.getAbsolutePath();
                this.f9060a = com.taobao.downloader.b.a().a(kmmVar, new c());
                return;
            }
            dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                    } else {
                        try {
                            C0350a.b(a.a(a.this)).a();
                        } catch (Throwable th) {
                            Log.e("DownloadTask", "failed to invoke onResourceLoadAllFinish method..." + th);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                    } else {
                        try {
                            C0350a.b(a.a(a.this)).b("download execute error.");
                        } catch (Throwable th2) {
                            Log.e("DownloadTask", "failed to invoke onError method..." + th2);
                        }
                    }
                }
            });
            Log.e("DownloadTask", "downloadTask {biz:%s}error" + C0350a.c(this.b) + " e val is " + th);
        }
    }

    private List<kmo> a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6bec9888", new Object[]{this, file});
        }
        List<kmo> d = C0350a.d(this.b);
        if (com.taobao.android.artry.utils.d.a(d)) {
            return null;
        }
        if (file == null || !file.exists() || !file.isDirectory()) {
            throw new IllegalArgumentException();
        }
        LinkedList linkedList = new LinkedList();
        for (final kmo kmoVar : d) {
            if (StringUtils.isEmpty(kmoVar.d) || !com.taobao.android.artry.utils.d.a(kmoVar.f30167a)) {
                dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                        } else {
                            C0350a.b(a.a(a.this)).a(kmoVar.f30167a);
                        }
                    }
                });
            }
            File file2 = new File(file, kmoVar.d);
            final String absolutePath = file2.getAbsolutePath();
            if (file2.exists()) {
                if (kna.a(kmoVar.c, absolutePath)) {
                    String str = "the resource[%s] has already existed, the file is [%s]..." + kmoVar.f30167a + com.etao.feimagesearch.util.album.b.LOCAL_FILE_PATH + absolutePath;
                    dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                            } else {
                                try {
                                    C0350a.b(a.a(a.this)).a(kmoVar.f30167a, absolutePath);
                                } catch (Throwable th) {
                                    Log.e("DownloadTask", "failed to invoke onResourceLoad method..." + th);
                                }
                            }
                        }
                    });
                } else {
                    file2.delete();
                }
            }
            linkedList.add(kmoVar);
        }
        return linkedList;
    }

    /* renamed from: com.taobao.android.artry.resource.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0350a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f9065a;
        private String b;
        private List<kmo> c = new LinkedList();
        private b d;

        static {
            kge.a(1828878445);
        }

        public static /* synthetic */ String a(C0350a c0350a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("62393b1c", new Object[]{c0350a}) : c0350a.b;
        }

        public static /* synthetic */ b b(C0350a c0350a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("fcf0fa1e", new Object[]{c0350a}) : c0350a.d;
        }

        public static /* synthetic */ String c(C0350a c0350a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7247c1e", new Object[]{c0350a}) : c0350a.f9065a;
        }

        public static /* synthetic */ List d(C0350a c0350a) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("267dee06", new Object[]{c0350a}) : c0350a.c;
        }

        public C0350a(String str, String str2) {
            this.f9065a = str;
            this.b = str2;
        }

        public C0350a a(String str, String str2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (C0350a) ipChange.ipc$dispatch("64ae4158", new Object[]{this, str, str2}) : a(0L, str, null, str2);
        }

        public C0350a a(long j, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0350a) ipChange.ipc$dispatch("e4097196", new Object[]{this, new Long(j), str, str2, str3});
            }
            kmo kmoVar = new kmo();
            kmoVar.b = j;
            kmoVar.f30167a = str;
            kmoVar.c = str2;
            kmoVar.d = str3;
            this.c.add(kmoVar);
            return this;
        }

        public C0350a a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (C0350a) ipChange.ipc$dispatch("d5a4c4ff", new Object[]{this, bVar});
            }
            this.d = bVar;
            return this;
        }

        public a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("852ccde1", new Object[]{this}) : new a(this);
        }
    }

    /* loaded from: classes4.dex */
    public class c implements kml {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        static {
            kge.a(-1545158364);
            kge.a(1882102659);
        }

        private c() {
        }

        public static /* synthetic */ int a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f99d6ab5", new Object[]{cVar})).intValue() : cVar.b;
        }

        public static /* synthetic */ int a(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3a106074", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.b = i;
            return i;
        }

        @Override // tb.kml
        public void onDownloadProgress(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            String str = "the progress of download task is [%d], the thread is %s" + i + " ttid " + Thread.currentThread().getId();
            dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                    } else {
                        try {
                            if (c.a(c.this) >= i) {
                                return;
                            }
                            c.a(c.this, i);
                            C0350a.b(a.a(a.this)).a(c.a(c.this));
                        } catch (Throwable th) {
                            Log.e("DownloadTask", "failed to invoke onResourceLoadFail method..." + th);
                        }
                    }
                }
            });
        }

        @Override // tb.kml
        public void onDownloadError(final String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            Log.e("DownloadTask", "failed to load resource[%s]; the reason is %d[%s]" + str + " errorCode " + i + " msg " + str2);
            dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                    } else {
                        try {
                            C0350a.b(a.a(a.this)).a(str);
                        } catch (Throwable th) {
                            Log.e("DownloadTask", "failed to invoke onResourceLoadFail method..." + th);
                        }
                    }
                }
            });
        }

        @Override // tb.kml
        public void onDownloadFinish(final String str, final String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            String str3 = "succes to load resource[%s]; the local file is [%s]" + str + "filepath is " + str2;
            dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                    } else {
                        try {
                            C0350a.b(a.a(a.this)).a(str, str2);
                        } catch (Throwable th) {
                            Log.e("DownloadTask", "failed to invoke onResourceLoaded method..." + th);
                        }
                    }
                }
            });
        }

        @Override // tb.kml
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
                return;
            }
            Log.e("DownloadTask", "onDownloadStateChange:%s,%s" + str + " b " + z);
        }

        @Override // tb.kml
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            String str = "all download tasks are finished[s]" + z;
            dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                    } else {
                        try {
                            C0350a.b(a.a(a.this)).a();
                        } catch (Throwable th) {
                            Log.e("DownloadTask", "failed to invoke onResourceLoadAllFinish method..." + th);
                        }
                    }
                }
            });
        }

        @Override // tb.kml
        public void onNetworkLimit(final int i, kmq kmqVar, kml.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6919023a", new Object[]{this, new Integer(i), kmqVar, aVar});
                return;
            }
            Log.e("DownloadTask", "onNetworkLimit...");
            dqd.a().a(new Runnable() { // from class: com.taobao.android.artry.resource.a.c.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (a.a(a.this) == null || C0350a.b(a.a(a.this)) == null) {
                    } else {
                        try {
                            b b = C0350a.b(a.a(a.this));
                            b.b("NetworkLimit,CODE:" + i);
                        } catch (Throwable th) {
                            Log.e("DownloadTask", "failed to invoke onError method..." + th);
                        }
                    }
                }
            });
        }
    }
}
