package com.alibaba.ability.impl.photo;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Base64;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes2.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d INSTANCE;

    static {
        kge.a(1157253453);
        INSTANCE = new d();
    }

    private d() {
    }

    public final Bitmap a(String url) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("30dda510", new Object[]{this, url});
        }
        q.d(url, "url");
        Response syncSend = new DegradableNetwork(null).syncSend(new RequestImpl(url), null);
        if (syncSend == null || syncSend.getStatusCode() != 200 || syncSend.getBytedata() == null) {
            return null;
        }
        byte[] bytedata = syncSend.getBytedata();
        q.b(bytedata, "response.bytedata");
        if (bytedata.length == 0) {
            z = true;
        }
        if (!(!z)) {
            return null;
        }
        try {
            return BitmapFactory.decodeStream(new ByteArrayInputStream(syncSend.getBytedata()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Bitmap b(String url) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a657cb51", new Object[]{this, url});
        }
        q.d(url, "url");
        String substring = url.substring(n.a((CharSequence) url, ",", 0, false, 6, (Object) null) + 1);
        q.b(substring, "(this as java.lang.String).substring(startIndex)");
        try {
            Charset charset = kotlin.text.d.UTF_8;
            if (substring == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = substring.getBytes(charset);
            q.b(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] decode = Base64.decode(bytes, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean a(Context context, Bitmap bmp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3cc61d2", new Object[]{this, context, bmp})).booleanValue();
        }
        q.d(context, "context");
        q.d(bmp, "bmp");
        if (Build.VERSION.SDK_INT >= 29) {
            return b(context, bmp);
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        File file = new File(externalStoragePublicDirectory, String.valueOf(System.currentTimeMillis()) + ".jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bmp.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            MediaScannerConnection.scanFile(context, new String[]{file.getAbsolutePath()}, new String[]{"image/jpeg"}, null);
            return true;
        } catch (FileNotFoundException | IOException unused) {
            return false;
        }
    }

    private final boolean b(Context context, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd20b713", new Object[]{this, context, bitmap})).booleanValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", String.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", "image/jpeg");
        contentValues.put("is_pending", (Integer) 1);
        contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + File.separator + "mega_save_image");
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        FileOutputStream fileOutputStream = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        if (insert == null) {
            return false;
        }
        try {
            try {
                parcelFileDescriptor = contentResolver.openFileDescriptor(insert, "w", null);
                q.a(parcelFileDescriptor);
                FileOutputStream fileOutputStream2 = new FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                try {
                    if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2)) {
                        try {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                        return false;
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(insert, contentValues, null, null);
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                        parcelFileDescriptor.close();
                    } catch (IOException unused2) {
                    }
                    return true;
                } catch (IOException unused3) {
                    fileOutputStream = fileOutputStream2;
                    q.a(insert);
                    contentResolver.delete(insert, null, null);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                            return false;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                    if (parcelFileDescriptor != null) {
                        parcelFileDescriptor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException unused6) {
        }
    }
}
