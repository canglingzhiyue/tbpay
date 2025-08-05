package com.taobao.tao.flexbox.layoutmanager.player.videodecide;

import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;
import tb.ogg;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f20478a;

        static {
            kge.a(-356797573);
            f20478a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bc39b428", new Object[0]) : f20478a;
        }
    }

    static {
        kge.a(-360406591);
        kge.a(-849618273);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("bc39b428", new Object[0]) : a.a();
    }

    private b() {
    }

    public JSONObject a(JSONObject jSONObject, com.taobao.tao.flexbox.layoutmanager.player.videodecide.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5b86d0c9", new Object[]{this, jSONObject, aVar});
        }
        ogg.a("ND_VideoControllerManager", "nd decideVideoResources 调用码率决策的方法，决策前播控,videoResourceObj:" + jSONObject);
        JSONObject a2 = c.a(jSONObject, aVar, false, true);
        ogg.a("ND_VideoControllerManager", "nd decideVideoResources 调用码率决策的方法，决策后播控,decideVideoResObj:" + a2);
        return a2;
    }
}
