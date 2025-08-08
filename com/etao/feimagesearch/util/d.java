package com.etao.feimagesearch.util;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Size;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.JvmStatic;
import tb.com;
import tb.csy;
import tb.cui;
import tb.jwl;
import tb.kge;
import tb.rwf;

/* loaded from: classes4.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    static {
        kge.a(-781980529);
        INSTANCE = new d();
    }

    private d() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        if (r1 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
        return r3;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int a(java.lang.String r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.util.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r10
            java.lang.String r10 = "f3a64c25"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            return r10
        L19:
            java.lang.String r0 = "orientation"
            java.lang.String[] r6 = new java.lang.String[]{r0}
            r1 = 0
            android.database.Cursor r1 = (android.database.Cursor) r1
            android.net.Uri r5 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            java.lang.String r10 = "uri"
            kotlin.jvm.internal.q.a(r5, r10)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            java.lang.String r10 = r5.getScheme()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            java.lang.String r4 = "content"
            boolean r10 = kotlin.jvm.internal.q.a(r10, r4)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            r10 = r10 ^ r2
            if (r10 == 0) goto L3a
            return r3
        L3a:
            android.app.Application r10 = tb.com.b()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            java.lang.String r2 = "GlobalAdapter.getCtx()"
            kotlin.jvm.internal.q.a(r10, r2)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            android.content.ContentResolver r4 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            if (r1 == 0) goto L5f
            boolean r10 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            if (r10 == 0) goto L5f
            int r10 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            int r10 = r1.getInt(r10)     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6c
            r3 = r10
        L5f:
            if (r1 == 0) goto L6f
        L61:
            r1.close()     // Catch: java.lang.Exception -> L6f
            goto L6f
        L65:
            r10 = move-exception
            if (r1 == 0) goto L6b
            r1.close()     // Catch: java.lang.Exception -> L6b
        L6b:
            throw r10
        L6c:
            if (r1 == 0) goto L6f
            goto L61
        L6f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.util.d.a(java.lang.String):int");
    }

    @JvmStatic
    public static final Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null || i == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f = 2;
        matrix.setRotate(i, bitmap.getWidth() / f, bitmap.getHeight() / f);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            if (!(!kotlin.jvm.internal.q.a(bitmap, createBitmap))) {
                return bitmap;
            }
            bitmap.recycle();
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }

    @JvmStatic
    public static final Bitmap a(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("3f40f684", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return null;
        }
        int c = rwf.c(bitmap.getWidth(), bitmap.getHeight());
        int d = rwf.d(bitmap.getWidth(), bitmap.getHeight());
        if (c <= i && d <= i2) {
            return bitmap;
        }
        float b = rwf.b((i * 1.0f) / c, (i2 * 1.0f) / d);
        Matrix matrix = new Matrix();
        matrix.setScale(b, b);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    @JvmStatic
    public static final Bitmap b(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9952961c", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (max <= i) {
            return bitmap;
        }
        float f = (i * 1.0f) / max;
        Matrix matrix = new Matrix();
        matrix.setScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
    }

    @JvmStatic
    public static final Bitmap a(Bitmap bitmap, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c0daae24", new Object[]{bitmap, new Float(f), new Float(f2)});
        }
        if (bitmap == null) {
            return null;
        }
        try {
            Bitmap b = b(bitmap, f, f2);
            if (!kotlin.jvm.internal.q.a(b, bitmap)) {
                bitmap.recycle();
            }
            return b;
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    @JvmStatic
    public static final Bitmap b(Bitmap source, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c2110103", new Object[]{source, new Float(f), new Float(f2)});
        }
        kotlin.jvm.internal.q.c(source, "source");
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        try {
            return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
        } catch (Throwable unused) {
            return source;
        }
    }

    @JvmStatic
    public static final String a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa544248", new Object[]{bitmap, compressFormat, new Integer(i)});
        }
        byte[] b = INSTANCE.b(bitmap, compressFormat, i);
        if (b != null) {
            return Base64.encodeToString(b, 2);
        }
        return null;
    }

    private final byte[] b(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i) {
        ByteArrayOutputStream byteArrayOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("4ac55364", new Object[]{this, bitmap, compressFormat, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = byteArrayOutputStream2;
        }
        try {
            bitmap.compress(compressFormat, i, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
            } catch (IOException unused2) {
            }
            return byteArray;
        } catch (IOException unused3) {
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.flush();
                    byteArrayOutputStream2.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    @JvmStatic
    public static final Bitmap a(Bitmap bitmap, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2dad9b5", new Object[]{bitmap, rectF});
        }
        if (bitmap == null || rectF == null) {
            return null;
        }
        int width = (int) (bitmap.getWidth() * rectF.left);
        int height = (int) (bitmap.getHeight() * rectF.top);
        int d = rwf.d((int) (bitmap.getWidth() * rectF.right), bitmap.getWidth());
        int d2 = rwf.d((int) (bitmap.getHeight() * rectF.bottom), bitmap.getHeight());
        if (width >= d) {
            width = d - 1;
        }
        int c = rwf.c(width, 0);
        if (height >= d2) {
            height = d2 - 1;
        }
        int c2 = rwf.c(height, 0);
        try {
            return Bitmap.createBitmap(bitmap, c, c2, d - c, d2 - c2);
        } catch (Exception unused) {
            String rectF2 = rectF.toString();
            kotlin.jvm.internal.q.a((Object) rectF2, "rectF.toString()");
            csy.a(rectF2);
            return null;
        }
    }

    @JvmStatic
    public static final Bitmap a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("68b035c0", new Object[]{str, new Boolean(z)});
        }
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        if (z) {
            return jwl.a().a(str);
        }
        return jwl.a().b(str);
    }

    @JvmStatic
    public static final Bitmap a(com.etao.feimagesearch.album.o media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("c18c84b5", new Object[]{media});
        }
        kotlin.jvm.internal.q.c(media, "media");
        if (media.c()) {
            try {
                return INSTANCE.b(media);
            } catch (IllegalArgumentException unused) {
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever2.setDataSource(media.h());
                        Bitmap frameAtTime = mediaMetadataRetriever2.getFrameAtTime();
                        kotlin.jvm.internal.q.a((Object) frameAtTime, "retriever.frameAtTime");
                        mediaMetadataRetriever2.release();
                        return frameAtTime;
                    } catch (Throwable unused2) {
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        if (mediaMetadataRetriever != null) {
                            mediaMetadataRetriever.release();
                        }
                        return null;
                    }
                } catch (Throwable unused3) {
                }
            }
        } else {
            return INSTANCE.b(media);
        }
    }

    private final Bitmap b(com.etao.feimagesearch.album.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7c022536", new Object[]{this, oVar});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Application b = com.b();
            kotlin.jvm.internal.q.a((Object) b, "GlobalAdapter.getCtx()");
            return b.getContentResolver().loadThumbnail(oVar.j(), new Size(512, 384), null);
        }
        Application b2 = com.b();
        kotlin.jvm.internal.q.a((Object) b2, "GlobalAdapter.getCtx()");
        return MediaStore.Images.Thumbnails.getThumbnail(b2.getContentResolver(), oVar.g(), 1, null);
    }

    @JvmStatic
    public static final Bitmap a(Uri uri, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("da793b42", new Object[]{uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        Bitmap c = c(uri, i, i2, com.etao.feimagesearch.config.b.ee());
        if (c == null) {
            return null;
        }
        return a(c, i3);
    }

    @JvmStatic
    public static final Bitmap c(Uri uri, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d98c6f44", new Object[]{uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (uri == null) {
            return null;
        }
        if (i3 <= 0) {
            i3 = 10;
        }
        if (!kotlin.jvm.internal.q.a((Object) "content", (Object) uri.getScheme())) {
            String uri2 = uri.toString();
            kotlin.jvm.internal.q.a((Object) uri2, "picUri.toString()");
            return a(uri2, i, i2, i3);
        } else if (com.etao.feimagesearch.config.b.bR()) {
            return INSTANCE.d(uri, i, i2, i3);
        } else {
            return b(uri, i, i2, i3);
        }
    }

    public final Bitmap d(Uri uri, int i, int i2, int i3) {
        ParcelFileDescriptor parcelFileDescriptor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("d9160945", new Object[]{this, uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (uri == null || i3 < 0) {
            return null;
        }
        try {
            Application b = com.b();
            kotlin.jvm.internal.q.a((Object) b, "GlobalAdapter.getCtx()");
            parcelFileDescriptor = b.getContentResolver().openFileDescriptor(uri, "r");
        } catch (FileNotFoundException unused) {
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor == null) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
        Application b2 = com.b();
        kotlin.jvm.internal.q.a((Object) b2, "GlobalAdapter.getCtx()");
        File tmpFile = File.createTempFile("plt_img_search_" + System.currentTimeMillis(), null, b2.getExternalCacheDir());
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(tmpFile);
                byte[] bArr = new byte[1048576];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            fileInputStream.close();
            parcelFileDescriptor.close();
            kotlin.jvm.internal.q.a((Object) tmpFile, "tmpFile");
            String absolutePath = tmpFile.getAbsolutePath();
            kotlin.jvm.internal.q.a((Object) absolutePath, "tmpFile.absolutePath");
            return a(absolutePath, i, i2, i3);
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    @JvmStatic
    public static final Bitmap b(Uri uri, int i, int i2, int i3) {
        ParcelFileDescriptor parcelFileDescriptor;
        Bitmap b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("da02d543", new Object[]{uri, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (uri == null || i3 < 0) {
            return null;
        }
        try {
            Application b2 = com.b();
            kotlin.jvm.internal.q.a((Object) b2, "GlobalAdapter.getCtx()");
            parcelFileDescriptor = b2.getContentResolver().openFileDescriptor(uri, "r");
        } catch (FileNotFoundException unused) {
            parcelFileDescriptor = null;
        }
        if (parcelFileDescriptor == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
        options.inSampleSize = cui.a(options, i) * i2;
        options.inJustDecodeBounds = false;
        try {
            try {
                b = BitmapFactory.decodeFileDescriptor(parcelFileDescriptor.getFileDescriptor(), null, options);
            } catch (OutOfMemoryError unused2) {
                b = b(uri, i, i2 << 1, i3 - 1);
            }
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused3) {
                return b;
            }
        } catch (Throwable th) {
            try {
                parcelFileDescriptor.close();
            } catch (Exception unused4) {
            }
            throw th;
        }
    }

    @JvmStatic
    public static final Bitmap a(String absPath, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2e0f190f", new Object[]{absPath, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        kotlin.jvm.internal.q.c(absPath, "absPath");
        if (i3 < 0) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absPath, options);
            options.inSampleSize = cui.a(options, i) * i2;
            options.inJustDecodeBounds = false;
            try {
                return BitmapFactory.decodeFile(absPath, options);
            } catch (OutOfMemoryError unused) {
                return a(absPath, i, i2 << 1, i3 - 1);
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
