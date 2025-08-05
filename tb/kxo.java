package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.goods.list.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.g;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class kxo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private c f30383a;
    private Map<Integer, String> b = new HashMap();
    private a c;

    static {
        kge.a(984431898);
    }

    public kxo(c cVar, a aVar) {
        this.f30383a = cVar;
        this.c = aVar;
        this.b.put(4, "taolive_goods_list_item3");
        this.b.put(6, "taolive_goods_list_seckill_item2");
        this.b.put(1, "taolive_goods_list_right_good");
        this.b.put(10, "taolive_goods_search_entry");
        this.b.put(8, "taolive_goods_top_activity");
        this.b.put(7, "taolive_goods_list_pcg");
        this.b.put(2, (this.f30383a.e() == null || TextUtils.isEmpty(this.f30383a.e().templateName)) ? "taolive_goodslist_interact_red_packet" : this.f30383a.e().templateName);
    }

    public g a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("64e5757e", new Object[]{this, new Integer(i)});
        }
        kuj kujVar = null;
        String a2 = this.c.a(i);
        if (!TextUtils.isEmpty(a2)) {
            kujVar = new lsc(this.f30383a, this.c, a2);
        } else if (!TextUtils.isEmpty(this.b.get(Integer.valueOf(i)))) {
            kujVar = new kwp(this.f30383a, this.b.get(Integer.valueOf(i)));
        } else if (i == 9) {
            kujVar = new kuq(this.f30383a);
        }
        if (kujVar != null) {
            g a3 = kujVar.a(i);
            a3.a(kujVar);
            return a3;
        }
        his.b("ItemViewFactory", "createTypeDX | viewType=" + i);
        return new g(new View(this.f30383a.f()));
    }
}
