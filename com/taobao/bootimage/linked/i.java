package com.taobao.bootimage.linked;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final JSONObject f16711a;

    static {
        kge.a(1039209676);
    }

    public i(JSONObject jSONObject) {
        this.f16711a = jSONObject;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this});
        }
        JSONObject a2 = com.taobao.bootimage.linked.ext.c.a(this.f16711a, com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM);
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("84474b09", new Object[]{this});
        }
        JSONObject a2 = com.taobao.bootimage.linked.ext.c.a(this.f16711a, "item", "0", "clickParam");
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("97ef1e8a", new Object[]{this});
        }
        JSONObject a2 = com.taobao.bootimage.linked.ext.c.a(this.f16711a, "subSection", "animationExpo", com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM);
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ab96f20b", new Object[]{this});
        }
        JSONObject a2 = com.taobao.bootimage.linked.ext.c.a(this.f16711a, "subSection", "coldStartExpo", com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM);
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject a2 = com.taobao.bootimage.linked.ext.c.a(this.f16711a, "item", "1", "clickParam");
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d2e6990d", new Object[]{this});
        }
        JSONObject a2 = com.taobao.bootimage.linked.ext.c.a(this.f16711a, "subSection", "interactExpo", com.taobao.android.home.component.utils.h.TRACK_EXPOSURE_PARAM);
        return a2 == null ? new JSONObject() : a2;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e68e6c8e", new Object[]{this});
        }
        JSONObject a2 = com.taobao.bootimage.linked.ext.c.a(this.f16711a, "item", "2", "clickParam");
        return a2 == null ? new JSONObject() : a2;
    }
}
