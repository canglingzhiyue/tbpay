package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.dict.ZstdDecompressDict;

/* loaded from: classes3.dex */
public class ZstdStreamInflater {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ZstdStreamInflater";
    private byte[] buf;
    private boolean frameFinished;
    private int len;
    private int off;
    private int pos;
    private long streamPtr;
    private long totalDecompressed;
    private long totalRaw;

    private native long createDStream();

    private native int decompressStream(long j, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native int destroyDStream(long j);

    private static native void initIDs();

    static {
        Zstd.a();
        initIDs();
    }

    public ZstdStreamInflater() {
        Zstd.b();
        this.buf = new byte[0];
        this.len = 0;
        this.off = 0;
        this.pos = 0;
        this.frameFinished = false;
        this.totalDecompressed = 0L;
        this.totalRaw = 0L;
        this.streamPtr = createDStream();
    }

    public void loadDict(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0de184a", new Object[]{this, bArr});
            return;
        }
        synchronized (this) {
            ensureOpen();
            ZstdDecompressDict.a(this.streamPtr, bArr);
        }
    }

    public void setDict(ZstdDecompressDict zstdDecompressDict) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c87d7d5a", new Object[]{this, zstdDecompressDict});
            return;
        }
        synchronized (this) {
            ensureOpen();
            ZstdDecompressDict.a(this.streamPtr, zstdDecompressDict);
        }
    }

    public void setInput(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f866b8f6", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
        } else if (bArr == null || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IllegalArgumentException();
        } else {
            synchronized (this) {
                this.buf = bArr;
                this.off = i;
                this.len = i2;
                this.pos = 0;
                this.totalRaw += this.len;
            }
        }
    }

    public void setInput(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa18616", new Object[]{this, bArr});
        } else {
            setInput(bArr, 0, bArr.length);
        }
    }

    public boolean allInputDecompressed() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb14b716", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            if (this.len == 0 || this.pos == this.len) {
                z = true;
            }
        }
        return z;
    }

    public boolean frameFinished() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b586fe0a", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            z = this.frameFinished;
        }
        return z;
    }

    public long getTotalRaw() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bcb6c335", new Object[]{this})).longValue() : this.totalRaw;
    }

    public long getTotalDecompressed() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d81a03eb", new Object[]{this})).longValue() : this.totalDecompressed;
    }

    public int decompress(byte[] bArr) throws IllegalArgumentException, IllegalStateException, ZstdException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4f6e424", new Object[]{this, bArr})).intValue() : decompress(bArr, 0, bArr.length);
    }

    public int decompress(byte[] bArr, int i, int i2) throws IllegalArgumentException, IllegalStateException, ZstdException {
        int decompressStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62dcfc44", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        if (bArr == null || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IllegalArgumentException();
        }
        synchronized (this) {
            ensureOpen();
            decompressStream = decompressStream(this.streamPtr, bArr, i, i2, this.buf, this.off, this.len);
            long j = decompressStream;
            Zstd.a(j);
            this.totalDecompressed += j;
        }
        return decompressStream;
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        synchronized (this) {
            if (this.streamPtr != 0) {
                destroyDStream(this.streamPtr);
                this.streamPtr = 0L;
                this.buf = null;
            }
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            close();
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        synchronized (this) {
            ensureOpen();
            resetStream(this.streamPtr);
            this.len = 0;
            this.off = 0;
            this.pos = 0;
            this.frameFinished = false;
            this.totalDecompressed = 0L;
            this.totalRaw = 0L;
        }
    }

    private void ensureOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4788582f", new Object[]{this});
        } else if (this.streamPtr == 0) {
            throw new IllegalStateException("ZstdStreamInflater has been closed");
        }
    }

    private void resetStream(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ed56ce", new Object[]{this, new Long(j)});
        } else {
            Zstd.c(j, 1);
        }
    }
}
