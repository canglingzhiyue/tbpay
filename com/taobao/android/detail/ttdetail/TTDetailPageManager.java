package com.taobao.android.detail.ttdetail;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.ttdetail.bridge.TTWXModule;
import com.taobao.android.detail.ttdetail.broadcast.DetailSKURefreshReceiver;
import com.taobao.android.detail.ttdetail.broadcast.DetailUpdateDataReceiver;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.detail.ttdetail.constant.a;
import com.taobao.android.detail.ttdetail.content.i;
import com.taobao.android.detail.ttdetail.data.converter.DetailV3Converter;
import com.taobao.android.detail.ttdetail.data.converter.TTDataDealException;
import com.taobao.android.detail.ttdetail.data.meta.Fatigue;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.BarrageFloatingView;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ai;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.aj;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ak;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.am;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.n;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.w;
import com.taobao.android.detail.ttdetail.inside.InsideLinearLayout;
import com.taobao.android.detail.ttdetail.inside.TTDInsideController;
import com.taobao.android.detail.ttdetail.request.MtopInfo;
import com.taobao.android.detail.ttdetail.request.b;
import com.taobao.android.detail.ttdetail.request.preload.PreloadDetailWVPlugin;
import com.taobao.android.detail.ttdetail.request.preload.j;
import com.taobao.android.detail.ttdetail.runtime.RuntimeParam;
import com.taobao.android.detail.ttdetail.utils.ab;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.ag;
import com.taobao.android.detail.ttdetail.utils.ak;
import com.taobao.android.detail.ttdetail.utils.al;
import com.taobao.android.detail.ttdetail.utils.ao;
import com.taobao.android.detail.ttdetail.utils.as;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.av;
import com.taobao.android.detail.ttdetail.utils.ay;
import com.taobao.android.detail.ttdetail.utils.az;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.bg;
import com.taobao.android.detail.ttdetail.utils.bj;
import com.taobao.android.detail.ttdetail.utils.bl;
import com.taobao.android.detail.ttdetail.utils.bm;
import com.taobao.android.detail.ttdetail.utils.bn;
import com.taobao.android.detail.ttdetail.utils.bo;
import com.taobao.android.detail.ttdetail.utils.bq;
import com.taobao.android.detail.ttdetail.utils.br;
import com.taobao.android.detail.ttdetail.utils.bs;
import com.taobao.android.detail.ttdetail.utils.bt;
import com.taobao.android.detail.ttdetail.utils.k;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.android.detail.ttdetail.utils.m;
import com.taobao.android.detail.ttdetail.utils.t;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.BottomBarContainer;
import com.taobao.android.detail.ttdetail.widget.scrollerlayout.TTDetailScrollerLayout;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.extend.component.TBErrorView;
import com.taobao.uikit.extend.component.error.Error;
import com.ut.mini.UTAnalytics;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ErrorConstant;
import tb.ctt;
import tb.ecg;
import tb.eyx;
import tb.ezg;
import tb.fgl;
import tb.iyf;
import tb.kge;
import tb.lus;
import tb.nup;
import tb.odg;
import tb.onp;
import tb.pir;
import tb.pkw;
import tb.qms;
import tb.riy;
import tb.shq;
import tb.soa;
import tb.sol;
import tb.soy;
import tb.taa;
import tb.tab;
import tb.tae;

