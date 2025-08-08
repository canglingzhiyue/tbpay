package com.alipay.mobile.common.rpc.protocol.json;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;

/* loaded from: classes3.dex */
public class SimpleRpcJsonSerializer extends JsonSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SimpleRpcJsonSerializer(int i, String str, Object obj) {
        super(i, str, obj);
    }

    @Override // com.alipay.mobile.common.rpc.protocol.json.JsonSerializer
    public String getRequestDataJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8af12ae", new Object[]{this});
        }
        String valueOf = String.valueOf(((Object[]) this.mParams)[1]);
        return StringUtils.isEmpty(valueOf) ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : valueOf;
    }
}
