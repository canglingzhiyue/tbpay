package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.dinamicx.view.DXNativeRecyclerView;
import com.taobao.android.dinamicx.view.c;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.x;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.bindingx.ScrollIconsVariableHighMsg;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;

/* loaded from: classes.dex */
public class leo extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HICONSCROLL = 6745126353234294379L;

    /* renamed from: a  reason: collision with root package name */
    private final ScrollIconsVariableHighMsg f30534a = new ScrollIconsVariableHighMsg();
    private int b;
    private int c;

    static {
        kge.a(442000669);
    }

    public static /* synthetic */ Object ipc$super(leo leoVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        int a2 = a(dXRuntimeContext);
        if (objArr == null || objArr.length < 5 || dXRuntimeContext == null) {
            return;
        }
        int[] a3 = a(objArr);
        int[] b = b(objArr);
        int c = c(objArr);
        int a4 = a(dXRuntimeContext, objArr, dXRuntimeContext.m());
        DXRootView s = dXRuntimeContext.s();
        if (s == null) {
            return;
        }
        if (dXEvent instanceof DXScrollEvent) {
            a((DXScrollEvent) dXEvent, dXRuntimeContext, a3, b, s, c, a4);
        } else if (5288671110273408574L == dXEvent.getEventId()) {
            a(dXRuntimeContext, s, b, a2);
        } else {
            a(dXRuntimeContext, a3, b, s, c, a4, a2);
        }
    }

    private int a(DXRuntimeContext dXRuntimeContext) {
        IIconService iIconService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("487cd5cc", new Object[]{this, dXRuntimeContext})).intValue();
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 != null && (iIconService = (IIconService) a2.a(IIconService.class)) != null) {
            return iIconService.getInitPageIndex();
        }
        return 0;
    }

    private void a(DXRuntimeContext dXRuntimeContext, DXRootView dXRootView, int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587f711b", new Object[]{this, dXRuntimeContext, dXRootView, iArr, new Integer(i)});
            return;
        }
        DXWidgetNode queryWidgetNodeByUserId = dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId("icon_slider");
        View view = null;
        if (queryWidgetNodeByUserId instanceof x) {
            view = ((x) queryWidgetNodeByUserId).getDXRuntimeContext().v();
        }
        if (!(view instanceof DXNativeRecyclerView)) {
            return;
        }
        DXNativeRecyclerView dXNativeRecyclerView = (DXNativeRecyclerView) view;
        int scrolledX = dXNativeRecyclerView.getScrolledX();
        if (scrolledX >= a(dXRuntimeContext.D(), dXRootView.getContext(), iArr[1]) && dXNativeRecyclerView.getLayoutManager() != null && (dXNativeRecyclerView.getLayoutManager() instanceof c)) {
            int findFirstVisibleItemPosition = ((c) dXNativeRecyclerView.getLayoutManager()).findFirstVisibleItemPosition();
            if (i == 1 && findFirstVisibleItemPosition != i) {
                dXNativeRecyclerView.scrollToPosition(1);
            }
        }
        if (scrolledX == this.c && iArr[0] == iArr[1]) {
            this.b = scrolledX;
            ldf.d("DXHIconScrollEventHandler", "appear offset:" + this.b);
        }
        this.c = a(dXRuntimeContext.D(), dXRootView.getContext(), iArr[1] - iArr[0]);
    }

    private void a(DXRuntimeContext dXRuntimeContext, int[] iArr, int[] iArr2, DXRootView dXRootView, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b25926d", new Object[]{this, dXRuntimeContext, iArr, iArr2, dXRootView, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int a2 = a(dXRuntimeContext, iArr, dXRootView.getContext(), 0);
        a(dXRuntimeContext, dXRootView, a2, i3 == 0 ? 0 : a(dXRuntimeContext, iArr, dXRootView.getContext(), 1) - a2, iArr2, i, i2);
        DXWidgetNode queryWidgetNodeByUserId = dXRootView.getExpandWidgetNode().queryWidgetNodeByUserId("icon_slider");
        if (i3 != 0 || !(queryWidgetNodeByUserId instanceof x)) {
            return;
        }
        ((x) queryWidgetNodeByUserId).resetScrollerListener();
    }

    public void a(DXScrollEvent dXScrollEvent, DXRuntimeContext dXRuntimeContext, int[] iArr, int[] iArr2, DXRootView dXRootView, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cfef285", new Object[]{this, dXScrollEvent, dXRuntimeContext, iArr, iArr2, dXRootView, new Integer(i), new Integer(i2)});
            return;
        }
        ViewParent parent = dXRootView.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getLayoutParams() != null) {
                Context m = dXRuntimeContext.m();
                int a2 = a(dXRuntimeContext, iArr, m, 0);
                if (a2 < 0) {
                    return;
                }
                int a3 = a(dXRuntimeContext, iArr, m, 1);
                if (a3 < 0) {
                    a3 = a2;
                }
                int a4 = a(dXRuntimeContext.D(), m, iArr2[0]);
                float a5 = a(dXRuntimeContext, dXScrollEvent, m, iArr2);
                if (a5 > 0.0f) {
                    i3 = a4 == 0 ? a2 : (int) ((a5 / a4) * (a3 - a2));
                } else {
                    i3 = 0;
                }
                a(dXRuntimeContext, dXRootView, a2, i3, iArr2, i, i2);
                this.f30534a.postMessage(dXRuntimeContext.C().b(), dXRootView, (int) a5, viewGroup.getLayoutParams().height);
                return;
            }
        }
        ldf.d("DXHIconScrollEventHandler", "scrollEvent trigger but this View is not attached to a parent");
    }

    private void a(DXRuntimeContext dXRuntimeContext, DXRootView dXRootView, int i, int i2, int[] iArr, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("692b6728", new Object[]{this, dXRuntimeContext, dXRootView, new Integer(i), new Integer(i2), iArr, new Integer(i3), new Integer(i4)});
        } else if (dXRootView == null || dXRootView.getParent() == null || !(dXRootView.getParent() instanceof ViewGroup)) {
        } else {
            ViewGroup viewGroup = (ViewGroup) dXRootView.getParent();
            if (!a(viewGroup)) {
                a(viewGroup, dXRuntimeContext, dXRootView, iArr);
            }
            viewGroup.setBackgroundColor(i3);
            int i5 = i + i2;
            a(viewGroup, i5);
            a((ViewGroup) dXRootView, i5);
            a((View) dXRootView, i4);
        }
    }

    private void a(View view, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{this, view, new Integer(i)});
            return;
        }
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: tb.leo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7054f590", new Object[]{this, view2, outline});
                } else {
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), i);
                }
            }
        });
        view.setClipToOutline(true);
        view.invalidateOutline();
    }

    private void a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        viewGroup.getLayoutParams().height = i;
        viewGroup.requestLayout();
    }

    private void a(ViewGroup viewGroup, DXRuntimeContext dXRuntimeContext, DXRootView dXRootView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7764e27", new Object[]{this, viewGroup, dXRuntimeContext, dXRootView, iArr});
            return;
        }
        viewGroup.removeAllViews();
        Context m = dXRuntimeContext.m();
        int b = (gbg.b(m) - a(dXRuntimeContext.D(), m, Math.max(iArr[0], iArr[1]))) / 2;
        ((FrameLayout.LayoutParams) dXRootView.getLayoutParams()).setMargins(b, 0, b, 0);
        dXRootView.setTag("cornerFrameLayout");
        viewGroup.addView(dXRootView);
    }

    private boolean a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a1860ab", new Object[]{this, viewGroup})).booleanValue();
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null && "cornerFrameLayout".equals(childAt.getTag())) {
                return true;
            }
        }
        return false;
    }

    private float a(DXRuntimeContext dXRuntimeContext, DXScrollEvent dXScrollEvent, Context context, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f8f29be", new Object[]{this, dXRuntimeContext, dXScrollEvent, context, iArr})).floatValue();
        }
        int a2 = a(dXRuntimeContext.D(), context, iArr[0]);
        int a3 = a(dXScrollEvent.getOffsetX(), a2, a(dXRuntimeContext.D(), context, iArr[1]) - a2);
        if (a3 != a2) {
            return a3 % a2;
        }
        this.b = 0;
        return a2;
    }

    private int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int i4 = this.b;
        if (i4 != 0 && i != i2) {
            return Math.max(i - i4, 0);
        }
        if (i > i2) {
            return i2;
        }
        if (i != i3) {
            return i;
        }
        return 0;
    }

    private int a(DinamicXEngine dinamicXEngine, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("534c087", new Object[]{this, dinamicXEngine, context, new Integer(i)})).intValue();
        }
        if (dinamicXEngine != null) {
            return gbg.a(dinamicXEngine, context, i);
        }
        return gbg.b(context, i);
    }

    private int a(DXRuntimeContext dXRuntimeContext, int[] iArr, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22d82015", new Object[]{this, dXRuntimeContext, iArr, context, new Integer(i)})).intValue();
        }
        int i2 = i < iArr.length ? iArr[i] : -1;
        if (i2 > 0) {
            return a(dXRuntimeContext.D(), context, i2);
        }
        return -1;
    }

    private int[] a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("ff5843b", new Object[]{this, objArr});
        }
        int[] iArr = new int[2];
        if (!(objArr[1] instanceof JSONObject)) {
            return iArr;
        }
        try {
            JSONArray jSONArray = ((JSONObject) objArr[1]).getJSONArray("heightArray");
            for (int i = 0; i < jSONArray.size(); i++) {
                iArr[i] = Integer.parseInt(String.valueOf(jSONArray.get(i)));
            }
        } catch (Exception e) {
            ldf.d("DXHIconScrollEventHandler", "解析高度信息出现异常：" + e);
        }
        return iArr;
    }

    private int[] b(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9425d13c", new Object[]{this, objArr});
        }
        int[] iArr = new int[2];
        if (!(objArr[2] instanceof JSONObject)) {
            return iArr;
        }
        try {
            JSONArray jSONArray = ((JSONObject) objArr[2]).getJSONArray("widthArray");
            for (int i = 0; i < jSONArray.size(); i++) {
                iArr[i] = Integer.parseInt(String.valueOf(jSONArray.get(i)));
            }
        } catch (Exception e) {
            ldf.d("DXHIconScrollEventHandler", "解析宽度信息出现异常：" + e);
        }
        return iArr;
    }

    private int c(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae34537a", new Object[]{this, objArr})).intValue();
        }
        int parseColor = Color.parseColor("#FFFFFF");
        if (!(objArr[3] instanceof JSONObject)) {
            return parseColor;
        }
        try {
            return Color.parseColor(((JSONObject) objArr[3]).getString("backgroundColor"));
        } catch (Exception e) {
            ldf.d("DXHIconScrollEventHandler", "解析背景色信息出现异常：" + e);
            return parseColor;
        }
    }

    private int a(DXRuntimeContext dXRuntimeContext, Object[] objArr, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("341fe03", new Object[]{this, dXRuntimeContext, objArr, context})).intValue();
        }
        int a2 = a(dXRuntimeContext.D(), context, 12);
        if (!(objArr[4] instanceof JSONObject)) {
            return a2;
        }
        try {
            return a(dXRuntimeContext.D(), context, ((JSONObject) objArr[4]).getIntValue("cornerRadius"));
        } catch (Exception e) {
            ldf.d("DXHIconScrollEventHandler", "解析圆角信息出现异常：" + e);
            return a2;
        }
    }
}
