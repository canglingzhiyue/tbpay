package com.taobao.tao.flexbox.layoutmanager.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.util.Pair;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaNode;
import com.facebook.yoga.YogaPositionType;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.r;
import com.taobao.tao.flexbox.layoutmanager.drawable.b;
import com.taobao.taobao.R;
import com.taobao.weex.ui.view.gesture.WXGestureType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ibp;
import tb.kge;
import tb.oeb;
import tb.oec;
import tb.ogg;
import tb.ogh;
import tb.tds;

/* loaded from: classes8.dex */
public class FlatViewGroup extends ViewGroup implements b.C0848b.a, tds {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Comparator<Pair> childComparator;
    private ArrayList<a> children;
    private Component component;
    private Bitmap delegateBitmap;
    private Canvas delegateCanvas;
    private boolean drawFlicker;
    private ibp fadingEdge;
    private ArrayList<b> floatView;
    private c highLightInfo;
    private Paint highLightPaint;
    private Rect hitRect;
    private Paint hitRectPaint;
    private r measureResult;
    private YogaNode node;
    private Path path;
    private ArrayList<a> popLayerView;
    private List<d> sizeChangedCallbacks;
    private List<e> visibilityChangedCallbacks;

    /* loaded from: classes8.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f20510a;
        public boolean b;

        static {
            kge.a(-1421060675);
        }

        public b(View view, boolean z) {
            this.f20510a = view;
            this.b = z;
        }
    }

    /* loaded from: classes8.dex */
    public interface d {
        void a(int i, int i2, int i3, int i4);
    }

    /* loaded from: classes8.dex */
    public interface e {
        void a(View view, int i);
    }

