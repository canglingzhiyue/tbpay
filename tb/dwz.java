package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.am;
import com.taobao.android.abilityidl.ability.bo;
import com.taobao.android.msoa.annotation.MSOAServiceInvoke;
import com.taobao.android.msoa.h;
import com.taobao.favorite.export.FavoriteFacade;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class dwz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ITEM_ID = "itemId";
    public static final String KEY_X = "x";
    public static final String KEY_Y = "y";
    public static final String MSOA_SCENE = "taobao_detail";

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.addFavoriteItem")
    /* loaded from: classes4.dex */
    public static class a extends h {
        static {
            kge.a(2102918909);
        }

        public a(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.deleteFavoriteItem")
    /* loaded from: classes4.dex */
    public static class b extends h {
        static {
            kge.a(1952360904);
        }

        public b(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.isFavoriteItem")
    /* loaded from: classes4.dex */
    public static class c extends h {
        static {
            kge.a(-645780188);
        }

        public c(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    @MSOAServiceInvoke(bizName = "msoa.taobao.detail", serviceId = "msoa.taobao.favorite.showCategoryList")
    /* loaded from: classes4.dex */
    public static class d extends h {
        static {
            kge.a(-656375123);
        }

        public d(String str, Map<String, Object> map) {
            super(str, map);
        }
    }

    static {
        kge.a(-845152645);
        emu.a("com.taobao.android.detail.core.aura.extension.event.collect.AliDetailMSOAUtils");
    }

    public static h a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("d6d80909", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new c(str, hashMap);
    }

    public static h b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("b29984ca", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new a(str, hashMap);
    }

    public static h c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("8e5b008b", new Object[]{str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str2);
        return new b(str, hashMap);
    }

    public static h a(String str, String str2, int i, int i2) {
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

    public static void a(String str, Map<String, String> map, bo boVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d13edbb", new Object[]{str, map, boVar});
        } else if (!dwy.b()) {
            boVar.a(new ErrorResult("code not download", dwy.a()));
        } else {
            am amVar = new am();
            amVar.f8784a = str;
            amVar.b = "ITEM";
            amVar.c = map;
            FavoriteFacade.addFavoriteItem(amVar, boVar);
        }
    }

    public static void a(String str, bo boVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce7e1a", new Object[]{str, boVar});
        } else if (!dwy.b()) {
            boVar.a(new ErrorResult("code not download", dwy.a()));
        } else {
            am amVar = new am();
            amVar.f8784a = str;
            amVar.b = "ITEM";
            FavoriteFacade.removeFavorite(amVar, boVar);
        }
    }

    public static void b(String str, bo boVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568df61b", new Object[]{str, boVar});
        } else if (!dwy.b()) {
            boVar.a(new ErrorResult("code not download", dwy.a()));
        } else {
            am amVar = new am();
            amVar.f8784a = str;
            amVar.b = "ITEM";
            FavoriteFacade.requestFavoriteStatus(amVar, boVar);
        }
    }
}
