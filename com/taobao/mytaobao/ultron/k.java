package com.taobao.mytaobao.ultron;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.unit.center.mdc.dinamicx.dataParse.DXTsKVDataParser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.boc;
import tb.fgo;
import tb.jqi;
import tb.kge;
import tb.mvv;
import tb.mvw;
import tb.mvx;
import tb.mvy;
import tb.mvz;
import tb.mwa;
import tb.mwb;
import tb.mwc;
import tb.mwd;
import tb.mwg;
import tb.mwi;
import tb.mwj;
import tb.mwk;
import tb.mwl;
import tb.mxj;
import tb.nwv;
import tb.xox;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/taobao/mytaobao/ultron/MtbUltronHelper;", "", "()V", "mDxEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "mUltronInstance", "Lcom/alibaba/android/ultron/vfw/instance/UltronInstance;", "mtb2022EquityNumberChangeData", "Lcom/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtb2022EquityNumberChangeData;", "getMtb2022EquityNumberChangeData", "()Lcom/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtb2022EquityNumberChangeData;", "setMtb2022EquityNumberChangeData", "(Lcom/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtb2022EquityNumberChangeData;)V", "createUltronInstance", "aty", "Landroid/app/Activity;", "doInit", "", "getCacheUltronInstance", "getDxEngine", "Companion", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private com.alibaba.android.ultron.vfw.instance.d f18526a;
    private DinamicXEngine b;
    private mvx c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/taobao/mytaobao/ultron/MtbUltronHelper$createUltronInstance$1", "Lcom/alibaba/android/ultron/vfw/dinamicx/UltronDxEngineConfig$Callback;", "onDXEngineCreated", "", "context", "Landroid/content/Context;", "dinamicXEngineRouter", "Lcom/taobao/android/dinamicx/DinamicXEngineRouter;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b extends boc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public b(Activity activity) {
            this.b = activity;
        }

        @Override // tb.boc.b
        public void a(Context context, bd dinamicXEngineRouter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd794b9a", new Object[]{this, context, dinamicXEngineRouter});
                return;
            }
            q.c(dinamicXEngineRouter, "dinamicXEngineRouter");
            k.a(k.this, dinamicXEngineRouter.d());
            DinamicXEngine a2 = k.a(k.this);
            if (a2 == null) {
                q.a();
            }
            a2.a(this.b);
            if (!mxj.a("compatDarkMode", true)) {
                return;
            }
            DinamicXEngine a3 = k.a(k.this);
            if (a3 == null) {
                q.a();
            }
            a3.a(new xox());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/taobao/mytaobao/ultron/MtbUltronHelper$doInit$1", "Lcom/taobao/android/ultron/utils/UltronSwitch$AbsSwitcher;", "enable", "", "switchKey", "", AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class c extends jqi.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2128352026) {
                return new Boolean(super.a((String) objArr[0], ((Boolean) objArr[1]).booleanValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.jqi.a
        public boolean a(String switchKey, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{this, switchKey, new Boolean(z)})).booleanValue();
            }
            q.c(switchKey, "switchKey");
            String str = switchKey;
            if (StringUtils.equals(str, "enableDXPreCreateView") || StringUtils.equals(str, fgo.ENABLE_PIPE_LINE_CHCHE)) {
                return true;
            }
            return super.a(switchKey, z);
        }
    }

    static {
        kge.a(1238967044);
        Companion = new a(null);
    }

    @JvmStatic
    public static final void a(com.alibaba.android.ultron.vfw.instance.d dVar, mvx mvxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fcbbbae", new Object[]{dVar, mvxVar});
        } else {
            Companion.a(dVar, mvxVar);
        }
    }

    public static final /* synthetic */ DinamicXEngine a(k kVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("1e9e2d22", new Object[]{kVar}) : kVar.b;
    }

    public static final /* synthetic */ void a(k kVar, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d32376", new Object[]{kVar, dinamicXEngine});
        } else {
            kVar.b = dinamicXEngine;
        }
    }

    public final mvx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mvx) ipChange.ipc$dispatch("f07fb0f", new Object[]{this}) : this.c;
    }

    public final void a(Activity aty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, aty});
            return;
        }
        q.c(aty, "aty");
        if (this.f18526a != null) {
            return;
        }
        jqi.a("mytaobao", new c());
        this.f18526a = b(aty);
        mvx mvxVar = new mvx();
        this.c = mvxVar;
        a aVar = Companion;
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f18526a;
        if (dVar == null) {
            q.a();
        }
        aVar.a(dVar, mvxVar);
    }

    public final com.alibaba.android.ultron.vfw.instance.d b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("17afa3ce", new Object[]{this});
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f18526a;
        this.f18526a = null;
        return dVar;
    }

    public final DinamicXEngine c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("c0d4a65d", new Object[]{this}) : this.b;
    }

    private final com.alibaba.android.ultron.vfw.instance.d b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("9862ffe0", new Object[]{this, activity});
        }
        UltronInstanceConfig config = new UltronInstanceConfig().a("mytaobao").c(false);
        config.l(true);
        q.a((Object) config, "config");
        config.e(true);
        boc.a a2 = new boc.a().a(10086).a("mytaobao").a(true);
        DXEngineConfig.a a3 = new DXEngineConfig.a("mytaobao").a(true, true).a(true);
        if (com.taobao.mytaobao.base.c.i() && !nwv.b) {
            a3.g(false);
        }
        config.a(a2.a(a3).a(new b(activity)).a());
        com.alibaba.android.ultron.vfw.instance.d a4 = com.alibaba.android.ultron.vfw.instance.d.a(config, activity);
        q.a((Object) a4, "UltronInstance.createUltronInstance(config, aty)");
        return a4;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/taobao/mytaobao/ultron/MtbUltronHelper$Companion;", "", "()V", "registerHighPriorityDxPlugin", "", "ultronInstance", "Lcom/alibaba/android/ultron/vfw/instance/UltronInstance;", "mtb2022EquityNumberChangeData", "Lcom/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtb2022EquityNumberChangeData;", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1540613812);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final void a(com.alibaba.android.ultron.vfw.instance.d ultronInstance, mvx mtb2022EquityNumberChangeData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fcbbbae", new Object[]{this, ultronInstance, mtb2022EquityNumberChangeData});
                return;
            }
            q.c(ultronInstance, "ultronInstance");
            q.c(mtb2022EquityNumberChangeData, "mtb2022EquityNumberChangeData");
            ultronInstance.a(mvx.DX_PARSER_MTB2022EQUITY_NUMBER_CHANGE_DATA, mtb2022EquityNumberChangeData);
            ultronInstance.a(mwd.DX_PARSER_SKINSWITCH, new mwd(false));
            ultronInstance.a(mwc.DX_PARSER_NAVISWITCH, new mwc(false));
            ultronInstance.a(mvv.DX_PARSER_COLORPARSE, new mvv());
            ultronInstance.a(mvy.DX_PARSER_MTBFESTIVAL, new mvy());
            ultronInstance.a(mvz.DX_PARSER_MTBICONFONTSUPPORT, new mvz());
            ultronInstance.a(mwb.DX_PARSER_URLCODETOOL, new mwb());
            ultronInstance.a(-2517623531547489759L, new mwa());
            ultronInstance.a(mvw.DX_PARSER_ISUSEHIGHBASEMENTGUIDE, new mvw());
            ultronInstance.a(com.taobao.mytaobao.ultron.event.k.DX_PARSER_GETUNREADMSGCOUNT, new com.taobao.mytaobao.ultron.event.k());
            ultronInstance.a(mwk.DX_MFAVORTEXTVIEW, new mwk.a());
            ultronInstance.a(mwl.DX_MORDERNUMTEXTVIEW, new mwl.a());
            ultronInstance.a(mwj.DX_MGIFIMAGEVIEW, new mwj.a());
            ultronInstance.a(mwg.DX_SCROLLER_LAYOUT, new mwg.a());
            ultronInstance.a(mwi.DXMTVIDEOVIEW_MTVIDEOVIEW, new mwi.a());
            ultronInstance.a(DXTsKVDataParser.DX_PARSER_TSKV, new DXTsKVDataParser());
        }
    }
}
