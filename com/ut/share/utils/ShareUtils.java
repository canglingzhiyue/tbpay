package com.ut.share.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;

/* loaded from: classes9.dex */
public class ShareUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1999820062);
    }

    public static byte[] file2Bytes(String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8baa10f7", new Object[]{str});
        }
        try {
            fileInputStream = new FileInputStream(new File(str));
        } catch (Exception unused) {
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                fileInputStream.close();
            } catch (Exception unused2) {
            }
            return byteArray;
        } catch (Exception unused3) {
            try {
                fileInputStream.close();
            } catch (Exception unused4) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            try {
                fileInputStream.close();
            } catch (Exception unused5) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    public static byte[] bmp2Bytes(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        ?? r1 = ipChange instanceof IpChange;
        if (r1 != 0) {
            return (byte[]) ipChange.ipc$dispatch("3cbbe2d4", new Object[]{bitmap});
        }
        byte[] bArr = null;
        try {
            try {
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bitmap == 0) {
                return null;
            }
            try {
                r1 = new ByteArrayOutputStream();
            } catch (Exception e2) {
                e = e2;
                r1 = 0;
            } catch (Throwable th) {
                th = th;
                r1 = 0;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 85, r1);
                bArr = r1.toByteArray();
                r1.close();
                r1 = r1;
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                if (r1 != 0) {
                    r1.close();
                    r1 = r1;
                }
                return bArr;
            }
            return bArr;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean saveBitmapToFile(byte[] bArr, String str) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("280dbf9f", new Object[]{bArr, str})).booleanValue();
        }
        if (bArr == null) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
        } catch (Exception unused) {
            fileOutputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
            } catch (IOException unused2) {
            }
            return true;
        } catch (Exception unused3) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    public static boolean saveBitmap(Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a29e7c5", new Object[]{bitmap, file, str, compressFormat})).booleanValue();
        }
        if (bitmap != null && file != null && str != null && compressFormat != null) {
            File file2 = new File(file, str);
            FileOutputStream fileOutputStream = null;
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    bitmap.compress(compressFormat, 100, fileOutputStream2);
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (Exception unused) {
                    }
                    return true;
                } catch (Exception unused2) {
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public static boolean saveBitmap(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb57f44e", new Object[]{bitmap, str, compressFormat})).booleanValue();
        }
        if (bitmap != null && str != null && compressFormat != null) {
            File file = new File(str);
            FileOutputStream fileOutputStream2 = null;
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileOutputStream = new FileOutputStream(file);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                bitmap.compress(compressFormat, 100, fileOutputStream);
                try {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception unused2) {
                }
                return true;
            } catch (Exception unused3) {
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream2 = fileOutputStream;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        }
        return false;
    }

    public static String picUrlProcess(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9731d78", new Object[]{str, new Integer(i)});
        }
        if (str == null) {
            return str;
        }
        int indexOf = str.indexOf(124);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        String replace = str.replace(" ", "");
        Matcher matcher = Pattern.compile("_\\d+x\\d+\\.jpg", 2).matcher(replace);
        String str2 = "_" + i + "x" + i + ".jpg";
        if (matcher.find()) {
            return matcher.replaceAll(str2);
        }
        return replace + str2;
    }

    public static Bitmap imageCompress(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bb9b3957", new Object[]{bitmap, new Integer(i)});
        }
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i2 = 100;
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length > i) {
            byteArrayOutputStream.reset();
            i2 -= 10;
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
        }
        return BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
    }

    public static Bitmap compressImage(Bitmap bitmap, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("6889a193", new Object[]{bitmap, new Integer(i)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        int i2 = i << 10;
        float sqrt = (float) Math.sqrt(i2 / byteArrayOutputStream.toByteArray().length);
        Matrix matrix = new Matrix();
        matrix.setScale(sqrt, sqrt);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        byteArrayOutputStream.reset();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        Bitmap bitmap2 = createBitmap;
        while (byteArrayOutputStream.toByteArray().length > i2) {
            System.out.println(byteArrayOutputStream.toByteArray().length);
            matrix.setScale(0.9f, 0.9f);
            bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            byteArrayOutputStream.reset();
            bitmap2.compress(Bitmap.CompressFormat.JPEG, 85, byteArrayOutputStream);
        }
        return bitmap2;
    }

    public static Bitmap imageFromPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("7db7ca59", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || !Environment.getExternalStorageState().equals("mounted") || !new File(str).exists()) {
            return null;
        }
        return BitmapFactory.decodeFile(str);
    }

    public static Bitmap thumbnailImageFromPath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("69fd5dcd", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || !Environment.getExternalStorageState().equals("mounted") || !new File(str).exists()) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = (int) Math.round((((options.outWidth * options.outHeight) * 16.0d) / 49152.0d) + 1.0d);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_4444;
        return BitmapFactory.decodeFile(str, options);
    }

    public static int getBitmapSize(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17b8fb74", new Object[]{bitmap})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public static byte[] bmpToByteArray(Bitmap bitmap, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("b1af80ff", new Object[]{bitmap, new Boolean(z)});
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return byteArray;
    }

    public static Bitmap downloadImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("eaa2ae2", new Object[]{str});
        }
        Bitmap bitmap = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            URL url = new URL(str);
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setDoInput(true);
                String host = url.getHost();
                if (!TextUtils.isEmpty(host)) {
                    int port = url.getPort();
                    if (port != -1) {
                        host = host + ":" + port;
                    }
                    httpURLConnection.setRequestProperty(HttpConstant.HOST, host);
                    String str2 = "pic host: " + host;
                }
                httpURLConnection.connect();
                InputStream inputStream = httpURLConnection.getInputStream();
                bitmap = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
                return bitmap;
            } catch (IOException e) {
                e.printStackTrace();
                return bitmap;
            }
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap imageZoom(Bitmap bitmap, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("4cba14c3", new Object[]{bitmap, new Double(d)});
        }
        if (d > 400.0d) {
            d = 400.0d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        double length = byteArrayOutputStream.toByteArray().length / 1024;
        if (length <= d) {
            return bitmap;
        }
        double d2 = length / (d * 0.8d);
        return zoomImage(bitmap, bitmap.getWidth() / Math.sqrt(d2), bitmap.getHeight() / Math.sqrt(d2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r8 > 375.0d) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r8 > 750.0d) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        r8 = ((float) r8) / r10;
        r5.postScale(r8, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
        return android.graphics.Bitmap.createBitmap(r7, 0, 0, (int) r10, (int) r11, r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r8 > 300.0d) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap zoomImage(android.graphics.Bitmap r7, double r8, double r10) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.ut.share.utils.ShareUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L25
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            r7 = 1
            java.lang.Double r2 = new java.lang.Double
            r2.<init>(r8)
            r1[r7] = r2
            r7 = 2
            java.lang.Double r8 = new java.lang.Double
            r8.<init>(r10)
            r1[r7] = r8
            java.lang.String r7 = "4af0451d"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            return r7
        L25:
            int r10 = r7.getWidth()
            float r10 = (float) r10
            int r11 = r7.getHeight()
            float r11 = (float) r11
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            float r0 = r11 / r10
            r1 = 1082130432(0x40800000, float:4.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L47
            r0 = 4643985272004935680(0x4072c00000000000, double:300.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L61
        L45:
            r8 = r0
            goto L61
        L47:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L57
            r0 = 4645304685958266880(0x4077700000000000, double:375.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L61
            goto L45
        L57:
            r0 = 4649808285585637376(0x4087700000000000, double:750.0)
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L61
            goto L45
        L61:
            float r8 = (float) r8
            float r8 = r8 / r10
            r5.postScale(r8, r8)
            r1 = 0
            r2 = 0
            int r3 = (int) r10
            int r4 = (int) r11
            r6 = 1
            r0 = r7
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.share.utils.ShareUtils.zoomImage(android.graphics.Bitmap, double, double):android.graphics.Bitmap");
    }

    public static String appendQueryInOverrideMode(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ee7df8e", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.clearQuery();
            for (String str2 : map.keySet()) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
            for (String str3 : parse.getQueryParameterNames()) {
                if (!map.containsKey(str3)) {
                    buildUpon.appendQueryParameter(str3, parse.getQueryParameter(str3));
                }
            }
            return buildUpon.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
