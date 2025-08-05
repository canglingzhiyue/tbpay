package tb;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteResultData;
import com.taobao.android.abilityidl.ability.bo;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dwy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_DETAIL = "detail3";
    public static final String KEY_DETAIL_COLLECTED = "collected";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27051a;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void a(String str, String str2);
    }

    /* loaded from: classes4.dex */
    public interface b {
        void a();

        void a(String str, String str2);
    }

    /* loaded from: classes4.dex */
    public interface c {
        void a(String str, String str2);

        void a(boolean z);
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(String str);

        void a(String str, String str2);
    }

    static {
        kge.a(-1157961414);
        f27051a = false;
        emu.a("com.taobao.android.detail.core.aura.extension.event.collect.AliDetailCollectHelper");
    }

    public static void b(String str, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1cd67e", new Object[]{str, cVar});
        } else {
            com.taobao.android.msoa.c.a().a(dwz.a("taobao_detail", str), new MSOAServiceListener() { // from class: tb.dwy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !(map.get("isFavorite") instanceof Boolean)) {
                        c cVar2 = c.this;
                        if (cVar2 == null) {
                            return;
                        }
                        cVar2.a("query collect failed", "invalid result");
                    } else {
                        boolean booleanValue = ((Boolean) map.get("isFavorite")).booleanValue();
                        c cVar3 = c.this;
                        if (cVar3 == null) {
                            return;
                        }
                        cVar3.a(booleanValue);
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                        return;
                    }
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "unknown";
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "unknown";
                    }
                    cVar2.a(str2, str3);
                }
            });
        }
    }

    public static void a(String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4431bf", new Object[]{str, aVar});
        } else {
            com.taobao.android.msoa.c.a().a(dwz.b("taobao_detail", str), new MSOAServiceListener() { // from class: tb.dwy.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !(map.get("addResult") instanceof Boolean) || !((Boolean) map.get("addResult")).booleanValue()) {
                        a aVar2 = a.this;
                        if (aVar2 == null) {
                            return;
                        }
                        aVar2.a("add collect failed", "invalid result");
                    } else {
                        a aVar3 = a.this;
                        if (aVar3 == null) {
                            return;
                        }
                        aVar3.a();
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                    } else if (a.this == null) {
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "unknown";
                        }
                        if (TextUtils.isEmpty(str3) || !z) {
                            str3 = dwy.a();
                        }
                        a.this.a(str2, str3);
                    }
                }
            });
        }
    }

    public static void b(String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc1c621f", new Object[]{str, bVar});
        } else {
            com.taobao.android.msoa.c.a().a(dwz.c("taobao_detail", str), new MSOAServiceListener() { // from class: tb.dwy.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !(map.get("deleteResult") instanceof Boolean) || !((Boolean) map.get("deleteResult")).booleanValue()) {
                        b bVar2 = b.this;
                        if (bVar2 == null) {
                            return;
                        }
                        bVar2.a("cancel collect failed", "invalid result");
                    } else {
                        b bVar3 = b.this;
                        if (bVar3 == null) {
                            return;
                        }
                        bVar3.a();
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                    } else if (b.this == null) {
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "unknown";
                        }
                        if (TextUtils.isEmpty(str3) || !z) {
                            str3 = dwy.a();
                        }
                        b.this.a(str2, str3);
                    }
                }
            });
        }
    }

    public static void a(String str, int i, int i2, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bde852bc", new Object[]{str, new Integer(i), new Integer(i2), dVar});
        } else {
            com.taobao.android.msoa.c.a().a(dwz.a("taobao_detail", str, i, i2), new MSOAServiceListener() { // from class: tb.dwy.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        return;
                    }
                    d dVar2 = d.this;
                    if (dVar2 == null) {
                        return;
                    }
                    dVar2.a((map == null || !(map.get(aw.PARAM_ACTIVITY_URL) instanceof String)) ? "" : (String) map.get(aw.PARAM_ACTIVITY_URL));
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                    } else {
                        d.this.a(str2, str3);
                    }
                }
            });
        }
    }

    public static com.alibaba.android.umf.datamodel.service.rule.a a(boolean z, AURARenderComponent aURARenderComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.umf.datamodel.service.rule.a) ipChange.ipc$dispatch("871cec8a", new Object[]{new Boolean(z), aURARenderComponent, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject.getJSONArray("kvmap") != null) {
            hashMap.put("kvmap", jSONObject.getJSONArray("kvmap"));
        }
        if (z && jSONObject.getJSONObject(KEY_DETAIL_COLLECTED) != null) {
            hashMap.put("data", jSONObject.getJSONObject(KEY_DETAIL_COLLECTED));
        } else if (!z && jSONObject.getJSONObject("uncollected") != null) {
            hashMap.put("data", jSONObject.getJSONObject("uncollected"));
        }
        return bbg.a("kvmap", aURARenderComponent, hashMap);
    }

    public static void a(String str, Map<String, String> map, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33686560", new Object[]{str, map, aVar});
        } else {
            dwz.a(str, map, new bo() { // from class: tb.dwy.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.abilityidl.ability.bo
                public void a(FavoriteResultData favoriteResultData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cf30d1a", new Object[]{this, favoriteResultData});
                        return;
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a();
                }

                @Override // tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        return;
                    }
                    a aVar2 = a.this;
                    if (aVar2 == null) {
                        return;
                    }
                    String str2 = "unknown";
                    if (errorResult == null) {
                        aVar2.a(str2, dwy.a());
                        return;
                    }
                    if (!TextUtils.isEmpty(errorResult.a())) {
                        str2 = errorResult.a();
                    }
                    a.this.a(str2, TextUtils.isEmpty(errorResult.b()) ? dwy.a() : errorResult.b());
                }
            });
        }
    }

    public static void c(String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f41e20", new Object[]{str, bVar});
        } else {
            dwz.a(str, new bo() { // from class: tb.dwy.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.abilityidl.ability.bo
                public void a(FavoriteResultData favoriteResultData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cf30d1a", new Object[]{this, favoriteResultData});
                        return;
                    }
                    b bVar2 = b.this;
                    if (bVar2 == null) {
                        return;
                    }
                    bVar2.a();
                }

                @Override // tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        return;
                    }
                    b bVar2 = b.this;
                    if (bVar2 == null) {
                        return;
                    }
                    String str2 = "unknown";
                    if (errorResult == null) {
                        bVar2.a(str2, dwy.a());
                        return;
                    }
                    if (!TextUtils.isEmpty(errorResult.a())) {
                        str2 = errorResult.a();
                    }
                    b.this.a(str2, TextUtils.isEmpty(errorResult.b()) ? dwy.a() : errorResult.b());
                }
            });
        }
    }

    public static void c(String str, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f4927f", new Object[]{str, cVar});
        } else {
            dwz.b(str, new bo() { // from class: tb.dwy.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.abilityidl.ability.bo
                public void a(FavoriteResultData favoriteResultData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cf30d1a", new Object[]{this, favoriteResultData});
                        return;
                    }
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(favoriteResultData.favorite.booleanValue());
                }

                @Override // tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        return;
                    }
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    String str2 = "unknown";
                    if (errorResult == null) {
                        cVar2.a(str2, dwy.a());
                        return;
                    }
                    if (!TextUtils.isEmpty(errorResult.a())) {
                        str2 = errorResult.a();
                    }
                    c.this.a(str2, TextUtils.isEmpty(errorResult.b()) ? dwy.a() : errorResult.b());
                }
            });
        }
    }

    public static void b(String str, Map<String, String> map, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d33073f", new Object[]{str, map, aVar});
        } else if (god.w) {
            a(str, map, aVar);
        } else {
            a(str, aVar);
        }
    }

    public static void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e44a61e", new Object[]{str, bVar});
        } else if (god.w) {
            c(str, bVar);
        } else {
            b(str, bVar);
        }
    }

    public static void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e451a7d", new Object[]{str, cVar});
        } else if (god.w) {
            c(str, cVar);
        } else {
            b(str, cVar);
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : com.alibaba.ability.localization.b.a(R.string.taodetail_server_busy);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!f27051a && mra.a("taobao_favorite_aar")) {
            f27051a = true;
        }
        return f27051a;
    }
}
