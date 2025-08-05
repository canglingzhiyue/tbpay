package tb;

import com.alibaba.appmonitor.event.EventType;
import com.android.alibaba.ip.runtime.IpChange;
import tb.aqg;

/* loaded from: classes.dex */
public class bsx implements aqg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static bsx f26116a;

    static {
        kge.a(1090491829);
        kge.a(1945812401);
        f26116a = new bsx();
    }

    private bsx() {
        aqg.a(this);
    }

    public static bsx a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bsx) ipChange.ipc$dispatch("f02efb7", new Object[0]) : f26116a;
    }

    @Override // tb.aqg.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            a(false);
        }
    }

    @Override // tb.aqg.a
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            a(true);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        apr.b("BackgroundTrigger", "isAppOnForeground", Boolean.valueOf(z));
        if (z) {
            bti.a().c();
            EventType[] values = EventType.values();
            int length = values.length;
            while (i < length) {
                EventType eventType = values[i];
                bsw.a(eventType, eventType.getForegroundStatisticsInterval());
                i++;
            }
            return;
        }
        EventType[] values2 = EventType.values();
        int length2 = values2.length;
        while (i < length2) {
            EventType eventType2 = values2[i];
            bsw.a(eventType2, eventType2.getBackgroundStatisticsInterval());
            i++;
        }
        bsw.c();
    }
}
