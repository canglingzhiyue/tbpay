package com.alipay.vi.android.phone.mrpc.core;

import android.text.TextUtils;
import com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonSerializer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;

/* loaded from: classes3.dex */
public class SimpleRpcJsonSerializer extends JsonSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SimpleRpcJsonSerializer(int i, String str, Object obj) {
        super(i, str, obj);
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.gwprotocol.JsonSerializer
    public String getRequestDataJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8af12ae", new Object[]{this});
        }
        String valueOf = String.valueOf(((Object[]) this.mParams)[1]);
        return TextUtils.isEmpty(valueOf) ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : valueOf;
    }
}
