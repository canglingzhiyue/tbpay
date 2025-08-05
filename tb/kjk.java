package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.detail.rate.vivid.dinamicX.view.error.DisplayErrorView;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002ABB\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010(\u001a\u0004\u0018\u00010\u00012\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J$\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u0005H\u0014J\b\u00102\u001a\u00020,H\u0016J\u001a\u00103\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u000206H\u0016J\u0012\u00107\u001a\u0004\u0018\u0001002\u0006\u0010-\u001a\u00020.H\u0014J\u0018\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:H\u0014J\u001c\u0010<\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0018\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020'H\u0014J\u0018\u0010@\u001a\u00020,2\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u00020\u001dH\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTBErrorViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "Lcom/taobao/detail/rate/vivid/dinamicX/view/error/DisplayErrorView$TBErrorButtonBack;", "()V", "DXTBERRORVIEW_APINAME", "", "getDXTBERRORVIEW_APINAME", "()J", "DXTBERRORVIEW_BUTTONTITLE", "getDXTBERRORVIEW_BUTTONTITLE", "DXTBERRORVIEW_ERRORMSG", "getDXTBERRORVIEW_ERRORMSG", "DXTBERRORVIEW_ICONURL", "getDXTBERRORVIEW_ICONURL", "DXTBERRORVIEW_MAPPINGCODE", "getDXTBERRORVIEW_MAPPINGCODE", "DXTBERRORVIEW_ONERRORBUTTONCLICK", "getDXTBERRORVIEW_ONERRORBUTTONCLICK", "DXTBERRORVIEW_RESPONSECODE", "getDXTBERRORVIEW_RESPONSECODE", "DXTBERRORVIEW_RETCODE", "getDXTBERRORVIEW_RETCODE", "DXTBERRORVIEW_SUBTITLE", "getDXTBERRORVIEW_SUBTITLE", "DXTBERRORVIEW_TITLE", "getDXTBERRORVIEW_TITLE", "DXTBERRORVIEW_USERINFO", "getDXTBERRORVIEW_USERINFO", "apiName", "", "buttonTitle", "errorMsg", "iconUrl", arz.KEY_MAPPING_CODE, ZimMessageChannel.K_RPC_RES_CODE, "retCode", MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE, "title", "userInfo", "Lcom/alibaba/fastjson/JSONObject;", CartRecommendRefreshScene.build, "object", "", "onBindEvent", "", "context", "Landroid/content/Context;", "weakView", "Landroid/view/View;", "eventId", "onButtonClick", "onClone", "widgetNode", "deepClone", "", "onCreateView", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "onRenderView", "onSetMapAttribute", "key", "attr", "onSetStringAttribute", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kjk extends DXWidgetNode implements DisplayErrorView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final long v = 4124152101559887174L;

    /* renamed from: a  reason: collision with root package name */
    private final long f30118a = 4656405053079209922L;
    private final long b = -1456081616717209175L;
    private final long c = 2348669943913866329L;
    private final long d = 4951885508200836195L;
    private final long e = 8714565938644618098L;
    private final long f = 8458835585798141787L;
    private final long g = 8946215571925488374L;
    private final long h = 5286704319545317965L;
    private final long i = 6474759779441984340L;
    private final long j = 19621076582151L;
    private final long k = 7061442455336343891L;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private JSONObject u;

    public static /* synthetic */ Object ipc$super(kjk kjkVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
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

    public static final /* synthetic */ long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue() : v;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXTBErrorViewWidgetNode$Companion;", "", "()V", "DXTBERRORVIEW_TBERRORVIEW", "", "getDXTBERRORVIEW_TBERRORVIEW", "()J", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public final long a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : kjk.b();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kjk();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof kjk)) {
        } else {
            super.onClone(dXWidgetNode, z);
            kjk kjkVar = (kjk) dXWidgetNode;
            this.l = kjkVar.l;
            this.n = kjkVar.n;
            this.o = kjkVar.o;
            this.p = kjkVar.p;
            this.q = kjkVar.q;
            this.r = kjkVar.r;
            this.m = kjkVar.m;
            this.s = kjkVar.s;
            this.t = kjkVar.t;
            this.u = kjkVar.u;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.d(context, "context");
        return new DisplayErrorView(context, null, 0, 6, null);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof DisplayErrorView)) {
            return;
        }
        DisplayErrorView displayErrorView = (DisplayErrorView) view;
        displayErrorView.setButtonListener(this);
        displayErrorView.setSubTitle(this.s);
        displayErrorView.setTitle(this.t);
        displayErrorView.setIconUrl(this.o);
        displayErrorView.setButtonTitle(this.m);
        displayErrorView.setMappingCode(this.p);
        displayErrorView.setRetCode(this.r);
        displayErrorView.setErrorMsg(this.n);
        displayErrorView.setApiName(this.l);
        displayErrorView.setResponseCode(this.q);
        displayErrorView.setUserMtopInfo(this.u);
        displayErrorView.initView();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == this.k) {
            this.u = attr;
        } else {
            super.onSetMapAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == this.f30118a) {
            this.l = attr;
        } else if (j == this.b) {
            this.m = attr;
        } else if (j == this.c) {
            this.n = attr;
        } else if (j == this.d) {
            this.o = attr;
        } else if (j == this.e) {
            this.p = attr;
        } else if (j == this.g) {
            this.q = attr;
        } else if (j == this.h) {
            this.r = attr;
        } else if (j == this.i) {
            this.s = attr;
        } else if (j == this.j) {
            this.t = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.detail.rate.vivid.dinamicX.view.error.DisplayErrorView.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            postEvent(new DXEvent(this.f));
        }
    }
}
