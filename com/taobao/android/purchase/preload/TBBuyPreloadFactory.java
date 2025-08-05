package com.taobao.android.purchase.preload;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.purchase.aura.helper.c;
import java.io.File;
import java.util.Map;
import tb.arc;
import tb.bbc;
import tb.bbh;
import tb.ifz;
import tb.jdb;
import tb.jde;
import tb.jdf;
import tb.kge;
import tb.meo;

/* loaded from: classes6.dex */
public class TBBuyPreloadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "bizName";
    public static final String FROM = "from";

    /* renamed from: a  reason: collision with root package name */
    public static bd f14761a;

    static {
        kge.a(-1150402984);
    }

    @TradeHybridCustomAnnotation
    public static void a(Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ea64ffc", new Object[]{context, str, str2, jSONObject});
            return;
        }
        char c = 65535;
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1981035137) {
                if (hashCode != -307051014) {
                    if (hashCode == 58688523 && str.equals(UltronTradeHybridStage.ON_CONTAINER_RESUME)) {
                        c = 2;
                    }
                } else if (str.equals(UltronTradeHybridStage.ON_TAB_CHANGE)) {
                    c = 1;
                }
            } else if (str.equals(UltronTradeHybridStage.ON_DATA_CHANGED)) {
                c = 0;
            }
            if (c == 0) {
                if (!"tabCart".equals(str2)) {
                    return;
                }
                a(context, TBBuyPreloadScene.DATA_CHANGED, str2, (Map<String, Object>) jSONObject);
            } else if (c == 1) {
                if ("tabCart".equals(str2)) {
                    return;
                }
                a(context, TBBuyPreloadScene.EXIT_PAGE, str2, (Map<String, Object>) jSONObject);
            } else if (c == 2) {
                if (!"tabCart".equals(str2)) {
                    return;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject.put("from", (Object) str2);
                jSONObject.put("bizName", (Object) str2);
                a(context, TBBuyPreloadScene.ENTER_PAGE, str2, (Map<String, Object>) jSONObject);
            } else {
                a(context, str, str2, (Map<String, Object>) jSONObject);
            }
        } catch (Throwable th) {
            ifz.a("PRELOAD_EXCEPTION", th.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.purchase.preload.TBBuyPreloadFactory.a(android.content.Context, java.lang.String, java.lang.String, java.util.Map):void");
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        d.a();
        c.e();
        b.a("purchase");
        jde.f29469a = false;
        f14761a = null;
        TBBuyPreRequest.a();
        a.a();
    }

    private static void a(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (!AliBuyPerfSwitcher.enablePreRender() && !new File("/data/local/tmp/.preloadDX").exists()) {
        } else {
            if (f14761a == null) {
                bd a2 = jdb.a();
                f14761a = a2;
                meo.a(a2);
                meo.b(f14761a);
                jdf.c(f14761a);
                jdf.b(f14761a);
                jdf.a(f14761a);
            }
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.preload.c$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    boolean z = false;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (TBBuyPreloadFactory.f14761a == null) {
                    } else {
                        Context context2 = context;
                        bd bdVar = TBBuyPreloadFactory.f14761a;
                        if (new File("/data/local/tmp/.preRenderDX").exists() || Boolean.parseBoolean(com.taobao.android.purchase.aura.utils.e.a("enablePreRenderDX", "true"))) {
                            z = true;
                        }
                        jde.a(context2, bdVar, z);
                    }
                }
            });
        }
    }

    private static void a(final Context context, final Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df32b25", new Object[]{context, map});
        } else if (!AliBuyPerfSwitcher.enablePrefetch()) {
        } else {
            bbh.a(new Runnable() { // from class: com.taobao.android.purchase.preload.c$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Intent intent = (Intent) bbc.a(map, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, Intent.class, null);
                    Boolean bool = (Boolean) bbc.a(map, "fullScreen", Boolean.class, null);
                    if (intent == null || bool == null) {
                        Toast.makeText(context, "请加入 intent 和 fullScreen 参数", 1).show();
                        return;
                    }
                    arc.a().b("enablePrefetch true");
                    TBBuyPreRequest.a(context, intent, bool.booleanValue());
                }
            });
        }
    }

    private static void preRequestV2(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4da0d64c", new Object[]{context, map});
        } else if (!AliBuyPerfSwitcher.enablePrefetchV2()) {
        } else {
            Bundle bundle = (Bundle) bbc.a(map, "bundle", Bundle.class, null);
            if (bundle == null) {
                Toast.makeText(context, "请加入 intent 和 fullScreen 参数", 1).show();
                return;
            }
            Intent intent = new Intent();
            intent.putExtras(bundle);
            arc.a().b("enablePrefetch true");
            TBBuyPreRequest.a(context, intent);
        }
    }

    private static void b(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2893eda6", new Object[]{context, map});
            return;
        }
        String str = (String) bbc.a(map, "bizName", String.class, "purchase");
        String str2 = (String) bbc.a(map, "from", String.class, "iCartChanged");
        if (str == null || str2 == null) {
            Toast.makeText(context, "请加入 model 和 from 参数", 1).show();
        } else {
            b.a(context, str, str2);
        }
    }
}
