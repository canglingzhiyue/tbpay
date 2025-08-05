package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class mqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31195a;
    private Map<String, Object> b;
    private Map<String, Object> c;
    private Map<String, Object> d;

    public mqi(String str, Map<String, Object> map) {
        this.f31195a = str;
        this.b = map;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31195a;
    }

    public Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this}) : this.d;
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this}) : this.c;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this}) : this.b;
    }

    public mqi a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqi) ipChange.ipc$dispatch("24b35b24", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.putAll(map);
        return this;
    }

    public mqi b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqi) ipChange.ipc$dispatch("5e046be5", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        this.c.putAll(map);
        return this;
    }

    public mqi c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqi) ipChange.ipc$dispatch("97557ca6", new Object[]{this, map});
        }
        if (map == null) {
            return this;
        }
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.putAll(map);
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : this.f31195a;
    }
}
