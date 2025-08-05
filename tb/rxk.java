package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfigLocal;
import java.util.List;
import java.util.Map;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.SwitchConfigUtil;
import mtopsdk.common.util.TBSdkLog;

/* loaded from: classes9.dex */
public class rxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static rxk b;

    /* renamed from: a  reason: collision with root package name */
    private final String f33407a = "mtopsdk.UploadSwitchConfigManager";

    public static rxk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rxk) ipChange.ipc$dispatch("f0a46d9", new Object[0]);
        }
        if (b == null) {
            synchronized (rxk.class) {
                if (b == null) {
                    b = new rxk();
                }
            }
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String config = OrangeConfigLocal.getInstance().getConfig(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH, SwitchConfigUtil.SEGMENT_SIZE_MAP_KEY, null);
        if (StringUtils.isBlank(config)) {
            return;
        }
        try {
            Map map = (Map) JSON.parseObject(config, new TypeReference<Map<String, Integer>>() { // from class: tb.rxk.1
            }, new Feature[0]);
            if (map == null || map.size() <= 0) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                Integer num = (Integer) entry.getValue();
                if (StringUtils.isNotBlank(str) && num != null) {
                    RemoteConfig.getInstance().setSegmentSize(str, num.intValue());
                }
            }
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.UploadSwitchConfigManager", "[parseRemoteSegmentSizeMap]  remoteSegmentSizeMap=" + map);
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.UploadSwitchConfigManager", "[parseRemoteSegmentSizeMap]  parse segmentSizeMap configitem key error." + th.toString());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        String config = OrangeConfigLocal.getInstance().getConfig(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH, SwitchConfigUtil.USEHTTPS_BIZCODE_SET_KEY, null);
        if (StringUtils.isBlank(config)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(config, String.class);
            if (parseArray == null) {
                return;
            }
            RemoteConfig.getInstance().useHttpsBizcodeSets.clear();
            RemoteConfig.getInstance().useHttpsBizcodeSets.addAll(parseArray);
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.UploadSwitchConfigManager", "parse useHttpsBizcodeSetStr succeed,useHttpsBizcodeSetStr=" + config);
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.UploadSwitchConfigManager", "[parseUseHttpsBizCodeSetConfig]parse useHttpsBizcodeSetStr error ---" + th.toString());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String config = OrangeConfigLocal.getInstance().getConfig(SwitchConfigUtil.CONFIG_GROUP_MTOPSDK_UPLOAD_SWITCH, SwitchConfigUtil.DEGRADE_BIZCODE_SET_KEY, null);
        if (StringUtils.isBlank(config)) {
            return;
        }
        try {
            List parseArray = JSON.parseArray(config, String.class);
            if (parseArray == null) {
                return;
            }
            RemoteConfig.getInstance().degradeBizcodeSets.clear();
            RemoteConfig.getInstance().degradeBizcodeSets.addAll(parseArray);
            if (!TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                return;
            }
            TBSdkLog.i("mtopsdk.UploadSwitchConfigManager", "parse degradeBizcodeSets succeed,degradeBizCodeSetStr=" + config);
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.UploadSwitchConfigManager", "[parseDegradeBizCodeSetConfig]parse degradeBizCodeSetStr error ---", th);
        }
    }
}
