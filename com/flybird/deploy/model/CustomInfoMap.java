package com.flybird.deploy.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class CustomInfoMap implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 5331736736895590320L;
    private final HashMap<String, String> inner = new HashMap<>();

    /* loaded from: classes4.dex */
    public @interface CUSTOM_INFO_PREDEFINED_KEYS {
    }

    public void a(CustomInfoMap customInfoMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea53117", new Object[]{this, customInfoMap});
            return;
        }
        this.inner.clear();
        this.inner.putAll(customInfoMap.inner);
    }

    public String getEntry(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("baef83f3", new Object[]{this, str}) : this.inner.get(str);
    }

    public String getPreDefEntry(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d7c9cef5", new Object[]{this, str}) : getEntry(str);
    }

    public String optEntry(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86dcc346", new Object[]{this, str, str2});
        }
        String str3 = this.inner.get(str);
        return str3 == null ? str2 : str3;
    }

    public String optPreDefEntry(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1609e808", new Object[]{this, str, str2}) : optEntry(str, str2);
    }

    public void putEntry(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78399be", new Object[]{this, str, str2});
        } else {
            this.inner.put(str, str2);
        }
    }

    public void putPreDefEntry(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d325bc", new Object[]{this, str, str2});
        } else {
            putEntry(str, str2);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CustomInfoMap{inner=" + this.inner + '}';
    }

    public static CustomInfoMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CustomInfoMap) ipChange.ipc$dispatch("647d5f1d", new Object[0]) : new CustomInfoMap();
    }
}