/* loaded from: classes4.dex */
public class TTDetailPageManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWNGRADE_DATA_ID = "ttDetailDowngradeDataId";
    public static final Map<String, JSONObject> sDowngradeData;
    public static final Map<String, Drawable> sDowngradeSnapshotData;
    private TTDInsideController A;
    private f B;
    private String C;
    private com.taobao.android.detail.ttdetail.floatview.a D;
    private shq E;
    private DetailSKURefreshReceiver F;
    private ViewGroup G;
    private ITBPublicMenu H;
    private i I;
    private soy J;
    private Looper K;
    private nup L;
    private boolean Q;
    private com.taobao.android.detail.ttdetail.widget.g R;
    private ctt S;
    private String T;
    private Map<String, String> U;
    private eyx b;
    private Context c;
    private Intent d;
    private b e;
    private com.taobao.android.detail.ttdetail.request.params.a f;
    private DetailUpdateDataReceiver g;
    private BroadcastReceiver h;
    private BroadcastReceiver i;
    private BroadcastReceiver j;
    private View k;
    private View l;
    private BottomBarContainer m;
    private View n;
    private TBErrorView o;
    private volatile boolean p;
    private volatile boolean q;
    private volatile boolean r;
    private c u;
    private g w;
    private com.taobao.android.detail.ttdetail.performance.c x;
    private volatile boolean y;
    private sol z;
    private j s = new j();
    private String t = "item.taobao.com";
    private Map<String, Object> M = new HashMap(0);
    private final String V = URLEncoder.encode(ao.a() + UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: a  reason: collision with root package name */
    private volatile com.taobao.android.detail.ttdetail.request.stream.a f10455a = new com.taobao.android.detail.ttdetail.request.stream.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.request.stream.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
            TTDetailPageManager.a(tTDetailPageManager, TTDetailPageManager.a(tTDetailPageManager), jSONObject);
        }

        @Override // com.taobao.android.detail.ttdetail.request.stream.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                return;
            }
            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
            TTDetailPageManager.a(tTDetailPageManager, TTDetailPageManager.a(tTDetailPageManager), (JSONObject) null);
        }
    };
    public sol.a v = new sol.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.7
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.sol.a
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (i == 0 && i2 > 0) {
                t.d(TTDetailPageManager.b(TTDetailPageManager.this), TTDetailPageManager.c(TTDetailPageManager.this));
            }
            if (i <= 0 || i2 != 0) {
                return;
            }
            t.c(TTDetailPageManager.b(TTDetailPageManager.this), TTDetailPageManager.c(TTDetailPageManager.this));
        }
    };
    private onp.c N = new onp.c() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.onp.c
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (TTDetailPageManager.d(TTDetailPageManager.this) != null) {
                TTDetailPageManager.d(TTDetailPageManager.this).a(i, i2);
            }
            if (i + i2 > 0) {
                z = false;
            }
            TTDetailPageManager.e(TTDetailPageManager.this).a(z);
            if (TTDetailPageManager.f(TTDetailPageManager.this) == null) {
                return;
            }
            TTDetailPageManager.f(TTDetailPageManager.this).a(z);
        }
    };
    private com.taobao.android.detail.ttdetail.request.stream.a O = new com.taobao.android.detail.ttdetail.request.stream.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.8
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.request.stream.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.android.detail.ttdetail.request.stream.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else {
                TTDetailPageManager.a(TTDetailPageManager.this, jSONObject);
            }
        }
    };
    private DetailUpdateDataReceiver.a P = new DetailUpdateDataReceiver.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.detail.ttdetail.broadcast.DetailUpdateDataReceiver.a
        public void a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            } else {
                TTDetailPageManager.this.a(map, (lus) null, true, new RuntimeParam[0]);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.broadcast.DetailUpdateDataReceiver.a
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            } else {
                TTDetailPageManager.a(TTDetailPageManager.this, str);
            }
        }
    };

    public boolean a(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f14b42c5", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ Intent a(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("cd195c16", new Object[]{tTDetailPageManager}) : tTDetailPageManager.d;
    }

    public static /* synthetic */ Uri a(TTDetailPageManager tTDetailPageManager, Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("f341c942", new Object[]{tTDetailPageManager, context}) : tTDetailPageManager.a(context);
    }

    public static /* synthetic */ String a(TTDetailPageManager tTDetailPageManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd578a99", new Object[]{tTDetailPageManager, str});
        }
        tTDetailPageManager.C = str;
        return str;
    }

    public static /* synthetic */ String a(TTDetailPageManager tTDetailPageManager, Map map, MtopInfo mtopInfo, Map map2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c950c24b", new Object[]{tTDetailPageManager, map, mtopInfo, map2, new Boolean(z), new Boolean(z2)}) : tTDetailPageManager.a(map, mtopInfo, map2, z, z2);
    }

    public static /* synthetic */ void a(TTDetailPageManager tTDetailPageManager, Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e727d16", new Object[]{tTDetailPageManager, intent, jSONObject});
        } else {
            tTDetailPageManager.a(intent, jSONObject);
        }
    }

    public static /* synthetic */ void a(TTDetailPageManager tTDetailPageManager, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebe3233", new Object[]{tTDetailPageManager, jSONObject});
        } else {
            tTDetailPageManager.a(jSONObject);
        }
    }

    public static /* synthetic */ void a(TTDetailPageManager tTDetailPageManager, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29088730", new Object[]{tTDetailPageManager, jSONObject, new Integer(i)});
        } else {
            tTDetailPageManager.d(jSONObject, i);
        }
    }

    public static /* synthetic */ void a(TTDetailPageManager tTDetailPageManager, String str, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbadbdd1", new Object[]{tTDetailPageManager, str, mtopInfo});
        } else {
            tTDetailPageManager.a(str, mtopInfo);
        }
    }

    public static /* synthetic */ void a(TTDetailPageManager tTDetailPageManager, Map map, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2427d0", new Object[]{tTDetailPageManager, map, mtopInfo});
        } else {
            tTDetailPageManager.a(map, mtopInfo);
        }
    }

    public static /* synthetic */ void a(TTDetailPageManager tTDetailPageManager, Map map, lus lusVar, boolean z, Map map2, RuntimeParam[] runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f9c36c", new Object[]{tTDetailPageManager, map, lusVar, new Boolean(z), map2, runtimeParamArr});
        } else {
            tTDetailPageManager.a(map, lusVar, z, map2, runtimeParamArr);
        }
    }

    public static /* synthetic */ void a(TTDetailPageManager tTDetailPageManager, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89cb6ce2", new Object[]{tTDetailPageManager, mtopResponse});
        } else {
            tTDetailPageManager.a(mtopResponse);
        }
    }

    public static /* synthetic */ boolean a(TTDetailPageManager tTDetailPageManager, JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9df89cb", new Object[]{tTDetailPageManager, jSONObject, str, str2})).booleanValue() : tTDetailPageManager.a(jSONObject, str, str2);
    }

    public static /* synthetic */ Context b(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4a300dd6", new Object[]{tTDetailPageManager}) : tTDetailPageManager.c;
    }

    public static /* synthetic */ String b(TTDetailPageManager tTDetailPageManager, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ddd95278", new Object[]{tTDetailPageManager, str}) : tTDetailPageManager.b(str);
    }

    public static /* synthetic */ eyx c(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("346d1283", new Object[]{tTDetailPageManager}) : tTDetailPageManager.b;
    }

    public static /* synthetic */ soy d(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (soy) ipChange.ipc$dispatch("d0e146a9", new Object[]{tTDetailPageManager}) : tTDetailPageManager.J;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.floatview.a e(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.floatview.a) ipChange.ipc$dispatch("3acef624", new Object[]{tTDetailPageManager}) : tTDetailPageManager.D;
    }

    public static /* synthetic */ shq f(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (shq) ipChange.ipc$dispatch("9bd2428", new Object[]{tTDetailPageManager}) : tTDetailPageManager.E;
    }

    public static /* synthetic */ View g(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("cb1ab0e5", new Object[]{tTDetailPageManager}) : tTDetailPageManager.k;
    }

    public static /* synthetic */ i h(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("ae5e9d01", new Object[]{tTDetailPageManager}) : tTDetailPageManager.I;
    }

    public static /* synthetic */ String i(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f8395edb", new Object[]{tTDetailPageManager}) : tTDetailPageManager.l();
    }

    public static /* synthetic */ c j(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("f510002f", new Object[]{tTDetailPageManager}) : tTDetailPageManager.u;
    }

    public static /* synthetic */ String k(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("2a3c0219", new Object[]{tTDetailPageManager}) : tTDetailPageManager.z();
    }

    public static /* synthetic */ Map l(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7788ca1d", new Object[]{tTDetailPageManager}) : tTDetailPageManager.U;
    }

    public static /* synthetic */ sol m(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sol) ipChange.ipc$dispatch("50bf246d", new Object[]{tTDetailPageManager}) : tTDetailPageManager.z;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.request.params.a n(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.request.params.a) ipChange.ipc$dispatch("74d524d0", new Object[]{tTDetailPageManager}) : tTDetailPageManager.f;
    }

    public static /* synthetic */ boolean o(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("62720f6f", new Object[]{tTDetailPageManager})).booleanValue() : tTDetailPageManager.m();
    }

    public static /* synthetic */ b p(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("c36074a", new Object[]{tTDetailPageManager}) : tTDetailPageManager.e;
    }

    public static /* synthetic */ boolean q(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d75d5071", new Object[]{tTDetailPageManager})).booleanValue() : tTDetailPageManager.p;
    }

    public static /* synthetic */ View r(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("19dc69b0", new Object[]{tTDetailPageManager}) : tTDetailPageManager.n;
    }

    public static /* synthetic */ View s(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("21054bf1", new Object[]{tTDetailPageManager}) : tTDetailPageManager.l;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.request.stream.a t(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.request.stream.a) ipChange.ipc$dispatch("2256c09c", new Object[]{tTDetailPageManager}) : tTDetailPageManager.f10455a;
    }

    public static /* synthetic */ void u(TTDetailPageManager tTDetailPageManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c133d271", new Object[]{tTDetailPageManager});
        } else {
            tTDetailPageManager.p();
        }
    }

    static {
        kge.a(1342367610);
        sDowngradeData = new ConcurrentHashMap(1);
        sDowngradeSnapshotData = new ConcurrentHashMap(0);
    }

    public void a(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b621230a", new Object[]{this, iTBPublicMenu});
        } else {
            this.H = iTBPublicMenu;
        }
    }

    public TTDetailPageManager(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            throw new IllegalArgumentException("context must be Activity");
        }
        this.c = context;
        this.d = intent;
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f = new com.taobao.android.detail.ttdetail.request.params.a(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append("setupEvn itemId=");
        sb.append(this.f.e());
        sb.append(", uri=");
        Intent intent = this.d;
        sb.append(intent != null ? intent.getDataString() : "");
        com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", sb.toString());
        com.taobao.android.detail.ttdetail.behavior.b.a(this.c, this.V);
        com.taobao.android.detail.ttdetail.behavior.b.a(this.c, "init_item_id", this.f.e());
        ak.a(this.d, this.f.e());
        this.B = new f(this.c, this.f.f());
        this.b = this.B.a();
        av.a(this.b);
        com.taobao.android.detail.ttdetail.performance.d.a(this.b);
        this.k = com.taobao.android.detail.ttdetail.performance.d.a(this.c).a(this.c, R.layout.tt_detail_page_manager, null, true);
        this.I = new i(this.c, this.b, new i.b() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.content.i.b
            public View getMainView() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (View) ipChange2.ipc$dispatch("d528c77d", new Object[]{this}) : TTDetailPageManager.g(TTDetailPageManager.this);
            }
        });
        boolean a2 = com.taobao.android.detail.ttdetail.utils.e.a(this.c);
        if (a2) {
            this.w = new g(this.b, i(), this.k);
        }
        boolean c = odg.d().c(this.c);
        ((ImageView) i().findViewById(R.id.iv_skeleton_holder)).setImageDrawable(br.a(a2, c));
        ((ImageView) i().findViewById(R.id.iv_bottom_skeleton_holder)).setImageDrawable(br.b(a2, c));
        this.l = i().findViewById(R.id.fl_mask_container);
        this.m = (BottomBarContainer) i().findViewById(R.id.ll_tt_detail_bottom_bar);
        this.G = (ViewGroup) i().findViewById(R.id.actionbar_layout);
        u();
        long longExtra = this.d.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        if (longExtra >= 0) {
            av.c(this.b, RVStartParams.START_SCENE_START_PAGE, longExtra);
        }
        av.c(this.b, "containerInit", currentTimeMillis);
        this.z = new sol(this.k, this.c, this.b, new ezg(new JSONObject()), new DataEntry[0]);
        this.z.a(this.v);
        this.u = new c(this.c, this.b, this.V);
        this.u.a(this.R);
        this.u.a(new com.taobao.android.detail.ttdetail.broadcast.a(this.b));
        new tab(this.c, this.b);
        new taa(this.c, this.b);
        this.x = new com.taobao.android.detail.ttdetail.performance.c(this.c, this.b, this.k);
        bm.a(this.b, this.c, this.u, new am.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.am.a
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                } else {
                    TTDetailPageManager.h(TTDetailPageManager.this).a(str, str2);
                }
            }
        }, new w.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.w.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    TTDetailPageManager.this.a((Map<String, String>) null, (lus) null, true, new RuntimeParam[0]);
                }
            }
        }, new n.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.n.a
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : TTDetailPageManager.i(TTDetailPageManager.this);
            }
        }, new ak.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.ak.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    TTDetailPageManager.j(TTDetailPageManager.this).c(str);
                }
            }
        }, new ai.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.ai.a
            public void a(Map<String, String> map, lus lusVar, RuntimeParam... runtimeParamArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("af4773d0", new Object[]{this, map, lusVar, runtimeParamArr});
                } else {
                    TTDetailPageManager.this.a(map, lusVar, true, runtimeParamArr);
                }
            }
        }, new ai.b() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.ai.b
            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : TTDetailPageManager.k(TTDetailPageManager.this);
            }

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.ai.b
            public Map<String, String> b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Map) ipChange2.ipc$dispatch("6dbf0a5e", new Object[]{this}) : TTDetailPageManager.l(TTDetailPageManager.this);
            }
        }, new aj.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.handler.bizhandlers.aj.a
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                } else {
                    TTDetailPageManager.j(TTDetailPageManager.this).d(str);
                }
            }
        });
        FrameLayout frameLayout = (FrameLayout) this.k.findViewById(R.id.float_view_layout);
        if (com.taobao.android.detail.ttdetail.utils.j.g()) {
            this.E = new shq(this.b, frameLayout);
            this.E.a(BarrageFloatingView.BARRAGE_TYPE.GLOBAL);
        }
        this.D = new com.taobao.android.detail.ttdetail.floatview.a(this.c, this.b, frameLayout);
        this.D.a(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TTDetailPageManager.m(TTDetailPageManager.this).b(0);
                }
            }
        });
        this.Q = true;
    }

    public static void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        q.a("PreloadDetail", (Class<? extends android.taobao.windvane.jsbridge.e>) PreloadDetailWVPlugin.class);
        com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "WVPluginManager.registerPlugin");
        if (com.taobao.android.detail.ttdetail.utils.j.am()) {
            bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        com.taobao.android.detail.ttdetail.component.c.ComponentFatigueContainer.a(application.getBaseContext());
                    }
                }
            });
        } else {
            com.taobao.android.detail.ttdetail.component.c.ComponentFatigueContainer.a(false);
        }
    }

    private boolean a(int i, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("324263ba", new Object[]{this, new Integer(i), objArr})).booleanValue();
        }
        nup nupVar = this.L;
        if (nupVar == null) {
            return false;
        }
        switch (i) {
            case 1:
                nupVar.a((eyx) objArr[0], (Context) objArr[1], (Intent) objArr[2]);
                break;
            case 2:
                nupVar.a((com.taobao.android.detail.ttdetail.platformization.business.b) objArr[0]);
                break;
            case 3:
                nupVar.b();
                break;
            case 4:
                return nupVar.a((Map) objArr[0], (lus) objArr[1], ((Boolean) objArr[2]).booleanValue());
            case 5:
                return nupVar.a((Map) objArr[0], (MtopResponse) objArr[1], ((Integer) objArr[2]).intValue());
            case 6:
                nupVar.a(((Boolean) objArr[0]).booleanValue());
                break;
            case 7:
                return nupVar.a((JSONObject) objArr[0]);
            case 8:
                nupVar.c();
                break;
            case 9:
                nupVar.d();
                break;
            default:
                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "callLifecycle with invalid state: " + i);
                break;
        }
        return false;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.Q) {
        } else {
            throw new IllegalStateException("must invoke setupEvn() before call " + str + " method");
        }
    }

    public static boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue() : ay.a(intent);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        a("onCreate(boolean)");
        m.b(19999, "Page_Detail_EnterNewStructure", null);
        com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "enter TTDetailPageManager onCreate()");
        b(this.d);
        a(this.d);
        if (z) {
            this.A = new TTDInsideController(this.b);
            this.A.a();
            this.A.a(this.z);
            if (com.taobao.android.detail.ttdetail.utils.j.ad()) {
                this.A.a(new a(this.E));
            }
        }
        this.e = new b();
        this.z.create();
        s();
        o();
        if (this.r) {
            al.a(this.c, this.f.b());
            al.a(this.c, this.U);
            al.a(this.c, this.f);
        }
        odg.a(this.c, this.b);
        a(1, this.b, this.c, new Intent(this.d).putExtra(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV_ORIGINAL_HOST, this.t));
        a(2, new com.taobao.android.detail.ttdetail.platformization.business.b() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.16
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.platformization.business.b
            public <T extends View> T a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (T) ipChange2.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)});
                }
                T t = (T) TTDetailPageManager.this.i().findViewById(i);
                return t == null ? (T) TTDetailPageManager.g(TTDetailPageManager.this).findViewById(i) : t;
            }
        });
        com.taobao.android.detail.ttdetail.behavior.b.b(this.c, "url", URLEncoder.encode(this.d.getDataString()));
        Context context = this.c;
        com.taobao.android.detail.ttdetail.behavior.b.b(context, "device_width_px", String.valueOf(context.getResources().getDisplayMetrics().widthPixels));
        Context context2 = this.c;
        com.taobao.android.detail.ttdetail.behavior.b.b(context2, "device_height_px", String.valueOf(context2.getResources().getDisplayMetrics().heightPixels));
        a((Map<String, String>) null, (lus) null, false, new RuntimeParam[0]);
        av.c(this.b, "containerInitEnd", System.currentTimeMillis());
    }

    /* loaded from: classes4.dex */
    public static class a implements InsideLinearLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final shq f10482a;

        static {
            kge.a(2022512733);
            kge.a(937856779);
        }

        public a(shq shqVar) {
            this.f10482a = shqVar;
        }

        @Override // com.taobao.android.detail.ttdetail.inside.InsideLinearLayout.a
        public void a(InsideLinearLayout.InsideDetailState insideDetailState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94fcc36c", new Object[]{this, insideDetailState});
            } else if (!InsideLinearLayout.InsideDetailState.FULL_SCREEN.equals(insideDetailState)) {
            } else {
                shq shqVar = this.f10482a;
                if (shqVar == null) {
                    com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "mBarrageController为空，渲染全局弹幕失败");
                } else {
                    shqVar.d();
                }
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.I.k();
        TTDInsideController tTDInsideController = this.A;
        if (tTDInsideController == null) {
            return;
        }
        tTDInsideController.b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            al.a(this.c, this.f);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.r) {
            al.a(this.c, z());
        }
        shq shqVar = this.E;
        if (shqVar != null) {
            shqVar.a();
        }
        t.b(this.c, this.b);
        TTDInsideController tTDInsideController = this.A;
        if (tTDInsideController != null) {
            tTDInsideController.c();
        }
        this.z.c();
        a(3, new Object[0]);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.r) {
            al.a(this.c);
        }
        shq shqVar = this.E;
        if (shqVar != null) {
            shqVar.b();
        }
        t.a(this.c, this.b);
        TTDInsideController tTDInsideController = this.A;
        if (tTDInsideController != null) {
            tTDInsideController.d();
        }
        this.z.b();
        a(8, new Object[0]);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.I.l();
        TTDInsideController tTDInsideController = this.A;
        if (tTDInsideController == null) {
            return;
        }
        tTDInsideController.e();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.q = true;
        try {
            w();
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "onDestroy() reportPerformanceData exception", th);
        }
        this.b.a().a(this.f10455a);
        try {
            y();
        } catch (Throwable th2) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "onDestroy() disappearGlobalComponent exception", th2);
        }
        this.z.destroy();
        t();
        this.x.a();
        com.taobao.android.detail.ttdetail.performance.d.b(this.c);
        shq shqVar = this.E;
        if (shqVar != null) {
            shqVar.c();
        }
        this.D.b();
        this.u.c();
        this.B.b();
        this.I.m();
        TTDInsideController tTDInsideController = this.A;
        if (tTDInsideController != null) {
            tTDInsideController.g();
        }
        soy soyVar = this.J;
        if (soyVar != null) {
            soyVar.destroy();
        }
        com.taobao.android.detail.ttdetail.component.c.ComponentFatigueContainer.a(this.c, this.f.f());
        com.taobao.android.detail.ttdetail.behavior.b.a(this.c, this.p);
        a(9, new Object[0]);
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else if (!this.p) {
        } else {
            String a2 = bq.a(this.B.f());
            if (!StringUtils.isEmpty(a2)) {
                com.taobao.android.detail.ttdetail.behavior.b.a(this.c, a2, 2);
            }
            soy soyVar = this.J;
            if (soyVar == null) {
                return;
            }
            com.taobao.android.detail.ttdetail.behavior.b.a(this.c, bq.a(soyVar), 2);
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        Map<String, Long> b = av.b(this.b);
        JSONObject jSONObject = new JSONObject();
        if (b != null && !b.isEmpty()) {
            jSONObject.putAll(b);
        }
        Map<String, Long> d = av.d(this.b);
        if (d != null && !d.isEmpty()) {
            jSONObject.putAll(d);
        }
        jSONObject.putAll(m.a(this.b.a()));
        jSONObject.putAll(this.f.b());
        if (jSONObject.isEmpty()) {
            return;
        }
        m.b(19999, ecg.PERFORMANCE_BIZ_NAME, jSONObject);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.I.b();
    }

    public boolean b(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1a9b2746", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : this.x.a(i, keyEvent);
    }

    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.I.a(i, i2, intent);
        }
    }

    public void a(TTDInsideController.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca419a0", new Object[]{this, aVar});
            return;
        }
        TTDInsideController tTDInsideController = this.A;
        if (tTDInsideController == null) {
            return;
        }
        tTDInsideController.a(aVar);
    }

    public void a(nup nupVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eeaaaf", new Object[]{this, nupVar});
        } else {
            this.L = nupVar;
        }
    }

    private String z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this}) : !StringUtils.isEmpty(this.T) ? this.T : "Page_Detail";
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.T = str;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.U = map;
        }
    }

    public void a(com.taobao.android.detail.ttdetail.widget.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89aa800a", new Object[]{this, gVar});
            return;
        }
        this.R = gVar;
        u();
    }

    private void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.widget.g gVar = this.R;
        if (gVar == null || !gVar.c() || this.I == null) {
            return;
        }
        View i = i();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i.findViewById(R.id.ll_tt_detail_bottom_bar).getLayoutParams();
        marginLayoutParams.leftMargin = this.R.d();
        marginLayoutParams.rightMargin = this.R.e();
        marginLayoutParams.bottomMargin = this.R.f();
        ((RelativeLayout.LayoutParams) i.findViewById(R.id.fl_tt_detail_fragment_container).getLayoutParams()).addRule(2, 0);
        ((RelativeLayout.LayoutParams) i.findViewById(R.id.vp_hscroll_container).getLayoutParams()).addRule(2, 0);
        i.requestLayout();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        if (this.f.g()) {
            com.taobao.android.detail.ttdetail.bridge.a.a();
        }
        TTWXModule.initBridge();
        TBXSkuCore.f();
    }

    private void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        String e = this.f.e();
        if (e != null) {
            this.b.e().a("requestItemId", e);
        }
        String a2 = k.a(intent);
        if (!StringUtils.isEmpty(a2)) {
            this.b.e().a("lastPageSetSkuId", a2);
        }
        this.b.e().a("is99tm", Boolean.valueOf(this.f.g()));
    }

    private void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
        } else if (intent == null) {
        } else {
            String stringExtra = this.d.getStringExtra(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV_ORIGINAL_HOST);
            if (!StringUtils.isEmpty(stringExtra)) {
                this.t = stringExtra;
            }
            this.d.removeExtra(com.taobao.android.detail.ttdetail.constant.a.KEY_NAV_ORIGINAL_HOST);
        }
    }

    public void a(Map<String, String> map, lus lusVar, boolean z, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8064afe", new Object[]{this, map, lusVar, new Boolean(z), runtimeParamArr});
        } else {
            a(map, lusVar, z, (Map<String, String>) null, runtimeParamArr);
        }
    }

    private void a(final Map<String, String> map, final lus lusVar, boolean z, Map<String, String> map2, RuntimeParam... runtimeParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c06d64c1", new Object[]{this, map, lusVar, new Boolean(z), map2, runtimeParamArr});
            return;
        }
        if (z && this.y && com.taobao.android.detail.ttdetail.utils.j.M()) {
            com.taobao.android.sku.weex.c.a(this.b.e().a());
        }
        HashMap hashMap = null;
        if (this.b.a().b() != 2) {
            this.b.a().a((MtopInfo) null);
        }
        if (map != null) {
            String str = map.get(DetailCoreActivity.DETAIL_ITEM_ID);
            String str2 = map.get(fgl.TARGETITEMID);
            if (!StringUtils.isEmpty(str)) {
                this.f.a(str);
            } else if (!StringUtils.isEmpty(str2) && !StringUtils.equals(this.f.e(), str2)) {
                this.f.a(str2);
            }
        }
        if (this.p) {
            com.taobao.android.detail.ttdetail.behavior.b.a(this.c, bq.a(bq.a(runtimeParamArr)), ai.EVENT_TYPE, (Map<String, String>) new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.17
                {
                    put("update_item_id", TTDetailPageManager.n(TTDetailPageManager.this).h());
                }
            });
        }
        soa soaVar = new soa() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.18
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private Map<String, Object> d = new HashMap(0);

            private void a(MtopInfo mtopInfo, boolean z2) {
                MtopInfo a2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec2adbe4", new Object[]{this, mtopInfo, new Boolean(z2)});
                } else if (TTDetailPageManager.o(TTDetailPageManager.this)) {
                } else {
                    if (Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sMockTBLiveTinyShop)) && (a2 = bl.a(TTDetailPageManager.b(TTDetailPageManager.this))) != null) {
                        mtopInfo = a2;
                        z2 = true;
                    }
                    try {
                        String a3 = TTDetailPageManager.a(TTDetailPageManager.this, map, mtopInfo, (Map) this.d, z2, true);
                        if (!StringUtils.isEmpty(a3)) {
                            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "onFinish setMtopDataInternal errorMsg: " + a3);
                        }
                        lus lusVar2 = lusVar;
                        if (lusVar2 == null || !z2) {
                            return;
                        }
                        lusVar2.a();
                    } catch (Throwable th) {
                        try {
                            if (com.taobao.android.detail.ttdetail.utils.j.an()) {
                                String h = TTDetailPageManager.n(TTDetailPageManager.this).h();
                                JSONObject c = com.taobao.android.detail.ttdetail.utils.g.c(as.a(mtopInfo));
                                String b = TTDetailPageManager.b(TTDetailPageManager.this, h);
                                TTDetailPageManager.a(TTDetailPageManager.this, c, b, h);
                                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "mtop callback onFinish() exception to h5", th);
                                String str3 = (String) TTDetailPageManager.c(TTDetailPageManager.this).e().a("traceId");
                                if (StringUtils.isEmpty(str3)) {
                                    str3 = "";
                                }
                                ab.a(b, h, str3, TTDetailPageManager.a(TTDetailPageManager.this, TTDetailPageManager.b(TTDetailPageManager.this)), "mtop callback onFinish() exception", new HashMap<String, String>(1) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.18.1
                                    {
                                        put("exception", Log.getStackTraceString(th));
                                    }
                                });
                            } else {
                                final TTDataDealException tTDataDealException = new TTDataDealException("mtop callback onFinish() exception: ", th);
                                TTDetailPageManager.c(TTDetailPageManager.this).b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.18.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        throw tTDataDealException;
                                    }
                                });
                            }
                            lus lusVar3 = lusVar;
                            if (lusVar3 == null || !z2) {
                                return;
                            }
                            lusVar3.a();
                        } catch (Throwable th2) {
                            lus lusVar4 = lusVar;
                            if (lusVar4 == null) {
                                return;
                            }
                            if (z2) {
                                lusVar4.a();
                            }
                            throw th2;
                        }
                    }
                }
            }

            @Override // tb.soa
            public void a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("33fc5943", new Object[]{this, mtopInfo, new Integer(i), baseOutDo, obj});
                } else {
                    a(mtopInfo, true);
                }
            }

            @Override // tb.soa
            public void a(MtopInfo mtopInfo, int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4224cd2f", new Object[]{this, mtopInfo, new Integer(i), obj});
                } else {
                    a(mtopInfo, false);
                }
            }
        };
        final soa soaVar2 = new soa() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.19
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public MtopInfo c;

            private void a(MtopInfo mtopInfo, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec2adbe4", new Object[]{this, mtopInfo, new Boolean(z2)});
                } else if (TTDetailPageManager.o(TTDetailPageManager.this)) {
                } else {
                    MtopInfo mtopInfo2 = this.c;
                    if (mtopInfo2 != null && mtopInfo2.a() == 3) {
                        com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "handleSuccessStreamCustomApi first stream mtopInfo status ERROR");
                        return;
                    }
                    if (z2) {
                        TTDetailPageManager.a(TTDetailPageManager.this, map, mtopInfo);
                    } else {
                        MtopResponse b = mtopInfo.b();
                        TTDetailPageManager.a(TTDetailPageManager.this, b == null ? "ResponseEmpty" : b.getRetMsg(), mtopInfo);
                    }
                    this.c = mtopInfo;
                }
            }

            @Override // tb.soa
            public void a(MtopInfo mtopInfo, int i, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("33fc5943", new Object[]{this, mtopInfo, new Integer(i), baseOutDo, obj});
                } else {
                    a(mtopInfo, true);
                }
            }

            @Override // tb.soa
            public void a(MtopInfo mtopInfo, int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4224cd2f", new Object[]{this, mtopInfo, new Integer(i), obj});
                } else {
                    a(mtopInfo, false);
                }
            }
        };
        Object[] objArr = new Object[3];
        if (map != null) {
            hashMap = new HashMap(map);
        }
        objArr[0] = hashMap;
        objArr[1] = lusVar;
        objArr[2] = Boolean.valueOf(!z);
        if (a(4, objArr)) {
            return;
        }
        if (az.b(map)) {
            tae.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.20
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        TTDetailPageManager.p(TTDetailPageManager.this).a(TTDetailPageManager.n(TTDetailPageManager.this), soaVar2, map);
                    }
                }
            });
        } else {
            this.e.a(this.f, soaVar, map, !z, map2);
        }
    }

    public String a(Map<String, String> map, MtopResponse mtopResponse, int i) {
        StringBuilder sb;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86d7aa1f", new Object[]{this, map, mtopResponse, new Integer(i)});
        }
        if (m()) {
            return "container is destroying";
        }
        if (i == 0) {
            return "INVALID status not allowed";
        }
        if (i == 1 || i == 2) {
            z = true;
        } else if (i != 3) {
            return "UNKNOWN status value: " + i;
        }
        h();
        String str = null;
        try {
            str = a(map, new MtopInfo().a(mtopResponse).a(i), this.M, z, false);
        } catch (Throwable th) {
            try {
                if (com.taobao.android.detail.ttdetail.utils.j.an()) {
                    String h = this.f.h();
                    JSONObject c = com.taobao.android.detail.ttdetail.utils.g.c(as.b(mtopResponse));
                    String b = b(h);
                    a(c, b, h);
                    com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "setMtopData() exception to h5", th);
                    String str2 = (String) this.b.e().a("traceId");
                    if (StringUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    ab.a(b, h, str2, a(this.c), "setMtopData() exception", new HashMap<String, String>(1) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.21
                        {
                            put("exception", Log.getStackTraceString(th));
                        }
                    });
                } else {
                    final TTDataDealException tTDataDealException = new TTDataDealException("setMtopData() exception: ", th);
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        throw tTDataDealException;
                    }
                    this.b.b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.22
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            throw tTDataDealException;
                        }
                    });
                }
                if (!StringUtils.isEmpty(null)) {
                    sb = new StringBuilder();
                }
            } catch (Throwable th2) {
                if (!StringUtils.isEmpty(null)) {
                    com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "开放化业务设置数据 setMtopDataInternal errorMsg: " + ((String) null));
                }
                throw th2;
            }
        }
        if (!StringUtils.isEmpty(str)) {
            sb = new StringBuilder();
            sb.append("开放化业务设置数据 setMtopDataInternal errorMsg: ");
            sb.append(str);
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", sb.toString());
        }
        return str;
    }

    private synchronized void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.K == null) {
            this.K = Looper.myLooper();
        } else if (Looper.myLooper() == this.K) {
        } else {
            throw new RuntimeException(new Throwable("setMtopData(MtopResponse, int) was called on thread '" + Thread.currentThread().getName() + "'. setMtopData(MtopResponse, int) be called must on the same thread any time. (Expected Looper " + this.K + " called on " + Looper.myLooper() + riy.BRACKET_END_STR));
        }
    }

    private String a(Map<String, String> map, MtopInfo mtopInfo, Map<String, Object> map2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cd05ae16", new Object[]{this, map, mtopInfo, map2, new Boolean(z), new Boolean(z2)});
        }
        if (mtopInfo == null) {
            map2.clear();
            return "setMtopDataInternal mtopInfo is null";
        }
        eyx eyxVar = this.b;
        if (eyxVar != null && eyxVar.e() != null) {
            this.b.e().a("traceId", az.b(mtopInfo.b()));
        }
        if (z2) {
            Object[] objArr = new Object[3];
            objArr[0] = map != null ? new HashMap(map) : null;
            objArr[1] = mtopInfo.b();
            objArr[2] = Integer.valueOf(mtopInfo.a());
            if (a(5, objArr)) {
                return "setMtopDataInternal was intercepted by lifecycle";
            }
        }
        if (z) {
            String a2 = a(map, mtopInfo, map2);
            if (!StringUtils.isEmpty(a2) || com.taobao.android.detail.ttdetail.request.a.a(mtopInfo)) {
                map2.clear();
            }
            return a2;
        }
        String b = b(map, mtopInfo, map2);
        if (!StringUtils.isEmpty(b) || com.taobao.android.detail.ttdetail.request.a.b(mtopInfo)) {
            map2.clear();
        }
        return b;
    }

    private boolean a(MtopInfo mtopInfo, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("54b6e899", new Object[]{this, mtopInfo, map})).booleanValue() : Boolean.parseBoolean(String.valueOf(map.get(com.taobao.android.detail.ttdetail.constant.a.USE_STREAM_API))) && az.a(mtopInfo);
    }

    private void a(Map<String, String> map, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4bc765b", new Object[]{this, map, mtopInfo});
            return;
        }
        JSONObject a2 = as.a(mtopInfo);
        if (a2 == null || a2.isEmpty()) {
            a("MtopDataEmpty", mtopInfo);
        } else if (ag.a(mtopInfo.b())) {
            a("NetExceptionToErrorPage", mtopInfo);
        } else if (ab.a(a2)) {
            a("Degrade2ErrorPage", mtopInfo);
        } else {
            JSONObject c = com.taobao.android.detail.ttdetail.utils.g.c(a2);
            if (c == null || c.isEmpty()) {
                a("MergeMtopEmpty", mtopInfo);
            } else if (com.taobao.android.detail.ttdetail.utils.d.c(c)) {
                a("DegradeToOldMtop", mtopInfo);
            } else if (at.a(c)) {
                a("OneProductMMDegrade", mtopInfo);
            } else if (com.taobao.android.detail.ttdetail.utils.d.p(c)) {
                a("SkuDataInvalid", mtopInfo);
            } else {
                boolean a3 = com.taobao.android.detail.ttdetail.request.a.a(mtopInfo);
                if (com.taobao.android.detail.ttdetail.request.a.c(mtopInfo)) {
                    a(a2, map, true);
                    com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "handleSuccessStreamCustomApi isRequestStreaming true updateSKU thread=" + Thread.currentThread().getName());
                }
                if (!a3) {
                    return;
                }
                a(JSONObject.parseObject(JSON.toJSONString(a2, SerializerFeature.DisableCircularReferenceDetect)), mtopInfo);
                this.b.a().a(mtopInfo);
                a(a2, map, false);
                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "handleSuccessStreamCustomApi isRequestSuccess true updateSKU thread=" + Thread.currentThread().getName());
            }
        }
    }

    private String a(Map<String, String> map, final MtopInfo mtopInfo, Map<String, Object> map2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a583e16", new Object[]{this, map, mtopInfo, map2});
        }
        if (mtopInfo == null) {
            return "mtopInfo is null with SUCCESS state";
        }
        JSONObject a2 = as.a(mtopInfo);
        if (a2 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", this.f.h());
            ae.a(hashMap, -300016, "pageManager拿到的主接口数据为空");
            return "mtopInfo has no response with " + mtopInfo.c() + " state";
        } else if (!this.s.a(a2)) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "abort preloadData");
            return "must set preload data firstly";
        } else {
            boolean b = com.taobao.android.detail.ttdetail.utils.d.b(a2);
            if (b && Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sInvokePreloadRender))) {
                return "user setting not display preload data";
            }
            if (ab.a(a2)) {
                final MtopResponse mtopResponse = new MtopResponse();
                mtopResponse.setRetCode(ErrorConstant.ERRCODE_SYSTEM_ERROR);
                com.taobao.android.detail.ttdetail.utils.c.a(this.b, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.23
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        String b2 = az.b(mtopInfo.b());
                        TTDetailPageManager.a(TTDetailPageManager.this, mtopResponse);
                        ab.a(r4, "服务端降级degradeToErrorPage", true, TTDetailPageManager.n(TTDetailPageManager.this).h(), b2);
                    }
                });
                return "server force degradeToErrorPage with " + mtopInfo.c() + " state";
            }
            boolean a3 = com.taobao.android.detail.ttdetail.request.a.a(mtopInfo);
            boolean c = com.taobao.android.detail.ttdetail.request.a.c(mtopInfo);
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "handleSuccess, 流式一段：" + c + ", 成功：" + a3);
            if (c || a3) {
                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "setMtopRawData 刷新主屏，当前线程=" + Thread.currentThread().getName());
                String str2 = null;
                this.b.a().a((MtopInfo) null);
                if (!(a(mtopInfo, map2) && a3 && Boolean.FALSE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sInvokeStreamingFinish)))) {
                    if (!a((b || !a3) ? a2 : JSONObject.parseObject(JSON.toJSONString(a2, SerializerFeature.DisableCircularReferenceDetect)), mtopInfo)) {
                        str2 = "downgrade to redirect Url or DetailWrapperActivity";
                    }
                }
                this.b.a().a(mtopInfo);
                str = str2;
            } else {
                str = "mtopInfo has invalid state: " + mtopInfo.c() + " with call onSuccess callback";
            }
            map2.put(com.taobao.android.detail.ttdetail.constant.a.USE_STREAM_API, Boolean.valueOf(c));
            if (a3) {
                a(a2, map, false);
            }
            return str;
        }
    }

    private void a(final String str, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c9df66", new Object[]{this, str, mtopInfo});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("onUpdateDetail TTDetailPageManager.updateSKUFail errorMsg:" + str);
        if (mtopInfo != null) {
            mtopInfo.a(3);
        }
        com.taobao.android.detail.ttdetail.utils.c.a(this.b, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.24
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TTDetailPageManager.j(TTDetailPageManager.this).b()) {
                } else {
                    TTDetailPageManager.j(TTDetailPageManager.this).b(str);
                }
            }
        });
    }

    private void a(final JSONObject jSONObject, final Map<String, String> map, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af393377", new Object[]{this, jSONObject, map, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("onUpdateDetail TTDetailPageManager.updateSKU keepAlive:" + z);
        com.taobao.android.detail.ttdetail.utils.c.a(this.b, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.25
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TTDetailPageManager.j(TTDetailPageManager.this).b()) {
                } else {
                    Map map2 = map;
                    if (map2 != null && "true".equals(map2.get("clearSkuStorage"))) {
                        TTDetailPageManager.j(TTDetailPageManager.this).g();
                    }
                    TTDetailPageManager.j(TTDetailPageManager.this).f();
                    iyf.a().a("showToUpdate", (Map<String, String>) null);
                    iyf.a().b("beforeWeexInitInUpdate", "afterMtop");
                    if (!com.taobao.android.detail.ttdetail.utils.j.aj()) {
                        TTDetailPageManager.j(TTDetailPageManager.this).b(jSONObject.toJSONString(), z);
                        return;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    JSONObject e = com.taobao.android.sku.utils.g.e(jSONObject);
                    iyf.a().a("transJsonInUpdateSku", "beforeWeexInitInUpdate", currentTimeMillis, System.currentTimeMillis(), null);
                    TTDetailPageManager.j(TTDetailPageManager.this).a(e, z);
                }
            }
        });
    }

    private String b(Map<String, String> map, final MtopInfo mtopInfo, Map<String, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ddfe117", new Object[]{this, map, mtopInfo, map2});
        }
        if (mtopInfo == null) {
            return "mtopInfo is null with ERROR state";
        }
        String str = null;
        if (com.taobao.android.detail.ttdetail.request.a.b(mtopInfo)) {
            this.b.a().a(mtopInfo);
        } else {
            str = "mtopInfo has invalid state: " + mtopInfo.c() + " with call onFailure callback";
        }
        final MtopResponse b = mtopInfo.b();
        String str2 = "";
        final String retCode = b != null ? b.getRetCode() : str2;
        if (b != null) {
            str2 = b.getRetMsg();
        }
        final String str3 = str2;
        com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "onFailure回调， retCode=" + retCode + "retMsg=" + str3);
        com.taobao.android.detail.ttdetail.utils.c.a(this.b, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.26
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!TTDetailPageManager.q(TTDetailPageManager.this)) {
                    String b2 = az.b(mtopInfo.b());
                    TTDetailPageManager.a(TTDetailPageManager.this, b);
                    ab.a(retCode, str3, false, TTDetailPageManager.n(TTDetailPageManager.this).h(), b2);
                } else {
                    if (TTDetailPageManager.j(TTDetailPageManager.this).b()) {
                        TTDetailPageManager.j(TTDetailPageManager.this).a(str3);
                    }
                    ag.a(TTDetailPageManager.b(TTDetailPageManager.this), b);
                }
            }
        });
        return str;
    }

    private void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
            return;
        }
        View view = this.n;
        if (view != null) {
            view.setVisibility(0);
            return;
        }
        try {
            this.n = ((ViewStub) i().findViewById(R.id.fl_error_view_container)).inflate();
        } catch (Exception unused) {
            this.n = i().findViewById(R.id.error_view_container);
        }
        this.o = (TBErrorView) this.n.findViewById(R.id.error_view);
        this.o.setButton(TBErrorView.ButtonType.BUTTON_LEFT, odg.o().a(R.string.tt_refresh), new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.27
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                if (com.taobao.android.detail.ttdetail.utils.j.al()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("x-nw-retry", "true");
                    TTDetailPageManager.a(TTDetailPageManager.this, (Map) null, (lus) null, true, (Map) hashMap, new RuntimeParam[0]);
                } else {
                    TTDetailPageManager.this.a((Map<String, String>) null, (lus) null, true, new RuntimeParam[0]);
                }
                TTDetailPageManager.r(TTDetailPageManager.this).setVisibility(8);
                TTDetailPageManager.s(TTDetailPageManager.this).setVisibility(0);
            }
        });
        if (com.taobao.android.detail.ttdetail.utils.j.ar()) {
            mtopResponse.setRetCode("ANDROID_SYS_NETWORK_ERROR");
        }
        if (mtopResponse != null) {
            this.o.setError(Error.Factory.fromMtopResponse(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg()));
        }
        View findViewById = this.n.findViewById(R.id.back_button);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.28
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                } else {
                    y.b(TTDetailPageManager.b(TTDetailPageManager.this));
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.topMargin = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(com.taobao.android.detail.ttdetail.utils.f.a());
        findViewById.setLayoutParams(layoutParams);
        this.n.setVisibility(0);
    }

    private boolean a(final JSONObject jSONObject, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ead519d4", new Object[]{this, jSONObject, mtopInfo})).booleanValue();
        }
        try {
            return b(jSONObject, mtopInfo);
        } catch (Throwable th) {
            if (!com.taobao.android.detail.ttdetail.utils.d.b(jSONObject)) {
                final TTDataDealException tTDataDealException = new TTDataDealException("setMtopRawData() exception: ", th);
                this.q = true;
                this.b.b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.29
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!com.taobao.android.detail.ttdetail.utils.j.an()) {
                            throw tTDataDealException;
                        } else {
                            String h = TTDetailPageManager.n(TTDetailPageManager.this).h();
                            JSONObject jSONObject2 = null;
                            try {
                                jSONObject2 = com.taobao.android.detail.ttdetail.utils.g.c(jSONObject);
                            } catch (Throwable th2) {
                                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "setMtopRawData() get mergedData exception", th2);
                            }
                            String b = TTDetailPageManager.b(TTDetailPageManager.this, h);
                            TTDetailPageManager.a(TTDetailPageManager.this, jSONObject2, b, h);
                            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "setMtopRawData() exception to h5", th);
                            String str = (String) TTDetailPageManager.c(TTDetailPageManager.this).e().a("traceId");
                            if (StringUtils.isEmpty(str)) {
                                str = "";
                            }
                            String str2 = str;
                            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
                            ab.a(b, h, str2, TTDetailPageManager.a(tTDetailPageManager, TTDetailPageManager.b(tTDetailPageManager)), "setMtopRawData() exception", new HashMap<String, String>(1) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.29.1
                                {
                                    put("exception", Log.getStackTraceString(th));
                                }
                            });
                        }
                    }
                });
            }
            return false;
        }
    }

    private boolean b(JSONObject jSONObject, MtopInfo mtopInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0ffa295", new Object[]{this, jSONObject, mtopInfo})).booleanValue();
        }
        if (com.taobao.android.detail.ttdetail.utils.d.b(jSONObject)) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "preload setMtopRawDataSafety");
            av.c(this.b, "preDispatch", System.currentTimeMillis());
            b(jSONObject.getJSONObject("data"), mtopInfo.a());
            return true;
        }
        eyx eyxVar = this.b;
        String str = eyxVar != null && eyxVar.e() != null ? (String) this.b.e().a("traceId") : "";
        av.c(this.b, "parse", System.currentTimeMillis());
        String h = this.f.h();
        JSONObject c = com.taobao.android.detail.ttdetail.utils.g.c(jSONObject);
        Uri a2 = a(this.c);
        a(c, h, str, a2);
        boolean a3 = bo.a((Item) com.taobao.android.detail.ttdetail.utils.aj.a(c, Item.class));
        if (a3) {
            a(h, str, a2);
        }
        if (!a3) {
            String a4 = ab.a(this.c, jSONObject, h);
            if (!StringUtils.isEmpty(a4) && a(c, a4, h)) {
                ab.a(a4, h, str);
                return false;
            }
            String a5 = com.taobao.android.detail.ttdetail.utils.d.a(h, c);
            if (!StringUtils.isEmpty(a5) && a(c, a5, h)) {
                ab.a(a5, false, h, str);
                return false;
            }
        }
        if (DetailV3Converter.b(c) && com.taobao.android.detail.ttdetail.utils.j.c(c)) {
            JSONObject c2 = DetailV3Converter.c(c);
            if (mtopInfo.a() == 1 && Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sClipStreamingData))) {
                c2 = com.taobao.android.detail.ttdetail.utils.d.h(c2);
            }
            if (!this.p) {
                this.p = true;
            }
            av.c(this.b, "parseEnd", System.currentTimeMillis());
            av.c(this.b, "dispatch", System.currentTimeMillis());
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "main setMtopRawDataSafety");
            b(c2, mtopInfo.a());
            bn.Companion.a(h, c2);
            return true;
        }
        a(c, h, str, a2, a3);
        String b = b(h);
        if (com.taobao.android.detail.ttdetail.utils.j.Z() && com.taobao.android.detail.ttdetail.utils.j.ah() && a(c, b, h)) {
            m.b(19999, "Page_Detail_DefaultRenderH5", null);
            ab.a(b, h, str, a2, a3);
            return false;
        }
        com.taobao.android.detail.ttdetail.utils.c.a(this.b, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.30
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (TTDetailPageManager.c(TTDetailPageManager.this).a().b(TTDetailPageManager.t(TTDetailPageManager.this))) {
                } else {
                    TTDetailPageManager.c(TTDetailPageManager.this).a().c(TTDetailPageManager.t(TTDetailPageManager.this));
                }
            }
        });
        return false;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        return "https://pages-g.m.taobao.com/wow/z/app/detail-next/item/index?x-ssr=true&id=" + str;
    }

    private Uri a(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("14ca6d97", new Object[]{this, context});
        }
        if (!(context instanceof Activity) || (intent = ((Activity) context).getIntent()) == null) {
            return null;
        }
        return intent.getData();
    }

    private void a(JSONObject jSONObject, String str, String str2, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8133d42b", new Object[]{this, jSONObject, str, str2, uri});
            return;
        }
        try {
            if (com.taobao.android.detail.ttdetail.utils.d.i(com.taobao.android.detail.ttdetail.utils.g.e(jSONObject))) {
                return;
            }
            m.b(19999, "Page_Detail_TcloudData", null);
            ab.a(-100026, str, str2, uri, false);
        } catch (Exception unused) {
        }
    }

    private void a(String str, String str2, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c32f4b", new Object[]{this, str, str2, uri});
            return;
        }
        try {
            m.b(19999, "Page_Detail_FliggyData", null);
            ab.a(-100027, str, str2, uri, true);
        } catch (Exception unused) {
        }
    }

    private void a(JSONObject jSONObject, String str, String str2, Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5476409", new Object[]{this, jSONObject, str, str2, uri, new Boolean(z)});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
            if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                if (jSONObject2.getBooleanValue("finalUltron")) {
                    m.b(19999, "Page_Detail_FinalUltronData", null);
                    ab.a(-100028, str, str2, uri, z);
                } else {
                    m.b(19999, "Page_Detail_Ultron2Data", null);
                    ab.a(-100029, str, str2, uri, z);
                }
            }
        } catch (Exception unused) {
        }
    }

    private boolean a(final JSONObject jSONObject, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95510ca0", new Object[]{this, jSONObject, str, str2})).booleanValue();
        }
        if (m()) {
            return true;
        }
        this.q = true;
        com.taobao.android.detail.ttdetail.utils.c.a(this.b, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.31
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    al.a(jSONObject, TTDetailPageManager.a(TTDetailPageManager.this).getData());
                } catch (Throwable th) {
                    com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "IpvUtils.sendDuJuanInfo() exception", th);
                }
                TTDetailPageManager.u(TTDetailPageManager.this);
                final String string = TTDetailPageManager.n(TTDetailPageManager.this).b().getString("spm");
                ab.a(TTDetailPageManager.b(TTDetailPageManager.this), str2, str, new HashMap<String, Object>() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.31.1
                    {
                        String str3 = string;
                        put("spm", str3 == null ? "" : str3);
                    }
                });
                com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "redirectUrl: " + str);
            }
        });
        return true;
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.q || y.a(this.c);
    }

    private void a(Intent intent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a99d76b", new Object[]{this, intent, jSONObject});
            return;
        }
        m.b(19999, "Page_Detail_Downgrade_Wrapper", null);
        if (!(this.c instanceof Activity) || intent == null) {
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "uri is null");
        } else if (m()) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "详情新架构 activity is destroying");
        } else {
            this.q = true;
            HashMap hashMap = new HashMap();
            hashMap.put("itemId", this.f.h());
            eyx eyxVar = this.b;
            if (eyxVar != null && eyxVar.e() != null) {
                hashMap.put("traceId", this.b.e().a("traceId"));
            }
            ae.a(hashMap, -100015, "新详情架构降级老详情");
            if (a(7, jSONObject)) {
                return;
            }
            String valueOf = String.valueOf(UUID.randomUUID().hashCode());
            if (jSONObject != null) {
                sDowngradeData.put(valueOf, jSONObject);
            }
            ab.a(this.c, l.a(data, this.t), valueOf);
        }
    }

    private void b(final JSONObject jSONObject, final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1379dfbc", new Object[]{this, jSONObject, new Integer(i)});
        } else {
            com.taobao.android.detail.ttdetail.utils.c.a(this.b, new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.32
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        TTDetailPageManager.a(TTDetailPageManager.this, jSONObject, i);
                    } catch (Throwable th) {
                        if (!com.taobao.android.detail.ttdetail.utils.j.an()) {
                            throw new TTDataDealException("main thread refreshLayout() exception: ", th);
                        }
                        String h = TTDetailPageManager.n(TTDetailPageManager.this).h();
                        String b = TTDetailPageManager.b(TTDetailPageManager.this, h);
                        TTDetailPageManager.a(TTDetailPageManager.this, jSONObject, b, h);
                        com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "main thread refreshLayout() exception to h5", th);
                        String str = (String) TTDetailPageManager.c(TTDetailPageManager.this).e().a("traceId");
                        if (StringUtils.isEmpty(str)) {
                            str = "";
                        }
                        String str2 = str;
                        TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
                        ab.a(b, h, str2, TTDetailPageManager.a(tTDetailPageManager, TTDetailPageManager.b(tTDetailPageManager)), "main thread refreshLayout() exception", new HashMap<String, String>(1) { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.32.1
                            {
                                put("exception", Log.getStackTraceString(th));
                            }
                        });
                    }
                }
            });
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        if (!this.r) {
            al.a(this.c, this.f.b());
            al.a(this.c, this.U);
            al.a(this.c, this.f);
            al.a(this.c, z());
        }
        this.r = true;
    }

    private void d(final JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a57bce3e", new Object[]{this, jSONObject, new Integer(i)});
        } else if (m()) {
        } else {
            boolean e = com.taobao.android.detail.ttdetail.utils.d.e(jSONObject);
            av.c(this.b, e ? "preRefreshLayout" : "refreshLayout", System.currentTimeMillis());
            String k = com.taobao.android.detail.ttdetail.utils.d.k(jSONObject);
            if (!StringUtils.isEmpty(k) && !StringUtils.equals(k, this.f.h())) {
                this.f.a(k);
            }
            this.f.i();
            this.b.e().a("requestItemId", this.f.h());
            this.B.a(jSONObject);
            this.f.a(this.b.a());
            this.l.setVisibility(8);
            View view = this.n;
            if (view != null) {
                view.setVisibility(8);
            }
            long currentTimeMillis = System.currentTimeMillis();
            View c = this.B.c();
            if (c != null && !bj.a(this.m, c)) {
                this.m.removeAllViews();
                this.m.addView(c, new ViewGroup.LayoutParams(-1, -2));
            }
            if (!e && com.taobao.android.detail.ttdetail.utils.j.an()) {
                this.m.setOnCheckListener(new BottomBarContainer.a() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.33
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.ttdetail.widget.BottomBarContainer.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else if (!com.taobao.android.detail.ttdetail.utils.j.an()) {
                        } else {
                            String h = TTDetailPageManager.n(TTDetailPageManager.this).h();
                            String b = TTDetailPageManager.b(TTDetailPageManager.this, h);
                            TTDetailPageManager.a(TTDetailPageManager.this, jSONObject, b, h);
                            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "bottomBar container is empty to h5");
                            String str = (String) TTDetailPageManager.c(TTDetailPageManager.this).e().a("traceId");
                            if (StringUtils.isEmpty(str)) {
                                str = "";
                            }
                            String str2 = str;
                            TTDetailPageManager tTDetailPageManager = TTDetailPageManager.this;
                            ab.a(b, h, str2, TTDetailPageManager.a(tTDetailPageManager, TTDetailPageManager.b(tTDetailPageManager)), "bottomBar container is empty", null);
                        }
                    }
                });
                this.m.startEmptyCheck();
            }
            if (!e) {
                String a2 = bq.a(this.B.f());
                if (!StringUtils.isEmpty(a2)) {
                    com.taobao.android.detail.ttdetail.behavior.b.a(this.c, a2, 2);
                    com.taobao.android.detail.ttdetail.behavior.b.a(this.c, a2, 1);
                }
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            if (this.f.g()) {
                com.taobao.android.detail.ttdetail.bridge.a.a("99tmCartUpdate", a.C0407a.WV_DATA_REQUEST_99_CART_UPDATE);
            }
            pir pirVar = (pir) this.b.a().a(pkw.PARSER_ID);
            long currentTimeMillis3 = System.currentTimeMillis();
            com.taobao.android.detail.ttdetail.component.module.d dVar = null;
            qms d = (pirVar == null || pirVar.h() == null) ? null : pirVar.h().d();
            if (d != null) {
                dVar = d.a(j().d());
            }
            soy soyVar = (soy) dVar;
            soy soyVar2 = this.J;
            if (soyVar2 != null && soyVar2 != soyVar) {
                soyVar2.destroy();
            }
            if (soyVar != null) {
                if (this.J != soyVar) {
                    soyVar.a(this.H);
                    this.z.a((TTDetailScrollerLayout.a) soyVar);
                    TTDInsideController tTDInsideController = this.A;
                    if (tTDInsideController != null) {
                        tTDInsideController.a(soyVar);
                    }
                }
                soyVar.a(d.a());
                soyVar.a(this.G);
                if (!e) {
                    String a3 = bq.a(soyVar);
                    com.taobao.android.detail.ttdetail.behavior.b.a(this.c, a3, 2);
                    com.taobao.android.detail.ttdetail.behavior.b.a(this.c, a3, 1);
                }
            }
            this.J = soyVar;
            long currentTimeMillis4 = System.currentTimeMillis();
            if (pirVar != null) {
                this.z.a(pirVar);
            }
            long currentTimeMillis5 = System.currentTimeMillis();
            com.taobao.android.detail.ttdetail.component.module.w wVar = (com.taobao.android.detail.ttdetail.component.module.w) this.b.b().a("mainScreen");
            if (wVar != null) {
                wVar.a(this.N);
            }
            this.I.c();
            boolean z = this.A != null && !InsideLinearLayout.InsideDetailState.FULL_SCREEN.equals(this.A.s());
            if (!com.taobao.android.detail.ttdetail.utils.j.ad() || !z) {
                shq shqVar = this.E;
                if (shqVar == null) {
                    com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "mBarrageController为空");
                } else {
                    shqVar.d();
                }
            }
            long currentTimeMillis6 = System.currentTimeMillis();
            this.D.a();
            long currentTimeMillis7 = System.currentTimeMillis();
            TTDInsideController tTDInsideController2 = this.A;
            if (tTDInsideController2 != null) {
                tTDInsideController2.h();
            }
            g gVar = this.w;
            if (gVar != null) {
                gVar.a();
            }
            if (!e) {
                if (this.S == null) {
                    this.S = new ctt();
                }
                this.S.a(this.b);
            }
            if ((!Boolean.TRUE.equals(com.taobao.android.detail.ttdetail.feature.a.mFeature.get(com.taobao.android.detail.ttdetail.feature.a.sInvokeStreamingFinish)) ? i == 1 : i == 2) && !e) {
                this.b.a().c(this.O);
            }
            if (com.taobao.android.detail.ttdetail.component.c.ComponentFatigueContainer.a() && !e) {
                bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.TTDetailPageManager.34
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            com.taobao.android.detail.ttdetail.component.c.ComponentFatigueContainer.a((Fatigue) TTDetailPageManager.c(TTDetailPageManager.this).a().a(Fatigue.class));
                        }
                    }
                });
            }
            com.taobao.android.detail.ttdetail.behavior.b.b(this.c, "detail_desc_component_type", bt.a((Item) this.b.a().a(Item.class)) ? "native" : "h5");
            a(6, Boolean.valueOf(e));
            p();
            if (!com.taobao.android.detail.ttdetail.utils.d.e(jSONObject)) {
                al.a(this.b.a(), this.d.getData());
            }
            q();
            al.a(com.taobao.android.detail.ttdetail.utils.d.a((Params) this.b.a().a(Params.class)), this.c);
            if (!e) {
                av.a(this.b, "refreshBB", currentTimeMillis2 - currentTimeMillis);
                av.a(this.b, "refreshMS", currentTimeMillis4 - currentTimeMillis5);
                av.a(this.b, "refreshNav", currentTimeMillis4 - currentTimeMillis3);
                av.a(this.b, "refreshFloat", currentTimeMillis7 - currentTimeMillis6);
            }
            av.c(this.b, e ? "preRefreshLayoutEnd" : "refreshLayoutEnd", System.currentTimeMillis());
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (y.a(this.c) || this.y) {
        } else {
            this.y = true;
            k.a(this.c, this.b, jSONObject);
            if (com.taobao.android.detail.ttdetail.utils.j.ab()) {
                k.b(this.c, this.b, jSONObject);
            }
            bs.a();
        }
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String r = r();
        if (!StringUtils.isEmpty(r)) {
            jSONObject.put("contain_miniapp", (Object) "1");
            jSONObject.put("miniappid", (Object) r);
            HashMap hashMap = new HashMap();
            hashMap.put("miniapp_id", r);
            hashMap.put("miniapp_object_type", "item");
            hashMap.put("miniapp_object_id", this.f.e());
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this.c, JSONObject.toJSONString(hashMap));
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSONObject.toJSONString(hashMap));
        } else {
            jSONObject.put("contain_miniapp", (Object) "0");
        }
        jSONObject.putAll(this.f.b());
        Item item = (Item) this.b.a().a(Item.class);
        if (item != null) {
            String categoryId = item.getCategoryId();
            String rootCategoryId = item.getRootCategoryId();
            if (StringUtils.isEmpty(categoryId)) {
                categoryId = "";
            }
            jSONObject.put("categoryId", (Object) categoryId);
            if (StringUtils.isEmpty(rootCategoryId)) {
                rootCategoryId = "";
            }
            jSONObject.put("rootCategoryId", (Object) rootCategoryId);
        }
        jSONObject.put("new_arch_unique_id", (Object) this.V);
        al.a(this.c, jSONObject);
        al.a(this.c, this.U);
    }

    private String r() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this});
        }
        Intent intent = this.d;
        if (intent != null && (data = intent.getData()) != null) {
            return data.getQueryParameter("miniAppId");
        }
        return null;
    }

    public View i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aec84b2", new Object[]{this}) : this.I.a();
    }

    public eyx j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("544333b1", new Object[]{this}) : this.b;
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b08903", new Object[]{this})).booleanValue();
        }
        TTDInsideController tTDInsideController = this.A;
        return tTDInsideController != null && tTDInsideController.f();
    }

    private String l() {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        String str = this.C;
        if (str != null) {
            return str;
        }
        com.taobao.android.detail.ttdetail.request.params.a aVar = this.f;
        if (aVar == null || (a2 = aVar.a()) == null) {
            return null;
        }
        this.C = a2.get("addressId");
        return this.C;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this});
        }
        eyx eyxVar = this.b;
        if (eyxVar != null && eyxVar.e() != null) {
            return (String) this.b.e().a("requestItemId");
        }
        return null;
    }

    private void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.g = new DetailUpdateDataReceiver(this.b, this.u, this.P);
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.g, intentFilter);
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "registerSkuUpdateReceiver error", th);
        }
        try {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.taobao.detail.inside.intent.action.cartUpdate");
            intentFilter2.addCategory("android.intent.category.DEFAULT");
            this.h = new TmCartUpdateReceiver();
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.h, intentFilter2);
        } catch (Throwable unused) {
        }
        try {
            IntentFilter intentFilter3 = new IntentFilter();
            intentFilter3.addAction("com.taobao.detail.inside.intent.action.closePage");
            intentFilter3.addCategory("android.intent.category.DEFAULT");
            this.i = new TmCloseDetailPageReceiver();
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.i, intentFilter3);
        } catch (Throwable unused2) {
        }
        try {
            IntentFilter intentFilter4 = new IntentFilter();
            intentFilter4.addAction("OpenCartItemCountChange");
            this.j = new BottomBarCartUpdateReceiver();
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.j, intentFilter4);
        } catch (Throwable unused3) {
        }
        try {
            IntentFilter intentFilter5 = new IntentFilter();
            intentFilter5.addAction("com.taobao.sku.intent.action.syncData");
            intentFilter5.addCategory("android.intent.category.DEFAULT");
            this.F = new DetailSKURefreshReceiver(this.b);
            LocalBroadcastManager.getInstance(this.c).registerReceiver(this.F, intentFilter5);
        } catch (Throwable th2) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "registerSkuRefreshReceiver error", th2);
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        try {
            if (this.g != null) {
                LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.g);
            }
        } catch (Throwable th) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "unregisterSkuUpdateReceiver error", th);
        }
        try {
            if (this.h != null) {
                LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.h);
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.i != null) {
                LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.i);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (this.j != null) {
                LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.j);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (this.F == null) {
                return;
            }
            LocalBroadcastManager.getInstance(this.c).unregisterReceiver(this.F);
        } catch (Throwable th2) {
            com.taobao.android.detail.ttdetail.utils.i.a("TTDetailPageManager", "unregisterSkuRefreshReceiver error", th2);
        }
    }

    /* loaded from: classes4.dex */
    public class TmCartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(962829947);
        }

        private TmCartUpdateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !TTDetailPageManager.n(TTDetailPageManager.this).g()) {
            } else {
                bg.a(TTDetailPageManager.c(TTDetailPageManager.this).b().a("bottomBar"), intent.getStringExtra("multiDataFromWV"));
            }
        }
    }

    /* loaded from: classes4.dex */
    public class TmCloseDetailPageReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1466565340);
        }

        private TmCloseDetailPageReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !TTDetailPageManager.n(TTDetailPageManager.this).g()) {
            } else {
                y.b(TTDetailPageManager.b(TTDetailPageManager.this));
            }
        }
    }

    /* loaded from: classes4.dex */
    public class BottomBarCartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1767047894);
        }

        private BottomBarCartUpdateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.taobao.android.detail.ttdetail.component.module.d a2;
            JSONObject d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!com.taobao.android.detail.ttdetail.utils.j.i() || intent == null || (a2 = TTDetailPageManager.c(TTDetailPageManager.this).b().a("bottomBar")) == null || a2.getComponentData() == null || (d = a2.getComponentData().d()) == null) {
            } else {
                d.put("cartCount", (Object) String.valueOf(intent.getIntExtra("itemCount", 0)));
                a2.updateComponent();
            }
        }
    }

    public Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        soy soyVar = this.J;
        if (soyVar == null) {
            return null;
        }
        return soyVar.g();
    }
}
