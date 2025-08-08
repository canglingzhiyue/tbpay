package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import tb.mto;

/* loaded from: classes7.dex */
public class lmi extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_HVIDEOVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DX_HVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DX_HVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DX_HVIDEOVIEW_DURATION = 2057626925900400238L;
    public static final long DX_HVIDEOVIEW_ICONOFFSETY = 8577182346642010996L;
    public static final long DX_HVIDEOVIEW_ICONURL = 4951885508200836195L;
    public static final long DX_HVIDEOVIEW_ONENDPLAYING = -2313153628473349676L;
    public static final long DX_HVIDEOVIEW_ONERRORPLAYING = -2442905352582921527L;
    public static final long DX_HVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DX_HVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long H_VIDEO_VIEW = -8690577844899785500L;
    public static final String TAG = "dx.HVideoView";
    public static final long USER_DEFINE_PARAM_HASH_CODE = 9999999999L;

    /* renamed from: a  reason: collision with root package name */
    private String f30709a = "noDefined";
    private String b = "noDefined";
    private String c = "noDefined";
    private String d = "noDefined";
    private String e = "noDefined";
    private boolean f = true;
    private int g = -1;
    private double h = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(1371463378);
    }

    private boolean a(DXMsgCenterEvent dXMsgCenterEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83af498c", new Object[]{this, dXMsgCenterEvent})).booleanValue();
        }
        return true;
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(lmi lmiVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1194671191);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lmi();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new lmi();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HImageView hImageView = new HImageView(context);
        ldf.d("DinamicX", "videoview=" + getDXRuntimeContext().c());
        return hImageView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof lmi)) {
            return;
        }
        lmi lmiVar = (lmi) dXWidgetNode;
        this.g = lmiVar.g;
        this.e = lmiVar.e;
        this.d = lmiVar.d;
        this.c = lmiVar.c;
        this.b = lmiVar.b;
        this.f30709a = lmiVar.f30709a;
        this.h = lmiVar.h;
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof HImageView)) {
        } else {
            HImageView hImageView = (HImageView) view;
            setImageScaleType(hImageView, this.g);
            if (!StringUtils.isEmpty(this.f30709a)) {
                onq.a(hImageView, this.f30709a, null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
                hImageView.setImageUrl(this.f30709a);
            }
            hImageView.setAspectRatio((float) this.h);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Double.compare(this.h, mto.a.GEO_NOT_SUPPORT) <= 0) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                size2 = (int) (size / this.h);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            if (mode != 1073741824 && mode2 == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec((int) (size2 * this.h), 1073741824);
            }
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent == null) {
            return false;
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        long eventId = dXEvent.getEventId();
        if (eventId == -1747756056147111305L) {
            return a((DXMsgCenterEvent) dXEvent);
        }
        if (eventId == 5288671110273408574L) {
            return a("ViewAppear");
        }
        if (eventId == 5388973340095122049L) {
            return a("ViewDisappear");
        }
        if (eventId == -2313153628473349676L) {
            return a("VideoEndPlaying");
        }
        if (eventId != -2442905352582921527L) {
            return false;
        }
        return a("VideoErrorPlaying");
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.g = i;
        } else if (j == 4728577732966363983L) {
            if (i == 1) {
                z = true;
            }
            this.f = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.h = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 1756289496339923034L) {
            this.f30709a = str;
        } else if (j == 2057626925900400238L) {
            this.b = str;
        } else if (j == 8577182346642010996L) {
            this.c = str;
        } else if (j == 7344459856848172626L) {
            this.d = str;
        } else if (j == 4951885508200836195L) {
            this.e = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j != 4728577732966363983L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 1;
    }
}
