package com.taobao.tao.remotebusiness.login;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

/* loaded from: classes.dex */
public final class b extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile b c;

    static {
        kge.a(1043351191);
        c = null;
    }

    public static b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("1afdecbe", new Object[]{context});
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    if (context == null) {
                        try {
                            context = MtopUtils.getContext();
                            if (context == null) {
                                TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.reflect context is still null.");
                                Mtop instance = Mtop.instance(Mtop.Id.INNER, (Context) null);
                                if (instance.getMtopConfig().context == null) {
                                    TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.wait INNER mtopInstance init.");
                                    instance.checkMtopSDKInit();
                                }
                                context = instance.getMtopConfig().context;
                                if (context == null) {
                                    TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.wait INNER mtopInstance init finish,context is still null");
                                    return c;
                                }
                                TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.wait INNER mtopInstance init finish.context=" + context);
                            }
                        } catch (Exception e) {
                            TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]get DefaultLoginImpl instance error", e);
                        }
                    }
                    c = new b(context, null);
                }
            }
        }
        return c;
    }

    private b(Context context, Mtop mtop) throws ClassNotFoundException, NoSuchMethodException {
        super(context, mtop);
    }
}
