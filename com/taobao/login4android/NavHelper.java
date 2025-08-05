package com.taobao.login4android;

import android.content.Context;
import com.ali.user.mobile.helper.INavHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes7.dex */
public class NavHelper implements INavHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-831212333);
        kge.a(586043713);
    }

    @Override // com.ali.user.mobile.helper.INavHelper
    public void navTo(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea79ea4a", new Object[]{this, context, new Integer(i), str});
        } else {
            Nav.from(context).toUri(str);
        }
    }

    @Override // com.ali.user.mobile.helper.INavHelper
    public void navTo(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ecc5ed", new Object[]{this, context, str});
        } else {
            Nav.from(context).toUri(str);
        }
    }
}
