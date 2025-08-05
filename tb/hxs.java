package tb;

import android.app.Activity;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.common.c;
import com.taobao.android.order.bundle.search.ui.adapter.RecommendAdapter;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes6.dex */
public class hxs extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-996761424);
    }

    public hxs(Activity activity) {
        super(activity, new RecommendAdapter(activity));
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        if (this.f14568a == null) {
            return null;
        }
        ListView listView = (ListView) this.f14568a.findViewById(R.id.order_recommend_lv);
        a(listView);
        return listView;
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (!(view instanceof ListView)) {
        } else {
            ((ListView) view).setAdapter((ListAdapter) this.b);
        }
    }

    public void c(List<hxl> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else if (this.b == null) {
        } else {
            this.b.setData(list);
        }
    }
}
