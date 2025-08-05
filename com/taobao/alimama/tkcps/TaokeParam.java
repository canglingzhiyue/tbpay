package com.taobao.alimama.tkcps;

import com.alibaba.fastjson.annotation.JSONField;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import tb.kge;

/* loaded from: classes4.dex */
public class TaokeParam {
    @JSONField(name = "content")
    public String content;
    @JSONField(name = PushConstants.REGISTER_STATUS_EXPIRE_TIME)
    public Long expireTime;

    static {
        kge.a(-570084563);
    }
}
