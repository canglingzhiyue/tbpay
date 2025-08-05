package com.taobao.tao.handler.worker;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.interactionlikebar.KAPContainerView;
import com.taobao.share.qrcode.b;
import com.taobao.share.qrcode.c;
import tb.acg;
import tb.kge;
import tb.obi;
import tb.oif;
import tb.oir;

/* loaded from: classes8.dex */
public class c extends oir {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String QRCODE = "PanelQRCode";
    private String b;

    static {
        kge.a(-434738585);
    }

    public static /* synthetic */ String a(c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd727c94", new Object[]{cVar, str});
        }
        cVar.b = str;
        return str;
    }

    public c(oif oifVar) {
        super(oifVar);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    public void a(String str, String str2, boolean z, final c.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2c2867", new Object[]{this, str, str2, new Boolean(z), aVar});
        } else {
            new com.taobao.share.qrcode.b(com.taobao.share.globalmodel.e.b().j()).a(acg.a(), str, str2, z, new b.a() { // from class: com.taobao.tao.handler.worker.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.share.qrcode.b.a
                public void a(boolean z2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z2), str3});
                        return;
                    }
                    com.taobao.share.qrcode.c cVar = new com.taobao.share.qrcode.c(com.taobao.tao.config.a.a());
                    int a2 = obi.a(obi.b.SHARE_PANNEL_QRCODE_COLOR);
                    int i = a2 != -1 ? a2 : KAPContainerView.DEFAULT_MENU_COLOR;
                    c.a(c.this, str3);
                    cVar.a(str3, i, 50, null, aVar, z2);
                }
            });
        }
    }
}
