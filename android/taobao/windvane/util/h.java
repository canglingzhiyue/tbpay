package android.taobao.windvane.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.AndroidRuntimeException;
import android.util.Base64;
import android.webkit.URLUtil;
import com.alipay.ma.util.ImageTool;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str);
    }

    static {
        kge.a(-1453302678);
    }

    public static void a(final Context context, String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64a9fbd", new Object[]{context, str, aVar});
        } else if (URLUtil.isHttpUrl(str) || URLUtil.isHttpsUrl(str)) {
            android.taobao.windvane.connect.c.a().a(str, new android.taobao.windvane.connect.d<android.taobao.windvane.connect.f>() { // from class: android.taobao.windvane.util.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.connect.d
                public /* synthetic */ void onFinish(android.taobao.windvane.connect.f fVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("33e8872e", new Object[]{this, fVar, new Integer(i)});
                    } else {
                        a(fVar, i);
                    }
                }

                public void a(android.taobao.windvane.connect.f fVar, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("518578c7", new Object[]{this, fVar, new Integer(i)});
                        return;
                    }
                    try {
                        if (fVar.a() && "mounted".equals(Environment.getExternalStorageState()) && h.a(context, BitmapFactory.decodeStream(new ByteArrayInputStream(fVar.d())))) {
                            if (aVar == null) {
                                return;
                            }
                            aVar.a();
                        } else if (aVar == null) {
                        } else {
                            aVar.a("bad resource");
                        }
                    } catch (Exception e) {
                        a aVar2 = aVar;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a(e.getMessage());
                    } catch (OutOfMemoryError e2) {
                        a aVar3 = aVar;
                        if (aVar3 == null) {
                            return;
                        }
                        aVar3.a(e2.getMessage());
                    }
                }

                @Override // android.taobao.windvane.connect.d
                public void onError(int i, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str2});
                        return;
                    }
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a("error get resource, code=[" + i + "],msg=[" + str2 + riy.ARRAY_END_STR);
                }
            });
        } else if (!str.startsWith("data:")) {
        } else {
            try {
                byte[] decode = Base64.decode(str.substring(str.indexOf(",") + 1).getBytes(), 0);
                if (!a(context, BitmapFactory.decodeByteArray(decode, 0, decode.length)) || aVar == null) {
                    return;
                }
                aVar.a();
            } catch (Throwable th) {
                if (aVar == null) {
                    return;
                }
                aVar.a(th.getMessage());
            }
        }
    }

    public static void a(Context context, String str, final Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4859ec5a", new Object[]{context, str, handler});
        } else {
            a(context, str, new a() { // from class: android.taobao.windvane.util.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.taobao.windvane.util.h.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    Handler handler2 = handler;
                    if (handler2 == null) {
                        return;
                    }
                    handler2.sendEmptyMessage(404);
                }

                @Override // android.taobao.windvane.util.h.a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    Handler handler2 = handler;
                    if (handler2 == null) {
                        return;
                    }
                    handler2.sendEmptyMessage(405);
                }
            });
        }
    }

    public static boolean a(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cc61d2", new Object[]{context, bitmap})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (b(context, bitmap)) {
                return true;
            }
            m.e(ImageTool.TAG, "save image failed");
            return false;
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File file = new File(externalStoragePublicDirectory, String.valueOf(System.currentTimeMillis()) + ".jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"image/jpeg"}, null);
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static boolean b(Context context, Bitmap bitmap) {
        ParcelFileDescriptor parcelFileDescriptor;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd20b713", new Object[]{context, bitmap})).booleanValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", String.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + "wv_save_image");
        Uri contentUri = MediaStore.Images.Media.getContentUri("external_primary");
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(contentUri, contentValues);
        try {
            try {
                if (insert == null) {
                    new AndroidRuntimeException("android Q: save image error for uri is null").printStackTrace();
                    return false;
                }
                parcelFileDescriptor = contentResolver.openFileDescriptor(insert, "w", null);
                try {
                    fileOutputStream2 = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            throw th;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
                try {
                    if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2)) {
                        new AndroidRuntimeException("android Q: save image failed").printStackTrace();
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                            }
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        return false;
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(insert, contentValues, null, null);
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        if (parcelFileDescriptor != null) {
                            parcelFileDescriptor.close();
                        }
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    return true;
                } catch (IOException e5) {
                    e = e5;
                    e.printStackTrace();
                    contentResolver.delete(insert, null, null);
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            return false;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    return false;
                }
            } catch (IOException e7) {
                e = e7;
                parcelFileDescriptor = null;
                fileOutputStream2 = null;
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = null;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Bitmap a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9a4e18ef", new Object[]{str, new Integer(i)});
        }
        if (i > 10240) {
            i = AccsConnection.DATA_PACKAGE_MAX;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int round = Math.round((options.outHeight > options.outWidth ? options.outHeight : options.outWidth) / i);
        if (round <= 0) {
            round = 1;
        }
        options.inSampleSize = round;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6ffe40db", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width > height ? width : height;
        if (i2 <= i) {
            return bitmap;
        }
        float f = i / i2;
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static Bitmap a(Bitmap bitmap, long j, long j2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("69630ea4", new Object[]{bitmap, new Long(j), new Long(j2)});
        }
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > height) {
            i2 = width;
            i = height;
        } else {
            i = width;
            i2 = height;
        }
        if (i2 <= j && i <= j2) {
            return bitmap;
        }
        float f = ((float) j) / i2;
        float f2 = ((float) j2) / i;
        if (f >= f2) {
            f = f2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static byte[] a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("c4669b32", new Object[]{bitmap, compressFormat});
        }
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Drawable a(Resources resources, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("f7dff157", new Object[]{resources, str});
        }
        if (str == null) {
            return null;
        }
        try {
            try {
                return new BitmapDrawable(resources, BitmapFactory.decodeStream(new ByteArrayInputStream(Base64.decode(str, 0))));
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return null;
            }
        } catch (IllegalArgumentException unused) {
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt(android.support.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt == 6) {
                return 90;
            }
            return attributeInt != 8 ? 0 : 270;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static Bitmap b(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9952961c", new Object[]{bitmap, new Integer(i)});
        }
        if (i == 0 || bitmap == null) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return bitmap != createBitmap ? createBitmap : bitmap;
        } catch (OutOfMemoryError unused) {
            return bitmap;
        }
    }
}
