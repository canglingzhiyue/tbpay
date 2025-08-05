package com.taobao.android.tschedule;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.List;
import org.json.JSONObject;
import tb.jkq;
import tb.jme;
import tb.kge;

/* loaded from: classes6.dex */
public class TScheduleWVPlugin extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String GET_DATA = "getData";
    private static final String GET_PRE_RENDER_MODULES = "getPreRenderModules";
    private static final String NOTIFY_PAGE_READY = "notifyPageReady";
    private static final String SAVE_DATA = "saveData";
    public static final String TAG = "TS.TScheduleWVPlugin";

    static {
        kge.a(-187216314);
    }

    public static /* synthetic */ Object ipc$super(TScheduleWVPlugin tScheduleWVPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        jkq.a(TAG, "jsBridge action = " + str);
        if (GET_PRE_RENDER_MODULES.equals(str)) {
            return getPreRenderModules(str2, wVCallBackContext);
        }
        if (NOTIFY_PAGE_READY.equals(str)) {
            return notifyPageReady(str2, wVCallBackContext);
        }
        if (SAVE_DATA.equals(str)) {
            return saveData(str2, wVCallBackContext);
        }
        if (!GET_DATA.equals(str)) {
            return false;
        }
        return getData(str2, wVCallBackContext);
    }

    private boolean getPreRenderModules(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a80c3cf6", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        try {
            String string = new JSONObject(str).getString("biz");
            if (!TextUtils.isEmpty(string)) {
                jme a2 = jme.a();
                String b = a2.b(string + jme.CDN_SUFFIX);
                jkq.a(TAG, "getPreRenderModules biz = " + string + ";dataCDN = " + b);
                if (TextUtils.isEmpty(b)) {
                    rVar.a("errMsg", "预渲染task里没有配置静态数据的cdn地址");
                    wVCallBackContext.error(rVar);
                    return false;
                }
                String b2 = jme.a().b(b);
                if (!TextUtils.isEmpty(b2)) {
                    rVar.a("result", new JSONObject(b2));
                    wVCallBackContext.success(rVar);
                    jkq.a(TAG, "getPreRenderModules success biz = " + string);
                    return true;
                }
                rVar.a("errMsg", "本地没有cdn对应的静态数据，可能还没下载完成。cdn = " + b);
                wVCallBackContext.error(rVar);
                return false;
            }
            rVar.a("errMsg", "bizKey is empty");
            wVCallBackContext.error(rVar);
            return false;
        } catch (Throwable th) {
            rVar.a("errMsg", th.getMessage());
            wVCallBackContext.error(rVar);
            return false;
        }
    }

    private String fetchPreRenderStaticData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1829938", new Object[]{this, str});
        }
        try {
            List<ScheduleTask> a2 = c.a(str);
            if (a2 == null || a2.isEmpty()) {
                return null;
            }
            ScheduleTask scheduleTask = a2.get(0);
            if (!(scheduleTask.taskContext instanceof RenderTaskContext)) {
                return null;
            }
            return ((RenderTaskContext) scheduleTask.taskContext).params.staticData;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean notifyPageReady(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93d6b49d", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        jkq.a(TAG, "TS jsBridge【h5通知客户端渲染完成】     params = " + str);
        return true;
    }

    private boolean saveData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcd50559", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("key");
            String string2 = parseObject.getString("value");
            if (!TextUtils.isEmpty(string)) {
                boolean a2 = jme.a().a(string, string2);
                jkq.a(TAG, "jsBridge saveData.key = " + string + ";isSuccess = " + a2);
                StringBuilder sb = new StringBuilder();
                sb.append("saveData success.key = ");
                sb.append(string);
                rVar.a("result", sb.toString());
                wVCallBackContext.success(rVar);
            } else {
                rVar.a("errMsg", "key is empty");
                wVCallBackContext.error(rVar);
            }
        } catch (Exception e) {
            rVar.a("errMsg", e.getMessage());
            wVCallBackContext.error(rVar);
        }
        return true;
    }

    private boolean getData(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d435db72", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        r rVar = new r();
        try {
            String optString = new JSONObject(str).optString("key");
            if (!TextUtils.isEmpty(optString)) {
                String b = jme.a().b(optString);
                if (b != null) {
                    rVar.a("result", b);
                    wVCallBackContext.success(rVar);
                    jkq.a(TAG, "jsBridge getData.key = " + optString + ";success");
                    return true;
                }
                rVar.a("errMsg", "local data not exist");
                wVCallBackContext.error(rVar);
                return false;
            }
            rVar.a("errMsg", "input key is empty");
            wVCallBackContext.error(rVar);
            return false;
        } catch (Throwable th) {
            rVar.a("errMsg", th.getMessage());
            wVCallBackContext.error(rVar);
            return false;
        }
    }
}
