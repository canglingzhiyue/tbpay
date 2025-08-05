package com.taobao.android.layoutmanager.adapter.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.BHRSolution;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private HashMap<String, BHRSolution> f13129a = new HashMap<>();

    static {
        kge.a(-318428924);
    }

    public void a(String str, BHRSolution bHRSolution) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7851f581", new Object[]{this, str, bHRSolution});
        } else {
            this.f13129a.put(str, bHRSolution);
        }
    }

    public BHRSolution a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BHRSolution) ipChange.ipc$dispatch("c09d4a95", new Object[]{this, str}) : this.f13129a.get(str);
    }

    public HashMap<String, BHRSolution> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[]{this}) : this.f13129a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f13129a.clear();
        }
    }
}
