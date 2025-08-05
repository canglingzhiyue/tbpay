package com.taobao.android.detail.wrapper.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.aura.AURATBDetailWrapperPluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.security.ccrc.service.CcrcContext;
import com.alibaba.security.wukong.bx.CcrcBHService;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.autosize.l;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.activity.base.BaseActivity;
import com.taobao.android.detail.core.detail.controller.callback.e;
import com.taobao.android.detail.core.detail.model.constant.DetailConstants;
import com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber;
import com.taobao.android.detail.core.inside.InsideLinearLayout;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.performance.n;
import com.taobao.android.detail.core.ultronengine.f;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.core.utils.t;
import com.taobao.android.detail.datasdk.model.datamodel.node.DiversionNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.FeatureNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.PriceNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.datasdk.protocol.adapter.optional.ITrackAdapter;
import com.taobao.android.detail.ttdetail.TTDetailPageManager;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.ay;
import com.taobao.android.detail.ttdetail.utils.q;
import com.taobao.android.detail.wrapper.TBDetailLauncher;
import com.taobao.android.detail.wrapper.ext.component.actionbar.b;
import com.taobao.android.detail.wrapper.ext.component.actionbar.c;
import com.taobao.android.detail.wrapper.ext.provider.option.TBTrackProvider;
import com.taobao.android.detail.wrapper.ext.request.client.search.a;
import com.taobao.android.detail.wrapper.fragment.size.TBSizeChartFragment;
import com.taobao.android.detail.wrapper.inside.InsideController;
import com.taobao.android.detail.wrapper.ultronengine.event.o;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.common.util.i;
import com.taobao.share.globalmodel.e;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.adapter.biz.taomoment.DetailTaoMomentViewService;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.taobaocompat.lifecycle.IUtActivityNotTrack;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.uc.webview.export.WebView;
import com.uc.webview.export.media.MessageID;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import com.ut.share.business.interf.IShareContainer;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dwj;
import tb.dwk;
import tb.dwl;
import tb.dya;
import tb.dyo;
import tb.ebx;
import tb.ecg;
import tb.ecn;
import tb.ecp;
import tb.ecr;
import tb.ecu;
import tb.ehh;
import tb.ehi;
import tb.ehu;
import tb.eip;
import tb.eis;
import tb.eit;
import tb.eld;
import tb.enh;
import tb.eog;
import tb.epe;
import tb.epj;
import tb.epo;
import tb.eps;
import tb.epv;
import tb.eqb;
import tb.eqc;
import tb.eue;
import tb.euf;
import tb.euo;
import tb.eup;
import tb.fab;
import tb.fac;
import tb.fch;
import tb.fef;
import tb.feh;
import tb.fet;
import tb.feu;
import tb.ffg;
import tb.ffh;
import tb.ffi;
import tb.ffk;
import tb.fgi;
import tb.fgj;
import tb.fgl;
import tb.fgo;
import tb.fgp;
import tb.fgq;
import tb.fgr;
import tb.fgt;
import tb.fgy;
import tb.fha;
import tb.god;
import tb.hid;
import tb.ixt;
import tb.iyh;
import tb.kge;
import tb.lcm;
import tb.lcp;
import tb.lcq;
import tb.lpa;
import tb.lpb;
import tb.mrm;
import tb.mto;
import tb.mvk;
import tb.rmq;
import tb.rqd;
import tb.tfu;

/* loaded from: classes5.dex */
public class DetailActivity extends DetailCoreActivity implements com.taobao.android.detail.core.aura.observer.a, com.taobao.android.detail.core.detail.activity.c, b, IUtActivityNotTrack, ITBPublicMenu, ShareContentCallBack, IShareContainer, ffg.a, hid {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean u;
    private TBPublicMenu A;
    private com.taobao.weex.appfram.navigator.a B;
    private Map<Integer, View> C;
    private long D;
    private com.taobao.android.detail.wrapper.ext.floatview.c E;
    private com.taobao.android.detail.wrapper.ext.request.client.search.a F;
    private View G;
    private View H;
    private fch I;
    private SkuUpdateDataReceiver J;
    private SkuSyncReceiver K;
    private fgl L;
    private dwk M;
    private String N;
    private BroadcastReceiver O;
    private BroadcastReceiver P;
    private InsideController Q;
    private fgt R;
    private boolean S;
    private boolean T;
    private final List<WebView> U;
    private Boolean V;
    private View W;
    private BroadcastReceiver Y;
    private CcrcBHService Z;
    public SystemBarDecorator r;
    public TBSizeChartFragment s;
    public Context t;
    public com.taobao.android.detail.wrapper.newsku.a v;
    private fab w;
    private ehu x;
    private com.taobao.android.detail.wrapper.ext.component.actionbar.a y;
    private ViewGroup z;

    /* renamed from: com.taobao.android.detail.wrapper.activity.DetailActivity$15  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass15 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11083a = new int[DetailConstants.ResizeBarArg.values().length];

        static {
            try {
                f11083a[DetailConstants.ResizeBarArg.FULL_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11083a[DetailConstants.ResizeBarArg.HEAD_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ Object ipc$super(DetailActivity detailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -207205326:
                super.a((String) objArr[0]);
                return null;
            case 72521304:
                return new Boolean(super.M());
            case 81756510:
                super.W();
                return null;
            case 95609325:
                super.f();
                return null;
            case 98379888:
                super.i();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 560730344:
                super.a((Bundle) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1279645537:
                super.a((com.taobao.android.detail.datasdk.model.datamodel.node.c) objArr[0]);
                return null;
            case 1788467647:
                return new Boolean(super.a((Message) objArr[0]));
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity
    public String ab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5347b178", new Object[]{this}) : "Page_Detail";
    }

    @Override // tb.ffg.a
    public DetailActivity af() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailActivity) ipChange.ipc$dispatch("f25fe804", new Object[]{this}) : this;
    }

    public static /* synthetic */ String a(DetailActivity detailActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c4d61f30", new Object[]{detailActivity, jSONObject}) : detailActivity.d(jSONObject);
    }

    public static /* synthetic */ Map a(DetailActivity detailActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c95d32b2", new Object[]{detailActivity, intent}) : detailActivity.a(intent);
    }

