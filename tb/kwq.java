package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.home.component.utils.h;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.homepage.utils.n;
import com.taobao.uikit.feature.features.ImageShapeFeature;

/* loaded from: classes7.dex */
public class kwq extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHIMAGEVIEW_FILTERTYPE = -7195088064603432654L;
    public static final long H_IMAGE_VIEW = 1202423593942681808L;
    public static final long H_IMAGE_VIEW_AUTO_RELEASE = -2989625047271068027L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30354a = !n.b();
    private int b;

    static {
        kge.a(1799888837);
    }

    public static /* synthetic */ Object ipc$super(kwq kwqVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
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
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new HImageView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof HImageView)) {
        } else {
            HImageView hImageView = (HImageView) view;
            onq.a(hImageView, getImageUrl(), "homepage-ads", h.IMAGE_STRATEGY_CONFIG);
            setImageScaleType(hImageView, getScaleType());
            if (!TextUtils.isEmpty(getImageUrl())) {
                hImageView.setImageUrl(getImageUrl());
            } else if (getLocalImageDrawable() != null) {
                setLocalImage(hImageView, getLocalImageDrawable());
            } else if (!TextUtils.isEmpty(getImageName())) {
                setLocalRes(hImageView, getImageName());
            } else {
                hImageView.setImageUrl(null);
            }
            hImageView.setAutoRelease(this.f30354a);
            if (isNeedSetBackground()) {
                int cornerRadius = getCornerRadius();
                a(hImageView, getCornerRadius() > 0 ? new int[]{cornerRadius, cornerRadius, cornerRadius, cornerRadius} : new int[]{getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusRightBottom(), getCornerRadiusLeftBottom()}, getBorderWidth(), getBorderColor());
            }
            try {
                int drawableId = getDrawableId(context, getPlaceHolderName());
                if (drawableId != 0) {
                    hImageView.setPlaceHoldForeground(context.getResources().getDrawable(drawableId));
                } else {
                    hImageView.setPlaceHoldForeground(null);
                }
            } catch (Throwable unused) {
                hImageView.setPlaceHoldForeground(null);
            }
            fxq.a(hImageView, this.b);
        }
    }

    public void a(HImageView hImageView, int[] iArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d32943f4", new Object[]{this, hImageView, iArr, new Integer(i), new Integer(i2)});
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
        if (!(dXWidgetNode instanceof kwq)) {
            return;
        }
        kwq kwqVar = (kwq) dXWidgetNode;
        this.b = kwqVar.b;
        this.f30354a = kwqVar.f30354a;
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
            this.f30354a = z;
        } else if (-7195088064603432654L == j) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(302604700);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kwq();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kwq();
    }
}
