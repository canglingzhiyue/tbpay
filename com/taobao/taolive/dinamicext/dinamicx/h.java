package com.taobao.taolive.dinamicext.dinamicx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import tb.kge;

/* loaded from: classes8.dex */
public class h extends com.taobao.android.dinamicx.widget.l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLGRIDLAYOUT_ON_PAGE_APPEAR = -8975334121118753601L;
    public static final long DXTBLGRIDLAYOUT_ON_PAGE_DISAPPEAR = -5201408949358043646L;
    public static final long DXTBLGRIDLAYOUT_TBLGRIDLAYOUT = 1280153617202335731L;

    static {
        kge.a(-1287830429);
    }

    public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1834790766) {
            super.onBeforeBindChildData();
            return null;
        } else if (hashCode != -630327606) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.sendBroadcastEvent((DXEvent) objArr[0]);
            return null;
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1227421638);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new h();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.l, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new h();
    }

    @Override // com.taobao.android.dinamicx.widget.l, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        setDisableFlatten(true);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
        } else if (dXEvent != null) {
            if (5288671110273408574L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                if (getChildrenCount() == 0) {
                    return;
                }
                for (DXWidgetNode dXWidgetNode : getChildren()) {
                    DXViewEvent dXViewEvent = new DXViewEvent(-8975334121118753601L);
                    dXViewEvent.setItemIndex(dXWidgetNode.getDXRuntimeContext().i());
                    dXWidgetNode.sendBroadcastEvent(dXViewEvent);
                }
            } else if (5388973340095122049L == dXEvent.getEventId()) {
                postEvent(dXEvent);
                if (getChildrenCount() == 0) {
                    return;
                }
                for (DXWidgetNode dXWidgetNode2 : getChildren()) {
                    DXViewEvent dXViewEvent2 = new DXViewEvent(-5201408949358043646L);
                    dXViewEvent2.setItemIndex(dXWidgetNode2.getDXRuntimeContext().i());
                    dXWidgetNode2.sendBroadcastEvent(dXViewEvent2);
                }
            } else {
                super.sendBroadcastEvent(dXEvent);
            }
        }
    }
}
