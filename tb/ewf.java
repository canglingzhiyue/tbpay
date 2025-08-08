package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.model.node.NodeBundle;
import com.taobao.android.detail.sdk.model.template.ComponentModel;
import com.taobao.android.detail.sdk.vmodel.desc.QualityViewModel;
import com.taobao.android.detail.sdk.vmodel.desc.a;
import com.taobao.android.detail.sdk.vmodel.desc.aa;
import com.taobao.android.detail.sdk.vmodel.desc.ab;
import com.taobao.android.detail.sdk.vmodel.desc.ac;
import com.taobao.android.detail.sdk.vmodel.desc.ad;
import com.taobao.android.detail.sdk.vmodel.desc.ae;
import com.taobao.android.detail.sdk.vmodel.desc.af;
import com.taobao.android.detail.sdk.vmodel.desc.b;
import com.taobao.android.detail.sdk.vmodel.desc.c;
import com.taobao.android.detail.sdk.vmodel.desc.d;
import com.taobao.android.detail.sdk.vmodel.desc.e;
import com.taobao.android.detail.sdk.vmodel.desc.f;
import com.taobao.android.detail.sdk.vmodel.desc.g;
import com.taobao.android.detail.sdk.vmodel.desc.h;
import com.taobao.android.detail.sdk.vmodel.desc.i;
import com.taobao.android.detail.sdk.vmodel.desc.j;
import com.taobao.android.detail.sdk.vmodel.desc.k;
import com.taobao.android.detail.sdk.vmodel.desc.l;
import com.taobao.android.detail.sdk.vmodel.desc.m;
import com.taobao.android.detail.sdk.vmodel.desc.n;
import com.taobao.android.detail.sdk.vmodel.desc.o;
import com.taobao.android.detail.sdk.vmodel.desc.p;
import com.taobao.android.detail.sdk.vmodel.desc.q;
import com.taobao.android.detail.sdk.vmodel.desc.r;
import com.taobao.android.detail.sdk.vmodel.desc.s;
import com.taobao.android.detail.sdk.vmodel.desc.t;
import com.taobao.android.detail.sdk.vmodel.desc.u;
import com.taobao.android.detail.sdk.vmodel.desc.v;
import com.taobao.android.detail.sdk.vmodel.desc.w;
import com.taobao.android.detail.sdk.vmodel.desc.x;
import com.taobao.android.detail.sdk.vmodel.desc.y;
import com.taobao.android.detail.sdk.vmodel.desc.z;
import com.taobao.android.detail.sdk.vmodel.main.MainViewModel;

/* loaded from: classes4.dex */
public class ewf implements evx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1606956031);
        kge.a(-1272628121);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.detail.sdk.vmodel.main.MainViewModel, com.taobao.android.detail.sdk.vmodel.desc.e] */
    @Override // tb.ewa
    public /* synthetic */ e a(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MainViewModel) ipChange.ipc$dispatch("ac99d18", new Object[]{this, componentModel, nodeBundle}) : b(componentModel, nodeBundle);
    }

    public ewf() {
        tpc.a("com.taobao.android.detail.sdk.factory.impl.DescViewModelFactory");
    }

    public e b(ComponentModel componentModel, NodeBundle nodeBundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("2c9c3187", new Object[]{this, componentModel, nodeBundle});
        }
        if (componentModel == null) {
            return null;
        }
        String str = componentModel.key;
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        int a2 = ewy.a(str);
        if (a2 == 35037) {
            return new a(componentModel);
        }
        if (a2 != 90001) {
            switch (a2) {
                case ewy.T_MULTI_PIC_CONTAINER /* 35001 */:
                    return new n(componentModel);
                case ewy.T_SCROLLABLE_CONTAINER /* 35002 */:
                    return new v(componentModel);
                case ewy.T_SPLITABLE_CONTAINER /* 35003 */:
                    return new z(componentModel);
                case ewy.T_COMPOSITE_CONTAINER /* 35004 */:
                    return new b(componentModel);
                default:
                    switch (a2) {
                        case ewy.T_ITEM_INFO /* 35007 */:
                            return new l(componentModel);
                        case ewy.T_COUPON /* 35008 */:
                            return new c(componentModel);
                        case ewy.T_DIVISION_TITLE /* 35009 */:
                            return new g(componentModel);
                        case ewy.T_SKU_BAR /* 35010 */:
                            return new y(componentModel);
                        case ewy.T_PICTURE_JUMPER /* 35011 */:
                            return new s(componentModel);
                        case ewy.T_ITEM_INFO_2 /* 35012 */:
                            return new k(componentModel);
                        case ewy.T_GOODS_MATCHING /* 35013 */:
                            return new i(componentModel);
                        case ewy.T_SIZE_CHART /* 35014 */:
                            return new x(componentModel);
                        case ewy.T_PRODUCT_INFO /* 35015 */:
                            return new u(componentModel);
                        case ewy.T_PIC_WITH_TITLE /* 35016 */:
                            return new r(componentModel);
                        case ewy.T_PIC_CONTAINER /* 35017 */:
                            return new q(componentModel);
                        case ewy.T_PACKING_LIST /* 35018 */:
                            return new p(componentModel);
                        case ewy.T_HOT_AREA /* 35019 */:
                            return new j(componentModel);
                        case ewy.T_MODEL_WEAR /* 35020 */:
                            return new m(componentModel);
                        case ewy.T_SERVICE /* 35021 */:
                            return new w(componentModel);
                        case ewy.T_CUSTOM_MODULE /* 35022 */:
                            return new d(componentModel);
                        case ewy.T_DETAIL_FULLTEXT /* 35023 */:
                            return new h(componentModel);
                        case ewy.T_NB_VIDEO /* 35024 */:
                            return new o(componentModel);
                        default:
                            switch (a2) {
                                case ewy.T_QUALITY /* 35026 */:
                                    return new QualityViewModel(componentModel);
                                case ewy.T_PLACE_HOLDER /* 35027 */:
                                    return new t(componentModel);
                                case ewy.T_DESC_DIVIDER /* 35028 */:
                                    return new f(componentModel);
                                case ewy.T_PICTURE_3D /* 35029 */:
                                    return new exs(componentModel);
                                default:
                                    switch (a2) {
                                        case ewy.T_USER_TALK /* 35031 */:
                                            return new ab(componentModel);
                                        case ewy.T_OFFLINE_STORE /* 35032 */:
                                            return new aa(componentModel);
                                        default:
                                            switch (a2) {
                                                case ewy.T_WEEX /* 35034 */:
                                                    return new af(componentModel);
                                                case ewy.T_VESSEL /* 35035 */:
                                                    return new ac(componentModel);
                                                default:
                                                    switch (a2) {
                                                        case ewy.T_VIDEO_CONTAINER /* 35040 */:
                                                            return new ad(componentModel);
                                                        case ewy.T_VIDEO_INFO /* 35041 */:
                                                            return new ae(componentModel);
                                                        default:
                                                            return null;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return new com.taobao.android.detail.sdk.vmodel.main.g(componentModel);
    }
}
