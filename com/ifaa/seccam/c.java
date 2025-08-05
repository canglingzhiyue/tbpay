package com.ifaa.seccam;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f7631a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public byte[] e;

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f7631a;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f7631a = i;
        }
    }

    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c19672f", new Object[]{this, bArr});
        } else {
            this.b = bArr;
        }
    }

    public byte[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a9d5fa14", new Object[]{this}) : this.d;
    }

    public void b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ffa270", new Object[]{this, bArr});
        } else {
            this.d = bArr;
        }
    }

    public byte[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ab8ad2b3", new Object[]{this}) : this.c;
    }

    public void c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5e5ddb1", new Object[]{this, bArr});
        } else {
            this.c = bArr;
        }
    }

    public byte[] d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("ad3fab52", new Object[]{this}) : this.e;
    }

    public void d(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("facc18f2", new Object[]{this, bArr});
        } else {
            this.e = bArr;
        }
    }
}
