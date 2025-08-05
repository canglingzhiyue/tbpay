package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public class cui {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String[] c;
    private static boolean d;

    static {
        kge.a(1934909336);
        c = new String[]{"orientation", "_data"};
        d = true;
    }

    public static int a(BitmapFactory.Options options, int i) {
        int i2;
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3cee7f0", new Object[]{options, new Integer(i)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i5 > i4) {
            i2 = (int) (i * (i5 / i4));
        } else {
            i2 = i;
            i = (int) (i * (i4 / i5));
        }
        if (i4 > i || i5 > i2) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (i6 / i3 > i && i7 / i3 > i2) {
                i3 <<= 1;
            }
        }
        return i3;
    }

    public static Bitmap a(Context context, Uri uri, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("e920adda", new Object[]{context, uri, new Integer(i)}) : a(context, uri, i, 1);
    }

    public static Bitmap a(Context context, Uri uri, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6c2965", new Object[]{context, uri, new Integer(i), new Integer(i2)});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (uri.getScheme() == null) {
            BitmapFactory.decodeFile(uri.getPath(), options);
            options.inSampleSize = a(options, i) * i2;
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(uri.getPath(), options);
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null) {
                return null;
            }
            FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = a(options, i) * i2;
            options.inJustDecodeBounds = false;
            cug.c("MediaUtil", String.format("inSampleSize:%s,targetShortEdgeLength:%s", Integer.valueOf(options.inSampleSize), Integer.valueOf(i)));
            try {
                try {
                    Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                    if (openFileDescriptor != null) {
                        try {
                            openFileDescriptor.close();
                        } catch (Exception unused) {
                        }
                    }
                    return decodeFileDescriptor;
                } catch (Throwable th) {
                    if (openFileDescriptor != null) {
                        try {
                            openFileDescriptor.close();
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (OutOfMemoryError unused3) {
                Bitmap a2 = a(context, uri, i, 2);
                if (openFileDescriptor != null) {
                    try {
                        openFileDescriptor.close();
                    } catch (Exception unused4) {
                    }
                }
                return a2;
            }
        } catch (FileNotFoundException unused5) {
            return null;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4, Rect rect, boolean z) {
        float f;
        float f2;
        Matrix matrix;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("332965bf", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), rect, new Boolean(z)});
        }
        if (bitmap == null || rect == null) {
            return null;
        }
        float f3 = 1.0f;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            if (width > i4) {
                f = i4;
                f2 = width;
                f3 = f / f2;
            }
            matrix = new Matrix();
            matrix.postRotate(i);
            matrix.postScale(i2 * f3, i3 * f3);
            String.format("height:%s,width:%s,scale:%s", Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f3));
            try {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right, rect.bottom, matrix, true);
                    if (z && bitmap != null && !bitmap.isRecycled() && bitmap != createBitmap) {
                        bitmap.recycle();
                    }
                    return createBitmap;
                } catch (OutOfMemoryError unused) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right / 2, rect.bottom / 2, matrix, true);
                    if (z && bitmap != null && !bitmap.isRecycled() && bitmap != createBitmap2) {
                        bitmap.recycle();
                    }
                    return createBitmap2;
                }
            } catch (Throwable th) {
                if (z && bitmap != null && !bitmap.isRecycled() && bitmap != null) {
                    bitmap.recycle();
                }
                throw th;
            }
        }
        if (height > i4) {
            f = i4;
            f2 = height;
            f3 = f / f2;
        }
        matrix = new Matrix();
        matrix.postRotate(i);
        matrix.postScale(i2 * f3, i3 * f3);
        String.format("height:%s,width:%s,scale:%s", Integer.valueOf(height), Integer.valueOf(width), Float.valueOf(f3));
        Bitmap createBitmap3 = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.right, rect.bottom, matrix, true);
        if (z) {
            bitmap.recycle();
        }
        return createBitmap3;
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("61c0e564", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)}) : a(bitmap, i, i2, i3, i4, true);
    }

    public static Bitmap a(Bitmap bitmap, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("5434ffec", new Object[]{bitmap, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
        }
        if (bitmap != null) {
            return a(bitmap, i, i2, i3, i4, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), z);
        }
        return null;
    }
}
