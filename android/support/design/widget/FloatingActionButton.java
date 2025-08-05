package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.h;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

@CoordinatorLayout.DefaultBehavior(Behavior.class)
/* loaded from: classes2.dex */
public class FloatingActionButton extends VisibilityAwareImageButton {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final String LOG_TAG = "FloatingActionButton";
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private ColorStateList mBackgroundTint;
    private PorterDuff.Mode mBackgroundTintMode;
    private int mBorderWidth;
    boolean mCompatPadding;
    private AppCompatImageHelper mImageHelper;
    int mImagePadding;
    private h mImpl;
    private int mMaxImageSize;
    private int mRippleColor;
    final Rect mShadowPadding;
    private int mSize;
    private final Rect mTouchArea;

    /* loaded from: classes2.dex */
    public static class Behavior extends CoordinatorLayout.Behavior<FloatingActionButton> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f1178a;
        private a b;
        private boolean c;

        public Behavior() {
            this.c = true;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton_Behavior_Layout);
            this.c = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            obtainStyledAttributes.recycle();
        }

        private void a(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.mShadowPadding;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.b bVar = (CoordinatorLayout.b) floatingActionButton.getLayoutParams();
            int i = 0;
            int i2 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - bVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= bVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - bVar.bottomMargin) {
                i = rect.bottom;
            } else if (floatingActionButton.getTop() <= bVar.topMargin) {
                i = -rect.top;
            }
            if (i != 0) {
                ViewCompat.offsetTopAndBottom(floatingActionButton, i);
            }
            if (i2 == 0) {
                return;
            }
            ViewCompat.offsetLeftAndRight(floatingActionButton, i2);
        }

        private boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!a(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f1178a == null) {
                this.f1178a = new Rect();
            }
            Rect rect = this.f1178a;
            o.b(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.hide(this.b, false);
                return true;
            }
            floatingActionButton.show(this.b, false);
            return true;
        }

        private static boolean a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.b) {
                return ((CoordinatorLayout.b) layoutParams).b() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean a(View view, FloatingActionButton floatingActionButton) {
            return this.c && ((CoordinatorLayout.b) floatingActionButton.getLayoutParams()).a() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean b(View view, FloatingActionButton floatingActionButton) {
            if (!a(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.b) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.hide(this.b, false);
                return true;
            }
            floatingActionButton.show(this.b, false);
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> dependencies = coordinatorLayout.getDependencies(floatingActionButton);
            int size = dependencies.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = dependencies.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (a(view) && b(view, floatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.onLayoutChild(floatingActionButton, i);
            a(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public boolean getInsetDodgeRect(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.mShadowPadding;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // android.support.design.widget.CoordinatorLayout.Behavior
        /* renamed from: a */
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (!a(view)) {
                return false;
            } else {
                b(view, floatingActionButton);
                return false;
            }
        }

        @Override // android.support.design.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(CoordinatorLayout.b bVar) {
            if (bVar.h == 0) {
                bVar.h = 80;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface Size {
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b implements k {
        b() {
        }

        @Override // android.support.design.widget.k
        public float a() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // android.support.design.widget.k
        public void a(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.mShadowPadding.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.mImagePadding, i2 + FloatingActionButton.this.mImagePadding, i3 + FloatingActionButton.this.mImagePadding, i4 + FloatingActionButton.this.mImagePadding);
        }

        @Override // android.support.design.widget.k
        public void a(Drawable drawable) {
            FloatingActionButton.super.setBackgroundDrawable(drawable);
        }

        @Override // android.support.design.widget.k
        public boolean b() {
            return FloatingActionButton.this.mCompatPadding;
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mShadowPadding = new Rect();
        this.mTouchArea = new Rect();
        n.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton, i, R.style.Widget_Design_FloatingActionButton);
        this.mBackgroundTint = obtainStyledAttributes.getColorStateList(R.styleable.FloatingActionButton_backgroundTint);
        this.mBackgroundTintMode = q.a(obtainStyledAttributes.getInt(R.styleable.FloatingActionButton_backgroundTintMode, -1), null);
        this.mRippleColor = obtainStyledAttributes.getColor(R.styleable.FloatingActionButton_rippleColor, 0);
        this.mSize = obtainStyledAttributes.getInt(R.styleable.FloatingActionButton_fabSize, -1);
        this.mBorderWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.FloatingActionButton_borderWidth, 0);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_elevation, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.FloatingActionButton_pressedTranslationZ, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_useCompatPadding, false);
        obtainStyledAttributes.recycle();
        this.mImageHelper = new AppCompatImageHelper(this);
        this.mImageHelper.loadFromAttributes(attributeSet, i);
        this.mMaxImageSize = (int) getResources().getDimension(R.dimen.design_fab_image_size);
        getImpl().a(this.mBackgroundTint, this.mBackgroundTintMode, this.mRippleColor, this.mBorderWidth);
        getImpl().a(dimension);
        getImpl().b(dimension2);
    }

    private h createImpl() {
        return Build.VERSION.SDK_INT >= 21 ? new i(this, new b()) : new h(this, new b());
    }

    private h getImpl() {
        if (this.mImpl == null) {
            this.mImpl = createImpl();
        }
        return this.mImpl;
    }

    private int getSizeDimension(int i) {
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < AUTO_MINI_LARGEST_SCREEN_WIDTH ? getSizeDimension(1) : getSizeDimension(0);
    }

    private static int resolveAdjustedSize(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        return mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? i : size : Math.min(i, size);
    }

    private h.c wrapOnVisibilityChangedListener(final a aVar) {
        if (aVar == null) {
            return null;
        }
        return new h.c() { // from class: android.support.design.widget.FloatingActionButton.1
        };
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().a(getDrawableState());
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.mBackgroundTint;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.mBackgroundTintMode;
    }

    public float getCompatElevation() {
        return getImpl().a();
    }

    public Drawable getContentBackground() {
        return getImpl().c();
    }

    public boolean getContentRect(Rect rect) {
        if (ViewCompat.isLaidOut(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            rect.left += this.mShadowPadding.left;
            rect.top += this.mShadowPadding.top;
            rect.right -= this.mShadowPadding.right;
            rect.bottom -= this.mShadowPadding.bottom;
            return true;
        }
        return false;
    }

    public int getRippleColor() {
        return this.mRippleColor;
    }

    public int getSize() {
        return this.mSize;
    }

    int getSizeDimension() {
        return getSizeDimension(this.mSize);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public void hide() {
        hide(null);
    }

    public void hide(a aVar) {
        hide(aVar, true);
    }

    void hide(a aVar, boolean z) {
        getImpl().a(wrapOnVisibilityChangedListener(aVar), z);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().b();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().f();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().g();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int sizeDimension = getSizeDimension();
        this.mImagePadding = (sizeDimension - this.mMaxImageSize) / 2;
        getImpl().e();
        int min = Math.min(resolveAdjustedSize(sizeDimension, i), resolveAdjustedSize(sizeDimension, i2));
        setMeasuredDimension(this.mShadowPadding.left + min + this.mShadowPadding.right, min + this.mShadowPadding.top + this.mShadowPadding.bottom);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && getContentRect(this.mTouchArea) && !this.mTouchArea.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.mBackgroundTint != colorStateList) {
            this.mBackgroundTint = colorStateList;
            getImpl().a(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.mBackgroundTintMode != mode) {
            this.mBackgroundTintMode = mode;
            getImpl().a(mode);
        }
    }

    public void setCompatElevation(float f) {
        getImpl().a(f);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.mImageHelper.setImageResource(i);
    }

    public void setRippleColor(int i) {
        if (this.mRippleColor != i) {
            this.mRippleColor = i;
            getImpl().a(i);
        }
    }

    public void setSize(int i) {
        if (i != this.mSize) {
            this.mSize = i;
            requestLayout();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            getImpl().d();
        }
    }

    @Override // android.support.design.widget.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void show() {
        show(null);
    }

    public void show(a aVar) {
        show(aVar, true);
    }

    void show(a aVar, boolean z) {
        getImpl().b(wrapOnVisibilityChangedListener(aVar), z);
    }
}
