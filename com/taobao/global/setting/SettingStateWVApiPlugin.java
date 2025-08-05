package com.taobao.global.setting;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.jsbridge.r;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class SettingStateWVApiPlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_CHANGE_SETTING_STATE = "changeSettingState";
    private static final String ACTION_CONSUME_FATIGUE = "consumeFatigueForType";
    private static final String ACTION_GET_LIFECYCLE_SETTING_STATE = "getLifeCicleSettingState";
    private static final String ACTION_GET_SETTING_STATE = "getSettingState";
    private static final String ACTION_IS_HIT_AB = "isHitABTestForSetting";
    private static final String ACTION_NEED_SHOW_GUIDE = "needShowGuideForType";
    private static final String ACTION_SETTINGS_URL = "generalSettingNavUrl";
    private static final String ACTION_SET_LIFECYCLE_SETTING_STATE = "setLifeCicleSettingState";
    private static final String KEY_AUTO_CONSUME_FATIGUE = "autoConsumeFatigue";
    private static final String KEY_BIZ_NAME = "bizName";
    private static final String KEY_FATIGUE_TYPE = "type";
    private static final String KEY_SETTING_DEFAULT_STATE = "defaultValue";
    private static final String KEY_SETTING_ID = "key";
    private static final String KEY_SETTING_STATE = "value";

    public static /* synthetic */ Object ipc$super(SettingStateWVApiPlugin settingStateWVApiPlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void register() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a23a9aa", new Object[0]);
        } else {
            q.a("TBMyTaobaoSettingStateWVApiPlugin", (Class<? extends e>) SettingStateWVApiPlugin.class);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
        if (r8.equals("needShowGuideForType") != false) goto L16;
     */
    @Override // android.taobao.windvane.jsbridge.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean execute(java.lang.String r8, java.lang.String r9, android.taobao.windvane.jsbridge.WVCallBackContext r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.global.setting.SettingStateWVApiPlugin.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 4
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L22
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r5] = r7
            r1[r6] = r8
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r8 = "bcd41fd1"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L22:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto Lb0
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto Lb0
            if (r10 != 0) goto L32
            goto Lb0
        L32:
            r0 = -1
            int r1 = r8.hashCode()
            switch(r1) {
                case -1720808615: goto L80;
                case -1351300774: goto L77;
                case -916727579: goto L6d;
                case -2648079: goto L63;
                case 38355459: goto L59;
                case 893963188: goto L4f;
                case 1265482232: goto L45;
                case 2132265623: goto L3b;
                default: goto L3a;
            }
        L3a:
            goto L8b
        L3b:
            java.lang.String r1 = "getSettingState"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            r2 = 0
            goto L8c
        L45:
            java.lang.String r1 = "consumeFatigueForType"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            r2 = 7
            goto L8c
        L4f:
            java.lang.String r1 = "generalSettingNavUrl"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            r2 = 4
            goto L8c
        L59:
            java.lang.String r1 = "isHitABTestForSetting"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            r2 = 2
            goto L8c
        L63:
            java.lang.String r1 = "changeSettingState"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            r2 = 5
            goto L8c
        L6d:
            java.lang.String r1 = "getLifeCicleSettingState"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            r2 = 1
            goto L8c
        L77:
            java.lang.String r1 = "needShowGuideForType"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            goto L8c
        L80:
            java.lang.String r1 = "setLifeCicleSettingState"
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L8b
            r2 = 6
            goto L8c
        L8b:
            r2 = -1
        L8c:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto La8;
                case 2: goto La4;
                case 3: goto La0;
                case 4: goto L9c;
                case 5: goto L98;
                case 6: goto L94;
                case 7: goto L90;
                default: goto L8f;
            }
        L8f:
            return r5
        L90:
            r7.handleConsumeFatigue(r10, r9)
            return r6
        L94:
            r7.handleChangeCycleStateEvent(r10, r9)
            return r6
        L98:
            r7.handleChangeStateEvent(r10, r9)
            return r6
        L9c:
            r7.handleGetSettingUrlEvent(r10, r9)
            return r6
        La0:
            r7.handleNeedGuideEvent(r10, r9)
            return r6
        La4:
            r7.handleHitABEvent(r10, r9)
            return r6
        La8:
            r7.handleGetCycleStateEvent(r10, r9)
            return r6
        Lac:
            r7.handleGetStateEvent(r10, r9)
            return r6
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.global.setting.SettingStateWVApiPlugin.execute(java.lang.String, java.lang.String, android.taobao.windvane.jsbridge.WVCallBackContext):boolean");
    }

    private <T> void handleChangeStateEvent(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a0f06f", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        c.a(getContext(), str2).c().a(str2, (String) getParam("key", str), getParam("value", str), new com.taobao.global.setting.data.c() { // from class: com.taobao.global.setting.SettingStateWVApiPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.global.setting.data.c
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else {
                    wVCallBackContext.success();
                }
            }

            @Override // com.taobao.global.setting.data.c
            public void a(int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str3});
                } else {
                    wVCallBackContext.error(str3);
                }
            }
        });
    }

    private void handleHitABEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b3c1ddc", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        String str3 = (String) getParam("key", str);
        if (TextUtils.isEmpty(str3)) {
            wVCallBackContext.error("key is null");
            return;
        }
        c a2 = c.a(getContext(), str2);
        r rVar = new r();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", a2.b().a(str3));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        rVar.a(jSONObject);
        wVCallBackContext.success(rVar);
    }

    private void handleNeedGuideEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432c968a", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        String str3 = (String) getParam("type", str);
        Boolean bool = (Boolean) getParam(KEY_AUTO_CONSUME_FATIGUE, str);
        if (bool == null) {
            bool = false;
        }
        if (TextUtils.isEmpty(str3)) {
            wVCallBackContext.error("type is null");
            return;
        }
        c a2 = c.a(getContext(), str2);
        r rVar = new r();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", a2.b().a(str3, bool.booleanValue()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        rVar.a(jSONObject);
        wVCallBackContext.success(rVar);
    }

    private void handleGetSettingUrlEvent(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0e9bb", new Object[]{this, wVCallBackContext, str});
            return;
        }
        c a2 = c.a(getContext(), (String) getParam("bizName", str));
        r rVar = new r();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", a2.b().a());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        rVar.a(jSONObject);
        wVCallBackContext.success(rVar);
    }

    private <T> void handleChangeCycleStateEvent(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8727d45", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        c.a(getContext(), str2).c().b(str2, (String) getParam("key", str), getParam("value", str), new com.taobao.global.setting.data.c() { // from class: com.taobao.global.setting.SettingStateWVApiPlugin.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.global.setting.data.c
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else {
                    wVCallBackContext.success();
                }
            }

            @Override // com.taobao.global.setting.data.c
            public void a(int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str3});
                } else {
                    wVCallBackContext.error(str3);
                }
            }
        });
    }

    private void handleConsumeFatigue(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bc2fac1", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        String str3 = (String) getParam("type", str);
        if (TextUtils.isEmpty(str3)) {
            wVCallBackContext.error("type is null");
            return;
        }
        c a2 = c.a(getContext(), str2);
        r rVar = new r();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", a2.b().a(str3, true));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        rVar.a(jSONObject);
        wVCallBackContext.success(rVar);
    }

    private <T> void handleGetStateEvent(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38d34185", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        c.a(getContext(), str2).b().a(str2, (String) getParam("key", str), getParam("defaultValue", str), new com.taobao.global.setting.data.c() { // from class: com.taobao.global.setting.SettingStateWVApiPlugin.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.global.setting.data.c
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (obj == null) {
                    wVCallBackContext.error("result is null!");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("result", obj);
                        r rVar = new r();
                        rVar.a(jSONObject);
                        wVCallBackContext.success(rVar);
                    } catch (JSONException e) {
                        wVCallBackContext.error("error when try to put result to JSON!");
                        throw new RuntimeException(e);
                    }
                }
            }

            @Override // com.taobao.global.setting.data.c
            public void a(int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str3});
                } else {
                    wVCallBackContext.error(str3);
                }
            }
        });
    }

    private <T> void handleGetCycleStateEvent(final WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919569ef", new Object[]{this, wVCallBackContext, str});
            return;
        }
        String str2 = (String) getParam("bizName", str);
        c.a(getContext(), str2).b().b(str2, (String) getParam("key", str), getParam("defaultValue", str), new com.taobao.global.setting.data.c() { // from class: com.taobao.global.setting.SettingStateWVApiPlugin.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.global.setting.data.c
            public void a(Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a6251244", new Object[]{this, obj});
                } else if (obj == null) {
                    wVCallBackContext.error("result is null!");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("result", obj);
                        r rVar = new r();
                        rVar.a(jSONObject);
                        wVCallBackContext.success(rVar);
                    } catch (JSONException e) {
                        wVCallBackContext.error("error when try to put result to JSON!");
                        throw new RuntimeException(e);
                    }
                }
            }

            @Override // com.taobao.global.setting.data.c
            public void a(int i, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str3});
                } else {
                    wVCallBackContext.error(str3);
                }
            }
        });
    }

    private <T> T getParam(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("db715b80", new Object[]{this, str, str2});
        }
        try {
            T t = (T) parseParamsToJSON(str2).get(str);
            if (!(t instanceof String) && !(t instanceof Integer) && !(t instanceof Boolean)) {
                return null;
            }
            return t;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    private com.alibaba.fastjson.JSONObject parseParamsToJSON(String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.fastjson.JSONObject) ipChange.ipc$dispatch("5b8ea60d", new Object[]{this, str});
        }
        try {
            com.alibaba.fastjson.JSONObject parseObject = com.alibaba.fastjson.JSONObject.parseObject(str);
            if (parseObject == null) {
                throw new JSONException("params parse result is null!");
            }
            return parseObject;
        } catch (Exception unused) {
            throw new JSONException("params parse error!");
        }
    }
}
