package com.alipay.android.msp.plugin.manager;

import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.framework.dns.DnsEngineImpl;
import com.alipay.android.msp.framework.hardwarepay.neo.api.FingerprintPayEngine;
import com.alipay.android.msp.framework.hardwarepay.neo.api.SmartPayEngine;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.network.http.TransChannel;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.plugin.IFingerprintPlugin;
import com.alipay.android.msp.plugin.IPbChannel;
import com.alipay.android.msp.plugin.IProtobufCodec;
import com.alipay.android.msp.plugin.IRender;
import com.alipay.android.msp.plugin.ISmartPayPlugin;
import com.alipay.android.msp.plugin.ITemplatePlugin;
import com.alipay.android.msp.plugin.ITransChannel;
import com.alipay.android.msp.plugin.engine.IDnsEngine;
import com.alipay.android.msp.ui.birdnest.render.api.MspRenderImpl;
import com.alipay.android.msp.ui.birdnest.render.api.TemplatePlugin;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class PluginManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static IProtobufCodec f4956a;
    private static IDnsEngine b;
    private static ITransChannel c;
    private static IPbChannel d;
    private static volatile ISmartPayPlugin e;
    private static volatile IFingerprintPlugin i;
    private static volatile IRender k;
    private static volatile ITemplatePlugin l;
    private static final Object g = new Object();
    private static final Object f = new Object();
    private static final Object h = new Object();
    private static final Object j = new Object();

    public static IRender getRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRender) ipChange.ipc$dispatch("eeef4565", new Object[0]);
        }
        if (k == null) {
            synchronized (h) {
                if (k == null) {
                    k = new MspRenderImpl();
                }
            }
        }
        return k;
    }

    public static ITemplatePlugin getTplEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITemplatePlugin) ipChange.ipc$dispatch("f32c161e", new Object[0]);
        }
        if (l == null) {
            synchronized (j) {
                if (l == null) {
                    l = new TemplatePlugin();
                }
            }
        }
        return l;
    }

    public static IFingerprintPlugin getFingerprint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IFingerprintPlugin) ipChange.ipc$dispatch("70693002", new Object[0]);
        }
        if (i == null) {
            synchronized (f) {
                if (i == null) {
                    i = new FingerprintPayEngine();
                }
            }
        }
        return i;
    }

    public static ISmartPayPlugin getSmartPayPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmartPayPlugin) ipChange.ipc$dispatch("36dea3e5", new Object[0]);
        }
        if (e == null) {
            synchronized (g) {
                if (e == null) {
                    e = new SmartPayEngine();
                }
            }
        }
        return e;
    }

    public static IDnsEngine getDnsEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDnsEngine) ipChange.ipc$dispatch("b4f315fe", new Object[0]);
        }
        if (b == null) {
            b = new DnsEngineImpl();
        }
        return b;
    }

    public static IProtobufCodec getProtobufCodec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IProtobufCodec) ipChange.ipc$dispatch("185e4e67", new Object[0]);
        }
        if (f4956a == null) {
            f4956a = a();
        }
        return f4956a;
    }

    private static IProtobufCodec a() {
        try {
            if (!GlobalSdkConstant.getSdkType()) {
                return null;
            }
            return (IProtobufCodec) Class.forName("com.alipay.android.msp.network.pb.api.ProtobufCodecImpl").newInstance();
        } catch (Throwable th) {
            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "ProtobufCodecImplNotFound", "");
            LogUtil.printExceptionStackTrace(th);
            return null;
        }
    }

    public static ITransChannel getTransChannel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITransChannel) ipChange.ipc$dispatch("91af6b85", new Object[0]);
        }
        if (c == null) {
            c = new TransChannel();
        }
        return c;
    }

    public static IPbChannel getPbChannel() {
        if (d == null) {
            try {
                if (GlobalSdkConstant.getSdkType()) {
                    d = (IPbChannel) Class.forName("com.alipay.android.msp.network.pb.api.PbSdkChannel").newInstance();
                } else {
                    d = (IPbChannel) Class.forName("com.alipay.android.app.pb.api.PbTransportChannel").newInstance();
                }
            } catch (Throwable th) {
                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "PbTransportChannelNotFound", "");
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return d;
    }
}
