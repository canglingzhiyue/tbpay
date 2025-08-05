package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.Buffer;
import com.alipay.android.msp.framework.okio.BufferedSource;
import com.alipay.android.msp.framework.okio.ByteString;
import com.alipay.android.msp.framework.okio.Okio;
import com.alipay.android.msp.framework.okio.Source;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class WireInput {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int RECURSION_LIMIT = 64;

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f4910a = Charset.forName("UTF-8");
    private final BufferedSource b;
    private int d;
    public int recursionDepth;
    private int c = 0;
    private int e = Integer.MAX_VALUE;

    public static int decodeZigZag32(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c158081a", new Object[]{new Integer(i)})).intValue() : (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63746edd", new Object[]{new Long(j)})).longValue() : (-(j & 1)) ^ (j >>> 1);
    }

    public static WireInput newInstance(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("14e9a06c", new Object[]{bArr}) : new WireInput(new Buffer().mo526write(bArr));
    }

    public static WireInput newInstance(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("dd06440c", new Object[]{bArr, new Integer(i), new Integer(i2)}) : new WireInput(new Buffer().mo527write(bArr, i, i2));
    }

    public static WireInput newInstance(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("49348e00", new Object[]{inputStream}) : new WireInput(Okio.buffer(Okio.source(inputStream)));
    }

    public static WireInput newInstance(Source source) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireInput) ipChange.ipc$dispatch("c858bdf9", new Object[]{source}) : new WireInput(Okio.buffer(source));
    }

    public final void checkLastTagWas(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8ee52f", new Object[]{this, new Integer(i)});
        } else if (this.d != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final String readString() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab067412", new Object[]{this});
        }
        int readVarint32 = readVarint32();
        this.c += readVarint32;
        return this.b.readString(readVarint32, f4910a);
    }

    public final ByteString readBytes() throws IOException {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteString) ipChange.ipc$dispatch("5fdeedd0", new Object[]{this}) : readBytes(readVarint32());
    }

    public final ByteString readBytes(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteString) ipChange.ipc$dispatch("8a480ba5", new Object[]{this, new Integer(i)});
        }
        this.c += i;
        long j = i;
        this.b.require(j);
        return this.b.readByteString(j);
    }

    public final int readVarint32() throws IOException {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34ca3d77", new Object[]{this})).intValue();
        }
        this.c++;
        byte readByte = this.b.readByte();
        if (readByte >= 0) {
            return readByte;
        }
        int i2 = readByte & Byte.MAX_VALUE;
        this.c++;
        byte readByte2 = this.b.readByte();
        if (readByte2 >= 0) {
            i = readByte2 << 7;
        } else {
            i2 |= (readByte2 & Byte.MAX_VALUE) << 7;
            this.c++;
            byte readByte3 = this.b.readByte();
            if (readByte3 >= 0) {
                i = readByte3 << 14;
            } else {
                i2 |= (readByte3 & Byte.MAX_VALUE) << 14;
                this.c++;
                byte readByte4 = this.b.readByte();
                if (readByte4 < 0) {
                    int i3 = i2 | ((readByte4 & Byte.MAX_VALUE) << 21);
                    this.c++;
                    byte readByte5 = this.b.readByte();
                    int i4 = i3 | (readByte5 << 28);
                    if (readByte5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        this.c++;
                        if (this.b.readByte() >= 0) {
                            return i4;
                        }
                    }
                    throw new IOException("WireInput encountered a malformed varint.");
                }
                i = readByte4 << 21;
            }
        }
        return i2 | i;
    }

    public final long readVarint64() throws IOException {
        byte readByte;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a04f657", new Object[]{this})).longValue();
        }
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            this.c++;
            j |= (readByte & Byte.MAX_VALUE) << i;
            if ((this.b.readByte() & 128) == 0) {
                return j;
            }
        }
        throw new IOException("WireInput encountered a malformed varint.");
    }

    public final int readFixed32() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e99f5857", new Object[]{this})).intValue();
        }
        this.c += 4;
        return this.b.readIntLe();
    }

    public final long readFixed64() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeda1137", new Object[]{this})).longValue();
        }
        this.c += 8;
        return this.b.readLongLe();
    }

    private WireInput(BufferedSource bufferedSource) {
        this.b = bufferedSource;
    }

    public final int pushLimit(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d05b432e", new Object[]{this, new Integer(i)})).intValue();
        }
        if (i < 0) {
            throw new IOException("Encountered a negative size");
        }
        int i2 = i + this.c;
        int i3 = this.e;
        if (i2 > i3) {
            throw new EOFException("The input ended unexpectedly in the middle of a field");
        }
        this.e = i2;
        return i3;
    }

    public final void popLimit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df22edb2", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final long getPosition() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("62e7f39a", new Object[]{this})).longValue() : this.c;
    }

    public final void skipGroup() throws IOException {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d061cc7", new Object[]{this});
            return;
        }
        do {
            int readTag = readTag();
            if (readTag == 0) {
                return;
            }
            switch (WireType.valueOf(readTag)) {
                case VARINT:
                    readVarint64();
                    break;
                case FIXED32:
                    readFixed32();
                    break;
                case FIXED64:
                    readFixed64();
                    break;
                case LENGTH_DELIMITED:
                    long readVarint32 = readVarint32();
                    this.c = (int) (this.c + readVarint32);
                    this.b.skip(readVarint32);
                    break;
                case START_GROUP:
                    skipGroup();
                    checkLastTagWas((readTag & (-8)) | WireType.END_GROUP.value());
                    break;
                case END_GROUP:
                    z = true;
                    continue;
                default:
                    throw new AssertionError();
            }
            z = false;
            continue;
        } while (!z);
    }

    public final int readTag() throws IOException {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7787509e", new Object[]{this})).intValue();
        }
        if (getPosition() != this.e) {
            z = this.b.exhausted();
        }
        if (z) {
            this.d = 0;
            return 0;
        }
        this.d = readVarint32();
        int i = this.d;
        if (i == 0) {
            throw new IOException("Protocol message contained an invalid tag (zero).");
        }
        return i;
    }
}
