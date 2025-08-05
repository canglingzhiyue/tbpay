package com.taobao.android.tscheduleprotocol;

import android.content.Context;
import java.util.Map;

/* loaded from: classes6.dex */
public interface RenderScheduleProtocol extends ScheduleProtocol {
    boolean clearPreloadedInstances();

    boolean preCreateInstanceWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map);

    boolean preloadWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map);

    boolean removePreloadedInstance(String str);
}
