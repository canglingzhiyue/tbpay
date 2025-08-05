package com.taobao.tao.contact;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.ui.engine.friend.a;
import tb.kge;
import tb.nzh;
import tb.oie;

/* loaded from: classes8.dex */
public class ContactsInfoHandler implements a.InterfaceC0811a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContactsInfoHandler";

    static {
        kge.a(34423386);
        kge.a(644824052);
    }

    @Override // com.taobao.share.ui.engine.friend.a.InterfaceC0811a
    public void getContactsInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3390b1e", new Object[]{this});
        } else {
            oie.a(null, new nzh.a() { // from class: com.taobao.tao.contact.ContactsInfoHandler.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.nzh.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        a.a().a(str);
                    }
                }
            });
        }
    }
}
