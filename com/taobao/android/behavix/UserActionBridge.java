package com.taobao.android.behavix;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.adapter.b;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.tao.log.TLog;
import java.util.Map;
import tb.dsb;
import tb.dsi;
import tb.kge;

/* loaded from: classes.dex */
public class UserActionBridge extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1913135645);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getUserPageViewActions".equals(str)) {
            return a(str2, wVCallBackContext);
        }
        if ("commitEnter".equals(str)) {
            return a(str2, this.mContext, wVCallBackContext);
        }
        if ("commitLeave".equals(str)) {
            return b(str2, this.mContext, wVCallBackContext);
        }
        if ("commitTap".equals(str)) {
            return b(str2, wVCallBackContext);
        }
        if ("commitRequest".equals(str)) {
            return c(str2, wVCallBackContext);
        }
        if ("trackScrollStart".equals(str)) {
            return d(str2, wVCallBackContext);
        }
        if ("trackScrollEnd".equals(str)) {
            return e(str2, wVCallBackContext);
        }
        if ("trackAppear".equals(str)) {
            return f(str2, wVCallBackContext);
        }
        if ("trackDisappear".equals(str)) {
            return g(str2, wVCallBackContext);
        }
        if ("uploadHighway".equals(str)) {
            return h(str2, wVCallBackContext);
        }
        if ("getFeature".equals(str)) {
            return k(str2, wVCallBackContext);
        }
        if ("getSlideGestureHands".equals(str)) {
            return i(str2, wVCallBackContext);
        }
        if (!"getSlideGestureHandsInfo".equals(str)) {
            return false;
        }
        return j(str2, wVCallBackContext);
    }

    private static boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cebe5e73", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            parseObject.getString("bizId");
            JSONArray jSONArray = parseObject.getJSONArray("actionTypes");
            JSONArray jSONArray2 = parseObject.getJSONArray("actionNames");
            if (parseObject.getInteger("backwardSteps") != null) {
                parseObject.getInteger("backwardSteps").intValue();
            }
            parseObject.getString("backwardScene");
            parseObject.getString("backwardBizId");
            if (parseObject.get("limitCount") != null) {
                parseObject.getInteger("limitCount").intValue();
            }
            if (parseObject.get("startTimestamp") != null) {
                parseObject.getLongValue("startTimestamp");
            }
            if (parseObject.get("endTimestamp") != null) {
                parseObject.getLongValue("endTimestamp");
            }
            if (parseObject.get("actionLimitCount") != null) {
                parseObject.getInteger("actionLimitCount").intValue();
            }
            r rVar = new r();
            if (TextUtils.isEmpty(string)) {
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return false;
            }
            if (jSONArray != null && jSONArray.size() > 0) {
                jSONArray.toArray(new String[jSONArray.size()]);
            }
            if (jSONArray2 != null && jSONArray2.size() > 0) {
                jSONArray2.toArray(new String[jSONArray2.size()]);
            }
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "getUserPageViewActions Exception " + e.getMessage());
            wVCallBackContext.error();
            dsb.a("JSGetUserPageViewActionsException", null, null, e);
            return false;
        }
    }

    private static boolean a(String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dac0afcf", new Object[]{str, obj, wVCallBackContext})).booleanValue() : a(0, str, obj, wVCallBackContext);
    }

    private static boolean b(String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c06c0c50", new Object[]{str, obj, wVCallBackContext})).booleanValue() : a(1, str, obj, wVCallBackContext);
    }

    private static boolean a(int i, String str, Object obj, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62051602", new Object[]{new Integer(i), str, obj, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("bizId");
            String string3 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_ARGS);
            String string4 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID);
            r rVar = new r();
            if (TextUtils.isEmpty(string)) {
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return false;
            }
            String[] strArr = {"BehaviX_Source=JS", string3};
            if (i == 0) {
                h.a(string, string2, obj, strArr);
            } else if (i == 1) {
                h.a(string, string2, string4, obj, strArr);
            }
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "Exception " + e.getMessage());
            wVCallBackContext.error();
            dsb.a("JSCommitPageException" + i, null, null, e);
            return false;
        }
    }

    private static boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26c8934", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("bizId");
            String string3 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_ARGS);
            String string4 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.ACTION_ARGS);
            String string5 = parseObject.getString("actionName");
            r rVar = new r();
            if (TextUtils.isEmpty(string)) {
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return false;
            }
            h.a(string, string5, string4, string2, "BehaviX_Source=JS", string3);
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "commitTap Exception " + e.getMessage());
            wVCallBackContext.error();
            dsb.a("JSCommitTapException", null, null, e);
            return false;
        }
    }

    private static boolean c(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("361ab3f5", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID);
            String string3 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_ARGS);
            String string4 = parseObject.getString("actionName");
            r rVar = new r();
            if (TextUtils.isEmpty(string)) {
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return false;
            }
            h.c(string, string4, string2, "BehaviX_Source=JS", string3);
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "commitRequest Exception " + e.getMessage());
            wVCallBackContext.error();
            dsb.a("JSCommitRequestException", null, null, e);
            return false;
        }
    }

    private static boolean d(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69c8deb6", new Object[]{str, wVCallBackContext})).booleanValue() : a(0, str, wVCallBackContext);
    }

    private static boolean e(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d770977", new Object[]{str, wVCallBackContext})).booleanValue() : a(1, str, wVCallBackContext);
    }

    private static boolean a(int i, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97b6fb66", new Object[]{new Integer(i), str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("actionName");
            int intValue = parseObject.getInteger(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.OFFSETX) == null ? 0 : parseObject.getInteger(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.OFFSETX).intValue();
            int intValue2 = parseObject.getInteger(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.OFFSETY) == null ? 0 : parseObject.getInteger(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.OFFSETY).intValue();
            String string3 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_ARGS);
            r rVar = new r();
            if (TextUtils.isEmpty(string)) {
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return false;
            }
            String[] strArr = {"BehaviX_Source=JS", string3};
            if (i == 0) {
                h.a(string, string2, intValue, intValue2, strArr);
            } else if (1 == i) {
                h.b(string, string2, intValue, intValue2, strArr);
            }
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "Exception " + e.getMessage());
            wVCallBackContext.error();
            dsb.a("JSTrackScrollException", null, null, e);
            return false;
        }
    }

    private static boolean f(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d1253438", new Object[]{str, wVCallBackContext})).booleanValue() : b(0, str, wVCallBackContext);
    }

    private static boolean g(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4d35ef9", new Object[]{str, wVCallBackContext})).booleanValue() : b(1, str, wVCallBackContext);
    }

    private static boolean b(int i, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ce28c5", new Object[]{new Integer(i), str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("scene");
            String string2 = parseObject.getString("actionName");
            String string3 = parseObject.getString("bizId");
            String string4 = parseObject.getString(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_ARGS);
            r rVar = new r();
            if (TextUtils.isEmpty(string)) {
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return false;
            }
            String[] strArr = {"BehaviX_Source=JS", string4};
            if (i == 0) {
                h.a(string, string2, string3, (View) null, strArr);
            } else if (1 == i) {
                h.b(string, string2, string3, (View) null, strArr);
            }
            wVCallBackContext.success();
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "Exception " + e.getMessage());
            wVCallBackContext.error();
            dsb.a("JSTrackExposeException", null, null, e);
            return false;
        }
    }

    private static boolean h(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("388189ba", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            boolean booleanValue = parseObject.getBooleanValue("isBatch");
            r rVar = new r();
            if (booleanValue) {
                String string = parseObject.getString("scene");
                if (TextUtils.isEmpty(string)) {
                    rVar.a("HY_PARAM_ERR");
                    wVCallBackContext.error(rVar);
                    return false;
                }
                b.a().a(string);
                wVCallBackContext.success();
            } else {
                String string2 = parseObject.getString("topic");
                JSONObject jSONObject = parseObject.getJSONObject("topicParam");
                if (!TextUtils.isEmpty(string2) && jSONObject != null) {
                    b.a().a(string2, new org.json.JSONObject(jSONObject));
                    wVCallBackContext.success();
                }
                rVar.a("HY_PARAM_ERR");
                wVCallBackContext.error(rVar);
                return false;
            }
            return true;
        } catch (Exception e) {
            TLog.loge("behavix_track", "UserActionBridge", "uploadHighway Exception " + e.getMessage());
            wVCallBackContext.error();
            dsb.a("uploadHighway", null, null, e);
            return false;
        }
    }

    private static boolean i(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2fb47b", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        String a2 = dsi.a();
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.isEmpty(a2)) {
            a2 = "";
        }
        jSONObject.put("slideHands", (Object) a2);
        rVar.a("data", jSONObject.toJSONString());
        wVCallBackContext.success(rVar);
        return true;
    }

    private static boolean j(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fdddf3c", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        com.taobao.android.external.d dVar = new com.taobao.android.external.d();
        try {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                if (parseObject.containsKey("x")) {
                    dVar.f12313a = parseObject.getFloatValue("x");
                }
                if (parseObject.containsKey("y")) {
                    dVar.b = parseObject.getFloatValue("y");
                }
                if (parseObject.containsKey("w")) {
                    dVar.c = parseObject.getFloatValue("w");
                }
                if (parseObject.containsKey("h")) {
                    dVar.d = parseObject.getFloatValue("h");
                }
            }
        } catch (Exception e) {
            TLog.loge("UserActionBridge", Log.getStackTraceString(e));
        }
        Map<String, String> a2 = dsi.a(dVar);
        rVar.a("data", com.taobao.android.behavix.utils.g.a(a2) ? "" : JSON.toJSONString(a2));
        wVCallBackContext.success(rVar);
        return true;
    }

    private static boolean k(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d38c09fd", new Object[]{str, wVCallBackContext})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            JSONObject jSONObject = parseObject.getJSONObject("queryArgs");
            String string = parseObject.getString("invokeId");
            String string2 = parseObject.getString("bizIdentifier");
            String string3 = parseObject.getString("currentScene");
            r rVar = new r();
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                BUFS.QueryArgs queryArgs = new BUFS.QueryArgs();
                if (jSONObject != null) {
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        queryArgs.setQueryArgsKV(entry.getKey(), entry.getValue());
                    }
                }
                String feature = BUFS.getFeature(queryArgs, string, string2, string3);
                if (feature == null) {
                    feature = "";
                }
                rVar.a("data", feature);
                wVCallBackContext.success(rVar);
                return true;
            }
            rVar.a("HY_PARAM_ERR");
            wVCallBackContext.error(rVar);
            return false;
        } catch (Throwable th) {
            wVCallBackContext.error();
            dsb.a("getFeatureThrowable", null, null, th);
            return false;
        }
    }
}
