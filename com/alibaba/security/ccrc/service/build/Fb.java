package com.alibaba.security.ccrc.service.build;

import android.util.Log;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class Fb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Exception f3239a;
    public Map<String, Object> b;
    public Map<String, Object> c;

    public Fb(Exception exc) {
        this.f3239a = exc;
    }

    public Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a014a89d", new Object[]{this});
        }
        Map<String, Object> map = this.c;
        if (map != null) {
            return map;
        }
        this.c = (Map) JsonUtils.parseObject((String) c().get("algoRet"), (Class<Object>) Map.class);
        if (this.c == null) {
            this.c = new HashMap();
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        if (d()) {
            return null;
        }
        return Log.getStackTraceString(this.f3239a);
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new HashMap();
        }
        return this.b;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f3239a == null;
    }
}
