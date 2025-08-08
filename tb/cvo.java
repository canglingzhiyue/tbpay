package tb;

import android.content.Context;
import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alipay.mobile.common.logging.api.LogContext;
import com.heytap.mcssdk.constant.McsEventConstant;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import com.taobao.tao.log.statistics.d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class cvo extends cvp {
    static {
        kge.a(879963908);
    }

    @Override // tb.cvq
    public BaseMode a(Context context, int i, Intent intent) {
        if (4103 == i || 4098 == i || 4108 == i) {
            BaseMode a2 = a(intent, i);
            cvu.a(context, McsEventConstant.EventId.EVENT_ID_PUSH_TRANSMIT, (DataMessage) a2);
            return a2;
        }
        return null;
    }

    @Override // tb.cvp
    public BaseMode a(Intent intent, int i) {
        try {
            DataMessage dataMessage = new DataMessage();
            dataMessage.setMessageID(cvw.d(intent.getStringExtra("messageID")));
            dataMessage.setTaskID(cvw.d(intent.getStringExtra(d.PARAM_TASK_ID)));
            dataMessage.setGlobalId(cvw.d(intent.getStringExtra("globalID")));
            dataMessage.setAppPackage(cvw.d(intent.getStringExtra("appPackage")));
            dataMessage.setTitle(cvw.d(intent.getStringExtra("title")));
            dataMessage.setContent(cvw.d(intent.getStringExtra("content")));
            dataMessage.setDescription(cvw.d(intent.getStringExtra("description")));
            String d = cvw.d(intent.getStringExtra("notifyID"));
            int i2 = 0;
            dataMessage.setNotifyID(StringUtils.isEmpty(d) ? 0 : Integer.parseInt(d));
            dataMessage.setMiniProgramPkg(cvw.d(intent.getStringExtra("miniProgramPkg")));
            dataMessage.setMessageType(i);
            dataMessage.setEventId(cvw.d(intent.getStringExtra("eventId")));
            dataMessage.setStatisticsExtra(cvw.d(intent.getStringExtra("statistics_extra")));
            String d2 = cvw.d(intent.getStringExtra("data_extra"));
            dataMessage.setDataExtra(d2);
            String a2 = a(d2);
            if (!StringUtils.isEmpty(a2)) {
                i2 = Integer.parseInt(a2);
            }
            dataMessage.setMsgCommand(i2);
            dataMessage.setBalanceTime(cvw.d(intent.getStringExtra("balanceTime")));
            dataMessage.setStartDate(cvw.d(intent.getStringExtra("startDate")));
            dataMessage.setEndDate(cvw.d(intent.getStringExtra("endDate")));
            dataMessage.setTimeRanges(cvw.d(intent.getStringExtra("timeRanges")));
            dataMessage.setRule(cvw.d(intent.getStringExtra(LinkageUtils.PolicyType.RULE)));
            dataMessage.setForcedDelivery(cvw.d(intent.getStringExtra("forcedDelivery")));
            dataMessage.setDistinctContent(cvw.d(intent.getStringExtra("distinctBycontent")));
            dataMessage.setAppId(cvw.d(intent.getStringExtra(LogContext.STORAGE_APPID)));
            return dataMessage;
        } catch (Exception e) {
            cvy.a("OnHandleIntent--" + e.getMessage());
            return null;
        }
    }

    public String a(String str) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new JSONObject(str).optString("msg_command");
        } catch (JSONException e) {
            cvy.a(e.getMessage());
            return "";
        }
    }
}
