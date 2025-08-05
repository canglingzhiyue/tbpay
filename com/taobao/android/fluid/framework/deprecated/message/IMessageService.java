package com.taobao.android.fluid.framework.deprecated.message;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import tb.jwf;
import tb.slz;
import tb.sma;

@Deprecated
/* loaded from: classes5.dex */
public interface IMessageService extends FluidService, jwf, slz {
    public static final b ERROR_CODE_GET_CARD_DATA_MESSAGE_FIELDS_THROWABLE = new b("MESSAGE-1", "获取卡片数据消息的参数字段异常");
    public static final String SERVICE_NAME = "IMessageService";

    sma getMessageCenter();
}
