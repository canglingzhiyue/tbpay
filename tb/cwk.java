package tb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import mtopsdk.common.util.StringUtils;
import com.heytap.mspsdk.exception.MspSdkException;
import com.heytap.mspsdk.keychain.impl.OnResultListener;
import com.heytap.mspsdk.keychain.impl.a;
import com.heytap.mspsdk.keychain.impl.b;
import com.opos.process.bridge.provider.BridgeException;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class cwk {
    static {
        kge.a(946814736);
    }

    public static void a(Context context) {
        cwd.a(context);
    }

    public static void a(Context context, OnResultListener onResultListener) {
        int code;
        String message;
        a aVar = new a(onResultListener);
        try {
            b.a(context).c(b.a(context, (HashMap<String, String>) null), aVar);
        } catch (MspSdkException e) {
            e.printStackTrace();
            cwn.a("KeyChainImpl", (Throwable) e);
            code = e.getCode();
            message = e.getMessage();
            b.a(code, message, aVar);
        } catch (BridgeException e2) {
            e2.printStackTrace();
            cwn.a("KeyChainImpl", (Throwable) e2);
            code = e2.getCode();
            message = e2.getMessage();
            b.a(code, message, aVar);
        }
    }

    public static void a(Context context, HashMap<String, String> hashMap, OnResultListener onResultListener) {
        int code;
        String message;
        if (hashMap == null || hashMap.isEmpty() || StringUtils.isEmpty("key") || StringUtils.isEmpty("data")) {
            throw new IllegalArgumentException("value of argument 'key' or 'data' should not be empty");
        }
        a aVar = new a(onResultListener);
        try {
            b.a(context).b(b.a(context, hashMap), aVar);
        } catch (MspSdkException e) {
            e.printStackTrace();
            cwn.a("KeyChainImpl", (Throwable) e);
            code = e.getCode();
            message = e.getMessage();
            b.a(code, message, aVar);
        } catch (BridgeException e2) {
            e2.printStackTrace();
            cwn.a("KeyChainImpl", (Throwable) e2);
            code = e2.getCode();
            message = e2.getMessage();
            b.a(code, message, aVar);
        }
    }

    public static void b(Context context, HashMap<String, String> hashMap, OnResultListener onResultListener) {
        int code;
        String message;
        if (hashMap == null || hashMap.isEmpty() || StringUtils.isEmpty("key")) {
            throw new IllegalArgumentException("value of argument 'key' should not be empty");
        }
        a aVar = new a(onResultListener);
        try {
            b.a(context).a(b.a(context, hashMap), aVar);
        } catch (MspSdkException e) {
            e.printStackTrace();
            cwn.a("KeyChainImpl", (Throwable) e);
            code = e.getCode();
            message = e.getMessage();
            b.a(code, message, aVar);
        } catch (BridgeException e2) {
            e2.printStackTrace();
            cwn.a("KeyChainImpl", (Throwable) e2);
            code = e2.getCode();
            message = e2.getMessage();
            b.a(code, message, aVar);
        }
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.heytap.htms", "com.heytap.msp.keychain.KeyChainService"));
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        return queryIntentServices != null && queryIntentServices.size() > 0;
    }
}
