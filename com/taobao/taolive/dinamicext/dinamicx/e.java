package com.taobao.taolive.dinamicext.dinamicx;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.taobaocompat.lifecycle.TimestampSynchronizer;
import com.taobao.taolive.uikit.view.TBLiveCountDownView;
import tb.kge;

/* loaded from: classes8.dex */
public class e extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTBLCOUNTDOWNVIEW_AUTOCUTDOWN = 6638060553199557000L;
    public static final long DXTBLCOUNTDOWNVIEW_BGCOLOR = 4692251727942617679L;
    public static final long DXTBLCOUNTDOWNVIEW_EXPIRETEXT = 736185736852682556L;
    public static final long DXTBLCOUNTDOWNVIEW_PREFIX = 9933265312032660L;
    public static final long DXTBLCOUNTDOWNVIEW_SUFFIX = 10152742301255515L;
    public static final long DXTBLCOUNTDOWNVIEW_TBLCOUNTDOWNVIEW = -129525802453820114L;
    public static final long DXTBLCOUNTDOWNVIEW_TEXTCOLOR = 5737767606580872653L;
    public static final long DXTBLCOUNTDOWNVIEW_TEXTSIZE = 6751005219504497256L;
    public static final long DXTBLCOUNTDOWNVIEW_TIMELEFT = 6755539235969560642L;
    public static final long DXTBLCOUNTDOWNVIEW_TIMELEFT1 = 8063753808540655988L;

    /* renamed from: a  reason: collision with root package name */
    private int f21413a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    static {
        kge.a(1627123887);
    }

    public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
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
            kge.a(-981817210);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new e();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new e();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof e)) {
        } else {
            super.onClone(dXWidgetNode, z);
            e eVar = (e) dXWidgetNode;
            this.f21413a = eVar.f21413a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        TBLiveCountDownView tBLiveCountDownView = new TBLiveCountDownView(context, true);
        tBLiveCountDownView.needExpireText(true);
        return tBLiveCountDownView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof TBLiveCountDownView)) {
            return;
        }
        TBLiveCountDownView tBLiveCountDownView = (TBLiveCountDownView) view;
        try {
            tBLiveCountDownView.setTimeTextColor(Color.parseColor(this.f));
            tBLiveCountDownView.setTimeTextSize(Float.parseFloat(this.g));
            tBLiveCountDownView.setColonColor(Color.parseColor(this.f));
            tBLiveCountDownView.setColonSize(Float.parseFloat(this.g));
            tBLiveCountDownView.setPreTextColor(Color.parseColor(this.f));
            tBLiveCountDownView.setPreTextSize(Float.parseFloat(this.g));
            tBLiveCountDownView.setSuffixTextColor(Color.parseColor(this.f));
            tBLiveCountDownView.setSuffixTextSize(Float.parseFloat(this.g));
            tBLiveCountDownView.setExpireTextColor(Color.parseColor(this.f));
            tBLiveCountDownView.setExpireTextSize(Float.parseFloat(this.g));
        } catch (Error unused) {
        }
        tBLiveCountDownView.setExpireTextStr(this.c);
        tBLiveCountDownView.setPreText(this.d);
        tBLiveCountDownView.setSuffixText(this.e);
        long serverTime = TimestampSynchronizer.getServerTime();
        long j = 0;
        try {
            j = Long.parseLong(this.h);
        } catch (Error unused2) {
        }
        tBLiveCountDownView.setCountToEnd(j - serverTime);
        tBLiveCountDownView.start();
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

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXTBLCOUNTDOWNVIEW_BGCOLOR) {
            this.b = str;
        } else if (j == DXTBLCOUNTDOWNVIEW_EXPIRETEXT) {
            this.c = str;
        } else if (j == DXTBLCOUNTDOWNVIEW_PREFIX) {
            this.d = str;
        } else if (j == DXTBLCOUNTDOWNVIEW_SUFFIX) {
            this.e = str;
        } else if (j == 5737767606580872653L) {
            this.f = str;
        } else if (j == 6751005219504497256L) {
            this.g = str;
        } else if (j == DXTBLCOUNTDOWNVIEW_TIMELEFT) {
            this.h = str;
        } else if (j == DXTBLCOUNTDOWNVIEW_TIMELEFT1) {
            this.i = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXTBLCOUNTDOWNVIEW_AUTOCUTDOWN) {
            this.f21413a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
