package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.e;
import android.text.TextUtils;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.arc;
import tb.arv;
import tb.avk;
import tb.axk;
import tb.axl;
import tb.bar;
import tb.bau;
import tb.kge;

@AURAExtensionImpl(code = AURAOpenUrlEvent.CODE)
/* loaded from: classes2.dex */
public final class AURAOpenUrlEvent extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.event.openUrl";
    public static final String EVENT_TYPE = "openUrl";
    public static final String KEY_PARAMS_METHOD = "method";
    public static final String KEY_PARAMS_PAGE_TYPE = "pageType";
    public static final String KEY_PARAMS_PARAM = "params";
    public static final String KEY_PARAMS_QUERY_PARAMS = "queryParams";
    public static final String KEY_PARAMS_URL = "url";
    public static final int KEY_REQUEST_CODE = 100;

    /* renamed from: a  reason: collision with root package name */
    private AURAJsStandardEventListener f2199a;
    private f b;
    private q c;
    private AURAEventIO d;
    private boolean e;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface PageType {
        public static final String H5 = "H5";
        public static final String NATIVE = "NATIVE";
    }

    static {
        kge.a(1537346717);
    }

    public static /* synthetic */ Object ipc$super(AURAOpenUrlEvent aURAOpenUrlEvent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -1219783041) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openUrl";
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.b = fVar;
        this.c = qVar;
        this.e = bar.a("enableOpenUrlReplace", true);
        android.taobao.windvane.jsbridge.q.a(AURAWVJsBridgePlugin.BRIDGE_PLUGIN_NAME, (Class<? extends e>) AURAWVJsBridgePlugin.class, true);
        this.f2199a = new AURAJsStandardEventListener();
        AURAJsStandardEventListener.a(this.f2199a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r1.equals("H5") == false) goto L41;
     */
    @Override // tb.arv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.android.aura.service.event.AURAEventIO r10) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.AURAOpenUrlEvent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r10 = "186833d5"
            r0.ipc$dispatch(r10, r1)
            return
        L15:
            r9.d = r10
            com.alibaba.android.aura.service.event.d r0 = r10.getEventModel()
            com.alibaba.fastjson.JSONObject r0 = r0.c()
            java.lang.String r1 = "AURAOpenUrlEventExtension innerHandleEvent"
            java.lang.String r4 = "AURAOpenUrlEventExtension"
            if (r0 != 0) goto L2f
            tb.ard r10 = tb.arc.a()
            java.lang.String r0 = "eventsFields is null!"
            r10.b(r4, r1, r0)
            return
        L2f:
            java.lang.String r5 = "url"
            java.lang.String r5 = r0.getString(r5)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L47
            tb.ard r10 = tb.arc.a()
            java.lang.String r0 = "url is null!"
            r10.b(r4, r1, r0)
            return
        L47:
            java.lang.String r6 = "queryParams"
            com.alibaba.fastjson.JSONObject r6 = r0.getJSONObject(r6)
            if (r6 == 0) goto L53
            java.lang.String r5 = tb.axl.a(r5, r6)
        L53:
            java.lang.String r6 = "pageType"
            java.lang.String r6 = r0.getString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L69
            tb.ard r10 = tb.arc.a()
            java.lang.String r0 = "pageType is null!"
            r10.b(r4, r1, r0)
            return
        L69:
            java.lang.String r1 = r6.toUpperCase()
            java.lang.String r4 = "params"
            com.alibaba.fastjson.JSONObject r4 = r0.getJSONObject(r4)
            r6 = -1
            int r7 = r1.hashCode()
            r8 = -1999289321(0xffffffff88d54417, float:-1.2835479E-33)
            if (r7 == r8) goto L8b
            r3 = 2285(0x8ed, float:3.202E-42)
            if (r7 == r3) goto L82
            goto L95
        L82:
            java.lang.String r3 = "H5"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L95
            goto L96
        L8b:
            java.lang.String r2 = "NATIVE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L95
            r2 = 0
            goto L96
        L95:
            r2 = -1
        L96:
            if (r2 == 0) goto La2
            java.lang.String r10 = "method"
            java.lang.String r10 = r0.getString(r10)
            r9.a(r5, r10, r4)
            goto La5
        La2:
            r9.a(r10, r5, r4)
        La5:
            java.lang.String r10 = "isReplace"
            java.lang.String r10 = r0.getString(r10)
            if (r10 == 0) goto Lc5
            java.lang.String r0 = "true"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto Lc5
            boolean r10 = r9.e
            if (r10 == 0) goto Lc5
            com.alibaba.android.aura.q r10 = r9.b()
            android.content.Context r10 = r10.e()
            tb.fke.a(r10)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.AURAOpenUrlEvent.b(com.alibaba.android.aura.service.event.AURAEventIO):void");
    }

    public void a(AURAEventIO aURAEventIO, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f625f12", new Object[]{this, aURAEventIO, str, jSONObject});
            return;
        }
        b c = c(aURAEventIO);
        AliNavServiceInterface a2 = t.a();
        if (a2 != null) {
            Bundle a3 = a(jSONObject);
            if (c != null) {
                str = axl.a(str, c.b());
            }
            a2.a(b().e()).b(100).a(a3).a(str);
        } else {
            arc.a().b("AURAOpenUrlEventExtension", "jumpToNative", "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库");
        }
        if (c == null) {
            arc.a().b("AURAOpenUrlEventExtension", "openUrlHandle", "openUrlResult is null");
            return;
        }
        b.a a4 = c.a();
        if (a4 == null) {
            arc.a().b("AURAOpenUrlEventExtension", "openUrlHandle", "mOpenUrlCallback is null");
        } else {
            a("NATIVE", a4);
        }
    }

    private Bundle a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("2604864c", new Object[]{this, jSONObject});
        }
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                axl.a(bundle, str, jSONObject.get(str));
            }
        }
        return bundle;
    }

    private b c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("ad57e76a", new Object[]{this, aURAEventIO});
        }
        d eventModel = aURAEventIO.getEventModel();
        AURARenderComponent d = eventModel.d();
        if (d == null) {
            return null;
        }
        List<axk> f = f();
        if (bau.a(f)) {
            return null;
        }
        for (axk axkVar : f) {
            if (axkVar.a(d).contains(eventModel.i())) {
                return axkVar.a(d, aURAEventIO);
            }
        }
        return null;
    }

    private List<axk> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        f fVar = this.b;
        if (fVar != null) {
            return fVar.b(axk.class);
        }
        return null;
    }

    private void a(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2bf4cf4", new Object[]{this, str, str2, jSONObject});
            return;
        }
        String b = b(jSONObject);
        if (b == null) {
            str2 = "get";
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "post";
        }
        Context e = b().e();
        AliNavServiceInterface a2 = t.a();
        if (!"get".equals(str2)) {
            JSONObject b2 = b(b);
            if (a2 != null) {
                a2.a(e).b(100).a(a(b)).a(a2.a(e).a(str, b2));
            } else {
                arc.a().b("AURAOpenUrlEventExtension", "jumpToH5", "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库");
            }
        } else if (a2 != null) {
            a2.a(e).b(100).a(str);
        }
        a("H5", new c(this.c, this.d));
    }

    private Bundle a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("b734c076", new Object[]{this, str});
        }
        Bundle bundle = new Bundle();
        String encode = Uri.encode(str);
        bundle.putString("postdata", "data=" + encode);
        bundle.putBoolean("isPostUrl", true);
        return bundle;
    }

    private JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9d2c0493", new Object[]{this, str});
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.getString("__oldComponent");
    }

    private avk g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (avk) ipChange.ipc$dispatch("3d2c6542", new Object[]{this});
        }
        q qVar = this.c;
        if (qVar != null) {
            return (avk) qVar.a(avk.USERDATA_KEY_ACTIVITY_RESULT, avk.class);
        }
        return null;
    }

    private void a(final String str, final b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02e0c55", new Object[]{this, str, aVar});
            return;
        }
        final avk g = g();
        if (g == null) {
            return;
        }
        g.a(100, new avk.a() { // from class: com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.AURAOpenUrlEvent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.avk.a
            public void a(int i, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d12ba58", new Object[]{this, new Integer(i), intent});
                    return;
                }
                g.a(100);
                try {
                    if (i == -1) {
                        aVar.a(str, intent);
                    } else {
                        aVar.b(str, intent);
                    }
                } catch (Throwable th) {
                    arc.a().c("AURAOpenUrlEventExtension", "openUrlHandle", th.getMessage());
                }
            }
        });
    }

    @Override // tb.arv, tb.arl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        AURAJsStandardEventListener.b(this.f2199a);
    }
}
