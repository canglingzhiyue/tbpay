package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.mytaobao.base.c;
import com.taobao.mytaobao.ultron.event.d;
import com.taobao.mytaobao.ultron.event.r;
import com.taobao.mytaobao.ultron.event.s;
import com.taobao.mytaobao.ultron.event.t;
import com.taobao.mytaobao.ultron.event.u;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXTsKVDataParser;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/taobao/mytaobao/pagev2/architecture/MtbContext;", "", "()V", "dxEngineRouter", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "getDxEngineRouter", "()Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "mtbDxDownloadManager", "Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxDownloadManager;", "getMtbDxDownloadManager", "()Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxDownloadManager;", "mtbDxTemplateManager", "Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxTemplateManager;", "getMtbDxTemplateManager", "()Lcom/taobao/mytaobao/pagev2/architecture/dx/MtbDxTemplateManager;", "registerHighPriorityDxPlugin", "", "mtb2022EquityNumberChangeData", "Lcom/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtb2022EquityNumberChangeData;", "registerNormalPriorityDxPlugin", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class xny {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final bd f34416a;
    private final xoc b;
    private final xob c;

    static {
        kge.a(-1563632530);
    }

    public xny() {
        nwv.a("initMtbContext");
        DXEngineConfig.a a2 = new DXEngineConfig.a("mytaobao").a(true).b(2).d(10086).a("mytaobao").a(true, true);
        if (c.i() && !nwv.b) {
            a2.g(false);
        }
        this.f34416a = new bd(a2.a());
        if (mxj.a("compatDarkMode", true)) {
            this.f34416a.d().a(new xox());
        }
        mvx mvxVar = new mvx();
        a(mvxVar);
        b(mvxVar);
        this.b = new xoc(this.f34416a);
        this.c = new xob(this.f34416a, this.b);
        nwv.e("initMtbContext");
    }

    public final bd a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("6a370b68", new Object[]{this}) : this.f34416a;
    }

    public final xoc b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xoc) ipChange.ipc$dispatch("16be83b1", new Object[]{this}) : this.b;
    }

    public final xob c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xob) ipChange.ipc$dispatch("1e7028f1", new Object[]{this}) : this.c;
    }

    private final void a(mvx mvxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54b8c89", new Object[]{this, mvxVar});
            return;
        }
        this.f34416a.a(mwd.DX_PARSER_SKINSWITCH, new mwd(true));
        this.f34416a.a(mwc.DX_PARSER_NAVISWITCH, new mwc(true));
        this.f34416a.a(mvv.DX_PARSER_COLORPARSE, new mvv());
        this.f34416a.a(mvy.DX_PARSER_MTBFESTIVAL, new mvy());
        this.f34416a.a(mvz.DX_PARSER_MTBICONFONTSUPPORT, new mvz());
        this.f34416a.a(DXTsKVDataParser.DX_PARSER_TSKV, new DXTsKVDataParser());
        this.f34416a.a(-2517623531547489759L, new mwa());
        this.f34416a.a(mvx.DX_PARSER_MTB2022EQUITY_NUMBER_CHANGE_DATA, mvxVar);
        this.f34416a.a(mwb.DX_PARSER_URLCODETOOL, new mwb());
    }

    private final void b(mvx mvxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ce930a", new Object[]{this, mvxVar});
            return;
        }
        this.f34416a.a(mwf.DX_EVENT_MTB_ONTAP, new mwf(null));
        this.f34416a.a(d.DX_EVENT_MTB_SCROLL_EXPOSE, new d());
        this.f34416a.a(s.DX_EVENT_MTB_TOOLSSCROLLEXPOSE, new s());
        this.f34416a.a(18619468269105L, new u());
        this.f34416a.a(-9059485389533098272L, new t());
        this.f34416a.a(thh.DX_EVENT_SWITCHACCOUNT, new thh());
        this.f34416a.a(thg.DX_EVENT_OPENURL, new thg());
        r.a();
        this.f34416a.a(r.DX_EVENT_MTBSLIDEREXPOSEUT, new r(true));
        this.f34416a.a(com.taobao.mytaobao.ultron.event.c.DX_EVENT_MTBORDERSLIDEREVENTHANDLE, new com.taobao.mytaobao.ultron.event.c(true));
        this.f34416a.a(mwe.DX_EVENT_ONMTBEQUITYSLIDERFINISH, new mwe(mvxVar));
        this.f34416a.a(1544903441687469454L, new xkt());
    }
}
