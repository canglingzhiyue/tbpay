package com.taobao.uikit.extend.feature.features;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.v;
import com.taobao.pexode.decoder.h;
import com.taobao.phenix.cache.disk.k;
import com.taobao.phenix.cache.memory.e;
import com.taobao.phenix.compat.stat.f;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.b;
import com.taobao.phenix.intf.c;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.phenix.intf.event.a;
import com.taobao.phenix.loader.network.HttpCodeResponseException;
import com.taobao.phenix.request.ImageStatistics;
import com.taobao.phenix.request.d;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.utils.UIKITLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.esr;
import tb.niw;
import tb.njf;

/* loaded from: classes.dex */
public class ImageLoadFeature extends AbsFeature<ImageView> implements LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int APM_UI_KEY = -308;
    private static final int L_SCROLLING = 1;
    private static final int L_SHOWING = 0;
    private static final int S_DONE_FAIL = 3;
    private static final int S_DONE_SUC = 2;
    private static final int S_INIT = 0;
    private static final int S_LOADING = 1;
    private static final int S_LOAD_IMMEDIATE = 4;
    private static final int S_NEED_REFRESH = 5;
    private static boolean isViewTokenValid;
    public ObjectAnimator mAlphaAnim;
    private String mCacheKey4PlaceHolder;
    private Context mContext;
    private boolean mEnableSizeInLayoutParams;
    private int mErrorImageId;
    public boolean mFadeIn;
    private volatile TUrlImageView.FinalUrlInspector mFinalUrlInspector;
    private PhenixOptions mGlobalPhenixOptions;
    private WeakReference<ImageView> mHostReference;
    private int mKeepBackgroundState;
    private int mLastMaxViewSize;
    private c mLastResTicket;
    private PhenixOptions mNextPhenixOptions;
    private Drawable mPlaceHoldForeground;
    public int mPlaceHoldResourceId;
    private String mPriorityModuleName;
    private volatile boolean mRealAsync;
    private volatile Boolean mSkipAutoSize;
    private ImageStrategyConfig mStrategyConfig;
    private volatile c mTicket;
    private volatile String mUrl;
    public a<FailPhenixEvent> mUserFailListener;
    public a<SuccPhenixEvent> mUserSuccListener;
    private boolean mNoRepeatOnError = true;
    public volatile int mLoadState = 0;
    private int mScrollState = 0;
    public volatile String mLoadingUrl = "";
    private boolean mWhenNullClearImg = true;
    private boolean mEnabledLoadOnFling = true;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    private ImageLoadSuccListener mSuccListener = new ImageLoadSuccListener();
    private ImageLoadFailListener mFailListener = new ImageLoadFailListener();
    private ImageRetryHandler mRetryHandler = new ImageRetryHandler();
    private boolean mUserCalledSetImageUrl = false;
    private a<com.taobao.phenix.intf.event.c> mMemoryMissListener = new a<com.taobao.phenix.intf.event.c>() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.phenix.intf.event.a
        public boolean onHappen(com.taobao.phenix.intf.event.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d10899d9", new Object[]{this, cVar})).booleanValue();
            }
            int i = ImageLoadFeature.this.mLoadState;
            ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
            ImageLoadFeature.access$100(imageLoadFeature, imageLoadFeature.getHost(), null, false, ImageLoadFeature.access$000(ImageLoadFeature.this));
            ImageLoadFeature.this.mLoadState = i;
            return false;
        }
    };

    public static /* synthetic */ Object ipc$super(ImageLoadFeature imageLoadFeature, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public static /* synthetic */ boolean access$000(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f5e1d675", new Object[]{imageLoadFeature})).booleanValue() : imageLoadFeature.mWhenNullClearImg;
    }

    public static /* synthetic */ void access$100(ImageLoadFeature imageLoadFeature, ImageView imageView, BitmapDrawable bitmapDrawable, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a3637f", new Object[]{imageLoadFeature, imageView, bitmapDrawable, new Boolean(z), new Boolean(z2)});
        } else {
            imageLoadFeature.fillImageDrawable(imageView, bitmapDrawable, z, z2);
        }
    }

    public static /* synthetic */ int access$1000(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4e471fd5", new Object[]{imageLoadFeature})).intValue() : imageLoadFeature.mKeepBackgroundState;
    }

    public static /* synthetic */ ImageStrategyConfig access$1100(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageStrategyConfig) ipChange.ipc$dispatch("14655328", new Object[]{imageLoadFeature}) : imageLoadFeature.mStrategyConfig;
    }

    public static /* synthetic */ ImageStrategyConfig access$1102(ImageLoadFeature imageLoadFeature, ImageStrategyConfig imageStrategyConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("57426f57", new Object[]{imageLoadFeature, imageStrategyConfig});
        }
        imageLoadFeature.mStrategyConfig = imageStrategyConfig;
        return imageStrategyConfig;
    }

    public static /* synthetic */ boolean access$200(ImageLoadFeature imageLoadFeature, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7ddca209", new Object[]{imageLoadFeature, new Boolean(z)})).booleanValue() : imageLoadFeature.loadImageIfNecessary(z);
    }

    public static /* synthetic */ boolean access$300(ImageLoadFeature imageLoadFeature, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("da264dd2", new Object[]{imageLoadFeature, new Boolean(z), new Boolean(z2)})).booleanValue() : imageLoadFeature.loadImageIfNecessaryProxy(z, z2);
    }

    public static /* synthetic */ void access$400(ImageLoadFeature imageLoadFeature, ImageView imageView, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74d7c6d", new Object[]{imageLoadFeature, imageView, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            imageLoadFeature.fetch(imageView, z, i, i2);
        }
    }

    public static /* synthetic */ String access$500(ImageLoadFeature imageLoadFeature) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae4eef14", new Object[]{imageLoadFeature}) : imageLoadFeature.mUrl;
    }

    public static /* synthetic */ boolean access$602(ImageLoadFeature imageLoadFeature, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8861810f", new Object[]{imageLoadFeature, new Boolean(z)})).booleanValue();
        }
        imageLoadFeature.mNoRepeatOnError = z;
        return z;
    }

    public static /* synthetic */ boolean access$700() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2f21a642", new Object[0])).booleanValue() : isViewTokenValid;
    }

    public static /* synthetic */ void access$800(ImageLoadFeature imageLoadFeature, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11337804", new Object[]{imageLoadFeature, new Integer(i), str});
        } else {
            imageLoadFeature.markHostView(i, str);
        }
    }

    public static /* synthetic */ boolean access$900(ImageLoadFeature imageLoadFeature, ImageView imageView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("92755730", new Object[]{imageLoadFeature, imageView, bitmap})).booleanValue() : imageLoadFeature.isViewBitmapDifferentWith(imageView, bitmap);
    }

    static {
        try {
            Class.forName("com.taobao.monitor.procedure.v");
            isViewTokenValid = true;
        } catch (Throwable unused) {
            isViewTokenValid = false;
        }
    }

    public void setStrategyConfig(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40a4afa", new Object[]{this, obj});
        } else if (!(obj instanceof ImageStrategyConfig)) {
        } else {
            this.mStrategyConfig = (ImageStrategyConfig) obj;
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void setHost(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf1252b", new Object[]{this, imageView});
        } else if (imageView == null) {
            this.mHostReference = null;
            this.mUserSuccListener = null;
            this.mUserFailListener = null;
            if (this.mTicket == null) {
                return;
            }
            this.mTicket.b();
        } else {
            this.mHostReference = new WeakReference<>(imageView);
            this.mContext = imageView.getContext().getApplicationContext();
            if (StringUtils.isEmpty(this.mUrl)) {
                return;
            }
            loadImageIfNecessary(false);
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public ImageView getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("286ccf8b", new Object[]{this});
        }
        WeakReference<ImageView> weakReference = this.mHostReference;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else {
            constructor(context, attributeSet, i, null);
        }
    }

    public void constructor(Context context, AttributeSet attributeSet, int i, boolean[] zArr) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e168eb7b", new Object[]{this, context, attributeSet, new Integer(i), zArr});
        } else if (attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ImageLoadFeature, i, 0)) == null) {
        } else {
            this.mFadeIn = obtainStyledAttributes.getBoolean(R.styleable.ImageLoadFeature_uik_fade_in, false);
            if (obtainStyledAttributes.hasValue(R.styleable.ImageLoadFeature_uik_skip_auto_size)) {
                this.mSkipAutoSize = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.ImageLoadFeature_uik_skip_auto_size, false));
            }
            this.mWhenNullClearImg = obtainStyledAttributes.getBoolean(R.styleable.ImageLoadFeature_uik_when_null_clear_img, true);
            this.mPlaceHoldResourceId = obtainStyledAttributes.getResourceId(R.styleable.ImageLoadFeature_uik_place_hold_background, 0);
            this.mErrorImageId = obtainStyledAttributes.getResourceId(R.styleable.ImageLoadFeature_uik_error_background, 0);
            this.mPlaceHoldForeground = obtainStyledAttributes.getDrawable(R.styleable.ImageLoadFeature_uik_place_hold_foreground);
            if (zArr != null) {
                zArr[0] = obtainStyledAttributes.getBoolean(R.styleable.ImageLoadFeature_uik_auto_release_image, true);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int max = Math.max(i3 - i, i4 - i2);
        int i5 = this.mLastMaxViewSize;
        if (i5 > 0 && max - i5 >= 100) {
            z2 = true;
        }
        this.mLastMaxViewSize = max;
        if (!z2 && this.mLoadState == 2) {
            return;
        }
        if (z2) {
            resetState();
        }
        loadImageIfNecessary(true);
    }

    public boolean skipAutoSize(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39745fa2", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        this.mSkipAutoSize = Boolean.valueOf(z);
        return z;
    }

    public void realAsync(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a8b326f", new Object[]{this, new Boolean(z)});
        } else {
            this.mRealAsync = z;
        }
    }

    public void setFinalUrlInspector(TUrlImageView.FinalUrlInspector finalUrlInspector) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e9e0ef", new Object[]{this, finalUrlInspector});
        } else {
            this.mFinalUrlInspector = finalUrlInspector;
        }
    }

    public ImageLoadFeature succListener(a<SuccPhenixEvent> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("11415304", new Object[]{this, aVar});
        }
        this.mUserSuccListener = aVar;
        return this;
    }

    public ImageLoadFeature failListener(a<FailPhenixEvent> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageLoadFeature) ipChange.ipc$dispatch("9329bae0", new Object[]{this, aVar});
        }
        this.mUserFailListener = aVar;
        return this;
    }

    public void reload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fecf5534", new Object[]{this, new Boolean(z)});
        } else {
            setImageUrl(this.mUrl, this.mCacheKey4PlaceHolder, z, true, this.mNextPhenixOptions);
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
        } else {
            setImageUrl(str, null, false, false, null);
        }
    }

    public void resetState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
        } else {
            this.mLoadState = 0;
        }
    }

    public void setImageUrl(String str, String str2, boolean z, boolean z2, PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323bb4b6", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2), phenixOptions});
            return;
        }
        this.mUserCalledSetImageUrl = true;
        if (!z2 && this.mLoadState != 0 && this.mLoadState != 3 && this.mLoadState != 5 && StringUtils.equals(this.mUrl, str) && StringUtils.equals(this.mCacheKey4PlaceHolder, str2) && PhenixOptions.isSame(this.mNextPhenixOptions, phenixOptions)) {
            return;
        }
        if (!StringUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("TUrlImageView setImageUrl | url= ");
            sb.append(str);
            sb.append("| mLoadState:");
            sb.append(this.mLoadState);
            sb.append("| forceLoad:");
            sb.append(z2);
            sb.append("| hostView:");
            sb.append(getHost());
            niw.a(6, "Phenix", sb.toString());
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("log", sb.toString());
            f.a().d("IMAGE", "setImageUrl", hashMap);
        }
        if (isViewTokenValid && !StringUtils.isEmpty(str)) {
            markHostView(v.APM_VIEW_TOKEN, v.APM_VIEW_INVALID);
        }
        this.mUrl = str;
        this.mCacheKey4PlaceHolder = str2;
        this.mNoRepeatOnError = false;
        resetState();
        this.mNextPhenixOptions = phenixOptions;
        ImageView host = getHost();
        if (host == null) {
            return;
        }
        if (z) {
            if (this.mUrl == null) {
                b.h().a(this.mTicket);
                fillImageDrawable(host, null, false, true);
                return;
            }
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ImageLoadFeature.access$200(ImageLoadFeature.this, false);
                    }
                }
            });
            return;
        }
        loadImageIfNecessary(false);
    }

    private String getPriorityModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4f8b1c8", new Object[]{this});
        }
        PhenixOptions phenixOptions = this.mNextPhenixOptions;
        if (phenixOptions != null) {
            return phenixOptions.priorityModuleName;
        }
        String str = this.mPriorityModuleName;
        if (str != null) {
            return str;
        }
        PhenixOptions phenixOptions2 = this.mGlobalPhenixOptions;
        if (phenixOptions2 == null) {
            return null;
        }
        return phenixOptions2.priorityModuleName;
    }

    public njf retrieveImageData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njf) ipChange.ipc$dispatch("4cd4e4cc", new Object[]{this});
        }
        String str = this.mLoadingUrl;
        if (!StringUtils.isEmpty(str)) {
            return b.h().a(getPriorityModuleName(), str, 0, false);
        }
        return null;
    }

    public void keepBackgroundOnForegroundUpdate(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26be9e0f", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            i = -1;
        }
        this.mKeepBackgroundState = i;
    }

    public void enableLoadOnFling(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f2fe39", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnabledLoadOnFling = z;
        }
    }

    public void enableSizeInLayoutParams(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371a2674", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableSizeInLayoutParams = z;
        }
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
        } else {
            this.mPlaceHoldResourceId = i;
        }
    }

    public void setPlaceHoldForeground(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d3dddb2", new Object[]{this, drawable});
        } else {
            this.mPlaceHoldForeground = drawable;
        }
    }

    public void setErrorImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4358a676", new Object[]{this, new Integer(i)});
        } else {
            this.mErrorImageId = i;
        }
    }

    private void markHostView(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b701a68c", new Object[]{this, new Integer(i), str});
            return;
        }
        ImageView host = getHost();
        if (host == null) {
            return;
        }
        host.setTag(i, str);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else {
            this.mScrollState = 1;
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (this.mScrollState != 1) {
        } else {
            this.mScrollState = 0;
            if (this.mLoadState != 0 && this.mLoadState != 4) {
                return;
            }
            resetState();
            loadImageIfNecessary(false);
        }
    }

    private boolean loadImageIfNecessary(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97c291f4", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        final boolean z2 = TUrlImageView.sIsSpeed;
        if (z2) {
            if (StringUtils.isEmpty(this.mUrl)) {
                if (this.mTicket != null) {
                    this.mTicket.b();
                }
                fillImageDrawable(getHost(), null, false, this.mUserCalledSetImageUrl);
                return false;
            }
            if (this.mTicket != null && !this.mTicket.b(this.mUrl)) {
                this.mTicket.b();
            }
            this.mMainHandler.post(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ImageLoadFeature.access$300(ImageLoadFeature.this, z, z2);
                    }
                }
            });
        } else {
            loadImageIfNecessaryProxy(z, z2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean loadImageIfNecessaryProxy(boolean r8, boolean r9) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.uikit.extend.feature.features.ImageLoadFeature.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L29
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r8)
            r1[r2] = r3
            r8 = 2
            java.lang.Boolean r2 = new java.lang.Boolean
            r2.<init>(r9)
            r1[r8] = r2
            java.lang.String r8 = "65b4b59c"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L29:
            android.widget.ImageView r9 = r7.getHost()
            if (r9 != 0) goto L30
            return r3
        L30:
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            if (r4 == 0) goto L60
            boolean r5 = r7.mEnableSizeInLayoutParams
            if (r5 == 0) goto L55
            int r5 = r4.width
            if (r5 <= 0) goto L55
            int r5 = r4.height
            if (r5 <= 0) goto L55
            int r0 = r4.width
            int r1 = r4.height
            int r4 = java.lang.Math.max(r0, r1)
            r7.mLastMaxViewSize = r4
            goto L60
        L55:
            int r5 = r4.height
            r6 = -2
            if (r5 != r6) goto L60
            int r4 = r4.width
            if (r4 != r6) goto L60
            r4 = 1
            goto L61
        L60:
            r4 = 0
        L61:
            if (r0 != 0) goto L68
            if (r1 != 0) goto L68
            if (r4 != 0) goto L68
            return r3
        L68:
            java.lang.String r4 = r7.mUrl
            boolean r4 = android.text.StringUtils.isEmpty(r4)
            if (r4 == 0) goto L80
            com.taobao.phenix.intf.c r8 = r7.mTicket
            if (r8 == 0) goto L79
            com.taobao.phenix.intf.c r8 = r7.mTicket
            r8.b()
        L79:
            r8 = 0
            boolean r0 = r7.mUserCalledSetImageUrl
            r7.fillImageDrawable(r9, r8, r3, r0)
            return r3
        L80:
            com.taobao.phenix.intf.c r4 = r7.mTicket
            if (r4 == 0) goto L93
            com.taobao.phenix.intf.c r4 = r7.mTicket
            java.lang.String r5 = r7.mUrl
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto L93
            com.taobao.phenix.intf.c r4 = r7.mTicket
            r4.b()
        L93:
            boolean r4 = r7.mNoRepeatOnError
            if (r4 == 0) goto L98
            return r3
        L98:
            int r4 = r7.mLoadState
            if (r4 == 0) goto L9d
            return r3
        L9d:
            int r4 = r7.mScrollState
            if (r4 != r2) goto La6
            boolean r4 = r7.mEnabledLoadOnFling
            if (r4 != 0) goto La7
            return r3
        La6:
            r2 = 0
        La7:
            com.taobao.uikit.extend.feature.features.ImageLoadFeature$ImageLoadSuccListener r4 = r7.mSuccListener
            r4.setIsInLayoutPass(r8)
            boolean r8 = r7.mRealAsync
            if (r8 == 0) goto Lb4
            r7.asyncFetch(r9, r2, r0, r1)
            return r3
        Lb4:
            r7.fetch(r9, r2, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.uikit.extend.feature.features.ImageLoadFeature.loadImageIfNecessaryProxy(boolean, boolean):boolean");
    }

    private void asyncFetch(final ImageView imageView, final boolean z, final int i, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbe3735", new Object[]{this, imageView, new Boolean(z), new Integer(i), new Integer(i2)});
        } else {
            k.a(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ImageLoadFeature.access$400(ImageLoadFeature.this, imageView, z, i, i2);
                    }
                }
            });
        }
    }

    private void fetch(ImageView imageView, boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7de8599", new Object[]{this, imageView, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        String str = this.mUrl;
        long nanoTime = System.nanoTime();
        if ((this.mSkipAutoSize == null && !TUrlImageView.isAutoSizeSkippedGlobally()) || (this.mSkipAutoSize != null && !this.mSkipAutoSize.booleanValue())) {
            str = ImageStrategyDecider.decideUrl(this.mUrl, Integer.valueOf(i), Integer.valueOf(i2), this.mStrategyConfig);
        }
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (this.mFinalUrlInspector != null) {
            str = this.mFinalUrlInspector.inspectFinalUrl(str, i, i2);
        }
        TUrlImageView.FinalUrlInspector globalFinalUrlInspector = TUrlImageView.getGlobalFinalUrlInspector();
        if (globalFinalUrlInspector != null) {
            str = globalFinalUrlInspector.inspectFinalUrl(str, i, i2);
        }
        this.mLoadingUrl = str;
        this.mLoadState = z ? 4 : 1;
        PhenixOptions phenixOptions = this.mNextPhenixOptions;
        if (phenixOptions == null) {
            phenixOptions = this.mGlobalPhenixOptions;
        }
        PhenixCreator failListener = b.h().a(this.mContext).a(getPriorityModuleName(), str).releasableDrawable(true).secondary(this.mCacheKey4PlaceHolder).memOnly(z).limitSize(imageView).succListener(this.mSuccListener).memCacheMissListener(this.mMemoryMissListener).failListener(this.mFailListener);
        this.mSuccListener.mCreator = failListener;
        this.mFailListener.mCreator = failListener;
        HashMap hashMap = new HashMap();
        hashMap.put("oriUrl", this.mUrl);
        hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
        f.a().a(String.valueOf(failListener.id()), str, hashMap);
        if (phenixOptions != null) {
            failListener.preloadWithSmall(phenixOptions.isOpened(1)).scaleFromLarge(phenixOptions.isOpened(2)).bitmapProcessors(phenixOptions.bitmapProcessors).asThumbnail(phenixOptions.thumbnailType, phenixOptions.isOpened(16)).diskCachePriority(phenixOptions.diskCachePriority).schedulePriority(phenixOptions.schedulePriority).memoryCachePriority(phenixOptions.memoryCachePriority);
            if (phenixOptions.isOpened(4)) {
                failListener.skipCache();
            }
            if (phenixOptions.isOpened(8)) {
                failListener.mo1206onlyCache();
            }
            if (phenixOptions.isOpened(32)) {
                failListener.fuzzyMatchCache();
            }
            if (phenixOptions.isStrictMatchCache()) {
                failListener.strictMatchCache(true);
            }
            Map<String, String> loaderExtras = phenixOptions.getLoaderExtras();
            if (loaderExtras != null) {
                for (Map.Entry<String, String> entry : loaderExtras.entrySet()) {
                    String value = entry.getValue();
                    if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(value)) {
                        failListener.addLoaderExtra(entry.getKey(), entry.getValue());
                    }
                }
            }
        }
        if (!this.mUrl.equals(str)) {
            failListener.retryHandler(this.mRetryHandler.setRetryUrl(this.mUrl));
            this.mRetryHandler.seImageInfo(i, i2);
        }
        ImageStatistics statistics = failListener.getStatistics();
        if (statistics != null) {
            if (TUrlImageView.isAutoSizeSkippedGlobally() || (this.mSkipAutoSize != null && this.mSkipAutoSize.booleanValue())) {
                statistics.t = true;
            }
            ImageStrategyConfig imageStrategyConfig = this.mStrategyConfig;
            if (imageStrategyConfig != null && imageStrategyConfig.b()) {
                statistics.u = true;
            }
            statistics.P = nanoTime2;
        }
        failListener.addLoaderExtra("origin_url", this.mUrl);
        ImageStrategyConfig imageStrategyConfig2 = this.mStrategyConfig;
        if (imageStrategyConfig2 != null) {
            String h = imageStrategyConfig2.h();
            if (StringUtils.isEmpty(h)) {
                h = String.valueOf(this.mStrategyConfig.e());
            }
            failListener.addLoaderExtra(esr.BUNDLE_BIZ_CODE, h);
            if (!StringUtils.isEmpty(this.mStrategyConfig.f())) {
                failListener.addLoaderExtra("p_trace_id", this.mStrategyConfig.f());
            }
            if (this.mStrategyConfig.g() != null && this.mStrategyConfig.g().size() > 0) {
                failListener.setOpenTraceContext(this.mStrategyConfig.g());
            } else if (phenixOptions != null && phenixOptions.getOpenTraceContext() != null && phenixOptions.getOpenTraceContext().size() > 0) {
                failListener.setOpenTraceContext(phenixOptions.getOpenTraceContext());
            }
        }
        this.mTicket = failListener.fetch();
        this.mTicket.a(this.mUrl);
        ImageView host = getHost();
        if (host == null) {
            return;
        }
        host.setTag(APM_UI_KEY, "START");
    }

    private boolean isViewDrawableSameWith(ImageView imageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a79f802", new Object[]{this, imageView, drawable})).booleanValue();
        }
        if (imageView instanceof TUrlImageView) {
            return ((TUrlImageView) imageView).isDrawableSameWith(drawable);
        }
        return imageView != null && imageView.getDrawable() == drawable;
    }

    private boolean isViewBitmapDifferentWith(ImageView imageView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e761a70", new Object[]{this, imageView, bitmap})).booleanValue();
        }
        if (imageView instanceof TUrlImageView) {
            return ((TUrlImageView) imageView).isViewBitmapDifferentWith(bitmap);
        }
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && ((BitmapDrawable) drawable).getBitmap() != bitmap) {
                return true;
            }
        }
        return false;
    }

    private void fillImageDrawable(ImageView imageView, BitmapDrawable bitmapDrawable, boolean z, boolean z2) {
        Drawable drawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f7230c", new Object[]{this, imageView, bitmapDrawable, new Boolean(z), new Boolean(z2)});
        } else if (imageView == null) {
        } else {
            c cVar = this.mLastResTicket;
            if (cVar != null) {
                cVar.b();
                this.mLastResTicket = null;
            }
            if (bitmapDrawable != null) {
                imageView.setImageDrawable(bitmapDrawable);
                int i = this.mKeepBackgroundState;
                if (i >= 0 && (i != 0 || this.mPlaceHoldResourceId == 0)) {
                    return;
                }
                imageView.setBackgroundDrawable(null);
            } else if (z && z2) {
                imageView.setImageDrawable(null);
                int i2 = this.mErrorImageId;
                if (i2 == 0) {
                    i2 = this.mPlaceHoldResourceId;
                }
                placeBgResImage(i2);
            } else if ((z2 || isViewDrawableSameWith(imageView, null)) && (drawable = this.mPlaceHoldForeground) != null) {
                imageView.setImageDrawable(drawable);
            } else if (!z2) {
            } else {
                imageView.setImageDrawable(null);
                placeBgResImage(this.mPlaceHoldResourceId);
            }
        }
    }

    private void placeBgResImage(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c88f55", new Object[]{this, new Integer(i)});
            return;
        }
        ImageView host = getHost();
        if (i == 0 || host == null) {
            return;
        }
        if (!com.taobao.tcommon.core.c.a(this.mContext, i)) {
            host.setBackgroundResource(i);
        } else {
            this.mLastResTicket = b.h().a(this.mContext).a(d.a(i)).schedulePriority(4).succListener(new a<SuccPhenixEvent>() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.phenix.intf.event.a
                public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    e eVar;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    ImageView host2 = ImageLoadFeature.this.getHost();
                    if (host2 != null && (eVar = (e) succPhenixEvent.getDrawable()) != null) {
                        NinePatchDrawable k = eVar.k();
                        if (k != null) {
                            eVar = k;
                        }
                        host2.setBackgroundDrawable(eVar);
                    }
                    return false;
                }
            }).fetch();
        }
    }

    public boolean isFadeIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fa1c6996", new Object[]{this})).booleanValue() : this.mFadeIn;
    }

    public void setFadeIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8994a", new Object[]{this, new Boolean(z)});
        } else {
            this.mFadeIn = z;
        }
    }

    public void setWhenNullClearImg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206d9914", new Object[]{this, new Boolean(z)});
        } else {
            this.mWhenNullClearImg = z;
        }
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this}) : this.mUrl;
    }

    public String getLoadingUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d8098410", new Object[]{this}) : this.mLoadingUrl;
    }

    public void setPriorityModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5def42ae", new Object[]{this, str});
        } else {
            this.mPriorityModuleName = str;
        }
    }

    public void setPhenixOptions(PhenixOptions phenixOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61067f8", new Object[]{this, phenixOptions});
        } else {
            this.mGlobalPhenixOptions = phenixOptions;
        }
    }

    /* loaded from: classes.dex */
    public class ImageLoadFailListener implements a<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public PhenixCreator mCreator;

        public ImageLoadFailListener() {
        }

        @Override // com.taobao.phenix.intf.event.a
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            UIKITLog.d(TUrlImageView.LOG_TAG, "load image failed, state=%d, url=%s", Integer.valueOf(ImageLoadFeature.this.mLoadState), ImageLoadFeature.access$500(ImageLoadFeature.this));
            int resultCode = failPhenixEvent.getResultCode();
            if (resultCode == -1 || resultCode == 404) {
                ImageLoadFeature.access$602(ImageLoadFeature.this, true);
            } else {
                ImageLoadFeature.access$602(ImageLoadFeature.this, false);
            }
            ImageView host = ImageLoadFeature.this.getHost();
            if (host != null) {
                host.setTag(ImageLoadFeature.APM_UI_KEY, "ERROR");
            }
            failPhenixEvent.getTicket().a(true);
            ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
            ImageLoadFeature.access$100(imageLoadFeature, imageLoadFeature.getHost(), null, true, ImageLoadFeature.access$000(ImageLoadFeature.this));
            ImageLoadFeature imageLoadFeature2 = ImageLoadFeature.this;
            imageLoadFeature2.mLoadState = 3;
            if (imageLoadFeature2.mUserFailListener != null) {
                ImageLoadFeature.this.mUserFailListener.onHappen(failPhenixEvent);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("resultCode", failPhenixEvent != null ? String.valueOf(failPhenixEvent.getResultCode()) : "null");
            hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
            hashMap.put("oriUrl", ImageLoadFeature.access$500(ImageLoadFeature.this));
            f a2 = f.a();
            PhenixCreator phenixCreator = this.mCreator;
            a2.b(phenixCreator != null ? String.valueOf(phenixCreator.id()) : "", failPhenixEvent.getUrl(), hashMap);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class ImageLoadSuccListener implements a<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean isInLayoutPass;
        public PhenixCreator mCreator;

        public ImageLoadSuccListener() {
        }

        @Override // com.taobao.phenix.intf.event.a
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue() : applyEvent(succPhenixEvent, succPhenixEvent.isImmediate());
        }

        public boolean applyEvent(final SuccPhenixEvent succPhenixEvent, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c0d8001d", new Object[]{this, succPhenixEvent, new Boolean(z)})).booleanValue();
            }
            String url = succPhenixEvent.getUrl();
            ImageView host = ImageLoadFeature.this.getHost();
            if (host != null) {
                host.setTag(ImageLoadFeature.APM_UI_KEY, "END");
            }
            if (ImageLoadFeature.access$700()) {
                ImageLoadFeature.access$800(ImageLoadFeature.this, v.APM_VIEW_TOKEN, v.APM_VIEW_VALID);
            }
            if (url != null && ImageLoadFeature.this.mLoadingUrl != null && !url.startsWith(ImageLoadFeature.this.mLoadingUrl)) {
                UIKITLog.w(TUrlImageView.LOG_TAG, "callback url not match target url, callback=%s, target=%s", url, ImageLoadFeature.this.mLoadingUrl);
                return true;
            }
            final ImageView host2 = ImageLoadFeature.this.getHost();
            if (host2 == null) {
                ImageLoadFeature.this.mLoadState = 3;
                return false;
            } else if (z && this.isInLayoutPass) {
                host2.post(new Runnable() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.ImageLoadSuccListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ImageLoadSuccListener.this.applyEvent(succPhenixEvent, false);
                        }
                    }
                });
                return true;
            } else {
                ImageLoadFeature.this.mLoadState = 3;
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable == null) {
                    ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
                    ImageLoadFeature.access$100(imageLoadFeature, host2, null, false, ImageLoadFeature.access$000(imageLoadFeature));
                    return true;
                }
                boolean isIntermediate = succPhenixEvent.isIntermediate();
                boolean z2 = ImageLoadFeature.this.mFadeIn;
                if (ImageLoadFeature.access$900(ImageLoadFeature.this, host2, drawable.getBitmap())) {
                    z2 = false;
                }
                if (!z && !isIntermediate && z2 && ImageLoadFeature.this.mLoadState != 2) {
                    host2.setImageDrawable(drawable);
                    if (ImageLoadFeature.this.mAlphaAnim != null) {
                        if (!ImageLoadFeature.this.mAlphaAnim.isRunning()) {
                            ImageLoadFeature.this.mAlphaAnim.start();
                        }
                    } else {
                        ImageLoadFeature.this.mAlphaAnim = ObjectAnimator.ofInt(host2, "alpha", 0, 255);
                        ImageLoadFeature.this.mAlphaAnim.setInterpolator(new AccelerateInterpolator());
                        ImageLoadFeature.this.mAlphaAnim.setDuration(300L);
                        ImageLoadFeature.this.mAlphaAnim.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.uikit.extend.feature.features.ImageLoadFeature.ImageLoadSuccListener.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                                } else if (ImageLoadFeature.access$1000(ImageLoadFeature.this) >= 0 && (ImageLoadFeature.access$1000(ImageLoadFeature.this) != 0 || ImageLoadFeature.this.mPlaceHoldResourceId == 0)) {
                                } else {
                                    host2.setBackgroundDrawable(null);
                                }
                            }
                        });
                        ImageLoadFeature.this.mAlphaAnim.start();
                    }
                } else {
                    ImageLoadFeature imageLoadFeature2 = ImageLoadFeature.this;
                    ImageLoadFeature.access$100(imageLoadFeature2, host2, drawable, false, ImageLoadFeature.access$000(imageLoadFeature2));
                }
                if (!isIntermediate) {
                    succPhenixEvent.getTicket().a(true);
                    if (succPhenixEvent.isNeedRefresh()) {
                        ImageLoadFeature.this.mLoadState = 5;
                    } else {
                        ImageLoadFeature.this.mLoadState = 2;
                    }
                    if (ImageLoadFeature.this.mUserSuccListener != null) {
                        ImageLoadFeature.this.mUserSuccListener.onHappen(succPhenixEvent);
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("intermediate", Boolean.valueOf(isIntermediate));
                hashMap.put("animation", Boolean.valueOf(z2));
                hashMap.put("time", Long.valueOf(System.currentTimeMillis()));
                f a2 = f.a();
                PhenixCreator phenixCreator = this.mCreator;
                a2.c(phenixCreator != null ? String.valueOf(phenixCreator.id()) : "", url, hashMap);
                return true;
            }
        }

        public void setIsInLayoutPass(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89e5f601", new Object[]{this, new Boolean(z)});
            } else {
                this.isInLayoutPass = z;
            }
        }
    }

    /* loaded from: classes.dex */
    public class ImageRetryHandler implements com.taobao.phenix.intf.event.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String defaultRetryUrl;
        private int height;
        private String retryUrl;
        private int width;

        public ImageRetryHandler() {
        }

        public ImageRetryHandler setRetryUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageRetryHandler) ipChange.ipc$dispatch("7365c859", new Object[]{this, str});
            }
            if (str != null && str.endsWith("END_IMAGE_URL")) {
                this.retryUrl = str.substring(0, str.length() - 13);
            } else {
                this.retryUrl = str;
            }
            return this;
        }

        public void seImageInfo(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eee545e", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            this.width = i;
            this.height = i2;
        }

        @Override // com.taobao.phenix.intf.event.b
        public String getRetryUrl(PhenixCreator phenixCreator, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3bd53dee", new Object[]{this, phenixCreator, th});
            }
            if (!(th instanceof HttpCodeResponseException) || ((HttpCodeResponseException) th).getHttpCode() != 404) {
                return null;
            }
            ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
            String str = this.retryUrl;
            imageLoadFeature.mLoadingUrl = str;
            return str;
        }

        @Override // com.taobao.phenix.intf.event.b
        public Pair<String, String> getDefaultRetryUrlPair() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Pair) ipChange.ipc$dispatch("101e44dd", new Object[]{this});
            }
            if (!h.a().b()) {
                return null;
            }
            if (ImageLoadFeature.access$1100(ImageLoadFeature.this) == null) {
                ImageLoadFeature.access$1102(ImageLoadFeature.this, ImageStrategyConfig.a("default").h(true).a());
            } else {
                ImageLoadFeature.access$1100(ImageLoadFeature.this).a(true);
            }
            this.defaultRetryUrl = ImageStrategyDecider.decideUrl(ImageLoadFeature.access$500(ImageLoadFeature.this), Integer.valueOf(this.width), Integer.valueOf(this.height), ImageLoadFeature.access$1100(ImageLoadFeature.this));
            String str = ImageLoadFeature.this.mLoadingUrl;
            ImageLoadFeature imageLoadFeature = ImageLoadFeature.this;
            String str2 = this.defaultRetryUrl;
            imageLoadFeature.mLoadingUrl = str2;
            return new Pair<>(str, str2);
        }
    }
}
