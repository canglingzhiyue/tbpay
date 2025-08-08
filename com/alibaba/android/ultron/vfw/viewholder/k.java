package com.alibaba.android.ultron.vfw.viewholder;

import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.bny;
import tb.kge;

/* loaded from: classes2.dex */
public class k implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_URL = "url";

    /* renamed from: a  reason: collision with root package name */
    public bny f2744a;
    public int b = 0;
    public HashMap<String, Integer> c = new HashMap<>();
    public HashMap<Integer, String> d = new HashMap<>();
    public List<WeakReference<com.alibaba.android.ultron.vfw.web.d>> e = new ArrayList();

    static {
        kge.a(1563766074);
        kge.a(1171232783);
    }

    public k(bny bnyVar) {
        this.f2744a = bnyVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public int b(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73527efe", new Object[]{this, iDMComponent})).intValue();
        }
        if (iDMComponent == null || iDMComponent.getContainerInfo() == null) {
            return -1;
        }
        String string = iDMComponent.getContainerInfo().getString("url");
        if (StringUtils.isEmpty(string)) {
            return -1;
        }
        if (this.c.containsKey(string)) {
            return this.c.get(string).intValue();
        }
        this.b++;
        this.c.put(string, Integer.valueOf(this.b));
        this.d.put(Integer.valueOf(this.b), string);
        return this.b;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public h a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("7bf26661", new Object[]{this, viewGroup, new Integer(i)});
        }
        com.alibaba.android.ultron.vfw.web.d dVar = new com.alibaba.android.ultron.vfw.web.d(this.f2744a, this.d.get(Integer.valueOf(i)));
        dVar.b(viewGroup);
        this.e.add(new WeakReference<>(dVar));
        return new h(dVar.a(), dVar);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public void a(h hVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34d0eda7", new Object[]{this, hVar, iDMComponent});
            return;
        }
        b b = hVar.b();
        if (b == null) {
            return;
        }
        b.b(iDMComponent);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.f
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        List<WeakReference<com.alibaba.android.ultron.vfw.web.d>> list = this.e;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (WeakReference<com.alibaba.android.ultron.vfw.web.d> weakReference : this.e) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().e();
            }
        }
    }
}
