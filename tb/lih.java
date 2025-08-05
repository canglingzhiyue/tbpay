package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.List;
import tb.acj;

/* loaded from: classes7.dex */
public class lih extends acj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_SECTION_BIZ_CODE = "sectionBizCode";

    /* renamed from: a  reason: collision with root package name */
    public List<BaseSectionModel> f30651a;
    public List<BaseSectionModel> b;

    static {
        kge.a(1125175448);
    }

    public static /* synthetic */ Object ipc$super(lih lihVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public lih(List<BaseSectionModel> list, List<BaseSectionModel> list2) {
        this.f30651a = list2;
        this.b = list;
    }

    @Override // tb.acj.a
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
        }
        List<BaseSectionModel> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // tb.acj.a
    public int getNewListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8e07243", new Object[]{this})).intValue();
        }
        List<BaseSectionModel> list = this.f30651a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // tb.acj.a
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        BaseSectionModel a2 = a(this.b, i);
        BaseSectionModel a3 = a(this.f30651a, i2);
        return a2 == a3 || !(a2 == null || a3 == null || !TextUtils.equals(a2.getString("sectionBizCode"), a3.getString("sectionBizCode")));
    }

    @Override // tb.acj.a
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : a(this.b, i) == a(this.f30651a, i2);
    }

    private BaseSectionModel a(List<BaseSectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseSectionModel) ipChange.ipc$dispatch("985017d4", new Object[]{this, list, new Integer(i)});
        }
        if (list != null && !list.isEmpty() && i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
