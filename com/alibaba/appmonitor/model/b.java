package com.alibaba.appmonitor.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.btf;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static b b;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f2888a;

    static {
        kge.a(-1253659267);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("f27f4316", new Object[0]);
        }
        if (b == null) {
            b = new b(3);
        }
        return b;
    }

    private b(int i) {
        this.f2888a = new ArrayList(i);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac7ec371", new Object[]{this, aVar});
            return;
        }
        if (this.f2888a.contains(aVar)) {
            this.f2888a.remove(aVar);
        }
        this.f2888a.add(aVar);
    }

    public a a(String str, String str2) {
        List<a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4154ff63", new Object[]{this, str, str2});
        }
        if (str == null || str2 == null || (list = this.f2888a) == null) {
            return null;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.f2888a.get(i);
            if (aVar != null && aVar.c().equals(str) && aVar.d().equals(str2)) {
                return aVar;
            }
        }
        a b2 = btf.a().b(str, str2);
        if (b2 != null) {
            this.f2888a.add(b2);
        }
        return b2;
    }
}
