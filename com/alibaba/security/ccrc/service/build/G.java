package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.interfaces.OnAlgoResultCallback;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class G {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<OnAlgoResultCallback> f3240a = new ArrayList();

    public G(String str) {
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public void a(OnAlgoResultCallback onAlgoResultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef738e60", new Object[]{this, onAlgoResultCallback});
        } else {
            this.f3240a.add(onAlgoResultCallback);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f3240a.clear();
        }
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        for (OnAlgoResultCallback onAlgoResultCallback : this.f3240a) {
            onAlgoResultCallback.onAlgoResult(obj);
        }
    }
}
