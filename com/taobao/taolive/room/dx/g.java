package com.taobao.taolive.room.dx;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.view.DXNativeCountDownTimerView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import tb.kge;

/* loaded from: classes8.dex */
public class g extends com.taobao.android.dinamicx.widget.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXLIVECOUNTDOWNVIEW_LIVECOUNTDOWNVIEW = 2878922941451687645L;
    public static final long DXLIVECOUNTDOWNVIEW_LIVE_FUTURETIME = -7257181253166306744L;

    /* renamed from: a  reason: collision with root package name */
    private long f21622a;

    static {
        kge.a(-625707711);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-545883368);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new g();
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof g)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.f21622a = ((g) dXWidgetNode).f21622a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXLiveCountDownTimerView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        long j = this.f21622a;
        if (j <= 0 || !(view instanceof DXLiveCountDownTimerView)) {
            return;
        }
        DXLiveCountDownTimerView dXLiveCountDownTimerView = (DXLiveCountDownTimerView) view;
        dXLiveCountDownTimerView.setLive_futureTime(j);
        dXLiveCountDownTimerView.setFutureTime(this.f21622a);
        dXLiveCountDownTimerView.setCurrentTime(this.f21622a - System.currentTimeMillis());
        dXLiveCountDownTimerView.updateCountView();
        if (dXLiveCountDownTimerView.getLastTime() > 0) {
            dXLiveCountDownTimerView.showCountDown();
            dXLiveCountDownTimerView.updateCountView();
            dXLiveCountDownTimerView.getTimer().a();
            dXLiveCountDownTimerView.setOnFinishListener(new DXNativeCountDownTimerView.a() { // from class: com.taobao.taolive.room.dx.g.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.DXNativeCountDownTimerView.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        g.this.postEvent(new DXEvent(-6786364507638278416L));
                    }
                }
            });
            return;
        }
        dXLiveCountDownTimerView.hideCountDown();
        dXLiveCountDownTimerView.getTimer().b();
        postEvent(new DXEvent(-6786364507638278416L));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXLIVECOUNTDOWNVIEW_LIVE_FUTURETIME) {
            this.f21622a = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }
}
