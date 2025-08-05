package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import tb.acj;

/* loaded from: classes2.dex */
public final class bno extends acj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<IDMComponent> f26002a;
    private final List<IDMComponent> b;
    private int c = 0;
    private final boolean d;

    static {
        kge.a(109027323);
    }

    public bno(List<IDMComponent> list, List<IDMComponent> list2, boolean z) {
        this.f26002a = list;
        this.b = list2;
        this.d = z;
    }

    @Override // tb.acj.a
    public int getOldListSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc12e44a", new Object[]{this})).intValue();
        }
        List<IDMComponent> list = this.b;
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
        List<IDMComponent> list = this.f26002a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // tb.acj.a
    public boolean areItemsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("501767f6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        List<IDMComponent> list = this.b;
        if (list == null || this.f26002a == null || list.size() <= i || this.f26002a.size() <= i2) {
            return false;
        }
        IDMComponent iDMComponent = this.b.get(i);
        IDMComponent iDMComponent2 = this.f26002a.get(i2);
        boolean z2 = iDMComponent == null;
        if (iDMComponent2 != null) {
            z = false;
        }
        if (!z2 && !z) {
            return TextUtils.equals(iDMComponent.getKey(), iDMComponent2.getKey());
        }
        return false;
    }

    @Override // tb.acj.a
    public boolean areContentsTheSame(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1603f74", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        List<IDMComponent> list = this.b;
        if (list != null && this.f26002a != null) {
            if (list.size() <= i || this.f26002a.size() <= i2) {
                return false;
            }
            IDMComponent iDMComponent = this.b.get(i);
            IDMComponent iDMComponent2 = this.f26002a.get(i2);
            if ((iDMComponent == null) || (iDMComponent2 == null)) {
                return false;
            }
            if (!bnr.b(iDMComponent2.getKey()) && !ixm.a(iDMComponent2) && (this.d || iDMComponent == iDMComponent2)) {
                z = true;
            }
            if (!z) {
                this.c++;
            }
        }
        return z;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.c;
    }
}
