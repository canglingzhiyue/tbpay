package com.alibaba.poplayer.norm;

import com.alibaba.poplayer.track.module.OnePopModule;
import java.util.Map;

/* loaded from: classes3.dex */
public interface IUserCheckRequestListener {
    void onFinished(boolean z, String str, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str2, String str3, Map<String, Object> map);
}
