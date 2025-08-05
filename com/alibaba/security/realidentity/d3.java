package com.alibaba.security.realidentity;

import com.alibaba.security.realidentity.service.camera.size.AspectRatio;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public class d3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<AspectRatio, SortedSet<c3>> f3380a = new HashMap<>();

    public boolean a(c3 c3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a26c5ba6", new Object[]{this, c3Var})).booleanValue();
        }
        for (AspectRatio aspectRatio : this.f3380a.keySet()) {
            if (aspectRatio.a(c3Var)) {
                SortedSet<c3> sortedSet = this.f3380a.get(aspectRatio);
                if (sortedSet.contains(c3Var)) {
                    return false;
                }
                sortedSet.add(c3Var);
                return true;
            }
        }
        TreeSet treeSet = new TreeSet();
        treeSet.add(c3Var);
        this.f3380a.put(AspectRatio.b(c3Var.b(), c3Var.a()), treeSet);
        return true;
    }

    public SortedSet<c3> b(AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SortedSet) ipChange.ipc$dispatch("2b91a2d4", new Object[]{this, aspectRatio}) : this.f3380a.get(aspectRatio);
    }

    public void a(AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39b1be29", new Object[]{this, aspectRatio});
        } else {
            this.f3380a.remove(aspectRatio);
        }
    }

    public Set<AspectRatio> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Set) ipChange.ipc$dispatch("a0177257", new Object[]{this}) : this.f3380a.keySet();
    }
}
