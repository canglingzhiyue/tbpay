package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.e;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes7.dex */
public class ngj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private AppController f31440a;
    private PageModel b;
    private ngk c;
    private Map<String, Object> d;

    static {
        kge.a(-2090985759);
        TAG = ngj.class.getSimpleName();
    }

    public ngj a(AppController appController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngj) ipChange.ipc$dispatch("93c75e9f", new Object[]{this, appController});
        }
        this.f31440a = appController;
        return this;
    }

    public ngj a(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngj) ipChange.ipc$dispatch("9af75e99", new Object[]{this, pageModel});
        }
        this.b = pageModel;
        return this;
    }

    public ngj a(ngk ngkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngj) ipChange.ipc$dispatch("cb69204f", new Object[]{this, ngkVar});
        }
        this.c = ngkVar;
        return this;
    }

    public ngj a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngj) ipChange.ipc$dispatch("24b3aa18", new Object[]{this, map});
        }
        this.d = map;
        return this;
    }

    public nfz a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("f08339c", new Object[]{this});
        }
        nfz b = b();
        if (b instanceof nfv) {
            ((nfv) b).s();
        }
        return b;
    }

    public nfz b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (nfz) ipChange.ipc$dispatch("16b9d8fb", new Object[]{this});
        }
        if (this.f31440a == null || this.b == null) {
            throw new IllegalArgumentException("required arguments are not be set.");
        }
        nga f = p.b().f();
        if (f != null) {
            AppController appController = this.f31440a;
            PageModel pageModel = this.b;
            nfz a2 = f.a(appController, pageModel, pageModel._type, this.d);
            if (a2 != null) {
                ngr.b(TAG, "create page view via pageViewFactory");
                return a2;
            }
        }
        nfv nfvVar = new nfv();
        ngb d = p.b().d();
        ngf ngfVar = null;
        if (d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("fullUrl", this.f31440a.t().toString());
            ngfVar = d.a(this.f31440a, this.b, null, hashMap);
            if (ngfVar != null) {
                ngfVar.a(this.f31440a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", (Object) this.f31440a.t().toString());
                jSONObject.put("innerUrl", (Object) this.b.getUrl());
                this.f31440a.P().a(nfc.PHA_MONITOR_MODULE_POINT_PRERENDER_WEBVIEW, jSONObject);
            }
            if (ngfVar != null) {
                z = true;
            }
        }
        if (ngfVar == null) {
            e e = this.f31440a.e();
            if (e != null && (ngfVar = e.getH5WebView(this.b)) != null) {
                ngfVar.a(this.f31440a);
            }
            if (ngfVar == null) {
                ngh l = p.b().l();
                if (ngfVar == null && l != null && (ngfVar = l.a((Context) Objects.requireNonNull(this.f31440a.C()), this.b._type, this.d)) != null) {
                    ngfVar.a(this.f31440a);
                }
            }
        }
        if (ngfVar == null) {
            throw new IllegalArgumentException("webView should not be null");
        }
        nfvVar.a(this.f31440a);
        nfvVar.a(this.b);
        nfvVar.a(ngfVar);
        nfvVar.a(z);
        ngk ngkVar = this.c;
        if (ngkVar != null) {
            nfvVar.a(ngkVar);
        }
        return nfvVar;
    }
}
