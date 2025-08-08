package com.alipay.mobile.common.logging.util.config;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.common.logging.strategy.LogStrategyInfo;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LogConfigUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LEISURE = "leisure";

    public static synchronized List<String> getLeisureLogCategory() {
        synchronized (LogConfigUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("1e79c10d", new Object[0]);
            }
            ArrayList arrayList = new ArrayList();
            Map<String, LogStrategyInfo> logStrategyInfos = LoggerFactory.getLogContext().getLogStrategyInfos();
            if (logStrategyInfos == null) {
                LoggerFactory.getTraceLogger().warn("LogConfigUtils", "getLogStrategyInfos is null");
                return arrayList;
            }
            for (Map.Entry<String, LogStrategyInfo> entry : logStrategyInfos.entrySet()) {
                if (entry != null && entry.getValue().getUploadEvents().contains(LEISURE)) {
                    arrayList.add(entry.getKey());
                }
            }
            return arrayList;
        }
    }

    public static synchronized boolean uploadLeisureLogcategory(boolean z) {
        synchronized (LogConfigUtils.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4b1e5533", new Object[]{new Boolean(z)})).booleanValue();
            }
            List<String> leisureLogCategory = getLeisureLogCategory();
            if (leisureLogCategory != null && !leisureLogCategory.isEmpty()) {
                int size = leisureLogCategory.size();
                LoggerFactory.getTraceLogger().info("LogConfigUtils", "logCategorys size = ".concat(String.valueOf(size)));
                for (int i = 0; i < size; i++) {
                    String str = leisureLogCategory.get(i);
                    if (!StringUtils.isEmpty(str)) {
                        if (z) {
                            LoggerFactory.getLogContext().flush(str, false);
                            LoggerFactory.getTraceLogger().info("LogConfigUtils", "isFlush = ".concat(String.valueOf(str)));
                        }
                        LoggerFactory.getLogContext().uploadAfterSync(str);
                        LoggerFactory.getTraceLogger().info("LogConfigUtils", "uploadAfterSync = ".concat(String.valueOf(str)));
                    }
                }
                return true;
            }
            LoggerFactory.getTraceLogger().info("LogConfigUtils", "getLeisureLogCategory is null");
            return false;
        }
    }
}
