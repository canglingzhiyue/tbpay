package tb;

import android.app.Application;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.bf;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;
import com.taobao.uikit.feature.features.RoundRectShapeFeature;
import java.util.Map;

/* loaded from: classes.dex */
public class lgb extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHIMAGEVIEW_FILTERTYPE = -7195088064603432654L;
    public static final long H_IMAGE_VIEW = 1202423593942681808L;
    public static final long H_IMAGE_VIEW_AUTO_RELEASE = -2989625047271068027L;
    private int b;
    private Boolean d;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30553a = false;
    private final boolean c = HImageView.enableImageViewPreLoadImage();

    static {
        kge.a(2049647632);
    }

    public static /* synthetic */ Object ipc$super(lgb lgbVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 214595118) {
            super.bindRenderOptions((DXRenderOptions) objArr[0]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HImageView hImageView = new HImageView(context);
        hImageView.setFailListener(a());
        return hImageView;
    }

    private HImageView.a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HImageView.a) ipChange.ipc$dispatch("fdc33aec", new Object[]{this}) : new HImageView.a() { // from class: tb.lgb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView.a
            public void a(Map<String, String> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                DXRuntimeContext dXRuntimeContext = lgb.this.getDXRuntimeContext();
                if (dXRuntimeContext != null) {
                    DXTemplateItem c = dXRuntimeContext.c();
                    if (c != null && c.f11925a != null) {
                        map.put("template", c.f11925a);
                    }
                    ljs a2 = lfq.a(dXRuntimeContext);
                    if (a2 != null) {
                        map.put("pageName", a2.a().c());
                    }
                }
                String str = map.get("errorCode");
                ldh.a("Page_Home", "HomeItemLoad", map.toString(), TextUtils.isEmpty(str) ? "61000" : str, "首页图片加载失败");
                ldk.a("HomeItemLoad", "", "1.0", "Page_Home_Pic", null, map, str, "首页图片加载失败");
            }
        };
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof HImageView)) {
        } else {
            HImageView hImageView = (HImageView) view;
            setImageScaleType(hImageView, getScaleType());
            if (!this.c) {
                a(hImageView);
            }
            hImageView.setAutoRelease(this.f30553a);
            if (isNeedSetBackground()) {
                int cornerRadius = getCornerRadius();
                int[] iArr = getCornerRadius() > 0 ? new int[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius} : new int[]{getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusRightBottom(), getCornerRadiusLeftBottom()};
                if (this.c || b()) {
                    a(hImageView, iArr);
                } else {
                    a(hImageView, iArr, getBorderWidth(), getBorderColor());
                }
            }
            try {
                int drawableId = getDrawableId(context, getPlaceHolderName());
                if (drawableId != 0) {
                    hImageView.setPlaceHoldForeground(ContextCompat.getDrawable(context, drawableId));
                } else {
                    hImageView.setPlaceHoldForeground(null);
                }
            } catch (Throwable unused) {
                hImageView.setPlaceHoldForeground(null);
            }
            if (this.c) {
                a(hImageView);
            }
            fxq.a(hImageView, this.b);
        }
    }

    public void a(HImageView hImageView, int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21431e77", new Object[]{this, hImageView, iArr, new Integer(i), new Integer(i2)});
        } else if (iArr[0] > 0 || iArr[1] > 0 || iArr[2] > 0 || iArr[3] > 0 || i > 0) {
            ImageShapeFeature imageShapeFeature = (ImageShapeFeature) hImageView.findFeature(ImageShapeFeature.class);
            if (imageShapeFeature == null) {
                imageShapeFeature = new ImageShapeFeature();
                hImageView.addFeature(imageShapeFeature);
            }
            imageShapeFeature.setShape(1);
            imageShapeFeature.setCornerRadius(iArr[0], iArr[1], iArr[3], iArr[2]);
            if (i <= 0) {
                return;
            }
            imageShapeFeature.setStrokeEnable(true);
            imageShapeFeature.setStrokeWidth(i);
            imageShapeFeature.setStrokeColor(i2);
        } else if (((ImageShapeFeature) hImageView.findFeature(ImageShapeFeature.class)) == null) {
        } else {
            hImageView.removeFeature(ImageShapeFeature.class);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof lgb)) {
            return;
        }
        lgb lgbVar = (lgb) dXWidgetNode;
        this.b = lgbVar.b;
        this.f30553a = lgbVar.f30553a;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (-2989625047271068027L == j) {
            if (i == 1) {
                z = true;
            }
            this.f30553a = z;
        } else if (-7195088064603432654L == j) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRenderOptions(DXRenderOptions dXRenderOptions) {
        bf.b a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cca762e", new Object[]{this, dXRenderOptions});
            return;
        }
        super.bindRenderOptions(dXRenderOptions);
        if (dXRenderOptions == null || dXRenderOptions.o() == null || (a2 = dXRenderOptions.o().a()) == null) {
            return;
        }
        this.f30553a = a2.c();
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(263514855);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lgb();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lgb();
    }

    private void a(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39926709", new Object[]{this, hImageView});
        } else if (!TextUtils.isEmpty(getImageUrl())) {
            onq.a(hImageView, getImageUrl(), null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
            hImageView.setImageUrl(getImageUrl());
        } else if (getLocalImageDrawable() != null) {
            setLocalImage(hImageView, getLocalImageDrawable());
        } else if (!TextUtils.isEmpty(getImageName())) {
            setLocalRes(hImageView, getImageName());
        } else {
            hImageView.setImageUrl(null);
        }
    }

    private void a(HImageView hImageView, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eab57d7", new Object[]{this, hImageView, iArr});
            return;
        }
        RoundRectShapeFeature roundRectShapeFeature = (RoundRectShapeFeature) hImageView.findFeature(RoundRectShapeFeature.class);
        if (iArr[0] <= 0 && iArr[1] <= 0 && iArr[2] <= 0 && iArr[3] <= 0) {
            if (roundRectShapeFeature == null) {
                return;
            }
            hImageView.removeFeature(RoundRectShapeFeature.class);
            return;
        }
        if (roundRectShapeFeature == null) {
            roundRectShapeFeature = new RoundRectShapeFeature();
            hImageView.addFeature(roundRectShapeFeature);
        }
        roundRectShapeFeature.setCornerRadius(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            Application a2 = lcz.a();
            if ((a2 != null && (l.d(a2) || l.b(a2))) && ldj.a("enableNewRoundShapeFeatureForHud", true)) {
                z = true;
            }
            this.d = Boolean.valueOf(z);
        }
        return this.d.booleanValue();
    }
}
