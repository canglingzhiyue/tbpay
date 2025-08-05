package com.alibaba.poplayer.layermanager;

import android.os.SystemClock;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<PopRequest> f3199a = new ArrayList();

    static {
        kge.a(-1805260634);
    }

    public List<PopRequest> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f3199a;
    }

    public boolean a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9690e78", new Object[]{this, popRequest})).booleanValue();
        }
        if (this.f3199a.contains(popRequest)) {
            return false;
        }
        this.f3199a.add(popRequest);
        return true;
    }

    public PopRequest b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopRequest) ipChange.ipc$dispatch("a7d96b99", new Object[]{this});
        }
        if (this.f3199a.isEmpty()) {
            return null;
        }
        PopRequest d = e.d(this.f3199a);
        b(d);
        return d;
    }

    private boolean b(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ecf42c39", new Object[]{this, popRequest})).booleanValue();
        }
        if (popRequest != null) {
            try {
                OnePopModule t = popRequest.t();
                t.z = (SystemClock.elapsedRealtime() - popRequest.t().af) + "";
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("WaitingList.remove.error.", th);
            }
        }
        return this.f3199a.remove(popRequest);
    }

    public boolean a(Collection<PopRequest> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{this, collection})).booleanValue();
        }
        for (PopRequest popRequest : collection) {
            if (popRequest != null && this.f3199a.contains(popRequest)) {
                OnePopModule t = popRequest.t();
                t.z = (SystemClock.elapsedRealtime() - popRequest.t().af) + "";
            }
        }
        return this.f3199a.removeAll(collection);
    }
}
