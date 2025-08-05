package com.taobao.tao.flexbox.layoutmanager.container.dx;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.view.DXNativeLinearLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.tao.flexbox.layoutmanager.component.ag;
import tb.dkx;
import tb.dle;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class k extends dlg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TheaterCardAnim";
    public static final long THEATERCARDANIM = -7443121581807140869L;

    static {
        kge.a(1007803996);
    }

    public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, dle dleVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("1c5b757e", new Object[]{this, dlhVar, dleVar, dllVar});
        }
        try {
            DXRootView i = ((com.taobao.android.dinamicx.eventchain.l) dleVar).i();
            ((DXRecyclerView) ag.a(i.getFlattenWidgetNode().queryWidgetNodeByUserId(dlhVar.c("listId")).getWRView().get(), DXRecyclerView.class)).addItemDecoration(new b(dlhVar, a(i, dlhVar.d("listTop"))));
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private Paint a(DXRootView dXRootView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("33affbf1", new Object[]{this, dXRootView, new Integer(i)});
        }
        try {
            View view = dXRootView.getFlattenWidgetNode().queryWidgetNodeByUserId("bgImage").getWRView().get();
            view.setDrawingCacheEnabled(true);
            Bitmap drawingCache = view.getDrawingCache();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(drawingCache, tileMode, tileMode);
            Matrix matrix = new Matrix();
            matrix.setTranslate(0.0f, android.taobao.windvane.util.c.a(-i));
            bitmapShader.setLocalMatrix(matrix);
            Paint paint = new Paint(1);
            paint.setShader(bitmapShader);
            return paint;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* loaded from: classes8.dex */
    public static class a implements dln {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1217567027);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, obj}) : a(obj);
        }

        public k a(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("96abfe4e", new Object[]{this, obj}) : new k();
        }
    }

    /* loaded from: classes8.dex */
    public class b extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f20253a;
        public ValueAnimator b;
        public RecyclerView c;
        public ViewGroup d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public String l;
        public Paint m;
        public PorterDuffXfermode n;
        public int p;

        static {
            kge.a(987973689);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -1606942954) {
                super.onDrawOver((Canvas) objArr[0], (RecyclerView) objArr[1], (RecyclerView.State) objArr[2]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(dlh dlhVar, Paint paint) {
            this.g = dlhVar.d("animIndex");
            this.e = dlhVar.d("bigCardH");
            this.p = dlhVar.d("videoCardH");
            this.f = dlhVar.d("smallCardH");
            this.h = dlhVar.d("cardCount");
            this.i = dlhVar.d("itemGap");
            this.l = dlhVar.c("gapColor");
            this.j = dlhVar.d("cardRadius");
            this.k = dlhVar.d("animDuration");
            if (paint == null) {
                paint = new Paint();
                paint.setColor(Color.parseColor(this.l));
            }
            paint.setStrokeWidth(this.i << 1);
            this.m = paint;
            this.n = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
        }

        public void a(final boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                return;
            }
            RecyclerView recyclerView = this.c;
            if (recyclerView == null) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
                staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
                int i = iArr[1];
                if (i > this.g) {
                    ogg.a(k.TAG, "主卡片是第一个可见卡片才能执行动画: firstVisibleItemPosition:" + i + " animIndex:" + this.g);
                    return;
                }
            }
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b = new ValueAnimator();
            this.b.setIntValues(0, 1);
            this.b.setDuration(this.k);
            this.b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.container.dx.k.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator2});
                        return;
                    }
                    b.this.f20253a = z ? 1.0f - valueAnimator2.getAnimatedFraction() : valueAnimator2.getAnimatedFraction();
                    b.this.c.invalidateItemDecorations();
                }
            });
            this.b.start();
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            try {
                this.c = recyclerView;
                float width = (recyclerView.getWidth() - (this.i * 6)) / 2;
                float width2 = width / (recyclerView.getWidth() - (this.i * 4));
                float f = this.f / this.e;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                if (childAdapterPosition == this.g - 1) {
                    rect.set(0, 1, 0, 0);
                } else if (childAdapterPosition == this.g) {
                    StaggeredGridLayoutManager.LayoutParams layoutParams = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
                    layoutParams.height = (int) (((this.f * this.f20253a) + ((this.e - (this.f - this.p)) * (1.0f - this.f20253a))) - (this.f20253a * 1.0f));
                    layoutParams.width = (int) (((recyclerView.getWidth() - (this.i * 4)) * (1.0f - this.f20253a)) + (width * this.f20253a));
                    view.setLayoutParams(layoutParams);
                    DXNativeLinearLayout dXNativeLinearLayout = (DXNativeLinearLayout) ((ViewGroup) view).getChildAt(0);
                    DXWidgetNode dXWidgetNode = (DXWidgetNode) dXNativeLinearLayout.getTag(DXWidgetNode.TAG_WIDGET_NODE);
                    if (this.f20253a == 0.0f && dXWidgetNode.getLayoutWidth() != layoutParams.width) {
                        dXWidgetNode.setLayoutWidth(layoutParams.width);
                        dXWidgetNode.setLayoutHeight(layoutParams.height);
                        dXWidgetNode.measure(View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824));
                        dXWidgetNode.getReferenceNode().setMeasuredDimension(dXWidgetNode.getMeasuredWidth(), dXWidgetNode.getMeasuredHeight());
                    }
                    this.d = (ViewGroup) dXNativeLinearLayout.getChildAt(dXNativeLinearLayout.getChildCount() - 1);
                    View childAt = dXNativeLinearLayout.getChildAt(0);
                    childAt.setPivotX(0.0f);
                    childAt.setPivotY(0.0f);
                    childAt.setScaleX((1.0f - this.f20253a) + (width2 * this.f20253a));
                    childAt.setScaleY((1.0f - this.f20253a) + (f * this.f20253a));
                    rect.set((int) (((int) (((-recyclerView.getWidth()) / ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).getSpanCount()) * (1.0f - this.f20253a))) + ((2.0f - this.f20253a) * this.i)), this.i << 1, this.i << 1, this.i);
                    if (this.d == null) {
                        return;
                    }
                    this.d.setTranslationY((-((this.p + (this.i * 3)) - 1)) * this.f20253a);
                    if (this.d.getChildCount() != 2) {
                        return;
                    }
                    if (this.f20253a != 1.0f && this.f20253a != 0.0f) {
                        return;
                    }
                    this.d.getChildAt(0).setAlpha(1.0f - this.f20253a);
                    this.d.getChildAt(1).setAlpha(this.f20253a);
                } else if (childAdapterPosition == this.g + 1) {
                    rect.set(this.i << 1, (int) (((((this.e - (this.f - this.p)) * (1.0f - this.f20253a)) + (this.i << 1)) + (((1.0f - this.f20253a) * 2.0f) * this.i)) - 1.0f), this.i, this.i);
                } else if (childAdapterPosition >= (this.g - 1) + this.h || childAdapterPosition <= this.g - 1) {
                } else {
                    if (childAdapterPosition == (this.g - 2) + this.h) {
                        StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams();
                        layoutParams2.height = (int) (this.f * this.f20253a);
                        view.setLayoutParams(layoutParams2);
                        view.setAlpha(this.f20253a);
                        rect.set(this.i * 2, (int) (this.i * this.f20253a), this.i, (int) (this.i * this.f20253a));
                        return;
                    }
                    rect.set((childAdapterPosition - this.g) % 2 == 0 ? this.i : this.i * 2, this.i, (childAdapterPosition - this.g) % 2 == 0 ? this.i * 2 : this.i, this.i);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int[] iArr;
            int[] iArr2;
            int i;
            int i2;
            int[] iArr3;
            int[] iArr4;
            IpChange ipChange = $ipChange;
            int i3 = 1;
            int i4 = 2;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a037ff16", new Object[]{this, canvas, recyclerView, state});
                return;
            }
            super.onDrawOver(canvas, recyclerView, state);
            try {
                int childCount = recyclerView.getChildCount();
                int width = (recyclerView.getWidth() - (this.i * 6)) / 2;
                int i5 = this.e - (this.f - this.p);
                int i6 = 0;
                while (i6 < childCount) {
                    View childAt = recyclerView.getChildAt(i6);
                    int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
                    if (childAdapterPosition == this.g) {
                        int top = this.i + childAt.getTop() + this.p;
                        int i7 = (int) ((i5 * (1.0f - this.f20253a)) + (this.p * this.f20253a));
                        float top2 = (int) (childAt.getTop() + (((this.p << i3) + (this.i << i3)) * (1.0f - this.f20253a)) + (this.p * this.f20253a));
                        canvas.drawLine(recyclerView.getWidth() / i4, childAt.getTop(), recyclerView.getWidth() / i4, top2, this.m);
                        canvas.drawLine(recyclerView.getWidth() - this.i, childAt.getTop(), recyclerView.getWidth() - this.i, top2, this.m);
                        int saveLayer = canvas.saveLayer(new RectF((recyclerView.getWidth() / i4) - this.i, childAt.getTop(), recyclerView.getWidth() - (this.i << 1), childAt.getTop() + i7), null, 31);
                        float f = top;
                        canvas.drawLine(recyclerView.getWidth() / i4, f, recyclerView.getWidth() - (this.i << 1), f, this.m);
                        int[] iArr5 = new int[i4];
                        iArr5[0] = (recyclerView.getWidth() / i4) + this.i;
                        iArr5[1] = (recyclerView.getWidth() / i4) + this.i;
                        int[] iArr6 = new int[i4];
                        iArr6[0] = childAt.getTop();
                        iArr6[1] = top + this.i;
                        int i8 = 0;
                        while (i8 < iArr5.length) {
                            canvas.drawArc(new RectF(iArr5[i8], iArr6[i8], iArr5[i8] + (this.j * 2), iArr6[i8] + (this.j * 2)), -180.0f, 90.0f, true, this.m);
                            canvas.drawArc(new RectF((iArr4[i2] + width) - (this.j * 2), iArr3[i2], iArr4[i2] + width, iArr3[i2] + (this.j * 2)), -90.0f, 90.0f, true, this.m);
                            canvas.drawArc(new RectF(iArr4[i2], (iArr3[i2] + this.p) - (this.j * 2), iArr4[i2] + (this.j * 2), iArr3[i2] + this.p), 90.0f, 90.0f, true, this.m);
                            canvas.drawArc(new RectF((iArr4[i2] + width) - (this.j * 2), (iArr3[i2] + this.p) - (this.j * 2), iArr4[i2] + width, iArr3[i2] + this.p), 0.0f, 90.0f, true, this.m);
                            i8++;
                            iArr5 = iArr5;
                            iArr6 = iArr6;
                        }
                        int[] iArr7 = iArr6;
                        int[] iArr8 = iArr5;
                        this.m.setXfermode(this.n);
                        for (int i9 = 0; i9 < iArr8.length; i9++) {
                            canvas.drawRect(iArr8[i9], iArr7[i9], iArr8[i9] + this.j, iArr7[i9] + this.j, this.m);
                            canvas.drawRect((iArr8[i] + width) - this.j, iArr7[i], iArr8[i] + width, iArr7[i] + this.j, this.m);
                            canvas.drawRect(iArr8[i], (iArr7[i] + this.p) - this.j, iArr8[i] + this.j, iArr7[i] + this.p, this.m);
                            canvas.drawRect((iArr8[i] + width) - this.j, (iArr7[i] + this.p) - this.j, iArr8[i] + width, iArr7[i] + this.p, this.m);
                        }
                        this.m.setXfermode(null);
                        canvas.restoreToCount(saveLayer);
                    } else if (childAdapterPosition == this.g + 1) {
                        View childAt2 = recyclerView.getChildAt(i6 - 1);
                        if (childAt2 == null) {
                            return;
                        }
                        int top3 = childAt2.getTop() + this.p + this.i;
                        int saveLayer2 = canvas.saveLayer(new RectF(this.i << 1, childAt2.getTop(), recyclerView.getWidth() / i4, (childAt2.getTop() + ((int) ((((i5 * (1.0f - this.f20253a)) + (this.i << 1)) + (((1.0f - this.f20253a) * 2.0f) * this.i)) - 1.0f))) - this.i), null, 31);
                        float f2 = top3;
                        canvas.drawLine(this.i << 1, f2, recyclerView.getWidth() / i4, f2, this.m);
                        int[] iArr9 = new int[i4];
                        iArr9[0] = this.i << 1;
                        iArr9[1] = this.i << 1;
                        int[] iArr10 = new int[i4];
                        iArr10[0] = childAt2.getTop();
                        iArr10[1] = top3 + this.i;
                        int i10 = 0;
                        while (i10 < iArr9.length) {
                            canvas.drawArc(new RectF(iArr9[i10], iArr10[i10], iArr9[i10] + (this.j * 2), iArr10[i10] + (this.j * 2)), -180.0f, 90.0f, true, this.m);
                            canvas.drawArc(new RectF((iArr2[i10] + width) - (this.j * 2), iArr[i10], iArr2[i10] + width, iArr[i10] + (this.j * 2)), -90.0f, 90.0f, true, this.m);
                            canvas.drawArc(new RectF(iArr2[i10], (iArr[i10] + this.p) - (this.j * 2), iArr2[i10] + (this.j * 2), iArr[i10] + this.p), 90.0f, 90.0f, true, this.m);
                            canvas.drawArc(new RectF((iArr2[i10] + width) - (this.j * 2), (iArr[i10] + this.p) - (this.j * 2), iArr2[i10] + width, iArr[i10] + this.p), 0.0f, 90.0f, true, this.m);
                            i10++;
                            iArr9 = iArr9;
                            iArr10 = iArr10;
                        }
                        int[] iArr11 = iArr10;
                        int[] iArr12 = iArr9;
                        this.m.setXfermode(this.n);
                        for (int i11 = 0; i11 < iArr12.length; i11++) {
                            canvas.drawRect(iArr12[i11], iArr11[i11], iArr12[i11] + this.j, iArr11[i11] + this.j, this.m);
                            canvas.drawRect((iArr12[i11] + width) - this.j, iArr11[i11], iArr12[i11] + width, iArr11[i11] + this.j, this.m);
                            canvas.drawRect(iArr12[i11], (iArr11[i11] + this.p) - this.j, iArr12[i11] + this.j, iArr11[i11] + this.p, this.m);
                            canvas.drawRect((iArr12[i11] + width) - this.j, (iArr11[i11] + this.p) - this.j, iArr12[i11] + width, iArr11[i11] + this.p, this.m);
                        }
                        this.m.setXfermode(null);
                        canvas.restoreToCount(saveLayer2);
                        i6++;
                        i3 = 1;
                        i4 = 2;
                    }
                    i6++;
                    i3 = 1;
                    i4 = 2;
                }
            } catch (Throwable th) {
                th.printStackTrace();
                ogg.b("onDrawOverError:" + th.getMessage());
            }
        }
    }
}
