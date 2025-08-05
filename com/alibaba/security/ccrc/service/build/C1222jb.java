package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.security.ccrc.service.build.jb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1222jb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public String c;
    public final String d;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f3313a = new ArrayList();
    public final List<BxData.OpResult> e = new ArrayList();

    /* renamed from: com.alibaba.security.ccrc.service.build.jb$a */
    /* loaded from: classes3.dex */
    public interface a {
        Object a(String str, String str2, List<BxData.OpResult> list, C1222jb c1222jb);
    }

    public C1222jb(String str, String str2) {
        this.c = str2;
        this.d = str;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1879fab7", new Object[]{this, aVar});
        } else {
            this.f3313a.add(aVar);
        }
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("43b9c269", new Object[]{this});
        }
        if (this.b < this.f3313a.size()) {
            this.b++;
            return this.f3313a.get(this.b).a(this.d, this.c, this.e, this);
        }
        return this.c;
    }

    public List<BxData.OpResult> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.e;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }
}
