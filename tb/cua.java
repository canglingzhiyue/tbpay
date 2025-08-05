package tb;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelFileDescriptor;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.jni.PailitaoCUtil;
import com.etao.feimagesearch.result.f;
import com.etao.feimagesearch.util.ac;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class cua {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f26528a;
    private MediaExtractor e;
    private MediaFormat f;
    private MediaCodec g;
    private ImageReader h;
    private a i;
    private Handler l;
    private int b = 0;
    private int c = 0;
    private List<Long> d = new LinkedList();
    private final ThreadPoolExecutor j = new ThreadPoolExecutor(1, 1, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory(), new ThreadPoolExecutor.DiscardOldestPolicy());
    private final HandlerThread k = jbg.a("decodeThread");

    /* loaded from: classes4.dex */
    public interface a {
        void a(Bitmap bitmap, long j);

        void d();

        void e();

        void f();
    }

    static {
        kge.a(491472669);
    }

    public static /* synthetic */ Bitmap a(Image image, int i) throws Exception {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("777aa4d8", new Object[]{image, new Integer(i)}) : c(image, i);
    }

    public static /* synthetic */ ImageReader a(cua cuaVar, ImageReader imageReader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageReader) ipChange.ipc$dispatch("4f922f63", new Object[]{cuaVar, imageReader});
        }
        cuaVar.h = imageReader;
        return imageReader;
    }

    public static /* synthetic */ MediaCodec a(cua cuaVar, MediaCodec mediaCodec) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaCodec) ipChange.ipc$dispatch("11d0e12d", new Object[]{cuaVar, mediaCodec});
        }
        cuaVar.g = mediaCodec;
        return mediaCodec;
    }

    public static /* synthetic */ MediaFormat a(cua cuaVar, MediaFormat mediaFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaFormat) ipChange.ipc$dispatch("b6d83629", new Object[]{cuaVar, mediaFormat});
        }
        cuaVar.f = mediaFormat;
        return mediaFormat;
    }

    public static /* synthetic */ void a(cua cuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4228a49", new Object[]{cuaVar});
        } else {
            cuaVar.d();
        }
    }

    public static /* synthetic */ MediaExtractor b(cua cuaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaExtractor) ipChange.ipc$dispatch("95e2e4f0", new Object[]{cuaVar}) : cuaVar.e;
    }

    public static /* synthetic */ MediaFormat c(cua cuaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaFormat) ipChange.ipc$dispatch("f36a56ac", new Object[]{cuaVar}) : cuaVar.f;
    }

    public static /* synthetic */ void d(cua cuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afab9dcc", new Object[]{cuaVar});
        } else {
            cuaVar.e();
        }
    }

    public static /* synthetic */ ImageReader e(cua cuaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageReader) ipChange.ipc$dispatch("10b1808b", new Object[]{cuaVar}) : cuaVar.h;
    }

    public static /* synthetic */ MediaCodec f(cua cuaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MediaCodec) ipChange.ipc$dispatch("607b683a", new Object[]{cuaVar}) : cuaVar.g;
    }

    public static /* synthetic */ a g(cua cuaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("d75575ab", new Object[]{cuaVar}) : cuaVar.i;
    }

    public static /* synthetic */ Handler h(cua cuaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("1d78c4f6", new Object[]{cuaVar}) : cuaVar.l;
    }

    public static /* synthetic */ void i(cua cuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("583abe51", new Object[]{cuaVar});
        } else {
            cuaVar.g();
        }
    }

    public static /* synthetic */ void j(cua cuaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bdc4d2", new Object[]{cuaVar});
        } else {
            cuaVar.f();
        }
    }

    public static /* synthetic */ List k(cua cuaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b0809694", new Object[]{cuaVar}) : cuaVar.d;
    }

    public cua() {
        this.j.allowCoreThreadTimeOut(true);
        c();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647e142c", new Object[]{this, aVar});
        } else {
            this.i = aVar;
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.j.execute(new ac() { // from class: tb.cua.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    cua.a(cua.this);
                }
            }
        });
        this.k.start();
        this.l = new Handler(this.k.getLooper());
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.e = new MediaExtractor();
        this.f26528a = false;
    }

    public void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.j.execute(new ac() { // from class: tb.cua.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v4, types: [android.net.Uri] */
                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    ParcelFileDescriptor parcelFileDescriptor;
                    ParcelFileDescriptor parcelFileDescriptor2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ParcelFileDescriptor parcelFileDescriptor3 = null;
                    try {
                        try {
                            parcelFileDescriptor = Uri.parse(str);
                            try {
                                if ("content".equals(parcelFileDescriptor.getScheme())) {
                                    parcelFileDescriptor2 = com.b().getContentResolver().openFileDescriptor(parcelFileDescriptor, "r");
                                    if (parcelFileDescriptor2 != null) {
                                        cua.b(cua.this).setDataSource(parcelFileDescriptor2.getFileDescriptor());
                                    } else {
                                        cua.b(cua.this).setDataSource(str);
                                    }
                                } else {
                                    cua.b(cua.this).setDataSource(str);
                                    parcelFileDescriptor2 = null;
                                }
                                int trackCount = cua.b(cua.this).getTrackCount();
                                int i = 0;
                                while (true) {
                                    if (i >= trackCount) {
                                        break;
                                    }
                                    MediaFormat trackFormat = cua.b(cua.this).getTrackFormat(i);
                                    if (trackFormat.getString("mime").contains("video")) {
                                        cua.a(cua.this, trackFormat);
                                        cua.b(cua.this).selectTrack(i);
                                        break;
                                    }
                                    i++;
                                }
                                if (cua.c(cua.this) == null) {
                                    f.a("videoSearch", "can't get videoFormat");
                                    cua.d(cua.this);
                                    if (parcelFileDescriptor2 == null) {
                                        return;
                                    }
                                    try {
                                        parcelFileDescriptor2.close();
                                        return;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                }
                                cua.c(cua.this).setInteger("color-format", 2135033992);
                                cua.c(cua.this).setInteger("width", cua.c(cua.this).getInteger("width"));
                                cua.c(cua.this).setInteger("height", cua.c(cua.this).getInteger("height"));
                                cua.a(cua.this, MediaCodec.createDecoderByType(cua.c(cua.this).getString("mime")));
                                cua.a(cua.this, ImageReader.newInstance(cua.c(cua.this).getInteger("width"), cua.c(cua.this).getInteger("height"), 35, 3));
                                cua.f(cua.this).configure(cua.c(cua.this), cua.e(cua.this).getSurface(), (MediaCrypto) null, 0);
                                cua.f(cua.this).start();
                                if (parcelFileDescriptor2 == null) {
                                    return;
                                }
                                try {
                                    parcelFileDescriptor2.close();
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            } catch (Exception e3) {
                                e = e3;
                                parcelFileDescriptor3 = parcelFileDescriptor;
                                f.a("videoSearch", e.getLocalizedMessage());
                                cua.d(cua.this);
                                if (parcelFileDescriptor3 == null) {
                                    return;
                                }
                                try {
                                    parcelFileDescriptor3.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (parcelFileDescriptor != 0) {
                                    try {
                                        parcelFileDescriptor.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e6) {
                            e = e6;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        parcelFileDescriptor = 0;
                    }
                }
            });
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        a aVar = this.i;
        if (aVar == null) {
            return;
        }
        aVar.d();
    }

    public void a(int i, final int i2, final int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.b = i;
        this.j.execute(new ac() { // from class: tb.cua.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.etao.feimagesearch.util.ac
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (cua.c(cua.this) == null) {
                    cua.g(cua.this).d();
                } else {
                    int integer = cua.c(cua.this).containsKey("rotation-degrees") ? cua.c(cua.this).getInteger("rotation-degrees") : 0;
                    ImageReader e = cua.e(cua.this);
                    cua cuaVar = cua.this;
                    e.setOnImageAvailableListener(new b(integer, i2, i3, cua.g(cuaVar)), cua.h(cua.this));
                    cua.b(cua.this).seekTo(0L, 2);
                    cua.i(cua.this);
                }
            }
        });
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f26528a = true;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.j.execute(new ac() { // from class: tb.cua.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.etao.feimagesearch.util.ac
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        cua.j(cua.this);
                    }
                }
            });
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            if (!this.f26528a) {
                this.f26528a = true;
            }
            try {
                if (this.h != null) {
                    this.h.close();
                    this.h = null;
                }
            } catch (Exception unused) {
            }
            try {
                if (this.g != null) {
                    this.g.stop();
                    this.g.release();
                    this.g = null;
                }
            } catch (Exception unused2) {
            }
            try {
                if (this.e != null) {
                    this.e.release();
                    this.e = null;
                }
            } catch (Exception unused3) {
            }
            try {
                this.k.quitSafely();
                this.j.shutdown();
            } catch (Exception unused4) {
            }
        }
    }

    private void g() {
        int dequeueInputBuffer;
        ByteBuffer byteBuffer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            ByteBuffer[] byteBufferArr = null;
            if (Build.VERSION.SDK_INT < 21) {
                byteBufferArr = this.g.getInputBuffers();
            }
            ByteBuffer[] byteBufferArr2 = byteBufferArr;
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                if (this.f26528a) {
                    return;
                }
                if (!z2 && (dequeueInputBuffer = this.g.dequeueInputBuffer(5000L)) >= 0) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        byteBuffer = this.g.getInputBuffer(dequeueInputBuffer);
                    } else {
                        byteBuffer = byteBufferArr2[dequeueInputBuffer];
                    }
                    int readSampleData = this.e.readSampleData(byteBuffer, 0);
                    if (readSampleData > 0) {
                        this.g.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.e.getSampleTime(), 0);
                        this.e.advance();
                    } else {
                        this.g.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        z2 = true;
                    }
                }
                int dequeueOutputBuffer = this.g.dequeueOutputBuffer(bufferInfo, 5000L);
                if (dequeueOutputBuffer != -1 && dequeueOutputBuffer != -2 && dequeueOutputBuffer != -3) {
                    if ((bufferInfo.flags & 4) != 0) {
                        z = true;
                    }
                    if (this.c == 0) {
                        this.i.e();
                        this.d.add(Long.valueOf(bufferInfo.presentationTimeUs / 1000));
                        this.g.releaseOutputBuffer(dequeueOutputBuffer, true);
                        this.c++;
                    } else {
                        this.c++;
                        this.g.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if (this.c == this.b) {
                            this.c = 0;
                        }
                    }
                    if (z) {
                        this.i.f();
                    }
                }
            }
        } catch (Exception unused) {
            e();
        }
    }

    private static byte[] b(Image image, int i) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d9796382", new Object[]{image, new Integer(i)});
        }
        int width = image.getWidth();
        int height = image.getHeight();
        Image.Plane[] planes = image.getPlanes();
        byte[] bArr = new byte[(width * height) << 2];
        PailitaoCUtil.a(bArr, planes[0].getBuffer(), planes[0].getRowStride(), planes[1].getBuffer(), planes[1].getRowStride(), planes[2].getBuffer(), planes[2].getRowStride(), width, height, 1, i);
        return bArr;
    }

    private static Bitmap c(Image image, int i) throws Exception {
        Bitmap createBitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("fe90e05a", new Object[]{image, new Integer(i)});
        }
        int width = image.getWidth();
        int height = image.getHeight();
        byte[] b2 = b(image, i);
        if (i == 90 || i == 270) {
            createBitmap = Bitmap.createBitmap(height, width, Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        }
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(b2));
        return createBitmap;
    }

    /* loaded from: classes4.dex */
    public class b implements ImageReader.OnImageAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final a b;
        private final int c;
        private final int d;
        private final int e;

        static {
            kge.a(1162903316);
            kge.a(387417682);
        }

        private b(int i, int i2, int i3, a aVar) {
            this.b = aVar;
            this.d = i2;
            this.e = i3;
            this.c = i;
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1a1c131a", new Object[]{this, imageReader});
                return;
            }
            try {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage == null) {
                    return;
                }
                if (acquireLatestImage.getPlanes()[0].getBuffer() == null) {
                    acquireLatestImage.close();
                    return;
                }
                Bitmap a2 = cua.a(acquireLatestImage, this.c);
                acquireLatestImage.close();
                if (this.b == null || a2 == null) {
                    return;
                }
                this.b.a(a(a2), ((Long) cua.k(cua.this).remove(0)).longValue());
            } catch (Exception unused) {
            }
        }

        private Bitmap a(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("79d2cfa4", new Object[]{this, bitmap});
            }
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
            if (min <= this.d && max <= this.e) {
                return bitmap;
            }
            float min2 = Math.min((this.d * 1.0f) / min, (this.e * 1.0f) / max);
            Matrix matrix = new Matrix();
            matrix.postScale(min2, min2);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        }
    }
}
