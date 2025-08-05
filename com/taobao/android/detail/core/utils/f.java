package com.taobao.android.detail.core.utils;

import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.al;
import com.taobao.taobao.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes4.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-674348562);
        emu.a("com.taobao.android.detail.core.utils.DetailPermissionUtils");
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : (context == null || context.getApplicationInfo() == null || context.getApplicationInfo().targetSdkVersion < 33) ? false : true;
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{context})).booleanValue() : a(context) && Build.VERSION.SDK_INT >= 29;
    }

    public static void a(Context context, Application application, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27964e", new Object[]{context, application, aVar});
            return;
        }
        com.taobao.android.detail.core.event.basic.h hVar = new com.taobao.android.detail.core.event.basic.h();
        hVar.b = new Runnable() { // from class: com.taobao.android.detail.core.utils.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                }
            }
        };
        hVar.f9703a = new Runnable() { // from class: com.taobao.android.detail.core.utils.f.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar2 = a.this;
                if (aVar2 == null) {
                    return;
                }
                aVar2.a();
            }
        };
        hVar.c = b(application);
        hVar.d = com.alibaba.ability.localization.b.a(R.string.x_detail_app_album_permissions);
        com.taobao.android.detail.core.event.basic.g gVar = new com.taobao.android.detail.core.event.basic.g();
        gVar.f9702a = hVar;
        com.taobao.android.trade.event.f.a(context).a(gVar);
    }

    public static String[] b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("6f4b820e", new Object[]{context});
        }
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        if (!a(context)) {
            return strArr;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            return new String[]{al.READ_MEDIA_IMAGES, al.READ_MEDIA_VISUAL_USER_SELECTED};
        }
        return Build.VERSION.SDK_INT == 33 ? new String[]{al.READ_MEDIA_IMAGES} : strArr;
    }

    public static boolean a(Context context, Bitmap bitmap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69b5f41c", new Object[]{context, bitmap, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", str);
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("datetaken", Long.valueOf(currentTimeMillis));
        contentValues.put("date_modified", Long.valueOf(currentTimeMillis));
        contentValues.put("width", Integer.valueOf(bitmap.getWidth()));
        contentValues.put("height", Integer.valueOf(bitmap.getHeight()));
        OutputStream outputStream = null;
        try {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                if (insert == null) {
                    i.a("DetailPermissionUtils", "saveToMediaStoreForQ insert failed: uri = null");
                    ecg.j(context, "uri is null");
                    return false;
                }
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (IOException e) {
                        i.a("DetailPermissionUtils", "close OutputStream exception:" + e);
                    }
                }
                return true;
            } catch (Exception e2) {
                i.a("DetailPermissionUtils", "saveToMediaStoreForQ to Mediastore failed: " + e2);
                ecg.j(context, e2.getMessage());
                if (0 != 0) {
                    try {
                        outputStream.close();
                    } catch (IOException e3) {
                        i.a("DetailPermissionUtils", "close OutputStream exception:" + e3);
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (IOException e4) {
                    i.a("DetailPermissionUtils", "close OutputStream exception:" + e4);
                }
            }
            throw th;
        }
    }

    public static boolean a(Context context, String str, Bitmap bitmap, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27afa812", new Object[]{context, str, bitmap, str2})).booleanValue();
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (externalStoragePublicDirectory != null) {
            if (a(context, externalStoragePublicDirectory.getPath() + File.separator + "taobao" + File.separator, str, bitmap)) {
                return true;
            }
        }
        if (context != null) {
            externalStoragePublicDirectory = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        } else if (!TextUtils.isEmpty(str2)) {
            externalStoragePublicDirectory = new File(str2);
        }
        if (externalStoragePublicDirectory == null) {
            return false;
        }
        return a(context, externalStoragePublicDirectory.getPath() + File.separator, str, bitmap);
    }

    public static boolean a(Context context, String str, String str2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b85fb3e", new Object[]{context, str, str2, bitmap})).booleanValue();
        }
        File file = new File(str + str2);
        File parentFile = file.getParentFile();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (!parentFile.exists()) {
                    parentFile.mkdirs();
                }
                i.d("DetailPermissionUtils", "save bitmap to " + file.getPath());
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(Uri.fromFile(new File(file.getPath())));
                    if (context != null) {
                        context.sendBroadcast(intent);
                    }
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        i.a("DetailPermissionUtils", "saveToFile close FileOutputStream exception", e);
                    }
                    return true;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    i.a("DetailPermissionUtils", "saveToFile exception", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            i.a("DetailPermissionUtils", "saveToFile close FileOutputStream exception", e3);
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            i.a("DetailPermissionUtils", "saveToFile close FileOutputStream exception", e4);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }
}
