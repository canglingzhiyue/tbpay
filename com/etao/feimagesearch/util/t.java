package com.etao.feimagesearch.util;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.cip.capture.components.AlbumMediaItem;
import com.huawei.hms.adapter.internal.CommonCode;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.JvmStatic;
import tb.com;
import tb.kge;

/* loaded from: classes4.dex */
public final class t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final t INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f7034a;
    private static final String[] b;
    private static final Set<String> c;

    static {
        kge.a(680859093);
        INSTANCE = new t();
        f7034a = new String[]{"_id", "_data", "date_modified", "_display_name", "orientation"};
        b = new String[]{"_id", "_data", "date_modified", "duration", CommonCode.MapKey.HAS_RESOLUTION};
        c = kotlin.collections.ao.b("screenshot", "截屏", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap");
    }

    private t() {
    }

    @JvmStatic
    public static final List<AlbumMediaItem> a(long j) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4c8f176b", new Object[]{new Long(j)});
        }
        ArrayList arrayList = new ArrayList();
        if (j <= 0) {
            return arrayList;
        }
        Cursor cursor = null;
        try {
            if (Build.VERSION.SDK_INT > 29) {
                Application b2 = com.b();
                kotlin.jvm.internal.q.a((Object) b2, "GlobalAdapter.getCtx()");
                ContentResolver contentResolver = b2.getContentResolver();
                Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = f7034a;
                Bundle bundle = new Bundle();
                bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
                bundle.putInt("android:query-arg-sort-direction", 1);
                bundle.putInt("android:query-arg-limit", (int) j);
                cursor = contentResolver.query(uri, strArr, bundle, null);
            } else {
                String str = "date_added DESC LIMIT " + j;
                Application b3 = com.b();
                kotlin.jvm.internal.q.a((Object) b3, "GlobalAdapter.getCtx()");
                cursor = b3.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, f7034a, null, null, str);
            }
        } catch (Exception unused) {
        }
        if (cursor != null) {
            while (cursor.moveToNext() && i < j) {
                AlbumMediaItem a2 = INSTANCE.a(cursor);
                if (a2 != null) {
                    arrayList.add(a2);
                    i++;
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    @JvmStatic
    public static final List<com.etao.feimagesearch.album.o> a(Activity context, boolean z, long j) {
        Uri uri;
        Cursor cursor;
        com.etao.feimagesearch.album.o c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9fe3cb5d", new Object[]{context, new Boolean(z), new Long(j)});
        }
        kotlin.jvm.internal.q.c(context, "context");
        ArrayList arrayList = new ArrayList();
        if (j <= 0) {
            return arrayList;
        }
        if (z) {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        try {
            cursor = context.getContentResolver().query(uri, z ? f7034a : b, "date_added >= ?", new String[]{String.valueOf(j / 1000)}, "date_added DESC");
        } catch (Exception unused) {
            cursor = null;
        }
        if (cursor != null) {
            while (cursor.moveToNext()) {
                if (z) {
                    c2 = INSTANCE.b(cursor);
                } else {
                    c2 = INSTANCE.c(cursor);
                }
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
            cursor.close();
        }
        return arrayList;
    }

    public final boolean a(com.etao.feimagesearch.album.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238d8adb", new Object[]{this, oVar})).booleanValue();
        }
        if (oVar == null) {
            return false;
        }
        String h = oVar.h();
        if (!TextUtils.isEmpty(h)) {
            return new File(h).exists();
        }
        return false;
    }

    public final String b(com.etao.feimagesearch.album.o oVar) {
        String parent;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e5d21148", new Object[]{this, oVar}) : (oVar == null || !a(oVar) || (parent = new File(oVar.h()).getParent()) == null) ? "" : parent;
    }

    @JvmStatic
    public static final com.etao.feimagesearch.album.o a(Activity context, Uri uri, boolean z) {
        com.etao.feimagesearch.album.o b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.album.o) ipChange.ipc$dispatch("ad247ebe", new Object[]{context, uri, new Boolean(z)});
        }
        kotlin.jvm.internal.q.c(context, "context");
        kotlin.jvm.internal.q.c(uri, "uri");
        Cursor cursor = null;
        com.etao.feimagesearch.album.o oVar = null;
        try {
            if (z) {
                cursor = context.getContentResolver().query(uri, b, null, null, null);
            } else {
                cursor = context.getContentResolver().query(uri, f7034a, null, null, null);
            }
        } catch (Exception unused) {
        }
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                if (z) {
                    b2 = INSTANCE.c(cursor);
                } else {
                    b2 = INSTANCE.b(cursor);
                }
                oVar = b2;
            }
            cursor.close();
        }
        return oVar;
    }

    @JvmStatic
    public static final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (str != null && !TextUtils.isEmpty(str)) {
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.q.a((Object) locale, "Locale.getDefault()");
            String lowerCase = str.toLowerCase(locale);
            kotlin.jvm.internal.q.b(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            for (String str2 : c) {
                if (kotlin.text.n.b((CharSequence) lowerCase, (CharSequence) str2, false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final AlbumMediaItem a(Cursor cursor) {
        String str;
        long j;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (AlbumMediaItem) ipChange.ipc$dispatch("af990af2", new Object[]{this, cursor});
        }
        try {
            str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                kotlin.jvm.internal.q.a();
            }
            if (new File(str).exists()) {
                long j2 = 0;
                try {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    try {
                        i = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
                        j2 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    j = 0;
                }
                AlbumMediaItem albumMediaItem = new AlbumMediaItem();
                albumMediaItem.id = String.valueOf(j);
                albumMediaItem.imgFilePath = str;
                albumMediaItem.imgUri = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, albumMediaItem.id);
                albumMediaItem.lastUpdateTime = String.valueOf(j2);
                albumMediaItem.orientation = String.valueOf(i);
                return albumMediaItem;
            }
        }
        return null;
    }

    private final com.etao.feimagesearch.album.o b(Cursor cursor) {
        String str;
        long j;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.album.o) ipChange.ipc$dispatch("4b0a79b7", new Object[]{this, cursor});
        }
        try {
            str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                kotlin.jvm.internal.q.a();
            }
            if (new File(str).exists()) {
                long j2 = 0;
                try {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    try {
                        i = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
                        j2 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    j = 0;
                }
                return new com.etao.feimagesearch.album.o(j, str, i, j2, a(str));
            }
        }
        return null;
    }

    private final com.etao.feimagesearch.album.o c(Cursor cursor) {
        String str;
        long j;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.etao.feimagesearch.album.o) ipChange.ipc$dispatch("5801a38", new Object[]{this, cursor});
        }
        try {
            str = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        } catch (Exception unused) {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                kotlin.jvm.internal.q.a();
            }
            if (new File(str).exists()) {
                long j3 = 0;
                try {
                    j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                    try {
                        j2 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
                        try {
                            j3 = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        j2 = 0;
                    }
                } catch (Exception unused4) {
                    j = 0;
                    j2 = 0;
                }
                return new com.etao.feimagesearch.album.o(j, str, "", j2, j3, false);
            }
        }
        return null;
    }
}
