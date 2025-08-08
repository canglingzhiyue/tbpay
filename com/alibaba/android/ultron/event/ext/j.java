package com.alibaba.android.ultron.event.ext;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.Toast;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DataPrefetchCache;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tb.bga;
import tb.bxb;
import tb.cts;
import tb.dsm;
import tb.ibl;
import tb.ibn;
import tb.iro;
import tb.jpx;
import tb.jqg;
import tb.kge;
import tb.spk;

/* loaded from: classes2.dex */
public class j extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_OPEN_URL_H5_OLD_COMPONENT = "__oldComponent";
    public static final String KEY_H5_DATA_PREFIX = "data=";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_H5_QUERY_DATA = "querydata";
    public static final String KEY_MAIN_BIZ_NAME = "ultronTrade";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_LOGISTICS_WEEX2_FRAGMENT = "logisticsWeex2Fragment";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_POPLAYER = "PopLayer";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";
    public static final String TYPE_OPEN_URL_WEEX2_FRAGMENT = "weex2Fragment";
    private OrderConfigs l;

    /* renamed from: a  reason: collision with root package name */
    public int f2593a = 100;
    private int b = 204800;
    private final Handler m = new Handler(Looper.getMainLooper());

    static {
        kge.a(1371232156);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ OrderConfigs a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("ae37993c", new Object[]{jVar}) : jVar.l;
    }

    public static /* synthetic */ void a(j jVar, Activity activity, UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae41616", new Object[]{jVar, activity, ultronWeex2DialogFragment});
        } else {
            jVar.b(activity, ultronWeex2DialogFragment);
        }
    }

    public static /* synthetic */ Handler b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("d951e99b", new Object[]{jVar}) : jVar.m;
    }

    public j(OrderConfigs orderConfigs) {
        a();
        this.l = orderConfigs;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @Override // com.alibaba.android.ultron.event.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.android.ultron.event.base.e r17) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.event.ext.j.a(com.alibaba.android.ultron.event.base.e):void");
    }

    public void a(String str, JSONObject jSONObject, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d490e348", new Object[]{this, str, jSONObject, str2});
        } else {
            a(str, jSONObject, str2, (JSONObject) null);
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f4e0a8", new Object[]{this, str, jSONObject, str2, jSONObject2});
            return;
        }
        String str3 = null;
        if (jSONObject != null) {
            str3 = jSONObject.getString("__oldComponent");
        }
        if (StringUtils.isEmpty(str2)) {
            str2 = "post";
        }
        if (str3 == null || jSONObject == null) {
            str2 = "get";
        }
        Bundle bundle = new Bundle();
        if (jSONObject2 != null) {
            try {
                bundle.putSerializable("initData", jSONObject2);
            } catch (Exception unused) {
                UnifyLog.d("OrderOpenUrlSubscriber.jumpToH5WithInitData", "put initData error");
            }
        }
        if ("get".equals(str2)) {
            if (jSONObject2 == null) {
                com.taobao.android.t.a().a(this.d).b(this.f2593a).a(str);
                return;
            } else {
                com.taobao.android.t.a().a(this.d).b(this.f2593a).a(bundle).a(str);
                return;
            }
        }
        bundle.putBoolean("isPostUrl", true);
        if (str3 != null) {
            try {
                String encode = Uri.encode(str3);
                bundle.putString("postdata", "data=" + encode);
            } catch (Exception e) {
                UnifyLog.a(this.f.h(), "OrderOpenUrlSubscriber", "oldComponent encode 失败", str3);
                bga.a.a(this.f.h(), "OrderOpenUrlSubscriber.jumpToH5", e);
            }
        }
        try {
            jSONObject3 = JSON.parseObject(str3);
        } catch (Throwable unused2) {
            jSONObject3 = new JSONObject();
        }
        com.taobao.android.t.a().a(this.d).b(this.f2593a).a(bundle).a(com.taobao.android.t.a().a(this.d).a(str, jSONObject3));
    }

    private String c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c89e164", new Object[]{this, str, jSONObject});
        }
        if (StringUtils.isEmpty(str) || jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (entry != null && !StringUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                if (!StringUtils.isEmpty(str2)) {
                    Object obj = jSONObject.get(str2);
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    }
                }
            }
        }
        AliNavServiceInterface a2 = com.taobao.android.t.a();
        if (a2 != null) {
            a2.a(this.d).b(this.f2593a).a(bundle).a(str);
        } else if (jpx.a(this.d)) {
            Toast.makeText(this.d, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
        }
    }

    public void b(String str, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676c0fdd", new Object[]{this, str, jSONObject});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            if (Uri.parse(str).getScheme() == null) {
                str = com.taobao.search.common.util.k.HTTPS_PREFIX + parse.getSchemeSpecificPart();
            }
            try {
                String str2 = "poplayer://abcd?openType=directly&uuid=" + System.currentTimeMillis() + "&params=" + URLEncoder.encode(String.format("{\"url\":\"%s\"}", str), "UTF-8");
                AliNavServiceInterface a2 = com.taobao.android.t.a();
                if (a2 != null) {
                    a2.a(this.d).a(str2);
                } else if (!jpx.a(this.d)) {
                } else {
                    Toast.makeText(this.d, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
                }
            } catch (Throwable th) {
                UnifyLog.a(this.f.h(), "OrderOpenUrlSubscriber", "jumpToPoplayer error: " + Log.getStackTraceString(th), new String[0]);
                bga.a.a(this.f.h(), "OrderOpenUrlSubscriber.jumpToPoplayer", th);
            }
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (str == null || str.length() < this.b) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("intent_size", String.valueOf(str.length()));
            UmbrellaTracker.commitFailureStability("umbrella.event.openurl", "ultron.trade.open.url", "1.0", "ultronTrade", "biz_unknow", hashMap, "FAIL_BINDER_TRANSATION", "intent has to many data in jump to native");
        }
    }

    private boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        return (StringUtils.equals(parse.getHost(), "meta.m.taobao.com") || StringUtils.equals(parse.getHost(), "meta.wapa.taobao.com")) && (StringUtils.equals(parse.getPath(), "/app/tb-trade/super-odetail/home") || StringUtils.equals(parse.getPath(), "/app/tb-trade/odetail/home"));
    }

    private boolean d(String str) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{this, str})).booleanValue();
        }
        if (StringUtils.isEmpty(str) || (parse = Uri.parse(str)) == null) {
            return false;
        }
        return (StringUtils.equals(parse.getHost(), "meta.m.taobao.com") || StringUtils.equals(parse.getHost(), "meta.wapa.taobao.com")) && StringUtils.equals(parse.getPath(), "/app/mtb/logisticsV2/detail");
    }

    private void a(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject, String str2) {
        Context context;
        String string;
        Uri parse;
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fb9b8d", new Object[]{this, eVar, str, jSONObject, str2});
            return;
        }
        Context a2 = eVar.a();
        if (!(a2 instanceof Activity)) {
            jqg.a("OrderOpenUrlSubscriber", "openUltronWeex2DialogFragment", "OnError: context is not a Activity");
            return;
        }
        boolean z = Build.VERSION.SDK_INT >= 19 && com.taobao.android.autosize.l.d(a2);
        UltronWeex2DialogFragment m = this.l.m();
        if (m == null) {
            a(str, jSONObject, str2);
            jqg.a("OrderOpenUrlSubscriber", "openUltronWeex2DialogFragment", "OnError: orderWeex2DialogFragment is null, jump to H5");
            dsm.c(false, cts.a.BIZ_ORDER_DETAIL, "OnError: orderWeex2DialogFragment is null, jump to H5");
            return;
        }
        Pair<JSONObject, String> a3 = a(eVar, m);
        JSONObject jSONObject2 = a3 != null ? (JSONObject) a3.first : null;
        boolean hasRenderReady = m.hasRenderReady();
        boolean hasBizReady = m.hasBizReady();
        boolean hasRenderException = m.hasRenderException();
        if (!hasRenderReady || !hasBizReady || hasRenderException) {
            a(str, jSONObject, str2, b(eVar, jSONObject2));
            String format = String.format("OnError: orderWeex2DialogFragment is not ready, renderReady: %s, bizReady: %s, renderException: %s, isFoldDevice: %s", Boolean.valueOf(hasRenderReady), Boolean.valueOf(hasBizReady), Boolean.valueOf(hasRenderException), Boolean.valueOf(z));
            dsm.b(false, cts.a.BIZ_ORDER_DETAIL, format);
            dsm.c(false, cts.a.BIZ_ORDER_DETAIL, format);
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (!StringUtils.isEmpty(str) && (queryParameterNames = (parse = Uri.parse(str)).getQueryParameterNames()) != null) {
            for (String str3 : queryParameterNames) {
                if (!StringUtils.isEmpty(str3)) {
                    String queryParameter = parse.getQueryParameter(str3);
                    if (!StringUtils.isEmpty(queryParameter)) {
                        jSONObject3.put(str3, (Object) queryParameter);
                    }
                }
            }
        }
        if (jSONObject != null) {
            jSONObject3.putAll(jSONObject);
        }
        if (eVar.d() == null || eVar.d().getFields() == null) {
            context = a2;
        } else {
            JSONObject fields = eVar.d().getFields();
            JSONObject jSONObject4 = fields.getJSONObject("basicInfo");
            if (jSONObject4 != null) {
                String str4 = "";
                if (jSONObject4.getString("orderId") == null) {
                    context = a2;
                    string = str4;
                } else {
                    context = a2;
                    string = jSONObject4.getString("orderId");
                }
                jSONObject3.put("orderId", (Object) string);
                if (jSONObject4.getString("orderLineId") != null) {
                    str4 = jSONObject4.getString("orderLineId");
                }
                jSONObject3.put("orderLineId", (Object) str4);
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    if (a(jSONObject2)) {
                        a(str, jSONObject, str2, jSONObject2);
                        jqg.a("OrderOpenUrlSubscriber", "openUltronWeex2DialogFragment", "OnError: prefetch cacheData need downgrade");
                        dsm.c(false, cts.a.BIZ_ORDER_DETAIL, "OnError: prefetch cacheData need downgrade");
                        return;
                    } else if (m.getBackgroundMessageRecorder().isEmpty()) {
                        jSONObject3.put(ZimMessageChannel.K_RPC_RES, (Object) jSONObject2);
                    }
                }
            } else {
                context = a2;
            }
            jSONObject3.put("preloadParams", (Object) (fields.getJSONObject("queryParams") == null ? new JSONObject() : fields.getJSONObject("queryParams")));
        }
        jSONObject3.put("preRequestType", (Object) (a3 != null ? (String) a3.second : UltronWeex2DataPrefetchCache.CacheType.EXCEPTION.name()));
        boolean z2 = jSONObject3.containsKey(ZimMessageChannel.K_RPC_RES) && jSONObject3.get(ZimMessageChannel.K_RPC_RES) != null;
        dsm.c(z2, cts.a.BIZ_ORDER_DETAIL, z2 ? "OnSuccess!" : "OnError: responseData is null");
        if (z2) {
            bxb.a(bxb.a.b(OrderBizCode.orderList, "odetailPreRequestUsage").a(1).a("预请求数据已使用").a(5.0E-4f));
        }
        m.sendPreRenderMessageToWeex2(jSONObject3);
        a((Activity) context, m);
    }

    private void a(final Activity activity, final UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83c6f734", new Object[]{this, activity, ultronWeex2DialogFragment});
        } else if (ibl.y()) {
            this.m.post(new Runnable() { // from class: com.alibaba.android.ultron.event.ext.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final int f2594a = spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "maxODetailDelayedTransitionCycleCount", 5);
                public int b = 0;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (this.b < this.f2594a && !j.a(j.this).A()) {
                        j.b(j.this).postDelayed(this, 10L);
                        this.b++;
                    } else {
                        jqg.a("OrderOpenUrlSubscriber", "displayOrderWeex2DialogFragment", String.format("cycleCount: %s, isODetailStartTransition: %s", Integer.valueOf(this.b), Boolean.valueOf(j.a(j.this).A())));
                        j.b(j.this).removeCallbacks(this);
                        j.a(j.this).g(false);
                        j.a(j.this, activity, ultronWeex2DialogFragment);
                    }
                }
            });
            jqg.a("OrderOpenUrlSubscriber", "displayOrderWeex2DialogFragment", "enter delayed transition");
        } else {
            b(activity, ultronWeex2DialogFragment);
        }
    }

    private void b(Activity activity, UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49f17ff5", new Object[]{this, activity, ultronWeex2DialogFragment});
            return;
        }
        if (this.l.x() == null) {
            z = false;
        }
        if (z) {
            bxb.a(bxb.a.b(OrderBizCode.orderList, "orderListRebuild").a(1.0f).a("订单列表销毁重建").a(false));
        }
        if (z && spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "enableRemoveReconstructedODetail", false)) {
            ultronWeex2DialogFragment.displayByActivity(activity, this.l.x());
            this.l.a((Bundle) null);
            return;
        }
        ultronWeex2DialogFragment.displayByActivity(activity);
    }

    private JSONObject b(com.alibaba.android.ultron.event.base.e eVar, JSONObject jSONObject) {
        JSONObject fields;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1db0c7ae", new Object[]{this, eVar, jSONObject});
        }
        if (eVar.d() == null || (fields = eVar.d().getFields()) == null || (jSONObject2 = fields.getJSONObject("queryParams")) == null) {
            return jSONObject;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("preloadParams", (Object) jSONObject2);
        return jSONObject;
    }

    private Pair<JSONObject, String> a(com.alibaba.android.ultron.event.base.e eVar, UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("79436b87", new Object[]{this, eVar, ultronWeex2DialogFragment});
        }
        if ((eVar.d() != null || eVar.d().getFields() != null) && (jSONObject = eVar.d().getFields().getJSONObject("basicInfo")) != null) {
            return ibn.a(jSONObject.getString("orderId"), jSONObject.getString("orderLineId"), ultronWeex2DialogFragment.getPrefetchCache());
        }
        return null;
    }

    private boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{this, jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("global");
        return jSONObject2 != null && StringUtils.equals("true", jSONObject2.getString("taoTmDegrade"));
    }

    private void b(com.alibaba.android.ultron.event.base.e eVar, String str, JSONObject jSONObject, String str2) {
        Uri parse;
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e78314e", new Object[]{this, eVar, str, jSONObject, str2});
        } else if (!ibl.z()) {
            jqg.a("OrderOpenUrlSubscriber", "openLogisticsWeex2Fragment", "OnError: switcher is off");
            a(str, jSONObject, str2);
        } else {
            Context a2 = eVar.a();
            if (!(a2 instanceof Activity)) {
                jqg.a("OrderOpenUrlSubscriber", "openLogisticsWeex2Fragment", "OnError: context is not a Activity");
                return;
            }
            UltronWeex2DialogFragment B = this.l.B();
            if (B == null) {
                jqg.a("OrderOpenUrlSubscriber", "openLogisticsWeex2Fragment", "OnError: openLogisticsWeex2Fragment is null, jump to H5");
                a(str, jSONObject, str2);
                return;
            }
            boolean hasRenderReady = B.hasRenderReady();
            boolean hasBizReady = B.hasBizReady();
            boolean hasRenderException = B.hasRenderException();
            if (!hasRenderReady || !hasBizReady || hasRenderException) {
                a(str, jSONObject, str2);
                dsm.b(false, cts.a.BIZ_LOGISTICS, String.format("OnError: openLogisticsWeex2Fragment is not ready, renderReady: %s, bizReady: %s, renderException: %s, isFoldDevice: %s", Boolean.valueOf(hasRenderReady), Boolean.valueOf(hasBizReady), Boolean.valueOf(hasRenderException), Boolean.valueOf(Build.VERSION.SDK_INT >= 19 && com.taobao.android.autosize.l.d(a2))));
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (!StringUtils.isEmpty(str) && (queryParameterNames = (parse = Uri.parse(str)).getQueryParameterNames()) != null) {
                for (String str3 : queryParameterNames) {
                    if (!StringUtils.isEmpty(str3)) {
                        String queryParameter = parse.getQueryParameter(str3);
                        if (!StringUtils.isEmpty(queryParameter)) {
                            jSONObject2.put(str3, (Object) queryParameter);
                        }
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.putAll(jSONObject);
            }
            B.sendPreRenderMessageToWeex2(jSONObject2);
            b((Activity) a2, B);
        }
    }
}
