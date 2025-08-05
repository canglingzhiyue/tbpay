package com.alibaba.poplayer.norm;

import com.alibaba.poplayer.track.module.OnePopModule;
import java.util.Map;

/* loaded from: classes3.dex */
public interface ICrowdCheckRequestListener {
    void onFinished(boolean z, OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode, String str, String str2, Map<String, Object> map);
}
