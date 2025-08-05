package com.taobao.android.tscheduleprotocol;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;

/* loaded from: classes6.dex */
public interface CustomScheduleProtocol extends ScheduleProtocol {
    void preload(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, JSONObject jSONObject, Object... objArr);
}
