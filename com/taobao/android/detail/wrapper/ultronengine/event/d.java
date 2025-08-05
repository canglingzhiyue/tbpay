package com.taobao.android.detail.wrapper.ultronengine.event;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.event.params.CollectionParams;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.dwy;
import tb.dzh;
import tb.ecg;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.eps;
import tb.eqb;
import tb.fcy;
import tb.ffl;
import tb.ffm;
import tb.ffo;
import tb.kge;

/* loaded from: classes5.dex */
public class d extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "collectClick";

    /* renamed from: a  reason: collision with root package name */
    public String f11450a = com.alibaba.ability.localization.b.a(R.string.x_detail_app_busy_system_tired);
    public String b = com.alibaba.ability.localization.b.a(R.string.x_detail_app_congratulations_collection_success);
    public String l = com.alibaba.ability.localization.b.a(R.string.x_detail_app_cancel_collection_success);

    static {
        kge.a(-1859259712);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(d dVar, com.alibaba.android.ultron.event.base.e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33c736a3", new Object[]{dVar, eVar, new Boolean(z)});
        } else {
            dVar.a(eVar, z);
        }
    }

    public d() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.CollectClickedUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("CollectClickedSubscriber", "onHandleEvent");
        DetailCoreActivity detailCoreActivity = (DetailCoreActivity) eVar.a();
        com.taobao.android.detail.datasdk.model.datamodel.node.c C = detailCoreActivity.C();
        View view = (View) eVar.d(com.alibaba.android.ultron.event.base.f.KEY_TARGET_VIEW);
        boolean booleanValue = eVar.d().getFields().getBooleanValue("isCollected");
        try {
            ItemNode c = eqb.c(C.f10055a);
            if (!booleanValue) {
                dzh.a(this.d, c.categoryId, String.valueOf(c.rootCategoryId));
            } else {
                a(this.d, c.categoryId, String.valueOf(c.rootCategoryId));
            }
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "trackClick", th);
        }
        a(eVar, detailCoreActivity, view, C.h(), C.i(), !booleanValue);
    }

    private static void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            eps.a(context, "CancelFavorite", new Pair("spm", "a2141.7631564.cancelfavorite"), new Pair("categoryId", str), new Pair("rootCategoryId", str2));
        }
    }

    private void a(com.alibaba.android.ultron.event.base.e eVar, DetailCoreActivity detailCoreActivity, View view, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a0b3326", new Object[]{this, eVar, detailCoreActivity, view, str, str2, new Boolean(z)});
            return;
        }
        com.taobao.android.detail.core.event.params.b bVar = new com.taobao.android.detail.core.event.params.b(str, str2, z);
        if (z) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            bVar.e = iArr[0] + (view.getWidth() / 2);
            bVar.f = iArr[1];
            a(eVar, detailCoreActivity, bVar);
            return;
        }
        b(eVar, detailCoreActivity, bVar);
    }

    private void a(final com.alibaba.android.ultron.event.base.e eVar, final DetailCoreActivity detailCoreActivity, final com.taobao.android.detail.core.event.params.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcc70ef6", new Object[]{this, eVar, detailCoreActivity, bVar});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("itemId", bVar.b);
        com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "msoaAddFav");
        ecg.b(detailCoreActivity, "add_favorite", hashMap);
        com.taobao.android.msoa.c.a().a(new ffl("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "msoaAddFav onSuccess");
                if (map != null && map.containsKey("addResult") && ((Boolean) map.get("addResult")).booleanValue()) {
                    d.a(d.this, eVar, true);
                    com.taobao.android.detail.core.utils.n.a("AddCollectItem");
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.put("itemId", bVar.b);
                    hashMap2.put("x", Integer.valueOf(bVar.e));
                    hashMap2.put("y", Integer.valueOf(bVar.f));
                    if (!bVar.c) {
                        return;
                    }
                    ecg.b(detailCoreActivity, "show_category", hashMap2);
                    if (!com.alibaba.ability.localization.b.c()) {
                        com.taobao.android.msoa.c.a().a(new ffo(null, hashMap2), new MSOAServiceListener() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.d.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                            public void onSuccess(Map<String, Object> map2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("93e51c7a", new Object[]{this, map2});
                                    return;
                                }
                                if (map2 != null && map2.containsKey(aw.PARAM_ACTIVITY_URL) && !TextUtils.isEmpty((String) map2.get(aw.PARAM_ACTIVITY_URL))) {
                                    String str = (String) map2.get(aw.PARAM_ACTIVITY_URL);
                                    if (detailCoreActivity.hasWindowFocus()) {
                                        epj.f().navigateTo(detailCoreActivity, str, null);
                                    }
                                } else {
                                    epo.a(d.this.b);
                                }
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("requestParam", hashMap2);
                                hashMap3.put(InputFrame3.TYPE_RESPONSE, map2);
                                ecg.b(detailCoreActivity, "show_category", hashMap3);
                            }

                            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                            public void onFail(String str, String str2, boolean z, Map<String, Object> map2) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map2});
                                    return;
                                }
                                epo.a(d.this.b);
                                ecg.i(detailCoreActivity, bVar.b, str, str2);
                                ecg.c(detailCoreActivity, "show_category", str, str2, hashMap2);
                            }
                        });
                    }
                } else {
                    epo.a(d.this.f11450a);
                }
                HashMap hashMap3 = new HashMap();
                hashMap3.put("requestParam", hashMap);
                hashMap3.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.b(detailCoreActivity, "add_favorite", hashMap3);
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "msoaAddFav onFail");
                com.taobao.android.detail.core.utils.n.a("AddCollectItem", "80003", str2);
                d.a(d.this, eVar, false);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("requestParam", hashMap);
                hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.c(detailCoreActivity, "add_favorite", str, str2, hashMap2);
                ecg.j(detailCoreActivity, bVar.b, str, str2);
                if (!TextUtils.isEmpty(str2) && z) {
                    if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                        epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_not_login));
                        com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "收藏失败，没有登陆");
                        return;
                    }
                    epo.a(str2);
                    com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "收藏失败," + str2);
                    return;
                }
                epo.a(d.this.f11450a);
                com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "收藏失败,原因未知");
            }
        });
    }

    private void b(final com.alibaba.android.ultron.event.base.e eVar, final DetailCoreActivity detailCoreActivity, final com.taobao.android.detail.core.event.params.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55a5ed5", new Object[]{this, eVar, detailCoreActivity, bVar});
            return;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("itemId", bVar.b);
        ecg.b(detailCoreActivity, "cancel_favorite", hashMap);
        com.taobao.android.msoa.c.a().a(new ffm("taobao_detail", hashMap), new MSOAServiceListener() { // from class: com.taobao.android.detail.wrapper.ultronengine.event.d.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onSuccess(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    return;
                }
                if (map != null && map.containsKey("deleteResult") && ((Boolean) map.get("deleteResult")).booleanValue()) {
                    epo.a(d.this.l);
                    d.a(d.this, eVar, false);
                    com.taobao.android.detail.core.utils.n.a("DelCollectItem");
                } else {
                    epo.a(d.this.f11450a);
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("requestParam", hashMap);
                hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.b(detailCoreActivity, "cancel_favorite", hashMap2);
            }

            @Override // com.taobao.android.msoa.callback.MSOAServiceListener
            public void onFail(String str, String str2, boolean z, Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str, str2, new Boolean(z), map});
                    return;
                }
                d.a(d.this, eVar, true);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("requestParam", hashMap);
                hashMap2.put(InputFrame3.TYPE_RESPONSE, map);
                ecg.c(detailCoreActivity, "cancel_favorite", str, str2, hashMap2);
                ecg.k(detailCoreActivity, bVar.b, str, str2);
                com.taobao.android.detail.core.utils.n.a("DelCollectItem", "80004", str2);
                if (!TextUtils.isEmpty(str2) && z) {
                    if (ErrorConstant.isSessionInvalid(str) || "ANDROID_SYS_LOGIN_CANCEL".equals(str)) {
                        epo.a(com.alibaba.ability.localization.b.a(R.string.x_detail_app_not_login));
                        com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "取消收藏失败,没有登录");
                        return;
                    }
                    epo.a(str2);
                    com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "取消收藏失败" + str2);
                    return;
                }
                epo.a(d.this.f11450a);
                com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "取消收藏失败,原因未知");
            }
        });
    }

    private void a(com.alibaba.android.ultron.event.base.e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e74e1e31", new Object[]{this, eVar, new Boolean(z)});
            return;
        }
        try {
            if (z) {
                com.taobao.android.trade.event.f.a(eVar.a(), new fcy(CollectionParams.DONE));
            } else {
                com.taobao.android.trade.event.f.a(eVar.a(), new fcy(CollectionParams.NORMAL));
            }
        } catch (Throwable th) {
            com.taobao.android.detail.core.utils.i.a("CollectClickedSubscriber", "updateFavState", th);
        }
        com.alibaba.android.ultron.event.base.f d = eVar.h().d();
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a("adjustState");
        a2.a(eVar.d());
        JSONObject jSONObject = new JSONObject();
        JSONObject fields = ((DMEvent) eVar.i()).getFields();
        jSONObject.putAll(fields);
        if (z) {
            jSONObject.put("subType", (Object) dwy.KEY_DETAIL_COLLECTED);
            jSONObject.put("payload", (Object) fields.getJSONObject(dwy.KEY_DETAIL_COLLECTED));
        } else {
            jSONObject.put("subType", (Object) "unCollected");
            jSONObject.put("payload", (Object) fields.getJSONObject("uncollected"));
        }
        a2.a(new DMEvent("adjustState", jSONObject, Collections.singletonList(eVar.d())));
        d.a(a2);
    }
}
