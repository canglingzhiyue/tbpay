package com.taobao.android.detail.provider;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.protocol.adapter.core.INavAdapter;
import com.taobao.android.nav.Nav;
import tb.kge;

/* loaded from: classes4.dex */
public class TBNavProvider implements INavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-33887533);
        kge.a(1557640017);
    }

    @Override // com.taobao.android.detail.protocol.adapter.core.INavAdapter
    public void navigateTo(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7d8b15", new Object[]{this, context, str, bundle});
        } else if (context == null || StringUtils.isEmpty(str)) {
        } else {
            if (bundle == null) {
                Nav.from(context).toUri(str);
            } else {
                Nav.from(context).withExtras(bundle).toUri(str);
            }
        }
    }
}
