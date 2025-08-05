package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRecyclerLayoutLoadMoreEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollLayoutBaseExposeEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.dinamicx.widget.recycler.ScrollListener;
import com.taobao.android.dinamicx.widget.recycler.WaterfallLayout;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnExposeEvent;
import com.taobao.android.dinamicx.widget.recycler.event.DXRecyclerLayoutOnStayEvent;
import com.taobao.android.dinamicx.widget.recycler.expose.ExposeHelperBuilder;
import com.taobao.android.dinamicx.widget.recycler.nested.DXNestedScrollerView;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBAbsRefreshHeader;
import com.taobao.android.dinamicx.widget.recycler.view.DXRecyclerView;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.esd;
import tb.fqi;
import tb.ftu;
import tb.fuw;
import tb.fux;
import tb.fuz;
import tb.fxe;
import tb.fxj;
import tb.fxr;
import tb.fyu;
import tb.fyx;
import tb.fzp;
import tb.fzr;
import tb.fzs;
import tb.fzt;
import tb.fzu;
import tb.fzw;
import tb.fzx;
import tb.fzy;
import tb.fzz;
import tb.gaa;
import tb.gab;
import tb.gac;
import tb.gae;
import tb.gaf;
import tb.gag;
import tb.gai;
import tb.gaj;
import tb.gbf;
import tb.gbh;
import tb.kge;

