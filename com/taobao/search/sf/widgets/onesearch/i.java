package com.taobao.search.sf.widgets.onesearch;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import tb.kge;

/* loaded from: classes8.dex */
public class i implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private g f19565a;

    static {
        kge.a(-959779344);
        kge.a(-92866868);
    }

    @Override // com.taobao.search.sf.widgets.onesearch.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.search.sf.widgets.onesearch.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.taobao.search.sf.widgets.onesearch.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public i(g gVar) {
        this.f19565a = gVar;
    }

    @Override // com.taobao.search.sf.widgets.onesearch.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(true);
        }
    }

    @Override // com.taobao.search.sf.widgets.onesearch.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(false);
        }
    }

    private void a(boolean z) {
        WXSDKInstance f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        g gVar = this.f19565a;
        if (gVar == null || (f = gVar.f()) == null) {
            return;
        }
        if (z) {
            f.onActivityResume();
        } else {
            f.onActivityPause();
        }
    }
}
