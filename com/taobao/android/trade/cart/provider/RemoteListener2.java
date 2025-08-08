package com.taobao.android.trade.cart.provider;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.c;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes6.dex */
public class RemoteListener2 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String requestId;

    static {
        kge.a(-88217333);
        kge.a(-525336021);
    }

    public RemoteListener2(String str) {
        this.requestId = str;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            executeError(this.requestId, true, mtopResponse);
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("msg", b.a(R.string.cart_msg_add_bag_success));
        c.a().a(this.requestId, hashMap);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
        } else {
            executeError(this.requestId, false, mtopResponse);
        }
    }

    private void executeError(String str, boolean z, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52614935", new Object[]{this, str, new Boolean(z), mtopResponse});
            return;
        }
        String a2 = b.a(R.string.taobao_app_1028_1_21682);
        String str2 = "";
        if (mtopResponse != null) {
            if (!StringUtils.isEmpty(mtopResponse.getRetMsg())) {
                a2 = mtopResponse.getRetMsg();
            }
            if (!StringUtils.isEmpty(mtopResponse.getRetCode())) {
                str2 = mtopResponse.getRetCode();
            }
        }
        if (z) {
            c.a().a(str, str2, a2, null);
        } else {
            c.a().b(str, str2, a2, null);
        }
    }
}
