package com.taobao.split.diff;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.android.split.k;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.kge;

/* loaded from: classes8.dex */
public class g implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, List<String>> f19715a;
    private Set<String> b;
    private SharedPreferences c;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final g f19716a;

        static {
            kge.a(250301579);
            f19716a = new g();
        }

        public static /* synthetic */ g a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b1836014", new Object[0]) : f19716a;
        }
    }

    static {
        kge.a(1653148357);
        kge.a(-1377572896);
    }

    private g() {
        this.f19715a = new HashMap();
        this.b = new HashSet();
        try {
            Context t = k.a().b().t();
            this.c = t.getSharedPreferences("featurediffdisabled_" + k.a().b().t().getPackageManager().getPackageInfo(k.a().b().t().getPackageName(), 0), 0);
            this.b = v.o(k.a().b().t());
            Map<String, ?> all = this.c.getAll();
            if (all == null || all.size() <= 0) {
                return;
            }
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                this.f19715a.put(entry.getKey(), new ArrayList(Arrays.asList(((String) entry.getValue()).split(","))));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static g a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("b1836014", new Object[0]) : a.a();
    }

    @Override // com.taobao.split.diff.h
    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue();
        }
        if (this.b.contains(str2)) {
            return true;
        }
        if (!this.f19715a.containsKey(str2)) {
            return false;
        }
        return this.f19715a.get(str2).contains(str);
    }

    @Override // com.taobao.split.diff.h
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        for (Map.Entry<String, List<String>> entry : this.f19715a.entrySet()) {
            if (!entry.getValue().contains(str)) {
                entry.getValue().add(str);
            }
        }
    }
}
