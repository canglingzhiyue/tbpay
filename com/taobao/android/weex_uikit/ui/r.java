package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.v;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINodeGroup f16145a;
    private v b;
    private v c;
    private boolean d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public interface a {
        void a(v.a aVar);
    }

    static {
        kge.a(-1195906718);
    }

    public static /* synthetic */ v a(r rVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (v) ipChange.ipc$dispatch("8f0b10aa", new Object[]{rVar}) : rVar.b;
    }

    public r(UINodeGroup uINodeGroup) {
        this.f16145a = uINodeGroup;
        this.b = new v(uINodeGroup);
        this.c = new v(uINodeGroup);
        this.c.a(new a() { // from class: com.taobao.android.weex_uikit.ui.r.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_uikit.ui.r.a
            public void a(v.a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("97182827", new Object[]{this, aVar});
                } else {
                    r.a(r.this).a(aVar);
                }
            }
        });
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : b().a();
    }

    public void a(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59ce7920", new Object[]{this, uINode});
        } else {
            b().a(uINode);
        }
    }

    public void a(int i, UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6afac74d", new Object[]{this, new Integer(i), uINode});
        } else {
            b().a(i, uINode);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b().b(i);
        }
    }

    public int b(UINode uINode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("134606b2", new Object[]{this, uINode})).intValue() : b().b(uINode);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            b().a(i, i2);
        }
    }

    public UINode b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UINode) ipChange.ipc$dispatch("4fbee3f2", new Object[]{this, new Integer(i)}) : b().a(i);
    }

    public v b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v) ipChange.ipc$dispatch("ed55f8a9", new Object[]{this});
        }
        if (com.taobao.android.weex_framework.util.j.a()) {
            return this.b;
        }
        if (this.f16145a.getInstance().isUIReady()) {
            if (!this.d) {
                this.b.a(this.c);
                this.d = true;
            }
            return this.c;
        }
        return this.b;
    }

    public void a(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.c.a(list);
        }
    }
}
