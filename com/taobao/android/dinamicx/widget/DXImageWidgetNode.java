package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.bf;
import com.taobao.android.dinamicx.bs;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.fqi;
import tb.fuw;
import tb.fxe;
import tb.fxq;
import tb.gaz;
import tb.icw;
import tb.kge;
import tb.mto;
import tb.mwj;

/* loaded from: classes.dex */
public class DXImageWidgetNode extends DXWidgetNode implements bs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_BLUR_RADIUS = 0;
    public static final int DEFAULT_BLUR_SCALE_SAMPLE = 2;
    public static final long DXIMAGEVIEW_BLURRADIUS = 3773218142309533223L;
    public static final long DXIMAGEVIEW_BLURSCALE_ANDROID = -5900380239321505554L;
    public static final long DXIMAGEVIEW_ENABLESIZEINLAYOUTPARAMS = 8957926395486892723L;
    public static final long DXIMAGEVIEW_FUZZYMATCHCACHE = 4548676248953404440L;
    public static final long DXIMAGEVIEW_IMAGEBIZID = 2897469727848826591L;
    public static final long DXIMAGEVIEW_IMAGEBIZTYPE = -5713278466016543530L;
    public static final long DXIMAGEVIEW_LOADIMGWHENNULLCLEARIMG_ANDROID = -4509123988113507795L;
    public static final long DXIMAGEVIEW_ONIMAGELOADCOMPLETE = -7905855993384945268L;
    public static final long DXIMAGEVIEW_PROGRESSIVELOADING = -8827546786785133943L;
    public static final long DXIMAGEVIEW_STRICTMATCHCACHE_ANDROID = -776111975077593198L;
    public static final int DX_IMAGEVIEW_FILTERTYPE_GRAY = 1;
    public static final int DX_IMAGEVIEW_FILTERTYPE_NONE = 0;
    public static final String HEIGHT_LIMIT = "heightLimit";
    private static final int IMAGE_VIEW_SCALE_TYPE_CENTER_CROP = 2;
    private static final int IMAGE_VIEW_SCALE_TYPE_FIT_CENTER = 0;
    private static final int IMAGE_VIEW_SCALE_TYPE_FIT_XY = 1;
    public static final int MAX_BLUR_RADIUS = 25;
    public static final int OPT_TYPE_DEFAULT = 0;
    public static final int OPT_TYPE_ORIGINAL = 1;
    public static final int OPT_TYPE_WEBP = 2;
    public static final String TAG = "DXImageWidgetNode";
    public static final String WIDTH_LIMIT = "widthLimit";
    public static LruCache<String, Double> imageRatioCache;
    public static LruCache<String, Integer> resCache;
    public boolean animated;
    public String decidedUrl;
    private au dxImageNodeProperty;
    private boolean hasAspectRatioAttribute;
    private boolean imagePropertyDeepCloneFlag;
    public String imageUrl;
    public Drawable localImageDrawable;
    public boolean mFadeIn;
    public boolean progressiveLoading;
    public int scaleType;
    private double aspectRatio = -1.0d;
    public boolean forceOriginal = false;
    private int downloadType = 0;
    public int filterType = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DOWNLOAD_TYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface FILTER_TYPE {
    }

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    /* loaded from: classes5.dex */
    public interface c {
        boolean a(e eVar);
    }

    /* loaded from: classes5.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f12000a;

        static {
            kge.a(1431076297);
        }
    }

    public static /* synthetic */ Object ipc$super(DXImageWidgetNode dXImageWidgetNode, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 10;
    }

    static {
        kge.a(296177333);
        kge.a(-238877250);
        imageRatioCache = new LruCache<>(1024);
        resCache = new LruCache<>(100);
    }

    /* loaded from: classes.dex */
    public static class b implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(897753228);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXImageWidgetNode();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXImageWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == icw.DXTRADEIMAGEVIEW_DARKMODEIMAGEURL) {
            setDarkImageUrl(str);
        } else if (3520785955321526846L == j) {
            this.decidedUrl = null;
            this.imageUrl = str;
        } else if (8842287408427345805L == j) {
            setImageName(str);
        } else if (icw.DXTRADEIMAGEVIEW_PLACEHOLDERNAME == j) {
            setPlaceHolderName(str);
        } else if (j == -5713278466016543530L) {
            setImageBiztype(str);
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (1015096712691932083L == j) {
            this.scaleType = i;
        } else if (mwj.DXMGIFIMAGEVIEW_ANIMATED == j) {
            if (i == 1) {
                z = true;
            }
            this.animated = z;
        } else if (-2989625047271068027L == j) {
            if (i == 1) {
                z = true;
            }
            setAutoRelease(z);
        } else if (-273786109416499313L == j) {
            if (i == 1) {
                z = true;
            }
            setAsyncImageLoad(z);
        } else if (j == gaz.DXRICHTEXT_FORCEORIGINAL) {
            if (i != 0) {
                z = true;
            }
            this.forceOriginal = z;
        } else if (j == -699001992808524026L) {
            this.downloadType = i;
        } else if (j == 3833148244587386529L) {
            setExpectedImageHeight(i);
        } else if (j == -5982835989037571513L) {
            setExpectedImageWidth(i);
        } else if (j == -6984348415839913320L) {
            if (i != 0) {
                z = true;
            }
            setNeedDarkModeOverlay(z);
        } else if (j == 8957926395486892723L) {
            setEnableSizeInLayoutParams(i);
        } else if (j == -7195088064603432654L) {
            this.filterType = i;
        } else if (j == 2897469727848826591L) {
            setImageBizId(i);
        } else if (j == DXIMAGEVIEW_PROGRESSIVELOADING) {
            if (i == 1) {
                z = true;
            }
            this.progressiveLoading = z;
        } else if (j == DXIMAGEVIEW_BLURRADIUS) {
            setBlurRadius(i);
        } else if (j == DXIMAGEVIEW_BLURSCALE_ANDROID) {
            setBlurScale_android(i);
        } else if (j == DXIMAGEVIEW_LOADIMGWHENNULLCLEARIMG_ANDROID) {
            if (i != 0) {
                z = true;
            }
            setLoadImgWhenNullClearImg_Android(z);
        } else if (j == DXIMAGEVIEW_FUZZYMATCHCACHE) {
            if (i != 0) {
                z = true;
            }
            setFuzzyMatchCache(z);
        } else if (j == DXIMAGEVIEW_STRICTMATCHCACHE_ANDROID) {
            if (i != 0) {
                z = true;
            }
            setStrictMatchCache(z);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    public void setLoadImgWhenNullClearImg_Android(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22db5bcb", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.p = z;
    }

    public boolean isLoadImgWhenNullClearImg_Android() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a7849665", new Object[]{this})).booleanValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.p;
        }
        return true;
    }

    public String getDarkImageUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c71250d9", new Object[]{this});
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.h;
        }
        return null;
    }

    public void setDarkImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd63ebd", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.h = str;
    }

    public void setFuzzyMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99f9ca8", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.q = z;
    }

    public boolean isFuzzyMatchCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a961b5e8", new Object[]{this})).booleanValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.q;
        }
        return false;
    }

    public void setStrictMatchCache(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b303c745", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.r = z;
    }

    public boolean isStrictMatchCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a636363b", new Object[]{this})).booleanValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.r;
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (-2989625047271068027L == j || -273786109416499313L == j) {
            return 1;
        }
        if (-699001992808524026L == j || DXIMAGEVIEW_BLURRADIUS == j) {
            return 0;
        }
        if (DXIMAGEVIEW_BLURSCALE_ANDROID == j) {
            return 2;
        }
        if (8957926395486892723L == j) {
            return fqi.ab() ? 1 : -1;
        } else if (j == DXIMAGEVIEW_LOADIMGWHENNULLCLEARIMG_ANDROID) {
            return 1;
        } else {
            if (-7195088064603432654L != j) {
                return super.getDefaultValueForIntAttr(j);
            }
            return 0;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else if (7594222789952419722L == j) {
            this.aspectRatio = d2;
            this.hasAspectRatioAttribute = true;
        } else if (j != 1360906811535693304L) {
        } else {
            setDarkModeOverlayOpacity(d2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (18039699017736L == j) {
            if (!(obj instanceof Drawable)) {
                return;
            }
            this.localImageDrawable = (Drawable) obj;
        } else if (com.taobao.android.icart.widget.e.DXCARTTEXTINPUT_PLACEHOLDER != j || !(obj instanceof Drawable)) {
        } else {
            setPlaceHolder((Drawable) obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        int i3;
        int max;
        int i4;
        IpChange ipChange = $ipChange;
        boolean z = true;
        int i5 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int a2 = DXWidgetNode.DXMeasureSpec.a(i);
        int a3 = DXWidgetNode.DXMeasureSpec.a(i2);
        boolean z2 = a2 != 1073741824;
        if (a3 == 1073741824) {
            z = false;
        }
        if (z2 || z) {
            double d2 = this.aspectRatio;
            if (d2 <= mto.a.GEO_NOT_SUPPORT) {
                if (!TextUtils.isEmpty(this.imageUrl)) {
                    Double d3 = imageRatioCache.get(this.imageUrl);
                    if (d3 != null) {
                        d2 = d3.doubleValue();
                    }
                } else {
                    Drawable drawable = this.localImageDrawable;
                    if (drawable != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = this.localImageDrawable.getIntrinsicHeight();
                        if (intrinsicHeight > 0) {
                            d2 = intrinsicWidth / intrinsicHeight;
                        }
                    }
                }
            }
            if (!z2 || z) {
                if (!z2 && z) {
                    int size = View.MeasureSpec.getSize(i);
                    if (d2 > mto.a.GEO_NOT_SUPPORT) {
                        i5 = size;
                        i3 = (int) (size / d2);
                    } else {
                        i5 = size;
                    }
                }
                i3 = 0;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
                if (d2 > mto.a.GEO_NOT_SUPPORT) {
                    i5 = (int) (i3 * d2);
                }
            }
            int max2 = Math.max(i5, getSuggestedMinimumWidth());
            max = Math.max(i3, getSuggestedMinimumHeight());
            i4 = max2;
        } else {
            i4 = DXWidgetNode.DXMeasureSpec.b(i);
            max = DXWidgetNode.DXMeasureSpec.b(i2);
        }
        setMeasuredDimension(resolveSize(i4, i), resolveSize(max, i2));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        an a2 = com.taobao.android.dinamicx.u.a(getDXRuntimeContext());
        ImageView imageView = a2 == null ? new ImageView(context) : a2.a(context);
        imageView.setTag(R.id.dx_imageview_createview_timestamp_key, Long.valueOf(System.currentTimeMillis()));
        return imageView;
    }

    public void setImageScaleType(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920072b7", new Object[]{this, imageView, new Integer(i)});
        } else if (i == 0) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i == 1) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i == 2) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof DXImageWidgetNode)) {
            return;
        }
        DXImageWidgetNode dXImageWidgetNode = (DXImageWidgetNode) dXWidgetNode;
        this.dxImageNodeProperty = dXImageWidgetNode.dxImageNodeProperty;
        this.aspectRatio = dXImageWidgetNode.aspectRatio;
        this.imageUrl = dXImageWidgetNode.imageUrl;
        this.scaleType = dXImageWidgetNode.scaleType;
        this.localImageDrawable = dXImageWidgetNode.localImageDrawable;
        this.animated = dXImageWidgetNode.animated;
        this.forceOriginal = dXImageWidgetNode.forceOriginal;
        this.downloadType = dXImageWidgetNode.downloadType;
        this.filterType = dXImageWidgetNode.filterType;
        this.progressiveLoading = dXImageWidgetNode.progressiveLoading;
        this.mFadeIn = dXImageWidgetNode.mFadeIn;
    }

    @Override // com.taobao.android.dinamicx.bs
    public void onPrefetchSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfda7834", new Object[]{this});
        } else if (!fqi.l()) {
        } else {
            decidedUrlWithExpectedSize(true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        boolean z;
        int[] iArr;
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        DXTraceUtil.a(" build option ");
        ImageView imageView = (ImageView) view;
        d decidedUrlWithExpectedSize = (!needDecideWithExpectedSize() || this.decidedUrl != null) ? null : decidedUrlWithExpectedSize(false);
        if (decidedUrlWithExpectedSize == null) {
            decidedUrlWithExpectedSize = buildSimpleImageOption();
        }
        decidedUrlWithExpectedSize.o = this.decidedUrl != null;
        setImageScaleType(imageView, this.scaleType);
        final String str = this.decidedUrl;
        if (str == null) {
            if (needHandleDark(getDXRuntimeContext())) {
                if (!TextUtils.isEmpty(getDarkImageUrl())) {
                    str = getDarkImageUrl();
                } else {
                    str = this.imageUrl;
                }
            } else {
                str = this.imageUrl;
            }
        }
        try {
            com.taobao.analysis.v3.r rVar = FalcoGlobalTracer.get();
            if (rVar != null && getDXRuntimeContext().p() != null) {
                decidedUrlWithExpectedSize.a(rVar.a(getDXRuntimeContext().p().h()));
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
        if (!TextUtils.isEmpty(str)) {
            decidedUrlWithExpectedSize.m = true;
            if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
                decidedUrlWithExpectedSize.j = new c() { // from class: com.taobao.android.dinamicx.widget.DXImageWidgetNode.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.c
                    public boolean a(e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5dcbec25", new Object[]{this, eVar})).booleanValue();
                        }
                        Drawable drawable = eVar.f12000a;
                        if (drawable != null) {
                            int intrinsicWidth = drawable.getIntrinsicWidth();
                            int intrinsicHeight = drawable.getIntrinsicHeight();
                            if (intrinsicHeight > 0) {
                                DXImageWidgetNode.imageRatioCache.put(str, Double.valueOf(intrinsicWidth / intrinsicHeight));
                            }
                        }
                        DXWidgetNode d2 = DXImageWidgetNode.this.getDXRuntimeContext().d();
                        if (d2 != null) {
                            if (d2 instanceof DXImageWidgetNode) {
                                ((DXImageWidgetNode) d2).postImageLoadCompleteEvent();
                            }
                            d2.setNeedLayout();
                        }
                        return false;
                    }
                };
            } else if (bx.a() && getEventHandlersExprNode() != null && getEventHandlersExprNode().indexOfKey(DXIMAGEVIEW_ONIMAGELOADCOMPLETE) >= 0) {
                decidedUrlWithExpectedSize.j = new c() { // from class: com.taobao.android.dinamicx.widget.DXImageWidgetNode.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.c
                    public boolean a(e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5dcbec25", new Object[]{this, eVar})).booleanValue();
                        }
                        DXWidgetNode d2 = DXImageWidgetNode.this.getDXRuntimeContext().d();
                        if (d2 instanceof DXImageWidgetNode) {
                            ((DXImageWidgetNode) d2).postImageLoadCompleteEvent();
                        }
                        return false;
                    }
                };
            } else {
                decidedUrlWithExpectedSize.j = new c() { // from class: com.taobao.android.dinamicx.widget.DXImageWidgetNode.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.c
                    public boolean a(e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5dcbec25", new Object[]{this, eVar})).booleanValue();
                        }
                        DXWidgetNode d2 = DXImageWidgetNode.this.getDXRuntimeContext().d();
                        if (d2 instanceof DXImageWidgetNode) {
                            ((DXImageWidgetNode) d2).postImageLoadCompleteEvent();
                        }
                        return false;
                    }
                };
            }
        } else {
            Drawable drawable = this.localImageDrawable;
            if (drawable != null) {
                setLocalImage(imageView, drawable);
            } else if (!TextUtils.isEmpty(getImageName())) {
                setLocalRes(imageView, getImageName());
            } else {
                imageView.setImageDrawable(null);
                decidedUrlWithExpectedSize.m = true;
            }
        }
        if (decidedUrlWithExpectedSize.m) {
            decidedUrlWithExpectedSize.g = getDrawableId(context, getPlaceHolderName());
            if (decidedUrlWithExpectedSize.g == 0) {
                decidedUrlWithExpectedSize.h = getPlaceHolder();
            }
        }
        if (this.needSetBackground) {
            setBorderColor(tryFetchDarkModeColor("borderColor", 2, getBorderColor()));
            if (getBorderColor() != 0) {
                decidedUrlWithExpectedSize.b = getBorderColor();
                decidedUrlWithExpectedSize.v = true;
            }
            if (getBorderWidth() > 0) {
                decidedUrlWithExpectedSize.c = getBorderWidth();
                decidedUrlWithExpectedSize.w = true;
            }
            int cornerRadius = getCornerRadius();
            int cornerRadiusLeftTop = getCornerRadiusLeftTop();
            int cornerRadiusRightTop = getCornerRadiusRightTop();
            int cornerRadiusLeftBottom = getCornerRadiusLeftBottom();
            int cornerRadiusRightBottom = getCornerRadiusRightBottom();
            if (cornerRadius > 0) {
                iArr = new int[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius};
            } else {
                iArr = (cornerRadiusLeftTop > 0 || cornerRadiusRightTop > 0 || cornerRadiusLeftBottom > 0 || cornerRadiusRightBottom > 0 || decidedUrlWithExpectedSize.v || decidedUrlWithExpectedSize.w) ? new int[]{cornerRadiusLeftTop, cornerRadiusRightTop, cornerRadiusRightBottom, cornerRadiusLeftBottom} : null;
            }
            if (iArr != null) {
                decidedUrlWithExpectedSize.f11999a = iArr;
                decidedUrlWithExpectedSize.x = true;
            }
        }
        decidedUrlWithExpectedSize.l = this.animated;
        decidedUrlWithExpectedSize.a(this.progressiveLoading);
        if (getDXRuntimeContext().C() != null) {
            DXEngineConfig a2 = getDXRuntimeContext().C().a();
            if (a2 != null) {
                z = a2.o();
                decidedUrlWithExpectedSize.a(a2.t());
                decidedUrlWithExpectedSize.a(this.progressiveLoading && !a2.A());
            } else {
                z = true;
            }
            decidedUrlWithExpectedSize.d = isAutoRelease() && z;
        } else {
            decidedUrlWithExpectedSize.d = isAutoRelease();
            decidedUrlWithExpectedSize.a((DXEngineConfig.ImageQuality) null);
        }
        decidedUrlWithExpectedSize.u = this.forceOriginal;
        decidedUrlWithExpectedSize.A = getDarkModeOverlayOpacity();
        decidedUrlWithExpectedSize.z = isNeedDarkModeOverlay();
        decidedUrlWithExpectedSize.E = isLoadImgWhenNullClearImg_Android();
        if (bx.a()) {
            decidedUrlWithExpectedSize.p = true;
        } else if (getEnableSizeInLayoutParams() >= 0) {
            if (getEnableSizeInLayoutParams() == 1) {
                z2 = true;
            }
            decidedUrlWithExpectedSize.p = z2;
        } else if (getDXRuntimeContext().C() != null && getDXRuntimeContext().C().a() != null) {
            decidedUrlWithExpectedSize.p = getDXRuntimeContext().C().a().v();
        }
        DXTraceUtil.a();
        an a3 = com.taobao.android.dinamicx.u.a(getDXRuntimeContext());
        if (a3 == null) {
            return;
        }
        if (!bx.a()) {
            try {
                setImagePerformanceOption(imageView, decidedUrlWithExpectedSize);
            } catch (Throwable th2) {
                fuw.a(TAG, "setImagePerformanceOption", th2);
                com.taobao.android.dinamicx.exception.a.b(th2);
            }
        }
        DXTraceUtil.a("uikit setImage ");
        decidedUrlWithExpectedSize.G = isLoadImgWhenNullClearImg_Android();
        decidedUrlWithExpectedSize.F = getFadeIn();
        decidedUrlWithExpectedSize.H = isFuzzyMatchCache();
        decidedUrlWithExpectedSize.K = isStrictMatchCache();
        if (getDXRuntimeContext().D() != null && getDXRuntimeContext().D().b() != null) {
            d.a(decidedUrlWithExpectedSize, getDXRuntimeContext().D().b().F());
        }
        if (d.a(decidedUrlWithExpectedSize) <= 0 && getDXRuntimeContext() != null && getDXRuntimeContext().C() != null && !getDXRuntimeContext().C().s()) {
            if (bx.j()) {
                d.a(decidedUrlWithExpectedSize, 1);
            } else if (bx.b()) {
                d.a(decidedUrlWithExpectedSize, 2);
            }
        }
        a3.a(imageView, str, decidedUrlWithExpectedSize);
        DXTraceUtil.a();
        DXTraceUtil.a("uikit setFilterToImageView ");
        fxq.a(imageView, this.filterType);
        DXTraceUtil.a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean extraHandleDark() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("abe5f779", new Object[]{this})).booleanValue() : !TextUtils.isEmpty(getDarkImageUrl()) || isNeedDarkModeOverlay();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
        } else if (!this.needSetBackground) {
        } else {
            view.setBackgroundColor(tryFetchDarkModeColor("backGroundColor", 1, getBackGroundColor()));
        }
    }

    public void postImageLoadCompleteEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7028c6c7", new Object[]{this});
        } else {
            postEvent(new ImageLoadCompleteEvent(this.imageUrl, getDarkImageUrl()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c A[Catch: Throwable -> 0x00e4, TryCatch #0 {Throwable -> 0x00e4, blocks: (B:7:0x0024, B:9:0x002a, B:11:0x002e, B:13:0x0032, B:19:0x003c, B:21:0x0046, B:23:0x0050, B:26:0x005a, B:28:0x0060, B:30:0x006a, B:32:0x0073, B:34:0x0079, B:36:0x0082, B:38:0x008e, B:42:0x00b8, B:41:0x0096, B:35:0x007e, B:31:0x006f, B:24:0x0055, B:25:0x0058, B:43:0x00e1), top: B:51:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1 A[Catch: Throwable -> 0x00e4, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00e4, blocks: (B:7:0x0024, B:9:0x002a, B:11:0x002e, B:13:0x0032, B:19:0x003c, B:21:0x0046, B:23:0x0050, B:26:0x005a, B:28:0x0060, B:30:0x006a, B:32:0x0073, B:34:0x0079, B:36:0x0082, B:38:0x008e, B:42:0x00b8, B:41:0x0096, B:35:0x007e, B:31:0x006f, B:24:0x0055, B:25:0x0058, B:43:0x00e1), top: B:51:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.widget.DXImageWidgetNode.d decidedUrlWithExpectedSize(boolean r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXImageWidgetNode.decidedUrlWithExpectedSize(boolean):com.taobao.android.dinamicx.widget.DXImageWidgetNode$d");
    }

    public boolean needDecideWithExpectedSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bc597888", new Object[]{this})).booleanValue() : getExpectedImageWidth() > 0 && getExpectedImageHeight() > 0;
    }

    public d buildSimpleImageOption() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ecc7f9b9", new Object[]{this});
        }
        d dVar = new d();
        DXEngineConfig B = getDXRuntimeContext().B();
        if (TextUtils.isEmpty(getImageBiztype()) && B != null) {
            dVar.e = B.h();
            dVar.a(B.t());
        } else {
            dVar.a((DXEngineConfig.ImageQuality) null);
            dVar.e = getImageBiztype();
        }
        if (getImageBizId() == 0 && B != null) {
            dVar.f = getDXRuntimeContext().B().i();
        } else {
            dVar.f = getImageBizId();
        }
        if (B != null && B.E() != null) {
            dVar.J = B.E();
        }
        if (!this.animated && getBlurRadius() > 0) {
            dVar.r = Math.min(getBlurRadius(), 25);
            dVar.s = Math.max(1, getBlurScale_android());
        }
        d.b(dVar, this.downloadType);
        if (this.layoutWidth == -2 && this.layoutHeight != -2) {
            dVar.i = "heightLimit";
            d.a(dVar, true);
        } else if (this.layoutWidth != -2 && this.layoutHeight == -2) {
            dVar.i = "widthLimit";
            d.a(dVar, true);
        }
        return dVar;
    }

    public void setLocalImage(ImageView imageView, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7447257", new Object[]{this, imageView, drawable});
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setLocalRes(ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe9e6ac2", new Object[]{this, imageView, str});
        } else if (str == null) {
            imageView.setImageDrawable(null);
            imageView.setTag(com.taobao.android.dinamic.j.TAG_IMAGE_NAME, null);
        } else if (str.equals((String) imageView.getTag(com.taobao.android.dinamic.j.TAG_IMAGE_NAME))) {
        } else {
            f fVar = new f(imageView, str);
            if (isAsyncImageLoad()) {
                imageView.setTag(com.taobao.android.dinamic.j.TAG_CURRENT_IMAGE_NAME, str);
                fxe.a(fVar, new Void[0]);
                return;
            }
            imageView.setImageDrawable(fVar.a());
            imageView.setTag(com.taobao.android.dinamic.j.TAG_IMAGE_NAME, str);
        }
    }

    /* loaded from: classes5.dex */
    public static class f extends AsyncTask<Void, Void, Drawable> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f12001a;
        private WeakReference<ImageView> b;
        private Context c;

        static {
            kge.a(871459192);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, android.graphics.drawable.Drawable] */
        @Override // android.os.AsyncTask
        public /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
        }

        @Override // android.os.AsyncTask
        public /* synthetic */ void onPostExecute(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b105c779", new Object[]{this, drawable});
            } else {
                a(drawable);
            }
        }

        public f(ImageView imageView, String str) {
            this.b = new WeakReference<>(imageView);
            this.f12001a = str;
            this.c = imageView.getContext().getApplicationContext();
        }

        public Drawable a(Void... voidArr) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("3d6535e6", new Object[]{this, voidArr}) : a();
        }

        public Drawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("1e792452", new Object[]{this});
            }
            int drawableId = DXImageWidgetNode.getDrawableId(this.c, this.f12001a);
            Drawable drawable = null;
            if (drawableId == 0) {
                return null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = this.c.getDrawable(drawableId);
                } else {
                    drawable = this.c.getResources().getDrawable(drawableId);
                }
            } catch (Exception e) {
                Log.e(DXImageWidgetNode.TAG, "Get layout parser exception", e);
            }
            return drawable;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0161 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(android.graphics.drawable.Drawable r11) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXImageWidgetNode.f.a(android.graphics.drawable.Drawable):void");
        }
    }

    public static int getDrawableId(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("409026f", new Object[]{context, str})).intValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return 0;
        }
        Integer num = resCache.get(str);
        if (num == null) {
            try {
                num = Integer.valueOf(context.getResources().getIdentifier(str, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, context.getPackageName()));
                resCache.put(str, num);
            } catch (Exception unused) {
                return 0;
            }
        }
        return num.intValue();
    }

    /* loaded from: classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public double A;
        private int B;
        private Map<String, String> C;
        private Map<String, String> D;
        public boolean F;
        public String J;
        private int L;

        /* renamed from: a  reason: collision with root package name */
        public int[] f11999a;
        public int b;
        public int c;
        public String e;
        public int f;
        public int g;
        public Drawable h;
        public String i;
        public c j;
        public a k;
        public boolean l;
        public boolean m;
        public int n;
        public boolean o;
        public boolean p;
        public boolean q;
        public int r;
        public int s;
        public DXEngineConfig.ImageQuality t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        private boolean y;
        public boolean z;
        public boolean d = true;
        public boolean G = true;
        public boolean E = true;
        public boolean H = false;
        public boolean K = false;
        public boolean I = false;

        static {
            kge.a(1355365921);
        }

        public static /* synthetic */ int a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dcb77b5", new Object[]{dVar})).intValue() : dVar.L;
        }

        public static /* synthetic */ int a(d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5ba3f374", new Object[]{dVar, new Integer(i)})).intValue();
            }
            dVar.L = i;
            return i;
        }

        public static /* synthetic */ boolean a(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5ba43356", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.y = z;
            return z;
        }

        public static /* synthetic */ int b(d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("efe26313", new Object[]{dVar, new Integer(i)})).intValue();
            }
            dVar.B = i;
            return i;
        }

        public int w() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue() : this.L;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.B;
        }

        public boolean b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.m;
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.x;
        }

        public boolean d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.y;
        }

        public boolean e() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.v;
        }

        public boolean f() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.w;
        }

        public boolean g() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.u;
        }

        public boolean h() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.z;
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue() : this.l;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue() : this.d;
        }

        public double k() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95760", new Object[]{this})).doubleValue() : this.A;
        }

        public String u() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.J;
        }

        public a l() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("4ce70b40", new Object[]{this}) : this.k;
        }

        public void a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5dca1aa5", new Object[]{this, aVar});
            } else {
                this.k = aVar;
            }
        }

        public Map<String, String> m() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("44113da9", new Object[]{this}) : this.C;
        }

        public Map<String, String> n() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("11bb9f6a", new Object[]{this}) : this.D;
        }

        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                this.D = map;
            }
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            if (this.C == null) {
                this.C = new ConcurrentHashMap();
            }
            this.C.put(str, str2);
        }

        public boolean o() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.q;
        }

        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                this.q = z;
            }
        }

        public boolean p() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.p;
        }

        public int q() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("64de46b", new Object[]{this})).intValue() : this.r;
        }

        public int r() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.s;
        }

        public DXEngineConfig.ImageQuality s() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXEngineConfig.ImageQuality) ipChange.ipc$dispatch("7ebfbd6e", new Object[]{this}) : this.t;
        }

        public void a(DXEngineConfig.ImageQuality imageQuality) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("457bea5c", new Object[]{this, imageQuality});
            } else {
                this.t = imageQuality;
            }
        }

        public boolean v() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue() : this.F;
        }

        public boolean t() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.H;
        }
    }

    /* loaded from: classes5.dex */
    public static class ImageLoadCompleteEvent extends DXEvent {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String darkImageUrl;
        private final String imageUrl;

        static {
            kge.a(594576495);
        }

        public ImageLoadCompleteEvent(String str, String str2) {
            super(DXImageWidgetNode.DXIMAGEVIEW_ONIMAGELOADCOMPLETE);
            this.imageUrl = str;
            this.darkImageUrl = str2;
            HashMap hashMap = new HashMap();
            hashMap.put("imageUrl", str == null ? com.taobao.android.dinamicx.expression.expr_v2.f.f() : com.taobao.android.dinamicx.expression.expr_v2.f.a(str));
            hashMap.put(com.taobao.themis.kernel.entity.a.KEY_RIGHT_ITEM_DARK_IMAGE_URL, str2 == null ? com.taobao.android.dinamicx.expression.expr_v2.f.f() : com.taobao.android.dinamicx.expression.expr_v2.f.a(str2));
            setArgs(hashMap);
        }

        public String getImageUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this}) : this.imageUrl;
        }

        public String getDarkImageUrl() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c71250d9", new Object[]{this}) : this.darkImageUrl;
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.decidedUrl = null;
        }
        this.imageUrl = str;
    }

    public String getImageUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this}) : this.imageUrl;
    }

    public void setScaleType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i)});
        } else {
            this.scaleType = i;
        }
    }

    public int getScaleType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b00a2668", new Object[]{this})).intValue() : this.scaleType;
    }

    public void setLocalImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827dd9b", new Object[]{this, drawable});
        } else {
            this.localImageDrawable = drawable;
        }
    }

    public Drawable getLocalImageDrawable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("851b3bef", new Object[]{this}) : this.localImageDrawable;
    }

    public void setAspectRatio(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8ca66", new Object[]{this, new Double(d2)});
        } else {
            this.aspectRatio = d2;
        }
    }

    public double getAspectRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("9b371752", new Object[]{this})).doubleValue() : this.aspectRatio;
    }

    public void setImageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("491b93d5", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.k = str;
    }

    public String getImageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cc9bcd29", new Object[]{this});
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.k;
        }
        return null;
    }

    public void setDxImageNodePropertyBeforeCheck() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f68034", new Object[]{this});
            return;
        }
        if (this.dxImageNodeProperty == null) {
            this.dxImageNodeProperty = new au();
            this.imagePropertyDeepCloneFlag = true;
        }
        if (this.imagePropertyDeepCloneFlag) {
            return;
        }
        this.dxImageNodeProperty = this.dxImageNodeProperty.a();
        this.imagePropertyDeepCloneFlag = true;
    }

    public boolean isAnimated() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("110b16f8", new Object[]{this})).booleanValue() : this.animated;
    }

    public void setAnimated(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4f4628", new Object[]{this, new Boolean(z)});
        } else {
            this.animated = z;
        }
    }

    public boolean isAsyncImageLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c40929a", new Object[]{this})).booleanValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.n;
        }
        return true;
    }

    public void setAsyncImageLoad(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f2348c6", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.n = z;
    }

    public boolean isAutoRelease() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4eba7959", new Object[]{this})).booleanValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.o;
        }
        return true;
    }

    public void setAutoRelease(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81a357", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.o = z;
    }

    public void setPlaceHolderName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca31f8d", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.l = str;
    }

    public void setPlaceHolder(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9876fc", new Object[]{this, drawable});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.m = drawable;
    }

    public String getPlaceHolderName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b2a92371", new Object[]{this});
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.l;
        }
        return null;
    }

    public Drawable getPlaceHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("56dea8d6", new Object[]{this});
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.m;
        }
        return null;
    }

    public void setImagePerformanceOption(ImageView imageView, d dVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ad5f487", new Object[]{this, imageView, dVar});
        } else if (dVar == null || imageView == null) {
        } else {
            boolean z2 = imageView.getTag(R.id.dx_imageview_renderview_timestamp_key) != null;
            long currentTimeMillis = System.currentTimeMillis();
            imageView.setTag(R.id.dx_imageview_renderview_timestamp_key, Long.valueOf(currentTimeMillis));
            dVar.a("DXImageViewOnCreateTimestampKey", String.valueOf(imageView.getTag(R.id.dx_imageview_createview_timestamp_key)));
            dVar.a("DXImageViewOnRenderTimestampKey", String.valueOf(currentTimeMillis));
            dVar.a("DXImageViewIsReuseKey", String.valueOf(z2));
            dVar.a("DXImageViewRenderTypeKey", String.valueOf(getDXRuntimeContext().x()));
            if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
                z = false;
            }
            dVar.a("DXImageViewIsMainKey", String.valueOf(z));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == DXImageWidgetNode.class;
    }

    public String getImageBiztype() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24afc091", new Object[]{this});
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.f12066a;
        }
        return null;
    }

    public void setImageBiztype(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e6c605", new Object[]{this, str});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.f12066a = str;
    }

    public int getExpectedImageHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65f28bce", new Object[]{this})).intValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.d;
        }
        return 0;
    }

    public void setExpectedImageHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c2b94", new Object[]{this, new Integer(i)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.d = i;
    }

    public int getExpectedImageWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("269293f3", new Object[]{this})).intValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.e;
        }
        return 0;
    }

    public void setExpectedImageWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1f04477", new Object[]{this, new Integer(i)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.e = i;
    }

    public boolean isNeedDarkModeOverlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539edfe2", new Object[]{this})).booleanValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.f;
        }
        return false;
    }

    public void setNeedDarkModeOverlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7355ee", new Object[]{this, new Boolean(z)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.f = z;
    }

    public int getEnableSizeInLayoutParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("97f47ec9", new Object[]{this})).intValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.c;
        }
        return fqi.ab() ? 1 : -1;
    }

    public void setEnableSizeInLayoutParams(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8decd61", new Object[]{this, new Integer(i)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.c = i;
    }

    public int getImageBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e08734e3", new Object[]{this})).intValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.b;
        }
        return 0;
    }

    public void setImageBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67367587", new Object[]{this, new Integer(i)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.b = i;
    }

    public int getBlurRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58b71cc9", new Object[]{this})).intValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.i;
        }
        return 0;
    }

    public void setBlurRadius(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5038a61", new Object[]{this, new Integer(i)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.i = i;
    }

    public int getBlurScale_android() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f29097", new Object[]{this})).intValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.j;
        }
        return 2;
    }

    public void setBlurScale_android(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da392eb", new Object[]{this, new Integer(i)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.j = i;
    }

    public double getDarkModeOverlayOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c75f0e9f", new Object[]{this})).doubleValue();
        }
        au auVar = this.dxImageNodeProperty;
        if (auVar != null) {
            return auVar.g;
        }
        return 0.5d;
    }

    public void setDarkModeOverlayOpacity(double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b3321", new Object[]{this, new Double(d2)});
            return;
        }
        setDxImageNodePropertyBeforeCheck();
        this.dxImageNodeProperty.g = d2;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRenderOptions(DXRenderOptions dXRenderOptions) {
        bf.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca762e", new Object[]{this, dXRenderOptions});
        } else if (dXRenderOptions == null || dXRenderOptions.o() == null || (a2 = dXRenderOptions.o().a()) == null) {
        } else {
            setFadeIn(a2.b());
            setLoadImgWhenNullClearImg_Android(a2.a());
            setAutoRelease(a2.c());
        }
    }

    public boolean hasAspectRatioAttribute() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a6d27e0e", new Object[]{this})).booleanValue() : this.hasAspectRatioAttribute;
    }

    public void setFadeIn(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8994a", new Object[]{this, new Boolean(z)});
        } else {
            this.mFadeIn = z;
        }
    }

    public boolean getFadeIn() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66f224c2", new Object[]{this})).booleanValue() : this.mFadeIn;
    }
}
