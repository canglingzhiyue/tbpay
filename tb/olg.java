package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.security.mobile.cache.AuthenticatorCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.d;
import com.taobao.tao.log.f;
import com.taobao.tao.log.g;
import com.taobao.tao.log.statistics.ErrorCode;
import com.taobao.tao.log.statistics.TLogEventHelper;
import com.taobao.tao.log.statistics.UploadFileType;
import com.taobao.tao.log.statistics.UploadReason;
import com.taobao.tao.log.statistics.UploadStage;
import com.taobao.tao.log.utils.a;
import com.taobao.tao.log.utils.c;
import com.taobao.tao.log.utils.e;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class olg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FLAG_NEED_WIFI = 2;
    public static final int FLAG_NO_RETRY = 1;
    public static final int FLAG_ORIGIN_FILE = 4;
    public static final int FLAG_ORIGIN_WITH_WIFI = 6;
    public static final int FLAG_ORIGIN_WITH_WIFI_NO_RETRY = 7;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, TLogEventHelper.UploadEventInfo> f32153a;

    public static void a(String str, String str2, Map<String, String> map, olf olfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93422d30", new Object[]{str, str2, map, olfVar});
        } else if (d.d() && d.e() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            a(currentTimeMillis - d.e(), currentTimeMillis, str, str2, map, olfVar);
        } else {
            b(str, str2, map, olfVar);
        }
    }

    public static void b(String str, String str2, Map<String, String> map, olf olfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a3310f", new Object[]{str, str2, map, olfVar});
        } else {
            a(g.a(1), str, str2, map, olfVar);
        }
    }

    public static void a(String[] strArr, String str, String str2, Map<String, String> map, olf olfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57ca0c81", new Object[]{strArr, str, str2, map, olfVar});
        } else {
            a((String) null, strArr, -1L, -1L, str, str2, map, olfVar);
        }
    }

    public static void a(long j, long j2, String str, String str2, Map<String, String> map, olf olfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f80fbeb0", new Object[]{new Long(j), new Long(j2), str, str2, map, olfVar});
        } else {
            a((String) null, (String[]) null, j, j2, str, str2, map, olfVar);
        }
    }

    public static void c(String str, String str2, Map<String, String> map, olf olfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900434ee", new Object[]{str, str2, map, olfVar});
        } else if (d.n() == 0) {
            e.b("FileUploadManager", "Failed to uploadMiniTLogFile, miniTlogBlocks == 0");
            olfVar.a("", ErrorCode.MINI_TLOG_BLOCK_ERROR.getValue(), "miniTlogBlocks == 0");
        } else {
            String a2 = jhz.a();
            TLogNative.appenderFlushData(true);
            File g = a.g();
            String absolutePath = new File(g, str2 + "_minitlog_" + SystemClock.elapsedRealtime() + ".mtlog").getAbsolutePath();
            g.c(g);
            int writeMiniTLogToFile = TLogNative.writeMiniTLogToFile(absolutePath);
            if (writeMiniTLogToFile != 0) {
                e.b("FileUploadManager", "Failed to uploadMiniTLogFile, TLogNative.writeMiniTLogToFile ret=" + writeMiniTLogToFile);
                String value = ErrorCode.MINI_TLOG_WRITE_FAILED.getValue();
                olfVar.a(absolutePath, value, "writeMiniTLogToFile ret = " + writeMiniTLogToFile);
                return;
            }
            a(a2, UploadReason.LOCAL_PUSH, Collections.singletonList(absolutePath), UploadFileType.LOG, str, str2, map, olfVar);
        }
    }

    public static boolean a(List<String> list, String str, String str2, Map<String, String> map, olf olfVar, int i, UploadFileType uploadFileType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5dd50fbf", new Object[]{list, str, str2, map, olfVar, new Integer(i), uploadFileType})).booleanValue() : a(jhz.a(), list, str, str2, map, olfVar, i, uploadFileType);
    }

    public static boolean a(String str, List<String> list, String str2, String str3, Map<String, String> map, olf olfVar, int i, UploadFileType uploadFileType) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bfe6f09", new Object[]{str, list, str2, str3, map, olfVar, new Integer(i), uploadFileType})).booleanValue() : a(str, UploadReason.LOCAL_PUSH, list, uploadFileType, str2, str3, map, olfVar, i);
    }

    public static void a(String str, String[] strArr, long j, long j2, String str2, String str3, Map<String, String> map, olf olfVar) {
        List<String> a2;
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ffec98b", new Object[]{str, strArr, new Long(j), new Long(j2), str2, str3, map, olfVar});
            return;
        }
        String a3 = StringUtils.isEmpty(str) ? jhz.a() : str;
        c.a();
        TLogNative.appenderFlushData(false);
        List<String> list2 = null;
        if (strArr != null) {
            list2 = a.a(strArr);
        } else if (j > 0 && j2 > 0) {
            list2 = a.a(j, j2);
        }
        if (list2 == null || list2.isEmpty()) {
            TLogNative.appenderFlushData(true);
            if (strArr != null) {
                a2 = a.a(strArr);
            } else if (j > 0 && j2 > 0) {
                a2 = a.a(j, j2);
            }
            list = a2;
            a(a3, UploadReason.LOCAL_PUSH, list, UploadFileType.LOG, str2, str3, map, olfVar);
        }
        list = list2;
        a(a3, UploadReason.LOCAL_PUSH, list, UploadFileType.LOG, str2, str3, map, olfVar);
    }

    public static boolean a(String str, UploadReason uploadReason, List<String> list, UploadFileType uploadFileType, String str2, String str3, Map<String, String> map, olf olfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("860a3399", new Object[]{str, uploadReason, list, uploadFileType, str2, str3, map, olfVar})).booleanValue() : a(str, uploadReason, list, uploadFileType, str2, str3, map, olfVar, 0);
    }

    public static boolean a(String str, UploadReason uploadReason, List<String> list, UploadFileType uploadFileType, String str2, String str3, Map<String, String> map, olf olfVar, int i) {
        String value;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b3cb212", new Object[]{str, uploadReason, list, uploadFileType, str2, str3, map, olfVar, new Integer(i)})).booleanValue();
        }
        UploadStage uploadStage = UploadStage.STAGE_REQ;
        TLogEventHelper.a(com.taobao.tao.log.statistics.d.UT_TLOG_FILE_UPLOAD_REQ, uploadFileType, uploadReason, str2, str3, str);
        okn h = f.a().h();
        String str5 = oko.h;
        Object[] objArr = new Object[5];
        objArr[0] = uploadReason.getValue();
        objArr[1] = uploadFileType.getName();
        objArr[2] = str2;
        objArr[3] = str3;
        objArr[4] = map == null ? "null" : map.toString();
        h.a(str5, str, String.format("[FILE_UPLOAD]: Upload reason:%s, fileType:%s, bizType:%s, bizCode:%s, extra:%s", objArr));
        if (StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3) || "exception".equalsIgnoreCase(str2)) {
            String value2 = ErrorCode.BIZ_ERROR.getValue();
            TLogEventHelper.a(uploadFileType, uploadReason, str2, str3, uploadStage, value2, "[FILE_UPLOAD] Invalid biz info.", str);
            f.a().h().b(oko.h, str, "[FILE_UPLOAD] Invalid biz info.");
            if (olfVar != null) {
                olfVar.a("", value2, "[FILE_UPLOAD] Invalid biz info.");
            }
            return false;
        } else if (list == null || list.isEmpty()) {
            if (!TLogNative.isSoOpen()) {
                value = ErrorCode.TLOG_INIT_ERROR.getValue();
                str4 = "[FILE_UPLOAD] TLog Init failed.";
            } else {
                value = ErrorCode.UPLOAD_NO_FILE.getValue();
                str4 = "[FILE_UPLOAD] The file list is empty.";
            }
            String str6 = value;
            String str7 = str4;
            TLogEventHelper.a(uploadFileType, uploadReason, str2, str3, uploadStage, str6, str7, str);
            f.a().h().b(oko.h, str, str7);
            if (olfVar != null) {
                olfVar.a("", str6, str7);
            }
            return false;
        } else {
            okt.a(str, uploadReason, list, uploadFileType, str2, str3, map, olfVar, false, i);
            return true;
        }
    }

    static {
        kge.a(-2014238835);
        f32153a = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, TLogEventHelper.UploadEventInfo uploadEventInfo) {
        synchronized (olg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9fe77df5", new Object[]{str, uploadEventInfo});
                return;
            }
            try {
                if (!StringUtils.isEmpty(str)) {
                    f32153a.put(str, uploadEventInfo);
                    if ((uploadEventInfo.flag & 1) == 0) {
                        a(uploadEventInfo);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized TLogEventHelper.UploadEventInfo a(String str) {
        synchronized (olg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TLogEventHelper.UploadEventInfo) ipChange.ipc$dispatch("ccfee249", new Object[]{str});
            }
            try {
                if (!StringUtils.isEmpty(str) && f32153a.containsKey(str)) {
                    return f32153a.get(str);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new TLogEventHelper.UploadEventInfo();
        }
    }

    public static synchronized void b(String str) {
        synchronized (olg.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
                return;
            }
            try {
                f32153a.remove(str);
                File file = new File(a.d(), str);
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void a(TLogEventHelper.UploadEventInfo uploadEventInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36542eff", new Object[]{uploadEventInfo});
            return;
        }
        try {
            File file = new File(a.d(), uploadEventInfo.sessionID);
            if (file.exists()) {
                return;
            }
            g.a(file.getAbsolutePath(), JSON.toJSONString(uploadEventInfo));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        e.a("FileUploadManager", "checkFailedUpload");
        File[] listFiles = a.d().listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            if (!file.isDirectory()) {
                try {
                    e.a("FileUploadManager", "Handle retry file: " + file.getName());
                    if (f32153a.containsKey(file.getName())) {
                        e.b("FileUploadManager", "Ignore the new upload task: " + file.getName());
                    } else {
                        String c = g.c(file.getAbsolutePath());
                        if (!StringUtils.isEmpty(c)) {
                            TLogEventHelper.UploadEventInfo uploadEventInfo = (TLogEventHelper.UploadEventInfo) JSON.parseObject(c, TLogEventHelper.UploadEventInfo.class);
                            if (uploadEventInfo != null && System.currentTimeMillis() - uploadEventInfo.requestTime < AuthenticatorCache.MAX_CACHE_TIME) {
                                TLogEventHelper.a(uploadEventInfo);
                                if (uploadEventInfo.reason != UploadReason.LOCAL_PUSH && uploadEventInfo.fileType != UploadFileType.UDF) {
                                    f.a().h().a(oko.c, uploadEventInfo.uploadID, "[PULL Failed Retry] Retry to upload");
                                    okq.a(null, uploadEventInfo.uploadID, uploadEventInfo.fileList, uploadEventInfo.fileType, null, true);
                                }
                                f.a().h().a(oko.c, uploadEventInfo.sessionID, "[PUSH Failed Retry] Retry to upload : " + uploadEventInfo.bizCode);
                                okt.a(uploadEventInfo.sessionID, uploadEventInfo.reason, uploadEventInfo.fileList, uploadEventInfo.fileType, uploadEventInfo.bizType, uploadEventInfo.bizCode, uploadEventInfo.extraInfo, null, true, uploadEventInfo.flag);
                            }
                            e.a("FileUploadManager", "Delete retry file: " + file.getName());
                            file.delete();
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    file.delete();
                }
            }
        }
    }
}
