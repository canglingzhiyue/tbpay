package com.alipay.android.msp.framework.okio;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class Segment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4836a = new byte[2048];
    public int b;
    public int c;
    public Segment d;
    public Segment e;

    public final Segment pop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("dc5e0756", new Object[]{this});
        }
        Segment segment = this.d;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.e;
        segment2.d = this.d;
        this.d.e = segment2;
        this.d = null;
        this.e = null;
        return segment;
    }

    public final Segment push(Segment segment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("5cb61d8b", new Object[]{this, segment});
        }
        segment.e = this;
        segment.d = this.d;
        this.d.e = segment;
        this.d = segment;
        return segment;
    }

    public final Segment split(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Segment) ipChange.ipc$dispatch("65c96c00", new Object[]{this, new Integer(i)});
        }
        int i2 = (this.c - this.b) - i;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        if (i < i2) {
            Segment a2 = SegmentPool.f4837a.a();
            System.arraycopy(this.f4836a, this.b, a2.f4836a, a2.b, i);
            this.b += i;
            a2.c += i;
            this.e.push(a2);
            return a2;
        }
        Segment a3 = SegmentPool.f4837a.a();
        System.arraycopy(this.f4836a, this.b + i, a3.f4836a, a3.b, i2);
        this.c -= i2;
        a3.c += i2;
        push(a3);
        return this;
    }

    public final void compact() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce94762a", new Object[]{this});
            return;
        }
        Segment segment = this.e;
        if (segment == this) {
            throw new IllegalStateException();
        }
        int i = segment.c - segment.b;
        int i2 = this.c;
        int i3 = this.b;
        if (i + (i2 - i3) > 2048) {
            return;
        }
        writeTo(segment, i2 - i3);
        pop();
        SegmentPool.f4837a.a(this);
    }

    public final void writeTo(Segment segment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a02a2f6", new Object[]{this, segment, new Integer(i)});
            return;
        }
        int i2 = segment.c;
        int i3 = segment.b;
        if ((i2 - i3) + i > 2048) {
            throw new IllegalArgumentException();
        }
        if (i2 + i > 2048) {
            byte[] bArr = segment.f4836a;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            segment.c -= segment.b;
            segment.b = 0;
        }
        System.arraycopy(this.f4836a, this.b, segment.f4836a, segment.c, i);
        segment.c += i;
        this.b += i;
    }
}
