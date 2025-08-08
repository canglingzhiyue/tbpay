package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.view.HVideoView;
import tb.mto;

/* loaded from: classes7.dex */
public class kwr extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_HVIDEOVIEW_ASPECTRATIO = 7594222789952419722L;
    public static final long DX_HVIDEOVIEW_CANPLAY = 4728577732966363983L;
    public static final long DX_HVIDEOVIEW_COVERURL = 1756289496339923034L;
    public static final long DX_HVIDEOVIEW_DURATION = 2057626925900400238L;
    public static final long DX_HVIDEOVIEW_ICONOFFSETY = 8577182346642010996L;
    public static final long DX_HVIDEOVIEW_ICONSIZE = 3509390040415201356L;
    public static final long DX_HVIDEOVIEW_ICONURL = 4951885508200836195L;
    public static final long DX_HVIDEOVIEW_ONENDPLAYING = -2313153628473349676L;
    public static final long DX_HVIDEOVIEW_ONERRORPLAYING = -2442905352582921527L;
    public static final long DX_HVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DX_HVIDEOVIEW_VIDEOURL = 7344459856848172626L;
    public static final long H_VIDEO_VIEW = -8690577844899785500L;
    public static final String TAG = "dx.HVideoView";
    public static final long USER_DEFINE_PARAM_HASH_CODE = 9999999999L;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f30355a;
    private String b = "noDefined";
    private String c = "noDefined";
    private String d = "noDefined";
    private String e = "noDefined";
    private String f = "noDefined";
    private String g = "noDefined";
    private boolean h = true;
    private int i = -1;
    private double j = mto.a.GEO_NOT_SUPPORT;

    static {
        kge.a(1505990634);
    }

    public static /* synthetic */ Object ipc$super(kwr kwrVar, String str, Object... objArr) {
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
            kge.a(-680467263);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kwr();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kwr();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        HVideoView hVideoView = new HVideoView(context);
        hVideoView.setEnableQueue(false);
        return hVideoView;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof kwr)) {
            return;
        }
        kwr kwrVar = (kwr) dXWidgetNode;
        this.i = kwrVar.i;
        this.g = kwrVar.g;
        this.f = kwrVar.f;
        this.d = kwrVar.d;
        this.e = kwrVar.e;
        this.c = kwrVar.c;
        this.b = kwrVar.b;
        this.j = kwrVar.j;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof HVideoView)) {
        } else {
            HVideoView hVideoView = (HVideoView) view;
            JSONObject e = getDXRuntimeContext().e();
            this.f30355a = e;
            hVideoView.updateData(e);
            if (!"noDefined".equals(this.f)) {
                hVideoView.setVideoUrl(this.f);
                ksp.a("dx.HVideoView", "video_load_url=" + this.f);
            }
            if (!"noDefined".equals(this.d)) {
                hVideoView.setIconOffsetY(this.d);
            }
            if (!"noDefined".equals(this.e)) {
                hVideoView.setIconSize(this.e);
            }
            if (!"noDefined".equals(this.b)) {
                hVideoView.setCoverImage(this.b);
            }
            if (!"noDefined".equals(this.g)) {
                hVideoView.setPlayButtonImage(this.g);
            }
            if (!"noDefined".equals(this.c)) {
                hVideoView.setDurationTime(this.c);
            }
            int i = this.i;
            if (i != -1) {
                a(hVideoView, i);
            }
            hVideoView.canPlay(this.h);
        }
    }

    private void a(HVideoView hVideoView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390a4bdd", new Object[]{this, hVideoView, new Integer(i)});
        } else if (i == 0) {
            hVideoView.setScaleType(0);
            hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
        } else if (i == 1) {
            hVideoView.setScaleType(3);
            hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_XY);
        } else if (i == 2) {
            hVideoView.setScaleType(1);
            hVideoView.setCoverScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            hVideoView.setScaleType(0);
            hVideoView.setCoverScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Double.compare(this.j, mto.a.GEO_NOT_SUPPORT) <= 0) {
            super.onMeasure(i, i2);
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                size2 = (int) (size / this.j);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            }
            if (mode != 1073741824 && mode2 == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec((int) (size2 * this.j), 1073741824);
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
        if (eventId == 5288671110273408574L) {
            return a("play");
        }
        if (eventId != 5388973340095122049L) {
            return false;
        }
        return a("pause");
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 1015096712691932083L) {
            this.i = i;
        } else if (j == 4728577732966363983L) {
            if (i == 1) {
                z = true;
            }
            this.h = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.j = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 1756289496339923034L) {
            this.b = str;
        } else if (j == 2057626925900400238L) {
            this.c = str;
        } else if (j == 8577182346642010996L) {
            this.d = str;
        } else if (j == 3509390040415201356L) {
            this.e = str;
        } else if (j == 7344459856848172626L) {
            this.f = str;
        } else if (j == 4951885508200836195L) {
            this.g = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
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

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof HVideoView)) {
            return false;
        }
        String str2 = "";
        if (StringUtils.equals(str, "play")) {
            ((HVideoView) v).playVideo();
            String[] strArr = new String[2];
            strArr[0] = "start video: section:";
            JSONObject jSONObject = this.f30355a;
            if (jSONObject != null) {
                str2 = jSONObject.getString("sectionBizCode");
            }
            strArr[1] = str2;
            e.c("dx.HVideoView", strArr);
        } else if (StringUtils.equals(str, "pause")) {
            ((HVideoView) v).pauseVideo();
            String[] strArr2 = new String[2];
            strArr2[0] = "pause video: section:";
            JSONObject jSONObject2 = this.f30355a;
            if (jSONObject2 != null) {
                str2 = jSONObject2.getString("sectionBizCode");
            }
            strArr2[1] = str2;
            e.c("dx.HVideoView", strArr2);
            return true;
        }
        return false;
    }
}
