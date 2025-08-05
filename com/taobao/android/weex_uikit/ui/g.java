package com.taobao.android.weex_uikit.ui;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.h;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class g<TYPE extends h> implements h.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private UINode f16133a;
    private TYPE b;
    private TYPE c;
    private boolean d;

    static {
        kge.a(-2036694439);
        kge.a(-1789380305);
    }

    public g(UINode uINode) {
        this.f16133a = uINode;
    }

    public void a(TYPE type, TYPE type2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1af3ae3c", new Object[]{this, type, type2});
            return;
        }
        this.b = type;
        this.c = type2;
        this.c.a(this);
    }

    public TYPE a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TYPE) ipChange.ipc$dispatch("96380618", new Object[]{this});
        }
        if (com.taobao.android.weex_framework.util.j.a()) {
            return this.b;
        }
        if (this.f16133a.getInstance().isUIReady()) {
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

    @Override // com.taobao.android.weex_uikit.ui.h.a
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.b.a(map);
        }
    }
}
