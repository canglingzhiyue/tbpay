package android.support.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.transition.j;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.taobao.taobao.R;

/* loaded from: classes2.dex */
class GhostViewApi14 extends View implements j {
    Matrix mCurrentMatrix;
    private int mDeltaX;
    private int mDeltaY;
    private final Matrix mMatrix;
    private final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    int mReferences;
    ViewGroup mStartParent;
    View mStartView;
    final View mView;

    /* loaded from: classes2.dex */
    static class a implements j.a {
        private static FrameLayout a(ViewGroup viewGroup) {
            while (!(viewGroup instanceof FrameLayout)) {
                ViewParent parent = viewGroup.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return null;
                }
                viewGroup = (ViewGroup) parent;
            }
            return (FrameLayout) viewGroup;
        }

        @Override // android.support.transition.j.a
        public j a(View view, ViewGroup viewGroup, Matrix matrix) {
            GhostViewApi14 ghostView = GhostViewApi14.getGhostView(view);
            if (ghostView == null) {
                FrameLayout a2 = a(viewGroup);
                if (a2 == null) {
                    return null;
                }
                ghostView = new GhostViewApi14(view);
                a2.addView(ghostView);
            }
            ghostView.mReferences++;
            return ghostView;
        }

        @Override // android.support.transition.j.a
        public void a(View view) {
            GhostViewApi14 ghostView = GhostViewApi14.getGhostView(view);
            if (ghostView != null) {
                ghostView.mReferences--;
                if (ghostView.mReferences > 0) {
                    return;
                }
                ViewParent parent = ghostView.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.endViewTransition(ghostView);
                viewGroup.removeView(ghostView);
            }
        }
    }

    GhostViewApi14(View view) {
        super(view.getContext());
        this.mMatrix = new Matrix();
        this.mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: android.support.transition.GhostViewApi14.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                GhostViewApi14 ghostViewApi14 = GhostViewApi14.this;
                ghostViewApi14.mCurrentMatrix = ghostViewApi14.mView.getMatrix();
                ViewCompat.postInvalidateOnAnimation(GhostViewApi14.this);
                if (GhostViewApi14.this.mStartParent == null || GhostViewApi14.this.mStartView == null) {
                    return true;
                }
                GhostViewApi14.this.mStartParent.endViewTransition(GhostViewApi14.this.mStartView);
                ViewCompat.postInvalidateOnAnimation(GhostViewApi14.this.mStartParent);
                GhostViewApi14 ghostViewApi142 = GhostViewApi14.this;
                ghostViewApi142.mStartParent = null;
                ghostViewApi142.mStartView = null;
                return true;
            }
        };
        this.mView = view;
        setLayerType(2, null);
    }

    static GhostViewApi14 getGhostView(View view) {
        return (GhostViewApi14) view.getTag(R.id.ghost_view);
    }

    private static void setGhostView(View view, GhostViewApi14 ghostViewApi14) {
        view.setTag(R.id.ghost_view, ghostViewApi14);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setGhostView(this.mView, this);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        this.mView.getLocationOnScreen(r0);
        int[] iArr2 = {(int) (iArr2[0] - this.mView.getTranslationX()), (int) (iArr2[1] - this.mView.getTranslationY())};
        this.mDeltaX = iArr2[0] - iArr[0];
        this.mDeltaY = iArr2[1] - iArr[1];
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        this.mView.setVisibility(4);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        this.mView.setVisibility(0);
        setGhostView(this.mView, null);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.mMatrix.set(this.mCurrentMatrix);
        this.mMatrix.postTranslate(this.mDeltaX, this.mDeltaY);
        canvas.setMatrix(this.mMatrix);
        this.mView.draw(canvas);
    }

    @Override // android.support.transition.j
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
        this.mStartParent = viewGroup;
        this.mStartView = view;
    }

    @Override // android.view.View, android.support.transition.j
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.mView.setVisibility(i == 0 ? 4 : 0);
    }
}
