package com.taobao.flowcustoms.afc.xbs;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.flowcustoms.afc.model.AfcXbsData;
import com.taobao.flowcustoms.afc.xbs.TipsView;
import com.taobao.taobao.R;
import java.math.BigDecimal;
import java.util.HashMap;
import tb.kge;
import tb.kog;
import tb.koh;
import tb.koi;

/* loaded from: classes7.dex */
public class e implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f17200a = false;
    public Application.ActivityLifecycleCallbacks b = null;
    public final String c = "currentVC";
    public final String d = "currentAppkey";
    public final String e = "backAppkey";
    public final String f = "targetUrl";
    public final String g = koh.SOURCE_SDK_VERSION;
    public com.taobao.flowcustoms.afc.a h;

    static {
        kge.a(1721135024);
        kge.a(-640837135);
    }

    @Override // com.taobao.flowcustoms.afc.xbs.d
    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.d
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        }
    }

    public boolean b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fdb367f", new Object[]{this, activity})).booleanValue();
        }
        return true;
    }

    public void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b27d57fd", new Object[]{this, activity});
        }
    }

    public boolean a(com.taobao.flowcustoms.afc.a aVar, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e12c636", new Object[]{this, aVar, afcXbsData})).booleanValue();
        }
        this.h = aVar;
        b(aVar, afcXbsData);
        if (this.f17200a) {
            j();
        }
        return false;
    }

    private void b(com.taobao.flowcustoms.afc.a aVar, AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec062c11", new Object[]{this, aVar, afcXbsData});
        } else if (TextUtils.equals(aVar.f, "sku")) {
        } else {
            if (!TextUtils.isEmpty(aVar.h)) {
                a(afcXbsData);
                this.f17200a = true;
                c();
                return;
            }
            this.f17200a = false;
            h();
            i();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            com.taobao.flowcustoms.afc.utils.b.a(2201, com.taobao.flowcustoms.afc.utils.b.ARG1_FLOW_EXPOSE, "", "", g());
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (this.b != null) {
        } else {
            this.b = d();
            AfcCustomSdk.a().f17167a.registerActivityLifecycleCallbacks(this.b);
            com.taobao.flowcustoms.afc.utils.c.a("linkx", "registerActivityLifecycleCallbacks alc = " + this.b);
        }
    }

    public Application.ActivityLifecycleCallbacks d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application.ActivityLifecycleCallbacks) ipChange.ipc$dispatch("89049105", new Object[]{this});
        }
        if (this.b == null) {
            this.b = new c(this);
        }
        return this.b;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        f();
        k();
        i();
        this.f17200a = false;
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else if (AfcCustomSdk.a().f17167a == null) {
        } else {
            kog.a().a(AfcCustomSdk.a().f17167a, this.h);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            com.taobao.flowcustoms.afc.utils.b.a(2101, com.taobao.flowcustoms.afc.utils.b.ARG1_FLOW_BACK, "", "", g());
        }
    }

    public HashMap<String, String> g() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("7ba5ef51", new Object[]{this});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String str3 = AfcCustomSdk.a().b;
        String c = koi.a().c();
        com.taobao.flowcustoms.afc.a aVar = this.h;
        String str4 = "";
        if (aVar != null) {
            String str5 = aVar.d;
            str = this.h.f17179a;
            str2 = str5;
            str4 = this.h.h;
        } else {
            str = str4;
            str2 = str;
        }
        hashMap.put("currentVC", c);
        hashMap.put("currentAppkey", str3);
        hashMap.put("backAppkey", str);
        hashMap.put("targetUrl", str4);
        hashMap.put(koh.LINK_MANAGER_SDK_VERSION, AfcCustomSdk.SDK_VERSION);
        hashMap.put(koh.SOURCE_SDK_VERSION, str2);
        return hashMap;
    }

    public void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("792c473c", new Object[]{this, activity});
            return;
        }
        String str = this.h.c;
        if (TextUtils.isEmpty(str)) {
            str = activity.getResources().getString(R.string.open_oauth_back);
        }
        TipsView.a().a(str).a(activity);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            TipsView.a().c();
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        this.f17200a = false;
        TipsView.a().d();
    }

    public void a(AfcXbsData afcXbsData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7350423f", new Object[]{this, afcXbsData});
            return;
        }
        this.f17200a = true;
        TipsView.a().a(afcXbsData.appName).a(BigDecimal.valueOf(System.currentTimeMillis() + (afcXbsData.expireTime > 0 ? afcXbsData.expireTime * 1000 : 10L))).a(TipsView.FloatingType.SHOW_ONCE).a(this).b();
    }

    @Override // com.taobao.flowcustoms.afc.xbs.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            e();
        }
    }

    @Override // com.taobao.flowcustoms.afc.xbs.d
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f17200a = false;
        com.taobao.flowcustoms.afc.utils.c.a("linkx", "showPop  === onTimeOver");
    }
}
