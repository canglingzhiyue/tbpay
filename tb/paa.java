package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.api.c;
import com.taobao.taolive.room.utils.ab;
import com.taobao.taolive.sdk.permisson.a;

/* loaded from: classes8.dex */
public class paa implements cgr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(267828236);
        kge.a(618107462);
    }

    @Override // tb.cgr
    public void a(final Context context, final String str, final String str2, final long j, final long j2, final long j3, final a.InterfaceC0910a interfaceC0910a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61f67a1", new Object[]{this, context, str, str2, new Long(j), new Long(j2), new Long(j3), interfaceC0910a});
        } else {
            c.a(context, new c.a() { // from class: tb.paa.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    ab.d("CalendarAdapter", "addCalendarEvent | title=" + str + " start=" + j + " end=" + j2);
                    if (!c.a(context, str, j, j2)) {
                        boolean a2 = c.a(context, str, str2, j, j2, j3);
                        ab.d("CalendarAdapter", "addCalendarEvent | addResult=" + a2);
                    } else {
                        ab.a("CalendarAdapter", "addCalendarEvent | already have.");
                    }
                    a.InterfaceC0910a interfaceC0910a2 = interfaceC0910a;
                    if (interfaceC0910a2 == null) {
                        return;
                    }
                    interfaceC0910a2.a();
                }

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a.InterfaceC0910a interfaceC0910a2 = interfaceC0910a;
                    if (interfaceC0910a2 == null) {
                        return;
                    }
                    interfaceC0910a2.b();
                }
            });
        }
    }

    @Override // tb.cgr
    public void a(final Context context, final String str, final long j, final long j2, final a.InterfaceC0910a interfaceC0910a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe72fffb", new Object[]{this, context, str, new Long(j), new Long(j2), interfaceC0910a});
        } else {
            c.a(context, new c.a() { // from class: tb.paa.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    c.b(context, str, j, j2);
                    a.InterfaceC0910a interfaceC0910a2 = interfaceC0910a;
                    if (interfaceC0910a2 == null) {
                        return;
                    }
                    interfaceC0910a2.a();
                }

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    a.InterfaceC0910a interfaceC0910a2 = interfaceC0910a;
                    if (interfaceC0910a2 == null) {
                        return;
                    }
                    interfaceC0910a2.b();
                }
            });
        }
    }
}
