package com.taobao.taobao.scancode.encode.aidlservice;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f21242a;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f21243a;
        public byte[] b;
        public int c;
        public int d;
        public String e;
        public int f;
        public int g;
        public int h;
        public char i;
        public int j;
        public EncodeCallback k;
        public int l;

        static {
            kge.a(-106649949);
        }
    }

    static {
        kge.a(1742891664);
    }

    private c(Context context) {
    }

    public static c a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c51a8a3a", new Object[]{context});
        }
        if (f21242a == null) {
            f21242a = new c(context);
        }
        return f21242a;
    }

    public void a(int i, byte[] bArr, int i2, int i3, String str, int i4, int i5, int i6, char c, int i7, EncodeCallback encodeCallback, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36154cde", new Object[]{this, new Integer(i), bArr, new Integer(i2), new Integer(i3), str, new Integer(i4), new Integer(i5), new Integer(i6), new Character(c), new Integer(i7), encodeCallback, new Integer(i8)});
            return;
        }
        a aVar = new a();
        aVar.f21243a = i;
        aVar.b = bArr;
        aVar.c = i2;
        aVar.d = i3;
        aVar.e = str;
        aVar.f = i4;
        aVar.g = i5;
        aVar.h = i6;
        aVar.i = c;
        aVar.j = i7;
        aVar.k = encodeCallback;
        aVar.l = i8;
        a(aVar);
    }

    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9e969", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        try {
            new BusinessBinder().encodeMa3(aVar.f21243a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
