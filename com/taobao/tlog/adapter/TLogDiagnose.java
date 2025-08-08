package com.taobao.tlog.adapter;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.f;
import com.taobao.tao.log.statistics.TLogEventHelper;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.olf;
import tb.olg;
import tb.olk;

/* loaded from: classes.dex */
public class TLogDiagnose extends android.taobao.windvane.jsbridge.e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_GET_TLOG_LIST = "getTLogList";
    private static final String ACTION_GET_TLOG_LIST_DAY = "getTLogListByDay";
    private static final String ACTION_GET_TLOG_LIST_TIME = "getTLogListByTime";
    private static final String ACTION_IS_ENABLE = "isUploadEnable";
    private static final String ACTION_UPLOAD_TLOG = "uploadTLog";
    private static final String ACTION_UPLOAD_TLOG_TIME = "uploadTLogByTime";
    private static final String BRIDGE = "TLogDiagnoseBridge";
    private static final String ERROR_DATA_INVALID = "204";
    private static final String ERROR_EXEC = "100";
    private static final String ERROR_IS_DISABLE = "101";
    private static final String ERROR_NEED_BIZ_INFO = "202";
    private static final String ERROR_NEED_SESSION_ID = "203";
    private static final String ERROR_NO_TLOG_FILE = "201";
    private static final String ERROR_TIME_INVALID = "205";
    private static final String EVENT_UPLOAD_PROCESS = "uploadProcess";
    private static final String TAG = "TLogDiagnose";
    private static final String VER = "1";
    private String sessionID;

    public static /* synthetic */ Object ipc$super(TLogDiagnose tLogDiagnose, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            q.a(BRIDGE, (Class<? extends android.taobao.windvane.jsbridge.e>) TLogDiagnose.class);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.taobao.windvane.jsbridge.e, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (StringUtils.isEmpty(this.sessionID)) {
            return;
        }
        TLogEventHelper.c(this.sessionID);
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1009675960:
                if (str.equals(ACTION_GET_TLOG_LIST_TIME)) {
                    c = 3;
                    break;
                }
                break;
            case -243105839:
                if (str.equals(ACTION_UPLOAD_TLOG)) {
                    c = 4;
                    break;
                }
                break;
            case 91598948:
                if (str.equals(ACTION_GET_TLOG_LIST)) {
                    c = 1;
                    break;
                }
                break;
            case 521603521:
                if (str.equals(ACTION_GET_TLOG_LIST_DAY)) {
                    c = 2;
                    break;
                }
                break;
            case 651057909:
                if (str.equals(ACTION_UPLOAD_TLOG_TIME)) {
                    c = 5;
                    break;
                }
                break;
            case 1438698798:
                if (str.equals(ACTION_IS_ENABLE)) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            isEnable(wVCallBackContext);
        } else if (c == 1) {
            getTLogFileList(wVCallBackContext);
        } else if (c == 2) {
            getTLogFileListByDay(str2, wVCallBackContext);
        } else if (c == 3) {
            getTLogFileListByTime(str2, wVCallBackContext);
        } else if (c != 4 && c != 5) {
            return false;
        } else {
            uploadLogFile(str2, wVCallBackContext);
        }
        return true;
    }

    private void isEnable(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4165291", new Object[]{this, wVCallBackContext});
        } else if (f.a().r()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(MspDBHelper.RecordEntry.COLUMN_NAME_VERSION, "1");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            wVCallBackContext.success(jSONObject.toString());
        } else {
            wVCallBackContext.error();
        }
    }

    private void getTLogFileList(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a62f44", new Object[]{this, wVCallBackContext});
        } else if (!f.a().r()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            sendTLogList(com.taobao.tao.log.utils.a.f(), wVCallBackContext);
        }
    }

    private void getTLogFileListByDay(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a84bb3", new Object[]{this, str, wVCallBackContext});
        } else if (!f.a().r()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            try {
                sendTLogList(com.taobao.tao.log.utils.a.a(new JSONObject(str).optString("days", "")), wVCallBackContext);
            } catch (JSONException e) {
                e.printStackTrace();
                error(wVCallBackContext, ERROR_DATA_INVALID);
            }
        }
    }

    private void getTLogFileListByTime(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a005e332", new Object[]{this, str, wVCallBackContext});
        } else if (!f.a().r()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("startTime", "");
                String optString2 = jSONObject.optString("endTime", "");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                long time = simpleDateFormat.parse(optString).getTime();
                long time2 = simpleDateFormat.parse(optString2).getTime();
                if (time2 < time) {
                    error(wVCallBackContext, ERROR_TIME_INVALID);
                } else {
                    sendTLogList(com.taobao.tao.log.utils.a.a(time, time2), wVCallBackContext);
                }
            } catch (Exception e) {
                e.printStackTrace();
                error(wVCallBackContext, ERROR_DATA_INVALID);
            }
        }
    }

    private void sendTLogList(List<String> list, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401a374b", new Object[]{this, list, wVCallBackContext});
            return;
        }
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            JSONArray jSONArray = new JSONArray();
            for (String str : list) {
                File file = new File(str);
                if (file.exists()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("fileName", file.getName());
                    jSONObject.put("fileSize", file.length());
                    jSONObject.put("filePath", str);
                    jSONObject.put("lastModify", simpleDateFormat.format(Long.valueOf(file.lastModified())));
                    jSONArray.put(i, jSONObject);
                    i++;
                }
            }
            if (jSONArray.length() == 0) {
                Log.e(TAG, "TLog file is empty!");
                error(wVCallBackContext, ERROR_NO_TLOG_FILE);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, jSONArray);
            wVCallBackContext.success(jSONObject2.toString());
        } catch (Exception e) {
            Log.e(TAG, "Get TLog file exception!");
            e.printStackTrace();
            error(wVCallBackContext, "100");
        }
    }

    private void uploadLogFile(String str, final WVCallBackContext wVCallBackContext) {
        long j;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9493a2d", new Object[]{this, str, wVCallBackContext});
        } else if (!f.a().r()) {
            Log.e(TAG, "Scan Upload is disable");
            error(wVCallBackContext, "101");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("bizType", "");
                String optString2 = jSONObject.optString("bizCode", "");
                String optString3 = jSONObject.optString("startTime", "");
                String optString4 = jSONObject.optString("endTime", "");
                String optString5 = jSONObject.optString("days", "");
                this.sessionID = jSONObject.optString(com.taobao.tao.log.statistics.d.PARAM_SESSION_ID, "");
                String.format("sessionID=%s, bizType=%s, bizCode=%s, %s-%s", this.sessionID, optString, optString2, optString3, optString4);
                if (!StringUtils.isEmpty(optString) && !StringUtils.isEmpty(optString2)) {
                    if (StringUtils.isEmpty(this.sessionID)) {
                        error(wVCallBackContext, ERROR_NEED_SESSION_ID);
                        return;
                    }
                    long j2 = -1;
                    long j3 = -2;
                    if (StringUtils.isEmpty(optString5)) {
                        try {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                            j2 = simpleDateFormat.parse(optString3).getTime();
                            j3 = simpleDateFormat.parse(optString4).getTime();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (j3 < j2) {
                            error(wVCallBackContext, ERROR_TIME_INVALID);
                            return;
                        } else {
                            j = j3;
                            strArr = null;
                        }
                    } else {
                        j = -2;
                        strArr = new String[]{optString5};
                    }
                    long j4 = j2;
                    HashMap hashMap = new HashMap();
                    try {
                        JSONObject optJSONObject = jSONObject.optJSONObject("extraInfos");
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, optJSONObject.getString(next));
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    TLogEventHelper.a(this.sessionID, new olk() { // from class: com.taobao.tlog.adapter.-$$Lambda$TLogDiagnose$SIZbhXA03B2ZNoMlV916JtWWfNI
                        @Override // tb.olk
                        public final void onEvent(String str2, String str3, String str4, Map map) {
                            TLogDiagnose.this.lambda$uploadLogFile$0$TLogDiagnose(wVCallBackContext, str2, str3, str4, map);
                        }
                    });
                    olg.a(this.sessionID, strArr, j4, j, optString, optString2, hashMap, (olf) null);
                    wVCallBackContext.success();
                    return;
                }
                error(wVCallBackContext, ERROR_NEED_BIZ_INFO);
            } catch (Exception e3) {
                e3.printStackTrace();
                error(wVCallBackContext, "100");
            }
        }
    }

    public /* synthetic */ void lambda$uploadLogFile$0$TLogDiagnose(WVCallBackContext wVCallBackContext, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431e8d55", new Object[]{this, wVCallBackContext, str, str2, str3, map});
        } else if (!StringUtils.isEmpty(str) && str.equals(this.sessionID)) {
            String.format("UploadDiagnose: sessionID=%s, stage=%s, event=%s, data=%s", str, str2, str3, map);
            try {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : map.entrySet()) {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject.put(com.taobao.tao.log.statistics.d.PARAM_SESSION_ID, str);
                jSONObject.put("stage", str2);
                jSONObject.put("event", str3);
                wVCallBackContext.fireEvent(EVENT_UPLOAD_PROCESS, jSONObject.toString());
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(TAG, "fireEvent exception!!");
            }
        }
    }

    private void error(WVCallBackContext wVCallBackContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f7cf16", new Object[]{this, wVCallBackContext, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.taobao.mtop.wvplugin.a.RESULT_KEY, str);
            wVCallBackContext.error(jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            wVCallBackContext.error();
        }
    }
}
