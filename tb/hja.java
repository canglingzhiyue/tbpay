package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.GoodListSearchResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.search.d;
import com.taobao.taolive.sdk.goodlist.a;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.l;
import java.util.ArrayList;
import java.util.List;
import tb.hjc;

/* loaded from: classes6.dex */
public class hja<T extends hjc> extends b<T, hjr> implements hjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int e;
    public final int f;
    public int g;
    private boolean h;
    private boolean i;

    static {
        kge.a(-1638563086);
        kge.a(-2120263455);
    }

    public static /* synthetic */ Object ipc$super(hja hjaVar, String str, Object... objArr) {
        if (str.hashCode() == -336626560) {
            super.a((hgw) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public void a(ArrayList<a> arrayList, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f703561c", new Object[]{this, arrayList, new Boolean(z), str});
        }
    }

    public void a(List<ItemlistV2ResponseData.ItemListv1> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [tb.hgu, tb.hjr] */
    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b
    public /* synthetic */ hjr bL_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hgu) ipChange.ipc$dispatch("456f4ef4", new Object[]{this}) : c();
    }

    public hja(c cVar) {
        super(cVar);
        this.e = 10;
        this.f = 0;
        this.g = 0;
        this.h = true;
        this.i = true;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl.b, tb.hgv
    public void a(hgw hgwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebef7c80", new Object[]{this, hgwVar});
            return;
        }
        super.a(hgwVar);
        if (((hjc) this.f13751a).getAdapter() == null) {
            return;
        }
        ((hjc) this.f13751a).getAdapter().a(this.c);
    }

    public d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("2fa8933a", new Object[]{this}) : new d();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String trim = str.trim();
            if (TextUtils.isEmpty(trim)) {
                return;
            }
            this.g = 0;
            this.h = true;
            if (((hjc) this.f13751a).getAdapter() != null && ((hjc) this.f13751a).getAdapter().a() != null) {
                ((hjc) this.f13751a).getAdapter().a().clear();
                ((hjc) this.f13751a).getAdapter().notifyDataSetChanged();
            }
            ((hjr) this.b).a(this.d, trim, str2, 10, this.g);
        }
    }

    @Override // tb.hjb
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || !this.h) {
        } else {
            ((hjr) this.b).b(this.d, str, str2, 10, this.g);
        }
    }

    @Override // tb.hjb
    public void b(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ae4644", new Object[]{this, liveItem});
            return;
        }
        a a2 = a(liveItem);
        List a3 = ((hjc) this.f13751a).getAdapter().a();
        if (a2 == null || a3 == null) {
            return;
        }
        for (int i = 0; i < a3.size(); i++) {
            a aVar = (a) a3.get(i);
            if (aVar != null && a2.c == aVar.c) {
                a2.f = aVar.f;
                a3.set(i, a2);
                ((hjc) this.f13751a).getAdapter().notifyItemChanged(i);
            }
        }
    }

    @Override // tb.hjb
    public void a(GoodListSearchResponse.GoodListSearchResponseData goodListSearchResponseData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4bb8be", new Object[]{this, goodListSearchResponseData, str});
        } else if (goodListSearchResponseData == null || goodListSearchResponseData.itemListv1 == null || goodListSearchResponseData.itemListv1.isEmpty()) {
            ((hjc) this.f13751a).showEmpty(str);
        } else {
            a(goodListSearchResponseData.itemListv1);
            b(goodListSearchResponseData, str);
            this.h = goodListSearchResponseData.hasNext;
        }
    }

    @Override // tb.hjb
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.g != 0) {
        } else {
            ((hjc) this.f13751a).showError(str);
        }
    }

    private void b(GoodListSearchResponse.GoodListSearchResponseData goodListSearchResponseData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bff59d", new Object[]{this, goodListSearchResponseData, str});
            return;
        }
        ArrayList<a> arrayList = new ArrayList<>();
        List<ItemlistV2ResponseData.ItemListv1> list = goodListSearchResponseData.itemListv1;
        if (list != null && list.size() > 0) {
            for (ItemlistV2ResponseData.ItemListv1 itemListv1 : list) {
                itemListv1.liveItemDO.goodsIndex = l.a(itemListv1.goodsIndex, 0);
                if (!TextUtils.equals(str, itemListv1.goodsIndex)) {
                    int i = this.g;
                    if (i == 0) {
                        this.g = itemListv1.liveItemDO.goodsIndex;
                    } else {
                        this.g = Math.min(i, itemListv1.liveItemDO.goodsIndex);
                    }
                }
                a a2 = a(itemListv1.liveItemDO);
                a2.f = hiq.g(itemListv1.liveItemDO);
                arrayList.add(a2);
            }
        }
        a(arrayList, goodListSearchResponseData.hasNext, str);
        if (!arrayList.isEmpty()) {
            b(arrayList);
            ((hjc) this.f13751a).showGoodList(goodListSearchResponseData.totalNum, str);
            return;
        }
        ((hjc) this.f13751a).showEmpty(str);
    }

    @Override // tb.hjb
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.i && ((hjc) this.f13751a).getAdapter().a() != null && ((hjc) this.f13751a).getAdapter().a().size() > 0) {
            for (Object obj : ((hjc) this.f13751a).getAdapter().a()) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (aVar.b != null && aVar.b.containsKey("native_vipTagsShow") && aVar.b.containsKey("native_canShowVipEntrance")) {
                        aVar.b.put("native_canShowVipEntrance", (Object) false);
                    }
                }
            }
            ((hjc) this.f13751a).getAdapter().notifyDataSetChanged();
        }
        this.i = false;
    }

    private void b(List<a> list) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        jwg adapter = ((hjc) this.f13751a).getAdapter();
        int size = adapter.a().size();
        for (a aVar : list) {
            if (size > 0) {
                z = false;
                for (int i = 0; i < size; i++) {
                    if (adapter.a(i) != null && adapter.a(i).c == aVar.c) {
                        adapter.a().set(i, aVar);
                        adapter.notifyItemChanged(i);
                        z = true;
                    }
                }
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(aVar);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        adapter.a().addAll(arrayList);
        adapter.notifyItemRangeInserted(size, adapter.a().size());
    }
}
