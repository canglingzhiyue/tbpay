package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class ady extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXDETAILFLOWLAYOUT_HGAP = 34681438404L;
    public static final long DXDETAILFLOWLAYOUT_MAXLINES = 4685059187929305417L;
    public static final long DXDETAILFLOWLAYOUT_VGAP = 38721391538L;
    public static final long VIEW_IDENTITY = 310096744864815737L;

    /* renamed from: a  reason: collision with root package name */
    private int f25278a;
    private int b;
    private int c;
    private List<List<DXWidgetNode>> d = new ArrayList();
    private List<Integer> e = new ArrayList();

    static {
        kge.a(-1133986514);
    }

    public static /* synthetic */ Object ipc$super(ady adyVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
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

    public ady() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.DXDetailFlowLayoutWidgetNode");
    }

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(189695493);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ady();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ady();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof ady)) {
        } else {
            super.onClone(dXWidgetNode, z);
            ady adyVar = (ady) dXWidgetNode;
            this.f25278a = adyVar.f25278a;
            this.b = adyVar.b;
            this.c = adyVar.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
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
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d.clear();
        this.e.clear();
        int b = (DXWidgetNode.DXMeasureSpec.b(i) - getPaddingLeft()) - getPaddingRight();
        int paddingLeft = (0 - getPaddingLeft()) - getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        ArrayList arrayList = new ArrayList();
        int childrenCount = getChildrenCount();
        int i3 = paddingLeft;
        int i4 = paddingTop;
        ArrayList arrayList2 = arrayList;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 >= childrenCount) {
                break;
            }
            DXWidgetNode childAt = getChildAt(i5);
            ArrayList arrayList3 = arrayList2;
            measureChildWithMargins(childAt, i, 0, i2, 0);
            int measuredWidth = childAt.getMeasuredWidth() + childAt.getMarginLeft() + childAt.getMarginRight();
            int measuredHeight = childAt.getMeasuredHeight() + childAt.getMarginTop() + childAt.getMarginBottom() + 8;
            int i8 = i6 + measuredWidth;
            if (i8 > b) {
                this.e.add(Integer.valueOf(i7));
                this.d.add(arrayList3);
                i3 = Math.max(i6, b);
                i4 += i7;
                if (this.d.size() == this.b) {
                    for (int i9 = childrenCount - 1; i9 >= i5; i9--) {
                        getChildAt(i9).setMeasuredDimension(0, 0);
                    }
                    arrayList2 = new ArrayList();
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(childAt);
                    i7 = measuredHeight;
                    arrayList2 = arrayList4;
                }
            } else {
                int max = Math.max(i7, measuredHeight);
                arrayList3.add(childAt);
                i7 = max;
                measuredWidth = i8;
                arrayList2 = arrayList3;
            }
            i6 = measuredWidth + this.f25278a;
            i5++;
        }
        if (!arrayList2.isEmpty()) {
            this.e.add(Integer.valueOf(i7));
            this.d.add(arrayList2);
            i3 = Math.max(i6, b);
            i4 += i7;
        }
        int i10 = i3;
        if (this.d.size() > 0) {
            i4 += (this.d.size() - 1) * this.f25278a;
        }
        setMeasuredDimension(i10, i4);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.d.size();
        int i5 = paddingTop;
        int i6 = paddingLeft;
        for (int i7 = 0; i7 < size; i7++) {
            int intValue = this.e.get(i7).intValue();
            List<DXWidgetNode> list = this.d.get(i7);
            int size2 = list.size();
            int i8 = i6;
            for (int i9 = 0; i9 < size2; i9++) {
                DXWidgetNode dXWidgetNode = list.get(i9);
                int marginLeft = dXWidgetNode.getMarginLeft() + i8;
                if (i9 > 0) {
                    marginLeft += this.f25278a;
                }
                int marginTop = dXWidgetNode.getMarginTop() + i5;
                dXWidgetNode.layout(marginLeft, marginTop, dXWidgetNode.getMeasuredWidth() + marginLeft, dXWidgetNode.getMeasuredHeight() + marginTop);
                i8 += dXWidgetNode.getMeasuredWidth() + dXWidgetNode.getMarginLeft() + dXWidgetNode.getMarginRight();
                if (i9 > 0) {
                    i8 += this.f25278a;
                }
            }
            i6 = getPaddingLeft();
            i5 = i5 + intValue + this.c;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 34681438404L) {
            this.f25278a = i;
        } else if (j == 4685059187929305417L) {
            this.b = i;
        } else if (j == 38721391538L) {
            this.c = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
