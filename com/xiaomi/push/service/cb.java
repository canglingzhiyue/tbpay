package com.xiaomi.push.service;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.xiaomi.push.ig;
import com.xiaomi.push.jm;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes9.dex */
public class cb {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f24689a = new Object();

    public static void a(Context context, ig igVar) {
        if (!ca.a(igVar.e())) {
            return;
        }
        com.xiaomi.push.ah.a(context).a(new cc(context, igVar));
    }

    public static byte[] a(Context context) {
        String a2 = com.xiaomi.push.n.a(context).a("mipush", "td_key", "");
        if (StringUtils.isEmpty(a2)) {
            a2 = com.xiaomi.push.bm.a(20);
            com.xiaomi.push.n.a(context).m2211a("mipush", "td_key", a2);
        }
        return a(a2);
    }

    private static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(com.xiaomi.push.bj.m1740a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    public static void c(Context context, ig igVar) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        ?? a2 = a(context);
        try {
            try {
                byte[] b = com.xiaomi.push.h.b(a2, jm.a(igVar));
                if (b != null && b.length > 0) {
                    if (b.length > 10240) {
                        com.xiaomi.channel.commonutils.logger.b.m1616a("TinyData write to cache file failed case too much data content item:" + igVar.d() + "  ts:" + System.currentTimeMillis());
                        com.xiaomi.push.x.a((Closeable) null);
                        com.xiaomi.push.x.a((Closeable) null);
                        return;
                    }
                    BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                    try {
                        bufferedOutputStream3.write(com.xiaomi.push.ab.a(b.length));
                        bufferedOutputStream3.write(b);
                        bufferedOutputStream3.flush();
                        com.xiaomi.push.x.a((Closeable) null);
                        com.xiaomi.push.x.a(bufferedOutputStream3);
                        return;
                    } catch (IOException e) {
                        bufferedOutputStream2 = bufferedOutputStream3;
                        e = e;
                        com.xiaomi.channel.commonutils.logger.b.a("TinyData write to cache file failed cause io exception item:" + igVar.d(), e);
                        com.xiaomi.push.x.a((Closeable) null);
                        com.xiaomi.push.x.a(bufferedOutputStream2);
                        return;
                    } catch (Exception e2) {
                        bufferedOutputStream = bufferedOutputStream3;
                        e = e2;
                        com.xiaomi.channel.commonutils.logger.b.a("TinyData write to cache file  failed item:" + igVar.d(), e);
                        com.xiaomi.push.x.a((Closeable) null);
                        com.xiaomi.push.x.a(bufferedOutputStream);
                        return;
                    } catch (Throwable th) {
                        a2 = bufferedOutputStream3;
                        th = th;
                        com.xiaomi.push.x.a((Closeable) null);
                        com.xiaomi.push.x.a((Closeable) a2);
                        throw th;
                    }
                }
                com.xiaomi.channel.commonutils.logger.b.m1616a("TinyData write to cache file failed case encryption fail item:" + igVar.d() + "  ts:" + System.currentTimeMillis());
                com.xiaomi.push.x.a((Closeable) null);
                com.xiaomi.push.x.a((Closeable) null);
            } catch (IOException e3) {
                e = e3;
                bufferedOutputStream2 = null;
            } catch (Exception e4) {
                e = e4;
                bufferedOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                a2 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
