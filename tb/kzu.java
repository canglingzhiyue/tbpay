package tb;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.homepage.pop.utils.c;
import com.taobao.homepage.pop.view.container.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class kzu implements laf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f30424a;
    private d b;
    private kzv c;
    private Activity d;

    static {
        ArrayList arrayList = new ArrayList();
        f30424a = arrayList;
        arrayList.add("popDataDeltaRequest");
        f30424a.add("popDataBaseRequest");
    }

    public kzu(kzv kzvVar, d dVar) {
        this.c = kzvVar;
        this.b = dVar;
    }

    public void a(boolean z, String str, List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a8db27", new Object[]{this, new Boolean(z), str, list});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("++++++ onDataRefresh:");
        sb.append(z);
        sb.append(", requestType=");
        sb.append(str);
        sb.append(", popDataSize = ");
        if (list != null) {
            i = list.size();
        }
        sb.append(i);
        c.a("HomePopLifecycle ", sb.toString());
        this.c.a(z, str, list);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        this.c.a(str, jSONObject);
        if (f30424a.contains(str)) {
            return;
        }
        String jSONString = JSON.toJSONString(this.b.c());
        c.a("HomePopLifecycle ", "++++++ onRequestStart:" + str + ", params=" + jSONString);
        jSONObject.put(PopConst.POP_BIZ_PARAMS_KEY, (Object) jSONString);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onIconScroll:" + i);
        this.b.b(i);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.b.a(i, i2);
        }
    }

    public void a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onSubScrollStateChanged:" + i);
        this.b.a(viewGroup, i);
    }

    public void a(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca7d3361", new Object[]{this, new Integer(i), view, str});
        } else {
            this.b.a(i, view, str);
        }
    }

    public void b(int i, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afbea222", new Object[]{this, new Integer(i), view, str});
        } else {
            this.b.b(i, view, str);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onInfoFlowEnter:" + i);
        this.b.c(i);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onInfoFlowLeave:" + i);
        this.b.d(i);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onPopLayerShow");
        this.b.d();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onPopLayerDismiss");
        this.b.e();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ editionChanged");
        this.c.a(true, "onEditionChange", (List<JSONObject>) null);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onLoginSuccess");
        this.c.a(true, "onEditionChange", (List<JSONObject>) null);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else if (activity == null) {
        } else {
            c.a("HomePopLifecycle ", "++++++ onCreate, activity=" + activity.getClass().getName());
            this.d = activity;
            this.c.a(activity);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onStart");
        if (!l()) {
            return;
        }
        this.b.c(0);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onResume");
        if (l()) {
            return;
        }
        this.b.c(0);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onPause");
        if (l()) {
            return;
        }
        this.b.d(0);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onStop");
        if (!l()) {
            return;
        }
        this.b.d(0);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onDestroy");
        this.c.d();
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onFirstFrameRenderFinish");
        this.c.a();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onScreenChanged");
        this.c.a(true, "onScreenChanged", (List<JSONObject>) null);
    }

    @Override // com.taobao.homepage.pop.protocol.lifecycle.detail.a
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onUcpTrigger: " + str);
        this.c.a(str);
    }

    @Override // com.taobao.homepage.pop.protocol.lifecycle.detail.a
    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue() : this.c.b(str);
    }

    @Override // com.taobao.homepage.pop.protocol.lifecycle.detail.a
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.c.c(str);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onAppToBackground");
        this.c.b();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        c.a("HomePopLifecycle ", "++++++ onAppToFront");
        this.c.c();
    }

    private boolean l() {
        Activity activity;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : Build.VERSION.SDK_INT >= 19 && (activity = this.d) != null && l.d(activity.getApplication());
    }
}
