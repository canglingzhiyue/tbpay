package com.xiaomi.push;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f24731a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a  reason: collision with other field name */
    private Context f1035a;

    /* renamed from: a  reason: collision with other field name */
    private RandomAccessFile f1036a;

    /* renamed from: a  reason: collision with other field name */
    private String f1037a;

    /* renamed from: a  reason: collision with other field name */
    private FileLock f1038a;

    private t(Context context) {
        this.f1035a = context;
    }

    public static t a(Context context, File file) {
        com.xiaomi.channel.commonutils.logger.b.c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (f24731a.add(str)) {
            t tVar = new t(context);
            tVar.f1037a = str;
            try {
                tVar.f1036a = new RandomAccessFile(file2, "rw");
                tVar.f1038a = tVar.f1036a.getChannel().lock();
                com.xiaomi.channel.commonutils.logger.b.c("Locked: " + str + " :" + tVar.f1038a);
                return tVar;
            } finally {
                if (tVar.f1038a == null) {
                    RandomAccessFile randomAccessFile = tVar.f1036a;
                    if (randomAccessFile != null) {
                        x.a(randomAccessFile);
                    }
                    f24731a.remove(tVar.f1037a);
                }
            }
        }
        throw new IOException("abtain lock failure");
    }

    public void a() {
        com.xiaomi.channel.commonutils.logger.b.c("unLock: " + this.f1038a);
        FileLock fileLock = this.f1038a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f1038a.release();
            } catch (IOException unused) {
            }
            this.f1038a = null;
        }
        RandomAccessFile randomAccessFile = this.f1036a;
        if (randomAccessFile != null) {
            x.a(randomAccessFile);
        }
        f24731a.remove(this.f1037a);
    }
}
