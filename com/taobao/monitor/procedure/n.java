package com.taobao.monitor.procedure;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class n implements IPage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<IPage> f18225a = new ArrayList();

    @Override // com.taobao.monitor.procedure.IPage
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "PageGroupSession";
    }

    @Override // com.taobao.monitor.procedure.IPage
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : "PageGroup";
    }

    public static /* synthetic */ List a(n nVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("fc0549ba", new Object[]{nVar}) : nVar.f18225a;
    }

    public n(List<IPage> list) {
        this.f18225a.addAll(list);
    }

    @Override // com.taobao.monitor.procedure.IPage
    public void a(View view, IPage.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9913208", new Object[]{this, view, aVar});
            return;
        }
        for (IPage iPage : this.f18225a) {
            iPage.a(view, aVar);
        }
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.d) ipChange.ipc$dispatch("8e1302c6", new Object[]{this}) : new IPage.d() { // from class: com.taobao.monitor.procedure.n.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.monitor.procedure.IPage.d
            public void a(String str, String str2, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.d().a(str, str2, map);
                }
            }

            @Override // com.taobao.monitor.procedure.IPage.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.d().a();
                }
            }

            @Override // com.taobao.monitor.procedure.IPage.d
            public void c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.d().c();
                }
            }

            @Override // com.taobao.monitor.procedure.IPage.d
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.d().d();
                }
            }
        };
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.b e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.b) ipChange.ipc$dispatch("957837a7", new Object[]{this}) : new IPage.b() { // from class: com.taobao.monitor.procedure.n.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.monitor.procedure.IPage.b
            public void i(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b5c85c54", new Object[]{this, new Long(j)});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.e().i(j);
                }
            }
        };
    }

    @Override // com.taobao.monitor.procedure.IPage
    public IPage.c g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPage.c) ipChange.ipc$dispatch("a442a204", new Object[]{this}) : new IPage.c() { // from class: com.taobao.monitor.procedure.n.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.monitor.procedure.IPage.c
            public void a(String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.g().a(str, j);
                }
            }

            @Override // com.taobao.monitor.procedure.IPage.c
            public void a(String str, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.g().a(str, obj);
                }
            }

            @Override // com.taobao.monitor.procedure.IPage.c
            public void b(String str, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("18567e8f", new Object[]{this, str, obj});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.g().a(str, obj);
                }
            }

            @Override // com.taobao.monitor.procedure.IPage.c
            public void a(String str, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20476513", new Object[]{this, str, map});
                    return;
                }
                for (IPage iPage : n.a(n.this)) {
                    iPage.g().a(str, map);
                }
            }
        };
    }
}
