package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.sdk.goodlist.a;
import java.util.List;

/* loaded from: classes6.dex */
public class khi extends kas<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1398798448);
    }

    @Override // tb.kas
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    public khi(c cVar, List<a> list, RecyclerView recyclerView) {
        super(cVar, null, list, recyclerView);
    }

    @Override // tb.kas, tb.jwg
    public a a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("1f329496", new Object[]{this, new Integer(i)});
        }
        if (this.c != null && this.c.size() > i) {
            return (a) this.c.get(i);
        }
        return null;
    }
}
