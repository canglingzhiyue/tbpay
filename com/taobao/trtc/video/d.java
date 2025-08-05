package com.taobao.trtc.video;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.utils.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ImageReader c;
    private Surface d;
    private a.C0631a e;
    private Handler g;
    private b k;
    private boolean h = false;

    /* renamed from: a  reason: collision with root package name */
    public long f23213a = 0;
    private final int i = 1;
    private Lock j = new ReentrantLock();
    private List<byte[]> b = Collections.synchronizedList(new ArrayList());
    private List<a> f = Collections.synchronizedList(new ArrayList());

    /* loaded from: classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f23216a;
        public final int b;
        public final int c;
        public final int d;

        static {
            kge.a(1256782674);
        }

        public a(byte[] bArr, int i, int i2, int i3) {
            this.f23216a = bArr;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    /* loaded from: classes9.dex */
    public interface b {
        void onImageArrive();

        void onRawData(byte[] bArr, int i, int i2, int i3);
    }

    static {
        kge.a(268913325);
    }

    public static /* synthetic */ Lock a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Lock) ipChange.ipc$dispatch("6298fcdf", new Object[]{dVar}) : dVar.j;
    }

    public static /* synthetic */ byte[] a(d dVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("12afbf12", new Object[]{dVar, new Integer(i)}) : dVar.a(i);
    }

    public static /* synthetic */ boolean b(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56bcd27b", new Object[]{dVar})).booleanValue() : dVar.h;
    }

    public static /* synthetic */ List c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("37b9a571", new Object[]{dVar}) : dVar.f;
    }

    public static /* synthetic */ b d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("10f8baa7", new Object[]{dVar}) : dVar.k;
    }

    public static /* synthetic */ ImageReader e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageReader) ipChange.ipc$dispatch("fb1e6d2", new Object[]{dVar}) : dVar.c;
    }

    public static /* synthetic */ List f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("79becf4", new Object[]{dVar}) : dVar.b;
    }

    public d(int i, int i2, b bVar, Handler handler) {
        this.k = null;
        this.g = handler;
        this.k = bVar;
        this.c = ImageReader.newInstance(i, i2, 1, 20);
        this.d = this.c.getSurface();
        this.c.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: com.taobao.trtc.video.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.media.ImageReader.OnImageAvailableListener
            public void onImageAvailable(ImageReader imageReader) {
                Image image;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
                    return;
                }
                d.a(d.this).lock();
                if (!d.b(d.this)) {
                    try {
                        image = imageReader.acquireNextImage();
                    } catch (Exception e) {
                        e.printStackTrace();
                        image = null;
                    }
                    if (image == null) {
                        d.a(d.this).unlock();
                        return;
                    }
                    Image.Plane[] planes = image.getPlanes();
                    int width = image.getWidth();
                    int height = image.getHeight();
                    int pixelStride = planes[0].getPixelStride();
                    int rowStride = planes[0].getRowStride();
                    int i3 = pixelStride * width;
                    byte[] a2 = d.a(d.this, i3 * height);
                    ByteBuffer buffer = planes[0].getBuffer();
                    for (int i4 = 0; i4 < height; i4++) {
                        try {
                            try {
                                try {
                                    buffer.position(i4 * rowStride);
                                    buffer.get(a2, i4 * width * pixelStride, i3);
                                } catch (IllegalStateException e2) {
                                    e2.printStackTrace();
                                }
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        } catch (Throwable th) {
                            image.close();
                            buffer.clear();
                            throw th;
                        }
                    }
                    d.c(d.this).add(new a(a2, width, height, 1));
                    image.close();
                    buffer.clear();
                    if (d.d(d.this) != null) {
                        d.d(d.this).onImageArrive();
                    }
                }
                d.a(d.this).unlock();
            }
        }, handler);
        this.e = new a.C0631a("trtc-encoder-thread");
        this.e.a(new Runnable() { // from class: com.taobao.trtc.video.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                while (d.e(d.this) != null) {
                    if (d.c(d.this).isEmpty()) {
                        SystemClock.sleep(10L);
                    } else {
                        a aVar = (a) d.c(d.this).remove(0);
                        byte[] bArr = aVar.f23216a;
                        if (d.d(d.this) != null) {
                            d.d(d.this).onRawData(bArr, aVar.b, aVar.c, aVar.d);
                        }
                        d.f(d.this).add(bArr);
                    }
                }
            }
        });
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11773d5a", new Object[]{this, bVar});
        } else {
            this.k = bVar;
        }
    }

    public Surface a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Surface) ipChange.ipc$dispatch("2394c43a", new Object[]{this}) : this.d;
    }

    private byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("5c10e0a2", new Object[]{this, new Integer(i)});
        }
        if (this.b.isEmpty()) {
            return new byte[i];
        }
        return this.b.remove(0);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        try {
            this.j.lock();
            this.h = true;
            if (this.c != null) {
                this.c.setOnImageAvailableListener(null, this.g);
                this.c.close();
                this.c = null;
            }
            this.j.unlock();
            this.e.a(0L);
            this.e = null;
            this.f.clear();
            this.b.clear();
            this.g = null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
