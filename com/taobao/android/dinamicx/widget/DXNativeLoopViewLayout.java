package com.taobao.android.dinamicx.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class DXNativeLoopViewLayout extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_PAGE_INDEX = -1;
    public static final int LAYER_ORDER_NORMAL = 0;
    public static final int LAYER_ORDER_REVERSE = 1;
    private a mAdapter;
    private int mCurPageIndex;
    private d mCurViewHolder;
    private int mLayerOrder;
    private b mLifecycleListener;
    private d mNextViewHolder;
    private d mPreViewHolder;
    private c mRecyclerViewPool;
    private Rect mTouchDelegateRect;
    private final BroadcastReceiver screenOnOffReceiver;

    /* loaded from: classes5.dex */
    public static abstract class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void a();

        public abstract void a(int i);

        public abstract void b();
    }

    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final View f12004a;
        public int b;

        public d(View view) {
            this.f12004a = view;
        }
    }

    public static /* synthetic */ Object ipc$super(DXNativeLoopViewLayout dXNativeLoopViewLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void access$000(DXNativeLoopViewLayout dXNativeLoopViewLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd87514", new Object[]{dXNativeLoopViewLayout});
        } else {
            dXNativeLoopViewLayout.onScreenOff();
        }
    }

    public static /* synthetic */ void access$100(DXNativeLoopViewLayout dXNativeLoopViewLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e807fd33", new Object[]{dXNativeLoopViewLayout});
        } else {
            dXNativeLoopViewLayout.onScreenOn();
        }
    }

    public DXNativeLoopViewLayout(Context context) {
        super(context);
        this.mRecyclerViewPool = new c();
        this.mTouchDelegateRect = new Rect();
        this.screenOnOffReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    DXNativeLoopViewLayout.access$000(DXNativeLoopViewLayout.this);
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    DXNativeLoopViewLayout.access$100(DXNativeLoopViewLayout.this);
                }
            }
        };
    }

    public DXNativeLoopViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRecyclerViewPool = new c();
        this.mTouchDelegateRect = new Rect();
        this.screenOnOffReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    DXNativeLoopViewLayout.access$000(DXNativeLoopViewLayout.this);
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    DXNativeLoopViewLayout.access$100(DXNativeLoopViewLayout.this);
                }
            }
        };
    }

    public DXNativeLoopViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRecyclerViewPool = new c();
        this.mTouchDelegateRect = new Rect();
        this.screenOnOffReceiver = new BroadcastReceiver() { // from class: com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                    return;
                }
                String action = intent.getAction();
                if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    DXNativeLoopViewLayout.access$000(DXNativeLoopViewLayout.this);
                } else if (!"android.intent.action.USER_PRESENT".equals(action)) {
                } else {
                    DXNativeLoopViewLayout.access$100(DXNativeLoopViewLayout.this);
                }
            }
        };
    }

    public void bindData(int i, int i2, a aVar, int i3, int i4) {
        IpChange ipChange = $ipChange;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03a0c00", new Object[]{this, new Integer(i), new Integer(i2), aVar, new Integer(i3), new Integer(i4)});
            return;
        }
        reset();
        this.mTouchDelegateRect.set(0, 0, i, i2);
        this.mAdapter = aVar;
        this.mCurPageIndex = i3;
        if (i4 == 1) {
            i5 = 1;
        }
        this.mLayerOrder = i5;
        if (aVar == null || aVar.a() == 0 || this.mCurPageIndex == -1) {
            return;
        }
        this.mCurViewHolder = getCurPageViewHolder();
        if (aVar.a() == 1) {
            addView(this.mCurViewHolder.f12004a);
        } else {
            this.mNextViewHolder = getNextPageViewHolder();
            this.mNextViewHolder.f12004a.setVisibility(4);
            if (this.mLayerOrder == 0) {
                addView(this.mCurViewHolder.f12004a);
                addView(this.mNextViewHolder.f12004a);
            } else {
                addView(this.mNextViewHolder.f12004a);
                addView(this.mCurViewHolder.f12004a);
            }
        }
        setTouchDelegate(new TouchDelegate(this.mTouchDelegateRect, this.mCurViewHolder.f12004a));
    }

    public void setLifecycleListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5170f0a", new Object[]{this, bVar});
        } else {
            this.mLifecycleListener = bVar;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        b bVar = this.mLifecycleListener;
        if (bVar == null) {
            return;
        }
        bVar.a(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        Context applicationContext = getContext().getApplicationContext();
        try {
            applicationContext.unregisterReceiver(this.screenOnOffReceiver);
        } catch (Throwable unused) {
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            applicationContext.registerReceiver(this.screenOnOffReceiver, intentFilter);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        try {
            getContext().getApplicationContext().unregisterReceiver(this.screenOnOffReceiver);
        } catch (Throwable unused) {
        }
    }

    private void onScreenOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ebc1f1", new Object[]{this});
            return;
        }
        b bVar = this.mLifecycleListener;
        if (bVar == null) {
            return;
        }
        bVar.b();
    }

    private void onScreenOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fd8ccb", new Object[]{this});
            return;
        }
        b bVar = this.mLifecycleListener;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void roll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06c7e84", new Object[]{this});
            return;
        }
        a aVar = this.mAdapter;
        if (aVar == null || aVar.a() < 3 || this.mCurPageIndex == -1) {
            return;
        }
        d dVar = this.mPreViewHolder;
        if (dVar != null) {
            removeView(dVar.f12004a);
            this.mRecyclerViewPool.a(this.mPreViewHolder);
            this.mPreViewHolder = null;
        }
        this.mPreViewHolder = this.mCurViewHolder;
        this.mCurViewHolder = this.mNextViewHolder;
        this.mCurViewHolder.f12004a.setVisibility(0);
        this.mCurPageIndex++;
        this.mNextViewHolder = getNextPageViewHolder();
        this.mNextViewHolder.f12004a.setVisibility(4);
        if (this.mLayerOrder == 0) {
            addView(this.mNextViewHolder.f12004a);
        } else {
            addView(this.mNextViewHolder.f12004a, 0);
        }
        setTouchDelegate(new TouchDelegate(this.mTouchDelegateRect, this.mCurViewHolder.f12004a));
    }

    private d getCurPageViewHolder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("660f192c", new Object[]{this}) : getPageViewHolder(this.mCurPageIndex);
    }

    private d getNextPageViewHolder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("3065cf4b", new Object[]{this}) : getPageViewHolder(this.mCurPageIndex + 1);
    }

    private d getPageViewHolder(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("6678a561", new Object[]{this, new Integer(i)});
        }
        int b2 = this.mAdapter.b(i);
        d a2 = this.mRecyclerViewPool.a(b2);
        if (a2 == null) {
            a2 = this.mAdapter.b(this, b2);
        }
        this.mAdapter.b((a) a2, i);
        return a2;
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        removeAllViews();
        d dVar = this.mCurViewHolder;
        if (dVar != null) {
            this.mRecyclerViewPool.a(dVar);
        }
        d dVar2 = this.mNextViewHolder;
        if (dVar2 != null) {
            this.mRecyclerViewPool.a(dVar2);
        }
        d dVar3 = this.mPreViewHolder;
        if (dVar3 != null) {
            this.mRecyclerViewPool.a(dVar3);
        }
        this.mNextViewHolder = null;
        this.mCurViewHolder = null;
        this.mPreViewHolder = null;
        this.mCurPageIndex = -1;
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<Integer, List<d>> f12003a = new WeakHashMap<>();

        public d a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("d9b75ff6", new Object[]{this, new Integer(i)});
            }
            List<d> list = this.f12003a.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                return list.remove(0);
            }
            return null;
        }

        public void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79f10603", new Object[]{this, dVar});
                return;
            }
            List<d> list = this.f12003a.get(Integer.valueOf(dVar.b));
            if (list == null) {
                list = new LinkedList<>();
                this.f12003a.put(Integer.valueOf(dVar.b), list);
            }
            if (list.size() >= 3) {
                return;
            }
            list.add(dVar);
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class a<VH extends d, Node extends DXWidgetNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract int a();

        public abstract VH a(ViewGroup viewGroup, int i);

        public abstract void a(VH vh, int i);

        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            return 0;
        }

        public final VH b(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VH) ipChange.ipc$dispatch("8a9e3f36", new Object[]{this, viewGroup, new Integer(i)});
            }
            VH a2 = a(viewGroup, i);
            a2.b = i;
            return a2;
        }

        public final void b(VH vh, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9ff1a921", new Object[]{this, vh, new Integer(i)});
            } else {
                a((a<VH, Node>) vh, i);
            }
        }
    }
}
