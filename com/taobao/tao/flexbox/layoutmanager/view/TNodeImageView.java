package com.taobao.tao.flexbox.layoutmanager.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.animation.AccelerateInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.uikit.feature.view.TImageView;
import tb.ibp;
import tb.kge;
import tb.oec;
import tb.oee;
import tb.ogu;
import tb.ogw;
import tb.ohd;
import tb.tds;

/* loaded from: classes8.dex */
public class TNodeImageView extends TImageView implements ImageLoader.d, tds {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ERROR_BASE64 = -1;
    private String animation;
    private int animationLoopCount;
    private ImageLoader.c callback;
    private float cornerRadius;
    private String currentUrl;
    private boolean enableImageMeasure;
    private ab engine;
    private ibp fadingEdge;
    private int height;
    private ImageLoader.a imageConfigInfo;
    private ImageLoader imageLoader;
    private Object imageSrc;
    private boolean imageSrcLoadMode;
    private boolean inCachePool;
    private ImageLoader.e loadTask;
    private final a mImpl;
    private boolean needResume;
    private Rect ninePatchRect;
    private String originUrl;
    private Drawable postponedDrawable;
    private boolean postponedSetImageDrawable;
    private boolean releaseDrawableOnDetach;
    private int width;

    static {
        kge.a(-492481653);
        kge.a(622630254);
        kge.a(-2026558253);
    }

    public static /* synthetic */ Object ipc$super(TNodeImageView tNodeImageView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1894755994:
                return new Boolean(super.verifyDrawable((Drawable) objArr[0]));
            case -1665133574:
                super.draw((Canvas) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case -221820127:
                super.jumpDrawablesToCurrentState();
                return null;
            case 448480424:
                super.drawableStateChanged();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1389530587:
                super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
    public void onImageLoadFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3feabda6", new Object[]{this});
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.c
    public void onImageLoaded(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30484add", new Object[]{this, bitmapDrawable});
        }
    }

    public static /* synthetic */ boolean access$000(TNodeImageView tNodeImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd19593f", new Object[]{tNodeImageView})).booleanValue() : tNodeImageView.inCachePool;
    }

    public static /* synthetic */ Object access$100(TNodeImageView tNodeImageView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("626b6576", new Object[]{tNodeImageView}) : tNodeImageView.imageSrc;
    }

    public static /* synthetic */ void access$200(TNodeImageView tNodeImageView, Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77769d13", new Object[]{tNodeImageView, drawable, new Boolean(z)});
        } else {
            tNodeImageView.setImageDrawableInternal(drawable, z);
        }
    }

