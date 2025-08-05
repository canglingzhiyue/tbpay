package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.ImageShapeFeature;

/* loaded from: classes7.dex */
public class mwj extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMGIFIMAGEVIEW_ANIMATED = 1166125168016292427L;
    public static final long DX_MGIFIMAGEVIEW = -7545546413749780562L;
    public static final long DX_MGIFIMAGEVIEW_MIMAGEURL = 1686114214726413708L;
    public static final long DX_MGIFIMAGEVIEW_MSCALETYPE = -1599028387311197695L;
    private String b;

    /* renamed from: a  reason: collision with root package name */
    private int f31301a = 1;
    private boolean c = false;

    static {
        kge.a(963287932);
    }

    public static /* synthetic */ Object ipc$super(mwj mwjVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2087466579);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new mwj();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new mwj();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DX_MGIFIMAGEVIEW_MIMAGEURL) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXMGIFIMAGEVIEW_ANIMATED) {
            if (i == 0) {
                z = false;
            }
            this.c = z;
        } else if (j == DX_MGIFIMAGEVIEW_MSCALETYPE) {
            this.f31301a = i;
        } else {
            super.onSetIntAttribute(j, i);
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
        if (!(dXWidgetNode instanceof mwj)) {
            return;
        }
        mwj mwjVar = (mwj) dXWidgetNode;
        this.b = mwjVar.b;
        this.f31301a = mwjVar.f31301a;
        this.c = mwjVar.c;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        b.a().a("XGIFImageViewWidgetNode.onCreateView");
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setAutoRelease(false);
        return tUrlImageView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null) {
        } else {
            TUrlImageView tUrlImageView = (TUrlImageView) view;
            int i = this.f31301a;
            if (i == 0) {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            } else if (i == 2) {
                tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            }
            if (!TextUtils.isEmpty(this.b)) {
                try {
                    if (this.c) {
                        tUrlImageView.setSkipAutoSize(true);
                    } else {
                        tUrlImageView.setSkipAutoSize(false);
                        a(tUrlImageView);
                    }
                    mxq.a(tUrlImageView, this.b);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            tUrlImageView.setImageUrl(null);
            a(tUrlImageView);
        }
    }

    private void a(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3e34e", new Object[]{this, tUrlImageView});
            return;
        }
        int cornerRadius = getCornerRadius();
        int cornerRadiusRightTop = getCornerRadiusRightTop();
        int cornerRadiusLeftTop = getCornerRadiusLeftTop();
        int cornerRadiusRightBottom = getCornerRadiusRightBottom();
        int cornerRadiusLeftBottom = getCornerRadiusLeftBottom();
        int borderWidth = getBorderWidth();
        int borderColor = getBorderColor();
        if (cornerRadius > 0 || borderWidth > 0 || cornerRadiusRightTop > 0 || cornerRadiusLeftTop > 0 || cornerRadiusRightBottom > 0 || cornerRadiusLeftBottom > 0) {
            ImageShapeFeature imageShapeFeature = (ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class);
            if (imageShapeFeature == null) {
                imageShapeFeature = new ImageShapeFeature();
                tUrlImageView.addFeature(imageShapeFeature);
            }
            imageShapeFeature.setShape(1);
            if (cornerRadius > 0) {
                float f = cornerRadius;
                imageShapeFeature.setCornerRadius(f, f, f, f);
            } else if (cornerRadiusRightTop > 0 || cornerRadiusLeftTop > 0 || cornerRadiusRightBottom > 0 || cornerRadiusLeftBottom > 0) {
                imageShapeFeature.setCornerRadius(cornerRadiusLeftTop, cornerRadiusRightTop, cornerRadiusLeftBottom, cornerRadiusRightBottom);
            }
            if (borderWidth <= 0) {
                return;
            }
            imageShapeFeature.setStrokeEnable(true);
            imageShapeFeature.setStrokeWidth(borderWidth);
            imageShapeFeature.setStrokeColor(borderColor);
        } else if (((ImageShapeFeature) tUrlImageView.findFeature(ImageShapeFeature.class)) == null) {
        } else {
            tUrlImageView.removeFeature(ImageShapeFeature.class);
        }
    }
}
