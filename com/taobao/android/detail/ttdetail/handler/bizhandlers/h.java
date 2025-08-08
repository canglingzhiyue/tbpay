package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.at;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.eyx;
import tb.ezm;
import tb.kge;
import tb.odg;
import tb.pir;
import tb.pkw;

/* loaded from: classes5.dex */
public class h implements ezm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "collectClick";

    /* renamed from: a  reason: collision with root package name */
    private Context f10704a;
    private eyx b;
    private String c = odg.o().a(R.string.tt_detail_not_login);
    private String d = odg.o().a(R.string.tt_detail_app_congratulations_collection_success);
    private String e = odg.o().a(R.string.tt_detail_app_cancel_collection_success);

    static {
        kge.a(714956420);
        kge.a(1967244270);
    }

    public static /* synthetic */ Context a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("99060ad2", new Object[]{hVar}) : hVar.f10704a;
    }

    public static /* synthetic */ void a(h hVar, com.taobao.android.detail.ttdetail.component.module.d dVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11741825", new Object[]{hVar, dVar, jSONObject, new Boolean(z)});
        } else {
            hVar.a(dVar, jSONObject, z);
        }
    }

    public static /* synthetic */ void a(h hVar, String str, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41fc65b2", new Object[]{hVar, str, runtimeAbilityParamArr});
        } else {
            hVar.a(str, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ boolean a(h hVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2ef445a", new Object[]{hVar, jSONObject})).booleanValue() : hVar.a(jSONObject);
    }

    public static /* synthetic */ String b(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c189efe5", new Object[]{hVar}) : hVar.e;
    }

    public static /* synthetic */ String c(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f7d55c4", new Object[]{hVar}) : hVar.c;
    }

    public static /* synthetic */ eyx d(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("a4983385", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ String e(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5b642182", new Object[]{hVar}) : hVar.d;
    }

    public h(Context context, eyx eyxVar) {
        this.f10704a = context;
        this.b = eyxVar;
    }

    @Override // tb.ezm
    public boolean a(com.taobao.android.detail.ttdetail.handler.event.a aVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        final JSONObject b;
        final String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbeca8d7", new Object[]{this, aVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (aVar == null || (b = aVar.b()) == null) {
            return false;
        }
        if (com.taobao.android.detail.ttdetail.utils.d.a(this.b.a())) {
            return true;
        }
        pir pirVar = (pir) this.b.a().a(pkw.PARSER_ID);
        if (at.a(pirVar)) {
            string = at.c(pirVar);
        } else {
            string = b.getString("itemId");
        }
        odg.k().a(string, new odg.i() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.odg.i
            public void a(final boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                final com.taobao.android.detail.ttdetail.component.module.d a2 = com.taobao.android.detail.ttdetail.utils.a.a(runtimeAbilityParamArr);
                if (a2 == null) {
                    com.taobao.android.detail.ttdetail.utils.i.a("CollectorImplementor", "queryCollect success with value: " + z + ", but not found triggerComponent for write back");
                    return;
                }
                if (z) {
                    odg.k().a(string, new odg.g() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.h.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.odg.g
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            Toast.makeText(h.a(h.this), h.b(h.this), 0).show();
                            h.a(h.this, a2, b, false);
                        }

                        @Override // tb.odg.g
                        public void a(String str, String str2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                                return;
                            }
                            if (ErrorConstant.isSessionInvalid(str) || StringUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                                Toast.makeText(h.a(h.this), h.c(h.this), 0).show();
                            } else if (odg.o().a()) {
                                Toast.makeText(h.a(h.this), odg.o().a(R.string.tt_detail_cancel_collet_failed), 0).show();
                            } else {
                                Toast.makeText(h.a(h.this), str2, 0).show();
                            }
                            h.a(h.this, a2, b, true);
                            HashMap hashMap = new HashMap();
                            hashMap.put("errorCode", str);
                            hashMap.put("errorMsg", str2);
                            hashMap.put("itemId", string);
                            com.taobao.android.detail.ttdetail.utils.ae.a(hashMap, -100013, "取消收藏失败");
                        }
                    });
                } else {
                    odg.k().a(string, com.taobao.android.detail.ttdetail.utils.d.a((Resource) h.d(h.this).a().a(Resource.class)), new odg.g() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.h.1.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.odg.g
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                return;
                            }
                            Toast.makeText(h.a(h.this), h.e(h.this), 0).show();
                            h.a(h.this, a2, b, true);
                            if (h.a(h.this, b)) {
                                return;
                            }
                            h.a(h.this, string, runtimeAbilityParamArr);
                        }

                        @Override // tb.odg.g
                        public void a(String str, String str2) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                                return;
                            }
                            if (ErrorConstant.isSessionInvalid(str) || StringUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                                Toast.makeText(h.a(h.this), h.c(h.this), 0).show();
                            } else if (odg.o().a()) {
                                Toast.makeText(h.a(h.this), odg.o().a(R.string.tt_detail_collet_failed), 0).show();
                            } else {
                                Toast.makeText(h.a(h.this), str2, 0).show();
                            }
                            h.a(h.this, a2, b, false);
                            HashMap hashMap = new HashMap();
                            hashMap.put("errorCode", str);
                            hashMap.put("errorMsg", str2);
                            hashMap.put("itemId", string);
                            com.taobao.android.detail.ttdetail.utils.ae.a(hashMap, -100012, "添加收藏失败");
                        }
                    });
                }
                final Item item = (Item) h.d(h.this).a().a(Item.class);
                com.taobao.android.detail.ttdetail.communication.c.a(h.a(h.this), new com.taobao.android.detail.ttdetail.bizmessage.h("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor$1$3
                    {
                        put("eventId", "2101");
                        put("arg1", (Object) (z ? "Page_Detail_Button-CancelFavorite" : "Page_Detail_Button-AddToFavorite"));
                        put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor$1$3.1
                            {
                                put("spm", (Object) (z ? "a2141.7631564.cancelfavorite" : "a2141.7631564.addtofavorite"));
                                put("categoryId", (Object) com.taobao.android.detail.ttdetail.utils.d.c(item, ""));
                                put("rootCategoryId", (Object) com.taobao.android.detail.ttdetail.utils.d.e(item, ""));
                            }
                        });
                    }
                }, new RuntimeAbilityParam[0]));
            }

            @Override // tb.odg.i
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                Toast.makeText(h.a(h.this), str2, 0).show();
                com.taobao.android.detail.ttdetail.utils.i.a("CollectorImplementor", "queryCollect failed with errCode: " + str + " errMsg: " + str2 + ", for item: " + string);
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", str);
                hashMap.put("errorMsg", str2);
                hashMap.put("itemId", string);
                com.taobao.android.detail.ttdetail.utils.ae.a(hashMap, -100019, "查询收藏失败");
            }
        });
        return true;
    }

    private void a(final com.taobao.android.detail.ttdetail.component.module.d dVar, final JSONObject jSONObject, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99449157", new Object[]{this, dVar, jSONObject, new Boolean(z)});
        } else {
            bf.a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.h.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    boolean a2 = com.taobao.android.detail.ttdetail.utils.v.a(dVar, z);
                    if (!a2) {
                        a2 = com.taobao.android.detail.ttdetail.utils.v.a(dVar, jSONObject, z);
                    }
                    if (!a2) {
                        return;
                    }
                    h.d(h.this).b().a(new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.h.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                dVar.updateComponent();
                            }
                        }
                    });
                }
            });
        }
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        Object obj = jSONObject.get("ignoreCollectCategory");
        return ((obj instanceof String) && "true".equals(obj)) || odg.o().a();
    }

    private void a(final String str, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ccdee4", new Object[]{this, str, runtimeAbilityParamArr});
            return;
        }
        View b = com.taobao.android.detail.ttdetail.utils.a.b(runtimeAbilityParamArr);
        if (b == null) {
            return;
        }
        int[] iArr = new int[2];
        b.getLocationOnScreen(iArr);
        odg.k().a(str, iArr[0] + (b.getWidth() / 2), iArr[1], new odg.l() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.h.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.odg.l
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                String str2 = (map == null || !(map.get(aw.PARAM_ACTIVITY_URL) instanceof String)) ? "" : (String) map.get(aw.PARAM_ACTIVITY_URL);
                if (StringUtils.isEmpty(str2)) {
                    return;
                }
                if ((h.a(h.this) instanceof Activity) && !((Activity) h.a(h.this)).hasWindowFocus()) {
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.l.a(h.a(h.this), str2);
            }

            @Override // tb.odg.l
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                com.taobao.android.detail.ttdetail.utils.i.a("CollectorImplementor", "showCollectCategory failed with errCode: " + str2 + " errMsg: " + str3 + ", for item: " + str);
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", str2);
                hashMap.put("errorMsg", str3);
                hashMap.put("itemId", str);
                com.taobao.android.detail.ttdetail.utils.ae.a(hashMap, -100014, "收藏列表显示异常");
            }
        });
    }
}
