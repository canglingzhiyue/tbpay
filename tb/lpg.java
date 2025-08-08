package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import tb.lpm;

/* loaded from: classes.dex */
public class lpg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30796a;
    private lph b;
    private lph c;

    static {
        kge.a(-1000536088);
    }

    public lpg(ljs ljsVar) {
        this.f30796a = ljsVar;
    }

    public void a(String str, View view, BaseSectionModel baseSectionModel, lpm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb1ffb72", new Object[]{this, str, view, baseSectionModel, aVar});
            return;
        }
        lph a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.a(baseSectionModel, view, aVar);
    }

    public void a(String str, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, lpm.a aVar, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7217d8", new Object[]{this, str, view, baseSectionModel, baseSectionModel2, aVar, view2});
            return;
        }
        lph a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.a(baseSectionModel, view, baseSectionModel2, aVar, view2);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        lph lphVar = this.b;
        if (lphVar == null) {
            return;
        }
        lphVar.a();
    }

    public void a(String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6198cb60", new Object[]{this, str, view});
            return;
        }
        lph a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.a(view);
    }

    private lph a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lph) ipChange.ipc$dispatch("7c721730", new Object[]{this, str});
        }
        if (StringUtils.equals(str, "commonOverlay")) {
            if (this.c == null) {
                this.c = b(str);
            }
            return this.c;
        }
        lph lphVar = this.b;
        if (lphVar == null) {
            this.b = b(str);
            return this.b;
        }
        if (!StringUtils.equals(str, lphVar.b())) {
            this.b.a();
            this.b = b(str);
        }
        return this.b;
    }

    private lph b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lph) ipChange.ipc$dispatch("7d1ec2cf", new Object[]{this, str});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1091287984) {
            if (hashCode != 98712316) {
                if (hashCode == 166839269 && str.equals("commonOverlay")) {
                    c = 2;
                }
            } else if (str.equals(ALBiometricsActivityParentView.n)) {
                c = 0;
            }
        } else if (str.equals("overlay")) {
            c = 1;
        }
        if (c == 0) {
            return new lqd(this.f30796a, str);
        }
        if (c == 1) {
            return new lpl(this.f30796a, str);
        }
        if (c == 2) {
            return new xkq(this.f30796a);
        }
        return null;
    }
}
