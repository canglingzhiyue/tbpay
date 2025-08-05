package com.taobao.taolivecontainer.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.util.m;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.taolivecontainer.b;
import java.util.HashMap;
import java.util.Iterator;
import tb.kge;
import tb.pso;
import tb.psq;
import tb.seh;

/* loaded from: classes8.dex */
public class TBLiveBasePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String NO_ERROR_IS_NOT_TBLIVEH5CONTAINER = "{\"result\":\"is_not_TBLiveH5Container\"}";
    private static final String NO_ERROR_IS_NULL_BUILDER = "{\"result\":\"TBLiveH5Container.Builder is null\"}";
    private static final String NO_FUNCTION = "{\"result\":\"no_function\"}";
    private static final String TAG = "TBLiveBasePlugin";
    private static float sLastGetTemperature;
    private static long sLastGetTemperatureTime;

    public static /* synthetic */ Object ipc$super(TBLiveBasePlugin tBLiveBasePlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        a aVar = new a(str, str2, wVCallBackContext);
        TBLiveH5Container container = getContainer();
        if (container == null) {
            aVar.a(NO_ERROR_IS_NOT_TBLIVEH5CONTAINER);
            return false;
        }
        switch (str.hashCode()) {
            case -996946781:
                if (str.equals("getThermalLevel")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -780995390:
                if (str.equals("NotifyPreRenderStatus")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -153529056:
                if (str.equals("UTShowExpose")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 242587193:
                if (str.equals("getAppInfo")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 723633289:
                if (str.equals("UTControlClicked")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1536672141:
                if (str.equals("renderSuccess")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            if (container.getBuilder() != null) {
                pso c2 = container.getBuilder().c();
                tlog(c2, "UTShowExpose", str2);
                JSONObject b = psq.b(str2);
                if (b != null) {
                    String string = b.getString("pageName");
                    String string2 = b.getString("arg1");
                    HashMap<String, String> a2 = psq.a(b.getJSONObject("args"));
                    if (TextUtils.isEmpty(string)) {
                        string = b.PAGE_TAOBAOLIVECONTAINER;
                    }
                    c2.b(string, string2, a2);
                    aVar.a();
                    return true;
                }
                aVar.a("parseObject fail");
                tlog(c2, "UTShowExpose", "parseObject fail");
                return false;
            }
            aVar.a(NO_ERROR_IS_NULL_BUILDER);
            return false;
        } else if (c == 1) {
            if (container.getBuilder() != null) {
                pso c3 = container.getBuilder().c();
                tlog(c3, "UTControlClicked", str2);
                JSONObject b2 = psq.b(str2);
                if (b2 != null) {
                    String string3 = b2.getString("pageName");
                    String string4 = b2.getString("arg1");
                    HashMap<String, String> a3 = psq.a(b2.getJSONObject("args"));
                    if (TextUtils.isEmpty(string3)) {
                        string3 = b.PAGE_TAOBAOLIVECONTAINER;
                    }
                    c3.a(string3, string4, a3);
                    aVar.a();
                    return true;
                }
                aVar.a("parseObject fail");
                tlog(c3, "UTControlClicked", "parseObject fail");
                return false;
            }
            aVar.a(NO_ERROR_IS_NULL_BUILDER);
            return false;
        } else if (c == 2) {
            m.c(TAG, "NotifyPreRenderStatus");
            if (container.getTag(R.id.taolive_container_prerender_status) == null || container.isAttachedToWindow() || !((Boolean) container.getTag(R.id.taolive_container_prerender_status)).booleanValue()) {
                StringBuilder sb = new StringBuilder();
                sb.append("WebView Attached: " + container.isAttachedToWindow());
                sb.append("params from JS: " + str2.toString());
                m.e(TAG, sb.toString());
                aVar.a("不是预渲染状态");
                return false;
            } else if (container.getBuilder() != null) {
                b builder = container.getBuilder();
                JSONObject b3 = psq.b(str2);
                if (b3 != null && b3.getString("status") != null) {
                    String string5 = b3.getString("status");
                    if ("success".equals(string5)) {
                        builder.a(true, b3);
                    } else {
                        builder.a(false, b3);
                    }
                    if (seh.a(getContext())) {
                        Context context = getContext();
                        Toast.makeText(context, "终端容器预渲染结束，状态：" + string5, 0).show();
                    }
                    aVar.a();
                    return true;
                }
                aVar.a("status is null!");
                return false;
            } else {
                aVar.a(NO_ERROR_IS_NULL_BUILDER);
                return false;
            }
        } else if (c == 3) {
            m.c(TAG, "renderSuccess");
            container.renderSuccess(psq.b(str2));
            return true;
        } else if (c == 4) {
            m.c(TAG, "getAppInfo");
            JSONObject b4 = seh.b(container.getContext());
            if (b4 != null) {
                aVar.b(b4.toJSONString());
            } else {
                aVar.b();
            }
            return true;
        } else if (c == 5) {
            m.c(TAG, "getThermalLevel");
            JSONObject jSONObject = new JSONObject();
            Context context2 = container.getContext();
            long j = 5000;
            if (container.getBuilder() != null && container.getBuilder().f() != null) {
                j = container.getBuilder().f().f;
            }
            JSONObject b5 = psq.b(str2);
            if (context2 != null && b5 != null && b5.containsKey("thresholds")) {
                JSONObject jSONObject2 = b5.getJSONObject("thresholds");
                float temperature = getTemperature(this.mContext, j);
                Iterator<String> it = jSONObject2.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String next = it.next();
                        if (temperature < jSONObject2.getFloat(next).floatValue()) {
                            jSONObject.put("level", (Object) next);
                        }
                    }
                }
            }
            String jSONString = jSONObject.toJSONString();
            aVar.b(jSONString);
            m.e(TAG, "getThermalLevel " + jSONString);
            return true;
        } else {
            aVar.a(NO_FUNCTION);
            return false;
        }
    }

    static {
        kge.a(-75128846);
        sLastGetTemperatureTime = 0L;
        sLastGetTemperature = 0.0f;
    }

    private float getTemperature(Context context, long j) {
        Intent registerReceiver;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8e24971", new Object[]{this, context, new Long(j)})).floatValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - sLastGetTemperatureTime <= j || (registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null) {
            return -2.14748365E9f;
        }
        sLastGetTemperatureTime = currentTimeMillis;
        sLastGetTemperature = registerReceiver.getIntExtra("temperature", 0) / 10.0f;
        m.e(TAG, "getThermalLevel " + sLastGetTemperature);
        return sLastGetTemperature;
    }

    private void tlog(pso psoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7389bb8f", new Object[]{this, psoVar, str, str2});
        } else if (psoVar == null) {
        } else {
            psoVar.a(b.Flag_TaobaoLiveContainer, "TBLiveBasePlugin_" + str, str2);
        }
    }

    private TBLiveH5Container getContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveH5Container) ipChange.ipc$dispatch("d059b0b2", new Object[]{this});
        }
        if (!(this.mWebView instanceof TBLiveH5Container)) {
            return null;
        }
        return (TBLiveH5Container) this.mWebView;
    }
}
