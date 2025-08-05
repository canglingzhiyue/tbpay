package com.taobao.share.picturepassword;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.FileUtils;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import tb.acg;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_TEMP_DIR = "shareTempCache";

    static {
        kge.a(-1952711492);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : acg.a().getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29;
    }

    public static String a(Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("803f449", new Object[]{context, cursor});
        }
        if (a()) {
            File a2 = a(ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))), context);
            if (a2 == null) {
                return null;
            }
            return a2.getAbsolutePath();
        }
        return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    public static String b(Context context, Cursor cursor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a4ea928", new Object[]{context, cursor});
        }
        if (a()) {
            File a2 = a(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))), context);
            if (a2 == null) {
                return null;
            }
            return a2.getAbsolutePath();
        }
        return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    public static File a(Uri uri, Context context) {
        ContentResolver contentResolver;
        InputStream openInputStream;
        File file;
        FileOutputStream fileOutputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("cd62c4e4", new Object[]{uri, context});
        }
        File file2 = null;
        if (uri == null || uri.getScheme() == null) {
            return null;
        }
        if (uri.getPath() != null && uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals("content")) {
            return null;
        }
        String str = (System.currentTimeMillis() + Math.round((Math.random() + 1.0d) * 1000.0d)) + "." + MimeTypeMap.getSingleton().getExtensionFromMimeType(contentResolver.getType(uri));
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
            File file3 = new File(context.getCacheDir(), SHARE_TEMP_DIR);
            if (!file3.exists()) {
                file3.mkdirs();
            }
            file = new File(file3, str);
            fileOutputStream = new FileOutputStream(file);
            if (openInputStream != null) {
                FileUtils.copy(openInputStream, fileOutputStream);
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            fileOutputStream.close();
            if (openInputStream != null) {
                openInputStream.close();
            }
            return file;
        } catch (IOException e2) {
            e = e2;
            file2 = file;
            e.printStackTrace();
            return file2;
        }
    }

    public static Uri b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("def15b20", new Object[0]) : a() ? MediaStore.Images.Media.getContentUri(UiUtil.INPUT_TYPE_VALUE_EXTERNAL) : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    public static Uri c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("eb8a50a1", new Object[0]) : a() ? MediaStore.Images.Media.getContentUri("internal") : MediaStore.Images.Media.INTERNAL_CONTENT_URI;
    }

    public static boolean a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a979fe3", new Object[]{file})).booleanValue();
        }
        if (file == null) {
            return false;
        }
        if (file.isDirectory()) {
            b(file);
        }
        try {
            return file.delete();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void b(File file) {
        File[] listFiles;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584201a0", new Object[]{file});
        } else if (file != null && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                a(file2);
            }
        }
    }
}
