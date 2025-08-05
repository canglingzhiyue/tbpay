package tb;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.b;
import com.taobao.taolive.sdk.goodlist.a;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class jwg<DataType> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(895179515);
    }

    public abstract a a(int i);

    public abstract List<DataType> a();

    public abstract void a(b bVar);

    public abstract void a(String str);

    public abstract boolean a(boolean z);

    public abstract void c();
}
