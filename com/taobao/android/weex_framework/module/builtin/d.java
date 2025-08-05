package com.taobao.android.weex_framework.module.builtin;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.INode;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.i;
import com.taobao.android.weex_framework.widget.FontDO;
import com.taobao.weex.ui.component.WXComponent;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import tb.dpl;
import tb.jvm;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String INSTANCE_ID = "instanceId";
    public static final String MUS = "com.taobao.android.intent.category.MUS";
    public static final String WEEX_POP_ID = "wx_popId";

    /* renamed from: a  reason: collision with root package name */
    private static final Object f16037a;

    public static void a(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7ba97c7", new Object[]{mUSModule});
        }
    }

    static {
        kge.a(-353331022);
        f16037a = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.taobao.android.weex_framework.module.MUSModule r8, com.alibaba.fastjson.JSONObject r9, com.taobao.android.weex_framework.bridge.b r10, com.taobao.android.weex_framework.bridge.b r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_framework.module.builtin.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r8
            r1[r2] = r9
            r8 = 2
            r1[r8] = r10
            r8 = 3
            r1[r8] = r11
            java.lang.String r8 = "df6c5eb7"
            r0.ipc$dispatch(r8, r1)
            return
        L1b:
            if (r9 == 0) goto L98
            java.lang.String r0 = "url"
            java.lang.String r0 = r9.getString(r0)
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "message"
            java.lang.String r6 = "result"
            if (r4 != 0) goto L84
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r4 = r0.getScheme()
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L7c
            java.lang.String r7 = "http"
            boolean r7 = r7.equalsIgnoreCase(r4)
            if (r7 != 0) goto L7c
            java.lang.String r7 = "https"
            boolean r4 = r7.equalsIgnoreCase(r4)
            if (r4 == 0) goto L53
            goto L7c
        L53:
            android.content.Intent r9 = new android.content.Intent     // Catch: java.lang.Throwable -> L6b
            java.lang.String r4 = "android.intent.action.VIEW"
            r9.<init>(r4, r0)     // Catch: java.lang.Throwable -> L6b
            com.taobao.android.weex_framework.p r8 = r8.getInstance()     // Catch: java.lang.Throwable -> L6b
            android.content.Context r8 = r8.getUIContext()     // Catch: java.lang.Throwable -> L6b
            r8.startActivity(r9)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = "MUS_SUCCESS"
            r1.put(r6, r8)     // Catch: java.lang.Throwable -> L6b
            goto L8f
        L6b:
            r8 = move-exception
            java.lang.String r9 = "MUSNativeApiModel"
            com.taobao.android.weex_framework.util.g.c(r9, r8)
            java.lang.String r8 = "MUS_FAILED"
            r1.put(r6, r8)
            java.lang.String r8 = "Open page failed."
            r1.put(r5, r8)
            goto L8e
        L7c:
            java.lang.String r9 = r9.toJSONString()
            a(r8, r9, r10)
            goto L8f
        L84:
            java.lang.String r8 = "MUS_PARAM_ERR"
            r1.put(r6, r8)
            java.lang.String r8 = "The URL parameter is empty."
            r1.put(r5, r8)
        L8e:
            r10 = r11
        L8f:
            if (r10 == 0) goto L98
            java.lang.Object[] r8 = new java.lang.Object[r2]
            r8[r3] = r1
            r10.a(r8)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.d.a(com.taobao.android.weex_framework.module.MUSModule, com.alibaba.fastjson.JSONObject, com.taobao.android.weex_framework.bridge.b, com.taobao.android.weex_framework.bridge.b):void");
    }

    public static void b(MUSModule mUSModule, JSONObject jSONObject, b bVar, b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d514d6", new Object[]{mUSModule, jSONObject, bVar, bVar2});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (mUSModule.getInstance().getUIContext() instanceof Activity) {
            ((Activity) mUSModule.getInstance().getUIContext()).finish();
        } else {
            jSONObject2.put("result", (Object) com.taobao.android.weex_ability.page.a.RESULT_ERROR);
            jSONObject2.put("message", (Object) "Close page failed.");
            bVar = bVar2;
        }
        if (bVar == null) {
            return;
        }
        bVar.a(jSONObject2);
    }

    public static void a(MUSModule mUSModule, String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3415c868", new Object[]{mUSModule, str, bVar});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
        if (TextUtils.isEmpty(str)) {
            if (bVar == null) {
                return;
            }
            bVar.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR);
        } else if (mUSDKInstance.getActivityNav() != null && mUSDKInstance.getActivityNav().a(mUSModule.getInstance().getUIContext(), mUSModule.getInstance(), str)) {
            if (bVar == null) {
                return;
            }
            bVar.a("MUS_SUCCESS");
        } else {
            try {
                String string = JSON.parseObject(str).getString("url");
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                Uri parse = Uri.parse(string);
                String scheme = parse.getScheme();
                Uri.Builder buildUpon = parse.buildUpon();
                if (TextUtils.isEmpty(scheme)) {
                    buildUpon.scheme("http");
                }
                Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
                intent.addCategory("com.taobao.android.intent.category.MUS");
                intent.putExtra("instanceId", mUSDKInstance.getInstanceId());
                mUSDKInstance.getUIContext().startActivity(intent);
                if (bVar == null) {
                    return;
                }
                bVar.a("MUS_SUCCESS");
            } catch (Exception e) {
                g.c("MUSNativeApiModel", e);
                if (bVar == null) {
                    return;
                }
                bVar.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR);
            }
        }
    }

    public static void b(MUSModule mUSModule, String str, b bVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf95a9", new Object[]{mUSModule, str, bVar});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
        if (c.a(mUSModule, str, bVar)) {
            return;
        }
        if (mUSDKInstance != null && mUSDKInstance.getMonitorInfo() != null) {
            String e = mUSDKInstance.getMonitorInfo().e();
            if (!TextUtils.isEmpty(e) && (parse = Uri.parse(e)) != null && parse.isHierarchical() && parse.getQueryParameter("wx_popId") != null && l.a().p() != null) {
                l.a().p().a(mUSModule, str);
                if (bVar == null) {
                    return;
                }
                bVar.a("MUS_SUCCESS");
                return;
            }
        }
        if (mUSDKInstance.getActivityNav() != null && mUSDKInstance.getActivityNav().b(mUSModule.getInstance().getUIContext(), mUSModule.getInstance(), str)) {
            if (bVar == null) {
                return;
            }
            bVar.a("MUS_SUCCESS");
        } else if (!(mUSDKInstance.getUIContext() instanceof Activity)) {
        } else {
            Activity activity = (Activity) mUSDKInstance.getUIContext();
            if (bVar != null) {
                bVar.a("MUS_SUCCESS");
            }
            activity.finish();
        }
    }

    public static void c(MUSModule mUSModule, String str, b bVar) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7a962ea", new Object[]{mUSModule, str, bVar});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
        if (mUSDKInstance == null || c.b(mUSModule, str, bVar)) {
            return;
        }
        mUSDKInstance.setIgnoreWhiteScreenReport(true);
        if (mUSDKInstance.getMonitorInfo() != null) {
            String e = mUSDKInstance.getMonitorInfo().e();
            if (!TextUtils.isEmpty(e) && (parse = Uri.parse(e)) != null && parse.isHierarchical() && parse.getQueryParameter("wx_popId") != null && l.a().p() != null) {
                l.a().p().b(mUSModule, str);
                if (bVar == null) {
                    return;
                }
                bVar.a("MUS_SUCCESS");
                return;
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (bVar == null) {
                return;
            }
            bVar.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR);
            return;
        }
        if (mUSDKInstance.getActivityNav() != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) str);
            if (mUSDKInstance.getActivityNav().a(mUSModule.getInstance().getUIContext(), mUSModule.getInstance(), jSONObject.toJSONString())) {
                if (mUSModule.getInstance().getUIContext() instanceof Activity) {
                    ((Activity) mUSModule.getInstance().getUIContext()).finish();
                }
                if (bVar == null) {
                    return;
                }
                bVar.a("MUS_SUCCESS");
                return;
            }
        }
        try {
            String string = JSON.parseObject(str).getString("url");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            Uri parse2 = Uri.parse(string);
            String scheme = parse2.getScheme();
            Uri.Builder buildUpon = parse2.buildUpon();
            if (TextUtils.isEmpty(scheme)) {
                buildUpon.scheme("http");
            }
            Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
            intent.addCategory("com.taobao.android.intent.category.MUS");
            intent.putExtra("instanceId", mUSDKInstance.getInstanceId());
            mUSDKInstance.getUIContext().startActivity(intent);
            if (mUSModule.getInstance().getUIContext() instanceof Activity) {
                ((Activity) mUSModule.getInstance().getUIContext()).finish();
            }
            if (bVar == null) {
                return;
            }
            bVar.a("MUS_SUCCESS");
        } catch (Exception e2) {
            g.c("MUSNativeApiModel", e2);
            if (bVar == null) {
                return;
            }
            bVar.a(com.taobao.android.weex_ability.page.a.RESULT_ERROR);
        }
    }

    public static void a(MUSModule mUSModule, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b276fb3f", new Object[]{mUSModule, str, jSONObject});
            return;
        }
        Intent intent = new Intent(str);
        for (String str2 : jSONObject.keySet()) {
            intent.putExtra(str2, jSONObject.getString(str2));
        }
        LocalBroadcastManager.getInstance(mUSModule.getInstance().getUIContext()).sendBroadcast(intent);
        try {
            WVStandardEventCenter.postNotificationToJS(str, jSONObject.toJSONString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.taobao.android.weex_framework.module.MUSModule r6, com.alibaba.fastjson.JSONObject r7) {
        /*
            java.lang.String r0 = "duration"
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.android.weex_framework.module.builtin.d.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L17
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r4] = r6
            r0[r3] = r7
            java.lang.String r6 = "2693f809"
            r1.ipc$dispatch(r6, r0)
            return
        L17:
            com.taobao.android.weex_framework.p r1 = r6.getInstance()
            android.content.Context r1 = r1.getUIContext()
            if (r1 != 0) goto L22
            return
        L22:
            java.lang.String r1 = ""
            java.lang.String r2 = "MUSNativeApiModel"
            if (r7 == 0) goto L43
            java.lang.String r5 = "message"
            java.lang.String r1 = r7.getString(r5)     // Catch: java.lang.Exception -> L3d
            boolean r5 = r7.containsKey(r0)     // Catch: java.lang.Exception -> L3d
            if (r5 == 0) goto L43
            java.lang.Integer r7 = r7.getInteger(r0)     // Catch: java.lang.Exception -> L3d
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L3d
            goto L44
        L3d:
            r7 = move-exception
            java.lang.String r0 = "alert param parse error "
            com.taobao.android.weex_framework.util.g.c(r2, r0, r7)
        L43:
            r7 = 0
        L44:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L51
            java.lang.String r6 = "toast param parse is null "
            com.taobao.android.weex_framework.util.g.f(r2, r6)
            return
        L51:
            r0 = 3
            if (r7 <= r0) goto L55
            goto L56
        L55:
            r3 = 0
        L56:
            com.taobao.android.weex_framework.p r6 = r6.getInstance()
            android.content.Context r6 = r6.getUIContext()
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r1, r3)
            r6.setDuration(r3)
            r6.setText(r1)
            r7 = 17
            r6.setGravity(r7, r4, r4)
            r6.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.d.a(com.taobao.android.weex_framework.module.MUSModule, com.alibaba.fastjson.JSONObject):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(com.taobao.android.weex_framework.module.MUSModule r8, com.alibaba.fastjson.JSONObject r9, final com.taobao.android.weex_framework.bridge.b r10, com.taobao.android.weex_framework.util.m<android.app.Dialog> r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_framework.module.builtin.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            r8 = 1
            r1[r8] = r9
            r8 = 2
            r1[r8] = r10
            r8 = 3
            r1[r8] = r11
            java.lang.String r8 = "c613acb3"
            r0.ipc$dispatch(r8, r1)
            return
        L1b:
            com.taobao.android.weex_framework.p r0 = r8.getInstance()
            android.content.Context r0 = r0.getUIContext()
            boolean r0 = r0 instanceof android.app.Activity
            java.lang.String r1 = "MUSNativeApiModel"
            if (r0 == 0) goto L9b
            java.lang.String r0 = "Cancel"
            java.lang.String r3 = "OK"
            java.lang.String r4 = ""
            if (r9 == 0) goto L53
            java.lang.String r5 = "message"
            java.lang.String r5 = r9.getString(r5)     // Catch: java.lang.Exception -> L49
            java.lang.String r6 = "okTitle"
            java.lang.String r6 = r9.getString(r6)     // Catch: java.lang.Exception -> L46
            java.lang.String r7 = "cancelTitle"
            java.lang.String r9 = r9.getString(r7)     // Catch: java.lang.Exception -> L44
            goto L56
        L44:
            r9 = move-exception
            goto L4c
        L46:
            r9 = move-exception
            r6 = r3
            goto L4c
        L49:
            r9 = move-exception
            r6 = r3
            r5 = r4
        L4c:
            java.lang.String r7 = "confirm param parse error "
            com.taobao.android.weex_framework.util.g.c(r1, r7, r9)
            r9 = r0
            goto L56
        L53:
            r9 = r0
            r6 = r3
            r5 = r4
        L56:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L5d
            goto L5e
        L5d:
            r4 = r5
        L5e:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            com.taobao.android.weex_framework.p r8 = r8.getInstance()
            android.content.Context r8 = r8.getUIContext()
            r1.<init>(r8)
            r1.setMessage(r4)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L75
            goto L76
        L75:
            r3 = r6
        L76:
            boolean r8 = android.text.TextUtils.isEmpty(r9)
            if (r8 == 0) goto L7d
            r9 = r0
        L7d:
            com.taobao.android.weex_framework.module.builtin.d$1 r8 = new com.taobao.android.weex_framework.module.builtin.d$1
            r8.<init>()
            r1.setPositiveButton(r3, r8)
            com.taobao.android.weex_framework.module.builtin.d$2 r8 = new com.taobao.android.weex_framework.module.builtin.d$2
            r8.<init>()
            r1.setNegativeButton(r9, r8)
            android.app.AlertDialog r8 = r1.create()
            r8.setCanceledOnTouchOutside(r2)
            r8.show()
            r11.a(r8)
            return
        L9b:
            java.lang.String r8 = "when call confirm mWXSDKInstance.getContext() must instanceof Activity"
            com.taobao.android.weex_framework.util.g.f(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.d.a(com.taobao.android.weex_framework.module.MUSModule, com.alibaba.fastjson.JSONObject, com.taobao.android.weex_framework.bridge.b, com.taobao.android.weex_framework.util.m):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(com.taobao.android.weex_framework.module.MUSModule r9, com.alibaba.fastjson.JSONObject r10, final com.taobao.android.weex_framework.bridge.b r11, com.taobao.android.weex_framework.util.m<android.app.Dialog> r12) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_framework.module.builtin.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            r9 = 1
            r1[r9] = r10
            r9 = 2
            r1[r9] = r11
            r9 = 3
            r1[r9] = r12
            java.lang.String r9 = "d8215e92"
            r0.ipc$dispatch(r9, r1)
            return
        L1b:
            com.taobao.android.weex_framework.p r0 = r9.getInstance()
            android.content.Context r0 = r0.getUIContext()
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto Lbc
            java.lang.String r0 = "Cancel"
            java.lang.String r1 = "OK"
            java.lang.String r3 = ""
            if (r10 == 0) goto L5e
            java.lang.String r4 = "message"
            java.lang.String r4 = r10.getString(r4)     // Catch: java.lang.Exception -> L51
            java.lang.String r5 = "okTitle"
            java.lang.String r5 = r10.getString(r5)     // Catch: java.lang.Exception -> L4d
            java.lang.String r6 = "cancelTitle"
            java.lang.String r6 = r10.getString(r6)     // Catch: java.lang.Exception -> L4a
            java.lang.String r7 = "default"
            java.lang.String r10 = r10.getString(r7)     // Catch: java.lang.Exception -> L48
            goto L62
        L48:
            r10 = move-exception
            goto L55
        L4a:
            r10 = move-exception
            r6 = r0
            goto L55
        L4d:
            r10 = move-exception
            r6 = r0
            r5 = r1
            goto L55
        L51:
            r10 = move-exception
            r6 = r0
            r5 = r1
            r4 = r3
        L55:
            java.lang.String r7 = "MUSNativeApiModel"
            java.lang.String r8 = "confirm param parse error "
            com.taobao.android.weex_framework.util.g.c(r7, r8, r10)
            r10 = r3
            goto L62
        L5e:
            r6 = r0
            r5 = r1
            r10 = r3
            r4 = r10
        L62:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto L69
            goto L6a
        L69:
            r3 = r4
        L6a:
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            com.taobao.android.weex_framework.p r7 = r9.getInstance()
            android.content.Context r7 = r7.getUIContext()
            r4.<init>(r7)
            r4.setMessage(r3)
            android.widget.EditText r3 = new android.widget.EditText
            com.taobao.android.weex_framework.p r9 = r9.getInstance()
            android.content.Context r9 = r9.getUIContext()
            r3.<init>(r9)
            r3.setText(r10)
            r4.setView(r3)
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            if (r9 == 0) goto L94
            goto L95
        L94:
            r1 = r5
        L95:
            boolean r9 = android.text.TextUtils.isEmpty(r6)
            if (r9 == 0) goto L9c
            goto L9d
        L9c:
            r0 = r6
        L9d:
            com.taobao.android.weex_framework.module.builtin.d$4 r9 = new com.taobao.android.weex_framework.module.builtin.d$4
            r9.<init>()
            android.app.AlertDialog$Builder r9 = r4.setPositiveButton(r1, r9)
            com.taobao.android.weex_framework.module.builtin.d$3 r10 = new com.taobao.android.weex_framework.module.builtin.d$3
            r10.<init>()
            r9.setNegativeButton(r0, r10)
            android.app.AlertDialog r9 = r4.create()
            r9.setCanceledOnTouchOutside(r2)
            r9.show()
            r12.a(r9)
            return
        Lbc:
            java.lang.String r9 = "when call prompt mWXSDKInstance.getContext() must instanceof Activity"
            com.taobao.android.weex_framework.util.g.d(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.d.b(com.taobao.android.weex_framework.module.MUSModule, com.alibaba.fastjson.JSONObject, com.taobao.android.weex_framework.bridge.b, com.taobao.android.weex_framework.util.m):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.taobao.android.weex_framework.module.MUSModule r6, com.alibaba.fastjson.JSONObject r7, final com.taobao.android.weex_framework.bridge.b r8, com.taobao.android.weex_framework.util.m<android.app.Dialog> r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_framework.module.builtin.d.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L1b
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r6 = 1
            r1[r6] = r7
            r6 = 2
            r1[r6] = r8
            r6 = 3
            r1[r6] = r9
            java.lang.String r6 = "ea2f1071"
            r0.ipc$dispatch(r6, r1)
            return
        L1b:
            com.taobao.android.weex_framework.p r0 = r6.getInstance()
            android.content.Context r0 = r0.getUIContext()
            boolean r0 = r0 instanceof android.app.Activity
            java.lang.String r1 = "MUSNativeApiModel"
            if (r0 == 0) goto L7e
            java.lang.String r0 = "OK"
            java.lang.String r3 = ""
            if (r7 == 0) goto L47
            java.lang.String r4 = "message"
            java.lang.String r4 = r7.getString(r4)     // Catch: java.lang.Exception -> L3e
            java.lang.String r5 = "okTitle"
            java.lang.String r7 = r7.getString(r5)     // Catch: java.lang.Exception -> L3c
            goto L49
        L3c:
            r7 = move-exception
            goto L40
        L3e:
            r7 = move-exception
            r4 = r3
        L40:
            java.lang.String r5 = "alert param parse error "
            com.taobao.android.weex_framework.util.g.c(r1, r5, r7)
            r7 = r0
            goto L49
        L47:
            r7 = r0
            r4 = r3
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L50
            goto L51
        L50:
            r3 = r4
        L51:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            com.taobao.android.weex_framework.p r6 = r6.getInstance()
            android.content.Context r6 = r6.getUIContext()
            r1.<init>(r6)
            r1.setMessage(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L68
            r7 = r0
        L68:
            com.taobao.android.weex_framework.module.builtin.d$5 r6 = new com.taobao.android.weex_framework.module.builtin.d$5
            r6.<init>()
            r1.setPositiveButton(r7, r6)
            android.app.AlertDialog r6 = r1.create()
            r6.setCanceledOnTouchOutside(r2)
            r6.show()
            r9.a(r6)
            return
        L7e:
            java.lang.String r6 = "when call alert mWXSDKInstance.getContext() must instanceof Activity"
            com.taobao.android.weex_framework.util.g.f(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.d.c(com.taobao.android.weex_framework.module.MUSModule, com.alibaba.fastjson.JSONObject, com.taobao.android.weex_framework.bridge.b, com.taobao.android.weex_framework.util.m):void");
    }

    public static void b(MUSModule mUSModule, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77a8ec9e", new Object[]{mUSModule, str, jSONObject});
            return;
        }
        MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
        if (mUSDKInstance == null || mUSDKInstance.isDestroyed() || !TextUtils.equals("fontFace", str)) {
            return;
        }
        if (mUSDKInstance.getInstanceConfig() != null && mUSDKInstance.getInstanceConfig().j() == MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn) {
            mUSDKInstance.registerCSSRule(str, jSONObject);
            return;
        }
        FontDO a2 = a(jSONObject, mUSDKInstance);
        if (a2 == null || TextUtils.isEmpty(a2.e())) {
            return;
        }
        synchronized (f16037a) {
            FontDO a3 = com.taobao.android.weex_framework.widget.a.a().a(a2.e());
            if (a3 != null && TextUtils.equals(a3.a(), a2.a())) {
                com.taobao.android.weex_framework.widget.a.a().a(a3, true);
            }
            com.taobao.android.weex_framework.widget.a.a().a(a2);
            com.taobao.android.weex_framework.widget.a.a().a(a2, true);
        }
    }

    public static JSONObject a(final MUSModule mUSModule, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("554524f1", new Object[]{mUSModule, str});
        }
        final MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
        FutureTask futureTask = new FutureTask(new Callable<JSONObject>() { // from class: com.taobao.android.weex_framework.module.builtin.d.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ JSONObject call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public JSONObject a() throws Exception {
                Rect globalVisibleRect;
                View mo1035getAttachedView;
                int i;
                int bottom;
                int i2;
                int i3;
                int i4;
                int i5;
                int i6;
                IpChange ipChange2 = $ipChange;
                int i7 = 0;
                if (ipChange2 instanceof IpChange) {
                    return (JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this});
                }
                JSONObject jSONObject = new JSONObject();
                if (WXComponent.ROOT.equals(str)) {
                    View renderRoot = ((MUSDKInstance) mUSModule.getInstance()).getRenderRoot();
                    i4 = renderRoot.getMeasuredWidth();
                    bottom = renderRoot.getMeasuredHeight();
                    int[] iArr = new int[2];
                    renderRoot.getLocationOnScreen(iArr);
                    i5 = iArr[0];
                    i = iArr[1];
                    i2 = iArr[0] + i4;
                    i3 = iArr[1] + bottom;
                    i6 = 0;
                } else {
                    try {
                        INode findNodeById = ((MUSDKInstance) mUSModule.getInstance()).findNodeById(Integer.parseInt(str));
                        if (findNodeById == null || (globalVisibleRect = findNodeById.getGlobalVisibleRect()) == null || (mo1035getAttachedView = findNodeById.mo1035getAttachedView()) == null) {
                            return null;
                        }
                        int[] iArr2 = new int[2];
                        mo1035getAttachedView.getLocationOnScreen(iArr2);
                        int i8 = iArr2[0] + globalVisibleRect.left;
                        i = iArr2[1] + globalVisibleRect.top;
                        int right = findNodeById.getRight() - findNodeById.getLeft();
                        bottom = findNodeById.getBottom() - findNodeById.getTop();
                        i2 = i8 + right;
                        i3 = i + bottom;
                        int left = findNodeById.getLeft();
                        int top = findNodeById.getTop();
                        i4 = right;
                        i5 = i8;
                        i7 = left;
                        i6 = top;
                    } catch (NumberFormatException e) {
                        g.c("nativeApi.getGlobalVisibleRect err: ref format not a number", e);
                        return null;
                    }
                }
                float a2 = i.a(mUSDKInstance.getUIContext(), i5);
                float a3 = i.a(mUSDKInstance.getUIContext(), i);
                float a4 = i.a(mUSDKInstance.getUIContext(), i4);
                float a5 = i.a(mUSDKInstance.getUIContext(), bottom);
                float a6 = i.a(mUSDKInstance.getUIContext(), i2);
                float a7 = i.a(mUSDKInstance.getUIContext(), i3);
                float a8 = i.a(mUSDKInstance.getUIContext(), i7);
                float a9 = i.a(mUSDKInstance.getUIContext(), i6);
                jSONObject.put("x", (Object) Float.valueOf(a2));
                jSONObject.put("y", (Object) Float.valueOf(a3));
                jSONObject.put("left", (Object) Float.valueOf(a2));
                jSONObject.put("top", (Object) Float.valueOf(a3));
                jSONObject.put("right", (Object) Float.valueOf(a6));
                jSONObject.put("bottom", (Object) Float.valueOf(a7));
                jSONObject.put("width", (Object) Float.valueOf(a4));
                jSONObject.put("height", (Object) Float.valueOf(a5));
                jSONObject.put("relativeX", (Object) Float.valueOf(a8));
                jSONObject.put("relativeY", (Object) Float.valueOf(a9));
                return jSONObject;
            }
        });
        mUSDKInstance.postTaskToMain(futureTask);
        try {
            return (JSONObject) futureTask.get(500L, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
            g.d("nativeApi.getGlobalVisibleRect err: timeout");
            return null;
        }
    }

    public static void a(MUSModule mUSModule, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfe14750", new Object[]{mUSModule, num});
        } else if (mUSModule.getInstance().getUIContext() == null) {
        } else {
            ((Vibrator) mUSModule.getInstance().getUIContext().getSystemService("vibrator")).vibrate(num.intValue());
        }
    }

    public static void a(MUSModule mUSModule, String str, JSONObject jSONObject, final b bVar, final b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5941efed", new Object[]{mUSModule, str, jSONObject, bVar, bVar2});
        } else {
            dpl.a().a(str, null, null, jSONObject != null && jSONObject.getBooleanValue("noCache"), null, new jvm.a() { // from class: com.taobao.android.weex_framework.module.builtin.d.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvm.a
                public void a(jvm.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("850799b8", new Object[]{this, cVar});
                        return;
                    }
                    b.this.a(MUSValue.ofArrayBuffer(cVar.a()));
                    bVar2.a();
                }

                @Override // tb.jvm.a
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        return;
                    }
                    bVar2.a(str3);
                    b.this.a();
                }
            });
        }
    }

    private static FontDO a(JSONObject jSONObject, MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FontDO) ipChange.ipc$dispatch("a8f0b596", new Object[]{jSONObject, mUSDKInstance});
        }
        if (jSONObject != null) {
            return new FontDO(jSONObject.getString("fontFamily"), jSONObject.getString("src"), mUSDKInstance);
        }
        return null;
    }

    public static void a(MUSModule mUSModule, Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2872f00", new Object[]{mUSModule, dialog});
        } else if (dialog == null || !dialog.isShowing()) {
        } else {
            dialog.dismiss();
        }
    }
}
