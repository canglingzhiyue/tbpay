package tb;

import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.lang.ref.WeakReference;
import tb.lpm;
import tb.lpw;

/* loaded from: classes7.dex */
public class lpx implements lpm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private transient WeakReference<lqc> f30809a;
    private ljs b;
    private View.OnClickListener c = null;
    private View.OnClickListener d = null;

    static {
        kge.a(-1855575497);
        kge.a(-1972890888);
    }

    @Override // tb.lpm
    public void a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
        }
    }

    public lpx(ljs ljsVar) {
        this.b = ljsVar;
    }

    @Override // tb.lpm
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        WeakReference<lqc> weakReference = this.f30809a;
        if (weakReference == null) {
            return;
        }
        lqc lqcVar = weakReference.get();
        if (lqcVar != null) {
            lqcVar.a();
        }
        this.f30809a = null;
    }

    @Override // tb.lpm
    public void a(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, lpm.a aVar, View view2, lpw.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("545b178e", new Object[]{this, view, baseSectionModel, baseSectionModel2, aVar, view2, aVar2});
            return;
        }
        a(baseSectionModel, baseSectionModel2);
        a();
        lqc b = b();
        ViewGroup viewGroup = view.getParent() instanceof ViewGroup ? (ViewGroup) view.getParent() : null;
        if (b == null || viewGroup == null) {
            return;
        }
        b.a(view.getContext(), viewGroup, this.c, this.d, baseSectionModel);
        aVar.a(baseSectionModel2, baseSectionModel);
    }

    private lqc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lqc) ipChange.ipc$dispatch("16b916bf", new Object[]{this});
        }
        this.f30809a = new WeakReference<>(new lqc(this.b));
        return this.f30809a.get();
    }

    private void a(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3224caf8", new Object[]{this, baseSectionModel, baseSectionModel2});
            return;
        }
        BaseItemModel mo1097getItem = baseSectionModel2.mo1097getItem();
        if (mo1097getItem == null) {
            return;
        }
        a(baseSectionModel, baseSectionModel2, mo1097getItem);
        b(baseSectionModel, baseSectionModel2, mo1097getItem);
    }

    private void a(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, BaseItemModel baseItemModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43370576", new Object[]{this, baseSectionModel, baseSectionModel2, baseItemModel});
            return;
        }
        if (baseItemModel.mo1094getBaseItemModel(0) == null) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.c = new lpz(this.b, baseSectionModel, baseSectionModel2);
    }

    private void b(BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, BaseItemModel baseItemModel) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bf6715", new Object[]{this, baseSectionModel, baseSectionModel2, baseItemModel});
            return;
        }
        if (baseItemModel.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR) == null) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.d = new lqa(this.b, baseSectionModel, baseSectionModel2);
    }
}
