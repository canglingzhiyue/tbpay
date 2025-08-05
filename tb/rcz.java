package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.label.LabelStyle;
import com.taobao.taobao.R;

/* loaded from: classes9.dex */
public class rcz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2046652855);
    }

    public static LabelStyle a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LabelStyle) ipChange.ipc$dispatch("38fd60ee", new Object[0]);
        }
        LabelStyle labelStyle = new LabelStyle();
        labelStyle.lineColor = 0;
        labelStyle.lineWidth = 10;
        labelStyle.labelBgLeft = R.drawable.dw_umi_mark_shape_rect;
        labelStyle.labelBgRight = R.drawable.dw_umi_mark_shape_rect;
        labelStyle.height = 26;
        labelStyle.dotSrc = R.drawable.dw_umi_mark_shape_dot;
        labelStyle.textSize = 12;
        return labelStyle;
    }
}
