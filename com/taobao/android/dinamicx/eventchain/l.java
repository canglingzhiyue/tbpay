package com.taobao.android.dinamicx.eventchain;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import tb.dlk;
import tb.kge;

/* loaded from: classes5.dex */
public class l extends dlk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<DXRootView> f11861a;
    private WeakReference<DXWidgetNode> b;

    static {
        kge.a(249688036);
    }

    public DXRuntimeContext h() {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("fd8bacf8", new Object[]{this});
        }
        DXRootView i = i();
        if (i != null && (expandWidgetNode = i.getExpandWidgetNode()) != null) {
            return expandWidgetNode.getDXRuntimeContext();
        }
        return null;
    }

    public DXRootView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("b8699f67", new Object[]{this});
        }
        WeakReference<DXRootView> weakReference = this.f11861a;
        if (weakReference != null && weakReference.get() != null) {
            return this.f11861a.get();
        }
        return null;
    }

    public void a(DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc619e9", new Object[]{this, dXRootView});
        } else {
            this.f11861a = new WeakReference<>(dXRootView);
        }
    }

    public DXWidgetNode j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("cf06f710", new Object[]{this});
        }
        WeakReference<DXWidgetNode> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            return this.b.get();
        }
        return null;
    }

    public void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else {
            this.b = new WeakReference<>(dXWidgetNode);
        }
    }
}