    public static /* synthetic */ void a(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f22c0780", new Object[]{detailActivity});
        } else {
            detailActivity.aE();
        }
    }

    public static /* synthetic */ boolean a(DetailActivity detailActivity, MtopResponse mtopResponse, BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4c45b561", new Object[]{detailActivity, mtopResponse, baseActivity})).booleanValue() : detailActivity.a(mtopResponse, baseActivity);
    }

    public static /* synthetic */ CcrcBHService b(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CcrcBHService) ipChange.ipc$dispatch("f9c1e97b", new Object[]{detailActivity}) : detailActivity.Z;
    }

    public static /* synthetic */ Map b(DetailActivity detailActivity, Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("91bb5751", new Object[]{detailActivity, intent}) : detailActivity.b(intent);
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.datamodel.node.c c(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("85459311", new Object[]{detailActivity}) : detailActivity.e;
    }

    public static /* synthetic */ View d(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f19bfe1f", new Object[]{detailActivity}) : detailActivity.H;
    }

    public static /* synthetic */ String e(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3c933524", new Object[]{detailActivity}) : detailActivity.aN();
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.datamodel.node.c f(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("30e81614", new Object[]{detailActivity}) : detailActivity.e;
    }

    public static /* synthetic */ String g(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd85e126", new Object[]{detailActivity}) : detailActivity.aM();
    }

    public static /* synthetic */ com.taobao.android.detail.datasdk.model.datamodel.node.c i(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.c) ipChange.ipc$dispatch("dc8a9917", new Object[]{detailActivity}) : detailActivity.e;
    }

    static {
        kge.a(-1340956935);
        kge.a(-1343974867);
        kge.a(321354641);
        kge.a(1698775038);
        kge.a(-600994041);
        kge.a(1327216195);
        kge.a(486007139);
        kge.a(1368459946);
        kge.a(-208238470);
        kge.a(572118835);
        u = true;
    }

    public synchronized void a(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf929432", new Object[]{this, webView});
            return;
        }
        if (webView != null) {
            this.U.add(webView);
        }
    }

    public synchronized void b(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33d1cc91", new Object[]{this, webView});
            return;
        }
        if (webView != null) {
            this.U.remove(webView);
        }
    }

    private synchronized void aq() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd3f8b7", new Object[]{this});
            return;
        }
        int size = this.U.size();
        for (int i = 0; i < size; i++) {
            WebView webView = this.U.get(i);
            if (webView != null && !webView.isDestroied()) {
                webView.destroy();
            }
        }
    }

    public com.taobao.android.detail.datasdk.model.datamodel.node.b ac() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.datasdk.model.datamodel.node.b) ipChange.ipc$dispatch("42b19ce7", new Object[]{this});
        }
        if (this.e == null) {
            return null;
        }
        return this.e.f10055a;
    }

    public com.taobao.android.detail.wrapper.ext.floatview.c ad() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.wrapper.ext.floatview.c) ipChange.ipc$dispatch("f82cf31b", new Object[]{this}) : this.E;
    }

    @Override // com.taobao.uikit.actionbar.ShareContentCallBack
    public Object getQueryShareParameters() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("febe4434", new Object[]{this});
        }
        dya y = y();
        HashMap<String, String> hashMap = null;
        if (y == null) {
            i.a("[share]DetailCoreActivity", "getQueryShareParameters controller null");
            return null;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = y.t;
        if (cVar == null) {
            i.a("[share]DetailCoreActivity", "getQueryShareParameters nodeBundleWrapper null");
            return null;
        }
        this.W = getWindow().getDecorView();
        ShareContent shareContent = new ShareContent();
        shareContent.businessId = "1";
        shareContent.imageSoure = null;
        shareContent.shareScene = "item";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        shareContent.templateId = "detail";
        com.taobao.android.detail.datasdk.model.datamodel.node.b bVar = cVar.f10055a;
        ResourceNode l = eqb.l(bVar);
        if (l.share != null && l.share.c != null) {
            hashMap = l.share.c;
        }
        shareContent.activityParams = hashMap;
        String i = cVar.i();
        String k = cVar.k();
        String str = eqb.m(bVar).price.priceText;
        PriceNode.PriceData extraPriceByType = eqb.m(bVar).getExtraPriceByType(2);
        String str2 = e.NAV_URL_DETAIL_BASE + i + ".htm";
        String b = fgp.b(bVar);
        if (!TextUtils.isEmpty(b)) {
            str2 = b;
        }
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("price", str);
        }
        if (extraPriceByType != null) {
            buildUpon.appendQueryParameter("original_price", extraPriceByType.priceText);
        }
        buildUpon.appendQueryParameter("sourceType", "item");
        shareContent.url = buildUpon.toString();
        String a2 = fgp.a(bVar);
        if (!TextUtils.isEmpty(a2)) {
            shareContent.businessId = a2;
        }
        if (cVar.d()) {
            k = getResources().getString(R.string.notice_share_juhuasuan) + k + getResources().getString(R.string.notice_share_tair);
        }
        shareContent.description = k;
        try {
            String str3 = eqb.l(bVar).share.c.get("bizId");
            if (!TextUtils.isEmpty(str3)) {
                shareContent.businessId = str3;
            }
        } catch (Exception unused) {
        }
        shareContent.snapshotImages = eqb.c(bVar).images;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("price", str);
        hashMap2.putAll(h(this));
        Map<String, String> B = B();
        if (B != null && !B.isEmpty()) {
            hashMap2.putAll(B);
        }
        shareContent.extendParams = hashMap2;
        if (shareContent.snapshotImages != null && shareContent.snapshotImages.size() > 0) {
            shareContent.imageUrl = shareContent.snapshotImages.get(0);
        }
        i.d("[share]DetailCoreActivity", "getQueryShareParameters ShareContent " + JSON.toJSONString(shareContent));
        if (com.alibaba.ability.localization.b.c()) {
            shareContent.businessId = "1_" + com.alibaba.ability.localization.b.d();
        }
        return shareContent;
    }

    private Map<String, String> h(DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c784350e", new Object[]{this, detailActivity});
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.putAll(eqb.l(detailActivity.y().t.f10055a).share.c);
            if (hashMap.containsKey("iconFont")) {
                hashMap.remove("iconFont");
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // com.taobao.android.detail.wrapper.activity.b
    public String ae() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6d8e155", new Object[]{this}) : this.h;
    }

    @Override // com.taobao.android.detail.core.aura.observer.a
    public iyh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyh) ipChange.ipc$dispatch("f0632e6", new Object[]{this});
        }
        com.taobao.android.detail.wrapper.newsku.a aVar = this.v;
        if (aVar == null) {
            return null;
        }
        return aVar.b();
    }

    @Override // com.ut.share.business.interf.IShareContainer
    public View getShareContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f072ab61", new Object[]{this}) : this.W;
    }

    @Override // tb.ffg.a
    public View ag() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("532074af", new Object[]{this}) : p();
    }

    @Override // tb.ffg.a
    public double ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab55251c", new Object[]{this})).doubleValue() : ao();
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public boolean J_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8396db60", new Object[]{this})).booleanValue() : this.Q.n();
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.Q.o();
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : this.Q.p();
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public boolean a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821885c", new Object[]{this, new Float(f)})).booleanValue() : this.Q.a(f);
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else {
            this.Q.a(view, i, i2);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public void a(eld eldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70ec51b", new Object[]{this, eldVar});
        } else {
            this.Q.a(eldVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public void b(eld eldVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d591cb9c", new Object[]{this, eldVar});
        } else {
            this.Q.b(eldVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        if (!this.Q.k()) {
            return super.M();
        }
        return false;
    }

    @Override // tb.hid
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        InsideController insideController = this.Q;
        if (insideController == null) {
            return;
        }
        insideController.a(i, i2);
    }

    /* loaded from: classes5.dex */
    public class SkuSyncReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-588749924);
        }

        private SkuSyncReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            JSONObject parseObject;
            f f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!DetailActivity.this.h.equals(intent.getStringExtra("uniqueId"))) {
            } else {
                String stringExtra = intent.getStringExtra("selectedTextMap");
                if (TextUtils.isEmpty(stringExtra) || (parseObject = JSONObject.parseObject(stringExtra)) == null) {
                    return;
                }
                eog eogVar = new eog(null);
                eogVar.b = "%new_sku%" + parseObject.getString("finalText");
                if (!TextUtils.isEmpty(parseObject.getString("finalText"))) {
                    com.taobao.android.trade.event.f.a(DetailActivity.this).a(eogVar);
                }
                dya y = DetailActivity.this.y();
                if (y == null || (f = y.f()) == null) {
                    return;
                }
                d c = f.c();
                String a2 = DetailActivity.a(DetailActivity.this, parseObject);
                if (TextUtils.isEmpty(a2)) {
                    return;
                }
                try {
                    o.a(c, a2);
                } catch (Throwable th) {
                    i.b("DetailCoreActivity", "class:OpenSkuUltronSubscriber ### method : updateSkuText() 出现异常 : " + th.toString());
                }
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public void a(InsideLinearLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b1a7261", new Object[]{this, aVar});
        } else {
            this.Q.a(aVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.c
    public void b(InsideLinearLayout.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d9ea62", new Object[]{this, aVar});
        } else {
            this.Q.b(aVar);
        }
    }

    private String d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91c579db", new Object[]{this, jSONObject});
        }
        String str = "";
        if (jSONObject.getBoolean("selectedSkuId").booleanValue()) {
            String str2 = str + "已选：";
            JSONArray jSONArray = jSONObject.getJSONArray("propTextList");
            if (jSONArray != null) {
                String str3 = str2;
                for (int i = 0; i < jSONArray.size(); i++) {
                    str3 = str3 + jSONArray.getString(i) + " / ";
                }
                str2 = str3;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("serviceTextList");
            if (jSONArray2 != null) {
                String str4 = str2;
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    str4 = str4 + jSONArray2.getString(i2) + " / ";
                }
                str2 = str4;
            }
            return str2.length() > 3 ? str2.substring(0, str2.length() - 3) : str2;
        }
        JSONArray jSONArray3 = jSONObject.getJSONArray("propTextList");
        if (jSONArray3 != null) {
            String str5 = str;
            for (int i3 = 0; i3 < jSONArray3.size(); i3++) {
                str5 = str5 + jSONArray3.getString(i3) + " / ";
            }
            str = str5;
        }
        return str.length() > 3 ? str.substring(0, str.length() - 3) : str;
    }

    private void ar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe21038", new Object[]{this});
        } else if (!ai()) {
        } else {
            dwl.a();
        }
    }

    public boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue() : this.f9411a != null && this.f9411a.n;
    }

    public void a(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b3caa", new Object[]{this, view, new Boolean(z)});
        } else {
            this.Q.a(view, z);
        }
    }

    private void ba() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aca75946", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("OpenCartItemCountChange");
            LocalBroadcastManager.getInstance(this).registerReceiver(this.Y, intentFilter);
        } catch (Throwable unused) {
        }
    }

    private void bb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acb570c7", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.Y);
        } catch (Throwable unused) {
        }
    }

    private void as() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf027b9", new Object[]{this});
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.detail.inside.intent.action.cartUpdate");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this).registerReceiver(this.O, intentFilter);
        } catch (Throwable unused) {
        }
        try {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.taobao.detail.inside.intent.action.closePage");
            intentFilter2.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this).registerReceiver(this.P, intentFilter2);
        } catch (Throwable unused2) {
        }
    }

    private void at() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abfe3f3a", new Object[]{this});
            return;
        }
        try {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.O);
        } catch (Throwable unused) {
        }
        try {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.P);
        } catch (Throwable unused2) {
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !"ADD_CART_SUCCESS".equals(jSONObject.getString("actionFrom")) || !ai()) {
        } else {
            dwl.a("99tmCartUpdate", com.taobao.android.detail.core.aura.source.a.WV_DATA_REQUEST_99_CART_UPDATE);
        }
    }

    /* loaded from: classes5.dex */
    public class a implements ixt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1500217843);
            kge.a(-321064151);
        }

        private a() {
        }

        @Override // tb.ixt
        public void a(JSONObject jSONObject) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                return;
            }
            DetailActivity.this.b(jSONObject);
            if (jSONObject == null) {
                return;
            }
            String string = jSONObject.getString("actionFrom");
            if (TextUtils.isEmpty(string)) {
                string = "NULL";
            }
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != -1519039294) {
                if (hashCode == -1270295406 && string.equals("IMG_PREVIEW_LONG_CLK")) {
                    c = 1;
                }
            } else if (string.equals("ADD_CART_SUCCESS")) {
                c = 0;
            }
            if (c != 0) {
                if (c != 1) {
                    return;
                }
                i.d("[sku][share]DetailCoreActivity", "IMG_PREVIEW_LONG_CLK share");
                DetailActivity.this.c(jSONObject);
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject(tfu.ADD_CART);
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                return;
            }
            AddCartSubscriber.b bVar = new AddCartSubscriber.b(DetailActivity.this);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("skuId", (Object) jSONObject2.getString("skuId"));
            jSONObject3.put("priceText", (Object) jSONObject.getString("priceText"));
            jSONObject3.put("propTextList", jSONObject.get("propTextList"));
            try {
                str = URLEncoder.encode(jSONObject3.toJSONString(), "UTF-8");
            } catch (UnsupportedEncodingException unused) {
                str = "";
            }
            bVar.a(false, false, str, b(jSONObject));
        }

        private String b(JSONObject jSONObject) {
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
            }
            if (jSONObject != null && (jSONObject2 = jSONObject.getJSONObject(tfu.ADD_CART)) != null) {
                return jSONObject2.getString("addCartResult");
            }
            return null;
        }
    }

    public boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue() : b(jSONObject, (View) null);
    }

    public boolean b(JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f255c94f", new Object[]{this, jSONObject, view})).booleanValue();
        }
        if (com.alibaba.ability.localization.b.c()) {
            return false;
        }
        if (jSONObject == null) {
            i.a("[share]DetailCoreActivity", "skuShare skuCallbackData null");
            return false;
        } else if (!fgr.a("enable_sku_lightoff_share", true)) {
            i.a("[share]DetailCoreActivity", "skuShare enable_sku_lightoff_share false");
            return false;
        } else {
            Object queryShareParameters = getQueryShareParameters();
            if (!(queryShareParameters instanceof ShareContent)) {
                i.a("[share]DetailCoreActivity", "skuShare ShareContent null");
                return false;
            }
            ShareContent shareContent = (ShareContent) queryShareParameters;
            if (!TextUtils.isEmpty(jSONObject.getString("bizId"))) {
                shareContent.businessId = jSONObject.getString("bizId");
            } else {
                shareContent.businessId = fgr.a("sku_lightoff_share_id", "skublacklight");
            }
            String str = null;
            JSONObject jSONObject2 = jSONObject.getJSONObject("image");
            if (jSONObject2 != null) {
                str = jSONObject2.getString("url");
            }
            if (TextUtils.isEmpty(str)) {
                str = jSONObject2.getString("icon");
            }
            if (!TextUtils.isEmpty(str)) {
                shareContent.imageUrl = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("imageUrl null, sku_image:");
                sb.append(jSONObject2);
                i.a("[share]DetailCoreActivity", sb.toString() == null ? "null" : JSON.toJSONString(jSONObject2));
            }
            if (view != null) {
                this.W = view;
            } else {
                Dialog dialog = (Dialog) jSONObject.getObject("dialog", Dialog.class);
                if (dialog != null) {
                    this.W = dialog.getWindow().getDecorView();
                }
            }
            dya y = y();
            if (y == null) {
                i.a("[share]DetailCoreActivity", "skuShare controller null");
                return false;
            }
            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = y.t;
            if (cVar == null) {
                i.a("[share]DetailCoreActivity", "skuShare nodeBundleWrapper null");
                return false;
            }
            ItemNode c = eqb.c(cVar.f10055a);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("toolsFirst", (Object) "true");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("category", (Object) c.categoryId);
            jSONObject4.put("itemId", (Object) c.itemId);
            jSONObject4.put(com.etao.feimagesearch.model.d.KEY_PIC_URL, (Object) str);
            jSONObject4.put("sellerId", (Object) cVar.h());
            jSONObject3.put("detailData", (Object) jSONObject4);
            shareContent.templateParams = jSONObject3;
            ShareBusiness.share(this, shareContent);
            i.d("[share]DetailCoreActivity", "skuShare ShareContent " + JSON.toJSONString(shareContent));
            return true;
        }
    }

    private Map<String, String> a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f612a99a", new Object[]{this, intent});
        }
        String stringExtra = intent.getStringExtra(fgl.ORIGINALITEMID);
        if (this.b == null || this.b.i() == null || TextUtils.isEmpty(this.b.i().i()) || !this.b.i().i().equals(stringExtra)) {
            return null;
        }
        String stringExtra2 = intent.getStringExtra(fgl.TARGETITEMID);
        String stringExtra3 = intent.getStringExtra("areaChangedByUser");
        com.taobao.android.detail.datasdk.model.datamodel.node.c i = this.b.i();
        boolean b = i.b();
        if (!TextUtils.isEmpty(stringExtra3) && b) {
            String j = i.j();
            if (!TextUtils.isEmpty(j)) {
                stringExtra2 = j;
            }
        }
        if (b && fgr.a("enable_replace_platform_id", true)) {
            FeatureNode f = eqb.f(i.f10055a);
            ItemNode c = eqb.c(i.f10055a);
            String j2 = i.j();
            if (f != null && c != null && !f.oneProductMMDegrade && !TextUtils.equals(c.itemId, j2)) {
                stringExtra2 = j2;
            }
        }
        String stringExtra4 = intent.getStringExtra(mrm.KEY_AREA_ID);
        String stringExtra5 = intent.getStringExtra("addressId");
        String stringExtra6 = intent.getStringExtra("params");
        String stringExtra7 = intent.getStringExtra("relatedAuctionParams");
        this.N = stringExtra5;
        HashMap hashMap = new HashMap();
        hashMap.put(DetailCoreActivity.DETAIL_ITEM_ID, stringExtra2);
        if (!TextUtils.isEmpty(stringExtra4)) {
            hashMap.put(mrm.KEY_AREA_ID, stringExtra4);
        }
        if (stringExtra5 != null) {
            hashMap.put("addressId", stringExtra5);
        }
        if (stringExtra6 != null) {
            hashMap.put("params", stringExtra6);
        }
        if (stringExtra7 != null) {
            hashMap.put("relatedAuctionParams", stringExtra7);
        }
        return hashMap;
    }

    public String aj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87758670", new Object[]{this});
        }
        String str = this.N;
        if (str != null) {
            return str;
        }
        if (this.f9411a == null || this.f9411a.b() == null) {
            return null;
        }
        this.N = this.f9411a.b().get("addressId");
        return this.N;
    }

    private Map<String, String> b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db54185b", new Object[]{this, intent});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("apiInfo", intent.getStringExtra("apiInfo"));
        hashMap.put("headerInfo", intent.getStringExtra("headerInfo"));
        hashMap.put("data", intent.getStringExtra("data"));
        hashMap.put("updateWithCustomApi", intent.getStringExtra("updateWithCustomApi"));
        return hashMap;
    }

    /* loaded from: classes5.dex */
    public class SkuUpdateDataReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1611834260);
        }

        private SkuUpdateDataReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            Map<String, String> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!DetailActivity.this.h.equals(intent.getStringExtra("skuToken"))) {
            } else {
                if (Boolean.parseBoolean(intent.getStringExtra("updateWithCustomApi"))) {
                    a2 = DetailActivity.b(DetailActivity.this, intent);
                } else {
                    a2 = DetailActivity.a(DetailActivity.this, intent);
                }
                if (a2 == null) {
                    return;
                }
                String stringExtra = intent.getStringExtra("areaChangedByUser");
                if (stringExtra != null) {
                    a2.put("areaChangedByUser", stringExtra);
                }
                if (fgr.a("enable_clearpreweex_onupdate", true, false)) {
                    com.taobao.android.sku.weex.c.a(DetailActivity.this.h);
                }
                DetailActivity.this.b.a(new e.c() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.SkuUpdateDataReceiver.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
                    public void a(MtopResponse mtopResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("ab3bce2d", new Object[]{this, mtopResponse});
                            return;
                        }
                        if (DetailActivity.this.v != null) {
                            DetailActivity.this.v.a(mtopResponse != null ? mtopResponse.getRetMsg() : "");
                        }
                        DetailActivity.a(DetailActivity.this, mtopResponse, DetailActivity.this);
                    }

                    @Override // com.taobao.android.detail.core.detail.controller.callback.e.c
                    public void a(enh enhVar) {
                        IpChange ipChange2 = $ipChange;
                        boolean z = true;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e72cc599", new Object[]{this, enhVar});
                            return;
                        }
                        i.d("DetailCoreActivity", "SkuUpdateDataReceiver 详情重刷 onSuccess回调");
                        if (com.taobao.android.detail.core.aura.utils.c.a(enhVar)) {
                            if (DetailActivity.this.v != null) {
                                DetailActivity.this.v.a("OneProductMMDegrade");
                                DetailActivity.this.v.e();
                            }
                            com.taobao.android.detail.core.aura.utils.c.a(enhVar.c.f27459a.f10055a, DetailActivity.this);
                            return;
                        }
                        if (DetailActivity.this.v != null) {
                            DetailActivity.this.v.i();
                            DetailActivity.this.v.b(DetailActivity.this.b());
                        }
                        if (DetailActivity.this.b == null || enhVar == null || enhVar.b == null) {
                            return;
                        }
                        if (eup.a()) {
                            int a3 = ffi.a(intent);
                            if (-1 == a3) {
                                z = false;
                            }
                            eue.a(new euf(Boolean.valueOf(z)));
                            eue.a(new ffk(Integer.valueOf(a3)));
                        }
                        DetailActivity.this.b.a(enhVar.c, false);
                        com.taobao.android.detail.core.event.video.c.a((Context) DetailActivity.this, (com.taobao.android.trade.event.c) null, false);
                    }
                }, a2);
                if (!"true".equalsIgnoreCase(intent.getStringExtra("forbidLoading")) && DetailActivity.this.v != null) {
                    DetailActivity.this.v.f();
                }
                i.d("DetailCoreActivity", "SkuUpdateDataReceiver 详情重刷");
            }
        }
    }

    private boolean a(MtopResponse mtopResponse, BaseActivity baseActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db408649", new Object[]{this, mtopResponse, baseActivity})).booleanValue();
        }
        if (mtopResponse == null) {
            epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_busy_system_tired));
            return true;
        } else if (mtopResponse.isApiSuccess()) {
            return false;
        } else {
            if (mtopResponse.isSessionInvalid()) {
                return true;
            }
            if (mtopResponse.isNetworkError() && !NetworkUtils.a(epo.a())) {
                com.taobao.android.detail.core.detail.kit.view.widget.base.a aVar = new com.taobao.android.detail.core.detail.kit.view.widget.base.a(baseActivity, baseActivity);
                aVar.a((String) null);
                aVar.a();
                return true;
            }
            epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_busy_system_tired));
            return true;
        }
    }

    private void au() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0c56bb", new Object[]{this});
            return;
        }
        try {
            if (this.v != null) {
                this.v.a(new a());
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(com.taobao.android.detail.ttdetail.constant.a.SKU_ACTION_UPDATE_DATA);
            intentFilter.addCategory("android.intent.category.DEFAULT");
            this.J = new SkuUpdateDataReceiver();
            LocalBroadcastManager.getInstance(this).registerReceiver(this.J, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.taobao.sku.intent.action.syncData");
            intentFilter2.addCategory("android.intent.category.DEFAULT");
            this.K = new SkuSyncReceiver();
            LocalBroadcastManager.getInstance(this).registerReceiver(this.K, intentFilter2);
        } catch (Throwable th) {
            TLog.loge("DetailCoreActivity", "registerSkuUpdateReceiver error", th);
        }
    }

    private void av() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1a6e3c", new Object[]{this});
            return;
        }
        try {
            if (this.J != null) {
                LocalBroadcastManager.getInstance(this).unregisterReceiver(this.J);
            }
        } catch (Throwable unused) {
        }
        try {
            if (this.K == null) {
                return;
            }
            LocalBroadcastManager.getInstance(this).unregisterReceiver(this.K);
        } catch (Throwable unused2) {
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        super.a(str);
        if (!com.taobao.android.detail.core.debug.a.d(this)) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                SkuPageModel h;
                IpChange ipChange2 = $ipChange;
                boolean z = false;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                dya y = DetailActivity.this.y();
                if (y != null && (h = y.h()) != null) {
                    z = h.isH5Sku();
                }
                if (DetailActivity.this.v == null) {
                    return;
                }
                DetailActivity.this.v.a(z);
            }
        });
    }

    public DetailActivity() {
        com.taobao.android.launcher.bootstrap.tao.f.a("com.taobao.android.detail", "com.taobao.android.detail.wrapper.activity.DetailActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
        this.w = new fab();
        this.s = null;
        this.O = new TmCartUpdateReceiver();
        this.Y = new BottomBarCartUpdateReceiver();
        this.P = new TmCloseDetailPageReceiver();
        this.R = new fgt();
        this.U = new ArrayList();
        this.V = null;
        long currentTimeMillis = System.currentTimeMillis();
        i.d(j.a("DetailCoreActivity"), "application");
        this.t = this;
        eqc.a(this, "load", "详情页面加载耗时");
        eqc.a(this, eqc.TAG_SDK_INIT, "初始化");
        TBDetailLauncher.detailPerfSwitchInit();
        fac.a();
        aw();
        aP();
        this.w.a(this);
        long currentTimeMillis2 = System.currentTimeMillis();
        String a2 = j.a("DetailCoreActivity");
        i.d(a2, "application :" + (currentTimeMillis2 - currentTimeMillis) + "ms");
    }

    private void aw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2885bd", new Object[]{this});
        } else {
            this.T = "true".equals(OrangeConfig.getInstance().getConfig("android_detail", "destroy_bindingX_after_page_finish", "true"));
        }
    }

    private void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else if (!l.f((Context) this) && !l.e((Context) this)) {
        } else {
            com.taobao.android.detail.core.detail.activity.a.a(i);
        }
    }

    public void ak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7f6bb1", new Object[]{this});
            return;
        }
        com.taobao.android.detail.wrapper.newsku.a aVar = this.v;
        if (aVar != null) {
            aVar.d();
        }
        this.v = new com.taobao.android.detail.wrapper.newsku.a(this, this.h);
        this.v.a(new a());
    }

    public fgt al() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fgt) ipChange.ipc$dispatch("c34c25a1", new Object[]{this}) : this.R;
    }

    private void ax() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac369d3e", new Object[]{this});
        } else {
            rqd.bJTrackExtend = this.R.a();
        }
    }

    private void aB() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a93da808", new Object[]{this});
            return;
        }
        CcrcContext.init(this, epo.f());
        if (!god.v) {
            return;
        }
        this.Z = CcrcBHService.getBHService("ccrc_taobao_crawler_risk");
        CcrcBHService ccrcBHService = this.Z;
        if (ccrcBHService == null) {
            return;
        }
        ccrcBHService.activate();
    }

    private String[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("cecc26fe", new Object[]{this});
        }
        try {
            Intent intent = getIntent();
            if (intent == null) {
                return new String[]{"intentDataUrl=null"};
            }
            Uri data = intent.getData();
            if (data == null) {
                return new String[]{"intentDataUrl=uriNull"};
            }
            String uri = data.toString();
            if (TextUtils.isEmpty(uri)) {
                return new String[]{"intentDataUrl=empty"};
            }
            String queryParameter = data.getQueryParameter("hybrid");
            String b = com.taobao.android.detail.ttdetail.utils.l.b(uri);
            String[] strArr = new String[4];
            strArr[0] = "intentDataUrl=" + URLEncoder.encode(uri);
            StringBuilder sb = new StringBuilder();
            sb.append("hostPath=");
            if (TextUtils.isEmpty(b)) {
                b = "empty";
            }
            sb.append(URLEncoder.encode(b));
            strArr[1] = sb.toString();
            strArr[2] = "isHybrid=" + URLEncoder.encode(queryParameter);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isDowngrade=");
            sb2.append(be() ? Constants.VAL_YES : "no");
            strArr[3] = sb2.toString();
            return strArr;
        } catch (Throwable unused) {
            return new String[]{"intentDataUrl=exception"};
        }
    }

    private boolean be() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acdfb74e", new Object[]{this})).booleanValue();
        }
        try {
            intent = getIntent();
        } catch (Throwable unused) {
        }
        if (intent == null) {
            return false;
        }
        return !TextUtils.isEmpty(intent.getStringExtra(TTDetailPageManager.DOWNGRADE_DATA_ID));
    }

    private boolean bf() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acedcecf", new Object[]{this})).booleanValue();
        }
        if (com.taobao.android.detail.ttdetail.utils.o.a(this)) {
            return true;
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a("android_detail", "forceDetailWrapper2TTDetail", "false"));
        }
        return false;
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        Intent intent = getIntent();
        boolean z = !be() && bf() && ay.a(intent);
        if (!z) {
            eps.a("Page_Detail", 19999, "Page_Detail_EnterOldStructure", null, null, h());
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        az();
        q.a(this);
        ax();
        eup.a(ae());
        this.v = new com.taobao.android.detail.wrapper.newsku.a(this, this.h);
        ay();
        this.Q.a(this);
        c(4);
        i.d(j.a("DetailCoreActivity"), "onCreate start");
        au();
        try {
            if (!fgo.a(this, getIntent().getData())) {
                super.a((Bundle) null, true);
                u = false;
                fgo.a(this, getIntent());
                finish();
                return;
            }
        } catch (Throwable th) {
            u = false;
            i.a("DetailCoreActivity", "Error in detail container judge", th);
        }
        this.D = System.currentTimeMillis();
        eqc.a(this.t, eqc.TAG_ONCREAT, eqc.TAG_ONCREAT);
        i.d(j.a("DetailCoreActivity"), "onCreatOptimize");
        long currentTimeMillis = System.currentTimeMillis();
        fgo.a((DetailCoreActivity) this);
        long currentTimeMillis2 = System.currentTimeMillis();
        String a2 = j.a("DetailCoreActivity");
        i.d(a2, "init stage 1:" + (currentTimeMillis2 - currentTimeMillis) + "ms");
        god.a();
        a(bundle);
        aB();
        super.onCreate(bundle);
        if (this.f9411a != null) {
            euo.a(com.taobao.android.detail.core.performance.e.a(this.f9411a.q, this.f9411a.f27180a));
        }
        a(this.f9411a);
        a(uptimeMillis);
        i.d(j.a("DetailCoreActivity"), "init stage 2");
        com.taobao.tao.purchase.inject.c.a("NEW_Detail", feh.class);
        i.d(j.a("DetailCoreActivity"), "init stage 3");
        fha.a(this);
        com.taobao.android.detail.wrapper.ext.dinamicx.a.a(this.d);
        if (eip.E && s.a() && this.d != null && this.d.d() != null) {
            this.d.d().a((Activity) this);
        }
        i.d(j.a("DetailCoreActivity"), "init end");
        eqc.b(this.t, eqc.TAG_ONCREAT);
        aD();
        aC();
        ar();
        as();
        ba();
        if (epv.c) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.os.MessageQueue.IdleHandler
                public boolean queueIdle() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                    }
                    DetailActivity.a(DetailActivity.this);
                    return false;
                }
            });
        }
        this.G = findViewById(R.id.pagecontent);
        this.H = findViewById(R.id.detail_pager);
        if (this.b != null) {
            this.b.a(new dya.c() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dya.c
                public void a(f fVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d06a2ac7", new Object[]{this, fVar});
                    } else if (fVar == null) {
                    } else {
                        fgi.b(fVar);
                        d c = fVar.c();
                        if (c != null) {
                            c.a(com.taobao.android.sku.dinamicx.widget.d.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.d());
                        }
                        if (!eip.E || !s.a()) {
                            return;
                        }
                        fVar.c().l().a().d().a((Activity) DetailActivity.this);
                    }
                }
            });
            this.b.a(new dya.d() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dya.d
                public void a(Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (DetailActivity.b(DetailActivity.this) == null) {
                    } else {
                        DetailActivity.b(DetailActivity.this).detect(map);
                    }
                }
            });
        }
        try {
            String simpleName = DetailActivity.class.getSimpleName();
            UnifyLog.EventType eventType = UnifyLog.EventType.COMMON;
            UnifyLog.a("detail2", simpleName, i.b.MEASURE_ONCREATE, "", "", eventType, "url:" + getIntent().getData());
        } catch (Throwable th2) {
            com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", Log.getStackTraceString(th2));
        }
        aY();
        aA();
        this.Q.a();
        h.a((Activity) this, SystemClock.uptimeMillis() - uptimeMillis);
        if (!z) {
            return;
        }
        startActivity(intent);
        finish();
    }

    private void a(ebx ebxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68af17d", new Object[]{this, ebxVar});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            String a2 = t.a(this);
            if (ebxVar != null) {
                hashMap.put("itemId", ebxVar.f27180a);
            }
            if (getIntent() != null && getIntent().getData() != null) {
                hashMap.put("url", getIntent().getData().toString());
            }
            if (TextUtils.isEmpty(a2)) {
                eps.a("Page_Detail", 19999, "Page_Detail_EnterOldStructure_PreHit", hashMap, null, new String[0]);
                ae.a(hashMap, -100021, "前置降级打开老容器");
                com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.d.a("DetailCoreActivity"), "downgradeDataId is null:前置降级进入老框架");
                return;
            }
            eps.a("Page_Detail", 19999, "Page_Detail_EnterOldStructure_PostHit", hashMap, null, new String[0]);
            ae.a(hashMap, -100022, "前置降级打开老容器");
            com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.d.a("DetailCoreActivity"), "downgradeDataId is not null:后置降级进入老框架");
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.d.a("DetailCoreActivity"), "enterOldStructureTrack", e);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        this.Q.h();
    }

    private void ay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac44b4bf", new Object[]{this});
        } else {
            this.Q = new InsideController(this);
        }
    }

    private void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else if (getIntent() == null) {
            com.taobao.android.detail.core.utils.i.a(com.taobao.android.detail.core.performance.d.a("DetailCoreActivity"), "getIntent() is null");
        } else {
            ecg.a(this, getIntent().getData());
            if (bundle != null) {
                getIntent().removeExtra(com.taobao.android.detail.wrapper.nav.c.KEY_DETAIL_NAV);
                com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.d.a("DetailCoreActivity"), "activity被意外终止");
                ecg.d(this);
            }
            String a2 = ecp.a(getIntent(), com.taobao.android.detail.wrapper.nav.c.KEY_DETAIL_NAV);
            String a3 = com.taobao.android.detail.core.performance.d.a("DetailCoreActivity");
            com.taobao.android.detail.core.utils.i.c(a3, "DetailActivity onCreate, intent中detail_nav参数为: " + a2);
            if (TextUtils.isEmpty(a2)) {
                eip.a();
                eip.c();
                try {
                    getIntent().putExtra(dyo.STREAM_FLAG, String.valueOf(new Object().hashCode()));
                } catch (Exception e) {
                    com.taobao.android.detail.core.utils.i.a(n.a("DetailCoreActivity"), "流式标识添加出错", e);
                }
                com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.d.a("DetailCoreActivity"), "没有进详情nav，直接走DetailActivity");
                ecg.c(this, getIntent().getData());
            }
            getIntent().removeExtra(com.taobao.android.detail.wrapper.nav.a.DETAIL_NAV_PREFETCH);
            if (!eip.q) {
                return;
            }
            fgq.a().b();
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.Q.f();
    }

    private void az() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac52cc40", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.perf.b.a((Context) this, "itemId", new ebx().a(getIntent()));
        com.taobao.android.detail.core.perf.c.a(this, "containerInit");
    }

    private void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        long j2 = this.f9411a.w;
        long j3 = this.f9411a.y;
        com.taobao.android.detail.core.perf.c.a(this, "detailNav", j2, j);
        h.f(this, j - j2, j3 - j2);
        com.taobao.android.detail.core.perf.c.a(this, "detailNavNavigator", j2, j3);
        com.taobao.android.detail.core.perf.c.a(this, "detailNavStartActivity", j3, j);
        try {
            com.taobao.monitor.procedure.s.f18233a.d().a("detailNav", j2);
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "拉端埋点异常", e);
        }
    }

    private void aA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92f9087", new Object[]{this});
        } else {
            com.taobao.android.detail.core.perf.c.b(this, "containerInit");
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c45d761", new Object[]{this, cVar});
            return;
        }
        super.a(cVar);
        fgi.a(this.b.f());
        aI();
    }

    private void aC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a94bbf89", new Object[]{this});
            return;
        }
        epo.b();
        rmq.a(this);
    }

    private void aD() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a959d70a", new Object[]{this});
        } else if (this.E != null || !ecu.G) {
        } else {
            this.E = new com.taobao.android.detail.wrapper.ext.floatview.c(this);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        super.i();
        this.Q.g();
    }

    private void aE() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a967ee8b", new Object[]{this});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("DetailCoreActivity", "optimizePreExecute");
        if (this.C == null) {
            this.C = new HashMap();
        }
        View inflate = View.inflate(this, R.layout.x_detail_wrapper_main_new_gallery_ex, null);
        if (inflate == null) {
            return;
        }
        this.C.put(Integer.valueOf(R.layout.x_detail_wrapper_main_new_gallery_ex), inflate);
    }

    public View b(int i) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("42ac29fc", new Object[]{this, new Integer(i)});
        }
        Map<Integer, View> map = this.C;
        if (map != null) {
            view = map.get(Integer.valueOf(i));
            if (view != null) {
                this.C.remove(Integer.valueOf(i));
                com.taobao.android.detail.core.utils.i.c("DetailCoreActivity", "obtainOrCreateLayout reuse layout");
            }
        } else {
            view = null;
        }
        return view == null ? View.inflate(this, i, null) : view;
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        eqc.a(this.t, "onResume", "onResume");
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "onResume start");
        super.onResume();
        ITrackAdapter j = epj.j();
        if (j != null && (j instanceof TBTrackProvider)) {
            ((TBTrackProvider) j).userActionCommitEnter(this, this.f9411a.f27180a);
        }
        ecu.f27202a = "false".equals(this.f9411a.t) ? false : ecu.f27202a;
        u = false;
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "super onResume end");
        aF();
        Coordinator.postTask(new Coordinator.TaggedRunnable("saveFamilyInfo") { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (DetailActivity.this.b == null || DetailActivity.this.b.h == null) {
                        ecn.a(DetailActivity.this.t, (com.taobao.android.detail.datasdk.model.datamodel.node.c) null);
                    } else {
                        ecn.a(DetailActivity.this.t, DetailActivity.this.b.h.f27459a);
                    }
                } catch (Throwable th) {
                    String a2 = j.a("DetailCoreActivity");
                    com.taobao.android.detail.core.utils.i.d(a2, "saveFamilyInfo e:" + th.toString());
                }
            }
        });
        ehu ehuVar = this.x;
        if (ehuVar != null) {
            ehuVar.setTransparency(ehuVar.getTransparency());
        }
        TBPublicMenu tBPublicMenu = this.A;
        if (tBPublicMenu != null) {
            tBPublicMenu.onResume();
        }
        WXSDKEngine.setActivityNavBarSetter(this.B);
        com.taobao.android.detail.wrapper.ext.floatview.c cVar = this.E;
        if (cVar != null) {
            cVar.d();
        }
        fha.b(this);
        com.taobao.android.detail.core.utils.i.d(j.a("DetailCoreActivity"), "onResume end");
        eqc.b(this.t, "onResume");
        eqc.a(this.t, eqc.TAG_LIFECYCLE, this.D, System.currentTimeMillis() - this.D, "生命周期");
        fch fchVar = this.I;
        if (fchVar != null) {
            fchVar.e();
        }
        if (this.b.h != null) {
            if (eis.c) {
                b(this.b.h.c);
            } else {
                this.b.n();
            }
        }
        UnifyLog.a("detail2", DetailActivity.class.getSimpleName(), "onResume", "", "", UnifyLog.EventType.COMMON, "onResume");
        if (this.f9411a != null) {
            euo.a(com.taobao.android.detail.core.performance.e.a(this.f9411a.q, this.f9411a.f27180a));
        }
        this.Q.c();
    }

    public void a(fch fchVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8469bad", new Object[]{this, fchVar});
        } else {
            this.I = fchVar;
        }
    }

    private void aF() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a976060c", new Object[]{this});
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("saveFamilyInfo") { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!WXEnvironment.isCPUSupport()) {
                        AppMonitor.Alarm.commitFail("Page_Detail", "weex_not_support_cpu", "", "degradeToWindVane");
                    } else if (WXEnvironment.isSupport()) {
                    } else {
                        AppMonitor.Alarm.commitFail("Page_Detail", "weex_not_support_table", "", "degradeToWindVane");
                    }
                }
            });
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        eqc.a(this.t, "onStart", "onStart");
        super.onStart();
        com.taobao.android.detail.wrapper.ext.floatview.c cVar = this.E;
        if (cVar != null) {
            cVar.c();
        }
        com.taobao.weex.appfram.navigator.a aVar = this.B;
        if (aVar instanceof fet) {
            ((fet) aVar).a();
        }
        eqc.b(this.t, "onStart");
        this.Q.b();
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.weex.appfram.navigator.a aVar = this.B;
        if (aVar instanceof fet) {
            ((fet) aVar).b();
        }
        this.Q.e();
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TBPublicMenu tBPublicMenu = this.A;
        if (tBPublicMenu != null) {
            tBPublicMenu.onPause();
        }
        super.onPause();
        com.taobao.android.detail.wrapper.ext.floatview.c cVar = this.E;
        if (cVar != null) {
            cVar.e();
        }
        try {
            com.taobao.android.behavix.h.b("Page_Detail", this.f9411a.f27180a, this, new String[0]);
        } catch (Throwable unused) {
            com.taobao.android.detail.core.utils.i.a(com.taobao.tao.detail.activity.DetailActivity.TAG, "UserActionTrack.commitLeave error");
        }
        fha.c(this);
        euo.a(false);
        this.Q.d();
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.TaobaoBaseActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof fet) && com.taobao.android.detail.core.detail.activity.a.a() == 0) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
        super.onDestroy();
        q.b(this);
        com.taobao.android.detail.wrapper.ext.floatview.c cVar = this.E;
        if (cVar != null) {
            cVar.f();
        }
        fha.d(this);
        av();
        at();
        bb();
        com.taobao.android.detail.wrapper.newsku.a aVar = this.v;
        if (aVar != null) {
            aVar.d();
        }
        OrangeConfig.getInstance().unregisterListener(fgo.c);
        UnifyLog.a("detail2", DetailActivity.class.getSimpleName(), MessageID.onDestroy, "", "", UnifyLog.EventType.COMMON, MessageID.onDestroy);
        aR();
        aH();
        new DetailTaoMomentViewService().a(this);
        euo.a(false);
        com.taobao.android.detail.wrapper.ext.component.actionbar.a aVar2 = this.y;
        if (aVar2 != null) {
            aVar2.a();
        }
        try {
            if (this.T) {
                this.d.d().o();
            }
        } catch (Throwable unused) {
        }
        aq();
        aG();
        this.Q.i();
        CcrcBHService ccrcBHService = this.Z;
        if (ccrcBHService == null) {
            return;
        }
        ccrcBHService.deActivate();
    }

    private void aG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9841d8d", new Object[]{this});
        } else if (this.f9411a == null) {
        } else {
            fef.b(String.valueOf(this.f9411a.w));
        }
    }

    private void aH() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a992350e", new Object[]{this});
        } else if (this.f9411a == null || TextUtils.isEmpty(this.f9411a.f27180a)) {
            com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "queryParams.itemId is empty");
        } else {
            Intent intent = new Intent();
            intent.setAction("TBWillLeaveDetailNotification");
            intent.putExtra("itemId", this.f9411a.f27180a);
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        ehu ehuVar = this.x;
        if (ehuVar == null) {
            return;
        }
        if (z) {
            ehuVar.setNavTabsBarVisibility(8);
            this.x.setIsShowComment(z);
            return;
        }
        ehuVar.setNavTabsBarVisibility(0);
        this.x.setIsShowComment(z);
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity
    public boolean a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i != 257) {
            if (i == 258) {
                if (this.x != null) {
                    if (message.obj instanceof Float) {
                        this.x.setTransparency(1.0f);
                    } else {
                        this.x.restoreLastTransparency();
                    }
                }
                return true;
            }
            return super.a(message);
        }
        if (message.obj instanceof DetailConstants.ResizeBarArg) {
            int i2 = AnonymousClass15.f11083a[((DetailConstants.ResizeBarArg) message.obj).ordinal()];
            if (i2 == 1) {
                b(false);
            } else if (i2 == 2) {
                b(true);
            }
        }
        supportInvalidateOptionsMenu();
        return true;
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.z = p();
        ehh ehhVar = new ehh();
        e("#4d000000");
        if (ecu.v) {
            com.taobao.android.detail.wrapper.ext.component.actionbar.b bVar = new com.taobao.android.detail.wrapper.ext.component.actionbar.b(this);
            bVar.a(true);
            bVar.d(this.c);
            this.y = bVar;
            aJ();
        } else {
            this.y = new com.taobao.android.detail.wrapper.ext.component.actionbar.d(this);
        }
        com.taobao.android.detail.wrapper.ext.component.actionbar.a aVar = this.y;
        if (aVar instanceof com.taobao.android.detail.core.detail.kit.view.holder.c) {
            this.x = (ehu) ((com.taobao.android.detail.core.detail.kit.view.holder.c) aVar).a((com.taobao.android.detail.core.detail.kit.view.holder.c) ehhVar, (ViewGroup) null);
        }
        this.y.a(this.z, this.c);
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        if (this.r == null) {
            this.r = new SystemBarDecorator(this);
        }
        this.c = this.r.enableImmersiveStatus(str, false, true);
    }

    public void am() {
        com.taobao.android.detail.wrapper.ext.component.actionbar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9b9ab3", new Object[]{this});
            return;
        }
        if (this.V == null) {
            this.V = Boolean.valueOf("true".equals(OrangeConfig.getInstance().getConfig("android_detail", fgo.ENABLE_ASYNC_LOAD_SEARCH_INFO, "true")));
        }
        if (!this.V.booleanValue() || (aVar = this.y) == null || !(aVar instanceof a.InterfaceC0447a) || this.f9411a == null || this.f9411a.d()) {
            return;
        }
        if (this.F == null) {
            this.F = new com.taobao.android.detail.wrapper.ext.request.client.search.a(this);
            this.F.a(this.f9411a.f27180a);
            aI();
        }
        this.F.a((a.InterfaceC0447a) this.y);
        this.F.a();
    }

    private void aI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a04c8f", new Object[]{this});
        } else if (this.F == null || ac() == null) {
        } else {
            this.F.a(eqb.f(ac()).asyncLoadSearchInfo);
        }
    }

    private void aJ() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9ae6410", new Object[]{this});
        } else if (this.G == null || s.b()) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.G.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            int applyDimension = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
            if (this.c) {
                i = ecr.b(this);
            }
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = applyDimension + i;
            this.G.setLayoutParams(layoutParams);
        }
    }

    private void aK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9bc7b91", new Object[]{this});
            return;
        }
        View view = this.G;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        this.G.setLayoutParams(layoutParams);
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public ehu r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ehu) ipChange.ipc$dispatch("91d01e7b", new Object[]{this}) : this.x;
    }

    private void b(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ca9dff", new Object[]{this, epeVar});
        } else if (epeVar == null) {
        } else {
            ehu a2 = ((com.taobao.android.detail.core.open.h) com.taobao.android.detail.core.open.j.a(this)).b().a(this, epeVar);
            if (!(a2 instanceof View)) {
                return;
            }
            this.z = p();
            if (this.z.getChildCount() > 0) {
                this.z.removeAllViews();
            }
            e("#4d000000");
            View view = (View) a2;
            if (this.c) {
                View view2 = new View(this);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, ecr.b(this)));
                this.z.addView(view2);
                a2.setSyncTransparentView(view2);
            }
            this.z.addView(view, new LinearLayout.LayoutParams(-1, a2.getActionBarHeight()));
            this.x = a2;
            this.b.k.a(r());
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
            return;
        }
        this.z = p();
        if (this.z.getChildCount() > 0) {
            this.z.removeAllViews();
        }
        e("#4d000000");
        ehu a2 = ((com.taobao.android.detail.core.open.h) com.taobao.android.detail.core.open.j.a(this)).b().a(this, epeVar);
        if (a2 != null && (a2 instanceof View)) {
            View view = (View) a2;
            if (this.c) {
                View view2 = new View(this);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, ecr.b(this)));
                this.z.addView(view2);
                a2.setSyncTransparentView(view2);
            }
            this.z.addView(view, new LinearLayout.LayoutParams(-1, a2.getActionBarHeight()));
            this.x = a2;
        } else if (!(epeVar instanceof ehh) && !(epeVar instanceof ehi)) {
        } else {
            if (epeVar instanceof ehi) {
                final com.taobao.android.detail.wrapper.ext.component.actionbar.c cVar = new com.taobao.android.detail.wrapper.ext.component.actionbar.c(this);
                boolean an = an();
                boolean A = this.e.A();
                if (A || an) {
                    aK();
                } else {
                    aJ();
                }
                if (!s.b()) {
                    View view3 = this.H;
                    if (view3 instanceof ViewPager) {
                        ViewPager viewPager = (ViewPager) view3;
                        if (viewPager.getAdapter() != null) {
                            cVar.a(viewPager.getAdapter().getCount());
                        }
                        if (this.b != null && this.b.y() != null && eis.d) {
                            cVar.d(this.b.y().b());
                        }
                        viewPager.addOnPageChangeListener(cVar.g);
                    }
                }
                cVar.a(aL());
                cVar.b(this.c);
                if (!A && !an) {
                    z = false;
                }
                cVar.a(z);
                cVar.a(aM());
                cVar.a(new c.a() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.detail.wrapper.ext.component.actionbar.c.a
                    public void a(int i) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                        } else if (!(DetailActivity.d(DetailActivity.this) instanceof ViewPager)) {
                        } else {
                            ViewPager viewPager2 = (ViewPager) DetailActivity.d(DetailActivity.this);
                            if (viewPager2.getAdapter() == null || viewPager2.getAdapter().getCount() <= i) {
                                return;
                            }
                            cVar.c(false);
                            viewPager2.setCurrentItem(i, true);
                        }
                    }
                });
                this.y = cVar;
                if (eip.o) {
                    eit.a(new Runnable() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.13
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                DetailActivity.this.am();
                            }
                        }
                    });
                    com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.a.a("DetailCoreActivity"), "搜索底纹异步loadActionBarSearchInfo");
                } else {
                    am();
                    com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.a.a("DetailCoreActivity"), "搜索底纹同步loadActionBarSearchInfo");
                }
                com.taobao.android.detail.wrapper.ext.component.actionbar.a aVar = this.y;
                if (aVar instanceof com.taobao.android.detail.core.detail.kit.view.holder.c) {
                    this.x = (ehu) ((com.taobao.android.detail.core.detail.kit.view.holder.c) aVar).a((com.taobao.android.detail.core.detail.kit.view.holder.c) epeVar, (ViewGroup) null);
                }
                this.y.a(this.z, this.c);
                com.taobao.android.detail.wrapper.ext.component.actionbar.a aVar2 = this.y;
                if (!(aVar2 instanceof com.taobao.android.detail.core.detail.kit.view.holder.c)) {
                    return;
                }
                ((com.taobao.android.detail.core.detail.kit.view.holder.c) aVar2).b((ehi) epeVar);
                return;
            }
            if (ecu.v && !TextUtils.isEmpty(aM())) {
                com.taobao.android.detail.wrapper.ext.component.actionbar.b bVar = new com.taobao.android.detail.wrapper.ext.component.actionbar.b(this);
                boolean an2 = an();
                boolean A2 = this.e.A();
                if (A2 || an2) {
                    aK();
                } else {
                    aJ();
                }
                bVar.a(aL());
                bVar.d(this.c);
                bVar.b(A2 || an2);
                if (!F() || !K()) {
                    z = false;
                }
                bVar.c(z);
                bVar.a(aO());
                this.y = bVar;
                if (eip.o) {
                    eit.a(new Runnable() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.14
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                DetailActivity.this.am();
                            }
                        }
                    });
                    com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.a.a("DetailCoreActivity"), "搜索底纹异步loadActionBarSearchInfo");
                } else {
                    am();
                    com.taobao.android.detail.core.utils.i.c(com.taobao.android.detail.core.performance.a.a("DetailCoreActivity"), "搜索底纹同步loadActionBarSearchInfo");
                }
            } else {
                this.y = new com.taobao.android.detail.wrapper.ext.component.actionbar.d(this);
                if (ecu.v) {
                    aK();
                }
            }
            com.taobao.android.detail.wrapper.ext.component.actionbar.a aVar3 = this.y;
            if (aVar3 instanceof com.taobao.android.detail.core.detail.kit.view.holder.c) {
                this.x = (ehu) ((com.taobao.android.detail.core.detail.kit.view.holder.c) aVar3).a((com.taobao.android.detail.core.detail.kit.view.holder.c) epeVar, (ViewGroup) null);
            }
            this.y.a(this.z, this.c);
            com.taobao.android.detail.wrapper.ext.component.actionbar.a aVar4 = this.y;
            if (!(aVar4 instanceof com.taobao.android.detail.core.detail.kit.view.holder.c)) {
                return;
            }
            ((com.taobao.android.detail.core.detail.kit.view.holder.c) aVar4).b((ehh) epeVar);
        }
    }

    private HashMap<String, String> aL() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2501e7f5", new Object[]{this});
        }
        if (this.e != null && this.e.f10055a != null) {
            return new HashMap<String, String>() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.10
                {
                    put("item_id", DetailActivity.c(DetailActivity.this).i());
                    put("seller_id", DetailActivity.f(DetailActivity.this).h());
                    put("utParams", DetailActivity.e(DetailActivity.this));
                }
            };
        }
        return null;
    }

    public boolean an() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aba9b238", new Object[]{this})).booleanValue();
        }
        double ao = ao();
        return ao > 0.7d && ao < 0.8d;
    }

    public double ao() {
        GalleryNode.ContentVideo videoContentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abb7c9a3", new Object[]{this})).doubleValue();
        }
        if (this.e != null && this.e.f10055a != null) {
            String str = null;
            ItemNode c = eqb.c(this.e.f10055a);
            GalleryNode b = eqb.b(this.e.f10055a);
            if (c != null) {
                str = c.containerDimension;
            }
            if (TextUtils.isEmpty(str) && c != null && c.videos != null && c.videos.size() > 0) {
                str = c.videos.get(0).spatialVideoDimension;
            }
            if (TextUtils.isEmpty(str) && b != null && b.right != null && b.right.size() > 0) {
                for (GalleryNode.GalleryItemNode galleryItemNode : b.right) {
                    if (galleryItemNode.getContentType() == 2 && galleryItemNode.content != null && (videoContentData = galleryItemNode.content.getVideoContentData()) != null) {
                        str = videoContentData.videoRatio;
                        if (!TextUtils.isEmpty(str)) {
                            break;
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(":");
                try {
                    return Integer.valueOf(split[0]).intValue() / Integer.valueOf(split[1]).intValue();
                } catch (Throwable unused) {
                }
            }
        }
        return mto.a.GEO_NOT_SUPPORT;
    }

    private String aM() {
        DiversionNode a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4a4f626d", new Object[]{this});
        }
        if (this.e == null || this.e.f10055a == null || (a2 = eqb.a(this.e.f10055a)) == null || a2.mSearchData == null) {
            return null;
        }
        String url = a2.mSearchData.getUrl();
        if (!TextUtils.isEmpty(url)) {
            return url;
        }
        return null;
    }

    private String aN() {
        DiversionNode a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0d51d0c", new Object[]{this});
        }
        if (this.e == null || this.e.f10055a == null || (a2 = eqb.a(this.e.f10055a)) == null || a2.mSearchData == null) {
            return "";
        }
        String utParams = a2.mSearchData.getUtParams();
        return TextUtils.isEmpty(utParams) ? "" : utParams;
    }

    private List<b.C0438b> aO() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("df09fc12", new Object[]{this}) : new ArrayList<b.C0438b>() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.11
            {
                add(new b.C0438b(1, DetailActivity.g(DetailActivity.this), "끺"));
                b.C0438b a2 = feu.a(DetailActivity.i(DetailActivity.this));
                if (a2 != null) {
                    add(a2);
                } else {
                    add(new b.C0438b(2, "xxx", "ꄪ"));
                }
            }
        };
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity, com.taobao.android.detail.core.detail.activity.base.BaseActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        TBSizeChartFragment tBSizeChartFragment;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i == 4 && (tBSizeChartFragment = this.s) != null && fgy.a(tBSizeChartFragment)) {
            this.s.goBack();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void aP() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa02f116", new Object[]{this});
            return;
        }
        this.B = new fet(this);
        WXSDKEngine.setActivityNavBarSetter(this.B);
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public TBPublicMenu getPublicMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        if (this.A == null) {
            this.A = new TBPublicMenu(this);
            try {
                this.A.setDefaultPublicMenuClickListener(new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                    public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                        } else if (tBPublicMenuItem.getId() != R.id.uik_menu_home) {
                        } else {
                            DetailActivity.this.finish();
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
        return this.A;
    }

    @Override // com.taobao.uikit.actionbar.ITBPublicMenu
    public Bundle pageUserInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        bundle2.putString(getString(R.string.detail_zzb_key_page), "Page_Detail");
        if (this.f9411a != null && !TextUtils.isEmpty(this.f9411a.f27180a)) {
            bundle2.putString(getString(R.string.detail_zzb_key_id), this.f9411a.f27180a);
        }
        Map<String, String> B = B();
        if (B != null && !B.isEmpty()) {
            Bundle bundle3 = new Bundle();
            for (Map.Entry<String, String> entry : B.entrySet()) {
                bundle3.putString(entry.getKey(), entry.getValue());
            }
            bundle2.putBundle(getString(R.string.detail_zzb_key_extparams), bundle3);
        }
        bundle.putBundle(getString(R.string.detail_zzb_key_bundle), bundle2);
        return bundle;
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        if (this.r == null) {
            this.r = new SystemBarDecorator(this);
        }
        this.r.setStatusBarColor(str);
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            aQ();
        }
    }

    private void aQ() {
        f f;
        d c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa110897", new Object[]{this});
        } else if (fgj.a() || this.S || this.b == null || (f = this.b.f()) == null || (c = f.c()) == null) {
        } else {
            this.L = new fgl();
            this.L.a(new fgl.a() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fgl.a
                public Map<String, String> a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("a014a89d", new Object[]{this});
                    }
                    HashMap hashMap = new HashMap();
                    com.taobao.android.detail.datasdk.model.datamodel.node.c C = DetailActivity.this.C();
                    if (C == null) {
                        return hashMap;
                    }
                    String i = C.i();
                    if (TextUtils.isEmpty(i)) {
                        return hashMap;
                    }
                    hashMap.put("token", DetailActivity.this.h);
                    hashMap.put(fgl.TARGETITEMID, i);
                    hashMap.put(fgl.ORIGINALITEMID, i);
                    return hashMap;
                }
            });
            try {
                c.a(this.L);
                this.S = true;
            } catch (Throwable unused) {
                com.taobao.android.detail.core.utils.i.a(com.taobao.tao.detail.activity.DetailActivity.TAG, "UltronInstance 获取失败");
            }
        }
    }

    public void ap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc5e136", new Object[]{this});
        } else {
            super.W();
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.base.BaseActivity
    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4df815e", new Object[]{this});
        } else if (!this.Q.k()) {
            super.W();
        } else {
            this.Q.j();
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public boolean N() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("460add9", new Object[]{this})).booleanValue() : this.Q.k();
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cdcd7", new Object[]{this});
        } else {
            this.Q.l();
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public boolean O() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("46ec55a", new Object[]{this})).booleanValue() : this.Q.m();
    }

    private void aR() {
        f f;
        d c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1f2018", new Object[]{this});
        } else if (this.L == null || this.b == null || (f = this.b.f()) == null || (c = f.c()) == null) {
        } else {
            try {
                c.b(this.L);
                this.S = false;
            } catch (Throwable unused) {
                com.taobao.android.detail.core.utils.i.a(com.taobao.tao.detail.activity.DetailActivity.TAG, "UltronInstance 获取失败");
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public dwk G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dwk) ipChange.ipc$dispatch("46f91a40", new Object[]{this});
        }
        if (this.M == null) {
            synchronized (DetailActivity.class) {
                aS();
            }
        }
        return this.M;
    }

    private void aS() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa2d3799", new Object[]{this});
        } else if (this.M != null) {
        } else {
            this.M = new dwk(this, new IAURAPluginCenter[]{new AURATBDetailWrapperPluginCenter()}, new dwj(this));
        }
    }

    /* loaded from: classes5.dex */
    public class TmCartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(494132316);
        }

        private TmCartUpdateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            dwk G;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                if ((!DetailActivity.this.F() && !DetailActivity.this.ai()) || (G = DetailActivity.this.G()) == null) {
                    return;
                }
                G.a(com.taobao.android.detail.core.aura.source.a.a(intent.getStringExtra("multiDataFromWV")));
            }
        }
    }

    /* loaded from: classes5.dex */
    public class BottomBarCartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-941845035);
        }

        private BottomBarCartUpdateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String str;
            dwk G;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (!fgr.a("enable_bottombar_cart_refresh", true, true)) {
            } else {
                try {
                    str = ((DetailCoreActivity) DetailActivity.this.t).C().f10055a.a().getJSONObject("feature").getString("hintInsideCartButton");
                } catch (Exception e) {
                    com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "BottomBarCartUpdateReceiver onReceive parse error", e);
                    str = "";
                }
                if (!TextUtils.equals("true", str) || intent == null || (G = DetailActivity.this.G()) == null) {
                    return;
                }
                G.a(intent.getIntExtra("itemCount", 0));
            }
        }
    }

    /* loaded from: classes5.dex */
    public class TmCloseDetailPageReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1712735203);
        }

        private TmCloseDetailPageReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null) {
            } else {
                if (!DetailActivity.this.F() && !DetailActivity.this.ai()) {
                    return;
                }
                DetailActivity.this.W();
            }
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void a(JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccc1c04a", new Object[]{this, jSONObject, view});
        } else {
            b(jSONObject, view);
        }
    }

    @Override // com.taobao.android.detail.core.detail.activity.DetailCoreActivity
    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
        } else {
            ffh.a(this, bVar);
        }
    }

    private void aY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa81c49f", new Object[]{this});
            return;
        }
        lcq aX = aX();
        if (aX == null) {
            return;
        }
        aX.a(lcp.class, new mvk());
        aX.a(new lpb() { // from class: com.taobao.android.detail.wrapper.activity.DetailActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.lpb
            public lpa a(lcm lcmVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (lpa) ipChange2.ipc$dispatch("f9651b47", new Object[]{this, lcmVar}) : DetailActivity.this.K_() ? new com.taobao.android.detail.wrapper.pagemanager.headerpic.b(lcmVar) : new com.taobao.android.detail.wrapper.pagemanager.headerpic.a(lcmVar);
            }
        });
    }

    public View bc() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("265b9e8a", new Object[]{this}) : this.H;
    }

    public boolean bd() {
        FeatureNode f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acd19fcd", new Object[]{this})).booleanValue();
        }
        if (this.b != null && this.b.h != null && this.b.h.f27459a != null && this.b.h.f27459a.f10055a != null && (f = eqb.f(this.b.h.f27459a.f10055a)) != null) {
            return f.isEnabledDetail3Tab();
        }
        return false;
    }

    public Map<String, String> B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b872d23e", new Object[]{this});
        }
        try {
            com.taobao.android.detail.datasdk.model.datamodel.node.b ac = ac();
            if (ac == null) {
                return null;
            }
            return (Map) eqb.l(ac).getData().getObject("globalNativeParams", Map.class);
        } catch (Exception e) {
            com.taobao.android.detail.core.utils.i.a("DetailCoreActivity", "getRsExtParams", e);
            return null;
        }
    }
}
