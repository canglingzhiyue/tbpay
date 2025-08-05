package com.taobao.android.xsearchplugin.muise;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.imn;
import tb.ipq;
import tb.irp;
import tb.ise;
import tb.kge;

/* loaded from: classes6.dex */
public class SFMuiseSDK implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MUISE_BUNDLE_TYPE = "bundleType";
    public static final String MUISE_EVENT_LISTENER = "MuiseEventListener";
    public static final ise<ipq, c> MUS_CELL_CREATOR;
    public static final ise<irp, o> MUS_MOD_WIDGET_CREATOR;
    private static volatile boolean STATIC_REGISTER_FLAG;

    static {
        kge.a(-1604950683);
        kge.a(1028243835);
        STATIC_REGISTER_FLAG = false;
        MUS_MOD_WIDGET_CREATOR = new ise<irp, o>() { // from class: com.taobao.android.xsearchplugin.muise.SFMuiseSDK.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public o a(irp irpVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (o) ipChange.ipc$dispatch("fa316c10", new Object[]{this, irpVar}) : new o(irpVar.c, irpVar.d, irpVar.e, irpVar.f29258a, irpVar.f, irpVar.g);
            }
        };
        MUS_CELL_CREATOR = new ise<ipq, c>() { // from class: com.taobao.android.xsearchplugin.muise.SFMuiseSDK.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public c a(ipq ipqVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("21e311df", new Object[]{this, ipqVar}) : new c(ipqVar.c, ipqVar.e, ipqVar.d, ipqVar.b, ipqVar.f, ipqVar.f29218a);
            }
        };
    }

    public static void install(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c742e908", new Object[]{imnVar});
            return;
        }
        imnVar.c().h().b(MUS_CELL_CREATOR);
        imnVar.c().i().b(MUS_MOD_WIDGET_CREATOR);
        if (STATIC_REGISTER_FLAG) {
            return;
        }
        STATIC_REGISTER_FLAG = true;
        MuiseXSearchUtilModule.install(imnVar.a());
    }
}
