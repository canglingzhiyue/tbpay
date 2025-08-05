package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import java.util.Calendar;

/* loaded from: classes6.dex */
public class kfn {
    public static final String EMPTY = "";

    static {
        kge.a(1829067447);
    }

    public static long a(String str, long j) {
        OrangeConfig orangeConfig = OrangeConfig.getInstance();
        String config = orangeConfig.getConfig("tbcalendar_switch", str, "" + j);
        TLog.logd("calendar.TAG", "key = " + str + ", value=" + config);
        try {
            return Long.valueOf(config).longValue();
        } catch (Exception unused) {
            return j;
        }
    }

    public static ScheduleDTOModule a(JSONObject jSONObject) {
        int i;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("bizId");
            String string2 = jSONObject.getString("outId");
            String string3 = jSONObject.getString("title");
            String string4 = jSONObject.getString("startTime");
            String string5 = jSONObject.getString("endTime");
            String string6 = jSONObject.getString("link");
            String string7 = jSONObject.getString(MspFlybirdDefine.FLYBIRD_DIALOG_SUB_TITLE);
            String string8 = jSONObject.getString("repeatDays");
            if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5)) {
                ScheduleDTOModule scheduleDTOModule = new ScheduleDTOModule();
                scheduleDTOModule.setBizId(string);
                scheduleDTOModule.setOutId(string2);
                scheduleDTOModule.setTitle(string3);
                scheduleDTOModule.setSubTitle(string7);
                if (!TextUtils.isEmpty(string8)) {
                    try {
                        i = Integer.parseInt(string8);
                    } catch (Exception unused) {
                        i = 0;
                    }
                    scheduleDTOModule.setRepeatDays(i);
                }
                if (!TextUtils.isEmpty(string4)) {
                    scheduleDTOModule.setStartTime(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    scheduleDTOModule.setEndTime(string5);
                }
                scheduleDTOModule.setLink(string6);
                return scheduleDTOModule;
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    public static boolean a(ScheduleDTOModule scheduleDTOModule) {
        return scheduleDTOModule != null && !TextUtils.isEmpty(scheduleDTOModule.getBizId()) && !TextUtils.isEmpty(scheduleDTOModule.getOutId()) && !TextUtils.isEmpty(scheduleDTOModule.getLink());
    }

    public static boolean b(ScheduleDTOModule scheduleDTOModule) {
        long j;
        long j2;
        if (scheduleDTOModule == null) {
            return false;
        }
        if (scheduleDTOModule.getStartTime() != null) {
            Calendar a2 = kfo.a(scheduleDTOModule.getStartTime());
            if (a2 == null) {
                return false;
            }
            j = a2.getTimeInMillis();
        } else {
            j = 0;
        }
        if (scheduleDTOModule.getEndTime() != null) {
            Calendar a3 = kfo.a(scheduleDTOModule.getEndTime());
            if (a3 == null) {
                return false;
            }
            j2 = a3.getTimeInMillis();
        } else {
            j2 = 0;
        }
        return j > 0 && j2 > 0;
    }

    public static String c(ScheduleDTOModule scheduleDTOModule) {
        if (scheduleDTOModule == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("bizId", (Object) scheduleDTOModule.getBizId());
        jSONObject.put("bizId", (Object) scheduleDTOModule.getOutId());
        return jSONObject.toJSONString();
    }
}
