package com.taobao.android.dinamicx.widget.refresh.layout.constant;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a CodeExact;
    public static final a CodeExactUnNotify;
    public static final a DeadLock;
    public static final a DeadLockUnNotify;
    public static final a Default;
    public static final a DefaultUnNotify;
    public static final a XmlExact;
    public static final a XmlExactUnNotify;
    public static final a XmlLayout;
    public static final a XmlLayoutUnNotify;
    public static final a XmlWrap;
    public static final a XmlWrapUnNotify;
    public static final a[] values;

    /* renamed from: a  reason: collision with root package name */
    public final int f12181a;
    public final boolean b;

    static {
        kge.a(1965343666);
        DefaultUnNotify = new a(0, false);
        Default = new a(1, true);
        XmlWrapUnNotify = new a(2, false);
        XmlWrap = new a(3, true);
        XmlExactUnNotify = new a(4, false);
        XmlExact = new a(5, true);
        XmlLayoutUnNotify = new a(6, false);
        XmlLayout = new a(7, true);
        CodeExactUnNotify = new a(8, false);
        CodeExact = new a(9, true);
        DeadLockUnNotify = new a(10, false);
        DeadLock = new a(10, true);
        values = new a[]{DefaultUnNotify, Default, XmlWrapUnNotify, XmlWrap, XmlExactUnNotify, XmlExact, XmlLayoutUnNotify, XmlLayout, CodeExactUnNotify, CodeExact, DeadLockUnNotify, DeadLock};
    }

    private a(int i, boolean z) {
        this.f12181a = i;
        this.b = z;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4bfc742e", new Object[]{this});
        }
        if (!this.b) {
            return this;
        }
        a aVar = values[this.f12181a - 1];
        return !aVar.b ? aVar : DefaultUnNotify;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b62bfc4d", new Object[]{this}) : !this.b ? values[this.f12181a + 1] : this;
    }

    public boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("efece62c", new Object[]{this, aVar})).booleanValue() : this.f12181a < aVar.f12181a || ((!this.b || CodeExact == this) && this.f12181a == aVar.f12181a);
    }
}
