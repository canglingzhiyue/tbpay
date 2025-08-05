package com.taobao.share.core.share.interceptor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<b> f19626a = new ArrayList();
    private ArrayList<String> b;
    private TBShareContent c;
    private String d;

    static {
        kge.a(-665136694);
    }

    public d(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        this.b = arrayList;
        this.c = tBShareContent;
        this.d = str;
    }

    public d a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("cb2c6d12", new Object[]{this, bVar});
        }
        this.f19626a.add(bVar);
        return this;
    }

    public d a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("84a3fab1", new Object[]{this, cVar});
        }
        this.f19626a.add(cVar);
        return this;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        for (b bVar : this.f19626a) {
            if (bVar.b(this.b, this.c, this.d)) {
                return true;
            }
        }
        return false;
    }
}
