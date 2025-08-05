package com.taobao.android.fluid.framework.device;

import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.core.b;
import tb.smq;
import tb.snd;

/* loaded from: classes5.dex */
public interface IDeviceService extends FluidService, smq, snd {
    public static final b ERROR_CODE_NETWORK_RECEIVER_REGISTER_ERROR = new b("DEVICE-1", "网络监听注册失败");
    public static final b ERROR_CODE_NETWORK_RECEIVER_UNREGISTER_ERROR = new b("DEVICE-2", "网络监听取消注册失败");

    float getDeviceScore();
}
