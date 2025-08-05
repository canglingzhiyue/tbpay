package com.taobao.video_remoteso.inner;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.video_remoteso.api.FetchCallback;
import com.taobao.video_remoteso.api.FetchResult;
import com.taobao.video_remoteso.api.LoadCallback;
import com.taobao.video_remoteso.api.LoadResult;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.bgy;
import tb.ihq;
import tb.ihu;
import tb.ihw;
import tb.kge;

/* loaded from: classes9.dex */
public class VideoRemoteSoHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile VideoRemoteSoHelper c;
    private Handler f;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, LinkedList<FetchCallback>> f23456a = new ConcurrentHashMap();
    public Map<String, LinkedList<LoadCallback>> b = new ConcurrentHashMap();
    private Set<String> e = Collections.synchronizedSet(new HashSet());
    private Map<String, b> g = new ConcurrentHashMap();
    public ExecutorService d = Executors.newSingleThreadExecutor();
    private volatile AtomicBoolean h = new AtomicBoolean(false);

    static {
        kge.a(-1815037348);
    }

    private static native boolean loadFFmpegDecoder(String str);

    public static /* synthetic */ void a(VideoRemoteSoHelper videoRemoteSoHelper, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b81925", new Object[]{videoRemoteSoHelper, str, str2, str3, str4});
        } else {
            videoRemoteSoHelper.a(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void a(VideoRemoteSoHelper videoRemoteSoHelper, ihw ihwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b76f935", new Object[]{videoRemoteSoHelper, ihwVar});
        } else {
            videoRemoteSoHelper.a(ihwVar);
        }
    }

    public static /* synthetic */ VideoRemoteSoHelper b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VideoRemoteSoHelper) ipChange.ipc$dispatch("11b633be", new Object[0]) : c;
    }

    public static /* synthetic */ void b(VideoRemoteSoHelper videoRemoteSoHelper, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d72944", new Object[]{videoRemoteSoHelper, str, str2, str3, str4});
        } else {
            videoRemoteSoHelper.b(str, str2, str3, str4);
        }
    }

    /* loaded from: classes9.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f23462a;
        public String b;
        public boolean c;
        public String d;
        public String e;

        static {
            kge.a(-1976162705);
        }

        private b() {
            this.f23462a = "";
            this.b = "";
            this.c = false;
            this.d = "";
            this.e = "";
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (!this.h.get()) {
            try {
                System.loadLibrary("avcodec_jni");
                this.h.set(true);
            } catch (Throwable th) {
                a("AVSDK-remote", "loadLibrariesOnce loadLibrary fail ---" + th.getMessage() + " " + th.getStackTrace());
                return false;
            }
        }
        return true;
    }

    public static synchronized VideoRemoteSoHelper a() {
        synchronized (VideoRemoteSoHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoRemoteSoHelper) ipChange.ipc$dispatch("ec222abd", new Object[0]);
            }
            if (c == null && c == null) {
                VideoRemoteSoHelper videoRemoteSoHelper = new VideoRemoteSoHelper();
                c = videoRemoteSoHelper;
                videoRemoteSoHelper.d();
            }
            return c;
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        a("AVSDK-remote", this + " fetchSo init");
        e();
        f();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.e.add("artc_engine");
        this.e.add("avcodec");
        this.e.add("s266dec");
        this.e.add("VPM");
        for (String str : this.e) {
            this.f23456a.put(str, new LinkedList<>());
            this.b.put(str, new LinkedList<>());
            b bVar = new b();
            bVar.f23462a = str;
            bVar.b = "lib" + str + bgy.SO_EXTENSION;
            this.g.put(str, bVar);
        }
        this.f = new Handler(Looper.getMainLooper());
    }

    private static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        AdapterForTLog.loge("AVSDK-remote", str2);
        Log.e("AVSDK-remote", str2);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ihq.b().a("avcodec", new ihu() { // from class: com.taobao.video_remoteso.inner.VideoRemoteSoHelper.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihu
            public void onFetchFinished(ihw ihwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                } else {
                    VideoRemoteSoHelper.a(VideoRemoteSoHelper.b(), ihwVar);
                }
            }
        });
        ihq.b().a("artc_engine", new ihu() { // from class: com.taobao.video_remoteso.inner.VideoRemoteSoHelper.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihu
            public void onFetchFinished(ihw ihwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                } else {
                    VideoRemoteSoHelper.a(VideoRemoteSoHelper.b(), ihwVar);
                }
            }
        });
        ihq.b().a("s266dec", new ihu() { // from class: com.taobao.video_remoteso.inner.VideoRemoteSoHelper.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihu
            public void onFetchFinished(ihw ihwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                } else {
                    VideoRemoteSoHelper.a(VideoRemoteSoHelper.b(), ihwVar);
                }
            }
        });
        ihq.b().a("VPM", new ihu() { // from class: com.taobao.video_remoteso.inner.VideoRemoteSoHelper.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ihu
            public void onFetchFinished(ihw ihwVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e2928fec", new Object[]{this, ihwVar});
                } else {
                    VideoRemoteSoHelper.a(VideoRemoteSoHelper.b(), ihwVar);
                }
            }
        });
    }

    private synchronized void a(ihw ihwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb26ca0", new Object[]{this, ihwVar});
            return;
        }
        a("AVSDK-remote", this + " fetchSo onFetchFinished " + ihwVar);
        if (ihwVar.g() && this.g.containsKey(ihwVar.a())) {
            String a2 = ihwVar.a();
            String b2 = ihwVar.b();
            b bVar = this.g.get(a2);
            bVar.c = false;
            bVar.e = ihwVar.d();
            bVar.d = ihwVar.c();
            bVar.b = b2;
            this.g.put(a2, bVar);
            a(bVar);
        }
    }

    /* loaded from: classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f23461a;
        public String b;
        public String c;
        public String d;

        static {
            kge.a(-2115532822);
            kge.a(-1390502639);
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            }
        }

        public a(String str, String str2, String str3, String str4) {
            this.f23461a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    /* loaded from: classes9.dex */
    public class d extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(963501991);
        }

        public d(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        @Override // com.taobao.video_remoteso.inner.VideoRemoteSoHelper.a, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VideoRemoteSoHelper.a(VideoRemoteSoHelper.this, this.f23461a, this.b, this.c, this.d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0112 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[Catch: all -> 0x01f5, TRY_ENTER, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x0020, B:39:0x0114, B:41:0x012d, B:43:0x0133, B:44:0x013c, B:46:0x0142, B:47:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0166, B:55:0x017b, B:58:0x0192, B:60:0x019e, B:63:0x01bf, B:65:0x01d1, B:67:0x01d7, B:68:0x01db, B:70:0x01e1, B:71:0x01eb, B:14:0x0083, B:26:0x00d0, B:29:0x00db, B:10:0x0054, B:31:0x00e3, B:16:0x008b, B:18:0x0091, B:21:0x0098, B:22:0x00a0), top: B:77:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized void a(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.video_remoteso.inner.VideoRemoteSoHelper.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7d33f3f", new Object[]{this, bVar});
            return;
        }
        String str = bVar.f23462a;
        String str2 = bVar.b;
        String str3 = bVar.d;
        String str4 = bVar.e;
        if (!"artc_engine".equals(str) || (ABGlobal.isFeatureOpened(null, "openssl_pre_init") && a(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRunInThreadRemote2", "false")))) {
            z = false;
        }
        if (a(OrangeConfig.getInstance().getConfig("DWInteractive", "EnableRunInThreadRemote2", "true")) && !z) {
            a("AVSDK-remote", "EnableRunInThreadRemote2 is true ");
            b(new d(str, str2, str3, str4));
            return;
        }
        a(new d(str, str2, str3, str4));
        a(new c(str, str2, str3, str4));
    }

    /* loaded from: classes9.dex */
    public class c extends a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1088176867);
        }

        public c(String str, String str2, String str3, String str4) {
            super(str, str2, str3, str4);
        }

        @Override // com.taobao.video_remoteso.inner.VideoRemoteSoHelper.a, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                VideoRemoteSoHelper.b(VideoRemoteSoHelper.this, this.f23461a, this.b, this.c, this.d);
            }
        }
    }

    private synchronized void b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb13311", new Object[]{this, str, str2, str3, str4});
        } else if (!this.g.get(str).c) {
            a("AVSDK-remote", "runFetchCallback fail " + str + ", " + str2);
        } else {
            FetchResult fetchResult = new FetchResult(str, str2);
            fetchResult.setVersion(str3, str4);
            LinkedList<FetchCallback> linkedList = this.f23456a.get(str);
            if (linkedList != null && linkedList.size() > 0) {
                Iterator<FetchCallback> it = linkedList.iterator();
                while (it.hasNext()) {
                    it.next().onFetchFinished(fetchResult);
                }
                linkedList.clear();
                this.f23456a.put(str, linkedList);
            }
        }
    }

    private void b(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{this, runnable});
        } else {
            this.d.execute(runnable);
        }
    }

    private void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else if (g()) {
            runnable.run();
        } else {
            this.f.post(runnable);
        }
    }

    public synchronized void a(String str, LoadCallback loadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14a966b", new Object[]{this, str, loadCallback});
            return;
        }
        boolean contains = this.e.contains(str);
        a("AVSDK-remote", "loadAsync " + contains + ", " + str + ", " + loadCallback);
        if (contains) {
            if (this.g.get(str).c) {
                loadCallback.onLoadFinished(new LoadResult(str));
                return;
            }
            LinkedList<LoadCallback> linkedList = this.b.get(str);
            linkedList.add(loadCallback);
            this.b.put(str, linkedList);
        }
    }

    public synchronized void a(String str, FetchCallback fetchCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba3843b", new Object[]{this, str, fetchCallback});
            return;
        }
        boolean contains = this.e.contains(str);
        a("AVSDK-remote", "fetchAsync " + contains + ", " + str + ", " + fetchCallback);
        if (contains) {
            b bVar = this.g.get(str);
            if (bVar.c) {
                fetchCallback.onFetchFinished(new FetchResult(str, bVar.b));
                return;
            }
            LinkedList<FetchCallback> linkedList = this.f23456a.get(str);
            linkedList.add(fetchCallback);
            this.f23456a.put(str, linkedList);
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }
}
