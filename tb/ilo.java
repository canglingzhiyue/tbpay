package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class ilo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_BATTERY_CAPACITY_COLLECTED = 2;
    public static final int EVENT_BATTERY_TEMPERATURE_COLLECTED = 5;
    public static final int EVENT_BG_2_FG = 0;
    public static final int EVENT_CPU_LOAD_COLLECTED = 6;
    public static final int EVENT_FG_2_BG = 1;
    public static final int EVENT_MEMORY_COLLECTED = 3;
    public static final int EVENT_MODULE_SWITCH_OFF = 8;
    public static final int EVENT_NATIVE_MEMORY_COLLECTED = 9;
    public static final int EVENT_SYSTEM_LOW_MEMORY = 7;
    public static final int EVENT_SYSTEM_TRIM_MEMORY = 4;

    static {
        kge.a(-277678869);
    }

    public static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 0:
                return "EVENT_BG_2_FG";
            case 1:
                return "EVENT_FG_2_BG";
            case 2:
                return "EVENT_BATTERY_CAPACITY_COLLECTED";
            case 3:
                return "EVENT_MEMORY_COLLECTED";
            case 4:
                return "EVENT_SYSTEM_TRIM_MEMORY";
            case 5:
                return "EVENT_BATTERY_TEMPERATURE_COLLECTED";
            case 6:
                return "EVENT_CPU_LOAD_COLLECTED";
            case 7:
                return "EVENT_SYSTEM_LOW_MEMORY";
            case 8:
            default:
                return "ERROR_TYPE";
            case 9:
                return "EVENT_NATIVE_MEMORY_COLLECTED";
        }
    }
}
