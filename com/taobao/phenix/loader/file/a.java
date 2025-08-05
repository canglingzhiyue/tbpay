package com.taobao.phenix.loader.file;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.phenix.request.d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import tb.kge;
import tb.njf;

/* loaded from: classes.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18932a;

    static {
        kge.a(1795635661);
        kge.a(-1019889838);
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f18932a = z;
        }
    }

    @Override // com.taobao.phenix.loader.file.b
    public njf a(d dVar, String str, Map<String, String> map) throws IOException, Resources.NotFoundException, UnSupportedSchemeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njf) ipChange.ipc$dispatch("6f9efe42", new Object[]{this, dVar, str, map});
        }
        int i = dVar.f18940a;
        if (i != 33) {
            if (i == 34) {
                Context n = com.taobao.phenix.intf.b.h().n();
                if (n == null) {
                    throw new IOException("Phenix.with(Context) hasn't been called before FileLoader(asset) loading");
                }
                InputStream proxy_open = AssetsDelegate.proxy_open(n.getResources().getAssets(), dVar.i);
                return new njf(proxy_open, proxy_open.available());
            } else if (i == 36) {
                Context n2 = com.taobao.phenix.intf.b.h().n();
                if (n2 == null) {
                    throw new IOException("Phenix.with(Context) hasn't been called before FileLoader(resource) loading");
                }
                TypedValue typedValue = new TypedValue();
                InputStream openRawResource = n2.getResources().openRawResource(dVar.j, typedValue);
                return new njf(openRawResource, openRawResource.available(), typedValue);
            } else if (i == 40) {
                byte[] decode = Base64.decode(dVar.k, 0);
                return new njf(decode, 0, decode.length);
            } else if (i == 48) {
                try {
                    return com.taobao.phenix.intf.b.h().p().get(dVar.l).handleScheme(str);
                } catch (IndexOutOfBoundsException unused) {
                    throw new UnSupportedSchemeException(i);
                }
            } else {
                throw new UnSupportedSchemeException(i);
            }
        } else if (str.startsWith("content://")) {
            Context n3 = com.taobao.phenix.intf.b.h().n();
            if (n3 == null) {
                throw new IOException("Phenix.with(Context) hasn't been called before FileLoader UriContent loading");
            }
            InputStream openInputStream = n3.getContentResolver().openInputStream(Uri.parse(str));
            if (f18932a && Build.VERSION.SDK_INT >= 29 && (dVar.m == 1 || dVar.m == 3)) {
                byte[] thumbnail = new ExifInterface(openInputStream).getThumbnail();
                openInputStream.close();
                openInputStream = (thumbnail == null || thumbnail.length <= 0) ? n3.getContentResolver().openInputStream(Uri.parse(str)) : new ByteArrayInputStream(thumbnail);
            }
            return new njf(openInputStream, openInputStream.available());
        } else {
            String str2 = dVar.i;
            if (dVar.m == 1 || dVar.m == 3) {
                Context n4 = com.taobao.phenix.intf.b.h().n();
                if (n4 == null) {
                    throw new IOException("Phenix.with(Context) hasn't been called before FileLoader(thumbnail) loading");
                }
                String a2 = a(n4, str2, dVar.m, false);
                str2 = TextUtils.isEmpty(a2) ? a(n4, str2, dVar.m, true) : a2;
                if (TextUtils.isEmpty(str2) || !new File(str2).exists()) {
                    if (dVar.n) {
                        str2 = dVar.i;
                    } else {
                        throw new IOException("Retrieved thumbnail(type:" + dVar.m + ") failed from local path");
                    }
                }
            }
            File file = new File(str2);
            return new njf(new FileInputStream(file), (int) file.length());
        }
    }

    public String a(Context context, String str, int i, boolean z) {
        Uri uri;
        Cursor queryMiniThumbnail;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe7ad225", new Object[]{this, context, str, new Integer(i), new Boolean(z)});
        }
        long j = -1;
        if (z) {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        Uri uri2 = uri;
        ContentResolver contentResolver = context.getContentResolver();
        Cursor query = contentResolver.query(uri2, new String[]{"_id"}, "_data=?", new String[]{str}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                j = query.getInt(query.getColumnIndex("_id"));
            }
            query.close();
        }
        String str2 = null;
        if (j > 0) {
            if (z) {
                queryMiniThumbnail = contentResolver.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, new String[]{"_data"}, "video_id=" + j + " AND kind=" + i, null, null);
            } else {
                queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(contentResolver, j, i, null);
            }
            if (queryMiniThumbnail != null) {
                if (queryMiniThumbnail.moveToFirst()) {
                    str2 = queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndexOrThrow("_data"));
                }
                queryMiniThumbnail.close();
            }
        }
        return str2;
    }
}
