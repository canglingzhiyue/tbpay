package com.taobao.android.icart.widget.swipe;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.Globals;
import tb.bbz;
import tb.bcl;
import tb.bdn;
import tb.beb;
import tb.bed;
import tb.bem;
import tb.bet;
import tb.bex;
import tb.goc;
import tb.jqg;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTFRAMELAYOUT_CARTFRAMELAYOUT = 2501112744873668354L;
    public static final long DXCARTFRAMELAYOUT_DISABLEONLONGCLICK = -5720946013866990567L;
    public static final long DXCARTFRAMELAYOUT_DISABLESWIPE = 2690426589777932264L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12907a = false;
    private boolean b = false;

    static {
        kge.a(-1298808126);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ DXWidgetNode a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("85b68b1e", new Object[]{aVar}) : aVar.b();
    }

    public static /* synthetic */ void a(a aVar, SwipeFrameLayout swipeFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1bf78a", new Object[]{aVar, swipeFrameLayout, new Boolean(z)});
        } else {
            aVar.a(swipeFrameLayout, z);
        }
    }

    public static /* synthetic */ void a(a aVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8bfcb5", new Object[]{aVar, iDMComponent});
        } else {
            aVar.a(iDMComponent);
        }
    }

    public static /* synthetic */ boolean a(a aVar, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b765514", new Object[]{aVar, dXWidgetNode})).booleanValue() : aVar.a(dXWidgetNode);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new a();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof a)) {
        } else {
            super.onClone(dXWidgetNode, z);
            a aVar = (a) dXWidgetNode;
            this.f12907a = aVar.f12907a;
            this.b = aVar.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new SwipeFrameLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof SwipeFrameLayout)) {
            return;
        }
        final SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) view;
        if (!a() || this.b) {
            z = false;
        }
        swipeFrameLayout.setSwipeShow(z);
        if (!z) {
            return;
        }
        swipeFrameLayout.setSwipeListener(new c() { // from class: com.taobao.android.icart.widget.swipe.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.icart.widget.swipe.c
            public void a(boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z2)});
                } else if (!z2) {
                } else {
                    IDMComponent b = bdn.b(a.this.getDXRuntimeContext());
                    bbz a2 = bdn.a(a.this.getDXRuntimeContext());
                    if (b == null) {
                        bed.a("ItemSwipeError", "component is null");
                        return;
                    }
                    DXWidgetNode a3 = a.a(a.this);
                    if (a3 == null) {
                        bed.a("ItemSwipeError", "swipeWidget is null");
                    } else if (!a.a(a.this, a3) || !goc.a("forceRefreshComponent", true)) {
                        if (a2 == null) {
                            return;
                        }
                        bex.a(a2, "Page_ShoppingCart_Item_OpenOperate", beb.a(b, a2, "isSwipe=true"));
                    } else {
                        b.getFields().put(bcl.HIDE_SWIPE_ITEM, (Object) false);
                        a.a(a.this, b);
                        bed.a("ItemSwipeError", "swipeWidget's children count is 0 And orange forceRefresh");
                    }
                }
            }

            @Override // com.taobao.android.icart.widget.swipe.c
            public Rect a() {
                View v;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Rect) ipChange2.ipc$dispatch("ef387fb1", new Object[]{this});
                }
                DXWidgetNode a2 = a.a(a.this);
                if (a2 == null || (v = a2.getDXRuntimeContext().v()) == null) {
                    return null;
                }
                int[] iArr = new int[2];
                v.getLocationOnScreen(iArr);
                return new Rect(v.getLeft(), iArr[1], v.getRight(), iArr[1] + v.getHeight());
            }

            @Override // com.taobao.android.icart.widget.swipe.c
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    a.a(a.this, swipeFrameLayout, false);
                }
            }

            @Override // com.taobao.android.icart.widget.swipe.c
            public boolean c() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                }
                bbz a2 = bdn.a(a.this.getDXRuntimeContext());
                return a2 != null && a2.n().o().t();
            }
        });
        DXWidgetNode b = b();
        if (b != null) {
            int measuredWidth = b.getMeasuredWidth();
            if (measuredWidth <= 0) {
                measuredWidth = 100;
            }
            swipeFrameLayout.setMaxSwipeWidth(measuredWidth);
        }
        Drawable background = view.getBackground();
        if (!(background instanceof GradientDrawable)) {
            return;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (getBorderWidth() != 0) {
            return;
        }
        gradientDrawable.setStroke(0, 0, 0.0f, 0.0f);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (j != -6544685697300501093L || !(view instanceof SwipeFrameLayout)) {
            return;
        }
        SwipeFrameLayout swipeFrameLayout = (SwipeFrameLayout) view;
        if (this.f12907a) {
            view.setOnLongClickListener(null);
            swipeFrameLayout.setOnLongClick(null);
            return;
        }
        swipeFrameLayout.setOnLongClick(new View.OnLongClickListener() { // from class: com.taobao.android.icart.widget.swipe.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                }
                a.this.postEvent(new DXEvent(-6544685697300501093L));
                return true;
            }
        });
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXCARTFRAMELAYOUT_DISABLEONLONGCLICK) {
            if (i == 0) {
                z = false;
            }
            this.f12907a = z;
        } else if (j == DXCARTFRAMELAYOUT_DISABLESWIPE) {
            if (i == 0) {
                z = false;
            }
            this.b = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != DXCARTFRAMELAYOUT_DISABLEONLONGCLICK && j != DXCARTFRAMELAYOUT_DISABLESWIPE) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        bbz a2 = bdn.a(getDXRuntimeContext());
        return a2 != null && bem.q(a2.n());
    }

    private DXWidgetNode b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("65316b08", new Object[]{this});
        }
        DXWidgetNode parentWidget = getParentWidget();
        if (parentWidget == null) {
            return null;
        }
        for (int i = 0; i < parentWidget.getChildrenCount(); i++) {
            DXWidgetNode childAt = parentWidget.getChildAt(i);
            if (childAt != null && com.taobao.android.weex_framework.util.a.ATOM_EXT_button.equals(childAt.getUserId())) {
                return childAt;
            }
        }
        return parentWidget.queryWidgetNodeByUserId(com.taobao.android.weex_framework.util.a.ATOM_EXT_button);
    }

    private void a(SwipeFrameLayout swipeFrameLayout, boolean z) {
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564eef41", new Object[]{this, swipeFrameLayout, new Boolean(z)});
            return;
        }
        IDMComponent b2 = bdn.b(getDXRuntimeContext());
        if (b2 == null || (b = b()) == null) {
            return;
        }
        JSONObject fields = b2.getFields();
        if (!fields.containsKey(bcl.HIDE_SWIPE_ITEM) || fields.getBooleanValue(bcl.HIDE_SWIPE_ITEM) == z) {
            return;
        }
        fields.put(bcl.HIDE_SWIPE_ITEM, (Object) Boolean.valueOf(z));
        b.setNeedParse(new DXWidgetRefreshOption.a().b(true).a(true).a());
        swipeFrameLayout.setMaxSwipeWidth(b.getMeasuredWidth());
    }

    private boolean a(DXWidgetNode dXWidgetNode) {
        View v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("613bf3cb", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if (dXWidgetNode.getDXRuntimeContext() == null || (v = dXWidgetNode.getDXRuntimeContext().v()) == null) {
            return true;
        }
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            UnifyLog.d("ItemSwipeInfo", "viewGroup childCount=" + viewGroup.getChildCount());
            if (viewGroup.getChildCount() == 0) {
                return true;
            }
        }
        float c = bet.c(Globals.getApplication());
        int left = v.getLeft();
        UnifyLog.d("ItemSwipeInfo", "screenWidth=" + c + ",left=" + left);
        return ((float) Math.abs(left)) > c;
    }

    private void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
            return;
        }
        bbz c = c();
        if (c == null) {
            return;
        }
        try {
            c.x().a(iDMComponent);
        } catch (Exception e) {
            jqg.a("iCart", "ItemSwipeError", e.getMessage());
        }
    }

    private bbz c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbz) ipChange.ipc$dispatch("1e65fae2", new Object[]{this});
        }
        bbz a2 = bdn.a(getDXRuntimeContext());
        if (a2 != null) {
            return a2;
        }
        bed.a("ItemSwipeError", "cartPresenter is null");
        return null;
    }
}
