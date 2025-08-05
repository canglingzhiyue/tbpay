package com.taobao.tao.log.statistics;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;
import tb.olf;
import tb.olk;

/* loaded from: classes8.dex */
public class TLogEventHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static ConcurrentHashMap<String, olk> f20698a;

    /* loaded from: classes8.dex */
    public static class UploadEventInfo {
        public UploadFileType fileType = UploadFileType.UNKNOWN;
        public UploadReason reason = UploadReason.UNKNOWN;
        public String bizCode = "";
        public String bizType = "";
        public String sessionID = "";
        public Map<String, String> extraInfo = null;
        @JSONField(serialize = false)
        public olf listener = null;
        public List<String> fileList = null;
        public long requestTime = System.currentTimeMillis();
        public String uploadID = "";
        @JSONField(serialize = false)
        public boolean isRetry = false;
        public int flag = 0;

        static {
            kge.a(1756823386);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        if (f.a().r()) {
            b(str, map);
        }
        if (!c.a()) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = map == null ? "" : map.toString();
            String.format("tlog_ut disable: eventName=%s, data=%s", objArr);
            return;
        }
        b s = f.a().s();
        if (s == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            map.put(d.PARAM_IS_SLICE, String.valueOf(com.taobao.tao.log.d.d()));
            map.put(d.PARAM_IS_INNER, Boolean.toString(com.taobao.tao.log.d.j()));
            map.put(d.PARAM_IS_DEBUG, String.valueOf(com.taobao.tao.log.d.k()));
            s.a(str, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            a(str, (Map<String, String>) null);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str2)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str2, str3);
            a(str, hashMap);
        } else {
            a(str, (Map<String, String>) null);
        }
    }

    public static void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{str, str2, str3, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errCode", str2);
        hashMap.put("errMsg", str3);
        if (map != null) {
            hashMap.putAll(map);
        }
        a(str, hashMap);
    }

    public static void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            a(str, str2, str3, (Map<String, String>) null);
        }
    }

    public static void a(String str, ErrorCode errorCode, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("801d99e5", new Object[]{str, errorCode, str2});
        } else {
            a(str, errorCode.getValue(), str2, (Map<String, String>) null);
        }
    }

    public static void a(String str, UploadFileType uploadFileType, UploadReason uploadReason, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2802e7c", new Object[]{str, uploadFileType, uploadReason, str2});
        } else {
            a(str, uploadFileType, uploadReason, (String) null, (String) null, str2);
        }
    }

    public static void a(String str, UploadFileType uploadFileType, UploadReason uploadReason, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b02ed590", new Object[]{str, uploadFileType, uploadReason, str2, str3, str4});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(d.PARAM_UPLOAD_FILE_TYPE, uploadFileType.getValue());
        hashMap.put("reason", uploadReason.getValue());
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("bizType", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("bizCode", str3);
        }
        hashMap.put(d.PARAM_UPLOAD_ID, str4);
        hashMap.put(d.PARAM_TASK_ID, str4);
        a(str, hashMap);
    }

    public static void a(String str, UploadEventInfo uploadEventInfo, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb6f47f", new Object[]{str, uploadEventInfo, str2});
            return;
        }
        if (uploadEventInfo == null) {
            uploadEventInfo = new UploadEventInfo();
        }
        a(str, uploadEventInfo.fileType, uploadEventInfo.reason, uploadEventInfo.bizType, uploadEventInfo.bizCode, str2);
    }

    public static void a(UploadFileType uploadFileType, UploadReason uploadReason, String str, String str2, UploadStage uploadStage, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7822fc87", new Object[]{uploadFileType, uploadReason, str, str2, uploadStage, str3, str4, str5});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("stage", uploadStage.getValue());
        hashMap.put(d.PARAM_UPLOAD_FILE_TYPE, uploadFileType.getValue());
        hashMap.put("reason", uploadReason.getValue());
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("bizType", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("bizCode", str2);
        }
        hashMap.put("errCode", str3);
        hashMap.put("errMsg", str4);
        hashMap.put(d.PARAM_UPLOAD_ID, str5);
        hashMap.put(d.PARAM_TASK_ID, str5);
        a(d.UT_TLOG_FILE_UPLOAD_ERR, hashMap);
    }

    public static void a(UploadFileType uploadFileType, UploadReason uploadReason, UploadStage uploadStage, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f254b1b", new Object[]{uploadFileType, uploadReason, uploadStage, str, str2, str3});
        } else {
            a(uploadFileType, uploadReason, null, null, uploadStage, str, str2, str3);
        }
    }

    public static void a(UploadEventInfo uploadEventInfo, UploadStage uploadStage, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("739a38e4", new Object[]{uploadEventInfo, uploadStage, str, str2, str3});
            return;
        }
        if (uploadEventInfo == null) {
            uploadEventInfo = new UploadEventInfo();
        }
        a(uploadEventInfo.fileType, uploadEventInfo.reason, uploadEventInfo.bizType, uploadEventInfo.bizCode, uploadStage, str, str2, str3);
    }

    public static void a(UploadEventInfo uploadEventInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6613709", new Object[]{uploadEventInfo, str});
        } else {
            a(d.UT_TLOG_FILE_UPLOAD_ONE, uploadEventInfo, str);
        }
    }

    public static void b(UploadEventInfo uploadEventInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0279a8", new Object[]{uploadEventInfo, str});
        } else {
            a(d.UT_TLOG_FILE_UPLOAD_ONE_RETRY, uploadEventInfo, str);
        }
    }

    public static void c(UploadEventInfo uploadEventInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a3bc47", new Object[]{uploadEventInfo, str});
        } else {
            a(d.UT_TLOG_FILE_UPLOAD_ONE_SUCCESS, uploadEventInfo, str);
        }
    }

    public static void a(UploadEventInfo uploadEventInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f99b5b9d", new Object[]{uploadEventInfo, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(d.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
        hashMap.put("reason", uploadEventInfo.reason.getValue());
        hashMap.put("bizType", uploadEventInfo.bizType);
        hashMap.put("bizCode", uploadEventInfo.bizCode);
        hashMap.put(d.PARAM_UPLOAD_ID, str);
        hashMap.put(d.PARAM_TASK_ID, str);
        hashMap.put("errCode", str2);
        hashMap.put("errMsg", str3);
        hashMap.put(d.PARAM_IS_RETRY, String.valueOf(uploadEventInfo.isRetry));
        a(d.UT_TLOG_FILE_UPLOAD_ONE_ERROR, hashMap);
    }

    public static void a(int i, long j, int i2, int i3, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763533b", new Object[]{new Integer(i), new Long(j), new Integer(i2), new Integer(i3), new Long(j2)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("totalCount", String.valueOf(i));
        hashMap.put("totalSize", String.valueOf(j));
        hashMap.put("totalDays", String.valueOf(i2));
        hashMap.put("prevCount", String.valueOf(i3));
        hashMap.put("prevSize", String.valueOf(j2));
        a(d.UT_TLOG_FILE_SIZE, hashMap);
    }

    public static void a(UploadEventInfo uploadEventInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36542eff", new Object[]{uploadEventInfo});
        } else if (uploadEventInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(d.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
            hashMap.put("reason", uploadEventInfo.reason.getValue());
            hashMap.put("bizType", uploadEventInfo.bizType);
            hashMap.put("bizCode", uploadEventInfo.bizCode);
            hashMap.put(d.PARAM_UPLOAD_ID, uploadEventInfo.uploadID);
            hashMap.put(d.PARAM_TASK_ID, uploadEventInfo.sessionID);
            a(d.UT_TLOG_FILE_UPLOAD_RETRY, hashMap);
        }
    }

    public static void a(UploadEventInfo uploadEventInfo, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f212cb9f", new Object[]{uploadEventInfo, new Integer(i), new Integer(i2)});
        } else if (uploadEventInfo == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(d.PARAM_UPLOAD_FILE_TYPE, uploadEventInfo.fileType.getValue());
            hashMap.put("reason", uploadEventInfo.reason.getValue());
            hashMap.put(d.PARAM_UPLOAD_ID, uploadEventInfo.uploadID);
            hashMap.put(d.PARAM_TASK_ID, uploadEventInfo.sessionID);
            hashMap.put(d.PARAM_UPLOAD_FILE_COUNT, String.valueOf(i));
            hashMap.put("successCount", String.valueOf(i2));
            hashMap.put(d.PARAM_IS_RETRY, String.valueOf(uploadEventInfo.isRetry));
            a(d.UT_TLOG_FILE_UPLOAD_DONE, hashMap);
        }
    }

    public static UploadFileType b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UploadFileType) ipChange.ipc$dispatch("232e2e7a", new Object[]{str});
        }
        if (str == null) {
            return UploadFileType.UNKNOWN;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1348220061:
                if (str.equals("application/x-udf")) {
                    c = 3;
                    break;
                }
                break;
            case -39861260:
                if (str.equals("application/x-perf-methodtrace")) {
                    c = 1;
                    break;
                }
                break;
            case 728226032:
                if (str.equals("application/x-perf-heapdump")) {
                    c = 0;
                    break;
                }
                break;
            case 1154829348:
                if (str.equals("application/x-tlog")) {
                    c = 2;
                    break;
                }
                break;
        }
        if (c == 0) {
            return UploadFileType.HEAP_DUMP;
        }
        if (c == 1) {
            return UploadFileType.METHOD_TRACE;
        }
        if (c == 2) {
            return UploadFileType.LOG;
        }
        if (c == 3) {
            return UploadFileType.UDF;
        }
        return UploadFileType.UNKNOWN;
    }

    static {
        kge.a(324120759);
        f20698a = new ConcurrentHashMap<>();
    }

    public static synchronized void a(String str, olk olkVar) {
        synchronized (TLogEventHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("380cdfb4", new Object[]{str, olkVar});
            } else {
                f20698a.put(str, olkVar);
            }
        }
    }

    public static synchronized void c(String str) {
        synchronized (TLogEventHelper.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            } else {
                f20698a.remove(str);
            }
        }
    }

    public static synchronized void b(String str, Map<String, String> map) {
        String value;
        synchronized (TLogEventHelper.class) {
            IpChange ipChange = $ipChange;
            char c = 1;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
                return;
            }
            try {
                if (!f20698a.isEmpty() && map != null && !map.isEmpty()) {
                    String str2 = "";
                    olk olkVar = null;
                    if (map.containsKey(d.PARAM_TASK_ID)) {
                        str2 = map.get(d.PARAM_TASK_ID);
                        if (!TextUtils.isEmpty(str2) && f20698a.containsKey(str2)) {
                            olkVar = f20698a.get(str2);
                        }
                    }
                    UploadStage.UNKNOWN.getValue();
                    switch (str.hashCode()) {
                        case -1985564511:
                            if (str.equals(d.UT_TLOG_ARUP_ERR)) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1735725634:
                            if (str.equals(d.UT_TLOG_ARUP_CANCEL)) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1722410037:
                            if (str.equals(d.UT_TLOG_ARUP_REQUEST)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1149039458:
                            if (str.equals(d.UT_TLOG_ARUP_START)) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1139276476:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_REPLY_SUCCESS)) {
                                c = '\r';
                                break;
                            }
                            c = 65535;
                            break;
                        case -1066216896:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_ONE_SUCCESS)) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -390305473:
                            if (str.equals(d.UT_TLOG_ARUP_SUCCESS)) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case -296544474:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_REPLY_ERROR)) {
                                c = 14;
                                break;
                            }
                            c = 65535;
                            break;
                        case -199294341:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_ERR)) {
                                c = 15;
                                break;
                            }
                            c = 65535;
                            break;
                        case -199284868:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_ONE)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -199282252:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_REQ)) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -114048478:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_ONE_ERROR)) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -112724597:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_EXECUTE)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 278646254:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_TOKEN_REQ)) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 278646256:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_TOKEN_RES)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2080186405:
                            if (str.equals(d.UT_TLOG_FILE_UPLOAD_ONE_RETRY)) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            value = UploadStage.STAGE_REQ.getValue();
                            break;
                        case 1:
                            value = UploadStage.STAGE_REQ_TOKEN.getValue();
                            break;
                        case 2:
                            value = UploadStage.STAGE_RES_TOKEN.getValue();
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                        case 14:
                            value = UploadStage.STAGE_UPLOAD.getValue();
                            break;
                        case 15:
                            value = map.get("stage");
                            break;
                        default:
                            return;
                    }
                    if (olkVar != null) {
                        olkVar.onEvent(str2, value, str, map);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
