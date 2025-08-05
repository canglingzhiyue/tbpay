package com.taobao.homepage.pop.view.container.window;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.model.pop.PopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import tb.gbg;

/* loaded from: classes7.dex */
public class a implements com.taobao.homepage.pop.view.container.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private View f17269a;
    private final IPopAnchorViewInfo b = a(0);

    public a(View view) {
        this.f17269a = view;
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public IPopAnchorViewInfo a(IPopData iPopData, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopAnchorViewInfo) ipChange.ipc$dispatch("a9b221bd", new Object[]{this, iPopData, new Integer(i)}) : this.b;
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public IPopAnchorViewInfo a(View view, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IPopAnchorViewInfo) ipChange.ipc$dispatch("96ce32eb", new Object[]{this, view, new Integer(i)}) : this.b;
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public View a(com.taobao.homepage.pop.viewmodel.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("96d6ddb0", new Object[]{this, bVar}) : this.f17269a;
    }

    @Override // com.taobao.homepage.pop.view.container.a
    public int a(IPopData iPopData, IPopAnchorViewInfo iPopAnchorViewInfo, View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cb93d27b", new Object[]{this, iPopData, iPopAnchorViewInfo, view})).intValue() : this.b.getHeight();
    }

    private IPopAnchorViewInfo a(int i) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPopAnchorViewInfo) ipChange.ipc$dispatch("af74822d", new Object[]{this, new Integer(i)});
        }
        View view = this.f17269a;
        if (view == null || (context = view.getContext()) == null) {
            return null;
        }
        View view2 = this.f17269a;
        int b = view2 == null ? gbg.b(context) : view2.getWidth();
        View view3 = this.f17269a;
        return new PopAnchorViewInfo(0, 0, b, view3 == null ? gbg.c(context) : view3.getHeight(), i, 0);
    }
}
