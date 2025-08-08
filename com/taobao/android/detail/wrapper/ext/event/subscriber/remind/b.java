package com.taobao.android.detail.wrapper.ext.event.subscriber.remind;

import android.app.Activity;
import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.params.f;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import java.text.SimpleDateFormat;
import tb.eef;
import tb.egn;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class b implements j<eef> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f11291a;

    static {
        kge.a(-2073552542);
        kge.a(-1453870097);
    }

    @Override // com.taobao.android.trade.event.j
    public /* synthetic */ i handleEvent(eef eefVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, eefVar}) : a(eefVar);
    }

    public b(Activity activity) {
        this.f11291a = activity;
        emu.a("com.taobao.android.detail.wrapper.ext.event.subscriber.remind.SetRemindSubscriber");
    }

    public i a(eef eefVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("9e0da61d", new Object[]{this, eefVar});
        }
        if (eefVar == null || eefVar.f27230a == null) {
            return com.taobao.android.detail.core.event.a.FAILURE;
        }
        a(eefVar.f27230a);
        return com.taobao.android.detail.core.event.a.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    private void a(f fVar) {
        String uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f01ee82", new Object[]{this, fVar});
        } else if (fVar == null || StringUtils.isEmpty(fVar.f9719a)) {
        } else {
            com.taobao.android.detail.core.utils.i.a("setReminder", "receive SetRemindEvent");
            ScheduleDTO scheduleDTO = new ScheduleDTO();
            scheduleDTO.setEventId(fVar.f9719a);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            scheduleDTO.setSourceId(fVar.h);
            if (fVar.b != null) {
                scheduleDTO.setTitle(fVar.b);
                scheduleDTO.setDescription(fVar.b);
            }
            long j = fVar.d;
            long j2 = fVar.e;
            try {
                scheduleDTO.setStartTime(simpleDateFormat.format(Long.valueOf(j)));
                scheduleDTO.setEndTime(simpleDateFormat.format(Long.valueOf(j2)));
            } catch (Exception unused) {
            }
            scheduleDTO.setRemind(180);
            scheduleDTO.setIsallday(0);
            try {
                if (!StringUtils.isEmpty(fVar.g)) {
                    uri = Uri.parse(fVar.g).buildUpon().appendQueryParameter("reminded", "1").appendQueryParameter("fromCalendar", "1").appendQueryParameter("backurl", "index").build().toString();
                } else {
                    uri = Uri.parse(egn.NAV_URL_DETAIL[2] + "?id=" + fVar.f9719a).buildUpon().appendQueryParameter("reminded", "1").appendQueryParameter("fromCalendar", "1").appendQueryParameter("backurl", "index").build().toString();
                }
                scheduleDTO.setLink(uri);
                CalendarAidlAdapter.getInstance().init(this.f11291a);
                CalendarAidlAdapter.getInstance().registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.wrapper.ext.event.subscriber.remind.SetRemindSubscriber$1
                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onSuccess(boolean z, String str, String[] strArr) {
                        com.taobao.android.detail.core.utils.i.a("SetRemindSb", "onSuccess b=" + z + ",s=" + str);
                    }

                    @Override // com.taobao.calendar.aidl.listener.CalendarListener
                    public void onError(String str, String str2) {
                        com.taobao.android.detail.core.utils.i.a("SetRemindSb", "onError s=" + str + ",s1=" + str2);
                    }
                });
                CalendarAidlAdapter.getInstance().setReminder(scheduleDTO);
                com.taobao.android.detail.core.utils.i.a("SetRemindSb", "SetRemindEvent done");
            } catch (Throwable unused2) {
            }
        }
    }
}