    public static /* synthetic */ Object ipc$super(FlatViewGroup flatViewGroup, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1952076612:
                return new Boolean(super.drawChild((Canvas) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue()));
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -579605410:
                super.addView((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -572887227:
                super.addView((View) objArr[0]);
                return null;
            case 348684699:
                super.onVisibilityChanged((View) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 623593120:
                super.dispatchDraw((Canvas) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1811093890:
                super.removeView((View) objArr[0]);
                return null;
            case 1889417753:
                super.setBackgroundDrawable((Drawable) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-183139744);
        kge.a(434200724);
        kge.a(-2026558253);
        childComparator = new Comparator<Pair>() { // from class: com.taobao.tao.flexbox.layoutmanager.view.FlatViewGroup.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.util.Comparator
            public /* synthetic */ int compare(Pair pair, Pair pair2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, pair, pair2})).intValue() : a(pair, pair2);
            }

            public int a(Pair pair, Pair pair2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fad77f0d", new Object[]{this, pair, pair2})).intValue() : ((Integer) pair.second).intValue() - ((Integer) pair2.second).intValue();
            }
        };
    }

    /* loaded from: classes8.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public RectF f20511a;
        public RectF b;
        public int c;
        public float[] d;
        public Path e;

        static {
            kge.a(-794923010);
        }

        private c() {
        }
    }

    @Override // tb.tds
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
            return;
        }
        if (this.fadingEdge == null) {
            this.fadingEdge = new ibp(this);
        }
        this.fadingEdge.a(true);
        this.fadingEdge.a(iArr);
    }

    public void addVisibilityChangedCallback(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0b5613", new Object[]{this, eVar});
            return;
        }
        if (this.visibilityChangedCallbacks == null) {
            this.visibilityChangedCallbacks = new ArrayList();
        }
        if (this.visibilityChangedCallbacks.contains(eVar)) {
            return;
        }
        this.visibilityChangedCallbacks.add(eVar);
    }

    public void removeVisibilityChangedCallback(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf384f6", new Object[]{this, eVar});
            return;
        }
        List<e> list = this.visibilityChangedCallbacks;
        if (list == null) {
            return;
        }
        list.remove(eVar);
    }

    public void addSizeChangedCallback(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcbd3d23", new Object[]{this, dVar});
            return;
        }
        if (this.sizeChangedCallbacks == null) {
            this.sizeChangedCallbacks = new ArrayList();
        }
        if (this.sizeChangedCallbacks.contains(dVar)) {
            return;
        }
        this.sizeChangedCallbacks.add(dVar);
    }

    public void removeSizeChangedCallback(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09f1246", new Object[]{this, dVar});
            return;
        }
        List<d> list = this.sizeChangedCallbacks;
        if (list == null) {
            return;
        }
        list.remove(dVar);
    }

    public void bindComponent(Component component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7273a24", new Object[]{this, component});
            return;
        }
        this.component = component;
        this.measureResult = component.getMeasureResult();
    }

    public Component getComponent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Component) ipChange.ipc$dispatch("c95b6449", new Object[]{this}) : this.component;
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setTag(R.id.layout_manager_flatviewgroup_child_id, null);
        }
        removeAllViews();
        this.children.clear();
        this.node = null;
        this.measureResult = null;
        this.floatView = null;
        Iterator<a> it = this.popLayerView.iterator();
        while (it.hasNext()) {
            notifyPoplayerDisAppear(it.next().f20509a);
        }
        this.popLayerView.clear();
        Path path = this.path;
        if (path != null) {
            path.reset();
            this.path = null;
        }
        List<e> list = this.visibilityChangedCallbacks;
        if (list != null) {
            list.clear();
            this.visibilityChangedCallbacks = null;
        }
        List<d> list2 = this.sizeChangedCallbacks;
        if (list2 != null) {
            list2.clear();
            this.sizeChangedCallbacks = null;
        }
        this.highLightInfo = null;
        this.delegateBitmap = null;
        this.delegateCanvas = null;
        this.highLightPaint = null;
        ibp ibpVar = this.fadingEdge;
        if (ibpVar != null) {
            ibpVar.a((int[]) null);
            this.fadingEdge = null;
        }
        this.component = null;
        setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
    }

    public void updateNewPositionForView(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad06dd", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        Iterator<a> it = this.children.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.c == view) {
                float f = i;
                if (next.i == f && next.j == i2 && next.g == i3 && next.h == i4) {
                    return;
                }
                next.g = i3;
                next.h = i4;
                next.i = f;
                next.j = i2;
                requestLayout();
                invalidate();
                return;
            }
        }
        Iterator<a> it2 = this.popLayerView.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (next2.c == view) {
                float f2 = i;
                if (next2.i == f2 && next2.j == i2 && next2.g == i3 && next2.h == i4) {
                    return;
                }
                next2.g = i3;
                next2.h = i4;
                next2.i = f2;
                next2.j = i2;
                requestLayout();
                invalidate();
                return;
            }
        }
    }

    public void setHitRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b706fbd", new Object[]{this, rect});
            return;
        }
        this.hitRect = rect;
        if (this.hitRect == null || this.hitRectPaint != null) {
            return;
        }
        this.hitRectPaint = new TextPaint();
        this.hitRectPaint.setStrokeWidth(4.0f);
        this.hitRectPaint.setStyle(Paint.Style.STROKE);
        this.hitRectPaint.setColor(-16776961);
    }

    public void setHighLightArea(Map map) {
        boolean z;
        int a2;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f97427bf", new Object[]{this, map});
            return;
        }
        if (map != null) {
            if (this.highLightInfo == null) {
                this.highLightInfo = new c();
                this.highLightInfo.f20511a = new RectF();
            }
            int a3 = oec.a(map.get(WXGestureType.GestureInfo.SCREEN_X), 0);
            int a4 = oec.a(map.get(WXGestureType.GestureInfo.SCREEN_Y), 0);
            int a5 = oec.a(map.get("width"), 0) + a3;
            int a6 = oec.a(map.get("height"), 0) + a4;
            float f = a3;
            if (this.highLightInfo.f20511a.left != f) {
                this.highLightInfo.f20511a.left = f;
                z = true;
            } else {
                z = false;
            }
            float f2 = a4;
            if (this.highLightInfo.f20511a.top != f2) {
                this.highLightInfo.f20511a.top = f2;
                z = true;
            }
            float f3 = a5;
            if (this.highLightInfo.f20511a.right != f3) {
                this.highLightInfo.f20511a.right = f3;
                z = true;
            }
            float f4 = a6;
            if (this.highLightInfo.f20511a.bottom != f4) {
                this.highLightInfo.f20511a.bottom = f4;
                z = true;
            }
            Object obj = map.get(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius);
            if (obj != null) {
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() == 1) {
                        int a7 = oec.a(list.get(0), 0);
                        if (this.highLightInfo.c != a7) {
                            this.highLightInfo.c = a7;
                        }
                    } else if (list.size() == 4) {
                        float b2 = oec.b(list.get(0), 0);
                        float b3 = oec.b(list.get(1), 0);
                        float b4 = oec.b(list.get(2), 0);
                        float b5 = oec.b(list.get(3), 0);
                        if (this.highLightInfo.d == null) {
                            this.highLightInfo.d = new float[8];
                        }
                        if (this.highLightInfo.d[0] != b2) {
                            float[] fArr = this.highLightInfo.d;
                            this.highLightInfo.d[1] = b2;
                            fArr[0] = b2;
                            z = true;
                        }
                        if (this.highLightInfo.d[2] != b3) {
                            float[] fArr2 = this.highLightInfo.d;
                            this.highLightInfo.d[3] = b3;
                            fArr2[2] = b3;
                            z = true;
                        }
                        if (this.highLightInfo.d[4] != b4) {
                            float[] fArr3 = this.highLightInfo.d;
                            this.highLightInfo.d[5] = b4;
                            fArr3[4] = b4;
                            z = true;
                        }
                        if (this.highLightInfo.d[6] != b5) {
                            float[] fArr4 = this.highLightInfo.d;
                            this.highLightInfo.d[7] = b5;
                            fArr4[6] = b5;
                        }
                    }
                } else if ((obj instanceof Number) && this.highLightInfo.c != (a2 = oec.a(obj, 0))) {
                    this.highLightInfo.c = a2;
                }
            }
            z2 = z;
        } else {
            c cVar = this.highLightInfo;
            this.highLightInfo = null;
            if (cVar == null) {
                z2 = false;
            }
        }
        if (!z2) {
            return;
        }
        this.delegateBitmap = null;
        invalidate();
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public aa f20509a;
        public YogaNode b;
        public View c;
        public Drawable[] d;
        public int e;
        public int f;
        public float g;
        public float h;
        public float i;
        public float j;

        static {
            kge.a(319927736);
        }

        public a(View view, Drawable[] drawableArr, YogaNode yogaNode, int i, int i2) {
            this.c = view;
            this.d = drawableArr;
            this.b = yogaNode;
            this.e = i;
            this.f = i2;
            this.g = yogaNode.getLayoutWidth();
            this.h = yogaNode.getLayoutHeight();
            this.i = yogaNode.getLayoutX();
            this.j = yogaNode.getLayoutY();
        }

        public a(View view, int i, int i2, int i3, int i4) {
            this.c = view;
            this.g = i3;
            this.h = i4;
            this.i = i;
            this.j = i2;
        }

        public a(Drawable[] drawableArr, int i, int i2, int i3, int i4) {
            this.d = drawableArr;
            this.g = i3;
            this.h = i4;
            this.i = i;
            this.j = i2;
        }

        public void a(aa aaVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
            } else {
                this.f20509a = aaVar;
            }
        }
    }

    public FlatViewGroup(Context context) {
        super(context);
        this.children = new ArrayList<>();
        this.popLayerView = new ArrayList<>();
    }

    private boolean isValidDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8bd6cfdf", new Object[]{this, drawable})).booleanValue();
        }
        Iterator<a> it = this.children.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.d != null && next.d[1] == drawable) {
                return true;
            }
        }
        Iterator<a> it2 = this.popLayerView.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (next2.d != null && next2.d[1] == drawable) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue() : super.verifyDrawable(drawable) || isValidDrawable(drawable);
    }

    public void setNode(YogaNode yogaNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5aa979c4", new Object[]{this, yogaNode});
        } else {
            this.node = yogaNode;
        }
    }

    public void setMeasure(r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52ded93", new Object[]{this, rVar});
        } else {
            this.measureResult = rVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        ogh.a("flatviewgroup onLayout");
        Iterator<a> it = this.children.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            a next = it.next();
            if (next.c != null) {
                if (next.b != null) {
                    if (next.b.getPositionType() == YogaPositionType.ABSOLUTE) {
                        i9 = (int) (i9 + next.b.getLayoutHeight());
                    }
                    next.c.layout(((int) next.b.getLayoutX()) + next.e, ((int) next.b.getLayoutY()) + next.f, (int) (next.b.getLayoutX() + next.e + next.b.getLayoutWidth()), (int) (next.b.getLayoutY() + next.f + next.b.getLayoutHeight()));
                } else {
                    float f = next.g;
                    float f2 = next.h;
                    if (next.f20509a != null && next.f20509a.I() != null) {
                        Component I = next.f20509a.I();
                        i7 = I.getLayoutLeft();
                        i8 = I.getLayoutTop();
                        int layoutRight = I.getLayoutRight();
                        i6 = I.getLayoutBottom();
                        i5 = layoutRight;
                    } else {
                        ViewGroup.LayoutParams layoutParams = next.c.getLayoutParams();
                        if (layoutParams != null) {
                            f = layoutParams.width;
                            f2 = layoutParams.height;
                        }
                        int i10 = (int) next.i;
                        int i11 = (int) next.j;
                        i5 = (int) (i10 + f);
                        i6 = (int) (i11 + f2);
                        i7 = i10;
                        i8 = i11;
                    }
                    next.c.layout(i7, i8, i5, i6);
                }
            }
        }
        Iterator<a> it2 = this.popLayerView.iterator();
        while (it2.hasNext()) {
            a next2 = it2.next();
            if (next2.c != null) {
                if (next2.b != null) {
                    if (next2.b.getPositionType() == YogaPositionType.ABSOLUTE) {
                        i9 = (int) (i9 + next2.b.getLayoutHeight());
                    }
                    next2.c.layout(((int) next2.b.getLayoutX()) + next2.e, ((int) next2.b.getLayoutY()) + next2.f, (int) (next2.b.getLayoutX() + next2.e + next2.b.getLayoutWidth()), (int) (next2.b.getLayoutY() + next2.f + next2.b.getLayoutHeight()));
                } else {
                    ViewGroup.LayoutParams layoutParams2 = next2.c.getLayoutParams();
                    float f3 = next2.g;
                    float f4 = next2.h;
                    if (layoutParams2 != null) {
                        f3 = layoutParams2.width;
                        f4 = layoutParams2.height;
                    }
                    next2.c.layout((int) next2.i, (int) next2.j, (int) (next2.i + f3), (int) (next2.j + f4));
                }
            }
        }
        ArrayList<b> arrayList = this.floatView;
        if (arrayList != null) {
            Iterator<b> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                b next3 = it3.next();
                if (next3.b) {
                    next3.f20510a.layout(0, 0, (int) this.node.getLayoutWidth(), (int) this.node.getLayoutHeight());
                } else {
                    next3.f20510a.layout(0, 0, (int) this.node.getLayoutWidth(), ((int) this.node.getLayoutHeight()) - i9);
                }
            }
        }
        ogh.b();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.node == null && this.measureResult == null) {
            measureChildren(i, i2);
            setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        } else if (this.node != null) {
            measureChildren(i, i2);
            setMeasuredDimension((int) this.node.getLayoutWidth(), (int) this.node.getLayoutHeight());
        } else if (this.measureResult == null) {
        } else {
            measureChildren(i, i2);
            Component component = this.component;
            if (component != null) {
                int layoutWidth = component.getLayoutWidth();
                int layoutHeight = this.component.getLayoutHeight();
                if (layoutWidth >= 0 && layoutHeight >= 0) {
                    setMeasuredDimension(layoutWidth, layoutHeight);
                    return;
                } else {
                    setMeasuredDimension(this.measureResult.f20361a, this.measureResult.b);
                    return;
                }
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
                setMeasuredDimension(layoutParams.width, layoutParams.height);
            } else {
                setMeasuredDimension(this.measureResult.f20361a, this.measureResult.b);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<a> findDrawablesAfter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ba5acbc", new Object[]{this, canvas, view, new Long(j)})).booleanValue();
        }
        ArrayList<a> findDrawablesBefore = findDrawablesBefore(view);
        if (findDrawablesBefore != null) {
            drawDrawableChildren(canvas, findDrawablesBefore);
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        int indexOfChild = indexOfChild(view);
        if ((indexOfChild == getChildCount() - 1 || isLastVisibleChild(indexOfChild)) && !isPopLayerView(view) && (findDrawablesAfter = findDrawablesAfter(view)) != null) {
            drawDrawableChildren(canvas, findDrawablesAfter);
        }
        return drawChild;
    }

    private boolean isLastVisibleChild(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("834e2ed6", new Object[]{this, new Integer(i)})).booleanValue();
        }
        for (int i2 = i + 1; i2 < getChildCount(); i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<a> findDrawablesBefore(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("a078adea", new Object[]{this, view});
        }
        ArrayList<a> arrayList = null;
        for (int indexOf = this.children.indexOf((a) view.getTag(R.id.layout_manager_flatviewgroup_child_id)) - 1; indexOf >= 0; indexOf--) {
            a aVar = this.children.get(indexOf);
            if (aVar.c != null) {
                break;
            }
            if (aVar.d != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(aVar);
            }
        }
        if (arrayList != null) {
            Collections.reverse(arrayList);
        }
        return arrayList;
    }

    private ArrayList<a> findDrawablesAfter(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("49dba3e5", new Object[]{this, view});
        }
        ArrayList<a> arrayList = null;
        for (int indexOf = this.children.indexOf((a) view.getTag(R.id.layout_manager_flatviewgroup_child_id)) + 1; indexOf < this.children.size(); indexOf++) {
            a aVar = this.children.get(indexOf);
            if (aVar.c != null) {
                break;
            }
            if (aVar.d != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private boolean isPopLayerView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("986ff180", new Object[]{this, view})).booleanValue();
        }
        Iterator<a> it = this.popLayerView.iterator();
        while (it.hasNext()) {
            if (it.next().c == view) {
                return true;
            }
        }
        return false;
    }

    private void drawDrawableChildren(Canvas canvas, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42be558d", new Object[]{this, canvas, arrayList});
            return;
        }
        Iterator<a> it = arrayList.iterator();
        while (it.hasNext()) {
            a next = it.next();
            canvas.save();
            if (next.b != null) {
                canvas.translate(next.b.getLayoutX() + next.e, next.b.getLayoutY() + next.f);
                canvas.clipRect(0.0f, 0.0f, next.b.getLayoutWidth(), next.b.getLayoutHeight());
            } else {
                canvas.translate(next.i, next.j);
                canvas.clipRect(0.0f, 0.0f, next.g, next.h);
            }
            for (int i = 0; i < next.d.length; i++) {
                if (next.d[i] != null && ((i != 0 || !(next.d[1] instanceof com.taobao.tao.flexbox.layoutmanager.drawable.c) || ((com.taobao.tao.flexbox.layoutmanager.drawable.c) next.d[1]).a() == null) && next.d[i].isVisible())) {
                    next.d[i].draw(canvas);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.highLightInfo != null && getWidth() > 0 && getHeight() > 0) {
            try {
                if (this.delegateBitmap == null) {
                    this.delegateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    this.delegateCanvas = new Canvas(this.delegateBitmap);
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    this.highLightInfo.b = new RectF(this.highLightInfo.f20511a);
                    this.highLightInfo.b.offset(-iArr[0], -iArr[1]);
                }
                if (this.highLightPaint == null) {
                    this.highLightPaint = new Paint();
                    this.highLightPaint.setColor(0);
                    this.highLightPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    this.highLightPaint.setFlags(1);
                }
                this.delegateBitmap.eraseColor(0);
                super.draw(this.delegateCanvas);
                if (this.highLightInfo.d == null && this.highLightInfo.c == 0) {
                    this.delegateCanvas.drawRect(this.highLightInfo.b, this.highLightPaint);
                } else if (this.highLightInfo.d != null) {
                    if (this.highLightInfo.e == null) {
                        this.highLightInfo.e = new Path();
                        this.highLightInfo.e.addRoundRect(this.highLightInfo.b, this.highLightInfo.d, Path.Direction.CW);
                    }
                    this.delegateCanvas.drawPath(this.highLightInfo.e, this.highLightPaint);
                } else {
                    this.delegateCanvas.drawRoundRect(this.highLightInfo.b, this.highLightInfo.c, this.highLightInfo.c, this.highLightPaint);
                }
                canvas.drawBitmap(this.delegateBitmap, 0.0f, 0.0f, (Paint) null);
            } catch (Throwable th) {
                ogg.b("drawHighLight" + th.getMessage());
            }
        } else {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b46a0", new Object[]{this, canvas});
            return;
        }
        ibp ibpVar = this.fadingEdge;
        if (ibpVar != null && ibpVar.a()) {
            int a2 = this.fadingEdge.a(canvas);
            dispatchDrawInternal(canvas);
            this.fadingEdge.b(canvas);
            this.fadingEdge.a(canvas, a2);
            return;
        }
        dispatchDrawInternal(canvas);
    }

    private void dispatchDrawInternal(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4882e3", new Object[]{this, canvas});
            return;
        }
        try {
            if (this.path != null && !this.path.isEmpty()) {
                canvas.clipPath(this.path);
            }
            super.dispatchDraw(canvas);
            if (getChildCount() == 0) {
                drawDrawableChildren(canvas, this.children);
            }
            if (this.hitRect != null) {
                canvas.drawRect(this.hitRect, this.hitRectPaint);
            }
            drawFlicker(canvas);
        } catch (Throwable th) {
            ogg.a("FlatViewGroup dispatchDraw", th.getMessage());
        }
    }

    public void updateNewPositionForView(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("532021bd", new Object[]{this, view, new Integer(i), new Integer(i2)});
            return;
        }
        Iterator<a> it = this.children.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.c == view) {
                if (next.i == next.b.getLayoutX() && next.j == next.b.getLayoutY() && i == next.e && i2 == next.f && next.b.getLayoutWidth() == next.g && next.b.getLayoutHeight() == next.h) {
                    return;
                }
                next.e = i;
                next.f = i2;
                next.g = next.b.getLayoutWidth();
                next.h = next.b.getLayoutHeight();
                next.i = next.b.getLayoutX();
                next.j = next.b.getLayoutY();
                requestLayout();
                invalidate();
                return;
            }
        }
    }

    public void updateNewPositionForDrawable(Drawable[] drawableArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492c568b", new Object[]{this, drawableArr, new Integer(i), new Integer(i2)});
            return;
        }
        Iterator<a> it = this.children.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.d == drawableArr) {
                if (next.i == next.b.getLayoutX() && next.j == next.b.getLayoutY() && i == next.e && i2 == next.f && next.b.getLayoutWidth() == next.g && next.b.getLayoutHeight() == next.h) {
                    return;
                }
                next.e = i;
                next.f = i2;
                next.g = next.b.getLayoutWidth();
                next.h = next.b.getLayoutHeight();
                next.i = next.b.getLayoutX();
                next.j = next.b.getLayoutY();
                invalidate();
                return;
            }
        }
    }

    public void updateNewPositionForDrawable(Drawable[] drawableArr, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40697809", new Object[]{this, drawableArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        Iterator<a> it = this.children.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next.d == drawableArr) {
                float f = i;
                if (next.i == f && next.j == i2 && next.g == i3 && next.h == i4) {
                    if (!z) {
                        return;
                    }
                    invalidate();
                    return;
                }
                next.g = i3;
                next.h = i4;
                next.i = f;
                next.j = i2;
                invalidate();
                return;
            }
        }
    }

    public boolean containDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c327dc4", new Object[]{this, drawableArr})).booleanValue();
        }
        Iterator<a> it = this.children.iterator();
        while (it.hasNext()) {
            if (it.next().d == drawableArr) {
                return true;
            }
        }
        return false;
    }

    public void addDrawable(Drawable[] drawableArr, YogaNode yogaNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8504acac", new Object[]{this, drawableArr, yogaNode, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = new a((View) null, drawableArr, yogaNode, i, i2);
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
        this.children.add(aVar);
        invalidate();
    }

    public void addDrawable(Drawable[] drawableArr, int i, int i2, int i3, int i4, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d25797b", new Object[]{this, drawableArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), aaVar});
            return;
        }
        a aVar = new a(drawableArr, i, i2, i3, i4);
        aVar.a(aaVar);
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setCallback(this);
            }
        }
        this.children.add(aVar);
        invalidate();
    }

    public void removeDrawable(Drawable[] drawableArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398d4010", new Object[]{this, drawableArr});
            return;
        }
        Iterator<a> it = this.children.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (next.d == drawableArr) {
                this.children.remove(next);
                break;
            }
        }
        invalidate();
    }

    public void addView(View view, YogaNode yogaNode, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("487b06de", new Object[]{this, view, yogaNode, new Integer(i), new Integer(i2)});
            return;
        }
        a aVar = new a(view, (Drawable[]) null, yogaNode, i, i2);
        this.children.add(aVar);
        view.setTag(R.id.layout_manager_flatviewgroup_child_id, aVar);
        super.addView(view);
    }

    public void addView(View view, int i, int i2, int i3, int i4, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cac6ad", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), aaVar});
            return;
        }
        a aVar = new a(view, i, i2, i3, i4);
        aVar.a(aaVar);
        this.children.add(aVar);
        view.setTag(R.id.layout_manager_flatviewgroup_child_id, aVar);
        super.addView(view);
    }

    public void addView(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dd6d85", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            addView(view, i, i2, i3, i4, null);
        }
    }

    private void addView(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c74e9b7", new Object[]{this, aVar});
        } else if (aVar.c == null) {
        } else {
            super.addView(aVar.c);
        }
    }

    public void addPopLayerView(aa aaVar, YogaNode yogaNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e29182ee", new Object[]{this, aaVar, yogaNode});
            return;
        }
        View x = aaVar.x();
        a aVar = new a(x, (Drawable[]) null, yogaNode, 0, 0);
        aVar.a(aaVar);
        this.popLayerView.add(aVar);
        x.setTag(R.id.layout_manager_flatviewgroup_child_id, aVar);
        super.addView(x);
        Component component = this.component;
        if (component == null || !component.getNode().o()) {
            return;
        }
        notifyPoplayerAppear(aaVar);
    }

    private void notifyPoplayerAppear(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13054dad", new Object[]{this, aaVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourcePage", "page");
        hashMap.put("type", "page");
        if (aaVar == null) {
            return;
        }
        aaVar.I().sendMessage(130, aaVar, "onpageappear", null, hashMap, null);
    }

    private void notifyPoplayerDisAppear(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe8ed69", new Object[]{this, aaVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sourcePage", "page");
        hashMap.put("type", "page");
        if (aaVar == null) {
            return;
        }
        aaVar.I().sendMessage(130, aaVar, "onpagedisappear", null, hashMap, null);
    }

    public void addFloatView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b879ec9", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (this.floatView == null) {
            this.floatView = new ArrayList<>();
        }
        this.floatView.add(new b(view, z));
        super.addView(view);
    }

    public void addFloatView(View view, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56cad5a", new Object[]{this, view, new Boolean(z), new Integer(i)});
            return;
        }
        if (this.floatView == null) {
            this.floatView = new ArrayList<>();
        }
        this.floatView.add(new b(view, z));
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf31982", new Object[]{this, view});
            return;
        }
        Iterator<a> it = this.children.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            a next = it.next();
            if (next.c == view) {
                this.children.remove(next);
                view.setTag(R.id.layout_manager_flatviewgroup_child_id, null);
                break;
            }
        }
        ArrayList<b> arrayList = this.floatView;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        Iterator<a> it2 = this.popLayerView.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            a next2 = it2.next();
            if (next2.c == view) {
                this.popLayerView.remove(next2);
                view.setTag(R.id.layout_manager_flatviewgroup_child_id, null);
                notifyPoplayerDisAppear(next2.f20509a);
                break;
            }
        }
        super.removeView(view);
    }

    private aa findChildNodeForCompareNode(a aVar, aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa) ipChange.ipc$dispatch("e9471e7c", new Object[]{this, aVar, aaVar});
        }
        aa aaVar2 = aVar.f20509a;
        while (aaVar2 != null && aaVar2.J() != aaVar) {
            aaVar2 = aaVar2.J();
        }
        return aaVar2;
    }

    public void sortChildren(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caaddaac", new Object[]{this, aaVar});
        } else if (this.children.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < this.children.size(); i++) {
                aa findChildNodeForCompareNode = findChildNodeForCompareNode(this.children.get(i), aaVar);
                if (findChildNodeForCompareNode != null) {
                    arrayList.add(new Pair(Integer.valueOf(i), Integer.valueOf(aaVar.d.indexOf(findChildNodeForCompareNode))));
                    arrayList2.add(Integer.valueOf(i));
                }
            }
            Collections.sort(arrayList, childComparator);
            int size = arrayList2.size();
            a[] aVarArr = new a[this.children.size()];
            for (int i2 = 0; i2 < size; i2++) {
                int intValue = ((Integer) arrayList2.get(i2)).intValue();
                aVarArr[intValue] = this.children.get(intValue);
            }
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) arrayList2.get(i3)).intValue();
                a aVar = aVarArr[((Integer) ((Pair) arrayList.get(i3)).first).intValue()];
                if (this.children.set(intValue2, aVar) != aVar) {
                    z = true;
                }
            }
            if (!z) {
                return;
            }
            removeAllViews();
            Iterator<a> it = this.children.iterator();
            while (it.hasNext()) {
                addView(it.next());
            }
            Iterator<a> it2 = this.popLayerView.iterator();
            while (it2.hasNext()) {
                addView(it2.next());
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : (getAlpha() == 0.0f && oeb.cj()) || !isEnabled();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (getAlpha() == 0.0f && oeb.cj()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709e3a19", new Object[]{this, drawable});
            return;
        }
        super.setBackgroundDrawable(drawable);
        if (drawable != null && (drawable instanceof b.C0848b)) {
            r rVar = this.measureResult;
            if (rVar == null) {
                return;
            }
            this.path = ((b.C0848b) drawable).a(this.path, rVar.f20361a, this.measureResult.b);
            return;
        }
        Path path = this.path;
        if (path == null) {
            return;
        }
        path.reset();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.drawable.b.C0848b.a
    public void onBoundChanged(b.C0848b c0848b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bebe4aad", new Object[]{this, c0848b});
        } else if (this.measureResult == null || c0848b != getBackground()) {
        } else {
            this.path = c0848b.a(this.path, this.measureResult.f20361a, this.measureResult.b);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c8819b", new Object[]{this, view, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(view, i);
        List<e> list = this.visibilityChangedCallbacks;
        if (list == null) {
            return;
        }
        for (e eVar : list) {
            eVar.a(view, i);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        List<d> list = this.sizeChangedCallbacks;
        if (list == null) {
            return;
        }
        for (d dVar : list) {
            dVar.a(i, i2, i3, i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getAction() == 0) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            c cVar = this.highLightInfo;
            if (cVar != null && cVar.f20511a != null && this.highLightInfo.f20511a.contains(rawX, rawY)) {
                Component component = this.component;
                if (component != null) {
                    component.sendMessage(component.getNode(), "onhighlightclick", null, null, null);
                }
                return false;
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void flick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479a9312", new Object[]{this});
            return;
        }
        this.drawFlicker = true;
        invalidate();
    }

    private void drawFlicker(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("820cfb2a", new Object[]{this, canvas});
        } else if (!this.drawFlicker) {
        } else {
            canvas.drawColor(Color.argb(150, (int) (Math.random() * 256.0d), (int) (Math.random() * 256.0d), (int) (Math.random() * 256.0d)));
            this.drawFlicker = false;
            postInvalidate();
        }
    }
}
