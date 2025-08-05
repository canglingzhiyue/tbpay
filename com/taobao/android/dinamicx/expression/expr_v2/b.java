package com.taobao.android.dinamicx.expression.expr_v2;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import tb.fue;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f11865a;
    private int[] b;
    private int[] c;
    private int[] d;
    private byte[] e;
    private int f;
    private int g;
    private int h;
    private int i;

    static {
        kge.a(-81584403);
    }

    public void a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        this.e = bArr;
        this.f = i;
        c();
        int d = fue.d(bArr, i + 12);
        int i2 = 0;
        while (true) {
            if (i2 >= d) {
                break;
            }
            int i3 = i + 16 + (i2 * 12);
            if (fue.d(bArr, i3) == 1) {
                this.f11865a = fue.d(bArr, i3 + 4);
                break;
            }
            i2++;
        }
        if (this.f11865a == 0) {
            throw new IllegalArgumentException("Invalid binary, no const section");
        }
        int i4 = i + 16 + (d * 12);
        this.h = fue.d(bArr, i4);
        int i5 = this.h;
        if (i5 == 0) {
            throw new IllegalArgumentException("Empty binary, 0 expression");
        }
        this.c = new int[i5];
        this.d = new int[i5];
        for (int i6 = 0; i6 < this.h; i6++) {
            int i7 = i4 + 4;
            int i8 = i6 * 8;
            this.c[i6] = fue.d(bArr, i7 + i8);
            this.d[i6] = fue.d(bArr, i7 + 4 + i8);
        }
        this.g = fue.d(bArr, this.f11865a + i);
        this.b = new int[this.g];
        for (int i9 = 0; i9 < this.g; i9++) {
            this.b[i9] = fue.d(bArr, this.f11865a + i + 4 + (i9 * 4));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (fue.d(this.e, this.f) != 1718843492) {
            throw new IllegalArgumentException("Invalid binary, invalid magic number");
        } else {
            int b = fue.b(this.e, this.f + 4);
            if (b > 1) {
                throw new IllegalArgumentException("Invalid binary, newer format not support: " + b);
            }
            this.i = fue.d(this.e, this.f + 8);
            if (this.f + this.i <= this.e.length) {
                return;
            }
            throw new IllegalArgumentException("Invalid binary, offset: " + this.f + "+ fileLen: " + this.i + " > bytes.length: " + this.e.length);
        }
    }

    public f a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("f79420b1", new Object[]{this, new Integer(i)});
        }
        int i2 = this.b[i];
        int d = fue.d(this.e, this.f + i2);
        if (d == 0) {
            return f.a(new String(this.e, this.f + i2 + 8, fue.d(this.e, (this.f + i2) + 4) - 1, Charset.forName("UTF-8")));
        }
        throw new IllegalArgumentException("not support const type:" + d);
    }

    public int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : this.c[i] + this.f;
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue() : this.d[i];
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.g;
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this}) : this.e;
    }
}
