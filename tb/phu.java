package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.c;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.controller.e;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;
import java.util.Map;
import tb.pfa;

/* loaded from: classes8.dex */
public class phu implements pfa.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32654a;

    static {
        kge.a(-693730982);
        kge.a(-1028862981);
    }

    @Override // tb.pfa.a
    public void a(a aVar, Activity activity, LiveItem liveItem, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3476c51f", new Object[]{this, aVar, activity, liveItem, str, hashMap});
        } else {
            c.a(activity, liveItem, str, hashMap);
        }
    }

    @Override // tb.pfa.a
    public boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : d.d(context);
    }

    @Override // tb.pfa.a
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f32654a;
    }

    @Override // tb.pfa.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f32654a = str;
        }
    }

    @Override // tb.pfa.a
    public void a(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eafa7f9", new Object[]{this, aVar, obj});
        } else {
            ai.b(aVar, obj, pfa.a(aVar).f32580a);
        }
    }

    @Override // tb.pfa.a
    public void a(e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfc2e5a", new Object[]{this, eVar, obj});
        } else {
            ai.a(eVar, obj);
        }
    }

    @Override // tb.pfa.a
    public void b(e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fff9b9", new Object[]{this, eVar, obj});
        } else {
            ai.c(eVar, obj);
        }
    }

    @Override // tb.pfa.a
    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{this, eVar});
        } else {
            ai.b(eVar);
        }
    }

    @Override // tb.pfa.a
    public void a(e eVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33835a4", new Object[]{this, eVar, obj, str});
        } else {
            ai.a(eVar, obj, str);
        }
    }

    @Override // tb.pfa.a
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : ai.a();
    }

    @Override // tb.pfa.a
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : ai.b();
    }

    @Override // tb.pfa.a
    public void a(Activity activity, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6e17eb", new Object[]{this, activity, new Boolean(z), map});
        } else {
            c.a(activity, z, map);
        }
    }
}