    public static /* synthetic */ void access$300(TNodeImageView tNodeImageView, String str, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc0f1d7", new Object[]{tNodeImageView, str, drawable, new Integer(i)});
        } else {
            tNodeImageView.notifyImageLoadCallback(str, drawable, i);
        }
    }

    public TNodeImageView(Context context) {
        super(context);
        this.imageSrcLoadMode = false;
        this.width = -1;
        this.height = -1;
        this.mImpl = new a(this);
        this.animationLoopCount = -1;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dbafd8cf", new Object[]{this})).intValue();
        }
        a aVar = this.mImpl;
        if (aVar != null) {
            return aVar.a();
        }
        return super.getForegroundGravity();
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc8f51b3", new Object[]{this, new Integer(i)});
            return;
        }
        a aVar = this.mImpl;
        if (aVar == null) {
            return;
        }
        aVar.a(i);
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        a aVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue() : super.verifyDrawable(drawable) || ((aVar = this.mImpl) != null && aVar.a(drawable));
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c74b21", new Object[]{this});
            return;
        }
        super.jumpDrawablesToCurrentState();
        a aVar = this.mImpl;
        if (aVar == null) {
            return;
        }
        aVar.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1abb44a8", new Object[]{this});
            return;
        }
        super.drawableStateChanged();
        a aVar = this.mImpl;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd13670", new Object[]{this, drawable});
            return;
        }
        a aVar = this.mImpl;
        if (aVar == null) {
            return;
        }
        aVar.b(drawable);
    }

    @Override // android.view.View
    public Drawable getForeground() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("612f407a", new Object[]{this}) : this.mImpl.d();
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        a aVar = this.mImpl;
        if (aVar == null) {
            return;
        }
        aVar.a(z);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        a aVar = this.mImpl;
        if (aVar != null) {
            aVar.e();
        }
        CustomRoundRectFeature customRoundRectFeature = (CustomRoundRectFeature) findFeature(CustomRoundRectFeature.class);
        if (customRoundRectFeature == null) {
            return;
        }
        customRoundRectFeature.onSizeChanged(i, i2, i3, i4);
    }

    public float getCornerRadius() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c34be7b4", new Object[]{this})).floatValue() : this.cornerRadius;
    }

    public void setCornerRadius(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c784f0", new Object[]{this, new Float(f)});
        } else if (f == getCornerRadius()) {
        } else {
            this.cornerRadius = f;
            CustomRoundRectFeature customRoundRectFeature = (CustomRoundRectFeature) findFeature(CustomRoundRectFeature.class);
            if (customRoundRectFeature == null) {
                customRoundRectFeature = new CustomRoundRectFeature();
                addFeature(customRoundRectFeature);
            }
            customRoundRectFeature.setAnimationRadiusX(f);
            customRoundRectFeature.setAnimationRadiusY(f);
            invalidate();
        }
    }

    @Override // com.taobao.uikit.feature.view.TImageView, android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        try {
            if (this.fadingEdge != null && this.fadingEdge.a()) {
                int a2 = this.fadingEdge.a(canvas);
                super.draw(canvas);
                if (this.mImpl != null) {
                    this.mImpl.a(canvas);
                }
                this.fadingEdge.b(canvas);
                this.fadingEdge.a(canvas, a2);
                return;
            }
            super.draw(canvas);
            if (this.mImpl == null) {
                return;
            }
            this.mImpl.a(canvas);
        } catch (Exception unused) {
        }
    }

    public void setScrollState(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a2509a", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.imageLoader == null) {
            this.imageLoader = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
        }
        ImageLoader imageLoader = this.imageLoader;
        if (i == 2) {
            z = true;
        }
        imageLoader.a(z);
        if ((i != 0 && i != 1) || this.imageLoader.c() != 1) {
            return;
        }
        reloadImage();
    }

    public void loadImageIfInSlowScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c889e8", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.imageLoader == null) {
            this.imageLoader = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
        }
        this.imageLoader.a(!z);
        if (!z || this.imageLoader.c() != 1) {
            return;
        }
        reloadImage();
    }

    public void setShowAnimation(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9087896", new Object[]{this, str});
        } else {
            this.animation = str;
        }
    }

    public void setNinePatchRect(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70b9eba", new Object[]{this, rect});
        } else {
            this.ninePatchRect = rect;
        }
    }

    @Deprecated
    public void setImageUrl(ab abVar, String str, String str2, int i, int i2, ImageLoader.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498410a", new Object[]{this, abVar, str, str2, new Integer(i), new Integer(i2), aVar, new Boolean(z)});
            return;
        }
        this.originUrl = str;
        this.currentUrl = str2;
        this.engine = abVar;
        this.width = i;
        this.height = i2;
        this.imageConfigInfo = aVar;
        this.enableImageMeasure = z;
        setImageUrl(str2);
    }

    public void setImageSrc(ab abVar, Object obj, int i, int i2, ImageLoader.a aVar, Rect rect, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90515248", new Object[]{this, abVar, obj, new Integer(i), new Integer(i2), aVar, rect, new Boolean(z)});
        } else {
            setImageSrc(abVar, obj, null, i, i2, aVar, rect, z);
        }
    }

    public void setImageSrc(ab abVar, Object obj, String str, int i, int i2, ImageLoader.a aVar, Rect rect, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d175c4fe", new Object[]{this, abVar, obj, str, new Integer(i), new Integer(i2), aVar, rect, new Boolean(z)});
            return;
        }
        this.imageSrc = obj;
        this.engine = abVar;
        this.width = i;
        this.height = i2;
        this.imageConfigInfo = aVar;
        this.enableImageMeasure = true;
        this.imageSrcLoadMode = true;
        setNinePatchRect(rect);
        final long uptimeMillis = SystemClock.uptimeMillis();
        this.loadTask = ogw.a(this.imageLoader, abVar, obj, str, i, i2, aVar, rect, z, false, new ogw.a() { // from class: com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ogw.a
            public void a(Object obj2, Drawable drawable) {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("91476368", new Object[]{this, obj2, drawable});
                    return;
                }
                long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                if (TNodeImageView.access$000(TNodeImageView.this) || !oec.a(obj2, TNodeImageView.access$100(TNodeImageView.this))) {
                    return;
                }
                TNodeImageView tNodeImageView = TNodeImageView.this;
                if (uptimeMillis2 >= 100) {
                    z2 = false;
                }
                TNodeImageView.access$200(tNodeImageView, drawable, z2);
                TNodeImageView.access$300(TNodeImageView.this, null, drawable, 0);
            }

            @Override // tb.ogw.a
            public void a(Object obj2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1e7da93f", new Object[]{this, obj2, new Integer(i3)});
                } else if (TNodeImageView.access$000(TNodeImageView.this) || !oec.a(obj2, TNodeImageView.access$100(TNodeImageView.this))) {
                } else {
                    TNodeImageView.this.setImageDrawable(null);
                    TNodeImageView.access$300(TNodeImageView.this, null, null, i3);
                }
            }
        });
        ImageLoader.e eVar = this.loadTask;
        if (eVar == null || eVar.c == null) {
            return;
        }
        this.imageLoader = this.loadTask.c;
    }

    public void cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        ImageLoader.e eVar = this.loadTask;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    @Deprecated
    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        this.imageSrcLoadMode = false;
        this.currentUrl = str;
        if (str != null && str.startsWith(ogw.BASE64_TAG)) {
            Bitmap a2 = ogu.a(str);
            if (a2 == null && (a2 = ohd.a(str)) != null) {
                ogu.a(str, a2);
            }
            if (a2 != null) {
                onImageLoaded(str, new BitmapDrawable(a2));
            } else {
                onImageLoadFailed(-1);
            }
        } else if (!StringUtils.isEmpty(str)) {
            if (this.imageLoader == null) {
                this.imageLoader = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().i();
            }
            this.imageLoader.a(new ImageLoader.b(this.engine, getContext(), this.originUrl, str, this.width, this.height, this.imageConfigInfo, this.enableImageMeasure), false, this);
        } else {
            setImageDrawable(null);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoaded(String str, BitmapDrawable bitmapDrawable) {
        BitmapDrawable bitmapDrawable2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72686e27", new Object[]{this, str, bitmapDrawable});
        } else if (this.inCachePool || !StringUtils.equals(str, this.currentUrl)) {
        } else {
            NinePatchDrawable ninePatchDrawable = bitmapDrawable;
            if (!str.startsWith(ogw.BASE64_TAG)) {
                if (bitmapDrawable instanceof oee) {
                    oee oeeVar = (oee) bitmapDrawable;
                    bitmapDrawable2 = oeeVar.c();
                    int i = this.animationLoopCount;
                    if (i >= 0) {
                        oeeVar.a(i);
                    }
                    oeeVar.a();
                } else {
                    bitmapDrawable2 = new BitmapDrawable(getResources(), bitmapDrawable.getBitmap());
                    if (this.ninePatchRect != null) {
                        ninePatchDrawable = d.a(getResources(), bitmapDrawable.getBitmap(), this.ninePatchRect, this.width, this.height);
                    }
                }
                ninePatchDrawable = bitmapDrawable2;
            }
            setImageDrawableInternal(ninePatchDrawable, false);
            notifyImageLoadCallback(str, ninePatchDrawable, 0);
        }
    }

    private void setImageDrawableInternal(Drawable drawable, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cea78d5", new Object[]{this, drawable, new Boolean(z)});
        } else if (this.postponedSetImageDrawable) {
            this.postponedDrawable = drawable;
        } else {
            setImageDrawable(drawable);
            String str = this.animation;
            if (str != null && !"none".equals(str)) {
                z2 = "auto".equals(this.animation) ? !z : true;
            }
            if (!z2) {
                return;
            }
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "alpha", 0, 255);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setDuration(150L);
            ofInt.start();
        }
    }

    private void notifyImageLoadCallback(String str, Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1405ba51", new Object[]{this, str, drawable, new Integer(i)});
            return;
        }
        ImageLoader.c cVar = this.callback;
        if (cVar == null) {
            return;
        }
        if (drawable != null) {
            BitmapDrawable bitmapDrawable = null;
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            }
            ImageLoader.c cVar2 = this.callback;
            if (cVar2 instanceof ImageLoader.d) {
                ((ImageLoader.d) cVar2).onImageLoaded(str, bitmapDrawable);
            } else {
                cVar2.onImageLoaded(bitmapDrawable);
            }
        } else if (cVar instanceof ImageLoader.d) {
            ((ImageLoader.d) cVar).onImageLoadFailed(i);
        } else {
            cVar.onImageLoadFailed();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.ImageLoader.d
    public void onImageLoadFailed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd6d6a1d", new Object[]{this, new Integer(i)});
        } else {
            notifyImageLoadCallback(null, null, i);
        }
    }

    public void setInCachePool(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf70c36", new Object[]{this, new Boolean(z)});
            return;
        }
        this.inCachePool = z;
        if (!z) {
            return;
        }
        this.imageSrc = null;
        this.originUrl = null;
        this.currentUrl = null;
        this.height = -1;
        this.width = -1;
        this.imageConfigInfo = ImageLoader.a.a();
        this.enableImageMeasure = false;
        this.imageLoader = null;
        this.loadTask = null;
        this.animation = null;
        this.ninePatchRect = null;
        this.needResume = false;
        this.engine = null;
        this.callback = null;
        this.imageSrcLoadMode = false;
        this.postponedSetImageDrawable = false;
        this.postponedDrawable = null;
        ibp ibpVar = this.fadingEdge;
        if (ibpVar == null) {
            return;
        }
        ibpVar.a((int[]) null);
        this.fadingEdge = null;
    }

    public void setImageLoadCallback(ImageLoader.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de668f5", new Object[]{this, cVar});
        } else {
            this.callback = cVar;
        }
    }

    public String getCurrentUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this}) : this.currentUrl;
    }

    public Object getImageSrc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d053feec", new Object[]{this}) : this.imageSrc;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (!this.releaseDrawableOnDetach || this.imageLoader == null || !this.needResume) {
            return;
        }
        reloadImage();
    }

    private void reloadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe362c9", new Object[]{this});
        } else if (this.imageSrcLoadMode) {
            ImageLoader imageLoader = this.imageLoader;
            if (imageLoader == null) {
                return;
            }
            imageLoader.b();
        } else {
            String str = this.currentUrl;
            if (str == null) {
                return;
            }
            setImageUrl(str);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (!this.releaseDrawableOnDetach || this.imageLoader == null || getDrawable() == null || this.inCachePool) {
            return;
        }
        if (!this.imageSrcLoadMode && this.currentUrl == null) {
            return;
        }
        setImageDrawable(null);
        this.needResume = true;
    }

    public void setReleaseDrawableOnDetach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39799fd8", new Object[]{this, new Boolean(z)});
        } else {
            this.releaseDrawableOnDetach = z;
        }
    }

    public void setAnimationLoopCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f8e353", new Object[]{this, new Integer(i)});
        } else {
            this.animationLoopCount = i;
        }
    }

    public void startPostponedSetImageDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cc594a", new Object[]{this});
        } else if (!this.postponedSetImageDrawable) {
        } else {
            this.postponedSetImageDrawable = false;
            Drawable drawable = this.postponedDrawable;
            if (drawable == null) {
                return;
            }
            setImageDrawableInternal(drawable, false);
            this.postponedDrawable = null;
        }
    }

    public void postponedSetImageDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d937a8c", new Object[]{this});
        } else {
            this.postponedSetImageDrawable = true;
        }
    }

    @Override // tb.tds
    public void setFading(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bad10d0", new Object[]{this, iArr});
            return;
        }
        if (this.fadingEdge == null) {
            this.fadingEdge = new ibp(this);
        }
        this.fadingEdge.a(true);
        this.fadingEdge.a(iArr);
    }
}
