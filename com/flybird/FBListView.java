package com.flybird;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alipay.birdnest.util.FBLogger;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class FBListView extends ListView implements AdapterView.OnItemLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static int f7162a = -1;
    public FBListViewListener b;
    public FBListViewDragListener c;
    public Handler d;
    public AutoScrollMoreListAdapter e;
    public ViewGroup f;
    public ImageView g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int q;
    public Bitmap r;
    public int s;
    public int t;
    public int u;
    public float v;
    public int w;
    public int[] x;
    public HashMap<Integer, Integer> y;
    public final Runnable z;

    /* loaded from: classes4.dex */
    public class DragFinishAnimation extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public DragFinishAnimation() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            Bitmap bitmap = FBListView.this.r;
            if (bitmap != null) {
                bitmap.recycle();
                FBListView.this.r = null;
            }
            FBListView.this.g.setVisibility(8);
            FBListView.this.g.setImageBitmap(null);
        }
    }

    /* loaded from: classes4.dex */
    public interface FBListViewDragListener {
        void onDragViewDown(int i);

        void onDragViewMoved(int i, int i2);

        void onDragViewStart(int i);
    }

    /* loaded from: classes4.dex */
    public interface FBListViewListener {
        void onFooterPullOver(FBListView fBListView);

        void onHeaderPullOver(FBListView fBListView);
    }

    public FBListView(Context context) {
        super(context);
        this.q = 300;
        this.x = new int[]{0, 0};
        this.y = new HashMap<>();
        this.z = new Runnable() { // from class: com.flybird.FBListView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FBListView fBListView = FBListView.this;
                int i2 = fBListView.n;
                if (i2 > fBListView.t) {
                    if (i2 >= fBListView.u) {
                        i = 25;
                    }
                    FBListView.this.d.postDelayed(this, 5L);
                }
                i = -25;
                fBListView.smoothScrollBy(i, 5);
                FBListView.this.d.postDelayed(this, 5L);
            }
        };
        if (f7162a == -1) {
            f7162a = (int) (FBTools.getDp(context) * 20.0f);
        }
        this.g = new ImageView(context);
        if (context instanceof Activity) {
            ViewGroup viewGroup = (ViewGroup) ((Activity) context).getWindow().getDecorView();
            this.f = viewGroup;
            viewGroup.addView(this.g, new FrameLayout.LayoutParams(-2, -2));
        }
        setOnItemLongClickListener(this);
        this.v = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    public static /* synthetic */ Object ipc$super(FBListView fBListView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -429021187:
                super.setAdapter((ListAdapter) objArr[0]);
                return null;
            case -381850951:
                return new Boolean(super.overScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public final void a(View view, View view2, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2839e36", new Object[]{this, view, view2, iArr});
        } else if (view == view2 || view2 == null) {
        } else {
            iArr[0] = iArr[0] + view.getLeft();
            iArr[1] = iArr[1] + view.getTop();
            if (view.getParent() == null) {
                return;
            }
            a((View) view.getParent(), view2, iArr);
        }
    }

    public boolean handleDragFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52c67199", new Object[]{this})).booleanValue();
        }
        if (this.c != null && isIndexInBound(this.o)) {
            this.c.onDragViewDown(this.o);
        }
        AutoScrollMoreListAdapter autoScrollMoreListAdapter = this.e;
        if (autoScrollMoreListAdapter != null) {
            autoScrollMoreListAdapter.notifyDataSetChanged();
        }
        ImageView imageView = this.g;
        if (imageView != null && imageView.getVisibility() == 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, "alpha", 0.7f, 0.0f);
            ofFloat.setDuration(30L);
            ofFloat.addListener(new DragFinishAnimation());
            ofFloat.start();
        }
        return true;
    }

    public boolean handleDragMoving(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae24a95", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        View a2 = a(i, i2);
        if (a2 == null) {
            return false;
        }
        int positionForView = getPositionForView(a2) - getHeaderViewsCount();
        if (this.e.isSection(positionForView) || this.w != this.e.getSection(positionForView)) {
            return false;
        }
        if (isIndexInBound(positionForView)) {
            a(positionForView);
        }
        if (this.c != null && isIndexInBound(this.o)) {
            this.c.onDragViewMoved(this.o, positionForView);
            this.o = positionForView;
        }
        this.g.setX(this.x[0]);
        this.g.setY((i2 - this.s) + this.x[1]);
        return true;
    }

    public boolean handleDragStart(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acd278f1", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (this.j || !this.h) {
            return false;
        }
        this.j = true;
        View a2 = a(i, i2);
        if (a2 == null) {
            return false;
        }
        int positionForView = getPositionForView(a2) - getHeaderViewsCount();
        this.o = positionForView;
        this.w = this.e.getSection(positionForView);
        a(this.o);
        Bitmap createBitmap = Bitmap.createBitmap(a2.getWidth(), a2.getHeight(), Bitmap.Config.ARGB_8888);
        a2.draw(new Canvas(createBitmap));
        this.r = createBitmap;
        if (createBitmap == null) {
            return false;
        }
        this.g.setImageBitmap(createBitmap);
        this.g.setVisibility(0);
        this.g.setAlpha(0.7f);
        this.g.setX(getPaddingLeft());
        this.s = i2 - a2.getTop();
        this.g.setY(a2.getTop() + this.x[1]);
        this.g.setSelected(true);
        int height = (int) (getHeight() * 0.2f);
        this.t = getTop() + height;
        this.u = getBottom() - height;
        if (this.c != null && isIndexInBound(this.o)) {
            this.c.onDragViewStart(this.o);
        }
        return true;
    }

    public boolean isIndexInBound(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ebc8c18f", new Object[]{this, new Integer(i)})).booleanValue() : i >= 0 && i < this.e.getCount();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.e == null) {
            return;
        }
        requestLayout();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        this.k = (int) motionEvent.getX();
        this.l = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            this.m = this.l;
        }
        return this.h;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        AutoScrollMoreListAdapter autoScrollMoreListAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("caf3a110", new Object[]{this, adapterView, view, new Integer(i), new Long(j)})).booleanValue();
        }
        FBLogger.d("FBListView", "on item long click mode");
        int headerViewsCount = i - getHeaderViewsCount();
        if (this.i && (autoScrollMoreListAdapter = this.e) != null && !autoScrollMoreListAdapter.isSection(i) && isIndexInBound(headerViewsCount)) {
            this.h = true;
            handleDragStart(this.k, this.l);
        }
        return false;
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
            return;
        }
        super.onRestoreInstanceState(parcelable);
        if (this.e == null) {
            return;
        }
        requestLayout();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.x = new int[]{0, 0};
        super.onSizeChanged(i, i2, i3, i4);
        a(this, this.f, this.x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.flybird.FBListView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            r1[r3] = r8
            java.lang.String r8 = "a9b14c3a"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            float r0 = r8.getX()
            int r0 = (int) r0
            r7.k = r0
            float r0 = r8.getY()
            int r0 = (int) r0
            r7.l = r0
            boolean r0 = r7.h
            if (r0 != 0) goto L33
            boolean r8 = super.onTouchEvent(r8)
            return r8
        L33:
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto La1
            if (r0 == r3) goto L85
            if (r0 == r2) goto L43
            r1 = 3
            if (r0 == r1) goto L85
            goto La8
        L43:
            int r0 = r7.k
            int r1 = r7.l
            r7.handleDragStart(r0, r1)
            int r0 = r7.l
            r7.n = r0
            int r1 = r7.k
            boolean r0 = r7.handleDragMoving(r1, r0)
            if (r0 == 0) goto La8
            boolean r0 = r7.p
            if (r0 != 0) goto La8
            int r0 = r7.n
            int r1 = r7.m
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            float r0 = (float) r0
            float r1 = r7.v
            r2 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto La8
            r7.p = r3
            android.os.Handler r0 = r7.d
            if (r0 != 0) goto L7b
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r7.d = r0
        L7b:
            android.os.Handler r0 = r7.d
            java.lang.Runnable r1 = r7.z
            r5 = 5
            r0.postDelayed(r1, r5)
            goto La8
        L85:
            android.os.Handler r0 = r7.d
            if (r0 != 0) goto L90
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r7.d = r0
        L90:
            android.os.Handler r0 = r7.d
            java.lang.Runnable r1 = r7.z
            r0.removeCallbacks(r1)
            r7.p = r4
            r7.handleDragFinished()
            r7.h = r4
            r7.j = r4
            goto La8
        La1:
            int r0 = r7.k
            int r1 = r7.l
            r7.handleDragStart(r0, r1)
        La8:
            boolean r0 = r7.h
            if (r0 != 0) goto Lb3
            boolean r8 = super.onTouchEvent(r8)
            if (r8 != 0) goto Lb3
            return r4
        Lb3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flybird.FBListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e93d6ab9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        boolean overScrollBy = super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
        FBListViewListener fBListViewListener = this.b;
        if (fBListViewListener != null && overScrollBy) {
            int i9 = f7162a;
            if (i2 < (-i9)) {
                fBListViewListener.onHeaderPullOver(this);
            } else if (i2 > i9) {
                fBListViewListener.onFooterPullOver(this);
            }
        }
        return overScrollBy;
    }

    public void setDragingEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42de287e", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void setFBListViewDragListener(FBListViewDragListener fBListViewDragListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a72db16", new Object[]{this, fBListViewDragListener});
        } else {
            this.c = fBListViewDragListener;
        }
    }

    public void setListener(FBListViewListener fBListViewListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dfbb4dd", new Object[]{this, fBListViewListener});
        } else {
            this.b = fBListViewListener;
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66da7fd", new Object[]{this, listAdapter});
            return;
        }
        this.e = (AutoScrollMoreListAdapter) listAdapter;
        super.setAdapter(listAdapter);
    }

    public final View a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c2bbc90a", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (i >= childAt.getLeft() && i <= childAt.getRight() && i2 >= childAt.getTop() && i2 <= childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (isIndexInBound(i)) {
            int firstVisiblePosition = getFirstVisiblePosition();
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int headerViewsCount = (firstVisiblePosition + i2) - getHeaderViewsCount();
                if (isIndexInBound(headerViewsCount) && this.e.getItem(headerViewsCount) != null) {
                    this.y.put(Integer.valueOf(this.e.getItem(headerViewsCount).hashCode()), Integer.valueOf(childAt.getTop()));
                }
            }
            if (!this.y.isEmpty()) {
                getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.flybird.FBListView.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.ViewTreeObserver.OnPreDrawListener
                    public boolean onPreDraw() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                        }
                        FBListView.this.getViewTreeObserver().removeOnPreDrawListener(this);
                        int firstVisiblePosition2 = FBListView.this.getFirstVisiblePosition();
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < FBListView.this.getChildCount(); i3++) {
                            View childAt2 = FBListView.this.getChildAt(i3);
                            int headerViewsCount2 = (firstVisiblePosition2 + i3) - FBListView.this.getHeaderViewsCount();
                            if (FBListView.this.isIndexInBound(headerViewsCount2) && FBListView.this.e.getItem(headerViewsCount2) != null) {
                                Integer num = FBListView.this.y.get(Integer.valueOf(FBListView.this.e.getItem(headerViewsCount2).hashCode()));
                                int top = childAt2.getTop();
                                if (num != null && num.intValue() != top) {
                                    arrayList.add(ObjectAnimator.ofFloat(childAt2, "translationY", num.intValue() - top, 0.0f));
                                }
                            }
                        }
                        if (arrayList.size() > 0) {
                            animatorSet.setDuration(FBListView.this.q).playTogether(arrayList);
                            animatorSet.start();
                        }
                        FBListView.this.y.clear();
                        return true;
                    }
                });
            }
            AutoScrollMoreListAdapter autoScrollMoreListAdapter = this.e;
            if (autoScrollMoreListAdapter == null) {
                return;
            }
            autoScrollMoreListAdapter.notifyDataSetChanged();
        }
    }

    public FBListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 300;
        this.x = new int[]{0, 0};
        this.y = new HashMap<>();
        this.z = new Runnable() { // from class: com.flybird.FBListView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                int i;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FBListView fBListView = FBListView.this;
                int i2 = fBListView.n;
                if (i2 > fBListView.t) {
                    if (i2 >= fBListView.u) {
                        i = 25;
                    }
                    FBListView.this.d.postDelayed(this, 5L);
                }
                i = -25;
                fBListView.smoothScrollBy(i, 5);
                FBListView.this.d.postDelayed(this, 5L);
            }
        };
    }

    public FBListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = 300;
        this.x = new int[]{0, 0};
        this.y = new HashMap<>();
        this.z = new Runnable() { // from class: com.flybird.FBListView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                int i2;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                FBListView fBListView = FBListView.this;
                int i22 = fBListView.n;
                if (i22 > fBListView.t) {
                    if (i22 >= fBListView.u) {
                        i2 = 25;
                    }
                    FBListView.this.d.postDelayed(this, 5L);
                }
                i2 = -25;
                fBListView.smoothScrollBy(i2, 5);
                FBListView.this.d.postDelayed(this, 5L);
            }
        };
    }
}
