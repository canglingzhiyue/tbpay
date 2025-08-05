package com.taobao.android.order.bundle.helper;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.alipay.auth.mobile.common.AlipayAuthConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.ultron.module.ReallyPayFiles;
import com.taobao.login4android.api.Login;
import com.taobao.tao.alipay.export.Cashdesk;
import com.taobao.tao.alipay.export.CashdeskConstants;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.hyn;
import tb.hyq;
import tb.kge;

/* loaded from: classes6.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String JSON_KEY_SIGN_STR = "signStr";
    public static final String TAG;

    public static /* synthetic */ void b(Activity activity, ReallyPayFiles reallyPayFiles) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82d02f4f", new Object[]{activity, reallyPayFiles});
        } else {
            c(activity, reallyPayFiles);
        }
    }

    private h() {
    }

    static {
        kge.a(-718238354);
        TAG = h.class.getSimpleName();
    }

    public static boolean a(Activity activity, ReallyPayFiles reallyPayFiles) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c86a52", new Object[]{activity, reallyPayFiles})).booleanValue();
        }
        if (activity == null || reallyPayFiles == null) {
            return false;
        }
        String str = TAG;
        hyn.a(str, "goToSimplePay", "dataObj = " + reallyPayFiles.toString());
        if (!TextUtils.isEmpty(reallyPayFiles.reason)) {
            a(activity, reallyPayFiles, reallyPayFiles.reason);
        } else {
            c(activity, reallyPayFiles);
        }
        return true;
    }

    private static void a(final Activity activity, final ReallyPayFiles reallyPayFiles, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f0dc98", new Object[]{activity, reallyPayFiles, str});
        } else if (activity.isFinishing()) {
        } else {
            c.a(null, str, com.alibaba.ability.localization.b.a(R.string.order_biz_cancel), activity).setPositiveButton(com.alibaba.ability.localization.b.a(R.string.order_biz_confirm), new DialogInterface.OnClickListener() { // from class: com.taobao.android.order.bundle.helper.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    h.b(activity, reallyPayFiles);
                    dialogInterface.dismiss();
                }
            }).create().show();
        }
    }

    private static void c(Activity activity, ReallyPayFiles reallyPayFiles) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bd7f450", new Object[]{activity, reallyPayFiles});
        } else if (!reallyPayFiles.canPay || (TextUtils.isEmpty(reallyPayFiles.alipayUrl) && TextUtils.isEmpty(reallyPayFiles.signStr))) {
            String a2 = com.alibaba.ability.localization.b.a(R.string.order_biz_app_not_support_go_pc);
            com.alibaba.android.ultron.vfw.widget.a.a(activity, a2);
            hyn.a(TAG, "pay", a2);
            hyq.c(activity, TAG, "alipayUrl", reallyPayFiles.alipayUrl);
            hyq.c(activity, TAG, "signStr", reallyPayFiles.signStr);
        } else {
            boolean z = reallyPayFiles.simplePay;
            String a3 = g.a(reallyPayFiles.orderIds);
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("orderids", a3);
                hashMap.put("signStr", reallyPayFiles.signStr);
                if (!TextUtils.isEmpty(reallyPayFiles.unSuccessUrl)) {
                    hashMap.put("unSuccessUrl", reallyPayFiles.unSuccessUrl);
                }
                hashMap.put("simplepay", String.valueOf(z));
                hashMap.put("backURL", reallyPayFiles.backUrl);
                hashMap.put("alipayURL", reallyPayFiles.alipayUrl);
                hashMap.put(CashdeskConstants.KEY_SINGLE_TOP, "true");
                hashMap.put(CashdeskConstants.CASHIER_TYPE, reallyPayFiles.cashierType);
                Cashdesk.invokeAlipay(activity, hashMap);
            } catch (Throwable th) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("errorInfo", th.toString());
                hashMap2.put("initData", reallyPayFiles.toString());
                hyq.a(activity, TAG, hashMap2);
            }
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (str == null) {
        } else {
            try {
                Login.bindAlipay("order", str, a.a(context));
            } catch (Throwable th) {
                HashMap hashMap = new HashMap();
                hashMap.put(AlipayAuthConstant.SIGN_DATA, str);
                hyq.c(context, TAG, "doBindAliPay", th.toString(), hashMap);
                hyn.a(TAG, "doBindAliPay", th.toString());
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static a f14545a;
        private static Context b;

        static {
            kge.a(-148763987);
        }

        public static a a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8436d88", new Object[]{context});
            }
            if (f14545a == null) {
                f14545a = new a();
            }
            b = context;
            return f14545a;
        }

        private a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            switch (message.what) {
                case Login.NOTIFY_BINDALIPAYSUCCESS /* 911109 */:
                    hyn.a(h.TAG, "BindAliPayHandler", "bindAliPaySuccess");
                    break;
                case Login.NOTIFY_BINDALIPAYFAILED /* 911110 */:
                    hyq.c(b, h.TAG, "BindAliPayHandler", "bindAliPayFail", null);
                    break;
            }
            f14545a = null;
        }
    }
}
