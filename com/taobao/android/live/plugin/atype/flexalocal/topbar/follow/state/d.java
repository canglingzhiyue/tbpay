package com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f14055a = new ArrayList();

    static {
        kge.a(290402899);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdcb2ef", new Object[]{this, aVar});
        } else {
            this.f14055a.add(aVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f14055a.size() > 0) {
            for (a aVar : this.f14055a) {
                if (aVar != null) {
                    aVar.c();
                }
            }
            this.f14055a.clear();
        }
    }
}
