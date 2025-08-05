package com.taobao.homepage.pop.viewmodel;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private IPopData f17274a;
    private int b;
    private View c;
    private com.taobao.homepage.pop.ucp.b d;

    public b(IPopData iPopData) {
        this.b = -1;
        this.f17274a = iPopData;
    }

    public b(IPopData iPopData, int i, View view) {
        this.b = -1;
        this.f17274a = iPopData;
        this.b = i;
        this.c = view;
    }

    public IPopData a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopData) ipChange.ipc$dispatch("f0db8658", new Object[]{this}) : this.f17274a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.c;
    }

    public com.taobao.homepage.pop.ucp.b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.homepage.pop.ucp.b) ipChange.ipc$dispatch("1a6c15f3", new Object[]{this}) : this.d;
    }

    public void a(com.taobao.homepage.pop.ucp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bcc170", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }
}
