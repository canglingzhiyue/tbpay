package com.uc.webview.base.io;

import android.text.TextUtils;
import com.uc.webview.base.Log;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final File f23788a;
    public final String b;
    private final boolean c;
    private RandomAccessFile d;
    private FileChannel e;
    private FileLock f;

    public b(File file) {
        this(file, false);
    }

    public b(File file, boolean z) {
        this(file, z, null);
    }

    public b(File file, boolean z, String str) {
        this.c = z;
        this.f23788a = new File(file.getAbsolutePath() + ".lk");
        this.b = TextUtils.isEmpty(str) ? "FileLocker" : "FileLocker.".concat(String.valueOf(str));
    }

    private void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                Log.w(this.b, "close failed", th);
            }
        }
    }

    public final void a() {
        if (this.f != null) {
            if (this.c) {
                return;
            }
            Log.d("FileLocker", "lock already");
            return;
        }
        try {
            this.d = new RandomAccessFile(this.f23788a, "rw");
            if (this.d == null) {
                Log.w(this.b, "lock raf null");
                return;
            }
        } catch (Throwable th) {
            try {
                Log.w(this.b, "lock raf failed", th);
                if (this.d == null) {
                    Log.w(this.b, "lock raf null");
                    return;
                }
            } catch (Throwable th2) {
                if (this.d != null) {
                    throw th2;
                }
                Log.w(this.b, "lock raf null");
                return;
            }
        }
        this.e = this.d.getChannel();
        if (!this.c) {
            String str = this.b;
            Log.d(str, "locking " + this.f23788a.getPath());
        }
        try {
            this.f = this.e.lock();
            if (this.c) {
                return;
            }
            String str2 = this.b;
            Log.d(str2, this.f23788a.getPath() + " locked");
        } catch (Throwable th3) {
            Log.w(this.b, "lock error ", th3);
        }
    }

    public final void b() {
        FileLock fileLock = this.f;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Throwable th) {
                String str = this.b;
                Log.w(str, "unlock failed: " + this.f23788a.getPath(), th);
            }
            this.f = null;
        }
        a(this.e);
        this.e = null;
        a(this.d);
        this.d = null;
        if (!this.c) {
            String str2 = this.b;
            Log.d(str2, this.f23788a.getPath() + " unlocked");
        }
    }
}
