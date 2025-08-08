package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.h;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.ItemSortInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.SortRule;
import com.taobao.taolive.sdk.utils.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public class hjm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int REQUEST_ITEM_NUM = 10;

    /* renamed from: a  reason: collision with root package name */
    private List<ItemIdentifier> f28701a = new ArrayList();
    private List<ItemIdentifier> b = new ArrayList();
    private List<SortRule> c = new ArrayList();
    private long d = -1;
    private c e;

    static {
        kge.a(-1267697995);
    }

    public hjm(c cVar) {
        this.e = cVar;
    }

    public List<ItemIdentifier> a(ItemSortInfo itemSortInfo, ItemSortInfo itemSortInfo2, boolean z, boolean z2) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f5c454a9", new Object[]{this, itemSortInfo, itemSortInfo2, new Boolean(z), new Boolean(z2)});
        }
        List<ItemIdentifier> list = null;
        if (z2 && (cVar = this.e) != null && cVar.x() != null) {
            list = this.e.x().a();
        }
        if ((list == null || list.isEmpty()) && itemSortInfo2 != null && itemSortInfo2.sortList != null && !itemSortInfo2.sortList.isEmpty() && this.e.x() != null) {
            this.e.x().a(itemSortInfo2.sortList);
        }
        if (itemSortInfo == null || itemSortInfo.sortList == null || itemSortInfo.sortTime <= this.d) {
            a(z2);
            return this.f28701a;
        }
        this.d = itemSortInfo.sortTime;
        this.b = itemSortInfo.sortList;
        if (!z) {
            this.c = itemSortInfo.customRules;
        }
        a(z2);
        a();
        if (z2) {
            this.e.G = this.f28701a;
        }
        return this.f28701a;
    }

    public List<ItemIdentifier> a(ItemSortInfo itemSortInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1939c1e4", new Object[]{this, itemSortInfo});
        }
        if (itemSortInfo == null || itemSortInfo.currentItemSort == null) {
            return this.f28701a;
        }
        a(this.f28701a, itemSortInfo.currentItemSort);
        return this.f28701a;
    }

    public void a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (this.f28701a == null) {
        } else {
            ItemIdentifier itemIdentifier = new ItemIdentifier();
            itemIdentifier.goodsIndex = i;
            itemIdentifier.itemId = str;
            this.f28701a.add(0, itemIdentifier);
            a();
        }
    }

    private void a(boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f28701a = new ArrayList();
        List<ItemIdentifier> list = this.b;
        if (list != null && !list.isEmpty()) {
            this.f28701a.addAll(this.b);
        }
        if (!z) {
            return;
        }
        List<ItemIdentifier> list2 = null;
        c cVar = this.e;
        if (cVar != null && cVar.x() != null) {
            list2 = this.e.x().a();
        }
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterator<ItemIdentifier> it = list2.iterator();
        while (it.hasNext()) {
            ItemIdentifier next = it.next();
            Iterator<ItemIdentifier> it2 = this.f28701a.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                } else if (StringUtils.equals(next.itemId, it2.next().itemId)) {
                    z2 = true;
                    break;
                }
            }
            if (z2) {
                it.remove();
            }
        }
        this.f28701a.addAll(list2);
    }

    private void a() {
        List<SortRule> list;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (a.x()) {
            c();
        } else if (!this.f28701a.isEmpty() && (list = this.c) != null && !list.isEmpty()) {
            int size = this.f28701a.size();
            ItemIdentifier[] itemIdentifierArr = new ItemIdentifier[size];
            for (SortRule sortRule : this.c) {
                if (sortRule != null && sortRule.pos <= size && sortRule.pos > 0) {
                    itemIdentifierArr[sortRule.pos - 1] = new ItemIdentifier(sortRule.goodsIndex, sortRule.itemId);
                }
            }
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ItemIdentifier itemIdentifier = this.f28701a.get(i2);
                if (itemIdentifier != null) {
                    for (int i3 = 0; i3 < this.c.size(); i3++) {
                        SortRule sortRule2 = this.c.get(i3);
                        if (itemIdentifier.equals(sortRule2.goodsIndex, sortRule2.itemId)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (itemIdentifierArr[i] == null) {
                            itemIdentifierArr[i] = itemIdentifier;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            this.f28701a = Arrays.asList(itemIdentifierArr);
        }
    }

    private void c() {
        List<SortRule> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f28701a.isEmpty() && (list = this.c) != null && !list.isEmpty()) {
            a(this.c, this.f28701a);
            ArrayList arrayList = new ArrayList(this.f28701a);
            for (int i = 0; i < this.c.size(); i++) {
                SortRule sortRule = this.c.get(i);
                if (sortRule != null && sortRule.pos > 0) {
                    ItemIdentifier itemIdentifier = new ItemIdentifier(sortRule.goodsIndex, sortRule.itemId);
                    itemIdentifier.type = l.a(sortRule.type);
                    if (sortRule.pos <= arrayList.size()) {
                        arrayList.add(sortRule.pos - 1, itemIdentifier);
                    } else {
                        arrayList.add(itemIdentifier);
                    }
                }
            }
            this.f28701a = arrayList;
        }
    }

    private void a(List<SortRule> list, List<ItemIdentifier> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
        } else if (list2 == null || list2.isEmpty() || list == null || list.isEmpty()) {
        } else {
            Iterator<SortRule> it = list.iterator();
            while (it.hasNext()) {
                SortRule next = it.next();
                if (a(list2, next.itemId) >= 0 && (StringUtils.equals(next.type, "2") || StringUtils.equals(next.type, "3"))) {
                    it.remove();
                }
            }
        }
    }

    public List<ItemIdentifier> a(List<e> list, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c887f03d", new Object[]{this, list, new Integer(i)});
        }
        List<ItemIdentifier> list2 = this.f28701a;
        if (list2 == null || list2.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = -1;
        while (i < this.f28701a.size()) {
            ItemIdentifier itemIdentifier = this.f28701a.get(i);
            if (itemIdentifier == null) {
                i2 = i;
            } else {
                if (list != null && !list.isEmpty()) {
                    for (e eVar : list) {
                        if (eVar != null && eVar.b == itemIdentifier.goodsIndex && StringUtils.equals(eVar.f, itemIdentifier.itemId)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z) {
                    arrayList.add(itemIdentifier);
                    if (arrayList.size() >= 10) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            i++;
        }
        if (i2 >= 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("errorIndex", "" + i2);
            hashMap.put("totalSize", "" + this.f28701a.size());
            hit.a((c) null, "generatorNexRequestList", hashMap);
        }
        return arrayList;
    }

    public List<ItemIdentifier> b(List<e> list, int i) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc2fc3be", new Object[]{this, list, new Integer(i)});
        }
        if (i <= 0 || list == null || list.isEmpty()) {
            return null;
        }
        e eVar = list.get(list.size() - 1);
        if (eVar == null) {
            his.b("GoodListDataSorter", "topGoodsCompensate, lastProduct empty.");
            return null;
        }
        int a2 = a(this.f28701a, eVar.b, eVar.f);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f28701a.size() && i2 <= a2; i2++) {
            ItemIdentifier itemIdentifier = this.f28701a.get(i2);
            Iterator<e> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                e next = it.next();
                if (next != null && next.b == itemIdentifier.goodsIndex && StringUtils.equals(next.f, itemIdentifier.itemId)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(itemIdentifier);
            }
            if (arrayList.size() >= i) {
                return arrayList;
            }
        }
        return arrayList;
    }

    public List<ItemIdentifier> c(List<e> list, int i) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efd7973f", new Object[]{this, list, new Integer(i)});
        }
        if (list == null || this.f28701a == null || list.isEmpty() || this.f28701a.isEmpty() || i >= list.size() - 1) {
            return null;
        }
        long a2 = hiq.a();
        ArrayList arrayList = new ArrayList();
        while (i < list.size()) {
            if ((10 == i2 && arrayList.isEmpty()) || arrayList.size() >= 10) {
                return arrayList;
            }
            e eVar = list.get(i);
            if (eVar != null && !hjn.a(eVar.f13845a) && !eVar.g && eVar.d > 0 && a2 > eVar.d && !eVar.e) {
                arrayList.add(new ItemIdentifier(eVar.b, eVar.f));
                eVar.e = true;
            }
            i++;
            i2++;
        }
        return arrayList;
    }

    public List<ItemIdentifier> d(List<e> list, int i) {
        e eVar;
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("37f6ac0", new Object[]{this, list, new Integer(i)});
        }
        if (list == null || this.f28701a == null || list.isEmpty() || this.f28701a.isEmpty()) {
            return null;
        }
        long a2 = hiq.a();
        ArrayList arrayList = new ArrayList();
        while (i >= 0) {
            if ((10 == i2 && arrayList.isEmpty()) || arrayList.size() >= 10) {
                return arrayList;
            }
            if (list.size() > i && (eVar = list.get(i)) != null && !hjn.a(eVar.f13845a) && !eVar.g && eVar.d > 0 && a2 > eVar.d && !eVar.e) {
                arrayList.add(new ItemIdentifier(eVar.b, eVar.f));
                eVar.e = true;
            }
            i--;
            i2++;
        }
        return arrayList;
    }

    public boolean a(List<e> list) {
        List<ItemIdentifier> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (list != null && !list.isEmpty() && (list2 = this.f28701a) != null && !list2.isEmpty()) {
            hjn hjnVar = new hjn(this.f28701a);
            e eVar = null;
            int i = 0;
            while (i < list.size()) {
                e eVar2 = list.get(i);
                if (eVar != null && hjnVar.a(eVar2, eVar) < 0) {
                    return false;
                }
                i++;
                eVar = eVar2;
            }
        }
        return true;
    }

    public void b(List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else if (list == null || list.isEmpty() || this.f28701a.isEmpty()) {
        } else {
            Collections.sort(list, new hjn(this.f28701a));
        }
    }

    public void a(ItemCategory itemCategory, List<com.taobao.taolive.sdk.goodlist.a> list, boolean z, boolean z2, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("150a52b", new Object[]{this, itemCategory, list, new Boolean(z), new Boolean(z2), hVar});
        } else if (list != null && !list.isEmpty() && hVar != null) {
            for (com.taobao.taolive.sdk.goodlist.a aVar : list) {
                if (aVar != null) {
                    a(itemCategory, aVar, false, z, z2, hVar);
                }
            }
        }
    }

    public boolean a(ItemCategory itemCategory, com.taobao.taolive.sdk.goodlist.a aVar, boolean z, boolean z2, boolean z3, h hVar) {
        List<e> a2;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dde0fb77", new Object[]{this, itemCategory, aVar, new Boolean(z), new Boolean(z2), new Boolean(z3), hVar})).booleanValue();
        }
        if (aVar == null || hVar == null || (a2 = hVar.getAdapter().a()) == null) {
            return false;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            e eVar = a2.get(i2);
            if (eVar != null && aVar.c == eVar.b && StringUtils.equals(aVar.e, eVar.f)) {
                if (z3) {
                    a(this.e.a(itemCategory, eVar), aVar);
                }
                eVar.a(aVar);
                this.e.a(aVar, itemCategory);
                if (z2 && hVar.getAdapter() != null) {
                    his.a("lsfzlj1234", "notifyItemChanged | i=" + i2 + "   goodsIndex=" + aVar.c);
                    hVar.getAdapter().notifyItemChanged(i2);
                }
                return true;
            }
        }
        if (z) {
            return false;
        }
        this.e.a(aVar, itemCategory);
        int size = a2.size();
        if (hjn.a(aVar.f21830a)) {
            i = a(aVar, a2);
        } else {
            i = size;
            int i3 = 0;
            for (int i4 = 0; i4 < a2.size(); i4++) {
                e eVar2 = a2.get(i4);
                if (!hjn.a(eVar2.f13845a)) {
                    while (true) {
                        if (i3 >= this.f28701a.size()) {
                            break;
                        }
                        ItemIdentifier itemIdentifier = this.f28701a.get(i3);
                        i3++;
                        if (itemIdentifier.equals(aVar.c, aVar.e)) {
                            i = i4;
                            break;
                        } else if (itemIdentifier.equals(eVar2.b, eVar2.f)) {
                            break;
                        }
                    }
                    if (i != a2.size()) {
                        break;
                    }
                }
            }
        }
        a2.add(i, hiq.b(aVar));
        if (i == 0) {
            hVar.getAdapter().notifyDataSetChanged();
            return false;
        }
        if (z2 && hVar.getAdapter() != null) {
            hVar.getAdapter().notifyItemInserted(i);
        }
        return false;
    }

    private int a(com.taobao.taolive.sdk.goodlist.a aVar, List<e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("610fc987", new Object[]{this, aVar, list})).intValue();
        }
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (aVar.c > list.get(i).b) {
                return i;
            }
        }
        return size;
    }

    public static int a(List<ItemIdentifier> list, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f121c007", new Object[]{list, new Integer(i), str})).intValue();
        }
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ItemIdentifier itemIdentifier = list.get(i2);
                if (itemIdentifier != null && itemIdentifier.equals(i, str)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static int a(List<ItemIdentifier> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3c6e0ed6", new Object[]{list, str})).intValue();
        }
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                ItemIdentifier itemIdentifier = list.get(i);
                if (itemIdentifier != null && StringUtils.equals(itemIdentifier.itemId, str)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int a(List<ItemIdentifier> list, ItemIdentifier itemIdentifier) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cd8104a", new Object[]{list, itemIdentifier})).intValue();
        }
        if (itemIdentifier == null) {
            return -1;
        }
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            ItemIdentifier itemIdentifier2 = list.get(i);
            if (!itemIdentifier2.equals(itemIdentifier.goodsIndex, itemIdentifier.itemId)) {
                i++;
            } else if (itemIdentifier2.priority == itemIdentifier.priority) {
                return i;
            }
        }
        list.remove(itemIdentifier);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2).priority >= itemIdentifier.priority) {
                list.add(i2, itemIdentifier);
                return i2;
            }
        }
        list.add(itemIdentifier);
        return list.size() - 1;
    }

    private static void a(com.taobao.taolive.sdk.goodlist.a aVar, com.taobao.taolive.sdk.goodlist.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9faaa88", new Object[]{aVar, aVar2});
        } else if (aVar == null || aVar2 == null || aVar.b == null || aVar2.b == null) {
        } else {
            if (aVar.b.getJSONObject("personalityData") != null) {
                aVar2.b.put("personalityData", (Object) aVar.b.getJSONObject("personalityData"));
            }
            JSONObject jSONObject = aVar.b.getJSONObject("itemExtData");
            JSONObject jSONObject2 = aVar2.b.getJSONObject("itemExtData");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
                aVar2.b.put("itemExtData", (Object) jSONObject2);
            }
            if (jSONObject == null) {
                jSONObject2.remove("subscribeStatus");
            } else {
                jSONObject2.put("subscribeStatus", (Object) jSONObject.getString("subscribeStatus"));
            }
        }
    }

    public static void a(com.taobao.taolive.sdk.goodlist.a aVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c7bef7e", new Object[]{aVar, liveItem});
            return;
        }
        if (liveItem != null) {
            if (liveItem.nativeConfigInfos == null) {
                liveItem.nativeConfigInfos = new JSONObject();
            }
            liveItem.nativeConfigInfos.put("dataScene", (Object) "pm");
        }
        if (aVar == null || liveItem == null || aVar.b == null) {
            return;
        }
        JSONObject jSONObject = aVar.b.getJSONObject("personalityData");
        if (jSONObject != null) {
            liveItem.personalityData = jSONObject;
        }
        JSONObject jSONObject2 = aVar.b.getJSONObject("itemExtData");
        if (liveItem.itemExtData == null) {
            liveItem.itemExtData = new JSONObject();
        }
        if (jSONObject2 == null) {
            liveItem.itemExtData.remove("subscribeStatus");
            return;
        }
        if (liveItem.itemExtData.isEmpty()) {
            liveItem.itemExtData = jSONObject2;
        }
        liveItem.itemExtData.put("subscribeStatus", (Object) jSONObject2.getString("subscribeStatus"));
    }

    public List<ItemIdentifier> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("4a17df3e", new Object[]{this}) : this.b;
    }
}
