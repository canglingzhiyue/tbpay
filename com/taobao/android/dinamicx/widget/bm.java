package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import tb.fuw;
import tb.fxq;
import tb.kge;

/* loaded from: classes5.dex */
public class bm extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12082a = false;

    static {
        kge.a(561930645);
    }

    public static /* synthetic */ Object ipc$super(bm bmVar, String str, Object... objArr) {
        if (str.hashCode() == 1568407179) {
            super.measureWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ boolean a(bm bmVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("baf88f3a", new Object[]{bmVar})).booleanValue() : bmVar.f12082a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.measureWithButter(i, i2);
        getNativeView().measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        this.f12082a = true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            getNativeView().layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        final String str;
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
        DXImageWidgetNode.d decidedUrlWithExpectedSize = (!needDecideWithExpectedSize() || this.decidedUrl != null) ? null : decidedUrlWithExpectedSize(false);
        if (decidedUrlWithExpectedSize == null) {
            decidedUrlWithExpectedSize = buildSimpleImageOption();
        }
        decidedUrlWithExpectedSize.o = this.decidedUrl != null;
        setImageScaleType(imageView, this.scaleType);
        if (this.decidedUrl != null) {
            str = this.decidedUrl;
        } else if (needHandleDark(getDXRuntimeContext())) {
            if (!StringUtils.isEmpty(getDarkImageUrl())) {
                str = getDarkImageUrl();
            } else {
                str = this.imageUrl;
            }
        } else {
            str = this.imageUrl;
        }
        try {
            com.taobao.analysis.v3.r rVar = FalcoGlobalTracer.get();
            if (rVar != null && getDXRuntimeContext().p() != null) {
                decidedUrlWithExpectedSize.a(rVar.a(getDXRuntimeContext().p().h()));
            }
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
        if (!StringUtils.isEmpty(str)) {
            decidedUrlWithExpectedSize.m = true;
            int layoutWidth = getLayoutWidth();
            int layoutHeight = getLayoutHeight();
            boolean z3 = layoutWidth == -2 && !hasAspectRatioAttribute();
            boolean z4 = layoutHeight == -2 && !hasAspectRatioAttribute();
            if (z3 || z4) {
                this.f12082a = false;
                decidedUrlWithExpectedSize.j = new DXImageWidgetNode.c() { // from class: com.taobao.android.dinamicx.widget.bm.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.c
                    public boolean a(DXImageWidgetNode.e eVar) {
                        Drawable drawable;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5dcbec25", new Object[]{this, eVar})).booleanValue();
                        }
                        if (bm.a(bm.this) && (bm.this.getMeasuredHeight() == 0 || bm.this.getMeasuredWidth() == 0)) {
                            Drawable drawable2 = eVar.f12000a;
                            if (drawable2 != null) {
                                int intrinsicWidth = drawable2.getIntrinsicWidth();
                                int intrinsicHeight = drawable2.getIntrinsicHeight();
                                if (intrinsicHeight > 0) {
                                    DXImageWidgetNode.imageRatioCache.put(str, Double.valueOf(intrinsicWidth / intrinsicHeight));
                                }
                            }
                            bm.this.getDXRuntimeContext().v().requestLayout();
                            bm.this.getDXRuntimeContext().v().invalidate();
                        } else if (!bm.a(bm.this) && (drawable = eVar.f12000a) != null) {
                            int intrinsicWidth2 = drawable.getIntrinsicWidth();
                            int intrinsicHeight2 = drawable.getIntrinsicHeight();
                            if (intrinsicHeight2 > 0) {
                                DXImageWidgetNode.imageRatioCache.put(str, Double.valueOf(intrinsicWidth2 / intrinsicHeight2));
                            }
                        }
                        DXWidgetNode d = bm.this.getDXRuntimeContext().d();
                        if (d != null && (d instanceof DXImageWidgetNode)) {
                            ((DXImageWidgetNode) d).postImageLoadCompleteEvent();
                        }
                        return false;
                    }
                };
            } else if (bx.a() && getEventHandlersExprNode() != null && getEventHandlersExprNode().indexOfKey(DXImageWidgetNode.DXIMAGEVIEW_ONIMAGELOADCOMPLETE) >= 0) {
                decidedUrlWithExpectedSize.j = new DXImageWidgetNode.c() { // from class: com.taobao.android.dinamicx.widget.bm.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.c
                    public boolean a(DXImageWidgetNode.e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5dcbec25", new Object[]{this, eVar})).booleanValue();
                        }
                        DXWidgetNode d = bm.this.getDXRuntimeContext().d();
                        if (d instanceof DXImageWidgetNode) {
                            ((DXImageWidgetNode) d).postImageLoadCompleteEvent();
                        }
                        return false;
                    }
                };
            } else {
                decidedUrlWithExpectedSize.j = new DXImageWidgetNode.c() { // from class: com.taobao.android.dinamicx.widget.bm.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode.c
                    public boolean a(DXImageWidgetNode.e eVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("5dcbec25", new Object[]{this, eVar})).booleanValue();
                        }
                        DXWidgetNode d = bm.this.getDXRuntimeContext().d();
                        if (d instanceof DXImageWidgetNode) {
                            ((DXImageWidgetNode) d).postImageLoadCompleteEvent();
                        }
                        return false;
                    }
                };
            }
        } else if (this.localImageDrawable != null) {
            setLocalImage(imageView, this.localImageDrawable);
        } else if (!StringUtils.isEmpty(getImageName())) {
            setLocalRes(imageView, getImageName());
        } else {
            imageView.setImageDrawable(null);
            decidedUrlWithExpectedSize.m = true;
        }
        if (decidedUrlWithExpectedSize.m) {
            decidedUrlWithExpectedSize.g = getDrawableId(context, getPlaceHolderName());
            if (decidedUrlWithExpectedSize.g == 0) {
                decidedUrlWithExpectedSize.h = getPlaceHolder();
            }
        }
        if (isNeedSetBackground()) {
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
                fuw.a(DXImageWidgetNode.TAG, "setImagePerformanceOption", th2);
                com.taobao.android.dinamicx.exception.a.b(th2);
            }
        }
        DXTraceUtil.a("uikit setImage ");
        decidedUrlWithExpectedSize.G = isLoadImgWhenNullClearImg_Android();
        decidedUrlWithExpectedSize.F = getFadeIn();
        decidedUrlWithExpectedSize.H = isFuzzyMatchCache();
        decidedUrlWithExpectedSize.I = true;
        a3.a(imageView, str, decidedUrlWithExpectedSize);
        DXTraceUtil.a();
        DXTraceUtil.a("uikit setFilterToImageView ");
        fxq.a(imageView, this.filterType);
        DXTraceUtil.a();
    }

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(168350572);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bm();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bm();
    }
}
