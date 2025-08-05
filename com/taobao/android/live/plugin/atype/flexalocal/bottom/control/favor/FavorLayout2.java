package com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.doubleclickfav.DoubleClickFavView2;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.model.f;
import com.taobao.taolive.sdk.utils.q;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.plx;
import tb.ply;

/* loaded from: classes5.dex */
public class FavorLayout2 extends View implements com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.a, com.taobao.taolive.sdk.model.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ADD_FAVOR = 321;
    private static final int FAVOR_DURATION = 3000;
    private static final int FORBIDDEN_REMOVE_LIKE = 456;
    private static final int MAX_COUNT = 50;
    private static final int PERIOD = 400;
    private static final int SHOW_FAKE_FAVOR = 123;
    private static final String TAG = "FavorLayout2";
    private Interpolator acc;
    private Interpolator accdec;
    private Interpolator dce;
    private Interpolator[] interpolators;
    private Interpolator line;
    private int mCurrentIndex;
    private ArrayList<Drawable> mDefaultDrawables;
    private int mDrawSize;
    private int mDrawableBottom;
    private int mDrawableHeight;
    private int mDrawableLeft;
    private int mDrawableRight;
    private int mDrawableTop;
    private int mDrawableWidth;
    private ArrayList<Drawable> mDrawables;
    private boolean mEnablePopRightBottomLikeFeedback;
    private boolean mEnableReceiveRemoveLikeFeedBack;
    private int mFavorDuration;
    private ArrayList<FavorObject> mFavorObjects;
    private int[] mGradientColors;
    private float[] mGradientPosition;
    private f mHandler;
    private boolean mHasExecute;
    private int mHeight;
    private Paint mPaint;
    private boolean mPaused;
    private double mScaleFactor;
    private volatile boolean mUseDefault;
    private int mWidth;

    static {
        kge.a(840273829);
        kge.a(-1905361424);
        kge.a(-844364448);
    }

    public static /* synthetic */ Object ipc$super(FavorLayout2 favorLayout2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        } else if (hashCode != 650865254) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
    }

    public static /* synthetic */ ArrayList access$000(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("d4c1e98b", new Object[]{context}) : createDefaultDrawables(context);
    }

    public static /* synthetic */ boolean access$100(FavorLayout2 favorLayout2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a3458c08", new Object[]{favorLayout2})).booleanValue() : favorLayout2.mUseDefault;
    }

    public static /* synthetic */ ArrayList access$200(FavorLayout2 favorLayout2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("55d15b7d", new Object[]{favorLayout2}) : favorLayout2.mDefaultDrawables;
    }

    public static /* synthetic */ ArrayList access$202(FavorLayout2 favorLayout2, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2d01a0c3", new Object[]{favorLayout2, arrayList});
        }
        favorLayout2.mDefaultDrawables = arrayList;
        return arrayList;
    }

    public static /* synthetic */ ArrayList access$300(FavorLayout2 favorLayout2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("964c711c", new Object[]{favorLayout2}) : favorLayout2.mDrawables;
    }

    public static /* synthetic */ int access$400(FavorLayout2 favorLayout2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4b181d54", new Object[]{favorLayout2})).intValue() : favorLayout2.mDrawableWidth;
    }

    public static /* synthetic */ int access$402(FavorLayout2 favorLayout2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e9fb8bb7", new Object[]{favorLayout2, new Integer(i)})).intValue();
        }
        favorLayout2.mDrawableWidth = i;
        return i;
    }

    public static /* synthetic */ int access$500(FavorLayout2 favorLayout2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8308f873", new Object[]{favorLayout2})).intValue() : favorLayout2.mDrawableHeight;
    }

    public static /* synthetic */ int access$502(FavorLayout2 favorLayout2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0261478", new Object[]{favorLayout2, new Integer(i)})).intValue();
        }
        favorLayout2.mDrawableHeight = i;
        return i;
    }

    public static /* synthetic */ boolean access$602(FavorLayout2 favorLayout2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7650dd1b", new Object[]{favorLayout2, new Boolean(z)})).booleanValue();
        }
        favorLayout2.mHasExecute = z;
        return z;
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i != 123) {
            if (i == ADD_FAVOR) {
                addFavor(false);
            } else if (i != FORBIDDEN_REMOVE_LIKE) {
            } else {
                this.mEnableReceiveRemoveLikeFeedBack = true;
            }
        } else if (!message.obj.equals(this.mHandler.toString())) {
        } else {
            addFavor(2);
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = 123;
            obtainMessage.obj = this.mHandler.toString();
            this.mHandler.sendMessageDelayed(obtainMessage, 700L);
        }
    }

    public void setFavorDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4653f8ac", new Object[]{this, new Integer(i)});
        } else {
            this.mFavorDuration = i;
        }
    }

    public void setScaleFactor(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fb580", new Object[]{this, new Double(d)});
        } else {
            this.mScaleFactor = d;
        }
    }

    public FavorLayout2(Context context) {
        this(context, null);
    }

    public FavorLayout2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FavorLayout2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDrawableHeight = 60;
        this.mDrawableWidth = 60;
        this.line = new LinearInterpolator();
        this.acc = new AccelerateInterpolator();
        this.dce = new DecelerateInterpolator();
        this.accdec = new AccelerateDecelerateInterpolator();
        this.mCurrentIndex = 0;
        this.mFavorDuration = 3000;
        this.mScaleFactor = 1.0d;
        this.mHandler = null;
        this.mPaused = false;
        this.mUseDefault = true;
        this.mGradientColors = new int[]{-1, 0};
        this.mGradientPosition = new float[]{0.0f, 1.0f};
        this.mEnablePopRightBottomLikeFeedback = ply.an();
        this.mEnableReceiveRemoveLikeFeedBack = true;
        this.mHasExecute = false;
        init();
    }

    public void startFakeFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a9c46ae", new Object[]{this});
        } else if (ply.A()) {
        } else {
            this.mHandler.removeCallbacksAndMessages(null);
            Message obtainMessage = this.mHandler.obtainMessage();
            obtainMessage.what = 123;
            obtainMessage.obj = this.mHandler.toString();
            this.mHandler.sendMessage(obtainMessage);
        }
    }

    public void stopFakeFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533e70e", new Object[]{this});
            return;
        }
        f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        invalidate();
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.mPaused = true;
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else {
            this.mPaused = false;
        }
    }

    public ArrayList<Drawable> getDrawables() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("1147f6c0", new Object[]{this}) : this.mDrawables;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.bottom.control.favor.a
    public void setDrawables(ArrayList<Drawable> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cafcd90", new Object[]{this, arrayList});
        } else if (arrayList == null || arrayList.size() <= 0) {
        } else {
            this.mUseDefault = false;
            this.mDrawables = arrayList;
            Iterator<Drawable> it = arrayList.iterator();
            while (it.hasNext()) {
                q.a(TAG, "setDrawables:" + it.next().toString());
            }
        }
    }

    public void setDefaultDrawables() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9817c5d", new Object[]{this});
        } else if (!this.mUseDefault) {
        } else {
            if (this.mDefaultDrawables.size() <= 0) {
                if (this.mHasExecute) {
                    return;
                }
                this.mHasExecute = true;
                new c(getContext()).execute(new Object[0]);
                return;
            }
            this.mDrawables.clear();
            this.mDrawables.addAll(this.mDefaultDrawables);
            if (this.mDrawables.size() <= 0) {
                return;
            }
            this.mDrawableWidth = this.mDrawables.get(0).getIntrinsicHeight();
            this.mDrawableHeight = this.mDrawables.get(0).getIntrinsicWidth();
        }
    }

    /* loaded from: classes5.dex */
    public class c extends AsyncTask<Object, Object, ArrayList<Drawable>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final WeakReference<Context> b;

        static {
            kge.a(1853674856);
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList<android.graphics.drawable.Drawable>, java.lang.Object] */
        @Override // android.os.AsyncTask
        public /* synthetic */ ArrayList<Drawable> doInBackground(Object[] objArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, arrayList});
            } else {
                a(arrayList);
            }
        }

        public c(Context context) {
            this.b = new WeakReference<>(context);
        }

        public ArrayList<Drawable> a(Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("30885b23", new Object[]{this, objArr});
            }
            Context context = this.b.get();
            if (context != null) {
                return FavorLayout2.access$000(context);
            }
            return new ArrayList<>();
        }

        public void a(ArrayList<Drawable> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
                return;
            }
            if (FavorLayout2.access$100(FavorLayout2.this)) {
                FavorLayout2.access$202(FavorLayout2.this, arrayList);
                FavorLayout2.access$300(FavorLayout2.this).clear();
                FavorLayout2.access$300(FavorLayout2.this).addAll(FavorLayout2.access$200(FavorLayout2.this));
            }
            if (FavorLayout2.access$300(FavorLayout2.this).size() > 0) {
                FavorLayout2 favorLayout2 = FavorLayout2.this;
                FavorLayout2.access$402(favorLayout2, ((Drawable) FavorLayout2.access$300(favorLayout2).get(0)).getIntrinsicHeight());
                FavorLayout2 favorLayout22 = FavorLayout2.this;
                FavorLayout2.access$502(favorLayout22, ((Drawable) FavorLayout2.access$300(favorLayout22).get(0)).getIntrinsicWidth());
            }
            Context context = this.b.get();
            if (context != null) {
                int a2 = d.a(context, 28.0f);
                if (FavorLayout2.access$500(FavorLayout2.this) < a2) {
                    FavorLayout2.access$502(FavorLayout2.this, a2);
                }
                if (FavorLayout2.access$400(FavorLayout2.this) < a2) {
                    FavorLayout2.access$402(FavorLayout2.this, a2);
                }
            }
            FavorLayout2.access$602(FavorLayout2.this, false);
        }
    }

    private static ArrayList<Drawable> createDefaultDrawables(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("ca5cb10b", new Object[]{context});
        }
        ArrayList<Drawable> arrayList = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(5);
        com.taobao.phenix.intf.b h = com.taobao.phenix.intf.b.h();
        h.a("https://gw.alicdn.com/imgextra/i2/O1CN01UNMgNM1PP6SPt2gPW_!!6000000001832-2-tps-60-60.png").succListener(new DoubleClickFavView2.b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i2/O1CN01m3OD2o27GiIRc2rTK_!!6000000007770-2-tps-60-60.png").succListener(new DoubleClickFavView2.b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i4/O1CN01HTqL5y1nTGqAolERQ_!!6000000005090-2-tps-60-60.png").succListener(new DoubleClickFavView2.b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i1/O1CN01DTGVml1eprq657njs_!!6000000003921-2-tps-60-60.png").succListener(new DoubleClickFavView2.b(arrayList, countDownLatch));
        h.a("https://gw.alicdn.com/imgextra/i1/O1CN01pszcl823m4xHMmJ1B_!!6000000007297-2-tps-60-60.png").succListener(new DoubleClickFavView2.b(arrayList, countDownLatch));
        try {
            countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            plx.b(TAG, th.getMessage());
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        this.mWidth = getMeasuredWidth();
        this.mHeight = getMeasuredHeight();
        this.mPaint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.mDrawSize, this.mGradientColors, this.mGradientPosition, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.onDraw(canvas);
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList != null && arrayList.size() > 0) {
            for (int i = 0; i < this.mFavorObjects.size(); i++) {
                this.mDrawableLeft = (int) (this.mFavorObjects.get(i).getX() - (((this.mDrawableWidth * this.mFavorObjects.get(i).getScaleX()) * this.mScaleFactor) / 2.0d));
                this.mDrawableTop = (int) (this.mFavorObjects.get(i).getY() - (((this.mDrawableHeight * this.mFavorObjects.get(i).getScaleY()) * this.mScaleFactor) / 2.0d));
                this.mDrawableRight = (int) (this.mFavorObjects.get(i).getX() + (((this.mDrawableWidth * this.mFavorObjects.get(i).getScaleX()) * this.mScaleFactor) / 2.0d));
                this.mDrawableBottom = (int) (this.mFavorObjects.get(i).getY() + (((this.mDrawableHeight * this.mFavorObjects.get(i).getScaleY()) * this.mScaleFactor) / 2.0d));
                if (this.mFavorObjects.get(i).getDrawable() != null) {
                    this.mFavorObjects.get(i).getDrawable().setAlpha((int) (this.mFavorObjects.get(i).getAlpha() * 255.0f));
                    this.mFavorObjects.get(i).getDrawable().setBounds(this.mDrawableLeft, this.mDrawableTop, this.mDrawableRight, this.mDrawableBottom);
                    canvas.save();
                    canvas.clipRect(this.mDrawableLeft, this.mDrawableTop, this.mDrawableRight, this.mDrawableBottom);
                    this.mFavorObjects.get(i).getDrawable().draw(canvas);
                    canvas.restore();
                }
            }
        }
        canvas.drawRect(0.0f, 0.0f, this.mWidth, this.mDrawSize, this.mPaint);
        canvas.restoreToCount(saveLayer);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mHandler = new f(this);
        this.mUseDefault = true;
        this.mDrawables = new ArrayList<>();
        this.mDefaultDrawables = new ArrayList<>();
        setDefaultDrawables();
        this.interpolators = new Interpolator[4];
        Interpolator[] interpolatorArr = this.interpolators;
        interpolatorArr[0] = this.line;
        interpolatorArr[1] = this.acc;
        interpolatorArr[2] = this.dce;
        interpolatorArr[3] = this.accdec;
        this.mFavorObjects = new ArrayList<>();
        this.mPaint = new Paint(1);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.mDrawSize = d.a(getContext(), 30.0f);
        this.mEnableReceiveRemoveLikeFeedBack = true;
    }

    public void startDelayTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72dc74ed", new Object[]{this});
        } else if (!ply.ao()) {
            plx.a(TAG, "close startDelayTask");
        } else {
            this.mEnableReceiveRemoveLikeFeedBack = false;
            this.mHandler.removeMessages(FORBIDDEN_REMOVE_LIKE);
            this.mHandler.sendEmptyMessageDelayed(FORBIDDEN_REMOVE_LIKE, 1000L);
        }
    }

    public void addFavor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b257730", new Object[]{this, new Boolean(z)});
        } else if (z && !this.mEnablePopRightBottomLikeFeedback) {
        } else {
            if (!this.mEnableReceiveRemoveLikeFeedBack && ply.ao()) {
                plx.a(TAG, "current status is our like,so do not receive pm");
            } else if (this.mFavorObjects.size() >= 50) {
            } else {
                if (this.mCurrentIndex >= this.mDrawables.size()) {
                    this.mCurrentIndex = 0;
                }
                int i = this.mCurrentIndex;
                if (i < 0 || i >= this.mDrawables.size() || this.mPaused) {
                    return;
                }
                FavorObject favorObject = new FavorObject();
                favorObject.setDrawable(this.mDrawables.get(this.mCurrentIndex));
                this.mCurrentIndex++;
                this.mFavorObjects.add(favorObject);
                Animator animator = getAnimator(favorObject);
                animator.addListener(new a(this, favorObject));
                animator.start();
                invalidate();
            }
        }
    }

    public void addFavor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b25375f", new Object[]{this, new Integer(i)});
        } else if (!this.mPaused && i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                this.mHandler.sendEmptyMessageDelayed(ADD_FAVOR, i2 * 400);
            }
        }
    }

    public void clearFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416ba3f8", new Object[]{this});
            return;
        }
        f fVar = this.mHandler;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
        }
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    public void removeFavor(FavorObject favorObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56403502", new Object[]{this, favorObject});
            return;
        }
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(favorObject);
    }

    private Animator getAnimator(FavorObject favorObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("ddd76b4", new Object[]{this, favorObject});
        }
        int i = this.mWidth / 2;
        AnimatorSet enterAnimtor = getEnterAnimtor(favorObject, i);
        ValueAnimator bezierValueAnimator = getBezierValueAnimator(favorObject, i);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(enterAnimtor, bezierValueAnimator);
        animatorSet.setInterpolator(this.accdec);
        animatorSet.setTarget(favorObject);
        return animatorSet;
    }

    private PointF getBreakPointF(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PointF) ipChange.ipc$dispatch("89a46b7d", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        Random random = new Random();
        PointF pointF = new PointF();
        int measuredWidth = ((getMeasuredWidth() - getPaddingRight()) + getPaddingLeft()) / i;
        if (measuredWidth <= 0) {
            measuredWidth = 1;
        }
        pointF.x = random.nextInt(measuredWidth) + (getMeasuredWidth() / i2);
        int measuredHeight = ((getMeasuredHeight() - getPaddingBottom()) + getPaddingTop()) / i;
        if (measuredHeight <= 0) {
            measuredHeight = 1;
        }
        pointF.y = random.nextInt(measuredHeight) + (getMeasuredHeight() / i2);
        return pointF;
    }

    private AnimatorSet getEnterAnimtor(FavorObject favorObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AnimatorSet) ipChange.ipc$dispatch("fe771f8c", new Object[]{this, favorObject, new Integer(i)});
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(favorObject, "alpha", 0.2f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(favorObject, "scaleX", 0.2f, 1.0f);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(favorObject, "scaleY", 0.2f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.setTarget(favorObject);
        return animatorSet;
    }

    private ValueAnimator getBezierValueAnimator(FavorObject favorObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("aa97ceae", new Object[]{this, favorObject, new Integer(i)});
        }
        float f = i;
        ValueAnimator ofObject = ValueAnimator.ofObject(new com.taobao.taolive.room.utils.f(getBreakPointF(2, 3)), new PointF(f, this.mHeight - (this.mDrawableHeight / 2.0f)), new PointF(f, 0.0f));
        ofObject.addUpdateListener(new b(favorObject, this));
        ofObject.setTarget(favorObject);
        ofObject.setDuration(this.mFavorDuration);
        return ofObject;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mEnableReceiveRemoveLikeFeedBack = true;
        stopFakeFavor();
        ArrayList<FavorObject> arrayList = this.mFavorObjects;
        if (arrayList != null) {
            arrayList.clear();
        }
        clearMessages();
    }

    /* loaded from: classes5.dex */
    public static class a extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<FavorLayout2> f13586a;
        private FavorObject b;

        static {
            kge.a(1367333055);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(FavorLayout2 favorLayout2, FavorObject favorObject) {
            this.f13586a = new WeakReference<>(favorLayout2);
            this.b = favorObject;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            FavorLayout2 favorLayout2 = this.f13586a.get();
            if (favorLayout2 == null) {
                return;
            }
            favorLayout2.removeFavor(this.b);
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private FavorObject f13587a;
        private WeakReference<FavorLayout2> b;

        static {
            kge.a(251226034);
            kge.a(1499308443);
        }

        public b(FavorObject favorObject, FavorLayout2 favorLayout2) {
            this.f13587a = favorObject;
            this.b = new WeakReference<>(favorLayout2);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            PointF pointF = (PointF) valueAnimator.getAnimatedValue();
            this.f13587a.setX(pointF.x);
            this.f13587a.setY(pointF.y);
            this.f13587a.setAlpha(0.7f);
            FavorLayout2 favorLayout2 = this.b.get();
            if (favorLayout2 == null) {
                return;
            }
            favorLayout2.invalidate();
        }
    }

    /* loaded from: classes5.dex */
    public static class FavorObject implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private float alpha;
        private Drawable drawable;
        private float scaleX;
        private float scaleY;
        private float x;
        private float y;

        static {
            kge.a(2115752062);
            kge.a(1028243835);
        }

        public float getAlpha() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dbf8c81f", new Object[]{this})).floatValue() : this.alpha;
        }

        public void setAlpha(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144f37d", new Object[]{this, new Float(f)});
            } else {
                this.alpha = f;
            }
        }

        public float getScaleY() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("607d9d3c", new Object[]{this})).floatValue() : this.scaleY;
        }

        public void setScaleY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("459be768", new Object[]{this, new Float(f)});
            } else {
                this.scaleY = f;
            }
        }

        public float getScaleX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("606f85bb", new Object[]{this})).floatValue() : this.scaleX;
        }

        public void setScaleX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43e70ec9", new Object[]{this, new Float(f)});
            } else {
                this.scaleX = f;
            }
        }

        public float getX() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("754e2f39", new Object[]{this})).floatValue() : this.x;
        }

        public void setX(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27ad55a3", new Object[]{this, new Float(f)});
            } else {
                this.x = f;
            }
        }

        public float getY() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("755c46ba", new Object[]{this})).floatValue() : this.y;
        }

        public void setY(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29622e42", new Object[]{this, new Float(f)});
            } else {
                this.y = f;
            }
        }

        public Drawable getDrawable() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this}) : this.drawable;
        }

        public void setDrawable(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17dcaf4b", new Object[]{this, drawable});
            } else {
                this.drawable = drawable;
            }
        }
    }

    public void clearMessages() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5849fec0", new Object[]{this});
        } else {
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }
}
