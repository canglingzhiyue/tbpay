package com.taobao.android.detail.industry.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.detail.industry.fullfeeds.DXViewLoader;
import com.taobao.android.detail.industry.fullfeeds.a$a;
import com.taobao.android.detail.industry.fullfeeds.b;
import com.taobao.android.detail.industry.fullfeeds.c;
import com.taobao.android.detail.industry.hourlydelivery.d;
import com.taobao.android.detail.industry.tool.a;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.videoc.DXVideoControlConfig;
import com.taobao.android.launcher.bootstrap.tao.f;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import com.taobao.tao.util.SystemBarDecorator;
import java.util.Set;
import tb.fxw;
import tb.gbg;
import tb.kge;

/* loaded from: classes4.dex */
public class FullFeedsActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f10069a;
    private DXTemplateItem b;
    private DXViewLoader c;
    private DinamicXEngine d;
    private DXRootView e;
    private FrameLayout f;
    private c g;
    private d h;
    private View i;
    private String j;
    private JSONObject k;
    private c.a l;

    static {
        kge.a(-242048389);
    }

    public static /* synthetic */ Object ipc$super(FullFeedsActivity fullFeedsActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
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

    public FullFeedsActivity() {
        f.a("com.taobao.android.detail", "com.taobao.android.detail.industry.activity.FullFeedsActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
        this.k = new JSONObject();
        this.l = new c.a() { // from class: com.taobao.android.detail.industry.activity.FullFeedsActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.fullfeeds.c.a
            public void a(DXTemplateItem dXTemplateItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a042611", new Object[]{this, dXTemplateItem});
                    return;
                }
                FullFeedsActivity.a(FullFeedsActivity.this, dXTemplateItem);
                FullFeedsActivity.b(FullFeedsActivity.this).post(new Runnable() { // from class: com.taobao.android.detail.industry.activity.FullFeedsActivity.1.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            FullFeedsActivity.a(FullFeedsActivity.this);
                        }
                    }
                });
            }

            @Override // com.taobao.android.detail.industry.fullfeeds.c.a
            public void a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (FullFeedsActivity.this.f10069a) {
                } else {
                    FullFeedsActivity.a(FullFeedsActivity.this, (DXTemplateItem) null);
                    FullFeedsActivity.b(FullFeedsActivity.this).post(new Runnable() { // from class: com.taobao.android.detail.industry.activity.FullFeedsActivity.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                FullFeedsActivity.c(FullFeedsActivity.this);
                            }
                        }
                    });
                }
            }
        };
    }

    public static /* synthetic */ DXRootView a(FullFeedsActivity fullFeedsActivity, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("561f7138", new Object[]{fullFeedsActivity, dXRootView});
        }
        fullFeedsActivity.e = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ DXTemplateItem a(FullFeedsActivity fullFeedsActivity, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("4cb43b8", new Object[]{fullFeedsActivity, dXTemplateItem});
        }
        fullFeedsActivity.b = dXTemplateItem;
        return dXTemplateItem;
    }

    public static /* synthetic */ void a(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c0ac3e", new Object[]{fullFeedsActivity});
        } else {
            fullFeedsActivity.e();
        }
    }

    public static /* synthetic */ FrameLayout b(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("1991e61c", new Object[]{fullFeedsActivity}) : fullFeedsActivity.f;
    }

    public static /* synthetic */ void c(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be9ca4fc", new Object[]{fullFeedsActivity});
        } else {
            fullFeedsActivity.f();
        }
    }

    public static /* synthetic */ boolean d(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b0aa15f", new Object[]{fullFeedsActivity})).booleanValue() : fullFeedsActivity.h();
    }

    public static /* synthetic */ DXRootView e(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("5c2c2add", new Object[]{fullFeedsActivity}) : fullFeedsActivity.e;
    }

    public static /* synthetic */ DXViewLoader f(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXViewLoader) ipChange.ipc$dispatch("4ec4b5ef", new Object[]{fullFeedsActivity}) : fullFeedsActivity.c;
    }

    public static /* synthetic */ DXTemplateItem g(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXTemplateItem) ipChange.ipc$dispatch("17d3aa47", new Object[]{fullFeedsActivity}) : fullFeedsActivity.b;
    }

    public static /* synthetic */ String h(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a2328aa9", new Object[]{fullFeedsActivity}) : fullFeedsActivity.j;
    }

    public static /* synthetic */ c i(FullFeedsActivity fullFeedsActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("8ac58e7b", new Object[]{fullFeedsActivity}) : fullFeedsActivity.g;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        d();
        this.f = new FrameLayout(this);
        this.f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setContentView(this.f);
        b();
        c();
        a();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        DinamicXEngine dinamicXEngine = this.d;
        if (dinamicXEngine == null || !this.f10069a) {
            return;
        }
        dinamicXEngine.b(this.e);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        DinamicXEngine dinamicXEngine = this.d;
        if (dinamicXEngine == null || !this.f10069a) {
            return;
        }
        dinamicXEngine.a(this.e);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h = new d(g());
        this.g = new c(this, this.l);
        this.g.a(this.j);
    }

    private void b() {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (getIntent() != null && (data = getIntent().getData()) != null && !TextUtils.isEmpty(data.getQuery())) {
            this.j = data.getQueryParameter("bizCode");
            Set<String> queryParameterNames = data.getQueryParameterNames();
            if (queryParameterNames == null || queryParameterNames.isEmpty()) {
                return;
            }
            for (String str : queryParameterNames) {
                this.k.put(str, (Object) data.getQueryParameter(str));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DXVideoControlConfig<fxw> b = DXVideoControlConfig.b();
        try {
            b.a(Class.forName("com.taobao.android.dinamicx.widget.video.DXVideoViewWidgetNode"));
            b.b(true);
        } catch (Exception e) {
            a.b("FullFeedsActivity", "find DXVideoViewWidgetNode error " + e.getMessage());
        }
        this.d = new DinamicXEngine(new DXEngineConfig.a("TBIndustyFullFeeds").a(b).f(true).e(2).a(true, true).a());
        this.c = new DXViewLoader(this, this.d);
        this.d.a(b.FULLFEEDSCLOSE, new b.a());
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().getDecorView().setSystemUiVisibility(1280);
            getWindow().setStatusBarColor(0);
        } else if (Build.VERSION.SDK_INT < 19) {
        } else {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags = 67108864 | attributes.flags;
        }
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.f10069a) {
        } else {
            this.f10069a = true;
            this.c.a(this.b, a(gbg.a((Context) this, this.f.getHeight()), gbg.a((Context) this, SystemBarDecorator.SystemBarConfig.getStatusBarHeight(this)), 0.0f), new a$a() { // from class: com.taobao.android.detail.industry.activity.FullFeedsActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.industry.fullfeeds.a$a
                public void a(DXTemplateItem dXTemplateItem, DXResult<DXRootView> dXResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem, dXResult});
                    } else if (FullFeedsActivity.d(FullFeedsActivity.this)) {
                    } else {
                        try {
                            FullFeedsActivity.a(FullFeedsActivity.this, dXResult.f11780a);
                            FullFeedsActivity.b(FullFeedsActivity.this).removeAllViews();
                            FullFeedsActivity.b(FullFeedsActivity.this).addView(FullFeedsActivity.e(FullFeedsActivity.this));
                            if (!dXResult.b()) {
                                return;
                            }
                            a.b("FullFeedsActivity", "renderFailure : " + dXResult.a().toString());
                        } catch (Exception e) {
                            a.b("FullFeedsActivity", "addToRootView error: " + e.getMessage());
                        }
                    }
                }

                @Override // com.taobao.android.detail.industry.fullfeeds.a$a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        FullFeedsActivity.f(FullFeedsActivity.this).a(FullFeedsActivity.e(FullFeedsActivity.this).getExpandWidgetNode());
                    }
                }

                @Override // com.taobao.android.detail.industry.fullfeeds.a$a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (FullFeedsActivity.d(FullFeedsActivity.this)) {
                    } else {
                        a.b("FullFeedsActivity", "fullfedds download dx error");
                        FullFeedsActivity.c(FullFeedsActivity.this);
                    }
                }
            });
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        try {
            this.e = null;
            this.f10069a = false;
            this.i = this.h.a(this);
            this.f.removeAllViews();
            this.f.addView(this.i);
        } catch (Exception e) {
            a.b("FullFeedsActivity", "showErrorView error: " + e.getMessage());
        }
    }

    private JSONObject a(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a6ad1578", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("rootHeight", (Object) String.valueOf(f));
        jSONObject.put("safeAreaTop", (Object) String.valueOf(f2));
        jSONObject.put("safeAreaBottom", (Object) String.valueOf(f3));
        JSONObject jSONObject2 = this.k;
        if (jSONObject2 != null) {
            jSONObject.put(DxContainerActivity.PARAMS_URL_BUSINESS_PARAMS, (Object) jSONObject2);
        }
        if (this.g.a() != null) {
            jSONObject.put("bizConfigMap", (Object) this.g.a());
        }
        return jSONObject;
    }

    private d.a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d.a) ipChange.ipc$dispatch("bf209ca2", new Object[]{this}) : new d.a() { // from class: com.taobao.android.detail.industry.activity.FullFeedsActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.industry.hourlydelivery.d.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (FullFeedsActivity.d(FullFeedsActivity.this)) {
                } else {
                    if (FullFeedsActivity.g(FullFeedsActivity.this) == null) {
                        FullFeedsActivity.i(FullFeedsActivity.this).a(FullFeedsActivity.h(FullFeedsActivity.this));
                    } else {
                        FullFeedsActivity.a(FullFeedsActivity.this);
                    }
                }
            }
        };
    }

    private boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : isFinishing() || (Build.VERSION.SDK_INT >= 17 && isDestroyed());
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c cVar = this.g;
        if (cVar != null) {
            cVar.b();
        }
        DXViewLoader dXViewLoader = this.c;
        if (dXViewLoader == null) {
            return;
        }
        dXViewLoader.a();
    }
}
