package com.taobao.taobao.scancode.huoyan.object;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaType;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes8.dex */
public class KakaLibImageWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_SCAN_FROM = "unknown";

    /* renamed from: a  reason: collision with root package name */
    public Rect f21284a;
    public Rect b = null;
    public int c = 0;
    private byte[] d;
    private int e;
    private int f;
    private int g;
    private WeakReference h;
    private String i;
    private YuvImage j;
    private Bitmap k;
    private String l;
    private MaType[] m;
    private String n;

    static {
        kge.a(592175541);
    }

    public KakaLibImageWrapper(byte[] bArr, int i, int i2, int i3, String str) {
        this.d = bArr;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.n = str;
    }

    public KakaLibImageWrapper(Bitmap bitmap, String str) {
        this.k = bitmap;
        this.n = str;
    }

    public KakaLibImageWrapper(String str, String str2) {
        this.l = str;
        this.n = str2;
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this}) : this.d;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.e;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public YuvImage d() {
        byte[] bArr;
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YuvImage) ipChange.ipc$dispatch("befb057", new Object[]{this});
        }
        if (this.j == null && (bArr = this.d) != null && (i = this.g) > 0 && (i2 = this.e) > 0 && (i3 = this.f) > 0) {
            this.j = new YuvImage(bArr, i, i2, i3, null);
        }
        return this.j;
    }

    public Bitmap e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("61b3954a", new Object[]{this}) : this.k;
    }

    public void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else {
            this.k = bitmap;
        }
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.l;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.i;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.h = new WeakReference(context);
        }
    }

    public Context h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("96c352e7", new Object[]{this});
        }
        WeakReference weakReference = this.h;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public void a(MaType[] maTypeArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b83ecb0", new Object[]{this, maTypeArr});
        } else {
            this.m = maTypeArr;
        }
    }

    public MaType[] i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MaType[]) ipChange.ipc$dispatch("8df233ae", new Object[]{this}) : this.m;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.n;
    }
}
