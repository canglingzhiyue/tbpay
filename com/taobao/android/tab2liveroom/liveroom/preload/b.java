package com.taobao.android.tab2liveroom.liveroom.preload;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ivs;
import tb.ivt;
import tb.ivu;
import tb.kge;
import tb.oec;
import tb.ogg;
import tb.ogv;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ivt f15304a;
    private LivePreloadData b;
    private ivs c;

    /* loaded from: classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final b f15305a;

        static {
            kge.a(-1541544870);
            f15305a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("78c03a51", new Object[0]) : f15305a;
        }
    }

    static {
        kge.a(68677614);
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("78c03a51", new Object[0]) : a.a();
    }

    private b() {
        this.c = new ivs();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.c = new ivs(jSONObject);
        }
    }

    public ivs b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ivs) ipChange.ipc$dispatch("16b7ce57", new Object[]{this}) : this.c;
    }

    public void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
        } else if (context == null) {
        } else {
            if (!this.c.a()) {
                ogg.a("LivePreloadService", "直播预下载开关未打开，return");
                return;
            }
            this.f15304a = b(context, jSONObject);
            ivt ivtVar = this.f15304a;
            if (ivtVar == null) {
                return;
            }
            ivtVar.a();
        }
    }

    public LivePreloadData c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LivePreloadData) ipChange.ipc$dispatch("1f73f9ea", new Object[]{this});
        }
        ivt ivtVar = this.f15304a;
        if (ivtVar != null) {
            this.b = ivtVar.b();
        }
        return this.b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        ogg.a("LivePreloadService", "清除直播预加载数据，取消timer");
        ivt ivtVar = this.f15304a;
        if (ivtVar != null) {
            ivtVar.c();
        }
        this.b = null;
    }

    private ivt b(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ivt) ipChange.ipc$dispatch("4f3a568e", new Object[]{this, context, jSONObject});
        }
        int a2 = oec.a(jSONObject.get("type"), 1);
        if (a2 == 1) {
            return new ivu(context, this.c, a2);
        }
        if (a2 == 3) {
            return a(context, jSONObject, a2);
        }
        return null;
    }

    private ivt a(Context context, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ivt) ipChange.ipc$dispatch("c988e0ac", new Object[]{this, context, jSONObject, new Integer(i)});
        }
        if (ogv.a(jSONObject)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("extraParams");
        if (ogv.a(jSONObject2)) {
            return null;
        }
        boolean a2 = oec.a(jSONObject2.get(com.taobao.android.tab2liveroom.liveroom.a.KEY_LIVE_TAB_TOP_ITEM_SWITCH), false);
        ogg.a("LivePreloadService", "buildIconStreamPreloadTask,小红点承接是否是开播导航承接的方式:" + a2);
        if (!a2) {
            return null;
        }
        return new ivu(context, this.c, i);
    }
}
