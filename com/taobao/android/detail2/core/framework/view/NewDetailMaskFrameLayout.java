package com.taobao.android.detail2.core.framework.view;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;
import java.util.ArrayList;
import java.util.Iterator;
import tb.akt;
import tb.fpz;
import tb.kge;
import tb.qxo;
import tb.sfc;

/* loaded from: classes5.dex */
public class NewDetailMaskFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int CHECK_ACTIVITY_TIME = 800;
    public static final int DEFAULT_AUTO_ADAPTER_ANIM_DURATION_SPEED = 1;
    public static final int DEFAULT_AUTO_DEVICE_DURATION_MULTIPLIER = -2;
    public static final int DEFAULT_FRAME_SPEED_AVG_CHECK_COUNT = 3;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_MAX_VALUE = 460;
    public static final int DEFAULT_MASK_AUTO_ADAPTER_MIN_FRAME_TIME = 17;
    public static final int DEFAULT_VALUE_MASK_FRAME_ANIM_DURATION = 280;
    public static final String KEY_EXTRA_AUTO_ADAPTER_SPEED = "extraAutoAdapterSpeed";
    public static final String KEY_EXTRA_PRE_BOTTOM_BAR_COLOR = "extraPreBottomBarColor";
    private static int sFrameSpeedAvgCheckCount;
    private static long sFrameSpeedAvgDuration;
    private static long sFrameSpeedCheckStartTime;
    private static long sFrameSpeedLastTokenTime;
    private Activity mActivity;
    private Bundle mActivityBundle;
    private Context mContext;
    private int mCurrentPageBottomBarColor;
    private boolean mDetachedFromWindow;
    private int mDeviceScore;
    private int mFrozenCountDown;
    private int mFrozenLayoutCount;
    private int mFrozenOutLayoutCount;
    private Handler mHandler;
    private boolean mHasCatchException;
    private boolean mHasConvertActivityFromTranslucent;
    private boolean mHasConvertActivityToTranslucent;
    private boolean mHasFrozenOuterSuccessLayout;
    private boolean mHasSetBottomBarColor;
    private boolean mHasSetMaskViewFullAlpha;
    private boolean mHasSetRootViewFullAlpha;
    private boolean mHasSetScaleImageViewZeroAlpha;
    private boolean mHasShowAnim;
    private float mImageViewScreenStartX;
    private float mImageViewScreenStartY;
    private float mImageViewStartHeight;
    private float mImageViewStartLeftMargin;
    private float mImageViewStartTopMargin;
    private float mImageViewStartWidth;
    private boolean mIsDestroy;
    private View mItemWhiteHolderView;
    private ImageView mMainViewHolderIv;
    private View mMaskView;
    private d mNewDetailMaskFrameLayoutContext;
    private FrameLayout mParentFrameLayout;
    private float mRootLayoutRealStartPreProcess;
    private float mRootLayoutRealStartProcess;
    private ImageView mScaleImageView;
    private int mScreenHeight;
    private int mScreenWidth;

    static {
        kge.a(1482712132);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        }
    }

    private void initTargetSizeForV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5838deea", new Object[]{this});
        }
    }

    public static /* synthetic */ Object ipc$super(NewDetailMaskFrameLayout newDetailMaskFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$1000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1a2617", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.checkAndTryConvertActivityFromTranslucent();
        }
    }

    public static /* synthetic */ void access$1100(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0d8bf6", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.checkAndTryProcessDelayTask();
        }
    }

    public static /* synthetic */ d access$1200(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b29030c2", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext;
    }

    public static /* synthetic */ void access$1400(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e7bd93", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.resumeNoneCoreLayout();
        }
    }

    public static /* synthetic */ void access$1500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1db2372", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.resumeOuterNoneCoreLayout();
        }
    }

    public static /* synthetic */ boolean access$1600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfce8955", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.isV2Version();
    }

    public static /* synthetic */ long access$2100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e2b25cba", new Object[0])).longValue() : sFrameSpeedLastTokenTime;
    }

    public static /* synthetic */ long access$2200() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("179897fb", new Object[0])).longValue() : sFrameSpeedCheckStartTime;
    }

    public static /* synthetic */ long access$2202(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dee490cf", new Object[]{new Long(j)})).longValue();
        }
        sFrameSpeedCheckStartTime = j;
        return j;
    }

    public static /* synthetic */ long access$2300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c7ed33c", new Object[0])).longValue() : sFrameSpeedAvgDuration;
    }

    public static /* synthetic */ long access$2302(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46c5bdae", new Object[]{new Long(j)})).longValue();
        }
        sFrameSpeedAvgDuration = j;
        return j;
    }

    public static /* synthetic */ int access$2406() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("81b99b82", new Object[0])).intValue();
        }
        int i = sFrameSpeedAvgCheckCount - 1;
        sFrameSpeedAvgCheckCount = i;
        return i;
    }

    public static /* synthetic */ boolean access$2500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c2547977", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasCatchException;
    }

    public static /* synthetic */ boolean access$2502(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("968d2c47", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasCatchException = z;
        return z;
    }

    public static /* synthetic */ View access$2600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b0c00714", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.mMaskView;
    }

    public static /* synthetic */ boolean access$2700(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7e3b4535", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetMaskViewFullAlpha;
    }

    public static /* synthetic */ boolean access$2702(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("577fd849", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetMaskViewFullAlpha = z;
        return z;
    }

    public static /* synthetic */ boolean access$2900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a2210f3", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetRootViewFullAlpha;
    }

    public static /* synthetic */ boolean access$2902(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1872844b", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetRootViewFullAlpha = z;
        return z;
    }

    public static /* synthetic */ float access$3000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4d0cd209", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mRootLayoutRealStartProcess;
    }

    public static /* synthetic */ float access$3002(NewDetailMaskFrameLayout newDetailMaskFrameLayout, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("62df9d39", new Object[]{newDetailMaskFrameLayout, new Float(f2)})).floatValue();
        }
        newDetailMaskFrameLayout.mRootLayoutRealStartProcess = f2;
        return f2;
    }

    public static /* synthetic */ float access$3100(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2b0037e8", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mRootLayoutRealStartPreProcess;
    }

    public static /* synthetic */ float access$3102(NewDetailMaskFrameLayout newDetailMaskFrameLayout, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4358f33a", new Object[]{newDetailMaskFrameLayout, new Float(f2)})).floatValue();
        }
        newDetailMaskFrameLayout.mRootLayoutRealStartPreProcess = f2;
        return f2;
    }

    public static /* synthetic */ ImageView access$3200(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("d2965199", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.mScaleImageView;
    }

    public static /* synthetic */ float access$3300(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e6e703a6", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mImageViewStartLeftMargin;
    }

    public static /* synthetic */ float access$3400(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c4da6985", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mImageViewStartTopMargin;
    }

    public static /* synthetic */ boolean access$3500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a2cdcf78", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasFrozenOuterSuccessLayout;
    }

    public static /* synthetic */ boolean access$3502(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c53e9666", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasFrozenOuterSuccessLayout = z;
        return z;
    }

    public static /* synthetic */ int access$3610(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("87ea1787", new Object[]{newDetailMaskFrameLayout})).intValue();
        }
        int i = newDetailMaskFrameLayout.mFrozenCountDown;
        newDetailMaskFrameLayout.mFrozenCountDown = i - 1;
        return i;
    }

    public static /* synthetic */ void access$3700(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb49b32", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.frozenNoneCoreLayout();
        }
    }

    public static /* synthetic */ void access$3800(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ca80111", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.frozenOuterNoneCoreLayout();
        }
    }

    public static /* synthetic */ boolean access$3900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a9b66f4", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetBottomBarColor;
    }

    public static /* synthetic */ void access$4000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d86281a", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.setCurrentBottomBarColor();
        }
    }

    public static /* synthetic */ int access$4102(NewDetailMaskFrameLayout newDetailMaskFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("720a689f", new Object[]{newDetailMaskFrameLayout, new Integer(i)})).intValue();
        }
        newDetailMaskFrameLayout.mFrozenLayoutCount = i;
        return i;
    }

    public static /* synthetic */ int access$4202(NewDetailMaskFrameLayout newDetailMaskFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5283bea0", new Object[]{newDetailMaskFrameLayout, new Integer(i)})).intValue();
        }
        newDetailMaskFrameLayout.mFrozenOutLayoutCount = i;
        return i;
    }

    public static /* synthetic */ c access$4400(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("efecf924", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.getMaskHandler();
    }

    public static /* synthetic */ boolean access$4500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83472579", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetScaleImageViewZeroAlpha;
    }

    public static /* synthetic */ boolean access$4502(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3f00085", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetScaleImageViewZeroAlpha = z;
        return z;
    }

    public static /* synthetic */ Activity access$5300(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("ab52cd05", new Object[]{context}) : getRealActivity(context);
    }

    public static /* synthetic */ boolean access$900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dadd4b41", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.isDestroy();
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private NewDetailMaskFrameLayout f11576a;
        private int b = -1;

        static {
            kge.a(1621006559);
        }

        public boolean D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public int E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3e1da3f", new Object[]{this})).intValue();
            }
            return 12;
        }

        public int F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3eff1c0", new Object[]{this})).intValue();
            }
            return 32;
        }

        public boolean G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean H() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "无极缩放Default";
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
            }
            return 300;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            }
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            }
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Deprecated
        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public float l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6076ee3", new Object[]{this})).floatValue();
            }
            return 0.3f;
        }

        public boolean o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public int p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
            }
            return 0;
        }

        public int q() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue();
            }
            return 460;
        }

        public int r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue();
            }
            return -2;
        }

        public int s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue();
            }
            return 17;
        }

        public boolean t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public int u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
            }
            return 80;
        }

        public int v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue();
            }
            return 92;
        }

        public int w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
            }
            return 10;
        }

        public int x() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6b088f2", new Object[]{this})).intValue();
            }
            return 101;
        }

        public int y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6bea073", new Object[]{this})).intValue();
            }
            return 10;
        }

        public boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public static /* synthetic */ NewDetailMaskFrameLayout a(c cVar, NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NewDetailMaskFrameLayout) ipChange.ipc$dispatch("ea9d23f4", new Object[]{cVar, newDetailMaskFrameLayout});
            }
            cVar.f11576a = newDetailMaskFrameLayout;
            return newDetailMaskFrameLayout;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            } else {
                Log.e(str, str2);
            }
        }

        public void a(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
            } else {
                Log.e(str, str2, th);
            }
        }

        public TimeInterpolator k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("f56ebc94", new Object[]{this}) : new AccelerateDecelerateInterpolator();
        }

        public float m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6158664", new Object[]{this})).floatValue() : dm_() ? 4.0f : 0.3f;
        }

        public float n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de5", new Object[]{this})).floatValue() : dm_() ? 3.0f : 1.8f;
        }

        private boolean dm_() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("693f9e81", new Object[]{this})).booleanValue() : x() == 201;
        }

        public boolean A() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : B();
        }

        public boolean B() {
            NewDetailMaskFrameLayout newDetailMaskFrameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
            }
            if (this.b == -1 && (newDetailMaskFrameLayout = this.f11576a) != null) {
                this.b = newDetailMaskFrameLayout.animItemIsRunning() ? 1 : 0;
            }
            return this.b == 1;
        }

        public boolean C() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3c5ab4e", new Object[]{this})).booleanValue() : !G();
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class a extends b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private long f11574a;

        static {
            kge.a(1290004758);
        }

        public static /* synthetic */ long a(a aVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("86847f6c", new Object[]{aVar})).longValue() : aVar.f11574a;
        }

        public static /* synthetic */ long a(a aVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a0be640", new Object[]{aVar, new Long(j)})).longValue();
            }
            aVar.f11574a = j;
            return j;
        }

        public long d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.f11574a;
        }
    }

    /* loaded from: classes5.dex */
    public static abstract class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private c f11575a;
        private d b;

        static {
            kge.a(1432182885);
            kge.a(-1390502639);
        }

        public abstract void a();

        public abstract String b();

        public long c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
            }
            return 0L;
        }

        public static /* synthetic */ c a(b bVar, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("d7a50db5", new Object[]{bVar, cVar});
            }
            bVar.f11575a = cVar;
            return cVar;
        }

        public static /* synthetic */ d a(b bVar, d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("f0a65f73", new Object[]{bVar, dVar});
            }
            bVar.b = dVar;
            return dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f11575a != null) {
                    c cVar = this.f11575a;
                    String a2 = this.f11575a.a();
                    cVar.a(a2, "DelayTask runTask 开始执行: " + b());
                }
                a();
            } catch (Throwable th) {
                th.printStackTrace();
                c cVar2 = this.f11575a;
                if (cVar2 != null) {
                    cVar2.a(cVar2.a(), "未知异常，runTask . throwable  ", th);
                }
            }
            try {
                if (this.b == null || d.a(this.b)) {
                    return;
                }
                d.b(this.b);
                if (d.c(this.b) > 0) {
                    return;
                }
                d.a(this.b, true);
                if (this.f11575a == null) {
                    return;
                }
                this.f11575a.a(this.f11575a.a(), "on task end.mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
            } catch (Throwable th2) {
                c cVar3 = this.f11575a;
                if (cVar3 == null) {
                    return;
                }
                cVar3.a(cVar3.a(), "未知异常，runTask end.", th2);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<b> f11577a;
        private boolean b;
        private int c;
        private long d;
        private boolean e;
        private boolean f;
        private RecyclerView g;
        private Handler h;
        private c i;
        private boolean j;

        static {
            kge.a(-316160587);
        }

        public static /* synthetic */ int a(d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a362901", new Object[]{dVar, new Integer(i)})).intValue();
            }
            dVar.c = i;
            return i;
        }

        public static /* synthetic */ long a(d dVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a362cc3", new Object[]{dVar, new Long(j)})).longValue();
            }
            dVar.d = j;
            return j;
        }

        public static /* synthetic */ Handler a(d dVar, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("d864e761", new Object[]{dVar, handler});
            }
            dVar.h = handler;
            return handler;
        }

        public static /* synthetic */ c a(d dVar, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("83e387b7", new Object[]{dVar, cVar});
            }
            dVar.i = cVar;
            return cVar;
        }

        public static /* synthetic */ ArrayList a(d dVar, ArrayList arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("b6d938f", new Object[]{dVar, arrayList});
            }
            dVar.f11577a = arrayList;
            return arrayList;
        }

        public static /* synthetic */ boolean a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8685dc99", new Object[]{dVar})).booleanValue() : dVar.e;
        }

        public static /* synthetic */ boolean a(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4a3668e3", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.e = z;
            return z;
        }

        public static /* synthetic */ int b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("64794267", new Object[]{dVar})).intValue();
            }
            int i = dVar.c;
            dVar.c = i - 1;
            return i;
        }

        public static /* synthetic */ boolean b(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2aafbee4", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.j = z;
            return z;
        }

        public static /* synthetic */ int c(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("426ca846", new Object[]{dVar})).intValue() : dVar.c;
        }

        public static /* synthetic */ boolean c(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b2914e5", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.b = z;
            return z;
        }

        public static /* synthetic */ c d(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("3b21d4c0", new Object[]{dVar}) : dVar.i;
        }

        public static /* synthetic */ RecyclerView e(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("abbcc393", new Object[]{dVar}) : dVar.g;
        }

        public static /* synthetic */ boolean f(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dc46d9f4", new Object[]{dVar})).booleanValue() : dVar.b;
        }

        public static /* synthetic */ ArrayList g(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1b3e2629", new Object[]{dVar}) : dVar.f11577a;
        }

        public static /* synthetic */ boolean h(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("982da5b2", new Object[]{dVar})).booleanValue() : dVar.f;
        }

        private d() {
            this.i = new c();
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.i.b();
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.j;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
            }
            if (this.e || this.i.d()) {
                return false;
            }
            return this.i.b();
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            c cVar = this.i;
            cVar.a(cVar.a(), "RootLayoutHasRenderSuccess flag.");
            this.f = true;
        }

        public void a(RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            } else {
                this.g = recyclerView;
            }
        }

        public long a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("86847f6c", new Object[]{this, aVar})).longValue();
            }
            if (aVar != null) {
                a.a(aVar, System.currentTimeMillis());
                a((b) aVar);
                return a.a(aVar);
            }
            return System.currentTimeMillis();
        }

        public void a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8684f3d7", new Object[]{this, bVar});
                return;
            }
            try {
                b(bVar);
            } catch (Throwable th) {
                c cVar = this.i;
                cVar.a(cVar.a(), "示知异常，任务入队失败。", th);
            }
        }

        public void b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("647859b6", new Object[]{this, bVar});
            } else if (bVar == null) {
            } else {
                if (this.i.d()) {
                    bVar.run();
                } else if (this.b) {
                    if (this.e) {
                        bVar.run();
                        return;
                    }
                    if (this.c <= 0) {
                        c cVar = this.i;
                        cVar.a(cVar.a(), "mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                        this.e = true;
                    } else if (System.currentTimeMillis() - this.d > 5000) {
                        c cVar2 = this.i;
                        cVar2.a(cVar2.a(), "mHasStartProcessAllTask and mDelayTaskStartProcessTime is timed out , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                        this.e = true;
                    }
                    if (this.e) {
                        bVar.run();
                    } else if (bVar.c() > 0) {
                        if (this.h == null) {
                            this.h = new Handler(Looper.getMainLooper());
                        }
                        this.h.postDelayed(bVar, bVar.c());
                    } else {
                        bVar.run();
                    }
                } else {
                    if (this.f11577a == null) {
                        this.f11577a = new ArrayList<>(15);
                    }
                    b.a(bVar, this.i);
                    b.a(bVar, this);
                    this.f11577a.add(bVar);
                }
            }
        }
    }

    public NewDetailMaskFrameLayout(Context context) {
        super(context);
        this.mNewDetailMaskFrameLayoutContext = new d();
        this.mHasShowAnim = false;
        this.mHasSetBottomBarColor = false;
        this.mCurrentPageBottomBarColor = -1;
        this.mRootLayoutRealStartPreProcess = -1.0f;
        this.mRootLayoutRealStartProcess = -1.0f;
        init(context);
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNewDetailMaskFrameLayoutContext = new d();
        this.mHasShowAnim = false;
        this.mHasSetBottomBarColor = false;
        this.mCurrentPageBottomBarColor = -1;
        this.mRootLayoutRealStartPreProcess = -1.0f;
        this.mRootLayoutRealStartProcess = -1.0f;
        init(context);
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNewDetailMaskFrameLayoutContext = new d();
        this.mHasShowAnim = false;
        this.mHasSetBottomBarColor = false;
        this.mCurrentPageBottomBarColor = -1;
        this.mRootLayoutRealStartPreProcess = -1.0f;
        this.mRootLayoutRealStartProcess = -1.0f;
        init(context);
    }

    public void setMaskFrameLayoutHandler(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb5a536", new Object[]{this, cVar});
            return;
        }
        c.a(cVar, this);
        d.a(this.mNewDetailMaskFrameLayoutContext, cVar);
    }

    public d getNewDetailMaskFrameLayoutContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("7f1096b3", new Object[]{this}) : this.mNewDetailMaskFrameLayoutContext;
    }

    private void initScreenSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a289c4", new Object[]{this});
            return;
        }
        this.mScreenWidth = getScreenWidth(this.mContext);
        this.mScreenHeight = getScreenHeight(this.mContext);
    }

    public static int getScreenWidth(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b36f1410", new Object[]{context})).intValue();
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return 0;
    }

    public static int getScreenHeight(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb976a8b", new Object[]{context})).intValue();
        }
        if (context != null) {
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return 0;
    }

    private void initActivityAndAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3893b8ad", new Object[]{this});
            return;
        }
        this.mHandler = new Handler(Looper.getMainLooper());
        d.a(this.mNewDetailMaskFrameLayoutContext, this.mHandler);
        this.mContext = getContext();
        this.mActivity = getRealActivity(this.mContext);
    }

    public void setParentFrameLayout(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84474b35", new Object[]{this, frameLayout});
        } else {
            this.mParentFrameLayout = frameLayout;
        }
    }

    public boolean prepareActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bbe66c1", new Object[]{this})).booleanValue();
        }
        Context context = getContext();
        if (!(context instanceof Activity)) {
            return false;
        }
        return prepareActivity((Activity) context);
    }

    public boolean prepareActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c3c8253", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        activity.overridePendingTransition(0, 0);
        return true;
    }

    public static boolean degradeToOldTransition(Activity activity, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af3c8188", new Object[]{activity, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        activity.overridePendingTransition(i, i2);
        return true;
    }

    public static int getDeviceScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e89be20", new Object[0])).intValue();
        }
        int b2 = (int) akt.b();
        if (b2 >= 0 && b2 <= 100) {
            return b2;
        }
        return 80;
    }

    public boolean initAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("579f8f4c", new Object[]{this})).booleanValue();
        }
        if (!d.d(this.mNewDetailMaskFrameLayoutContext).b()) {
            return false;
        }
        initActivityAndAlpha();
        Activity activity = this.mActivity;
        if (activity == null) {
            d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "initAnim 出错。mActivity 为空。");
            checkAndTryProcessDelayTask();
            return false;
        } else if (!sfc.a(activity)) {
            checkAndTryProcessDelayTask();
            d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "initAnim 出错。convertActivityToTranslucent 失败。");
            return false;
        } else {
            this.mDeviceScore = getDeviceScore();
            this.mHasConvertActivityToTranslucent = true;
            final int i = ((100 - this.mDeviceScore) * (this.mDeviceScore > d.d(this.mNewDetailMaskFrameLayoutContext).u() ? 20 : 40)) + 800;
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                    } else {
                        NewDetailMaskFrameLayout.access$1000(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$1100(NewDetailMaskFrameLayout.this);
                        d.b(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                        try {
                            NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                        } catch (Throwable th) {
                            c d2 = d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this));
                            String a2 = d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a();
                            d2.a(a2, "resumeLayout with error. currentCheckActivityTime = " + i, th);
                        }
                        if (!NewDetailMaskFrameLayout.access$1600(NewDetailMaskFrameLayout.this)) {
                            return;
                        }
                        NewDetailMaskFrameLayout.this.autoCheckAnimEndStatusForV2();
                    }
                }
            }, i);
            d.b(this.mNewDetailMaskFrameLayoutContext, true);
            createMaskView();
            if (getMaskHandler().C()) {
                if (!createScaleImageView()) {
                    checkAndTryProcessDelayTask();
                    d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "initAnim 出错。createScaleImageView 失败。");
                    return false;
                }
            } else if (!initBasicScaleViewData()) {
                checkAndTryProcessDelayTask();
                d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "initAnim 出错。checkAndTryProcessDelayTask 失败。");
                return false;
            }
            if (getMaskHandler().A()) {
                getMaskHandler().a(getLogTag(), "supportItemWhiteHolderView,will createItemWhiteHolderView.");
                createItemWhiteHolderView();
            }
            setAlpha(0.001f);
            initScreenSize();
            if (isV1Version()) {
                startFrameLayoutAnim();
            } else {
                initTargetSizeForV2();
                startFrameLayoutAnimV2();
            }
            saveCurrentBottomBarColor(this.mActivity);
            setBottomBarColorAsPrePage(this.mActivity);
            return true;
        }
    }

    private void checkAndTryConvertActivityFromTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c0dc0", new Object[]{this});
        } else if (isDestroy()) {
        } else {
            tryConvertActivityFromTranslucent();
        }
    }

    public void tryConvertActivityFromTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc0ac2f", new Object[]{this});
        } else if (this.mHasConvertActivityFromTranslucent || !this.mHasConvertActivityToTranslucent) {
        } else {
            sfc.b(getRealActivity(getContext()));
            this.mHasConvertActivityFromTranslucent = true;
        }
    }

    public Activity getCurrentActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        if (this.mActivity == null) {
            this.mActivity = getRealActivity(getContext());
        }
        return this.mActivity;
    }

    private static Activity getRealActivity(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f2c7faaa", new Object[]{context});
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof fpz)) {
            return null;
        }
        try {
            Context a2 = ((fpz) context).a();
            if (!(a2 instanceof Activity)) {
                return null;
            }
            return (Activity) a2;
        } catch (Exception e2) {
            qxo.a("ViewContext getCurrentContext Error", e2);
            return null;
        }
    }

    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
        } else {
            tryConvertActivityFromTranslucent();
        }
    }

    private void frozenNoneCoreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64c8bc8", new Object[]{this});
        } else if (d.d(this.mNewDetailMaskFrameLayoutContext).H()) {
            d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "FrozenUI:hasSkipFrozenFeature");
        } else if (d.d(this.mNewDetailMaskFrameLayoutContext).d()) {
        } else {
            this.mFrozenLayoutCount++;
            if (d.e(this.mNewDetailMaskFrameLayoutContext) == null || d.e(this.mNewDetailMaskFrameLayoutContext).isLayoutFrozen()) {
                return;
            }
            d.e(this.mNewDetailMaskFrameLayoutContext).setLayoutFrozen(true);
        }
    }

    private void resumeNoneCoreLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef05d815", new Object[]{this});
        } else if (d.d(this.mNewDetailMaskFrameLayoutContext).d() || (i = this.mFrozenLayoutCount) <= 0) {
        } else {
            this.mFrozenLayoutCount = i - 1;
            if (d.e(this.mNewDetailMaskFrameLayoutContext) == null) {
                return;
            }
            d.e(this.mNewDetailMaskFrameLayoutContext).setLayoutFrozen(false);
        }
    }

    private void frozenOuterNoneCoreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6977ca23", new Object[]{this});
        } else if (d.d(this.mNewDetailMaskFrameLayoutContext).H()) {
            d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "FrozenUI:hasSkipOuterFrozenFeature");
        } else if (d.d(this.mNewDetailMaskFrameLayoutContext).d()) {
        } else {
            this.mFrozenOutLayoutCount++;
            d.d(this.mNewDetailMaskFrameLayoutContext).e();
        }
    }

    private void resumeOuterNoneCoreLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401325f6", new Object[]{this});
        } else if (d.d(this.mNewDetailMaskFrameLayoutContext).d() || (i = this.mFrozenOutLayoutCount) <= 0) {
        } else {
            this.mFrozenOutLayoutCount = i - 1;
            d.d(this.mNewDetailMaskFrameLayoutContext).h();
        }
    }

    private void checkAndTryProcessDelayTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a41765ac", new Object[]{this});
            return;
        }
        try {
            directProcessDelayTask();
        } catch (Throwable th) {
            d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "新转场完成后，非核心任务恢复出错。", th);
        }
    }

    private void directProcessDelayTask() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26025989", new Object[]{this});
        } else if (d.f(this.mNewDetailMaskFrameLayoutContext)) {
        } else {
            d.c(this.mNewDetailMaskFrameLayoutContext, true);
            ArrayList g = d.g(this.mNewDetailMaskFrameLayoutContext);
            d.a(this.mNewDetailMaskFrameLayoutContext, (ArrayList) null);
            if (g == null || g.isEmpty()) {
                return;
            }
            d.a(this.mNewDetailMaskFrameLayoutContext, g.size());
            d.a(this.mNewDetailMaskFrameLayoutContext, System.currentTimeMillis());
            Iterator it = g.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                i++;
                this.mHandler.postDelayed(bVar, i + bVar.c());
            }
        }
    }

    private void saveCurrentBottomBarColor(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b499090", new Object[]{this, activity});
        } else if (!d.d(this.mNewDetailMaskFrameLayoutContext).i()) {
        } else {
            this.mCurrentPageBottomBarColor = getBottomBarColor(activity);
        }
    }

    private void setBottomBarColorAsPrePage(Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c097f3c", new Object[]{this, activity});
        } else if (activity == null || (intent = activity.getIntent()) == null) {
        } else {
            try {
                int intExtra = intent.getIntExtra("extraPreBottomBarColor", -1);
                if (!d.d(this.mNewDetailMaskFrameLayoutContext).t() && intExtra < 0) {
                    return;
                }
                setBottomBarColor(activity, intExtra, d.d(this.mNewDetailMaskFrameLayoutContext).t());
            } catch (Throwable th) {
                d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "未知异常。 BottomBarColor 处理失败。Pre 。", th);
            }
        }
    }

    public static int getBottomBarColor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b59b4363", new Object[]{context})).intValue();
        }
        Activity realActivity = getRealActivity(context);
        if (realActivity != null && Build.VERSION.SDK_INT >= 21) {
            return realActivity.getWindow().getNavigationBarColor();
        }
        return -1;
    }

    public static int getAndSetFromPageBottomBarColor(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dda0417c", new Object[]{context, intent})).intValue();
        }
        if (intent == null || context == null) {
            return -1;
        }
        int bottomBarColor = getBottomBarColor(context);
        setFromPageBottomBarColor(bottomBarColor, intent);
        return bottomBarColor;
    }

    public static void setFromPageBottomBarColor(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91853fc3", new Object[]{new Integer(i), intent});
        } else if (i < 0 || intent == null) {
        } else {
            intent.putExtra("extraPreBottomBarColor", i);
        }
    }

    private static void setBottomBarColor(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf15c67", new Object[]{activity, new Integer(i), new Boolean(z)});
        } else if (activity == null) {
        } else {
            if (!z && i < 0) {
                return;
            }
            Window window = activity.getWindow();
            if (Build.VERSION.SDK_INT < 21 || window == null) {
                return;
            }
            window.setNavigationBarColor(i);
        }
    }

    private void setCurrentBottomBarColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c83c79", new Object[]{this});
            return;
        }
        try {
            this.mHasSetBottomBarColor = true;
            if (d.d(this.mNewDetailMaskFrameLayoutContext).t()) {
                setBottomBarColor(this.mActivity, this.mCurrentPageBottomBarColor, true);
            } else {
                setBottomBarColor(this.mActivity, this.mCurrentPageBottomBarColor < 0 ? -16777216 : this.mCurrentPageBottomBarColor, d.d(this.mNewDetailMaskFrameLayoutContext).t());
            }
        } catch (Throwable th) {
            d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "未知异常。 BottomBarColor 处理失败。Current 。", th);
        }
    }

    public static void setAdapterSpeedAndStartCheckStatus(int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd18804", new Object[]{new Integer(i), intent});
        } else if (i <= 0 || intent == null) {
        } else {
            intent.putExtra("extraAutoAdapterSpeed", i);
            startCheckCurrentDeviceStatus(3);
        }
    }

    public static int getAdapterSpeedFromIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd85776b", new Object[]{intent})).intValue();
        }
        if (intent != null) {
            return intent.getIntExtra("extraAutoAdapterSpeed", -1);
        }
        return -1;
    }

    public static void startCheckCurrentDeviceStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2581e1", new Object[]{new Integer(i)});
        } else if (Build.VERSION.SDK_INT < 16) {
        } else {
            sFrameSpeedAvgCheckCount = i;
            final long min = Math.min((sFrameSpeedAvgDuration / 2) + 70, 120L);
            sFrameSpeedAvgDuration = 0L;
            final long currentTimeMillis = System.currentTimeMillis();
            sFrameSpeedCheckStartTime = currentTimeMillis;
            sFrameSpeedLastTokenTime = currentTimeMillis;
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                    } else if (currentTimeMillis != NewDetailMaskFrameLayout.access$2100()) {
                    } else {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        long access$2200 = currentTimeMillis2 - NewDetailMaskFrameLayout.access$2200();
                        long j2 = min;
                        if (access$2200 > j2) {
                            access$2200 = j2;
                        }
                        NewDetailMaskFrameLayout.access$2202(currentTimeMillis2);
                        if (access$2200 > 16) {
                            if (NewDetailMaskFrameLayout.access$2300() != 0) {
                                access$2200 = (NewDetailMaskFrameLayout.access$2300() + access$2200) / 2;
                            }
                            NewDetailMaskFrameLayout.access$2302(access$2200);
                        }
                        if (NewDetailMaskFrameLayout.access$2406() <= 0) {
                            return;
                        }
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                }
            });
        }
    }

    private void startFrameLayoutAnim() {
        int i;
        int i2;
        int i3;
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6ef26d", new Object[]{this});
        } else if (this.mHasShowAnim) {
        } else {
            this.mHasShowAnim = true;
            final boolean z = !d.d(this.mNewDetailMaskFrameLayoutContext).G();
            if (z && this.mScaleImageView == null) {
                return;
            }
            int i5 = this.mScreenWidth;
            float f2 = this.mImageViewStartWidth;
            int i6 = this.mScreenHeight;
            float f3 = this.mImageViewStartHeight;
            float f4 = (int) (i5 - f2);
            float f5 = (int) (i6 - f3);
            final float f6 = i6 / f3;
            final float f7 = i5 / f2;
            final float f8 = (-(this.mImageViewStartLeftMargin / f4)) * f4;
            final float f9 = (-(this.mImageViewStartTopMargin / f5)) * f5;
            if (z) {
                this.mScaleImageView.setPivotX(0.0f);
                this.mScaleImageView.setPivotY(0.0f);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            int c2 = d.d(this.mNewDetailMaskFrameLayoutContext).c();
            int p = d.d(this.mNewDetailMaskFrameLayoutContext).p();
            if (p > 0) {
                long s = d.d(this.mNewDetailMaskFrameLayoutContext).s();
                if (sFrameSpeedAvgDuration > s) {
                    int q = d.d(this.mNewDetailMaskFrameLayoutContext).q();
                    int r = d.d(this.mNewDetailMaskFrameLayoutContext).r();
                    int u = d.d(this.mNewDetailMaskFrameLayoutContext).u();
                    int w = u - d.d(this.mNewDetailMaskFrameLayoutContext).w();
                    float f10 = (float) (p * (sFrameSpeedAvgDuration - s));
                    if (r == -2 || (i3 = this.mDeviceScore) <= w || i3 >= 101) {
                        i = c2;
                        i2 = 0;
                    } else {
                        if (i3 > u) {
                            i4 = (Math.min(d.d(this.mNewDetailMaskFrameLayoutContext).v(), this.mDeviceScore) - u) * r;
                        } else {
                            i4 = ((i3 - w) * r) / 2;
                        }
                        q -= i4;
                        f10 = Math.max(f10 - i4, 0.0f);
                        i2 = i4;
                        i = c2;
                    }
                    int i7 = (int) (i + f10);
                    if (i7 > q) {
                        i7 = q;
                    }
                    if (i7 >= i) {
                        i = i7;
                    }
                    d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "animDuration frameSpeedDuration Result: " + i + " sFrameSpeedAvgDuration: " + sFrameSpeedAvgDuration + " DeviceScore:" + this.mDeviceScore + " deviceMultiplier:" + r + " deviceReduce:" + i2);
                } else {
                    i = c2;
                }
            } else {
                i = c2;
            }
            ofFloat.setDuration(i);
            ofFloat.setInterpolator(d.d(this.mNewDetailMaskFrameLayoutContext).k());
            final float f11 = this.mImageViewStartWidth / this.mScreenWidth;
            final float f12 = this.mImageViewStartHeight / this.mScreenHeight;
            setPivotX(0.0f);
            setPivotY(0.0f);
            setScaleX(f11);
            setScaleY(f12);
            setTranslationX(this.mImageViewStartLeftMargin);
            setTranslationY(this.mImageViewStartTopMargin);
            final boolean j = d.d(this.mNewDetailMaskFrameLayoutContext).j();
            final float l = j ? 0.8f : d.d(this.mNewDetailMaskFrameLayoutContext).l();
            float m = j ? 0.0f : d.d(this.mNewDetailMaskFrameLayoutContext).m();
            final float f13 = l * m;
            final float n = d.d(this.mNewDetailMaskFrameLayoutContext).n();
            final float f14 = n * 1.5f;
            final boolean o = d.d(this.mNewDetailMaskFrameLayoutContext).o();
            final float f15 = m;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    try {
                        if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this) || NewDetailMaskFrameLayout.access$2500(NewDetailMaskFrameLayout.this)) {
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (o) {
                            if (floatValue < 0.2d) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(Math.min(5.0f * floatValue, 1.0f));
                            } else if (!NewDetailMaskFrameLayout.access$2700(NewDetailMaskFrameLayout.this)) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(1.0f);
                                NewDetailMaskFrameLayout.access$2702(NewDetailMaskFrameLayout.this, true);
                            }
                        }
                        if ((!j || !d.h(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this))) && floatValue <= l) {
                            NewDetailMaskFrameLayout.access$3102(NewDetailMaskFrameLayout.this, floatValue);
                            if (z) {
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - (f15 * floatValue));
                            }
                        } else if (!NewDetailMaskFrameLayout.access$2900(NewDetailMaskFrameLayout.this)) {
                            if (NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this) < 0.0f) {
                                NewDetailMaskFrameLayout.access$3002(NewDetailMaskFrameLayout.this, NewDetailMaskFrameLayout.access$3100(NewDetailMaskFrameLayout.this) > 0.0f ? NewDetailMaskFrameLayout.access$3100(NewDetailMaskFrameLayout.this) : floatValue);
                            }
                            float access$3000 = ((floatValue - NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this)) * n) + f13;
                            float min = Math.min(((floatValue - NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this)) * f14) + f13, 1.0f);
                            if (access$3000 > 1.0f) {
                                NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                                NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                                if (z) {
                                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(0.0f);
                                }
                            } else {
                                NewDetailMaskFrameLayout.this.setAlpha(min);
                                if (z) {
                                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - access$3000);
                                }
                            }
                        }
                        if (z) {
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationX(f8 * floatValue);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationY(f9 * floatValue);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleX(((f7 - 1.0f) * floatValue) + 1.0f);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleY(((f6 - 1.0f) * floatValue) + 1.0f);
                        }
                        NewDetailMaskFrameLayout.this.setScaleX(((1.0f - f11) * floatValue) + f11);
                        NewDetailMaskFrameLayout.this.setScaleY(((1.0f - f12) * floatValue) + f12);
                        float f16 = 1.0f - floatValue;
                        NewDetailMaskFrameLayout.this.setTranslationX(NewDetailMaskFrameLayout.access$3300(NewDetailMaskFrameLayout.this) * f16);
                        NewDetailMaskFrameLayout.this.setTranslationY(NewDetailMaskFrameLayout.access$3400(NewDetailMaskFrameLayout.this) * f16);
                        if ((d.h(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)) && !NewDetailMaskFrameLayout.access$3500(NewDetailMaskFrameLayout.this) && NewDetailMaskFrameLayout.access$3610(NewDetailMaskFrameLayout.this) < 0) || d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).f()) {
                            NewDetailMaskFrameLayout.access$3502(NewDetailMaskFrameLayout.this, true);
                            NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                            d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
                        }
                        if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this) && floatValue > 0.9f) {
                            NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                        }
                        NewDetailMaskFrameLayout.this.invalidate();
                    } catch (Throwable th) {
                        NewDetailMaskFrameLayout.access$2502(NewDetailMaskFrameLayout.this, true);
                        d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "", th);
                    }
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    try {
                        if (!d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).g()) {
                            return;
                        }
                        NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                    } catch (Throwable th) {
                        d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "动画开始时，场景冻结出错。", th);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    try {
                    } catch (Throwable th) {
                        d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "新转场完成后，主页面恢复失败。", th);
                    }
                    if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                        return;
                    }
                    d.b(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                    if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this)) {
                        NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                    }
                    NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                    NewDetailMaskFrameLayout.this.setScaleX(1.0f);
                    NewDetailMaskFrameLayout.this.setScaleY(1.0f);
                    NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                    NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                    NewDetailMaskFrameLayout.access$1000(NewDetailMaskFrameLayout.this);
                    if (z) {
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                    }
                    if (NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this) < 0.0f) {
                        float alpha = z ? NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).getAlpha() : 0.0f;
                        if (alpha > 0.001f) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(alpha, 0.0f);
                            alphaAnimation.setFillAfter(true);
                            alphaAnimation.setDuration(500L);
                            alphaAnimation.setInterpolator(new LinearInterpolator());
                            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationRepeat(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationStart(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                                    }
                                }

                                @Override // android.view.animation.Animation.AnimationListener
                                public void onAnimationEnd(Animation animation) {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("724c33d", new Object[]{this, animation});
                                    } else if (!z) {
                                    } else {
                                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                                    }
                                }
                            });
                            if (z) {
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).startAnimation(alphaAnimation);
                            }
                        } else if (z) {
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                        }
                    } else if (z) {
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                    }
                    try {
                        NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$4102(NewDetailMaskFrameLayout.this, 0);
                        NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$4202(NewDetailMaskFrameLayout.this, 0);
                    } catch (Throwable th2) {
                        d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "新转场完成后，主视图恢复出错。", th2);
                    }
                    NewDetailMaskFrameLayout.access$1100(NewDetailMaskFrameLayout.this);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        onAnimationEnd(animator);
                    }
                }
            });
            ofFloat.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        tryConvertActivityFromTranslucent();
        super.onDetachedFromWindow();
        this.mDetachedFromWindow = true;
    }

    private boolean isDestroy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue() : this.mDetachedFromWindow || this.mIsDestroy;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mIsDestroy = true;
        }
    }

    private void createMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28adfed4", new Object[]{this});
        } else if (this.mActivity == null || this.mContext == null || this.mParentFrameLayout == null || !d.d(this.mNewDetailMaskFrameLayoutContext).o()) {
        } else {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            this.mMaskView = new View(this.mContext);
            this.mMaskView.setBackgroundColor(Color.parseColor("#80000000"));
            this.mMaskView.setLayoutParams(layoutParams);
            this.mMaskView.setAlpha(0.001f);
            this.mParentFrameLayout.addView(this.mMaskView, 0);
        }
    }

    public static boolean checkHasMaskFrameAnimParams(Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("561f304b", new Object[]{bundle})).booleanValue() : bundle != null && bundle.containsKey("view_screen_start_x") && bundle.containsKey("view_screen_start_y") && bundle.getFloat("view_height", -1.0f) > 0.0f && bundle.getFloat("view_width", -1.0f) > 0.0f;
    }

    private boolean createScaleImageView() {
        Context context;
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a38d0c1d", new Object[]{this})).booleanValue();
        }
        if (this.mActivity == null || (context = this.mContext) == null || this.mParentFrameLayout == null) {
            c d2 = d.d(this.mNewDetailMaskFrameLayoutContext);
            String a2 = d.d(this.mNewDetailMaskFrameLayoutContext).a();
            d2.a(a2, "createScaleImageView 出错。" + this.mParentFrameLayout);
            return false;
        }
        this.mScaleImageView = new ImageView(context);
        this.mActivityBundle = this.mActivity.getIntent().getBundleExtra("nav_animation_extra");
        Bundle bundle = this.mActivityBundle;
        if (bundle == null) {
            d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "createScaleImageView bundle is null.");
            return false;
        }
        this.mImageViewScreenStartX = bundle.getFloat("view_screen_start_x", -1.0f);
        this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
        this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
        this.mImageViewStartWidth = this.mActivityBundle.getFloat("view_width", -1.0f);
        float f2 = this.mImageViewStartHeight;
        if (f2 > 0.0f) {
            float f3 = this.mImageViewStartWidth;
            if (f3 > 0.0f) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) f3, (int) f2);
                layoutParams.gravity = 51;
                layoutParams.leftMargin = (int) this.mImageViewScreenStartX;
                layoutParams.topMargin = (int) this.mImageViewScreenStartY;
                this.mImageViewStartLeftMargin = layoutParams.leftMargin;
                this.mImageViewStartTopMargin = layoutParams.topMargin;
                this.mParentFrameLayout.addView(this.mScaleImageView, layoutParams);
                if (Build.VERSION.SDK_INT >= 18) {
                    IBinder binder = this.mActivityBundle.getBinder("view_screenshot");
                    if (!(binder instanceof BitmapBinder)) {
                        return false;
                    }
                    BitmapBinder bitmapBinder = (BitmapBinder) binder;
                    if (bitmapBinder != null && (bitmap = bitmapBinder.getBitmap()) != null) {
                        d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "startProcessAnim bitmap is not null");
                        this.mScaleImageView.setImageBitmap(bitmap);
                    }
                }
                return true;
            }
        }
        c d3 = d.d(this.mNewDetailMaskFrameLayoutContext);
        String a3 = d.d(this.mNewDetailMaskFrameLayoutContext).a();
        d3.a(a3, "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
        return false;
    }

    private c getMaskHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("fdaf3c5d", new Object[]{this}) : d.d(this.mNewDetailMaskFrameLayoutContext);
    }

    private String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : d.d(this.mNewDetailMaskFrameLayoutContext).a();
    }

    private boolean isV1Version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("770f1ade", new Object[]{this})).booleanValue() : d.d(this.mNewDetailMaskFrameLayoutContext).x() == 101;
    }

    private boolean isV2Version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ec0c03d", new Object[]{this})).booleanValue() : d.d(this.mNewDetailMaskFrameLayoutContext).x() == 201;
    }

    private void startFrameLayoutAnimV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4c6d89", new Object[]{this});
        } else if (this.mHasShowAnim) {
        } else {
            this.mHasShowAnim = true;
            c.a(getMaskHandler(), this);
            if (getMaskHandler().B()) {
                setAlpha(1.0f);
            }
            int i = this.mScreenWidth;
            float f2 = this.mImageViewStartWidth;
            int i2 = this.mScreenHeight;
            float f3 = this.mImageViewStartHeight;
            float f4 = (int) (i - f2);
            float f5 = (int) (i2 - f3);
            final float f6 = i2 / f3;
            final float f7 = i / f2;
            final float f8 = (-(this.mImageViewStartLeftMargin / f4)) * f4;
            final float f9 = (-(this.mImageViewStartTopMargin / f5)) * f5;
            final boolean z = this.mScaleImageView != null && getMaskHandler().C();
            if (z) {
                this.mScaleImageView.setPivotX(0.0f);
                this.mScaleImageView.setPivotY(0.0f);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(e.a(getMaskHandler().c(), getMaskHandler()));
            ofFloat.setInterpolator(getMaskHandler().k());
            final float f10 = this.mImageViewStartWidth / this.mScreenWidth;
            final float f11 = this.mImageViewStartHeight / this.mScreenHeight;
            setPivotX(0.0f);
            setPivotY(0.0f);
            setScaleX(f10);
            setScaleY(f11);
            setTranslationX(this.mImageViewStartLeftMargin);
            setTranslationY(this.mImageViewStartTopMargin);
            final float m = getMaskHandler().m();
            final float n = getMaskHandler().n();
            if (getMaskHandler().z()) {
                bindItemCardMainView(this.mParentFrameLayout);
            }
            final boolean o = d.d(this.mNewDetailMaskFrameLayoutContext).o();
            final boolean z2 = z;
            addAnimAllListenerAndStartAnim(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    try {
                        if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this) || NewDetailMaskFrameLayout.access$2500(NewDetailMaskFrameLayout.this)) {
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        if (o) {
                            if (floatValue < 0.2d) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(Math.min(5.0f * floatValue, 1.0f));
                            } else if (!NewDetailMaskFrameLayout.access$2700(NewDetailMaskFrameLayout.this)) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(1.0f);
                                NewDetailMaskFrameLayout.access$2702(NewDetailMaskFrameLayout.this, true);
                            }
                        }
                        if (NewDetailMaskFrameLayout.access$4400(NewDetailMaskFrameLayout.this).B()) {
                            NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                            NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                        }
                        if (!NewDetailMaskFrameLayout.access$2900(NewDetailMaskFrameLayout.this)) {
                            float f12 = n * floatValue;
                            if (f12 > 1.0f) {
                                NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                                NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                            } else {
                                NewDetailMaskFrameLayout.this.setAlpha(f12);
                            }
                        }
                        if (z2) {
                            float f13 = (m * floatValue) + 0.3f;
                            if (NewDetailMaskFrameLayout.access$4500(NewDetailMaskFrameLayout.this) || f13 <= 1.0f) {
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - f13);
                            } else {
                                NewDetailMaskFrameLayout.access$4502(NewDetailMaskFrameLayout.this, true);
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(0.0f);
                            }
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationX(f8 * floatValue);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationY(f9 * floatValue);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleX(((f7 - 1.0f) * floatValue) + 1.0f);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleY(((f6 - 1.0f) * floatValue) + 1.0f);
                        }
                        NewDetailMaskFrameLayout.this.setScaleX(((1.0f - f10) * floatValue) + f10);
                        NewDetailMaskFrameLayout.this.setScaleY(((1.0f - f11) * floatValue) + f11);
                        float f14 = 1.0f - floatValue;
                        NewDetailMaskFrameLayout.this.setTranslationX(NewDetailMaskFrameLayout.access$3300(NewDetailMaskFrameLayout.this) * f14);
                        NewDetailMaskFrameLayout.this.setTranslationY(NewDetailMaskFrameLayout.access$3400(NewDetailMaskFrameLayout.this) * f14);
                        if ((d.h(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)) && !NewDetailMaskFrameLayout.access$3500(NewDetailMaskFrameLayout.this) && NewDetailMaskFrameLayout.access$3610(NewDetailMaskFrameLayout.this) < 0) || d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).f()) {
                            NewDetailMaskFrameLayout.access$3502(NewDetailMaskFrameLayout.this, true);
                            NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                            d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
                        }
                        if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this) && floatValue > 0.9f) {
                            NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                        }
                        NewDetailMaskFrameLayout.this.invalidate();
                    } catch (Throwable th) {
                        NewDetailMaskFrameLayout.access$2502(NewDetailMaskFrameLayout.this, true);
                        d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "", th);
                    }
                }
            }, new Animator.AnimatorListener() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    try {
                        if (!d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).g()) {
                            return;
                        }
                        NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                    } catch (Throwable th) {
                        d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "动画开始时，场景冻结出错。", th);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                    } else {
                        d.b(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                        if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this)) {
                            NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                        }
                        NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                        NewDetailMaskFrameLayout.this.setScaleX(1.0f);
                        NewDetailMaskFrameLayout.this.setScaleY(1.0f);
                        NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                        NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                        NewDetailMaskFrameLayout.this.getMainHandler().postDelayed(new Runnable() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                                } else {
                                    NewDetailMaskFrameLayout.access$1000(NewDetailMaskFrameLayout.this);
                                }
                            }
                        }, NewDetailMaskFrameLayout.access$4400(NewDetailMaskFrameLayout.this).y());
                        if (z) {
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                        }
                        try {
                            NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$4102(NewDetailMaskFrameLayout.this, 0);
                            NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$4202(NewDetailMaskFrameLayout.this, 0);
                        } catch (Throwable th) {
                            d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(d.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(), "新转场完成后，主视图恢复出错。", th);
                        }
                        NewDetailMaskFrameLayout.access$1100(NewDetailMaskFrameLayout.this);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        onAnimationEnd(animator);
                    }
                }
            });
        }
    }

    private void addAnimAllListenerAndStartAnim(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener, Animator.AnimatorListener animatorListener) {
        int i;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f13898b2", new Object[]{this, valueAnimator, animatorUpdateListener, animatorListener});
        } else if (valueAnimator == null || animatorUpdateListener == null || animatorListener == null) {
        } else {
            if (getMaskHandler().D()) {
                f fVar = new f();
                f.a(fVar, animatorUpdateListener);
                f.a(fVar, valueAnimator);
                f.a(fVar, animatorListener);
                int E = getMaskHandler().E();
                if (E > 0) {
                    if (getMaskHandler().F() > 0) {
                        if (sFrameSpeedAvgDuration > getMaskHandler().F()) {
                            i = 16;
                        } else {
                            E = (E << 1) / 3;
                            i = 18;
                        }
                        f.a(fVar, i);
                    }
                    f.b(fVar, E);
                    c maskHandler = getMaskHandler();
                    String logTag = getLogTag();
                    maskHandler.a(logTag, "TikTest customVerticalSyncAnimation currentRealMinFrameFit:" + f.a(fVar) + " frameMaxCount:" + f.b(fVar));
                    z = fVar.a();
                }
            }
            if (z) {
                return;
            }
            valueAnimator.addUpdateListener(animatorUpdateListener);
            valueAnimator.addListener(animatorListener);
            valueAnimator.start();
        }
    }

    private void createItemWhiteHolderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a487852", new Object[]{this});
            return;
        }
        this.mItemWhiteHolderView = new View(this.mContext);
        this.mItemWhiteHolderView.setBackgroundColor(-1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
        layoutParams.gravity = 51;
        layoutParams.leftMargin = (int) this.mImageViewScreenStartX;
        layoutParams.topMargin = (int) this.mImageViewScreenStartY;
        this.mParentFrameLayout.addView(this.mItemWhiteHolderView, 0, layoutParams);
    }

    private int adapterCurrentCheckActivityTime(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f055d9f5", new Object[]{this, new Integer(i)})).intValue() : i < getMaskHandler().c() + 200 ? getMaskHandler().c() + 200 : i;
    }

    public void bindItemCardMainView(View view) {
        Drawable a2;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3142ed", new Object[]{this, view});
        } else if (!this.mNewDetailMaskFrameLayoutContext.a() || view == null || (a2 = e.a(view.getContext())) == null) {
        } else {
            if (view instanceof ImageView) {
                imageView = (ImageView) view;
            } else {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.mImageViewStartWidth, (int) this.mImageViewStartHeight);
                layoutParams.gravity = 51;
                layoutParams.leftMargin = (int) this.mImageViewScreenStartX;
                layoutParams.topMargin = (int) this.mImageViewScreenStartY;
                ImageView imageView2 = new ImageView(view.getContext());
                imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                float floatExtra = this.mActivity.getIntent().getFloatExtra("anim_main_image_view_height", -1.0f);
                if (floatExtra > 0.0f) {
                    layoutParams.height = (int) floatExtra;
                    c maskHandler = getMaskHandler();
                    String logTag = getLogTag();
                    maskHandler.a(logTag, "anim_main_image_view_height = " + floatExtra);
                }
                imageView2.setLayoutParams(layoutParams);
                imageView = imageView2;
            }
            this.mMainViewHolderIv = imageView;
            imageView.setImageDrawable(a2);
            if (!(view instanceof ViewGroup)) {
                return;
            }
            ((ViewGroup) view).addView(imageView, 0);
        }
    }

    private boolean initBasicScaleViewData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a000ea06", new Object[]{this})).booleanValue();
        }
        Activity activity = this.mActivity;
        if (activity != null && this.mContext != null && this.mParentFrameLayout != null) {
            this.mActivityBundle = activity.getIntent().getBundleExtra("nav_animation_extra");
            Bundle bundle = this.mActivityBundle;
            if (bundle == null) {
                d.d(this.mNewDetailMaskFrameLayoutContext).a(d.d(this.mNewDetailMaskFrameLayoutContext).a(), "createScaleImageView bundle is null.");
                return false;
            }
            this.mImageViewScreenStartX = bundle.getFloat("view_screen_start_x", -1.0f);
            this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
            this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
            this.mImageViewStartWidth = this.mActivityBundle.getFloat("view_width", -1.0f);
            if (this.mImageViewStartHeight <= 0.0f || this.mImageViewStartWidth <= 0.0f) {
                c d2 = d.d(this.mNewDetailMaskFrameLayoutContext);
                String a2 = d.d(this.mNewDetailMaskFrameLayoutContext).a();
                d2.a(a2, "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
            } else {
                this.mImageViewStartLeftMargin = (int) this.mImageViewScreenStartX;
                this.mImageViewStartTopMargin = (int) this.mImageViewScreenStartY;
                return true;
            }
        }
        return false;
    }

    public boolean animItemIsRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb108cdc", new Object[]{this})).booleanValue();
        }
        Intent intent = this.mActivity.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("anim_item_is_running", false);
        }
        return false;
    }

    public void autoCheckAnimEndStatusForV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7e1ce9", new Object[]{this});
            return;
        }
        ImageView imageView = this.mMainViewHolderIv;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }

    public Handler getMainHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.getMainLooper());
        }
        return this.mHandler;
    }

    /* loaded from: classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DEFAULT_CUSTOM_ANIMATION_FRAME_MAX_COUNT = 12;
        public static final int DEFAULT_CUSTOM_ANIMATION_MIN_FRAME_FIT = 32;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_GT80_MAX_VALUE = 260;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_LT40_MAX_VALUE = 320;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_LT60_MAX_VALUE = 310;
        public static final int DEFAULT_MASK_AUTO_ADAPTER_ANIM_DURATION_MAX_VALUE = 280;
        public static final int DEFAULT_VALUE_MASK_FRAME_ANIM_DURATION = 240;
        public static final int DEFAULT_VALUE_MASK_FRAME_GT80_ANIM_DURATION = 230;
        public static final int DEFAULT_VALUE_MASK_FRAME_LT40_ANIM_DURATION = 280;
        public static final int DEFAULT_VALUE_MASK_FRAME_LT60_ANIM_DURATION = 270;
        public static final int MASK_ANIM_VERSION_V1 = 101;
        public static final int MASK_ANIM_VERSION_V2 = 201;
        public static final int MASK_ANIM_VERSION_V3 = 301;

        /* loaded from: classes5.dex */
        public interface a {
            NewDetailMaskFrameLayout c();
        }

        static {
            kge.a(1432411699);
        }

        public static /* synthetic */ int a(int i, c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b37eb16", new Object[]{new Integer(i), cVar})).intValue() : b(i, cVar);
        }

        public static /* synthetic */ Drawable a(Context context) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("e46b695a", new Object[]{context}) : c(context);
        }

        public static int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
            }
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            if (deviceScore < 40) {
                return 280;
            }
            if (deviceScore < 60) {
                return 270;
            }
            return deviceScore < 80 ? 240 : 230;
        }

        public static int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
            }
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            if (deviceScore < 40) {
                return 320;
            }
            if (deviceScore < 60) {
                return 310;
            }
            return deviceScore < 80 ? 280 : 260;
        }

        public static boolean a(Intent intent, com.taobao.android.nav.d dVar) {
            Bundle e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("40d54a33", new Object[]{intent, dVar})).booleanValue();
            }
            if (dVar == null || intent == null || (e = dVar.e()) == null) {
                return false;
            }
            float f = e.getFloat("anim_main_image_view_height", -1.0f);
            if (f > 0.0f) {
                intent.putExtra("anim_main_image_view_height", f);
            }
            if (e.containsKey("anim_item_is_running")) {
                intent.putExtra("anim_item_is_running", e.getBoolean("anim_item_is_running", false));
            }
            return true;
        }

        public static boolean a(ImageView imageView) {
            Drawable c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("83f7c626", new Object[]{imageView})).booleanValue();
            }
            if (imageView == null || (c = c(imageView.getContext())) == null) {
                return false;
            }
            imageView.setImageDrawable(c);
            return true;
        }

        private static Bundle b(Context context) {
            Intent intent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("797e0b03", new Object[]{context});
            }
            Activity access$5300 = NewDetailMaskFrameLayout.access$5300(context);
            if (access$5300 != null && (intent = access$5300.getIntent()) != null) {
                return intent.getBundleExtra("nav_animation_extra");
            }
            return null;
        }

        private static BitmapBinder a(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapBinder) ipChange.ipc$dispatch("41146e7a", new Object[]{bundle});
            }
            if (bundle != null && Build.VERSION.SDK_INT >= 18) {
                IBinder binder = bundle.getBinder("view_source_drawable");
                if (binder instanceof BitmapBinder) {
                    return (BitmapBinder) binder;
                }
            }
            return null;
        }

        private static Drawable c(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("7fea595c", new Object[]{context});
            }
            BitmapBinder a2 = a(b(context));
            if (a2 == null) {
                return null;
            }
            return a2.getDrawable();
        }

        private static int b(int i, c cVar) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4bb14117", new Object[]{new Integer(i), cVar})).intValue();
            }
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            int p = cVar.p();
            if (p > 0) {
                long s = cVar.s();
                if (NewDetailMaskFrameLayout.access$2300() > s) {
                    int q = cVar.q();
                    int r = cVar.r();
                    int u = cVar.u();
                    int w = u - cVar.w();
                    float access$2300 = (float) ((NewDetailMaskFrameLayout.access$2300() - s) * p);
                    if (r != -2 && deviceScore > w && deviceScore < 101) {
                        if (deviceScore > u) {
                            i2 = (Math.min(cVar.v(), deviceScore) - u) * r;
                        } else {
                            i2 = ((deviceScore - w) * r) / 2;
                        }
                        q -= i2;
                        access$2300 = Math.max(access$2300 - i2, 0.0f);
                    }
                    int i3 = (int) (i + access$2300);
                    if (i3 > q) {
                        i3 = q;
                    }
                    if (i3 >= i) {
                        i = i3;
                    }
                    cVar.a(cVar.a(), "animDuration frameSpeedDuration Result: " + i + " sFrameSpeedAvgDuration: " + NewDetailMaskFrameLayout.access$2300() + " DeviceScore:" + deviceScore + " deviceMultiplier:" + r + " deviceReduce:" + i2);
                }
            }
            return i;
        }
    }

    /* loaded from: classes5.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f11578a;
        private int b;
        private ValueAnimator.AnimatorUpdateListener c;
        private ValueAnimator d;
        private Animator.AnimatorListener e;
        private int f;
        private ValueAnimator g;
        private float h;
        private long i;
        private long j;

        static {
            kge.a(48104418);
        }

        private f() {
            this.f11578a = 12;
            this.b = 1;
            this.i = 0L;
            this.j = 0L;
        }

        public static /* synthetic */ float a(f fVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a524cbd", new Object[]{fVar, new Float(f)})).floatValue();
            }
            fVar.h = f;
            return f;
        }

        public static /* synthetic */ int a(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8686c546", new Object[]{fVar})).intValue() : fVar.f;
        }

        public static /* synthetic */ int a(f fVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a525803", new Object[]{fVar, new Integer(i)})).intValue();
            }
            fVar.f = i;
            return i;
        }

        public static /* synthetic */ long a(f fVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a525bc5", new Object[]{fVar, new Long(j)})).longValue();
            }
            fVar.i = j;
            return j;
        }

        public static /* synthetic */ Animator.AnimatorListener a(f fVar, Animator.AnimatorListener animatorListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator.AnimatorListener) ipChange.ipc$dispatch("7e823725", new Object[]{fVar, animatorListener});
            }
            fVar.e = animatorListener;
            return animatorListener;
        }

        public static /* synthetic */ ValueAnimator.AnimatorUpdateListener a(f fVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("fd21dee3", new Object[]{fVar, animatorUpdateListener});
            }
            fVar.c = animatorUpdateListener;
            return animatorUpdateListener;
        }

        public static /* synthetic */ ValueAnimator a(f fVar, ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("df870ea5", new Object[]{fVar, valueAnimator});
            }
            fVar.d = valueAnimator;
            return valueAnimator;
        }

        public static /* synthetic */ int b(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("647a2b25", new Object[]{fVar})).intValue() : fVar.f11578a;
        }

        public static /* synthetic */ int b(f fVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2acbae04", new Object[]{fVar, new Integer(i)})).intValue();
            }
            fVar.f11578a = i;
            return i;
        }

        public static /* synthetic */ long b(f fVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2acbb1c6", new Object[]{fVar, new Long(j)})).longValue();
            }
            fVar.j = j;
            return j;
        }

        public static /* synthetic */ float c(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("426d9101", new Object[]{fVar})).floatValue() : fVar.h;
        }

        public static /* synthetic */ int d(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2060f6e3", new Object[]{fVar})).intValue() : fVar.b;
        }

        public static /* synthetic */ ValueAnimator e(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("c071ca33", new Object[]{fVar}) : fVar.g;
        }

        public static /* synthetic */ ValueAnimator.AnimatorUpdateListener f(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("63c9a6dc", new Object[]{fVar}) : fVar.c;
        }

        public static /* synthetic */ ValueAnimator g(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("dc8a1df1", new Object[]{fVar}) : fVar.d;
        }

        public static /* synthetic */ Animator.AnimatorListener h(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Animator.AnimatorListener) ipChange.ipc$dispatch("29ccd2d0", new Object[]{fVar}) : fVar.e;
        }

        public static /* synthetic */ long i(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7621f43f", new Object[]{fVar})).longValue() : fVar.i;
        }

        public static /* synthetic */ long j(f fVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54155a1e", new Object[]{fVar})).longValue() : fVar.j;
        }

        public static /* synthetic */ int k(f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3208bffc", new Object[]{fVar})).intValue();
            }
            int i = fVar.b;
            fVar.b = i + 1;
            return i;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (this.c != null && this.d != null && this.e != null) {
                this.g = new ValueAnimator() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.f.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator
                    public Object getAnimatedValue() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e009a6b3", new Object[]{this}) : Float.valueOf(f.c(f.this));
                    }
                };
                if (Build.VERSION.SDK_INT >= 16) {
                    final Choreographer choreographer = Choreographer.getInstance();
                    Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout.f.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.Choreographer.FrameCallback
                        public void doFrame(long j) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                            } else if (f.d(f.this) > f.b(f.this)) {
                                f.a(f.this, 1.0f);
                                f.f(f.this).onAnimationUpdate(f.e(f.this));
                                f.h(f.this).onAnimationEnd(f.g(f.this));
                            } else {
                                f.b(f.this, System.currentTimeMillis());
                                if (f.j(f.this) - f.i(f.this) < f.a(f.this)) {
                                    choreographer.postFrameCallback(this);
                                    return;
                                }
                                f fVar = f.this;
                                f.a(fVar, f.j(fVar));
                                f fVar2 = f.this;
                                f.a(fVar2, f.d(fVar2) / f.b(f.this));
                                f.f(f.this).onAnimationUpdate(f.e(f.this));
                                choreographer.postFrameCallback(this);
                                f.k(f.this);
                            }
                        }
                    };
                    this.e.onAnimationStart(this.d);
                    frameCallback.doFrame(0L);
                    return true;
                }
            }
            return false;
        }
    }
}
