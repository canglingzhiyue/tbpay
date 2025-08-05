package io.unicorn.embedding.android;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.Locale;
import tb.kge;
import tb.rtd;

/* loaded from: classes9.dex */
public class UnicornImageReaderView extends View implements io.unicorn.embedding.engine.renderer.c {
    private static final String TAG = "FlutterImageView";
    private Bitmap currentBitmap;
    private Image currentImage;
    private io.unicorn.embedding.engine.renderer.a flutterRenderer;
    private ImageReader imageReader;
    private boolean isAttachedToFlutterRenderer;
    private SurfaceKind kind;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.unicorn.embedding.android.UnicornImageReaderView$1  reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f24801a = new int[SurfaceKind.values().length];

        static {
            try {
                f24801a[SurfaceKind.background.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24801a[SurfaceKind.overlay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes9.dex */
    public enum SurfaceKind {
        background,
        overlay
    }

    static {
        kge.a(-265664285);
        kge.a(1542522400);
    }

    public UnicornImageReaderView(Context context) {
        this(context, 1, 1, SurfaceKind.background);
    }

    public UnicornImageReaderView(Context context, int i, int i2, SurfaceKind surfaceKind) {
        this(context, createImageReader(i, i2), surfaceKind);
    }

    UnicornImageReaderView(Context context, ImageReader imageReader, SurfaceKind surfaceKind) {
        super(context, null);
        this.isAttachedToFlutterRenderer = false;
        this.imageReader = imageReader;
        this.kind = surfaceKind;
        init();
    }

    public UnicornImageReaderView(Context context, AttributeSet attributeSet) {
        this(context, 1, 1, SurfaceKind.background);
    }

    private void closeCurrentImage() {
        Image image = this.currentImage;
        if (image != null) {
            image.close();
            this.currentImage = null;
        }
    }

    private static ImageReader createImageReader(int i, int i2) {
        int i3;
        int i4;
        if (i <= 0) {
            logW("ImageReader width must be greater than 0, but given width=%d, set width=1", Integer.valueOf(i));
            i3 = 1;
        } else {
            i3 = i;
        }
        if (i2 <= 0) {
            logW("ImageReader height must be greater than 0, but given height=%d, set height=1", Integer.valueOf(i2));
            i4 = 1;
        } else {
            i4 = i2;
        }
        return Build.VERSION.SDK_INT >= 29 ? ImageReader.newInstance(i3, i4, 1, 3, 768L) : ImageReader.newInstance(i3, i4, 1, 3);
    }

    private void init() {
        setAlpha(0.0f);
    }

    private static void logW(String str, Object... objArr) {
        rtd.d(TAG, String.format(Locale.US, str, objArr));
    }

    private void updateCurrentBitmap() {
        if (Build.VERSION.SDK_INT >= 29) {
            HardwareBuffer hardwareBuffer = this.currentImage.getHardwareBuffer();
            this.currentBitmap = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
            hardwareBuffer.close();
            return;
        }
        Image.Plane[] planes = this.currentImage.getPlanes();
        if (planes.length != 1) {
            return;
        }
        Image.Plane plane = planes[0];
        int rowStride = plane.getRowStride() / plane.getPixelStride();
        int height = this.currentImage.getHeight();
        Bitmap bitmap = this.currentBitmap;
        if (bitmap == null || bitmap.getWidth() != rowStride || this.currentBitmap.getHeight() != height) {
            this.currentBitmap = Bitmap.createBitmap(rowStride, height, Bitmap.Config.ARGB_8888);
        }
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        this.currentBitmap.copyPixelsFromBuffer(buffer);
    }

    public boolean acquireLatestImage() {
        ImageReader imageReader;
        if (this.isAttachedToFlutterRenderer && (imageReader = this.imageReader) != null) {
            Image acquireLatestImage = imageReader.acquireLatestImage();
            if (acquireLatestImage != null) {
                closeCurrentImage();
                this.currentImage = acquireLatestImage;
                invalidate();
            }
            if (acquireLatestImage != null) {
                return true;
            }
        }
        return false;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void attachToRenderer(io.unicorn.embedding.engine.renderer.a aVar) {
        if (this.imageReader == null) {
            return;
        }
        if (AnonymousClass1.f24801a[this.kind.ordinal()] == 1) {
            aVar.b(this.imageReader.getSurface());
        }
        setAlpha(1.0f);
        this.flutterRenderer = aVar;
        this.isAttachedToFlutterRenderer = true;
    }

    public void closeImageReader() {
        ImageReader imageReader = this.imageReader;
        if (imageReader == null) {
            return;
        }
        imageReader.close();
        this.imageReader = null;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void detachFromRenderer() {
        if (!this.isAttachedToFlutterRenderer) {
            return;
        }
        setAlpha(0.0f);
        acquireLatestImage();
        this.currentBitmap = null;
        closeCurrentImage();
        invalidate();
        this.isAttachedToFlutterRenderer = false;
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public io.unicorn.embedding.engine.renderer.a getAttachedRenderer() {
        return this.flutterRenderer;
    }

    public ImageReader getImageReader() {
        return this.imageReader;
    }

    public Surface getSurface() {
        return this.imageReader.getSurface();
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void invalid() {
        detachFromRenderer();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.currentImage != null) {
            updateCurrentBitmap();
        }
        Bitmap bitmap = this.currentBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        ImageReader imageReader = this.imageReader;
        if (imageReader == null) {
            return;
        }
        if ((i == imageReader.getWidth() && i2 == this.imageReader.getHeight()) || this.kind != SurfaceKind.background || !this.isAttachedToFlutterRenderer) {
            return;
        }
        resizeIfNeeded(i, i2);
        this.flutterRenderer.b(this.imageReader.getSurface());
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void pause() {
    }

    public void resizeIfNeeded(int i, int i2) {
        ImageReader imageReader;
        if (this.flutterRenderer == null || (imageReader = this.imageReader) == null) {
            return;
        }
        if (i == imageReader.getWidth() && i2 == this.imageReader.getHeight()) {
            return;
        }
        closeCurrentImage();
        closeImageReader();
        this.imageReader = createImageReader(i, i2);
    }

    @Override // io.unicorn.embedding.engine.renderer.c
    public void valid() {
        io.unicorn.embedding.engine.renderer.a aVar = this.flutterRenderer;
        if (aVar != null) {
            attachToRenderer(aVar);
        }
    }
}
