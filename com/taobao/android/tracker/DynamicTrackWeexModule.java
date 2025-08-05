package com.taobao.android.tracker;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.tracker.b;
import com.taobao.android.tracker.util.c;
import com.taobao.android.tracker.wvplugin.DynamicTrackerPlugin;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;
import java.util.Map;
import tb.jjj;
import tb.kge;

/* loaded from: classes6.dex */
public class DynamicTrackWeexModule extends WXModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_FOR_LITE = "Lite";

    static {
        kge.a(1177204643);
    }

    public static /* synthetic */ Object ipc$super(DynamicTrackWeexModule dynamicTrackWeexModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1893695439) {
            super.onActivityCreate();
            return null;
        } else if (hashCode != -17468269) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onActivityDestroy();
            return null;
        }
    }

    @JSMethod(uiThread = true)
    public void enterPage(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c069337", new Object[]{this, map});
        } else if (map == null) {
        } else {
            jjj d = a.a().d();
            if (d != null && d.a()) {
                d.a(map);
            }
            c.a("DynamicTracker=====", TBBuyPreloadScene.ENTER_PAGE);
            c.a("enterPage  end");
        }
    }

    @JSMethod(uiThread = true)
    public void updateConfig(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfb8e18", new Object[]{this, obj, str});
            return;
        }
        String str2 = null;
        if (obj != null) {
            try {
                if (obj instanceof JSONObject) {
                    str2 = ((JSONObject) obj).toJSONString();
                }
            } catch (Exception unused) {
            }
        }
        DynamicTrackerPlugin.updateConfig(str2);
        hookView(str);
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f208031", new Object[]{this});
        } else {
            super.onActivityCreate();
        }
    }

    @Override // com.taobao.weex.common.WXModule
    public void onActivityDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef57493", new Object[]{this});
        } else {
            super.onActivityDestroy();
        }
    }

    private void hookView(String str) {
        jjj d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a656f9", new Object[]{this, str});
        } else if (this.mWXSDKInstance == null || TextUtils.isEmpty(str) || !TYPE_FOR_LITE.equalsIgnoreCase(str)) {
        } else {
            Context O = this.mWXSDKInstance.O();
            if (O != null && (O instanceof Activity)) {
                final Activity activity = (Activity) O;
                if (b.a(activity) != null) {
                    return;
                }
                final String ak = this.mWXSDKInstance.ak();
                if (TextUtils.isEmpty(ak) || (d = a.a().d()) == null) {
                    return;
                }
                d.b(ak, new b.a() { // from class: com.taobao.android.tracker.DynamicTrackWeexModule.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.tracker.b.a
                    public void a(String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                            return;
                        }
                        c.a("DynamicTrackWeexModule onUpdateConfigEnd");
                        if (activity == null) {
                            return;
                        }
                        b bVar = new b();
                        bVar.c(activity, ak);
                        c.a("DynamicTrackWeexModule initCustomIntercept  end");
                        b.a(activity, bVar);
                    }
                });
                return;
            }
            c.a("DynamicTrackWeexModule enterPageWithCallback   context 不是activity");
        }
    }
}
