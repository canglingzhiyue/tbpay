package com.taobao.android.detail.core.detail.content;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.taobao.util.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.detail.core.standard.widget.a;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.sku.utils.m;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eaz;
import tb.ecg;
import tb.emu;
import tb.eno;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentDetailActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INDEX_CHANGED_RESULT = 11;
    public static final int INDEX_NOT_CHANGED_RESULT = 12;
    public static final int START_CONTENT_DETAIL_CODE = 10;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f9437a;
    private bd b;
    private DXRootView c;
    private c d;
    private DXRecyclerLayout e;
    private ContentRequestClient f;
    private DXTemplateItem g;
    private com.taobao.android.detail.core.standard.widget.a h;
    private IRemoteBaseListener i;
    private TBPublicMenu j;

    static {
        kge.a(-1736631830);
    }

    public static /* synthetic */ Object ipc$super(ContentDetailActivity contentDetailActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 1150324634) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.finish();
            return null;
        }
    }

    public ContentDetailActivity() {
        com.taobao.android.launcher.bootstrap.tao.f.a("com.taobao.android.detail", "com.taobao.android.detail.core.detail.content.ContentDetailActivity");
        ApplicationInvoker.getInstance("com.taobao.android.detail").invoke("com.taobao.android.detail.DetailApplication", TaobaoApplication.sApplication);
        this.i = new IRemoteBaseListener() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onRequestFailed(mtopResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                boolean z = true;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("mtop onSuccess, but data is empty, mtopResponse == null : ");
                    if (mtopResponse != null) {
                        z = false;
                    }
                    sb.append(z);
                    k.a("ContentDetailActivity", sb.toString());
                } else {
                    ContentDetailActivity.a(ContentDetailActivity.this).c(new String(mtopResponse.getBytedata()));
                    f.a(new Runnable() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (ContentDetailActivity.this.isFinishing()) {
                            } else {
                                if (Build.VERSION.SDK_INT >= 17 && ContentDetailActivity.this.isDestroyed()) {
                                    return;
                                }
                                ContentDetailActivity.b(ContentDetailActivity.this);
                            }
                        }
                    });
                    ContentDetailActivity contentDetailActivity = ContentDetailActivity.this;
                    ecg.a(contentDetailActivity, ContentDetailActivity.a(contentDetailActivity).a());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onRequestFailed(mtopResponse);
                }
            }

            private void onRequestFailed(MtopResponse mtopResponse) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
                    return;
                }
                f.a(new Runnable() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.1.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            ContentDetailActivity.a(ContentDetailActivity.this, DXRecyclerLayout.LOAD_MORE_STOPED);
                        }
                    }
                });
                ContentDetailActivity contentDetailActivity = ContentDetailActivity.this;
                ecg.a(contentDetailActivity, ContentDetailActivity.a(contentDetailActivity).a(), mtopResponse == null ? "null" : mtopResponse.toString());
            }
        };
    }

    public static /* synthetic */ c a(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("62c58cc", new Object[]{contentDetailActivity}) : contentDetailActivity.d;
    }

    public static /* synthetic */ DXRootView a(ContentDetailActivity contentDetailActivity, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("3938ba7", new Object[]{contentDetailActivity, dXRootView});
        }
        contentDetailActivity.c = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ DXRecyclerLayout a(ContentDetailActivity contentDetailActivity, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("8960e7b9", new Object[]{contentDetailActivity, dXRecyclerLayout});
        }
        contentDetailActivity.e = dXRecyclerLayout;
        return dXRecyclerLayout;
    }

    public static /* synthetic */ void a(ContentDetailActivity contentDetailActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9abf34", new Object[]{contentDetailActivity, new Integer(i)});
        } else {
            contentDetailActivity.a(i);
        }
    }

    public static /* synthetic */ void a(ContentDetailActivity contentDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c78a5b9", new Object[]{contentDetailActivity, str});
        } else {
            contentDetailActivity.a(str);
        }
    }

    public static /* synthetic */ void b(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f633e2ce", new Object[]{contentDetailActivity});
        } else {
            contentDetailActivity.e();
        }
    }

    public static /* synthetic */ void b(ContentDetailActivity contentDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9f3518", new Object[]{contentDetailActivity, str});
        } else {
            contentDetailActivity.b(str);
        }
    }

    public static /* synthetic */ TBPublicMenu c(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("8f381a56", new Object[]{contentDetailActivity}) : contentDetailActivity.j;
    }

    public static /* synthetic */ void d(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b15d50c", new Object[]{contentDetailActivity});
        } else {
            contentDetailActivity.c();
        }
    }

    public static /* synthetic */ DXRootView e(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("8bbf4d4c", new Object[]{contentDetailActivity}) : contentDetailActivity.c;
    }

    public static /* synthetic */ ViewGroup f(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8b20bf8b", new Object[]{contentDetailActivity}) : contentDetailActivity.f9437a;
    }

    public static /* synthetic */ bd g(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bd) ipChange.ipc$dispatch("b2e07747", new Object[]{contentDetailActivity}) : contentDetailActivity.b;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.x_detail_activity_content_detail);
        com.taobao.android.trade.event.f.a(this).a(eno.a(b.class), new ContentDXSubscriber(this));
        this.b = eaz.e();
        d();
        b();
        emu.a("com.taobao.android.detail.core.detail.content.ContentDetailActivity");
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.e == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            f.a(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.e);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.d == null) {
            finish();
            com.taobao.android.detail.core.utils.i.d("ContentDetailActivity", "data engine is null");
        } else {
            this.f9437a = (ViewGroup) findViewById(R.id.page_container);
            View findViewById = findViewById(R.id.tv_back);
            View findViewById2 = findViewById(R.id.tv_more);
            this.j = new TBPublicMenu(this);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ContentDetailActivity.this.finish();
                    }
                }
            });
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ContentDetailActivity.c(ContentDetailActivity.this).show();
                    }
                }
            });
            ((FrameLayout.LayoutParams) findViewById(R.id.action_bar).getLayoutParams()).topMargin = SystemBarDecorator.getStatusBarHeight(this);
            new SystemBarDecorator(this).enableImmersiveStatusBar();
            this.f9437a.post(new Runnable() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ContentDetailActivity.d(ContentDetailActivity.this);
                    }
                }
            });
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        int b = m.b(this, this.f9437a.getHeight());
        com.taobao.android.detail.core.standard.widget.a aVar = this.h;
        DXTemplateItem dXTemplateItem = this.g;
        c cVar = this.d;
        aVar.a(dXTemplateItem, f.a(cVar.d(cVar.i()), null, "success", "", String.valueOf(b), this.d.o()), new a.InterfaceC0381a() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
            public void a(DXTemplateItem dXTemplateItem2, DXResult<DXRootView> dXResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("489f219c", new Object[]{this, dXTemplateItem2, dXResult});
                } else if (ContentDetailActivity.e(ContentDetailActivity.this) != null) {
                } else {
                    ContentDetailActivity.a(ContentDetailActivity.this, dXResult.f11780a);
                    ContentDetailActivity.f(ContentDetailActivity.this).addView(ContentDetailActivity.e(ContentDetailActivity.this), 0);
                    ContentDetailActivity contentDetailActivity = ContentDetailActivity.this;
                    ContentDetailActivity.a(contentDetailActivity, (DXRecyclerLayout) ContentDetailActivity.e(contentDetailActivity).getExpandWidgetNode().queryWidgetNodeByUserId("recyclerContentDetail"));
                    if (!ContentDetailActivity.a(ContentDetailActivity.this).d()) {
                        ContentDetailActivity.b(ContentDetailActivity.this, DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                    }
                    ContentDetailActivity.e(ContentDetailActivity.this).addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.android.detail.core.detail.content.ContentDetailActivity.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("3d337638", new Object[]{this, view});
                            } else {
                                ContentDetailActivity.g(ContentDetailActivity.this).d().b(ContentDetailActivity.e(ContentDetailActivity.this));
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7f64d55b", new Object[]{this, view});
                            } else {
                                ContentDetailActivity.g(ContentDetailActivity.this).d().a(ContentDetailActivity.e(ContentDetailActivity.this));
                            }
                        }
                    });
                    ContentDetailActivity contentDetailActivity2 = ContentDetailActivity.this;
                    ContentDetailActivity.a(contentDetailActivity2, ContentDetailActivity.a(contentDetailActivity2).j());
                }
            }

            @Override // com.taobao.android.detail.core.standard.widget.a.InterfaceC0381a
            public void a(DXTemplateItem dXTemplateItem2, s sVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7d32a2d0", new Object[]{this, dXTemplateItem2, sVar});
                    return;
                }
                com.taobao.android.detail.core.utils.i.a("ContentDetailActivity", "render content detail dx error");
                if (dXTemplateItem2 == null || sVar == null) {
                    return;
                }
                if (String.valueOf(30005).equals(sVar.f11919a)) {
                    ecg.c(ContentDetailActivity.this, dXTemplateItem2.f11925a, String.valueOf(dXTemplateItem2.b), dXTemplateItem2.c);
                } else {
                    ecg.b(ContentDetailActivity.this, dXTemplateItem2.f11925a, String.valueOf(dXTemplateItem2.b), dXTemplateItem2.c, sVar.toString());
                }
            }
        });
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("dxUrl");
        String stringExtra2 = intent.getStringExtra("dxVersion");
        String stringExtra3 = intent.getStringExtra("dxName");
        String stringExtra4 = intent.getStringExtra("uniqueId");
        this.g = new DXTemplateItem();
        DXTemplateItem dXTemplateItem = this.g;
        dXTemplateItem.c = stringExtra;
        dXTemplateItem.f11925a = stringExtra3;
        dXTemplateItem.b = f.a(stringExtra2);
        this.h = new com.taobao.android.detail.core.standard.widget.a(this, this.b.d());
        this.d = d.a(stringExtra4);
        c cVar = this.d;
        if (cVar == null) {
            com.taobao.android.detail.core.utils.i.d("ContentDetailActivity", "data engine is null, uniqueId is " + stringExtra4);
            return;
        }
        this.f = new ContentRequestClient(cVar.a(), this.d.k(), "contentDetail");
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        c cVar = this.d;
        JSONArray d = cVar.d(cVar.i());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", (Object) d);
        f.a(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA, jSONObject, this.e);
        if (this.d.d()) {
            return;
        }
        b(DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("status", (Object) str);
        f.a(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.e);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ContentRequestClient contentRequestClient = this.f;
        if (contentRequestClient != null) {
            contentRequestClient.a();
        }
        com.taobao.android.trade.event.f.b(this);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f.a((String) null, this.d.i(), this.i);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        int f = f();
        if (f != -1 && f != this.d.j()) {
            this.d.a(f);
            setResult(-1);
        }
        super.finish();
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        DXRecyclerLayout dXRecyclerLayout = this.e;
        if (dXRecyclerLayout == null) {
            return;
        }
        dXRecyclerLayout.a(false, i);
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        DXRecyclerLayout dXRecyclerLayout = this.e;
        if (dXRecyclerLayout == null) {
            return -1;
        }
        RecyclerView l = dXRecyclerLayout.l();
        int childCount = l.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = l.getChildAt(i);
            int top = childAt.getTop();
            if (top > -10 && top < 10) {
                return l.getChildLayoutPosition(childAt);
            }
        }
        return -1;
    }
}
