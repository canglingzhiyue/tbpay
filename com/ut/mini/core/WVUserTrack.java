package com.ut.mini.core;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.triver.triver_shop.newShop.ext.m;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.f;
import com.ut.mini.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import tb.apr;
import tb.aqc;
import tb.kge;

/* loaded from: classes.dex */
public class WVUserTrack extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(854773191);
    }

    public static /* synthetic */ Object ipc$super(WVUserTrack wVUserTrack, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private Context getContextWrapper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c241d459", new Object[]{this});
        }
        Context context = this.mContext;
        if (context instanceof Activity) {
            return context;
        }
        try {
            Context baseContext = this.mContext instanceof MutableContextWrapper ? ((MutableContextWrapper) this.mContext).getBaseContext() : this.mContext;
            return !(baseContext instanceof Activity) ? this.mContext : baseContext;
        } catch (Throwable unused) {
            return this.mContext;
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("toUT".equals(str)) {
            toUT(str2, wVCallBackContext);
            return true;
        } else if ("toUT2".equalsIgnoreCase(str)) {
            toUT2(str2, wVCallBackContext);
            return true;
        } else if ("turnOnUTRealtimeDebug".equals(str)) {
            turnOnUTRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("turnOffUTRealtimeDebug".equals(str)) {
            turnOffUTRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("turnOnRealtimeDebug".equals(str)) {
            turnOnAppMonitorRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("turnOffRealtimeDebug".equals(str)) {
            turnOffAppMonitorRealtimeDebug(str2, wVCallBackContext);
            return true;
        } else if ("selfCheck".equals(str)) {
            selfCheck(str2, wVCallBackContext);
            return true;
        } else if (m.SKIP_PAGE.equals(str)) {
            apr.b("WVUserTrack", m.SKIP_PAGE);
            try {
                UTAnalytics.getInstance().getDefaultTracker().skipPage(getContextWrapper());
                wVCallBackContext.success();
            } catch (Throwable unused) {
                wVCallBackContext.error();
            }
            return true;
        } else if ("updateNextPageUtparam".equals(str)) {
            apr.b("WVUserTrack", "updateNextPageUtparam params", str2);
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(str2);
                wVCallBackContext.success();
            } catch (Throwable unused2) {
                wVCallBackContext.error();
            }
            return true;
        } else if (m.UPDATE_SESSION_PROPERTY.equals(str)) {
            apr.b("WVUserTrack", "updateSessionProperties params", str2);
            try {
                UTAnalytics.getInstance().updateSessionProperties(transStringToMap(str2));
                wVCallBackContext.success();
            } catch (Throwable unused3) {
                wVCallBackContext.error();
            }
            return true;
        } else if (m.UPDATE_PAGE_PROPERTIES.equals(str)) {
            apr.b("WVUserTrack", m.UPDATE_PAGE_PROPERTIES);
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getContextWrapper(), transStringToMap(str2));
                wVCallBackContext.success();
            } catch (Throwable unused4) {
                wVCallBackContext.error();
            }
            return true;
        } else if (!"getContainerProperties".equals(str)) {
            return false;
        } else {
            apr.b("WVUserTrack", "getContainerProperties");
            try {
                Context contextWrapper = getContextWrapper();
                if (contextWrapper instanceof Activity) {
                    Map<String, String> pageAllProperties = UTAnalytics.getInstance().getDefaultTracker().getPageAllProperties((Activity) contextWrapper);
                    if (pageAllProperties != null) {
                        JSONObject jSONObject = new JSONObject(pageAllProperties);
                        r rVar = new r();
                        rVar.a(jSONObject);
                        wVCallBackContext.success(rVar);
                    } else {
                        apr.b("WVUserTrack", "containerPropertiesMap is null");
                        wVCallBackContext.success();
                    }
                } else {
                    apr.b("WVUserTrack", "context", contextWrapper);
                    wVCallBackContext.success();
                }
            } catch (Throwable unused5) {
                wVCallBackContext.error();
            }
            return true;
        }
    }

    public final void toUT(String str, WVCallBackContext wVCallBackContext) {
        Map<String, String> transStringToMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceba1928", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context contextWrapper = getContextWrapper();
        if (contextWrapper != null && (transStringToMap = transStringToMap(str)) != null) {
            j.getInstance().h5UT(transStringToMap, contextWrapper);
        }
        wVCallBackContext.success();
    }

    public void toUT2(String str, WVCallBackContext wVCallBackContext) {
        Map<String, String> transStringToMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c085266", new Object[]{this, str, wVCallBackContext});
            return;
        }
        Context contextWrapper = getContextWrapper();
        if (contextWrapper != null && (transStringToMap = transStringToMap(str)) != null) {
            j.getInstance().h5UT2(transStringToMap, contextWrapper);
        }
        wVCallBackContext.success();
    }

    private Map<String, String> transStringToMap(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bfe72e8e", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!aqc.e(next)) {
                    String string = jSONObject.getString(next);
                    if (!aqc.e(string)) {
                        hashMap.put(next, string);
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public final void selfCheck(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87036d6a", new Object[]{this, str, wVCallBackContext});
        } else if (isEmpty(str)) {
        } else {
            try {
                String obj = com.alibaba.fastjson.JSONObject.parseObject(str).get("utap_sample").toString();
                String str2 = "utap_sample:" + obj;
                String selfCheck = UTAnalytics.getInstance().selfCheck(obj);
                String str3 = "result:" + selfCheck;
                r rVar = new r();
                rVar.a("result", selfCheck);
                wVCallBackContext.success(rVar);
            } catch (com.alibaba.fastjson.JSONException unused) {
                wVCallBackContext.error();
            }
        }
    }

    public final void turnOnUTRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e44bb9b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (!isEmpty(str)) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(str);
                Set<String> keySet = parseObject.keySet();
                HashMap hashMap = new HashMap();
                if (keySet != null && keySet.size() > 0) {
                    for (String str2 : keySet) {
                        hashMap.put(str2, parseObject.get(str2).toString());
                    }
                    f.getInstance().turnOnRealTimeDebug(hashMap);
                }
            } catch (com.alibaba.fastjson.JSONException unused) {
                wVCallBackContext.error();
            }
        }
        wVCallBackContext.success();
    }

    public final void turnOffUTRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640b93e5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            f.getInstance().turnOffRealTimeDebug();
        } catch (com.alibaba.fastjson.JSONException unused) {
            wVCallBackContext.error();
        }
        wVCallBackContext.success();
    }

    public final void turnOnAppMonitorRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09848e1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        if (!isEmpty(str)) {
            try {
                com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(str);
                Set<String> keySet = parseObject.keySet();
                HashMap hashMap = new HashMap();
                if (keySet != null && keySet.size() > 0) {
                    for (String str2 : keySet) {
                        hashMap.put(str2, parseObject.get(str2).toString());
                    }
                    AppMonitor.turnOnRealTimeDebug(hashMap);
                }
            } catch (com.alibaba.fastjson.JSONException unused) {
                wVCallBackContext.error();
            }
        }
        wVCallBackContext.success();
    }

    public final void turnOffAppMonitorRealtimeDebug(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29cf372b", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            AppMonitor.turnOffRealTimeDebug();
        } catch (com.alibaba.fastjson.JSONException unused) {
            wVCallBackContext.error();
        }
        wVCallBackContext.success();
    }

    private boolean isEmpty(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{this, str})).booleanValue() : str == null || "".equals(str);
    }
}
