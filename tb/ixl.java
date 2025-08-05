package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ixl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<IDMComponent> f29396a = null;
    private final String b;

    static {
        kge.a(1671418308);
    }

    public ixl(String str) {
        this.b = str;
    }

    private boolean a(IDMComponent iDMComponent, IDMComponent iDMComponent2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1bc096ec", new Object[]{this, iDMComponent, iDMComponent2})).booleanValue();
        }
        if (!ixm.a(iDMComponent)) {
            return jql.a(iDMComponent, iDMComponent2);
        }
        return false;
    }

    public boolean a(List<IDMComponent> list, brx brxVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61d71ba5", new Object[]{this, list, brxVar})).booleanValue();
        }
        try {
            if (brxVar != null) {
                if (brxVar.e()) {
                    if (list != null && this.f29396a != null) {
                        if (!jqi.a(this.b, "enableDiffRebuildHeader", false)) {
                            return false;
                        }
                        if (list.size() != this.f29396a.size()) {
                            return false;
                        }
                        for (int i = 0; i < list.size(); i++) {
                            IDMComponent iDMComponent = this.f29396a.get(i);
                            IDMComponent iDMComponent2 = list.get(i);
                            if (iDMComponent != iDMComponent2 && (!Objects.equals(iDMComponent.getKey(), iDMComponent2.getKey()) || !a(iDMComponent, iDMComponent2))) {
                                z = false;
                                break;
                            }
                        }
                        return z;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            jpr.a(jpu.a("Ultron").c("skipRebuildHeaderError").b(e.getMessage()));
            return false;
        } finally {
            this.f29396a = list;
        }
    }
}
