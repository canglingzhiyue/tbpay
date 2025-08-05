package com.taobao.android.tscheduleprotocol;

import android.content.Context;
import java.util.Map;

/* loaded from: classes6.dex */
public interface TScheduleHTTPProtocol extends ScheduleProtocol {
    Map<String, String> getHeaders(Context context, String str, String str2);
}
