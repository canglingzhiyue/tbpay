package tb;

import android.view.LayoutInflater;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.android.order.bundle.widget.holder.a;
import com.taobao.taobao.R;

/* loaded from: classes6.dex */
public class hza extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View c;

    static {
        kge.a(98925466);
    }

    public hza(TBOrderBaseActivity tBOrderBaseActivity) {
        super(tBOrderBaseActivity);
    }

    @Override // com.taobao.android.order.bundle.widget.holder.a
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        this.c = LayoutInflater.from(this.b).inflate(R.layout.layout_order_detail_skeleton, this.f14605a, true);
        return this.c;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("adc2ed2c", new Object[]{this}) : this.c;
    }
}
