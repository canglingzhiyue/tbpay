package com.taobao.android.detail.ttdetail.content;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.sku.utils.m;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.eyx;
import tb.kge;

/* loaded from: classes4.dex */
public class TTDContentController {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10578a;
    private eyx b;
    private ContentRequestClient c;
    private a d;
    private e e;
    private ContentRemoteListener f;
    private ContentRemoteListener g;
    private ContentRemoteListener h;
    private boolean i;
    private Handler j = new Handler(Looper.getMainLooper());
    private i k;

    static {
        kge.a(584234234);
    }

    public static /* synthetic */ a a(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("a24fa6ae", new Object[]{tTDContentController}) : tTDContentController.d;
    }

    public static /* synthetic */ Handler b(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5a586448", new Object[]{tTDContentController}) : tTDContentController.j;
    }

    public static /* synthetic */ Context c(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e7c6fe55", new Object[]{tTDContentController}) : tTDContentController.f10578a;
    }

    public static /* synthetic */ e d(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("cec5686d", new Object[]{tTDContentController}) : tTDContentController.e;
    }

    public static /* synthetic */ void e(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e201679b", new Object[]{tTDContentController});
        } else {
            tTDContentController.n();
        }
    }

    public static /* synthetic */ void f(TTDContentController tTDContentController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae1c83a", new Object[]{tTDContentController});
        } else {
            tTDContentController.o();
        }
    }

    public TTDContentController(Context context, eyx eyxVar, i iVar) {
        this.f10578a = context;
        this.b = eyxVar;
        this.k = iVar;
        this.b.f().a(h.DX_EVENT_DCEVENT, new h(this.f10578a, this.b, this, this.k));
        this.d = new a();
        this.e = new e(context, this.b);
        this.f = new ContentRemoteListener(1);
        this.g = new ContentRemoteListener(3);
        this.h = new ContentRemoteListener(2);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.e.e();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            this.e.f();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.e.g();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.e.h();
        }
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        m();
        this.d.a(this.f10578a, this.b);
        this.c = new ContentRequestClient(str, this.d.l(), "contentList");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        String a2 = this.d.a();
        String str = (String) this.b.e().a("requestItemId");
        if (!StringUtils.equals(a2, str)) {
            if (z) {
                c(str);
            } else {
                m();
            }
        }
        l();
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else {
            this.e.a();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        if (!this.i) {
            this.i = true;
            this.e.b(this.d.f(), this.d.g());
            a("all", this.f);
        } else if (!StringUtils.isEmpty(this.d.p())) {
            this.d.e();
            this.e.a(this.d.i(), this.d.g());
        }
        l();
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            m();
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.i = false;
        this.d.c();
        this.e.d();
        ContentRequestClient contentRequestClient = this.c;
        if (contentRequestClient == null) {
            return;
        }
        contentRequestClient.a();
    }

    private void a(String str, ContentRemoteListener contentRemoteListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617ea246", new Object[]{this, str, contentRemoteListener});
            return;
        }
        String str2 = null;
        if ("all".equals(str) && this.d.e(str)) {
            str2 = this.d.b();
        }
        this.c.a(str2, str, contentRemoteListener, this.d.q(), this.d.r());
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (this.c == null) {
        } else {
            a(this.d.j(), this.f);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        p();
        a(this.d.j(), this.g);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.equals(this.d.j(), str)) {
        } else {
            this.d.a(str);
            this.e.a(this.d.i(), this.d.g());
            if (!this.d.d()) {
                n();
            } else {
                o();
            }
            if (!this.d.e(str)) {
                return;
            }
            a(str, this.h);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d.a(i);
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.d.f(str);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.d.g(str);
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.d.l();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.e.a(DXRecyclerLayout.LOAD_MORE_NO_DATA_STRING);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.e.a(DXRecyclerLayout.LOAD_MORE_STOPED);
        }
    }

    private void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
        } else {
            this.e.a("loading");
        }
    }

    public int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        a aVar = this.d;
        if (aVar.e(aVar.j())) {
            return 0;
        }
        a aVar2 = this.d;
        JSONArray d = aVar2.d(aVar2.j());
        for (int i = 0; i < d.size(); i++) {
            if (str.equals(((JSONObject) d.get(i)).getString("id"))) {
                return i;
            }
        }
        return 0;
    }

    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.e.b();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        this.d.e();
        this.e.a(this.d.g());
        this.e.a(this.d.k());
    }

    /* loaded from: classes4.dex */
    public class ContentRemoteListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int STATUS_CHANGE_TAB = 2;
        public static final int STATUS_INIT = 1;
        public static final int STATUS_LOAD_MORE = 3;
        private final int mStatus;

        static {
            kge.a(148610985);
            kge.a(-525336021);
        }

        public static /* synthetic */ int access$300(ContentRemoteListener contentRemoteListener) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26f24c31", new Object[]{contentRemoteListener})).intValue() : contentRemoteListener.mStatus;
        }

        public static /* synthetic */ void access$400(ContentRemoteListener contentRemoteListener, DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c326ac6", new Object[]{contentRemoteListener, dXTemplateItem});
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
            com.taobao.android.detail.ttdetail.utils.i.a("ContentController", "request data system error : " + mtopResponse);
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
                com.taobao.android.detail.ttdetail.utils.i.a("ContentController", sb.toString());
            } else {
                String str = new String(mtopResponse.getBytedata());
                TTDContentController.a(TTDContentController.this).c(str);
                onRequestSuccess(str);
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            com.taobao.android.detail.ttdetail.utils.i.a("ContentController", "request data error : " + mtopResponse);
            onRequestFailed(mtopResponse);
        }

        private void onRequestSuccess(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3de2a084", new Object[]{this, str});
            } else {
                d.a(TTDContentController.b(TTDContentController.this), new Runnable() { // from class: com.taobao.android.detail.ttdetail.content.TTDContentController.ContentRemoteListener.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (y.a(TTDContentController.c(TTDContentController.this))) {
                        } else {
                            DXTemplateItem i = TTDContentController.a(TTDContentController.this).i();
                            if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 1) {
                                ContentRemoteListener.access$400(ContentRemoteListener.this, i);
                            } else if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 2) {
                                TTDContentController.d(TTDContentController.this).a(i, TTDContentController.a(TTDContentController.this).g());
                            } else if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 3) {
                                TTDContentController.d(TTDContentController.this).c(i, TTDContentController.a(TTDContentController.this).g());
                            }
                            if (TTDContentController.a(TTDContentController.this).d() && TTDContentController.a(TTDContentController.this).b(str) != null && !TTDContentController.a(TTDContentController.this).b(str).isEmpty()) {
                                return;
                            }
                            TTDContentController.e(TTDContentController.this);
                        }
                    }
                });
            }
        }

        private void onRequestFailed(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5ad9cd9", new Object[]{this, mtopResponse});
            } else {
                d.a(TTDContentController.b(TTDContentController.this), new Runnable() { // from class: com.taobao.android.detail.ttdetail.content.TTDContentController.ContentRemoteListener.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (y.a(TTDContentController.c(TTDContentController.this))) {
                        } else {
                            if (ContentRemoteListener.access$300(ContentRemoteListener.this) == 3) {
                                TTDContentController.f(TTDContentController.this);
                            }
                            if (!TTDContentController.a(TTDContentController.this).e(TTDContentController.a(TTDContentController.this).j())) {
                                TTDContentController.d(TTDContentController.this).a("failed");
                                return;
                            }
                            TTDContentController.a(TTDContentController.this).a("error", "网络繁忙，请稍后重试");
                            DXTemplateItem i = TTDContentController.a(TTDContentController.this).i();
                            e d = TTDContentController.d(TTDContentController.this);
                            if (i == null) {
                                i = TTDContentController.a(TTDContentController.this).f();
                            }
                            d.a(i, TTDContentController.a(TTDContentController.this).g());
                        }
                    }
                });
            }
        }

        private void initContentDX(final DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb1ad64d", new Object[]{this, dXTemplateItem});
                return;
            }
            View b = TTDContentController.d(TTDContentController.this).b();
            if (b.getHeight() == 0) {
                b.post(new Runnable() { // from class: com.taobao.android.detail.ttdetail.content.TTDContentController.ContentRemoteListener.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int b2 = m.b(TTDContentController.c(TTDContentController.this), TTDContentController.d(TTDContentController.this).c());
                        if (b2 == 0) {
                            b2 = 650;
                        }
                        TTDContentController.a(TTDContentController.this).b(b2);
                        TTDContentController.d(TTDContentController.this).a(dXTemplateItem, TTDContentController.a(TTDContentController.this).g());
                    }
                });
                return;
            }
            TTDContentController.a(TTDContentController.this).b(m.b(TTDContentController.c(TTDContentController.this), TTDContentController.d(TTDContentController.this).c()));
            TTDContentController.d(TTDContentController.this).a(dXTemplateItem, TTDContentController.a(TTDContentController.this).g());
        }
    }
}
