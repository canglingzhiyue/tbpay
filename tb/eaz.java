package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.content.h;
import com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.recycler.a;
import com.taobao.android.detail.core.open.ProtocolType;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import tb.ebd;
import tb.ebe;
import tb.ebg;
import tb.ebh;
import tb.ebi;
import tb.ebk;
import tb.ebl;
import tb.hng;

/* loaded from: classes4.dex */
public class eaz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DINAMIC_MODULE_NAME = "xdetail";

    static {
        kge.a(-1508698444);
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.DinamicXRouterUtil");
    }

    public static DXEngineConfig a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEngineConfig) ipChange.ipc$dispatch("3edbcd12", new Object[0]);
        }
        boolean z = !ecu.s;
        boolean z2 = ecu.t;
        DXVideoControlConfig<fxw> b = DXVideoControlConfig.b();
        try {
            b.a(Class.forName("com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode"));
            b.b(true);
        } catch (Exception e) {
            i.a(DINAMIC_MODULE_NAME, "find DXVideoViewWidgetNode error ", e);
        }
        return new DXEngineConfig.a(DINAMIC_MODULE_NAME).b(z).a(z2).d(15).a(b).a("detail").f(true).a(true, true).a();
    }

    public static DXEngineConfig b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEngineConfig) ipChange.ipc$dispatch("78a66ef1", new Object[0]) : new DXEngineConfig.a(DINAMIC_MODULE_NAME).d(15).a("detail").a(true, true).a();
    }

    public static DXEngineConfig c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEngineConfig) ipChange.ipc$dispatch("b27110d0", new Object[0]) : new DXEngineConfig.a(DINAMIC_MODULE_NAME).d(15).a("detail").f(true).a(new a()).a(true, true).a();
    }

    public static bd d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("c6f4b485", new Object[0]) : new bd(a());
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            return ".zip".equals(str.substring(str.length() - 4, str.length()));
        }
        return false;
    }

    public static bd e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bd) ipChange.ipc$dispatch("3b33ece4", new Object[0]);
        }
        if (!ecu.r) {
            return null;
        }
        bd d = d();
        d.a(hng.DETAIL_WIDGET_ID, new hng.a());
        d.a(ebi.f27168a, new ebi.a());
        d.a(ebk.f27171a, new ebk.a());
        d.a(ebe.f27161a, new ebe.a());
        d.a(ebh.f27165a, new ebh.a());
        d.a(ebg.f27163a, new ebg.a());
        d.a(ebd.f27160a, new ebd.a());
        d.a(ebl.f27173a, new ebl.a());
        d.a(eba.EVENT_IDENTIFY.longValue(), new eba());
        d.a(ebb.EVENT_IDENTIFY.longValue(), new ebb());
        d.a(h.DX_EVENT_DCEVENT, new h());
        d.a(38447420286L, new iek());
        d.a(com.taobao.android.detail.core.detail.content.i.DX_PARSER_DETAILURLENCODE, new com.taobao.android.detail.core.detail.content.i());
        return d;
    }

    public static boolean a(Context context) {
        g a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context == null || (a2 = n.a(context)) == null) {
            return ecu.r;
        }
        return ecu.r && a2.a() == ProtocolType.TYPE_ULTRON;
    }
}
