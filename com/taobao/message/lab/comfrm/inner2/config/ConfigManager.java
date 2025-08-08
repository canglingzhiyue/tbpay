package com.taobao.message.lab.comfrm.inner2.config;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.inner2.LayoutProtocol;
import com.taobao.message.lab.comfrm.inner2.resource.IResourceManager;
import com.taobao.message.lab.comfrm.inner2.resource.ResourcePatchCenter;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.Observer;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.util.MessageNavProcessorV2;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class ConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, ConfigInfo> sConfigParseCacheMap;
    private final IResourceManager mResourceManager;

    public static /* synthetic */ Map access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]) : sConfigParseCacheMap;
    }

    static {
        kge.a(-1457563745);
        sConfigParseCacheMap = new ConcurrentHashMap();
        ResourcePatchCenter.getInstance().addCallback(new Observer<PatchInfo>() { // from class: com.taobao.message.lab.comfrm.inner2.config.ConfigManager.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onComplete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                }
            }

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onError(String str, String str2, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b263e360", new Object[]{this, str, str2, obj});
                }
            }

            @Override // com.taobao.message.lab.comfrm.util.Observer
            public void onData(PatchInfo patchInfo) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ab3da5e7", new Object[]{this, patchInfo});
                } else {
                    ConfigManager.access$000().clear();
                }
            }
        });
    }

    public ConfigManager(IResourceManager iResourceManager) {
        this.mResourceManager = iResourceManager;
    }

    private void checkCharset(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1e62b5", new Object[]{this, str});
        } else if (str == null || !ApplicationUtil.isDebug() || !str.contains("_")) {
        } else {
            throw new IllegalArgumentException(str + "|not support '_'");
        }
    }

    public ConfigInfo getConfig(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConfigInfo) ipChange.ipc$dispatch("50411f56", new Object[]{this, str, str2});
        }
        checkCharset(str);
        checkCharset(str2);
        String str3 = !StringUtils.isEmpty(str2) ? str + "_" + str2 : str;
        ConfigInfo configInfo = sConfigParseCacheMap.get(str3);
        if (!ApplicationUtil.isDebug() && configInfo != null) {
            return configInfo;
        }
        try {
            configInfo = (ConfigInfo) JSON.parseObject(this.mResourceManager.fetchResource("config/" + str3 + ".json"), ConfigInfo.class);
        } catch (Exception unused) {
            Logger.FormatLog.Builder errMsg = new Logger.FormatLog.Builder().type(1).module(16).point(-1001).errCode("-1").errMsg("config parse error");
            String[] strArr = new String[6];
            strArr[0] = MessageNavProcessorV2.KEY_BIZ_CONFIG_CODE;
            strArr[1] = str;
            strArr[2] = "version";
            if (str2 == null) {
                str2 = "";
            }
            strArr[3] = str2;
            strArr[4] = "key";
            strArr[5] = str3;
            Logger.ftl(errMsg.ext(strArr).build());
        }
        if (configInfo != null) {
            LayoutProtocol.processLayout(configInfo.layout);
            if ("messageSingle".equals(str) && configInfo.source != null && "1".equals(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "messageSingleTimeout", "1"))) {
                configInfo.source.initTimeout = 1500L;
                for (SourceItem sourceItem : configInfo.source.sourceList) {
                    if (SimpleMessageListData.SOURCE_NAME_MESSAGE.equals(sourceItem.name)) {
                        sourceItem.defaultLoad = true;
                    }
                }
            }
            sConfigParseCacheMap.put(str3, configInfo);
        }
        return configInfo;
    }
}
