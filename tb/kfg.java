package tb;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.exception.CalendarResult;
import com.taobao.calendar.synchro.CalendarSyncAllResponse;
import com.taobao.calendar.synchro.b;
import com.taobao.calendar.synchro.c;
import com.taobao.calendar.synchro.d;

/* loaded from: classes6.dex */
public class kfg {

    /* renamed from: a  reason: collision with root package name */
    public kfh f30030a;
    public c b = new d();

    static {
        kge.a(833481208);
    }

    public kfg(Context context) {
        this.f30030a = new kfk(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, kfi kfiVar) {
        JSONObject jSONObject;
        if (kfiVar == null || str == null) {
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            kfiVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
            return;
        }
        JSONArray jSONArray = parseObject.getJSONArray("calendarPlanList");
        if (jSONArray == null || jSONArray.isEmpty()) {
            kfiVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.size() && (jSONObject = (JSONObject) jSONArray.get(i)) != null; i++) {
            if (kfl.a().a(jSONObject.getString("bizId"), jSONObject.getString("outId"))) {
                jSONArray2.add(jSONObject);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("result", (Object) jSONArray2);
        kfiVar.a(CalendarResult.KTCALENDAR_SUCCESS, jSONObject2.toJSONString());
    }

    public void a(final ScheduleDTOModule scheduleDTOModule, final kfi kfiVar) {
        if (scheduleDTOModule == null || StringUtils.isEmpty(scheduleDTOModule.getBizId()) || StringUtils.isEmpty(scheduleDTOModule.getOutId())) {
            kfiVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
        } else if (kfl.a().a(scheduleDTOModule.getBizId(), scheduleDTOModule.getOutId())) {
            kfiVar.a(CalendarResult.kTBCALENDAR_REMINDER_EXISTS, null);
        } else {
            this.f30030a.a(scheduleDTOModule, new kfi() { // from class: tb.kfg.1
                @Override // tb.kfi
                public void a(CalendarResult calendarResult, String str) {
                    if (calendarResult == CalendarResult.KTCALENDAR_SUCCESS) {
                        kfl.a().a(scheduleDTOModule);
                        kfg.this.b.a(scheduleDTOModule, null);
                    }
                    kfiVar.a(calendarResult, str);
                }
            });
        }
    }

    public void a(final String str, final String str2, final kfi kfiVar) {
        if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
            kfiVar.a(CalendarResult.KTCALENDAR_INVALID_PARAM, null);
        }
        this.f30030a.a(str, str2, new kfi() { // from class: tb.kfg.2
            @Override // tb.kfi
            public void a(CalendarResult calendarResult, String str3) {
                if (calendarResult == CalendarResult.KTCALENDAR_SUCCESS) {
                    kfg.this.b.a(str, str2, null);
                    kfl.a().b(str, str2);
                }
                kfiVar.a(calendarResult, str3);
            }
        });
    }

    public void a(final String str, final kfi kfiVar) {
        if (!kfl.a().d()) {
            this.b.a(new b() { // from class: tb.kfg.3
                @Override // com.taobao.calendar.synchro.b
                public void a() {
                    kfg.this.b(str, kfiVar);
                }

                @Override // com.taobao.calendar.synchro.b
                public void a(Object obj) {
                    if (obj == null) {
                        return;
                    }
                    CalendarSyncAllResponse calendarSyncAllResponse = (CalendarSyncAllResponse) obj;
                    if (obj == null || calendarSyncAllResponse.mo2429getData() == null) {
                        return;
                    }
                    kfl.a().a(calendarSyncAllResponse.mo2429getData().result);
                    kfg.this.b(str, kfiVar);
                    kfl.a().a(true);
                }
            });
        } else {
            b(str, kfiVar);
        }
    }
}
