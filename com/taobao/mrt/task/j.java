package com.taobao.mrt.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTResourceDescription;
import java.util.HashSet;
import java.util.Set;
import tb.kge;

/* loaded from: classes7.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static j f18259a;
    private Set<MRTResourceDescription> b = new HashSet();

    static {
        kge.a(-187582923);
        f18259a = new j();
    }

    public static j a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("497c7506", new Object[0]) : f18259a;
    }

    public void a(MRTResourceDescription mRTResourceDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e599e53", new Object[]{this, mRTResourceDescription});
            return;
        }
        synchronized (this.b) {
            this.b.add(mRTResourceDescription);
        }
    }

    public boolean b(MRTResourceDescription mRTResourceDescription) {
        boolean contains;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98751cf6", new Object[]{this, mRTResourceDescription})).booleanValue();
        }
        if (mRTResourceDescription == null) {
            return false;
        }
        synchronized (this.b) {
            contains = this.b.contains(mRTResourceDescription);
        }
        return contains;
    }
}
