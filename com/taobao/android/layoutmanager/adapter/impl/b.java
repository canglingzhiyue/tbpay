package com.taobao.android.layoutmanager.adapter.impl;

import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.oee;

/* loaded from: classes5.dex */
public class b extends BitmapDrawable implements oee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.phenix.animate.b f13116a;

    static {
        kge.a(1526296914);
        kge.a(-1563563788);
    }

    public b(com.taobao.phenix.animate.b bVar) {
        this.f13116a = bVar;
    }

    @Override // tb.oee
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f13116a.b();
        }
    }

    @Override // tb.oee
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.f13116a.f();
        }
    }

    @Override // tb.oee
    public BitmapDrawable c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BitmapDrawable) ipChange.ipc$dispatch("49870761", new Object[]{this}) : this.f13116a;
    }

    @Override // tb.oee
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f13116a.a(i);
        }
    }
}
