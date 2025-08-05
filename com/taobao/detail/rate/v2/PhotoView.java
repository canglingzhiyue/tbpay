package com.taobao.detail.rate.v2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.kil;
import tb.mto;

/* loaded from: classes7.dex */
public class PhotoView extends TUrlImageView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANIMA_DURING = 340;
    private static final float MAX_SCALE = 2.5f;
    private static final int MIN_ROTATE = 35;
    private int MAX_ANIM_FROM_WAITE;
    private int MAX_FLING_OVER_SCROLL;
    private int MAX_OVER_RESISTANCE;
    private int MAX_OVER_SCROLL;
    private boolean canRotate;
    private boolean hasDrawable;
    private boolean hasMultiTouch;
    private boolean hasOverTranslate;
    private boolean imgLargeHeight;
    private boolean imgLargeWidth;
    private boolean isEnable;
    private boolean isInit;
    private boolean isKnowSize;
    private boolean isRotateEnable;
    private boolean isZoonUp;
    private boolean mAdjustViewBounds;
    private int mAnimaDuring;
    private Matrix mAnimaMatrix;
    private Paint mBackPaint;
    private List<Rect> mBackRectList;
    private Matrix mBaseMatrix;
    private RectF mBaseRect;
    private View.OnClickListener mClickListener;
    private Runnable mClickRunnable;
    private RectF mClip;
    private RectF mCommonRect;
    private Runnable mCompleteCallBack;
    private float mDegrees;
    private GestureDetector mDetector;
    private Paint mForePaint;
    private List<Rect> mForeRectList;
    private com.taobao.detail.rate.v2.c mFromInfo;
    private GestureDetector.OnGestureListener mGestureListener;
    private float mHalfBaseRectHeight;
    private float mHalfBaseRectWidth;
    private RectF mImgRect;
    private long mInfoTime;
    private View.OnLongClickListener mLongClick;
    private float mMaxScale;
    private int mMinRotate;
    private PointF mRotateCenter;
    private com.taobao.detail.rate.v2.g mRotateDetector;
    private float mRotateFlag;
    private com.taobao.detail.rate.v2.d mRotateListener;
    private float mScale;
    private PointF mScaleCenter;
    private ScaleGestureDetector mScaleDetector;
    private ScaleGestureDetector.OnScaleGestureListener mScaleListener;
    private ImageView.ScaleType mScaleType;
    private PointF mScreenCenter;
    private Matrix mSynthesisMatrix;
    private Matrix mTmpMatrix;
    private RectF mTmpRect;
    private g mTranslate;
    private int mTranslateX;
    private int mTranslateY;
    private RectF mWidgetRect;
    private e onPhotoViewLongClickLisenter;
    private JSONArray tagData;
    private int textSize;

    /* renamed from: com.taobao.detail.rate.v2.PhotoView$6  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17013a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                f17013a[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17013a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17013a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17013a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17013a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17013a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17013a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public interface a {
        float a();
    }

    /* loaded from: classes7.dex */
    public class b implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.detail.rate.v2.PhotoView.a
        public float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : PhotoView.access$1600(PhotoView.this).bottom;
        }
    }

    /* loaded from: classes7.dex */
    public class d implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.detail.rate.v2.PhotoView.a
        public float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : (PhotoView.access$1600(PhotoView.this).top + PhotoView.access$1600(PhotoView.this).bottom) / 2.0f;
        }
    }

    /* loaded from: classes7.dex */
    public interface e {
    }

    /* loaded from: classes7.dex */
    public class f implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.detail.rate.v2.PhotoView.a
        public float a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c58", new Object[]{this})).floatValue() : PhotoView.access$1600(PhotoView.this).top;
        }
    }

    public static /* synthetic */ Object ipc$super(PhotoView photoView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2079798281:
                super.setOnClickListener((View.OnClickListener) objArr[0]);
                return null;
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -1150258430:
                super.setImageDrawable((Drawable) objArr[0]);
                return null;
            case -1117127205:
                super.onDraw((Canvas) objArr[0]);
                return null;
            case 120759747:
                super.setScaleType((ImageView.ScaleType) objArr[0]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 891063010:
                super.setAdjustViewBounds(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public int getDefaultAnimaDuring() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fadbc140", new Object[]{this})).intValue() : ANIMA_DURING;
    }

    public static /* synthetic */ float access$000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("90fcb552", new Object[]{photoView})).floatValue() : photoView.mRotateFlag;
    }

    public static /* synthetic */ float access$002(PhotoView photoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("591d3c10", new Object[]{photoView, new Float(f2)})).floatValue();
        }
        photoView.mRotateFlag = f2;
        return f2;
    }

    public static /* synthetic */ boolean access$100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("53e91ec5", new Object[]{photoView})).booleanValue() : photoView.canRotate;
    }

    public static /* synthetic */ boolean access$1000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3d92a997", new Object[]{photoView})).booleanValue() : photoView.hasOverTranslate;
    }

    public static /* synthetic */ boolean access$1002(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f461927", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.hasOverTranslate = z;
        return z;
    }

    public static /* synthetic */ boolean access$102(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3be49b9", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.canRotate = z;
        return z;
    }

    public static /* synthetic */ boolean access$1100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f12f6", new Object[]{photoView})).booleanValue() : photoView.hasMultiTouch;
    }

    public static /* synthetic */ boolean access$1102(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9e6dba8", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.hasMultiTouch = z;
        return z;
    }

    public static /* synthetic */ Runnable access$1200(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("8f227da3", new Object[]{photoView}) : photoView.mClickRunnable;
    }

    public static /* synthetic */ boolean access$1300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8657e5b4", new Object[]{photoView})).booleanValue() : photoView.imgLargeWidth;
    }

    public static /* synthetic */ boolean access$1400(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("49444f13", new Object[]{photoView})).booleanValue() : photoView.imgLargeHeight;
    }

    public static /* synthetic */ g access$1500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("35495c74", new Object[]{photoView}) : photoView.mTranslate;
    }

    public static /* synthetic */ RectF access$1600(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("cec880fa", new Object[]{photoView}) : photoView.mImgRect;
    }

    public static /* synthetic */ RectF access$1700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("aa89fcbb", new Object[]{photoView}) : photoView.mWidgetRect;
    }

    public static /* synthetic */ void access$1800(PhotoView photoView, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f8229c", new Object[]{photoView, rectF});
        } else {
            photoView.doTranslateReset(rectF);
        }
    }

    public static /* synthetic */ int access$1900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("17e25ddd", new Object[]{photoView})).intValue() : photoView.mTranslateX;
    }

    public static /* synthetic */ int access$1902(PhotoView photoView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeecafce", new Object[]{photoView, new Integer(i)})).intValue();
        }
        photoView.mTranslateX = i;
        return i;
    }

    public static /* synthetic */ float access$200(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("16d58810", new Object[]{photoView})).floatValue() : photoView.mDegrees;
    }

    public static /* synthetic */ void access$2000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8336c14", new Object[]{photoView});
        } else {
            photoView.checkRect();
        }
    }

    public static /* synthetic */ float access$202(PhotoView photoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e5ec112", new Object[]{photoView, new Float(f2)})).floatValue();
        }
        photoView.mDegrees = f2;
        return f2;
    }

    public static /* synthetic */ RectF access$2100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("206f1294", new Object[]{photoView}) : photoView.mCommonRect;
    }

    public static /* synthetic */ float access$2200(PhotoView photoView, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c04ca42", new Object[]{photoView, new Float(f2), new Float(f3)})).floatValue() : photoView.resistanceScrollByX(f2, f3);
    }

    public static /* synthetic */ int access$2300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20f8a824", new Object[]{photoView})).intValue() : photoView.mTranslateY;
    }

    public static /* synthetic */ int access$2302(PhotoView photoView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c89fae67", new Object[]{photoView, new Integer(i)})).intValue();
        }
        photoView.mTranslateY = i;
        return i;
    }

    public static /* synthetic */ float access$2400(PhotoView photoView, float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7ef3e580", new Object[]{photoView, new Float(f2), new Float(f3)})).floatValue() : photoView.resistanceScrollByY(f2, f3);
    }

    public static /* synthetic */ List access$2500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("187f3b78", new Object[]{photoView}) : photoView.mBackRectList;
    }

    public static /* synthetic */ JSONArray access$2600(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("f6b82c30", new Object[]{photoView}) : photoView.tagData;
    }

    public static /* synthetic */ PointF access$2700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("3f9daae4", new Object[]{photoView}) : photoView.mScaleCenter;
    }

    public static /* synthetic */ PointF access$2800(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PointF) ipChange.ipc$dispatch("dc0ba743", new Object[]{photoView}) : photoView.mRotateCenter;
    }

    public static /* synthetic */ boolean access$2900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b283206f", new Object[]{photoView})).booleanValue() : photoView.isZoonUp;
    }

    public static /* synthetic */ boolean access$2902(PhotoView photoView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68647d4f", new Object[]{photoView, new Boolean(z)})).booleanValue();
        }
        photoView.isZoonUp = z;
        return z;
    }

    public static /* synthetic */ Matrix access$300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("52619f0b", new Object[]{photoView}) : photoView.mAnimaMatrix;
    }

    public static /* synthetic */ float access$3000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("72d42e85", new Object[]{photoView})).floatValue() : photoView.mMaxScale;
    }

    public static /* synthetic */ Matrix access$3100(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Matrix) ipChange.ipc$dispatch("d0617680", new Object[]{photoView}) : photoView.mTmpMatrix;
    }

    public static /* synthetic */ RectF access$3200(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("989e8ab4", new Object[]{photoView}) : photoView.mBaseRect;
    }

    public static /* synthetic */ float access$3300(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb996aa2", new Object[]{photoView})).floatValue() : photoView.mHalfBaseRectWidth;
    }

    public static /* synthetic */ float access$3400(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e85d401", new Object[]{photoView})).floatValue() : photoView.mHalfBaseRectHeight;
    }

    public static /* synthetic */ RectF access$3500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("2be2fdf7", new Object[]{photoView}) : photoView.mTmpRect;
    }

    public static /* synthetic */ int access$3700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c74b1021", new Object[]{photoView})).intValue() : photoView.mAnimaDuring;
    }

    public static /* synthetic */ int access$3800(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8a377980", new Object[]{photoView})).intValue() : photoView.MAX_FLING_OVER_SCROLL;
    }

    public static /* synthetic */ RectF access$3900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("9ae8ecfb", new Object[]{photoView}) : photoView.mClip;
    }

    public static /* synthetic */ RectF access$3902(PhotoView photoView, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("8e5738cc", new Object[]{photoView, rectF});
        }
        photoView.mClip = rectF;
        return rectF;
    }

    public static /* synthetic */ int access$400(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9cae5ad1", new Object[]{photoView})).intValue() : photoView.mMinRotate;
    }

    public static /* synthetic */ Runnable access$4000(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("232680be", new Object[]{photoView}) : photoView.mCompleteCallBack;
    }

    public static /* synthetic */ Runnable access$4002(PhotoView photoView, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("d6224c82", new Object[]{photoView, runnable});
        }
        photoView.mCompleteCallBack = runnable;
        return runnable;
    }

    public static /* synthetic */ float access$500(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f9ac42d", new Object[]{photoView})).floatValue() : photoView.mScale;
    }

    public static /* synthetic */ float access$502(PhotoView photoView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e410895", new Object[]{photoView, new Float(f2)})).floatValue();
        }
        photoView.mScale = f2;
        return f2;
    }

    public static /* synthetic */ void access$600(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22872d9c", new Object[]{photoView});
        } else {
            photoView.executeTranslate();
        }
    }

    public static /* synthetic */ View.OnClickListener access$700(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("eed4cba4", new Object[]{photoView}) : photoView.mClickListener;
    }

    public static /* synthetic */ View.OnLongClickListener access$800(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnLongClickListener) ipChange.ipc$dispatch("7cde14df", new Object[]{photoView}) : photoView.mLongClick;
    }

    public static /* synthetic */ e access$900(PhotoView photoView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("f660bd41", new Object[]{photoView}) : photoView.onPhotoViewLongClickLisenter;
    }

    public PhotoView(Context context) {
        super(context);
        this.MAX_OVER_SCROLL = 0;
        this.MAX_FLING_OVER_SCROLL = 0;
        this.MAX_OVER_RESISTANCE = 0;
        this.MAX_ANIM_FROM_WAITE = 500;
        this.mBaseMatrix = new Matrix();
        this.mAnimaMatrix = new Matrix();
        this.mSynthesisMatrix = new Matrix();
        this.mTmpMatrix = new Matrix();
        this.isEnable = false;
        this.isRotateEnable = false;
        this.mScale = 1.0f;
        this.mWidgetRect = new RectF();
        this.mBaseRect = new RectF();
        this.mImgRect = new RectF();
        this.mTmpRect = new RectF();
        this.mCommonRect = new RectF();
        this.mScreenCenter = new PointF();
        this.mScaleCenter = new PointF();
        this.mRotateCenter = new PointF();
        this.mTranslate = new g();
        this.textSize = kil.b(14.0f);
        this.mRotateListener = new com.taobao.detail.rate.v2.d() { // from class: com.taobao.detail.rate.v2.PhotoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.detail.rate.v2.d
            public void a(float f2, float f3, float f4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
                    return;
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$002(photoView, PhotoView.access$000(photoView) + f2);
                if (PhotoView.access$100(PhotoView.this)) {
                    PhotoView photoView2 = PhotoView.this;
                    PhotoView.access$202(photoView2, PhotoView.access$200(photoView2) + f2);
                    PhotoView.access$300(PhotoView.this).postRotate(f2, f3, f4);
                } else if (Math.abs(PhotoView.access$000(PhotoView.this)) < PhotoView.access$400(PhotoView.this)) {
                } else {
                    PhotoView.access$102(PhotoView.this, true);
                    PhotoView.access$002(PhotoView.this, 0.0f);
                }
            }
        };
        this.mScaleListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.taobao.detail.rate.v2.PhotoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                }
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$502(photoView, PhotoView.access$500(photoView) * scaleFactor);
                PhotoView.access$300(PhotoView.this).postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                PhotoView.access$600(PhotoView.this);
                return true;
            }
        };
        this.mClickRunnable = new Runnable() { // from class: com.taobao.detail.rate.v2.PhotoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (PhotoView.access$700(PhotoView.this) == null) {
                } else {
                    PhotoView.access$700(PhotoView.this).onClick(PhotoView.this);
                }
            }
        };
        this.mGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.detail.rate.v2.PhotoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == -223117518) {
                    return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    return;
                }
                if (PhotoView.access$800(PhotoView.this) != null) {
                    PhotoView.access$800(PhotoView.this).onLongClick(PhotoView.this);
                }
                if (PhotoView.access$900(PhotoView.this) == null) {
                    return;
                }
                PhotoView.access$900(PhotoView.this);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
                }
                PhotoView.access$1002(PhotoView.this, false);
                PhotoView.access$1102(PhotoView.this, false);
                PhotoView.access$102(PhotoView.this, false);
                PhotoView photoView = PhotoView.this;
                photoView.removeCallbacks(PhotoView.access$1200(photoView));
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
                }
                if (PhotoView.access$1100(PhotoView.this)) {
                    return false;
                }
                if ((!PhotoView.access$1300(PhotoView.this) && !PhotoView.access$1400(PhotoView.this)) || PhotoView.access$1500(PhotoView.this).f17018a) {
                    return false;
                }
                float f4 = (((float) Math.round(PhotoView.access$1600(PhotoView.this).left)) >= PhotoView.access$1700(PhotoView.this).left || ((float) Math.round(PhotoView.access$1600(PhotoView.this).right)) <= PhotoView.access$1700(PhotoView.this).right) ? 0.0f : f2;
                float f5 = (((float) Math.round(PhotoView.access$1600(PhotoView.this).top)) >= PhotoView.access$1700(PhotoView.this).top || ((float) Math.round(PhotoView.access$1600(PhotoView.this).bottom)) <= PhotoView.access$1700(PhotoView.this).bottom) ? 0.0f : f3;
                if (PhotoView.access$100(PhotoView.this) || PhotoView.access$200(PhotoView.this) % 90.0f != 0.0f) {
                    float access$200 = ((int) (PhotoView.access$200(PhotoView.this) / 90.0f)) * 90;
                    float access$2002 = PhotoView.access$200(PhotoView.this) % 90.0f;
                    if (access$2002 > 45.0f) {
                        access$200 += 90.0f;
                    } else if (access$2002 < -45.0f) {
                        access$200 -= 90.0f;
                    }
                    PhotoView.access$1500(PhotoView.this).a((int) PhotoView.access$200(PhotoView.this), (int) access$200);
                    PhotoView.access$202(PhotoView.this, access$200);
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1800(photoView, PhotoView.access$1600(photoView));
                PhotoView.access$1500(PhotoView.this).b(f4, f5);
                PhotoView.access$1500(PhotoView.this).a();
                return super.onFling(motionEvent, motionEvent2, f2, f3);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
                }
                if (PhotoView.access$1500(PhotoView.this).f17018a) {
                    PhotoView.access$1500(PhotoView.this).b();
                }
                if (PhotoView.this.canScrollHorizontallySelf(f2)) {
                    if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).left - f2 > PhotoView.access$1700(PhotoView.this).left) {
                        f2 = PhotoView.access$1600(PhotoView.this).left;
                    }
                    if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).right - f2 < PhotoView.access$1700(PhotoView.this).right) {
                        f2 = PhotoView.access$1600(PhotoView.this).right - PhotoView.access$1700(PhotoView.this).right;
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(-f2, 0.0f);
                    PhotoView photoView = PhotoView.this;
                    PhotoView.access$1902(photoView, (int) (PhotoView.access$1900(photoView) - f2));
                } else if (PhotoView.access$1300(PhotoView.this) || PhotoView.access$1100(PhotoView.this) || PhotoView.access$1000(PhotoView.this)) {
                    PhotoView.access$2000(PhotoView.this);
                    if (!PhotoView.access$1100(PhotoView.this)) {
                        if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).left - f2 > PhotoView.access$2100(PhotoView.this).left) {
                            PhotoView photoView2 = PhotoView.this;
                            f2 = PhotoView.access$2200(photoView2, PhotoView.access$1600(photoView2).left - PhotoView.access$2100(PhotoView.this).left, f2);
                        }
                        if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).right - f2 < PhotoView.access$2100(PhotoView.this).right) {
                            PhotoView photoView3 = PhotoView.this;
                            f2 = PhotoView.access$2200(photoView3, PhotoView.access$1600(photoView3).right - PhotoView.access$2100(PhotoView.this).right, f2);
                        }
                    }
                    PhotoView photoView4 = PhotoView.this;
                    PhotoView.access$1902(photoView4, (int) (PhotoView.access$1900(photoView4) - f2));
                    PhotoView.access$300(PhotoView.this).postTranslate(-f2, 0.0f);
                    PhotoView.access$1002(PhotoView.this, true);
                }
                if (PhotoView.this.canScrollVerticallySelf(f3)) {
                    if (f3 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f3 > PhotoView.access$1700(PhotoView.this).top) {
                        f3 = PhotoView.access$1600(PhotoView.this).top;
                    }
                    if (f3 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f3 < PhotoView.access$1700(PhotoView.this).bottom) {
                        f3 = PhotoView.access$1600(PhotoView.this).bottom - PhotoView.access$1700(PhotoView.this).bottom;
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f3);
                    PhotoView photoView5 = PhotoView.this;
                    PhotoView.access$2302(photoView5, (int) (PhotoView.access$2300(photoView5) - f3));
                } else if (PhotoView.access$1400(PhotoView.this) || PhotoView.access$1000(PhotoView.this) || PhotoView.access$1100(PhotoView.this)) {
                    PhotoView.access$2000(PhotoView.this);
                    if (!PhotoView.access$1100(PhotoView.this)) {
                        if (f3 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f3 > PhotoView.access$2100(PhotoView.this).top) {
                            PhotoView photoView6 = PhotoView.this;
                            f3 = PhotoView.access$2400(photoView6, PhotoView.access$1600(photoView6).top - PhotoView.access$2100(PhotoView.this).top, f3);
                        }
                        if (f3 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f3 < PhotoView.access$2100(PhotoView.this).bottom) {
                            PhotoView photoView7 = PhotoView.this;
                            f3 = PhotoView.access$2400(photoView7, PhotoView.access$1600(photoView7).bottom - PhotoView.access$2100(PhotoView.this).bottom, f3);
                        }
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f3);
                    PhotoView photoView8 = PhotoView.this;
                    PhotoView.access$2302(photoView8, (int) (PhotoView.access$2300(photoView8) - f3));
                    PhotoView.access$1002(PhotoView.this, true);
                }
                PhotoView.access$600(PhotoView.this);
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onSingleTapUp(android.view.MotionEvent r7) {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.detail.rate.v2.PhotoView.AnonymousClass4.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1c
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r3] = r6
                    r1[r2] = r7
                    java.lang.String r7 = "5de27077"
                    java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    return r7
                L1c:
                    com.taobao.detail.rate.v2.PhotoView r0 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r0 = com.taobao.detail.rate.v2.PhotoView.access$2500(r0)
                    if (r0 == 0) goto L8c
                    com.taobao.detail.rate.v2.PhotoView r0 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r0 = com.taobao.detail.rate.v2.PhotoView.access$2500(r0)
                    int r0 = r0.size()
                    if (r0 <= 0) goto L8c
                    r0 = 0
                L31:
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r1 = com.taobao.detail.rate.v2.PhotoView.access$2500(r1)
                    int r1 = r1.size()
                    if (r0 >= r1) goto L8c
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r1 = com.taobao.detail.rate.v2.PhotoView.access$2500(r1)
                    java.lang.Object r1 = r1.get(r0)
                    android.graphics.Rect r1 = (android.graphics.Rect) r1
                    float r4 = r7.getX()
                    int r4 = (int) r4
                    float r5 = r7.getY()
                    int r5 = (int) r5
                    boolean r1 = r1.contains(r4, r5)
                    if (r1 == 0) goto L89
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    com.alibaba.fastjson.JSONArray r7 = com.taobao.detail.rate.v2.PhotoView.access$2600(r7)
                    if (r7 == 0) goto L8d
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    com.alibaba.fastjson.JSONArray r7 = com.taobao.detail.rate.v2.PhotoView.access$2600(r7)
                    com.alibaba.fastjson.JSONObject r7 = r7.getJSONObject(r0)
                    java.lang.String r0 = "detailUrl"
                    java.lang.String r1 = r7.getString(r0)
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L8d
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    android.content.Context r1 = r1.getContext()
                    com.taobao.android.nav.Nav r1 = com.taobao.android.nav.Nav.from(r1)
                    java.lang.String r7 = r7.getString(r0)
                    r1.toUri(r7)
                    goto L8d
                L89:
                    int r0 = r0 + 1
                    goto L31
                L8c:
                    r2 = 0
                L8d:
                    if (r2 != 0) goto L9a
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    java.lang.Runnable r0 = com.taobao.detail.rate.v2.PhotoView.access$1200(r7)
                    r1 = 250(0xfa, double:1.235E-321)
                    r7.postDelayed(r0, r1)
                L9a:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.v2.PhotoView.AnonymousClass4.onSingleTapUp(android.view.MotionEvent):boolean");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                float f2;
                float f3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                PhotoView.access$1500(PhotoView.this).b();
                float width = PhotoView.access$1600(PhotoView.this).left + (PhotoView.access$1600(PhotoView.this).width() / 2.0f);
                float height = PhotoView.access$1600(PhotoView.this).top + (PhotoView.access$1600(PhotoView.this).height() / 2.0f);
                PhotoView.access$2700(PhotoView.this).set(width, height);
                PhotoView.access$2800(PhotoView.this).set(width, height);
                PhotoView.access$1902(PhotoView.this, 0);
                PhotoView.access$2302(PhotoView.this, 0);
                if (PhotoView.access$2900(PhotoView.this)) {
                    f2 = PhotoView.access$500(PhotoView.this);
                    f3 = 1.0f;
                } else {
                    float access$500 = PhotoView.access$500(PhotoView.this);
                    float access$3000 = PhotoView.access$3000(PhotoView.this);
                    PhotoView.access$2700(PhotoView.this).set(motionEvent.getX(), motionEvent.getY());
                    f2 = access$500;
                    f3 = access$3000;
                }
                PhotoView.access$3100(PhotoView.this).reset();
                PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3200(PhotoView.this).left, -PhotoView.access$3200(PhotoView.this).top);
                PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3300(PhotoView.this), -PhotoView.access$3400(PhotoView.this));
                PhotoView.access$3100(PhotoView.this).postRotate(PhotoView.access$200(PhotoView.this), PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postScale(f3, f3, PhotoView.access$2700(PhotoView.this).x, PhotoView.access$2700(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$1900(PhotoView.this), PhotoView.access$2300(PhotoView.this));
                PhotoView.access$3100(PhotoView.this).mapRect(PhotoView.access$3500(PhotoView.this), PhotoView.access$3200(PhotoView.this));
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1800(photoView, PhotoView.access$3500(photoView));
                PhotoView photoView2 = PhotoView.this;
                PhotoView.access$2902(photoView2, true ^ PhotoView.access$2900(photoView2));
                PhotoView.access$1500(PhotoView.this).a(f2, f3);
                PhotoView.access$1500(PhotoView.this).a();
                return false;
            }
        };
        init();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MAX_OVER_SCROLL = 0;
        this.MAX_FLING_OVER_SCROLL = 0;
        this.MAX_OVER_RESISTANCE = 0;
        this.MAX_ANIM_FROM_WAITE = 500;
        this.mBaseMatrix = new Matrix();
        this.mAnimaMatrix = new Matrix();
        this.mSynthesisMatrix = new Matrix();
        this.mTmpMatrix = new Matrix();
        this.isEnable = false;
        this.isRotateEnable = false;
        this.mScale = 1.0f;
        this.mWidgetRect = new RectF();
        this.mBaseRect = new RectF();
        this.mImgRect = new RectF();
        this.mTmpRect = new RectF();
        this.mCommonRect = new RectF();
        this.mScreenCenter = new PointF();
        this.mScaleCenter = new PointF();
        this.mRotateCenter = new PointF();
        this.mTranslate = new g();
        this.textSize = kil.b(14.0f);
        this.mRotateListener = new com.taobao.detail.rate.v2.d() { // from class: com.taobao.detail.rate.v2.PhotoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.detail.rate.v2.d
            public void a(float f2, float f3, float f4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
                    return;
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$002(photoView, PhotoView.access$000(photoView) + f2);
                if (PhotoView.access$100(PhotoView.this)) {
                    PhotoView photoView2 = PhotoView.this;
                    PhotoView.access$202(photoView2, PhotoView.access$200(photoView2) + f2);
                    PhotoView.access$300(PhotoView.this).postRotate(f2, f3, f4);
                } else if (Math.abs(PhotoView.access$000(PhotoView.this)) < PhotoView.access$400(PhotoView.this)) {
                } else {
                    PhotoView.access$102(PhotoView.this, true);
                    PhotoView.access$002(PhotoView.this, 0.0f);
                }
            }
        };
        this.mScaleListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.taobao.detail.rate.v2.PhotoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                }
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$502(photoView, PhotoView.access$500(photoView) * scaleFactor);
                PhotoView.access$300(PhotoView.this).postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                PhotoView.access$600(PhotoView.this);
                return true;
            }
        };
        this.mClickRunnable = new Runnable() { // from class: com.taobao.detail.rate.v2.PhotoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (PhotoView.access$700(PhotoView.this) == null) {
                } else {
                    PhotoView.access$700(PhotoView.this).onClick(PhotoView.this);
                }
            }
        };
        this.mGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.detail.rate.v2.PhotoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == -223117518) {
                    return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    return;
                }
                if (PhotoView.access$800(PhotoView.this) != null) {
                    PhotoView.access$800(PhotoView.this).onLongClick(PhotoView.this);
                }
                if (PhotoView.access$900(PhotoView.this) == null) {
                    return;
                }
                PhotoView.access$900(PhotoView.this);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
                }
                PhotoView.access$1002(PhotoView.this, false);
                PhotoView.access$1102(PhotoView.this, false);
                PhotoView.access$102(PhotoView.this, false);
                PhotoView photoView = PhotoView.this;
                photoView.removeCallbacks(PhotoView.access$1200(photoView));
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
                }
                if (PhotoView.access$1100(PhotoView.this)) {
                    return false;
                }
                if ((!PhotoView.access$1300(PhotoView.this) && !PhotoView.access$1400(PhotoView.this)) || PhotoView.access$1500(PhotoView.this).f17018a) {
                    return false;
                }
                float f4 = (((float) Math.round(PhotoView.access$1600(PhotoView.this).left)) >= PhotoView.access$1700(PhotoView.this).left || ((float) Math.round(PhotoView.access$1600(PhotoView.this).right)) <= PhotoView.access$1700(PhotoView.this).right) ? 0.0f : f2;
                float f5 = (((float) Math.round(PhotoView.access$1600(PhotoView.this).top)) >= PhotoView.access$1700(PhotoView.this).top || ((float) Math.round(PhotoView.access$1600(PhotoView.this).bottom)) <= PhotoView.access$1700(PhotoView.this).bottom) ? 0.0f : f3;
                if (PhotoView.access$100(PhotoView.this) || PhotoView.access$200(PhotoView.this) % 90.0f != 0.0f) {
                    float access$200 = ((int) (PhotoView.access$200(PhotoView.this) / 90.0f)) * 90;
                    float access$2002 = PhotoView.access$200(PhotoView.this) % 90.0f;
                    if (access$2002 > 45.0f) {
                        access$200 += 90.0f;
                    } else if (access$2002 < -45.0f) {
                        access$200 -= 90.0f;
                    }
                    PhotoView.access$1500(PhotoView.this).a((int) PhotoView.access$200(PhotoView.this), (int) access$200);
                    PhotoView.access$202(PhotoView.this, access$200);
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1800(photoView, PhotoView.access$1600(photoView));
                PhotoView.access$1500(PhotoView.this).b(f4, f5);
                PhotoView.access$1500(PhotoView.this).a();
                return super.onFling(motionEvent, motionEvent2, f2, f3);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
                }
                if (PhotoView.access$1500(PhotoView.this).f17018a) {
                    PhotoView.access$1500(PhotoView.this).b();
                }
                if (PhotoView.this.canScrollHorizontallySelf(f2)) {
                    if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).left - f2 > PhotoView.access$1700(PhotoView.this).left) {
                        f2 = PhotoView.access$1600(PhotoView.this).left;
                    }
                    if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).right - f2 < PhotoView.access$1700(PhotoView.this).right) {
                        f2 = PhotoView.access$1600(PhotoView.this).right - PhotoView.access$1700(PhotoView.this).right;
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(-f2, 0.0f);
                    PhotoView photoView = PhotoView.this;
                    PhotoView.access$1902(photoView, (int) (PhotoView.access$1900(photoView) - f2));
                } else if (PhotoView.access$1300(PhotoView.this) || PhotoView.access$1100(PhotoView.this) || PhotoView.access$1000(PhotoView.this)) {
                    PhotoView.access$2000(PhotoView.this);
                    if (!PhotoView.access$1100(PhotoView.this)) {
                        if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).left - f2 > PhotoView.access$2100(PhotoView.this).left) {
                            PhotoView photoView2 = PhotoView.this;
                            f2 = PhotoView.access$2200(photoView2, PhotoView.access$1600(photoView2).left - PhotoView.access$2100(PhotoView.this).left, f2);
                        }
                        if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).right - f2 < PhotoView.access$2100(PhotoView.this).right) {
                            PhotoView photoView3 = PhotoView.this;
                            f2 = PhotoView.access$2200(photoView3, PhotoView.access$1600(photoView3).right - PhotoView.access$2100(PhotoView.this).right, f2);
                        }
                    }
                    PhotoView photoView4 = PhotoView.this;
                    PhotoView.access$1902(photoView4, (int) (PhotoView.access$1900(photoView4) - f2));
                    PhotoView.access$300(PhotoView.this).postTranslate(-f2, 0.0f);
                    PhotoView.access$1002(PhotoView.this, true);
                }
                if (PhotoView.this.canScrollVerticallySelf(f3)) {
                    if (f3 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f3 > PhotoView.access$1700(PhotoView.this).top) {
                        f3 = PhotoView.access$1600(PhotoView.this).top;
                    }
                    if (f3 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f3 < PhotoView.access$1700(PhotoView.this).bottom) {
                        f3 = PhotoView.access$1600(PhotoView.this).bottom - PhotoView.access$1700(PhotoView.this).bottom;
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f3);
                    PhotoView photoView5 = PhotoView.this;
                    PhotoView.access$2302(photoView5, (int) (PhotoView.access$2300(photoView5) - f3));
                } else if (PhotoView.access$1400(PhotoView.this) || PhotoView.access$1000(PhotoView.this) || PhotoView.access$1100(PhotoView.this)) {
                    PhotoView.access$2000(PhotoView.this);
                    if (!PhotoView.access$1100(PhotoView.this)) {
                        if (f3 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f3 > PhotoView.access$2100(PhotoView.this).top) {
                            PhotoView photoView6 = PhotoView.this;
                            f3 = PhotoView.access$2400(photoView6, PhotoView.access$1600(photoView6).top - PhotoView.access$2100(PhotoView.this).top, f3);
                        }
                        if (f3 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f3 < PhotoView.access$2100(PhotoView.this).bottom) {
                            PhotoView photoView7 = PhotoView.this;
                            f3 = PhotoView.access$2400(photoView7, PhotoView.access$1600(photoView7).bottom - PhotoView.access$2100(PhotoView.this).bottom, f3);
                        }
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f3);
                    PhotoView photoView8 = PhotoView.this;
                    PhotoView.access$2302(photoView8, (int) (PhotoView.access$2300(photoView8) - f3));
                    PhotoView.access$1002(PhotoView.this, true);
                }
                PhotoView.access$600(PhotoView.this);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onSingleTapUp(android.view.MotionEvent r7) {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.detail.rate.v2.PhotoView.AnonymousClass4.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1c
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r3] = r6
                    r1[r2] = r7
                    java.lang.String r7 = "5de27077"
                    java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    return r7
                L1c:
                    com.taobao.detail.rate.v2.PhotoView r0 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r0 = com.taobao.detail.rate.v2.PhotoView.access$2500(r0)
                    if (r0 == 0) goto L8c
                    com.taobao.detail.rate.v2.PhotoView r0 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r0 = com.taobao.detail.rate.v2.PhotoView.access$2500(r0)
                    int r0 = r0.size()
                    if (r0 <= 0) goto L8c
                    r0 = 0
                L31:
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r1 = com.taobao.detail.rate.v2.PhotoView.access$2500(r1)
                    int r1 = r1.size()
                    if (r0 >= r1) goto L8c
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r1 = com.taobao.detail.rate.v2.PhotoView.access$2500(r1)
                    java.lang.Object r1 = r1.get(r0)
                    android.graphics.Rect r1 = (android.graphics.Rect) r1
                    float r4 = r7.getX()
                    int r4 = (int) r4
                    float r5 = r7.getY()
                    int r5 = (int) r5
                    boolean r1 = r1.contains(r4, r5)
                    if (r1 == 0) goto L89
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    com.alibaba.fastjson.JSONArray r7 = com.taobao.detail.rate.v2.PhotoView.access$2600(r7)
                    if (r7 == 0) goto L8d
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    com.alibaba.fastjson.JSONArray r7 = com.taobao.detail.rate.v2.PhotoView.access$2600(r7)
                    com.alibaba.fastjson.JSONObject r7 = r7.getJSONObject(r0)
                    java.lang.String r0 = "detailUrl"
                    java.lang.String r1 = r7.getString(r0)
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L8d
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    android.content.Context r1 = r1.getContext()
                    com.taobao.android.nav.Nav r1 = com.taobao.android.nav.Nav.from(r1)
                    java.lang.String r7 = r7.getString(r0)
                    r1.toUri(r7)
                    goto L8d
                L89:
                    int r0 = r0 + 1
                    goto L31
                L8c:
                    r2 = 0
                L8d:
                    if (r2 != 0) goto L9a
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    java.lang.Runnable r0 = com.taobao.detail.rate.v2.PhotoView.access$1200(r7)
                    r1 = 250(0xfa, double:1.235E-321)
                    r7.postDelayed(r0, r1)
                L9a:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.v2.PhotoView.AnonymousClass4.onSingleTapUp(android.view.MotionEvent):boolean");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                float f2;
                float f3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                PhotoView.access$1500(PhotoView.this).b();
                float width = PhotoView.access$1600(PhotoView.this).left + (PhotoView.access$1600(PhotoView.this).width() / 2.0f);
                float height = PhotoView.access$1600(PhotoView.this).top + (PhotoView.access$1600(PhotoView.this).height() / 2.0f);
                PhotoView.access$2700(PhotoView.this).set(width, height);
                PhotoView.access$2800(PhotoView.this).set(width, height);
                PhotoView.access$1902(PhotoView.this, 0);
                PhotoView.access$2302(PhotoView.this, 0);
                if (PhotoView.access$2900(PhotoView.this)) {
                    f2 = PhotoView.access$500(PhotoView.this);
                    f3 = 1.0f;
                } else {
                    float access$500 = PhotoView.access$500(PhotoView.this);
                    float access$3000 = PhotoView.access$3000(PhotoView.this);
                    PhotoView.access$2700(PhotoView.this).set(motionEvent.getX(), motionEvent.getY());
                    f2 = access$500;
                    f3 = access$3000;
                }
                PhotoView.access$3100(PhotoView.this).reset();
                PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3200(PhotoView.this).left, -PhotoView.access$3200(PhotoView.this).top);
                PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3300(PhotoView.this), -PhotoView.access$3400(PhotoView.this));
                PhotoView.access$3100(PhotoView.this).postRotate(PhotoView.access$200(PhotoView.this), PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postScale(f3, f3, PhotoView.access$2700(PhotoView.this).x, PhotoView.access$2700(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$1900(PhotoView.this), PhotoView.access$2300(PhotoView.this));
                PhotoView.access$3100(PhotoView.this).mapRect(PhotoView.access$3500(PhotoView.this), PhotoView.access$3200(PhotoView.this));
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1800(photoView, PhotoView.access$3500(photoView));
                PhotoView photoView2 = PhotoView.this;
                PhotoView.access$2902(photoView2, true ^ PhotoView.access$2900(photoView2));
                PhotoView.access$1500(PhotoView.this).a(f2, f3);
                PhotoView.access$1500(PhotoView.this).a();
                return false;
            }
        };
        init();
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MAX_OVER_SCROLL = 0;
        this.MAX_FLING_OVER_SCROLL = 0;
        this.MAX_OVER_RESISTANCE = 0;
        this.MAX_ANIM_FROM_WAITE = 500;
        this.mBaseMatrix = new Matrix();
        this.mAnimaMatrix = new Matrix();
        this.mSynthesisMatrix = new Matrix();
        this.mTmpMatrix = new Matrix();
        this.isEnable = false;
        this.isRotateEnable = false;
        this.mScale = 1.0f;
        this.mWidgetRect = new RectF();
        this.mBaseRect = new RectF();
        this.mImgRect = new RectF();
        this.mTmpRect = new RectF();
        this.mCommonRect = new RectF();
        this.mScreenCenter = new PointF();
        this.mScaleCenter = new PointF();
        this.mRotateCenter = new PointF();
        this.mTranslate = new g();
        this.textSize = kil.b(14.0f);
        this.mRotateListener = new com.taobao.detail.rate.v2.d() { // from class: com.taobao.detail.rate.v2.PhotoView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.detail.rate.v2.d
            public void a(float f2, float f3, float f4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("25edca58", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
                    return;
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$002(photoView, PhotoView.access$000(photoView) + f2);
                if (PhotoView.access$100(PhotoView.this)) {
                    PhotoView photoView2 = PhotoView.this;
                    PhotoView.access$202(photoView2, PhotoView.access$200(photoView2) + f2);
                    PhotoView.access$300(PhotoView.this).postRotate(f2, f3, f4);
                } else if (Math.abs(PhotoView.access$000(PhotoView.this)) < PhotoView.access$400(PhotoView.this)) {
                } else {
                    PhotoView.access$102(PhotoView.this, true);
                    PhotoView.access$002(PhotoView.this, 0.0f);
                }
            }
        };
        this.mScaleListener = new ScaleGestureDetector.OnScaleGestureListener() { // from class: com.taobao.detail.rate.v2.PhotoView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("8bc93791", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d53c49db", new Object[]{this, scaleGestureDetector});
                }
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("e2015504", new Object[]{this, scaleGestureDetector})).booleanValue();
                }
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$502(photoView, PhotoView.access$500(photoView) * scaleFactor);
                PhotoView.access$300(PhotoView.this).postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                PhotoView.access$600(PhotoView.this);
                return true;
            }
        };
        this.mClickRunnable = new Runnable() { // from class: com.taobao.detail.rate.v2.PhotoView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (PhotoView.access$700(PhotoView.this) == null) {
                } else {
                    PhotoView.access$700(PhotoView.this).onClick(PhotoView.this);
                }
            }
        };
        this.mGestureListener = new GestureDetector.SimpleOnGestureListener() { // from class: com.taobao.detail.rate.v2.PhotoView.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
                if (str.hashCode() == -223117518) {
                    return new Boolean(super.onFling((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onLongPress(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8638ede4", new Object[]{this, motionEvent});
                    return;
                }
                if (PhotoView.access$800(PhotoView.this) != null) {
                    PhotoView.access$800(PhotoView.this).onLongClick(PhotoView.this);
                }
                if (PhotoView.access$900(PhotoView.this) == null) {
                    return;
                }
                PhotoView.access$900(PhotoView.this);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("22fe0341", new Object[]{this, motionEvent})).booleanValue();
                }
                PhotoView.access$1002(PhotoView.this, false);
                PhotoView.access$1102(PhotoView.this, false);
                PhotoView.access$102(PhotoView.this, false);
                PhotoView photoView = PhotoView.this;
                photoView.removeCallbacks(PhotoView.access$1200(photoView));
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("f2b37f32", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
                }
                if (PhotoView.access$1100(PhotoView.this)) {
                    return false;
                }
                if ((!PhotoView.access$1300(PhotoView.this) && !PhotoView.access$1400(PhotoView.this)) || PhotoView.access$1500(PhotoView.this).f17018a) {
                    return false;
                }
                float f4 = (((float) Math.round(PhotoView.access$1600(PhotoView.this).left)) >= PhotoView.access$1700(PhotoView.this).left || ((float) Math.round(PhotoView.access$1600(PhotoView.this).right)) <= PhotoView.access$1700(PhotoView.this).right) ? 0.0f : f2;
                float f5 = (((float) Math.round(PhotoView.access$1600(PhotoView.this).top)) >= PhotoView.access$1700(PhotoView.this).top || ((float) Math.round(PhotoView.access$1600(PhotoView.this).bottom)) <= PhotoView.access$1700(PhotoView.this).bottom) ? 0.0f : f3;
                if (PhotoView.access$100(PhotoView.this) || PhotoView.access$200(PhotoView.this) % 90.0f != 0.0f) {
                    float access$200 = ((int) (PhotoView.access$200(PhotoView.this) / 90.0f)) * 90;
                    float access$2002 = PhotoView.access$200(PhotoView.this) % 90.0f;
                    if (access$2002 > 45.0f) {
                        access$200 += 90.0f;
                    } else if (access$2002 < -45.0f) {
                        access$200 -= 90.0f;
                    }
                    PhotoView.access$1500(PhotoView.this).a((int) PhotoView.access$200(PhotoView.this), (int) access$200);
                    PhotoView.access$202(PhotoView.this, access$200);
                }
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1800(photoView, PhotoView.access$1600(photoView));
                PhotoView.access$1500(PhotoView.this).b(f4, f5);
                PhotoView.access$1500(PhotoView.this).a();
                return super.onFling(motionEvent, motionEvent2, f2, f3);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, motionEvent, motionEvent2, new Float(f2), new Float(f3)})).booleanValue();
                }
                if (PhotoView.access$1500(PhotoView.this).f17018a) {
                    PhotoView.access$1500(PhotoView.this).b();
                }
                if (PhotoView.this.canScrollHorizontallySelf(f2)) {
                    if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).left - f2 > PhotoView.access$1700(PhotoView.this).left) {
                        f2 = PhotoView.access$1600(PhotoView.this).left;
                    }
                    if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).right - f2 < PhotoView.access$1700(PhotoView.this).right) {
                        f2 = PhotoView.access$1600(PhotoView.this).right - PhotoView.access$1700(PhotoView.this).right;
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(-f2, 0.0f);
                    PhotoView photoView = PhotoView.this;
                    PhotoView.access$1902(photoView, (int) (PhotoView.access$1900(photoView) - f2));
                } else if (PhotoView.access$1300(PhotoView.this) || PhotoView.access$1100(PhotoView.this) || PhotoView.access$1000(PhotoView.this)) {
                    PhotoView.access$2000(PhotoView.this);
                    if (!PhotoView.access$1100(PhotoView.this)) {
                        if (f2 < 0.0f && PhotoView.access$1600(PhotoView.this).left - f2 > PhotoView.access$2100(PhotoView.this).left) {
                            PhotoView photoView2 = PhotoView.this;
                            f2 = PhotoView.access$2200(photoView2, PhotoView.access$1600(photoView2).left - PhotoView.access$2100(PhotoView.this).left, f2);
                        }
                        if (f2 > 0.0f && PhotoView.access$1600(PhotoView.this).right - f2 < PhotoView.access$2100(PhotoView.this).right) {
                            PhotoView photoView3 = PhotoView.this;
                            f2 = PhotoView.access$2200(photoView3, PhotoView.access$1600(photoView3).right - PhotoView.access$2100(PhotoView.this).right, f2);
                        }
                    }
                    PhotoView photoView4 = PhotoView.this;
                    PhotoView.access$1902(photoView4, (int) (PhotoView.access$1900(photoView4) - f2));
                    PhotoView.access$300(PhotoView.this).postTranslate(-f2, 0.0f);
                    PhotoView.access$1002(PhotoView.this, true);
                }
                if (PhotoView.this.canScrollVerticallySelf(f3)) {
                    if (f3 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f3 > PhotoView.access$1700(PhotoView.this).top) {
                        f3 = PhotoView.access$1600(PhotoView.this).top;
                    }
                    if (f3 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f3 < PhotoView.access$1700(PhotoView.this).bottom) {
                        f3 = PhotoView.access$1600(PhotoView.this).bottom - PhotoView.access$1700(PhotoView.this).bottom;
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f3);
                    PhotoView photoView5 = PhotoView.this;
                    PhotoView.access$2302(photoView5, (int) (PhotoView.access$2300(photoView5) - f3));
                } else if (PhotoView.access$1400(PhotoView.this) || PhotoView.access$1000(PhotoView.this) || PhotoView.access$1100(PhotoView.this)) {
                    PhotoView.access$2000(PhotoView.this);
                    if (!PhotoView.access$1100(PhotoView.this)) {
                        if (f3 < 0.0f && PhotoView.access$1600(PhotoView.this).top - f3 > PhotoView.access$2100(PhotoView.this).top) {
                            PhotoView photoView6 = PhotoView.this;
                            f3 = PhotoView.access$2400(photoView6, PhotoView.access$1600(photoView6).top - PhotoView.access$2100(PhotoView.this).top, f3);
                        }
                        if (f3 > 0.0f && PhotoView.access$1600(PhotoView.this).bottom - f3 < PhotoView.access$2100(PhotoView.this).bottom) {
                            PhotoView photoView7 = PhotoView.this;
                            f3 = PhotoView.access$2400(photoView7, PhotoView.access$1600(photoView7).bottom - PhotoView.access$2100(PhotoView.this).bottom, f3);
                        }
                    }
                    PhotoView.access$300(PhotoView.this).postTranslate(0.0f, -f3);
                    PhotoView photoView8 = PhotoView.this;
                    PhotoView.access$2302(photoView8, (int) (PhotoView.access$2300(photoView8) - f3));
                    PhotoView.access$1002(PhotoView.this, true);
                }
                PhotoView.access$600(PhotoView.this);
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public boolean onSingleTapUp(android.view.MotionEvent r7) {
                /*
                    r6 = this;
                    com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.detail.rate.v2.PhotoView.AnonymousClass4.$ipChange
                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L1c
                    r1 = 2
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    r1[r3] = r6
                    r1[r2] = r7
                    java.lang.String r7 = "5de27077"
                    java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    return r7
                L1c:
                    com.taobao.detail.rate.v2.PhotoView r0 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r0 = com.taobao.detail.rate.v2.PhotoView.access$2500(r0)
                    if (r0 == 0) goto L8c
                    com.taobao.detail.rate.v2.PhotoView r0 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r0 = com.taobao.detail.rate.v2.PhotoView.access$2500(r0)
                    int r0 = r0.size()
                    if (r0 <= 0) goto L8c
                    r0 = 0
                L31:
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r1 = com.taobao.detail.rate.v2.PhotoView.access$2500(r1)
                    int r1 = r1.size()
                    if (r0 >= r1) goto L8c
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    java.util.List r1 = com.taobao.detail.rate.v2.PhotoView.access$2500(r1)
                    java.lang.Object r1 = r1.get(r0)
                    android.graphics.Rect r1 = (android.graphics.Rect) r1
                    float r4 = r7.getX()
                    int r4 = (int) r4
                    float r5 = r7.getY()
                    int r5 = (int) r5
                    boolean r1 = r1.contains(r4, r5)
                    if (r1 == 0) goto L89
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    com.alibaba.fastjson.JSONArray r7 = com.taobao.detail.rate.v2.PhotoView.access$2600(r7)
                    if (r7 == 0) goto L8d
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    com.alibaba.fastjson.JSONArray r7 = com.taobao.detail.rate.v2.PhotoView.access$2600(r7)
                    com.alibaba.fastjson.JSONObject r7 = r7.getJSONObject(r0)
                    java.lang.String r0 = "detailUrl"
                    java.lang.String r1 = r7.getString(r0)
                    boolean r1 = android.text.TextUtils.isEmpty(r1)
                    if (r1 != 0) goto L8d
                    com.taobao.detail.rate.v2.PhotoView r1 = com.taobao.detail.rate.v2.PhotoView.this
                    android.content.Context r1 = r1.getContext()
                    com.taobao.android.nav.Nav r1 = com.taobao.android.nav.Nav.from(r1)
                    java.lang.String r7 = r7.getString(r0)
                    r1.toUri(r7)
                    goto L8d
                L89:
                    int r0 = r0 + 1
                    goto L31
                L8c:
                    r2 = 0
                L8d:
                    if (r2 != 0) goto L9a
                    com.taobao.detail.rate.v2.PhotoView r7 = com.taobao.detail.rate.v2.PhotoView.this
                    java.lang.Runnable r0 = com.taobao.detail.rate.v2.PhotoView.access$1200(r7)
                    r1 = 250(0xfa, double:1.235E-321)
                    r7.postDelayed(r0, r1)
                L9a:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.v2.PhotoView.AnonymousClass4.onSingleTapUp(android.view.MotionEvent):boolean");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                float f2;
                float f3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("7a319393", new Object[]{this, motionEvent})).booleanValue();
                }
                PhotoView.access$1500(PhotoView.this).b();
                float width = PhotoView.access$1600(PhotoView.this).left + (PhotoView.access$1600(PhotoView.this).width() / 2.0f);
                float height = PhotoView.access$1600(PhotoView.this).top + (PhotoView.access$1600(PhotoView.this).height() / 2.0f);
                PhotoView.access$2700(PhotoView.this).set(width, height);
                PhotoView.access$2800(PhotoView.this).set(width, height);
                PhotoView.access$1902(PhotoView.this, 0);
                PhotoView.access$2302(PhotoView.this, 0);
                if (PhotoView.access$2900(PhotoView.this)) {
                    f2 = PhotoView.access$500(PhotoView.this);
                    f3 = 1.0f;
                } else {
                    float access$500 = PhotoView.access$500(PhotoView.this);
                    float access$3000 = PhotoView.access$3000(PhotoView.this);
                    PhotoView.access$2700(PhotoView.this).set(motionEvent.getX(), motionEvent.getY());
                    f2 = access$500;
                    f3 = access$3000;
                }
                PhotoView.access$3100(PhotoView.this).reset();
                PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3200(PhotoView.this).left, -PhotoView.access$3200(PhotoView.this).top);
                PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postTranslate(-PhotoView.access$3300(PhotoView.this), -PhotoView.access$3400(PhotoView.this));
                PhotoView.access$3100(PhotoView.this).postRotate(PhotoView.access$200(PhotoView.this), PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postScale(f3, f3, PhotoView.access$2700(PhotoView.this).x, PhotoView.access$2700(PhotoView.this).y);
                PhotoView.access$3100(PhotoView.this).postTranslate(PhotoView.access$1900(PhotoView.this), PhotoView.access$2300(PhotoView.this));
                PhotoView.access$3100(PhotoView.this).mapRect(PhotoView.access$3500(PhotoView.this), PhotoView.access$3200(PhotoView.this));
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1800(photoView, PhotoView.access$3500(photoView));
                PhotoView photoView2 = PhotoView.this;
                PhotoView.access$2902(photoView2, true ^ PhotoView.access$2900(photoView2));
                PhotoView.access$1500(PhotoView.this).a(f2, f3);
                PhotoView.access$1500(PhotoView.this).a();
                return false;
            }
        };
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.mScaleType == null) {
            this.mScaleType = ImageView.ScaleType.CENTER_INSIDE;
        }
        this.mRotateDetector = new com.taobao.detail.rate.v2.g(this.mRotateListener);
        this.mDetector = new GestureDetector(getContext(), this.mGestureListener);
        this.mScaleDetector = new ScaleGestureDetector(getContext(), this.mScaleListener);
        float f2 = getResources().getDisplayMetrics().density;
        int i = (int) (30.0f * f2);
        this.MAX_OVER_SCROLL = i;
        this.MAX_FLING_OVER_SCROLL = i;
        this.MAX_OVER_RESISTANCE = (int) (f2 * 140.0f);
        this.mBackPaint = new Paint();
        this.mBackPaint.setColor(Color.parseColor("#80000000"));
        this.mForePaint = new Paint();
        this.mForePaint.setColor(Color.parseColor("#F0FFFFFF"));
        this.mForePaint.setTextSize(this.textSize * this.mScale);
        this.mBackRectList = new ArrayList();
        this.mForeRectList = new ArrayList();
        this.mMinRotate = 35;
        this.mAnimaDuring = ANIMA_DURING;
        this.mMaxScale = MAX_SCALE;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
            return;
        }
        super.setOnClickListener(onClickListener);
        this.mClickListener = onClickListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
        } else if (scaleType == ImageView.ScaleType.MATRIX || scaleType == this.mScaleType) {
        } else {
            this.mScaleType = scaleType;
            if (!this.isInit) {
                return;
            }
            initBase();
        }
    }

    public void setTagData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43b2d0e7", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.tagData = jSONObject.getJSONArray("tags");
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        JSONArray jSONArray = this.tagData;
        if (jSONArray == null || jSONArray.size() <= 0) {
            return;
        }
        this.mBackRectList.clear();
        this.mForeRectList.clear();
        for (int i = 0; i < this.tagData.size(); i++) {
            JSONObject jSONObject = this.tagData.getJSONObject(i);
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("position");
            if (!TextUtils.isEmpty(string2)) {
                String[] split = string2.split(",");
                if (split.length == 2) {
                    int floatValue = (int) (((Float.valueOf(split[0]).floatValue() * this.mBaseRect.width()) + this.mBaseRect.left) * 1.0f);
                    int floatValue2 = (int) (((Float.valueOf(split[1]).floatValue() * this.mBaseRect.height()) + this.mBaseRect.top) * 1.0f);
                    Rect rect = new Rect();
                    this.mForePaint.setTextSize(this.textSize * 1.0f);
                    this.mForePaint.getTextBounds(string, 0, string.length(), rect);
                    float f2 = floatValue;
                    float f3 = floatValue2;
                    Rect rect2 = new Rect((int) (f2 - 30.0f), (int) ((floatValue2 - rect.height()) - 20.0f), (int) (floatValue + rect.width() + 30.0f), (int) (30.0f + f3));
                    canvas.drawRect(rect2, this.mBackPaint);
                    canvas.drawText(string, f2, f3, this.mForePaint);
                    this.mBackRectList.add(rect2);
                    this.mForeRectList.add(rect);
                }
            }
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f73f2f", new Object[]{this, onLongClickListener});
        } else {
            this.mLongClick = onLongClickListener;
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("594234d5", new Object[]{this, interpolator});
        } else {
            this.mTranslate.a(interpolator);
        }
    }

    public int getAnimaDuring() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dfcda495", new Object[]{this})).intValue() : this.mAnimaDuring;
    }

    public void setAnimaDuring(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde3f7ad", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimaDuring = i;
        }
    }

    public void setMaxScale(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a31e051", new Object[]{this, new Float(f2)});
        } else {
            this.mMaxScale = f2;
        }
    }

    public float getMaxScale() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9c1bb633", new Object[]{this})).floatValue() : this.mMaxScale;
    }

    public void enable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
        } else {
            this.isEnable = true;
        }
    }

    public void disenable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68ddb98", new Object[]{this});
        } else {
            this.isEnable = false;
        }
    }

    public boolean isScaled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f442e4af", new Object[]{this})).booleanValue() : ((double) Math.abs(this.mScale - 1.0f)) > mto.a.GEO_NOT_SUPPORT;
    }

    public void enableRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed407645", new Object[]{this});
        } else {
            this.isRotateEnable = true;
        }
    }

    public void disableRotate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b72bb96a", new Object[]{this});
        } else {
            this.isRotateEnable = false;
        }
    }

    public void setMaxAnimFromWaiteTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d0bb7c", new Object[]{this, new Integer(i)});
        } else {
            this.MAX_ANIM_FROM_WAITE = i;
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
            return;
        }
        Drawable drawable = null;
        try {
            drawable = getResources().getDrawable(i);
        } catch (Exception unused) {
        }
        setImageDrawable(drawable);
    }

    @Override // com.taobao.uikit.extend.feature.view.TUrlImageView, com.taobao.uikit.feature.view.TImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb707302", new Object[]{this, drawable});
            return;
        }
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.hasDrawable = false;
        } else if (!hasSize(drawable)) {
        } else {
            if (!this.hasDrawable) {
                this.hasDrawable = true;
            }
            initBase();
        }
    }

    private boolean hasSize(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("465fa2ea", new Object[]{this, drawable})).booleanValue() : (drawable.getIntrinsicHeight() > 0 && drawable.getIntrinsicWidth() > 0) || (drawable.getMinimumWidth() > 0 && drawable.getMinimumHeight() > 0) || (drawable.getBounds().width() > 0 && drawable.getBounds().height() > 0);
    }

    private static int getDrawableWidth(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("46066230", new Object[]{drawable})).intValue();
        }
        if (drawable == null) {
            return 0;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        int i = intrinsicWidth;
        return i <= 0 ? drawable.getBounds().width() : i;
    }

    private static int getDrawableHeight(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b360d579", new Object[]{drawable})).intValue();
        }
        if (drawable == null) {
            return 0;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        int i = intrinsicHeight;
        return i <= 0 ? drawable.getBounds().height() : i;
    }

    private void initBase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206f7408", new Object[]{this});
        } else if (!this.hasDrawable || !this.isKnowSize) {
        } else {
            this.mBaseMatrix.reset();
            this.mAnimaMatrix.reset();
            this.isZoonUp = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int drawableWidth = getDrawableWidth(drawable);
            int drawableHeight = getDrawableHeight(drawable);
            float f2 = drawableWidth;
            float f3 = drawableHeight;
            this.mBaseRect.set(0.0f, 0.0f, f2, f3);
            int i = (width - drawableWidth) / 2;
            int i2 = (height - drawableHeight) / 2;
            float f4 = 1.0f;
            float f5 = drawableWidth > width ? width / f2 : 1.0f;
            if (drawableHeight > height) {
                f4 = height / f3;
            }
            if (f5 >= f4) {
                f5 = f4;
            }
            this.mBaseMatrix.reset();
            this.mBaseMatrix.postTranslate(i, i2);
            this.mBaseMatrix.postScale(f5, f5, this.mScreenCenter.x, this.mScreenCenter.y);
            this.mBaseMatrix.mapRect(this.mBaseRect);
            this.mHalfBaseRectWidth = this.mBaseRect.width() / 2.0f;
            this.mHalfBaseRectHeight = this.mBaseRect.height() / 2.0f;
            this.mScaleCenter.set(this.mScreenCenter);
            this.mRotateCenter.set(this.mScaleCenter);
            executeTranslate();
            switch (AnonymousClass6.f17013a[this.mScaleType.ordinal()]) {
                case 1:
                    initCenter();
                    break;
                case 2:
                    initCenterCrop();
                    break;
                case 3:
                    initCenterInside();
                    break;
                case 4:
                    initFitCenter();
                    break;
                case 5:
                    initFitStart();
                    break;
                case 6:
                    initFitEnd();
                    break;
                case 7:
                    initFitXY();
                    break;
            }
            this.isInit = true;
            if (this.mFromInfo != null && System.currentTimeMillis() - this.mInfoTime < this.MAX_ANIM_FROM_WAITE) {
                animaFrom(this.mFromInfo);
            }
            this.mFromInfo = null;
        }
    }

    private void initCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc44b8c", new Object[]{this});
        } else if (!this.hasDrawable || !this.isKnowSize) {
        } else {
            Drawable drawable = getDrawable();
            int drawableWidth = getDrawableWidth(drawable);
            int drawableHeight = getDrawableHeight(drawable);
            float f2 = drawableWidth;
            if (f2 <= this.mWidgetRect.width() && drawableHeight <= this.mWidgetRect.height()) {
                return;
            }
            float width = f2 / this.mImgRect.width();
            float height = drawableHeight / this.mImgRect.height();
            if (width > height) {
                height = width;
            }
            this.mScale = height;
            Matrix matrix = this.mAnimaMatrix;
            float f3 = this.mScale;
            matrix.postScale(f3, f3, this.mScreenCenter.x, this.mScreenCenter.y);
            executeTranslate();
            resetBase();
        }
    }

    private void initCenterCrop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5897bc", new Object[]{this});
        } else if (this.mImgRect.width() >= this.mWidgetRect.width() && this.mImgRect.height() >= this.mWidgetRect.height()) {
        } else {
            float width = this.mWidgetRect.width() / this.mImgRect.width();
            float height = this.mWidgetRect.height() / this.mImgRect.height();
            if (width <= height) {
                width = height;
            }
            this.mScale = width;
            Matrix matrix = this.mAnimaMatrix;
            float f2 = this.mScale;
            matrix.postScale(f2, f2, this.mScreenCenter.x, this.mScreenCenter.y);
            executeTranslate();
            resetBase();
        }
    }

    private void initCenterInside() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf481e8", new Object[]{this});
        } else if (this.mImgRect.width() <= this.mWidgetRect.width() && this.mImgRect.height() <= this.mWidgetRect.height()) {
        } else {
            float width = this.mWidgetRect.width() / this.mImgRect.width();
            float height = this.mWidgetRect.height() / this.mImgRect.height();
            if (width >= height) {
                width = height;
            }
            this.mScale = width;
            Matrix matrix = this.mAnimaMatrix;
            float f2 = this.mScale;
            matrix.postScale(f2, f2, this.mScreenCenter.x, this.mScreenCenter.y);
            executeTranslate();
            resetBase();
        }
    }

    private void initFitCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c92aea1d", new Object[]{this});
        } else if (this.mImgRect.width() >= this.mWidgetRect.width()) {
        } else {
            this.mScale = this.mWidgetRect.width() / this.mImgRect.width();
            Matrix matrix = this.mAnimaMatrix;
            float f2 = this.mScale;
            matrix.postScale(f2, f2, this.mScreenCenter.x, this.mScreenCenter.y);
            executeTranslate();
            resetBase();
        }
    }

    private void initFitStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae8f8008", new Object[]{this});
            return;
        }
        initFitCenter();
        float f2 = -this.mImgRect.top;
        this.mAnimaMatrix.postTranslate(0.0f, f2);
        executeTranslate();
        resetBase();
        this.mTranslateY = (int) (this.mTranslateY + f2);
    }

    private void initFitEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714adbc1", new Object[]{this});
            return;
        }
        initFitCenter();
        float f2 = this.mWidgetRect.bottom - this.mImgRect.bottom;
        this.mTranslateY = (int) (this.mTranslateY + f2);
        this.mAnimaMatrix.postTranslate(0.0f, f2);
        executeTranslate();
        resetBase();
    }

    private void initFitXY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb20f29", new Object[]{this});
            return;
        }
        this.mAnimaMatrix.postScale(this.mWidgetRect.width() / this.mImgRect.width(), this.mWidgetRect.height() / this.mImgRect.height(), this.mScreenCenter.x, this.mScreenCenter.y);
        executeTranslate();
        resetBase();
    }

    private void resetBase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f537d47", new Object[]{this});
            return;
        }
        Drawable drawable = getDrawable();
        this.mBaseRect.set(0.0f, 0.0f, getDrawableWidth(drawable), getDrawableHeight(drawable));
        this.mBaseMatrix.set(this.mSynthesisMatrix);
        this.mBaseMatrix.mapRect(this.mBaseRect);
        this.mHalfBaseRectWidth = this.mBaseRect.width() / 2.0f;
        this.mHalfBaseRectHeight = this.mBaseRect.height() / 2.0f;
        this.mScale = 1.0f;
        this.mTranslateX = 0;
        this.mTranslateY = 0;
        this.mAnimaMatrix.reset();
    }

    private void executeTranslate() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6ddd60", new Object[]{this});
            return;
        }
        this.mSynthesisMatrix.set(this.mBaseMatrix);
        this.mSynthesisMatrix.postConcat(this.mAnimaMatrix);
        setImageMatrix(this.mSynthesisMatrix);
        this.mAnimaMatrix.mapRect(this.mImgRect, this.mBaseRect);
        this.imgLargeWidth = this.mImgRect.width() > this.mWidgetRect.width();
        if (this.mImgRect.height() > this.mWidgetRect.height()) {
            z = true;
        }
        this.imgLargeHeight = z;
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (!this.hasDrawable) {
            super.onMeasure(i, i2);
        } else {
            Drawable drawable = getDrawable();
            int drawableWidth = getDrawableWidth(drawable);
            int drawableHeight = getDrawableHeight(drawable);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
            }
            if (layoutParams.width != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || drawableWidth <= size) : mode == 0) {
                size = drawableWidth;
            }
            if (layoutParams.height != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || drawableHeight <= size2) : mode2 == 0) {
                size2 = drawableHeight;
            }
            if (drawableHeight > 0 && size2 > 0 && drawableWidth > 0 && this.mAdjustViewBounds) {
                float f2 = drawableWidth;
                float f3 = drawableHeight;
                float f4 = size;
                float f5 = size2;
                if (f2 / f3 != f4 / f5) {
                    float f6 = f5 / f3;
                    float f7 = f4 / f2;
                    if (f6 < f7) {
                        f7 = f6;
                    }
                    if (layoutParams.width != -1) {
                        size = (int) (f2 * f7);
                    }
                    if (layoutParams.height != -1) {
                        size2 = (int) (f3 * f7);
                    }
                }
            }
            setMeasuredDimension(size, size2);
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("351c8ae2", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setAdjustViewBounds(z);
        this.mAdjustViewBounds = z;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mWidgetRect.set(0.0f, 0.0f, i, i2);
        this.mScreenCenter.set(i / 2, i2 / 2);
        if (this.isKnowSize) {
            return;
        }
        this.isKnowSize = true;
        initBase();
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        RectF rectF = this.mClip;
        if (rectF != null) {
            canvas.clipRect(rectF);
            this.mClip = null;
        }
        super.draw(canvas);
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.isEnable) {
            int actionMasked = motionEvent.getActionMasked();
            if (motionEvent.getPointerCount() >= 2) {
                this.hasMultiTouch = true;
                this.mScale *= 1.001f;
            }
            this.mDetector.onTouchEvent(motionEvent);
            if (this.isRotateEnable) {
                this.mRotateDetector.a(motionEvent);
            }
            this.mScaleDetector.onTouchEvent(motionEvent);
            if (actionMasked == 1 || actionMasked == 3) {
                onUp(motionEvent);
            }
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onUp(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64597736", new Object[]{this, motionEvent});
        } else if (this.mTranslate.f17018a) {
        } else {
            if (this.canRotate || this.mDegrees % 90.0f != 0.0f) {
                float f2 = this.mDegrees;
                float f3 = ((int) (f2 / 90.0f)) * 90;
                float f4 = f2 % 90.0f;
                if (f4 > 45.0f) {
                    f3 += 90.0f;
                } else if (f4 < -45.0f) {
                    f3 -= 90.0f;
                }
                this.mTranslate.a((int) this.mDegrees, (int) f3);
                this.mDegrees = f3;
            }
            float f5 = this.mScale;
            float f6 = 1.0f;
            if (f5 < 1.0f) {
                this.mTranslate.a(f5, 1.0f);
            } else {
                f6 = this.mMaxScale;
                if (f5 > f6) {
                    this.mTranslate.a(f5, f6);
                } else {
                    f6 = f5;
                }
            }
            float width = this.mImgRect.left + (this.mImgRect.width() / 2.0f);
            float height = this.mImgRect.top + (this.mImgRect.height() / 2.0f);
            this.mScaleCenter.set(width, height);
            this.mRotateCenter.set(width, height);
            this.mTranslateX = 0;
            this.mTranslateY = 0;
            this.mTmpMatrix.reset();
            this.mTmpMatrix.postTranslate(-this.mBaseRect.left, -this.mBaseRect.top);
            this.mTmpMatrix.postTranslate(width - this.mHalfBaseRectWidth, height - this.mHalfBaseRectHeight);
            this.mTmpMatrix.postScale(f6, f6, width, height);
            this.mTmpMatrix.postRotate(this.mDegrees, width, height);
            this.mTmpMatrix.mapRect(this.mTmpRect, this.mBaseRect);
            doTranslateReset(this.mTmpRect);
            this.mTranslate.a();
        }
    }

    private void doTranslateReset(RectF rectF) {
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484f9aa4", new Object[]{this, rectF});
            return;
        }
        if (rectF.width() <= this.mWidgetRect.width()) {
            if (!isImageCenterWidth(rectF)) {
                i = -((int) (((this.mWidgetRect.width() - rectF.width()) / 2.0f) - rectF.left));
            }
            i = 0;
        } else {
            if (rectF.left > this.mWidgetRect.left) {
                f2 = rectF.left;
                f3 = this.mWidgetRect.left;
            } else {
                if (rectF.right < this.mWidgetRect.right) {
                    f2 = rectF.right;
                    f3 = this.mWidgetRect.right;
                }
                i = 0;
            }
            i = (int) (f2 - f3);
        }
        if (rectF.height() <= this.mWidgetRect.height()) {
            if (!isImageCenterHeight(rectF)) {
                i2 = -((int) (((this.mWidgetRect.height() - rectF.height()) / 2.0f) - rectF.top));
            }
        } else {
            if (rectF.top > this.mWidgetRect.top) {
                f4 = rectF.top;
                f5 = this.mWidgetRect.top;
            } else if (rectF.bottom < this.mWidgetRect.bottom) {
                f4 = rectF.bottom;
                f5 = this.mWidgetRect.bottom;
            }
            i2 = (int) (f4 - f5);
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (!this.mTranslate.c.isFinished()) {
            this.mTranslate.c.abortAnimation();
        }
        this.mTranslate.a(this.mTranslateX, this.mTranslateY, -i, -i2);
    }

    private boolean isImageCenterHeight(RectF rectF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ebb27e9", new Object[]{this, rectF})).booleanValue() : Math.abs(((float) Math.round(rectF.top)) - ((this.mWidgetRect.height() - rectF.height()) / 2.0f)) < 1.0f;
    }

    private boolean isImageCenterWidth(RectF rectF) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65c771fc", new Object[]{this, rectF})).booleanValue() : Math.abs(((float) Math.round(rectF.left)) - ((this.mWidgetRect.width() - rectF.width()) / 2.0f)) < 1.0f;
    }

    private float resistanceScrollByX(float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b791df12", new Object[]{this, new Float(f2), new Float(f3)})).floatValue() : f3 * (Math.abs(Math.abs(f2) - this.MAX_OVER_RESISTANCE) / this.MAX_OVER_RESISTANCE);
    }

    private float resistanceScrollByY(float f2, float f3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ec781a53", new Object[]{this, new Float(f2), new Float(f3)})).floatValue() : f3 * (Math.abs(Math.abs(f2) - this.MAX_OVER_RESISTANCE) / this.MAX_OVER_RESISTANCE);
    }

    private void mapRect(RectF rectF, RectF rectF2, RectF rectF3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bded1f1a", new Object[]{this, rectF, rectF2, rectF3});
            return;
        }
        float f2 = rectF.left > rectF2.left ? rectF.left : rectF2.left;
        float f3 = rectF.right < rectF2.right ? rectF.right : rectF2.right;
        if (f2 > f3) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        float f4 = rectF.top > rectF2.top ? rectF.top : rectF2.top;
        float f5 = rectF.bottom < rectF2.bottom ? rectF.bottom : rectF2.bottom;
        if (f4 > f5) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            rectF3.set(f2, f4, f3, f5);
        }
    }

    private void checkRect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60700d93", new Object[]{this});
        } else if (this.hasOverTranslate) {
        } else {
            mapRect(this.mWidgetRect, this.mImgRect, this.mCommonRect);
        }
    }

    public void setOnPhotoViewLongClickLisenter(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("941f2659", new Object[]{this, eVar});
        } else {
            this.onPhotoViewLongClickLisenter = eVar;
        }
    }

    public boolean canScrollHorizontallySelf(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39322be3", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (this.mImgRect.width() <= this.mWidgetRect.width()) {
            return false;
        }
        if (f2 < 0.0f && Math.round(this.mImgRect.left) - f2 >= this.mWidgetRect.left) {
            return false;
        }
        return f2 <= 0.0f || ((float) Math.round(this.mImgRect.right)) - f2 > this.mWidgetRect.right;
    }

    public boolean canScrollVerticallySelf(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4af8de11", new Object[]{this, new Float(f2)})).booleanValue();
        }
        if (this.mImgRect.height() <= this.mWidgetRect.height()) {
            return false;
        }
        if (f2 < 0.0f && Math.round(this.mImgRect.top) - f2 >= this.mWidgetRect.top) {
            return false;
        }
        return f2 <= 0.0f || ((float) Math.round(this.mImgRect.bottom)) - f2 > this.mWidgetRect.bottom;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.hasMultiTouch) {
            return canScrollHorizontallySelf(i);
        }
        return true;
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6c2d940", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.hasMultiTouch) {
            return canScrollVerticallySelf(i);
        }
        return true;
    }

    /* loaded from: classes7.dex */
    public class c implements Interpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Interpolator b;

        private c() {
            this.b = new DecelerateInterpolator();
        }

        public void a(Interpolator interpolator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ade445bd", new Object[]{this, interpolator});
            } else {
                this.b = interpolator;
            }
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            Interpolator interpolator = this.b;
            return interpolator != null ? interpolator.getInterpolation(f) : f;
        }
    }

    /* loaded from: classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f17018a;
        public OverScroller b;
        public OverScroller c;
        public Scroller d;
        public Scroller e;
        public Scroller f;
        public a g;
        public int h;
        public int i;
        public int j;
        public int k;
        public RectF l = new RectF();
        public c m;

        public g() {
            this.m = new c();
            Context context = PhotoView.this.getContext();
            this.b = new OverScroller(context, this.m);
            this.d = new Scroller(context, this.m);
            this.c = new OverScroller(context, this.m);
            this.e = new Scroller(context, this.m);
            this.f = new Scroller(context, this.m);
        }

        public void a(Interpolator interpolator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ade445bd", new Object[]{this, interpolator});
            } else {
                this.m.a(interpolator);
            }
        }

        public void a(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            this.j = 0;
            this.k = 0;
            this.b.startScroll(0, 0, i3, i4, PhotoView.access$3700(PhotoView.this));
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            } else {
                this.d.startScroll((int) (f * 10000.0f), 0, (int) ((f2 - f) * 10000.0f), 0, PhotoView.access$3700(PhotoView.this));
            }
        }

        public void a(float f, float f2, float f3, float f4, int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45f22c61", new Object[]{this, new Float(f), new Float(f2), new Float(f3), new Float(f4), new Integer(i), aVar});
                return;
            }
            this.e.startScroll((int) (f * 10000.0f), (int) (f2 * 10000.0f), (int) (f3 * 10000.0f), (int) (f4 * 10000.0f), i);
            this.g = aVar;
        }

        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            } else {
                this.f.startScroll(i, 0, i2 - i, 0, PhotoView.access$3700(PhotoView.this));
            }
        }

        public void a(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2619793b", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f.startScroll(i, 0, i2 - i, 0, i3);
            }
        }

        public void b(float f, float f2) {
            int i;
            int i2;
            int i3;
            int i4;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            int i5 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            this.h = i5 < 0 ? Integer.MAX_VALUE : 0;
            int i6 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            int abs = (int) (i6 > 0 ? Math.abs(PhotoView.access$1600(PhotoView.this).left) : PhotoView.access$1600(PhotoView.this).right - PhotoView.access$1700(PhotoView.this).right);
            if (i5 < 0) {
                abs = Integer.MAX_VALUE - abs;
            }
            int i7 = i5 < 0 ? abs : 0;
            int i8 = i5 < 0 ? Integer.MAX_VALUE : abs;
            if (i5 < 0) {
                abs = Integer.MAX_VALUE - i7;
            }
            int i9 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            this.i = i9 < 0 ? Integer.MAX_VALUE : 0;
            int i10 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            int abs2 = (int) (i10 > 0 ? Math.abs(PhotoView.access$1600(PhotoView.this).top) : PhotoView.access$1600(PhotoView.this).bottom - PhotoView.access$1700(PhotoView.this).bottom);
            if (i9 < 0) {
                abs2 = Integer.MAX_VALUE - abs2;
            }
            int i11 = i9 < 0 ? abs2 : 0;
            int i12 = i9 < 0 ? Integer.MAX_VALUE : abs2;
            if (i9 < 0) {
                abs2 = Integer.MAX_VALUE - i11;
            }
            if (i6 == 0) {
                i = 0;
                i2 = 0;
            } else {
                i = i7;
                i2 = i8;
            }
            if (i10 == 0) {
                i3 = 0;
                i4 = 0;
            } else {
                i3 = i11;
                i4 = i12;
            }
            this.c.fling(this.h, this.i, (int) f, (int) f2, i, i2, i3, i4, Math.abs(abs) < (PhotoView.access$3800(PhotoView.this) << 1) ? 0 : PhotoView.access$3800(PhotoView.this), Math.abs(abs2) < (PhotoView.access$3800(PhotoView.this) << 1) ? 0 : PhotoView.access$3800(PhotoView.this));
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.f17018a = true;
            d();
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            PhotoView.this.removeCallbacks(this);
            this.b.abortAnimation();
            this.d.abortAnimation();
            this.c.abortAnimation();
            this.f.abortAnimation();
            this.f17018a = false;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            IpChange ipChange = $ipChange;
            boolean z2 = true;
            boolean z3 = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.d.computeScrollOffset()) {
                PhotoView.access$502(PhotoView.this, this.d.getCurrX() / 10000.0f);
                z = false;
            } else {
                z = true;
            }
            if (this.b.computeScrollOffset()) {
                int currX = this.b.getCurrX() - this.j;
                int currY = this.b.getCurrY() - this.k;
                PhotoView photoView = PhotoView.this;
                PhotoView.access$1902(photoView, PhotoView.access$1900(photoView) + currX);
                PhotoView photoView2 = PhotoView.this;
                PhotoView.access$2302(photoView2, PhotoView.access$2300(photoView2) + currY);
                this.j = this.b.getCurrX();
                this.k = this.b.getCurrY();
                z = false;
            }
            if (this.c.computeScrollOffset()) {
                int currX2 = this.c.getCurrX() - this.h;
                int currY2 = this.c.getCurrY() - this.i;
                this.h = this.c.getCurrX();
                this.i = this.c.getCurrY();
                PhotoView photoView3 = PhotoView.this;
                PhotoView.access$1902(photoView3, PhotoView.access$1900(photoView3) + currX2);
                PhotoView photoView4 = PhotoView.this;
                PhotoView.access$2302(photoView4, PhotoView.access$2300(photoView4) + currY2);
                z = false;
            }
            if (this.f.computeScrollOffset()) {
                PhotoView.access$202(PhotoView.this, this.f.getCurrX());
                z = false;
            }
            if (this.e.computeScrollOffset() || PhotoView.access$3900(PhotoView.this) != null) {
                float currX3 = this.e.getCurrX() / 10000.0f;
                float currY3 = this.e.getCurrY() / 10000.0f;
                PhotoView.access$3100(PhotoView.this).setScale(currX3, currY3, (PhotoView.access$1600(PhotoView.this).left + PhotoView.access$1600(PhotoView.this).right) / 2.0f, this.g.a());
                PhotoView.access$3100(PhotoView.this).mapRect(this.l, PhotoView.access$1600(PhotoView.this));
                if (currX3 == 1.0f) {
                    this.l.left = PhotoView.access$1700(PhotoView.this).left;
                    this.l.right = PhotoView.access$1700(PhotoView.this).right;
                }
                if (currY3 == 1.0f) {
                    this.l.top = PhotoView.access$1700(PhotoView.this).top;
                    this.l.bottom = PhotoView.access$1700(PhotoView.this).bottom;
                }
                PhotoView.access$3902(PhotoView.this, this.l);
            }
            if (!z) {
                c();
                d();
                return;
            }
            this.f17018a = false;
            if (PhotoView.access$1300(PhotoView.this)) {
                if (PhotoView.access$1600(PhotoView.this).left > 0.0f) {
                    PhotoView photoView5 = PhotoView.this;
                    PhotoView.access$1902(photoView5, (int) (PhotoView.access$1900(photoView5) - PhotoView.access$1600(PhotoView.this).left));
                } else if (PhotoView.access$1600(PhotoView.this).right < PhotoView.access$1700(PhotoView.this).width()) {
                    PhotoView photoView6 = PhotoView.this;
                    PhotoView.access$1902(photoView6, PhotoView.access$1900(photoView6) - ((int) (PhotoView.access$1700(PhotoView.this).width() - PhotoView.access$1600(PhotoView.this).right)));
                }
                z3 = true;
            }
            if (!PhotoView.access$1400(PhotoView.this)) {
                z2 = z3;
            } else if (PhotoView.access$1600(PhotoView.this).top > 0.0f) {
                PhotoView photoView7 = PhotoView.this;
                PhotoView.access$2302(photoView7, (int) (PhotoView.access$2300(photoView7) - PhotoView.access$1600(PhotoView.this).top));
            } else if (PhotoView.access$1600(PhotoView.this).bottom < PhotoView.access$1700(PhotoView.this).height()) {
                PhotoView photoView8 = PhotoView.this;
                PhotoView.access$2302(photoView8, PhotoView.access$2300(photoView8) - ((int) (PhotoView.access$1700(PhotoView.this).height() - PhotoView.access$1600(PhotoView.this).bottom)));
            }
            if (z2) {
                c();
            }
            PhotoView.this.invalidate();
            if (PhotoView.access$4000(PhotoView.this) == null) {
                return;
            }
            PhotoView.access$4000(PhotoView.this).run();
            PhotoView.access$4002(PhotoView.this, null);
        }

        private void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
                return;
            }
            PhotoView.access$300(PhotoView.this).reset();
            PhotoView.access$300(PhotoView.this).postTranslate(-PhotoView.access$3200(PhotoView.this).left, -PhotoView.access$3200(PhotoView.this).top);
            PhotoView.access$300(PhotoView.this).postTranslate(PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
            PhotoView.access$300(PhotoView.this).postTranslate(-PhotoView.access$3300(PhotoView.this), -PhotoView.access$3400(PhotoView.this));
            PhotoView.access$300(PhotoView.this).postRotate(PhotoView.access$200(PhotoView.this), PhotoView.access$2800(PhotoView.this).x, PhotoView.access$2800(PhotoView.this).y);
            PhotoView.access$300(PhotoView.this).postScale(PhotoView.access$500(PhotoView.this), PhotoView.access$500(PhotoView.this), PhotoView.access$2700(PhotoView.this).x, PhotoView.access$2700(PhotoView.this).y);
            PhotoView.access$300(PhotoView.this).postTranslate(PhotoView.access$1900(PhotoView.this), PhotoView.access$2300(PhotoView.this));
            PhotoView.access$600(PhotoView.this);
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            } else if (!this.f17018a) {
            } else {
                PhotoView.this.post(this);
            }
        }
    }

    public com.taobao.detail.rate.v2.c getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.detail.rate.v2.c) ipChange.ipc$dispatch("85881188", new Object[]{this});
        }
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        getLocation(this, iArr);
        rectF.set(iArr[0] + this.mImgRect.left, iArr[1] + this.mImgRect.top, iArr[0] + this.mImgRect.right, iArr[1] + this.mImgRect.bottom);
        return new com.taobao.detail.rate.v2.c(rectF, this.mImgRect, this.mWidgetRect, this.mBaseRect, this.mScreenCenter, this.mScale, this.mDegrees, this.mScaleType);
    }

    public static com.taobao.detail.rate.v2.c getImageViewInfo(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.detail.rate.v2.c) ipChange.ipc$dispatch("be323c16", new Object[]{imageView});
        }
        int[] iArr = new int[2];
        getLocation(imageView, iArr);
        Drawable drawable = imageView.getDrawable();
        Matrix imageMatrix = imageView.getImageMatrix();
        RectF rectF = new RectF(0.0f, 0.0f, getDrawableWidth(drawable), getDrawableHeight(drawable));
        imageMatrix.mapRect(rectF);
        RectF rectF2 = new RectF(iArr[0] + rectF.left, iArr[1] + rectF.top, iArr[0] + rectF.right, iArr[1] + rectF.bottom);
        RectF rectF3 = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
        return new com.taobao.detail.rate.v2.c(rectF2, rectF, rectF3, new RectF(rectF3), new PointF(rectF3.width() / 2.0f, rectF3.height() / 2.0f), 1.0f, 0.0f, imageView.getScaleType());
    }

    private static void getLocation(View view, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("980e7a6e", new Object[]{view, iArr});
            return;
        }
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return;
            }
            iArr[0] = iArr[0] - view2.getScrollX();
            iArr[1] = iArr[1] - view2.getScrollY();
            iArr[0] = iArr[0] + view2.getLeft();
            iArr[1] = iArr[1] + view2.getTop();
            parent = view2.getParent();
        }
        iArr[0] = (int) (iArr[0] + 0.5f);
        iArr[1] = (int) (iArr[1] + 0.5f);
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.mAnimaMatrix.reset();
        executeTranslate();
        this.mScale = 1.0f;
        this.mTranslateX = 0;
        this.mTranslateY = 0;
    }

    public void animaFrom(com.taobao.detail.rate.v2.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd20d64c", new Object[]{this, cVar});
        } else if (this.isInit) {
            reset();
            com.taobao.detail.rate.v2.c info = getInfo();
            float width = cVar.b.width() / info.b.width();
            float height = cVar.b.height() / info.b.height();
            if (width >= height) {
                width = height;
            }
            float width2 = cVar.f17027a.left + (cVar.f17027a.width() / 2.0f);
            float height2 = cVar.f17027a.top + (cVar.f17027a.height() / 2.0f);
            float width3 = info.f17027a.left + (info.f17027a.width() / 2.0f);
            float height3 = info.f17027a.top + (info.f17027a.height() / 2.0f);
            this.mAnimaMatrix.reset();
            float f2 = width2 - width3;
            float f3 = height2 - height3;
            this.mAnimaMatrix.postTranslate(f2, f3);
            this.mAnimaMatrix.postScale(width, width, width2, height2);
            this.mAnimaMatrix.postRotate(cVar.g, width2, height2);
            executeTranslate();
            this.mScaleCenter.set(width2, height2);
            this.mRotateCenter.set(width2, height2);
            this.mTranslate.a(0, 0, (int) (-f2), (int) (-f3));
            this.mTranslate.a(width, 1.0f);
            this.mTranslate.a((int) cVar.g, 0);
            if (cVar.c.width() < cVar.b.width() || cVar.c.height() < cVar.b.height()) {
                float width4 = cVar.c.width() / cVar.b.width();
                float height4 = cVar.c.height() / cVar.b.height();
                if (width4 > 1.0f) {
                    width4 = 1.0f;
                }
                if (height4 > 1.0f) {
                    height4 = 1.0f;
                }
                a fVar = cVar.h == ImageView.ScaleType.FIT_START ? new f() : cVar.h == ImageView.ScaleType.FIT_END ? new b() : new d();
                this.mTranslate.a(width4, height4, 1.0f - width4, 1.0f - height4, this.mAnimaDuring / 3, fVar);
                this.mTmpMatrix.setScale(width4, height4, (this.mImgRect.left + this.mImgRect.right) / 2.0f, fVar.a());
                this.mTmpMatrix.mapRect(this.mTranslate.l, this.mImgRect);
                this.mClip = this.mTranslate.l;
            }
            this.mTranslate.a();
        } else {
            this.mFromInfo = cVar;
            this.mInfoTime = System.currentTimeMillis();
        }
    }

    public void animaTo(com.taobao.detail.rate.v2.c cVar, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49426899", new Object[]{this, cVar, runnable});
        } else if (!this.isInit) {
        } else {
            this.mTranslate.b();
            this.mTranslateX = 0;
            this.mTranslateY = 0;
            float width = cVar.f17027a.left + (cVar.f17027a.width() / 2.0f);
            float height = cVar.f17027a.top + (cVar.f17027a.height() / 2.0f);
            this.mScaleCenter.set(this.mImgRect.left + (this.mImgRect.width() / 2.0f), this.mImgRect.top + (this.mImgRect.height() / 2.0f));
            this.mRotateCenter.set(this.mScaleCenter);
            this.mAnimaMatrix.postRotate(-this.mDegrees, this.mScaleCenter.x, this.mScaleCenter.y);
            this.mAnimaMatrix.mapRect(this.mImgRect, this.mBaseRect);
            float width2 = cVar.b.width() / this.mBaseRect.width();
            float height2 = cVar.b.height() / this.mBaseRect.height();
            if (width2 <= height2) {
                width2 = height2;
            }
            this.mAnimaMatrix.postRotate(this.mDegrees, this.mScaleCenter.x, this.mScaleCenter.y);
            this.mAnimaMatrix.mapRect(this.mImgRect, this.mBaseRect);
            this.mDegrees %= 360.0f;
            this.mTranslate.a(0, 0, (int) (width - this.mScaleCenter.x), (int) (height - this.mScaleCenter.y));
            this.mTranslate.a(this.mScale, width2);
            this.mTranslate.a((int) this.mDegrees, (int) cVar.g, (this.mAnimaDuring << 1) / 3);
            if (cVar.c.width() < cVar.f17027a.width() || cVar.c.height() < cVar.f17027a.height()) {
                final float width3 = cVar.c.width() / cVar.f17027a.width();
                final float height3 = cVar.c.height() / cVar.f17027a.height();
                if (width3 > 1.0f) {
                    width3 = 1.0f;
                }
                if (height3 > 1.0f) {
                    height3 = 1.0f;
                }
                final a fVar = cVar.h == ImageView.ScaleType.FIT_START ? new f() : cVar.h == ImageView.ScaleType.FIT_END ? new b() : new d();
                postDelayed(new Runnable() { // from class: com.taobao.detail.rate.v2.PhotoView.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            PhotoView.access$1500(PhotoView.this).a(1.0f, 1.0f, width3 - 1.0f, height3 - 1.0f, PhotoView.access$3700(PhotoView.this) / 2, fVar);
                        }
                    }
                }, this.mAnimaDuring / 2);
            }
            this.mCompleteCallBack = runnable;
            this.mTranslate.a();
        }
    }

    public void rotate(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c4bb79e", new Object[]{this, new Float(f2)});
            return;
        }
        this.mDegrees += f2;
        this.mAnimaMatrix.postRotate(f2, (int) (this.mWidgetRect.left + (this.mWidgetRect.width() / 2.0f)), (int) (this.mWidgetRect.top + (this.mWidgetRect.height() / 2.0f)));
        executeTranslate();
    }
}
