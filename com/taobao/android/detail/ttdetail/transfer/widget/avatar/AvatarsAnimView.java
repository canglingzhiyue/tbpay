package com.taobao.android.detail.ttdetail.transfer.widget.avatar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.o;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.mto;
import tb.riy;

/* loaded from: classes5.dex */
public class AvatarsAnimView extends DXNativeFrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AvatarAnimationView";
    private double animationDuration;
    private double animationIntervalTime;
    private AnimatorSet animatorSet;
    private JSONArray avatarsData;
    private int isAnimationOn;
    private int isInfinite;
    private List<DXNativeFrameLayout> mChildFrameLayout;
    private List<Rect> mChildInitPos;
    private Map<DXNativeFrameLayout, Float> mChildTranx;
    private int mCurLastInViewIndex;
    private int mFirstToLastDistance;
    private Handler mHandler;
    private boolean mIsAppear;
    private int mLastDataIndex;
    private int mLastToPreDistance;
    private a mRunningAnimRunnable;

    static {
        kge.a(583367348);
    }

    public static /* synthetic */ Object ipc$super(AvatarsAnimView avatarsAnimView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode != 1626033557) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onAttachedToWindow();
            return null;
        }
    }

    public static /* synthetic */ void access$000(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c2b976", new Object[]{avatarsAnimView});
        } else {
            avatarsAnimView.initPos();
        }
    }

    public static /* synthetic */ AnimatorSet access$100(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AnimatorSet) ipChange.ipc$dispatch("497ea256", new Object[]{avatarsAnimView}) : avatarsAnimView.animatorSet;
    }

    public static /* synthetic */ int access$1000(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("517100da", new Object[]{avatarsAnimView})).intValue() : avatarsAnimView.mFirstToLastDistance;
    }

    public static /* synthetic */ AnimatorSet access$102(AvatarsAnimView avatarsAnimView, AnimatorSet animatorSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("3e94011f", new Object[]{avatarsAnimView, animatorSet});
        }
        avatarsAnimView.animatorSet = animatorSet;
        return animatorSet;
    }

    public static /* synthetic */ void access$1100(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80226b06", new Object[]{avatarsAnimView});
        } else {
            avatarsAnimView.recycleTransImage();
        }
    }

    public static /* synthetic */ a access$202(AvatarsAnimView avatarsAnimView, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("e6693fde", new Object[]{avatarsAnimView, aVar});
        }
        avatarsAnimView.mRunningAnimRunnable = aVar;
        return aVar;
    }

    public static /* synthetic */ List access$300(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("1e3bda14", new Object[]{avatarsAnimView}) : avatarsAnimView.mChildFrameLayout;
    }

    public static /* synthetic */ int access$400(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("128861e5", new Object[]{avatarsAnimView})).intValue() : avatarsAnimView.mCurLastInViewIndex;
    }

    public static /* synthetic */ int access$402(AvatarsAnimView avatarsAnimView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff76fb46", new Object[]{avatarsAnimView, new Integer(i)})).intValue();
        }
        avatarsAnimView.mCurLastInViewIndex = i;
        return i;
    }

    public static /* synthetic */ int access$500(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4139cc04", new Object[]{avatarsAnimView})).intValue() : avatarsAnimView.mLastToPreDistance;
    }

    public static /* synthetic */ double access$600(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6feb361e", new Object[]{avatarsAnimView})).doubleValue() : avatarsAnimView.animationDuration;
    }

    public static /* synthetic */ int access$700(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9e9ca042", new Object[]{avatarsAnimView})).intValue() : avatarsAnimView.mLastDataIndex;
    }

    public static /* synthetic */ int access$702(AvatarsAnimView avatarsAnimView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f5ea8889", new Object[]{avatarsAnimView, new Integer(i)})).intValue();
        }
        avatarsAnimView.mLastDataIndex = i;
        return i;
    }

    public static /* synthetic */ JSONArray access$800(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("50ab4210", new Object[]{avatarsAnimView}) : avatarsAnimView.avatarsData;
    }

    public static /* synthetic */ int access$900(AvatarsAnimView avatarsAnimView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fbff7480", new Object[]{avatarsAnimView})).intValue() : avatarsAnimView.isInfinite;
    }

    public AvatarsAnimView(Context context) {
        super(context);
        this.isAnimationOn = 1;
        this.isInfinite = 1;
        this.mChildFrameLayout = new ArrayList();
        this.mChildTranx = new HashMap();
        this.mChildInitPos = new ArrayList();
        this.mCurLastInViewIndex = 0;
        this.mLastDataIndex = -1;
        this.mIsAppear = false;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public AvatarsAnimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isAnimationOn = 1;
        this.isInfinite = 1;
        this.mChildFrameLayout = new ArrayList();
        this.mChildTranx = new HashMap();
        this.mChildInitPos = new ArrayList();
        this.mCurLastInViewIndex = 0;
        this.mLastDataIndex = -1;
        this.mIsAppear = false;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public AvatarsAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isAnimationOn = 1;
        this.isInfinite = 1;
        this.mChildFrameLayout = new ArrayList();
        this.mChildTranx = new HashMap();
        this.mChildInitPos = new ArrayList();
        this.mCurLastInViewIndex = 0;
        this.mLastDataIndex = -1;
        this.mIsAppear = false;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    public void setIsAppear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f11be5ec", new Object[]{this, new Boolean(z)});
        } else if (this.mIsAppear == z) {
        } else {
            i.a(TAG, "setIsAppear mIsAppear:" + z);
            this.mIsAppear = z;
            if (!this.mIsAppear) {
                a aVar = this.mRunningAnimRunnable;
                if (aVar == null) {
                    return;
                }
                this.mHandler.removeCallbacks(aVar);
                this.mRunningAnimRunnable = null;
                return;
            }
            recycleTransImage();
        }
    }

    public void setData(double d, double d2, JSONArray jSONArray, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("743e377b", new Object[]{this, new Double(d), new Double(d2), jSONArray, new Integer(i), new Integer(i2)});
            return;
        }
        this.animationDuration = d;
        this.animationIntervalTime = d2;
        this.avatarsData = jSONArray;
        this.isAnimationOn = i;
        this.isInfinite = i2;
    }

    private void dumpTrans(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97cc54a5", new Object[]{this, str});
        } else if (o.a(y.a(this))) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                DXNativeFrameLayout dXNativeFrameLayout = (DXNativeFrameLayout) getChildAt(i);
                if (this.mChildFrameLayout.size() > 0 && !dXNativeFrameLayout.equals(this.mChildFrameLayout.get(i))) {
                    i.a(TAG, "dumpTrans: animaParam  view not equal:" + i);
                }
                i.a(TAG, "dumpTrans:" + str + ": animaParam view:(" + i + riy.BRACKET_END_STR + dXNativeFrameLayout.hashCode() + ", transX:" + dXNativeFrameLayout.getTranslationX() + ", left:" + dXNativeFrameLayout.getLeft() + ", alpha:" + dXNativeFrameLayout.getAlpha());
            }
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
        StringBuilder sb = new StringBuilder();
        sb.append("onDetachedFromWindow this:");
        sb.append(hashCode());
        sb.append(",animatorSet");
        AnimatorSet animatorSet = this.animatorSet;
        sb.append(animatorSet != null ? Integer.valueOf(animatorSet.hashCode()) : "null");
        i.a(TAG, sb.toString());
        setIsAppear(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        i.a(TAG, "onAttachedToWindow this:" + hashCode());
        this.mHandler.post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.transfer.widget.avatar.AvatarsAnimView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                AvatarsAnimView.access$000(AvatarsAnimView.this);
                AvatarsAnimView.this.setIsAppear(true);
            }
        });
    }

    private void initPos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("373c4dab", new Object[]{this});
            return;
        }
        int childCount = getChildCount();
        if (this.mChildFrameLayout.size() == childCount) {
            for (int i = 0; i < childCount; i++) {
                if (i < this.avatarsData.size()) {
                    DXNativeFrameLayout dXNativeFrameLayout = this.mChildFrameLayout.get(i);
                    dXNativeFrameLayout.setTranslationX(0.0f);
                    dXNativeFrameLayout.setAlpha(1.0f);
                    removeView(dXNativeFrameLayout);
                    addView(dXNativeFrameLayout, dXNativeFrameLayout.getLayoutParams());
                    ((TUrlImageView) dXNativeFrameLayout.getChildAt(0)).setImageUrl(this.avatarsData.getString(i));
                }
            }
        } else {
            this.mChildFrameLayout.clear();
            for (int i2 = 0; i2 < childCount; i2++) {
                DXNativeFrameLayout dXNativeFrameLayout2 = (DXNativeFrameLayout) getChildAt(i2);
                this.mChildInitPos.add(new Rect(dXNativeFrameLayout2.getLeft(), dXNativeFrameLayout2.getTop(), dXNativeFrameLayout2.getRight(), dXNativeFrameLayout2.getBottom()));
                this.mChildFrameLayout.add(dXNativeFrameLayout2);
            }
        }
        int i3 = childCount - 2;
        this.mCurLastInViewIndex = i3;
        this.mLastDataIndex = this.mCurLastInViewIndex + 1;
        Rect rect = this.mChildInitPos.get(childCount - 1);
        Rect rect2 = this.mChildInitPos.get(i3);
        this.mLastToPreDistance = (rect.right - rect2.right) + (rect2.width() / 2);
        this.mFirstToLastDistance = rect.right - this.mChildInitPos.get(0).right;
        dumpTrans("initPos");
    }

    /* loaded from: classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-927195042);
            kge.a(-1390502639);
        }

        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (AvatarsAnimView.access$100(AvatarsAnimView.this) != null && AvatarsAnimView.access$100(AvatarsAnimView.this).isRunning()) {
                AvatarsAnimView.access$202(AvatarsAnimView.this, null);
            } else {
                AvatarsAnimView.access$102(AvatarsAnimView.this, new AnimatorSet());
                ArrayList arrayList = new ArrayList();
                int size = AvatarsAnimView.access$300(AvatarsAnimView.this).size();
                int access$400 = AvatarsAnimView.access$400(AvatarsAnimView.this) + 1;
                if (access$400 >= AvatarsAnimView.access$300(AvatarsAnimView.this).size()) {
                    AvatarsAnimView.access$402(AvatarsAnimView.this, 0);
                } else {
                    AvatarsAnimView.access$402(AvatarsAnimView.this, access$400);
                }
                final DXNativeFrameLayout dXNativeFrameLayout = (DXNativeFrameLayout) AvatarsAnimView.access$300(AvatarsAnimView.this).get((access$400 + 1) % size);
                DXNativeFrameLayout dXNativeFrameLayout2 = (DXNativeFrameLayout) AvatarsAnimView.access$300(AvatarsAnimView.this).get(AvatarsAnimView.access$400(AvatarsAnimView.this));
                for (int i = 0; i < AvatarsAnimView.access$300(AvatarsAnimView.this).size(); i++) {
                    DXNativeFrameLayout dXNativeFrameLayout3 = (DXNativeFrameLayout) AvatarsAnimView.access$300(AvatarsAnimView.this).get(i);
                    if (dXNativeFrameLayout3.equals(dXNativeFrameLayout2)) {
                        float translationX = dXNativeFrameLayout3.getTranslationX();
                        arrayList.add(ObjectAnimator.ofFloat(dXNativeFrameLayout3, "translationX", translationX, (translationX - AvatarsAnimView.access$500(AvatarsAnimView.this)) + (dXNativeFrameLayout3.getWidth() / 2)));
                    } else if (dXNativeFrameLayout3.equals(dXNativeFrameLayout)) {
                        arrayList.add(ObjectAnimator.ofFloat(dXNativeFrameLayout3, "alpha", 1.0f, 0.0f));
                    } else {
                        float translationX2 = dXNativeFrameLayout3.getTranslationX();
                        arrayList.add(ObjectAnimator.ofFloat(dXNativeFrameLayout3, "translationX", translationX2, translationX2 - (dXNativeFrameLayout3.getWidth() / 2)));
                    }
                }
                AvatarsAnimView.access$100(AvatarsAnimView.this).playTogether(arrayList);
                AvatarsAnimView.access$100(AvatarsAnimView.this).setDuration((long) AvatarsAnimView.access$600(AvatarsAnimView.this));
                AvatarsAnimView.access$100(AvatarsAnimView.this).addListener(new Animator.AnimatorListener() { // from class: com.taobao.android.detail.ttdetail.transfer.widget.avatar.AvatarsAnimView.a.1
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
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                            return;
                        }
                        AvatarsAnimView.this.bringChildToFront(dXNativeFrameLayout);
                        int access$700 = AvatarsAnimView.access$700(AvatarsAnimView.this) + 1;
                        if (access$700 < AvatarsAnimView.access$800(AvatarsAnimView.this).size()) {
                            AvatarsAnimView.access$702(AvatarsAnimView.this, access$700);
                        } else if (AvatarsAnimView.access$900(AvatarsAnimView.this) != 1) {
                            return;
                        } else {
                            AvatarsAnimView.access$702(AvatarsAnimView.this, 0);
                        }
                        ((TUrlImageView) dXNativeFrameLayout.getChildAt(0)).setImageUrl(AvatarsAnimView.access$800(AvatarsAnimView.this).getString(AvatarsAnimView.access$700(AvatarsAnimView.this)));
                        DXNativeFrameLayout dXNativeFrameLayout4 = dXNativeFrameLayout;
                        dXNativeFrameLayout4.setTranslationX(dXNativeFrameLayout4.getTranslationX() + AvatarsAnimView.access$1000(AvatarsAnimView.this));
                        dXNativeFrameLayout.setAlpha(1.0f);
                        AvatarsAnimView.access$202(AvatarsAnimView.this, null);
                        AvatarsAnimView.access$1100(AvatarsAnimView.this);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        } else {
                            AvatarsAnimView.access$202(AvatarsAnimView.this, null);
                        }
                    }
                });
                AvatarsAnimView.access$100(AvatarsAnimView.this).start();
            }
        }
    }

    private void recycleTransImage() {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7753740d", new Object[]{this});
        } else if (!this.mIsAppear) {
            i.a(TAG, "recycleTransImage mIsAppear false");
        } else if (this.isAnimationOn == 0 || (jSONArray = this.avatarsData) == null || jSONArray.size() < this.mChildFrameLayout.size() || this.animationIntervalTime == mto.a.GEO_NOT_SUPPORT || this.animationDuration == mto.a.GEO_NOT_SUPPORT) {
            i.a(TAG, "recycleTransImage data null");
        } else if (this.mRunningAnimRunnable != null) {
            i.a(TAG, "recycleTransImage mRunningAnimRunnable not null");
        } else {
            this.mRunningAnimRunnable = new a();
            this.mHandler.postDelayed(this.mRunningAnimRunnable, (long) this.animationIntervalTime);
        }
    }
}
