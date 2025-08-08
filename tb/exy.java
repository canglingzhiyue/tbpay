package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.event.basic.f;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.utils.b;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class exy extends exl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27642a;
    public int b;
    public boolean c;
    public String d;
    public String e;
    public exv f;
    public exv g;
    public exv h;
    public exv i;
    public exx j;

    static {
        kge.a(2135711985);
    }

    @Override // com.taobao.android.detail.sdk.vmodel.main.MainViewModel
    public int getViewModelType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7e14bda2", new Object[]{this})).intValue() : ewy.T_DETAIL_NAVI_BAR;
    }

    public exy() {
        super(null);
        this.c = false;
        tpc.a("com.taobao.android.detail.sdk.vmodel.navbar.NavBarViewModel");
        this.f = new exv(null, null);
        exv exvVar = this.f;
        exvVar.c = "ꁺ";
        exvVar.b = 0.375d;
        b();
        this.i = new exv(null, null);
        exv exvVar2 = this.i;
        exvVar2.c = "ꁪ";
        exvVar2.b = 0.375d;
        c();
    }

    public exy(ComponentModel componentModel, NodeBundle nodeBundle) {
        super(componentModel, nodeBundle);
        this.c = false;
        tpc.a("com.taobao.android.detail.sdk.vmodel.navbar.NavBarViewModel");
        if (nodeBundle != null) {
            if (nodeBundle.resourceNode != null && nodeBundle.resourceNode.salePromotion != null) {
                this.f27642a = nodeBundle.resourceNode.salePromotion.naviIconUrl;
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
            if (nodeBundle.itemNode != null && nodeBundle.itemNode.images != null && !nodeBundle.itemNode.images.isEmpty()) {
                this.e = nodeBundle.itemNode.images.get(0);
            }
        }
        a();
        c();
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
                exl d = a2.d(componentModel, this.mNodeBundle);
                if (d instanceof exv) {
                    exv exvVar = (exv) d;
                    if ("left".equals(exvVar.e)) {
                        this.f = exvVar;
                    } else if ("center".equals(exvVar.e)) {
                        this.g = exvVar;
                    } else if ("custom".equals(exvVar.e)) {
                        this.h = exvVar;
                    } else if ("right".equals(exvVar.e)) {
                        this.i = exvVar;
                    }
                } else if (d instanceof exx) {
                    this.j = (exx) d;
                }
            } catch (Exception unused) {
            }
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        exv exvVar = this.f;
        if (exvVar == null) {
            return;
        }
        exvVar.events = new ArrayList();
        this.f.events.add(new f());
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        exv exvVar = this.i;
        if (exvVar == null) {
            return;
        }
        exvVar.children = new ArrayList();
    }
}
