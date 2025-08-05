package com.taobao.android.litecreator.comprehension.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.AsyncTask;
import android.util.Log;
import android.view.Surface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.business.record.videopicker.g;
import com.taobao.tixel.android.media.d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends AsyncTask<String, Bitmap, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long[] f13342a;
    public long b;
    private com.taobao.tixel.android.media.a g;
    private g.a h;
    private int i;
    private int l;
    public int c = 1;
    public MediaExtractor d = null;
    public MediaCodec e = null;
    private final int j = 2135033992;
    private boolean k = false;
    public int f = 0;

    static {
        kge.a(-1966088712);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 1050423957) {
            super.onProgressUpdate((Object[]) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Boolean, java.lang.Object] */
    @Override // android.os.AsyncTask
    public /* synthetic */ Boolean doInBackground(String[] strArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, strArr}) : a(strArr);
    }

    @Override // android.os.AsyncTask
    public /* synthetic */ void onProgressUpdate(Bitmap[] bitmapArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e9c3295", new Object[]{this, bitmapArr});
        } else {
            a(bitmapArr);
        }
    }

    public a(com.taobao.tixel.android.media.a aVar, long[] jArr, int i, g.a aVar2) {
        this.g = aVar;
        this.h = aVar2;
        this.i = i;
        this.f13342a = jArr;
        this.b = jArr[0];
    }

    public Boolean a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("af9a174", new Object[]{this, strArr});
        }
        try {
            this.d = new MediaExtractor();
            d.a(this.d, this.g);
            int a2 = a(this.d);
            if (a2 >= 0) {
                this.d.selectTrack(a2);
                MediaFormat trackFormat = this.d.getTrackFormat(a2);
                String string = trackFormat.getString("mime");
                if (trackFormat.containsKey("rotation-degrees")) {
                    this.l = trackFormat.getInteger("rotation-degrees");
                }
                this.e = MediaCodec.createDecoderByType(string);
                a(this.e.getCodecInfo().getCapabilitiesForType(string));
                if (a(2135033992, this.e.getCodecInfo().getCapabilitiesForType(string))) {
                    trackFormat.setInteger("color-format", 2135033992);
                } else {
                    trackFormat.setInteger("color-format", 19);
                }
                a(this.e, this.d, trackFormat, this.i);
                this.e.stop();
            }
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            Log.e("FrameTask", "", e);
        }
        try {
            if (this.e != null) {
                this.e.release();
                this.e = null;
            }
            if (this.d != null) {
                this.d.release();
                this.d = null;
            }
        } catch (IllegalStateException e2) {
            Log.e("FrameTask", "", e2);
        }
        return null;
    }

    private void a(MediaCodec mediaCodec, MediaExtractor mediaExtractor, MediaFormat mediaFormat, int i) {
        MediaCodec.BufferInfo bufferInfo;
        long j;
        int dequeueInputBuffer;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4313a30", new Object[]{this, mediaCodec, mediaExtractor, mediaFormat, new Integer(i)});
            return;
        }
        try {
            MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
            mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
            mediaCodec.start();
            mediaFormat.getInteger("width");
            mediaFormat.getInteger("height");
            boolean z = false;
            boolean z2 = false;
            int i3 = 0;
            while (!z) {
                if (this.k || isCancelled()) {
                    return;
                }
                if (z2 || (dequeueInputBuffer = mediaCodec.dequeueInputBuffer(10000L)) < 0) {
                    bufferInfo = bufferInfo2;
                    j = 10000;
                } else {
                    int readSampleData = mediaExtractor.readSampleData(mediaCodec.getInputBuffer(dequeueInputBuffer), i2);
                    if (readSampleData < 0) {
                        bufferInfo = bufferInfo2;
                        j = 10000;
                        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        z2 = true;
                    } else {
                        bufferInfo = bufferInfo2;
                        j = 10000;
                        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                    }
                    if (this.c < this.f13342a.length) {
                        this.b = this.f13342a[this.c];
                        this.c++;
                    }
                    mediaExtractor.seekTo(this.b, 2);
                }
                MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo3, j);
                if (dequeueOutputBuffer >= 0) {
                    if ((bufferInfo3.flags & 4) != 0) {
                        z = true;
                    }
                    if (bufferInfo3.size != 0) {
                        int i4 = i3 + 1;
                        Image outputImage = mediaCodec.getOutputImage(dequeueOutputBuffer);
                        if (outputImage != null) {
                            a(outputImage, i);
                            outputImage.close();
                        }
                        mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                        if (i4 == this.f13342a.length) {
                            this.k = true;
                        }
                        i3 = i4;
                    }
                } else if (dequeueOutputBuffer == -2) {
                    System.out.println(mediaCodec.getOutputFormat());
                }
                bufferInfo2 = bufferInfo3;
                i2 = 0;
            }
        } catch (Exception e) {
            Log.e("FrameTask", "", e);
        }
    }

    private void a(Image image, int i) {
        Rect cropRect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72dc23fa", new Object[]{this, image, new Integer(i)});
        } else if (image == null || (cropRect = image.getCropRect()) == null || cropRect.width() <= 0 || cropRect.height() <= 0) {
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                YuvImage yuvImage = new YuvImage(b(image, 2), 17, cropRect.width(), cropRect.height(), null);
                int width = cropRect.width();
                int height = cropRect.height();
                yuvImage.compressToJpeg(cropRect, 80, byteArrayOutputStream);
                int max = Math.max(1, Math.min(width / i, height / i));
                if (max > 1) {
                    max = a(max);
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inSampleSize = max;
                publishProgress(a(BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size(), options), i));
                byteArrayOutputStream.close();
            } catch (IOException | OutOfMemoryError e) {
                Log.e("FrameTask", "", e);
            }
        }
    }

    private static int a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        while (i >= Math.pow(2.0d, i2)) {
            i2++;
        }
        return (int) Math.pow(2.0d, i2 - 1);
    }

    private Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{this, bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        float f = i;
        float min = Math.min(bitmap.getWidth() / f, bitmap.getHeight() / f);
        matrix.postRotate(this.l);
        float f2 = 1.0f / min;
        matrix.postScale(f2, f2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public void a(Bitmap... bitmapArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7853bfa1", new Object[]{this, bitmapArr});
            return;
        }
        super.onProgressUpdate(bitmapArr);
        g.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.onSuccess(this.f, bitmapArr[0]);
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static byte[] b(android.media.Image r21, int r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.litecreator.comprehension.video.a.b(android.media.Image, int):byte[]");
    }

    private static boolean a(Image image) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2cfed42d", new Object[]{image})).booleanValue();
        }
        int format = image.getFormat();
        return format == 17 || format == 35 || format == 842094169;
    }

    private static int a(MediaExtractor mediaExtractor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53c352ff", new Object[]{mediaExtractor})).intValue();
        }
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                return i;
            }
        }
        return -1;
    }

    private static void a(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        int[] iArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ce4224", new Object[]{codecCapabilities});
            return;
        }
        System.out.print("supported color format: ");
        for (int i : codecCapabilities.colorFormats) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    private static boolean a(int i, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c63175b", new Object[]{new Integer(i), codecCapabilities})).booleanValue();
        }
        for (int i2 : codecCapabilities.colorFormats) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
