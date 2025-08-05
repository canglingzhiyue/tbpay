package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.structure.f;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;
import com.taobao.android.detail.sdk.vmodel.main.MultiMediaModel;
import com.taobao.android.detail.sdk.vmodel.main.TitleViewModel;
import com.taobao.android.detail.sdk.vmodel.main.ZhongRenTuanViewModel;
import com.taobao.android.detail.sdk.vmodel.main.a;
import com.taobao.android.detail.sdk.vmodel.main.aa;
import com.taobao.android.detail.sdk.vmodel.main.ab;
import com.taobao.android.detail.sdk.vmodel.main.ac;
import com.taobao.android.detail.sdk.vmodel.main.ad;
import com.taobao.android.detail.sdk.vmodel.main.af;
import com.taobao.android.detail.sdk.vmodel.main.ag;
import com.taobao.android.detail.sdk.vmodel.main.ah;
import com.taobao.android.detail.sdk.vmodel.main.ai;
import com.taobao.android.detail.sdk.vmodel.main.aj;
import com.taobao.android.detail.sdk.vmodel.main.al;
import com.taobao.android.detail.sdk.vmodel.main.am;
import com.taobao.android.detail.sdk.vmodel.main.ao;
import com.taobao.android.detail.sdk.vmodel.main.c;
import com.taobao.android.detail.sdk.vmodel.main.d;
import com.taobao.android.detail.sdk.vmodel.main.e;
import com.taobao.android.detail.sdk.vmodel.main.h;
import com.taobao.android.detail.sdk.vmodel.main.i;
import com.taobao.android.detail.sdk.vmodel.main.j;
import com.taobao.android.detail.sdk.vmodel.main.k;
import com.taobao.android.detail.sdk.vmodel.main.l;
import com.taobao.android.detail.sdk.vmodel.main.m;
import com.taobao.android.detail.sdk.vmodel.main.n;
import com.taobao.android.detail.sdk.vmodel.main.o;
import com.taobao.android.detail.sdk.vmodel.main.p;
import com.taobao.android.detail.sdk.vmodel.main.q;
import com.taobao.android.detail.sdk.vmodel.main.r;
import com.taobao.android.detail.sdk.vmodel.main.s;
import com.taobao.android.detail.sdk.vmodel.main.u;
import com.taobao.android.detail.sdk.vmodel.main.w;
import com.taobao.android.detail.sdk.vmodel.main.x;
import com.taobao.android.detail.sdk.vmodel.main.y;
import com.taobao.android.detail.sdk.vmodel.main.z;

/* loaded from: classes4.dex */
public class ewi implements evz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1473807145);
        kge.a(1808135055);
    }

    public ewi() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.MainViewModelFactory");
    }

    @Override // tb.ewa
    public MainViewModel a(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainViewModel) ipChange.ipc$dispatch("ac99d18", new Object[]{this, componentModel, nodeBundle});
        }
        if (componentModel == null) {
            return null;
        }
        String str = componentModel.key;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        switch (ewy.a(str)) {
            case 20001:
                return new exa(componentModel, nodeBundle);
            case 30001:
                if (f.f10334a) {
                    return new MultiMediaModel(componentModel, nodeBundle);
                }
                return new w(componentModel, nodeBundle);
            case 30002:
                return new TitleViewModel(componentModel, nodeBundle);
            case 30003:
                return new y(componentModel, nodeBundle);
            case 30004:
                return new x(componentModel, nodeBundle);
            case 30005:
                return new al(componentModel, nodeBundle);
            case 30007:
                return new aj(componentModel, nodeBundle);
            case 30008:
                return new ac(componentModel, nodeBundle);
            case 30011:
                return new ah(componentModel, nodeBundle);
            case 30012:
                return new ai(componentModel, nodeBundle);
            case 30013:
                return new aa(componentModel, nodeBundle);
            case 30014:
                return new ab(componentModel, nodeBundle);
            case 30015:
                return new z(componentModel, nodeBundle);
            case 30017:
                return new ad(componentModel, nodeBundle);
            case 30018:
                return new af(componentModel, nodeBundle);
            case 30020:
                return new i(componentModel, nodeBundle);
            case ewy.T_IMAGE_BAR /* 30027 */:
                return new l(componentModel, nodeBundle);
            case ewy.T_O2O /* 30029 */:
                return new u(componentModel, nodeBundle);
            case ewy.T_COMBO /* 30030 */:
                return new c(componentModel, nodeBundle);
            case ewy.T_NEW_TITLE /* 30031 */:
                return new s(componentModel, nodeBundle);
            case ewy.T_SHOP_PROMOTION_2 /* 30034 */:
                return new ag(componentModel, nodeBundle);
            case ewy.T_COUPON_INFO /* 30035 */:
                return new e(componentModel, nodeBundle);
            case ewy.T_ZHONG_REN_TUAN_PROGRESSBAR /* 30037 */:
                return new ZhongRenTuanViewModel(componentModel, nodeBundle);
            case ewy.T_ASK_ALL /* 30038 */:
                return new h(componentModel, nodeBundle);
            case ewy.T_TMALL_FEATURE /* 30044 */:
                return new am(componentModel, nodeBundle);
            case ewy.T_DINAMIC /* 30045 */:
                return new exu(componentModel, nodeBundle);
            case ewy.T_DINAMIC_O2O /* 30046 */:
                return new ext(componentModel, nodeBundle);
            case ewy.T_XSKU /* 30047 */:
                return new ao(componentModel, nodeBundle);
            case ewy.T_H5 /* 34002 */:
                return new k(componentModel, nodeBundle);
            case ewy.T_WEEX /* 35034 */:
                return new n(componentModel, nodeBundle);
            case 40002:
                return new m(componentModel, nodeBundle);
            case ewy.T_MARKET_RECOMMEND /* 41001 */:
                return new q(componentModel, nodeBundle);
            case ewy.T_MARKET_HOT_ACTIVITY /* 41002 */:
                return new p(componentModel, nodeBundle);
            case ewy.T_MARKET_TIME_LIMIT /* 41003 */:
                return new o(componentModel, nodeBundle);
            case ewy.T_ENTRANCE /* 46001 */:
                return new j(componentModel, nodeBundle);
            case ewy.T_MULTISTAGE /* 46002 */:
                return new r(componentModel, nodeBundle);
            case ewy.T_AVATAR_GROUPS /* 46003 */:
                return new a(componentModel, nodeBundle);
            case ewy.T_BUTTON_CONTAINER /* 47001 */:
                return new d(componentModel, nodeBundle);
            case 80001:
                return new com.taobao.android.detail.sdk.vmodel.main.f(componentModel, nodeBundle);
            default:
                return null;
        }
    }
}
