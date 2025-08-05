package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.params.CollectionParams;
import com.taobao.android.detail.core.open.f;
import com.taobao.android.detail.core.open.n;
import com.taobao.android.detail.core.performance.j;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.SellerNode;
import com.taobao.android.detail.datasdk.model.datamodel.node.b;
import com.taobao.android.detail.datasdk.model.datamodel.node.c;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.component.actionbar.MiniAppEntranceView;
import com.taobao.android.detail.wrapper.fragment.weex.module.GlobalWXModule;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class ffh implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DetailActivity f27893a;

    static {
        kge.a(-1960780525);
        kge.a(63647501);
    }

    public static /* synthetic */ Map a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("b796ebd6", new Object[]{cVar}) : b(cVar);
    }

    public static /* synthetic */ void a(ffh ffhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e870e230", new Object[]{ffhVar});
        } else {
            ffhVar.b();
        }
    }

    public static /* synthetic */ DetailActivity b(ffh ffhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailActivity) ipChange.ipc$dispatch("ab9bba49", new Object[]{ffhVar}) : ffhVar.f27893a;
    }

    public ffh(DetailActivity detailActivity) {
        this.f27893a = detailActivity;
        emu.a("com.taobao.android.detail.wrapper.lifecycle.TBDetailLifecycleListener");
    }

    @Override // com.taobao.android.detail.core.open.f
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1142872042) {
            if (hashCode != -1041996699) {
                if (hashCode == 1329141077 && str.equals(f.LIFE_MAIN_REFRESH_AFTER)) {
                    c = 2;
                }
            } else if (str.equals(f.LIFE_MAIN_RENDER_BEFORE)) {
                c = 0;
            }
        } else if (str.equals(f.LIFE_MAIN_RENDER_AFTER)) {
            c = 1;
        }
        if (c == 0) {
            a();
        } else if (c == 1) {
            d();
            e();
            TBXSkuCore.f();
            Coordinator.postTask(new Coordinator.TaggedRunnable("saveFamilyInfo") { // from class: tb.ffh.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        ffh.a(ffh.this);
                    }
                }
            });
        } else if (c != 2) {
        } else {
            if (!god.j) {
                c();
            }
            f();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule("detail_utils", GlobalWXModule.class);
        } catch (WXException e) {
            i.a("TBDetailLifecycleListener", "mainRenderBefore", e);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        String appID = MiniAppEntranceView.getAppID(this.f27893a.getIntent());
        if (!TextUtils.isEmpty(appID)) {
            hashMap.put("contain_miniapp", "1");
            hashMap.put("miniappid", appID);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("miniapp_id", appID);
            hashMap2.put("miniapp_object_type", "item");
            hashMap2.put("miniapp_object_id", this.f27893a.f9411a.f27180a);
            UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(this.f27893a, JSONObject.toJSONString(hashMap2));
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSONObject.toJSONString(hashMap2));
        } else {
            hashMap.put("contain_miniapp", "0");
        }
        eps.a((Activity) this.f27893a, (String) null, (Map<String, String>) hashMap);
        fha.e(this.f27893a);
    }

    public static void a(final DetailCoreActivity detailCoreActivity, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("482fb5cd", new Object[]{detailCoreActivity, bVar});
        } else if (bVar == null) {
            i.a(j.a("TBDetailLifecycleListener"), "alimama addTrack nodebundle is null");
        } else {
            Coordinator.postTask(new Coordinator.TaggedRunnable("addTrack") { // from class: tb.ffh.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c cVar = new c(bVar);
                    Uri data = detailCoreActivity.getIntent().getData();
                    boolean z = 2 == cVar.p();
                    String h = cVar.h();
                    if (TextUtils.isEmpty(h)) {
                        return;
                    }
                    fgm.a(detailCoreActivity, data, cVar.o(), h, cVar.i(), z, detailCoreActivity, ffh.a(cVar));
                }
            });
        }
    }

    private static Map<String, String> b(final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b8656a57", new Object[]{cVar});
        }
        if (cVar != null) {
            return new HashMap<String, String>() { // from class: com.taobao.android.detail.wrapper.lifecycle.TBDetailLifecycleListener$3
                {
                    put("cpsParams", c.this.E());
                }
            };
        }
        return null;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        final dya y = this.f27893a.y();
        Coordinator.postTask(new Coordinator.TaggedRunnable("addTrack") { // from class: tb.ffh.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (y.t == null) {
                } else {
                    c cVar = y.t;
                    fgm.a(ffh.b(ffh.this), ffh.b(ffh.this).getIntent().getData(), cVar.o(), cVar.h(), cVar.i(), 2 == cVar.p(), ffh.b(ffh.this), ffh.a(cVar));
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
        b bVar = this.f27893a.y().t.f10055a;
        if (!eqb.f(bVar).customItem) {
            return;
        }
        SellerNode d = eqb.d(bVar);
        String str = "itemId=" + this.f27893a.f9411a.f27180a + "&sellerNick=" + (d == null ? "" : d.sellerNick) + "&skuId=" + this.f27893a.f9411a.b;
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", "poplayer://dingzhishangpin");
        intent.putExtra("param", str);
        LocalBroadcastManager.getInstance(this.f27893a).sendBroadcast(intent);
    }

    private void e() {
        Handler handler;
        com.taobao.android.detail.core.ultronengine.f f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        dya dyaVar = this.f27893a.b;
        if (dyaVar != null && (f = dyaVar.f()) != null && f.b()) {
            return;
        }
        if (this.f27893a.f9411a.l) {
            com.taobao.android.trade.event.f.a(this.f27893a, new fcy(CollectionParams.DONE));
        }
        final ebx ebxVar = this.f27893a.f9411a;
        if (dyaVar == null || (handler = dyaVar.g) == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: tb.ffh.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", ebxVar.f27180a);
                ecg.b(ffh.b(ffh.this), "check_collect", hashMap);
                com.taobao.android.msoa.c.a().a(new ffn("taobao_detail", hashMap), new a(ffh.b(ffh.this), hashMap, ebxVar.f27180a));
                i.a("detail_msoa", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
        }, 300L);
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        DetailActivity detailActivity = this.f27893a;
        if (detailActivity == null || !fgy.a(detailActivity.s)) {
            return;
        }
        eeh eehVar = new eeh();
        eehVar.f27231a = true;
        n.a(this.f27893a).a(eehVar);
    }

    /* loaded from: classes5.dex */
    public static class a implements MSOAServiceListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<DetailActivity> f27898a;
        private Map<String, Object> b;
        private String c;

        static {
            kge.a(-2047911665);
            kge.a(-2103982869);
        }

        public a(DetailActivity detailActivity, Map<String, Object> map, String str) {
            this.f27898a = new WeakReference<>(detailActivity);
            this.b = map;
            this.c = str;
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onSuccess(Map<String, Object> map) {
            Boolean bool;
            fcy fcyVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93e51c7a", new Object[]{this, map});
                return;
            }
            DetailActivity detailActivity = this.f27898a.get();
            if (detailActivity == null) {
                return;
            }
            if (map != null && map.containsKey("isFavorite") && (bool = (Boolean) map.get("isFavorite")) != null) {
                if (bool.booleanValue()) {
                    fcyVar = new fcy(CollectionParams.DONE);
                } else {
                    fcyVar = new fcy(CollectionParams.NORMAL);
                }
                com.taobao.android.trade.event.f.a(detailActivity, fcyVar);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("requestParam", this.b);
            hashMap.put(InputFrame3.TYPE_RESPONSE, map);
            ecg.b(detailActivity, "check_collect", hashMap);
        }

        @Override // com.taobao.android.msoa.callback.MSOAServiceListener
        public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                return;
            }
            DetailActivity detailActivity = this.f27898a.get();
            if (detailActivity == null) {
                return;
            }
            i.b("TBDetailLifecycleListener", "get fav status failed. code=" + str + " msg=" + str);
            HashMap hashMap = new HashMap();
            hashMap.put("requestParam", this.b);
            hashMap.put(InputFrame3.TYPE_RESPONSE, map);
            ecg.b(this.c, str, str2);
            ecg.c(detailActivity, "check_collect", str, str2, hashMap);
        }
    }
}
