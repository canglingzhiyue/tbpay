package com.taobao.wireless.link.assistant.jsbridge;

import android.app.Application;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.controller.a;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;
import tb.kge;
import tb.rjt;
import tb.rju;
import tb.rjw;
import tb.rjy;
import tb.rjz;
import tb.rkg;
import tb.rkj;

/* loaded from: classes9.dex */
public class AssistantPermissionJsBridge extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_ASSISTANT_PERMISSION = "assistant_permission";
    public static final String CLASSNAME_ASSISTANT_PERMISSION = "AssistantPermissionJsBridge";
    private String id;

    static {
        kge.a(-1889795830);
    }

    public static /* synthetic */ Object ipc$super(AssistantPermissionJsBridge assistantPermissionJsBridge, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(AssistantPermissionJsBridge assistantPermissionJsBridge, Application application, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a34cbc", new Object[]{assistantPermissionJsBridge, application, wVCallBackContext});
        } else {
            assistantPermissionJsBridge.getCallBackFromServer(application, wVCallBackContext);
        }
    }

    public static /* synthetic */ String access$100(AssistantPermissionJsBridge assistantPermissionJsBridge) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d9a8c8c1", new Object[]{assistantPermissionJsBridge}) : assistantPermissionJsBridge.id;
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (StringUtils.equals(str, ACTION_ASSISTANT_PERMISSION)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                if (jSONObject.has("id")) {
                    this.id = (String) jSONObject.get("id");
                }
            } catch (Exception e) {
                rkg.a("link_tag", "AssistantPermissionJsBridge === execute === 获取id异常：" + e.getMessage());
            }
            if (StringUtils.isEmpty(this.id)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("supportAssistant", rjw.c(rjt.a().f33186a));
                    jSONObject2.put("buttonTitle", "活动异常");
                } catch (Exception unused) {
                    rkg.a("link_tag", "AssistantPermissionJsBridge === execute === 获取id异常：" + jSONObject2);
                }
                r rVar = new r();
                rVar.a("data", jSONObject2);
                wVCallBackContext.success(rVar);
                return false;
            } else if (wVCallBackContext != null) {
                getMsgData(rjt.a().f33186a, wVCallBackContext, this.id);
                return true;
            }
        }
        return false;
    }

    private void getMsgData(final Application application, final WVCallBackContext wVCallBackContext, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c645534a", new Object[]{this, application, wVCallBackContext, str});
        } else {
            a.a().b().postDelayed(new Runnable() { // from class: com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (rjw.c(application)) {
                        if (rkj.c(application)) {
                            AssistantPermissionJsBridge.access$000(AssistantPermissionJsBridge.this, application, wVCallBackContext);
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("hasPermission", false);
                            jSONObject.put("buttonTitle", "开启失败，请重新尝试");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        r rVar = new r();
                        rVar.a("data", jSONObject);
                        wVCallBackContext.success(rVar);
                    } else {
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.put("supportAssistant", false);
                            jSONObject2.put("buttonTitle", "当前设备不支持小助手，奖励稍候发放");
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        r rVar2 = new r();
                        rVar2.a("data", jSONObject2);
                        wVCallBackContext.success(rVar2);
                        rkg.a("link_tag", "AssistantPermissionJsBridge === getMsgData === 不支持小助手：" + jSONObject2);
                        Map<String, String> e3 = rjw.e(application);
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str);
                        rjy.a(application, arrayList, e3, null);
                    }
                }
            }, 800L);
        }
    }

    private void getCallBackFromServer(Application application, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ad48ad", new Object[]{this, application, wVCallBackContext});
        } else {
            rju.a().a(application, rjw.e(application), new rjz() { // from class: com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
                    if (android.text.StringUtils.equals("true", r6) != false) goto L18;
                 */
                @Override // tb.rjz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void a(boolean r6, java.util.Map<java.lang.String, java.lang.Object> r7) {
                    /*
                        r5 = this;
                        java.lang.String r0 = "link_tag"
                        com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge.AnonymousClass2.$ipChange
                        boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                        r3 = 1
                        if (r2 == 0) goto L1f
                        r0 = 3
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        r2 = 0
                        r0[r2] = r5
                        java.lang.Boolean r2 = new java.lang.Boolean
                        r2.<init>(r6)
                        r0[r3] = r2
                        r6 = 2
                        r0[r6] = r7
                        java.lang.String r6 = "8d794299"
                        r1.ipc$dispatch(r6, r0)
                        return
                    L1f:
                        org.json.JSONObject r1 = new org.json.JSONObject
                        r1.<init>()
                        java.lang.String r2 = "hasPermission"
                        r1.put(r2, r3)     // Catch: java.lang.Exception -> L81
                        java.lang.String r2 = "恭喜你领取成功"
                        java.lang.String r3 = "当前网络繁忙，奖励稍后发放"
                        java.lang.String r4 = "buttonTitle"
                        if (r6 == 0) goto L69
                        com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge r6 = com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge.this     // Catch: java.lang.Exception -> L81
                        java.lang.String r6 = com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge.access$100(r6)     // Catch: java.lang.Exception -> L81
                        java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L81
                        java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L81
                        java.lang.String r7 = "false"
                        boolean r6 = android.text.StringUtils.equals(r7, r6)     // Catch: java.lang.Exception -> L81
                        if (r6 == 0) goto L65
                        tb.rjt r6 = tb.rjt.a()     // Catch: java.lang.Exception -> L81
                        com.taobao.wireless.link.common.b r6 = r6.c     // Catch: java.lang.Exception -> L81
                        java.lang.String r6 = r6.f23584a     // Catch: java.lang.Exception -> L81
                        boolean r6 = android.text.StringUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L81
                        if (r6 != 0) goto L61
                        tb.rjt r6 = tb.rjt.a()     // Catch: java.lang.Exception -> L81
                        com.taobao.wireless.link.common.b r6 = r6.c     // Catch: java.lang.Exception -> L81
                        java.lang.String r6 = r6.f23584a     // Catch: java.lang.Exception -> L81
                        r1.put(r4, r6)     // Catch: java.lang.Exception -> L81
                        goto L9a
                    L61:
                        r1.put(r4, r2)     // Catch: java.lang.Exception -> L81
                        goto L9a
                    L65:
                        r1.put(r4, r3)     // Catch: java.lang.Exception -> L81
                        goto L9a
                    L69:
                        java.lang.String r6 = "local"
                        java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L81
                        java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L81
                        boolean r7 = android.text.StringUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L81
                        if (r7 != 0) goto L65
                        java.lang.String r7 = "true"
                        boolean r6 = android.text.StringUtils.equals(r7, r6)     // Catch: java.lang.Exception -> L81
                        if (r6 == 0) goto L65
                        goto L61
                    L81:
                        r6 = move-exception
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r2 = "AssistantPermissionJsBridge === execute === 小助手jsbridge调用，获取权限："
                        r7.append(r2)
                        java.lang.String r6 = r6.getMessage()
                        r7.append(r6)
                        java.lang.String r6 = r7.toString()
                        tb.rkg.a(r0, r6)
                    L9a:
                        android.taobao.windvane.jsbridge.r r6 = new android.taobao.windvane.jsbridge.r
                        r6.<init>()
                        java.lang.String r7 = "data"
                        r6.a(r7, r1)
                        android.taobao.windvane.jsbridge.WVCallBackContext r7 = r2
                        r7.success(r6)
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r7 = "AssistantPermissionJsBridge === execute === 小助手jsbridge调用，获取权限数据="
                        r6.append(r7)
                        r6.append(r1)
                        java.lang.String r6 = r6.toString()
                        tb.rkg.a(r0, r6)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge.AnonymousClass2.a(boolean, java.util.Map):void");
                }
            });
        }
    }
}
