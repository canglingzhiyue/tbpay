package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class arf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_KEY_BIZ_CODE = "AURA-BizCode";
    public static final String ARG_KEY_BRANCH = "AURA-Branch";
    public static final String ARG_KEY_BRANCH_CONDITION = "AURA-Branch-Condition";
    public static final String ARG_KEY_DOMAIN = "AURA-Domain";
    public static final String ARG_KEY_EXTENSION = "AURA-Extension";
    public static final String ARG_KEY_EXTENSION_METHOD = "AURA-Extension-Method";
    public static final String ARG_KEY_FLOW = "AURA-Flow";
    public static final String ARG_KEY_SERVICE = "AURA-Service";
    public static final String ARG_KEY_TAG = "AURA-TAG";

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, Object> f25527a = new HashMap<>();

    static {
        kge.a(-728065738);
        kge.a(-9039085);
    }

    public arf a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arf) ipChange.ipc$dispatch("7c6d1e5f", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f25527a.put(ARG_KEY_DOMAIN, str);
        return this;
    }

    public arf b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arf) ipChange.ipc$dispatch("7d19c9fe", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f25527a.put(ARG_KEY_TAG, str);
        return this;
    }

    public arf c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arf) ipChange.ipc$dispatch("7dc6759d", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f25527a.put(ARG_KEY_FLOW, str);
        return this;
    }

    public arf d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arf) ipChange.ipc$dispatch("7e73213c", new Object[]{this, str});
        }
        if (str == null) {
            return this;
        }
        this.f25527a.put(ARG_KEY_SERVICE, str);
        return this;
    }

    public arf a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (arf) ipChange.ipc$dispatch("2f835783", new Object[]{this, str, obj});
        }
        if (str != null && obj != null) {
            this.f25527a.put(str, obj);
        }
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : (String) this.f25527a.get(ARG_KEY_DOMAIN);
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return (String) this.f25527a.get(str);
        }
        return null;
    }

    public HashMap<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this}) : this.f25527a;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (bau.a(this.f25527a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        a(sb, ARG_KEY_TAG);
        a(sb, ARG_KEY_BIZ_CODE);
        a(sb, ARG_KEY_DOMAIN);
        a(sb, ARG_KEY_BRANCH);
        a(sb, ARG_KEY_BRANCH_CONDITION);
        a(sb, ARG_KEY_FLOW);
        a(sb, ARG_KEY_SERVICE);
        a(sb, ARG_KEY_EXTENSION);
        a(sb, ARG_KEY_EXTENSION_METHOD);
        for (Map.Entry<String, Object> entry : this.f25527a.entrySet()) {
            sb.append(riy.ARRAY_START_STR);
            sb.append(entry.getKey());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(riy.ARRAY_END_STR);
        }
        return sb.toString();
    }

    private void a(StringBuilder sb, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6b8fcd", new Object[]{this, sb, str});
            return;
        }
        Object remove = this.f25527a.remove(str);
        if (remove == null) {
            return;
        }
        sb.append(riy.ARRAY_START_STR);
        sb.append(remove);
        sb.append(riy.ARRAY_END_STR);
    }
}
