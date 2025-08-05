package com.taobao.android.icart.widget.touch;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.SystemClock;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes5.dex */
public class DragFloatLayer<T> extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Interpolator sDragScrollInterpolator;
    private int mBoundBottomY;
    private int mBoundTopY;
    private int mCachedMaxScrollSpeed;
    private b<T> mCallback;
    private final Map<Point, Boolean> mCanSwapCache;
    private int mDragPos;
    private long mDragScrollStartTimeInMs;
    private T mDragUniqueId;
    private c mDragingViewHolder;
    private int mEnterPos;
    private T mEnterUniqueId;
    private d mFollower;
    private View mFollowerView;
    private T mLastSwapUniqueId;
    private float mLastX;
    private float mLastY;
    private int mOffsetY;
    private RecyclerView mRecyclerView;
    private int mScrollDy;
    private final Runnable mScrollRunnable;
    private boolean mScrolling;
    private int mSelectPos;
    private T mSelectUniqueId;
    private float mUpScrollFactor;
    public final ViewDragHelper viewDragHelper;

    /* loaded from: classes5.dex */
    public interface b<T> {
        T a(int i);

        void a(RecyclerView recyclerView, int i, int i2);

        void a(RecyclerView recyclerView, T t);

        void a(RecyclerView recyclerView, T t, T t2, int i, int i2);

        void a(RecyclerView recyclerView, T t, T t2, T t3);

        boolean a(int i, int i2);

        boolean a(RecyclerView recyclerView, T t, boolean z);

        void b(RecyclerView recyclerView, T t, T t2, int i, int i2);

        boolean b(int i, int i2);
    }

    /* loaded from: classes5.dex */
    public interface d {
        void onViewPositionChanged(Rect rect, Rect rect2, int i, int i2);
    }

    public static /* synthetic */ Object ipc$super(DragFloatLayer dragFloatLayer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ c access$000(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8e54c4a0", new Object[]{dragFloatLayer}) : dragFloatLayer.mDragingViewHolder;
    }

    public static /* synthetic */ Object access$1000(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("2463dac8", new Object[]{dragFloatLayer}) : dragFloatLayer.mSelectUniqueId;
    }

    public static /* synthetic */ Object access$1002(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a3c50c2a", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mSelectUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ int access$1102(DragFloatLayer dragFloatLayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fe928e9", new Object[]{dragFloatLayer, new Integer(i)})).intValue();
        }
        dragFloatLayer.mEnterPos = i;
        return i;
    }

    public static /* synthetic */ Object access$1202(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("64c89be8", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mEnterUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ Object access$1300(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6f67cfa5", new Object[]{dragFloatLayer}) : dragFloatLayer.mLastSwapUniqueId;
    }

    public static /* synthetic */ Object access$1302(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("454a63c7", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mLastSwapUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ b access$1400(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f7b6792e", new Object[]{dragFloatLayer}) : dragFloatLayer.mCallback;
    }

    public static /* synthetic */ int access$200(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ed8c72b0", new Object[]{dragFloatLayer})).intValue() : dragFloatLayer.mScrollDy;
    }

    public static /* synthetic */ void access$300(DragFloatLayer dragFloatLayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afd89c1e", new Object[]{dragFloatLayer, new Integer(i), new Integer(i2)});
        } else {
            dragFloatLayer.scrollAndMoveIfNecessary(i, i2);
        }
    }

    public static /* synthetic */ Runnable access$400(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("e92f0375", new Object[]{dragFloatLayer}) : dragFloatLayer.mScrollRunnable;
    }

    public static /* synthetic */ RecyclerView access$500(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("f4461c84", new Object[]{dragFloatLayer}) : dragFloatLayer.mRecyclerView;
    }

    public static /* synthetic */ View access$600(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("9e003ec3", new Object[]{dragFloatLayer}) : dragFloatLayer.mFollowerView;
    }

    public static /* synthetic */ View access$602(DragFloatLayer dragFloatLayer, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6634b031", new Object[]{dragFloatLayer, view});
        }
        dragFloatLayer.mFollowerView = view;
        return view;
    }

    public static /* synthetic */ int access$702(DragFloatLayer dragFloatLayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5421cb2", new Object[]{dragFloatLayer, new Integer(i)})).intValue();
        }
        dragFloatLayer.mDragPos = i;
        return i;
    }

    public static /* synthetic */ Object access$800(DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("5ed8bfcf", new Object[]{dragFloatLayer}) : dragFloatLayer.mDragUniqueId;
    }

    public static /* synthetic */ Object access$802(DragFloatLayer dragFloatLayer, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b2535d71", new Object[]{dragFloatLayer, obj});
        }
        dragFloatLayer.mDragUniqueId = obj;
        return obj;
    }

    public static /* synthetic */ int access$902(DragFloatLayer dragFloatLayer, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddbefbf0", new Object[]{dragFloatLayer, new Integer(i)})).intValue();
        }
        dragFloatLayer.mSelectPos = i;
        return i;
    }

    static {
        kge.a(-474510837);
        sDragScrollInterpolator = new Interpolator() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue() : f * f;
            }
        };
    }

    public DragFloatLayer(Context context) {
        super(context);
        this.mSelectPos = -1;
        this.mEnterPos = -1;
        this.mUpScrollFactor = 1.0f;
        this.mScrolling = false;
        this.mScrollDy = 0;
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        this.mCanSwapCache = new HashMap();
        this.mScrollRunnable = new Runnable() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DragFloatLayer.access$000(DragFloatLayer.this) == null) {
                } else {
                    c.a(DragFloatLayer.access$000(DragFloatLayer.this));
                    DragFloatLayer dragFloatLayer = DragFloatLayer.this;
                    DragFloatLayer.access$300(dragFloatLayer, 0, DragFloatLayer.access$200(dragFloatLayer));
                    DragFloatLayer.access$500(DragFloatLayer.this).removeCallbacks(DragFloatLayer.access$400(DragFloatLayer.this));
                    ViewCompat.postOnAnimation(DragFloatLayer.access$500(DragFloatLayer.this), this);
                }
            }
        };
        this.mCachedMaxScrollSpeed = -1;
        this.viewDragHelper = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
                }
                return 0;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewCaptured(View view, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue() : view != DragFloatLayer.access$600(DragFloatLayer.this);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                } else if (i != 0) {
                } else {
                    a();
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                } else {
                    DragFloatLayer.access$300(DragFloatLayer.this, i3, i4);
                }
            }

            private void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                DragFloatLayer.access$702(DragFloatLayer.this, -1);
                DragFloatLayer.access$802(DragFloatLayer.this, null);
                DragFloatLayer.access$902(DragFloatLayer.this, -1);
                DragFloatLayer.access$1002(DragFloatLayer.this, null);
                DragFloatLayer.access$1102(DragFloatLayer.this, -1);
                DragFloatLayer.access$1202(DragFloatLayer.this, null);
                DragFloatLayer.access$1302(DragFloatLayer.this, null);
                DragFloatLayer.access$602(DragFloatLayer.this, null);
                DragFloatLayer.this.setVisibility(8);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                Object access$800 = DragFloatLayer.access$800(DragFloatLayer.this);
                Object access$1000 = DragFloatLayer.access$1000(DragFloatLayer.this);
                Object access$1300 = DragFloatLayer.access$1300(DragFloatLayer.this);
                a();
                DragFloatLayer.access$1400(DragFloatLayer.this).a(DragFloatLayer.access$500(DragFloatLayer.this), access$800, access$1300, access$1000);
            }
        });
    }

    public DragFloatLayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSelectPos = -1;
        this.mEnterPos = -1;
        this.mUpScrollFactor = 1.0f;
        this.mScrolling = false;
        this.mScrollDy = 0;
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        this.mCanSwapCache = new HashMap();
        this.mScrollRunnable = new Runnable() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DragFloatLayer.access$000(DragFloatLayer.this) == null) {
                } else {
                    c.a(DragFloatLayer.access$000(DragFloatLayer.this));
                    DragFloatLayer dragFloatLayer = DragFloatLayer.this;
                    DragFloatLayer.access$300(dragFloatLayer, 0, DragFloatLayer.access$200(dragFloatLayer));
                    DragFloatLayer.access$500(DragFloatLayer.this).removeCallbacks(DragFloatLayer.access$400(DragFloatLayer.this));
                    ViewCompat.postOnAnimation(DragFloatLayer.access$500(DragFloatLayer.this), this);
                }
            }
        };
        this.mCachedMaxScrollSpeed = -1;
        this.viewDragHelper = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue();
                }
                return 0;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i, int i2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i), new Integer(i2)})).intValue() : i;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewCaptured(View view, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i)});
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i)})).booleanValue() : view != DragFloatLayer.access$600(DragFloatLayer.this);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i)});
                } else if (i != 0) {
                } else {
                    a();
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                } else {
                    DragFloatLayer.access$300(DragFloatLayer.this, i3, i4);
                }
            }

            private void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                DragFloatLayer.access$702(DragFloatLayer.this, -1);
                DragFloatLayer.access$802(DragFloatLayer.this, null);
                DragFloatLayer.access$902(DragFloatLayer.this, -1);
                DragFloatLayer.access$1002(DragFloatLayer.this, null);
                DragFloatLayer.access$1102(DragFloatLayer.this, -1);
                DragFloatLayer.access$1202(DragFloatLayer.this, null);
                DragFloatLayer.access$1302(DragFloatLayer.this, null);
                DragFloatLayer.access$602(DragFloatLayer.this, null);
                DragFloatLayer.this.setVisibility(8);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                Object access$800 = DragFloatLayer.access$800(DragFloatLayer.this);
                Object access$1000 = DragFloatLayer.access$1000(DragFloatLayer.this);
                Object access$1300 = DragFloatLayer.access$1300(DragFloatLayer.this);
                a();
                DragFloatLayer.access$1400(DragFloatLayer.this).a(DragFloatLayer.access$500(DragFloatLayer.this), access$800, access$1300, access$1000);
            }
        });
    }

    public DragFloatLayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectPos = -1;
        this.mEnterPos = -1;
        this.mUpScrollFactor = 1.0f;
        this.mScrolling = false;
        this.mScrollDy = 0;
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        this.mCanSwapCache = new HashMap();
        this.mScrollRunnable = new Runnable() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DragFloatLayer.access$000(DragFloatLayer.this) == null) {
                } else {
                    c.a(DragFloatLayer.access$000(DragFloatLayer.this));
                    DragFloatLayer dragFloatLayer = DragFloatLayer.this;
                    DragFloatLayer.access$300(dragFloatLayer, 0, DragFloatLayer.access$200(dragFloatLayer));
                    DragFloatLayer.access$500(DragFloatLayer.this).removeCallbacks(DragFloatLayer.access$400(DragFloatLayer.this));
                    ViewCompat.postOnAnimation(DragFloatLayer.access$500(DragFloatLayer.this), this);
                }
            }
        };
        this.mCachedMaxScrollSpeed = -1;
        this.viewDragHelper = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i2, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i2), new Integer(i22)})).intValue();
                }
                return 0;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i2, int i22) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i2), new Integer(i22)})).intValue() : i2;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewCaptured(View view, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i2)});
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i2)})).booleanValue() : view != DragFloatLayer.access$600(DragFloatLayer.this);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i2)});
                } else if (i2 != 0) {
                } else {
                    a();
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i2), new Integer(i22), new Integer(i3), new Integer(i4)});
                } else {
                    DragFloatLayer.access$300(DragFloatLayer.this, i3, i4);
                }
            }

            private void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                DragFloatLayer.access$702(DragFloatLayer.this, -1);
                DragFloatLayer.access$802(DragFloatLayer.this, null);
                DragFloatLayer.access$902(DragFloatLayer.this, -1);
                DragFloatLayer.access$1002(DragFloatLayer.this, null);
                DragFloatLayer.access$1102(DragFloatLayer.this, -1);
                DragFloatLayer.access$1202(DragFloatLayer.this, null);
                DragFloatLayer.access$1302(DragFloatLayer.this, null);
                DragFloatLayer.access$602(DragFloatLayer.this, null);
                DragFloatLayer.this.setVisibility(8);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                Object access$800 = DragFloatLayer.access$800(DragFloatLayer.this);
                Object access$1000 = DragFloatLayer.access$1000(DragFloatLayer.this);
                Object access$1300 = DragFloatLayer.access$1300(DragFloatLayer.this);
                a();
                DragFloatLayer.access$1400(DragFloatLayer.this).a(DragFloatLayer.access$500(DragFloatLayer.this), access$800, access$1300, access$1000);
            }
        });
    }

    public DragFloatLayer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mSelectPos = -1;
        this.mEnterPos = -1;
        this.mUpScrollFactor = 1.0f;
        this.mScrolling = false;
        this.mScrollDy = 0;
        this.mDragScrollStartTimeInMs = Long.MIN_VALUE;
        this.mCanSwapCache = new HashMap();
        this.mScrollRunnable = new Runnable() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (DragFloatLayer.access$000(DragFloatLayer.this) == null) {
                } else {
                    c.a(DragFloatLayer.access$000(DragFloatLayer.this));
                    DragFloatLayer dragFloatLayer = DragFloatLayer.this;
                    DragFloatLayer.access$300(dragFloatLayer, 0, DragFloatLayer.access$200(dragFloatLayer));
                    DragFloatLayer.access$500(DragFloatLayer.this).removeCallbacks(DragFloatLayer.access$400(DragFloatLayer.this));
                    ViewCompat.postOnAnimation(DragFloatLayer.access$500(DragFloatLayer.this), this);
                }
            }
        };
        this.mCachedMaxScrollSpeed = -1;
        this.viewDragHelper = ViewDragHelper.create(this, new ViewDragHelper.Callback() { // from class: com.taobao.android.icart.widget.touch.DragFloatLayer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                str.hashCode();
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionHorizontal(View view, int i22, int i222) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("dcd272d1", new Object[]{this, view, new Integer(i22), new Integer(i222)})).intValue();
                }
                return 0;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public int clampViewPositionVertical(View view, int i22, int i222) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53c1297f", new Object[]{this, view, new Integer(i22), new Integer(i222)})).intValue() : i22;
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewCaptured(View view, int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("faa1e09a", new Object[]{this, view, new Integer(i22)});
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public boolean tryCaptureView(View view, int i22) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("567455cc", new Object[]{this, view, new Integer(i22)})).booleanValue() : view != DragFloatLayer.access$600(DragFloatLayer.this);
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewDragStateChanged(int i22) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b3e50ec1", new Object[]{this, new Integer(i22)});
                } else if (i22 != 0) {
                } else {
                    a();
                }
            }

            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewPositionChanged(View view, int i22, int i222, int i3, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5bc6f844", new Object[]{this, view, new Integer(i22), new Integer(i222), new Integer(i3), new Integer(i4)});
                } else {
                    DragFloatLayer.access$300(DragFloatLayer.this, i3, i4);
                }
            }

            private void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                DragFloatLayer.access$702(DragFloatLayer.this, -1);
                DragFloatLayer.access$802(DragFloatLayer.this, null);
                DragFloatLayer.access$902(DragFloatLayer.this, -1);
                DragFloatLayer.access$1002(DragFloatLayer.this, null);
                DragFloatLayer.access$1102(DragFloatLayer.this, -1);
                DragFloatLayer.access$1202(DragFloatLayer.this, null);
                DragFloatLayer.access$1302(DragFloatLayer.this, null);
                DragFloatLayer.access$602(DragFloatLayer.this, null);
                DragFloatLayer.this.setVisibility(8);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.support.v4.widget.ViewDragHelper.Callback
            public void onViewReleased(View view, float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("32d03eca", new Object[]{this, view, new Float(f), new Float(f2)});
                    return;
                }
                Object access$800 = DragFloatLayer.access$800(DragFloatLayer.this);
                Object access$1000 = DragFloatLayer.access$1000(DragFloatLayer.this);
                Object access$1300 = DragFloatLayer.access$1300(DragFloatLayer.this);
                a();
                DragFloatLayer.access$1400(DragFloatLayer.this).a(DragFloatLayer.access$500(DragFloatLayer.this), access$800, access$1300, access$1000);
            }
        });
    }

    public void setBound(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc6c3c63", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mBoundTopY = i;
        this.mBoundBottomY = i2;
    }

    public void setUpScrollFactor(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8dda00", new Object[]{this, new Float(f)});
        } else {
            this.mUpScrollFactor = f;
        }
    }

    public void attach(RecyclerView recyclerView, b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ca3c80", new Object[]{this, recyclerView, bVar});
            return;
        }
        this.mRecyclerView = recyclerView;
        this.mCallback = bVar;
        setVisibility(8);
        setMotionEventSplittingEnabled(false);
    }

    public boolean isDraging() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b6a482f", new Object[]{this})).booleanValue() : this.mDragingViewHolder != null;
    }

    public void setLastMonitorEvent(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("995e245f", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        this.mLastX = f;
        this.mLastY = f2;
    }

    private Rect findRect(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("444e1732", new Object[]{this, cVar});
        }
        View b2 = cVar.b();
        int left = b2.getLeft();
        int top = b2.getTop();
        while (b2 != cVar.a() && (b2.getParent() instanceof View)) {
            b2 = (View) b2.getParent();
            left += b2.getLeft();
            top += b2.getTop();
        }
        return new Rect(left, top, cVar.b().getWidth() + left, cVar.b().getHeight() + top);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b3, code lost:
        r0 = r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void scrollAndMoveIfNecessary(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.icart.widget.touch.DragFloatLayer.scrollAndMoveIfNecessary(int, int):void");
    }

    private boolean canSwapWithCache(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43cf4884", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Point point = new Point(i, i2);
        Boolean bool = this.mCanSwapCache.get(point);
        if (bool == null) {
            bool = Boolean.valueOf(this.mCallback.a(i, i2));
            if (bool.booleanValue()) {
                this.mCanSwapCache.clear();
            } else {
                this.mCanSwapCache.put(point, bool);
            }
        }
        return bool.booleanValue();
    }

    private boolean canSelectWithCache(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32e281fb", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : this.mCallback.b(i, i2);
    }

    private int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97ae21ef", new Object[]{this, recyclerView, new Integer(i), new Integer(i2), new Integer(i3), new Long(j)})).intValue();
        }
        return r5 == 0 ? i2 > 0 ? 1 : -1 : r5;
    }

    private int getMaxDragScroll(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62f1e217", new Object[]{this, recyclerView})).intValue();
        }
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        return this.mCachedMaxScrollSpeed;
    }

    public void startDragItemSnapshot(c cVar, Rect rect, int i, T t, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd7c0404", new Object[]{this, cVar, rect, new Integer(i), t, new Integer(i2)});
            return;
        }
        this.mOffsetY = i;
        Rect rect2 = new Rect(rect.left, rect.top + this.mOffsetY, rect.right, rect.bottom + this.mOffsetY);
        View a2 = cVar.a();
        a2.setLeft(rect2.left);
        a2.setTop(rect2.top);
        a2.setRight(rect2.right);
        a2.setBottom(rect2.bottom);
        a2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(rect2.width(), rect2.height());
        layoutParams.topMargin = rect2.top;
        if (a2.getParent() instanceof ViewGroup) {
            ((ViewGroup) a2.getParent()).removeView(a2);
        }
        addView(a2, layoutParams);
        this.mDragingViewHolder = cVar;
        this.mDragUniqueId = t;
        this.mDragPos = i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        long uptimeMillis2 = SystemClock.uptimeMillis();
        float f = this.mLastX;
        if (f < 0.0f) {
            f = rect2.centerX();
        }
        float f2 = f;
        float f3 = this.mLastY;
        if (f3 < 0.0f) {
            f3 = rect2.centerY();
        }
        dispatchTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis2, 0, f2, f3, 0));
        setVisibility(0);
    }

    public void abortDrag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa244f0b", new Object[]{this});
        } else {
            this.viewDragHelper.abort();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : this.viewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            this.viewDragHelper.processTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.mDragingViewHolder = null;
            this.mDragUniqueId = null;
            setForeground(null);
            removeAllViews();
        }
        return true;
    }

    public T getDragUniqueId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("23ef96b5", new Object[]{this}) : this.mDragUniqueId;
    }

    public T getSelectUniqueId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("1657596d", new Object[]{this}) : this.mSelectUniqueId;
    }

    public int getDragPos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("112e1bc4", new Object[]{this})).intValue() : this.mDragPos;
    }

    public int getEnterPos() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22a12d4c", new Object[]{this})).intValue() : this.mEnterPos;
    }

    /* loaded from: classes5.dex */
    public static abstract class a<T, C> implements b<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<C> f12915a;
        public List<Point> b = new ArrayList();

        static {
            kge.a(1186745531);
            kge.a(1132573406);
        }

        @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
        public void a(RecyclerView recyclerView, T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e0a5bf2", new Object[]{this, recyclerView, t});
            }
        }

        @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
        public void a(RecyclerView recyclerView, T t, T t2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30fcb82e", new Object[]{this, recyclerView, t, t2, new Integer(i), new Integer(i2)});
            }
        }

        public a(List<C> list) {
            this.f12915a = list;
        }

        public static <C> boolean a(List<C> list, Point point) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("73c2b400", new Object[]{list, point})).booleanValue();
            }
            int i = point.x;
            int i2 = point.y;
            if (i < i2) {
                while (i < i2) {
                    int i3 = i + 1;
                    Collections.swap(list, i, i3);
                    i = i3;
                }
                return true;
            } else if (i <= i2) {
                return false;
            } else {
                while (i > i2) {
                    Collections.swap(list, i, i - 1);
                    i--;
                }
                return true;
            }
        }

        @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
        public void a(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2febb876", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            Point point = new Point(i, i2);
            this.b.add(point);
            if (!a(this.f12915a, point)) {
                return;
            }
            recyclerView.getAdapter().notifyItemMoved(i, i2);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition >= 0) {
                View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition);
                i3 = linearLayoutManager.getDecoratedTop(findViewByPosition) - linearLayoutManager.getTopDecorationHeight(findViewByPosition);
            }
            if (findFirstCompletelyVisibleItemPosition < 0) {
                return;
            }
            linearLayoutManager.scrollToPositionWithOffset(findFirstCompletelyVisibleItemPosition, i3);
        }

        @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
        public void b(RecyclerView recyclerView, T t, T t2, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d87891ef", new Object[]{this, recyclerView, t, t2, new Integer(i), new Integer(i2)});
                return;
            }
            if (i2 != -1) {
                recyclerView.getAdapter().notifyItemChanged(i2);
            }
            if (i == -1) {
                return;
            }
            recyclerView.getAdapter().notifyItemChanged(i);
        }

        @Override // com.taobao.android.icart.widget.touch.DragFloatLayer.b
        public void a(RecyclerView recyclerView, T t, T t2, T t3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d54ebaa", new Object[]{this, recyclerView, t, t2, t3});
            } else {
                this.b.clear();
            }
        }

        public Point a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Point) ipChange.ipc$dispatch("f4fd5b11", new Object[]{this});
            }
            if (this.b.isEmpty()) {
                return null;
            }
            List<Point> list = this.b;
            return new Point(this.b.get(0).x, list.get(list.size() - 1).y);
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final View f12916a;
        private final View b;

        static {
            kge.a(1233008862);
        }

        public static /* synthetic */ View a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b1f60ccf", new Object[]{cVar}) : cVar.b;
        }

        public c(View view, View view2) {
            this.f12916a = view;
            if (view2 == null) {
                this.b = this.f12916a;
            } else {
                this.b = view2;
            }
        }

        public View a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.f12916a;
        }

        public View b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.b;
        }
    }

    public void setFollower(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68a1feb", new Object[]{this, dVar});
        } else {
            this.mFollower = dVar;
        }
    }
}
