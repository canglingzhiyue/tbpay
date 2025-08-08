package com.taobao.android.detail.core.aura.extension.event.openUrl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.jsbridge.e;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.AURAWVJsBridgePlugin;
import com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.detail.core.aura.utils.h;
import com.taobao.android.t;
import com.taobao.search.common.util.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import tb.arc;
import tb.arv;
import tb.avk;
import tb.axk;
import tb.bau;
import tb.dwq;
import tb.emu;
import tb.kge;

@AURAExtensionImpl(code = "alidetail.impl.event.openUrl")
/* loaded from: classes4.dex */
public final class AliDetailOpenUrlEvent extends arv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openUrl";
    public static final String KEY_PARAMS_METHOD = "method";
    public static final String KEY_PARAMS_PAGE_TYPE = "pageType";
    public static final String KEY_PARAMS_PARAM = "params";
    public static final String KEY_PARAMS_QUERY_PARAMS = "queryParams";
    public static final String KEY_PARAMS_URL = "url";
    public static final int KEY_REQUEST_CODE = 100;

    /* renamed from: a  reason: collision with root package name */
    private f f9390a;
    private q b;
    private AURAEventIO c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface PageType {
        public static final String H5 = "H5";
        public static final String NATIVE = "NATIVE";
        public static final String POPLAYER = "POPLAYER";
    }

    static {
        kge.a(-451802578);
    }

    public static /* synthetic */ Object ipc$super(AliDetailOpenUrlEvent aliDetailOpenUrlEvent, String str, Object... objArr) {
        if (str.hashCode() == -1219783041) {
            super.onCreate((q) objArr[0], (f) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.arw
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "openUrl";
    }

    public AliDetailOpenUrlEvent() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlEvent");
    }

    @Override // tb.arv, tb.arl
    public void onCreate(q qVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b74b967f", new Object[]{this, qVar, fVar});
            return;
        }
        super.onCreate(qVar, fVar);
        this.f9390a = fVar;
        this.b = qVar;
        android.taobao.windvane.jsbridge.q.a(AURAWVJsBridgePlugin.BRIDGE_PLUGIN_NAME, (Class<? extends e>) AURAWVJsBridgePlugin.class, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r1.equals("POPLAYER") == false) goto L36;
     */
    @Override // tb.arv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.alibaba.android.aura.service.event.AURAEventIO r12) {
        /*
            r11 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlEvent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r11
            r1[r4] = r12
            java.lang.String r12 = "186833d5"
            r0.ipc$dispatch(r12, r1)
            return
        L15:
            r11.c = r12
            com.alibaba.android.aura.service.event.d r0 = r12.getEventModel()
            com.alibaba.fastjson.JSONObject r0 = r0.c()
            java.lang.String r1 = "AURAOpenUrlEventExtension innerHandleEvent"
            java.lang.String r5 = "AliDetailOpenUrlEvent"
            if (r0 != 0) goto L2f
            tb.ard r12 = tb.arc.a()
            java.lang.String r0 = "eventsFields is null!"
            r12.b(r5, r1, r0)
            return
        L2f:
            java.lang.String r6 = "url"
            java.lang.String r6 = r0.getString(r6)
            boolean r7 = android.text.StringUtils.isEmpty(r6)
            if (r7 == 0) goto L45
            tb.ard r12 = tb.arc.a()
            java.lang.String r0 = "url is null!"
            r12.b(r5, r1, r0)
            return
        L45:
            java.lang.String r7 = "queryParams"
            com.alibaba.fastjson.JSONObject r7 = r0.getJSONObject(r7)
            if (r7 == 0) goto L51
            java.lang.String r6 = com.taobao.android.detail.core.aura.extension.event.openUrl.d.a(r6, r7)
        L51:
            java.lang.String r7 = "pageType"
            java.lang.String r7 = r0.getString(r7)
            boolean r8 = android.text.StringUtils.isEmpty(r7)
            java.lang.String r9 = "NATIVE"
            if (r8 == 0) goto L69
            tb.ard r7 = tb.arc.a()
            java.lang.String r8 = "pageType is null,default set to native"
            r7.b(r5, r1, r8)
            r7 = r9
        L69:
            java.lang.String r1 = r7.toUpperCase()
            java.lang.String r5 = "params"
            com.alibaba.fastjson.JSONObject r5 = r0.getJSONObject(r5)
            r7 = -1
            int r8 = r1.hashCode()
            r10 = -1999289321(0xffffffff88d54417, float:-1.2835479E-33)
            if (r8 == r10) goto L9a
            r9 = 2285(0x8ed, float:3.202E-42)
            if (r8 == r9) goto L90
            r3 = 1446763936(0x563bdda0, float:5.1640137E13)
            if (r8 == r3) goto L87
            goto La2
        L87:
            java.lang.String r3 = "POPLAYER"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La2
            goto La3
        L90:
            java.lang.String r2 = "H5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La2
            r2 = 2
            goto La3
        L9a:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto La2
            r2 = 1
            goto La3
        La2:
            r2 = -1
        La3:
            if (r2 == 0) goto Lb5
            if (r2 == r4) goto Lb1
            java.lang.String r1 = "method"
            java.lang.String r0 = r0.getString(r1)
            r11.a(r12, r6, r0, r5)
            return
        Lb1:
            r11.a(r12, r6, r5)
            return
        Lb5:
            r11.a(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlEvent.b(com.alibaba.android.aura.service.event.AURAEventIO):void");
    }

    public void a(AURAEventIO aURAEventIO, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f625f12", new Object[]{this, aURAEventIO, str, jSONObject});
            return;
        }
        com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b c = c(aURAEventIO);
        AliNavServiceInterface a2 = t.a();
        if (a2 != null) {
            Bundle a3 = a(jSONObject);
            if (c != null) {
                str = d.a(str, c.b());
            }
            a2.a(b().e()).b(100).a(a3).a(str);
        } else {
            arc.a().b("AliDetailOpenUrlEvent", "jumpToNative", "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库");
        }
        if (c == null) {
            arc.a().b("AliDetailOpenUrlEvent", "openUrlHandle", "openUrlResult is null");
            return;
        }
        b.a a4 = c.a();
        if (a4 == null) {
            arc.a().b("AliDetailOpenUrlEvent", "openUrlHandle", "mOpenUrlCallback is null");
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
                d.a(bundle, str, jSONObject.get(str));
            }
        }
        return bundle;
    }

    private com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b c(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b) ipChange.ipc$dispatch("ad57e76a", new Object[]{this, aURAEventIO});
        }
        com.alibaba.android.aura.service.event.d eventModel = aURAEventIO.getEventModel();
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
        f fVar = this.f9390a;
        if (fVar != null) {
            return fVar.b(axk.class);
        }
        return null;
    }

    private void a(AURAEventIO aURAEventIO, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c171208", new Object[]{this, aURAEventIO, str, str2, jSONObject});
            return;
        }
        com.alibaba.android.aura.taobao.adapter.extension.event.openUrl.b c = c(aURAEventIO);
        if (c != null) {
            str = d.a(str, c.b());
        }
        String b = b(jSONObject);
        if (b == null) {
            str2 = "get";
        } else if (StringUtils.isEmpty(str2)) {
            str2 = "post";
        }
        Context e = b().e();
        AliNavServiceInterface a2 = t.a();
        if (!"get".equals(str2)) {
            JSONObject c2 = c(b);
            if (a2 != null) {
                a2.a(e).b(100).a(b(b)).a(a2.a(e).a(str, c2));
            } else {
                arc.a().b("AliDetailOpenUrlEvent", "jumpToH5", "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库");
            }
        } else if (a2 != null) {
            a2.a(e).b(100).a(str);
        }
        a("H5", new b(this.b, this.c));
    }

    private Bundle b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("43d4eb77", new Object[]{this, str});
        }
        Bundle bundle = new Bundle();
        String encode = Uri.encode(str);
        bundle.putString("postdata", "data=" + encode);
        bundle.putBoolean("isPostUrl", true);
        return bundle;
    }

    private JSONObject c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c68059d4", new Object[]{this, str});
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
        q qVar = this.b;
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
        g.a(100, new avk.a() { // from class: com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlEvent.1
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
                    arc.a().c("AliDetailOpenUrlEvent", "openUrlHandle", th.getMessage());
                }
            }
        });
    }

    public void a(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (Uri.parse(str).getScheme() == null) {
                str = k.HTTPS_PREFIX + parse.getSchemeSpecificPart();
            }
            try {
                String str2 = "poplayer://abcd?openType=directly&uuid=" + System.currentTimeMillis() + "&params=" + URLEncoder.encode(String.format("{\"url\":\"%s\"}", str), "UTF-8");
                AliNavServiceInterface a2 = t.a();
                if (a2 == null) {
                    return;
                }
                a2.a(b().e()).a(str2);
            } catch (Throwable th) {
                arc.a().c("AliDetailOpenUrlEvent", "jumpToPoplayer", th.toString());
                com.alibaba.android.aura.b bVar = new com.alibaba.android.aura.b(1, dwq.AURA_MODULE_NAME, "openUrlPopLayerFailed", "jumpToPoplayer failed");
                bVar.a(new HashMap<String, Object>() { // from class: com.taobao.android.detail.core.aura.extension.event.openUrl.AliDetailOpenUrlEvent.2
                    {
                        put(com.taobao.android.weex_framework.util.a.ATOM_stack, Log.getStackTraceString(th));
                    }
                });
                h.a(b().e(), bVar);
            }
        }
    }
}
