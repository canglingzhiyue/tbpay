package tb;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.view.item.a;
import com.taobao.infoflow.protocol.view.item.b;
import com.taobao.infoflow.protocol.view.item.c;
import java.util.List;

/* loaded from: classes7.dex */
public class lid {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final c f30646a;
    private final RecyclerView b;

    static {
        kge.a(-936480600);
    }

    public lid(RecyclerView recyclerView, c cVar) {
        this.b = recyclerView;
        this.f30646a = cVar;
    }

    public void a(List<BaseSectionModel> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a0b49b", new Object[]{this, list, new Boolean(z)});
        } else if (!a(list)) {
        } else {
            b a2 = this.f30646a.a("error");
            if (!(a2 instanceof a)) {
                return;
            }
            a aVar = (a) a2;
            lib libVar = (lib) this.b.findViewHolderForAdapterPosition(0);
            if (libVar == null || libVar.b() == null) {
                return;
            }
            aVar.a(z);
        }
    }

    private boolean a(List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c705295d", new Object[]{this, list})).booleanValue();
        }
        if (list != null && !list.isEmpty()) {
            return TextUtils.equals(list.get(0).getSectionBizCode(), "error");
        }
        return false;
    }
}
