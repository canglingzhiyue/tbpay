package com.taobao.android.order.bundle.nav.detail;

import android.content.Intent;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.constants.CoreConstants;
import tb.kge;

/* loaded from: classes.dex */
public class d extends com.taobao.android.order.bundle.nav.a<Intent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1618847319);
    }

    public boolean b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15320aa", new Object[]{this, intent})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.order.bundle.nav.b
    public /* synthetic */ boolean c(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a8844ca", new Object[]{this, obj})).booleanValue() : b((Intent) obj);
    }

    @Override // com.taobao.android.order.bundle.nav.a
    public boolean a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8033c29", new Object[]{this, intent})).booleanValue();
        }
        Uri data = intent.getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("source");
            if (!StringUtils.isEmpty(queryParameter) && "1".equals(queryParameter)) {
                intent.putExtra("from", "OrderListActivity");
                String queryParameter2 = data.getQueryParameter("pageFrom");
                if (!StringUtils.isEmpty(queryParameter2)) {
                    intent.putExtra("pageFrom", queryParameter2);
                }
                intent.putExtra(CoreConstants.USE_V2, Boolean.valueOf(data.getQueryParameter(CoreConstants.IN_PARAM_SERVER_V2)));
            }
        }
        return false;
    }
}
