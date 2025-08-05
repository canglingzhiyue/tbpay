package com.alibaba.jsi.standard.js;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import tb.kge;

/* loaded from: classes2.dex */
public class e extends o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int kArrayBuffer = 0;
    public static final int kBigInt64Array = 12;
    public static final int kBigUint64Array = 11;
    public static final int kFloat32Array = 9;
    public static final int kFloat64Array = 10;
    public static final int kInt16Array = 6;
    public static final int kInt32Array = 8;
    public static final int kInt8Array = 4;
    public static final int kSharedArrayBuffer = 1;
    public static final int kUint16Array = 5;
    public static final int kUint32Array = 7;
    public static final int kUint8Array = 2;
    public static final int kUint8ClampedArray = 3;
    private int c;
    private int d;
    private int e;
    private int f;
    private ByteBuffer g;

    static {
        kge.a(631441196);
    }

    @Override // com.alibaba.jsi.standard.js.w
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public e(com.alibaba.jsi.standard.d dVar, int i, int i2) {
        super(dVar, Bridge.createNative(dVar, 11, i, i2));
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = null;
    }

    public e(com.alibaba.jsi.standard.d dVar, int i, ByteBuffer byteBuffer) {
        super(dVar, 0L);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = null;
        if (byteBuffer == null) {
            throw new NullPointerException("buffer can not be null!");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("buffer must be a direct ByteBuffer!");
        }
        this.g = byteBuffer;
        this.b = Bridge.createNative(dVar, 11, i, byteBuffer.limit(), new Object[]{byteBuffer});
        com.alibaba.jsi.standard.f.a(dVar, this);
    }

    public e(com.alibaba.jsi.standard.d dVar, long j) {
        super(dVar, j);
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = null;
    }

    public ByteBuffer a(com.alibaba.jsi.standard.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("3f19f5f6", new Object[]{this, dVar});
        }
        m();
        if (this.g == null) {
            Object cmd = Bridge.cmd(dVar, 505, this.b);
            if (cmd instanceof ByteBuffer) {
                this.g = (ByteBuffer) cmd;
            }
        }
        return this.g;
    }
}
