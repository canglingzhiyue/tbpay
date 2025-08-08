package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class cac {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_CATEGORY_CONFIG_CHECK_START = "ConfigCheckStart";
    public static final String EVENT_CATEGORY_FULL_UP = "fullUp";
    public static final String EVENT_CATEGORY_JUMP_LOSE = "JumpLose";
    public static final String EVENT_CATEGORY_ONE_POP = "OnePop";
    public static final String EVENT_CATEGORY_OTHER = "other";
    public static final String EVENT_CATEGORY_PAGE_LIFE_CYCLE = "pageLifeCycle";
    public static final String EVENT_CATEGORY_POP_ERROR = "PopError";
    public static final String EVENT_CATEGORY_POP_PROCESS = "PopProcess";

    /* renamed from: a  reason: collision with root package name */
    private cae f26219a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final cac f26220a;

        static {
            kge.a(1825206930);
            f26220a = new cac();
        }

        public static /* synthetic */ cac a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (cac) ipChange.ipc$dispatch("f031df9", new Object[0]) : f26220a;
        }
    }

    static {
        kge.a(1789142975);
    }

    public static cac a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (cac) ipChange.ipc$dispatch("f031df9", new Object[0]) : a.a();
    }

    private cac() {
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : !StringUtils.isEmpty(str) && (str.equals("ConfigCheckStart") || str.equals("OnePop") || str.equals("PopProcess") || str.equals("PopError") || str.equals("JumpLose"));
    }

    public void a(cae caeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30a85b1", new Object[]{this, caeVar});
            return;
        }
        this.f26219a = caeVar;
        c.a("registerUserTrackAdapter.", new Object[0]);
    }

    public void a(String str, String str2, BaseConfigItem baseConfigItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1b7a6b", new Object[]{this, str, str2, baseConfigItem, map});
        } else {
            a(str, str2, baseConfigItem, map, false);
        }
    }

    public void a(String str, String str2, BaseConfigItem baseConfigItem, Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f65485c9", new Object[]{this, str, str2, baseConfigItem, map, new Boolean(z)});
            return;
        }
        try {
            if (this.f26219a == null) {
                return;
            }
            this.f26219a.a(str, str2, baseConfigItem, map, z);
        } catch (Throwable th) {
            c.a("trackAction error.", th);
        }
    }

    public void a(int i, String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89fc62", new Object[]{this, new Integer(i), str, str2, str3, str4, map});
            return;
        }
        try {
            if (this.f26219a == null) {
                return;
            }
            this.f26219a.a(i, str, str2, str3, str4, map);
        } catch (Throwable th) {
            c.a("trackCustom error.", th);
        }
    }
}
