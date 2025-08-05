package com.taobao.android.tbuprofen.adapter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.h;
import tb.ihq;
import tb.ihw;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15476a;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 166941358) {
            if (hashCode != 1628521357) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.b((String) objArr[0]);
        }
        return super.a((String) objArr[0]);
    }

    static {
        kge.a(1304186750);
        try {
            Class.forName("tb.ihq");
            f15476a = true;
        } catch (ClassNotFoundException unused) {
            f15476a = false;
        }
    }

    @Override // com.taobao.android.tbuprofen.h, com.taobao.android.tbuprofen.c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (f15476a) {
            if (!ihq.a().b(str).g()) {
                return "Can't find the library.";
            }
            com.taobao.android.tbuprofen.log.c.d("TBPRemoteSoLoader", "Load library %s by remoteso", str);
            return null;
        }
        return super.a(str);
    }

    @Override // com.taobao.android.tbuprofen.h, com.taobao.android.tbuprofen.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : f15476a;
    }

    @Override // com.taobao.android.tbuprofen.h, com.taobao.android.tbuprofen.c
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (f15476a) {
            ihw a2 = ihq.b().a(str);
            if (!a2.g()) {
                return "";
            }
            com.taobao.android.tbuprofen.log.c.d("TBPRemoteSoLoader", "Fetch library %s by remoteso", str);
            return a2.b();
        }
        return super.b(str);
    }
}
