package com.taobao.android.detail.wrapper.ultronengine.event;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.params.CollectionParams;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.dwy;
import tb.ecg;
import tb.emu;
import tb.fcy;
import tb.ffn;
import tb.kge;

/* loaded from: classes5.dex */
public class c extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "checkCollect";

    /* renamed from: a  reason: collision with root package name */
    private boolean f11447a = false;
    private Handler b = new Handler(Looper.getMainLooper());
    private boolean l = false;

    static {
        kge.a(1798837733);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(c cVar, com.alibaba.android.ultron.event.base.e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4fa904", new Object[]{cVar, eVar, new Boolean(z)});
        } else {
            cVar.a(eVar, z);
        }
    }

    public static /* synthetic */ void a(c cVar, DetailCoreActivity detailCoreActivity, com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65e030eb", new Object[]{cVar, detailCoreActivity, eVar});
        } else {
            cVar.a(detailCoreActivity, eVar);
        }
    }

    public c() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.CheckCollectUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
        } else if (eVar.d("clearAlreadyChecked") != null) {
            com.taobao.android.detail.core.utils.i.c("CheckCollectUltronSubscriber", "clearAlreadyChecked");
            this.f11447a = false;
        } else if (this.f11447a) {
            com.taobao.android.detail.core.utils.i.c("CheckCollectUltronSubscriber", "alreadyChecked");
        } else {
            com.taobao.android.detail.core.utils.i.c("CheckCollectUltronSubscriber", "onHandleEvent");
            a((DetailCoreActivity) eVar.a(), eVar);
            this.f11447a = true;
        }
    }

    private void a(final DetailCoreActivity detailCoreActivity, final com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f026d8", new Object[]{this, detailCoreActivity, eVar});
        } else if (detailCoreActivity.C() == null) {
            detailCoreActivity.A().postDelayed(new Runnable() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        c.a(c.this, detailCoreActivity, eVar);
                    }
                }
            }, 100L);
        } else if (detailCoreActivity.C() == null) {
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            final HashMap hashMap = new HashMap();
            hashMap.put("itemId", detailCoreActivity.C().i());
            ecg.b(detailCoreActivity, "check_collect", hashMap);
            com.taobao.android.msoa.c.a().a(new ffn("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        return;
                    }
                    com.taobao.android.detail.core.utils.i.a("CheckCollectUltronSubscriber", "updateFavStatus onSuccess:" + JSON.toJSONString(map));
                    if (map != null && map.containsKey("isFavorite")) {
                        c.a(c.this, eVar, ((Boolean) map.get("isFavorite")).booleanValue());
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("requestParam", hashMap);
                    hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                    ecg.b(detailCoreActivity, "check_collect", hashMap2);
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                        return;
                    }
                    com.taobao.android.detail.core.utils.i.b("CheckCollectUltronSubscriber", "get fav status failed. code=" + str + " msg=" + str);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("requestParam", hashMap);
                    hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                    ecg.c(detailCoreActivity, "check_collect", str, str2, hashMap2);
                }
            });
            com.taobao.android.detail.core.utils.i.a("detail_msoa", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    private void a(com.alibaba.android.ultron.event.base.e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74e1e31", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        try {
            this.l = z;
            if (z) {
                com.taobao.android.trade.event.f.a(eVar.a(), new fcy(CollectionParams.DONE));
            } else {
                com.taobao.android.trade.event.f.a(eVar.a(), new fcy(CollectionParams.NORMAL));
            }
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("CheckCollectUltronSubscriber", "updateFavState", th);
        }
        com.alibaba.android.ultron.event.base.f d = eVar.h().d();
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a("adjustState");
        a2.a(eVar.d());
        JSONObject jSONObject = new JSONObject();
        JSONObject c = c();
        com.taobao.android.detail.core.utils.i.a("CheckCollectUltronSubscriber", "updateFavState isFav:" + z + " eventFields:" + JSON.toJSONString(c));
        if (c == null) {
            return;
        }
        jSONObject.putAll(c);
        if (z) {
            jSONObject.put("subType", (Object) dwy.KEY_DETAIL_COLLECTED);
            jSONObject.put("payload", (Object) c.getJSONObject(dwy.KEY_DETAIL_COLLECTED));
        } else {
            jSONObject.put("subType", (Object) "unCollected");
            jSONObject.put("payload", (Object) c.getJSONObject("uncollected"));
        }
        a2.a(new DMEvent("adjustState", jSONObject, Collections.singletonList(eVar.d())));
        d.a(a2);
    }
}
