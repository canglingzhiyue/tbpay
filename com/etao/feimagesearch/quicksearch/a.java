package com.etao.feimagesearch.quicksearch;

import android.app.Activity;
import android.graphics.Bitmap;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import mtopsdk.common.util.StringUtils;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.pipline.d;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.g;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.q;
import tb.cou;
import tb.cox;
import tb.kge;

/* loaded from: classes3.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ImageReader f6956a;
    private VirtualDisplay b;
    private ThreadPoolExecutor c = new ThreadPoolExecutor(1, 1, 3000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), ThreadFactoryC0246a.INSTANCE);
    private int d;
    private boolean f;

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ Ref.ObjectRef c;
        public final /* synthetic */ Ref.ObjectRef d;
        public final /* synthetic */ Activity e;
        public final /* synthetic */ Ref.ObjectRef f;

        public b(Bitmap bitmap, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Activity activity) {
            this.b = bitmap;
            this.c = objectRef;
            this.d = objectRef2;
            this.f = objectRef3;
            this.e = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.c(a.this)) {
                this.b.recycle();
            } else {
                com.etao.feimagesearch.newresult.perf.a.H();
                a.a(a.this, true);
                com.etao.feimagesearch.model.b bVar = new com.etao.feimagesearch.model.b();
                bVar.setPssource((String) this.c.element);
                bVar.getExtraParams().putAll((Map) this.d.element);
                bVar.updateSessionId();
                d.a(this.b, bVar, (PhotoFrom.Values) this.f.element);
                IrpParamModel irpParamModel = new IrpParamModel(bVar);
                irpParamModel.setPhotoFrom((PhotoFrom.Values) this.f.element);
                cou.a(this.e.getApplicationContext(), irpParamModel);
                cox.a("widgetToIrp", new String[0]);
                this.e.finish();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Map e;

        public c(boolean z, Activity activity, boolean z2, Map map) {
            this.b = z;
            this.c = activity;
            this.d = z2;
            this.e = map;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public final void onImageAvailable(ImageReader imageReader) {
            Image.Plane plane;
            Image.Plane plane2;
            Image.Plane plane3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
                return;
            }
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage == null) {
                return;
            }
            int dW = this.b ? 2 : com.etao.feimagesearch.config.b.dW();
            a aVar = a.this;
            int a2 = a.a(aVar);
            a.a(aVar, a2 + 1);
            if (a2 < dW) {
                acquireLatestImage.close();
                return;
            }
            Image.Plane[] planes = acquireLatestImage.getPlanes();
            ByteBuffer buffer = (planes == null || (plane3 = (Image.Plane) g.b(planes)) == null) ? null : plane3.getBuffer();
            if (buffer != null && buffer.getInt(buffer.capacity() / 2) == 0) {
                acquireLatestImage.close();
                return;
            }
            Image.Plane[] planes2 = acquireLatestImage.getPlanes();
            int rowStride = (planes2 == null || (plane2 = (Image.Plane) g.b(planes2)) == null) ? 0 : plane2.getRowStride();
            Image.Plane[] planes3 = acquireLatestImage.getPlanes();
            int pixelStride = (planes3 == null || (plane = (Image.Plane) g.b(planes3)) == null) ? 0 : plane.getPixelStride();
            if (pixelStride == 0) {
                acquireLatestImage.close();
                return;
            }
            int width = acquireLatestImage.getWidth();
            int height = acquireLatestImage.getHeight();
            if (buffer != null) {
                Bitmap createBitmap = Bitmap.createBitmap(((rowStride - (pixelStride * width)) / pixelStride) + width, height, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(buffer);
                Bitmap bitmap = Bitmap.createBitmap(createBitmap, 0, 0, width, height);
                a aVar2 = a.this;
                q.a((Object) bitmap, "bitmap");
                a.a(aVar2, bitmap, this.c, this.d, this.e);
                acquireLatestImage.close();
            }
            imageReader.setOnImageAvailableListener(null, null);
        }
    }

    static {
        kge.a(-1169504813);
    }

    public a() {
        this.c.allowCoreThreadTimeOut(true);
    }

    public static final /* synthetic */ int a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b090cf72", new Object[]{aVar})).intValue() : aVar.d;
    }

    public static final /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61899364", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.d = i;
        }
    }

    public static final /* synthetic */ void a(a aVar, Bitmap bitmap, Activity activity, boolean z, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841b7dd2", new Object[]{aVar, bitmap, activity, new Boolean(z), map});
        } else {
            aVar.a(bitmap, activity, z, map);
        }
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6189d335", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.f = z;
        }
    }

    public static final /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b13ad05", new Object[]{aVar})).booleanValue() : aVar.f;
    }

    /* renamed from: com.etao.feimagesearch.quicksearch.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class ThreadFactoryC0246a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final ThreadFactoryC0246a INSTANCE = new ThreadFactoryC0246a();

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "ScreenRecorder");
        }
    }

    public final void a(Activity context, MediaProjection mediaProjection, int i, int i2, int i3, boolean z, boolean z2, Map<String, String> pageParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae2d98d", new Object[]{this, context, mediaProjection, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Boolean(z2), pageParams});
            return;
        }
        q.c(context, "context");
        q.c(pageParams, "pageParams");
        this.d = 0;
        this.f6956a = ImageReader.newInstance(i, i2, 1, 3);
        ImageReader imageReader = this.f6956a;
        Surface surface = null;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(new c(z, context, z2, pageParams), null);
        }
        if (mediaProjection == null) {
            return;
        }
        ImageReader imageReader2 = this.f6956a;
        if (imageReader2 != null) {
            surface = imageReader2.getSurface();
        }
        this.b = mediaProjection.createVirtualDisplay("plt-screen", i, i2, i3, 16, surface, null, null);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        ImageReader imageReader = this.f6956a;
        if (imageReader != null) {
            imageReader.close();
        }
        VirtualDisplay virtualDisplay = this.b;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        ImageReader imageReader2 = this.f6956a;
        if (imageReader2 == null) {
            return;
        }
        imageReader2.setOnImageAvailableListener(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.etao.feimagesearch.model.PhotoFrom$Values, T] */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v7, types: [com.etao.feimagesearch.model.PhotoFrom$Values, T] */
    private final void a(Bitmap bitmap, Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2488e7c9", new Object[]{this, bitmap, activity, new Boolean(z), map});
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = map;
        if (((Map) objectRef.element) == null) {
            objectRef.element = new LinkedHashMap();
        }
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = PhotoFrom.Values.WIDGET;
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = map != 0 ? map.get("pssource") : 0;
        if (StringUtils.isEmpty((String) objectRef3.element)) {
            objectRef3.element = "screen_widget";
            ((Map) objectRef.element).put("pssource", (String) objectRef3.element);
        } else {
            objectRef2.element = PhotoFrom.Values.FLOAT_BAR;
        }
        ((Map) objectRef.element).put(com.etao.feimagesearch.quicksearch.b.FOREGROUND_KEY, String.valueOf(z));
        ((Map) objectRef.element).put(com.etao.feimagesearch.model.d.KEY_FROM_OUTER_APP, String.valueOf(z));
        activity.runOnUiThread(new b(bitmap, objectRef3, objectRef, objectRef2, activity));
    }
}
