package tb;

import android.app.Application;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.dinamicx.DXButterRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IDynamicLayoutService;
import com.taobao.infoflow.protocol.subservice.biz.IFoldDeviceAndPadService;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.List;
import tb.lks;

/* loaded from: classes7.dex */
public class lij extends RecyclerView.ItemDecoration {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<BaseSectionModel> f30653a;
    private int[] b;
    private lks.a<RecyclerView> c;
    private int d;
    private boolean e;
    private final IDynamicLayoutService f;
    private final IFoldDeviceAndPadService g;
    private boolean h;

    static {
        kge.a(542841817);
    }

    public static /* synthetic */ Object ipc$super(lij lijVar, String str, Object... objArr) {
        if (str.hashCode() == -1861229814) {
            super.onDraw((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lij(ljs ljsVar, int i) {
        this.d = i;
        Application a2 = lcz.a();
        if (a2 != null) {
            this.e = l.b(a2) || l.d(a2);
        }
        this.f = (IDynamicLayoutService) ljsVar.a(IDynamicLayoutService.class);
        this.g = (IFoldDeviceAndPadService) ljsVar.a(IFoldDeviceAndPadService.class);
        this.h = d();
    }

    public void a(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.f30653a = list;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getItemOffsets(android.graphics.Rect r16, android.view.View r17, android.support.v7.widget.RecyclerView r18, android.support.v7.widget.RecyclerView.State r19) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lij.getItemOffsets(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$State):void");
    }

    private static int a(ViewGroup viewGroup) {
        DXWidgetNode widgetNode;
        DXRuntimeContext dXRuntimeContext;
        fut futVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a18609a", new Object[]{viewGroup})).intValue();
        }
        View childAt = viewGroup.getChildAt(0);
        int i = childAt.getLayoutParams().width;
        return (i > 0 || !(childAt instanceof DXButterRootView) || (widgetNode = ((DXButterRootView) childAt).getWidgetNode()) == null || (dXRuntimeContext = widgetNode.getDXRuntimeContext()) == null || (futVar = dXRuntimeContext.l().get(-8936854687533104177L)) == null) ? i : ((Integer) futVar.evalWithArgs(new Object[0], dXRuntimeContext)).intValue();
    }

    @Override // android.support.v7.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910fe30a", new Object[]{this, canvas, recyclerView, state});
            return;
        }
        super.onDraw(canvas, recyclerView, state);
        a(canvas, recyclerView);
    }

    public void a(final View view, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view == null) {
        } else {
            view.post(new Runnable() { // from class: tb.lij.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i3 = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        i3 = marginLayoutParams.height;
                    }
                    if (i3 < 0) {
                        i3 = view.getHeight();
                    }
                    lij.this.a(i2, i3 + i);
                }
            });
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.b == null) {
            this.b = new int[32];
        }
        int[] iArr = this.b;
        if (i >= iArr.length) {
            this.b = Arrays.copyOf(iArr, i + 1);
        }
        int[] iArr2 = this.b;
        if (i >= iArr2.length || i2 == iArr2[i]) {
            return;
        }
        ldf.a("InfoFlowItemDecoration", "updateViewHeight 更新位置高度。set pos=" + i + ", oldHeight=" + this.b[i] + ", newHeight=" + i2);
        this.b[i] = i2;
        lks.a<RecyclerView> aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    public int[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("a821217c", new Object[]{this}) : this.b;
    }

    public void a(lks.a<RecyclerView> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192192a7", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex() % 2 == 0) {
            i5 = (i3 - i4) - i2;
        } else {
            int i6 = (i3 - i4) - i2;
            i5 = i2;
            i2 = i6;
        }
        view.setPadding(i2, i, i5, 0);
    }

    private void a(View view, int i, int i2, int i3, Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f25f80", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), rect});
        } else if (i3 <= 0) {
            ldf.d("InfoFlowItemDecoration", "view 宽度为0，不绘制边距");
        } else {
            view.setPadding(0, 0, 0, 0);
            int a2 = h.a().a(view.getContext());
            int i4 = this.d;
            int round = Math.round(((a2 - (i3 * i4)) - (i2 << 1)) / (i4 - 1));
            int i5 = i2 - round;
            int i6 = this.d;
            int i7 = (((i6 + 1) * round) + (i5 << 1)) / i6;
            int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
            int i8 = (((spanIndex + 1) * round) - (spanIndex * i7)) + i5;
            rect.set(i8, i, i7 - i8, 0);
        }
    }

    private void a(View view, Rect rect, int i, int i2, int i3, int i4, StaggeredGridLayoutManager.LayoutParams layoutParams, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fe38fac", new Object[]{this, view, rect, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), layoutParams, new Integer(i5), new Integer(i6)});
            return;
        }
        int i7 = i5 + i + i3;
        if (layoutParams.width != i7 && layoutParams.width != -1 && layoutParams.width != -2) {
            view.setTag(R.id.tag_info_flow_decoration_width, Integer.valueOf(i5));
            layoutParams.width = i7;
        }
        int i8 = i6 + i2 + i4;
        if (layoutParams.height != i8 && layoutParams.height != -1 && layoutParams.height != -2) {
            view.setTag(R.id.tag_info_flow_decoration_height, Integer.valueOf(i6));
            layoutParams.height = i8;
        }
        rect.set(i, i2, i3, i4);
    }

    private int b(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dfe645c", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return view.getTag(i) == null ? i2 : ((Integer) view.getTag(i)).intValue();
        } catch (Throwable th) {
            ldf.d("InfoFlowItemDecoration", "getTagValue error : " + th.getMessage());
            return i2;
        }
    }

    private void a(Canvas canvas, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c157922b", new Object[]{this, canvas, recyclerView});
            return;
        }
        try {
            if (this.c == null) {
                return;
            }
            this.c.a(canvas, recyclerView);
        } catch (Exception e) {
            ldf.a("InfoFlowItemDecoration", "drawSeparator exception = ", e);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.d = i;
        this.h = d();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        int[] iArr = this.b;
        if (iArr == null) {
            return;
        }
        Arrays.fill(iArr, 0);
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        IDynamicLayoutService iDynamicLayoutService = this.f;
        if (iDynamicLayoutService != null) {
            return iDynamicLayoutService.dynamicLayoutEnable();
        }
        return false;
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        IFoldDeviceAndPadService iFoldDeviceAndPadService = this.g;
        if (iFoldDeviceAndPadService != null) {
            return iFoldDeviceAndPadService.isAdaptHudScreen();
        }
        return false;
    }
}
