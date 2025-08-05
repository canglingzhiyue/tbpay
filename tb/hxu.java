package tb;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.parallelbiz.a;
import com.taobao.android.order.bundle.search.common.b;
import com.taobao.taobao.R;
import java.util.Map;

/* loaded from: classes6.dex */
public class hxu extends b implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TextView b;
    private TextView c;

    static {
        kge.a(-1741608130);
        kge.a(-1201612728);
    }

    public hxu(Activity activity) {
        super(activity);
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : R.layout.babel_search_history_tips_holder;
    }

    @Override // com.taobao.android.order.bundle.search.common.a
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.b = (TextView) view.findViewById(R.id.recommend_more_tv);
            this.b.setOnClickListener(this);
            this.c = (TextView) view.findViewById(R.id.history_tips_tv);
        }
    }

    @Override // com.taobao.android.order.bundle.search.common.b
    public void a(hxl hxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecda0bfc", new Object[]{this, hxlVar});
        } else if (hxlVar == null || !(hxlVar instanceof hxn)) {
        } else {
            hxn hxnVar = (hxn) hxlVar;
            this.b.setText(hxnVar.b);
            this.c.setText(hxnVar.f28835a);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() != R.id.recommend_more_tv) {
        } else {
            hya.a(this.f14568a).b();
            a.a("Clear", (Map<String, String>) null);
        }
    }
}
