package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.NotificationManagerCompat;
import android.taobao.windvane.cache.a;
import android.taobao.windvane.cache.c;
import android.taobao.windvane.util.d;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class ado {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOCAL_CAPTURE_IMAGE = "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=";
    public static final String URL_DATA_CHAR = "?";
    public static final String URL_SEPARATOR = "//";

    static {
        kge.a(-460348101);
    }

    public static long a(Bitmap bitmap) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acc0f2ba", new Object[]{bitmap})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        c cVar = new c();
        cVar.c = d.a("//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + currentTimeMillis);
        cVar.d = "image/jpeg";
        cVar.f1551a = System.currentTimeMillis() + android.taobao.windvane.cache.d.DEFAULT_MAX_AGE;
        a.a().a(cVar, new byte[]{0});
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File(a.a().a(true), cVar.c));
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream2);
                fileOutputStream2.close();
                return currentTimeMillis;
            } catch (Exception unused) {
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                return 0L;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(android.graphics.Bitmap r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ado.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.String r4 = "1a8a4cdb"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = 0
            if (r4 == 0) goto L53
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            r1.<init>()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L3a
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L49
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L49
            r1.flush()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L49
            r1.close()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L49
            byte[] r4 = r1.toByteArray()     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L49
            r2 = 2
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r2)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L49
            r0 = r1
            goto L54
        L35:
            r4 = move-exception
            goto L3c
        L37:
            r4 = move-exception
            r1 = r0
            goto L4a
        L3a:
            r4 = move-exception
            r1 = r0
        L3c:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L49
            if (r1 == 0) goto L47
            r1.flush()     // Catch: java.lang.Exception -> L47
            r1.close()     // Catch: java.lang.Exception -> L47
        L47:
            r4 = r0
            goto L5c
        L49:
            r4 = move-exception
        L4a:
            if (r1 == 0) goto L52
            r1.flush()     // Catch: java.lang.Exception -> L52
            r1.close()     // Catch: java.lang.Exception -> L52
        L52:
            throw r4
        L53:
            r4 = r0
        L54:
            if (r0 == 0) goto L5c
            r0.flush()     // Catch: java.lang.Exception -> L5c
            r0.close()     // Catch: java.lang.Exception -> L5c
        L5c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ado.b(android.graphics.Bitmap):java.lang.String");
    }

    public static String a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb9022d9", new Object[]{l});
        }
        return "//127.0.0.1/wvcache/photo.jpg?_wvcrc=1&t=" + l;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?");
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        if (str.startsWith(URL_SEPARATOR)) {
            str = "http:" + str;
        } else if (!str.contains(HttpConstant.SCHEME_SPLIT)) {
            str = k.HTTP_PREFIX + str;
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            return parse.getHost();
        }
        return null;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : NotificationManagerCompat.from(context).areNotificationsEnabled();
    }
}
