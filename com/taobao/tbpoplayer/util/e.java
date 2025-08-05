package com.taobao.tbpoplayer.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.poplayer.trigger.InternalTriggerController;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import tb.kge;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1904137055);
    }

    public static boolean a(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c11568d", new Object[]{new Integer(i), new Long(j)})).booleanValue();
        }
        long abs = Math.abs(j);
        if (i < 0) {
            i = 0;
        }
        if (i > 100) {
            i = 100;
        }
        if (i == 0) {
            return false;
        }
        return i == 100 || abs % 100 <= ((long) (i - 1));
    }

    public static long b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e567", new Object[]{str})).longValue();
        }
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }

    public static Object a(JSONObject jSONObject, String str) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("805a9220", new Object[]{jSONObject, str});
        }
        if (jSONObject == null) {
            return null;
        }
        try {
            for (String str2 : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str2)) {
                    Object obj = jSONObject.get(str2);
                    if (str2.equals(str)) {
                        if (obj != null) {
                            return obj;
                        }
                        return false;
                    } else if (obj instanceof JSONObject) {
                        Object a3 = a(jSONObject.getJSONObject(str2), str);
                        if (a3 != null) {
                            return a3;
                        }
                    } else if (obj instanceof JSONArray) {
                        Iterator<Object> it = ((JSONArray) obj).iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if ((next instanceof JSONObject) && (a2 = a((JSONObject) next, str)) != null) {
                                return a2;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("findValueInJSONObject.error.", th);
        }
        return null;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int a2 = com.taobao.application.common.c.a().a("deviceLevel", -1);
        return a2 != 0 ? a2 != 1 ? a2 != 2 ? "" : "low" : "middle" : "high";
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return Uri.parse(str).getQueryParameter(str2);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("getURLParam.error.", th);
            }
        }
        return "";
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : l.b(context);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        return l.d(context);
    }

    public static OnePopModule c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnePopModule) ipChange.ipc$dispatch("a0f277a9", new Object[]{str});
        }
        OnePopModule onePopModule = new OnePopModule();
        onePopModule.f3203a = str;
        onePopModule.c = "PopHub";
        onePopModule.av = com.ut.mini.l.getInstance().getCurrentPageName();
        onePopModule.aw = InternalTriggerController.d();
        try {
            onePopModule.d = URLEncoder.encode(InternalTriggerController.c(), "UTF-8");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        onePopModule.e = Event.a.b(5);
        onePopModule.ax = "";
        onePopModule.ab = "selfRender";
        onePopModule.au = "";
        return onePopModule;
    }

    public static boolean a(Context context, String str) {
        Intent intent;
        List<ResolveInfo> queryIntentActivities;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            String packageName = context.getPackageName();
            String str2 = !TextUtils.isEmpty(packageName) ? "market://details?id=" + packageName : "";
            if (TextUtils.isEmpty(str)) {
                str = str2;
            }
            if (!TextUtils.isEmpty(str) && (queryIntentActivities = context.getPackageManager().queryIntentActivities((intent = new Intent("android.intent.action.VIEW", Uri.parse(str))), 65536)) != null) {
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    if ((resolveInfo.activityInfo.applicationInfo.flags & 1) != 0) {
                        intent.setComponent(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name));
                        intent.setFlags(805339136);
                        context.startActivity(intent);
                        if (1 != 0) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWVPlugin.NavToUrl.market.error.", th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.FileInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap a(java.io.File r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbpoplayer.util.e.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "426a01bd"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            return r6
        L15:
            r0 = 0
            boolean r1 = r6.exists()     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L75
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            if (r3 == 0) goto L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            r4.<init>()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.String r5 = "loadBitmapFromFile.Bitmap loaded successfully from file: "
            r4.append(r5)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            r4.append(r6)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.String r6 = r4.toString()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            com.alibaba.poplayer.utils.c.a(r6, r2)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r6 = move-exception
            r6.printStackTrace()
        L4b:
            return r3
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            r3.<init>()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.String r4 = "loadBitmapFromFile.Failed to decode bitmap from file: "
            r3.append(r4)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            r3.append(r6)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.String r6 = r3.toString()     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            com.alibaba.poplayer.utils.c.a(r6, r2)     // Catch: java.io.IOException -> L70 java.lang.Throwable -> L88
            r1.close()     // Catch: java.lang.Throwable -> L6b
            goto L6f
        L6b:
            r6 = move-exception
            r6.printStackTrace()
        L6f:
            return r0
        L70:
            r6 = move-exception
            goto L77
        L72:
            r6 = move-exception
            r1 = r0
            goto L89
        L75:
            r6 = move-exception
            r1 = r0
        L77:
            java.lang.String r2 = "loadBitmapFromFile.error"
            com.alibaba.poplayer.utils.c.a(r2, r6)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L87
            r1.close()     // Catch: java.lang.Throwable -> L83
            goto L87
        L83:
            r6 = move-exception
            r6.printStackTrace()
        L87:
            return r0
        L88:
            r6 = move-exception
        L89:
            if (r1 == 0) goto L93
            r1.close()     // Catch: java.lang.Throwable -> L8f
            goto L93
        L8f:
            r0 = move-exception
            r0.printStackTrace()
        L93:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.util.e.a(java.io.File):android.graphics.Bitmap");
    }

    public static void a(byte[] bArr, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e396b266", new Object[]{bArr, file});
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.isDirectory()) {
                    file.delete();
                }
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    decodeByteArray.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    com.alibaba.poplayer.utils.c.a("WaterMaskInfoManager.saveImageToFile.finish.file=" + file.getAbsolutePath(), new Object[0]);
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    com.alibaba.poplayer.utils.c.a("WaterMaskInfoManager.saveImageToFile.error", e);
                    if (fileOutputStream == null) {
                        return;
                    }
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
