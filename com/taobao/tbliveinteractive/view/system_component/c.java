package com.taobao.tbliveinteractive.view.system_component;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.annotations.MemCheck;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.a;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.business.rank_module.MtopMediaplatformLivedetailEntryResponse;
import com.taobao.tbliveinteractive.e;
import java.util.ArrayList;
import java.util.HashMap;
import tb.ame;
import tb.ane;
import tb.ddv;
import tb.ddw;
import tb.hig;
import tb.kge;
import tb.mto;
import tb.pmd;
import tb.pqj;
import tb.qmv;
import tb.qmz;
import tb.qne;
import tb.qnh;

@MemCheck(field = "mContext")
/* loaded from: classes8.dex */
public class c implements d, a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f22182a;
    private final String c;
    private Context d;
    private e e;
    private com.taobao.tbliveinteractive.b f;
    private View g;
    private boolean h;
    private VideoInfo i;
    private FrameLayout j;
    private DXRootView k;
    private com.taobao.tbliveinteractive.business.rank_module.a l;
    private JSONObject m;
    private boolean n = false;
    private com.taobao.taolive.sdk.model.f p;
    private com.taobao.alilive.aliliveframework.frame.a q;
    private com.taobao.tbliveinteractive.c r;

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : e.EVENTCENTER_BIZCODE;
    }

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d5db135e", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df77d327", new Object[]{cVar});
        } else {
            cVar.c();
        }
    }

    public static /* synthetic */ com.taobao.taolive.sdk.model.f c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.model.f) ipChange.ipc$dispatch("894c8366", new Object[]{cVar}) : cVar.p;
    }

    static {
        kge.a(1889549158);
        kge.a(-797454141);
        kge.a(191318335);
        kge.a(-1905361424);
        f22182a = c.class.getSimpleName();
    }

    @Override // com.taobao.taolive.sdk.model.a
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what != 1) {
        } else {
            c();
        }
    }

    public c(String str, Context context, com.taobao.alilive.aliliveframework.frame.a aVar, VideoInfo videoInfo, e eVar, com.taobao.tbliveinteractive.b bVar, com.taobao.tbliveinteractive.c cVar) {
        this.c = str;
        this.d = context;
        this.q = aVar;
        this.e = eVar;
        this.f = bVar;
        this.i = videoInfo;
        this.r = cVar;
    }

    public void a(ViewStub viewStub, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb8ca378", new Object[]{this, viewStub, new Boolean(z)});
            return;
        }
        this.h = z;
        if (viewStub == null || this.q.m()) {
            return;
        }
        viewStub.setLayoutResource(R.layout.taolive_room_interactive_system_component);
        this.g = viewStub.inflate();
        this.j = (FrameLayout) this.g;
        this.j.setVisibility(8);
        ane a2 = this.q.z().K().a("taolive_rankmodule".hashCode());
        if (a2 != null && hig.b()) {
            this.k = a2.a();
        } else {
            this.k = qmz.a(this.e, this.d, "taolive_rankmodule");
        }
        DXRootView dXRootView = this.k;
        if (dXRootView == null) {
            return;
        }
        this.j.addView(dXRootView);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.i;
        if (videoInfo == null || videoInfo.broadCaster == null) {
            return;
        }
        this.p = new com.taobao.taolive.sdk.model.f(this);
        c();
        ddw.a().a(this);
        if (!e()) {
            return;
        }
        f();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        com.taobao.tbliveinteractive.business.rank_module.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
            this.l = null;
        }
        ddw.a().b(this);
        JSONObject jSONObject = this.m;
        if (jSONObject != null) {
            jSONObject.clear();
            this.m = null;
        }
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.taobao.taolive.sdk.model.f fVar = this.p;
        if (fVar != null) {
            fVar.removeCallbacksAndMessages(null);
            this.p = null;
        }
        ame K = this.q.z().K();
        if (this.k != null && hig.b()) {
            this.j.removeView(this.k);
            K.a(new ane(this.k));
        }
        this.r = null;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.tbliveinteractive.business.rank_module.a aVar = this.l;
        if (aVar != null) {
            aVar.a();
        }
        this.l = new com.taobao.tbliveinteractive.business.rank_module.a(this);
        this.l.a(this.i, 2);
        com.taobao.taolive.sdk.model.f fVar = this.p;
        if (fVar == null) {
            return;
        }
        fVar.removeCallbacksAndMessages(null);
        this.p.sendEmptyMessageDelayed(1, 60000L);
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        VideoInfo videoInfo = this.i;
        return videoInfo != null && videoInfo.isOfficialLive();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!g()) {
            try {
                if (this.q.m() || this.k == null) {
                    return;
                }
                if (this.m == null) {
                    this.m = new JSONObject();
                }
                JSONArray jSONArray = new JSONArray();
                if (this.f != null && this.f.a(qne.h()) != null && ((this.m.containsKey("hasHourRankingListEntry") && this.m.getBooleanValue("hasHourRankingListEntry")) || (this.m.containsKey("hasRankingListEntry") && this.m.getBooleanValue("hasRankingListEntry")))) {
                    JSONObject jSONObject = this.m.getJSONObject("hourRankingListData");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("track");
                    if (jSONObject2 != null) {
                        jSONObject2.getString("id");
                    }
                    boolean z = jSONObject.getJSONObject("bizData").getDoubleValue("displayTotalAmount") > mto.a.GEO_NOT_SUPPORT;
                    long longValue = jSONObject.getLongValue("cycleTimeLeft");
                    JSONObject jSONObject3 = (JSONObject) this.m.clone();
                    jSONObject3.put("show_action", (Object) "show_action_rank_normal");
                    jSONArray.add(jSONObject3);
                    if (!qne.j() && z) {
                        JSONObject jSONObject4 = (JSONObject) this.m.clone();
                        jSONObject4.put("show_action", (Object) "show_action_rank_red");
                        jSONArray.add(jSONObject4);
                    }
                    if (!qne.j() && !z && longValue > 0 && longValue < 600) {
                        JSONObject jSONObject5 = (JSONObject) this.m.clone();
                        jSONObject5.put("show_action", (Object) "show_action_rank_countdown");
                        long a2 = pmd.a().w().a();
                        jSONObject5.put("currentTime", (Object) Long.valueOf(a2));
                        jSONObject5.put("futureTime", (Object) Long.valueOf(a2 + (longValue * 1000)));
                        jSONArray.add(jSONObject5);
                    }
                    if (!this.n) {
                        this.n = true;
                        HashMap hashMap = new HashMap();
                        hashMap.put("dataRank", this.m.toJSONString());
                        hashMap.put("name", "rankModuleNative");
                        JSONObject jSONObject6 = this.m.getJSONObject("logParams");
                        if (jSONObject6 != null) {
                            for (String str : jSONObject6.keySet()) {
                                hashMap.put(str, jSONObject6.getString(str));
                            }
                        }
                        qnh.a(this.e, "Show-rank", hashMap);
                        ddw.a().a("com.taobao.taolive.room.interactive_component_entrance_render_finished", hashMap, this.c);
                        if (this.r != null) {
                            this.r.b(null, hashMap);
                        }
                    }
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("bannerList", (Object) jSONArray);
                    jSONObject7.put("enableNewMixLiveTopUI", (Object) Boolean.valueOf(qne.j()));
                    qmz.a(this.e, this.k, jSONObject7, this.c);
                    if (this.j == null) {
                        return;
                    }
                    this.j.setVisibility(0);
                    int a3 = com.taobao.taolive.room.utils.d.a(this.d, 3.0f);
                    this.j.setPadding(a3, 0, a3, 0);
                } else if (this.j != null) {
                    this.j.setVisibility(8);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (!(netBaseOutDo instanceof MtopMediaplatformLivedetailEntryResponse)) {
        } else {
            this.m = pqj.b(((MtopMediaplatformLivedetailEntryResponse) netBaseOutDo).mo1437getData());
            e eVar = this.e;
            if (eVar != null && eVar.o() != null) {
                this.e.o().a(this.m);
            }
            d();
        }
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        this.m = null;
        d();
    }

    @Override // com.taobao.taolive.sdk.adapter.network.d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        char c = 65535;
        if (str.hashCode() == -2008943835 && str.equals("com.taobao.taolive.room.dxmanager.event")) {
            c = 0;
        }
        if (c != 0 || !(obj instanceof qmv.a)) {
            return;
        }
        qmv.a aVar = (qmv.a) obj;
        if (aVar.f32947a == null || aVar.f32947a.length < 2 || !"rank_entry_click".equals(aVar.f32947a[1]) || this.m == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("data=" + this.m.toJSONString());
        JSONObject jSONObject = this.m.getJSONObject("logParams");
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                arrayList.add(str2 + "=" + jSONObject.getString(str2));
            }
        }
        if ("show_action_rank_normal".equals(aVar.f32947a[2]) || "show_action_rank_countdown".equals(aVar.f32947a[2])) {
            a("HOUR_RANK_LIST", qne.i());
            qnh.a(this.e, "rank", (String[]) arrayList.toArray(new String[arrayList.size()]));
        } else if ("show_action_rank_red".equals(aVar.f32947a[2])) {
            a("FANS_RANK_LIST", qne.i());
            qnh.a(this.e, "rank", (String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (this.m == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("isLandscape", Boolean.valueOf(this.h));
            hashMap.put("status", 2);
            this.m.put("action", (Object) str);
            hashMap.put("data", this.m);
            com.taobao.tbliveinteractive.b bVar = this.f;
            if (bVar == null) {
                return;
            }
            bVar.g(str2, hashMap);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.dxmanager.event"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : this.c;
    }

    private boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : Boolean.parseBoolean(pmd.a().d().a("tblive", "enableEnergyOpt", "true"));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        Context context = this.d;
        if (!(context instanceof Activity)) {
            return;
        }
        Activity activity = (Activity) context;
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        activity.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.taobao.tbliveinteractive.view.system_component.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity2, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cce650e1", new Object[]{this, activity2, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4148cc84", new Object[]{this, activity2});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4658a75", new Object[]{this, activity2});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3e8abf42", new Object[]{this, activity2});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c9c12a", new Object[]{this, activity2, bundle});
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5e01616c", new Object[]{this, activity2});
                } else if (activity2 != c.a(c.this)) {
                } else {
                    c.b(c.this);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc236bb8", new Object[]{this, activity2});
                } else if (activity2 != c.a(c.this) || c.c(c.this) == null) {
                } else {
                    c.c(c.this).removeCallbacksAndMessages(null);
                }
            }
        });
    }
}
