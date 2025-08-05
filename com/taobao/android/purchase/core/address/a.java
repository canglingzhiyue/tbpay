package com.taobao.android.purchase.core.address;

import android.content.Context;
import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.t;
import tb.fke;
import tb.iff;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(612674157);
    }

    public static void a(final Context context, String str) {
        NewErrorDialogStructure newErrorDialogStructure;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
            return;
        }
        try {
            newErrorDialogStructure = (NewErrorDialogStructure) JSONObject.parseObject(str, NewErrorDialogStructure.class);
        } catch (Throwable unused) {
            newErrorDialogStructure = null;
        }
        iff iffVar = new iff(context);
        if (newErrorDialogStructure != null) {
            b.a(iffVar, newErrorDialogStructure);
        } else {
            iffVar.a(c.TO_SET_ADDRESS_ERROR_MSG);
            iffVar.b(str);
        }
        iffVar.e("");
        iffVar.a(new iff.a() { // from class: com.taobao.android.purchase.core.address.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.a
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                    return;
                }
                iffVar2.b();
                fke.a(context);
            }
        });
        iffVar.a(new iff.b() { // from class: com.taobao.android.purchase.core.address.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.iff.b
            public void a(iff iffVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ed8e834f", new Object[]{this, iffVar2});
                    return;
                }
                iffVar2.b();
                Context context2 = context;
                if (context2 == null) {
                    return;
                }
                a.a(context2, new Bundle(), 69);
            }
        });
        iffVar.a();
    }

    public static void a(Context context, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b291d0f", new Object[]{context, bundle, new Integer(i)});
            return;
        }
        switch (i) {
            case 52:
                t.a().a(context).a(bundle).b(i).a("http://my.m.taobao.com/deliver/select_address_list.htm");
                return;
            case 53:
            case 54:
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("bookReturnFields", true);
                if (i == 53) {
                    t.a().a(context).a(bundle).b(1001).a("http://m.taobao.com/awp/mtb/location_component_addressbook.htm");
                    return;
                } else {
                    t.a().a(context).a(bundle).b(1003).a("http://m.taobao.com/awp/mtb/location_component_addressbook.htm");
                    return;
                }
            default:
                switch (i) {
                    case 69:
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("setAsDefault", true);
                        t.a().a(context).b(i).a(bundle2).a("http://my.m.taobao.com/deliver/add_address.htm");
                        return;
                    case 70:
                    case 71:
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("addressReturnFields", true);
                        bundle.putBoolean(com.taobao.android.purchase.core.b.ACTIVITY_ADD_ADDRESS_AUTO_FILL, true);
                        if (i == 70) {
                            t.a().a(context).b(1002).a(bundle).a("http://m.taobao.com/awp/mtb/location_component_addaddress.htm");
                            return;
                        } else {
                            t.a().a(context).a(bundle).b(1003).a("http://m.taobao.com/awp/mtb/location_component_addaddress.htm");
                            return;
                        }
                    default:
                        return;
                }
        }
    }
}
