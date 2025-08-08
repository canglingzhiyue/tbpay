package com.taobao.cameralink.miniapp.skincamera.biz;

import android.app.Activity;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cameralink.miniapp.MiniAppContainerView;
import java.lang.ref.WeakReference;
import tb.kfr;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class b implements IEmbedCallback, com.taobao.android.artry.dycontainer.b, com.taobao.cameralink.miniapp.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String b;

    /* renamed from: a */
    public a f16909a = new a();
    private com.taobao.cameralink.miniapp.b c;
    private JSONObject d;
    private IEmbedView e;
    private kfr f;
    private boolean g;

    /* renamed from: lambda$hxIHXZxi-mmkPMEhVo1iugPixmE */
    public static /* synthetic */ void m1053lambda$hxIHXZximmkPMEhVo1iugPixmE(b bVar, WVCallBackContext wVCallBackContext) {
        bVar.b(wVCallBackContext);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
    public void onResponse(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
        }
    }

    public static /* synthetic */ void a(b bVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c02cdc", new Object[]{bVar});
        } else {
            bVar.c();
        }
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d046217c", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.g = z;
        return z;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : b;
    }

    static {
        kge.a(1446742207);
        kge.a(-648967060);
        kge.a(1427173061);
        kge.a(302583095);
        b = b.class.getSimpleName();
    }

    public void a(kfr kfrVar, IEmbedView iEmbedView, Activity activity, MiniAppContainerView miniAppContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("442b704e", new Object[]{this, kfrVar, iEmbedView, activity, miniAppContainerView});
            return;
        }
        this.e = iEmbedView;
        this.f = kfrVar;
        this.f16909a.f16908a = new WeakReference<>(activity);
        this.f16909a.b = new WeakReference<>(miniAppContainerView);
        this.f16909a.c = this;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f16909a.a(str);
        }
    }

    @Override // com.taobao.cameralink.miniapp.b
    public void a(JSONObject jSONObject) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.d = jSONObject;
        this.f.post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.biz.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    b.b();
                    b.a(b.this);
                } catch (Throwable unused) {
                    b.b();
                }
            }
        });
    }

    private void c() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        StringUtils.equals(this.d.getString("devicePosition"), "front");
        if (!this.g) {
            return;
        }
        this.d.put("camera_link_view_container_key", (Object) this.f16909a.d);
        this.c.a(this.d);
    }

    @Override // com.taobao.android.artry.dycontainer.b
    public boolean onAction(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5683d51", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        String str3 = "life cycle: invoking onAction of webview, the action is [" + str + "] the param is [" + str2 + riy.ARRAY_END_STR;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1824838201:
                    if (str.equals("stopCamera")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1244921198:
                    if (str.equals("skinDetectStatus")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1490029383:
                    if (str.equals("postMessage")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1953047079:
                    if (str.equals("startCamera")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                this.f.post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.biz.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        b.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        b.a(b.this, true);
                        b.b();
                        try {
                            b.a(b.this);
                        } catch (Throwable unused) {
                            b.b();
                        }
                    }
                });
                wVCallBackContext.success();
            } else if (c == 1) {
                a(wVCallBackContext);
            } else if (c == 2) {
                wVCallBackContext.success();
            } else if (c == 3) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("postMessage", (Object) JSON.parseObject(str2));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("errorMessage", (Object) jSONObject);
                this.e.sendEvent("error", jSONObject2, null);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error();
            return false;
        }
    }

    @Override // com.taobao.cameralink.miniapp.b
    public void a() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        a((WVCallBackContext) null);
        this.f16909a.a();
    }

    private void a(final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca15efa5", new Object[]{this, wVCallBackContext});
            return;
        }
        try {
            this.f.post(new Runnable() { // from class: com.taobao.cameralink.miniapp.skincamera.biz.-$$Lambda$b$hxIHXZxi-mmkPMEhVo1iugPixmE
                @Override // java.lang.Runnable
                public final void run() {
                    b.m1053lambda$hxIHXZximmkPMEhVo1iugPixmE(b.this, wVCallBackContext);
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error();
        }
    }

    public /* synthetic */ void b(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa9f8a6", new Object[]{this, wVCallBackContext});
            return;
        }
        this.g = false;
        try {
            d();
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.success();
        } catch (Throwable th) {
            th.printStackTrace();
            if (wVCallBackContext == null) {
                return;
            }
            wVCallBackContext.error();
        }
    }

    private void d() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        com.taobao.cameralink.miniapp.b bVar = this.c;
        if (bVar == null) {
            return;
        }
        bVar.a();
        this.c = null;
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else {
            this.f16909a.a(str, jSONObject);
        }
    }
}
