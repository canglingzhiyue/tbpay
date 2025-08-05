package com.taobao.monitor.performance.cpu;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f18214a;
    private final byte[] b;
    private RandomAccessFile c;

    public d(String str, byte[] bArr) throws ParseException {
        this.f18214a = str;
        this.b = bArr;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int i = -1;
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.seek(0L);
            } catch (IOException unused) {
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.c == null) {
            try {
                try {
                    this.c = new RandomAccessFile(this.f18214a, "r");
                    i = this.c.read(this.b);
                } catch (IOException e) {
                    throw new ParseException("RAF err: " + e.getMessage());
                }
            } finally {
                b();
            }
        }
        return i;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile == null) {
            return;
        }
        try {
            randomAccessFile.close();
        } catch (IOException unused) {
        } finally {
            this.c = null;
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            b();
        }
    }
}
