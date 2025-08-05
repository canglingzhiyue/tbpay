package tb;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.search.common.b;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class hxw extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView b;

    static {
        kge.a(1164330840);
    }

    public hxw(Activity activity) {
        super(activity);
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : R.layout.babel_search_recommend_tips_holder;
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.b = (TextView) view.findViewById(R.id.recommend_tips_tv);
        }
    }

    @Override // com.taobao.android.order.bundle.search.common.b
    public void a(hxl hxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecda0bfc", new Object[]{this, hxlVar});
        } else if (hxlVar == null || !(hxlVar instanceof hxp)) {
        } else {
            this.b.setText(((hxp) hxlVar).f28837a);
        }
    }
}
