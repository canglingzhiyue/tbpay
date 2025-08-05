package com.alibaba.poplayer.layermanager;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.kge;

/* loaded from: classes3.dex */
public class h implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<Activity> c;
    private volatile boolean d = false;

    /* renamed from: a  reason: collision with root package name */
    private final a f3198a = new a();

    static {
        kge.a(-306627534);
        kge.a(-2008918120);
    }

    public h(Activity activity) {
        this.c = new WeakReference<>(activity);
    }

    private void c() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.d || (activity = (Activity) com.alibaba.poplayer.utils.g.a(this.c)) == null) {
        } else {
            this.f3198a.a(f.a().b(activity).getCanvas());
            this.d = true;
        }
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        if (com.alibaba.poplayer.utils.g.b(activity)) {
            this.c = new WeakReference<>(activity);
        }
        this.d = false;
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public void a(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        c();
        this.f3198a.a(list);
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public void b(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.f3198a.b(list);
        }
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public void c(List<PopRequest> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            this.f3198a.c(list);
        }
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public void a(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9690e74", new Object[]{this, popRequest});
        } else {
            this.f3198a.a(popRequest);
        }
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public int b(PopRequest popRequest) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ecf42c28", new Object[]{this, popRequest})).intValue() : this.f3198a.b(popRequest);
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f3198a.c();
    }

    @Override // com.alibaba.poplayer.layermanager.b
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f3198a.b();
        }
    }
}
