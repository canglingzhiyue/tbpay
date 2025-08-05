package com.taobao.search.sf.widgets.onesearch;

import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class h implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private e f19564a;
    private final String b = "TBSearch.Event.onviewappear";
    private final String e = "TBSearch.Event.onhalfappear";
    private final String c = "TBSearch.Event.ondisappear";
    private final String f = "TBSearch.Event.onhalfdisappear";
    private final String d = "TBSearch.Event.onrequeststart";

    static {
        kge.a(1709969391);
        kge.a(-92866868);
    }

    public h(e eVar) {
        this.f19564a = eVar;
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
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            b(true);
        }
    }

    @Override // com.taobao.search.sf.widgets.onesearch.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            b(false);
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

    @Override // com.taobao.search.sf.widgets.onesearch.a
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            a("TBSearch.Event.onrequeststart");
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(z ? "TBSearch.Event.onviewappear" : "TBSearch.Event.ondisappear");
        }
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            a(z ? "TBSearch.Event.onhalfappear" : "TBSearch.Event.onhalfdisappear");
        }
    }

    private void a(String str) {
        WVUCWebView f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        e eVar = this.f19564a;
        if (eVar == null || (f = eVar.f()) == null) {
            return;
        }
        WVStandardEventCenter.postNotificationToJS(f, str, "{}");
    }
}
