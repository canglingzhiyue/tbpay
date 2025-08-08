package com.taobao.livephoto.watermask;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.content.ContextCompat;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.f;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import tb.kge;
import tb.nmm;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(494457750);
    }

    public static void a(Bitmap bitmap, String str) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1b53710", new Object[]{bitmap, str});
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.exists()) {
                    file.delete();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e) {
                        AdapterForTLog.loge("VideoWaterMask", "saveBitmapToFile: ", e);
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    AdapterForTLog.loge("VideoWaterMask", "saveBitmapToFile: ", e);
                    if (fileOutputStream == null) {
                        return;
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        AdapterForTLog.loge("VideoWaterMask", "saveBitmapToFile: ", e3);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            AdapterForTLog.loge("VideoWaterMask", "saveBitmapToFile: ", e4);
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(Context context, String str) {
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (context == null) {
            return "";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "taobao life");
        contentValues.put("mime_type", "video/mp4");
        Uri insert = context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
                fileInputStream = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        openOutputStream.write(bArr, 0, read);
                    }
                    openOutputStream.close();
                    fileInputStream.close();
                    String path = insert.getPath();
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e);
                    }
                    return path;
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream2 = fileInputStream;
                    AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e);
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (IOException e3) {
                            AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e3);
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            AdapterForTLog.loge("VideoWaterMask", "copyVideoFileToSystemAlbum: ", e4);
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    public static String a(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9affa892", new Object[]{context, bitmap});
        }
        if (context == null) {
            return "";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", "taobao life");
        contentValues.put("mime_type", "image/jpeg");
        Uri insert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        if (insert == null) {
            return "";
        }
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(insert);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, openOutputStream);
            openOutputStream.close();
            return insert.getPath();
        } catch (IOException e) {
            AdapterForTLog.loge("VideoWaterMask", "savePicBufferToSystemAlbum: ", e);
            return "";
        }
    }

    public static boolean a(final ImageView imageView, final Drawable drawable, final String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9854189", new Object[]{imageView, drawable, str, bVar})).booleanValue();
        }
        if (imageView == null || drawable == null || StringUtils.isEmpty(str) || bVar == null) {
            return false;
        }
        final Context context = imageView.getContext();
        if (!a(context)) {
            a(context, new nmm() { // from class: com.taobao.livephoto.watermask.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nmm
                public void a(String[] strArr, int[] iArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e0ebed05", new Object[]{this, strArr, iArr});
                    } else if (a.a(context)) {
                        a.a(imageView, drawable, str, bVar);
                    } else {
                        Context context2 = context;
                        Toast.makeText(context2, context2.getString(R.string.request_permission), 1).show();
                    }
                }
            });
            return false;
        }
        String saveBitmapAsFile = WaterMaskView.saveBitmapAsFile(context, drawable, str);
        String str2 = context.getFilesDir().getPath() + File.separator + System.currentTimeMillis() + ".jpg";
        try {
            a(((BitmapDrawable) imageView.getDrawable()).getBitmap(), str2);
        } catch (Exception e) {
            bVar.d(e.toString());
            AdapterForTLog.loge("VideoWaterMask", "saveToAlbum: ", e);
        }
        final c cVar = new c(context);
        cVar.a(str2, saveBitmapAsFile, imageView.getDrawable().getIntrinsicWidth(), imageView.getDrawable().getIntrinsicHeight(), bVar);
        imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.livephoto.watermask.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else {
                    c.this.a();
                }
            }
        });
        return true;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : (context instanceof Activity) && ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static void a(Context context, nmm nmmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88921182", new Object[]{context, nmmVar});
        } else {
            f.a(context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(true).a("是否允许保存图片到相册").b("VideoWaterMask").a(nmmVar).a();
        }
    }
}
