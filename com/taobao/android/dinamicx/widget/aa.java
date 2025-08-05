package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.CompoundButton;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXSwitchEvent;
import com.taobao.android.dinamicx.view.DXNativeSwitch;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import tb.gbd;
import tb.kge;

/* loaded from: classes.dex */
public class aa extends DXWidgetNode implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OFF = 0;
    public static final int ON = 1;

    /* renamed from: a  reason: collision with root package name */
    private static int f12034a;
    private static int b;
    public int e;
    private int c = -45056;
    private int d = -1710619;
    public boolean f = false;

    public static /* synthetic */ Object ipc$super(aa aaVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 3;
    }

    static {
        kge.a(1202629286);
        kge.a(-723128125);
        f12034a = R.id.dx_switch_background_on_color;
        b = R.id.dx_switch_background_off_color;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1550547837);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new aa();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new aa();
    }

    public aa() {
        setAccessibility(1);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i3 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a2 == 1073741824;
        if (a3 != 1073741824) {
            z = false;
        }
        int b2 = z2 ? DXWidgetNode.DXMeasureSpec.b(i) : 0;
        if (z) {
            i3 = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(b2, i3);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof aa)) {
            return;
        }
        aa aaVar = (aa) dXWidgetNode;
        this.e = aaVar.e;
        this.d = aaVar.d;
        this.c = aaVar.c;
        this.f = aaVar.f;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (u.DX_PAGE_INDICATOR_ON_COLOR == j) {
            this.c = i;
        } else if (u.DX_PAGE_INDICATOR_OFF_COLOR == j) {
            this.d = i;
        } else if (6477083193262386775L == j) {
            this.e = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeSwitch(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof DXNativeSwitch)) {
        } else {
            DXNativeSwitch dXNativeSwitch = (DXNativeSwitch) view;
            dXNativeSwitch.setClickable(true);
            dXNativeSwitch.setTextOn("");
            dXNativeSwitch.setTextOff("");
            dXNativeSwitch.setShowText(false);
            dXNativeSwitch.setThumbTextPadding(0);
            dXNativeSwitch.setSplitTrack(false);
            a(context, dXNativeSwitch, getMeasuredHeight());
            this.f = true;
            if (this.e != 1) {
                z = false;
            }
            dXNativeSwitch.setChecked(z);
            this.f = false;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else if (view == null || !(view instanceof DXNativeSwitch) || j != 5288679823228297259L) {
        } else {
            ((DXNativeSwitch) view).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.dinamicx.widget.DXSwitchWidgetNode$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    } else if (aa.this.f) {
                    } else {
                        DXSwitchEvent dXSwitchEvent = new DXSwitchEvent(5288679823228297259L);
                        dXSwitchEvent.setOn(z);
                        aa.this.postEvent(dXSwitchEvent);
                    }
                }
            });
        }
    }

    public void a(Context context, DXNativeSwitch dXNativeSwitch, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0707198", new Object[]{this, context, dXNativeSwitch, new Integer(i)});
            return;
        }
        Object tag = dXNativeSwitch.getTag(f12034a);
        Object tag2 = dXNativeSwitch.getTag(b);
        if (tag != null && tag2 != null && ((Integer) tag).intValue() == this.c && ((Integer) tag2).intValue() == this.d) {
            return;
        }
        int tryFetchDarkModeColor = tryFetchDarkModeColor("onColor", 1, this.c);
        int tryFetchDarkModeColor2 = tryFetchDarkModeColor("offColor", 1, this.d);
        GradientDrawable a2 = a(context, i);
        dXNativeSwitch.setTrackDrawable(a(a(tryFetchDarkModeColor, i), a(tryFetchDarkModeColor2, i)));
        dXNativeSwitch.setThumbDrawable(a2);
        dXNativeSwitch.setTag(f12034a, Integer.valueOf(tryFetchDarkModeColor));
        dXNativeSwitch.setTag(b, Integer.valueOf(tryFetchDarkModeColor2));
    }

    private GradientDrawable a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("257b7ba2", new Object[]{this, new Integer(i), new Integer(i2)}) : gbd.a(0, 16777215, i2 / 2, i, i2, i2);
    }

    private GradientDrawable a(Context context, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (GradientDrawable) ipChange.ipc$dispatch("eab4f8e7", new Object[]{this, context, new Integer(i)}) : gbd.a((int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()), 16777215, i / 2, -1, i, i);
    }

    private StateListDrawable a(Drawable drawable, Drawable drawable2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StateListDrawable) ipChange.ipc$dispatch("396db641", new Object[]{this, drawable, drawable2}) : gbd.a(drawable, drawable2, gbd.STATE_CHECKED);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == aa.class;
    }
}
