package com.taobao.taolive.ui.view;

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
import tb.kge;
import tb.sfc;

/* loaded from: classes8.dex */
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
    private c mNewDetailMaskFrameLayoutContext;
    private FrameLayout mParentFrameLayout;
    private float mRootLayoutRealStartPreProcess;
    private float mRootLayoutRealStartProcess;
    private ImageView mScaleImageView;
    private int mScreenHeight;
    private int mScreenWidth;
    private int val_animItemIsRunning;

    static {
        kge.a(-756247107);
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
            ipChange.ipc$dispatch("15cadd7e", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.checkAndTryConvertActivityFromTranslucent();
        }
    }

    public static /* synthetic */ void access$1100(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcea8dd", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.checkAndTryProcessDelayTask();
        }
    }

    public static /* synthetic */ c access$1200(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1311e331", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.mNewDetailMaskFrameLayoutContext;
    }

    public static /* synthetic */ void access$1400(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dda0afa", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.resumeNoneCoreLayout();
        }
    }

    public static /* synthetic */ void access$1500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33ddd659", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.resumeOuterNoneCoreLayout();
        }
    }

    public static /* synthetic */ boolean access$1600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39e1a1bc", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.isV2Version();
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ee5376de", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasCatchException;
    }

    public static /* synthetic */ boolean access$2502(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd87b0c0", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasCatchException = z;
        return z;
    }

    public static /* synthetic */ View access$2600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("8d391e3b", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.mMaskView;
    }

    public static /* synthetic */ boolean access$2700(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa5b0d9c", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetMaskViewFullAlpha;
    }

    public static /* synthetic */ boolean access$2702(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7272f1c2", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetMaskViewFullAlpha = z;
        return z;
    }

    public static /* synthetic */ boolean access$2900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("662a45a", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetRootViewFullAlpha;
    }

    public static /* synthetic */ boolean access$2902(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e75e32c4", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetRootViewFullAlpha = z;
        return z;
    }

    public static /* synthetic */ float access$3000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8ab61e70", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mRootLayoutRealStartProcess;
    }

    public static /* synthetic */ float access$3002(NewDetailMaskFrameLayout newDetailMaskFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed79b2b2", new Object[]{newDetailMaskFrameLayout, new Float(f)})).floatValue();
        }
        newDetailMaskFrameLayout.mRootLayoutRealStartProcess = f;
        return f;
    }

    public static /* synthetic */ float access$3100(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90b9e9cf", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mRootLayoutRealStartPreProcess;
    }

    public static /* synthetic */ float access$3102(NewDetailMaskFrameLayout newDetailMaskFrameLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7ef5333", new Object[]{newDetailMaskFrameLayout, new Float(f)})).floatValue();
        }
        newDetailMaskFrameLayout.mRootLayoutRealStartPreProcess = f;
        return f;
    }

    public static /* synthetic */ ImageView access$3200(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("c0f48c12", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.mScaleImageView;
    }

    public static /* synthetic */ float access$3300(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9cc1808d", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mImageViewStartLeftMargin;
    }

    public static /* synthetic */ float access$3400(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a2c54bec", new Object[]{newDetailMaskFrameLayout})).floatValue() : newDetailMaskFrameLayout.mImageViewStartTopMargin;
    }

    public static /* synthetic */ boolean access$3500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8c9175f", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasFrozenOuterSuccessLayout;
    }

    public static /* synthetic */ boolean access$3502(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91c6205f", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasFrozenOuterSuccessLayout = z;
        return z;
    }

    public static /* synthetic */ int access$3610(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf82af6e", new Object[]{newDetailMaskFrameLayout})).intValue();
        }
        int i = newDetailMaskFrameLayout.mFrozenCountDown;
        newDetailMaskFrameLayout.mFrozenCountDown = i - 1;
        return i;
    }

    public static /* synthetic */ void access$3700(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d0ae19", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.frozenNoneCoreLayout();
        }
    }

    public static /* synthetic */ void access$3800(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad47978", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.frozenOuterNoneCoreLayout();
        }
    }

    public static /* synthetic */ boolean access$3900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c0d844db", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetBottomBarColor;
    }

    public static /* synthetic */ void access$4000(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452bbf01", new Object[]{newDetailMaskFrameLayout});
        } else {
            newDetailMaskFrameLayout.setCurrentBottomBarColor();
        }
    }

    public static /* synthetic */ int access$4102(NewDetailMaskFrameLayout newDetailMaskFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c2dce18", new Object[]{newDetailMaskFrameLayout, new Integer(i)})).intValue();
        }
        newDetailMaskFrameLayout.mFrozenLayoutCount = i;
        return i;
    }

    public static /* synthetic */ int access$4202(NewDetailMaskFrameLayout newDetailMaskFrameLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6a36e99", new Object[]{newDetailMaskFrameLayout, new Integer(i)})).intValue();
        }
        newDetailMaskFrameLayout.mFrozenOutLayoutCount = i;
        return i;
    }

    public static /* synthetic */ b access$4500(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("72832eb2", new Object[]{newDetailMaskFrameLayout}) : newDetailMaskFrameLayout.getMaskHandler();
    }

    public static /* synthetic */ boolean access$4600(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6942833f", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.mHasSetScaleImageViewZeroAlpha;
    }

    public static /* synthetic */ boolean access$4602(NewDetailMaskFrameLayout newDetailMaskFrameLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07a307f", new Object[]{newDetailMaskFrameLayout, new Boolean(z)})).booleanValue();
        }
        newDetailMaskFrameLayout.mHasSetScaleImageViewZeroAlpha = z;
        return z;
    }

    public static /* synthetic */ boolean access$900(NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("113b91a8", new Object[]{newDetailMaskFrameLayout})).booleanValue() : newDetailMaskFrameLayout.isDestroy();
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private NewDetailMaskFrameLayout f22005a;
        private int b = -1;

        static {
            kge.a(833081158);
        }

        public boolean B() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public int C() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3c5ab3d", new Object[]{this})).intValue();
            }
            return 12;
        }

        public int D() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue();
            }
            return 32;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
            }
            return 0;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "无极缩放Default";
        }

        public int f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
            }
            return -2;
        }

        public int g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
            }
            return 80;
        }

        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
            }
            return 92;
        }

        public int i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
            }
            return 10;
        }

        public int j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
            }
            return 17;
        }

        public boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public float o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("631b566", new Object[]{this})).floatValue();
            }
            return 0.3f;
        }

        public boolean r() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean s() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue();
            }
            return true;
        }

        public int u() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
            }
            return 201;
        }

        public int v() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue();
            }
            return 10;
        }

        @Deprecated
        public boolean w() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean y() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public boolean z() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue();
            }
            return false;
        }

        public static /* synthetic */ NewDetailMaskFrameLayout a(b bVar, NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NewDetailMaskFrameLayout) ipChange.ipc$dispatch("eb047cba", new Object[]{bVar, newDetailMaskFrameLayout});
            }
            bVar.f22005a = newDetailMaskFrameLayout;
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

        public int d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : d.a();
        }

        public int e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : d.b();
        }

        public TimeInterpolator k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TimeInterpolator) ipChange.ipc$dispatch("f56ebc94", new Object[]{this}) : new AccelerateDecelerateInterpolator();
        }

        public float E() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3e1da3c", new Object[]{this})).floatValue();
            }
            NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.f22005a;
            return (newDetailMaskFrameLayout == null || !newDetailMaskFrameLayout.animItemIsRunning()) ? -1.0f : 0.3f;
        }

        public float p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("63fcce7", new Object[]{this})).floatValue();
            }
            if (!x()) {
                return 0.3f;
            }
            NewDetailMaskFrameLayout newDetailMaskFrameLayout = this.f22005a;
            return (newDetailMaskFrameLayout == null || !newDetailMaskFrameLayout.animItemIsRunning()) ? 4.0f : 2.0f;
        }

        public float q() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de468", new Object[]{this})).floatValue() : x() ? 3.0f : 1.8f;
        }

        private boolean x() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue() : u() == 201;
        }

        public boolean F() {
            NewDetailMaskFrameLayout newDetailMaskFrameLayout;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
            }
            if (this.b == -1 && (newDetailMaskFrameLayout = this.f22005a) != null) {
                this.b = newDetailMaskFrameLayout.supportFullAlpha() ? 1 : 0;
            }
            return this.b == 1;
        }

        public boolean A() {
            NewDetailMaskFrameLayout newDetailMaskFrameLayout;
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : !x() || !F() || ((newDetailMaskFrameLayout = this.f22005a) != null && newDetailMaskFrameLayout.animItemIsRunning());
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f22004a;
        private c b;

        static {
            kge.a(-1759017570);
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

        public static /* synthetic */ b a(a aVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9cc11f7d", new Object[]{aVar, bVar});
            }
            aVar.f22004a = bVar;
            return bVar;
        }

        public static /* synthetic */ c a(a aVar, c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("29ae36bb", new Object[]{aVar, cVar});
            }
            aVar.b = cVar;
            return cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f22004a != null) {
                    b bVar = this.f22004a;
                    String c = this.f22004a.c();
                    bVar.a(c, "DelayTask runTask 开始执行: " + b());
                }
                a();
            } catch (Throwable th) {
                th.printStackTrace();
                b bVar2 = this.f22004a;
                if (bVar2 != null) {
                    bVar2.a(bVar2.c(), "未知异常，runTask . throwable  ", th);
                }
            }
            try {
                if (this.b == null || c.a(this.b)) {
                    return;
                }
                c.b(this.b);
                if (c.c(this.b) > 0) {
                    return;
                }
                c.a(this.b, true);
                if (this.f22004a == null) {
                    return;
                }
                this.f22004a.a(this.f22004a.c(), "on task end.mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
            } catch (Throwable th2) {
                b bVar3 = this.f22004a;
                if (bVar3 == null) {
                    return;
                }
                bVar3.a(bVar3.c(), "未知异常，runTask end.", th2);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private ArrayList<a> f22006a;
        private boolean b;
        private int c;
        private long d;
        private boolean e;
        private boolean f;
        private boolean g;
        private RecyclerView h;
        private Handler i;
        private b j;

        static {
            kge.a(-39333074);
        }

        public static /* synthetic */ int a(c cVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("716b41b9", new Object[]{cVar, new Integer(i)})).intValue();
            }
            cVar.c = i;
            return i;
        }

        public static /* synthetic */ long a(c cVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("716b457b", new Object[]{cVar, new Long(j)})).longValue();
            }
            cVar.d = j;
            return j;
        }

        public static /* synthetic */ Handler a(c cVar, Handler handler) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Handler) ipChange.ipc$dispatch("7fb9b619", new Object[]{cVar, handler});
            }
            cVar.i = handler;
            return handler;
        }

        public static /* synthetic */ b a(c cVar, b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3b3437f", new Object[]{cVar, bVar});
            }
            cVar.j = bVar;
            return bVar;
        }

        public static /* synthetic */ ArrayList a(c cVar, ArrayList arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("30c99447", new Object[]{cVar, arrayList});
            }
            cVar.f22006a = arrayList;
            return arrayList;
        }

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1c6ecce1", new Object[]{cVar})).booleanValue() : cVar.e;
        }

        public static /* synthetic */ boolean a(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("716b819b", new Object[]{cVar, new Boolean(z)})).booleanValue();
            }
            cVar.e = z;
            return z;
        }

        public static /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2272982f", new Object[]{cVar})).intValue();
            }
            int i = cVar.c;
            cVar.c = i - 1;
            return i;
        }

        public static /* synthetic */ boolean b(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2be1221c", new Object[]{cVar, new Boolean(z)})).booleanValue();
            }
            cVar.f = z;
            return z;
        }

        public static /* synthetic */ int c(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2876638e", new Object[]{cVar})).intValue() : cVar.c;
        }

        public static /* synthetic */ boolean c(c cVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e656c29d", new Object[]{cVar, new Boolean(z)})).booleanValue();
            }
            cVar.b = z;
            return z;
        }

        public static /* synthetic */ b d(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("af016350", new Object[]{cVar}) : cVar.j;
        }

        public static /* synthetic */ RecyclerView e(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView) ipChange.ipc$dispatch("66d33c4b", new Object[]{cVar}) : cVar.h;
        }

        public static /* synthetic */ boolean f(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a81c5bc", new Object[]{cVar})).booleanValue() : cVar.b;
        }

        public static /* synthetic */ ArrayList g(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("7ebc0371", new Object[]{cVar}) : cVar.f22006a;
        }

        public static /* synthetic */ boolean h(c cVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46895c7a", new Object[]{cVar})).booleanValue() : cVar.g;
        }

        private c() {
            this.j = new b();
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.j.a();
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c6de41f", new Object[]{this, aVar});
                return;
            }
            try {
                b(aVar);
            } catch (Throwable th) {
                b bVar = this.j;
                bVar.a(bVar.c(), "示知异常，任务入队失败。", th);
            }
        }

        public void b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2271af7e", new Object[]{this, aVar});
            } else if (aVar == null) {
            } else {
                if (this.j.l()) {
                    aVar.run();
                } else if (this.b) {
                    if (this.e) {
                        aVar.run();
                        return;
                    }
                    if (this.c <= 0) {
                        b bVar = this.j;
                        bVar.a(bVar.c(), "mHasStartProcessAllTask and mDelayTaskCount is 0 , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                        this.e = true;
                    } else if (System.currentTimeMillis() - this.d > 5000) {
                        b bVar2 = this.j;
                        bVar2.a(bVar2.c(), "mHasStartProcessAllTask and mDelayTaskStartProcessTime is timed out , all task have been processed. will set mHasProcessAllDelayTaskEnd");
                        this.e = true;
                    }
                    if (this.e) {
                        aVar.run();
                    } else if (aVar.c() > 0) {
                        if (this.i == null) {
                            this.i = new Handler(Looper.getMainLooper());
                        }
                        this.i.postDelayed(aVar, aVar.c());
                    } else {
                        aVar.run();
                    }
                } else {
                    if (this.f22006a == null) {
                        this.f22006a = new ArrayList<>(15);
                    }
                    a.a(aVar, this.j);
                    a.a(aVar, this);
                    this.f22006a.add(aVar);
                }
            }
        }
    }

    public NewDetailMaskFrameLayout(Context context) {
        super(context);
        this.mNewDetailMaskFrameLayoutContext = new c();
        this.mHasShowAnim = false;
        this.mHasSetBottomBarColor = false;
        this.mCurrentPageBottomBarColor = -1;
        this.mRootLayoutRealStartPreProcess = -1.0f;
        this.mRootLayoutRealStartProcess = -1.0f;
        this.val_animItemIsRunning = -1;
        init(context);
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNewDetailMaskFrameLayoutContext = new c();
        this.mHasShowAnim = false;
        this.mHasSetBottomBarColor = false;
        this.mCurrentPageBottomBarColor = -1;
        this.mRootLayoutRealStartPreProcess = -1.0f;
        this.mRootLayoutRealStartProcess = -1.0f;
        this.val_animItemIsRunning = -1;
        init(context);
    }

    public NewDetailMaskFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mNewDetailMaskFrameLayoutContext = new c();
        this.mHasShowAnim = false;
        this.mHasSetBottomBarColor = false;
        this.mCurrentPageBottomBarColor = -1;
        this.mRootLayoutRealStartPreProcess = -1.0f;
        this.mRootLayoutRealStartProcess = -1.0f;
        this.val_animItemIsRunning = -1;
        init(context);
    }

    public void setMaskFrameLayoutHandler(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c5f157e", new Object[]{this, bVar});
            return;
        }
        b.a(bVar, this);
        c.a(this.mNewDetailMaskFrameLayoutContext, bVar);
    }

    public c getNewDetailMaskFrameLayoutContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("29179c7b", new Object[]{this}) : this.mNewDetailMaskFrameLayoutContext;
    }

    private void initScreenSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a289c4", new Object[]{this});
        } else if (this.mScreenWidth > 0 && this.mScreenHeight > 0) {
        } else {
            this.mScreenWidth = getScreenWidth(this.mContext);
            this.mScreenHeight = getScreenHeight(this.mContext);
        }
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
        c.a(this.mNewDetailMaskFrameLayoutContext, this.mHandler);
        this.mContext = getContext();
        Context context = this.mContext;
        if (!(context instanceof Activity)) {
            return;
        }
        this.mActivity = (Activity) context;
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
        if (!c.d(this.mNewDetailMaskFrameLayoutContext).a()) {
            return false;
        }
        initActivityAndAlpha();
        if (this.mContext == null) {
            return false;
        }
        initScreenSize();
        if (this.mScreenWidth <= 0 || this.mScreenHeight <= 0) {
            b maskHandler = getMaskHandler();
            String logTag = getLogTag();
            maskHandler.a(logTag, "initAnim error, initScreenSize error . mScreenWidth = " + this.mScreenWidth + " mScreenHeight = " + this.mScreenHeight);
            return false;
        }
        Activity activity = this.mActivity;
        if (activity == null) {
            c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "initAnim 出错。mActivity 为空。");
            checkAndTryProcessDelayTask();
            return false;
        } else if (!sfc.a(activity)) {
            checkAndTryProcessDelayTask();
            return false;
        } else {
            this.mDeviceScore = getDeviceScore();
            this.mHasConvertActivityToTranslucent = true;
            final int i = ((100 - this.mDeviceScore) * (this.mDeviceScore > c.d(this.mNewDetailMaskFrameLayoutContext).g() ? 20 : 40)) + 800;
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.1
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
                        c.b(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                        try {
                            NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                        } catch (Throwable th) {
                            b d2 = c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this));
                            String c2 = c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c();
                            d2.a(c2, "resumeLayout with error. currentCheckActivityTime = " + i, th);
                        }
                        if (!NewDetailMaskFrameLayout.access$1600(NewDetailMaskFrameLayout.this)) {
                            return;
                        }
                        NewDetailMaskFrameLayout.this.autoCheckAnimEndStatusForV2();
                    }
                }
            }, i);
            c.b(this.mNewDetailMaskFrameLayoutContext, true);
            createMaskView();
            if (getMaskHandler().A()) {
                if (!createScaleImageView()) {
                    checkAndTryProcessDelayTask();
                    return false;
                }
            } else if (!initBasicScaleViewData()) {
                checkAndTryProcessDelayTask();
                return false;
            }
            if (getMaskHandler().z()) {
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
            sfc.b((Activity) getContext());
            this.mHasConvertActivityFromTranslucent = true;
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
        } else if (c.d(this.mNewDetailMaskFrameLayoutContext).l()) {
        } else {
            this.mFrozenLayoutCount++;
            if (c.e(this.mNewDetailMaskFrameLayoutContext) == null || c.e(this.mNewDetailMaskFrameLayoutContext).isLayoutFrozen()) {
                return;
            }
            c.e(this.mNewDetailMaskFrameLayoutContext).setLayoutFrozen(true);
        }
    }

    private void resumeNoneCoreLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef05d815", new Object[]{this});
        } else if (c.d(this.mNewDetailMaskFrameLayoutContext).l() || (i = this.mFrozenLayoutCount) <= 0) {
        } else {
            this.mFrozenLayoutCount = i - 1;
            if (c.e(this.mNewDetailMaskFrameLayoutContext) == null) {
                return;
            }
            c.e(this.mNewDetailMaskFrameLayoutContext).setLayoutFrozen(false);
        }
    }

    private void frozenOuterNoneCoreLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6977ca23", new Object[]{this});
        } else if (c.d(this.mNewDetailMaskFrameLayoutContext).l()) {
        } else {
            this.mFrozenOutLayoutCount++;
            c.d(this.mNewDetailMaskFrameLayoutContext);
        }
    }

    private void resumeOuterNoneCoreLayout() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401325f6", new Object[]{this});
        } else if (c.d(this.mNewDetailMaskFrameLayoutContext).l() || (i = this.mFrozenOutLayoutCount) <= 0) {
        } else {
            this.mFrozenOutLayoutCount = i - 1;
            c.d(this.mNewDetailMaskFrameLayoutContext);
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
            c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "新转场完成后，非核心任务恢复出错。", th);
        }
    }

    private void directProcessDelayTask() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26025989", new Object[]{this});
        } else if (c.f(this.mNewDetailMaskFrameLayoutContext)) {
        } else {
            c.c(this.mNewDetailMaskFrameLayoutContext, true);
            ArrayList g = c.g(this.mNewDetailMaskFrameLayoutContext);
            c.a(this.mNewDetailMaskFrameLayoutContext, (ArrayList) null);
            if (g == null || g.isEmpty()) {
                return;
            }
            c.a(this.mNewDetailMaskFrameLayoutContext, g.size());
            c.a(this.mNewDetailMaskFrameLayoutContext, System.currentTimeMillis());
            Iterator it = g.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                i++;
                this.mHandler.postDelayed(aVar, i + aVar.c());
            }
        }
    }

    private void saveCurrentBottomBarColor(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b499090", new Object[]{this, activity});
        } else if (!c.d(this.mNewDetailMaskFrameLayoutContext).t()) {
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
                if (!c.d(this.mNewDetailMaskFrameLayoutContext).s() && intExtra < 0) {
                    return;
                }
                setBottomBarColor(activity, intExtra, c.d(this.mNewDetailMaskFrameLayoutContext).s());
            } catch (Throwable th) {
                c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "未知异常。 BottomBarColor 处理失败。Pre 。", th);
            }
        }
    }

    public static int getBottomBarColor(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b59b4363", new Object[]{context})).intValue();
        }
        if ((context instanceof Activity) && Build.VERSION.SDK_INT >= 21) {
            return ((Activity) context).getWindow().getNavigationBarColor();
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
            if (c.d(this.mNewDetailMaskFrameLayoutContext).s()) {
                setBottomBarColor(this.mActivity, this.mCurrentPageBottomBarColor, true);
            } else {
                setBottomBarColor(this.mActivity, this.mCurrentPageBottomBarColor < 0 ? -16777216 : this.mCurrentPageBottomBarColor, c.d(this.mNewDetailMaskFrameLayoutContext).s());
            }
        } catch (Throwable th) {
            c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "未知异常。 BottomBarColor 处理失败。Current 。", th);
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
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.2
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a6ef26d", new Object[]{this});
        } else if (this.mHasShowAnim) {
        } else {
            this.mHasShowAnim = true;
            ImageView imageView = this.mScaleImageView;
            if (imageView == null) {
                return;
            }
            int i3 = this.mScreenWidth;
            float f = this.mImageViewStartWidth;
            int i4 = this.mScreenHeight;
            float f2 = this.mImageViewStartHeight;
            float f3 = (int) (i3 - f);
            float f4 = (int) (i4 - f2);
            final float f5 = i4 / f2;
            final float f6 = i3 / f;
            final float f7 = (-(this.mImageViewStartLeftMargin / f3)) * f3;
            final float f8 = (-(this.mImageViewStartTopMargin / f4)) * f4;
            imageView.setPivotX(0.0f);
            this.mScaleImageView.setPivotY(0.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            int d2 = c.d(this.mNewDetailMaskFrameLayoutContext).d();
            int b2 = c.d(this.mNewDetailMaskFrameLayoutContext).b();
            if (b2 > 0) {
                long j = c.d(this.mNewDetailMaskFrameLayoutContext).j();
                if (sFrameSpeedAvgDuration > j) {
                    int e2 = c.d(this.mNewDetailMaskFrameLayoutContext).e();
                    int f9 = c.d(this.mNewDetailMaskFrameLayoutContext).f();
                    int g = c.d(this.mNewDetailMaskFrameLayoutContext).g();
                    int i5 = g - c.d(this.mNewDetailMaskFrameLayoutContext).i();
                    float f10 = (float) (b2 * (sFrameSpeedAvgDuration - j));
                    if (f9 == -2 || (i2 = this.mDeviceScore) <= i5 || i2 >= 101) {
                        i = 0;
                    } else {
                        if (i2 > g) {
                            i = (Math.min(c.d(this.mNewDetailMaskFrameLayoutContext).h(), this.mDeviceScore) - g) * f9;
                        } else {
                            i = ((i2 - i5) * f9) / 2;
                        }
                        e2 -= i;
                        f10 = Math.max(f10 - i, 0.0f);
                    }
                    int i6 = (int) (d2 + f10);
                    if (i6 > e2) {
                        i6 = e2;
                    }
                    if (i6 >= d2) {
                        d2 = i6;
                    }
                    c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "animDuration frameSpeedDuration Result: " + d2 + " sFrameSpeedAvgDuration: " + sFrameSpeedAvgDuration + " DeviceScore:" + this.mDeviceScore + " deviceMultiplier:" + f9 + " deviceReduce:" + i);
                }
            }
            ofFloat.setDuration(d2);
            ofFloat.setInterpolator(c.d(this.mNewDetailMaskFrameLayoutContext).k());
            final float f11 = this.mImageViewStartWidth / this.mScreenWidth;
            final float f12 = this.mImageViewStartHeight / this.mScreenHeight;
            setPivotX(0.0f);
            setPivotY(0.0f);
            setScaleX(f11);
            setScaleY(f12);
            setTranslationX(this.mImageViewStartLeftMargin);
            setTranslationY(this.mImageViewStartTopMargin);
            final boolean w = c.d(this.mNewDetailMaskFrameLayoutContext).w();
            final float o = w ? 0.8f : c.d(this.mNewDetailMaskFrameLayoutContext).o();
            float p = w ? 0.0f : c.d(this.mNewDetailMaskFrameLayoutContext).p();
            final float f13 = o * p;
            final float q = c.d(this.mNewDetailMaskFrameLayoutContext).q();
            final float f14 = q * 1.5f;
            final boolean r = c.d(this.mNewDetailMaskFrameLayoutContext).r();
            final float f15 = p;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.3
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
                        if (r) {
                            if (floatValue < 0.2d) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(Math.min(5.0f * floatValue, 1.0f));
                            } else if (!NewDetailMaskFrameLayout.access$2700(NewDetailMaskFrameLayout.this)) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(1.0f);
                                NewDetailMaskFrameLayout.access$2702(NewDetailMaskFrameLayout.this, true);
                            }
                        }
                        if ((!w || !c.h(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this))) && floatValue <= o) {
                            NewDetailMaskFrameLayout.access$3102(NewDetailMaskFrameLayout.this, floatValue);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - (f15 * floatValue));
                        } else if (!NewDetailMaskFrameLayout.access$2900(NewDetailMaskFrameLayout.this)) {
                            if (NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this) < 0.0f) {
                                NewDetailMaskFrameLayout.access$3002(NewDetailMaskFrameLayout.this, NewDetailMaskFrameLayout.access$3100(NewDetailMaskFrameLayout.this) > 0.0f ? NewDetailMaskFrameLayout.access$3100(NewDetailMaskFrameLayout.this) : floatValue);
                            }
                            float access$3000 = ((floatValue - NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this)) * q) + f13;
                            float min = Math.min(((floatValue - NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this)) * f14) + f13, 1.0f);
                            if (access$3000 > 1.0f) {
                                NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                                NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(0.0f);
                            } else {
                                NewDetailMaskFrameLayout.this.setAlpha(min);
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - access$3000);
                            }
                        }
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationX(f7 * floatValue);
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationY(f8 * floatValue);
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleX(((f6 - 1.0f) * floatValue) + 1.0f);
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleY(((f5 - 1.0f) * floatValue) + 1.0f);
                        NewDetailMaskFrameLayout.this.setScaleX(((1.0f - f11) * floatValue) + f11);
                        NewDetailMaskFrameLayout.this.setScaleY(((1.0f - f12) * floatValue) + f12);
                        float f16 = 1.0f - floatValue;
                        NewDetailMaskFrameLayout.this.setTranslationX(NewDetailMaskFrameLayout.access$3300(NewDetailMaskFrameLayout.this) * f16);
                        NewDetailMaskFrameLayout.this.setTranslationY(NewDetailMaskFrameLayout.access$3400(NewDetailMaskFrameLayout.this) * f16);
                        if ((c.h(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)) && !NewDetailMaskFrameLayout.access$3500(NewDetailMaskFrameLayout.this) && NewDetailMaskFrameLayout.access$3610(NewDetailMaskFrameLayout.this) < 0) || c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m()) {
                            NewDetailMaskFrameLayout.access$3502(NewDetailMaskFrameLayout.this, true);
                            NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                            c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
                        }
                        if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this) && floatValue > 0.9f) {
                            NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                        }
                        NewDetailMaskFrameLayout.this.invalidate();
                    } catch (Throwable th) {
                        NewDetailMaskFrameLayout.access$2502(NewDetailMaskFrameLayout.this, true);
                        c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "", th);
                    }
                }
            });
            ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.4
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
                        if (!c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).n()) {
                            return;
                        }
                        NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                    } catch (Throwable th) {
                        c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "动画开始时，场景冻结出错。", th);
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
                        c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "新转场完成后，主页面恢复失败。", th);
                    }
                    if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                        return;
                    }
                    c.b(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                    if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this)) {
                        NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                    }
                    NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                    NewDetailMaskFrameLayout.this.setScaleX(1.0f);
                    NewDetailMaskFrameLayout.this.setScaleY(1.0f);
                    NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                    NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                    NewDetailMaskFrameLayout.access$1000(NewDetailMaskFrameLayout.this);
                    NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                    if (NewDetailMaskFrameLayout.access$3000(NewDetailMaskFrameLayout.this) < 0.0f) {
                        float alpha = NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).getAlpha();
                        if (alpha > 0.001f) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(alpha, 0.0f);
                            alphaAnimation.setFillAfter(true);
                            alphaAnimation.setDuration(500L);
                            alphaAnimation.setInterpolator(new LinearInterpolator());
                            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.4.1
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
                                    } else {
                                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                                    }
                                }
                            });
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).startAnimation(alphaAnimation);
                        } else {
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                        }
                    } else {
                        NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                    }
                    try {
                        NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$4102(NewDetailMaskFrameLayout.this, 0);
                        NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$4202(NewDetailMaskFrameLayout.this, 0);
                    } catch (Throwable th2) {
                        c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "新转场完成后，主视图恢复出错。", th2);
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
        } else if (this.mActivity == null || this.mContext == null || this.mParentFrameLayout == null || !c.d(this.mNewDetailMaskFrameLayoutContext).r()) {
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
        if (this.mActivity != null && (context = this.mContext) != null && this.mParentFrameLayout != null) {
            this.mScaleImageView = new ImageView(context);
            Intent intent = this.mActivity.getIntent();
            this.mActivityBundle = intent.getBundleExtra("nav_animation_extra");
            Bundle bundle = this.mActivityBundle;
            if (bundle == null) {
                c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "createScaleImageView bundle is null.");
                return false;
            }
            this.mImageViewScreenStartX = bundle.getFloat("view_screen_start_x", -1.0f);
            this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
            this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
            this.mImageViewStartWidth = this.mActivityBundle.getFloat("view_width", -1.0f);
            if (supportFullAlpha()) {
                float cardMainImageViewHeight = getCardMainImageViewHeight(intent);
                if (cardMainImageViewHeight > 0.0f) {
                    this.mImageViewStartHeight = cardMainImageViewHeight;
                }
                if (this.mScreenWidth <= 0) {
                    initScreenSize();
                }
                float f = (this.mImageViewStartWidth * this.mScreenHeight) / this.mScreenWidth;
                this.mImageViewScreenStartY += (f - this.mImageViewStartHeight) / 2.0f;
                this.mImageViewStartHeight = f;
            }
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
                        if (animItemIsRunning()) {
                            BitmapBinder currentFrameBitmapBinder = getCurrentFrameBitmapBinder();
                            if (currentFrameBitmapBinder == null) {
                                Drawable a2 = d.a(this.mActivity);
                                if (a2 != null) {
                                    c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "startProcessAnim ,animItemIsRunning sourceDrawable is not null");
                                    this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    this.mScaleImageView.setImageDrawable(a2);
                                    return true;
                                }
                            } else {
                                Bitmap bitmap2 = currentFrameBitmapBinder.getBitmap();
                                if (bitmap2 == null) {
                                    Drawable drawable = currentFrameBitmapBinder.getDrawable();
                                    if (drawable != null) {
                                        c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "startProcessAnim ,animItemIsRunning currentFrameBinder drawable is not null");
                                        this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                        this.mScaleImageView.setImageDrawable(drawable);
                                        return true;
                                    }
                                } else {
                                    c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "startProcessAnim ,animItemIsRunning currentFrameBinder bitmap is not null");
                                    this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    this.mScaleImageView.setImageBitmap(bitmap2);
                                    return true;
                                }
                            }
                        }
                        BitmapBinder bitmapBinder = (BitmapBinder) this.mActivityBundle.getBinder("view_screenshot");
                        if (bitmapBinder != null && (bitmap = bitmapBinder.getBitmap()) != null) {
                            c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "startProcessAnim bitmap is not null");
                            this.mScaleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            this.mScaleImageView.setImageBitmap(bitmap);
                        }
                    }
                    return true;
                }
            }
            c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
        }
        return false;
    }

    private b getMaskHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("b3d240a5", new Object[]{this}) : c.d(this.mNewDetailMaskFrameLayoutContext);
    }

    private String getLogTag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this}) : c.d(this.mNewDetailMaskFrameLayoutContext).c();
    }

    private boolean isV1Version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("770f1ade", new Object[]{this})).booleanValue() : c.d(this.mNewDetailMaskFrameLayoutContext).u() <= 101;
    }

    private boolean isV2Version() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ec0c03d", new Object[]{this})).booleanValue() : c.d(this.mNewDetailMaskFrameLayoutContext).u() <= 201;
    }

    private void startFrameLayoutAnimV2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4c6d89", new Object[]{this});
        } else if (this.mHasShowAnim) {
        } else {
            this.mHasShowAnim = true;
            b.a(getMaskHandler(), this);
            if (getMaskHandler().F()) {
                setAlpha(1.0f);
            }
            int i = this.mScreenWidth;
            float f = this.mImageViewStartWidth;
            int i2 = this.mScreenHeight;
            float f2 = this.mImageViewStartHeight;
            float f3 = (int) (i - f);
            float f4 = (int) (i2 - f2);
            final float f5 = i2 / f2;
            final float f6 = i / f;
            final float f7 = (-(this.mImageViewStartLeftMargin / f3)) * f3;
            final float f8 = (-(this.mImageViewStartTopMargin / f4)) * f4;
            final boolean z = this.mScaleImageView != null && getMaskHandler().A();
            if (z) {
                this.mScaleImageView.setPivotX(0.0f);
                this.mScaleImageView.setPivotY(0.0f);
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(d.a(getMaskHandler().d(), getMaskHandler()));
            ofFloat.setInterpolator(getMaskHandler().k());
            final float f9 = this.mImageViewStartWidth / this.mScreenWidth;
            final float f10 = this.mImageViewStartHeight / this.mScreenHeight;
            setPivotX(0.0f);
            setPivotY(0.0f);
            setScaleX(f9);
            setScaleY(f10);
            setTranslationX(this.mImageViewStartLeftMargin);
            setTranslationY(this.mImageViewStartTopMargin);
            final float p = getMaskHandler().p();
            final float E = getMaskHandler().E();
            final float q = getMaskHandler().q();
            if (getMaskHandler().y()) {
                bindItemCardMainView(this.mParentFrameLayout);
            }
            final boolean r = c.d(this.mNewDetailMaskFrameLayoutContext).r();
            final boolean z2 = z;
            addAnimAllListenerAndStartAnim(ofFloat, new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.5
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
                        if (r) {
                            if (floatValue < 0.2d) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(Math.min(5.0f * floatValue, 1.0f));
                            } else if (!NewDetailMaskFrameLayout.access$2700(NewDetailMaskFrameLayout.this)) {
                                NewDetailMaskFrameLayout.access$2600(NewDetailMaskFrameLayout.this).setAlpha(1.0f);
                                NewDetailMaskFrameLayout.access$2702(NewDetailMaskFrameLayout.this, true);
                            }
                        }
                        if (NewDetailMaskFrameLayout.access$4500(NewDetailMaskFrameLayout.this).F()) {
                            NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                            NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                        }
                        if (!NewDetailMaskFrameLayout.access$2900(NewDetailMaskFrameLayout.this)) {
                            float f11 = q * floatValue;
                            if (f11 > 1.0f) {
                                NewDetailMaskFrameLayout.access$2902(NewDetailMaskFrameLayout.this, true);
                                NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                            } else {
                                NewDetailMaskFrameLayout.this.setAlpha(f11);
                            }
                        }
                        if (z2) {
                            float f12 = E > 0.0f ? floatValue > E ? (floatValue - E) * p : 0.0f : p * floatValue;
                            if (NewDetailMaskFrameLayout.access$4600(NewDetailMaskFrameLayout.this) || f12 <= 1.0f) {
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(1.0f - f12);
                            } else {
                                NewDetailMaskFrameLayout.access$4602(NewDetailMaskFrameLayout.this, true);
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                                NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setAlpha(0.0f);
                            }
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationX(f7 * floatValue);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setTranslationY(f8 * floatValue);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleX(((f6 - 1.0f) * floatValue) + 1.0f);
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setScaleY(((f5 - 1.0f) * floatValue) + 1.0f);
                        }
                        NewDetailMaskFrameLayout.this.setScaleX(((1.0f - f9) * floatValue) + f9);
                        NewDetailMaskFrameLayout.this.setScaleY(((1.0f - f10) * floatValue) + f10);
                        float f13 = 1.0f - floatValue;
                        NewDetailMaskFrameLayout.this.setTranslationX(NewDetailMaskFrameLayout.access$3300(NewDetailMaskFrameLayout.this) * f13);
                        NewDetailMaskFrameLayout.this.setTranslationY(NewDetailMaskFrameLayout.access$3400(NewDetailMaskFrameLayout.this) * f13);
                        if ((c.h(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)) && !NewDetailMaskFrameLayout.access$3500(NewDetailMaskFrameLayout.this) && NewDetailMaskFrameLayout.access$3610(NewDetailMaskFrameLayout.this) < 0) || c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).m()) {
                            NewDetailMaskFrameLayout.access$3502(NewDetailMaskFrameLayout.this, true);
                            NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                            c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "on onAnimationUpdate,frozenOuterNoneCoreLayout");
                        }
                        if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this) && floatValue > 0.9f) {
                            NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                        }
                        NewDetailMaskFrameLayout.this.invalidate();
                    } catch (Throwable th) {
                        NewDetailMaskFrameLayout.access$2502(NewDetailMaskFrameLayout.this, true);
                        c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "", th);
                    }
                }
            }, new Animator.AnimatorListener() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.6
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
                        if (!c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).n()) {
                            return;
                        }
                        NewDetailMaskFrameLayout.access$3700(NewDetailMaskFrameLayout.this);
                        NewDetailMaskFrameLayout.access$3800(NewDetailMaskFrameLayout.this);
                    } catch (Throwable th) {
                        c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "动画开始时，场景冻结出错。", th);
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else if (NewDetailMaskFrameLayout.access$900(NewDetailMaskFrameLayout.this)) {
                    } else {
                        c.b(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this), false);
                        if (!NewDetailMaskFrameLayout.access$3900(NewDetailMaskFrameLayout.this)) {
                            NewDetailMaskFrameLayout.access$4000(NewDetailMaskFrameLayout.this);
                        }
                        NewDetailMaskFrameLayout.this.setAlpha(1.0f);
                        NewDetailMaskFrameLayout.this.setScaleX(1.0f);
                        NewDetailMaskFrameLayout.this.setScaleY(1.0f);
                        NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                        NewDetailMaskFrameLayout.this.setTranslationX(0.0f);
                        NewDetailMaskFrameLayout.this.getMainHandler().postDelayed(new Runnable() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.6.1
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
                        }, NewDetailMaskFrameLayout.access$4500(NewDetailMaskFrameLayout.this).v());
                        if (z) {
                            NewDetailMaskFrameLayout.access$3200(NewDetailMaskFrameLayout.this).setVisibility(8);
                        }
                        try {
                            NewDetailMaskFrameLayout.access$1400(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$4102(NewDetailMaskFrameLayout.this, 0);
                            NewDetailMaskFrameLayout.access$1500(NewDetailMaskFrameLayout.this);
                            NewDetailMaskFrameLayout.access$4202(NewDetailMaskFrameLayout.this, 0);
                        } catch (Throwable th) {
                            c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).a(c.d(NewDetailMaskFrameLayout.access$1200(NewDetailMaskFrameLayout.this)).c(), "新转场完成后，主视图恢复出错。", th);
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
            if (getMaskHandler().B()) {
                e eVar = new e();
                e.a(eVar, animatorUpdateListener);
                e.a(eVar, valueAnimator);
                e.a(eVar, animatorListener);
                int C = getMaskHandler().C();
                if (C > 0) {
                    if (getMaskHandler().D() > 0) {
                        if (sFrameSpeedAvgDuration > getMaskHandler().D()) {
                            i = 16;
                        } else {
                            C = (C << 1) / 3;
                            i = 18;
                        }
                        e.a(eVar, i);
                    }
                    e.b(eVar, C);
                    b maskHandler = getMaskHandler();
                    String logTag = getLogTag();
                    maskHandler.a(logTag, "TikTest customVerticalSyncAnimation currentRealMinFrameFit:" + e.a(eVar) + " frameMaxCount:" + e.b(eVar));
                    z = eVar.a();
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
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f055d9f5", new Object[]{this, new Integer(i)})).intValue() : i < getMaskHandler().d() + 200 ? getMaskHandler().d() + 200 : i;
    }

    public void bindItemCardMainView(View view) {
        Drawable a2;
        ImageView imageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a3142ed", new Object[]{this, view});
        } else if (!this.mNewDetailMaskFrameLayoutContext.a() || view == null || (a2 = d.a(view.getContext())) == null) {
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
                    b maskHandler = getMaskHandler();
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

    private float getCardMainImageViewHeight(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47c866bc", new Object[]{this, intent})).floatValue();
        }
        if (intent != null) {
            return intent.getFloatExtra("anim_main_image_view_height", -1.0f);
        }
        return -1.0f;
    }

    private boolean initBasicScaleViewData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a000ea06", new Object[]{this})).booleanValue();
        }
        Activity activity = this.mActivity;
        if (activity != null && this.mContext != null && this.mParentFrameLayout != null) {
            Intent intent = activity.getIntent();
            this.mActivityBundle = intent.getBundleExtra("nav_animation_extra");
            Bundle bundle = this.mActivityBundle;
            if (bundle == null) {
                c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "createScaleImageView bundle is null.");
                return false;
            }
            this.mImageViewScreenStartX = bundle.getFloat("view_screen_start_x", -1.0f);
            this.mImageViewScreenStartY = this.mActivityBundle.getFloat("view_screen_start_y", -1.0f);
            this.mImageViewStartHeight = this.mActivityBundle.getFloat("view_height", -1.0f);
            this.mImageViewStartWidth = this.mActivityBundle.getFloat("view_width", -1.0f);
            float cardMainImageViewHeight = getCardMainImageViewHeight(intent);
            if (cardMainImageViewHeight > 0.0f) {
                this.mImageViewStartHeight = cardMainImageViewHeight;
            }
            if (supportFullAlpha()) {
                if (this.mScreenWidth <= 0) {
                    initScreenSize();
                }
                float f = (this.mImageViewStartWidth * this.mScreenHeight) / this.mScreenWidth;
                this.mImageViewScreenStartY -= (f - this.mImageViewStartHeight) / 2.0f;
                this.mImageViewStartHeight = f;
            }
            if (this.mImageViewStartHeight <= 0.0f || this.mImageViewStartWidth <= 0.0f) {
                c.d(this.mNewDetailMaskFrameLayoutContext).a(c.d(this.mNewDetailMaskFrameLayoutContext).c(), "error width or height ,abort anim .mImageViewStartHeight = " + this.mImageViewStartHeight + " mImageViewStartWidth =" + this.mImageViewStartWidth);
            } else {
                this.mImageViewStartLeftMargin = (int) this.mImageViewScreenStartX;
                this.mImageViewStartTopMargin = (int) this.mImageViewScreenStartY;
                return true;
            }
        }
        return false;
    }

    public BitmapBinder getCurrentFrameBitmapBinder() {
        Intent intent;
        Bundle extras;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapBinder) ipChange.ipc$dispatch("b1c0995c", new Object[]{this});
        }
        Activity activity = this.mActivity;
        if (activity != null && (intent = activity.getIntent()) != null && (extras = intent.getExtras()) != null && extras.containsKey("anim_item_running_frame")) {
            return (BitmapBinder) extras.getBinder("anim_item_running_frame");
        }
        return null;
    }

    public boolean animItemIsRunning() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb108cdc", new Object[]{this})).booleanValue();
        }
        if (this.val_animItemIsRunning == -1) {
            Intent intent = this.mActivity.getIntent();
            if (intent != null && intent.getBooleanExtra("anim_item_is_running", false)) {
                this.val_animItemIsRunning = 1;
            } else {
                this.val_animItemIsRunning = 0;
            }
        }
        return this.val_animItemIsRunning == 1;
    }

    public boolean supportFullAlpha() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70a2dd8b", new Object[]{this})).booleanValue();
        }
        Intent intent = this.mActivity.getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("anim_item_support_full_alpha", false);
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

    /* loaded from: classes8.dex */
    public static class d {
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

        static {
            kge.a(2108835034);
        }

        public static /* synthetic */ int a(int i, b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("568bd3de", new Object[]{new Integer(i), bVar})).intValue() : b(i, bVar);
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

        private static Bundle b(Context context) {
            Intent intent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("797e0b03", new Object[]{context});
            }
            if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
                return null;
            }
            return intent.getBundleExtra("nav_animation_extra");
        }

        private static BitmapBinder a(Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapBinder) ipChange.ipc$dispatch("41146e7a", new Object[]{bundle});
            }
            if (bundle == null || Build.VERSION.SDK_INT < 18) {
                return null;
            }
            return (BitmapBinder) bundle.getBinder("view_source_drawable");
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

        private static int b(int i, b bVar) {
            IpChange ipChange = $ipChange;
            int i2 = 0;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1101745f", new Object[]{new Integer(i), bVar})).intValue();
            }
            int deviceScore = NewDetailMaskFrameLayout.getDeviceScore();
            int b = bVar.b();
            if (b > 0) {
                long j = bVar.j();
                if (NewDetailMaskFrameLayout.access$2300() > j) {
                    int e = bVar.e();
                    int f = bVar.f();
                    int g = bVar.g();
                    int i3 = g - bVar.i();
                    float access$2300 = (float) ((NewDetailMaskFrameLayout.access$2300() - j) * b);
                    if (f != -2 && deviceScore > i3 && deviceScore < 101) {
                        if (deviceScore > g) {
                            i2 = (Math.min(bVar.h(), deviceScore) - g) * f;
                        } else {
                            i2 = ((deviceScore - i3) * f) / 2;
                        }
                        e -= i2;
                        access$2300 = Math.max(access$2300 - i2, 0.0f);
                    }
                    int i4 = (int) (i + access$2300);
                    if (i4 > e) {
                        i4 = e;
                    }
                    if (i4 >= i) {
                        i = i4;
                    }
                    bVar.a(bVar.c(), "animDuration frameSpeedDuration Result: " + i + " sFrameSpeedAvgDuration: " + NewDetailMaskFrameLayout.access$2300() + " DeviceScore:" + deviceScore + " deviceMultiplier:" + f + " deviceReduce:" + i2);
                }
            }
            return i;
        }
    }

    /* loaded from: classes8.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private int f22007a;
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
            kge.a(1156167131);
        }

        private e() {
            this.f22007a = 12;
            this.b = 1;
            this.i = 0L;
            this.j = 0L;
        }

        public static /* synthetic */ float a(e eVar, float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("71876575", new Object[]{eVar, new Float(f)})).floatValue();
            }
            eVar.h = f;
            return f;
        }

        public static /* synthetic */ int a(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1c6fb58e", new Object[]{eVar})).intValue() : eVar.f;
        }

        public static /* synthetic */ int a(e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("718770bb", new Object[]{eVar, new Integer(i)})).intValue();
            }
            eVar.f = i;
            return i;
        }

        public static /* synthetic */ long a(e eVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7187747d", new Object[]{eVar, new Long(j)})).longValue();
            }
            eVar.i = j;
            return j;
        }

        public static /* synthetic */ Animator.AnimatorListener a(e eVar, Animator.AnimatorListener animatorListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator.AnimatorListener) ipChange.ipc$dispatch("a6c4e7dd", new Object[]{eVar, animatorListener});
            }
            eVar.e = animatorListener;
            return animatorListener;
        }

        public static /* synthetic */ ValueAnimator.AnimatorUpdateListener a(e eVar, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("14e6b59b", new Object[]{eVar, animatorUpdateListener});
            }
            eVar.c = animatorUpdateListener;
            return animatorUpdateListener;
        }

        public static /* synthetic */ ValueAnimator a(e eVar, ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ValueAnimator) ipChange.ipc$dispatch("b39a675d", new Object[]{eVar, valueAnimator});
            }
            eVar.d = valueAnimator;
            return valueAnimator;
        }

        public static /* synthetic */ int b(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("227380ed", new Object[]{eVar})).intValue() : eVar.f22007a;
        }

        public static /* synthetic */ int b(e eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2bfd113c", new Object[]{eVar, new Integer(i)})).intValue();
            }
            eVar.f22007a = i;
            return i;
        }

        public static /* synthetic */ long b(e eVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2bfd14fe", new Object[]{eVar, new Long(j)})).longValue();
            }
            eVar.j = j;
            return j;
        }

        public static /* synthetic */ float c(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("28774c49", new Object[]{eVar})).floatValue() : eVar.h;
        }

        public static /* synthetic */ int d(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2e7b17ab", new Object[]{eVar})).intValue() : eVar.b;
        }

        public static /* synthetic */ ValueAnimator e(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("1fb1307b", new Object[]{eVar}) : eVar.g;
        }

        public static /* synthetic */ ValueAnimator.AnimatorUpdateListener f(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueAnimator.AnimatorUpdateListener) ipChange.ipc$dispatch("dcd31a14", new Object[]{eVar}) : eVar.c;
        }

        public static /* synthetic */ ValueAnimator g(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ValueAnimator) ipChange.ipc$dispatch("1dfe4f39", new Object[]{eVar}) : eVar.d;
        }

        public static /* synthetic */ Animator.AnimatorListener h(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Animator.AnimatorListener) ipChange.ipc$dispatch("13877d98", new Object[]{eVar}) : eVar.e;
        }

        public static /* synthetic */ long i(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4c8e1087", new Object[]{eVar})).longValue() : eVar.i;
        }

        public static /* synthetic */ long j(e eVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5291dbe6", new Object[]{eVar})).longValue() : eVar.j;
        }

        public static /* synthetic */ int k(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5895a744", new Object[]{eVar})).intValue();
            }
            int i = eVar.b;
            eVar.b = i + 1;
            return i;
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            if (this.c != null && this.d != null && this.e != null) {
                this.g = new ValueAnimator() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.e.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.animation.ValueAnimator
                    public Object getAnimatedValue() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e009a6b3", new Object[]{this}) : Float.valueOf(e.c(e.this));
                    }
                };
                if (Build.VERSION.SDK_INT >= 16) {
                    final Choreographer choreographer = Choreographer.getInstance();
                    Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.e.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.Choreographer.FrameCallback
                        public void doFrame(long j) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
                            } else if (e.d(e.this) > e.b(e.this)) {
                                e.a(e.this, 1.0f);
                                e.f(e.this).onAnimationUpdate(e.e(e.this));
                                e.h(e.this).onAnimationEnd(e.g(e.this));
                            } else {
                                e.b(e.this, System.currentTimeMillis());
                                if (e.j(e.this) - e.i(e.this) < e.a(e.this)) {
                                    choreographer.postFrameCallback(this);
                                    return;
                                }
                                e eVar = e.this;
                                e.a(eVar, e.j(eVar));
                                e eVar2 = e.this;
                                e.a(eVar2, e.d(eVar2) / e.b(e.this));
                                e.f(e.this).onAnimationUpdate(e.e(e.this));
                                choreographer.postFrameCallback(this);
                                e.k(e.this);
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
