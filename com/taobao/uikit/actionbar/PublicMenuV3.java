package com.taobao.uikit.actionbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.MenuContract;
import com.taobao.uikit.actionbar.PublicMenuAdapterV2;
import com.taobao.uikit.actionbar.View.CustomiseScrollView;
import com.taobao.uikit.actionbar.util.MenuMonitor;
import com.taobao.uikit.extend.utils.NavigationBarUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import tb.kge;

/* loaded from: classes9.dex */
public class PublicMenuV3 implements MenuItem.OnMenuItemClickListener, MenuContract.ActionBarBaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NewTBPublicMenu";
    private View floatingLayer;
    private boolean isDismissing;
    private final WeakReference<Activity> mActivity;
    private MenuContract.OnDismissListener mOnDismissListener;
    private PopupWindow mPopupMenu;
    private int orientation;
    private View panelView;
    private View popupContentView;
    private boolean isShareMenuShown = true;
    private boolean shouldShareMenuToBeShown = false;
    private final SparseArray<PublicMenuAdapterV2> mMenuAdapters = new SparseArray<>(3);

    static {
        kge.a(908479351);
        kge.a(78402243);
        kge.a(1425217202);
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ boolean access$002(PublicMenuV3 publicMenuV3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14c52367", new Object[]{publicMenuV3, new Boolean(z)})).booleanValue();
        }
        publicMenuV3.isDismissing = z;
        return z;
    }

    public static /* synthetic */ MenuContract.OnDismissListener access$100(PublicMenuV3 publicMenuV3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuContract.OnDismissListener) ipChange.ipc$dispatch("90b0bc25", new Object[]{publicMenuV3}) : publicMenuV3.mOnDismissListener;
    }

    public static /* synthetic */ void access$200(PublicMenuV3 publicMenuV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2259ea11", new Object[]{publicMenuV3});
        } else {
            publicMenuV3.dismiss();
        }
    }

    public static /* synthetic */ PopupWindow access$300(PublicMenuV3 publicMenuV3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopupWindow) ipChange.ipc$dispatch("61722c4", new Object[]{publicMenuV3}) : publicMenuV3.mPopupMenu;
    }

    /* loaded from: classes9.dex */
    public static class WrapContentLinearLayoutManager extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1711420316);
        }

        public static /* synthetic */ Object ipc$super(WrapContentLinearLayoutManager wrapContentLinearLayoutManager, String str, Object... objArr) {
            if (str.hashCode() == 1626618577) {
                super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public WrapContentLinearLayoutManager(Context context) {
            super(context);
        }

        public WrapContentLinearLayoutManager(Context context, int i, boolean z) {
            super(context, i, z);
        }

        public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60f43ad1", new Object[]{this, recycler, state});
                return;
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                TLog.loge(PublicMenuV3.TAG, "IndexOutOfBoundsException", e);
                MenuMonitor.countFailed("menu_view_onLayout_failed_v3", e.toString());
            }
        }
    }

    public PublicMenuV3(Activity activity) {
        this.mActivity = new WeakReference<>(activity);
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBaseView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.mPopupMenu;
        if (popupWindow == null) {
            return;
        }
        popupWindow.dismiss();
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBaseView
    public void addMenuAdapter(int i, PublicMenuAdapterV2 publicMenuAdapterV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b7b44b", new Object[]{this, new Integer(i), publicMenuAdapterV2});
        } else {
            this.mMenuAdapters.put(i, publicMenuAdapterV2);
        }
    }

    public void showPopupMenu(final TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ac7af1", new Object[]{this, tBActionView});
            return;
        }
        try {
            init();
            Activity activity = this.mActivity.get();
            if (activity != null && !activity.isFinishing() && this.mPopupMenu != null) {
                if (!this.mPopupMenu.isShowing()) {
                    this.panelView.startAnimation(AnimationUtils.loadAnimation(activity, R.anim.uik_public_menu_panel_bottom_in));
                    notifyMenuChanged();
                    if (this.orientation == 2) {
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        ((WindowManager) activity.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay().getRealMetrics(displayMetrics);
                        int i = displayMetrics.widthPixels;
                        int i2 = displayMetrics.heightPixels;
                        this.mPopupMenu.setClippingEnabled(false);
                        this.mPopupMenu.setHeight(i2);
                        this.mPopupMenu.setWidth(i);
                    } else {
                        this.mPopupMenu.setClippingEnabled(true);
                    }
                    this.mPopupMenu.showAtLocation(activity.getWindow().getDecorView(), 0, 0, 0);
                    MenuMonitor.countSucceed("menu_view_shown_v3");
                    if (tBActionView != null) {
                        tBActionView.onMessageUpdate(null);
                    }
                    doBackground(0.5f);
                }
                this.mPopupMenu.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.uikit.actionbar.PublicMenuV3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                            return;
                        }
                        UTWrapper.menuDismiss();
                        PublicMenuV3.access$002(PublicMenuV3.this, false);
                        if (PublicMenuV3.access$100(PublicMenuV3.this) != null) {
                            PublicMenuV3.access$100(PublicMenuV3.this).onDismiss(PublicMenuV3.this);
                            MenuMonitor.countSucceed("menu_dismissed_v3");
                        }
                        TBActionView tBActionView2 = tBActionView;
                        if (tBActionView2 == null) {
                            return;
                        }
                        tBActionView2.onMessageUpdate(TBPublicMenu.getPublicMenu(R.id.uik_menu_wangxin));
                    }
                });
            } else if (this.mPopupMenu != null) {
            } else {
                MenuMonitor.countFailed("mPopupMenu_is_null_v3", "mPopupMenu is null");
            }
        } catch (WindowManager.BadTokenException unused) {
            MenuMonitor.countFailed("menu_view_show_failed_v3", "activity is null");
        }
    }

    private void initRecyclerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d313033b", new Object[]{this});
        } else if (this.popupContentView == null || this.mActivity.get() == null) {
        } else {
            PublicMenuAdapterV2 publicMenuAdapterV2 = this.mMenuAdapters.get(0);
            if (publicMenuAdapterV2 == null || publicMenuAdapterV2.getItemCount() == 0) {
                this.shouldShareMenuToBeShown = false;
            } else {
                this.shouldShareMenuToBeShown = true;
            }
            initRecyclerViewInner(publicMenuAdapterV2, R.id.uik_fl_container_share);
            initRecyclerViewInner(this.mMenuAdapters.get(1), R.id.uik_fl_container_default);
            initRecyclerViewInner(this.mMenuAdapters.get(2), R.id.uik_fl_container_extern);
        }
    }

    private void initMenuPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2f16bc", new Object[]{this});
        } else if (this.shouldShareMenuToBeShown) {
            if (!this.isShareMenuShown) {
                View findViewById = this.popupContentView.findViewById(R.id.uik_public_menu_fl);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height += ScreenUtils.dip2px(this.mActivity.get(), 20.0f);
                findViewById.setLayoutParams(layoutParams);
                this.isShareMenuShown = true;
            }
            this.popupContentView.findViewById(R.id.uik_view_split_1).setVisibility(0);
            this.popupContentView.findViewById(R.id.uik_public_menu_title).setVisibility(0);
        } else {
            this.popupContentView.findViewById(R.id.uik_view_split_1).setVisibility(8);
            this.popupContentView.findViewById(R.id.uik_public_menu_title).setVisibility(8);
            if (!this.isShareMenuShown) {
                return;
            }
            View findViewById2 = this.popupContentView.findViewById(R.id.uik_public_menu_fl);
            ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
            layoutParams2.height -= ScreenUtils.dip2px(this.mActivity.get(), 20.0f);
            findViewById2.setLayoutParams(layoutParams2);
            this.isShareMenuShown = false;
        }
    }

    private void init() {
        int i;
        Activity activity = this.mActivity.get();
        if (activity == null) {
            return;
        }
        Configuration configuration = activity.getResources().getConfiguration();
        if (this.mPopupMenu != null && configuration.orientation == this.orientation) {
            return;
        }
        this.orientation = configuration.orientation;
        if (this.orientation == 2) {
            i = R.layout.uik_public_menu_panel_land;
        } else {
            i = R.layout.uik_public_menu_panel;
        }
        this.popupContentView = activity.getLayoutInflater().inflate(i, (ViewGroup) null);
        this.panelView = this.popupContentView.findViewById(R.id.uik_menu_panel_rl);
        this.floatingLayer = this.popupContentView.findViewById(R.id.uik_menu_panel_view);
        this.floatingLayer.setContentDescription(b.a(R.string.taobao_app_1012_1_16469));
        if (this.orientation == 2) {
            ((CustomiseScrollView) this.popupContentView.findViewById(R.id.uik_menu_scroll_view)).setMaxHeight(NavigationBarUtils.getContentHeight(activity));
        }
        this.floatingLayer.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: com.taobao.uikit.actionbar.PublicMenuV3.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -1877873384) {
                    super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfo) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9011ed18", new Object[]{this, view, accessibilityNodeInfo});
                    return;
                }
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClickable(true);
            }
        });
        this.floatingLayer.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.uikit.actionbar.PublicMenuV3.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    PublicMenuV3.access$200(PublicMenuV3.this);
                }
            }
        });
        this.mPopupMenu = new PopupWindow(this.popupContentView, -1, -1, true);
        this.mPopupMenu.setOutsideTouchable(true);
        try {
            Field declaredField = PopupWindow.class.getDeclaredField("mLayoutInScreen");
            declaredField.setAccessible(true);
            declaredField.set(this.mPopupMenu, true);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
        initView();
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        initRecyclerView();
        initMenuPanel();
    }

    private void initRecyclerViewInner(PublicMenuAdapterV2 publicMenuAdapterV2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6a953c", new Object[]{this, publicMenuAdapterV2, new Integer(i)});
            return;
        }
        Activity activity = this.mActivity.get();
        FrameLayout frameLayout = (FrameLayout) this.popupContentView.findViewById(i);
        if (publicMenuAdapterV2 == null || publicMenuAdapterV2.getItemCount() == 0 || activity == null || frameLayout == null || frameLayout.getChildCount() != 0) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(activity).inflate(R.layout.uik_public_menu_panel_recycler_view, (ViewGroup) null);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(activity);
        wrapContentLinearLayoutManager.setOrientation(0);
        recyclerView.setLayoutManager(wrapContentLinearLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(publicMenuAdapterV2);
        recyclerView.addItemDecoration(new PublicMenuAdapterV2.SpacesItemDecoration(activity.getResources()));
        RecyclerView.OnScrollListener onScrollListener = publicMenuAdapterV2.getOnScrollListener();
        if (onScrollListener != null) {
            recyclerView.addOnScrollListener(onScrollListener);
        }
        frameLayout.addView(recyclerView);
    }

    private void dismiss() {
        Activity activity;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (this.isDismissing || this.mActivity.get() == null) {
            String str3 = "isDismissing: " + this.isDismissing;
            if (this.mActivity.get() != null) {
                str = str3 + " activity:" + activity.getClass();
            } else {
                str = str3 + " activity is null.";
            }
            if (this.mPopupMenu == null) {
                str2 = str + " mPopupMenu is null.";
            } else {
                str2 = str + " mPopupMenu is showing.";
            }
            MenuMonitor.countFailed("menu_dismiss_failed_v3", str2);
        } else if (this.mPopupMenu == null) {
        } else {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.mActivity.get(), R.anim.uik_public_menu_panel_bottom_out);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.uikit.actionbar.PublicMenuV3.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    PublicMenuV3.access$002(PublicMenuV3.this, false);
                    MenuMonitor.countSucceed("end_dismiss_animation_v3");
                    PublicMenuV3.access$300(PublicMenuV3.this).dismiss();
                }
            });
            this.isDismissing = true;
            this.panelView.startAnimation(loadAnimation);
            MenuMonitor.countSucceed("start_dismiss_animation_3");
            doBackground(0.0f);
        }
    }

    private void doBackground(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609bcfa0", new Object[]{this, new Float(f)});
        } else {
            this.floatingLayer.animate().alpha(f).setDuration(300L).start();
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBaseView
    public void registerOnDismissListener(MenuContract.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6aca40", new Object[]{this, onDismissListener});
        } else {
            this.mOnDismissListener = onDismissListener;
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBaseView
    public void notifyMenuChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907ec3d3", new Object[]{this});
            return;
        }
        if (this.popupContentView != null) {
            initView();
        }
        for (int i = 0; i < this.mMenuAdapters.size(); i++) {
            this.mMenuAdapters.get(i).notifyDataSetChanged();
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBaseView
    public void show(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde08a02", new Object[]{this, tBActionView});
        } else {
            showPopupMenu(tBActionView);
        }
    }

    @Override // com.taobao.uikit.actionbar.MenuContract.ActionBarBaseView
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            dismiss();
        }
    }
}
