package com.taobao.taobao.scancode.gateway.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long RECOVER_PREVIEW_TIME = 10000;
    public static final String SOURCE_TYPE_KEY = "_tbScancodeApproach_";
    public static final String SOURCE_TYPE_PHOTO = "photo";
    public static final String SOURCE_TYPE_SCAN = "scan";

    /* renamed from: a  reason: collision with root package name */
    private static final String f21279a;

    public static /* synthetic */ void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{context, str, str2});
        } else {
            b(context, str, str2);
        }
    }

    static {
        kge.a(1649023460);
        f21279a = i.class.getSimpleName();
    }

    public static boolean a(final Context context, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            if (!com.taobao.taobao.scancode.huoyan.util.f.a(str)) {
                String.format("the url[%s] is not a http url", str);
                return false;
            }
            Uri parse = Uri.parse(str);
            if (!TextUtils.equals(parse.getQueryParameter("tbScanOpenType"), "Notification")) {
                return false;
            }
            final String queryParameter = parse.getQueryParameter(SOURCE_TYPE_KEY);
            if (!TextUtils.equals("scanHistory", queryParameter) && !TextUtils.equals(SOURCE_TYPE_PHOTO, queryParameter) && !TextUtils.equals("scan", queryParameter)) {
                Log.e(f21279a, String.format("the url[%s] has been from a unknown source[%s].", str, queryParameter));
                return false;
            }
            String.format("filter the url[%s]...", str);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b(context, str, queryParameter);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.taobao.scancode.gateway.util.i.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            i.a(context, str, queryParameter);
                        }
                    }
                });
            }
            return true;
        } catch (Throwable th) {
            Log.e(f21279a, String.format("some exceptions happened when filtering url[%s]", str), th);
            return false;
        }
    }

    private static void b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbd7193", new Object[]{context, str, str2});
        } else if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            try {
                Intent intent = new Intent("com.taobao.taobao.scancode.login.CheckerBroadcast");
                if (TextUtils.equals(str2, "scanHistory")) {
                    str2 = "history";
                }
                intent.putExtra("approach", str2);
                intent.putExtra("url", str);
                intent.setPackage(context.getPackageName());
                context.sendBroadcast(intent);
            } catch (Throwable th) {
                Log.e(f21279a, "sending broadcast failed.", th);
            }
        }
    }
}
