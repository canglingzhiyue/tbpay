package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;
import com.taobao.weex.weexv2.page.WeexV2Activity;

/* loaded from: classes8.dex */
public class otv extends ott {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(600349670);
    }

    @Override // tb.ott
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "itemOnTop";
    }

    public otv(String str, String str2) {
        super(str, str2);
    }

    @Override // tb.ott
    public boolean a(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("deb6e6dd", new Object[]{this, childRecyclerView, new Integer(i)})).booleanValue();
        }
        int b = b(childRecyclerView);
        lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemOnTopCalculator", "firstPos:" + b + ", anchorPos:" + i);
        if (b < i) {
            return false;
        }
        if (i != 0 || b > i) {
            return true;
        }
        int a2 = a(childRecyclerView) + childRecyclerView.getTop();
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = childRecyclerView.findViewHolderForAdapterPosition(i);
        if (findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.itemView != null) {
            a2 += findViewHolderForAdapterPosition.itemView.getPaddingTop();
        }
        int measuredHeight = childRecyclerView.getMeasuredHeight();
        lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemOnTopCalculator", "containerVisibility=" + a2 + ", containerHeight=" + measuredHeight);
        return (!(childRecyclerView.getContext() instanceof WeexV2Activity) || !ksk.REC_PAY_SUCCESS.f30287a.equals(this.c)) ? a2 >= childRecyclerView.getMeasuredHeight() : a2 + 50 >= childRecyclerView.getMeasuredHeight();
    }
}
