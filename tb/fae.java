package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.widget.container.a;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import java.util.List;

/* loaded from: classes5.dex */
public class fae implements ehw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private fad f27712a;
    private fch b;

    static {
        kge.a(-1900943122);
        kge.a(1339695439);
    }

    @Override // tb.ehw
    public List<epe> a(List<epe> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b71fabce", new Object[]{this, list});
        }
        return null;
    }

    @Override // tb.ehw
    public ehu a(DetailCoreActivity detailCoreActivity, epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ehu) ipChange.ipc$dispatch("edaf856b", new Object[]{this, detailCoreActivity, epeVar});
        }
        return null;
    }

    public fae() {
        emu.a("com.taobao.android.detail.wrapper.ext.TBDetailStructureCustomizer");
    }

    @Override // tb.ehw
    public a b(DetailCoreActivity detailCoreActivity, epe epeVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("be4c379c", new Object[]{this, detailCoreActivity, epeVar});
        }
        if (epeVar.component != null) {
            str = epeVar.component.type;
        } else if (epeVar.dmComponent == null) {
            str = "";
        } else if (epeVar.dmComponent.getFields() != null) {
            str = epeVar.dmComponent.getFields().getString("type");
        } else {
            str = epeVar.dmComponent.getType();
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1977517709:
                if (str.equals("detailInfoUltron")) {
                    c = 1;
                    break;
                }
                break;
            case -1036623713:
                if (str.equals("detailInfo")) {
                    c = 0;
                    break;
                }
                break;
            case -219723137:
                if (str.equals("guessYouLike")) {
                    c = 3;
                    break;
                }
                break;
            case 149310114:
                if (str.equals("detailInfoAura")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            if (this.f27712a == null) {
                this.f27712a = new fad(detailCoreActivity);
            }
            i.c("TBDetailStructureCustomizer", "getDetailController reuse TBDetailMainController");
            return this.f27712a;
        } else if (c != 3) {
            return null;
        } else {
            if (this.b == null) {
                this.b = new fch(detailCoreActivity);
                ((DetailActivity) detailCoreActivity).a(this.b);
                i.c("TBDetailStructureCustomizer", "getDetailController use TBDetailGuessYouLikeController");
            }
            return this.b;
        }
    }
}
