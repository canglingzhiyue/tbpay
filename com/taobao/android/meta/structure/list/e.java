package com.taobao.android.meta.structure.list;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.ListStyle;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final h f14291a;

    static {
        kge.a(-1462927372);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    public void a(ListStyle listStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b84a965", new Object[]{this, listStyle});
        } else {
            q.c(listStyle, "listStyle");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        }
    }

    public e(h widget) {
        q.c(widget, "widget");
        this.f14291a = widget;
    }

    public final h i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("1bb482ab", new Object[]{this}) : this.f14291a;
    }
}
