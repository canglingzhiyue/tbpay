package com.alibaba.wireless.security.framework.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private FileChannel f4289a = null;
    private FileLock b = null;
    private RandomAccessFile c = null;
    private File d = null;
    private boolean e;
    private String f;

    static {
        kge.a(888806068);
    }

    public b(Context context, String str) {
        this.e = true;
        this.f = null;
        this.f = str;
        this.e = c();
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        try {
            this.d = new File(this.f);
            if (this.d != null && !this.d.exists()) {
                this.d.createNewFile();
            }
        } catch (Exception unused) {
            File file = this.d;
            if (file != null && !file.exists()) {
                try {
                    this.d.createNewFile();
                } catch (Exception unused2) {
                }
            }
        }
        File file2 = this.d;
        return file2 != null && file2.exists();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            this.e = c();
            if (!this.e) {
                return true;
            }
        }
        try {
            if (this.d == null) {
                return false;
            }
            this.c = new RandomAccessFile(this.d, "rw");
            this.f4289a = this.c.getChannel();
            this.b = this.f4289a.lock();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (!this.e) {
            return true;
        }
        try {
            if (this.b != null) {
                this.b.release();
                this.b = null;
            }
        } catch (IOException unused) {
            z = false;
        }
        try {
            if (this.f4289a != null) {
                this.f4289a.close();
                this.f4289a = null;
            }
        } catch (IOException unused2) {
            z = false;
        }
        try {
            if (this.c == null) {
                return z;
            }
            this.c.close();
            this.c = null;
            return z;
        } catch (IOException unused3) {
            return false;
        }
    }
}
