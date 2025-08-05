package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.taobao.taobao.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import tb.akn;
import tb.ako;
import tb.akq;

/* loaded from: classes2.dex */
public class LottieAnimationView extends AppCompatImageView {
    private static final j<Throwable> DEFAULT_FAILURE_LISTENER = $$Lambda$LottieAnimationView$RlOaXPFNtzMwm_cXo4PIeLEYdw.INSTANCE;
    private static final String TAG = "LottieAnimationView";
    private String animationName;
    private int animationResId;
    private boolean autoPlay;
    private boolean cacheComposition;
    private g composition;
    private o<g> compositionTask;
    private j<Throwable> failureListener;
    private int fallbackResource;
    private boolean ignoreUnschedule;
    private final j<g> loadedListener;
    private final LottieDrawable lottieDrawable;
    private final Set<l> lottieOnCompositionLoadedListeners;
    private final Set<UserActionTaken> userActionsTaken;
    private final j<Throwable> wrappedFailureListener;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.airbnb.lottie.LottieAnimationView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        String animationName;
        int animationResId;
        String imageAssetsFolder;
        boolean isAnimating;
        float progress;
        int repeatCount;
        int repeatMode;

        private SavedState(Parcel parcel) {
            super(parcel);
            this.animationName = parcel.readString();
            this.progress = parcel.readFloat();
            this.isAnimating = parcel.readInt() != 1 ? false : true;
            this.imageAssetsFolder = parcel.readString();
            this.repeatMode = parcel.readInt();
            this.repeatCount = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.animationName);
            parcel.writeFloat(this.progress);
            parcel.writeInt(this.isAnimating ? 1 : 0);
            parcel.writeString(this.imageAssetsFolder);
            parcel.writeInt(this.repeatMode);
            parcel.writeInt(this.repeatCount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum UserActionTaken {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.loadedListener = new j() { // from class: com.airbnb.lottie.-$$Lambda$yogncag0EB0RSi-FsElJQagxgi4
            @Override // com.airbnb.lottie.j
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((g) obj);
            }
        };
        this.wrappedFailureListener = new j<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.j
            /* renamed from: a */
            public void onResult(Throwable th) {
                if (LottieAnimationView.this.fallbackResource != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
                }
                (LottieAnimationView.this.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : LottieAnimationView.this.failureListener).onResult(th);
            }
        };
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(null, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new j() { // from class: com.airbnb.lottie.-$$Lambda$yogncag0EB0RSi-FsElJQagxgi4
            @Override // com.airbnb.lottie.j
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((g) obj);
            }
        };
        this.wrappedFailureListener = new j<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.j
            /* renamed from: a */
            public void onResult(Throwable th) {
                if (LottieAnimationView.this.fallbackResource != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
                }
                (LottieAnimationView.this.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : LottieAnimationView.this.failureListener).onResult(th);
            }
        };
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadedListener = new j() { // from class: com.airbnb.lottie.-$$Lambda$yogncag0EB0RSi-FsElJQagxgi4
            @Override // com.airbnb.lottie.j
            public final void onResult(Object obj) {
                LottieAnimationView.this.setComposition((g) obj);
            }
        };
        this.wrappedFailureListener = new j<Throwable>() { // from class: com.airbnb.lottie.LottieAnimationView.1
            @Override // com.airbnb.lottie.j
            /* renamed from: a */
            public void onResult(Throwable th) {
                if (LottieAnimationView.this.fallbackResource != 0) {
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    lottieAnimationView.setImageResource(lottieAnimationView.fallbackResource);
                }
                (LottieAnimationView.this.failureListener == null ? LottieAnimationView.DEFAULT_FAILURE_LISTENER : LottieAnimationView.this.failureListener).onResult(th);
            }
        };
        this.fallbackResource = 0;
        this.lottieDrawable = new LottieDrawable();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        init(attributeSet, i);
    }

    private void cancelLoaderTask() {
        o<g> oVar = this.compositionTask;
        if (oVar != null) {
            oVar.b(this.loadedListener);
            this.compositionTask.d(this.wrappedFailureListener);
        }
    }

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.k();
    }

    private o<g> fromAssets(final String str) {
        return isInEditMode() ? new o<>(new Callable() { // from class: com.airbnb.lottie.-$$Lambda$LottieAnimationView$s8Cg2ZAQv1tpJWzXcsAQ_QGglyc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.this.lambda$fromAssets$2$LottieAnimationView(str);
            }
        }, true) : this.cacheComposition ? h.b(getContext(), str) : h.b(getContext(), str, (String) null);
    }

    private o<g> fromRawRes(final int i) {
        return isInEditMode() ? new o<>(new Callable() { // from class: com.airbnb.lottie.-$$Lambda$LottieAnimationView$Knws7XcYY9zAYxEKmPOEMxpVFwQ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LottieAnimationView.this.lambda$fromRawRes$1$LottieAnimationView(i);
            }
        }, true) : this.cacheComposition ? h.a(getContext(), i) : h.a(getContext(), i, (String) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
        if (r7 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
        if (r7 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
        setAnimation(r7);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void init(android.util.AttributeSet r6, int r7) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.init(android.util.AttributeSet, int):void");
    }

    private void setCompositionTask(o<g> oVar) {
        this.userActionsTaken.add(UserActionTaken.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        this.compositionTask = oVar.a(this.loadedListener).c(this.wrappedFailureListener);
    }

    private void setLottieDrawable() {
        boolean isAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (isAnimating) {
            this.lottieDrawable.n();
        }
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.a(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.a(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.a(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(l lVar) {
        g gVar = this.composition;
        if (gVar != null) {
            lVar.onCompositionLoaded(gVar);
        }
        return this.lottieOnCompositionLoadedListeners.add(lVar);
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.d dVar, T t, ako<T> akoVar) {
        this.lottieDrawable.a(dVar, (com.airbnb.lottie.model.d) t, (ako<com.airbnb.lottie.model.d>) akoVar);
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.d dVar, T t, final akq<T> akqVar) {
        this.lottieDrawable.a(dVar, (com.airbnb.lottie.model.d) t, (ako<com.airbnb.lottie.model.d>) new ako<T>() { // from class: com.airbnb.lottie.LottieAnimationView.2
            /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
            @Override // tb.ako
            public T a(akn<T> aknVar) {
                return akqVar.a(aknVar);
            }
        });
    }

    public void cancelAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.C();
    }

    @Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        this.lottieDrawable.a(z);
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.e();
    }

    public g getComposition() {
        return this.composition;
    }

    public long getDuration() {
        g gVar = this.composition;
        if (gVar != null) {
            return gVar.e();
        }
        return 0L;
    }

    public int getFrame() {
        return this.lottieDrawable.u();
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.f();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.g();
    }

    public float getMaxFrame() {
        return this.lottieDrawable.p();
    }

    public float getMinFrame() {
        return this.lottieDrawable.o();
    }

    public q getPerformanceTracker() {
        return this.lottieDrawable.i();
    }

    public float getProgress() {
        return this.lottieDrawable.E();
    }

    public RenderMode getRenderMode() {
        return this.lottieDrawable.h();
    }

    public int getRepeatCount() {
        return this.lottieDrawable.w();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.v();
    }

    public float getSpeed() {
        return this.lottieDrawable.r();
    }

    public boolean hasMasks() {
        return this.lottieDrawable.a();
    }

    public boolean hasMatte() {
        return this.lottieDrawable.b();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (!(drawable instanceof LottieDrawable) || ((LottieDrawable) drawable).h() != RenderMode.SOFTWARE) {
            return;
        }
        this.lottieDrawable.invalidateSelf();
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.lottieDrawable;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public boolean isAnimating() {
        return this.lottieDrawable.x();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.d();
    }

    public /* synthetic */ n lambda$fromAssets$2$LottieAnimationView(String str) throws Exception {
        return this.cacheComposition ? h.c(getContext(), str) : h.c(getContext(), str, null);
    }

    public /* synthetic */ n lambda$fromRawRes$1$LottieAnimationView(int i) throws Exception {
        return this.cacheComposition ? h.b(getContext(), i) : h.b(getContext(), i, (String) null);
    }

    @Deprecated
    public void loop(boolean z) {
        this.lottieDrawable.e(z ? -1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.l();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.animationName = savedState.animationName;
        if (!this.userActionsTaken.contains(UserActionTaken.SET_ANIMATION) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = savedState.animationResId;
        if (!this.userActionsTaken.contains(UserActionTaken.SET_ANIMATION) && (i = this.animationResId) != 0) {
            setAnimation(i);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_PROGRESS)) {
            setProgress(savedState.progress);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.PLAY_OPTION) && savedState.isAnimating) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.imageAssetsFolder);
        }
        if (!this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.repeatMode);
        }
        if (this.userActionsTaken.contains(UserActionTaken.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(savedState.repeatCount);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.animationName = this.animationName;
        savedState.animationResId = this.animationResId;
        savedState.progress = this.lottieDrawable.E();
        savedState.isAnimating = this.lottieDrawable.y();
        savedState.imageAssetsFolder = this.lottieDrawable.f();
        savedState.repeatMode = this.lottieDrawable.v();
        savedState.repeatCount = this.lottieDrawable.w();
        return savedState;
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.D();
    }

    public void playAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.l();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.t();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        this.lottieDrawable.s();
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.b(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.b(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(l lVar) {
        return this.lottieOnCompositionLoadedListeners.remove(lVar);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.b(animatorUpdateListener);
    }

    public List<com.airbnb.lottie.model.d> resolveKeyPath(com.airbnb.lottie.model.d dVar) {
        return this.lottieDrawable.a(dVar);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(UserActionTaken.PLAY_OPTION);
        this.lottieDrawable.n();
    }

    public void reverseAnimationSpeed() {
        this.lottieDrawable.q();
    }

    public void setAnimation(int i) {
        this.animationResId = i;
        this.animationName = null;
        setCompositionTask(fromRawRes(i));
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(h.a(inputStream, str));
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.cacheComposition ? h.a(getContext(), str) : h.a(getContext(), str, (String) null));
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(h.a(getContext(), str, str2));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.f(z);
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.lottieDrawable.b(z);
    }

    public void setComposition(g gVar) {
        if (f.f1742a) {
            String str = "Set Composition \n" + gVar;
        }
        this.lottieDrawable.setCallback(this);
        this.composition = gVar;
        this.ignoreUnschedule = true;
        boolean a2 = this.lottieDrawable.a(gVar);
        this.ignoreUnschedule = false;
        if (getDrawable() != this.lottieDrawable || a2) {
            if (!a2) {
                setLottieDrawable();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (l lVar : this.lottieOnCompositionLoadedListeners) {
                lVar.onCompositionLoaded(gVar);
            }
        }
    }

    public void setFailureListener(j<Throwable> jVar) {
        this.failureListener = jVar;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(d dVar) {
        this.lottieDrawable.a(dVar);
    }

    public void setFrame(int i) {
        this.lottieDrawable.c(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.lottieDrawable.h(z);
    }

    public void setImageAssetDelegate(e eVar) {
        this.lottieDrawable.a(eVar);
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.a(str);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.lottieDrawable.c(z);
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.b(i);
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.c(str);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.b(f);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.a(i, i2);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.d(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.a(str, str2, z);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.a(f, f2);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.a(i);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.b(str);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.a(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.lottieDrawable.e(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.lottieDrawable.d(z);
    }

    public void setProgress(float f) {
        this.userActionsTaken.add(UserActionTaken.SET_PROGRESS);
        this.lottieDrawable.d(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.lottieDrawable.a(renderMode);
    }

    public void setRepeatCount(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_COUNT);
        this.lottieDrawable.e(i);
    }

    public void setRepeatMode(int i) {
        this.userActionsTaken.add(UserActionTaken.SET_REPEAT_MODE);
        this.lottieDrawable.d(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.g(z);
    }

    public void setSpeed(float f) {
        this.lottieDrawable.c(f);
    }

    public void setTextDelegate(s sVar) {
        this.lottieDrawable.a(sVar);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        LottieDrawable lottieDrawable;
        if (!this.ignoreUnschedule && drawable == (lottieDrawable = this.lottieDrawable) && lottieDrawable.x()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof LottieDrawable)) {
            LottieDrawable lottieDrawable2 = (LottieDrawable) drawable;
            if (lottieDrawable2.x()) {
                lottieDrawable2.D();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        return this.lottieDrawable.a(str, bitmap);
    }
}
