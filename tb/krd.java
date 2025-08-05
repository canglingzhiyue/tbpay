package tb;

import android.text.TextUtils;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteResultData;
import com.taobao.android.abilityidl.ability.am;
import com.taobao.android.abilityidl.ability.bo;
import com.taobao.android.detail.ttdetail.utils.bf;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import com.taobao.android.msoa.h;
import com.taobao.favorite.export.FavoriteFacade;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.odg;

/* loaded from: classes4.dex */
public class krd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ITEM_ID = "itemId";
    public static final String KEY_X = "x";
    public static final String KEY_Y = "y";
    public static final String MSOA_SCENE_NAME = "taobao_detail";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Boolean> f30251a;
    private static boolean b;

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.addFavoriteItem")
    /* loaded from: classes4.dex */
    public static class a extends h {
        static {
            kge.a(91114572);
        }

        public a(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.deleteFavoriteItem")
    /* loaded from: classes4.dex */
    public static class b extends h {
        static {
            kge.a(263005721);
        }

        public b(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.isFavoriteItem")
    /* loaded from: classes4.dex */
    public static class c extends h {
        static {
            kge.a(-1254464845);
        }

        public c(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.showCategoryList")
    /* loaded from: classes4.dex */
    public static class d extends h {
        static {
            kge.a(190142652);
        }

        public d(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    public static /* synthetic */ void a(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86f9e1db", new Object[]{str, bool});
        } else {
            b(str, bool);
        }
    }

    public static /* synthetic */ void b(String str, odg.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36fedd4c", new Object[]{str, iVar});
        } else {
            d(str, iVar);
        }
    }

    static {
        kge.a(-1018605174);
        f30251a = new HashMap(0);
        b = false;
    }

    private static h a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("d6d80909", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new c(str, hashMap);
    }

    private static void c(final String str, final odg.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d6994d", new Object[]{str, iVar});
        } else {
            bf.a(new Runnable() { // from class: tb.krd.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        krd.b(str, iVar);
                    }
                }
            });
        }
    }

    private static void d(String str, final odg.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ae554e", new Object[]{str, iVar});
        } else {
            com.taobao.android.msoa.c.a().a(a("taobao_detail", str), new MSOAServiceListener() { // from class: tb.krd.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !(map.get("isFavorite") instanceof Boolean)) {
                        odg.i iVar2 = odg.i.this;
                        if (iVar2 == null) {
                            return;
                        }
                        iVar2.a("query collect failed", "invalid result");
                    } else {
                        boolean booleanValue = ((Boolean) map.get("isFavorite")).booleanValue();
                        odg.i iVar3 = odg.i.this;
                        if (iVar3 == null) {
                            return;
                        }
                        iVar3.a(booleanValue);
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                        return;
                    }
                    odg.i iVar2 = odg.i.this;
                    if (iVar2 == null) {
                        return;
                    }
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "unknown";
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "unknown";
                    }
                    iVar2.a(str2, str3);
                }
            });
        }
    }

    private static h b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("b29984ca", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new b(str, hashMap);
    }

    private static void b(String str, final odg.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36fdf48e", new Object[]{str, gVar});
        } else {
            com.taobao.android.msoa.c.a().a(b("taobao_detail", str), new MSOAServiceListener() { // from class: tb.krd.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !(map.get("deleteResult") instanceof Boolean) || !((Boolean) map.get("deleteResult")).booleanValue()) {
                        odg.g gVar2 = odg.g.this;
                        if (gVar2 == null) {
                            return;
                        }
                        gVar2.a("cancel collect failed", "invalid result");
                    } else {
                        odg.g gVar3 = odg.g.this;
                        if (gVar3 == null) {
                            return;
                        }
                        gVar3.a();
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                    } else if (odg.g.this == null) {
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "unknown";
                        }
                        if (TextUtils.isEmpty(str3) || !z) {
                            str3 = krd.a();
                        }
                        odg.g.this.a(str2, str3);
                    }
                }
            });
        }
    }

    private static h c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("8e5b008b", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new a(str, hashMap);
    }

    private static void c(String str, final odg.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4d5b08f", new Object[]{str, gVar});
        } else {
            com.taobao.android.msoa.c.a().a(c("taobao_detail", str), new MSOAServiceListener() { // from class: tb.krd.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                    } else if (map == null || !(map.get("addResult") instanceof Boolean) || !((Boolean) map.get("addResult")).booleanValue()) {
                        odg.g gVar2 = odg.g.this;
                        if (gVar2 == null) {
                            return;
                        }
                        gVar2.a("add collect failed", "invalid result");
                    } else {
                        odg.g gVar3 = odg.g.this;
                        if (gVar3 == null) {
                            return;
                        }
                        gVar3.a();
                    }
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                    } else if (odg.g.this == null) {
                    } else {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = "unknown";
                        }
                        if (TextUtils.isEmpty(str3) || !z) {
                            str3 = krd.a();
                        }
                        odg.g.this.a(str2, str3);
                    }
                }
            });
        }
    }

    private static h a(String str, String str2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("7e640269", new Object[]{str, str2, new Integer(i), new Integer(i2)});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        hashMap.put("x", Integer.valueOf(i));
        hashMap.put("y", Integer.valueOf(i2));
        return new d(str, hashMap);
    }

    public static void a(String str, int i, int i2, final odg.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cb4248", new Object[]{str, new Integer(i), new Integer(i2), lVar});
        } else {
            com.taobao.android.msoa.c.a().a(a("taobao_detail", str, i, i2), new MSOAServiceListener() { // from class: tb.krd.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onSuccess(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("93e51c7a", new Object[]{this, map});
                        return;
                    }
                    odg.l lVar2 = odg.l.this;
                    if (lVar2 == null) {
                        return;
                    }
                    lVar2.a(map);
                }

                @Override // com.taobao.android.msoa.callback.MSOAServiceListener
                public void onFail(String str2, String str3, boolean z, Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("684c28e9", new Object[]{this, str2, str3, new Boolean(z), map});
                    } else {
                        odg.l.this.a(str2, str3);
                    }
                }
            });
        }
    }

    private static void a(String str, Map<String, String> map, bo boVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d13edbb", new Object[]{str, map, boVar});
        } else if (!b()) {
            boVar.a(new ErrorResult("code not download", a()));
        } else {
            am amVar = new am();
            amVar.f8784a = str;
            amVar.b = "ITEM";
            amVar.c = map;
            FavoriteFacade.addFavoriteItem(amVar, boVar);
        }
    }

    private static void a(String str, bo boVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce7e1a", new Object[]{str, boVar});
        } else if (!b()) {
            boVar.a(new ErrorResult("code not download", a()));
        } else {
            am amVar = new am();
            amVar.f8784a = str;
            amVar.b = "ITEM";
            FavoriteFacade.removeFavorite(amVar, boVar);
        }
    }

    private static void b(String str, bo boVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568df61b", new Object[]{str, boVar});
        } else if (!b()) {
            boVar.a(new ErrorResult("code not download", a()));
        } else {
            am amVar = new am();
            amVar.f8784a = str;
            amVar.b = "ITEM";
            FavoriteFacade.requestFavoriteStatus(amVar, boVar);
        }
    }

    private static void b(String str, Map<String, String> map, final odg.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8150e0d", new Object[]{str, map, gVar});
        } else {
            a(str, map, new bo() { // from class: tb.krd.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.abilityidl.ability.bo
                public void a(FavoriteResultData favoriteResultData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cf30d1a", new Object[]{this, favoriteResultData});
                        return;
                    }
                    odg.g gVar2 = odg.g.this;
                    if (gVar2 == null) {
                        return;
                    }
                    gVar2.a();
                }

                @Override // tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        return;
                    }
                    odg.g gVar2 = odg.g.this;
                    if (gVar2 == null) {
                        return;
                    }
                    String str2 = "unknown";
                    if (errorResult == null) {
                        gVar2.a(str2, krd.a());
                        return;
                    }
                    if (!TextUtils.isEmpty(errorResult.a())) {
                        str2 = errorResult.a();
                    }
                    odg.g.this.a(str2, TextUtils.isEmpty(errorResult.b()) ? krd.a() : errorResult.b());
                }
            });
        }
    }

    private static void d(String str, final odg.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32ad6c90", new Object[]{str, gVar});
        } else {
            a(str, new bo() { // from class: tb.krd.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.abilityidl.ability.bo
                public void a(FavoriteResultData favoriteResultData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cf30d1a", new Object[]{this, favoriteResultData});
                        return;
                    }
                    odg.g gVar2 = odg.g.this;
                    if (gVar2 == null) {
                        return;
                    }
                    gVar2.a();
                }

                @Override // tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        return;
                    }
                    odg.g gVar2 = odg.g.this;
                    if (gVar2 == null) {
                        return;
                    }
                    String str2 = "unknown";
                    if (errorResult == null) {
                        gVar2.a(str2, krd.a());
                        return;
                    }
                    if (!TextUtils.isEmpty(errorResult.a())) {
                        str2 = errorResult.a();
                    }
                    odg.g.this.a(str2, TextUtils.isEmpty(errorResult.b()) ? krd.a() : errorResult.b());
                }
            });
        }
    }

    private static void e(String str, final odg.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b086114f", new Object[]{str, iVar});
        } else {
            b(str, new bo() { // from class: tb.krd.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.abilityidl.ability.bo
                public void a(FavoriteResultData favoriteResultData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cf30d1a", new Object[]{this, favoriteResultData});
                        return;
                    }
                    odg.i iVar2 = odg.i.this;
                    if (iVar2 == null) {
                        return;
                    }
                    iVar2.a(favoriteResultData.favorite.booleanValue());
                }

                @Override // tb.gml
                public void a(ErrorResult errorResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a5ed5e", new Object[]{this, errorResult});
                        return;
                    }
                    odg.i iVar2 = odg.i.this;
                    if (iVar2 == null) {
                        return;
                    }
                    String str2 = "unknown";
                    if (errorResult == null) {
                        iVar2.a(str2, krd.a());
                        return;
                    }
                    if (!TextUtils.isEmpty(errorResult.a())) {
                        str2 = errorResult.a();
                    }
                    odg.i.this.a(str2, TextUtils.isEmpty(errorResult.b()) ? krd.a() : errorResult.b());
                }
            });
        }
    }

    public static void a(final String str, Map<String, String> map, final odg.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e4a6c2e", new Object[]{str, map, gVar});
            return;
        }
        try {
            odg.g gVar2 = new odg.g() { // from class: tb.krd.19
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.g
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    krd.a(str, (Boolean) true);
                    odg.g gVar3 = gVar;
                    if (gVar3 == null) {
                        return;
                    }
                    gVar3.a();
                }

                @Override // tb.odg.g
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        return;
                    }
                    krd.a(str, (Boolean) null);
                    odg.g gVar3 = gVar;
                    if (gVar3 == null) {
                        return;
                    }
                    gVar3.a(str2, str3);
                }
            };
            if (j.A()) {
                b(str, map, gVar2);
            } else {
                c(str, gVar2);
            }
        } catch (Throwable th) {
            i.a("TaobaoCollectionHelper", "addCollect exception", th);
        }
    }

    public static void a(final String str, final odg.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b926388d", new Object[]{str, gVar});
            return;
        }
        try {
            odg.g gVar2 = new odg.g() { // from class: tb.krd.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.g
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    krd.a(str, (Boolean) false);
                    odg.g gVar3 = gVar;
                    if (gVar3 == null) {
                        return;
                    }
                    gVar3.a();
                }

                @Override // tb.odg.g
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        return;
                    }
                    krd.a(str, (Boolean) null);
                    odg.g gVar3 = gVar;
                    if (gVar3 == null) {
                        return;
                    }
                    gVar3.a(str2, str3);
                }
            };
            if (j.A()) {
                d(str, gVar2);
            } else {
                b(str, gVar2);
            }
        } catch (Throwable th) {
            i.a("TaobaoCollectionHelper", "cancelCollect exception", th);
        }
    }

    public static void a(final String str, final odg.i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b927214b", new Object[]{str, iVar});
            return;
        }
        if (iVar == null) {
            try {
                b(str, (Boolean) null);
            } catch (Throwable th) {
                i.a("TaobaoCollectionHelper", "queryCollect exception", th);
                return;
            }
        }
        Boolean a2 = a(str);
        if (a2 != null) {
            if (iVar == null) {
                return;
            }
            iVar.a(a2.booleanValue());
            return;
        }
        odg.i iVar2 = new odg.i() { // from class: tb.krd.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.odg.i
            public void a(boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                    return;
                }
                krd.a(str, Boolean.valueOf(z));
                odg.i iVar3 = iVar;
                if (iVar3 == null) {
                    return;
                }
                iVar3.a(z);
            }

            @Override // tb.odg.i
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                krd.a(str, (Boolean) null);
                odg.i iVar3 = iVar;
                if (iVar3 == null) {
                    return;
                }
                iVar3.a(str2, str3);
            }
        };
        if (j.A()) {
            e(str, iVar2);
        } else {
            c(str, iVar2);
        }
    }

    private static synchronized Boolean a(String str) {
        synchronized (krd.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("410b752f", new Object[]{str});
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                return f30251a.get(str);
            }
        }
    }

    private static synchronized void b(String str, Boolean bool) {
        synchronized (krd.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e5f16fa", new Object[]{str, bool});
            } else if (TextUtils.isEmpty(str)) {
            } else {
                f30251a.put(str, bool);
            }
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : com.alibaba.ability.localization.b.a(R.string.tt_detail_app_busy_system_tired);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (!b) {
            long currentTimeMillis = System.currentTimeMillis();
            if (mqy.a("taobao_favorite_aar")) {
                b = true;
            }
            i.a("favoriteSDKDownload", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
        return b;
    }
}
