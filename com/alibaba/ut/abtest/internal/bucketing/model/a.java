package com.alibaba.ut.abtest.internal.bucketing.model;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.internal.util.q;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, String> f4186a;
    private Set<String> b;
    private ConcurrentHashMap<String, Long> c;
    private ConcurrentHashMap<String, Long> d;
    private List<ExperimentV5> e;
    private boolean f;

    static {
        kge.a(575347885);
    }

    public a() {
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
    }

    public a(b bVar) {
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = new ArrayList();
        String a2 = q.a(bVar.b(), bVar.d());
        if (!TextUtils.isEmpty(a2)) {
            a(a2);
            this.c.put(a2, Long.valueOf(bVar.c()));
            this.d.put(a2, Long.valueOf(bVar.d()));
        }
    }

    public Map<String, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this}) : this.f4186a;
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.f4186a = map;
        }
    }

    public Set<String> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("6dc1d418", new Object[]{this}) : this.b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if (this.b == null) {
                this.b = new LinkedHashSet();
            }
            this.b.add(str);
        }
    }

    public List<ExperimentV5> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.e;
    }

    public void a(ExperimentV5 experimentV5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3088aa00", new Object[]{this, experimentV5});
            return;
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(experimentV5);
        String a2 = q.a(experimentV5.getReleaseId(), experimentV5.getGroups().get(0).getId());
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        a(a2);
        this.c.put(a2, Long.valueOf(experimentV5.getId()));
        this.d.put(a2, Long.valueOf(experimentV5.getGroups().get(0).getId()));
    }

    public Long b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("f10e1f42", new Object[]{this, str}) : this.c.get(str);
    }

    public Long c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("5260bbe1", new Object[]{this, str}) : this.d.get(str);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }
}
