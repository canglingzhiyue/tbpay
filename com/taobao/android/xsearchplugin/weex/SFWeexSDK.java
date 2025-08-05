package com.taobao.android.xsearchplugin.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.weex.weex.XSearchUtilModule;
import java.io.Serializable;
import tb.imn;
import tb.ipq;
import tb.irp;
import tb.ise;
import tb.jzc;
import tb.jzf;
import tb.kge;

/* loaded from: classes6.dex */
public class SFWeexSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile boolean STATIC_REGISTER_FLAG;
    public static final ise<ipq, jzc> WEEX_CELL_CREATOR;
    public static final ise<irp, jzf> WEEX_MOD_WIDGET_CREATOR;

    static {
        kge.a(-727453529);
        kge.a(1028243835);
        STATIC_REGISTER_FLAG = false;
        WEEX_MOD_WIDGET_CREATOR = new ise<irp, jzf>() { // from class: com.taobao.android.xsearchplugin.weex.SFWeexSDK.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public jzf a(irp irpVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (jzf) ipChange.ipc$dispatch("5ff20dff", new Object[]{this, irpVar}) : new jzf(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
            }
        };
        WEEX_CELL_CREATOR = new ise<ipq, jzc>() { // from class: com.taobao.android.xsearchplugin.weex.SFWeexSDK.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public jzc a(ipq ipqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (jzc) ipChange.ipc$dispatch("e57375a5", new Object[]{this, ipqVar}) : new jzc(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
            }
        };
    }

    public static void install(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c742e908", new Object[]{imnVar});
            return;
        }
        imnVar.c().h().a(WEEX_CELL_CREATOR);
        imnVar.c().i().a(WEEX_MOD_WIDGET_CREATOR);
        if (STATIC_REGISTER_FLAG) {
            return;
        }
        STATIC_REGISTER_FLAG = true;
        XSearchUtilModule.install(imnVar.a());
    }
}
