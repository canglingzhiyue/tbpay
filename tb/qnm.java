package tb;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.standard.annotation.AliSDetailScaleType;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.taobao.uikit.feature.features.RatioFeature;
import java.lang.ref.WeakReference;
import tb.mto;

/* loaded from: classes7.dex */
public class qnm extends DXWidgetNode implements ifl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXHTBLIMAGEVIEW_MINPLAYEXPOSERATIO = 3649100718983479135L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTART = -1305328253755158825L;
    public static final long DXHTBLIMAGEVIEW_ONPARENTSCROLLSTOP = -88908847944554642L;
    public static final long DXHTBLIMAGEVIEW_PLAYCONTROLLERENABLE = -8795905679455764171L;
    public static final long DXHTBLIMAGEVIEW_PLAYDURATION = -7241847713988459768L;
    public static final long DXHTBLIMAGEVIEW_TBBACKGROUND = -6737373688188729886L;
    public static final long DXHTBLIMAGEVIEW_TBCURRENTLIVESTATE = -5287008133921364644L;
    public static final long DXHTBLIMAGEVIEW_TBGONEIFNULL = 1035483994773344437L;
    public static final long DXHTBLIMAGEVIEW_TBID = 38174466807L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGECORNERRADIUS = 8499485291207392157L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGECORNERRADIUSRATIO = -9012118380120751455L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGESHAPE = -1666749237118992970L;
    public static final long DXHTBLIMAGEVIEW_TBIMAGEURL = -7963020384368345866L;
    public static final long DXHTBLIMAGEVIEW_TBLEFTBOTTOMCORNERRADIUS = 8472049768233163199L;
    public static final long DXHTBLIMAGEVIEW_TBLEFTTOPCORNERRADIUS = 1805057142456087674L;
    public static final long DXHTBLIMAGEVIEW_TBLIVEVIDEO = 9122203915275105128L;
    public static final long DXHTBLIMAGEVIEW_TBMASK = 10220202113345640L;
    public static final long DXHTBLIMAGEVIEW_TBPLACEHOLD = 800013180966223437L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYERDATA = -8136938095111281463L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYURL = 3882830683672803752L;
    public static final long DXHTBLIMAGEVIEW_TBPLAYVIDEO = 850419666986385006L;
    public static final long DXHTBLIMAGEVIEW_TBRIGHTBOTTOMCORNERRADIUS = 5615326228419484723L;
    public static final long DXHTBLIMAGEVIEW_TBRIGHTTOPCORNERRADIUS = 7638094872275769326L;
    public static final long DXHTBLIMAGEVIEW_TBSCALETYPE = 526508988394598507L;
    public static final long DXHTBLIMAGEVIEW_TBSRC = 19617083574627L;
    public static final long DXHTBLIMAGEVIEW_TBVIDEOLOOP = 311349093421208690L;
    public static final long DXHTBLIMAGEVIEW_TBVISIBLESTATE = 5637158515563704755L;
    public static final long DXHTBLIMAGEVIEW_TBWHRATIO = 3898487036836366973L;

    /* renamed from: a  reason: collision with root package name */
    private final lmk f32962a = new lmk();

    static {
        kge.a(252193512);
        kge.a(1186087902);
    }

    public static /* synthetic */ Object ipc$super(qnm qnmVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
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

    @Override // tb.ifl
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // tb.ifl
    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this});
        }
        return null;
    }

    @Override // tb.ifl
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.ifl
    public Bitmap f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8b0379cb", new Object[]{this});
        }
        return null;
    }

    public qnm() {
        setUserId("simpleNode");
    }

    @Override // tb.ifl
    public Drawable b() {
        HImageView hImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("75971531", new Object[]{this});
        }
        WeakReference<View> wRView = getWRView();
        if (wRView != null && (hImageView = (HImageView) wRView.get().findViewById(10)) != null) {
            return hImageView.getDrawable();
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(736729535);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new qnm();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new qnm();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof qnm)) {
        } else {
            super.onClone(dXWidgetNode, z);
            this.f32962a.a(((qnm) dXWidgetNode).f32962a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        HImageView hImageView = new HImageView(context);
        hImageView.setId(10);
        frameLayout.addView(hImageView, 0, new FrameLayout.LayoutParams(-1, -1));
        if (jqm.a()) {
            TextView textView = new TextView(context);
            textView.setText("直播降级组件");
            textView.setTextColor(Color.parseColor("#ff0000"));
            textView.setTextSize(12.0f);
            frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2));
        }
        return frameLayout;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        HImageView hImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof FrameLayout) || (hImageView = (HImageView) view.findViewById(10)) == null) {
            return;
        }
        hImageView.setAutoRelease(true);
        hImageView.setWhenNullClearImg(true);
        hImageView.setScaleType(pbh.c(this.f32962a.t()));
        onq.a(hImageView, this.f32962a.i(), null, lfx.GUESS_IMAGE_STRATEGY_CONFIG);
        hImageView.setImageUrl(this.f32962a.i());
        a(hImageView);
        b(hImageView);
        if (this.f32962a.e() == null) {
            return;
        }
        hImageView.setTag(this.f32962a.e());
    }

    private void a(HImageView hImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39926709", new Object[]{this, hImageView});
            return;
        }
        String u = this.f32962a.u();
        if (StringUtils.isEmpty(u) || hImageView == null) {
            return;
        }
        int a2 = pbh.a(u);
        if (a2 != -1) {
            hImageView.setImageResource(pbh.a(u));
            return;
        }
        Resources resources = hImageView.getContext().getResources();
        if (resources != null) {
            a2 = resources.getIdentifier(u, com.taobao.share.ui.engine.friend.a.CONTACTS_INFO_NOT_EMPTY_STATUS, hImageView.getContext().getPackageName());
        }
        if (a2 <= 0) {
            return;
        }
        hImageView.setImageResource(a2);
    }

    private void b(HImageView hImageView) {
        RatioFeature ratioFeature;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b8f668", new Object[]{this, hImageView});
            return;
        }
        double x = this.f32962a.x();
        if (x <= mto.a.GEO_NOT_SUPPORT) {
            return;
        }
        AbsFeature<? super ImageView> findFeature = hImageView.findFeature(RatioFeature.class);
        if (findFeature != null) {
            ratioFeature = (RatioFeature) findFeature;
        } else {
            ratioFeature = new RatioFeature();
            ratioFeature.setHost(hImageView);
            hImageView.addFeature(ratioFeature);
        }
        ratioFeature.setRatio((float) x);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == -8136938095111281463L) {
            this.f32962a.a(jSONObject);
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == 1035483994773344437L) {
            this.f32962a.a(obj);
        } else if (j == 38174466807L) {
            this.f32962a.b(obj);
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == -6737373688188729886L) {
            this.f32962a.a(str);
        } else if (j == -5287008133921364644L) {
            this.f32962a.b(str);
        } else if (j == 8499485291207392157L) {
            this.f32962a.c(str);
        } else if (j == -1666749237118992970L) {
            this.f32962a.d(str);
        } else if (j == -7963020384368345866L) {
            this.f32962a.e(str);
        } else if (j == 8472049768233163199L) {
            this.f32962a.f(str);
        } else if (j == 1805057142456087674L) {
            this.f32962a.g(str);
        } else if (j == 10220202113345640L) {
            this.f32962a.h(str);
        } else if (j == 800013180966223437L) {
            this.f32962a.i(str);
        } else if (j == 3882830683672803752L) {
            this.f32962a.j(str);
        } else if (j == 5615326228419484723L) {
            this.f32962a.k(str);
        } else if (j == 7638094872275769326L) {
            this.f32962a.l(str);
        } else if (j == 526508988394598507L) {
            this.f32962a.m(str);
        } else if (j == 19617083574627L) {
            this.f32962a.n(str);
        } else if (j == 5637158515563704755L) {
            this.f32962a.o(str);
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 3649100718983479135L) {
            this.f32962a.a(d);
        } else if (j == -9012118380120751455L) {
            this.f32962a.b(d);
        } else if (j == 3898487036836366973L) {
            this.f32962a.c(d);
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -7241847713988459768L) {
            this.f32962a.a(i);
        } else if (j == 9122203915275105128L) {
            lmk lmkVar = this.f32962a;
            if (i == 0) {
                z = false;
            }
            lmkVar.b(z);
        } else if (j == 850419666986385006L) {
            lmk lmkVar2 = this.f32962a;
            if (i == 0) {
                z = false;
            }
            lmkVar2.c(z);
        } else if (j == 311349093421208690L) {
            lmk lmkVar3 = this.f32962a;
            if (i == 0) {
                z = false;
            }
            lmkVar3.d(z);
        } else if (j == -8795905679455764171L) {
            lmk lmkVar4 = this.f32962a;
            if (i == 0) {
                z = false;
            }
            lmkVar4.a(z);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : (j == 8499485291207392157L || j == 8472049768233163199L || j == 1805057142456087674L || j == 5615326228419484723L || j == 7638094872275769326L) ? "0" : j == 526508988394598507L ? AliSDetailScaleType.centerCrop : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j != 3649100718983479135L) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 0.6000000238418579d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 9122203915275105128L || j == -8795905679455764171L) {
            return 1;
        }
        if (j == 850419666986385006L) {
            return 0;
        }
        if (j != -7241847713988459768L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return -1;
    }
}
