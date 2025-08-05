package com.taobao.taobaoavsdk.cache.library;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;
import tb.oyy;
import tb.oza;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final File f21317a;
    public final oza b;
    public final oyy c;

    static {
        kge.a(-2133575890);
    }

    public c(File file, oza ozaVar, oyy oyyVar) {
        this.f21317a = file;
        this.b = ozaVar;
        this.c = oyyVar;
    }

    public File a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (File) ipChange.ipc$dispatch("c26a5a1b", new Object[]{this, str}) : new File(this.f21317a, this.b.a(str));
    }
}
