package tb;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.DXMeasuredRollingTextView;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.RollingNumberView;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.rolling.b;
import tb.xnc;

/* loaded from: classes7.dex */
public class xnf extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXROLLINGNUMBERVIEW_ISROLLTEXTBOLD = 35744353439362217L;
    public static final long DXROLLINGNUMBERVIEW_ONRENDERFINISH = 8225465646077119148L;
    public static final long DXROLLINGNUMBERVIEW_ROLLDURATION = 1804505513984238091L;
    public static final long DXROLLINGNUMBERVIEW_ROLLINGNUMBERVIEW = 5267730759588085740L;
    public static final long DXROLLINGNUMBERVIEW_ROLLINTERVAL = 6702524853565958922L;
    public static final long DXROLLINGNUMBERVIEW_ROLLREPETITIONCOUNT = -6075904309217442568L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXT = 6173449365121493862L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTCOLOR = 8850543877302593130L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTCOLORSTRING = -6003350147710985241L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTFONT = 2837648429109017857L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTSIZE = 2837649331581772805L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTSIZESTRING = -19326424667478654L;
    public static final long DXROLLINGNUMBERVIEW_ROLLTEXTSPACE = 8851115877917452119L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f34397a;
    private String e;
    private String g;
    private String h;
    private String j;
    private int k;
    private int b = 1000;
    private int c = 1000;
    private int d = 1;
    private int f = Color.parseColor("#9F6D45");
    private int i = 74;

    static {
        kge.a(1832096078);
    }

    public static /* synthetic */ Object ipc$super(xnf xnfVar, String str, Object... objArr) {
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
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2037171675);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new xnf();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new xnf();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof xnf)) {
        } else {
            super.onClone(dXWidgetNode, z);
            xnf xnfVar = (xnf) dXWidgetNode;
            this.f34397a = xnfVar.f34397a;
            this.b = xnfVar.b;
            this.c = xnfVar.c;
            this.d = xnfVar.d;
            this.e = xnfVar.e;
            this.f = xnfVar.f;
            this.g = xnfVar.g;
            this.h = xnfVar.h;
            this.i = xnfVar.i;
            this.j = xnfVar.j;
            this.k = xnfVar.k;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new RollingNumberView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof RollingNumberView)) {
            ldf.d("DXRollingNumberViewWidgetNode", "onRenderView：当前的view不是RollingNumberView类型");
            return;
        }
        ((RollingNumberView) view).setRollingViewStyleAttributes(new xnc.a(this.e, this.b).a(this.c).a(this.f34397a).c(this.f).d(this.i).b(this.d).e(this.k).a(this.h).f(getMeasuredHeight()).a());
        postEvent(new DXEvent(DXROLLINGNUMBERVIEW_ONRENDERFINISH));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof RollingNumberView)) {
            ldf.d("DXRollingNumberViewWidgetNode", "onEvent：当前的view不是RollingNumberView类型");
            return false;
        }
        if (dXEvent.getEventId() == 5388973340095122049L) {
            ldf.d("DXRollingNumberViewWidgetNode", "disAppear");
            ((RollingNumberView) v).stopAnimation();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else {
            DXMeasuredRollingTextView dXMeasuredRollingTextView = new DXMeasuredRollingTextView(DinamicXEngine.i());
            dXMeasuredRollingTextView.setText(b.b(this.e));
            dXMeasuredRollingTextView.setTextSize(0, this.i);
            if (Build.VERSION.SDK_INT >= 21 && (i3 = this.k) != 0) {
                dXMeasuredRollingTextView.setLetterSpacing(i3);
            }
            b.a(dXMeasuredRollingTextView, this.f34397a, this.h);
            dXMeasuredRollingTextView.onMeasure(i, i2);
            setMeasuredDimension(dXMeasuredRollingTextView.getMeasuredWidthAndState(), dXMeasuredRollingTextView.getMeasuredHeightAndState());
        }
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXT) {
            this.e = str;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTCOLORSTRING) {
            this.g = str;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTFONT) {
            this.h = str;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTSIZESTRING) {
            this.j = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXROLLINGNUMBERVIEW_ISROLLTEXTBOLD) {
            if (i == 0) {
                z = false;
            }
            this.f34397a = z;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLDURATION) {
            this.b = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLINTERVAL) {
            this.c = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLREPETITIONCOUNT) {
            this.d = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTCOLOR) {
            this.f = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTSIZE) {
            this.i = i;
        } else if (j == DXROLLINGNUMBERVIEW_ROLLTEXTSPACE) {
            this.k = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
