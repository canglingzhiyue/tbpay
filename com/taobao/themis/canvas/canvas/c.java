package com.taobao.themis.canvas.canvas;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.open.extension.e;
import com.taobao.themis.open.utils.ApPathType;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import tb.ado;
import tb.kge;
import tb.teh;
import tb.toh;

/* loaded from: classes9.dex */
public class c implements ExternalAdapterImageProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile c d;
    private String b;
    private ReadWriteLock c = new ReentrantReadWriteLock();

    /* renamed from: a  reason: collision with root package name */
    private final Handler f22324a = new Handler(Looper.getMainLooper());

    static {
        kge.a(-1564338480);
        kge.a(1437438907);
    }

    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public ExternalAdapterImageProvider.b f22329a;
        public boolean b;

        static {
            kge.a(-2048362407);
        }

        private d() {
        }
    }

    private c() {
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("fcd0a04c", new Object[0]);
        }
        if (d == null) {
            synchronized (c.class) {
                if (d == null) {
                    d = new c();
                }
            }
        }
        return d;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.c.writeLock().lock();
        try {
            this.b = str;
        } catch (Exception e) {
            TMSLogger.d("TMSCanvasImageProvider", e.getMessage());
        } finally {
            this.c.writeLock().unlock();
        }
    }

    private String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        this.c.readLock().lock();
        try {
            return this.b;
        } catch (Exception e) {
            TMSLogger.d("TMSCanvasImageProvider", e.getMessage());
            return null;
        } finally {
            this.c.readLock().unlock();
        }
    }

    @Override // com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider
    public ExternalAdapterImageProvider.b request(String str, int i, int i2, Map<String, String> map, Map<String, String> map2, ExternalAdapterImageProvider.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExternalAdapterImageProvider.b) ipChange.ipc$dispatch("b3b4f2bf", new Object[]{this, str, new Integer(i), new Integer(i2), map, map2, cVar});
        }
        if (StringUtils.isEmpty(str)) {
            TMSLogger.d("TMSCanvasImageProvider", "fetch image failed because of empty url");
            return null;
        }
        final f a2 = teh.a(b());
        if (a2 == null || a2.o() == null) {
            cVar.a(null);
            return new d().f22329a;
        }
        com.taobao.themis.canvas.canvas.b.a(str, i, i2, map2);
        ApPathType a3 = toh.a(str, a2);
        if (a3 == ApPathType.AP_PATH_TYPE_USR || a3 == ApPathType.AP_PATH_TYPE_TEMP) {
            d a4 = a(a2, a3, str, cVar);
            if (a4.b) {
                return a4.f22329a;
            }
        }
        if (a3 == ApPathType.AP_PATH_TYPE_PKG) {
            d a5 = a(a2, str, cVar);
            if (a5.b) {
                return a5.f22329a;
            }
        }
        if (str.startsWith(ado.URL_SEPARATOR)) {
            str = com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
        }
        final PhenixCreator releasableDrawable = com.taobao.phenix.intf.b.h().a(str).releasableDrawable(false);
        if (map2 != null) {
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                releasableDrawable.addLoaderExtra(entry.getKey(), entry.getValue());
            }
        }
        final a aVar = new a(str, cVar);
        releasableDrawable.succListener(new C0924c(aVar, a2));
        releasableDrawable.failListener(new b(aVar, a2));
        this.f22324a.post(new Runnable() { // from class: com.taobao.themis.canvas.canvas.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (a2.o() == null) {
                    aVar.a((ExternalAdapterImageProvider.Image) null);
                } else {
                    aVar.a(releasableDrawable.fetch());
                }
            }
        });
        return aVar;
    }

    private d a(f fVar, ApPathType apPathType, String str, ExternalAdapterImageProvider.c cVar) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("2a691788", new Object[]{this, fVar, apPathType, str, cVar});
        }
        FileInputStream fileInputStream2 = null;
        d dVar = new d();
        if (cVar != null && fVar != null && fVar.o() != null) {
            String a2 = toh.a(o.e(fVar), str, apPathType);
            if (StringUtils.isEmpty(a2)) {
                cVar.a(null);
                return dVar;
            }
            File file = new File(a2);
            if (file.exists() && !file.isDirectory()) {
                try {
                    if (file.canRead()) {
                        try {
                            fileInputStream = new FileInputStream(file);
                            try {
                                byte[] a3 = com.taobao.themis.utils.io.f.a((InputStream) fileInputStream);
                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(a3, 0, a3.length);
                                if (decodeByteArray != null) {
                                    cVar.a(new ExternalAdapterImageProvider.Image(decodeByteArray));
                                    dVar.b = true;
                                } else {
                                    cVar.a(null);
                                }
                                com.taobao.themis.utils.io.f.a((Closeable) fileInputStream);
                            } catch (Exception e) {
                                e = e;
                                fileInputStream2 = fileInputStream;
                                TMSLogger.d("TMSCanvasImageProvider", e.getMessage());
                                com.taobao.themis.utils.io.f.a((Closeable) fileInputStream2);
                                return dVar;
                            } catch (Throwable th) {
                                th = th;
                                com.taobao.themis.utils.io.f.a((Closeable) fileInputStream);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        return dVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                }
            }
            cVar.a(null);
        }
        return dVar;
    }

    private d a(f fVar, String str, ExternalAdapterImageProvider.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("4b9bd7d4", new Object[]{this, fVar, str, cVar});
        }
        d dVar = new d();
        if (StringUtils.isEmpty(str) || fVar == null) {
            cVar.a(null);
            dVar.b = false;
            return dVar;
        }
        e eVar = (e) fVar.b(e.class);
        if (eVar == null) {
            cVar.a(null);
            dVar.b = false;
            return dVar;
        }
        com.taobao.themis.open.resource.c a2 = eVar.a(str);
        if (a2 == null || a2.a() == null) {
            a2 = eVar.b(str);
        }
        if (a2 != null) {
            byte[] a3 = a2.a();
            cVar.a(new ExternalAdapterImageProvider.Image(BitmapFactory.decodeByteArray(a3, 0, a3.length)));
            dVar.b = true;
        } else {
            TMSLogger.d("TMSCanvasImageProvider", "fetch image url failed: " + str);
            com.taobao.themis.canvas.canvas.a.a("1005", "load image failed:" + str, null);
            cVar.a(null);
            dVar.b = false;
        }
        return dVar;
    }

    /* renamed from: com.taobao.themis.canvas.canvas.c$c  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static class C0924c implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<a> f22328a;
        private final WeakReference<f> b;

        static {
            kge.a(2091130473);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public C0924c(a aVar, f fVar) {
            this.f22328a = new WeakReference<>(aVar);
            this.b = new WeakReference<>(fVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0078 A[Catch: Throwable -> 0x0073, TryCatch #0 {Throwable -> 0x0073, blocks: (B:33:0x006e, B:38:0x0078, B:40:0x007e), top: B:44:0x006e }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean a(com.taobao.phenix.intf.event.SuccPhenixEvent r10) {
            /*
                r9 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.canvas.canvas.c.C0924c.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L1c
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r1[r4] = r9
                r1[r2] = r10
                java.lang.String r10 = "3b4dd374"
                java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                return r10
            L1c:
                java.lang.ref.WeakReference<com.taobao.themis.kernel.f> r0 = r9.b
                java.lang.Object r0 = r0.get()
                com.taobao.themis.kernel.f r0 = (com.taobao.themis.kernel.f) r0
                if (r0 == 0) goto La4
                android.app.Activity r0 = r0.o()
                if (r0 != 0) goto L2e
                goto La4
            L2e:
                java.lang.ref.WeakReference<com.taobao.themis.canvas.canvas.c$a> r0 = r9.f22328a
                java.lang.Object r0 = r0.get()
                com.taobao.themis.canvas.canvas.c$a r0 = (com.taobao.themis.canvas.canvas.c.a) r0
                if (r0 == 0) goto La4
                r1 = 0
                if (r10 != 0) goto L3f
                r0.a(r1)
                return r4
            L3f:
                boolean r5 = r10.isIntermediate()
                if (r5 == 0) goto L46
                return r4
            L46:
                android.graphics.drawable.BitmapDrawable r10 = r10.getDrawable()
                if (r10 == 0) goto L62
                boolean r5 = r10 instanceof com.taobao.phenix.cache.memory.f
                if (r5 == 0) goto L56
                r5 = r10
                com.taobao.phenix.cache.memory.f r5 = (com.taobao.phenix.cache.memory.f) r5
                r5.a()
            L56:
                android.graphics.Bitmap r10 = r10.getBitmap()
                if (r10 == 0) goto L62
                com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider$Image r5 = new com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider$Image
                r5.<init>(r10)
                goto L63
            L62:
                r5 = r1
            L63:
                if (r5 == 0) goto L69
                android.graphics.Bitmap r1 = r5.getBitmap()
            L69:
                r0.a(r5)
                if (r1 == 0) goto L75
                int r10 = r1.getWidth()     // Catch: java.lang.Throwable -> L73
                goto L76
            L73:
                r10 = move-exception
                goto La1
            L75:
                r10 = 0
            L76:
                if (r1 == 0) goto L7d
                int r1 = r1.getHeight()     // Catch: java.lang.Throwable -> L73
                goto L7e
            L7d:
                r1 = 0
            L7e:
                java.lang.String r5 = "TMSCanvasImageProvider"
                java.util.Locale r6 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L73
                java.lang.String r7 = "[AliCDN] Request finish. %d * %d, %s\n"
                r8 = 3
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> L73
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L73
                r8[r4] = r10     // Catch: java.lang.Throwable -> L73
                java.lang.Integer r10 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L73
                r8[r2] = r10     // Catch: java.lang.Throwable -> L73
                java.lang.String r10 = r0.b()     // Catch: java.lang.Throwable -> L73
                r8[r3] = r10     // Catch: java.lang.Throwable -> L73
                java.lang.String r10 = java.lang.String.format(r6, r7, r8)     // Catch: java.lang.Throwable -> L73
                com.taobao.themis.kernel.basic.TMSLogger.b(r5, r10)     // Catch: java.lang.Throwable -> L73
                goto La4
            La1:
                r10.printStackTrace()
            La4:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.canvas.canvas.c.C0924c.a(com.taobao.phenix.intf.event.SuccPhenixEvent):boolean");
        }
    }

    /* loaded from: classes9.dex */
    public static class b implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<a> f22327a;
        private final WeakReference<f> b;

        static {
            kge.a(1726041925);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public b(a aVar, f fVar) {
            this.f22327a = new WeakReference<>(aVar);
            this.b = new WeakReference<>(fVar);
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            f fVar = this.b.get();
            if (fVar != null && fVar.o() != null && (aVar = this.f22327a.get()) != null) {
                TMSLogger.d("TMSCanvasImageProvider", "[AliCDN] Request finish failed: " + aVar.b());
                aVar.a((ExternalAdapterImageProvider.Image) null);
            }
            return false;
        }
    }

    /* loaded from: classes9.dex */
    public static class a implements ExternalAdapterImageProvider.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f22326a = false;
        private WeakReference<com.taobao.phenix.intf.c> b;
        private final ExternalAdapterImageProvider.c c;
        private final String d;

        static {
            kge.a(-185411945);
            kge.a(848921222);
        }

        public a(String str, ExternalAdapterImageProvider.c cVar) {
            this.d = str;
            this.c = cVar;
        }

        public void a(com.taobao.phenix.intf.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5e4ca40", new Object[]{this, cVar});
            } else if (this.f22326a) {
            } else {
                this.b = new WeakReference<>(cVar);
            }
        }

        @Override // com.taobao.android.fcanvas.integration.image.ExternalAdapterImageProvider.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f22326a = true;
            WeakReference<com.taobao.phenix.intf.c> weakReference = this.b;
            if (weakReference == null) {
                return;
            }
            com.taobao.phenix.intf.c cVar = weakReference.get();
            if (cVar != null) {
                cVar.b();
            }
            this.b = null;
        }

        public void a(ExternalAdapterImageProvider.Image image) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c0bb607", new Object[]{this, image});
            } else {
                this.c.a(image);
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.d;
        }
    }
}
