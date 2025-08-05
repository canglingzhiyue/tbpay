package com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService;
import tb.kge;
import tb.ldf;
import tb.ljs;
import tb.llj;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IMulticlassTabService.b f17476a;
    private IMulticlassTabService.a b;
    private final IMulticlassTabService<?> c;

    static {
        kge.a(-1758030283);
    }

    public static /* synthetic */ void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d71a44d", new Object[]{aVar});
        } else {
            aVar.d();
        }
    }

    public static /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ce17f2c", new Object[]{aVar});
        } else {
            aVar.e();
        }
    }

    public a(ljs ljsVar) {
        this.c = (IMulticlassTabService) ljsVar.a(IMulticlassTabService.class);
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        IMulticlassTabService<?> iMulticlassTabService = this.c;
        if (iMulticlassTabService == null) {
            return;
        }
        iMulticlassTabService.hideTabContent();
    }

    public void a(llj lljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3036bae", new Object[]{this, lljVar});
            return;
        }
        IMulticlassTabService<?> iMulticlassTabService = this.c;
        if (iMulticlassTabService == null) {
            return;
        }
        iMulticlassTabService.loadTabContent("weex", lljVar);
    }

    public void a(IMulticlassTabService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4571916c", new Object[]{this, aVar});
        } else if (this.c == null || this.b != null) {
        } else {
            ldf.d("TabContentController", "mOnTabChangeListener为空，创建OnTabChangeListener");
            this.b = aVar;
            this.c.addTabChangeListener(this.b);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null || this.f17476a != null) {
        } else {
            ldf.d("TabContentController", "mOnTabContentListener为空，创建mOnTabContentListener");
            this.f17476a = c();
            this.c.addTabContentListener(this.f17476a);
        }
    }

    private IMulticlassTabService.b c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IMulticlassTabService.b) ipChange.ipc$dispatch("61e43bcd", new Object[]{this}) : new IMulticlassTabService.b() { // from class: com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice.impl.weextabcontent.dxwidget.impl.scrolltab.view.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.infoflow.protocol.subservice.biz.multiclasstab.IMulticlassTabService.b
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                a.a(a.this);
                a.b(a.this);
            }
        };
    }

    private void d() {
        IMulticlassTabService.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        IMulticlassTabService<?> iMulticlassTabService = this.c;
        if (iMulticlassTabService == null || (aVar = this.b) == null) {
            return;
        }
        iMulticlassTabService.removeTabChangeListener(aVar);
        this.b = null;
    }

    private void e() {
        IMulticlassTabService.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        IMulticlassTabService<?> iMulticlassTabService = this.c;
        if (iMulticlassTabService == null || (bVar = this.f17476a) == null) {
            return;
        }
        iMulticlassTabService.removeTabContentListener(bVar);
        this.f17476a = null;
    }
}
