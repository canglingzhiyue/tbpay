package com.taobao.themis.kernel.extension.page;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.extension.page.e;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;

/* loaded from: classes9.dex */
public final class c implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f22518a;
    private final ITMSPage b;

    static {
        kge.a(1306016466);
        kge.a(-1709469935);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
        } else {
            kotlin.jvm.internal.q.d(page, "page");
        }
    }

    public c(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.b = page;
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            e.a.a(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.e
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f22518a = str;
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.e
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f22518a;
    }
}
