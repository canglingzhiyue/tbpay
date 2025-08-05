package com.taobao.android.litecreator.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.provider.MediaStore;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import tb.kge;
import tb.riy;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Paint f13500a;

    static {
        kge.a(-376780006);
        Paint paint = new Paint();
        f13500a = paint;
        paint.setAntiAlias(true);
        f13500a.setFilterBitmap(true);
        f13500a.setDither(true);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(decodeFile, 0.0f, 0.0f, f13500a);
        String c = n.c(Globals.getApplication());
        if (!a(createBitmap, c, 90)) {
            return null;
        }
        return c;
    }

    public static boolean a(Bitmap bitmap, String str, int i, boolean z) {
        RandomAccessFile randomAccessFile;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9525345", new Object[]{bitmap, str, new Integer(i), new Boolean(z)})).booleanValue();
        }
        if (bitmap == null) {
            return false;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            RandomAccessFile randomAccessFile2 = null;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(z ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                randomAccessFile.write(byteArray);
                a(byteArrayOutputStream);
                a(randomAccessFile);
                return true;
            } catch (Exception unused2) {
                randomAccessFile2 = randomAccessFile;
                a(byteArrayOutputStream);
                a(randomAccessFile2);
                return false;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                a(byteArrayOutputStream);
                a(randomAccessFile2);
                throw th;
            }
        } catch (Exception e) {
            u.d("BitmapUtil", "saveBitmap. Exception:" + Log.getStackTraceString(e));
            return false;
        }
    }

    public static boolean a(Bitmap bitmap, String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("94f21df7", new Object[]{bitmap, str, new Integer(i)})).booleanValue() : a(bitmap, str, i, false);
    }

    public static boolean a(Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1b53714", new Object[]{bitmap, str})).booleanValue() : a(bitmap, str, 100);
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("9a4e18ef", new Object[]{str, new Integer(i)}) : a(str, i, true);
    }

    public static Pair<Bitmap, String> b(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("de96123a", new Object[]{str, new Integer(i)}) : b(str, i, true);
    }

    public static Bitmap a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("2d4e3dc1", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        Pair<Bitmap, String> b = b(str, i, z);
        if (b == null) {
            return null;
        }
        return (Bitmap) b.first;
    }

    public static Pair<Bitmap, String> b(String str, int i, boolean z) {
        float min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("85af62e", new Object[]{str, new Integer(i), new Boolean(z)});
        }
        if (i <= 0) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str2 = options.outMimeType;
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        int d = k.d(str);
        if (z) {
            float f = i;
            min = Math.max(i2 / f, i3 / f);
        } else {
            float f2 = i;
            min = Math.min(i2 / f2, i3 / f2);
        }
        int a2 = a(Math.max(1.0f, min));
        u.b("BitmapUtil", "decodeBitmap. picInfo(path:" + str + ", width:" + i2 + ", height:" + i3 + ", rotate:" + d + ", sampleSize:" + a2 + riy.BRACKET_END_STR);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options2.inSampleSize = a2;
            options2.inMutable = true;
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options2);
            a(fileInputStream);
            if (decodeStream == null) {
                u.d("BitmapUtil", "decodeBitmap. decode error.");
                return null;
            }
            int height = decodeStream.getHeight();
            int width = decodeStream.getWidth();
            if (d != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate(d);
                decodeStream = Bitmap.createBitmap(decodeStream, 0, 0, width, height, matrix, true);
            }
            u.b("BitmapUtil", "decodeBitmap. decodeInfo(path:" + str + ", width:" + width + ", height:" + height + ", decodeCost:" + (System.currentTimeMillis() - currentTimeMillis) + "ms)");
            return new Pair<>(decodeStream, str2);
        } catch (FileNotFoundException unused) {
            u.d("BitmapUtil", "decodeBitmap. file not found. path : picPath");
            return null;
        }
    }

    public static int a(float f) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{new Float(f)})).intValue();
        }
        int round = Math.round(f);
        if (round <= 1) {
            return round;
        }
        while (round >= Math.pow(2.0d, i)) {
            i++;
        }
        return (int) Math.pow(2.0d, i - 1);
    }

    public static byte[] b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("462f18", new Object[]{bitmap});
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        byte[] bArr = new byte[(array.length / 4) * 3];
        int length = array.length / 4;
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            int i3 = i << 2;
            bArr[i2] = array[i3];
            bArr[i2 + 1] = array[i3 + 1];
            bArr[i2 + 2] = array[i3 + 2];
        }
        return bArr;
    }

    public static Bitmap a(Context context, Bitmap bitmap, int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8364f949", new Object[]{context, bitmap, new Integer(i), new Float(f)});
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * f), Math.round(bitmap.getHeight() * f), false);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setInput(createFromBitmap);
        create2.setRadius(i);
        create2.forEach(createTyped);
        createTyped.copyTo(createScaledBitmap);
        create.destroy();
        return createScaledBitmap;
    }

    private static void a(Closeable closeable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f93203", new Object[]{closeable});
        } else if (closeable == null) {
        } else {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Size b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("4faea8b6", new Object[]{str});
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        return new Size(options.outWidth, options.outHeight);
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int max = Math.max(i, i2);
        int i4 = i * i2;
        return i4 > i3 ? (int) (max * Math.sqrt(i3 / i4)) : max;
    }

    public static void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{bitmap});
        } else if (bitmap == null || bitmap.isRecycled()) {
        } else {
            bitmap.recycle();
        }
    }

    public static int a(BitmapFactory.Options options, int i, int i2) {
        IpChange ipChange = $ipChange;
        int i3 = 1;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("860e8a99", new Object[]{options, new Integer(i), new Integer(i2)})).intValue();
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        if (i4 > i2 || i5 > i) {
            while (true) {
                if (i4 / i3 <= i2 && i5 / i3 <= i) {
                    break;
                }
                i3 <<= 1;
            }
        }
        return i3;
    }

    public static Bitmap a(boolean z, long j, int i, boolean z2) {
        Bitmap thumbnail;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("46a4dee7", new Object[]{new Boolean(z), new Long(j), new Integer(i), new Boolean(z2)});
        }
        if (j <= 0) {
            return null;
        }
        try {
            if (z) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 1, null);
                if (thumbnail == null) {
                    thumbnail = MediaStore.Video.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 2, null);
                }
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 1, null);
                if (thumbnail == null) {
                    thumbnail = MediaStore.Images.Thumbnails.getThumbnail(Globals.getApplication().getContentResolver(), j, 2, null);
                }
            }
            if (thumbnail != null && thumbnail.getWidth() != 0 && thumbnail.getHeight() != 0) {
                if (!z2) {
                    return thumbnail;
                }
                int min = Math.min(i, thumbnail.getWidth());
                return Bitmap.createScaledBitmap(thumbnail, min, (thumbnail.getHeight() * min) / thumbnail.getWidth(), false);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            u.d("MediaUtils", "getThumbnail Fail:" + e.getMessage());
            return null;
        }
    }

    public static String a(Activity activity, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("802ce401", new Object[]{activity, str, new Integer(i)});
        }
        String c = n.c(activity);
        if (activity == null || TextUtils.isEmpty(c)) {
            return "";
        }
        String file = new File(c).getAbsoluteFile().toString();
        Size b = b(str);
        return a(a(str, a(b.getWidth(), b.getHeight(), i)), file, 90) ? file : str;
    }
}
