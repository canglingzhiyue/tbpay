package mtopsdk.ssrcore;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import anet.channel.entity.SessionType;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import tb.mth;

/* loaded from: classes9.dex */
public class e implements com.taobao.android.nav.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.nav.e
    public String name() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this}) : "SsrNavProcessor";
    }

    @Override // com.taobao.android.nav.e
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.nav.e
    public boolean process(Intent intent, com.taobao.android.nav.d dVar) {
        final Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("873c91c1", new Object[]{this, intent, dVar})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return true;
        }
        final String uri = data.toString();
        if (mth.a(uri)) {
            MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor().submit(new Runnable() { // from class: mtopsdk.ssrcore.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        TBSdkLog.e("ssr.SsrNavProcessor", "process ssr pre request" + uri);
                        MtopConfig mtopConfig = Mtop.instance(Mtop.Id.SSR, (Context) null).getMtopConfig();
                        if (mtopConfig == null) {
                            return;
                        }
                        SessionCenter.getInstance(new Config.Builder().setAppkey(mtopConfig.appKey).setEnv(ENV.ONLINE).build()).get(HttpUrl.parse(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, data.getHost())), SessionType.LONG_LINK, 0L);
                    } catch (Throwable th) {
                        TBSdkLog.e("ssr.SsrNavProcessor", "process session error." + th);
                    }
                }
            });
        }
        return true;
    }
}
