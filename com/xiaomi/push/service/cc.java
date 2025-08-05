package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ig;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public class cc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f24690a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ig f988a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cc(Context context, ig igVar) {
        this.f24690a = context;
        this.f988a = igVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        RandomAccessFile randomAccessFile;
        synchronized (cb.f24689a) {
            FileLock fileLock = null;
            try {
                File file = new File(this.f24690a.getFilesDir(), "tiny_data.lock");
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
                    cb.c(this.f24690a, this.f988a);
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
}
