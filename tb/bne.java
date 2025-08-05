package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes2.dex */
public class bne implements bnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<IDMComponent> f25994a;

    static {
        kge.a(1785992849);
        kge.a(1931494709);
    }

    public bne(List<IDMComponent> list) {
        this.f25994a = list;
    }

    @Override // tb.bnf
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            a(this.f25994a);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        List<IDMComponent> list = this.f25994a;
        if (list == null) {
            return;
        }
        for (IDMComponent iDMComponent : list) {
            if (iDMComponent != null) {
                iDMComponent.record();
            }
        }
    }

    private void a(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                if (iDMComponent != null) {
                    iDMComponent.rollBack();
                }
            }
        }
    }
}
