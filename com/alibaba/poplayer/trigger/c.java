package com.alibaba.poplayer.trigger;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.security.realidentity.u2;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class c implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final a f3208a;
    private final Handler b = new Handler(Looper.getMainLooper(), this);

    static {
        kge.a(-1532082818);
        kge.a(-1043440182);
    }

    public c(a aVar) {
        this.f3208a = aVar;
    }

    public void a(Event event, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de3a7b22", new Object[]{this, event, new Long(j)});
            return;
        }
        com.alibaba.poplayer.utils.c.a("EventDispatchManager.dispatchEvent:event:{%s},delay:{%s}.", event, Long.valueOf(j));
        if (j < 0) {
            j = 0;
        }
        try {
            Message message = new Message();
            message.what = 2048;
            message.obj = event.attachKeyCode;
            Bundle bundle = new Bundle();
            bundle.putParcelable("event", event);
            bundle.putInt(u2.k, 0);
            message.setData(bundle);
            this.b.sendMessageDelayed(message, j);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("DispatchManager.dispatchEvent.error.", th);
        }
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (z) {
            this.b.removeCallbacksAndMessages(null);
        } else {
            this.b.removeCallbacksAndMessages(str);
        }
        com.alibaba.poplayer.utils.c.a("DispatchManager.removeNotStartedEventsByType:keyCode-{%s}, allRemove-{%s}", str, Boolean.valueOf(z));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        try {
            Event event = (Event) message.getData().get("event");
            com.alibaba.poplayer.utils.c.a("DispatchManager.handleMessage,event {%s}.", event);
            int i = message.getData().getInt(u2.k);
            if (!PopLayer.getReference().getConfigMgr().isUpdatingConfig()) {
                this.f3208a.a(event);
                return true;
            }
            if (i < 3) {
                Bundle data = message.getData();
                data.putInt(u2.k, i + 1);
                Message message2 = new Message();
                message2.setData(data);
                this.b.sendMessageDelayed(message2, 300L);
                com.alibaba.poplayer.utils.c.a("DispatchManager.handleMessage.isUpdatingConfig,event {%s} retry after 300ms.", event);
            } else {
                com.alibaba.poplayer.utils.c.a("DispatchManager.handleMessage.isUpdatingConfig,event {%s} retryTime{%s} >= LimitTime {%s} .And dropped event.", event, Integer.valueOf(i), 3);
            }
            return true;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("DispatchManager.handleMessage.error.", th);
            return false;
        }
    }
}
