package com.ali.user.mobile.ability;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import com.ali.user.mobile.ability.excutor.Executor;
import com.ali.user.mobile.ability.excutor.ExecutorCenter;
import com.ali.user.mobile.ability.excutor.ExecutorContext;
import com.ali.user.mobile.ability.excutor.ExecutorParams;
import com.ali.user.mobile.ability.excutor.ExecutorResult;
import com.ali.user.mobile.callback.DataCallback;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes2.dex */
public class ExecutorJSBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1416752238);
    }

    public static /* synthetic */ Object ipc$super(ExecutorJSBridge executorJSBridge, String str, Object... objArr) {
        if (str.hashCode() == -1811143243) {
            super.initialize((Context) objArr[0], (IWVWebView) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
            return;
        }
        try {
            q.a("aluExecutorJSBridge", (Class<? extends e>) ExecutorJSBridge.class);
        } catch (Exception unused) {
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public void initialize(Context context, IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940c25b5", new Object[]{this, context, iWVWebView});
        } else {
            super.initialize(context, iWVWebView);
        }
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!com.taobao.android.weex_framework.adapter.e.RECORD_EXECUTE.equals(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("name");
            JSONObject optJSONObject = jSONObject.optJSONObject("params");
            if (TextUtils.isEmpty(optString)) {
                setResultParamError(wVCallBackContext);
            } else {
                Executor findExecutor = ExecutorCenter.getInstance().findExecutor(optString);
                if (findExecutor != null) {
                    findExecutor.execute(new ExecutorContext.ExcutorContextBuilder().context(this.mContext).params((ExecutorParams) JSON.parseObject(optJSONObject.toString(), findExecutor.paramClass())).build(), new DataCallback<ExecutorResult>() { // from class: com.ali.user.mobile.ability.ExecutorJSBridge.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.ali.user.mobile.callback.DataCallback
                        public void result(ExecutorResult executorResult) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("aeab9d99", new Object[]{this, executorResult});
                            } else if (executorResult.success) {
                                r rVar = new r();
                                if (executorResult.bizInfo != null) {
                                    for (String str3 : executorResult.bizInfo.keySet()) {
                                        rVar.a(str3, executorResult.bizInfo.get(str3));
                                    }
                                }
                                wVCallBackContext.success(rVar);
                            } else {
                                r rVar2 = new r();
                                rVar2.a("code", Integer.valueOf(executorResult.code));
                                rVar2.a("msg", executorResult.msg);
                                if (executorResult.bizInfo != null) {
                                    for (String str4 : executorResult.bizInfo.keySet()) {
                                        rVar2.a(str4, executorResult.bizInfo.get(str4));
                                    }
                                }
                                wVCallBackContext.error(rVar2);
                            }
                        }
                    });
                } else {
                    wVCallBackContext.error("NO_EXECUTOR_ERROR");
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            setResultFail(wVCallBackContext);
        }
        return true;
    }

    private void setResultFail(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee50e21", new Object[]{this, wVCallBackContext});
        } else {
            wVCallBackContext.error(r.RET_FAIL);
        }
    }

    private void setResultParamError(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4274a3e", new Object[]{this, wVCallBackContext});
        } else {
            wVCallBackContext.error(r.RET_PARAM_ERR);
        }
    }
}
