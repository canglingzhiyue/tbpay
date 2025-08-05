package com.taobao.taolive.room.openarchitecture.single;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.media.MediaConstant;
import com.taobao.taobao.R;
import com.taobao.taolive.room.controller2.g;
import com.taobao.taolive.room.controller2.h;
import com.taobao.taolive.room.openarchitecture.OpenSingleViewController;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.translateUtils.OpenBizcodeTranslateBean;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.ak;
import com.taobao.taolive.room.utils.as;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.v;
import com.taobao.taolive.room.utils.w;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.core.j;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import tb.ddv;
import tb.ddw;
import tb.kge;
import tb.pmd;
import tb.pnj;
import tb.poz;
import tb.sst;

/* loaded from: classes8.dex */
public class d implements a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    public View f21667a;
    private OpenSingleViewController b;
    private e c;
    private Context d;
    private int e;
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.taobao.taolive.room.openarchitecture.single.OpenSingleViewContainer$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!TextUtils.equals(intent.getAction(), "com.taobao.live.room.init")) {
            } else {
                long intExtra = intent.getIntExtra("seqId", -1);
                if (intExtra == -1 || intExtra == d.a(d.this)) {
                    return;
                }
                d.b(d.this);
            }
        }
    };
    private g g;
    private OpenBizcodeTranslateBean h;

    static {
        kge.a(2006121077);
        kge.a(-324942482);
        kge.a(191318335);
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : "OpenSingleViewContainer";
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public String getUniStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ada47542", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ int a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a72f43bd", new Object[]{dVar})).intValue() : dVar.e;
    }

    public static /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86596a9", new Object[]{dVar});
        } else {
            dVar.b();
        }
    }

    public static /* synthetic */ Context c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("58663080", new Object[]{dVar}) : dVar.d;
    }

    public static /* synthetic */ e d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("b5af117d", new Object[]{dVar}) : dVar.c;
    }

    public d() {
        com.android.tools.ir.runtime.c.a("com.taobao.taolive", null);
        h.a((Context) null);
        this.b = new OpenSingleViewController();
        this.g = this.b.getFrameContext();
    }

    public void a(Context context, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdccefc", new Object[]{this, context, taoliveOpenLiveRoom});
            return;
        }
        this.d = context;
        this.c = new e(this.d);
        this.c.a(this.d);
        this.c.b(e());
        poz.a(this.c, new com.taobao.taolive.room.service.d());
        com.taobao.taolive.room.dx.b.c().a(context);
        this.f21667a = LayoutInflater.from(this.d).inflate(R.layout.taolive_vh_liveroom, (ViewGroup) null);
        this.c.a(taoliveOpenLiveRoom);
        this.c.b(taoliveOpenLiveRoom);
        poz.f(true, (com.taobao.taolive.sdk.core.g) this.c);
        if (this.c.I() != null) {
            poz.b(this.c.I().b(), this.c);
            poz.p(this.c.I().c(), this.c);
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController != null) {
            openSingleViewController.setGlobalContext(this.c);
            this.b.init(context, this.f21667a);
        }
        if (!as.f()) {
            return;
        }
        Context context2 = this.d;
        if (!(context2 instanceof Activity) || ((Activity) context2).getWindow() == null) {
            return;
        }
        ((Activity) this.d).getWindow().addFlags(128);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void initParams(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33fb2d9", new Object[]{this, obj});
            return;
        }
        this.e = hashCode();
        if (!(obj instanceof OpenBizcodeTranslateBean)) {
            return;
        }
        OpenBizcodeTranslateBean openBizcodeTranslateBean = (OpenBizcodeTranslateBean) obj;
        this.h = openBizcodeTranslateBean;
        b(b(openBizcodeTranslateBean));
        a(openBizcodeTranslateBean);
    }

    private void b(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30721775", new Object[]{this, recModel});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onBindView(recModel);
    }

    private void a(OpenBizcodeTranslateBean openBizcodeTranslateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1778d55", new Object[]{this, openBizcodeTranslateBean});
        } else if (openBizcodeTranslateBean == null) {
        } else {
            if (!TextUtils.isEmpty(openBizcodeTranslateBean.t)) {
                poz.Y(openBizcodeTranslateBean.t, this.c);
                this.c.n = openBizcodeTranslateBean.t;
            }
            this.c.E = v.a(openBizcodeTranslateBean.w, false);
            a(openBizcodeTranslateBean.p);
            c();
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        d();
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController != null) {
            openSingleViewController.onWillAppear();
        }
        ddw.a().a(this);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onDidAppear();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onWillDisappear();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onDidDisappear();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onPause();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.onStop(z);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onResume() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.b == null) {
        } else {
            String a2 = w.a(this.d);
            if (!v.f(a2) && this.c.I() != null && this.c.I().f() != null) {
                z = a2.contains(this.c.I().f());
            }
            if (z && this.b.mIsDestroyed) {
                onWillAppear();
                onDidAppear();
                return;
            }
            this.b.onResume();
        }
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        b();
        e eVar = this.c;
        if (eVar != null) {
            eVar.c();
        }
        if (aa.cf()) {
            f.m().activityDestroy();
        }
        if (pmd.a().B() != null && aa.co()) {
            pmd.a().B().a();
        }
        if (!as.f()) {
            return;
        }
        Context context = this.d;
        if (!(context instanceof Activity) || ((Activity) context).getWindow() == null) {
            return;
        }
        ((Activity) this.d).getWindow().clearFlags(128);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6555dba", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.retryVideo();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void reportRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841661c2", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.reportRequest();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public Map<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return null;
        }
        return openSingleViewController.getUtParams();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void updateUserTrackData(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829410bd", new Object[]{this, map});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.updateUserTrackData(map);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public TBLiveRecEngineV2.RecModel getRecModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("a88bb5ec", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return null;
        }
        return openSingleViewController.mRecModel;
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public TBLiveBizDataModel getTBLiveBizDataModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveBizDataModel) ipChange.ipc$dispatch("b169bccd", new Object[]{this});
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return null;
        }
        return openSingleViewController.getTBLiveBizDataModel();
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public Context getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this}) : this.d;
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void needPresentAvatarPage(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bd5651", new Object[]{this, map});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.needPresentAvatarPage(map);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.mute(z);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public e getGlobalContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("41e17473", new Object[]{this}) : this.c;
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void setContainerOffset(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03b86d7", new Object[]{this, jSONObject});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.setContainerOffset(jSONObject);
    }

    @Override // com.taobao.taolive.room.openarchitecture.single.a
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController == null) {
            return;
        }
        openSingleViewController.setSmallWindowClickListener(iSmallWindowStrategy);
    }

    private TBLiveRecEngineV2.RecModel b(OpenBizcodeTranslateBean openBizcodeTranslateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("35d0324c", new Object[]{this, openBizcodeTranslateBean});
        }
        TBLiveRecEngineV2.RecModel recModel = new TBLiveRecEngineV2.RecModel(true, this.c);
        recModel.liveId = openBizcodeTranslateBean.f21669a;
        recModel.accountId = openBizcodeTranslateBean.h;
        recModel.imageUrl = openBizcodeTranslateBean.b;
        recModel.isFirst = true;
        recModel.sjsdItemId = openBizcodeTranslateBean.j;
        poz.q(openBizcodeTranslateBean.d, this.c);
        poz.s(openBizcodeTranslateBean.n, this.c);
        recModel.initParams = new HashMap();
        recModel.initParams.put(aw.PARAM_CUSTOM_PLAY_CTRL, openBizcodeTranslateBean.e);
        recModel.initParams.put("id", recModel.liveId);
        recModel.initParams.put("userId", recModel.accountId);
        recModel.initParams.put(aw.PARAM_PLAY_VIEW_TOKEN, openBizcodeTranslateBean.i);
        recModel.initParams.put("livesource", openBizcodeTranslateBean.d);
        recModel.initParams.put(aw.PARAM_SJSD_ITEM_ID, recModel.sjsdItemId);
        recModel.initParams.put(aw.PARAM_HIGH_PRIORITY_BIZ_CODE, openBizcodeTranslateBean.o);
        recModel.initParams.put("timeMoveId", openBizcodeTranslateBean.r);
        recModel.initParams.put("livePointTab3", openBizcodeTranslateBean.u);
        recModel.initParams.put("shop2fSkipTab3Url", openBizcodeTranslateBean.v);
        if (TextUtils.isEmpty(openBizcodeTranslateBean.m)) {
            openBizcodeTranslateBean.m = "a2141.b49677444";
        }
        recModel.initParams.put("spm", openBizcodeTranslateBean.m);
        recModel.initParams.put(aw.PARAM_ITEM_IDS, openBizcodeTranslateBean.k);
        recModel.initParams.put(aw.PARAM_CATEGORY_ID, openBizcodeTranslateBean.q);
        recModel.initParams.put(aw.PARAM_ITEM_HOLD_TYPE, openBizcodeTranslateBean.l);
        recModel.initParams.put(aw.PARAM_IGNORE_PV, openBizcodeTranslateBean.s);
        return recModel;
    }

    private TBLiveRecEngineV2.RecModel a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("16091e65", new Object[]{this, map});
        }
        TBLiveRecEngineV2.RecModel recModel = new TBLiveRecEngineV2.RecModel(true, this.c);
        recModel.initParams = map;
        recModel.liveId = recModel.initParams.get("id");
        recModel.accountId = recModel.initParams.get("userId");
        return recModel;
    }

    private TBLiveRecEngineV2.RecModel c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("5eb276e", new Object[]{this, str});
        }
        TBLiveRecEngineV2.RecModel recModel = new TBLiveRecEngineV2.RecModel(true, this.c);
        recModel.initParams = new HashMap();
        recModel.initParams.put("id", str);
        recModel.liveId = str;
        return recModel;
    }

    private void a(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("258fda74", new Object[]{this, context, new Boolean(z)});
            return;
        }
        Intent intent = new Intent("com.taobao.live.room.init");
        this.e = hashCode();
        intent.putExtra("seqId", this.e);
        intent.putExtra("hasPlayerViewToken", z);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcastSync(intent);
        if (!aa.cj()) {
            return;
        }
        LocalBroadcastManager.getInstance(this.d).sendBroadcast(new Intent("action.com.taobao.taolive.room.start"));
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(pmd.a().u().c());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.live.room.init");
        localBroadcastManager.registerReceiver(this.f, intentFilter);
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (context == null) {
            return;
        }
        a(context, false);
        a();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        OpenSingleViewController openSingleViewController = this.b;
        if (openSingleViewController != null) {
            openSingleViewController.onDestroy();
        }
        LocalBroadcastManager.getInstance(pmd.a().u().c()).unregisterReceiver(this.f);
        n.a(this.c.e());
        ddw.a().b(this);
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        g gVar = this.g;
        if (gVar != null) {
            return gVar.G();
        }
        return null;
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.mediaplatform_switch_room", FullScreenFrame.EVENT_BACK_TO_LIVE, "com.taobao.taolive.room.replay_backToLive"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.mediaplatform_switch_room".equals(str)) {
            if (!(obj instanceof Map)) {
                return;
            }
            Map map = (Map) obj;
            String str2 = (String) map.get("url");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            Map<String, String> b = ak.b(Uri.parse(str2));
            b.put("highlightSignByRePlay", map.get("highlightSignByRePlay"));
            a(a(b));
        } else if (FullScreenFrame.EVENT_BACK_TO_LIVE.equals(str)) {
            d((String) null);
            ai.a((com.taobao.alilive.aliliveframework.frame.a) this.g, ag.CALCK_SHIFTTIME, (String) null);
        } else if (!"com.taobao.taolive.room.replay_backToLive".equals(str) || !(obj instanceof String)) {
        } else {
            d((String) obj);
        }
    }

    public void a(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b29f74", new Object[]{this, recModel});
            return;
        }
        f();
        onDidDisappear();
        b(recModel);
        onWillAppear();
        onDidAppear();
        g gVar = this.g;
        if (gVar == null || gVar.o() == null) {
            return;
        }
        this.g.o().accessListener(AccessListenerEnum.onVerticalScrollEnable, new Object[0]);
    }

    private void d(String str) {
        TBLiveRecEngineV2.RecModel c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        com.taobao.taolive.sdk.playcontrol.c.a(this.g, VideoStatus.VIDEO_NORMAL_STATUS);
        if (j.d(this.g)) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            c = b(this.h);
        } else {
            c = c(str);
        }
        c(c);
        a(c);
    }

    private static void c(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e318f76", new Object[]{recModel});
        } else if (recModel == null || recModel.initParams == null) {
        } else {
            recModel.initParams.put(aw.PARAM_BACK_TO_LIVE, "true");
            recModel.initParams.remove("bubbleGoodInfoJson");
            recModel.initParams.remove(aw.PARAM_SJSD_ITEM_ID);
            recModel.initParams.remove(aw.PARAM_TIMEMOVING_ITEM_ID);
            recModel.initParams.remove(aw.PARAM_TIMEMOVE_KEYPOINTID);
            recModel.initParams.remove("timePointPlayUrl");
            recModel.initParams.remove(aw.PARAM_CUSTOM_PLAY_CTRL);
            recModel.initParams.remove(aw.PARAM_PLAY_VIEW_TOKEN);
            recModel.initParams.remove("timeMovingSpfPlayVideo");
            recModel.initParams.remove("timeMovingPcmIdParam");
            recModel.initParams.remove(aw.PARAM_PRODUCT_TYPE);
            recModel.initParams.remove("highlightSignByRePlay");
            recModel.liveUrlList = null;
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        ai.a((com.taobao.alilive.aliliveframework.frame.a) this.g, (Object) this.d, "Page_TaobaoLiveWatch");
        ai.b(this.g, this.d);
        ai.c(this.g, this.d);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (poz.v(this.c) || !(this.d instanceof Activity)) {
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                ((Activity) this.d).getWindow().getDecorView().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.taolive.room.openarchitecture.single.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        d.this = this;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                            return;
                        }
                        pmd.a().m().b(MediaConstant.LBLIVE_SOURCE, "onLayoutChange ========= ");
                        WindowInsets rootWindowInsets = ((Activity) d.c(d.this)).getWindow().getDecorView().getRootWindowInsets();
                        pnj m = pmd.a().m();
                        m.b(MediaConstant.LBLIVE_SOURCE, "mInsets ========= " + rootWindowInsets);
                        if (!com.taobao.taolive.room.ui.a.a((Activity) d.c(d.this)) || rootWindowInsets == null) {
                            poz.m(false, (com.taobao.taolive.sdk.core.g) d.d(d.this));
                        } else {
                            boolean a2 = com.taobao.taolive.room.ui.a.a(d.c(d.this), rootWindowInsets);
                            poz.m(a2, d.d(d.this));
                            if (a2) {
                                int c = com.taobao.taolive.room.ui.a.c(d.c(d.this), rootWindowInsets);
                                pnj m2 = pmd.a().m();
                                m2.b(MediaConstant.LBLIVE_SOURCE, "mCutoutHeight = " + com.taobao.taolive.room.c.b);
                                poz.b(c, (com.taobao.taolive.sdk.core.g) d.d(d.this));
                                poz.c(c, (com.taobao.taolive.sdk.core.g) d.d(d.this));
                                com.taobao.taolive.room.service.d.a(d.d(d.this));
                                ((Activity) d.c(d.this)).getWindow().getDecorView().removeOnLayoutChangeListener(this);
                            }
                        }
                        poz.b(0, (com.taobao.taolive.sdk.core.g) d.d(d.this));
                        poz.c(0, (com.taobao.taolive.sdk.core.g) d.d(d.this));
                        com.taobao.taolive.room.service.d.a(d.d(d.this));
                        ((Activity) d.c(d.this)).getWindow().getDecorView().removeOnLayoutChangeListener(this);
                    }
                });
            } else {
                poz.m(false, (com.taobao.taolive.sdk.core.g) this.c);
                poz.b(0, (com.taobao.taolive.sdk.core.g) this.c);
                poz.c(0, (com.taobao.taolive.sdk.core.g) this.c);
            }
            com.taobao.taolive.room.service.d.a(this.c);
        }
    }

    private String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        String valueOf = String.valueOf(hashCode());
        Random random = new Random();
        return valueOf + "_" + System.currentTimeMillis() + random.nextInt(1000);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (!sst.a()) {
        } else {
            b("initMute preMute = " + str);
            boolean e = v.e(str);
            e eVar = this.c;
            if (eVar == null) {
                return;
            }
            eVar.e(e);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        ab.c("OpenSingleViewContainer", str + " id = " + hashCode());
    }
}
