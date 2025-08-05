package tb;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class tia implements tib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, tib> f34108a = new HashMap();

    static {
        kge.a(136361649);
        kge.a(608989980);
    }

    public tia() {
        this.f34108a.put(1, new tie());
        this.f34108a.put(3, new tie());
        this.f34108a.put(2, new thz());
    }

    @Override // tb.tib
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i, a aVar, thv thvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("bdb70103", new Object[]{this, viewGroup, new Integer(i), aVar, thvVar});
        }
        tib tibVar = this.f34108a.get(Integer.valueOf(i));
        if (tibVar != null) {
            return tibVar.a(viewGroup, i, aVar, thvVar);
        }
        return null;
    }
}
