package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;

/* loaded from: classes9.dex */
public class rrt extends rrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final BaseMaskView b;

    static {
        kge.a(1409536043);
    }

    @Override // tb.rrs
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public rrt(View view) {
        super(view);
        this.b = (BaseMaskView) view;
    }

    @Override // tb.rrs
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f33342a.getResources() == null) {
        } else {
            BaseMaskView baseMaskView = this.b;
            baseMaskView.setLineColor(baseMaskView.getResources().getColor(R.color.zdoc_line_color));
            BaseMaskView baseMaskView2 = this.b;
            baseMaskView2.setMaskColor(baseMaskView2.getResources().getColor(R.color.zdoc_frame_bg_color));
        }
    }
}
