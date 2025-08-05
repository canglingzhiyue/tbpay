package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.content.LocalBroadcastManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.alipay.mobile.verifyidentity.callback.ProdManagerListener;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.engine.ProductManagerEngine;
import com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioMenuData;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.BioPageData;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.data.MenuGroup;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.APListView;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.ui.utils.DensityUtil;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.themis.canvas.canvas.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.rrv;

/* loaded from: classes3.dex */
public class BioListActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6001a = "BioListActivity";
    private TextView A;
    private TextView B;
    private TextView C;
    private ImageView D;
    private RelativeLayout E;
    private int G;
    private BioListAdapter H;
    private BioListAdapter I;
    private BroadcastReceiver J;
    private BroadcastReceiver K;
    private LocalBroadcastManager L;
    private long M;
    private Bundle P;
    private Bundle b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    private boolean l;
    private String n;
    private String o;
    private String p;
    private ArrayList<BioMenuData> q;
    private ArrayList<BioMenuData> r;
    private Map<String, String> t;
    private String u;
    private String v;
    private APListView w;
    private APListView x;
    private TextView y;
    private TextView z;
    private boolean m = true;
    private ArrayList<BioMenuData> s = new ArrayList<>();
    private int F = 0;
    private boolean N = false;
    private String O = "";

    public static /* synthetic */ Object ipc$super(BioListActivity bioListActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    public static /* synthetic */ int a(BioListActivity bioListActivity, List list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c1f2ee1", new Object[]{bioListActivity, list})).intValue() : b(list);
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : f6001a;
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df263bfd", new Object[]{bioListActivity});
        } else {
            bioListActivity.f();
        }
    }

    public static /* synthetic */ String b(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a3c8eec4", new Object[]{bioListActivity}) : bioListActivity.e;
    }

    public static /* synthetic */ void b(BioListActivity bioListActivity, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b45be4d", new Object[]{bioListActivity, list});
        } else {
            bioListActivity.a(list);
        }
    }

    public static /* synthetic */ boolean b(BioListActivity bioListActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67074fc", new Object[]{bioListActivity, new Boolean(z)})).booleanValue();
        }
        bioListActivity.N = z;
        return z;
    }

    public static /* synthetic */ BioListAdapter c(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioListAdapter) ipChange.ipc$dispatch("16bdb1c1", new Object[]{bioListActivity}) : bioListActivity.H;
    }

    public static /* synthetic */ int d(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a56bc40d", new Object[]{bioListActivity})).intValue() : bioListActivity.G;
    }

    public static /* synthetic */ BioListAdapter e(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BioListAdapter) ipChange.ipc$dispatch("dfb746ff", new Object[]{bioListActivity}) : bioListActivity.I;
    }

    public static /* synthetic */ TextView f(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("e669bf4c", new Object[]{bioListActivity}) : bioListActivity.A;
    }

    public static /* synthetic */ ImageView g(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ImageView) ipChange.ipc$dispatch("76778f39", new Object[]{bioListActivity}) : bioListActivity.D;
    }

    public static /* synthetic */ String h(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5cd19ca", new Object[]{bioListActivity}) : bioListActivity.h;
    }

    public static /* synthetic */ void i(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efdfa6f5", new Object[]{bioListActivity});
        } else {
            bioListActivity.b();
        }
    }

    public static /* synthetic */ String j(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d123d2cc", new Object[]{bioListActivity}) : bioListActivity.p;
    }

    public static /* synthetic */ boolean k(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("740e01b7", new Object[]{bioListActivity})).booleanValue() : bioListActivity.l;
    }

    public static /* synthetic */ Bundle l(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("7594ab56", new Object[]{bioListActivity}) : bioListActivity.P;
    }

    public static /* synthetic */ void m(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f83c5c71", new Object[]{bioListActivity});
        } else {
            bioListActivity.e();
        }
    }

    public static /* synthetic */ boolean n(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a5389d4", new Object[]{bioListActivity})).booleanValue() : bioListActivity.k;
    }

    public static /* synthetic */ ArrayList o(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("b8e92d89", new Object[]{bioListActivity}) : bioListActivity.q;
    }

    public static /* synthetic */ ArrayList p(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ArrayList) ipChange.ipc$dispatch("996af568", new Object[]{bioListActivity}) : bioListActivity.r;
    }

    public static /* synthetic */ BroadcastReceiver q(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("f1544aa4", new Object[]{bioListActivity}) : bioListActivity.K;
    }

    public static /* synthetic */ LocalBroadcastManager r(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LocalBroadcastManager) ipChange.ipc$dispatch("87b16d29", new Object[]{bioListActivity}) : bioListActivity.L;
    }

    public static /* synthetic */ APListView s(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APListView) ipChange.ipc$dispatch("76dfec4f", new Object[]{bioListActivity}) : bioListActivity.w;
    }

    public static /* synthetic */ APListView t(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (APListView) ipChange.ipc$dispatch("908f3110", new Object[]{bioListActivity}) : bioListActivity.x;
    }

    public static /* synthetic */ void u(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5c769", new Object[]{bioListActivity});
        } else {
            bioListActivity.c();
        }
    }

    public static /* synthetic */ void v(BioListActivity bioListActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b0cf4c8", new Object[]{bioListActivity});
        } else {
            bioListActivity.d();
        }
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.bio_product_list);
        this.w = (APListView) findViewById(R.id.bio_product_list);
        this.x = (APListView) findViewById(R.id.bio_unable_list);
        this.z = (TextView) findViewById(R.id.tv_protocol_bio);
        this.E = (RelativeLayout) findViewById(R.id.ing_titlelayout);
        this.B = (TextView) findViewById(R.id.ing_title);
        this.C = (TextView) findViewById(R.id.ing_desc);
        this.q = new ArrayList<>();
        this.r = new ArrayList<>();
        if (getIntent() != null) {
            this.b = getIntent().getExtras();
            Bundle bundle2 = this.b;
            if (bundle2 != null) {
                this.c = bundle2.getString("bioListData");
                this.P = this.b.getBundle("initParams");
                a(this.c);
            }
        }
        this.s.addAll(this.q);
        boolean z = !TextUtils.isEmpty(this.e);
        TitleBarAdapter titleBarAdapter = new TitleBarAdapter();
        titleBarAdapter.a(this, this.d, z);
        titleBarAdapter.f5944a = new TitleBarAdapter.OnLeftButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnLeftButtonClickListener
            public final void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                BioListActivity.a(BioListActivity.this);
                if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
                    return;
                }
                BioListActivity.this.finish();
            }
        };
        if (z) {
            titleBarAdapter.b = new TitleBarAdapter.OnRightButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnRightButtonClickListener
                public final void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (TextUtils.isEmpty(BioListActivity.b(BioListActivity.this))) {
                    } else {
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("bicListUrl", BioListActivity.b(BioListActivity.this));
                        BioListActivity.a(BioListActivity.this, bundle3);
                    }
                }
            };
        }
        View inflate = View.inflate(this, R.layout.bio_list_header, null);
        this.y = (TextView) inflate.findViewById(R.id.tv_header_tip);
        this.A = (TextView) inflate.findViewById(R.id.changesort);
        this.D = (ImageView) inflate.findViewById(R.id.icon_sort);
        this.w.addHeaderView(inflate);
        this.H = new BioListAdapter(this, this.q);
        this.w.setAdapter((ListAdapter) this.H);
        BioListAdapter bioListAdapter = this.H;
        bioListAdapter.f = this.k;
        ArrayList<BioMenuData> arrayList = this.q;
        bioListAdapter.a(arrayList, b(arrayList));
        a(this.q);
        if (this.q.size() <= 0) {
            this.w.setVisibility(8);
        } else {
            this.w.setVisibility(0);
        }
        d();
        e();
        this.I = new BioListAdapter(this, this.r);
        this.x.setAdapter((ListAdapter) this.I);
        this.I.a(this.r, 0);
        if (this.r.size() <= 0) {
            this.x.setVisibility(8);
        } else {
            c();
            this.x.setVisibility(0);
        }
        this.J = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (!ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action) && !"android.intent.action.SCREEN_OFF".equalsIgnoreCase(action)) {
                    return;
                }
                BioListAdapter c = BioListActivity.c(BioListActivity.this);
                ArrayList o = BioListActivity.o(BioListActivity.this);
                BioListActivity bioListActivity = BioListActivity.this;
                c.a(o, BioListActivity.a(bioListActivity, BioListActivity.o(bioListActivity)));
                BioListActivity.e(BioListActivity.this).a(BioListActivity.p(BioListActivity.this), 0);
            }
        };
        this.L = LocalBroadcastManager.getInstance(this);
        this.L.registerReceiver(this.J, new IntentFilter(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT));
        registerReceiver(this.J, new IntentFilter("android.intent.action.SCREEN_OFF"));
        this.H.b = new BioListAdapter.OnProdItemClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.OnProdItemClickListener
            public final void a(int i, boolean z2) {
                BioMenuData bioMenuData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z2)});
                } else if (BioListActivity.o(BioListActivity.this) != null && i >= 0 && i <= BioListActivity.o(BioListActivity.this).size() - 1 && (bioMenuData = (BioMenuData) BioListActivity.o(BioListActivity.this).get(i)) != null) {
                    String str = bioMenuData.module;
                    Bundle bundle3 = new Bundle();
                    if (bioMenuData.extInfo != null) {
                        for (String str2 : bioMenuData.extInfo.keySet()) {
                            bundle3.putString(str2, bioMenuData.extInfo.get(str2));
                        }
                    }
                    if (BioListActivity.l(BioListActivity.this) != null) {
                        bundle3.putString("tbsid", BioListActivity.l(BioListActivity.this).getString("tbsid"));
                    }
                    bundle3.putString(rrv.PRODUCT_ID, bioMenuData.productId);
                    bundle3.putString("sceneId", bioMenuData.sceneId);
                    bundle3.putString("module", str);
                    bundle3.putString("forbidUI", "true");
                    bundle3.putString(aw.PARAM_PRODUCT_TYPE, bioMenuData.productType);
                    bundle3.putString(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                    bundle3.putString("secData", EnvInfoUtil.getFpSecdata());
                    if (z2) {
                        if (!"close".equals(bioMenuData.sliderStatus)) {
                            return;
                        }
                        BioListActivity.this.logBehavior("bioclose", "UC-MobileIC-190528-02", null);
                        BioListActivity.a(BioListActivity.this, i, str, bundle3, "mBioListAdapter");
                    } else if ("open".equals(bioMenuData.sliderStatus)) {
                        BioListActivity.this.logBehavior("bioopen", "UC-MobileIC-190528-01", null);
                        BioListActivity.a(BioListActivity.this, i, str, bioMenuData.productId, bundle3, "mBioListAdapter");
                    }
                }
            }
        };
        this.H.c = new BioListAdapter.OnSwitchListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.OnSwitchListener
            public final void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    BioListActivity.i(BioListActivity.this);
                }
            }
        };
        this.I.b = new BioListAdapter.OnProdItemClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.adapter.BioListAdapter.OnProdItemClickListener
            public final void a(int i, boolean z2) {
                BioMenuData bioMenuData;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z2)});
                } else if (BioListActivity.p(BioListActivity.this) != null && i >= 0 && i <= BioListActivity.p(BioListActivity.this).size() - 1 && (bioMenuData = (BioMenuData) BioListActivity.p(BioListActivity.this).get(i)) != null) {
                    String str = bioMenuData.module;
                    Bundle bundle3 = new Bundle();
                    if (bioMenuData.extInfo != null) {
                        for (String str2 : bioMenuData.extInfo.keySet()) {
                            bundle3.putString(str2, bioMenuData.extInfo.get(str2));
                        }
                    }
                    if (BioListActivity.l(BioListActivity.this) != null) {
                        bundle3.putString("tbsid", BioListActivity.l(BioListActivity.this).getString("tbsid"));
                    }
                    bundle3.putString(rrv.PRODUCT_ID, bioMenuData.productId);
                    bundle3.putString("sceneId", bioMenuData.sceneId);
                    bundle3.putString("module", str);
                    bundle3.putString("forbidUI", "true");
                    bundle3.putString(aw.PARAM_PRODUCT_TYPE, bioMenuData.productType);
                    bundle3.putString(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                    bundle3.putString("secData", EnvInfoUtil.getFpSecdata());
                    if (z2) {
                        if (!"close".equals(bioMenuData.sliderStatus)) {
                            return;
                        }
                        BioListActivity.this.logBehavior("bioclose", "UC-MobileIC-190528-02", null);
                        BioListActivity.a(BioListActivity.this, i, str, bundle3, "mBioNotOpenAdapter");
                    } else if ("open".equals(bioMenuData.sliderStatus)) {
                        BioListActivity.this.logBehavior("bioopen", "UC-MobileIC-190528-01", null);
                        BioListActivity.a(BioListActivity.this, i, str, bioMenuData.productId, bundle3, "mBioNotOpenAdapter");
                    }
                }
            }
        };
    }

    private void a(String str) {
        MenuGroup menuGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                BioPageData bioPageData = (BioPageData) JSON.parseObject(str, BioPageData.class);
                this.d = bioPageData.title;
                this.e = bioPageData.helpUrl;
                this.t = bioPageData.protocol;
                this.u = this.b.getString("biolistintroducetxt");
                this.v = this.b.getString("biolistintrodicturl");
                if (!str.contains("intelligentEnable")) {
                    this.m = false;
                    this.l = true;
                } else {
                    this.m = false;
                    this.l = bioPageData.intelligentEnable;
                }
                this.i = bioPageData.intelligentTitle;
                this.j = bioPageData.intelligentDesc;
                if (this.t != null) {
                    this.n = this.t.get("GeneralProtocol");
                    this.o = this.t.get("GeneralPrefix");
                    this.p = this.t.get("GeneralUrl");
                }
                if (bioPageData.menuGroup == null || (menuGroup = bioPageData.menuGroup.get(0)) == null) {
                    return;
                }
                this.g = menuGroup.tip;
                this.f = menuGroup.title;
                this.k = menuGroup.enableSort;
                this.h = menuGroup.sortDesc;
                if (menuGroup.menus == null) {
                    return;
                }
                this.G = menuGroup.menus.size();
                Iterator<BioMenuData> it = menuGroup.menus.iterator();
                while (it.hasNext()) {
                    BioMenuData next = it.next();
                    if ("open".equalsIgnoreCase(next.sliderStatus)) {
                        this.F++;
                        this.q.add(next);
                    } else {
                        this.r.add(next);
                    }
                }
                VerifyLogCat.i(f6001a, "bioMenuData.size:" + this.q.size());
                VerifyLogCat.i(f6001a, "bioNotOpenData.size:" + this.r.size());
            } catch (Exception e) {
                VerifyLogCat.d(f6001a, "解析失败" + e.getMessage());
            }
        }
    }

    private void a(List<BioMenuData> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null) {
        } else {
            if (this.k) {
                if (b(list) > 1) {
                    b();
                    this.y.setVisibility(0);
                    this.A.setVisibility(0);
                    this.D.setVisibility(0);
                    this.y.setVisibility(0);
                    if (TextUtils.isEmpty(this.h)) {
                        this.h = getResources().getString(R.string.change_sort);
                    }
                    this.A.setText(this.h);
                    this.A.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.14
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                                return;
                            }
                            boolean z = BioListActivity.c(BioListActivity.this).d;
                            if (BioListActivity.d(BioListActivity.this) <= 2) {
                                BioListAdapter c = BioListActivity.c(BioListActivity.this);
                                c.e = true;
                                c.a(0, 1);
                                c.notifyDataSetChanged();
                                BioListActivity.f(BioListActivity.this).setText(BioListActivity.h(BioListActivity.this));
                                BioListActivity.g(BioListActivity.this).setVisibility(0);
                                BioListActivity.i(BioListActivity.this);
                                return;
                            }
                            if (BioListActivity.e(BioListActivity.this) != null) {
                                BioListActivity.e(BioListActivity.this).g = z;
                                BioListActivity.e(BioListActivity.this).notifyDataSetChanged();
                            }
                            BioListAdapter c2 = BioListActivity.c(BioListActivity.this);
                            c2.d = !z;
                            c2.notifyDataSetChanged();
                            if (!z) {
                                BioListActivity.f(BioListActivity.this).setText(BioListActivity.this.getResources().getString(R.string.sort_confirm));
                                BioListActivity.g(BioListActivity.this).setVisibility(8);
                                return;
                            }
                            BioListActivity.f(BioListActivity.this).setText(BioListActivity.h(BioListActivity.this));
                            BioListActivity.g(BioListActivity.this).setVisibility(0);
                        }
                    });
                    return;
                }
                this.y.setVisibility(8);
                this.D.setVisibility(8);
                this.A.setVisibility(8);
                return;
            }
            this.y.setText(this.g);
            this.y.setVisibility(0);
            this.D.setVisibility(8);
            this.A.setVisibility(8);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.l) {
            if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowIntelligent)) || !this.m) {
                this.y.setText(getResources().getString(R.string.header_tip_ing_close));
            } else {
                this.y.setText(getResources().getString(R.string.header_tip_ing_enable));
            }
        } else {
            this.y.setText(getResources().getString(R.string.header_tip_ing_close));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.w.getVisibility() == 8) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
            layoutParams.topMargin = DensityUtil.dip2px(this, 15.0f);
            this.x.setLayoutParams(layoutParams);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.x.getLayoutParams();
            layoutParams2.topMargin = DensityUtil.dip2px(this, 20.0f);
            this.x.setLayoutParams(layoutParams2);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.q == null || TextUtils.isEmpty(this.o) || TextUtils.isEmpty(this.n)) {
        } else {
            String str = this.o + this.n;
            if (!TextUtils.isEmpty(str)) {
                this.z.setVisibility(0);
                int indexOf = str.indexOf(this.n);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#1677ff")), indexOf, this.n.length() + indexOf, 33);
                this.z.setText(str);
                this.z.setText(spannableStringBuilder);
                this.z.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.15
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (TextUtils.isEmpty(BioListActivity.j(BioListActivity.this)) || BioListActivity.this.isDoubleClick()) {
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("bicListUrl", BioListActivity.j(BioListActivity.this));
                            BioListActivity.a(BioListActivity.this, bundle);
                        }
                    }
                });
                return;
            }
            this.z.setVisibility(8);
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowIntelligent)) || !this.m) {
        } else {
            if (this.q.size() <= 0) {
                this.E.setVisibility(8);
            } else {
                if (TextUtils.isEmpty(this.i)) {
                    if (this.l) {
                        this.i = getResources().getString(R.string.intelligent_title_open);
                    } else {
                        this.i = getResources().getString(R.string.intelligent_title_close);
                    }
                }
                if (TextUtils.isEmpty(this.j)) {
                    if (this.l) {
                        this.j = getResources().getString(R.string.intelligent_desc_open);
                    } else {
                        this.j = getResources().getString(R.string.intelligent_desc_close);
                    }
                }
                if (!this.i.endsWith(">")) {
                    this.i += " >";
                }
                this.B.setText(this.i);
                this.C.setText(this.j);
                this.E.setVisibility(0);
            }
            this.B.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String string;
                    String string2;
                    Resources resources;
                    int i;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    if (BioListActivity.k(BioListActivity.this)) {
                        string = BioListActivity.this.getResources().getString(R.string.intelligent_alert_close);
                        string2 = BioListActivity.this.getResources().getString(R.string.ing_know);
                        resources = BioListActivity.this.getResources();
                        i = R.string.ing_close;
                    } else {
                        string = BioListActivity.this.getResources().getString(R.string.intelligent_alert_open);
                        string2 = BioListActivity.this.getResources().getString(R.string.ing_open);
                        resources = BioListActivity.this.getResources();
                        i = R.string.ing_close_ignore;
                    }
                    BioListActivity.this.alert((String) null, string, string2, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.16.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            } else if (BioListActivity.k(BioListActivity.this)) {
                            } else {
                                BioListActivity.a(BioListActivity.this, true);
                                BioListActivity.this.eventlogBehavior("openIntelligemt", "UC-MobileIC-20200421-2", null);
                            }
                        }
                    }, resources.getString(i), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.16.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                            } else if (!BioListActivity.k(BioListActivity.this)) {
                            } else {
                                BioListActivity.a(BioListActivity.this, false);
                                BioListActivity.this.eventlogBehavior("closeIntelligemt", "UC-MobileIC-20200421-1", null);
                            }
                        }
                    }, (Boolean) false);
                }
            });
        }
    }

    public void logBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7fec42", new Object[]{this, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable th) {
                VerifyLogCat.w(f6001a, "logBehavior Exception", th);
                return;
            }
        }
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str2, Constants.VI_ENGINE_APPID, str, "", "", null, hashMap);
    }

    public void eventlogBehavior(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e2b35c", new Object[]{this, str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            try {
                hashMap = new HashMap<>();
            } catch (Throwable th) {
                VerifyLogCat.w(f6001a, "eventlogBehavior Exception", th);
                return;
            }
        }
        VerifyLogger.getInstance().eventBehavior(str2, "", "", "", hashMap);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        f();
        if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
            return;
        }
        finish();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        BioListAdapter bioListAdapter = this.H;
        if (bioListAdapter != null) {
            if (bioListAdapter.getCount() != this.F) {
                z = true;
            }
            if ((!this.s.toString().equals(this.q.toString())) || z) {
                final List<BioMenuData> list = this.H.f5951a;
                AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.11
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            String str = "";
                            if (!"Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
                                BioListActivity.this.showProgressDialog(str, false, null);
                            }
                            MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                            mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                            mICProdmngRequest.module = ModuleConstants.VI_MODULE_MENU;
                            mICProdmngRequest.action = "changesort";
                            mICProdmngRequest.params = new HashMap();
                            StringBuilder sb = new StringBuilder();
                            if (list.size() > 0) {
                                for (BioMenuData bioMenuData : list) {
                                    sb.append(bioMenuData.productId);
                                    sb.append(",");
                                }
                                String sb2 = sb.toString();
                                str = sb2.substring(0, sb2.length() - 1);
                            }
                            if (BioListActivity.l(BioListActivity.this) != null) {
                                mICProdmngRequest.params.put("tbsid", BioListActivity.l(BioListActivity.this).getString("tbsid"));
                            }
                            mICProdmngRequest.params.put("sortlist", str);
                            BioListActivity.a(BioListActivity.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest));
                        } catch (RpcException unused) {
                            BioListActivity.this.dismissProgressDialog();
                            BioListActivity.a(BioListActivity.this, (MICProdmngResponse) null);
                            VerifyLogCat.e(BioListActivity.a(), "RpcException");
                        }
                    }
                }, "sendSortRpc");
                return;
            }
        }
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
            return;
        }
        finish();
    }

    private static int b(List<BioMenuData> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d39e1ecd", new Object[]{list})).intValue();
        }
        for (BioMenuData bioMenuData : list) {
            if ("open".equalsIgnoreCase(bioMenuData.sliderStatus)) {
                i++;
            }
        }
        return i;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LocalBroadcastManager localBroadcastManager = this.L;
        if (localBroadcastManager == null) {
            return;
        }
        localBroadcastManager.unregisterReceiver(this.J);
        unregisterReceiver(this.J);
        BroadcastReceiver broadcastReceiver = this.K;
        if (broadcastReceiver == null) {
            return;
        }
        this.L.unregisterReceiver(broadcastReceiver);
    }

    public boolean isDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3d16b8", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.M;
        if (0 < j && j < 1000) {
            return true;
        }
        this.M = elapsedRealtime;
        return false;
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a9625b7", new Object[]{bioListActivity, bundle});
            return;
        }
        Intent intent = new Intent(bioListActivity, BioProtoActivity.class);
        intent.putExtras(bundle);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a1f677", new Object[]{bioListActivity, new Boolean(z)});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BioListActivity.this.showProgressDialog("", false, null);
                        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                        mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                        mICProdmngRequest.module = ModuleConstants.VI_MODULE_MENU;
                        mICProdmngRequest.action = "changeIntelligent";
                        mICProdmngRequest.params = new HashMap();
                        mICProdmngRequest.params.put("intelligentEnable", String.valueOf(z));
                        mICProdmngRequest.params.put("_rpcSource_", "ALIAPP");
                        if (BioListActivity.l(BioListActivity.this) != null) {
                            mICProdmngRequest.params.put("tbsid", BioListActivity.l(BioListActivity.this).getString("tbsid"));
                            String a2 = BioListActivity.a();
                            VerifyLogCat.i(a2, "tbsid:" + BioListActivity.l(BioListActivity.this).getString("tbsid"));
                        }
                        String a3 = BioListActivity.a();
                        VerifyLogCat.i(a3, "opens:" + z);
                        BioListActivity.a(BioListActivity.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest), z);
                    } catch (RpcException unused) {
                        BioListActivity.this.dismissProgressDialog();
                        BioListActivity.a(BioListActivity.this, (MICProdmngResponse) null, z);
                        VerifyLogCat.e(BioListActivity.a(), "RpcException");
                    }
                }
            }, "sendintelligentRpc");
        }
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, MICProdmngResponse mICProdmngResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f9c51d", new Object[]{bioListActivity, mICProdmngResponse, new Boolean(z)});
            return;
        }
        bioListActivity.dismissProgressDialog();
        if (mICProdmngResponse == null || !mICProdmngResponse.success) {
            if (z) {
                bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_open_fail), R.drawable.warning, 0);
                return;
            } else {
                bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_close_fail), R.drawable.warning, 0);
                return;
            }
        }
        Map<String, String> map = mICProdmngResponse.data;
        if (map != null) {
            bioListActivity.i = map.get("intelligentTitle");
            bioListActivity.j = map.get("intelligentDesc");
        }
        if (TextUtils.isEmpty(bioListActivity.i)) {
            bioListActivity.i = "";
        }
        if (TextUtils.isEmpty(bioListActivity.j)) {
            bioListActivity.j = "";
        }
        if (z) {
            bioListActivity.l = true;
            bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_open_success), R.drawable.open_success, 0);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BioListActivity.m(BioListActivity.this);
                    if (!BioListActivity.n(BioListActivity.this) || BioListActivity.o(BioListActivity.this).size() <= 1) {
                        return;
                    }
                    BioListActivity.i(BioListActivity.this);
                }
            });
            return;
        }
        bioListActivity.l = false;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.19
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                BioListActivity.m(BioListActivity.this);
                if (!BioListActivity.n(BioListActivity.this) || BioListActivity.o(BioListActivity.this).size() <= 1) {
                    return;
                }
                BioListActivity.i(BioListActivity.this);
            }
        });
        bioListActivity.toast(bioListActivity.getResources().getString(R.string.ing_close_success), R.drawable.open_success, 0);
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, final int i, String str, Bundle bundle, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b73d4ae", new Object[]{bioListActivity, new Integer(i), str, bundle, str2});
        } else {
            ProductManagerEngine.getInstance(MicroModuleContext.getInstance().getContext()).startByToken("", str, "REGISTER_BIO_PREPARE", bundle, new ProdManagerListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.callback.ProdManagerListener
                public final void onResult(String str3, ProdManagerResult prodManagerResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("26d0dee4", new Object[]{this, str3, prodManagerResult});
                        return;
                    }
                    if (prodManagerResult != null) {
                        if ("1000".equalsIgnoreCase(prodManagerResult.getCode())) {
                            BioListActivity bioListActivity2 = BioListActivity.this;
                            bioListActivity2.toast(bioListActivity2.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
                            BioListActivity.a(BioListActivity.this, i, "open", str2);
                            return;
                        } else if ("2006".equalsIgnoreCase(prodManagerResult.getCode())) {
                            BioListActivity bioListActivity3 = BioListActivity.this;
                            BioListActivity.a(bioListActivity3, bioListActivity3.getResources().getString(R.string.face_try_again_title), BioListActivity.this.getResources().getString(R.string.face_confirm_context));
                            BioListActivity.a(BioListActivity.this, i, "close", str2);
                            return;
                        } else if (!"1001".equalsIgnoreCase(prodManagerResult.getCode())) {
                            if ("2003".equalsIgnoreCase(prodManagerResult.getCode()) || "RPC_EXCEPTION".equalsIgnoreCase(prodManagerResult.getCode())) {
                                BioListActivity bioListActivity4 = BioListActivity.this;
                                bioListActivity4.toast(bioListActivity4.getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
                                BioListActivity.a(BioListActivity.this, i, "close", str2);
                                return;
                            } else if ("1004".equalsIgnoreCase(prodManagerResult.getCode())) {
                                BioListActivity bioListActivity5 = BioListActivity.this;
                                bioListActivity5.toast(bioListActivity5.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
                                BioListActivity.a(BioListActivity.this, i, "close", str2);
                                return;
                            } else if ("1003".equalsIgnoreCase(prodManagerResult.getCode())) {
                                BioListActivity.a(BioListActivity.this, i, "close", str2);
                                return;
                            } else if (!a.FCANVAS_ERROR_OPEN_GL.equalsIgnoreCase(prodManagerResult.getCode())) {
                                BioListActivity bioListActivity6 = BioListActivity.this;
                                bioListActivity6.toast(bioListActivity6.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
                                BioListActivity.a(BioListActivity.this, i, "close", str2);
                                return;
                            } else {
                                String message = prodManagerResult.getMessage();
                                BioListActivity bioListActivity7 = BioListActivity.this;
                                if (TextUtils.isEmpty(message)) {
                                    message = BioListActivity.this.getResources().getString(R.string.vi_system_error);
                                }
                                BioListActivity.a(bioListActivity7, "", message);
                                BioListActivity.a(BioListActivity.this, i, "close", str2);
                                return;
                            }
                        }
                    }
                    BioListActivity bioListActivity8 = BioListActivity.this;
                    bioListActivity8.toast(bioListActivity8.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
                    BioListActivity.a(BioListActivity.this, i, "close", str2);
                }
            });
        }
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, final int i, final String str, String str2, final Bundle bundle, final String str3) {
        String str4;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13ab3d24", new Object[]{bioListActivity, new Integer(i), str, str2, bundle, str3});
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(CommonConstant.alertTextColor, true);
        if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(str2)) {
            string = bioListActivity.getResources().getString(R.string.finger_closed_dialog_title);
            bioListActivity.O = CommonConstant.FINGER_PAY_CLOSE_KEY;
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(str2)) {
            string = bioListActivity.getResources().getString(R.string.face_closed_dialog_title);
            bioListActivity.O = CommonConstant.FACEID_PAY_CLOSE_KEY;
        } else if (CommonConstant.FACE_PAY.equalsIgnoreCase(str2)) {
            if (VIUtils.isInExport()) {
                string = bioListActivity.getResources().getString(R.string.face_2D_closed_title);
                bioListActivity.O = CommonConstant.FACE_PAY_CLOSE_KEY;
            } else {
                VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20190923-01", "", "", "", new HashMap());
                ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.alipay.util.H5Utils", "startH5", new Class[]{String.class}, new Object[]{"https://render.alipay.com/p/c/jygb47sq"});
                bioListActivity.K = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.7
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (!"VI_ACTION_BIO_CLOSE_RESULT".equalsIgnoreCase(intent.getAction())) {
                        } else {
                            intent.getStringExtra("type");
                            String str5 = "close";
                            boolean booleanExtra = intent.getBooleanExtra(str5, false);
                            HashMap hashMap = new HashMap();
                            if (booleanExtra) {
                                BioListActivity.b(BioListActivity.this, i, str, bundle, "mBioListAdapter");
                            } else {
                                BioListActivity.a(BioListActivity.this, i, "open", "mBioListAdapter");
                                str5 = "cancel";
                            }
                            hashMap.put("action", str5);
                            VerifyLogger.getInstance().eventBehavior("UC-MobileIC-20190923-02", "", "", "", hashMap);
                            BioListActivity.r(BioListActivity.this).unregisterReceiver(BioListActivity.q(BioListActivity.this));
                        }
                    }
                };
                bioListActivity.L.registerReceiver(bioListActivity.K, new IntentFilter("VI_ACTION_BIO_CLOSE_RESULT"));
                return;
            }
        } else {
            str4 = null;
            bioListActivity.alert("", str4, bioListActivity.getResources().getString(R.string.finger_closed_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                    } else {
                        BioListActivity.b(BioListActivity.this, i, str, bundle, str3);
                    }
                }
            }, bioListActivity.getResources().getString(R.string.finger_closed_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                    } else {
                        BioListActivity.a(BioListActivity.this, i, "open", str3);
                    }
                }
            }, bundle2);
        }
        str4 = string;
        bioListActivity.alert("", str4, bioListActivity.getResources().getString(R.string.finger_closed_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                } else {
                    BioListActivity.b(BioListActivity.this, i, str, bundle, str3);
                }
            }
        }, bioListActivity.getResources().getString(R.string.finger_closed_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                } else {
                    BioListActivity.a(BioListActivity.this, i, "open", str3);
                }
            }
        }, bundle2);
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, final int i, final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b510ba", new Object[]{bioListActivity, new Integer(i), str, str2});
        } else {
            bioListActivity.runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
                    if (com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.p(r6.d).size() > 0) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
                    com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.u(r6.d);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0218, code lost:
                    if (com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.p(r6.d).size() > 0) goto L24;
                 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 638
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.AnonymousClass9.run():void");
                }
            });
        }
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f23f691", new Object[]{bioListActivity, str, str2});
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(CommonConstant.alertTextColor, true);
        bioListActivity.alert(str, str2, bioListActivity.getResources().getString(R.string.face_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    VerifyLogCat.d(BioListActivity.a(), "人脸无法识别提醒");
                }
            }
        }, (String) null, (DialogInterface.OnClickListener) null, bundle);
    }

    public static /* synthetic */ void b(BioListActivity bioListActivity, final int i, String str, Bundle bundle, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940f590d", new Object[]{bioListActivity, new Integer(i), str, bundle, str2});
        } else {
            BioOpenHelper.doBioRpcRequest("", str, "CLOSE_BIO", bundle, new BioOpenHelper.RpcCallBack() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioListActivity.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.helper.BioOpenHelper.RpcCallBack
                public final void onResult(String str3, String str4, String str5, boolean z, MICProdmngResponse mICProdmngResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c40fbbe1", new Object[]{this, str3, str4, str5, new Boolean(z), mICProdmngResponse});
                        return;
                    }
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("resultCode", str5);
                    BioListActivity.this.logBehavior("bioopen", "UC-MobileIC-190528-03", hashMap);
                    if ("1000".equalsIgnoreCase(str5)) {
                        BioListActivity bioListActivity2 = BioListActivity.this;
                        bioListActivity2.toast(bioListActivity2.getResources().getString(R.string.close_success), R.drawable.open_success, 0);
                        BioListActivity.a(BioListActivity.this, i, "close", str2);
                        return;
                    }
                    if (!"1001".equalsIgnoreCase(str5)) {
                        if ("2003".equalsIgnoreCase(str5) || "RPC_EXCEPTION".equalsIgnoreCase(str5)) {
                            BioListActivity bioListActivity3 = BioListActivity.this;
                            bioListActivity3.toast(bioListActivity3.getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
                            BioListActivity.a(BioListActivity.this, i, "open", str2);
                            return;
                        } else if ("1004".equalsIgnoreCase(str5)) {
                            BioListActivity bioListActivity4 = BioListActivity.this;
                            bioListActivity4.toast(bioListActivity4.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
                            return;
                        } else if ("1003".equalsIgnoreCase(str5)) {
                            BioListActivity.a(BioListActivity.this, i, "open", str2);
                            return;
                        }
                    }
                    BioListActivity bioListActivity5 = BioListActivity.this;
                    bioListActivity5.toast(bioListActivity5.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
                    BioListActivity.a(BioListActivity.this, i, "open", str2);
                }
            });
        }
    }

    public static /* synthetic */ void a(BioListActivity bioListActivity, MICProdmngResponse mICProdmngResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82e70097", new Object[]{bioListActivity, mICProdmngResponse});
            return;
        }
        bioListActivity.dismissProgressDialog();
        if (mICProdmngResponse != null && mICProdmngResponse.success) {
            bioListActivity.eventlogBehavior("processRpcResult", "UC-MobileIC-20200421-3", null);
            if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
                return;
            }
            bioListActivity.finish();
            return;
        }
        bioListActivity.eventlogBehavior("processRpcResult", "UC-MobileIC-20200421-4", null);
        if ("Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowSortLoading))) {
            return;
        }
        bioListActivity.finish();
    }
}
