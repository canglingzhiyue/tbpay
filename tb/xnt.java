package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.mytaobao.dataservice.datasource.d;
import com.taobao.mytaobao.dataservice.datasource.e;
import com.taobao.themis.kernel.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\n\u0010;\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010<\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010=\u001a\u00020\u000bH\u0016J\n\u0010>\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010?\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010@\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010A\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010B\u001a\u00020\u001dH\u0016J@\u0010C\u001a\u00020\u000e26\u0010\u0017\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016JF\u0010D\u001a\u00020\u000e2<\u0010&\u001a8\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030$¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(E\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016JU\u0010F\u001a\u00020\u000e2K\u0010\u000f\u001aG\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\u0006H\u0016J-\u0010G\u001a\u00020\u000e2#\u00103\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u000e04H\u0016J@\u0010H\u001a\u00020\u000e26\u00109\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u001107¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016J@\u0010I\u001a\u00020\u000e26\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016J\b\u0010J\u001a\u00020\u000eH\u0002J\u0010\u0010K\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020MH\u0002J\b\u0010N\u001a\u00020\u000eH\u0002J\b\u0010O\u001a\u00020\u000eH\u0016J\b\u0010P\u001a\u00020\u000eH\u0016J\u0010\u0010Q\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u00010\u0003J\b\u0010R\u001a\u00020\u000eH\u0016J\b\u0010S\u001a\u00020\u000eH\u0016J\u0010\u0010T\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020MH\u0016J\u0016\u0010U\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010V\u001a\u00020(R¬\u0001\u0010\u000f\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00062M\u0010\u0005\u001aI\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0082\u0001\u0010\u0014\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001228\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016RL\u0010\u0017\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u008e\u0001\u0010&\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030$¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00122>\u0010\u0005\u001a:\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030$¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\"\u0010)\u001a\u0004\u0018\u00010(2\b\u0010\u0005\u001a\u0004\u0018\u00010(@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0010\u0010,\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R-\u00103\u001a!\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u000e\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0082\u0001\u00109\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u001107¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001228\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u001107¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0016¨\u0006W"}, d2 = {"Lcom/taobao/mytaobao/dataservice/service/MainPageDataService;", "Lcom/taobao/mytaobao/dataservice/service/IMainPageDataService;", "userId", "", "(Ljava/lang/String;)V", "<set-?>", "Lkotlin/Function3;", "Lcom/taobao/mytaobao/dataservice/model/Reason;", "Lkotlin/ParameterName;", "name", "reason", "Lcom/alibaba/fastjson/JSONObject;", "hierarchyData", "hierarchyMap", "", "dataChangeListener", "getDataChangeListener", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/Function2;", "fullData", "fullDataChangeListener", "getFullDataChangeListener", "()Lkotlin/jvm/functions/Function2;", "globalChangeListener", "global", "getGlobalChangeListener", "setGlobalChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "isFeching", "", "()Z", "setFeching", "(Z)V", "isFirst", "lastRequestMainInterfaceMillis", "", "", AliFestivalWVPlugin.PARAMS_MODULE_NAME, "layoutChangeListener", "getLayoutChangeListener", "Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", "mCacheDataMerger", "getMCacheDataMerger", "()Lcom/taobao/mytaobao/dataservice/utils/DataMerger;", "mLocalData", "mainPageLocalDataSource", "Lcom/taobao/mytaobao/dataservice/datasource/MainPageLocalDataSource;", "mainPageServerDataSource", "Lcom/taobao/mytaobao/dataservice/datasource/MainPageServerDataSource;", "pageBackServerDataSource", "Lcom/taobao/mytaobao/dataservice/datasource/PageBackServerDataSource;", "refreshFailedListener", "Lkotlin/Function1;", "errorMsg", "remoteData", "Lcom/alibaba/fastjson/JSONArray;", "hierarchyList", "templateChangeListener", "getTemplateChangeListener", "getCustomerServiceTxt", "getCustomerServiceUrl", "getLocalData", "getPageData", "getSettingButtonTxt", "getSettingButtonUrl", "getUserNick", "is88Vip", "listenGlobalDataChange", "listenLayoutChange", "moduleNameList", "listenPageDataChange", "listenRefreshFailed", "listenTemplateChange", "listenerFullDataChange", "loadDataFromLocal", "loadDataFromServer", i.CDN_REQUEST_TYPE, "", "loadPageBackData", "loadPageData", "markNeedRefresh", "notifyRefreshFailed", Constant.KEY_PAGEBACK, "pageOut", "refreshPageData", "setDataMerger", "dataMerger", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xnt implements xns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f34408a;
    private ruw<? super xnq, ? super JSONObject, t> b;
    private rva<? super xnq, ? super JSONObject, ? super JSONObject, t> c;
    private ruw<? super xnq, ? super JSONArray, t> d;
    private ruw<? super xnq, ? super List<String>, t> e;
    private ruw<? super xnq, ? super JSONObject, t> f;
    private rul<? super String, t> g;
    private final com.taobao.mytaobao.dataservice.datasource.c h;
    private final d i;
    private final e j;
    private JSONObject k;
    private xnv l;
    private boolean m;
    private boolean n;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xnt.a(xnt.this).a(this.b, xnt.this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;

        public b(JSONObject jSONObject) {
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xnt.b(xnt.this).a(this.b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public c(String str) {
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rul c = xnt.c(xnt.this);
            if (c == null) {
                return;
            }
            c.mo2421invoke(this.b);
        }
    }

    static {
        kge.a(399305955);
        kge.a(1657824570);
    }

    public xnt(String userId) {
        q.c(userId, "userId");
        this.h = new com.taobao.mytaobao.dataservice.datasource.c(userId);
        this.i = new d();
        this.j = new e(this);
        this.n = true;
        this.i.a(this.h);
    }

    public static final /* synthetic */ d a(xnt xntVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("275e40cb", new Object[]{xntVar}) : xntVar.i;
    }

    public static final /* synthetic */ e b(xnt xntVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b44b5809", new Object[]{xntVar}) : xntVar.j;
    }

    public static final /* synthetic */ rul c(xnt xntVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("5db2e2c1", new Object[]{xntVar}) : xntVar.g;
    }

    public final ruw<xnq, JSONObject, t> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("54490d61", new Object[]{this}) : this.b;
    }

    public final rva<xnq, JSONObject, JSONObject, t> k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rva) ipChange.ipc$dispatch("5bfab3d7", new Object[]{this}) : this.c;
    }

    public final ruw<xnq, JSONArray, t> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("63ac581f", new Object[]{this}) : this.d;
    }

    public final ruw<xnq, List<String>, t> m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("6b5dfd7e", new Object[]{this}) : this.e;
    }

    public final xnv n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xnv) ipChange.ipc$dispatch("731242b1", new Object[]{this}) : this.l;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.m;
    }

    @Override // tb.xns
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        xnv xnvVar = this.l;
        return xnvVar != null && xnvVar.e();
    }

    @Override // tb.xns
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        xnv xnvVar = this.l;
        if (xnvVar == null) {
            return null;
        }
        return xnvVar.h();
    }

    @Override // tb.xns
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        xnv xnvVar = this.l;
        if (xnvVar == null) {
            return null;
        }
        return xnvVar.i();
    }

    @Override // tb.xns
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        xnv xnvVar = this.l;
        if (xnvVar == null) {
            return null;
        }
        return xnvVar.j();
    }

    @Override // tb.xns
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        xnv xnvVar = this.l;
        if (xnvVar == null) {
            return null;
        }
        return xnvVar.k();
    }

    @Override // tb.xns
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        xnv xnvVar = this.l;
        if (xnvVar == null) {
            return null;
        }
        return xnvVar.l();
    }

    @Override // tb.xns
    public JSONObject g() {
        xnq xnqVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        JSONObject jSONObject = this.k;
        if (jSONObject != null) {
            if (jSONObject == null) {
                q.a();
            }
            return jSONObject;
        }
        String a2 = this.h.a();
        if (a2 != null) {
            xnqVar = new xnq(2);
        } else {
            a2 = this.h.b();
            xnqVar = new xnq(1);
        }
        JSONObject dataJSON = JSON.parseObject(a2);
        if (xnqVar.b() == 2) {
            q.a((Object) dataJSON, "dataJSON");
            dataJSON.put((JSONObject) "sourceFrom", (String) 2);
        }
        this.k = dataJSON;
        a(xnqVar, new xnv(dataJSON));
        q.a((Object) dataJSON, "dataJSON");
        return dataJSON;
    }

    private final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.f34408a = System.currentTimeMillis();
        com.taobao.mytaobao.base.b.c(new a(i));
    }

    private final void p() {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        xnv xnvVar = this.l;
        if (xnvVar == null || (a2 = xnvVar.a()) == null) {
            return;
        }
        com.taobao.mytaobao.base.b.c(new b(a2));
    }

    @Override // tb.xns
    public void a(ruw<? super xnq, ? super JSONObject, t> globalChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc53bc4", new Object[]{this, globalChangeListener});
            return;
        }
        q.c(globalChangeListener, "globalChangeListener");
        this.b = globalChangeListener;
    }

    @Override // tb.xns
    public void a(rva<? super xnq, ? super JSONObject, ? super JSONObject, t> dataChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc9531b", new Object[]{this, dataChangeListener});
            return;
        }
        q.c(dataChangeListener, "dataChangeListener");
        this.c = dataChangeListener;
        this.i.b();
    }

    @Override // tb.xns
    public void b(ruw<? super xnq, ? super JSONArray, t> templateChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec484245", new Object[]{this, templateChangeListener});
            return;
        }
        q.c(templateChangeListener, "templateChangeListener");
        this.d = templateChangeListener;
    }

    @Override // tb.xns
    public void c(ruw<? super xnq, ? super List<String>, t> layoutChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dacb48c6", new Object[]{this, layoutChangeListener});
            return;
        }
        q.c(layoutChangeListener, "layoutChangeListener");
        this.e = layoutChangeListener;
    }

    @Override // tb.xns
    public void d(ruw<? super xnq, ? super JSONObject, t> fullDataChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94e4f47", new Object[]{this, fullDataChangeListener});
            return;
        }
        q.c(fullDataChangeListener, "fullDataChangeListener");
        this.f = fullDataChangeListener;
    }

    @Override // tb.xns
    public void a(rul<? super String, t> refreshFailedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc03baf", new Object[]{this, refreshFailedListener});
            return;
        }
        q.c(refreshFailedListener, "refreshFailedListener");
        this.g = refreshFailedListener;
    }

    @Override // tb.xns
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            b(i);
        }
    }

    @Override // tb.xns
    public void h() {
        Long g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.n) {
            this.n = false;
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.f34408a;
            xnv xnvVar = this.l;
            if (currentTimeMillis > ((xnvVar == null || (g = xnvVar.g()) == null) ? 480L : g.longValue()) * 1000) {
                b(3);
            } else {
                p();
            }
        }
    }

    @Override // tb.xns
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f34408a = 0L;
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            com.taobao.mytaobao.base.b.d(new c(str));
        }
    }

    public final void a(xnq reason, xnv dataMerger) {
        ruw<? super xnq, ? super JSONObject, t> ruwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dc495ed", new Object[]{this, reason, dataMerger});
            return;
        }
        q.c(reason, "reason");
        q.c(dataMerger, "dataMerger");
        this.l = dataMerger;
        JSONObject n = dataMerger.n();
        if (n == null || (ruwVar = this.f) == null) {
            return;
        }
        ruwVar.mo2423invoke(reason, n);
    }
}
