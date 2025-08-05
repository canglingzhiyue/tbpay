package com.taobao.android.tbuprofen;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bgy;
import tb.kge;

/* loaded from: classes6.dex */
public class h implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f15490a;
    private static final c b;

    @Override // com.taobao.android.tbuprofen.c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    static {
        kge.a(-106015898);
        kge.a(236760894);
        b = new h();
    }

    @Override // com.taobao.android.tbuprofen.c
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        com.taobao.android.tbuprofen.log.c.d("TBPSoLoaderHelper", "Load library %s from apk", str);
        System.loadLibrary(str);
        return null;
    }

    @Override // com.taobao.android.tbuprofen.c
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return "lib" + str + bgy.SO_EXTENSION;
    }

    public static void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f38bb6d", new Object[]{cVar});
        } else if (cVar == null || f15490a != null) {
        } else {
            f15490a = cVar;
        }
    }

    public static c b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ee4e4252", new Object[0]);
        }
        c cVar = f15490a;
        return cVar == null ? b : cVar;
    }
}
