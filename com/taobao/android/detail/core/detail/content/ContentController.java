package com.taobao.android.detail.core.detail.content;

import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.sku.utils.m;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.dyk;
import tb.eaz;
import tb.ecg;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DetailCoreActivity f9432a;
    private ContentRequestClient b;
    private c c;
    private g d;
    private bd e = new bd(eaz.c());
    private ContentRemoteListener f;
    private ContentRemoteListener g;
    private ContentRemoteListener h;
    private boolean i;
    private dyk j;

    static {
        kge.a(-110218234);
    }

    public static /* synthetic */ c a(ContentController contentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("735c11b0", new Object[]{contentController}) : contentController.c;
    }

    public static /* synthetic */ void a(ContentController contentController, String str, ContentRemoteListener contentRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7125eef", new Object[]{contentController, str, contentRemoteListener});
        } else {
            contentController.a(str, contentRemoteListener);
        }
    }

    public static /* synthetic */ boolean a(ContentController contentController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0ea8aa5", new Object[]{contentController, new Boolean(z)})).booleanValue();
        }
        contentController.i = z;
        return z;
    }

    public static /* synthetic */ g b(ContentController contentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("bc7318cb", new Object[]{contentController}) : contentController.d;
    }

    public static /* synthetic */ void c(ContentController contentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89863bd1", new Object[]{contentController});
        } else {
            contentController.k();
        }
    }

    public static /* synthetic */ void d(ContentController contentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2669c70", new Object[]{contentController});
        } else {
            contentController.l();
        }
    }

    public static /* synthetic */ boolean e(ContentController contentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fb46fd13", new Object[]{contentController})).booleanValue() : contentController.i;
    }

    public static /* synthetic */ ContentRemoteListener f(ContentController contentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ContentRemoteListener) ipChange.ipc$dispatch("484353ca", new Object[]{contentController}) : contentController.f;
    }

    public ContentController(DetailCoreActivity detailCoreActivity, dyk dykVar) {
        this.f9432a = detailCoreActivity;
        this.j = dykVar;
        this.e.a(h.DX_EVENT_DCEVENT, new h());
        this.e.a(i.DX_PARSER_DETAILURLENCODE, new i());
        this.c = new c();
        this.d = new g(detailCoreActivity, this.e);
        this.f = new ContentRemoteListener(1);
        this.g = new ContentRemoteListener(3);
        this.h = new ContentRemoteListener(2);
        emu.a("com.taobao.android.detail.core.detail.content.ContentController");
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.d.d();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.d.e();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.c.a(this.f9432a);
        this.b = new ContentRequestClient(this.f9432a.f9411a.f27180a, this.c.k(), "contentList");
        this.d.b(this.c.f(), this.c.g());
        this.j.a(new a());
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.i = false;
        this.c.c();
        this.d.c();
        ContentRequestClient contentRequestClient = this.b;
        if (contentRequestClient == null) {
            return;
        }
        contentRequestClient.a();
    }

    private void a(String str, ContentRemoteListener contentRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85afe8ba", new Object[]{this, str, contentRemoteListener});
            return;
        }
        String str2 = null;
        if ("all".equals(str) && this.c.e(str)) {
            str2 = this.c.b();
        }
        this.b.a(str2, str, contentRemoteListener);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.b == null || this.d == null) {
        } else {
            a(this.c.i(), this.f);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        m();
        a(this.c.i(), this.g);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.equals(this.c.i(), str)) {
        } else {
            this.c.a(str);
            this.d.a(this.c.h(), this.c.g());
            if (!this.c.d()) {
                k();
            } else {
                l();
            }
            if (!this.c.e(str)) {
                return;
            }
            a(str, this.h);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            d();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.c.a(i);
        }
    }

    public String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.c.k();
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.d.a(DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.d.a(DXRecyclerLayout.LOAD_MORE_STOPED);
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            this.d.a("loading");
        }
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        c cVar = this.c;
        if (cVar.e(cVar.i())) {
            return 0;
        }
        c cVar2 = this.c;
        JSONArray d = cVar2.d(cVar2.i());
        for (int i = 0; i < d.size(); i++) {
            if (str.equals(((JSONObject) d.get(i)).getString("id"))) {
                return i;
            }
        }
        return 0;
    }

    public View i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6aec84b2", new Object[]{this}) : this.d.a();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        this.c.e();
        this.d.a(this.c.g());
        this.d.a(this.c.j());
    }

    /* loaded from: classes4.dex */
    public class ContentRemoteListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATUS_CHANGE_TAB = 2;
        public static final int STATUS_INIT = 1;
        public static final int STATUS_LOAD_MORE = 3;
        private final int mStatus;

        static {
            kge.a(1049693621);
            kge.a(-525336021);
        }

        public static /* synthetic */ int access$200(ContentRemoteListener contentRemoteListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7b635f06", new Object[]{contentRemoteListener})).intValue() : contentRemoteListener.mStatus;
        }

        public static /* synthetic */ void access$300(ContentRemoteListener contentRemoteListener, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe9906db", new Object[]{contentRemoteListener, dXTemplateItem});
            } else {
                contentRemoteListener.initContentDX(dXTemplateItem);
            }
        }

        public ContentRemoteListener(int i) {
            this.mStatus = i;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            com.taobao.android.detail.core.utils.i.d("ContentController", "request data system error : " + mtopResponse);
            onRequestFailed(mtopResponse);
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
                com.taobao.android.detail.core.utils.i.a("ContentController", sb.toString());
            } else {
                String str = new String(mtopResponse.getBytedata());
                ContentController.a(ContentController.this).c(str);
                onRequestSuccess(str);
                ecg.a(ContentController.this.f9432a, ContentController.a(ContentController.this).a());
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            com.taobao.android.detail.core.utils.i.d("ContentController", "request data error : " + mtopResponse);
            onRequestFailed(mtopResponse);
        }

        private void onRequestSuccess(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3de2a084", new Object[]{this, str});
            } else {
                f.a(new Runnable() { // from class: com.taobao.android.detail.core.detail.content.ContentController.ContentRemoteListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (ContentController.this.f9432a.b == null) {
                        } else {
                            DXTemplateItem h = ContentController.a(ContentController.this).h();
                            if (ContentRemoteListener.access$200(ContentRemoteListener.this) == 1) {
                                ContentRemoteListener.access$300(ContentRemoteListener.this, h);
                            } else if (ContentRemoteListener.access$200(ContentRemoteListener.this) == 2) {
                                ContentController.b(ContentController.this).a(h, ContentController.a(ContentController.this).g());
                            } else if (ContentRemoteListener.access$200(ContentRemoteListener.this) == 3) {
                                ContentController.b(ContentController.this).c(h, ContentController.a(ContentController.this).g());
                            }
                            if (ContentController.a(ContentController.this).d() && ContentController.a(ContentController.this).b(str) != null && !ContentController.a(ContentController.this).b(str).isEmpty()) {
                                return;
                            }
                            ContentController.c(ContentController.this);
                        }
                    }
                });
            }
        }

        private void onRequestFailed(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
                return;
            }
            f.a(new Runnable() { // from class: com.taobao.android.detail.core.detail.content.ContentController.ContentRemoteListener.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (ContentController.this.f9432a.b == null) {
                    } else {
                        if (ContentRemoteListener.access$200(ContentRemoteListener.this) == 3) {
                            ContentController.d(ContentController.this);
                        }
                        if (!ContentController.a(ContentController.this).e(ContentController.a(ContentController.this).i())) {
                            ContentController.b(ContentController.this).a("failed");
                            return;
                        }
                        ContentController.a(ContentController.this).a("error", "网络繁忙，请稍后重试");
                        DXTemplateItem h = ContentController.a(ContentController.this).h();
                        g b = ContentController.b(ContentController.this);
                        if (h == null) {
                            h = ContentController.a(ContentController.this).f();
                        }
                        b.a(h, ContentController.a(ContentController.this).g());
                    }
                }
            });
            ecg.a(ContentController.this.f9432a, ContentController.a(ContentController.this).a(), mtopResponse == null ? "null" : mtopResponse.toString());
        }

        private void initContentDX(final DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb1ad64d", new Object[]{this, dXTemplateItem});
                return;
            }
            View a2 = ContentController.b(ContentController.this).a();
            if (a2.getHeight() == 0) {
                a2.post(new Runnable() { // from class: com.taobao.android.detail.core.detail.content.ContentController.ContentRemoteListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int b = m.b(ContentController.this.f9432a, ContentController.b(ContentController.this).b());
                        if (b == 0) {
                            b = 650;
                        }
                        ContentController.a(ContentController.this).b(b);
                        ContentController.b(ContentController.this).a(dXTemplateItem, ContentController.a(ContentController.this).g());
                    }
                });
                return;
            }
            ContentController.a(ContentController.this).b(m.b(ContentController.this.f9432a, ContentController.b(ContentController.this).b()));
            ContentController.b(ContentController.this).a(dXTemplateItem, ContentController.a(ContentController.this).g());
        }
    }

    /* loaded from: classes4.dex */
    public class a extends e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(62305577);
        }

        private a() {
        }

        @Override // com.taobao.android.detail.core.detail.content.e, android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            if (!ContentController.e(ContentController.this) && f > 0.2f) {
                ContentController.a(ContentController.this, true);
                ContentController contentController = ContentController.this;
                ContentController.a(contentController, "all", ContentController.f(contentController));
            }
            if (f < 0.9d && i == 0) {
                ContentController.b(ContentController.this).g();
            } else if (f != 0.0f || i != 1) {
            } else {
                ContentController.b(ContentController.this).f();
            }
        }
    }
}
