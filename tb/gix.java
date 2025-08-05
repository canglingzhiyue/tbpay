package tb;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.b;
import com.taobao.android.litecreator.comprehension.f;
import com.taobao.tao.util.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public class gix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-684054605);
    }

    public static String a(byte[] bArr, int i, int i2, int i3, int i4, String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29fb2519", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Float(f)});
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.equals(Constants.SHARETYPE_WITH_QRCODE, str) && !TextUtils.equals("image/jpeg", str)) {
            String str2 = "invalid image type:" + str;
            return "";
        }
        byte[] b = b(bArr, i, i2, i3, i4, a(str), f);
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        String str3 = "data:" + str + ";base64,";
        String encodeToString = Base64.encodeToString(b, 2);
        if (TextUtils.isEmpty(encodeToString)) {
            return "";
        }
        sb.append(str3);
        sb.append(encodeToString);
        return sb.toString();
    }

    public static String a(String str, String str2, float f) {
        Bitmap.CompressFormat compressFormat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7873ab5c", new Object[]{str, str2, new Float(f)});
        }
        String str3 = "png".equalsIgnoreCase(str2) ? "png" : f.FILE_TYPE_IMAGE_JPG;
        Bitmap bitmap = null;
        TextureView b = b.a().b(str);
        if (b != null) {
            bitmap = b.getBitmap();
        }
        if (bitmap == null) {
            return "data:,";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = (int) (f * 100.0f);
        if (TextUtils.equals(str3.toLowerCase(), "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        bitmap.compress(compressFormat, i, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length <= 0) {
            return "data:,";
        }
        String str4 = "data:" + str3 + ";base64,";
        String encodeToString = Base64.encodeToString(byteArray, 2);
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(encodeToString)) {
            return "data:,";
        }
        sb.append(str4);
        sb.append(encodeToString);
        return sb.toString();
    }

    public static String a(String str, boolean z, int i, int i2, int i3, int i4, int i5, int i6, String str2, float f, boolean z2) {
        Context context;
        Bitmap bitmap;
        Bitmap.CompressFormat compressFormat;
        OutputStream outputStream;
        int i7;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f138ec0", new Object[]{str, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), str2, new Float(f), new Boolean(z2)});
        }
        TextureView b = b.a().b(str);
        if (b == null || (context = b.getContext()) == null || (bitmap = b.getBitmap()) == null) {
            return null;
        }
        int i8 = (int) (f * 100.0f);
        if (TextUtils.equals(str2.toLowerCase(), "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if (!(context instanceof Activity)) {
            return null;
        }
        try {
            if (z2) {
                ContentResolver contentResolver = context.getContentResolver();
                ContentValues contentValues = new ContentValues();
                i7 = i8;
                contentValues.put("_display_name", "canvas-dat-" + System.currentTimeMillis() + "." + str2);
                contentValues.put("mime_type", compressFormat == Bitmap.CompressFormat.JPEG ? "image/jpeg" : Constants.SHARETYPE_WITH_QRCODE);
                Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (insert == null) {
                    return null;
                }
                outputStream = contentResolver.openOutputStream(insert);
                try {
                    Cursor query = contentResolver.query(insert, new String[]{"_data"}, null, null, null);
                    if (query == null) {
                        if (outputStream == null) {
                            return null;
                        }
                        try {
                            outputStream.close();
                            return null;
                        } catch (Exception unused) {
                            return null;
                        }
                    }
                    int columnIndexOrThrow = query.getColumnIndexOrThrow("_data");
                    query.moveToFirst();
                    String string = query.getString(columnIndexOrThrow);
                    query.close();
                    file = new File(string);
                } catch (Throwable th) {
                    th = th;
                    try {
                        Log.e("ImageUtils", "unable to save image data", th);
                        if (outputStream == null) {
                            return null;
                        }
                        try {
                            outputStream.close();
                            return null;
                        } catch (Exception unused2) {
                            return null;
                        }
                    } catch (Throwable th2) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Exception unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            } else {
                i7 = i8;
                File filesDir = context.getFilesDir();
                file = new File(filesDir, "canvas-dat-" + System.currentTimeMillis() + "." + str2);
                outputStream = new FileOutputStream(file);
            }
            Matrix matrix = new Matrix();
            int min = Math.min(i3, bitmap.getWidth());
            int min2 = Math.min(i4, bitmap.getHeight());
            matrix.postScale(Math.min(i5, bitmap.getWidth()) / min, Math.min(i6, bitmap.getHeight()) / min2);
            Bitmap.createBitmap(bitmap, Math.max(0, i), Math.max(0, i2), Math.max(0, min), Math.max(0, min2), matrix, false).compress(compressFormat, i7, outputStream);
            if (outputStream != null) {
                outputStream.flush();
            }
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            context.sendBroadcast(intent);
            String absolutePath = file.getAbsolutePath();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused4) {
                }
            }
            return absolutePath;
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2, int i3, int i4, String str, float f) {
        Bitmap.CompressFormat compressFormat;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e0240b97", new Object[]{bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), str, new Float(f)});
        }
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i5 = (int) (f * 100.0f);
        if (TextUtils.equals(str.toLowerCase(), "png")) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        Bitmap.createScaledBitmap(createBitmap, i3, i4, true).compress(compressFormat, i5, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : TextUtils.equals(Constants.SHARETYPE_WITH_QRCODE, str) ? "png" : TextUtils.equals("image/jpeg", str) ? f.FILE_TYPE_IMAGE_JPG : "";
    }
}
