package com.taobao.android.festival.utils;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import java.util.Properties;
import tb.gje;
import tb.kge;

/* loaded from: classes5.dex */
public class TrackUtils {
    public static final String MONITOR_MODULE = "Page_Festival";

    /* loaded from: classes5.dex */
    public enum ErrorType {
        READ_CACHE_ERROR("ReadCache", "ConfigFileError"),
        CLEAR_CACHE_ERROR("clearCache", "ConfigFileError"),
        WRITE_CACHE_ERROR("WriteCache", "ConfigFileError"),
        DOWNLOAD_SKIN_PARAMS_ERROR("DownloadSkin", "ParamsError"),
        DOWNLOAD_SKIN_ERROR("DownloadSkin", "Error"),
        DOWNLOAD_SKIN_WRITE_ERROR("DownloadSkin", "WriteCacheError"),
        DOWNLOAD_SKIN_ZIP_PREFETCH_ERROR("DownloadSkin", "ZipPreFetchError"),
        DOWNLOAD_SKIN_PHENIX_PREFETCH_ERROR("DownloadSkin", "PreFetchError"),
        DOWNLOAD_SKIN_FILE_ERROR("DownloadSkin", "DownLoadFileError"),
        SET_SKIN_PARAMS_ERROR("SetCurrentSkin", "ParamsError"),
        SET_SKIN_ERROR("SetCurrentSkin", "Error"),
        UPDATE_SKIN_PHENIX_PREFETCH_ERROR("UpdateSkin", "PreFetchError");
        
        public String desc;
        public String point;

        ErrorType(String str, String str2) {
            this.point = str;
            this.desc = str2;
        }
    }

    static {
        kge.a(-1590681944);
    }

    /* loaded from: classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1631579621);
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
                return;
            }
            Properties properties = new Properties();
            properties.put("skinCode", gje.a().d() != null ? gje.a().d().skinCode : "null");
            TBS.Ext.commitEvent("TBFestivalSkinUserInit_firstGetText", properties);
        }

        public static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
                return;
            }
            Properties properties = new Properties();
            properties.put("skinCode", gje.a().d() != null ? gje.a().d().skinCode : "null");
            TBS.Ext.commitEvent("TBFestivalSkinUserInit", properties);
        }
    }

    /* loaded from: classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(195992382);
        }

        public static void a(ErrorType errorType, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41ebcd9b", new Object[]{errorType, str});
            } else {
                AppMonitor.Alarm.commitFail(TrackUtils.MONITOR_MODULE, errorType.point, errorType.desc, null, str);
            }
        }

        public static void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            } else {
                AppMonitor.Alarm.commitSuccess(TrackUtils.MONITOR_MODULE, str);
            }
        }
    }
}
