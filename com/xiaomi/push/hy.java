package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public class hy {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f24538a = false;

    /* loaded from: classes9.dex */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Context f24539a;

        /* renamed from: a  reason: collision with other field name */
        private ib f494a;

        public a(Context context, ib ibVar) {
            this.f494a = ibVar;
            this.f24539a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            hy.c(this.f24539a, this.f494a);
        }
    }

    private static void a(Context context) {
        File file = new File(context.getFilesDir() + "/tdReadTemp");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static void a(Context context, ib ibVar) {
        ah.a(context).a(new a(context, ibVar));
    }

    private static void a(Context context, ib ibVar, File file, byte[] bArr) {
        BufferedInputStream bufferedInputStream;
        String str;
        int a2;
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[4];
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                loop0: while (true) {
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        try {
                            int read = bufferedInputStream.read(bArr2);
                            if (read != -1) {
                                if (read == 4) {
                                    a2 = ab.a(bArr2);
                                    if (a2 <= 0 || a2 > 10240) {
                                        break loop0;
                                    }
                                    byte[] bArr3 = new byte[a2];
                                    int read2 = bufferedInputStream.read(bArr3);
                                    if (read2 != a2) {
                                        str = "TinyData read from cache file failed cause buffer size not equal length. size:" + read2 + "__length:" + a2;
                                        break loop0;
                                    }
                                    byte[] a3 = h.a(bArr, bArr3);
                                    if (a3 != null && a3.length != 0) {
                                        ig igVar = new ig();
                                        jm.a(igVar, a3);
                                        igVar.a("item_size", String.valueOf(a3.length));
                                        arrayList.add(igVar);
                                        i++;
                                        i2 += a3.length;
                                        if (i >= 8 || i2 >= 10240) {
                                        }
                                    }
                                    com.xiaomi.channel.commonutils.logger.b.d("TinyData read from cache file failed cause decrypt fail");
                                } else {
                                    str = "TinyData read from cache file failed cause lengthBuffer error. size:" + read;
                                    break loop0;
                                }
                            } else {
                                break loop0;
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedInputStream2 = bufferedInputStream;
                            com.xiaomi.channel.commonutils.logger.b.a(e);
                            x.a((Closeable) bufferedInputStream2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            x.a((Closeable) bufferedInputStream);
                            throw th;
                        }
                    }
                    hz.a(context, ibVar, arrayList);
                    arrayList.clear();
                }
                str = "TinyData read from cache file failed cause lengthBuffer < 1 || too big. length:" + a2;
                com.xiaomi.channel.commonutils.logger.b.d(str);
                hz.a(context, ibVar, arrayList);
                if (file != null && file.exists() && !file.delete()) {
                    com.xiaomi.channel.commonutils.logger.b.m1616a("TinyData delete reading temp file failed");
                }
                x.a((Closeable) bufferedInputStream);
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream = bufferedInputStream2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private static void b(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 4).edit();
        edit.putLong("last_tiny_data_upload_timestamp", System.currentTimeMillis() / 1000);
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r11, com.xiaomi.push.ib r12) {
        /*
            java.lang.String r0 = "/"
            java.lang.String r1 = "/tdReadTemp"
            boolean r2 = com.xiaomi.push.hy.f24538a
            if (r2 != 0) goto Le0
            r2 = 1
            com.xiaomi.push.hy.f24538a = r2
            java.io.File r2 = new java.io.File
            java.io.File r3 = r11.getFilesDir()
            java.lang.String r4 = "tiny_data.data"
            r2.<init>(r3, r4)
            boolean r3 = r2.exists()
            java.lang.String r5 = "TinyData no ready file to get data."
            if (r3 != 0) goto L23
            com.xiaomi.channel.commonutils.logger.b.m1616a(r5)
            return
        L23:
            a(r11)
            byte[] r3 = com.xiaomi.push.service.cb.a(r11)
            r6 = 0
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.File r8 = r11.getFilesDir()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.lang.String r9 = "tiny_data.lock"
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            com.xiaomi.push.x.m2368a(r7)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.lang.String r9 = "rw"
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7e
            java.nio.channels.FileChannel r7 = r8.getChannel()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            java.nio.channels.FileLock r6 = r7.lock()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            r9.<init>()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            java.io.File r10 = r11.getFilesDir()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            r9.append(r10)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            r9.append(r1)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            r9.append(r0)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            r9.append(r4)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            r7.<init>(r9)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            r2.renameTo(r7)     // Catch: java.lang.Exception -> L79 java.lang.Throwable -> Lcb
            if (r6 == 0) goto L93
            boolean r2 = r6.isValid()
            if (r2 == 0) goto L93
            r6.release()     // Catch: java.io.IOException -> L77
            goto L93
        L77:
            r2 = move-exception
            goto L90
        L79:
            r2 = move-exception
            goto L80
        L7b:
            r11 = move-exception
            r8 = r6
            goto Lcc
        L7e:
            r2 = move-exception
            r8 = r6
        L80:
            com.xiaomi.channel.commonutils.logger.b.a(r2)     // Catch: java.lang.Throwable -> Lcb
            if (r6 == 0) goto L93
            boolean r2 = r6.isValid()
            if (r2 == 0) goto L93
            r6.release()     // Catch: java.io.IOException -> L8f
            goto L93
        L8f:
            r2 = move-exception
        L90:
            com.xiaomi.channel.commonutils.logger.b.a(r2)
        L93:
            com.xiaomi.push.x.a(r8)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.io.File r7 = r11.getFilesDir()
            r6.append(r7)
            r6.append(r1)
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            r2.<init>(r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto Lbe
            com.xiaomi.channel.commonutils.logger.b.m1616a(r5)
            return
        Lbe:
            a(r11, r12, r2, r3)
            r12 = 0
            com.xiaomi.push.hx.a(r12)
            b(r11)
            com.xiaomi.push.hy.f24538a = r12
            return
        Lcb:
            r11 = move-exception
        Lcc:
            if (r6 == 0) goto Ldc
            boolean r12 = r6.isValid()
            if (r12 == 0) goto Ldc
            r6.release()     // Catch: java.io.IOException -> Ld8
            goto Ldc
        Ld8:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r12)
        Ldc:
            com.xiaomi.push.x.a(r8)
            throw r11
        Le0:
            java.lang.String r11 = "TinyData extractTinyData is running"
            com.xiaomi.channel.commonutils.logger.b.m1616a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.hy.c(android.content.Context, com.xiaomi.push.ib):void");
    }
}
