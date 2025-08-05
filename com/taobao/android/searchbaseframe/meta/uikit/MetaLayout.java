package com.taobao.android.searchbaseframe.meta.uikit;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import tb.htf;
import tb.itf;
import tb.itk;
import tb.kge;

/* loaded from: classes6.dex */
public class MetaLayout extends FrameLayout implements NestedScrollingParent2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int FLING_FLAG = 2;
    private static final int HEADER_KEY;
    public static int HEIGHT_MATCH_TAG = 0;
    public static final int LAYOUT_MODE_ABSOLUTE = 1;
    public static final int LAYOUT_MODE_RELATIVE = 0;
    public static final int LAYOUT_MODE_RELATIVE_BUT_MATCH_PARENT = 2;
    private static final int SCROLL_STATE_FLAG = 1;
    private int currentHeight;
    private boolean hasImmersiveHeader;
    private d headerChangeListener;
    private int headerHeight;
    private int headerOffset;
    private com.taobao.android.searchbaseframe.meta.uikit.a headerScroller;
    private itk immersiveHeader;
    private boolean layoutListFirst;
    private int layoutType;
    private boolean listChanged;
    private View listContainer;
    private int listStart;
    private boolean listStartSet;
    private b listener;
    public final List<itk> originHeaders;
    private Set<View.OnTouchListener> outerListeners;
    private int overScrollY;
    public final Set<itk> parentHeaders;
    private MetaLayout parentMetaLayout;
    private int privateFlags;
    private boolean scrollDone;
    private itf scrollDownCurrentNode;
    private itf scrollDownHeadNode;
    private final a scrollDownHeaders;
    private final c scrollDownImpl;
    private com.taobao.android.searchbaseframe.meta.uikit.c scrollListener;
    private List<itk> scrollStateNodes;
    private itf scrollUpCurrentNode;
    private itf scrollUpHeadNode;
    private final a scrollUpHeaders;
    private final c scrollUpImpl;
    private boolean scrollable;
    private int totalHeight;
    private e touchHelper;
    private boolean waitForLayoutDone;

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes6.dex */
    public interface c {
        void a(itf itfVar);
    }

    /* loaded from: classes6.dex */
    public interface d {
        void a();
    }

    public static /* synthetic */ Object ipc$super(MetaLayout metaLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1533054272:
                return new Boolean(super.onNestedPreFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue()));
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1604649632:
                super.requestLayout();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            case 2114251219:
                return new Boolean(super.onNestedFling((View) objArr[0], ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue(), ((Boolean) objArr[3]).booleanValue()));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ itf access$002(MetaLayout metaLayout, itf itfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itf) ipChange.ipc$dispatch("2473ea46", new Object[]{metaLayout, itfVar});
        }
        metaLayout.scrollUpCurrentNode = itfVar;
        return itfVar;
    }

    public static /* synthetic */ itf access$102(MetaLayout metaLayout, itf itfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itf) ipChange.ipc$dispatch("2675025", new Object[]{metaLayout, itfVar});
        }
        metaLayout.scrollDownCurrentNode = itfVar;
        return itfVar;
    }

    static {
        kge.a(616883896);
        kge.a(-2000658237);
        HEIGHT_MATCH_TAG = MetaLayout.class.hashCode();
        HEADER_KEY = R.color.libsf_black;
    }

    public MetaLayout(Context context) {
        this(context, null);
    }

    public MetaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scrollUpImpl = new c() { // from class: com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.c
            public void a(itf itfVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee53cc5d", new Object[]{this, itfVar});
                } else {
                    MetaLayout.access$002(MetaLayout.this, itfVar);
                }
            }
        };
        this.scrollDownImpl = new c() { // from class: com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.c
            public void a(itf itfVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ee53cc5d", new Object[]{this, itfVar});
                } else {
                    MetaLayout.access$102(MetaLayout.this, itfVar);
                }
            }
        };
        this.listStartSet = false;
        this.layoutListFirst = false;
        this.originHeaders = new ArrayList();
        this.parentHeaders = new HashSet();
        this.scrollUpHeaders = new a();
        this.scrollDownHeaders = new a();
        this.scrollUpCurrentNode = null;
        this.scrollUpHeadNode = null;
        this.scrollDone = false;
        this.scrollDownCurrentNode = null;
        this.scrollDownHeadNode = null;
        this.scrollStateNodes = new ArrayList(1);
        this.listChanged = false;
        this.layoutType = 0;
        this.scrollable = true;
        this.totalHeight = 0;
        this.currentHeight = 0;
        this.waitForLayoutDone = false;
        this.outerListeners = new HashSet();
        setCanFling(true);
        setWillNotDraw(true);
    }

    public void layoutListFirst() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18be92f", new Object[]{this});
        } else {
            this.layoutListFirst = true;
        }
    }

    public void addTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf82a09", new Object[]{this, onTouchListener});
        } else {
            this.outerListeners.add(onTouchListener);
        }
    }

    public void removeTouchListener(View.OnTouchListener onTouchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79db8e6c", new Object[]{this, onTouchListener});
        } else {
            this.outerListeners.remove(onTouchListener);
        }
    }

    public void setScrollListener(com.taobao.android.searchbaseframe.meta.uikit.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2010b4dd", new Object[]{this, cVar});
        } else {
            this.scrollListener = cVar;
        }
    }

    public void setLayoutType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc25e396", new Object[]{this, new Integer(i)});
        } else {
            this.layoutType = i;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        ViewParent viewParent = (ViewGroup) getParent();
        while (true) {
            if (!(viewParent instanceof ViewGroup)) {
                break;
            } else if (viewParent instanceof MetaLayout) {
                this.parentMetaLayout = (MetaLayout) viewParent;
                break;
            } else {
                viewParent = viewParent.getParent();
            }
        }
        rebuildScrollHeaders();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.parentMetaLayout = null;
    }

    public void rebuildScrollHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c26a925", new Object[]{this});
            return;
        }
        this.scrollUpHeaders.c();
        this.scrollDownHeaders.c();
        this.parentHeaders.clear();
        for (itk itkVar : this.originHeaders) {
            this.scrollUpHeaders.a(itkVar, itkVar.a().b);
            this.scrollDownHeaders.a(itkVar, itkVar.a().c);
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout != null) {
            for (itk itkVar2 : metaLayout.originHeaders) {
                this.scrollUpHeaders.a(itkVar2, itkVar2.a().b);
                this.scrollDownHeaders.a(itkVar2, itkVar2.a().c);
                this.parentHeaders.add(itkVar2);
            }
        }
        this.scrollUpHeaders.b();
        this.scrollDownHeaders.b();
        buildScrollNode(true, this.scrollDownHeaders);
        buildScrollNode(false, this.scrollUpHeaders);
        this.scrollUpCurrentNode = null;
        this.scrollDownCurrentNode = null;
        this.scrollDone = false;
    }

    private void buildScrollNode(boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f66fae6a", new Object[]{this, new Boolean(z), aVar});
            return;
        }
        itf itfVar = null;
        for (int a2 = aVar.a() - 1; a2 >= 0; a2--) {
            List<itk> a3 = aVar.a(a2);
            if (a3 != null) {
                int b2 = aVar.b(a2);
                if (z) {
                    for (itk itkVar : a3) {
                        itfVar = createNode(itkVar, b2, itfVar, true);
                    }
                } else {
                    for (int size = a3.size() - 1; size >= 0; size--) {
                        itfVar = createNode(a3.get(size), b2, itfVar, false);
                    }
                }
            }
        }
    }

    private itf createNode(itk itkVar, int i, itf itfVar, boolean z) {
        MetaLayout metaLayout;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return (itf) ipChange.ipc$dispatch("d4108d1a", new Object[]{this, itkVar, new Integer(i), itfVar, new Boolean(z)});
        }
        itf itfVar2 = new itf(itkVar);
        if (this.parentHeaders.contains(itkVar) && (metaLayout = this.parentMetaLayout) != null) {
            itfVar2.a(metaLayout);
        } else {
            itfVar2.a(this);
        }
        if (i <= 2000) {
            z2 = false;
        }
        itfVar2.a(z2);
        if (itfVar != null) {
            itfVar.a(itfVar2);
        } else if (z) {
            this.scrollDownHeadNode = itfVar2;
        } else {
            this.scrollUpHeadNode = itfVar2;
        }
        return itfVar2;
    }

    private boolean isMatchParentHeader(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b49e7d", new Object[]{this, view})).booleanValue();
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == HEIGHT_MATCH_TAG;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        d dVar;
        int i3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        int i4 = this.headerHeight;
        this.headerHeight = 0;
        int i5 = this.hasImmersiveHeader ? 0 : this.listStart;
        for (int i6 = 0; i6 < this.originHeaders.size(); i6++) {
            itk itkVar = this.originHeaders.get(i6);
            if (isMatchParentHeader(itkVar.d())) {
                i3 = View.MeasureSpec.makeMeasureSpec((!itkVar.f() ? size - this.listStart : size) - this.headerOffset, 1073741824);
            } else {
                i3 = i2;
            }
            if (itkVar.d().getVisibility() == 0) {
                measureChild(itkVar.d(), i, i3);
            }
            i5 = ((i5 + itkVar.b()) + itkVar.e()) - itkVar.g();
            this.headerHeight += itkVar.e();
        }
        int max = Math.max(0, size - Math.max(i5, this.listStart)) - this.headerOffset;
        int i7 = this.layoutType;
        if (i7 == 1 || i7 == 2) {
            max = size;
        }
        View view = this.listContainer;
        if (view != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(max, 1073741824));
            if (this.listContainer.getMeasuredHeight() == max) {
                z = false;
            }
            this.listChanged = z;
        }
        if (i4 == this.headerHeight || (dVar = this.headerChangeListener) == null) {
            return;
        }
        dVar.a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        updateListTranslation(true);
        this.waitForLayoutDone = false;
    }

    public void setHeaderOffset(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c912d9a", new Object[]{this, new Integer(i)});
        } else if (this.headerOffset == i) {
        } else {
            this.headerOffset = i;
            updateListTranslation(false);
        }
    }

    public int getListStart() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("10fc4528", new Object[]{this})).intValue() : this.listStart;
    }

    private int adjustHeaders(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b345c089", new Object[]{this, new Boolean(z)})).intValue();
        }
        int i = this.hasImmersiveHeader ? 0 : this.listStart;
        int i2 = this.headerOffset;
        this.totalHeight = i2;
        this.currentHeight = i2;
        int i3 = i;
        int i4 = 0;
        while (i4 < this.originHeaders.size()) {
            itk itkVar = this.originHeaders.get(i4);
            int b2 = i3 + itkVar.b();
            int b3 = (i4 == 0 ? itkVar.b() : b2) + this.headerOffset;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) itkVar.d().getLayoutParams();
            if (itkVar.d().getVisibility() == 0) {
                if (z || isMatchParentHeader(itkVar.d())) {
                    itkVar.d().layout(0, layoutParams.topMargin, itkVar.d().getMeasuredWidth(), layoutParams.topMargin + itkVar.d().getMeasuredHeight());
                }
                g.a(itkVar.d(), b3);
            }
            i3 = (b2 + itkVar.e()) - itkVar.g();
            if (!itkVar.bw_()) {
                this.totalHeight = this.totalHeight + itkVar.e() + layoutParams.topMargin;
                this.currentHeight = (((this.currentHeight + itkVar.e()) + itkVar.b()) - itkVar.g()) + layoutParams.topMargin;
            }
            i4++;
        }
        return i3;
    }

    public void updateListTranslation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c2fa43", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.layoutListFirst && this.listContainer != null && (z || this.listChanged)) {
            View view = this.listContainer;
            view.layout(0, 0, view.getMeasuredWidth(), this.listContainer.getMeasuredHeight());
            this.listChanged = false;
        }
        int max = Math.max(adjustHeaders(z), this.listStart) + this.headerOffset;
        if (this.layoutType == 1) {
            max = 0;
        }
        if (!this.layoutListFirst && this.listContainer != null && (z || this.listChanged)) {
            View view2 = this.listContainer;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.listContainer.getMeasuredHeight());
            this.listChanged = false;
        }
        View view3 = this.listContainer;
        if (view3 == null || g.a(view3) == max) {
            return;
        }
        g.a(this.listContainer, max);
        if (z) {
            return;
        }
        this.listContainer.requestLayout();
    }

    public void setListStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6833c7a", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.listStart;
        this.listStart = i;
        if (!this.listStartSet) {
            this.listStartSet = true;
        } else if (i2 == i) {
        } else {
            onListStartChange();
        }
    }

    private void updateFirstHeaderMargin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d618b29", new Object[]{this});
            return;
        }
        for (itk itkVar : this.originHeaders) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) itkVar.d().getLayoutParams();
            if (layoutParams.topMargin != 0) {
                itkVar.d().requestLayout();
            }
            layoutParams.topMargin = 0;
        }
        if (this.originHeaders.size() <= 0 || this.hasImmersiveHeader) {
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.originHeaders.get(0).d().getLayoutParams();
        if (layoutParams2.topMargin != this.listStart) {
            this.originHeaders.get(0).d().requestLayout();
        }
        layoutParams2.topMargin = this.listStart;
    }

    private void onListStartChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5609d5c", new Object[]{this});
            return;
        }
        updateFirstHeaderMargin();
        for (itk itkVar : this.originHeaders) {
            itkVar.a(0, this.listStart, -1);
        }
        updateListTranslation(false);
    }

    private void clearViewParent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c38338f", new Object[]{this, view});
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            commit(false);
        }
    }

    public void commit(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5748c056", new Object[]{this, new Boolean(z)});
            return;
        }
        this.waitForLayoutDone = true;
        setCanFling(true);
        if (z) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                if (childAt != this.listContainer) {
                    removeView(childAt);
                }
            }
        } else {
            removeAllViews();
        }
        a aVar = new a();
        for (itk itkVar : this.originHeaders) {
            aVar.a(itkVar, itkVar.a().f14988a);
        }
        aVar.b();
        rebuildScrollHeaders();
        for (int i = 0; i < aVar.a(); i++) {
            List<itk> a2 = aVar.a(i);
            if (a2 != null) {
                for (itk itkVar2 : a2) {
                    itkVar2.d().setTag(HEADER_KEY, itkVar2);
                    clearViewParent(itkVar2.d());
                    if (itkVar2.d().getLayoutParams() != null) {
                        addView(itkVar2.d());
                    } else {
                        addView(itkVar2.d(), new FrameLayout.LayoutParams(-1, -2));
                    }
                }
            }
        }
        updateFirstHeaderMargin();
        if (z && this.listContainer.getParent() == this) {
            return;
        }
        clearViewParent(this.listContainer);
        if (this.layoutType == 1) {
            addView(this.listContainer, 0, new FrameLayout.LayoutParams(-1, -1));
        } else {
            addView(this.listContainer, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void addHeader(itk itkVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274bc0e5", new Object[]{this, itkVar});
            return;
        }
        this.originHeaders.add(itkVar);
        if (this.originHeaders.size() == 1) {
            if (this.hasImmersiveHeader || itkVar.f()) {
                z = true;
            }
            this.hasImmersiveHeader = z;
            this.immersiveHeader = itkVar.f() ? itkVar : null;
        } else if (itkVar.f()) {
            throw new RuntimeException("Only first header can be immersive");
        }
        itkVar.a(this);
        if (!itkVar.c()) {
            return;
        }
        this.scrollStateNodes.add(itkVar);
    }

    public void addListContainer(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d82049", new Object[]{this, view});
            return;
        }
        this.listContainer = view;
        this.touchHelper = new e(getContext(), this);
    }

    public void setUseHiddenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa6cf5d", new Object[]{this});
        } else {
            this.touchHelper.a();
        }
    }

    public void setCurrentList(com.taobao.android.searchbaseframe.meta.uikit.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc4cbf6c", new Object[]{this, bVar});
            return;
        }
        e eVar = this.touchHelper;
        if (eVar == null) {
            return;
        }
        eVar.a(bVar);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, view, view2, new Integer(i), new Integer(i2)})).booleanValue() : i == 2 && this.scrollable;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, view, view2, new Integer(i), new Integer(i2)});
        } else if (i2 != 0) {
        } else {
            this.overScrollY = 0;
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, view, new Integer(i)});
        } else if (!isScrollStart(i)) {
        } else {
            notifyScrollState(i, false);
            setFlag(i, false);
        }
    }

    public void setCanFling(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d311a5ff", new Object[]{this, new Boolean(z)});
        } else {
            setFlag(2, z);
        }
    }

    private boolean canFling() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d82edf7", new Object[]{this})).booleanValue() : (this.privateFlags & 4) == 4;
    }

    private void setFlag(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f44fe366", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        int i2 = 1 << i;
        if (z) {
            this.privateFlags = i2 | this.privateFlags;
        } else {
            this.privateFlags = (~i2) & this.privateFlags;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        r12.a(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int traverseHeaders(tb.itf r5, android.view.View r6, int r7, int[] r8, int r9, boolean r10, boolean r11, com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.c r12) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            if (r1 == 0) goto L47
            r1 = 9
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r4
            r1[r2] = r5
            r5 = 2
            r1[r5] = r6
            r5 = 3
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r1[r5] = r6
            r5 = 4
            r1[r5] = r8
            r5 = 5
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            r1[r5] = r6
            r5 = 6
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r10)
            r1[r5] = r6
            r5 = 7
            java.lang.Boolean r6 = new java.lang.Boolean
            r6.<init>(r11)
            r1[r5] = r6
            r5 = 8
            r1[r5] = r12
            java.lang.String r5 = "60e2113f"
            java.lang.Object r5 = r0.ipc$dispatch(r5, r1)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            return r5
        L47:
            r0 = r7
        L48:
            if (r5 == 0) goto L8f
            boolean r1 = r4.scrollDone
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L5f
            boolean r1 = r5.b()
            if (r1 != 0) goto L5f
            if (r6 == 0) goto L5f
            r1 = -1
            boolean r1 = r6.canScrollVertically(r1)
            if (r1 != 0) goto L8f
        L5f:
            tb.itk r1 = r5.d()
            com.taobao.android.searchbaseframe.meta.uikit.MetaLayout r3 = r5.c()
            int r3 = r3.getListStart()
            int r1 = r1.a(r0, r3, r9)
            if (r8 == 0) goto L76
            r3 = r8[r2]
            int r3 = r3 + r1
            r8[r2] = r3
        L76:
            int r0 = r0 - r1
            if (r1 == 0) goto L7d
            int r1 = r1 * r7
            if (r1 >= 0) goto L8a
        L7d:
            tb.itf r1 = r5.a()
            if (r1 == 0) goto L88
            tb.itf r5 = r5.a()
            goto L8a
        L88:
            r4.scrollDone = r2
        L8a:
            if (r0 != 0) goto L48
            if (r11 != 0) goto L8f
            goto L48
        L8f:
            if (r12 == 0) goto L94
            r12.a(r5)
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.traverseHeaders(tb.itf, android.view.View, int, int[], int, boolean, boolean, com.taobao.android.searchbaseframe.meta.uikit.MetaLayout$c):int");
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        com.taobao.android.searchbaseframe.meta.uikit.c cVar;
        int i6 = i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i6), new Integer(i5)});
            return;
        }
        itf scrollNode = getScrollNode(i6);
        if (i6 < 0) {
            int traverseHeaders = traverseHeaders(scrollNode, null, i4, null, i5, false, true, this.scrollUpImpl);
            if (i6 != traverseHeaders) {
                MetaLayout metaLayout = this.parentMetaLayout;
                if (metaLayout != null) {
                    metaLayout.updateListTranslation(false);
                }
                updateListTranslation(false);
                notifyHeaderScroll();
                return;
            }
            i6 = traverseHeaders;
        }
        com.taobao.android.searchbaseframe.meta.uikit.c cVar2 = this.scrollListener;
        if (cVar2 != null) {
            cVar2.c(getTotalScrollDistance());
        }
        if ((view instanceof RecyclerView) && i2 == 0) {
            ((RecyclerView) view).stopScroll();
        }
        if (i2 != 0) {
            if (this.overScrollY != 0 && (cVar = this.scrollListener) != null) {
                cVar.d(0);
            }
            this.overScrollY = 0;
        } else if (i6 == 0 || i5 != 0) {
        } else {
            this.overScrollY += i6;
            com.taobao.android.searchbaseframe.meta.uikit.c cVar3 = this.scrollListener;
            if (cVar3 == null) {
                return;
            }
            cVar3.d(this.overScrollY);
        }
    }

    public int calculateDyToMakeListTotalVisible() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("97bcf26a", new Object[]{this})).intValue() : getCurrentHeaderHeight();
    }

    private itf getScrollNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (itf) ipChange.ipc$dispatch("8ad5b554", new Object[]{this, new Integer(i)});
        }
        if (i >= 0) {
            if (this.scrollUpCurrentNode != null) {
                this.scrollDone = false;
            }
            this.scrollUpCurrentNode = null;
            itf itfVar = this.scrollDownCurrentNode;
            return itfVar == null ? this.scrollDownHeadNode : itfVar;
        }
        if (this.scrollDownCurrentNode != null) {
            this.scrollDone = false;
        }
        this.scrollDownCurrentNode = null;
        itf itfVar2 = this.scrollUpCurrentNode;
        return itfVar2 == null ? this.scrollUpHeadNode : itfVar2;
    }

    private int nestedScrollInternal(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("96dcdfac", new Object[]{this, new Integer(i), new Boolean(z)})).intValue();
        }
        this.scrollDone = false;
        int traverseHeaders = traverseHeaders(this.scrollUpHeadNode, null, i, null, 0, false, z, null);
        if (i != traverseHeaders) {
            MetaLayout metaLayout = this.parentMetaLayout;
            if (metaLayout != null) {
                metaLayout.updateListTranslation(false);
            }
            updateListTranslation(false);
            notifyHeaderScroll();
        }
        return traverseHeaders;
    }

    public void updateHeaderOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9790e4f0", new Object[]{this});
            return;
        }
        nestedScrollInternal(0, false);
        resetScrollNode();
    }

    public void unfold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c660da1", new Object[]{this});
            return;
        }
        nestedScrollInternal(-2147483647, true);
        resetScrollNode();
    }

    public void fold() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("116da808", new Object[]{this});
            return;
        }
        nestedScrollInternal(Integer.MAX_VALUE, true);
        resetScrollNode();
    }

    public void resetScrollNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2182a5", new Object[]{this});
            return;
        }
        this.scrollUpCurrentNode = null;
        this.scrollDownCurrentNode = null;
        this.scrollDone = false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int traverseHeaders;
        com.taobao.android.searchbaseframe.meta.uikit.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, view, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
        } else if (iArr == null) {
        } else {
            if (i3 == 0 && !isScrollStart(i3) && (view instanceof RecyclerView)) {
                modifyScrollState((RecyclerView) view);
            }
            if (!isScrollStart(i3)) {
                setFlag(i3, true);
                notifyScrollState(i3, true);
            }
            itf scrollNode = getScrollNode(i2);
            if (i2 > 0) {
                traverseHeaders = traverseHeaders(scrollNode, view, i2, iArr, i3, false, true, this.scrollDownImpl);
            } else {
                traverseHeaders = i2 < 0 ? traverseHeaders(scrollNode, view, i2, iArr, i3, true, true, this.scrollUpImpl) : i2;
            }
            if (traverseHeaders != i2) {
                MetaLayout metaLayout = this.parentMetaLayout;
                if (metaLayout != null) {
                    metaLayout.updateListTranslation(false);
                }
                updateListTranslation(false);
                notifyHeaderScroll();
            }
            if (traverseHeaders != 0 || i2 == 0 || (cVar = this.scrollListener) == null) {
                return;
            }
            cVar.c(getTotalScrollDistance());
        }
    }

    public int scrollBy(int i) {
        com.taobao.android.searchbaseframe.meta.uikit.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c8d71cb", new Object[]{this, new Integer(i)})).intValue();
        }
        this.scrollDone = false;
        int[] iArr = new int[2];
        int traverseHeaders = traverseHeaders(getScrollNode(i), null, i, iArr, 0, false, true, null);
        if (traverseHeaders != i) {
            updateListTranslation(false);
            notifyHeaderScroll();
            if (traverseHeaders == 0 && (cVar = this.scrollListener) != null) {
                cVar.c(getTotalScrollDistance());
            }
        }
        this.scrollDone = false;
        return iArr[1];
    }

    public MetaLayout getParentMetaLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetaLayout) ipChange.ipc$dispatch("115623b7", new Object[]{this}) : this.parentMetaLayout;
    }

    private void modifyScrollState(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb6585f", new Object[]{this, recyclerView});
        } else if (recyclerView.getScrollState() == 1) {
        } else {
            g.a(recyclerView, 1);
        }
    }

    private boolean isScrollStart(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3824c35", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = 1 << i;
        return (this.privateFlags & i2) == i2;
    }

    private void notifyScrollState(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6174e573", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        com.taobao.android.searchbaseframe.meta.uikit.c cVar = this.scrollListener;
        if (cVar != null) {
            if (z) {
                cVar.a(getTotalScrollDistance());
            } else {
                cVar.b(getTotalScrollDistance());
            }
        }
        for (itk itkVar : this.scrollStateNodes) {
            if (z) {
                itkVar.a(i);
            } else {
                itkVar.b(i);
            }
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout == null) {
            return;
        }
        metaLayout.notifyScrollState(i, z);
    }

    public int getTotalScrollDistance() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db6b38a", new Object[]{this})).intValue();
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout != null) {
            i = metaLayout.getHiddenHeight();
        }
        int hiddenHeight = i + getHiddenHeight();
        e eVar = this.touchHelper;
        return (eVar == null || eVar.f14984a == null) ? hiddenHeight : hiddenHeight + this.touchHelper.f14984a.t();
    }

    public void notifyHeaderScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cda18aa", new Object[]{this});
            return;
        }
        b bVar = this.listener;
        if (bVar != null) {
            bVar.a();
        }
        MetaLayout metaLayout = this.parentMetaLayout;
        if (metaLayout == null) {
            return;
        }
        metaLayout.notifyHeaderScroll();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.scrollable) {
            return false;
        }
        e eVar = this.touchHelper;
        if (eVar == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return eVar.a(motionEvent);
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.scrollable = z;
        }
    }

    private void notifyOuterTouchListener(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0c7379d", new Object[]{this, motionEvent});
            return;
        }
        for (View.OnTouchListener onTouchListener : this.outerListeners) {
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        notifyOuterTouchListener(motionEvent);
        if (this.waitForLayoutDone) {
            return false;
        }
        cancelScroll();
        if (!this.scrollable) {
            return super.dispatchTouchEvent(motionEvent);
        }
        e eVar = this.touchHelper;
        if (eVar != null) {
            eVar.b(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        itk itkVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        int i = this.listStart + this.headerOffset;
        if (!this.hasImmersiveHeader && i > 0 && this.layoutType != 1) {
            canvas.clipRect(0, i, getWidth(), getHeight());
        } else if (this.hasImmersiveHeader && (itkVar = this.immersiveHeader) != null) {
            View d2 = itkVar.d();
            if (((int) ((d2.getBottom() + d2.getTranslationY()) - this.immersiveHeader.g())) <= i) {
                canvas.clipRect(0, i, getWidth(), getHeight());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        e eVar = this.touchHelper;
        if (eVar != null) {
            return eVar.c(motionEvent);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e04e9d3", new Object[]{this, view, new Float(f), new Float(f2), new Boolean(z)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        try {
            return super.onNestedFling(view, f, f2, z);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, view, new Float(f), new Float(f2)})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        if (!canFling()) {
            return true;
        }
        try {
            return super.onNestedPreFling(view, f, f2);
        } catch (NoSuchMethodError unused) {
            return false;
        }
    }

    public int getHiddenHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eda7ee1", new Object[]{this})).intValue();
        }
        if (this.layoutType == 0 && this.listContainer != null) {
            return getTotalHeaderHeight() - g.a(this.listContainer);
        }
        return getTotalHeaderHeight() - getCurrentHeaderHeight();
    }

    public int getCurrentHeaderHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1ae33f1", new Object[]{this})).intValue() : this.currentHeight;
    }

    public int getTotalHeaderHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("af9dc63c", new Object[]{this})).intValue() : this.totalHeight;
    }

    public void clearHeaders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832b080", new Object[]{this});
        } else {
            clearHeaders(false);
        }
    }

    public void clearHeaders(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e241254", new Object[]{this, new Boolean(z)});
            return;
        }
        this.originHeaders.clear();
        this.scrollStateNodes.clear();
        this.hasImmersiveHeader = false;
        this.immersiveHeader = null;
        commit(z);
    }

    public void setHeaderChangeListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5243c5b1", new Object[]{this, dVar});
        } else {
            this.headerChangeListener = dVar;
        }
    }

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<List<itk>> f14977a = new SparseArray<>();
        private final List<Integer> b = new ArrayList();

        static {
            kge.a(35302336);
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.b.size();
        }

        public void a(itk itkVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc6ca7cb", new Object[]{this, itkVar, new Integer(i)});
                return;
            }
            List<itk> list = this.f14977a.get(i);
            if (list == null) {
                list = new ArrayList<>();
                this.f14977a.put(i, list);
                this.b.add(Integer.valueOf(i));
            }
            list.add(itkVar);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                Collections.sort(this.b, new Comparator<Integer>() { // from class: com.taobao.android.searchbaseframe.meta.uikit.MetaLayout.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.util.Comparator
                    public /* synthetic */ int compare(Integer num, Integer num2) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, num, num2})).intValue() : a(num, num2);
                    }

                    public int a(Integer num, Integer num2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Number) ipChange2.ipc$dispatch("d87044fb", new Object[]{this, num, num2})).intValue();
                        }
                        if (num != null && num2 != null) {
                            if (num.intValue() > num2.intValue()) {
                                return 1;
                            }
                            if (num.intValue() < num2.intValue()) {
                                return -1;
                            }
                        }
                        return 0;
                    }
                });
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            this.f14977a.clear();
            this.b.clear();
        }

        public List<itk> a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("87fd354c", new Object[]{this, new Integer(i)});
            }
            if (i < a()) {
                return this.f14977a.get(this.b.get(i).intValue());
            }
            return null;
        }

        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i < a()) {
                return this.b.get(i).intValue();
            }
            return -1;
        }
    }

    public void setOnHeaderScrollListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9e270f", new Object[]{this, bVar});
        } else {
            this.listener = bVar;
        }
    }

    private void notifyScrollListener(htf htfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a5c027", new Object[]{this, htfVar});
        } else if (htfVar == null) {
        } else {
            htfVar.a();
        }
    }

    private void cancelScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c8f6ee", new Object[]{this});
            return;
        }
        com.taobao.android.searchbaseframe.meta.uikit.a aVar = this.headerScroller;
        if (aVar == null) {
            return;
        }
        aVar.b();
        this.headerScroller = null;
    }

    public void scrollHeaderToTop(itk itkVar, boolean z, htf htfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7621fb73", new Object[]{this, itkVar, new Boolean(z), htfVar});
        } else {
            scrollHeaderToTop(itkVar, z, htfVar, 0);
        }
    }

    public void scrollHeaderToTop(itk itkVar, boolean z, htf htfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1de5f0", new Object[]{this, itkVar, new Boolean(z), htfVar, new Integer(i)});
            return;
        }
        cancelScroll();
        if (itkVar.d().getLayoutParams() instanceof FrameLayout.LayoutParams) {
            int a2 = g.a(itkVar.d()) + ((FrameLayout.LayoutParams) itkVar.d().getLayoutParams()).topMargin;
            int i2 = this.listStart + this.headerOffset + i;
            if (a2 == i2) {
                notifyScrollListener(htfVar);
                return;
            }
            resetScrollNode();
            this.headerScroller = new com.taobao.android.searchbaseframe.meta.uikit.a(a2 - i2, z, htfVar, this);
            this.headerScroller.a();
            return;
        }
        notifyScrollListener(htfVar);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa502a0", new Object[]{this});
            return;
        }
        ViewParent parent = getParent();
        if (parent == null || !parent.isLayoutRequested() || !isLayoutRequested()) {
            super.requestLayout();
            return;
        }
        while (parent != null) {
            if (!parent.isLayoutRequested()) {
                parent.requestLayout();
                return;
            }
            parent = parent.getParent();
        }
    }
}
