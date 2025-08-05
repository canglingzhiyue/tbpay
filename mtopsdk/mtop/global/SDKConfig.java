package mtopsdk.mtop.global;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.EnvModeEnum;
import mtopsdk.mtop.intf.Mtop;
import tb.kge;

@Deprecated
/* loaded from: classes.dex */
public class SDKConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "mtopsdk.SDKConfig";
    private static final SDKConfig config;

    static {
        kge.a(1389905178);
        config = new SDKConfig();
    }

    private SDKConfig() {
    }

    public static SDKConfig getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SDKConfig) ipChange.ipc$dispatch("4bfd3969", new Object[0]) : config;
    }

    @Deprecated
    public Context getGlobalContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2c803a55", new Object[]{this}) : Mtop.instance(null).getMtopConfig().context;
    }

    @Deprecated
    public String getGlobalAppKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("915786e2", new Object[]{this}) : Mtop.instance(null).getMtopConfig().appKey;
    }

    @Deprecated
    public String getGlobalAuthCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b641b24b", new Object[]{this}) : Mtop.instance(null).getMtopConfig().authCode;
    }

    @Deprecated
    public String getGlobalDeviceId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("edd5856f", new Object[]{this}) : Mtop.instance(null).getMtopConfig().deviceId;
    }

    @Deprecated
    public String getGlobalUtdid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4a76e6f2", new Object[]{this}) : Mtop.instance(null).getMtopConfig().utdid;
    }

    @Deprecated
    public String getGlobalTtid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e4a739a5", new Object[]{this}) : Mtop.instance(null).getMtopConfig().ttid;
    }

    @Deprecated
    public EnvModeEnum getGlobalEnvMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EnvModeEnum) ipChange.ipc$dispatch("1447801f", new Object[]{this}) : Mtop.instance(null).getMtopConfig().envMode;
    }

    @Deprecated
    public String getGlobalAppVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("857f4a09", new Object[]{this}) : Mtop.instance(null).getMtopConfig().appVersion;
    }

    @Deprecated
    public int getGlobalDailyAppKeyIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4924ae4e", new Object[]{this})).intValue() : Mtop.instance(null).getMtopConfig().dailyAppkeyIndex;
    }

    @Deprecated
    public int getGlobalOnlineAppKeyIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("32ea7982", new Object[]{this})).intValue() : Mtop.instance(null).getMtopConfig().onlineAppKeyIndex;
    }
}