/* loaded from: classes5.dex */
public class DXRecyclerLayout extends DXAbsContainerBaseLayout implements fyu, fyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ABILITY_SPAN = "ability_span";
    public static final long DXRECYCLERLAYOUT_ADAPTERTYPE = 4719559293862423182L;
    public static final int DXRECYCLERLAYOUT_ADAPTERTYPE_COMMON = 0;
    public static final int DXRECYCLERLAYOUT_ADAPTERTYPE_DATACOPY = 1;
    public static final int DXRECYCLERLAYOUT_ADAPTERTYPE_TWODIMENSIONALARRAY = 2;
    public static final long DXRECYCLERLAYOUT_ANDROIDDISABLESTICKYRECYCLE = 5334270420150067950L;
    public static final long DXRECYCLERLAYOUT_ANDROIDSUPPORT = -690082685604518676L;
    public static final int DXRECYCLERLAYOUT_ANDROIDSUPPORT_SUPPORTV7 = 0;
    public static final int DXRECYCLERLAYOUT_ANDROIDSUPPORT_SUPPORTX = 1;
    public static final long DXRECYCLERLAYOUT_COLUMNCOUNT = 4480460401770252962L;
    public static final long DXRECYCLERLAYOUT_COLUMNGAP = 7523322875951878575L;
    public static final long DXRECYCLERLAYOUT_DATASOURCE = -5948810534719014123L;
    public static final long DXRECYCLERLAYOUT_DEFAULTLOADMORESTATUS = 4192478880209527953L;
    public static final long DXRECYCLERLAYOUT_DISABLEBOUNCES = -7721339152929171023L;
    public static final long DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN = 3569509988477778057L;
    public static final int DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ENABLEPRERENDER = 6042404229400734461L;
    public static final int DXRECYCLERLAYOUT_ENABLEPRERENDER_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_ENABLEPRERENDER_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME = 1118607339767866271L;
    public static final int DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ENDREACHEDTHRESHOLD = 5205069215281796771L;
    public static final long DXRECYCLERLAYOUT_EXPOSURESPACEFACTOR = -277183941220263719L;
    public static final long DXRECYCLERLAYOUT_EXPOSURETIMEFACTOR = -2576277436099050373L;
    public static final long DXRECYCLERLAYOUT_FIXVERTICALSCROLLCONFLICT = 8809657122981937979L;
    public static final long DXRECYCLERLAYOUT_ISOPENLOADMORE = 2380170249149374095L;
    public static final int DXRECYCLERLAYOUT_ISOPENLOADMORE_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH = 1110502637440832944L;
    public static final int DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_LEFTGAP = 5063678658862152906L;
    public static final long DXRECYCLERLAYOUT_LOADMOREFAILTEXT = 7321446999712924516L;
    public static final long DXRECYCLERLAYOUT_LOADMORELOADINGTEXT = -3963239569560963927L;
    public static final long DXRECYCLERLAYOUT_LOADMORENOMOREDATATEXT = -7969714938924101192L;
    public static final long DXRECYCLERLAYOUT_LOADMORESTRATEGY = -7008782084175683434L;
    public static final long DXRECYCLERLAYOUT_LOADMORETEXTCOLOR = 3416394884019274728L;
    public static final long DXRECYCLERLAYOUT_LOADMORETEXTSIZE = 8369659249760268163L;
    public static final long DXRECYCLERLAYOUT_MAX_STREAM_RENDER_COUNT = 5167700514768438063L;
    public static final long DXRECYCLERLAYOUT_NEEDITEMANIMATION = -3924891868525265444L;
    public static final int DXRECYCLERLAYOUT_NEEDITEMANIMATION_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_NEEDITEMANIMATION_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_NEEDSCHEDULEONPREFETCH = 5008706079063077581L;
    public static final long DXRECYCLERLAYOUT_ONREPEATEXPOSE = 7221816040243224000L;
    public static final long DXRECYCLERLAYOUT_ONSTARTREACHED = -1945209666977474139L;
    public static final long DXRECYCLERLAYOUT_ONSTAY = 9859236201376900L;
    public static final long DXRECYCLERLAYOUT_ONSTICKYCHANGE = 2228800223520853672L;
    public static final long DXRECYCLERLAYOUT_OPENPREFETCH = 149121233077571055L;
    public static final int DXRECYCLERLAYOUT_OPENPREFETCH_FALSE = 0;
    public static final int DXRECYCLERLAYOUT_OPENPREFETCH_TRUE = 1;
    public static final long DXRECYCLERLAYOUT_OPTIMIZECONFIG = -7263929804585542187L;
    public static final long DXRECYCLERLAYOUT_OPTIMIZEINSERTITEMSANDROID = -8245943836193482557L;
    public static final long DXRECYCLERLAYOUT_ORIENTATION = -7199229155167727177L;
    public static final long DXRECYCLERLAYOUT_PAGINGENABLED = 8689803490594880558L;
    public static final long DXRECYCLERLAYOUT_PAGINGMODE = 919553102374151685L;
    public static final int DXRECYCLERLAYOUT_PAGINGMODE_CELL = 2;
    public static final int DXRECYCLERLAYOUT_PAGINGMODE_DEFAULT = 1;
    public static final int DXRECYCLERLAYOUT_PAGINGMODE_NONE = 0;
    public static final long DXRECYCLERLAYOUT_PREFETCHBATCHSIZE = 2756224129729260223L;
    public static final long DXRECYCLERLAYOUT_PREFETCHTYPE = -2067158110578807297L;
    public static final long DXRECYCLERLAYOUT_RECYCLERLAYOUT = -1365643441053437243L;
    public static final long DXRECYCLERLAYOUT_REFRESHFAILTEXT = -6298250044496356833L;
    public static final long DXRECYCLERLAYOUT_REFRESHLOADINGTEXT = 4423553470726895972L;
    public static final long DXRECYCLERLAYOUT_REFRESHNODATATEXT = 7669516849954401244L;
    public static final long DXRECYCLERLAYOUT_REFRESHPULLTEXT = 4728312954970318656L;
    public static final long DXRECYCLERLAYOUT_REFRESHRELEASETEXT = -5282950348472280217L;
    public static final long DXRECYCLERLAYOUT_REFRESHTEXTCOLOR = -3609244052663020381L;
    public static final long DXRECYCLERLAYOUT_REFRESHTEXTSIZE = 4290871577176589886L;
    public static final long DXRECYCLERLAYOUT_REFRESHTYPE = -3528588221250320484L;
    public static final int DXRECYCLERLAYOUT_REFRESHTYPE_PULLREFRESH = 0;
    public static final int DXRECYCLERLAYOUT_REFRESHTYPE_REFRESHMORE = 1;
    public static final long DXRECYCLERLAYOUT_RIGHTGAP = 6166552115852018494L;
    public static final long DXRECYCLERLAYOUT_SCROLLCONTROLCONFIG = 1689985387858694873L;
    public static final long DXRECYCLERLAYOUT_STARTREACHEDTHRESHOLD = -6236604739320595556L;
    public static final long DXRECYCLERLAYOUT_STREAM_RENDER_ANDROID = 8448128948058733248L;
    public static final long DXRECYCLERLAYOUT_VIDEOCONTROLCONFIG = -7801350391660369312L;
    public static final long DXSCROLLLAYOUTBASE_EXPOSURECONFIG = 6442732320864020959L;
    public static final String LOAD_MORE_EMPTY = "empty";
    public static final String LOAD_MORE_FAIL_STRING = "failed";
    public static final String LOAD_MORE_LOADING_STRING = "loading";
    public static final String LOAD_MORE_NO_DATA_STRING = "noMore";
    public static final String LOAD_MORE_STOPED = "stopped";
    public static final int LOAD_MORE_STRATEGY_DEPRECATED = 0;
    public static final int LOAD_MORE_STRATEGY_NEW = 1;
    public static final int LOAD_MORE_STRATEGY_NEW_WITHOUT_AUTO_LOADING = 2;
    public static final String MSG_METHOD_APPEND_ITEMS = "DXRecyclerLayout#appendItems";
    public static final String MSG_METHOD_DELETE_ITEMS = "DXRecyclerLayout#deleteItems";
    public static final String MSG_METHOD_INSERT_ITEMS = "DXRecyclerLayout#insertItems";
    public static final String MSG_METHOD_INSERT_ITEMS_BY_OFFSET = "DXRecyclerLayout#insertItemsByOffset";
    public static final String MSG_METHOD_LOAD_MORE = "DXRecyclerLayout#loadMore";
    public static final String MSG_METHOD_MODIFY_CURRENT_ITEM_DATA = "DXRecyclerLayout#modifyCurrentItemData";
    public static final String MSG_METHOD_PULL_LOAD_MORE = "DXRecyclerLayout#pullLoadMore";
    public static final String MSG_METHOD_PULL_TO_REFRESH = "DXRecyclerLayout#refresh";
    public static final String MSG_METHOD_REFRESH_DATA = "DXRecyclerLayout#refreshData";
    public static final String MSG_METHOD_UPDATE_ALL = "DXRecyclerLayout#updateAll";
    public static final String MSG_METHOD_UPDATE_CURRENT = "DXRecyclerLayout#updateCurrent";
    public static final String MSG_METHOD_UPDATE_ITEMS = "DXRecyclerLayout#updateItems";
    public static final String MSG_METHOD_UPDATE_STYLE = "DXRecyclerLayout#updateStyle";
    public static final int PREFETCH_TYPE_COMMON = 0;
    public static final int PREFETCH_TYPE_REVERSER = 1;
    public static final String TAG = "DXRecyclerLayout";
    private String A;
    private int B;
    private int C;
    private boolean F;
    private JSONObject H;
    private com.taobao.android.dinamicx.widget.recycler.g I;
    private ScrollListener J;
    private JSONArray K;
    private boolean L;
    private boolean M;
    private int N;
    private int T;
    private int U;
    private boolean X;
    private JSONObject Y;
    private com.taobao.android.dinamicx.widget.recycler.expose.c Z;
    private com.taobao.android.dinamicx.widget.recycler.c aa;
    private Object ac;
    private com.taobao.android.dinamicx.widget.recycler.b ad;
    private int ae;
    private int ag;
    private PagerSnapHelper ah;
    private gbf ai;
    private boolean aj;
    private JSONObject ak;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public String m;
    public String n;
    public String o;
    public int s;
    public fzy t;
    public gaf u;
    public gae v;
    private int x;
    private int y;
    private String z;
    public int f = 1;
    public String p = "加载中...";
    public String q = "下拉即可刷新...";
    public String r = "释放即可刷新...";
    private int D = 0;
    private boolean E = true;
    private int G = 0;
    private double O = 0.5d;
    private long P = 300;
    private ExposeHelperBuilder.REPEAT_MODE Q = ExposeHelperBuilder.REPEAT_MODE.NONE;
    private boolean R = true;
    private int S = 1;
    private int ao = 0;
    private boolean V = false;
    private int W = 0;
    private boolean al = false;
    private boolean am = false;
    private boolean an = false;
    private int ab = -1;
    private int af = 0;
    private boolean aq = false;
    private boolean ar = false;
    private int as = 6;
    public Map<String, Integer> w = new HashMap();
    private boolean ap = true;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface LoadMoreStatus {
    }

    static {
        kge.a(1275966773);
        kge.a(1655226774);
        kge.a(1698107197);
        kge.a(-1973314344);
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerLayout dXRecyclerLayout, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1756697323:
                return super.queryWTByAutoId(((Number) objArr[0]).intValue());
            case -1565688444:
                super.onDiff((DXWidgetNode) objArr[0]);
                return null;
            case -1456812170:
                super.onSetMapAttribute(((Number) objArr[0]).longValue(), (JSONObject) objArr[1]);
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1399192248:
                super.bindRuntimeContext((DXRuntimeContext) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -857616453:
                super.setBackground((View) objArr[0]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -630327606:
                super.sendBroadcastEvent((DXEvent) objArr[0]);
                return null;
            case -308326908:
                super.onBeginParser(((Boolean) objArr[0]).booleanValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1172714098:
                return super.queryWTByUserId((String) objArr[0]);
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 1825628053:
                return super.invokeRefMethod((String) objArr[0], (JSONArray) objArr[1]);
            case 2091670201:
                return super.exportMethods();
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ JSONObject a(DXRecyclerLayout dXRecyclerLayout, String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("cec2cd96", new Object[]{dXRecyclerLayout, str, jSONArray}) : super.invokeRefMethod(str, jSONArray);
    }

    public static /* synthetic */ com.taobao.android.dinamicx.widget.recycler.expose.c a(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.dinamicx.widget.recycler.expose.c) ipChange.ipc$dispatch("b8703d91", new Object[]{dXRecyclerLayout}) : dXRecyclerLayout.Z;
    }

    public static /* synthetic */ gab a(DXRecyclerLayout dXRecyclerLayout, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gab) ipChange.ipc$dispatch("3f7e58df", new Object[]{dXRecyclerLayout, new Integer(i)}) : dXRecyclerLayout.d(i);
    }

    public static /* synthetic */ void a(DXRecyclerLayout dXRecyclerLayout, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e42757b5", new Object[]{dXRecyclerLayout, new Integer(i), new Boolean(z)});
        } else {
            dXRecyclerLayout.c(i, z);
        }
    }

    public static /* synthetic */ void a(DXRecyclerLayout dXRecyclerLayout, RecyclerView.Adapter adapter, String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e4b6fb", new Object[]{dXRecyclerLayout, adapter, str, new Integer(i), new Integer(i2), str2});
        } else {
            dXRecyclerLayout.a(adapter, str, i, i2, str2);
        }
    }

    public static /* synthetic */ void a(DXRecyclerLayout dXRecyclerLayout, com.taobao.android.dinamicx.widget.recycler.h hVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edaacc1e", new Object[]{dXRecyclerLayout, hVar, list});
        } else {
            dXRecyclerLayout.a(hVar, list);
        }
    }

    public static /* synthetic */ void b(DXRecyclerLayout dXRecyclerLayout, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa687c0", new Object[]{dXRecyclerLayout, new Integer(i)});
        } else {
            dXRecyclerLayout.c(i);
        }
    }

    public static /* synthetic */ void b(DXRecyclerLayout dXRecyclerLayout, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea2b2314", new Object[]{dXRecyclerLayout, new Integer(i), new Boolean(z)});
        } else {
            dXRecyclerLayout.b(i, z);
        }
    }

    public static /* synthetic */ boolean b(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9815dfa7", new Object[]{dXRecyclerLayout})).booleanValue() : dXRecyclerLayout.an;
    }

    public static /* synthetic */ boolean c(DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2502f6c6", new Object[]{dXRecyclerLayout})).booleanValue() : dXRecyclerLayout.aj;
    }

    @Deprecated
    public DXRecyclerLayout() {
        setOrientation(1);
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(274368268);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXRecyclerLayout();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.e;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new DXRecyclerLayout();
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        K();
        y();
        setOrientation(getOrientation());
        if (this.f11994a == null || this.f11994a.size() == 0) {
            fux.b("this.dataSource == null || this.dataSource.size() == 0");
        }
        super.onBeforeBindChildData();
        if (!fqi.o()) {
            a(true);
        }
        List<DXWidgetNode> d = d();
        if (d == null || d.size() == 0) {
            if (this.f11994a != null && this.f11994a.size() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("生成的子节点为空，或者数量为 0 。 dataSource: ");
                sb.append(this.f11994a == null ? " null " : Integer.valueOf(this.f11994a.size()));
                a(com.taobao.android.dinamicx.s.DX_ERROR_CODE_RECYCLER_LAYOUT_ON_BEFORE_DATA, sb.toString());
            }
        } else {
            for (DXWidgetNode dXWidgetNode : d) {
                g(dXWidgetNode);
            }
        }
        if (B()) {
            this.ai = new gbf(getDXRuntimeContext().A());
        } else {
            this.ai = null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onDiff(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ad7d84", new Object[]{this, dXWidgetNode});
            return;
        }
        super.onDiff(dXWidgetNode);
        if (!fqi.X()) {
            return;
        }
        fxj.a(this, dXWidgetNode);
    }

    public boolean a(DXEvent dXEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad57a78", new Object[]{this, dXEvent, str})).booleanValue();
        }
        if (!fqi.X()) {
            return false;
        }
        boolean a2 = fxj.a(this, dXEvent);
        if (a2 || !fqi.al()) {
            return a2;
        }
        View v = getDXRuntimeContext().v();
        if (v == null) {
            return false;
        }
        DXWidgetNode b = gbh.b(v);
        if (b == null || ((DXRecyclerLayout) b).getReferenceNode() == this) {
            return a2;
        }
        if (DinamicXEngine.j()) {
            fuw.d("RecyclerLayoutTest", "onEvent: " + str + " not same node");
        }
        return true;
    }

    private void g(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde0eb81", new Object[]{this, dXWidgetNode});
        } else if (!(dXWidgetNode instanceof ac) || getDXRuntimeContext().p() == null) {
        } else {
            Map<String, String> a2 = fuz.a(getDXRuntimeContext().p());
            ac acVar = (ac) dXWidgetNode;
            if (acVar.k() != null) {
                return;
            }
            acVar.a(fuz.a(a2, "DX", TAG));
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(z, -1, -1);
        }
    }

    private void a(boolean z, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270908cc", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2)});
            return;
        }
        if (i < 0) {
            this.w.clear();
        }
        if (this.t == null) {
            return;
        }
        int max = Math.max(i, 0);
        int g = this.t.g();
        if (g <= 0 || g <= max) {
            return;
        }
        while (max < g) {
            a(this.t.b(max), max, z);
            max++;
        }
    }

    public void a(DXWidgetNode dXWidgetNode, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cbe38", new Object[]{this, dXWidgetNode, new Integer(i), new Boolean(z)});
        } else if (!(dXWidgetNode instanceof ac)) {
        } else {
            if (!TextUtils.isEmpty(dXWidgetNode.getUserId())) {
                this.w.put(dXWidgetNode.getUserId(), Integer.valueOf(i));
            }
            if (!z) {
                return;
            }
            ((ac) dXWidgetNode).f12039a = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByAutoId(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("974aed15", new Object[]{this, new Integer(i)}) : super.queryWTByAutoId(i);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str}) : super.queryWTByUserId(str);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (DinamicXEngine.j()) {
            float f = (float) (Runtime.getRuntime().totalMemory() / 1048576.0d);
            float freeMemory = (float) (Runtime.getRuntime().freeMemory() / 1048576.0d);
            String[] strArr = new String[1];
            StringBuilder sb = new StringBuilder();
            sb.append("内存优化");
            sb.append(getDXRuntimeContext().C().h() ? "开" : "关");
            sb.append(" dataSource ");
            sb.append(this.f11994a == null ? "null" : Integer.valueOf(this.f11994a.size()));
            sb.append(" / totalMem ");
            sb.append(f);
            sb.append(" / freeMem ");
            sb.append(freeMemory);
            strArr[0] = sb.toString();
            fuw.b("RLMemPerf", strArr);
        }
        if (this.ag != 2) {
            a(2);
        }
        C();
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            postEvent(new DXRecyclerLayoutLoadMoreEvent(this.userId));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r1.equals(com.taobao.android.dinamicx.widget.DXRecyclerLayout.MSG_METHOD_APPEND_ITEMS) != false) goto L21;
     */
    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onEvent(com.taobao.android.dinamicx.expression.event.DXEvent r9) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXRecyclerLayout.onEvent(com.taobao.android.dinamicx.expression.event.DXEvent):boolean");
    }

    public void a(Object obj, int i, com.taobao.analysis.v3.n nVar) {
        DXWidgetNode a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6267592", new Object[]{this, obj, new Integer(i), nVar});
            return;
        }
        if (this.f11994a != null && i >= 0 && i < this.f11994a.size()) {
            this.f11994a.set(i, obj);
        }
        if (L() || i < 0 || i >= M() || (a2 = a(obj, this.c, i, nVar)) == null) {
            return;
        }
        a(i, a2);
    }

    private boolean b(JSONObject jSONObject) {
        List<DXWidgetNode> d;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        com.taobao.analysis.v3.f a2 = a(jSONObject);
        JSONArray jSONArray = null;
        try {
            jSONArray = jSONObject.getJSONArray("data");
            if (jSONArray != null && jSONArray.size() > 0) {
                if (H() != null) {
                    this.Z.a(jSONArray);
                }
                o();
                clearExposureCache();
                fuz.a(a2, MSG_METHOD_REFRESH_DATA, "dataSize:" + jSONArray.size());
            } else {
                fuz.a(a2, MSG_METHOD_REFRESH_DATA, " dataSize null or 0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        if (this.ag == 0) {
            I();
        }
        if (fxr.a("resetScroll", jSONObject, (Boolean) false).booleanValue() && n() != null) {
            n().a();
        }
        a(jSONArray, a2);
        if (d() == null) {
            str = "null";
        } else {
            str = " itemSize " + d.size() + "";
        }
        fuz.a(a2, MSG_METHOD_REFRESH_DATA, str);
        fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    DXRecyclerLayout.this.p();
                }
            }
        }, 300L);
        O();
        return true;
    }

    private void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ec556", new Object[]{this});
            return;
        }
        Object obj = this.ac;
        if (obj == null || !(obj instanceof DXVideoControlConfig) || !((DXVideoControlConfig) obj).r()) {
            return;
        }
        stopVideoPlayControl();
        triggerVideoPlayControl();
    }

    private boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("status");
        char c = 65535;
        int hashCode = string.hashCode();
        if (hashCode != -1884319283) {
            if (hashCode == -648752041 && string.equals("triggered")) {
                c = 1;
            }
        } else if (string.equals(LOAD_MORE_STOPED)) {
            c = 0;
        }
        if (c == 0) {
            if (this.b == null) {
                return false;
            }
            this.b.d();
            return true;
        } else if (c != 1 || this.b == null) {
            return false;
        } else {
            this.b.e();
            return true;
        }
    }

    private boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("265ed169", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("status");
        char c = 65535;
        switch (string.hashCode()) {
            case -1884319283:
                if (string.equals(LOAD_MORE_STOPED)) {
                    c = 3;
                    break;
                }
                break;
            case -1281977283:
                if (string.equals("failed")) {
                    c = 1;
                    break;
                }
                break;
            case -1040845642:
                if (string.equals(LOAD_MORE_NO_DATA_STRING)) {
                    c = 2;
                    break;
                }
                break;
            case 96634189:
                if (string.equals("empty")) {
                    c = 4;
                    break;
                }
                break;
            case 336650556:
                if (string.equals("loading")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return a(2);
        }
        if (c == 1) {
            return a(3);
        }
        if (c == 2) {
            return a(5);
        }
        if (c == 3) {
            return a(4);
        }
        if (c == 4) {
            return a(6);
        }
        return false;
    }

    private boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87b16e08", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("status");
        char c = 65535;
        switch (string.hashCode()) {
            case -1884319283:
                if (string.equals(LOAD_MORE_STOPED)) {
                    c = 3;
                    break;
                }
                break;
            case -1281977283:
                if (string.equals("failed")) {
                    c = 1;
                    break;
                }
                break;
            case -1040845642:
                if (string.equals(LOAD_MORE_NO_DATA_STRING)) {
                    c = 2;
                    break;
                }
                break;
            case 336650556:
                if (string.equals("loading")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return b(2);
        }
        if (c == 1) {
            return b(3);
        }
        if (c == 2) {
            return b(5);
        }
        if (c == 3) {
            return b(4);
        }
        return false;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.i;
    }

    private void a(RecyclerView.Adapter adapter, String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62f77df", new Object[]{this, adapter, str, new Integer(i), new Integer(i2), str2});
        } else if (adapter == null) {
        } else {
            try {
                if (!TextUtils.isEmpty(str) && !"all".equals(str) && i >= 0 && !TextUtils.isEmpty(str2)) {
                    if (!str.equals(com.taobao.taolive.sdk.mergeInfo.b.TYPE_PART)) {
                        adapter.notifyDataSetChanged();
                        return;
                    }
                    char c = 65535;
                    switch (str2.hashCode()) {
                        case -1472811200:
                            if (str2.equals(MSG_METHOD_APPEND_ITEMS)) {
                                c = 3;
                                break;
                            }
                            break;
                        case -708482225:
                            if (str2.equals(MSG_METHOD_DELETE_ITEMS)) {
                                c = 0;
                                break;
                            }
                            break;
                        case -232077206:
                            if (str2.equals(MSG_METHOD_UPDATE_CURRENT)) {
                                c = 1;
                                break;
                            }
                            break;
                        case -160105743:
                            if (str2.equals(MSG_METHOD_UPDATE_ITEMS)) {
                                c = 2;
                                break;
                            }
                            break;
                        case 310191873:
                            if (str2.equals(MSG_METHOD_INSERT_ITEMS)) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    if (c == 0) {
                        ((com.taobao.android.dinamicx.widget.recycler.h) adapter).c();
                        adapter.notifyItemRangeRemoved(i, i2);
                        return;
                    } else if (c == 1 || c == 2) {
                        adapter.notifyItemRangeChanged(i, i2);
                        return;
                    } else if (c == 3) {
                        adapter.notifyItemRangeInserted(i, i2);
                        return;
                    } else if (c == 4) {
                        adapter.notifyItemInserted(i);
                        if (!this.aq) {
                            return;
                        }
                        adapter.notifyItemRangeChanged(i, this.f11994a.size() - i);
                        return;
                    } else {
                        adapter.notifyDataSetChanged();
                        return;
                    }
                }
                ((com.taobao.android.dinamicx.widget.recycler.h) adapter).c();
                adapter.notifyDataSetChanged();
            } catch (Throwable th) {
                com.taobao.android.dinamicx.exception.a.b(th);
            }
        }
    }

    private ac h(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ac) ipChange.ipc$dispatch("848e2fb7", new Object[]{this, dXWidgetNode}) : fzx.a(dXWidgetNode);
    }

    public int d(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af8e6f97", new Object[]{this, dXWidgetNode})).intValue();
        }
        ac h = h(dXWidgetNode);
        if (h != null && h.getDXRuntimeContext() != null) {
            return h.f12039a;
        }
        return -1;
    }

    public int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!this.w.containsKey(str)) {
            return -2;
        }
        return this.w.get(str).intValue();
    }

    public Map<String, Integer> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.w;
    }

    private void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else {
            a(false, "all", -1, 0, (String) null, true);
        }
    }

    private void a(String str, int i, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6348715c", new Object[]{this, str, new Integer(i), new Integer(i2), str2});
        } else {
            a(false, str, i, i2, str2, true);
        }
    }

    private void a(String str, int i, int i2, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c66cf8", new Object[]{this, str, new Integer(i), new Integer(i2), str2, new Boolean(z)});
        } else {
            a(false, str, i, i2, str2, z);
        }
    }

    public void a(final boolean z, final String str, final int i, final int i2, final String str2, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9d2e974", new Object[]{this, new Boolean(z), str, new Integer(i), new Integer(i2), str2, new Boolean(z2)});
            return;
        }
        try {
            if (this.b != null) {
                triggerExposure();
                this.b.a(false);
                RecyclerView b = this.b.b();
                if (b == null) {
                    return;
                }
                final RecyclerView.Adapter adapter = b.getAdapter();
                if (!(adapter instanceof com.taobao.android.dinamicx.widget.recycler.h)) {
                    return;
                }
                if (fqi.j(getDXRuntimeContext().A())) {
                    if (!b.isComputingLayout()) {
                        if (z) {
                            a((com.taobao.android.dinamicx.widget.recycler.h) adapter, d());
                        }
                        a(adapter, str, i, i2, str2);
                    } else {
                        fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (z) {
                                    DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                                    DXRecyclerLayout.a(dXRecyclerLayout, (com.taobao.android.dinamicx.widget.recycler.h) adapter, dXRecyclerLayout.d());
                                }
                                DXRecyclerLayout.a(DXRecyclerLayout.this, adapter, str, i, i2, str2);
                            }
                        });
                    }
                } else if (b.getScrollState() == 0 && !b.isComputingLayout()) {
                    if (z) {
                        a((com.taobao.android.dinamicx.widget.recycler.h) adapter, d());
                    }
                    a(adapter, str, i, i2, str2);
                } else {
                    fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.7
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (z) {
                                DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                                DXRecyclerLayout.a(dXRecyclerLayout, (com.taobao.android.dinamicx.widget.recycler.h) adapter, dXRecyclerLayout.d());
                            }
                            DXRecyclerLayout.a(DXRecyclerLayout.this, adapter, str, i, i2, str2);
                        }
                    });
                }
                fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            DXRecyclerLayout.this.q();
                        }
                    }
                }, 100L);
            }
            if (H() != null) {
                this.Z.a(this.f11994a);
            }
            if (!z2) {
                return;
            }
            a(true, i, i2);
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public boolean a(int i) {
        RecyclerView b;
        com.taobao.android.dinamicx.widget.recycler.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.b == null || (b = this.b.b()) == null || (hVar = (com.taobao.android.dinamicx.widget.recycler.h) b.getAdapter()) == null) {
            return false;
        }
        hVar.i(i);
        return true;
    }

    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        if (i == 4) {
            this.b.g();
        } else if (i == 3) {
            this.b.h();
        } else if (i == 5) {
            this.b.i();
        } else if (i == 2) {
            this.b.f();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
        } else {
            super.bindRuntimeContext(dXRuntimeContext, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        fzy fzyVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof DXRecyclerLayout)) {
        } else {
            super.onClone(dXWidgetNode, z);
            DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) dXWidgetNode;
            this.L = dXRecyclerLayout.L;
            this.f = dXRecyclerLayout.f;
            this.g = dXRecyclerLayout.g;
            this.h = dXRecyclerLayout.h;
            this.j = dXRecyclerLayout.j;
            this.m = dXRecyclerLayout.m;
            this.n = dXRecyclerLayout.n;
            this.o = dXRecyclerLayout.o;
            this.f11994a = dXRecyclerLayout.f11994a;
            if (fqi.ad()) {
                this.t = dXRecyclerLayout.t;
            }
            a(dXRecyclerLayout.d());
            this.d = dXRecyclerLayout.d;
            this.h = dXRecyclerLayout.h;
            this.i = dXRecyclerLayout.i;
            this.j = dXRecyclerLayout.j;
            this.k = dXRecyclerLayout.k;
            this.l = dXRecyclerLayout.l;
            this.x = dXRecyclerLayout.x;
            this.y = dXRecyclerLayout.y;
            this.p = dXRecyclerLayout.p;
            this.q = dXRecyclerLayout.q;
            this.r = dXRecyclerLayout.r;
            this.z = dXRecyclerLayout.z;
            this.A = dXRecyclerLayout.A;
            this.B = dXRecyclerLayout.B;
            this.C = dXRecyclerLayout.C;
            this.D = dXRecyclerLayout.D;
            this.s = dXRecyclerLayout.s;
            this.H = dXRecyclerLayout.H;
            this.J = dXRecyclerLayout.J;
            this.P = dXRecyclerLayout.P;
            this.O = dXRecyclerLayout.O;
            this.Z = dXRecyclerLayout.Z;
            this.R = dXRecyclerLayout.R;
            this.S = dXRecyclerLayout.S;
            this.aa = dXRecyclerLayout.aa;
            this.E = dXRecyclerLayout.E;
            com.taobao.android.dinamicx.widget.recycler.expose.c cVar = this.Z;
            if (cVar != null) {
                cVar.a(this.f11994a);
            }
            this.T = dXRecyclerLayout.T;
            this.U = dXRecyclerLayout.U;
            this.ab = dXRecyclerLayout.ab;
            this.V = dXRecyclerLayout.V;
            this.X = dXRecyclerLayout.X;
            this.ac = dXRecyclerLayout.ac;
            this.ae = dXRecyclerLayout.ae;
            if (!fqi.ad()) {
                this.t = dXRecyclerLayout.t;
            }
            gaf gafVar = dXRecyclerLayout.u;
            if (gafVar != null) {
                this.u = gafVar;
            }
            gae gaeVar = dXRecyclerLayout.v;
            if (gaeVar != null) {
                this.v = gaeVar;
            }
            this.af = dXRecyclerLayout.af;
            this.F = dXRecyclerLayout.F;
            this.G = dXRecyclerLayout.G;
            this.ah = dXRecyclerLayout.ah;
            this.ai = dXRecyclerLayout.ai;
            this.Y = dXRecyclerLayout.Y;
            this.Q = dXRecyclerLayout.Q;
            this.W = dXRecyclerLayout.W;
            this.ag = dXRecyclerLayout.ag;
            if (!com.taobao.android.dinamicx.model.f.e() && this.f11994a == null && (fzyVar = this.t) != null && fzyVar.d() != null) {
                this.f11994a = this.t.d();
            }
            this.aj = dXRecyclerLayout.aj;
            this.ak = dXRecyclerLayout.ak;
            this.al = dXRecyclerLayout.am;
            this.al = dXRecyclerLayout.al;
            this.an = dXRecyclerLayout.an;
            this.ao = dXRecyclerLayout.ao;
            this.ap = dXRecyclerLayout.ap;
            this.aq = dXRecyclerLayout.aq;
            this.ar = dXRecyclerLayout.ar;
            this.as = dXRecyclerLayout.as;
        }
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.f;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.g;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.l;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.s;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public JSONArray exportMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7cac5ab9", new Object[]{this});
        }
        if (this.K == null) {
            this.K = new JSONArray() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.6
                {
                    add("insert");
                    add("remove");
                    add("append");
                    add("update");
                    add("reload");
                    add("stopLoading");
                    add("finishedLoading");
                    add("beginUpdates");
                    add("endUpdates");
                    add("scrollTo");
                }
            };
            this.K.addAll(super.exportMethods());
        }
        return this.K;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0098, code lost:
        if (r9.equals("append") != false) goto L11;
     */
    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject invokeRefMethod(java.lang.String r9, com.alibaba.fastjson.JSONArray r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.DXRecyclerLayout.invokeRefMethod(java.lang.String, com.alibaba.fastjson.JSONArray):com.alibaba.fastjson.JSONObject");
    }

    private void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
        } else if (this.b == null || this.b.b() == null || jSONArray == null || jSONArray.size() <= 0 || !(jSONArray.get(0) instanceof Integer)) {
        } else {
            int intValue = ((Integer) jSONArray.get(0)).intValue();
            if (jSONArray.size() > 1 && (jSONArray.get(1) instanceof Boolean)) {
                z = jSONArray.getBooleanValue(1);
            }
            if (z) {
                a(this.b.b(), intValue);
                return;
            }
            this.b.b().scrollToPosition(intValue);
            if (!(this.b.b().getLayoutManager() instanceof StaggeredGridLayoutManager)) {
                return;
            }
            ((StaggeredGridLayoutManager) this.b.b().getLayoutManager()).scrollToPositionWithOffset(intValue, 0);
        }
    }

    private void a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85acc02d", new Object[]{this, recyclerView, new Integer(i)});
        } else if (recyclerView == null) {
        } else {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(0));
            int childLayoutPosition2 = recyclerView.getChildLayoutPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (i < childLayoutPosition) {
                recyclerView.smoothScrollToPosition(i);
            } else if (i <= childLayoutPosition2) {
                int i2 = i - childLayoutPosition;
                if (i2 < 0 || i2 >= recyclerView.getChildCount()) {
                    return;
                }
                recyclerView.smoothScrollBy(0, recyclerView.getChildAt(i2).getTop());
            } else {
                recyclerView.smoothScrollToPosition(i);
                this.N = i;
                this.M = true;
            }
        }
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
        } else if (!this.M) {
        } else {
            this.M = false;
            a(recyclerView, this.N);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void sendBroadcastEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da6df6ca", new Object[]{this, dXEvent});
            return;
        }
        if (fqi.as()) {
            if (dXEvent.getEventId() == 5288671110273408574L) {
                triggerVideoPlayControl();
            } else if (dXEvent.getEventId() == 5388973340095122049L) {
                stopVideoPlayControl();
            }
        }
        super.sendBroadcastEvent(dXEvent);
    }

    public void a(ac acVar) {
        fzy fzyVar;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bae5ebff", new Object[]{this, acVar});
        } else if (acVar == null || (fzyVar = this.t) == null || (a2 = fzyVar.a(acVar)) < 0 || acVar.getDXRuntimeContext() == null || !(acVar.getDXRuntimeContext().f() instanceof JSONObject)) {
        } else {
            a((JSONObject) acVar.getDXRuntimeContext().f(), a2, (com.taobao.analysis.v3.n) null);
            D();
        }
    }

    private void a(JSONArray jSONArray, com.taobao.analysis.v3.f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c671bab", new Object[]{this, jSONArray, fVar});
            return;
        }
        K();
        y();
        this.f11994a = jSONArray;
        a(a(this.f11994a, this.c, 0, this.f11994a.size(), fVar));
        if (fqi.o()) {
            a(true, "all", -1, 0, (String) null, false);
        } else {
            a(true, "all", -1, 0, (String) null, true);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        postEvent(new DXEvent(5288680013941347641L));
        DXEngineConfig a2 = getDXRuntimeContext().C().a();
        TBAbsRefreshHeader tBAbsRefreshHeader = null;
        com.taobao.android.dinamicx.o k = a2 == null ? null : a2.k();
        WaterfallLayout.a aVar = new WaterfallLayout.a();
        DXNestedScrollerView dxNestedScrollerView = getDXRuntimeContext().s().getDxNestedScrollerView(getDXRuntimeContext());
        if (dxNestedScrollerView != null) {
            dxNestedScrollerView.setFixVerticalScrollConflict(this.X);
        }
        WaterfallLayout.a f = aVar.a(this.f).b(this.g).c(getMarginLeft()).d(getMarginRight()).e(this.l).f(this.s);
        if (this.h != 1) {
            z = false;
        }
        WaterfallLayout.a h = f.b(z).a(w()).f(v()).a(E()).g(this.B).h(this.C);
        if (k != null) {
            tBAbsRefreshHeader = k.getRefreshHeaderView(getUserId());
        }
        this.b = h.a(tBAbsRefreshHeader).a(a(k)).a(dxNestedScrollerView).d(this.R).c(this.V).i(getOrientation()).e(this.L).a(k).a(getDXRuntimeContext().A()).a();
        if (getDXRuntimeContext() != null && getDXRuntimeContext().C() != null) {
            z2 = getDXRuntimeContext().C().m();
        }
        View a3 = this.b.a(context, z2);
        a3.setTag(R.id.dx_recycler_layout_view_tag, this.b);
        this.I = new com.taobao.android.dinamicx.widget.recycler.g(this);
        this.J = new ScrollListener(this.af, this);
        this.J.a(this.H, getDXRuntimeContext());
        if (k != null) {
            this.J.a(k.getExtraScrollerListener(getUserId()));
            this.I.a(k.getExtraPullRefreshListener(getUserId()));
        }
        this.b.a(this.I);
        this.b.a(this.J);
        c(this.b.b());
        b(this.b.b());
        return a3;
    }

    private String[] E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("aa04331b", new Object[]{this}) : new String[]{this.q, this.r, this.p, "刷新完成", this.z, this.A};
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginParser(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed9f4e04", new Object[]{this, new Boolean(z)});
        } else {
            super.onBeginParser(z);
        }
    }

    private gai a(com.taobao.android.dinamicx.o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gai) ipChange.ipc$dispatch("5c3536da", new Object[]{this, oVar});
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        if (dXRuntimeContext != null && dXRuntimeContext.C() != null && dXRuntimeContext.C().m() && v() && oVar != null) {
            return new gaj(getDXRuntimeContext().m(), oVar.getOnRefreshLoadMoreView(dXRuntimeContext.m(), this.userId));
        }
        return null;
    }

    private void b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1012817", new Object[]{this, recyclerView});
        } else if (recyclerView == null) {
        } else {
            try {
                DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
                com.taobao.android.dinamicx.videoc.b u = dXRuntimeContext.C().b().u();
                if (u == null || !u() || !u.b()) {
                    return;
                }
                String str = (TextUtils.isEmpty(dXRuntimeContext.A()) ? "" : dXRuntimeContext.A()) + "_" + (TextUtils.isEmpty(this.userId) ? TAG : this.userId);
                u.a(recyclerView, (DXVideoControlConfig) this.ac, str);
                u.a(recyclerView, str);
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
        } else if (this.b != null && (this.b.m() instanceof ScrollListener)) {
            this.J = (ScrollListener) this.b.m();
            this.J.a(this.H, getDXRuntimeContext());
            this.J.a();
        } else {
            DXEngineConfig a2 = getDXRuntimeContext().C().a();
            com.taobao.android.dinamicx.o k = a2 == null ? null : a2.k();
            this.J = new ScrollListener(this.af, this);
            this.J.a(this.H, getDXRuntimeContext());
            if (k != null) {
                this.J.a(k.getExtraScrollerListener(getUserId()));
                this.I.a(k.getExtraPullRefreshListener(getUserId()));
            }
            this.b.a(this.J);
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        if (isV4Node()) {
            if (getDxv4Properties().a() == null) {
                return;
            }
            if (getDxv4Properties().a().get(18903999933159L) == null && getDxv4Properties().a().get(-6544685697300501093L) == null) {
                return;
            }
        } else if (getEventHandlersExprNode() == null) {
            return;
        } else {
            if (getEventHandlersExprNode().get(18903999933159L) == null && getEventHandlersExprNode().get(-6544685697300501093L) == null) {
                return;
            }
        }
        if (this.b != null && (this.b.n() instanceof com.taobao.android.dinamicx.widget.recycler.b)) {
            this.ad = this.b.n();
            this.ad.a(this);
            return;
        }
        this.ad = new com.taobao.android.dinamicx.widget.recycler.b(this);
        this.b.a(this.ad);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        if (this.b != null && v()) {
            if (this.b.j() || this.b.k()) {
                return;
            }
            this.b.f();
        }
        postEvent(new DXEvent(DXRECYCLERLAYOUT_ONSTARTREACHED));
    }

    public RecyclerView l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("56522e71", new Object[]{this});
        }
        if (this.b == null) {
            return null;
        }
        return this.b.b();
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        RecyclerView b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        getDXRuntimeContext().C().b().b();
        super.onRenderView(context, view);
        if (view == null) {
            return;
        }
        if (getChildrenCount() > 0) {
            DXWidgetNode d = getDXRuntimeContext().d();
            if (d == null) {
                return;
            }
            d.removeAllChild();
            removeAllChild();
        }
        if (this.b == null && view != null) {
            Object tag = view.getTag(R.id.dx_recycler_layout_view_tag);
            if (tag instanceof WaterfallLayout) {
                this.b = (WaterfallLayout) tag;
            }
        }
        if (this.J == null) {
            F();
        }
        if (this.b != null && (b = this.b.b()) != null) {
            a(b, this.b, context);
            int i = this.G;
            if (i == 2) {
                PagerSnapHelper pagerSnapHelper = this.ah;
                if (!(pagerSnapHelper instanceof fzp)) {
                    a(pagerSnapHelper);
                    this.ah = N().a();
                }
            } else if (i == 1 || this.F) {
                PagerSnapHelper pagerSnapHelper2 = this.ah;
                if (pagerSnapHelper2 == null || (pagerSnapHelper2 instanceof fzp)) {
                    a(this.ah);
                    this.ah = N().b();
                }
            } else {
                a(this.ah);
                this.ah = null;
            }
            PagerSnapHelper pagerSnapHelper3 = this.ah;
            if (pagerSnapHelper3 != null) {
                a(pagerSnapHelper3);
                try {
                    this.ah.attachToRecyclerView(b);
                } catch (Throwable th) {
                    fux.b(th.getLocalizedMessage());
                }
            }
            gbf.a(b, this.ai, 0);
            gbh.a((View) b, (bi) this);
        }
        if (H() != null) {
            this.Z.a(this.f11994a);
        }
        ScrollListener scrollListener = this.J;
        if (scrollListener != null) {
            scrollListener.a();
        }
        if (fqi.am()) {
            ScrollListener scrollListener2 = this.J;
            if (scrollListener2 != null) {
                scrollListener2.a(this);
            }
            com.taobao.android.dinamicx.widget.recycler.g gVar = this.I;
            if (gVar != null) {
                gVar.a(this);
            }
        }
        G();
    }

    private esd N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esd) ipChange.ipc$dispatch("7cd5045b", new Object[]{this});
        }
        DXEngineConfig a2 = getDXRuntimeContext().C().a();
        return a2 == null ? new esd() : a2.B();
    }

    private void a(PagerSnapHelper pagerSnapHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef2529b", new Object[]{this, pagerSnapHelper});
        } else if (pagerSnapHelper == null) {
        } else {
            pagerSnapHelper.attachToRecyclerView(null);
        }
    }

    public void a(RecyclerView recyclerView, WaterfallLayout waterfallLayout, Context context) {
        Context context2;
        com.taobao.android.dinamicx.widget.recycler.h b;
        boolean z;
        com.taobao.android.dinamicx.widget.recycler.h a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585f1e1", new Object[]{this, recyclerView, waterfallLayout, context});
            return;
        }
        com.taobao.android.dinamicx.widget.recycler.h hVar = (com.taobao.android.dinamicx.widget.recycler.h) recyclerView.getAdapter();
        if (hVar == null) {
            if (J()) {
                a2 = b(context);
                com.taobao.android.dinamicx.widget.recycler.f fVar = (com.taobao.android.dinamicx.widget.recycler.f) a2;
                fVar.g(this.U);
                fVar.d(this.ap);
                fVar.p(this.ao);
            } else {
                a2 = a(context);
            }
            a(a2);
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        waterfallLayout.a(this.f, -1, this.g, this.l, this.s, paddingLeft, paddingRight, getPaddingTop(), paddingBottom, getMarginLeft(), getMarginRight(), w(), false, E(), null, this.h == 1, this.R, this.B, this.C, this.dXRuntimeContext.G());
        if (hVar instanceof com.taobao.android.dinamicx.widget.recycler.f) {
            if (J()) {
                ((com.taobao.android.dinamicx.widget.recycler.f) hVar).g(this.U);
                context2 = context;
                b = hVar;
                z = true;
            } else {
                context2 = context;
                b = a(context2);
                z = false;
            }
        } else {
            context2 = context;
            if (J()) {
                b = b(context2);
                ((com.taobao.android.dinamicx.widget.recycler.f) b).g(this.U);
                z = false;
            }
            b = hVar;
            z = true;
        }
        if (z) {
            boolean z2 = false;
            a(b, d(), false);
            b.a(this);
            b.a(this.m);
            b.b(this.n);
            b.c(this.o);
            b.j(this.x);
            b.k(this.y);
            if (this.j == 1) {
                z2 = true;
            }
            b.a(z2);
            if (this.ag == 0 && b.f() == 2 && fqi.X()) {
                b.i(this.S);
            }
            b.notifyDataSetChanged();
            return;
        }
        waterfallLayout.a(recyclerView, context2);
        a(b);
    }

    public com.taobao.android.dinamicx.widget.recycler.h a(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.recycler.h) ipChange.ipc$dispatch("5cda0441", new Object[]{this, context});
        }
        if (this.j == 1) {
            z = true;
        }
        com.taobao.android.dinamicx.widget.recycler.h hVar = new com.taobao.android.dinamicx.widget.recycler.h(context, z, getDXRuntimeContext().C().h());
        hVar.b(this.al);
        hVar.c(this.am);
        return hVar;
    }

    public com.taobao.android.dinamicx.widget.recycler.f b(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.recycler.f) ipChange.ipc$dispatch("9ef13162", new Object[]{this, context});
        }
        if (this.j == 1) {
            z = true;
        }
        com.taobao.android.dinamicx.widget.recycler.f fVar = new com.taobao.android.dinamicx.widget.recycler.f(context, z, getDXRuntimeContext().C().h());
        fVar.b(this.al);
        fVar.c(this.am);
        return fVar;
    }

    public WaterfallLayout m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WaterfallLayout) ipChange.ipc$dispatch("88ef2001", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        if (this.b == null && view != null) {
            Object tag = view.getTag(R.id.dx_recycler_layout_view_tag);
            if (tag instanceof WaterfallLayout) {
                this.b = (WaterfallLayout) tag;
            }
        }
        if (this.b != null) {
            if (hasCornerRadius()) {
                int cornerRadius = getCornerRadius();
                WaterfallLayout.b bVar = new WaterfallLayout.b();
                if (cornerRadius > 0) {
                    bVar.a(view, cornerRadius);
                } else {
                    bVar.a(view, getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom());
                }
                this.b.a(bVar);
            } else {
                com.taobao.android.dinamicx.view.a l = this.b.l();
                if (l != null) {
                    l.a(view, 0.0f);
                }
            }
        }
        super.setBackground(view);
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

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        removeAllChild();
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == -5948810534719014123L) {
            this.f11994a = jSONArray;
            this.propertyInitFlag |= 2;
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DXRECYCLERLAYOUT_LOADMOREFAILTEXT) {
            this.m = str;
        } else if (j == DXRECYCLERLAYOUT_LOADMORELOADINGTEXT) {
            this.n = str;
        } else if (j == DXRECYCLERLAYOUT_LOADMORENOMOREDATATEXT) {
            this.o = str;
        } else if (j == DXRECYCLERLAYOUT_REFRESHLOADINGTEXT) {
            this.p = str;
        } else if (j == DXRECYCLERLAYOUT_REFRESHPULLTEXT) {
            this.q = str;
        } else if (j == DXRECYCLERLAYOUT_REFRESHRELEASETEXT) {
            this.r = str;
        } else if (j == DXRECYCLERLAYOUT_REFRESHFAILTEXT) {
            this.z = str;
        } else if (j == DXRECYCLERLAYOUT_REFRESHNODATATEXT) {
            this.A = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXRECYCLERLAYOUT_EXPOSURETIMEFACTOR) {
            this.P = j2;
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DXRECYCLERLAYOUT_EXPOSURESPACEFACTOR) {
            this.O = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 4480460401770252962L) {
            this.f = i;
        } else if (j == DXRECYCLERLAYOUT_COLUMNGAP) {
            this.g = i;
        } else if (j == DXRECYCLERLAYOUT_DISABLEBOUNCES) {
            this.h = i;
        } else if (j == DXRECYCLERLAYOUT_ENDREACHEDTHRESHOLD) {
            this.i = i;
        } else if (j == 2380170249149374095L) {
            this.j = i;
        } else if (j == DXRECYCLERLAYOUT_ISOPENPULLTOREFRESH) {
            this.k = i;
        } else if (j == DXRECYCLERLAYOUT_LEFTGAP) {
            this.l = i;
        } else if (j == DXRECYCLERLAYOUT_LOADMORETEXTCOLOR) {
            this.x = i;
        } else if (j == DXRECYCLERLAYOUT_LOADMORETEXTSIZE) {
            this.y = i;
        } else if (j == DXRECYCLERLAYOUT_RIGHTGAP) {
            this.s = i;
        } else if (j == DXRECYCLERLAYOUT_ENABLELEFTGAPWHENSINGLECOLUMN) {
            if (i != 0) {
                z = true;
            }
            this.R = z;
        } else if (j == DXRECYCLERLAYOUT_DEFAULTLOADMORESTATUS) {
            this.S = i;
        } else if (j == DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME) {
            if (i == 1) {
                z = true;
            }
            this.E = z;
        } else if (j == DXRECYCLERLAYOUT_OPENPREFETCH) {
            this.T = i;
        } else if (j == DXRECYCLERLAYOUT_PREFETCHBATCHSIZE) {
            this.U = i;
        } else if (j == DXRECYCLERLAYOUT_STARTREACHEDTHRESHOLD) {
            this.ab = i;
        } else if (j == DXRECYCLERLAYOUT_NEEDITEMANIMATION) {
            if (i == 1) {
                z = true;
            }
            this.V = z;
        } else if (j == DXRECYCLERLAYOUT_FIXVERTICALSCROLLCONFLICT) {
            if (i == 1) {
                z = true;
            }
            this.X = z;
        } else if (j == DXRECYCLERLAYOUT_ADAPTERTYPE) {
            this.ae = i;
        } else if (DXRECYCLERLAYOUT_ANDROIDSUPPORT == j) {
            this.af = i;
        } else if (j == DXRECYCLERLAYOUT_PAGINGENABLED) {
            if (i == 1) {
                z = true;
            }
            this.F = z;
        } else if (j == DXRECYCLERLAYOUT_PAGINGMODE) {
            this.G = i;
        } else if (j == DXRECYCLERLAYOUT_ANDROIDDISABLESTICKYRECYCLE) {
            if (i == 1) {
                z = true;
            }
            this.L = z;
        } else if (j == DXRECYCLERLAYOUT_REFRESHTEXTCOLOR) {
            this.B = i;
        } else if (j == DXRECYCLERLAYOUT_REFRESHTEXTSIZE) {
            this.C = i;
        } else if (j == DXRECYCLERLAYOUT_REFRESHTYPE) {
            this.D = i;
        } else if (j == 6042404229400734461L) {
            this.W = i;
        } else if (j == DXRECYCLERLAYOUT_LOADMORESTRATEGY) {
            this.ag = i;
        } else if (j == DXRECYCLERLAYOUT_PREFETCHTYPE) {
            this.ao = i;
        } else if (j == DXRECYCLERLAYOUT_NEEDSCHEDULEONPREFETCH) {
            if (i == 1) {
                z = true;
            }
            this.ap = z;
        } else if (j == DXRECYCLERLAYOUT_OPTIMIZEINSERTITEMSANDROID) {
            if (i == 1) {
                z = true;
            }
            this.aq = z;
        } else if (j == DXRECYCLERLAYOUT_STREAM_RENDER_ANDROID) {
            if (i == 1) {
                z = true;
            }
            this.ar = z;
        } else if (j == DXRECYCLERLAYOUT_MAX_STREAM_RENDER_COUNT) {
            this.as = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetMapAttribute(long j, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92acf76", new Object[]{this, new Long(j), jSONObject});
        } else if (j == DXRECYCLERLAYOUT_SCROLLCONTROLCONFIG) {
            this.H = jSONObject;
        } else if (j == 6442732320864020959L) {
            this.Y = jSONObject;
        } else if (j == DXRECYCLERLAYOUT_OPTIMIZECONFIG) {
            this.ak = jSONObject;
            JSONObject jSONObject2 = this.ak;
            if (jSONObject2 == null) {
                return;
            }
            this.al = jSONObject2.getBooleanValue("disableAppear");
            this.am = this.ak.getBooleanValue("disableDisAppear");
            this.an = this.ak.getBooleanValue("exposureOnWorkThread");
        } else {
            super.onSetMapAttribute(j, jSONObject);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
        } else if (j == -7801350391660369312L) {
            this.ac = obj;
        } else {
            super.onSetObjAttribute(j, obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 4480460401770252962L || j == DXRECYCLERLAYOUT_ENABLETRACKSTAYTIME) {
            return 1;
        }
        if (j != DXRECYCLERLAYOUT_REFRESHTYPE && j != 6042404229400734461L) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void updateRefreshType(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22ac2b0", new Object[]{this, new Integer(i)});
        } else if (fqi.G() && getDXRuntimeContext().G() && i == 0) {
            fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    if (DXRecyclerLayout.this.dXRuntimeContext != null) {
                        DXRecyclerLayout.this.dXRuntimeContext.d(i);
                    }
                    if (DXRecyclerLayout.this.d() == null) {
                        return;
                    }
                    for (DXWidgetNode dXWidgetNode : DXRecyclerLayout.this.d()) {
                        dXWidgetNode.updateRefreshType(i);
                    }
                }
            });
        } else {
            if (this.dXRuntimeContext != null) {
                this.dXRuntimeContext.d(i);
            }
            if (d() == null) {
                return;
            }
            for (DXWidgetNode dXWidgetNode : d()) {
                dXWidgetNode.updateRefreshType(i);
            }
        }
    }

    public ScrollListener n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ScrollListener) ipChange.ipc$dispatch("e0e0aa37", new Object[]{this}) : this.J;
    }

    public boolean e(DXWidgetNode dXWidgetNode) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9a9ee47", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if ((dXWidgetNode instanceof ac) && dXWidgetNode.getDXRuntimeContext().f() != null) {
            e = (JSONObject) dXWidgetNode.getDXRuntimeContext().f();
        } else {
            e = dXWidgetNode.getDXRuntimeContext().e();
        }
        return a(dXWidgetNode, e);
    }

    public boolean a(DXWidgetNode dXWidgetNode, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a1617ef", new Object[]{this, dXWidgetNode, jSONObject, new Boolean(z)})).booleanValue();
        }
        ac h = h(dXWidgetNode);
        if (h == null) {
            return false;
        }
        int i = i(h);
        if (i < 0) {
            a(com.taobao.android.dinamicx.s.DX_ERROR_CODE_RECYCLER_LAYOUT_230005, "index: " + i);
            return false;
        }
        a(jSONObject, i, (com.taobao.analysis.v3.n) null);
        if (!z) {
            if (fqi.o()) {
                a(com.taobao.taolive.sdk.mergeInfo.b.TYPE_PART, i, 1, MSG_METHOD_UPDATE_CURRENT, false);
            } else {
                a(com.taobao.taolive.sdk.mergeInfo.b.TYPE_PART, i, 1, MSG_METHOD_UPDATE_CURRENT, true);
            }
        }
        return true;
    }

    public boolean a(DXWidgetNode dXWidgetNode, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bae1c0d", new Object[]{this, dXWidgetNode, jSONObject})).booleanValue() : a(dXWidgetNode, jSONObject, false);
    }

    public boolean f(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3c56ce6", new Object[]{this, dXWidgetNode})).booleanValue();
        }
        if ((dXWidgetNode instanceof ac) && dXWidgetNode.getDXRuntimeContext().f() != null) {
            dXWidgetNode.getDXRuntimeContext().f();
        } else {
            dXWidgetNode.getDXRuntimeContext().e();
        }
        ac h = h(dXWidgetNode);
        if (h == null) {
            return false;
        }
        int i = i(h);
        if (i < 0) {
            a(com.taobao.android.dinamicx.s.DX_ERROR_CODE_RECYCLER_LAYOUT_230007, "index: " + i);
            return false;
        }
        fux.a(" updateCurrent 获取到的index 为" + i);
        a(com.taobao.taolive.sdk.mergeInfo.b.TYPE_PART, i, 1, MSG_METHOD_UPDATE_CURRENT);
        return true;
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        DXEvent dXEvent = new DXEvent(2228800223520853672L);
        HashMap hashMap = new HashMap();
        hashMap.put("index", com.taobao.android.dinamicx.expression.expr_v2.f.a(i));
        hashMap.put("sticky", com.taobao.android.dinamicx.expression.expr_v2.f.a(z));
        dXEvent.setArgs(hashMap);
        postEvent(dXEvent);
    }

    private void c(final RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba1ea98", new Object[]{this, recyclerView});
            return;
        }
        if (isV4Node()) {
            if (getDxv4Properties().a() == null) {
                return;
            }
            if (getDxv4Properties().a().get(DXScrollLayoutBaseExposeEvent.DXSCROLLLAYOUTBASE_ONEXPOSURE) == null && getDxv4Properties().a().get(9859236201376900L) == null) {
                return;
            }
        } else if (getEventHandlersExprNode() == null) {
            return;
        } else {
            if (getEventHandlersExprNode().get(DXScrollLayoutBaseExposeEvent.DXSCROLLLAYOUTBASE_ONEXPOSURE) == null && getEventHandlersExprNode().get(9859236201376900L) == null) {
                return;
            }
        }
        JSONObject jSONObject = this.Y;
        if (jSONObject != null) {
            this.P = jSONObject.getLong(ftu.PLAY_DELAY).longValue();
            this.O = this.Y.getFloat(ftu.VIEW_AREA_PERCENT).floatValue();
            if (this.Y.containsKey("useDefinedExposeUniqueId")) {
                this.aj = this.Y.getBoolean("useDefinedExposeUniqueId").booleanValue();
            }
            if (this.Y.getInteger(com.taobao.android.dinamicx_v4.animation.util.b.REPEAT_MODE).intValue() == 1) {
                this.Q = ExposeHelperBuilder.REPEAT_MODE.CELL_REPEAT;
            } else {
                this.Q = ExposeHelperBuilder.REPEAT_MODE.NONE;
            }
        }
        if (!isV4Node() ? !(getEventHandlersExprNode().get(9859236201376900L) == null || !this.E) : !(getDxv4Properties().a().get(9859236201376900L) == null || !this.E)) {
            z = true;
        }
        this.Z = new ExposeHelperBuilder(recyclerView, new fzr() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzr
            public void a(final int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                gab a2 = DXRecyclerLayout.a(DXRecyclerLayout.this, i);
                if (a2 != null && a2.a()) {
                    if (DXRecyclerLayout.a(DXRecyclerLayout.this).i() == null || !a2.b()) {
                        return;
                    }
                    DXRecyclerLayout.a(DXRecyclerLayout.this).i().a(i);
                    return;
                }
                if (DinamicXEngine.j()) {
                    fuw.d("nov_expose", "userId:" + DXRecyclerLayout.this.userId + " pos:" + i + " repeat false");
                }
                if (!DXRecyclerLayout.b(DXRecyclerLayout.this) || !bx.a()) {
                    fxe.a(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            int i2;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (recyclerView == null || DXRecyclerLayout.a(DXRecyclerLayout.this) == null) {
                            } else {
                                List<Object> h = DXRecyclerLayout.a(DXRecyclerLayout.this).h();
                                if (h == null || (i2 = i) < 0 || i2 >= h.size()) {
                                    DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("发送曝光条件异常 ds: ");
                                    sb.append(h == null ? "null" : Integer.valueOf(h.size()));
                                    sb.append(" pos ");
                                    sb.append(i);
                                    dXRecyclerLayout.a(com.taobao.android.dinamicx.s.DX_ERROR_CODE_RECYCLER_LAYOUT_230006, sb.toString());
                                    return;
                                }
                                Object obj = h.get(i);
                                if (obj instanceof JSONObject) {
                                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(i, (JSONObject) obj));
                                } else if (DXRecyclerLayout.this.getDXRuntimeContext() == null || !DXRecyclerLayout.this.getDXRuntimeContext().O() || !(obj instanceof Object)) {
                                } else {
                                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(i, obj));
                                }
                            }
                        }
                    });
                } else {
                    fxe.e(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            int i2;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (recyclerView == null || DXRecyclerLayout.a(DXRecyclerLayout.this) == null) {
                            } else {
                                List<Object> h = DXRecyclerLayout.a(DXRecyclerLayout.this).h();
                                if (h == null || (i2 = i) < 0 || i2 >= h.size()) {
                                    DXRecyclerLayout dXRecyclerLayout = DXRecyclerLayout.this;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("发送曝光条件异常 ds: ");
                                    sb.append(h == null ? "null" : Integer.valueOf(h.size()));
                                    sb.append(" pos ");
                                    sb.append(i);
                                    dXRecyclerLayout.a(com.taobao.android.dinamicx.s.DX_ERROR_CODE_RECYCLER_LAYOUT_230006, sb.toString());
                                    return;
                                }
                                Object obj = h.get(i);
                                if (obj instanceof JSONObject) {
                                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(i, (JSONObject) obj));
                                } else if (DXRecyclerLayout.this.getDXRuntimeContext() == null || !DXRecyclerLayout.this.getDXRuntimeContext().O() || !(obj instanceof Object)) {
                                } else {
                                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(i, obj));
                                }
                            }
                        }
                    });
                }
                DXRecyclerLayout.b(DXRecyclerLayout.this, i, false);
                DXRecyclerLayout.b(DXRecyclerLayout.this, i);
            }
        }).a(new fzs() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzs
            public String a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (String) ipChange2.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)});
                }
                if (DXRecyclerLayout.c(DXRecyclerLayout.this) && DXRecyclerLayout.this.l() != null && DXRecyclerLayout.this.l().getAdapter() != null) {
                    DXWidgetNode n = ((com.taobao.android.dinamicx.widget.recycler.h) DXRecyclerLayout.this.l().getAdapter()).n(i);
                    if (n instanceof ac) {
                        String v = ((ac) n).v();
                        if (!TextUtils.isEmpty(v)) {
                            return v;
                        }
                    }
                }
                return i + "";
            }
        }).a(new fzt() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzt
            public boolean a(int i) {
                RecyclerView.Adapter adapter;
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : (DXRecyclerLayout.this.l() == null || (adapter = DXRecyclerLayout.this.l().getAdapter()) == null || adapter.getItemViewType(i) != -1) ? false : true;
            }
        }).a(this.Q, new fzw() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzw
            public void a(int i) {
                List<Object> h;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    return;
                }
                gab a2 = DXRecyclerLayout.a(DXRecyclerLayout.this, i);
                if (a2 != null && !a2.b()) {
                    return;
                }
                if (DinamicXEngine.j()) {
                    fuw.d("nov_expose", "userId:" + DXRecyclerLayout.this.userId + " pos:" + i + " repeat true");
                }
                if (recyclerView != null && DXRecyclerLayout.a(DXRecyclerLayout.this) != null && (h = DXRecyclerLayout.a(DXRecyclerLayout.this).h()) != null && i >= 0 && i < h.size()) {
                    Object obj = h.get(i);
                    if (obj instanceof JSONObject) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE, i, (JSONObject) obj));
                    } else if (DXRecyclerLayout.this.getDXRuntimeContext() != null && DXRecyclerLayout.this.getDXRuntimeContext().O() && (obj instanceof Object)) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnExposeEvent(DXRecyclerLayout.DXRECYCLERLAYOUT_ONREPEATEXPOSE, i, obj));
                    }
                }
                DXRecyclerLayout.b(DXRecyclerLayout.this, i, true);
                DXRecyclerLayout.a(DXRecyclerLayout.this, i, false);
            }

            @Override // tb.fzw
            public void b(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
                } else {
                    DXRecyclerLayout.a(DXRecyclerLayout.this, i, true);
                }
            }
        }).a(this.P).a((float) this.O).a(z ? new fzu() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.fzu
            public void a(final int i, final long j) {
                List<Object> h;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c115689", new Object[]{this, new Integer(i), new Long(j)});
                    return;
                }
                if (DinamicXEngine.j()) {
                    fuw.d("nov_expose_stay", "userId:" + DXRecyclerLayout.this.userId + " pos:" + i + " stayTime: " + j);
                }
                if (recyclerView == null || DXRecyclerLayout.a(DXRecyclerLayout.this) == null || (h = DXRecyclerLayout.a(DXRecyclerLayout.this).h()) == null || i < 0 || i >= h.size()) {
                    return;
                }
                final Object obj = h.get(i);
                if (obj instanceof JSONObject) {
                    if (!DXRecyclerLayout.b(DXRecyclerLayout.this) || !bx.a()) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(i, (JSONObject) obj, j));
                    } else {
                        fxe.e(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(i, (JSONObject) obj, j));
                                }
                            }
                        });
                    }
                } else if (DXRecyclerLayout.this.getDXRuntimeContext() == null || !DXRecyclerLayout.this.getDXRuntimeContext().O() || !(obj instanceof Object)) {
                } else {
                    if (!DXRecyclerLayout.b(DXRecyclerLayout.this) || !bx.a()) {
                        DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(i, obj, j));
                    } else {
                        fxe.e(new Runnable() { // from class: com.taobao.android.dinamicx.widget.DXRecyclerLayout.4.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                } else {
                                    DXRecyclerLayout.this.postEvent(new DXRecyclerLayoutOnStayEvent(i, obj, j));
                                }
                            }
                        });
                    }
                }
            }
        } : null).a();
        if (!(recyclerView instanceof DXRecyclerView)) {
            return;
        }
        ((DXRecyclerView) recyclerView).setExposeHelper(this.Z);
    }

    private void b(int i, boolean z) {
        fzy z2;
        DXWidgetNode b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f7cdda", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = (DXRecyclerLayout) gbh.b(l());
        if (dXRecyclerLayout == null || (z2 = dXRecyclerLayout.z()) == null || (b = z2.b(i)) == null) {
            return;
        }
        DXViewEvent dXViewEvent = new DXViewEvent(5288689083281052505L);
        HashMap hashMap = new HashMap();
        hashMap.put("isRepeat", com.taobao.android.dinamicx.expression.expr_v2.f.a(z));
        dXViewEvent.setArgs(hashMap);
        b.postEvent(dXViewEvent);
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        gab d = d(i);
        if (d == null) {
            return;
        }
        d.b(true);
    }

    private void c(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5de091b", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        gab d = d(i);
        if (d == null) {
            return;
        }
        d.a(z);
    }

    private gab d(int i) {
        fzy z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gab) ipChange.ipc$dispatch("b1eaec46", new Object[]{this, new Integer(i)});
        }
        if (fqi.ac() && gbh.b(l()) != null && (z = ((DXRecyclerLayout) gbh.b(l())).z()) != null) {
            return z.a(i);
        }
        return null;
    }

    private com.taobao.android.dinamicx.widget.recycler.expose.c H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.widget.recycler.expose.c) ipChange.ipc$dispatch("2101fe26", new Object[]{this});
        }
        if (this.Z == null) {
            if (this.b == null || this.b.b() == null || !(this.b.b() instanceof DXRecyclerView)) {
                return null;
            }
            this.Z = ((DXRecyclerView) this.b.b()).getExposeHelper();
            if (this.Z == null) {
                c(this.b.b());
            }
            com.taobao.android.dinamicx.widget.recycler.expose.c cVar = this.Z;
            if (cVar != null && cVar.h() == null) {
                this.Z.a(this.f11994a);
            }
        }
        return this.Z;
    }

    @Override // tb.fyx
    public void triggerVideoPlayControl() {
        DinamicXEngine b;
        com.taobao.android.dinamicx.videoc.b u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e421036d", new Object[]{this});
            return;
        }
        RecyclerView l = l();
        if (l == null || (b = getDXRuntimeContext().C().b()) == null || (u = b.u()) == null) {
            return;
        }
        u.b(l);
    }

    @Override // tb.fyx
    public void stopVideoPlayControl() {
        DinamicXEngine b;
        com.taobao.android.dinamicx.videoc.b u;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d6dacb7", new Object[]{this});
            return;
        }
        RecyclerView l = l();
        if (l == null || (b = getDXRuntimeContext().C().b()) == null || (u = b.u()) == null) {
            return;
        }
        u.d(l);
    }

    @Override // tb.fyu
    public void triggerExposure() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b318fbe6", new Object[]{this});
            return;
        }
        if (H() != null) {
            H().g();
        }
        try {
            DXRecyclerLayout r = r();
            if (r != null && r != this) {
                r.triggerExposure();
            }
        } catch (Throwable th) {
            fuw.a(TAG, "triggerExposure ", th);
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        if (H() != null) {
            H().a();
        }
        try {
            DXRecyclerLayout r = r();
            if (r == null) {
                return;
            }
            r.o();
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        if (H() != null) {
            H().b();
        }
        try {
            DXRecyclerLayout r = r();
            if (r == null) {
                return;
            }
            r.p();
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        if (H() != null) {
            H().c();
        }
        try {
            DXRecyclerLayout r = r();
            if (r == null) {
                return;
            }
            r.q();
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    @Override // tb.fyu
    public void clearExposureCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972e4af5", new Object[]{this});
            return;
        }
        if (H() != null) {
            H().f();
        }
        try {
            DXRecyclerLayout r = r();
            if (r == null) {
                return;
            }
            r.clearExposureCache();
        } catch (Throwable th) {
            com.taobao.android.dinamicx.exception.a.b(th);
        }
    }

    public DXRecyclerLayout r() {
        DXRecyclerLayout dXRecyclerLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("ba592415", new Object[]{this});
        }
        RecyclerView recyclerView = getDXRuntimeContext().s().getDxNestedScrollerView(getDXRuntimeContext()).getmChildList();
        if (!(recyclerView instanceof DXRecyclerView) || (dXRecyclerLayout = (DXRecyclerLayout) gbh.b((DXRecyclerView) recyclerView)) == this) {
            return null;
        }
        return dXRecyclerLayout;
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else {
            a(4);
        }
    }

    private boolean f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e9040aa7", new Object[]{this, jSONObject})).booleanValue();
        }
        int a2 = fxr.a(Constants.Name.LEFT_GAP, jSONObject, i());
        int a3 = fxr.a(Constants.Name.RIGHT_GAP, jSONObject, j());
        int a4 = fxr.a(Constants.Name.COLUMN_GAP, jSONObject, h());
        if (a2 == i() && a3 == j() && a4 == h()) {
            return false;
        }
        setNeedRender(getDXRuntimeContext().m());
        return true;
    }

    public int s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("66a136d", new Object[]{this})).intValue() : this.ab;
    }

    public void a(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c190d17", new Object[]{this, new Boolean(z), new Integer(i)});
            return;
        }
        RecyclerView l = l();
        if (l == null) {
            return;
        }
        ((StaggeredGridLayoutManager) l.getLayoutManager()).scrollToPositionWithOffset(i, 0);
        com.taobao.android.dinamicx.widget.recycler.c cVar = this.aa;
        if (cVar == null) {
            return;
        }
        cVar.a(i);
    }

    public void a(com.taobao.android.dinamicx.widget.recycler.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7561aee", new Object[]{this, cVar});
        } else {
            this.aa = cVar;
        }
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            return;
        }
        a(i, str + " rlId: " + getUserId(), DXMonitorConstant.DX_MONITOR_RECYCLER, DXMonitorConstant.DX_MONITOR_RECYCLER_ERROR);
    }

    public com.taobao.analysis.v3.f a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.analysis.v3.f) ipChange.ipc$dispatch("5e3defa9", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        Object obj = jSONObject.get(ABILITY_SPAN);
        if (!(obj instanceof com.taobao.analysis.v3.f)) {
            return null;
        }
        return (com.taobao.analysis.v3.f) obj;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.R;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6864280", new Object[]{this})).booleanValue() : this.ac instanceof DXVideoControlConfig;
    }

    public boolean v() {
        com.taobao.android.dinamicx.r C;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6945a01", new Object[]{this})).booleanValue();
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        return (dXRuntimeContext == null || (C = dXRuntimeContext.C()) == null || C.m()) && this.k == 1 && this.D == 1;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6a27182", new Object[]{this})).booleanValue() : this.k == 1 && this.D == 0;
    }

    private boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : this.T == 1 && fqi.k();
    }

    private void a(com.taobao.android.dinamicx.widget.recycler.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75860c9", new Object[]{this, hVar});
            return;
        }
        hVar.setHasStableIds(true);
        hVar.a(this);
        a(hVar, d());
        hVar.a();
        hVar.a(this.m);
        hVar.b(this.n);
        hVar.c(this.o);
        hVar.j(this.x);
        hVar.k(this.y);
        hVar.i(this.S);
        hVar.e(this.ar);
        hVar.q(this.as);
        hVar.b(this.al);
        hVar.c(this.am);
        this.b.a(hVar);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public ArrayList<DXWidgetNode> a(List<Object> list, List<DXWidgetNode> list2, int i, int i2, com.taobao.analysis.v3.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c0a6aa17", new Object[]{this, list, list2, new Integer(i), new Integer(i2), nVar});
        }
        fzy fzyVar = this.t;
        if (fzyVar == null) {
            return null;
        }
        return fzyVar.a(this, this.f11994a, list2, i, i2, nVar);
    }

    public DXWidgetNode a(Object obj, List<DXWidgetNode> list, int i, com.taobao.analysis.v3.n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("cf9bb920", new Object[]{this, obj, list, new Integer(i), nVar});
        }
        fzy fzyVar = this.t;
        if (fzyVar == null) {
            return null;
        }
        return fzyVar.a(this, obj, this.f11994a, list, i, nVar);
    }

    private void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
            return;
        }
        gaa gaaVar = getDXRuntimeContext().C().h() ? new gaa(getDXRuntimeContext().C().i()) : null;
        int i = this.ae;
        if (i == 0) {
            this.t = new fzz(gaaVar);
        } else if (i != 1) {
        } else {
            this.t = new gac(gaaVar);
        }
    }

    public ArrayList<DXWidgetNode> x() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("8b63f759", new Object[]{this}) : this.c;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        if (this.ae == 0) {
            this.u = new gag();
        }
        this.v = new gae();
    }

    private void a(com.taobao.android.dinamicx.widget.recycler.h hVar, List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae63bba", new Object[]{this, hVar, list});
        } else {
            a(hVar, list, true);
        }
    }

    private void a(com.taobao.android.dinamicx.widget.recycler.h hVar, List<DXWidgetNode> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51e1ee5a", new Object[]{this, hVar, list, new Boolean(z)});
        } else if (getDXRuntimeContext().C().h()) {
            hVar.a(this.t);
        } else {
            hVar.a(list);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    public void a(List<DXWidgetNode> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        fzy fzyVar = this.t;
        if (fzyVar == null) {
            return;
        }
        fzyVar.a(list);
        this.t.b(this.f11994a);
    }

    @Override // com.taobao.android.dinamicx.widget.DXAbsContainerBaseLayout
    @Deprecated
    public List<DXWidgetNode> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        fzy fzyVar = this.t;
        if (fzyVar == null) {
            return null;
        }
        return fzyVar.b();
    }

    private boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4447ed7", new Object[]{this})).booleanValue();
        }
        if (!getDXRuntimeContext().C().h()) {
            return d() == null;
        }
        fzy fzyVar = this.t;
        if (fzyVar == null) {
            return true;
        }
        return fzyVar.f();
    }

    private int i(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3217e8b2", new Object[]{this, dXWidgetNode})).intValue();
        }
        if (getDXRuntimeContext().C().h()) {
            fzy fzyVar = this.t;
            if (fzyVar == null) {
                return -1;
            }
            return fzyVar.a(dXWidgetNode);
        } else if (d() == null) {
            return -1;
        } else {
            return d().indexOf(dXWidgetNode);
        }
    }

    private void a(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7041c4f4", new Object[]{this, new Integer(i), dXWidgetNode});
        } else if (getDXRuntimeContext().C().h()) {
            fzy fzyVar = this.t;
            if (fzyVar == null) {
                return;
            }
            fzyVar.c(i, dXWidgetNode);
        } else {
            d().set(i, dXWidgetNode);
        }
    }

    private int M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4529647", new Object[]{this})).intValue();
        }
        if (getDXRuntimeContext().C().h()) {
            fzy fzyVar = this.t;
            if (fzyVar == null) {
                return 0;
            }
            return fzyVar.g();
        }
        return d().size();
    }

    public fzy z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fzy) ipChange.ipc$dispatch("cf5e01e0", new Object[]{this}) : this.t;
    }

    public gbf A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (gbf) ipChange.ipc$dispatch("18d047b3", new Object[]{this}) : this.ai;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue();
        }
        if (getDXRuntimeContext() == null) {
            return false;
        }
        return (this.F || this.G != 0) && this.W == 1;
    }
}
