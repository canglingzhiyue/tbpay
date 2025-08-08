package com.taobao.android.weex_ability;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.android.weex_framework.l;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import io.unicorn.plugin.image.ExternalAdapterImageBridge;
import io.unicorn.plugin.image.ExternalAdapterImageProvider;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import tb.kge;

/* loaded from: classes6.dex */
public class k implements ExternalAdapterImageProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_DISK = 2;
    public static final int TYPE_MEMORY = 1;
    private static final Handler c;
    private static final ExecutorService e;
    private final double d = Resources.getSystem().getDisplayMetrics().density;

    public static /* synthetic */ Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[0]) : c;
    }

    public static /* synthetic */ String a(k kVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("742aea59", new Object[]{kVar, map}) : kVar.a(map);
    }

    static {
        kge.a(1560445421);
        kge.a(16992536);
        c = new Handler(Looper.getMainLooper());
        e = new ExecutorService() { // from class: com.taobao.android.weex_ability.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.concurrent.ExecutorService
            public void shutdown() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
                } else {
                    com.taobao.android.weex.util.c.a(false);
                }
            }

            @Override // java.util.concurrent.ExecutorService
            public List<Runnable> shutdownNow() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (List) ipChange.ipc$dispatch("eb98c640", new Object[]{this});
                }
                com.taobao.android.weex.util.c.a(false);
                return null;
            }

            @Override // java.util.concurrent.ExecutorService
            public boolean isShutdown() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("ede5622b", new Object[]{this})).booleanValue();
                }
                com.taobao.android.weex.util.c.a(false);
                return false;
            }

            @Override // java.util.concurrent.ExecutorService
            public boolean isTerminated() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("d97450f8", new Object[]{this})).booleanValue();
                }
                com.taobao.android.weex.util.c.a(false);
                return false;
            }

            @Override // java.util.concurrent.ExecutorService
            public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("db874a4d", new Object[]{this, new Long(j), timeUnit})).booleanValue();
                }
                com.taobao.android.weex.util.c.a(false);
                return false;
            }

            @Override // java.util.concurrent.ExecutorService
            public <T> Future<T> submit(Callable<T> callable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Future) ipChange.ipc$dispatch("b2277828", new Object[]{this, callable});
                }
                com.taobao.android.weex.util.c.a(false);
                return null;
            }

            @Override // java.util.concurrent.ExecutorService
            public <T> Future<T> submit(Runnable runnable, T t) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Future) ipChange.ipc$dispatch("f26f004f", new Object[]{this, runnable, t});
                }
                com.taobao.android.weex.util.c.a(false);
                return null;
            }

            @Override // java.util.concurrent.ExecutorService
            public Future<?> submit(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Future) ipChange.ipc$dispatch("b4a21fb3", new Object[]{this, runnable});
                }
                FutureTask futureTask = new FutureTask(runnable, null);
                futureTask.run();
                return futureTask;
            }

            @Override // java.util.concurrent.ExecutorService
            public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (List) ipChange.ipc$dispatch("d0aab466", new Object[]{this, collection});
                }
                com.taobao.android.weex.util.c.a(false);
                return null;
            }

            @Override // java.util.concurrent.ExecutorService
            public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (List) ipChange.ipc$dispatch("e74164f2", new Object[]{this, collection, new Long(j), timeUnit});
                }
                com.taobao.android.weex.util.c.a(false);
                return null;
            }

            @Override // java.util.concurrent.ExecutorService
            public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (T) ipChange.ipc$dispatch("8c2ecc66", new Object[]{this, collection});
                }
                com.taobao.android.weex.util.c.a(false);
                return null;
            }

            @Override // java.util.concurrent.ExecutorService
            public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (T) ipChange.ipc$dispatch("9962f5f2", new Object[]{this, collection, new Long(j), timeUnit});
                }
                com.taobao.android.weex.util.c.a(false);
                return null;
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
                } else {
                    runnable.run();
                }
            }
        };
    }

    /* loaded from: classes6.dex */
    public static class a implements Drawable.Callback, com.taobao.phenix.animate.c, ExternalAdapterImageProvider.AnimatedBitmap {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final com.taobao.phenix.animate.b f15930a;
        private final Bitmap b;
        private b c;
        private Canvas d;
        private boolean e;
        private boolean i;
        private boolean f = false;
        private boolean g = false;
        private boolean h = false;
        private int j = 0;

        static {
            kge.a(1198378712);
            kge.a(394076638);
            kge.a(-1139115842);
            kge.a(1763469397);
        }

        public a(com.taobao.phenix.animate.b bVar) {
            boolean z = false;
            this.i = true;
            this.f15930a = bVar;
            int intrinsicWidth = bVar.getIntrinsicWidth();
            int intrinsicHeight = bVar.getIntrinsicHeight();
            this.b = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            this.d = new Canvas();
            this.d.setBitmap(this.b);
            bVar.setBounds(new Rect(0, 0, intrinsicWidth, intrinsicHeight));
            bVar.setCallback(this);
            bVar.a(this);
            this.e = true;
            String b = com.taobao.android.weex_framework.util.f.b("weex_image_loop_enable");
            this.i = (b == null || "true".equals(b)) ? true : z;
        }

        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b34d2ba0", new Object[]{this, bVar});
            } else {
                this.c = bVar;
            }
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                this.j = i;
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
                return;
            }
            this.b.eraseColor(0);
            drawable.draw(this.d);
            if (this.e) {
                this.e = false;
                return;
            }
            ExternalAdapterImageProvider.Image image = new ExternalAdapterImageProvider.Image(this.b, this.f);
            image.setCacheType(this.j);
            b bVar = this.c;
            if (bVar == null) {
                return;
            }
            bVar.a(image);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
            } else {
                k.a().postAtTime(runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
            } else {
                k.a().removeCallbacks(runnable);
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public Bitmap getBufferBitmap() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("df73b8ea", new Object[]{this}) : this.b;
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public double getDuration() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed837a7f", new Object[]{this})).doubleValue() : this.f15930a.j() / 1000.0f;
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public int getFrameCount() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9bea4412", new Object[]{this})).intValue() : this.f15930a.i();
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void start() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                this.f15930a.b();
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else {
                this.f15930a.f();
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void pause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            } else if (!this.i) {
                this.f15930a.f();
            } else if (!this.h || this.g) {
            } else {
                this.g = true;
                this.f15930a.a(false);
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.AnimatedBitmap
        public void resume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            } else if (!this.i) {
                this.f15930a.b();
            } else if (!this.h || !this.g) {
            } else {
                this.g = false;
                this.f15930a.b();
            }
        }

        @Override // com.taobao.phenix.animate.c
        public boolean onLoopCompleted(int i, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7565d93", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i2 == 0) {
                z = true;
            }
            this.h = z;
            if (i2 == 0) {
                this.f15930a.a((com.taobao.phenix.animate.c) null);
                return true;
            }
            if (i2 > 0 && i >= i2) {
                this.f = true;
            }
            return true;
        }
    }

    /* loaded from: classes6.dex */
    public class d implements com.taobao.phenix.intf.event.a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WeakReference<b> b;

        static {
            kge.a(-708805140);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
        }

        public d(b bVar) {
            this.b = new WeakReference<>(bVar);
        }

        public boolean a(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            b bVar = this.b.get();
            if (bVar != null) {
                ExternalAdapterImageProvider.Image image = null;
                if (succPhenixEvent == null) {
                    bVar.a((ExternalAdapterImageProvider.Image) null);
                    return false;
                } else if (succPhenixEvent.isIntermediate()) {
                    return false;
                } else {
                    BitmapDrawable drawable = succPhenixEvent.getDrawable();
                    if (drawable != null) {
                        if (drawable instanceof com.taobao.phenix.animate.b) {
                            a aVar = new a((com.taobao.phenix.animate.b) drawable);
                            aVar.a(bVar);
                            if (succPhenixEvent.isImmediate()) {
                                aVar.a(1);
                            } else if (succPhenixEvent.isFromDisk()) {
                                aVar.a(2);
                            }
                            image = new ExternalAdapterImageProvider.Image(aVar);
                        } else {
                            if (drawable instanceof com.taobao.phenix.cache.memory.f) {
                                ((com.taobao.phenix.cache.memory.f) drawable).a();
                            }
                            Bitmap bitmap = drawable.getBitmap();
                            if (bitmap != null) {
                                image = new ExternalAdapterImageProvider.Image(bitmap);
                            }
                        }
                    }
                    if (image != null) {
                        if (succPhenixEvent.isImmediate()) {
                            image.setCacheType(1);
                        } else if (succPhenixEvent.isFromDisk()) {
                            image.setCacheType(2);
                        }
                    }
                    bVar.a(image);
                }
            }
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public class c implements com.taobao.phenix.intf.event.a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WeakReference<b> b;
        private final WeakReference<k> c;

        static {
            kge.a(-1073893688);
            kge.a(-1292221460);
        }

        @Override // com.taobao.phenix.intf.event.a
        public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
        }

        public c(b bVar, k kVar) {
            this.b = new WeakReference<>(bVar);
            this.c = new WeakReference<>(kVar);
        }

        public boolean a(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            b bVar = this.b.get();
            if (bVar != null) {
                String a2 = k.a(k.this, b.a(bVar));
                TLog.loge(a2, "onHappen/Failed", "[AliCDN] Request finish failed." + bVar.a());
                k kVar = this.c.get();
                if (kVar != null && bVar.f()) {
                    if (b.b(bVar)) {
                        kVar.a(bVar.a(), bVar.d(), bVar);
                        return false;
                    }
                    bVar.b();
                    kVar.a(bVar.c(), bVar.d(), bVar);
                } else {
                    a(failPhenixEvent.getResultCode(), bVar.a(), bVar);
                    bVar.a((ExternalAdapterImageProvider.Image) null);
                }
            }
            return false;
        }

        private void a(int i, String str, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("606fbd83", new Object[]{this, new Integer(i), str, bVar});
                return;
            }
            try {
                if (l.a().i() == null || bVar == null) {
                    return;
                }
                String str2 = bVar.e().get("instance_id");
                if (StringUtils.isEmpty(str2)) {
                    return;
                }
                l.a().i().a(10020, WXExceptionConfig.KEY_IMAGE, str, String.valueOf(i), b.c(bVar), b.d(bVar), Integer.parseInt(str2));
                l.a().i().a(10020, WXExceptionConfig.KEY_IMAGE, String.valueOf(i), str, Integer.parseInt(str2));
            } catch (Exception unused) {
                com.taobao.android.weex_framework.util.g.d("image report exception");
            }
        }
    }

    /* loaded from: classes6.dex */
    public class b implements ExternalAdapterImageProvider.Request {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<com.taobao.phenix.intf.c> c;
        private final ExternalAdapterImageProvider.Response d;
        private final String e;
        private String f;
        private Map<String, String> g;
        private Map<String, String> h;
        private boolean i;
        private boolean b = false;
        private boolean j = false;

        static {
            kge.a(1956762714);
            kge.a(-129594653);
        }

        public static /* synthetic */ Map a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("e23a65d5", new Object[]{bVar}) : bVar.g;
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bab260c3", new Object[]{bVar})).booleanValue() : bVar.i;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77211682", new Object[]{bVar}) : bVar.f;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("87d6e343", new Object[]{bVar}) : bVar.e;
        }

        public b(String str, String str2, Map<String, String> map, ExternalAdapterImageProvider.Response response, Map<String, String> map2) {
            this.f = str;
            this.e = str2;
            this.g = map;
            this.d = response;
            this.h = map2;
        }

        public void a(com.taobao.phenix.intf.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5e4ca40", new Object[]{this, cVar});
            } else if (this.b) {
            } else {
                this.c = new WeakReference<>(cVar);
            }
        }

        @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider.Request
        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            this.b = true;
            WeakReference<com.taobao.phenix.intf.c> weakReference = this.c;
            if (weakReference == null) {
                return;
            }
            com.taobao.phenix.intf.c cVar = weakReference.get();
            if (cVar != null) {
                cVar.b();
            }
            this.c = null;
        }

        public void a(ExternalAdapterImageProvider.Image image) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30af6188", new Object[]{this, image});
                return;
            }
            if (!this.j) {
                this.j = true;
            }
            this.d.finish(image);
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.f = this.e;
            }
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
        }

        public Map<String, String> d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.g;
        }

        public Map<String, String> e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d6be2fa1", new Object[]{this}) : this.h;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : !this.e.equals(this.f);
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.i = z;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0109, code lost:
        if (r8.equals("cdn_b40") != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab A[Catch: NumberFormatException -> 0x01ae, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x01ae, blocks: (B:92:0x01a1, B:94:0x01ab), top: B:136:0x01a1 }] */
    @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.unicorn.plugin.image.ExternalAdapterImageProvider.Request request(java.lang.String r18, int r19, int r20, java.util.Map<java.lang.String, java.lang.String> r21, java.util.Map<java.lang.String, java.lang.String> r22, io.unicorn.plugin.image.ExternalAdapterImageProvider.Response r23) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.k.request(java.lang.String, int, int, java.util.Map, java.util.Map, io.unicorn.plugin.image.ExternalAdapterImageProvider$Response):io.unicorn.plugin.image.ExternalAdapterImageProvider$Request");
    }

    @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider
    public void dispatchAsyncThread(final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e007fd1", new Object[]{this, new Long(j)});
        } else {
            com.taobao.phenix.cache.disk.k.a(new Runnable() { // from class: com.taobao.android.weex_ability.k.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ExternalAdapterImageBridge.dispatchAsyncRequest(j);
                    }
                }
            });
        }
    }

    public void a(String str, Map<String, String> map, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("429bd1d5", new Object[]{this, str, map, bVar});
            return;
        }
        String a2 = a(map);
        TLog.loge(a2, "onHappen/retryRequest", "[AliCDN] retryRequest. " + str);
        final PhenixCreator releasableDrawable = com.taobao.phenix.intf.b.h().a(str).releasableDrawable(false);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                releasableDrawable.addLoaderExtra(entry.getKey(), entry.getValue());
            }
        }
        releasableDrawable.succListener(new d(bVar));
        releasableDrawable.failListener(new c(bVar, null));
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.android.weex_ability.k.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    bVar.a(releasableDrawable.fetch());
                }
            }
        });
    }

    @Override // io.unicorn.plugin.image.ExternalAdapterImageProvider
    public void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        TLog.loge("Weex/AlicdnImageProvider/", "AlicdnImageProvider", "[AliCDN] log. %s" + str);
    }

    private String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{this, map});
        }
        return "Weex/AlicdnImageProvider/" + b(map);
    }

    private String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("154c93a4", new Object[]{this, map}) : map != null ? map.get("engine_id") : "unknown";
    }
}
