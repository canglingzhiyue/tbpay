package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bc;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.sku.utils.m;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.ezh;
import tb.ezi;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentDetailActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INDEX_CHANGED_RESULT = 11;
    public static final int INDEX_NOT_CHANGED_RESULT = 12;
    public static final int START_CONTENT_DETAIL_CODE = 10;

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f10570a;
    private DXRootView b;
    private a c;
    private DXRecyclerLayout d;
    private ContentRequestClient e;
    private DXTemplateItem f;
    private TBPublicMenu g;
    private com.taobao.android.detail.ttdetail.d i;
    private eyx j;
    private Handler h = new Handler(Looper.getMainLooper());
    private View.OnAttachStateChangeListener k = new View.OnAttachStateChangeListener() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            } else {
                ContentDetailActivity.b(ContentDetailActivity.this).f().a(ContentDetailActivity.a(ContentDetailActivity.this));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            } else {
                ContentDetailActivity.b(ContentDetailActivity.this).f().b(ContentDetailActivity.a(ContentDetailActivity.this));
            }
        }
    };
    private IRemoteBaseListener l = new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.2
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
                com.taobao.android.detail.ttdetail.utils.i.a("ContentDetailActivity", sb.toString());
            } else {
                ContentDetailActivity.c(ContentDetailActivity.this).c(new String(mtopResponse.getBytedata()));
                d.a(ContentDetailActivity.d(ContentDetailActivity.this), new Runnable() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.2.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (y.a(ContentDetailActivity.this)) {
                        } else {
                            ContentDetailActivity.e(ContentDetailActivity.this);
                        }
                    }
                });
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
            } else {
                d.a(ContentDetailActivity.d(ContentDetailActivity.this), new Runnable() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.2.2
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
            }
        }
    };

    static {
        kge.a(1410153200);
    }

    public static /* synthetic */ Object ipc$super(ContentDetailActivity contentDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
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

    public static /* synthetic */ DXRootView a(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXRootView) ipChange.ipc$dispatch("8fcfed90", new Object[]{contentDetailActivity}) : contentDetailActivity.b;
    }

    public static /* synthetic */ DXRootView a(ContentDetailActivity contentDetailActivity, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("858c8bef", new Object[]{contentDetailActivity, dXRootView});
        }
        contentDetailActivity.b = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ DXRecyclerLayout a(ContentDetailActivity contentDetailActivity, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("34e69e01", new Object[]{contentDetailActivity, dXRecyclerLayout});
        }
        contentDetailActivity.d = dXRecyclerLayout;
        return dXRecyclerLayout;
    }

    public static /* synthetic */ void a(ContentDetailActivity contentDetailActivity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba09d7c", new Object[]{contentDetailActivity, new Integer(i)});
        } else {
            contentDetailActivity.a(i);
        }
    }

    public static /* synthetic */ void a(ContentDetailActivity contentDetailActivity, ViewGroup viewGroup, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6c6be0a", new Object[]{contentDetailActivity, viewGroup, jSONObject});
        } else {
            contentDetailActivity.a(viewGroup, jSONObject);
        }
    }

    public static /* synthetic */ void a(ContentDetailActivity contentDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93322071", new Object[]{contentDetailActivity, str});
        } else {
            contentDetailActivity.a(str);
        }
    }

    public static /* synthetic */ eyx b(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("b6b4121a", new Object[]{contentDetailActivity}) : contentDetailActivity.j;
    }

    public static /* synthetic */ void b(ContentDetailActivity contentDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c39e572", new Object[]{contentDetailActivity, str});
        } else {
            contentDetailActivity.b(str);
        }
    }

    public static /* synthetic */ a c(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("24f6a324", new Object[]{contentDetailActivity}) : contentDetailActivity.c;
    }

    public static /* synthetic */ Handler d(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a9d81e5c", new Object[]{contentDetailActivity}) : contentDetailActivity.h;
    }

    public static /* synthetic */ void e(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d92ef6b", new Object[]{contentDetailActivity});
        } else {
            contentDetailActivity.e();
        }
    }

    public static /* synthetic */ TBPublicMenu f(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("8f13f615", new Object[]{contentDetailActivity}) : contentDetailActivity.g;
    }

    public static /* synthetic */ void g(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ea55ed", new Object[]{contentDetailActivity});
        } else {
            contentDetailActivity.c();
        }
    }

    public static /* synthetic */ ViewGroup h(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("c8ec9d27", new Object[]{contentDetailActivity}) : contentDetailActivity.f10570a;
    }

    public static /* synthetic */ View.OnAttachStateChangeListener i(ContentDetailActivity contentDetailActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnAttachStateChangeListener) ipChange.ipc$dispatch("92acd284", new Object[]{contentDetailActivity}) : contentDetailActivity.k;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.tt_detail_activity_content_detail);
        this.i = new com.taobao.android.detail.ttdetail.d(this);
        this.j = this.i.a();
        bc.a(this.j, this);
        this.j.f().a(h.DX_EVENT_DCEVENT, new h(this, this.j, null, null));
        d();
        b();
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.d == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            d.a(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.d);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.c == null) {
            finish();
            com.taobao.android.detail.ttdetail.utils.i.a("ContentDetailActivity", "data engine is null");
        } else {
            this.f10570a = (ViewGroup) findViewById(R.id.page_container);
            View findViewById = findViewById(R.id.tv_back);
            View findViewById2 = findViewById(R.id.tv_more);
            this.g = new TBPublicMenu(this);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.3
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
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        ContentDetailActivity.f(ContentDetailActivity.this).show();
                    }
                }
            });
            ((FrameLayout.LayoutParams) findViewById(R.id.action_bar).getLayoutParams()).topMargin = SystemBarDecorator.getStatusBarHeight(this);
            new SystemBarDecorator(this).enableImmersiveStatusBar();
            this.f10570a.post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ContentDetailActivity.g(ContentDetailActivity.this);
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
        int b = m.b(this, this.f10570a.getHeight());
        DXTemplateItem dXTemplateItem = this.f;
        a aVar = this.c;
        a(dXTemplateItem, d.a(aVar.d(aVar.j()), null, "success", "", String.valueOf(b), this.c.h()));
    }

    public void a(DXTemplateItem dXTemplateItem, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b62daff", new Object[]{this, dXTemplateItem, jSONObject});
        } else if (dXTemplateItem == null) {
        } else {
            final ezi c = new ezi().a(dXTemplateItem.f()).b(String.valueOf(dXTemplateItem.g())).c(dXTemplateItem.c);
            this.j.f().a(c, this.f10570a, new ezh.b() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.b
                public void a(ViewGroup viewGroup) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
                    } else if (!(viewGroup instanceof DXRootView)) {
                    } else {
                        DXRootView a2 = ContentDetailActivity.a(ContentDetailActivity.this);
                        ContentDetailActivity.a(ContentDetailActivity.this, (DXRootView) viewGroup);
                        ViewParent parent = ContentDetailActivity.a(ContentDetailActivity.this).getParent();
                        if (parent != ContentDetailActivity.h(ContentDetailActivity.this)) {
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(ContentDetailActivity.a(ContentDetailActivity.this));
                            }
                            ContentDetailActivity.h(ContentDetailActivity.this).removeView(a2);
                            ContentDetailActivity.h(ContentDetailActivity.this).addView(ContentDetailActivity.a(ContentDetailActivity.this), 0);
                        }
                        ContentDetailActivity contentDetailActivity = ContentDetailActivity.this;
                        ContentDetailActivity.a(contentDetailActivity, ContentDetailActivity.a(contentDetailActivity), jSONObject);
                        if (!ContentDetailActivity.c(ContentDetailActivity.this).d()) {
                            ContentDetailActivity.b(ContentDetailActivity.this, DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
                        }
                        ContentDetailActivity.a(ContentDetailActivity.this).removeOnAttachStateChangeListener(ContentDetailActivity.i(ContentDetailActivity.this));
                        ContentDetailActivity.a(ContentDetailActivity.this).addOnAttachStateChangeListener(ContentDetailActivity.i(ContentDetailActivity.this));
                        ContentDetailActivity contentDetailActivity2 = ContentDetailActivity.this;
                        ContentDetailActivity.a(contentDetailActivity2, ContentDetailActivity.c(contentDetailActivity2).k());
                    }
                }

                @Override // tb.ezh.b
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.i.a("ContentDetailActivity", "create dx( name:" + c.a() + " version:" + c.b() + " url:" + c.c() + " ) failed, error: " + str);
                }
            });
        }
    }

    private void a(final ViewGroup viewGroup, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40dacb29", new Object[]{this, viewGroup, jSONObject});
        } else {
            this.j.f().a(viewGroup, jSONObject, new ezh.d() { // from class: com.taobao.android.detail.ttdetail.content.ContentDetailActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.ezh.d
                public void a(ViewGroup viewGroup2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup2});
                    } else if (!(viewGroup2 instanceof DXRootView)) {
                    } else {
                        ContentDetailActivity.a(ContentDetailActivity.this, (DXRecyclerLayout) ((DXRootView) viewGroup2).getExpandWidgetNode().queryWidgetNodeByUserId("recyclerContentDetail"));
                    }
                }

                @Override // tb.ezh.d
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    com.taobao.android.detail.ttdetail.utils.i.a("ContentDetailActivity", "render dxView( " + viewGroup + " ) failed, error: " + str);
                }
            });
        }
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
        this.f = new DXTemplateItem();
        DXTemplateItem dXTemplateItem = this.f;
        dXTemplateItem.c = stringExtra;
        dXTemplateItem.f11925a = stringExtra3;
        dXTemplateItem.b = d.a(stringExtra2);
        this.c = b.a(stringExtra4);
        a aVar = this.c;
        if (aVar == null) {
            com.taobao.android.detail.ttdetail.utils.i.a("ContentDetailActivity", "data engine is null, uniqueId is " + stringExtra4);
            return;
        }
        this.e = new ContentRequestClient(aVar.a(), this.c.l(), "contentDetail");
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.d == null) {
        } else {
            a aVar = this.c;
            JSONArray d = aVar.d(aVar.j());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", (Object) d);
            d.a(DXRecyclerLayout.MSG_METHOD_REFRESH_DATA, jSONObject, this.d);
            if (this.c.d()) {
                return;
            }
            b(DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.d == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", (Object) str);
            d.a(DXRecyclerLayout.MSG_METHOD_LOAD_MORE, jSONObject, this.d);
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ContentRequestClient contentRequestClient = this.e;
        if (contentRequestClient == null) {
            return;
        }
        contentRequestClient.a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.a(null, this.c.j(), this.l, this.c.q(), this.c.r());
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
        if (f != -1 && f != this.c.k()) {
            this.c.a(f);
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
        DXRecyclerLayout dXRecyclerLayout = this.d;
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
        DXRecyclerLayout dXRecyclerLayout = this.d;
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
