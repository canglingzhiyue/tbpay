package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.utils.b;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import com.taobao.android.detail.sdk.vmodel.widget.WidgetViewModel;

/* loaded from: classes4.dex */
public class exa extends MainViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27620a;
    public int b;
    public boolean c;
    public String d;
    public ewz e;
    public ewz f;
    public ewz g;
    public ewz h;

    static {
        kge.a(1050577397);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue();
        }
        return 20001;
    }

    public exa() {
        super(null, null);
        this.c = false;
        this.e = new ewz(null, null);
        ewz ewzVar = this.e;
        ewzVar.f27619a = "ꁺ";
        ewzVar.c = 0.375d;
        this.h = new ewz(null, null);
        ewz ewzVar2 = this.h;
        ewzVar2.f27619a = "ꁪ";
        ewzVar2.c = 0.375d;
        tpc.a("com.taobao.android.detail.sdk.vmodel.actionbar.ActionBarViewModel");
    }

    public exa(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.c = false;
        tpc.a("com.taobao.android.detail.sdk.vmodel.actionbar.ActionBarViewModel");
        if (nodeBundle != null && nodeBundle.resourceNode != null && nodeBundle.resourceNode.salePromotion != null) {
            this.f27620a = nodeBundle.resourceNode.salePromotion.naviIconUrl;
            this.d = nodeBundle.resourceNode.salePromotion.navBgPic;
            if (!StringUtils.isEmpty(nodeBundle.resourceNode.salePromotion.navBgColor)) {
                this.c = true;
                try {
                    this.b = b.a(nodeBundle.resourceNode.salePromotion.navBgColor);
                } catch (Exception unused) {
                    this.b = 0;
                }
            }
        }
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.detail.sdk.factory.manager.b a2 = com.taobao.android.detail.sdk.factory.manager.b.a();
        for (ComponentModel componentModel : this.component.children) {
            try {
                WidgetViewModel b = a2.b(componentModel, this.mNodeBundle);
                if (b instanceof ewz) {
                    ewz ewzVar = (ewz) b;
                    if ("left".equals(ewzVar.b)) {
                        this.e = ewzVar;
                    } else if ("center".equals(ewzVar.b)) {
                        this.f = ewzVar;
                    } else if ("custom".equals(ewzVar.b)) {
                        this.g = ewzVar;
                    } else if ("right".equals(ewzVar.b)) {
                        this.h = ewzVar;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
