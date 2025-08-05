package com.alibaba.poplayer.trigger;

import android.os.Message;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes.dex */
public class i extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1694043738);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2128352030) {
            super.a((String) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode != 673877021) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.handleMessage((Message) objArr[0]));
        }
    }

    @Override // com.alibaba.poplayer.trigger.c
    public /* bridge */ /* synthetic */ void a(String str, boolean z) {
        super.a(str, z);
    }

    @Override // com.alibaba.poplayer.trigger.c, android.os.Handler.Callback
    public /* bridge */ /* synthetic */ boolean handleMessage(Message message) {
        return super.handleMessage(message);
    }

    public i(a aVar) {
        super(aVar);
    }

    public void a(Event event, List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7b80d3", new Object[]{this, event, list});
        } else if (list != null && !list.isEmpty()) {
            a(event.attachKeyCode, true);
            long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
            BaseConfigItem baseConfigItem = null;
            long j = Long.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                long startTimeStamp = list.get(i).getStartTimeStamp() - currentTimeStamp;
                if (startTimeStamp > 0 && startTimeStamp < j) {
                    baseConfigItem = list.get(i);
                    j = startTimeStamp;
                }
            }
            if (baseConfigItem == null) {
                return;
            }
            com.alibaba.poplayer.utils.c.a("TriggerTimerMgr.checkTimeAndRescheduleIfNeed.UUID{%s}.timeNotStart.leftTime{%sms}.startLater", baseConfigItem.uuid, Long.valueOf(j));
            a(event, j);
        }
    }
}
