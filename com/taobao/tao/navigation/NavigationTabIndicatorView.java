package com.taobao.tao.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.view.GestureDetectorCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.view.IconForegroundImageView;
import com.taobao.tao.util.TBSoundPlayer;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.Map;
import tb.omo;
import tb.omp;
import tb.omr;

/* loaded from: classes.dex */
public class NavigationTabIndicatorView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String TAG;
    private boolean mAttached;
    public long mClickTime;
    public Object mContentSelected;
    public Object mContentUnSelected;
    private boolean mForegroundViewShowWhenSelected;
    private final GestureDetectorCompat mGestureDetectorCompat;
    private View mIconForegroundView;
    public NavigationTabIconSourceType mIconSourceType;
    private TUrlImageView mIconView;
    public boolean mIsShowTitleSelected;
    public boolean mIsShowTitleUnSelected;
    public String mMessage;
    private TextView mMessageView;
    private Integer mMessageViewColor;
    public NavigationTabMsgMode mMode;
    private g mNavigationTab;
    private h mNavigationTabListener;
    private boolean mRoundImage;
    private boolean mSelected;
    private Integer mSelectedColorFilter;
    public Drawable mSelectedDrawable;
    private boolean mShowTitle;
    public TBFragmentTabHost mTabHost;
    public int mTextColorSelected;
    public int mTextColorUnSelected;
    private String mTitle;
    private TextView mTitleView;
    public Drawable mUnSelectedDrawable;
    private Integer mUnselectedColorFilter;
    public b tabIndicatorViewAbilityCallback;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes8.dex */
    public interface b {
        void a(g gVar);

        void a(g gVar, String str);

        void b(g gVar);

        void b(g gVar, String str);

        void c(g gVar);

        void d(g gVar);
    }

    public static /* synthetic */ Object ipc$super(NavigationTabIndicatorView navigationTabIndicatorView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode == -349229044) {
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            } else if (hashCode != 1626033557) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onAttachedToWindow();
                return null;
            }
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public static /* synthetic */ String access$000(NavigationTabIndicatorView navigationTabIndicatorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("22fa4828", new Object[]{navigationTabIndicatorView}) : navigationTabIndicatorView.mTitle;
    }

    public static /* synthetic */ g access$100(NavigationTabIndicatorView navigationTabIndicatorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7176447e", new Object[]{navigationTabIndicatorView}) : navigationTabIndicatorView.mNavigationTab;
    }

    public static /* synthetic */ h access$200(NavigationTabIndicatorView navigationTabIndicatorView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("5a7e099e", new Object[]{navigationTabIndicatorView}) : navigationTabIndicatorView.mNavigationTabListener;
    }

    public NavigationTabIndicatorView(Context context) {
        this(context, null);
    }

    public NavigationTabIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public NavigationTabIndicatorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "NavTabIndicatorView";
        this.mMode = NavigationTabMsgMode.DEFAULT;
        this.mIconSourceType = NavigationTabIconSourceType.DRAWABLE;
        this.mTitle = null;
        this.mSelected = false;
        this.mMessage = null;
        this.mContentUnSelected = 0;
        this.mContentSelected = 0;
        this.mSelectedDrawable = null;
        this.mUnSelectedDrawable = null;
        this.mTextColorUnSelected = 0;
        this.mTextColorSelected = 0;
        this.mIsShowTitleSelected = true;
        this.mIsShowTitleUnSelected = true;
        this.mForegroundViewShowWhenSelected = true;
        this.mTitleView = null;
        this.mShowTitle = false;
        this.mAttached = false;
        this.mRoundImage = false;
        setMinimumHeight((int) (context.getResources().getDisplayMetrics().density * 48.0f));
        setMinimumWidth((int) (context.getResources().getDisplayMetrics().density * 48.0f));
        ensureHierarchy(context);
        this.mGestureDetectorCompat = new GestureDetectorCompat(getContext(), new a());
        setBackgroundColor(ResourcesCompat.getColor(getResources(), 17170445, null));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.mGestureDetectorCompat.onTouchEvent(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    private Drawable getIconDrawable(boolean z) {
        Drawable w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("cd012d1a", new Object[]{this, new Boolean(z)});
        }
        if (this.mIconSourceType == NavigationTabIconSourceType.DRAWABLE && (this.mContentSelected instanceof Integer) && (this.mContentUnSelected instanceof Integer)) {
            w = z ? this.mSelectedDrawable : this.mUnSelectedDrawable;
        } else if (this.mIconSourceType != NavigationTabIconSourceType.LOCALCACHEDDRAWABLE || this.mNavigationTab.w() == null || this.mNavigationTab.x() == null) {
            return null;
        } else {
            w = z ? this.mNavigationTab.w() : this.mNavigationTab.x();
        }
        return w;
    }

    private void setDrawableColorFilterInner(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc2fda72", new Object[]{this, new Boolean(z)});
            return;
        }
        Drawable iconDrawable = getIconDrawable(z);
        if (iconDrawable == null) {
            return;
        }
        Integer num = z ? this.mSelectedColorFilter : this.mUnselectedColorFilter;
        iconDrawable.setColorFilter(num == null ? null : new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_ATOP));
    }

    public void setUnselectedDrawableColorFilter(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a295b89", new Object[]{this, num});
            return;
        }
        this.mUnselectedColorFilter = num;
        setDrawableColorFilterInner(false);
    }

    public void setSelectedDrawableColorFilter(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ccafdb0", new Object[]{this, num});
            return;
        }
        this.mSelectedColorFilter = num;
        setDrawableColorFilterInner(true);
    }

    private void ensureHierarchy(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cef7cea", new Object[]{this, context});
            return;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        this.mIconView = new TUrlImageView(context);
        int i = (int) (52.0f * f);
        this.mIconView.setMinimumHeight(i);
        this.mIconView.setMinimumWidth(i);
        this.mIconView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        this.mIconView.setVisibility(0);
        layoutParams.gravity = 81;
        addView(this.mIconView, layoutParams);
        this.mTitleView = new TextView(context);
        this.mTitleView.setGravity(1);
        this.mTitleView.setTextColor(Color.parseColor("#444444"));
        this.mTitleView.setTextSize(1, 10.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) (f * 2.0f);
        addView(this.mTitleView, layoutParams2);
        this.mMessageView = new TextView(context);
        this.mMessageView.setGravity(17);
        this.mMessageView.setTextColor(getResources().getColor(17170443));
        this.mMessageView.setTextSize(1, 11.0f);
        updateMessageViewVisibility(false);
        this.mMessageView.setSingleLine(true);
        this.mMessageView.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(this.mMessageView, layoutParams3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.mAttached = true;
        if (e.c() != null) {
            if (this.mNavigationTab.o() == e.c().getCurrentTab()) {
                z = true;
            }
            this.mSelected = z;
        }
        updateStyleInternal();
    }

    public void setNavigationTabListener(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e198563a", new Object[]{this, hVar});
        } else {
            this.mNavigationTabListener = hVar;
        }
    }

    public void setForegroundView(IconForegroundImageView iconForegroundImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bbb132b", new Object[]{this, iconForegroundImageView});
        } else {
            setForegroundView(iconForegroundImageView, false);
        }
    }

    public void setForegroundView(View view, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bc3fdd", new Object[]{this, view, new Boolean(z), str});
            return;
        }
        if (str != null) {
            this.mNavigationTab.A = str;
        }
        setForegroundView(view, z);
    }

    public void setForegroundView(View view, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6184d3", new Object[]{this, view, new Boolean(z)});
            return;
        }
        if (view != null) {
            this.tabIndicatorViewAbilityCallback.b(this.mNavigationTab);
        } else {
            b bVar = this.tabIndicatorViewAbilityCallback;
            g gVar = this.mNavigationTab;
            bVar.a(gVar, gVar.A);
            this.mNavigationTab.A = null;
        }
        View view2 = this.mIconForegroundView;
        if (view2 != null && view2.getParent() != null && (this.mIconForegroundView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.mIconForegroundView.getParent()).removeView(this.mIconForegroundView);
        }
        this.mIconForegroundView = view;
        this.mForegroundViewShowWhenSelected = z;
        View view3 = this.mIconForegroundView;
        if (view3 != null && view3.getParent() == null) {
            View view4 = this.mIconForegroundView;
            if ((view4 instanceof IconForegroundImageView) && ((IconForegroundImageView) view4).isClip) {
                int i = (int) (getContext().getResources().getDisplayMetrics().density * 48.0f);
                this.mIconForegroundView.setMinimumHeight(i);
                this.mIconForegroundView.setMinimumWidth(i);
                ((IconForegroundImageView) this.mIconForegroundView).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                layoutParams = new FrameLayout.LayoutParams(i, i);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams.gravity = 81;
            addView(this.mIconForegroundView, 2, layoutParams);
        }
        updateIndicatorView();
    }

    private void clickEvent(g gVar) {
        g gVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a18d3c", new Object[]{this, gVar});
        } else if (!getSelected()) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.navigation.NavigationTabIndicatorView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TBSoundPlayer.getInstance().playScene(1);
                    }
                }
            });
            if (gVar == null || !(getContext() instanceof Activity)) {
                return;
            }
            b bVar = this.tabIndicatorViewAbilityCallback;
            if (bVar != null && (gVar2 = this.mNavigationTab) != null) {
                bVar.a(gVar2);
            }
            TBFragmentTabHost tBFragmentTabHost = this.mTabHost;
            if (tBFragmentTabHost == null) {
                return;
            }
            com.taobao.tao.navigation.a.a(tBFragmentTabHost.getCurrentFragment(), "CLICK_TIME", this.mClickTime);
        } else {
            h hVar = this.mNavigationTabListener;
            if (hVar != null) {
                hVar.onCurrentTabClicked();
            }
            View view = this.mIconForegroundView;
            if (view == null) {
                return;
            }
            view.performClick();
        }
    }

    public void resetGuardianForegroundView() {
        b bVar;
        b bVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f3f72f", new Object[]{this});
            return;
        }
        if (this.mMode == NavigationTabMsgMode.GUARDIAN_NUM || this.mMode == NavigationTabMsgMode.GUARDIAN_TEXT) {
            View view = this.mIconForegroundView;
            if ((view == null || view.getVisibility() != 0) && (bVar = this.tabIndicatorViewAbilityCallback) != null) {
                bVar.d(this.mNavigationTab);
            }
            updateMessage(NavigationTabMsgMode.NONE, "0");
        }
        View view2 = this.mIconForegroundView;
        if (!(view2 instanceof IconForegroundImageView)) {
            return;
        }
        if (view2.getVisibility() == 0 && (bVar2 = this.tabIndicatorViewAbilityCallback) != null) {
            bVar2.d(this.mNavigationTab);
        }
        setForegroundView(null);
    }

    private void sendUt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2032214e", new Object[]{this});
            return;
        }
        g gVar = this.mNavigationTab;
        if (gVar != null && gVar.i() != null) {
            Map<String, String> i = this.mNavigationTab.i();
            if (!TextUtils.isEmpty(i.get("pageName")) && !TextUtils.isEmpty(i.get("controlName"))) {
                UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(i.get("pageName"), i.get("controlName"));
                uTControlHitBuilder.setProperty("spm", this.mNavigationTab.h().get("spm-url"));
                UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
            }
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.tao.navigation.NavigationTabIndicatorView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    omr.a("tab_click", NavigationTabIndicatorView.access$000(NavigationTabIndicatorView.this));
                }
            }
        });
    }

    public void onClickEvent(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bd51dd", new Object[]{this, gVar});
            return;
        }
        TLog.loge(com.taobao.tao.navigation.a.a(), "NavTabIndicatorView", "new click event");
        clickEvent(gVar);
        resetGuardianForegroundView();
        sendUt();
    }

    private void updateTitleView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88c4d8db", new Object[]{this});
            return;
        }
        if (!TextUtils.isEmpty(this.mTitle)) {
            this.mTitleView.setText(this.mTitle);
            setContentDescription(this.mTitle);
        }
        int i = 8;
        if (this.mShowTitle) {
            if (this.mSelected) {
                TextView textView = this.mTitleView;
                if (this.mIsShowTitleSelected) {
                    i = 0;
                }
                textView.setVisibility(i);
                this.mTitleView.setSelected(true);
                return;
            }
            TextView textView2 = this.mTitleView;
            if (this.mIsShowTitleUnSelected) {
                i = 0;
            }
            textView2.setVisibility(i);
            this.mTitleView.setSelected(false);
            return;
        }
        this.mTitleView.setVisibility(8);
    }

    private void updateForegroundView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b473b8", new Object[]{this});
            return;
        }
        View view = this.mIconForegroundView;
        if (view == null) {
            return;
        }
        if (this.mSelected) {
            if (this.mForegroundViewShowWhenSelected) {
                view.setVisibility(0);
            } else {
                view.setVisibility(4);
            }
        } else if (this.mForegroundViewShowWhenSelected) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
    }

    private void updateIconView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb4a3ae", new Object[]{this});
            return;
        }
        View view = this.mIconForegroundView;
        if (view == null) {
            this.mIconView.setVisibility(0);
        } else if (view.getVisibility() == 0) {
            this.mIconView.setVisibility(4);
        } else if (this.mIconForegroundView.getVisibility() != 4) {
        } else {
            this.mIconView.setVisibility(0);
        }
    }

    private void updateIndicatorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8c91a12", new Object[]{this});
            return;
        }
        updateForegroundView();
        updateIconView();
        updateTitleView();
    }

    public void setSelect(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd82eec5", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!this.mAttached) {
            this.mSelected = z;
        } else if (this.mSelected == z && !z2) {
        } else {
            this.mSelected = z;
            updateIndicatorView();
            this.mIconView.setSelected(this.mSelected);
        }
    }

    public boolean getSelected() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f84d441c", new Object[]{this})).booleanValue() : this.mSelected;
    }

    private void updateMessageView(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e052679", new Object[]{this, new Integer(i)});
        } else if (this.mMessageViewColor == null) {
            this.mMessageView.setBackgroundResource(i);
        } else {
            Drawable a2 = omo.a(getContext(), i, this.mMessageViewColor.intValue());
            if (a2 != null) {
                this.mMessageView.setBackground(a2);
            } else {
                this.mMessageView.setBackgroundResource(i);
            }
        }
    }

    public void updateMessageViewColor(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714c9030", new Object[]{this, num});
            return;
        }
        this.mMessageViewColor = num;
        this.mNavigationTab.a(num);
    }

    public void updateMessage(NavigationTabMsgMode navigationTabMsgMode, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aab202a", new Object[]{this, navigationTabMsgMode, str, str2});
            return;
        }
        if (str2 != null) {
            this.mNavigationTab.B = str2;
        }
        updateMessage(navigationTabMsgMode, str);
    }

    public void updateMessage(NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b358ce60", new Object[]{this, navigationTabMsgMode, str});
            return;
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.DEFAULT) {
            navigationTabMsgMode = NavigationTabMsgMode.GUARDIAN_DEFAULT;
        }
        this.mNavigationTab.e(str);
        this.mNavigationTab.a(navigationTabMsgMode);
        updateMessageMode(navigationTabMsgMode, str);
        if (this.tabIndicatorViewAbilityCallback != null) {
            if (this.mMode == NavigationTabMsgMode.NONE) {
                b bVar = this.tabIndicatorViewAbilityCallback;
                g gVar = this.mNavigationTab;
                bVar.b(gVar, gVar.B);
                this.mNavigationTab.B = null;
            } else {
                this.tabIndicatorViewAbilityCallback.c(this.mNavigationTab);
            }
        }
        updateMessageView();
    }

    private void updateMessageViewVisibility(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e625618", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.mMessageView.setVisibility(0);
        } else {
            this.mMessageView.setVisibility(8);
        }
    }

    private void updateMessageMode(NavigationTabMsgMode navigationTabMsgMode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83ed6e3", new Object[]{this, navigationTabMsgMode, str});
            return;
        }
        switch (navigationTabMsgMode) {
            case TEXT:
            case GUARDIAN_TEXT:
                if (TextUtils.isEmpty(str)) {
                    navigationTabMsgMode = NavigationTabMsgMode.NONE;
                    break;
                }
                break;
            case RED_POINT_INDICATOR:
                if (TextUtils.isEmpty(str) || "0".equals(str)) {
                    navigationTabMsgMode = NavigationTabMsgMode.NONE;
                    break;
                }
                break;
            case DEFAULT:
            case GUARDIAN_DEFAULT:
            case GUARDIAN_NUM:
                if (str == null) {
                    NavigationTabMsgMode navigationTabMsgMode2 = NavigationTabMsgMode.NONE;
                    Log.e("NavTabIndicatorView", "updateMessageMode: message is null but messageMode is " + navigationTabMsgMode + ", set to NONE");
                    navigationTabMsgMode = navigationTabMsgMode2;
                    break;
                } else if (Integer.parseInt(str) < 0) {
                    navigationTabMsgMode = NavigationTabMsgMode.NONE;
                    break;
                }
                break;
            default:
                navigationTabMsgMode = NavigationTabMsgMode.NONE;
                break;
        }
        this.mMode = navigationTabMsgMode;
        this.mMessage = str;
    }

    public void updateMessageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17c05ca", new Object[]{this});
            return;
        }
        float f = getContext().getResources().getDisplayMetrics().density;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mMessageView.getLayoutParams();
        this.mMessageView.setTextSize(1, 11.0f);
        switch (this.mMode) {
            case TEXT:
            case GUARDIAN_TEXT:
                updateMessageViewVisibility(true ^ TextUtils.isEmpty(this.mMessage));
                updateMessageView(R.drawable.uik_navigation_message_more_bg);
                this.mMessageView.setText(this.mMessage);
                layoutParams.gravity = 17;
                layoutParams.width = -2;
                layoutParams.height = (int) (18.0f * f);
                layoutParams.leftMargin = (int) (15.0f * f);
                layoutParams.bottomMargin = (int) (f * 10.0f);
                this.mMessageView.setLayoutParams(layoutParams);
                this.mMessageView.setPadding(12, 0, 12, 0);
                break;
            case RED_POINT_INDICATOR:
                if (TextUtils.isEmpty(this.mMessage) || "0".equals(this.mMessage)) {
                    updateMessageViewVisibility(false);
                    break;
                } else {
                    updateMessageView(R.drawable.uik_navigation_message_dot_bg);
                    this.mMessageView.setText("");
                    int i = (int) (10.0f * f);
                    layoutParams.width = i;
                    layoutParams.height = i;
                    layoutParams.leftMargin = (int) (11.0f * f);
                    layoutParams.bottomMargin = (int) (f * 14.0f);
                    layoutParams.gravity = 17;
                    this.mMessageView.setLayoutParams(layoutParams);
                    updateMessageViewVisibility(true);
                    this.mMessageView.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
            case DEFAULT:
            case GUARDIAN_DEFAULT:
            case GUARDIAN_NUM:
                int parseInt = Integer.parseInt(this.mMessage);
                if (parseInt <= 99) {
                    if (parseInt < 10) {
                        if (parseInt > 0) {
                            updateMessageView(R.drawable.uik_navigation_message_dot_bg);
                            this.mMessageView.setText(String.valueOf(parseInt));
                            updateMessageViewVisibility(true);
                            int i2 = (int) (20.0f * f);
                            layoutParams.width = i2;
                            layoutParams.height = i2;
                            layoutParams.leftMargin = (int) (18.0f * f);
                            layoutParams.bottomMargin = (int) (f * 10.0f);
                            layoutParams.gravity = 17;
                            this.mMessageView.setLayoutParams(layoutParams);
                            this.mMessageView.setPadding(0, 0, 0, 0);
                            break;
                        } else {
                            updateMessageViewVisibility(false);
                            break;
                        }
                    } else {
                        updateMessageView(R.drawable.uik_navigation_message_more_bg);
                        this.mMessageView.setText(String.valueOf(parseInt));
                        updateMessageViewVisibility(true);
                        layoutParams.width = (int) (24.0f * f);
                        layoutParams.height = (int) (20.0f * f);
                        layoutParams.leftMargin = (int) (15.0f * f);
                        layoutParams.bottomMargin = (int) (f * 9.0f);
                        layoutParams.gravity = 17;
                        this.mMessageView.setLayoutParams(layoutParams);
                        this.mMessageView.setPadding(10, 0, 10, 0);
                        break;
                    }
                } else {
                    this.mMessageView.setText("99+");
                    updateMessageView(R.drawable.uik_navigation_message_more_bg);
                    updateMessageViewVisibility(true);
                    layoutParams.gravity = 17;
                    layoutParams.width = -2;
                    layoutParams.height = (int) (18.0f * f);
                    layoutParams.leftMargin = (int) (15.0f * f);
                    layoutParams.bottomMargin = (int) (f * 10.0f);
                    this.mMessageView.setLayoutParams(layoutParams);
                    this.mMessageView.setPadding(12, 0, 12, 0);
                    break;
                }
            case NONE:
                updateMessageViewVisibility(false);
                break;
        }
        h hVar = this.mNavigationTabListener;
        if (hVar == null) {
            return;
        }
        hVar.onNavigationTabMessageChanged(this.mMessage);
    }

    public void updateStyle(g gVar, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c3cd70e", new Object[]{this, gVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (!gVar.q()) {
        } else {
            this.mNavigationTab = gVar;
            this.mShowTitle = z;
            this.mSelected = z2;
            if (!z3) {
                return;
            }
            updateStyleInternal();
        }
    }

    private void updateStyleInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7019a74c", new Object[]{this});
        } else if (!this.mAttached || !this.mNavigationTab.q()) {
        } else {
            this.mContentUnSelected = this.mNavigationTab.d().first;
            this.mContentSelected = this.mNavigationTab.d().second;
            this.mTextColorUnSelected = this.mNavigationTab.a();
            this.mTextColorSelected = this.mNavigationTab.b();
            this.mIsShowTitleSelected = this.mNavigationTab.f();
            this.mIsShowTitleUnSelected = this.mNavigationTab.g();
            this.mIconSourceType = this.mNavigationTab.n();
            this.mTitle = this.mNavigationTab.c();
            this.mRoundImage = this.mNavigationTab.u();
            this.mMessageViewColor = this.mNavigationTab.p();
            if (this.mIconView != null) {
                updateIconStyle();
            }
            if (this.mTitleView != null) {
                updateTitleStyle();
            }
            setSelect(this.mSelected, true);
            updateMessageMode(this.mNavigationTab.l(), this.mNavigationTab.m());
            updateMessageView();
        }
    }

    private void updateIconStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340082f6", new Object[]{this});
            return;
        }
        this.mIconView.setSkipAutoSize(this.mNavigationTab.r());
        float f = getContext().getResources().getDisplayMetrics().density;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mIconView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        if (this.mRoundImage) {
            int i = (int) (40.0f * f);
            layoutParams.width = i;
            layoutParams.height = i;
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = (int) (f * 4.0f);
            this.mIconView.setMinimumHeight(i);
            this.mIconView.setMinimumWidth(i);
            this.mIconView.setLayoutParams(layoutParams);
        } else {
            int i2 = (int) (f * 52.0f);
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.mIconView.setMinimumHeight(i2);
            this.mIconView.setMinimumWidth(i2);
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = 0;
            this.mIconView.setLayoutParams(layoutParams);
        }
        loadImage();
        setDrawableColorFilterInner(false);
    }

    public void preloadDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657a82ce", new Object[]{this});
            return;
        }
        g gVar = this.mNavigationTab;
        if (gVar == null || gVar.n() != NavigationTabIconSourceType.DRAWABLE) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "NavTabIndicatorView", "preload failed, navigation is null or icon type is not drawable");
            return;
        }
        Pair d = this.mNavigationTab.d();
        if (d == null) {
            TLog.loge(com.taobao.tao.navigation.a.a(), "NavTabIndicatorView", "preload failed, icon is null");
        } else if ((d.first instanceof Integer) && (d.second instanceof Integer)) {
            omp.a(getResources(), ((Integer) d.first).intValue(), null);
            omp.a(getResources(), ((Integer) d.second).intValue(), null);
        } else {
            TLog.loge(com.taobao.tao.navigation.a.a(), "NavTabIndicatorView", "preload failed, icon is not instanceof integer");
        }
    }

    private void loadLocalImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a83377bd", new Object[]{this});
            return;
        }
        this.mSelectedDrawable = this.mNavigationTab.w();
        this.mUnSelectedDrawable = this.mNavigationTab.x();
        if (this.mRoundImage) {
            makeRoundIcon();
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, this.mSelectedDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, this.mUnSelectedDrawable);
        this.mIconView.setBackgroundDrawable(stateListDrawable);
    }

    private void loadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad861c", new Object[]{this});
        } else if (this.mIconSourceType == NavigationTabIconSourceType.DRAWABLE2 && this.mNavigationTab.w() != null && this.mNavigationTab.x() != null) {
            loadLocalImage();
        } else if (this.mIconSourceType == NavigationTabIconSourceType.DRAWABLE && (this.mContentSelected instanceof Integer) && (this.mContentUnSelected instanceof Integer)) {
            if (f.b(getContext())) {
                this.mSelectedDrawable = omp.b(getResources(), ((Integer) this.mContentSelected).intValue(), null);
                this.mUnSelectedDrawable = omp.b(getResources(), ((Integer) this.mContentUnSelected).intValue(), null);
            } else {
                this.mSelectedDrawable = getResources().getDrawable(((Integer) this.mContentSelected).intValue());
                this.mUnSelectedDrawable = getResources().getDrawable(((Integer) this.mContentUnSelected).intValue());
            }
            if (this.mRoundImage) {
                makeRoundIcon();
            }
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, this.mSelectedDrawable);
            stateListDrawable.addState(StateSet.WILD_CARD, this.mUnSelectedDrawable);
            this.mIconView.setBackgroundDrawable(stateListDrawable);
        } else if (this.mIconSourceType == NavigationTabIconSourceType.LOCALCACHEDDRAWABLE && this.mNavigationTab.w() != null && this.mNavigationTab.x() != null) {
            loadLocalImage();
        } else {
            Log.e("NavTabIndicatorView", "Navigation icon type not write, please check!");
        }
    }

    private void makeRoundIcon() {
        Drawable drawable;
        Drawable drawable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6940e0", new Object[]{this});
        } else if (!this.mRoundImage || (drawable = this.mSelectedDrawable) == null || (drawable2 = this.mUnSelectedDrawable) == null || !(drawable instanceof BitmapDrawable) || !(drawable2 instanceof BitmapDrawable)) {
        } else {
            this.mSelectedDrawable = RoundedBitmapDrawableFactory.create(getResources(), ((BitmapDrawable) this.mSelectedDrawable).getBitmap());
            ((RoundedBitmapDrawable) this.mSelectedDrawable).setCircular(true);
            this.mUnSelectedDrawable = RoundedBitmapDrawableFactory.create(getResources(), ((BitmapDrawable) this.mUnSelectedDrawable).getBitmap());
            ((RoundedBitmapDrawable) this.mUnSelectedDrawable).setCircular(true);
        }
    }

    private void updateTitleStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bf6f369", new Object[]{this});
        } else {
            this.mTitleView.setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[0]}, new int[]{this.mTextColorSelected, this.mTextColorUnSelected}));
        }
    }

    /* loaded from: classes.dex */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 1575121015) {
                return new Boolean(super.onSingleTapUp((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5de27077", new Object[]{this, motionEvent})).booleanValue();
            }
            NavigationTabIndicatorView.this.mClickTime = SystemClock.uptimeMillis();
            if (NavigationTabIndicatorView.this.tabIndicatorViewAbilityCallback != null && NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this);
            }
            if (NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView navigationTabIndicatorView = NavigationTabIndicatorView.this;
                navigationTabIndicatorView.onClickEvent(NavigationTabIndicatorView.access$100(navigationTabIndicatorView));
            }
            return super.onSingleTapUp(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                return;
            }
            if (NavigationTabIndicatorView.this.tabIndicatorViewAbilityCallback != null && NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this);
            }
            if (NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this) == null) {
                return;
            }
            NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this).onCurrentTabLongClicked();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
            }
            if (NavigationTabIndicatorView.this.tabIndicatorViewAbilityCallback != null && NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this);
            }
            if (NavigationTabIndicatorView.this.getSelected()) {
                if (NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this) != null) {
                    NavigationTabIndicatorView.access$200(NavigationTabIndicatorView.this).onCurrentTabDoubleTap();
                }
            } else if (NavigationTabIndicatorView.access$100(NavigationTabIndicatorView.this) != null) {
                NavigationTabIndicatorView navigationTabIndicatorView = NavigationTabIndicatorView.this;
                navigationTabIndicatorView.onClickEvent(NavigationTabIndicatorView.access$100(navigationTabIndicatorView));
            }
            return true;
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        updateStyleInternal();
    }
}
