package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.ultron.engine.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a.d f2700a = new a.d();

    static {
        kge.a(1269638742);
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[]{this}) : this.f2700a.f2547a;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.f2700a.f2547a = jSONObject;
        }
    }

    public a.d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a.d) ipChange.ipc$dispatch("34c473ac", new Object[]{this}) : this.f2700a;
    }
}
