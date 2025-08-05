package com.alipay.android.msp.plugin.manager;

import com.alipay.android.msp.plugin.engine.IBaseEngine;
import com.alipay.android.msp.plugin.engine.IBizEngine;
import com.alipay.android.msp.plugin.engine.IDataCollectorEngine;
import com.alipay.android.msp.plugin.engine.IJumpEngine;
import com.alipay.android.msp.plugin.engine.ILogEngine;
import com.alipay.android.msp.plugin.engine.IMqpBizSectionEngine;
import com.alipay.android.msp.plugin.engine.IOcrEngine;
import com.alipay.android.msp.plugin.engine.IViSecEngine;
import com.alipay.android.msp.plugin.engine.IWalletEngine;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PhoneCashierMspEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile IBizEngine f4955a;
    private static volatile IBaseEngine b;
    private static volatile IJumpEngine c;
    private static volatile ILogEngine d;
    private static volatile IOcrEngine e;
    private static volatile IViSecEngine f;
    private static volatile IWalletEngine g;
    private static volatile IDataCollectorEngine h;
    private static volatile IMqpBizSectionEngine i;

    public static IBizEngine getMspUtils() {
        if (f4955a == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (f4955a == null) {
                    f4955a = (IBizEngine) Class.forName("com.alipay.android.msp.framework.assist.MspBizImpl").newInstance();
                }
            }
        }
        return f4955a;
    }

    public static IBaseEngine getMspBase() {
        if (b == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (b == null) {
                    b = (IBaseEngine) Class.forName("com.alipay.android.msp.framework.assist.MspBaseImpl").newInstance();
                }
            }
        }
        return b;
    }

    public static IJumpEngine getMspJump() {
        if (c == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (c == null) {
                    c = (IJumpEngine) Class.forName("com.alipay.android.msp.framework.assist.MspJumpImpl").newInstance();
                }
            }
        }
        return c;
    }

    public static ILogEngine getMspLog() {
        if (d == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (d == null) {
                    d = (ILogEngine) Class.forName("com.alipay.android.msp.framework.assist.MspLogImpl").newInstance();
                }
            }
        }
        return d;
    }

    public static IOcrEngine getMspOcr() {
        if (e == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (e == null) {
                    e = (IOcrEngine) Class.forName("com.alipay.android.msp.framework.assist.MspOcrImpl").newInstance();
                }
            }
        }
        return e;
    }

    public static IViSecEngine getMspViSec() {
        if (f == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (f == null) {
                    f = (IViSecEngine) Class.forName("com.alipay.android.msp.framework.assist.MspViSecImpl").newInstance();
                }
            }
        }
        return f;
    }

    public static IWalletEngine getMspWallet() {
        if (g == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (g == null) {
                    g = (IWalletEngine) Class.forName("com.alipay.android.msp.framework.assist.MspWalletImpl").newInstance();
                }
            }
        }
        return g;
    }

    public static IDataCollectorEngine getDataCollectorEngine() {
        if (h == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (h == null) {
                    h = (IDataCollectorEngine) Class.forName("com.alipay.android.msp.framework.dataplatform.DataCollector").newInstance();
                }
            }
        }
        return h;
    }

    public static IMqpBizSectionEngine getMqpBizSectionEngine() {
        if (i == null) {
            synchronized (PhoneCashierMspEngine.class) {
                if (i == null) {
                    i = (IMqpBizSectionEngine) Class.forName("com.alipay.android.msp.framework.section.MqpBizSectionWorker").newInstance();
                }
            }
        }
        return i;
    }
}
