package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.nav.Nav;
import com.taobao.desktop.common.request.a;
import com.taobao.desktop.common.request.b;
import com.taobao.desktop.common.request.c;
import com.taobao.desktop.widget.manager.e;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class khq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f30081a;

    static {
        kge.a(-1887705934);
    }

    public static /* synthetic */ void a(khq khqVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64926c6e", new Object[]{khqVar, str});
        } else {
            khqVar.b(str);
        }
    }

    public void a(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
            return;
        }
        try {
            this.f30081a = context;
            if (!e.n(context)) {
                kif.a("LinkRouterService orange not enable");
            } else if (!a(hashMap)) {
                kif.a("LinkRouterService language limit");
            } else if (!kid.b()) {
                kif.a("LinkRouterService not oppo brand");
            } else if (!kid.d()) {
                kif.a("LinkRouterService not first install");
            } else {
                a(a());
            }
        } catch (Throwable th) {
            kif.a("LinkRouterService error: " + th.getMessage());
        }
    }

    private boolean a(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("656bbc4f", new Object[]{this, hashMap})).booleanValue() : !hashMap.containsKey("currentLocale") || Locale.CHINESE.getLanguage().equals((String) hashMap.get("currentLocale"));
    }

    private String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        cwo.a(this.f30081a);
        String a2 = bzj.a(this.f30081a);
        kif.a("LinkRouterService deviceOaid: " + a2);
        return a2;
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("deviceId", str);
        hashMap.put(p.KEY_DEVICE_TYPE, "2");
        a.a(b.DESKTOP_ROUTER_LINK_API, "1.0", hashMap, false, new c() { // from class: tb.khq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.desktop.common.request.c
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                kif.a("LinkRouterService onSuccess response: " + str2);
                khq.a(khq.this, str2);
            }

            @Override // com.taobao.desktop.common.request.c
            public void a(String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                kif.a("LinkRouterService onError retMsg: " + str3);
            }
        }, null);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        String string = JSONObject.parseObject(str).getString("h5Url");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        Nav.from(this.f30081a).toUri(string);
        kif.a("LinkRouterService nav success url: " + string);
    }
}
