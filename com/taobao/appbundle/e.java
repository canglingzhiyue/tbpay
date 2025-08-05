package com.taobao.appbundle;

import android.text.TextUtils;
import com.alibaba.android.split.ab;
import com.alibaba.android.split.scene.f;
import com.alibaba.android.split.scene.l;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import tb.kge;
import tb.lsk;

/* loaded from: classes6.dex */
public abstract class e implements ab.a, ab.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String m;
    public String n;
    public int o;

    /* renamed from: a  reason: collision with root package name */
    private f f16298a = l.a();
    public HashMap<String, Boolean> p = new HashMap<>();
    public HashMap<String, Integer> q = new HashMap<>();

    static {
        kge.a(-839500099);
        kge.a(-1621337058);
        kge.a(1582880670);
    }

    public abstract void a(List<String> list);

    public abstract void b();

    public abstract void c();

    @Override // com.alibaba.android.split.ab.b
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        this.n = str;
        this.o = i;
        if (this.q.containsKey(str)) {
            return;
        }
        this.q.put(str, Integer.valueOf(i));
        f fVar = this.f16298a;
        if (fVar == null || !fVar.b()) {
            return;
        }
        List<String> a2 = this.f16298a.a(this.m, this.n);
        if (a2 == null || a2.size() == 0) {
            b();
        } else {
            a(a2);
        }
    }

    @Override // com.alibaba.android.split.ab.a
    public void onBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d13a74", new Object[]{this});
        } else {
            c();
        }
    }

    @Override // com.alibaba.android.split.ab.a
    public void onActivityCreate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18625fbb", new Object[]{this, str});
            return;
        }
        if (str.startsWith("com.taobao.tao.welcome") || TextUtils.equals(str, lsk.BIZ_NAME)) {
            this.m = lsk.BIZ_NAME;
            this.n = "首页";
        } else {
            this.m = str;
        }
        if (this.p.containsKey(this.m)) {
            return;
        }
        this.p.put(this.m, true);
        f fVar = this.f16298a;
        if (fVar == null || !fVar.b()) {
            return;
        }
        List<String> a2 = this.f16298a.a(this.m, this.n);
        if (a2 == null || a2.size() == 0) {
            b();
        } else {
            a(a2);
        }
    }
}
