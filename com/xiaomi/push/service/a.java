package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f24627a;

    /* renamed from: a  reason: collision with other field name */
    private Context f901a;
    private volatile String e;
    private volatile String f;

    /* renamed from: a  reason: collision with other field name */
    private final Object f902a = new Object();
    private final Object b = new Object();

    /* renamed from: a  reason: collision with other field name */
    private final String f903a = "mipush_region";

    /* renamed from: b  reason: collision with other field name */
    private final String f904b = "mipush_country_code";
    private final String c = "mipush_region.lock";
    private final String d = "mipush_country_code.lock";

    public a(Context context) {
        this.f901a = context;
    }

    public static a a(Context context) {
        if (f24627a == null) {
            synchronized (a.class) {
                if (f24627a == null) {
                    f24627a = new a(context);
                }
            }
        }
        return f24627a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.RandomAccessFile, java.io.Closeable] */
    private String a(Context context, String str, String str2, Object obj) {
        FileLock fileLock;
        File file = new File(context.getFilesDir(), str);
        ?? r2 = 0;
        r2 = 0;
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.b.m1616a("No ready file to get data from " + str);
            return null;
        }
        synchronized (obj) {
            try {
                try {
                    File file2 = new File(context.getFilesDir(), str2);
                    com.xiaomi.push.x.m2368a(file2);
                    context = new RandomAccessFile(file2, "rw");
                } catch (Exception e) {
                    e = e;
                    context = 0;
                    fileLock = null;
                } catch (Throwable th) {
                    th = th;
                    context = 0;
                }
                try {
                    fileLock = context.getChannel().lock();
                } catch (Exception e2) {
                    e = e2;
                    fileLock = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r2 != 0 && r2.isValid()) {
                        try {
                            r2.release();
                        } catch (IOException e3) {
                            com.xiaomi.channel.commonutils.logger.b.a(e3);
                        }
                    }
                    com.xiaomi.push.x.a((Closeable) context);
                    throw th;
                }
                try {
                    String a2 = com.xiaomi.push.x.a(file);
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e4) {
                            com.xiaomi.channel.commonutils.logger.b.a(e4);
                        }
                    }
                    com.xiaomi.push.x.a((Closeable) context);
                    return a2;
                } catch (Exception e5) {
                    e = e5;
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e6) {
                            com.xiaomi.channel.commonutils.logger.b.a(e6);
                        }
                    }
                    com.xiaomi.push.x.a((Closeable) context);
                    return null;
                }
            } catch (Throwable th3) {
                th = th3;
                r2 = str;
            }
        }
    }

    private void a(Context context, String str, String str2, String str3, Object obj) {
        RandomAccessFile randomAccessFile;
        synchronized (obj) {
            FileLock fileLock = null;
            try {
                File file = new File(context.getFilesDir(), str3);
                com.xiaomi.push.x.m2368a(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (Exception e) {
                e = e;
                randomAccessFile = null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = null;
                if (fileLock != null) {
                    try {
                        fileLock.release();
                    } catch (IOException e2) {
                        com.xiaomi.channel.commonutils.logger.b.a(e2);
                    }
                }
                com.xiaomi.push.x.a(randomAccessFile);
                throw th;
            }
            try {
                try {
                    fileLock = randomAccessFile.getChannel().lock();
                    com.xiaomi.push.x.a(new File(context.getFilesDir(), str2), str);
                    if (fileLock != null && fileLock.isValid()) {
                        try {
                            fileLock.release();
                        } catch (IOException e3) {
                            com.xiaomi.channel.commonutils.logger.b.a(e3);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileLock != null && fileLock.isValid()) {
                        fileLock.release();
                    }
                    com.xiaomi.push.x.a(randomAccessFile);
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                com.xiaomi.channel.commonutils.logger.b.a(e);
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException e5) {
                        com.xiaomi.channel.commonutils.logger.b.a(e5);
                    }
                }
                com.xiaomi.push.x.a(randomAccessFile);
            }
            com.xiaomi.push.x.a(randomAccessFile);
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.e)) {
            this.e = a(this.f901a, "mipush_region", "mipush_region.lock", this.f902a);
        }
        return this.e;
    }

    public void a(String str, boolean z) {
        if (!TextUtils.equals(str, this.e)) {
            this.e = str;
        }
        if (z) {
            a(this.f901a, str, "mipush_region", "mipush_region.lock", this.f902a);
        }
    }

    public String b() {
        if (TextUtils.isEmpty(this.f)) {
            this.f = a(this.f901a, "mipush_country_code", "mipush_country_code.lock", this.b);
        }
        return this.f;
    }

    public void b(String str, boolean z) {
        if (!TextUtils.equals(str, this.f)) {
            this.f = str;
        }
        if (z) {
            a(this.f901a, str, "mipush_country_code", "mipush_region.lock", this.f902a);
        }
    }
}
