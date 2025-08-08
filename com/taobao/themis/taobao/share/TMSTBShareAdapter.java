package com.taobao.themis.taobao.share;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.f;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.k;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;
import tb.qox;
import tb.qoy;
import tb.qpt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/taobao/share/TMSTBShareAdapter;", "Lcom/taobao/themis/kernel/adapter/IShareAdapter;", "()V", "getShareUrl", "", "shareInfo", "Lcom/taobao/themis/kernel/adapter/IShareAdapter$ShareConfig;", "appId", "share", "", "context", "Landroid/content/Context;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "shareConfig", "shareListener", "Lcom/taobao/themis/kernel/adapter/IShareAdapter$IShareListener;", "Companion", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSTBShareAdapter implements IShareAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ITMSPage b;
        public final /* synthetic */ IShareAdapter.a c;
        public final /* synthetic */ IShareAdapter.b e;

        public c(ITMSPage iTMSPage, IShareAdapter.a aVar, IShareAdapter.b bVar) {
            this.b = iTMSPage;
            this.c = aVar;
            this.e = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            com.taobao.themis.kernel.ability.a a2 = com.taobao.themis.kernel.ability.a.a();
            f b = this.b.b();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = jSONObject;
            jSONObject2.put((JSONObject) PopConst.BRIDGE_KEY_BUSINESS_ID, this.c.a());
            TMSTBShareAdapter tMSTBShareAdapter = TMSTBShareAdapter.this;
            IShareAdapter.a aVar = this.c;
            String h = this.b.b().h();
            q.b(h, "page.getInstance().appId");
            jSONObject2.put((JSONObject) "url", TMSTBShareAdapter.access$getShareUrl(tMSTBShareAdapter, aVar, h));
            String c = this.c.c();
            if (c == null) {
                c = k.j(this.b.b());
            }
            jSONObject2.put((JSONObject) "title", c);
            String d = this.c.d();
            if (d == null) {
                d = k.l(this.b.b());
            }
            jSONObject2.put((JSONObject) "desc", d);
            String e = this.c.e();
            if (e == null || e.length() == 0) {
                z = true;
            }
            jSONObject2.put((JSONObject) "imageURL", z ? k.k(this.b.b()) : this.c.e());
            jSONObject2.put((JSONObject) "templateParams", (String) this.c.f());
            jSONObject2.put((JSONObject) "extendParams", (String) this.c.g());
            ArrayList<String> h2 = this.c.h();
            if (h2 != null) {
                jSONObject2.put((JSONObject) "targets", (String) h2);
            }
            t tVar = t.INSTANCE;
            a2.a(b, TMSCalendarBridge.namespace, null, null, "SharePannel", "open", jSONObject, new qox() { // from class: com.taobao.themis.taobao.share.TMSTBShareAdapter.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.qox
                public void a(qoy qoyVar, boolean z2) {
                    JSONObject a3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7bdbcf97", new Object[]{this, qoyVar, new Boolean(z2)});
                    } else if (qoyVar == null || (a3 = qoyVar.a()) == null) {
                    } else {
                        if (q.a(a3.get("type"), (Object) "onSuccess")) {
                            c.this.e.c("");
                        } else if (q.a(a3.get("type"), (Object) "onFail")) {
                            IShareAdapter.b bVar = c.this.e;
                            Object obj = a3.get("msg");
                            if (!(obj instanceof String)) {
                                obj = null;
                            }
                            String str = (String) obj;
                            if (str == null) {
                                str = "";
                            }
                            bVar.b(str);
                        } else if (q.a(a3.get("type"), (Object) "onCancel")) {
                            IShareAdapter.b bVar2 = c.this.e;
                            Object obj2 = a3.get("msg");
                            if (!(obj2 instanceof String)) {
                                obj2 = null;
                            }
                            String str2 = (String) obj2;
                            if (str2 == null) {
                                str2 = "";
                            }
                            bVar2.a(str2);
                        }
                        TMSLogger.a("TMS:DefaultShareAdapter", "onCallback: " + a3);
                    }
                }
            });
        }
    }

    static {
        kge.a(-1167017987);
        kge.a(-1328620451);
        Companion = new a(null);
    }

    public static final /* synthetic */ String access$getShareUrl(TMSTBShareAdapter tMSTBShareAdapter, IShareAdapter.a aVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("59ca3522", new Object[]{tMSTBShareAdapter, aVar, str}) : tMSTBShareAdapter.a(aVar, str);
    }

    @Override // com.taobao.themis.kernel.adapter.IShareAdapter
    public void share(Context context, ITMSPage page, IShareAdapter.a shareConfig, IShareAdapter.b shareListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859c3196", new Object[]{this, context, page, shareConfig, shareListener});
            return;
        }
        q.d(context, "context");
        q.d(page, "page");
        q.d(shareConfig, "shareConfig");
        q.d(shareListener, "shareListener");
        if (!(context instanceof Activity)) {
            shareListener.b("invalid context");
        } else {
            ((IExecutorService) qpt.a(IExecutorService.class)).getExecutor(ExecutorType.NORMAL).execute(new c(page, shareConfig, shareListener));
        }
    }

    private final String a(IShareAdapter.a aVar, String str) {
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d21369b9", new Object[]{this, aVar, str});
        }
        String b = aVar.b();
        if (StringUtils.isEmpty(b)) {
            return b;
        }
        Uri parse = Uri.parse(b);
        q.a(parse);
        Uri build = parse.buildUpon().appendQueryParameter("x_object_type", "miniapp").appendQueryParameter("x_miniapp_id", str).build();
        return (build == null || (uri = build.toString()) == null) ? "" : uri;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/taobao/share/TMSTBShareAdapter$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_taobao_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(-1915974907);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }
}
