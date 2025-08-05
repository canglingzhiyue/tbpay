package com.loc;

import android.content.Context;
import android.net.Proxy;
import android.os.Build;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;

/* loaded from: classes4.dex */
public final class v {
    private static String a() {
        String str;
        try {
            str = Proxy.getDefaultHost();
        } catch (Throwable th) {
            av.b(th, "pu", "gdh");
            str = null;
        }
        return str == null ? "null" : str;
    }

    private static String a(String str) {
        return x.c(str);
    }

    public static java.net.Proxy a(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 11 ? a(context, new URI("http://restsdk.amap.com")) : b(context);
        } catch (Throwable th) {
            av.b(th, "pu", "gp");
            return null;
        }
    }

    private static java.net.Proxy a(Context context, URI uri) {
        java.net.Proxy proxy;
        if (c(context)) {
            try {
                List<java.net.Proxy> select = ProxySelector.getDefault().select(uri);
                if (select == null || select.isEmpty() || (proxy = select.get(0)) == null) {
                    return null;
                }
                if (proxy.type() != Proxy.Type.DIRECT) {
                    return proxy;
                }
                return null;
            } catch (Throwable th) {
                av.b(th, "pu", "gpsc");
            }
        }
        return null;
    }

    private static int b() {
        try {
            return android.net.Proxy.getDefaultPort();
        } catch (Throwable th) {
            av.b(th, "pu", "gdp");
            return -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177 A[Catch: Throwable -> 0x0173, TRY_LEAVE, TryCatch #10 {Throwable -> 0x0173, blocks: (B:118:0x0168, B:125:0x0177), top: B:139:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105 A[Catch: all -> 0x00bf, TryCatch #14 {all -> 0x00bf, blocks: (B:7:0x002f, B:9:0x0035, B:11:0x0041, B:13:0x0049, B:15:0x004f, B:16:0x0057, B:18:0x005d, B:23:0x006a, B:74:0x00e5, B:83:0x00fa, B:85:0x0105, B:87:0x0119, B:89:0x011f, B:94:0x012b, B:98:0x0134, B:100:0x013a, B:102:0x0140, B:107:0x014c, B:39:0x008e, B:41:0x0094, B:42:0x009c, B:44:0x00a2, B:49:0x00af), top: B:145:0x0029 }] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.Proxy b(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.v.b(android.content.Context):java.net.Proxy");
    }

    private static boolean c(Context context) {
        return o.j(context) == 0;
    }
}
