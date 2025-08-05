package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.widget.ScrollFrameLayout;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.component.module.d;
import com.taobao.android.detail.ttdetail.component.module.h;
import com.taobao.android.detail.ttdetail.component.module.j;
import com.taobao.android.detail.ttdetail.component.module.o;
import com.taobao.taobao.R;

/* loaded from: classes4.dex */
public abstract class etm extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final float EXIT_BTN_MARGIN_TOP;
    public volatile boolean isComponentExpand;
    private Application.ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    public ScrollFrameLayout mContentContainer;
    private View mExitBtn;
    private final j mFrameSize;
    private ScrollFrameLayout.a mOnScrollInterceptor;
    private ScrollFrameLayout.b mOnViewLifecycleListener;

    static {
        kge.a(-110190378);
    }

    public static /* synthetic */ Object ipc$super(etm etmVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode != 1252518699) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onDisAppear();
            return null;
        }
    }

    public void onActivityPageCreated(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d7af44", new Object[]{this, activity});
        }
    }

    public void onActivityPageDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c663d675", new Object[]{this, activity});
        }
    }

    public void onActivityPagePaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e932e24", new Object[]{this, activity});
        }
    }

    public void onActivityPageResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a119173", new Object[]{this, activity});
        }
    }

    public void onActivityPageStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a988339d", new Object[]{this, activity});
        }
    }

    public void onActivityPageStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27aa3de9", new Object[]{this, activity});
        }
    }

    public void onComponentExpand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc7e9f", new Object[]{this});
        }
    }

    public void onComponentShrink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0968e", new Object[]{this});
        }
    }

    public void onComponentViewAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64519f59", new Object[]{this});
        }
    }

    public void onComponentViewDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbafa156", new Object[]{this});
        }
    }

    public abstract void onViewUpdate(View view);

    public etm(Context context, eyx eyxVar, eyy eyyVar, DataEntry... dataEntryArr) {
        super(context, eyxVar, eyyVar, dataEntryArr);
        this.mActivityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: tb.etm.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                } else {
                    etm.this.onActivityPageCreated(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                } else {
                    etm.this.onActivityPageStarted(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                } else {
                    etm.this.onActivityPageResumed(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                } else {
                    etm.this.onActivityPagePaused(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                } else {
                    etm.this.onActivityPageStopped(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                } else {
                    etm.this.onActivityPageDestroyed(activity);
                }
            }
        };
        this.mOnScrollInterceptor = new ScrollFrameLayout.a() { // from class: tb.etm.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.widget.ScrollFrameLayout.a
            public boolean a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                }
                return true;
            }

            @Override // com.taobao.android.detail.industry.widget.ScrollFrameLayout.a
            public boolean b() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !etm.this.isComponentExpand;
            }
        };
        this.mOnViewLifecycleListener = new ScrollFrameLayout.b() { // from class: tb.etm.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.widget.ScrollFrameLayout.b
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    etm.this.onComponentViewAttachedToWindow();
                }
            }

            @Override // com.taobao.android.detail.industry.widget.ScrollFrameLayout.b
            public void b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                etm.this.onComponentViewDetachedFromWindow();
                etm.this.shrinkComponent();
            }
        };
        this.mFrameSize = new j(-1, -1, 17);
        this.EXIT_BTN_MARGIN_TOP = TypedValue.applyDimension(1, 42.0f, context.getResources().getDisplayMetrics());
    }

    private void registerActivityLifecycleCallbacks(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("769691eb", new Object[]{this, context});
        } else if (!(context instanceof Activity)) {
        } else {
            ((Activity) context).getApplication().registerActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        }
    }

    private void unregisterActivityLifecycleCallbacks(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cc81432", new Object[]{this, context});
        } else if (!(context instanceof Activity)) {
        } else {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        registerActivityLifecycleCallbacks(this.mContext);
    }

    private int getTopWindowInset(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4311f466", new Object[]{this, context})).intValue();
        }
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (Build.VERSION.SDK_INT >= 23) {
                    return activity.getWindow().getDecorView().getRootWindowInsets().getStableInsetTop();
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public j onGetFrameSize(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("dd5270c3", new Object[]{this, new Integer(i), new Integer(i2)}) : this.mFrameSize;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public View onGetComponentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f631742", new Object[]{this, view});
        }
        if (view == null || view.getId() != R.id.fl_industry_root) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.industry_base_layout_component, (ViewGroup) null);
            ((ViewGroup.MarginLayoutParams) view.findViewById(R.id.tv_industry_exit_expand).getLayoutParams()).topMargin = (int) (getTopWindowInset(this.mContext) + this.EXIT_BTN_MARGIN_TOP);
        }
        this.mExitBtn = view.findViewById(R.id.tv_industry_exit_expand);
        this.mExitBtn.setOnClickListener(new View.OnClickListener() { // from class: tb.etm.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    etm.this.shrinkComponent();
                }
            }
        });
        this.mContentContainer = (ScrollFrameLayout) view.findViewById(R.id.fl_industry_base_container);
        this.mContentContainer.setOnViewLifecycleListener(this.mOnViewLifecycleListener);
        this.mContentContainer.setOnScrollInterceptor(this.mOnScrollInterceptor);
        onViewUpdate(view);
        return view;
    }

    public float getFrameDimensionRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("92b6853", new Object[]{this})).floatValue();
        }
        o parentComponent = getParentComponent();
        if (!(parentComponent instanceof h)) {
            return 1.0f;
        }
        return ((h) parentComponent).d();
    }

    public final void expandComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("775e368a", new Object[]{this});
        } else if (this.isComponentExpand) {
        } else {
            o parentComponent = getParentComponent();
            if (!(parentComponent instanceof h)) {
                return;
            }
            ((h) parentComponent).a("9:15");
            this.isComponentExpand = true;
            onComponentExpand();
            View view = this.mExitBtn;
            if (view == null) {
                return;
            }
            view.setVisibility(0);
        }
    }

    public final void shrinkComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48849b7b", new Object[]{this});
        } else if (!this.isComponentExpand) {
        } else {
            o parentComponent = getParentComponent();
            if (!(parentComponent instanceof h)) {
                return;
            }
            ((h) parentComponent).a((String) null);
            this.isComponentExpand = false;
            onComponentShrink();
            View view = this.mExitBtn;
            if (view == null) {
                return;
            }
            view.setVisibility(8);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        shrinkComponent();
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        unregisterActivityLifecycleCallbacks(this.mContext);
    }
}
