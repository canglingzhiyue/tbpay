package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.nestedscroll.recyclerview.ChildRecyclerView;

/* loaded from: classes8.dex */
public class otu extends ott {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1728214440);
    }

    public static /* synthetic */ Object ipc$super(otu otuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ott
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "itemExpose";
    }

    public otu(String str, String str2) {
        super(str, str2);
    }

    @Override // tb.ott
    public boolean a(ChildRecyclerView childRecyclerView, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("deb6e6dd", new Object[]{this, childRecyclerView, new Integer(i)})).booleanValue() : a((RecyclerView) childRecyclerView, i) || a((RecyclerView) childRecyclerView, i + 1);
    }

    private boolean a(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85acc031", new Object[]{this, recyclerView, new Integer(i)})).booleanValue();
        }
        if (recyclerView == null) {
            return false;
        }
        int a2 = a(recyclerView);
        if (a2 <= 0) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "containerVisibility <= 0, posExpose=false");
            return false;
        } else if (b(recyclerView) > i) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "firstVisible > anchorPos, posExpose=true");
            return true;
        } else {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition == null || findViewHolderForAdapterPosition.itemView == null) {
                lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "anchorView is null, posExpose=false");
                return false;
            }
            int measuredHeight = findViewHolderForAdapterPosition.itemView.getMeasuredHeight();
            if (findViewHolderForAdapterPosition.itemView.getTop() <= a2 && a2 - findViewHolderForAdapterPosition.itemView.getTop() > measuredHeight / 2) {
                lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "anchorView is expose, posExpose=true");
                return true;
            }
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "ItemExposeCalculator", "anchorView is not expose, posExpose=false");
            return false;
        }
    }
}
