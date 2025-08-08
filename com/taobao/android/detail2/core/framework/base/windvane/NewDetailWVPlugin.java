package com.taobao.android.detail2.core.framework.base.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.f;
import java.util.List;
import tb.fij;
import tb.fin;
import tb.fjt;
import tb.kge;

/* loaded from: classes5.dex */
public class NewDetailWVPlugin extends NewDetailBaseWVPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NEW_DETAIL_WV_MESSAGE = "NEW_DETAIL_WV_MESSAGE";
    private static final String ERROR_CODE_EMPTY_PARAMS = "10001";
    private static final String ERROR_CODE_EMPTY_TOKEN = "10002";
    private static final String ERROR_CODE_NO_HANDLER = "10003";
    private static final String ERROR_CODE_TOKEN_INVALID = "10004";
    private static final String ERROR_MSG_EMPTY_PARAMS = "params为空";
    private static final String ERROR_MSG_EMPTY_TOKEN = "token为空";
    private static final String ERROR_MSG_NO_HANDLER = "不支持该action";
    private static final String ERROR_MSG_TOKEN_INVALID = "token不合法";
    public static final String NAME = "NewDetailCenter";
    public static final String SUCCESS_CODE = "200";

    static {
        kge.a(-668103012);
    }

    @Override // com.taobao.android.detail2.core.framework.base.windvane.NewDetailBaseWVPlugin
    public boolean onExecute(String str, JSONObject jSONObject, WVCallBackContext wVCallBackContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c452fe34", new Object[]{this, str, jSONObject, wVCallBackContext, str2})).booleanValue();
        }
        a aVar = new a(wVCallBackContext, str, str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(fin.EVENT_KEY, (Object) str);
        jSONObject2.put("params", (Object) jSONObject);
        jSONObject2.put("callback", (Object) aVar);
        jSONObject2.put("uniqueId", (Object) jSONObject.getString("targetNid"));
        List<Event> a2 = fin.a((String) null, jSONObject2);
        if (a2 == null || a2.size() == 0) {
            handleCallbackFail("10003", ERROR_MSG_NO_HANDLER, wVCallBackContext);
            return false;
        }
        String string = jSONObject.getString("token");
        if (StringUtils.isEmpty(string)) {
            handleCallbackFail("10002", ERROR_MSG_EMPTY_TOKEN, wVCallBackContext);
            return false;
        }
        for (Event event : a2) {
            f.a(string).a(event);
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.base.windvane.NewDetailBaseWVPlugin, android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        fjt.a(fjt.TAG_WINDVANE, "windvane execute执行 message为空, action: " + str + ", params: " + str2);
        JSONObject parseObject = JSONObject.parseObject(str2);
        if (parseObject == null) {
            handleCallbackFail("10001", ERROR_MSG_EMPTY_PARAMS, wVCallBackContext);
            return false;
        }
        String string = parseObject.getString("from");
        if (StringUtils.isEmpty(string)) {
            fjt.a(fjt.TAG_WINDVANE, "handleUpdateData from is null");
        }
        a aVar = new a(wVCallBackContext, str, string);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(fin.EVENT_KEY, (Object) str);
        jSONObject.put("params", (Object) parseObject);
        jSONObject.put("callback", (Object) aVar);
        jSONObject.put("uniqueId", (Object) parseObject.getString("targetNid"));
        List<Event> a2 = fin.a((String) null, jSONObject);
        if (a2 == null || a2.size() == 0) {
            handleCallbackFail("10003", ERROR_MSG_NO_HANDLER, wVCallBackContext);
            return false;
        }
        String string2 = parseObject.getString("token");
        if (StringUtils.isEmpty(string2)) {
            handleCallbackFail("10002", ERROR_MSG_EMPTY_TOKEN, wVCallBackContext);
            return false;
        }
        for (Event event : a2) {
            f.a(string2).a(event);
        }
        return true;
    }

    /* loaded from: classes5.dex */
    public static class a implements fij.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public WVCallBackContext f11506a;
        public String b;
        public String c;

        static {
            kge.a(1130585833);
            kge.a(826502730);
        }

        public a(WVCallBackContext wVCallBackContext, String str, String str2) {
            this.f11506a = wVCallBackContext;
            this.b = str;
            this.c = str2;
        }

        @Override // tb.fij.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
                fjt.a(fjt.TAG_WINDVANE, "windvane callback失败 message为空, action: " + this.b + ", from: " + this.c);
                this.f11506a.error(new r("HY_FAILED"));
            } else if (jSONObject.getBoolean(fij.CALLBACK_IS_SUCCESS).booleanValue()) {
                fjt.a(fjt.TAG_WINDVANE, "windvane callback成功, action: " + this.b + ", from: " + this.c);
                this.f11506a.success(new r("HY_SUCCESS"));
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject(fij.CALLBACK_EVENT_KEY);
                r rVar = new r("HY_FAILED");
                if (jSONObject2 != null) {
                    for (String str : jSONObject2.keySet()) {
                        if (!StringUtils.isEmpty(str)) {
                            rVar.a(str, jSONObject2.getString(str));
                        }
                    }
                    fjt.a(fjt.TAG_WINDVANE, "windvane callback失败, action: " + this.b + ", from: " + this.c + ", result: " + jSONObject2.toJSONString());
                } else {
                    fjt.a(fjt.TAG_WINDVANE, "windvane callback失败, action: " + this.b + ", from: " + this.c);
                }
                this.f11506a.error(rVar);
            }
        }
    }
}
