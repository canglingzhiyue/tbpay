package com.taobao.android.litecreator.sdk.editor;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class al<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f13403a = 0;
    private List<T> b;
    private List<T> c;

    static {
        kge.a(-378749397);
    }

    public void a(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        List<T> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i < 0 || i >= this.b.size()) {
        } else {
            this.f13403a = i;
        }
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f13403a;
    }

    public T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("5dd0ace5", new Object[]{this});
        }
        com.taobao.android.litecreator.util.u.a(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL onDestroy, LCContext ,mCurrentIndex=" + this.f13403a + " ，size=" + d());
        return b(this.f13403a);
    }

    public T b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e7d36638", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.b.size()) {
            return this.b.get(i);
        }
        return null;
    }

    public T c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("3204ff79", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.b.size()) {
            return this.b.remove(i);
        }
        return null;
    }

    public void b(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list == null || list.size() <= 0) {
        } else {
            List<T> list2 = this.b;
            if (list2 != null) {
                list2.addAll(list);
            }
            this.c = list;
        }
    }

    public List<T> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.c;
    }

    public List<T> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.b;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.c = null;
        }
    }
}
