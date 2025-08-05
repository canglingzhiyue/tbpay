package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.mulitenv.EnvironmentSwitcher;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.cart.constant.CartFrom;
import com.taobao.login4android.api.Login;
import com.taobao.tao.log.TLog;

/* loaded from: classes6.dex */
public class jjn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_QUERY_PARAM_CART_FROM = "cartfrom";
    public static final String TAG = "CartUtils";
    public static final String VALUE_QUERY_PARAM_CART_FROM_SUPMKT = "tmall_supermarket";

    static {
        kge.a(-1655659083);
    }

    public static CartFrom a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CartFrom) ipChange.ipc$dispatch("346abd92", new Object[]{intent});
        }
        CartFrom cartFrom = CartFrom.TAOBAO_CLIENT;
        if (intent == null) {
            return cartFrom;
        }
        try {
            if (intent.getData() != null) {
                Uri data = intent.getData();
                if ("cart.m.tmall.com".equals(data.getHost()) || "tmall_supermarket".equalsIgnoreCase(data.getQueryParameter("cartfrom"))) {
                    cartFrom = CartFrom.TSM_NATIVE_TAOBAO;
                }
            }
            Bundle extras = intent.getExtras();
            return (extras == null || !extras.containsKey("cartfrom")) ? cartFrom : CartFrom.parseCartFrom(extras.getString("cartfrom"));
        } catch (Throwable unused) {
            return cartFrom;
        }
    }

    public static String b(Intent intent) {
        CartFrom cartFrom;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b2374ba", new Object[]{intent});
        }
        String str = null;
        if (intent != null) {
            cartFrom = a(intent);
            Uri data = intent.getData();
            if (data != null) {
                str = data.getQueryParameter("tp_id");
            }
        } else {
            cartFrom = null;
        }
        return jjo.a(cartFrom, str);
    }

    public static boolean a() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        int a2 = jjo.a();
        TLog.loge(TAG, "ultronCartScale is " + a2);
        try {
            j = Long.parseLong(Login.getUserId());
        } catch (Exception unused) {
            TLog.loge(TAG, " userId parseLong error");
            j = 0;
        }
        TLog.loge(TAG, "userId default 0,current id = " + j);
        return j >= 0 && j % 10000 < ((long) a2);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        return EnvironmentSwitcher.EnvType.OnLINE.getValue() == EnvironmentSwitcher.a();
    }
}
