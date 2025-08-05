package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.home.component.utils.j;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HGifView;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.taobao.R;
import tb.mto;

/* loaded from: classes.dex */
public class lfy extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHGIFVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DXHGIFVIEW_FILTERTYPE = -7195088064603432654L;
    public static final long DXHGIFVIEW_GIFURL = 9274838684923695L;
    public static final long DXHGIFVIEW_HGIFVIEW = -6240570111658900479L;
    public static final long DXHGIFVIEW_IMAGEURL = 3520785955321526846L;
    public static final long DXHGIFVIEW_PLACEHOLDERIMAGE = -2302197892612987562L;
    public static final long DXHGIFVIEW_SCALETYPE = 1015096712691932083L;
    public static final int DXHGIFVIEW_SCALETYPE_CENTERCROP = 2;
    public static final int DXHGIFVIEW_SCALETYPE_FITCENTER = 0;
    public static final int DXHGIFVIEW_SCALETYPE_FITXY = 1;
    public static final String TAG = "DXHGifViewWidgetNode";

    /* renamed from: a  reason: collision with root package name */
    private double f30550a;
    private String b;
    private String c;
    private Object d;
    private int e;
    private int f;

    static {
        kge.a(1542936530);
    }

    public static /* synthetic */ Object ipc$super(lfy lfyVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1668955305);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lfy();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lfy();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof lfy)) {
        } else {
            super.onClone(dXWidgetNode, z);
            lfy lfyVar = (lfy) dXWidgetNode;
            this.f30550a = lfyVar.f30550a;
            this.b = lfyVar.b;
            this.c = lfyVar.c;
            this.d = lfyVar.d;
            this.e = lfyVar.e;
            this.f = lfyVar.f;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new HGifView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof HGifView)) {
        } else {
            HGifView hGifView = (HGifView) view;
            if (hGifView.getBottomImageView() == null || hGifView.getGifImageView() == null) {
                return;
            }
            onq.a(hGifView.getBottomImageView(), this.c, null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
            onq.a(hGifView.getGifImageView(), this.b, null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
            a(hGifView.getBottomImageView(), this.e);
            a(hGifView.getGifImageView(), this.e);
            try {
                hGifView.getBottomImageView().setPlaceHoldForeground((Drawable) this.d);
            } catch (Throwable th) {
                ldf.d("DXHGifViewWidgetNode", "图片预置图加载异常 msg = " + th.getMessage());
            }
            hGifView.setBottomImage(this.c);
            hGifView.setGifUrl(this.b);
            fxq.a(hGifView.getGifImageView(), this.f);
            fxq.a(hGifView.getBottomImageView(), this.f);
            a(true);
        }
    }

    private void a(ImageView imageView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017121", new Object[]{this, imageView, new Integer(i)});
        } else if (i == 1) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i == 2) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
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
            double d = this.f30550a;
            if (!z2 || z) {
                if (!z2) {
                    int size = View.MeasureSpec.getSize(i);
                    if (d > mto.a.GEO_NOT_SUPPORT) {
                        i5 = size;
                        i3 = (int) (size / d);
                    } else {
                        i5 = size;
                    }
                }
                i3 = 0;
            } else {
                i3 = View.MeasureSpec.getSize(i2);
                if (d > mto.a.GEO_NOT_SUPPORT) {
                    i5 = (int) (i3 * d);
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
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == -2302197892612987562L) {
            this.d = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 9274838684923695L) {
            this.b = str;
        } else if (j == 3520785955321526846L) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.f30550a = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.e = i;
        } else if (-7195088064603432654L == j) {
            this.f = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() == 5288671110273408574L) {
            a(true);
        }
        if (dXEvent.getEventId() == 5388973340095122049L) {
            a(false);
        }
        return super.onEvent(dXEvent);
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!j.a("enableHomePageJumpToNextPageCostOpt", true) || TextUtils.isEmpty(this.b)) {
        } else {
            View nativeView = getNativeView();
            if (!(nativeView instanceof HGifView)) {
                return;
            }
            HGifView hGifView = (HGifView) nativeView;
            if (hGifView.getGifImageView() == null) {
                return;
            }
            HImageView gifImageView = hGifView.getGifImageView();
            if (z && gifImageView.getTag(R.id.tag_image_view_predraw_listener) == null) {
                ohx ohxVar = new ohx(gifImageView);
                gifImageView.getViewTreeObserver().addOnPreDrawListener(ohxVar);
                gifImageView.setTag(R.id.tag_image_view_predraw_listener, ohxVar);
            }
            if (z || gifImageView.getTag(R.id.tag_image_view_predraw_listener) == null) {
                return;
            }
            gifImageView.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) gifImageView.getTag(R.id.tag_image_view_predraw_listener));
            gifImageView.setTag(R.id.tag_image_view_predraw_listener, null);
        }
    }
}
