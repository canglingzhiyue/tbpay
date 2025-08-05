package com.taobao.metrickit.event;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.metrickit.h;
import com.taobao.metrickit.i;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.mld;
import tb.mle;
import tb.mlf;
import tb.mlg;
import tb.mlh;
import tb.mli;
import tb.mlj;
import tb.mlk;
import tb.mll;
import tb.mlm;
import tb.mln;
import tb.mmj;
import tb.mml;

/* loaded from: classes.dex */
public final class EventCenter implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_ALARM_MANAGER_SET = 24;
    public static final int EVENT_ALARM_MANAGER_SET_REPEATING = 23;
    public static final int EVENT_APM_LAUNCH_COMPLETED = 6;
    public static final int EVENT_BG_2_FG = 0;
    public static final int EVENT_BLUETOOTH_ADAPTER_CANCEL_DISCOVERY = 26;
    public static final int EVENT_BLUETOOTH_ADAPTER_START_DISCOVERY = 25;
    public static final int EVENT_BLUETOOTH_ADAPTER_START_LE_SCAN = 27;
    public static final int EVENT_BLUETOOTH_ADAPTER_STOP_LE_SCAN = 28;
    public static final int EVENT_CONFIG_CHANGE = 3;
    public static final int EVENT_CPU_HIGH_LOAD = 80;
    public static final int EVENT_CPU_LOAD = 81;
    public static final int EVENT_DEFAULT = -1;
    public static final int EVENT_FG_2_BG = 1;
    public static final int EVENT_FIRST_FRAME = 7;
    public static final int EVENT_FOR_IN_BACKGROUND = 2;
    public static final int EVENT_HONOR_KILLED = 61;
    public static final int EVENT_HONOR_POWER_THERMAL_BASIC_ELEMENT = 40;
    public static final int EVENT_HONOR_POWER_THERMAL_CPU = 41;
    public static final int EVENT_HONOR_POWER_THERMAL_NETWORK = 42;
    public static final int EVENT_HONOR_PRESSURE_CPU = 50;
    public static final int EVENT_HONOR_PRESSURE_IO = 51;
    public static final int EVENT_HONOR_PRESSURE_MEMORY = 52;
    public static final int EVENT_HONOR_PRESSURE_TEMPERATURE = 53;
    public static final int EVENT_HONOR_PRESSURE_TEMPERATURE_RISE = 54;
    public static final int EVENT_HONOR_STABILITY_ANR = 59;
    public static final int EVENT_HONOR_STABILITY_TOMBSTONE = 60;
    public static final int EVENT_LAUNCHER_IDLE = 16;
    public static final int EVENT_LAUNCH_INTERACTIVE = 17;
    public static final int EVENT_LE_PROXY_START_SCAN = 31;
    public static final int EVENT_LE_PROXY_STOP_SCAN = 32;
    public static final int EVENT_LIFECYCLE = 4;
    public static final int EVENT_LOCATION_REMOVE_UPDATES = 30;
    public static final int EVENT_MEMORY_COLLECTED = 15;
    public static final int EVENT_METRICKIT_LAUNCH_FINISH = 8;
    public static final int EVENT_POWER_CONNECTED = 90;
    public static final int EVENT_POWER_DISCONNECTED = 91;
    public static final int EVENT_POWER_MANAGER_ACQUIRE = 19;
    public static final int EVENT_POWER_MANAGER_NEW_WAKE_LOCK = 18;
    public static final int EVENT_POWER_MANAGER_RELEASE = 20;
    public static final int EVENT_POWER_SAVE_MODE_OFF = 93;
    public static final int EVENT_POWER_SAVE_MODE_ON = 92;
    public static final int EVENT_REQUEST_LOCATION_UPDATES = 29;
    public static final int EVENT_SCROLL_END = 12;
    public static final int EVENT_SCROLL_FRAME_MONITOR_CANCEL = 10;
    public static final int EVENT_SCROLL_FRAME_START = 9;
    public static final int EVENT_SCROLL_START = 11;
    public static final int EVENT_SENSOR_MANAGER_REGISTER = 21;
    public static final int EVENT_SENSOR_MANAGER_UNREGISTER = 22;
    public static final int EVENT_SYSTEM_LOW_MEMORY = 13;
    public static final int EVENT_SYSTEM_TRIM_MEMORY = 14;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f18077a = !EventCenter.class.desiredAssertionStatus();
    private static final EventCenter b = new EventCenter();
    private static final String[] f = {"com.taobao.monitor.impl.trace.MemoryDispatcher", "com.taobao.monitor.impl.data.savemode.SaveModeMonitor"};
    private final Object c = new Object();
    private final Map<Integer, List<d>> d = new HashMap();
    private final Map<Integer, c> e = new HashMap();

    @Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface EventType {
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        if (i == -1) {
            return "EVENT_DEFAULT";
        }
        if (i == 0) {
            return "EVENT_BG_2_FG";
        }
        if (i == 1) {
            return "EVENT_FG_2_BG";
        }
        if (i == 2) {
            return "EVENT_FOR_IN_BACKGROUND";
        }
        if (i == 3) {
            return "EVENT_CONFIG_CHANGE";
        }
        if (i == 4) {
            return "EVENT_LIFECYCLE";
        }
        if (i == 80) {
            return "EVENT_CPU_HIGH_LOAD";
        }
        if (i == 81) {
            return "EVENT_CPU_LOAD";
        }
        switch (i) {
            case 6:
                return "EVENT_APM_LAUNCH_COMPLETED";
            case 7:
                return "EVENT_FIRST_FRAME";
            case 8:
                return "EVENT_METRICKIT_LAUNCH_FINISH";
            case 9:
                return "EVENT_SCROLL_FRAME_START";
            case 10:
                return "EVENT_SCROLL_FRAME_MONITOR_CANCEL";
            case 11:
                return "EVENT_SCROLL_START";
            case 12:
                return "EVENT_SCROLL_END";
            case 13:
                return "EVENT_SYSTEM_LOW_MEMORY";
            case 14:
                return "EVENT_SYSTEM_TRIM_MEMORY";
            case 15:
                return "EVENT_MEMORY_COLLECTED";
            case 16:
                return "EVENT_LAUNCHER_IDLE";
            case 17:
                return "EVENT_LAUNCH_INTERACTIVE";
            case 18:
                return "EVENT_POWER_MANAGER_NEW_WAKE_LOCK";
            case 19:
                return "EVENT_POWER_MANAGER_ACQUIRE";
            case 20:
                return "EVENT_POWER_MANAGER_RELEASE";
            case 21:
                return "EVENT_SENSOR_MANAGER_REGISTER";
            case 22:
                return "EVENT_SENSOR_MANAGER_REGISTER_MULTI";
            case 23:
                return "EVENT_ALARM_MANAGER_SET_REPEATING";
            case 24:
                return "EVENT_ALARM_MANAGER_SET";
            case 25:
                return "EVENT_BLUETOOTH_ADAPTER_START_DISCOVERY";
            case 26:
                return "EVENT_BLUETOOTH_ADAPTER_CANCEL_DISCOVERY";
            case 27:
                return "EVENT_BLUETOOTH_ADAPTER_START_LE_SCAN";
            case 28:
                return "EVENT_BLUETOOTH_ADAPTER_STOP_LE_SCAN";
            case 29:
                return "EVENT_REQUEST_LOCATION_UPDATES";
            case 30:
                return "EVENT_LOCATION_REMOVE_UPDATES";
            case 31:
                return "EVENT_LE_PROXY_START_SCAN";
            case 32:
                return "EVENT_LE_PROXY_STOP_SCAN";
            default:
                switch (i) {
                    case 40:
                        return "EVENT_HONOR_POWER_THERMAL";
                    case 41:
                        return "EVENT_HONOR_POWER_THERMAL_CPU";
                    case 42:
                        return "EVENT_HONOR_POWER_THERMAL_NETWORK";
                    default:
                        switch (i) {
                            case 50:
                                return "EVENT_HONOR_PRESSURE_CPU";
                            case 51:
                                return "EVENT_HONOR_PRESSURE_IO";
                            case 52:
                                return "EVENT_HONOR_PRESSURE_Memory";
                            case 53:
                                return "EVENT_HONOR_PRESSURE_TEMPERATURE";
                            case 54:
                                return "EVENT_HONOR_PRESSURE_TEMPERATURE_RISE";
                            default:
                                switch (i) {
                                    case 59:
                                        return "EVENT_HONOR_STABILITY_ANR";
                                    case 60:
                                        return "EVENT_HONOR_STABILITY_TOMBSTONE";
                                    case 61:
                                        return "EVENT_HONOR_KILLED";
                                    default:
                                        switch (i) {
                                            case 90:
                                                return "EVENT_POWER_CONNECTED";
                                            case 91:
                                                return "EVENT_POWER_DISCONNECTED";
                                            case 92:
                                                return "EVENT_POWER_SAVE_MODE_ON";
                                            case 93:
                                                return "EVENT_POWER_SAVE_MODE_OFF";
                                            default:
                                                return "EVENT_ERROR_PARSE";
                                        }
                                }
                        }
                }
        }
    }

    public static EventCenter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventCenter) ipChange.ipc$dispatch("63cc771f", new Object[0]) : b;
    }

    private EventCenter() {
        Handler handler = new Handler(com.taobao.metrickit.context.a.a().b().getLooper());
        mle mleVar = new mle(handler);
        if (f18077a || mleVar.b().length == 1) {
            this.e.put(3, new c(3, mleVar));
            a((b) new mln(handler));
            a((b) new mld(handler));
            a((b) new mlf());
            a((b) new com.taobao.metrickit.event.system.c(handler));
            a((b) new mlm(handler));
            a((b) new mlg(handler));
            a((b) new mlk(handler));
            a((b) new mll(handler));
            a((b) new mlh(handler));
            a((b) new mlj(handler));
            a((b) new mli(handler));
            a((b) new com.taobao.metrickit.event.system.a(handler));
            if (Build.VERSION.SDK_INT >= 21) {
                a((b) new com.taobao.metrickit.event.system.b(handler));
            }
            a((b) new e(new int[]{16}, h.class, handler));
            a((b) new e(new int[]{15}, mml.class, handler));
            a((b) new e(new int[]{80, 81}, mmj.class, handler));
            a((b) new e(new int[]{54}, "com.taobao.metrickit.honor.processor.pressure.TemperatureRiseProcessor", handler));
            b(3).a(this);
            return;
        }
        throw new AssertionError();
    }

    private void a(b bVar) {
        int[] b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1ac6c6", new Object[]{this, bVar});
        } else if (com.taobao.metrickit.context.c.a(bVar.a())) {
            for (int i : bVar.b()) {
                if (this.e.get(Integer.valueOf(i)) != null) {
                    throw new RuntimeException("Add event types repeatedly: " + i + "->" + bVar.a());
                }
                this.e.put(Integer.valueOf(i), new c(i, bVar));
            }
        }
    }

    public c b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("714419d9", new Object[]{this, new Integer(i)});
        }
        c cVar = this.e.get(Integer.valueOf(i));
        return cVar == null ? new c(-1, new a(new Handler(com.taobao.metrickit.context.a.a().b().getLooper()))) : cVar;
    }

    public e a(Object obj) {
        Class<?> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("3dbde84d", new Object[]{this, obj});
        }
        for (c cVar : this.e.values()) {
            if ((cVar.c() instanceof e) && (h = ((e) cVar.c()).h()) != null && h.isInstance(obj)) {
                return (e) cVar.c();
            }
        }
        return new e(new int[]{-1}, obj.getClass(), new Handler(com.taobao.metrickit.context.a.a().b().getLooper()));
    }

    @Override // com.taobao.metrickit.event.d
    public void a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
            return;
        }
        Iterator it = new HashSet(this.e.values()).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!(cVar.c() instanceof mle) && TextUtils.equals(String.valueOf(map.get(cVar.a())), "off")) {
                cVar.b();
                it.remove();
            }
        }
    }

    public void a(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee74df14", new Object[]{this, metricContext});
            return;
        }
        Iterator it = new HashSet(this.e.values()).iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(metricContext);
        }
    }

    public void a(b bVar, MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48ba472", new Object[]{this, bVar, metricContext});
        } else if (com.taobao.metrickit.context.c.a(bVar.a())) {
            a(bVar);
            for (int i : bVar.b()) {
                c cVar = this.e.get(Integer.valueOf(i));
                if (cVar != null) {
                    cVar.a(metricContext);
                }
            }
        }
    }

    public void a(int i, final i.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25002660", new Object[]{this, new Integer(i), aVar});
        } else if (!com.taobao.metrickit.utils.a.a(f, aVar.getClass().getName())) {
        } else {
            a(i, new d() { // from class: com.taobao.metrickit.event.EventCenter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.metrickit.event.d
                public void a(int i2, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i2), map});
                    } else {
                        aVar.a(i2, map);
                    }
                }
            });
        }
    }

    public void a(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f27b77", new Object[]{this, new Integer(i), dVar});
        } else {
            b(i).a(dVar);
        }
    }

    public void a(int[] iArr, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2430f812", new Object[]{this, iArr, dVar});
            return;
        }
        for (int i : iArr) {
            a(i, dVar);
        }
    }

    public void b(int i, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a31b3d6", new Object[]{this, new Integer(i), dVar});
        } else {
            b(i).b(dVar);
        }
    }

    public void b(int[] iArr, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37d8cb93", new Object[]{this, iArr, dVar});
            return;
        }
        for (int i : iArr) {
            b(i, dVar);
        }
    }
}
