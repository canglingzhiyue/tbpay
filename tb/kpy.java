package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.android.dinamicx.widget.m;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXExpandButtonExposedEvent;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXTagExposedEvent;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXTagFlowStateChangedEvent;
import com.taobao.detail.rate.vivid.dinamicX.eve.DXTagSelectedEvent;
import com.taobao.detail.rate.widget.delegate.tag.a;
import com.taobao.detail.rate.widget.delegate.tag.bean.AssociationTagItem;
import com.taobao.message.lab.comfrm.support.list.ListActions;
import com.taobao.taobao.R;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 92\u00020\u0001:\u000289B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0019\u001a\u00020\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0011H\u0002J \u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eH\u0014J\u0018\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010-\u001a\u00020(2\u0006\u0010%\u001a\u00020&H\u0014J\u0018\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0014J\u0018\u00101\u001a\u00020\"2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0014J\u0018\u00102\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\bH\u0014J\u0018\u00104\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0006H\u0014J\u0018\u00105\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u000bH\u0014J\u0018\u00106\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\rH\u0014J\b\u00107\u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode;", "Lcom/taobao/android/dinamicx/widget/DXWidgetNode;", "()V", "animate", "", "associationTags", "Lcom/alibaba/fastjson/JSONArray;", "columnSpace", "", "defaultLines", "defaultTag", "Lcom/alibaba/fastjson/JSONObject;", "defaultTagTitle", "", "hasInit", "isDefaultExpand", "mFakerView", "Lcom/taobao/detail/rate/widget/delegate/tag/AssociationTagFlowUIDelegate;", "mInitParams", "Lcom/taobao/detail/rate/widget/delegate/tag/AssociationTagFlowUIDelegate$InitParams;", "mUIDelegate", "radius", "rowSpace", "selectedStyle", "unSelectedStyle", CartRecommendRefreshScene.build, "object", "", "getDefaultValueForIntAttr", "key", "", "getFakerView", "getInitParams", "onBeforeMeasure", "", "measureUtilViewDelegate", "onBindEvent", "context", "Landroid/content/Context;", "weakView", "Landroid/view/View;", "eventId", "onClone", "widgetNode", "deepClone", "onCreateView", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onRenderView", "onSetIntAttribute", "attr", "onSetListAttribute", "onSetMapAttribute", "onSetStringAttribute", "prepareInitParam", "Builder", "Companion", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes7.dex */
public final class kpy extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DXASSOCIATIONTAGFLOWVIEW_ANIMATE = 4656115862998430694L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGFLOWVIEW = -1167862008781497118L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGS = -3754319763637144005L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_COLUMNSPACE = 4480603453068309125L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_DEFAULTLINES = 5349478053238594540L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAG = 4425075990734024203L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAGTITLE = 7701989587219965202L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_HASINIT = 4914428772296613975L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ISDEFAULTEXPAND = 1631961235977827600L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONSELECTEDASSOCIATIONTAG = -4263166344026197065L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED = -5430795269136673642L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGEDBUTTONEXPOSED = 8289054528279058935L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ONTAGEXPOSED = -2773278840088588067L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_RADIUS = 10074193828068110L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_ROWSPACE = 6173498097132329804L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_SELECTEDSTYLE = 4438304712657119847L;
    public static final long DXASSOCIATIONTAGFLOWVIEW_UNSELECTEDSTYLE = 66186082378481452L;
    private JSONArray b;
    private String e;
    private boolean f;
    private JSONObject i;
    private JSONObject j;
    private com.taobao.detail.rate.widget.delegate.tag.a k;
    private a.b l;
    private com.taobao.detail.rate.widget.delegate.tag.a m;
    private boolean n;
    private JSONObject o;

    /* renamed from: a  reason: collision with root package name */
    private boolean f30225a = true;
    private int c = 8;
    private int d = 2;
    private int g = 12;
    private int h = 12;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode$Companion;", "", "()V", "DXASSOCIATIONTAGFLOWVIEW_ANIMATE", "", "DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGFLOWVIEW", "DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGS", "DXASSOCIATIONTAGFLOWVIEW_COLUMNSPACE", "DXASSOCIATIONTAGFLOWVIEW_DEFAULTLINES", "DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAG", "DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAGTITLE", "DXASSOCIATIONTAGFLOWVIEW_HASINIT", "DXASSOCIATIONTAGFLOWVIEW_ISDEFAULTEXPAND", "DXASSOCIATIONTAGFLOWVIEW_ONSELECTEDASSOCIATIONTAG", "DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED", "DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGEDBUTTONEXPOSED", "DXASSOCIATIONTAGFLOWVIEW_ONTAGEXPOSED", "DXASSOCIATIONTAGFLOWVIEW_RADIUS", "DXASSOCIATIONTAGFLOWVIEW_ROWSPACE", "DXASSOCIATIONTAGFLOWVIEW_SELECTEDSTYLE", "DXASSOCIATIONTAGFLOWVIEW_UNSELECTEDSTYLE", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode$getFakerView$1", "Lcom/taobao/detail/rate/widget/delegate/tag/AssociationTagFlowUIDelegate$FlowViewStatusChangeListener;", "onStateChanged", "", "isExpanded", "", "showLines", "", "totalLines", "expandType", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class b implements a.InterfaceC0657a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.detail.rate.widget.delegate.tag.a.InterfaceC0657a
        public void a(boolean z, int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90621796", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), str});
                return;
            }
            kpy.a(kpy.this).f = z;
            kpy.a(kpy.this, z);
            kpy.this.postEvent(new DXTagFlowStateChangedEvent(kpy.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED, z, i, i2, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode$onBindEvent$2", "Lcom/taobao/detail/rate/widget/delegate/tag/AssociationTagFlowUIDelegate$FlowViewStatusChangeListener;", "onStateChanged", "", "isExpanded", "", "showLines", "", "totalLines", "expandType", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class d implements a.InterfaceC0657a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public d(View view) {
            this.b = view;
        }

        @Override // com.taobao.detail.rate.widget.delegate.tag.a.InterfaceC0657a
        public void a(boolean z, int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90621796", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), str});
                return;
            }
            this.b.setTag(R.id.v_fold_view, Boolean.valueOf(z));
            kpy.a(kpy.this).f = z;
            kpy.a(kpy.this, z);
            kpy.this.postEvent(new DXTagFlowStateChangedEvent(kpy.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED, z, i, i2, str));
            kpy.this.setNeedLayout(new DXWidgetRefreshOption.a().a(true).a(1).b(true).a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode$onBindEvent$4", "Lcom/taobao/detail/rate/widget/delegate/tag/AssociationTagFlowUIDelegate$StatusChangeButtonListener;", ListActions.EVENT_EXPOSED, "", "isExpanded", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class f implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.detail.rate.widget.delegate.tag.a.c
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else {
                kpy.this.postEvent(new DXExpandButtonExposedEvent(kpy.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGEDBUTTONEXPOSED, z));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode$onRenderView$1", "Lcom/taobao/detail/rate/widget/delegate/tag/AssociationTagFlowUIDelegate$FlowViewStatusChangeListener;", "onStateChanged", "", "isExpanded", "", "showLines", "", "totalLines", "expandType", "", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class g implements a.InterfaceC0657a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public g(View view) {
            this.b = view;
        }

        @Override // com.taobao.detail.rate.widget.delegate.tag.a.InterfaceC0657a
        public void a(boolean z, int i, int i2, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90621796", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), str});
                return;
            }
            this.b.setTag(R.id.v_fold_view, Boolean.valueOf(z));
            kpy.a(kpy.this).f = z;
            kpy.a(kpy.this, z);
            kpy.this.postEvent(new DXTagFlowStateChangedEvent(kpy.DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED, z, i, i2, str));
            kpy.this.setNeedLayout(new DXWidgetRefreshOption.a().a(true).a(1).b(true).a());
        }
    }

    public static /* synthetic */ Object ipc$super(kpy kpyVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
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

    public static final /* synthetic */ a.b a(kpy kpyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.b) ipChange.ipc$dispatch("c80786ba", new Object[]{kpyVar}) : kpyVar.b();
    }

    public static final /* synthetic */ void a(kpy kpyVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402b44b0", new Object[]{kpyVar, new Boolean(z)});
        } else {
            kpyVar.f = z;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new kpy();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode widgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, widgetNode, new Boolean(z)});
            return;
        }
        q.d(widgetNode, "widgetNode");
        if (!(widgetNode instanceof kpy)) {
            return;
        }
        super.onClone(widgetNode, z);
        if (this.l == null) {
            this.l = ((kpy) widgetNode).l;
        }
        kpy kpyVar = (kpy) widgetNode;
        this.f30225a = kpyVar.f30225a;
        this.b = kpyVar.b;
        this.c = kpyVar.c;
        this.d = kpyVar.d;
        this.e = kpyVar.e;
        this.o = kpyVar.o;
        this.f = kpyVar.f;
        this.g = kpyVar.g;
        this.h = kpyVar.h;
        this.i = kpyVar.i;
        this.j = kpyVar.j;
        this.n = kpyVar.n;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        q.d(context, "context");
        this.l = b();
        a.b bVar = this.l;
        q.a(bVar);
        this.k = new com.taobao.detail.rate.widget.delegate.tag.a(context, bVar, false);
        com.taobao.detail.rate.widget.delegate.tag.a aVar = this.k;
        q.a(aVar);
        aVar.a().setTag(R.id.association_tag_content_view, this.k);
        com.taobao.detail.rate.widget.delegate.tag.a aVar2 = this.k;
        q.a(aVar2);
        View a2 = aVar2.a();
        q.b(a2, "mUIDelegate!!.contentView");
        return a2;
    }

    private final com.taobao.detail.rate.widget.delegate.tag.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.detail.rate.widget.delegate.tag.a) ipChange.ipc$dispatch("402013b4", new Object[]{this});
        }
        if (this.m == null) {
            DXRuntimeContext dxRuntimeContext = getDXRuntimeContext();
            q.b(dxRuntimeContext, "dxRuntimeContext");
            this.m = new com.taobao.detail.rate.widget.delegate.tag.a(dxRuntimeContext.m(), b(), true);
            com.taobao.detail.rate.widget.delegate.tag.a aVar = this.m;
            if (aVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate");
            }
            aVar.a(new b());
        }
        if (this.n) {
            com.taobao.detail.rate.widget.delegate.tag.a aVar2 = this.m;
            if (aVar2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate");
            }
            aVar2.e();
        }
        com.taobao.detail.rate.widget.delegate.tag.a aVar3 = this.m;
        if (aVar3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate");
        }
        return aVar3;
    }

    private final a.b b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("e64246d5", new Object[]{this});
        }
        if (this.l == null) {
            this.l = c();
        }
        a.b bVar = this.l;
        if (bVar == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate.InitParams");
        }
        bVar.b = this.b;
        if (bVar != null) {
            bVar.e = this.e;
            if (bVar != null) {
                bVar.f = this.f;
                if (bVar != null) {
                    bVar.k = this.o;
                    if (bVar == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate.InitParams");
                    }
                    return bVar;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate.InitParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate.InitParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.detail.rate.widget.delegate.tag.AssociationTagFlowUIDelegate.InitParams");
    }

    private final a.b c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.b) ipChange.ipc$dispatch("141ae134", new Object[]{this});
        }
        a.b bVar = new a.b();
        bVar.f17062a = this.f30225a;
        bVar.b = this.b;
        kqa kqaVar = kqa.INSTANCE;
        bVar.c = rvm.a(kqaVar.a(kqaVar.b(this.c)));
        bVar.d = this.d;
        bVar.e = this.e;
        bVar.k = this.o;
        kqa kqaVar2 = kqa.INSTANCE;
        bVar.g = rvm.a(kqaVar2.a(kqaVar2.b(this.g)));
        kqa kqaVar3 = kqa.INSTANCE;
        bVar.h = rvm.a(kqaVar3.a(kqaVar3.b(this.h)));
        bVar.i = this.i;
        bVar.j = this.j;
        bVar.f = this.f;
        return bVar;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View weakView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, weakView});
            return;
        }
        q.d(context, "context");
        q.d(weakView, "weakView");
        super.onRenderView(context, weakView);
        if (this.k == null) {
            Object tag = weakView.getTag(R.id.association_tag_content_view);
            if (tag instanceof com.taobao.detail.rate.widget.delegate.tag.a) {
                this.k = (com.taobao.detail.rate.widget.delegate.tag.a) tag;
                com.taobao.detail.rate.widget.delegate.tag.a aVar = this.k;
                if (aVar != null) {
                    aVar.a(b());
                }
                com.taobao.detail.rate.widget.delegate.tag.a aVar2 = this.k;
                if (aVar2 != null) {
                    aVar2.a(new g(weakView));
                }
            }
        }
        com.taobao.detail.rate.widget.delegate.tag.a aVar3 = this.k;
        if (aVar3 == null) {
            return;
        }
        aVar3.c();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View weakView, long j) {
        com.taobao.detail.rate.widget.delegate.tag.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, weakView, new Long(j)});
            return;
        }
        q.d(context, "context");
        q.d(weakView, "weakView");
        super.onBindEvent(context, weakView, j);
        if (j == DXASSOCIATIONTAGFLOWVIEW_ONSELECTEDASSOCIATIONTAG) {
            com.taobao.detail.rate.widget.delegate.tag.a aVar2 = this.k;
            if (aVar2 == null) {
                return;
            }
            aVar2.a(new c(weakView));
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGED) {
            com.taobao.detail.rate.widget.delegate.tag.a aVar3 = this.k;
            if (aVar3 == null) {
                return;
            }
            aVar3.a(new d(weakView));
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ONTAGEXPOSED) {
            com.taobao.detail.rate.widget.delegate.tag.a aVar4 = this.k;
            if (aVar4 == null) {
                return;
            }
            aVar4.a(new e());
        } else if (j != DXASSOCIATIONTAGFLOWVIEW_ONSTATECHANGEDBUTTONEXPOSED || (aVar = this.k) == null) {
        } else {
            aVar.a(new f());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"com/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode$onBindEvent$1", "Lcom/taobao/detail/rate/widget/delegate/tag/listener/OnSelectedChangedListener;", "Lcom/taobao/detail/rate/widget/delegate/tag/bean/AssociationTagItem;", "onSelected", "", "index", "", "t", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class c implements kqh<AssociationTagItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;

        public c(View view) {
            this.b = view;
        }

        @Override // tb.kqh
        public void a(int i, AssociationTagItem associationTagItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0fe11d7", new Object[]{this, new Integer(i), associationTagItem});
                return;
            }
            String str = null;
            kpy.this.postEvent(new DXTagSelectedEvent(kpy.DXASSOCIATIONTAGFLOWVIEW_ONSELECTEDASSOCIATIONTAG, associationTagItem != null ? associationTagItem.associationTag : null));
            View view = this.b;
            int i2 = R.id.v_arrow;
            if (associationTagItem != null) {
                str = associationTagItem.title;
            }
            view.setTag(i2, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/taobao/detail/rate/vivid/dinamicX/view/DXAssociationTagFlowViewWidgetNode$onBindEvent$3", "Lcom/taobao/detail/rate/widget/delegate/tag/listener/OnItemExposedListener;", "Lcom/taobao/detail/rate/widget/delegate/tag/bean/AssociationTagItem;", ListActions.EVENT_EXPOSED, "", "index", "", "t", "tb_rate_display_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes7.dex */
    public static final class e implements kqg<AssociationTagItem> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.kqg
        public void a(int i, AssociationTagItem t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b0fe11d7", new Object[]{this, new Integer(i), t});
                return;
            }
            q.d(t, "t");
            kpy.this.postEvent(new DXTagExposedEvent(kpy.DXASSOCIATIONTAGFLOWVIEW_ONTAGEXPOSED, t.associationTag));
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.detail.rate.widget.delegate.tag.a a2 = a();
        a2.a(b());
        a(a2);
        View a3 = a2.a();
        if (a3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) a3;
        frameLayout.measure(i, ViewGroup.getChildMeasureSpec(i2, 0, frameLayout.getLayoutParams().height));
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(frameLayout.getMeasuredHeight() + 0, 1073741824));
    }

    private final void a(com.taobao.detail.rate.widget.delegate.tag.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787eb62e", new Object[]{this, aVar});
            return;
        }
        aVar.c();
        com.taobao.android.dinamicx.model.a a2 = kpz.INSTANCE.a(getLayoutWidth(), getLayoutHeight(), getWeight(), getLayoutGravity(), getDirection());
        View a3 = aVar.a();
        if (a3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) a3;
        DXWidgetNode parentWidget = getParentWidget();
        if (parentWidget == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dinamicx.widget.DXLayout");
        }
        kpz.INSTANCE.a(viewGroup, (m) parentWidget, a2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray attr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), attr});
            return;
        }
        q.d(attr, "attr");
        if (j == DXASSOCIATIONTAGFLOWVIEW_ASSOCIATIONTAGS) {
            this.b = attr;
        } else {
            super.onSetListAttribute(j, attr);
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
        if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAG) {
            this.o = attr;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_SELECTEDSTYLE) {
            this.i = attr;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_UNSELECTEDSTYLE) {
            this.j = attr;
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
        if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTTAGTITLE) {
            this.e = attr;
        } else {
            super.onSetStringAttribute(j, attr);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ANIMATE) {
            if (i == 0) {
                z = false;
            }
            this.f30225a = z;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_COLUMNSPACE) {
            this.c = i;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTLINES) {
            this.d = i;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ISDEFAULTEXPAND) {
            if (i == 0) {
                z = false;
            }
            this.f = z;
        } else if (j == 10074193828068110L) {
            this.g = i;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_ROWSPACE) {
            this.h = i;
        } else if (j == DXASSOCIATIONTAGFLOWVIEW_HASINIT) {
            if (i == 0) {
                z = false;
            }
            this.n = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXASSOCIATIONTAGFLOWVIEW_ANIMATE) {
            return 1;
        }
        if (j == DXASSOCIATIONTAGFLOWVIEW_DEFAULTLINES) {
            return 2;
        }
        if (j != DXASSOCIATIONTAGFLOWVIEW_ISDEFAULTEXPAND && j != DXASSOCIATIONTAGFLOWVIEW_HASINIT) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }
}
