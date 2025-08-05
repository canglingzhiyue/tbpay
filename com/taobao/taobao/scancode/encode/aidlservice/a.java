package com.taobao.taobao.scancode.encode.aidlservice;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f21238a;

    /* renamed from: com.taobao.taobao.scancode.encode.aidlservice.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public static final class C0884a {

        /* renamed from: a  reason: collision with root package name */
        public int f21239a;
        public byte[] b;
        public DecodeCallback c;

        static {
            kge.a(392144115);
        }
    }

    static {
        kge.a(597725624);
    }

    private a(Context context) {
    }

    public static a a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c51a89fc", new Object[]{context});
        }
        if (f21238a == null) {
            f21238a = new a(context);
        }
        return f21238a;
    }

    public void a(byte[] bArr, int i, DecodeCallback decodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b8f2a4", new Object[]{this, bArr, new Integer(i), decodeCallback});
            return;
        }
        C0884a c0884a = new C0884a();
        c0884a.f21239a = i;
        c0884a.b = bArr;
        c0884a.c = decodeCallback;
        a(c0884a);
    }

    public boolean a(C0884a c0884a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b40382b", new Object[]{this, c0884a})).booleanValue();
        }
        if (c0884a == null) {
            return false;
        }
        try {
            new BusinessBinder().decodeBitmap(c0884a.b, c0884a.f21239a, c0884a.c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
