package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.CloseRecyclerView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.e;
import com.taobao.taolive.sdk.goodlist.a;
import java.util.List;

/* loaded from: classes6.dex */
public class kcg extends kas<e> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(108448527);
    }

    public kcg(c cVar, ItemCategory itemCategory, List<e> list, CloseRecyclerView closeRecyclerView) {
        super(cVar, itemCategory, list, closeRecyclerView);
    }

    @Override // tb.kas, tb.jwg
    public a a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1f329496", new Object[]{this, new Integer(i)});
        }
        if (this.c == null || this.c.size() <= i) {
            return null;
        }
        e eVar = (e) this.c.get(i);
        a a2 = this.f29922a.a(this.b, eVar);
        if (eVar != null && a2 != null) {
            return a2;
        }
        return null;
    }

    @Override // tb.kas
    public int b() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (this.c != null) {
            int i2 = 0;
            for (DataType datatype : this.c) {
                i += hiq.b(datatype.f13845a) ? 1 : 0;
                i2++;
                if (i2 >= 3) {
                    break;
                }
            }
        }
        return i;
    }
}
