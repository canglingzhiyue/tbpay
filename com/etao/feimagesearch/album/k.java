package com.etao.feimagesearch.album;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Comparator<o> f6496a;
    private final String b;
    private final String c;
    private final LinkedList<o> d = new LinkedList<>();
    private final LinkedList<o> e = new LinkedList<>();
    private final LinkedList<o> f = new LinkedList<>();
    private final LinkedList<o> g = new LinkedList<>();
    private boolean h;

    static {
        kge.a(-861841392);
        f6496a = new Comparator<o>() { // from class: com.etao.feimagesearch.album.k.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(o oVar, o oVar2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, oVar, oVar2})).intValue() : a(oVar, oVar2);
            }

            public int a(o oVar, o oVar2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("56412d39", new Object[]{this, oVar, oVar2})).intValue();
                }
                if (oVar.f() < oVar2.f()) {
                    return 1;
                }
                return oVar.f() > oVar2.f() ? -1 : 0;
            }
        };
    }

    public k(String str) {
        this.b = str;
        this.c = str.substring(str.lastIndexOf(File.separator) + 1);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        return this.d.size() + com.alibaba.ability.localization.b.a(R.string.taobao_app_1007_1_19001);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.h;
    }

    public void a(List<o> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.e.addAll(list);
        for (o oVar : list) {
            if (oVar.c()) {
                this.g.add(oVar);
            }
        }
    }

    public LinkedList<o> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("504cfd42", new Object[]{this}) : this.d;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.d.size() > 0;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return " name " + this.c + ", path " + this.b + ", count " + this.d.size();
    }

    public LinkedList<o> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinkedList) ipChange.ipc$dispatch("53ffa380", new Object[]{this}) : this.f;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.e.isEmpty()) {
        } else {
            Collections.sort(this.e, f6496a);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (this.g.isEmpty()) {
        } else {
            Collections.sort(this.g, f6496a);
        }
    }

    public k j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("1b7da6b8", new Object[]{this});
        }
        k kVar = new k(this.b);
        kVar.e.addAll(this.e);
        kVar.g.addAll(this.g);
        return kVar;
    }

    public boolean a(o oVar) {
        LinkedList<o> linkedList;
        LinkedList<o> linkedList2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("238d8adb", new Object[]{this, oVar})).booleanValue();
        }
        if (oVar == null || (linkedList = this.d) == null) {
            return false;
        }
        linkedList.addFirst(oVar);
        if (oVar.c() && (linkedList2 = this.f) != null) {
            linkedList2.addFirst(oVar);
        }
        return true;
    }

    public void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238bb95b", new Object[]{this, kVar});
            return;
        }
        this.d.clear();
        this.d.addAll(kVar.e);
        this.f.clear();
        this.f.addAll(kVar.g);
    }
}
