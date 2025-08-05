package tb;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.gateway.msgcenter.b;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.Globals;
import com.taobao.tao.common.ucp.UcpManager;
import com.taobao.tao.homepage.d;
import com.taobao.tao.recommend3.gateway.request.c;
import com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction;
import com.taobao.tao.recommend3.newface.gateway.action.e;
import com.taobao.tao.recommend3.newface.gateway.action.f;
import com.taobao.tao.recommend3.newface.gateway.action.g;
import com.taobao.tao.recommend3.newface.gateway.action.i;
import com.taobao.tao.recommend3.newface.gateway.action.j;
import com.taobao.tao.recommend3.newface.gateway.action.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class oqc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_DEFAULT_CONFIG_JSON = "{\\\"newface_home_main\\\":{\\\"PullToRefresh\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"pullRefresh\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"pullRefresh\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"pullRefresh\\\"}}]}}],\\\"LoadCache\\\":[{\\\"actionName\\\":\\\"newface.loadCache\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"needSync\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}]}}],\\\"ColdStart\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"coldStart\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"coldStart\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"coldStart\\\"}}]}}],\\\"HotStart\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"hotStart\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"hotStart\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"hotStart\\\"}}]}}],\\\"PageBack\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"forceRequest\\\":\\\"@eventParam{forceRequest}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"pageBack\\\",\\\"checkDeltaExpire\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"itemId\\\":\\\"@eventParam{bizParam.itemId}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"switch.string\\\",\\\"actionParam\\\":{\\\"value\\\":\\\"@callbackParam{dataChangeType}\\\"},\\\"callback\\\":{\\\"base\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"pageBack\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\",\\\"requestType\\\":\\\"pageBack\\\"}}],\\\"delta\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"pageBack\\\"}}]}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"LocationChanged\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"locationChanged\\\",\\\"checkDeltaExpire\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"itemId\\\":\\\"@eventParam{bizParam.itemId}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"switch.string\\\",\\\"actionParam\\\":{\\\"value\\\":\\\"@callbackParam{dataChangeType}\\\"},\\\"callback\\\":{\\\"base\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"locationChanged\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\",\\\"requestType\\\":\\\"locationChanged\\\"}}],\\\"delta\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"requestType\\\":\\\"locationChanged\\\"}}]}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"UserLogin\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"userLogin\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"userLogin\\\",\\\"success\\\":\\\"true\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"userLogin\\\",\\\"success\\\":\\\"false\\\"}}]}}],\\\"Preview\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"preview\\\",\\\"forceRequest\\\":\\\"true\\\",\\\"previewParam\\\":\\\"@eventParam{previewParam}\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"preview\\\",\\\"success\\\":\\\"true\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"preview\\\",\\\"success\\\":\\\"false\\\"}}]}}],\\\"EditionSwitch\\\":[{\\\"actionName\\\":\\\"newface.loadCache\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"needSync\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"local\\\"}}]}},{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"editionSwitch\\\",\\\"forceRequest\\\":\\\"true\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"editionSwitch\\\",\\\"success\\\":\\\"true\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"requestType\\\":\\\"editionSwitch\\\",\\\"success\\\":\\\"false\\\"}}]}}]},\\\"newface_home_main.loading\\\":{\\\"ViewClick\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"bizParam\\\":{\\\"clickId\\\":\\\"@bizContext{@eventParam{containerId},clickId}\\\"},\\\"isNextPage\\\":\\\"true\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"scrollNextPage\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"ViewAppear\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"bizParam\\\":{\\\"clickId\\\":\\\"@bizContext{@eventParam{containerId},clickId}\\\"},\\\"isNextPage\\\":\\\"true\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"scrollNextPage\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}]},\\\"newface_home_main.error\\\":{\\\"ViewClick\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"errorRetry\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}},{\\\"actionName\\\":\\\"newface.scrollToTop\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"animated\\\":\\\"false\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}]},\\\"newface_home_main.*.overlay\\\":{\\\"DeleteOperation\\\":[{\\\"actionName\\\":\\\"newface.dataDelete\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"deleteModel\\\":\\\"@eventParam{deleteModel}\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\",\\\"dataChangeType\\\":\\\"delta\\\"}}]}}]},\\\"newface_home_main.*.video\\\":{\\\"ViewAppear\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"enqueue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}}],\\\"ViewDisappear\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"dequeue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}},{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@eventParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"pause\\\"}}}}],\\\"VideoEndPlaying\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"dequeue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}},{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"enqueue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}}],\\\"VideoErrorPlaying\\\":[{\\\"actionName\\\":\\\"newface.playerQueue\\\",\\\"actionParam\\\":{\\\"_operation\\\":\\\"dequeue\\\"},\\\"callback\\\":{\\\"headerChanged\\\":[{\\\"actionName\\\":\\\"newface.widgetPostMsg\\\",\\\"actionParam\\\":{\\\"widgetNode\\\":\\\"@callbackParam{widgetNode}\\\",\\\"widgetParams\\\":{\\\"type\\\":\\\"MSG\\\",\\\"params\\\":{\\\"videoOperation\\\":\\\"play\\\"}}}}]}}]},\\\"newface_home_main.*\\\":{\\\"ViewAppear\\\":[{\\\"actionName\\\":\\\"switch.bool\\\",\\\"actionParam\\\":{\\\"value\\\":\\\"@eq{@newFaceItemLastIndex{@eventParam{containers}, '10'}, @eventParam{index}}\\\"},\\\"callback\\\":{\\\"true\\\":[{\\\"actionName\\\":\\\"newface.request\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"bizParam\\\":{\\\"clickId\\\":\\\"@bizContext{@eventParam{containerId},clickId}\\\"},\\\"isNextPage\\\":\\\"true\\\",\\\"apiName\\\":\\\"mtop.taobao.wireless.home.newface.awesome.get\\\",\\\"apiVersion\\\":\\\"1.0\\\",\\\"requestType\\\":\\\"scrollNextPage\\\"},\\\"callback\\\":{\\\"success\\\":[{\\\"actionName\\\":\\\"newface.dataProcess\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\"},\\\"callback\\\":{\\\"finish\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}],\\\"fail\\\":[{\\\"actionName\\\":\\\"newface.uiRefresh\\\",\\\"actionParam\\\":{\\\"containers\\\":\\\"@eventParam{containers}\\\",\\\"dataSourceType\\\":\\\"remote\\\"}}]}}]}}]}}";

    /* renamed from: a  reason: collision with root package name */
    public static com.taobao.android.gateway.datastructure.a f32275a;
    public static com.taobao.android.gateway.datastructure.a b;
    public static com.taobao.android.gateway.datastructure.a c;
    public static com.taobao.android.gateway.datastructure.a d;
    public static com.taobao.android.gateway.datastructure.a e;
    public static com.taobao.android.gateway.datastructure.a f;
    public static com.taobao.android.gateway.datastructure.a g;
    private boolean h;
    private final int i;
    private gjv j;
    private ope k;
    private oqj l;
    private b m;
    private ksk n;
    private ConcurrentHashMap<String, oqa> o;
    private c p;
    private e q;
    private NewFaceDataProcessAction r;
    private i s;
    private g t;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static oqc f32280a;

        static {
            kge.a(-303679497);
            f32280a = new oqc();
        }

        public static /* synthetic */ oqc a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (oqc) ipChange.ipc$dispatch("f08ce7d", new Object[0]) : f32280a;
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[0])).booleanValue();
        }
        return true;
    }

    private static String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[0]) : h.HOMEPAGE_NEWFACE;
    }

    public static /* synthetic */ NewFaceDataProcessAction a(oqc oqcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (NewFaceDataProcessAction) ipChange.ipc$dispatch("771ddce6", new Object[]{oqcVar}) : oqcVar.r;
    }

    public static /* synthetic */ void a(oqc oqcVar, String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5950927b", new Object[]{oqcVar, str, str2, str3, jSONObject});
        } else {
            oqcVar.a(str, str2, str3, jSONObject);
        }
    }

    static {
        kge.a(1528625777);
        f32275a = new com.taobao.android.gateway.datastructure.a(q());
        b = new com.taobao.android.gateway.datastructure.a(q() + oan.DEFAULT_PLAN_B_PASSWORD_REGEX);
        c = new com.taobao.android.gateway.datastructure.a(q() + ".error");
        d = new com.taobao.android.gateway.datastructure.a(q() + ".loading");
        e = new com.taobao.android.gateway.datastructure.a(q() + ".*.overlay");
        f = new com.taobao.android.gateway.datastructure.a(q() + ".*.dinamicX");
        g = new com.taobao.android.gateway.datastructure.a(q() + ".*.video");
    }

    private oqc() {
        this.i = -1;
        this.o = new ConcurrentHashMap<>(2);
    }

    public static oqc a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (oqc) ipChange.ipc$dispatch("f08ce7d", new Object[0]) : a.a();
    }

    public void a(Context context, ksk kskVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f51f0487", new Object[]{this, context, kskVar, new Boolean(z)});
        } else if (this.h) {
            a(kskVar, this.m);
        } else {
            gjv.a(kst.b(), context);
            try {
                this.n = kskVar;
                String str = kskVar.b;
                if (z) {
                    this.j = new gjv(str, new gkj(str, "gateway2/newface_gateway2.json", GATEWAY_DEFAULT_CONFIG_JSON, true).a());
                } else {
                    this.j = new gjv(str, "gateway2/newface_gateway2.json", GATEWAY_DEFAULT_CONFIG_JSON);
                }
                this.m = new b();
                a(kskVar, this.m);
                this.j.a(this.m);
                this.k = new ope(context, str);
                d.a(kskVar.f30287a, this.k);
                this.l = new oqj();
                this.j.a(new com.taobao.tao.recommend3.newface.gateway.action.c(this.k), "newface.loadCache");
                gjv gjvVar = this.j;
                NewFaceDataProcessAction newFaceDataProcessAction = new NewFaceDataProcessAction(this.k);
                this.r = newFaceDataProcessAction;
                gjvVar.a(newFaceDataProcessAction, "newface.dataProcess");
                gjv gjvVar2 = this.j;
                i iVar = new i(this.k);
                this.s = iVar;
                gjvVar2.a(iVar, "newface.uiRefresh");
                gjv gjvVar3 = this.j;
                e eVar = new e(this.k, this.l);
                this.q = eVar;
                gjvVar3.a(eVar, "newface.request");
                this.j.a(new f(this.k), "newface.scrollToPosition");
                gjv gjvVar4 = this.j;
                g gVar = new g(this.k);
                this.t = gVar;
                gjvVar4.a(gVar, "newface.scrollToTop");
                this.j.a(new com.taobao.tao.recommend3.newface.gateway.action.h(context), "newface.toastError");
                this.j.a(new com.taobao.tao.recommend3.newface.gateway.action.a(this.k), "newface.dataDelete");
                this.j.a(new com.taobao.tao.recommend3.newface.gateway.action.d(), "newface.playerQueue");
                this.j.a(new j(), "newface.widgetPostMsg");
                this.j.a(new k(), "newface.toast");
                this.j.a(new com.taobao.tao.recommend3.newface.gateway.action.b(this.k), "newFaceItemLastIndex");
                d.a(this.k);
                d.a(this.m);
                this.h = true;
            } catch (GatewayException e2) {
                lap.a("HomeGatewayLauncher", "NewFaceGatewayManager", "NewFace 网关初始化异常:" + e2.getMessage());
            }
            p();
        }
    }

    private void a(ksk kskVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8831419", new Object[]{this, kskVar, bVar});
        } else if (kskVar == null || bVar == null) {
        } else {
            d.a(kskVar.f30287a, bVar);
            d.b(kskVar.b, bVar);
        }
    }

    public ope b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ope) ipChange.ipc$dispatch("16ba7059", new Object[]{this}) : this.k;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            opb.a("PullToRefresh", f32275a, new String[]{l(), m()}, opw.a(o(), jSONObject));
        }
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            opb.a(str, f32275a, new String[]{l(), m()}, opw.a(jSONObject, o()));
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            b((JSONObject) null);
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        lar.g("triggerLoadCache");
        opb.a("LoadCache", f32275a, new String[]{l(), m()}, jSONObject);
        lar.h("triggerLoadCache");
    }

    public void b(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else {
            opb.a(str, f32275a, new String[]{l(), m()}, jSONObject);
        }
    }

    public void a(boolean z, boolean z2, String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6776c72d", new Object[]{this, new Boolean(z), new Boolean(z2), str, strArr});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("containers", (Object) strArr);
        jSONObject.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, (Object) str);
        jSONObject.put("dataChangeType", (Object) (z2 ? "base" : "delta"));
        jSONObject.put("dataSourceType", (Object) (z ? "remote" : "local"));
        opb.a("UIRefresh", f32275a, jSONObject);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        lar.g("triggerColdStart");
        String[] strArr = {l(), m()};
        JSONObject o = o();
        if (o == null) {
            o = new JSONObject();
        }
        opb.a("ColdStart", f32275a, strArr, o);
        lar.h("triggerColdStart");
        lap.a("NewFaceGatewayManager", "triggerColdStart", "requestTask cos Time :" + (SystemClock.uptimeMillis() - valueOf.longValue()));
    }

    public void a(final String str, final String[] strArr, final String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f08d99", new Object[]{this, str, strArr, str2, jSONObject});
            return;
        }
        jSONObject.put("containers", (Object) strArr);
        jSONObject.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, (Object) str2);
        this.q.a(jSONObject, new gkc() { // from class: tb.oqc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.gkc
            public void a(String str3, JSONObject jSONObject2, gkf gkfVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4fda22c", new Object[]{this, str3, jSONObject2, gkfVar});
                    return;
                }
                jSONObject2.put("containers", (Object) strArr);
                jSONObject2.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, (Object) str2);
                jSONObject2.put("dataSourceType", "remote");
                if (TextUtils.equals(str3, "success")) {
                    oqc.a(oqc.this).a(jSONObject2, new gkc() { // from class: tb.oqc.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.gkc
                        public void a(String str4, JSONObject jSONObject3, gkf gkfVar2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("b4fda22c", new Object[]{this, str4, jSONObject3, gkfVar2});
                                return;
                            }
                            jSONObject3.put("containers", (Object) strArr);
                            jSONObject3.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, (Object) str2);
                            jSONObject3.put("dataSourceType", "remote");
                            oqc.a(oqc.this, str, str2, str4, jSONObject3);
                        }
                    });
                } else {
                    oqc.a(oqc.this, str, str3, str3, jSONObject2);
                }
            }
        });
    }

    private void a(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5d0b6a", new Object[]{this, str, str2, str3, jSONObject});
        } else if (TextUtils.equals("fail", str3)) {
            this.s.a(jSONObject, null);
        } else {
            ArrayList arrayList = new ArrayList();
            jSONObject.put("animated", "false");
            arrayList.add(this.s);
            arrayList.add(this.t);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((gke) it.next()).a(jSONObject, null);
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            opb.a("HotStart", f32275a, new String[]{l(), m()}, o());
        }
    }

    public void a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
        } else {
            a(strArr, (JSONObject) null);
        }
    }

    public void a(final String[] strArr, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fade19", new Object[]{this, strArr, jSONObject});
        } else if (strArr == null || strArr.length == 0) {
        } else {
            if (UcpManager.a().b()) {
                UcpManager.a().a(new UcpManager.a() { // from class: tb.oqc.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.common.ucp.UcpManager.a
                    public void a(UcpManager.FinishedType finishedType, JSONObject jSONObject2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("25f79b0b", new Object[]{this, finishedType, jSONObject2});
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("uppParams", (Object) jSONObject2);
                        opw.a(jSONObject3, jSONObject);
                        opb.a("PageBack", oqc.f32275a, strArr, jSONObject3);
                    }
                });
            } else {
                opb.a("PageBack", f32275a, strArr, jSONObject);
            }
        }
    }

    public void b(final String[] strArr, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c68ee71a", new Object[]{this, strArr, jSONObject});
        } else if (strArr == null || strArr.length == 0) {
        } else {
            if (UcpManager.a().b()) {
                UcpManager.a().a(new UcpManager.a() { // from class: tb.oqc.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.common.ucp.UcpManager.a
                    public void a(UcpManager.FinishedType finishedType, JSONObject jSONObject2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("25f79b0b", new Object[]{this, finishedType, jSONObject2});
                            return;
                        }
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("uppParams", (Object) jSONObject2);
                        opw.a(jSONObject3, jSONObject);
                        opb.a("ClickAiRefresh", oqc.f32275a, strArr, jSONObject3);
                    }
                });
            } else {
                opb.a("ClickAiRefresh", f32275a, strArr, jSONObject);
            }
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            opb.a("HomeTabAppear", f32275a, new String[]{l(), m()}, (JSONObject) null);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            opb.a("LocationChanged", f32275a, new String[]{l(), m()}, jSONObject);
        }
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else {
            opb.a("Preview", f32275a, new String[]{l(), m()}, jSONObject);
        }
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else {
            opb.a("DebugScan", f32275a, new String[]{l(), m()}, jSONObject);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            opb.a("EditionSwitch", f32275a, new String[]{l(), m()}, o());
        }
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String[] strArr = {l(), m()};
        j(jSONObject);
        opb.a("EditionSwitch", f32275a, strArr, jSONObject);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            opb.a("UserLogin", f32275a, new String[]{l(), m()}, o());
        }
    }

    public void g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
            return;
        }
        String l = a().l();
        if (!this.k.c(l).ext.getBooleanValue("clickBack")) {
            return;
        }
        JSONObject o = o();
        if (o == null) {
            o = new JSONObject();
        }
        String m = a().m();
        o.put("scrollPosition", (Object) Integer.valueOf(a().b().c(m).infoFlowCardStartOffset));
        o.put("containerId", (Object) l);
        o.put("scrollPositionOffset", (Object) 2);
        opb.a("ClickBack", f32275a, new String[]{l, m}, opw.a(o, jSONObject));
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else {
            opb.a("MultiTabSelect", f32275a, new String[]{l(), m()}, (JSONObject) null);
        }
    }

    public void h(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba943e1", new Object[]{this, jSONObject});
        } else {
            opb.a("OnlyRequest", f32275a, new String[]{m()}, opw.a(jSONObject, o()));
        }
    }

    public void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa119be", new Object[]{this, jSONObject});
        } else {
            opb.a("insertCard", f32275a, new String[]{m()}, opw.a(jSONObject, o()));
        }
    }

    private JSONObject o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83cd0896", new Object[]{this});
        }
        if (!n()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(opb.f32249a, (Object) true);
        return jSONObject;
    }

    private void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4e7d1f", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !n()) {
        } else {
            jSONObject.put(opb.f32249a, (Object) true);
        }
    }

    public boolean a(String str, oqa oqaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("384ec987", new Object[]{this, str, oqaVar})).booleanValue() : (TextUtils.isEmpty(str) || oqaVar == null || this.o.put(str, oqaVar) == null) ? false : true;
    }

    public oqa a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqa) ipChange.ipc$dispatch("7c737735", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.o.get(str);
        }
        return null;
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : str == null || a().d(str) || a().c(str);
    }

    public static ksk j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ksk) ipChange.ipc$dispatch("5445d5d2", new Object[0]);
        }
        if (l.d(Globals.getApplication())) {
            return ksk.NEW_FACE_CHILD_INTL;
        }
        return ksk.NEW_FACE_CHILD;
    }

    public synchronized c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("76655c63", new Object[]{this});
        }
        if (this.p == null) {
            this.p = new c();
        }
        return this.p;
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue() : m().equals(str);
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue() : str != null && str.startsWith(l());
    }

    public String[] i(JSONObject jSONObject) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("2584944f", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (obj = jSONObject.get("containers")) == null || !(obj instanceof String[])) {
            return null;
        }
        String[] strArr = (String[]) obj;
        if (strArr.length != 0) {
            return strArr;
        }
        return null;
    }

    public String b(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31bc34ca", new Object[]{this, strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            if (d(str)) {
                return str;
            }
        }
        return strArr[0];
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        if (l.d(Globals.getApplication())) {
            return ksk.NEW_FACE_PARENT_INTL.f30287a;
        }
        return ksk.NEW_FACE_PARENT.f30287a;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : j().f30287a;
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        a(ksk.NEW_FACE_PARENT.f30287a, new oqo(ksk.NEW_FACE_PARENT.f30287a));
        a(ksk.NEW_FACE_CHILD.f30287a, new oqw(ksk.NEW_FACE_CHILD.f30287a));
        a(ksk.NEW_FACE_PARENT_INTL.f30287a, new oqo(ksk.NEW_FACE_PARENT_INTL.f30287a));
        a(ksk.NEW_FACE_CHILD_INTL.f30287a, new oqz(ksk.NEW_FACE_CHILD_INTL.f30287a));
    }
}
