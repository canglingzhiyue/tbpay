package com.taobao.tao.flexbox.layoutmanager.container;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import tb.kge;
import tb.ohd;

/* loaded from: classes8.dex */
public class SheetContainer extends PopupWindow implements ab.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout content;
    private FrameLayout eventHolderView;
    private FrameLayout fakeNavBar;
    private boolean isDestroyed;
    private boolean isNavBarShow;
    private boolean isResumeCalled;
    private int navigationBarHeight;
    private TNodeView pageView;
    private FrameLayout rootView;
    private ab tNodeEngine;
    private ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.tao.flexbox.layoutmanager.container.SheetContainer.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            Activity activity = (Activity) SheetContainer.access$000(SheetContainer.this).getContext();
            boolean a2 = ohd.a(activity);
            if (SheetContainer.access$100(SheetContainer.this) == a2) {
                return;
            }
            SheetContainer.access$102(SheetContainer.this, a2);
            if (SheetContainer.access$200(SheetContainer.this) != null && SheetContainer.access$100(SheetContainer.this)) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) SheetContainer.access$200(SheetContainer.this).getLayoutParams();
                if (SheetContainer.access$100(SheetContainer.this)) {
                    i = SheetContainer.access$300(SheetContainer.this);
                }
                layoutParams.bottomMargin = i;
                SheetContainer.access$200(SheetContainer.this).setLayoutParams(layoutParams);
            } else if (SheetContainer.access$400(SheetContainer.this) != null) {
            } else {
                SheetContainer.access$402(SheetContainer.this, new FrameLayout(activity));
                SheetContainer.access$400(SheetContainer.this).setBackgroundColor(-1);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, SheetContainer.access$300(SheetContainer.this));
                layoutParams2.gravity = 80;
                SheetContainer.access$400(SheetContainer.this).setLayoutParams(layoutParams2);
                SheetContainer.access$000(SheetContainer.this).addView(SheetContainer.access$400(SheetContainer.this));
            }
        }
    };
    private Application.ActivityLifecycleCallbacks lifecycleCallback = new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.tao.flexbox.layoutmanager.container.SheetContainer.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else if (SheetContainer.access$500(SheetContainer.this) == null) {
            } else {
                SheetContainer.access$500(SheetContainer.this).v();
                SheetContainer.access$602(SheetContainer.this, true);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else if (SheetContainer.access$500(SheetContainer.this) == null) {
            } else {
                SheetContainer.access$500(SheetContainer.this).w();
            }
        }
    };

    static {
        kge.a(-841464935);
        kge.a(26727213);
    }

    public static /* synthetic */ Object ipc$super(SheetContainer sheetContainer, String str, Object... objArr) {
        if (str.hashCode() == -1373052399) {
            super.dismiss();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ FrameLayout access$000(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b7cdcc8", new Object[]{sheetContainer}) : sheetContainer.content;
    }

    public static /* synthetic */ boolean access$100(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2df7ae14", new Object[]{sheetContainer})).booleanValue() : sheetContainer.isNavBarShow;
    }

    public static /* synthetic */ boolean access$102(SheetContainer sheetContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73a1e5ca", new Object[]{sheetContainer, new Boolean(z)})).booleanValue();
        }
        sheetContainer.isNavBarShow = z;
        return z;
    }

    public static /* synthetic */ TNodeView access$200(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TNodeView) ipChange.ipc$dispatch("b594698c", new Object[]{sheetContainer}) : sheetContainer.pageView;
    }

    public static /* synthetic */ int access$300(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9fb86f41", new Object[]{sheetContainer})).intValue() : sheetContainer.navigationBarHeight;
    }

    public static /* synthetic */ FrameLayout access$400(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("ca59accc", new Object[]{sheetContainer}) : sheetContainer.fakeNavBar;
    }

    public static /* synthetic */ FrameLayout access$402(SheetContainer sheetContainer, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("9d97de6b", new Object[]{sheetContainer, frameLayout});
        }
        sheetContainer.fakeNavBar = frameLayout;
        return frameLayout;
    }

    public static /* synthetic */ ab access$500(SheetContainer sheetContainer) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ab) ipChange.ipc$dispatch("b1ac54d1", new Object[]{sheetContainer}) : sheetContainer.tNodeEngine;
    }

    public static /* synthetic */ ab access$502(SheetContainer sheetContainer, ab abVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ab) ipChange.ipc$dispatch("b779136c", new Object[]{sheetContainer, abVar});
        }
        sheetContainer.tNodeEngine = abVar;
        return abVar;
    }

    public static /* synthetic */ boolean access$602(SheetContainer sheetContainer, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e37c660f", new Object[]{sheetContainer, new Boolean(z)})).booleanValue();
        }
        sheetContainer.isResumeCalled = z;
        return z;
    }

    public SheetContainer(Activity activity, String str) {
        this.navigationBarHeight = ohd.b(activity);
        this.isNavBarShow = ohd.a(activity);
        this.content = new FrameLayout(activity);
        this.content.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.content.setBackgroundColor(0);
        initTNode(activity, str);
        setContentView(this.content);
        setWidth(ohd.b((Context) activity));
        setHeight(ohd.g(activity));
        setFocusable(true);
        setOutsideTouchable(true);
        setClippingEnabled(false);
        fixGlobalWindowEvent(activity);
    }

    private void fixGlobalWindowEvent(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c10576b", new Object[]{this, activity});
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        if (!(decorView instanceof FrameLayout)) {
            return;
        }
        this.rootView = (FrameLayout) decorView;
        this.rootView.getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        this.eventHolderView = new FrameLayout(activity);
        this.rootView.addView(this.eventHolderView, -1, -1);
        this.eventHolderView.setOnTouchListener(new View.OnTouchListener() { // from class: com.taobao.tao.flexbox.layoutmanager.container.SheetContainer.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                }
                try {
                    SheetContainer.access$000(SheetContainer.this).dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
                } catch (Throwable unused) {
                }
                return true;
            }
        });
    }

    public void show(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7429b556", new Object[]{this, activity});
            return;
        }
        try {
            showAtLocation(activity.getWindow().getDecorView(), 0, 0, 0);
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    private void initTNode(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdf7e89", new Object[]{this, activity, str});
            return;
        }
        this.pageView = TNodeView.create(activity, this, null, str, null, null, new TNodeView.b() { // from class: com.taobao.tao.flexbox.layoutmanager.container.SheetContainer.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutError() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("834776a6", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
            public void onLayoutCompleted(aa aaVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
                    return;
                }
                SheetContainer.access$502(SheetContainer.this, aaVar.k());
                SheetContainer.access$602(SheetContainer.this, true);
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (this.isNavBarShow) {
            i = this.navigationBarHeight;
        }
        layoutParams.bottomMargin = i;
        this.content.addView(this.pageView, layoutParams);
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        activity.registerActivityLifecycleCallbacks(this.lifecycleCallback);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        ab abVar = this.tNodeEngine;
        if (abVar != null) {
            abVar.b(0, abVar.A(), "onclose", null, null, null);
        } else {
            destroy();
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.content;
        if (frameLayout != null && (frameLayout.getContext() instanceof Activity) && Build.VERSION.SDK_INT >= 29) {
            ((Activity) this.content.getContext()).unregisterActivityLifecycleCallbacks(this.lifecycleCallback);
        }
        if (this.rootView != null) {
            if (Build.VERSION.SDK_INT < 16) {
                this.rootView.getViewTreeObserver().removeGlobalOnLayoutListener(this.globalLayoutListener);
            } else {
                this.rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            }
            FrameLayout frameLayout2 = this.eventHolderView;
            if (frameLayout2 != null) {
                this.rootView.removeView(frameLayout2);
            }
        }
        this.isDestroyed = true;
        ab abVar = this.tNodeEngine;
        if (abVar != null) {
            abVar.w();
            this.tNodeEngine.y();
        }
        this.tNodeEngine = null;
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isResumeCalled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("106b2df", new Object[]{this})).booleanValue() : this.isResumeCalled;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.c
    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue() : this.isDestroyed || !isShowing();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.c
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue() : !isDestroy();
    }
}
