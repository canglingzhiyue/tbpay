package com.taobao.android.livehome.plugin.atype.flexalocal.business.search;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.BaseDetailBusiness;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.i;
import com.taobao.android.livehome.plugin.atype.flexalocal.utils.k;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import tb.kge;
import tb.sqt;

/* loaded from: classes6.dex */
public class a extends BaseDetailBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1242171749);
    }

    public a(IRemoteBaseListener iRemoteBaseListener) {
        super(iRemoteBaseListener);
    }

    public void a(sqt sqtVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335bc0c6", new Object[]{this, sqtVar, context});
            return;
        }
        TaoLiveHotKeyRequest taoLiveHotKeyRequest = new TaoLiveHotKeyRequest();
        if (i.a(context)) {
            taoLiveHotKeyRequest.source = "h5";
        }
        a(0, taoLiveHotKeyRequest, TaoLiveHotWordResponse.class);
        k.a("requestStart", "firstRequest", taoLiveHotKeyRequest.API_NAME, taoLiveHotKeyRequest.VERSION, sqtVar);
    }
}
