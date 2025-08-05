package com.taobao.taobao.scancode.encode.aidlservice;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static b f21240a;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f21241a;
        public String b;
        public int c;
        public MaSizeType d;
        public boolean e;
        public EncodeCallback f;

        static {
            kge.a(486504669);
        }
    }

    static {
        kge.a(-82325022);
    }

    private b(Context context) {
    }

    public static b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("c51a8a1b", new Object[]{context});
        }
        if (f21240a == null) {
            f21240a = new b(context);
        }
        return f21240a;
    }

    public void a(String str, String str2, int i, MaSizeType maSizeType, boolean z, EncodeCallback encodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16314541", new Object[]{this, str, str2, new Integer(i), maSizeType, new Boolean(z), encodeCallback});
            return;
        }
        a aVar = new a();
        aVar.f21241a = str;
        aVar.b = str2;
        aVar.f = encodeCallback;
        aVar.d = maSizeType;
        aVar.c = i;
        aVar.e = z;
        a(aVar);
    }

    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf510ca", new Object[]{this, aVar})).booleanValue();
        }
        if (aVar == null) {
            return false;
        }
        try {
            new BusinessBinder().encode(aVar.f21241a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
