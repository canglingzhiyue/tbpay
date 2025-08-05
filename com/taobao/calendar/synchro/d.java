package com.taobao.calendar.synchro;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kfl;
import tb.kge;

/* loaded from: classes6.dex */
public class d implements c {
    static {
        kge.a(466608585);
        kge.a(-2137379385);
    }

    public List<ScheduleDTOModule> a(ScheduleDTOModule scheduleDTOModule) {
        ArrayList arrayList = new ArrayList();
        if (scheduleDTOModule == null) {
            return arrayList;
        }
        List<ScheduleDTOModule> c = kfl.a().c();
        if (c == null || c.isEmpty()) {
            arrayList.add(scheduleDTOModule);
            return arrayList;
        }
        for (ScheduleDTOModule scheduleDTOModule2 : c) {
            if (scheduleDTOModule2 != null && scheduleDTOModule2.getUpdate() == -1) {
                arrayList.add(scheduleDTOModule2);
            }
        }
        arrayList.add(scheduleDTOModule);
        return arrayList;
    }

    public static /* synthetic */ List a(d dVar, ScheduleDTOModule scheduleDTOModule) {
        return dVar.a(scheduleDTOModule);
    }

    public static /* synthetic */ void a(d dVar, List list) {
        dVar.a(list);
    }

    public void a(List<ScheduleDTOModule> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (ScheduleDTOModule scheduleDTOModule : list) {
            if (scheduleDTOModule != null) {
                scheduleDTOModule.setUpdate(-1);
            }
        }
        kfl.a().a(list);
    }

    @Override // com.taobao.calendar.synchro.c
    public void a(final ScheduleDTOModule scheduleDTOModule, b bVar) {
        CalendarAddRequest calendarAddRequest = new CalendarAddRequest();
        calendarAddRequest.submitData = JSON.toJSONString(a(scheduleDTOModule));
        a.a(new IRemoteBaseListener() { // from class: com.taobao.calendar.synchro.SyncClient$1
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                Log.e("SyncClient", "mtop query onSuccess");
                d dVar = d.this;
                d.a(dVar, d.a(dVar, scheduleDTOModule));
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                Log.e("SyncClient", "mtop query onSuccess");
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                Log.e("SyncClient", "mtop query onSuccess");
                d dVar = d.this;
                d.a(dVar, d.a(dVar, scheduleDTOModule));
            }
        }, calendarAddRequest);
    }

    @Override // com.taobao.calendar.synchro.c
    public void a(final b bVar) {
        a.a(new IRemoteBaseListener() { // from class: com.taobao.calendar.synchro.SyncClient$3
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                CalendarSyncAllResponse calendarSyncAllResponse = (CalendarSyncAllResponse) baseOutDo;
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a(calendarSyncAllResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                b bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
        }, new CalendarSyncAllRequest());
    }

    @Override // com.taobao.calendar.synchro.c
    public void a(String str, String str2, b bVar) {
        CalendarCancelRequest calendarCancelRequest = new CalendarCancelRequest();
        calendarCancelRequest.bizId = str;
        calendarCancelRequest.outIds = str2;
        a.a(new IRemoteBaseListener() { // from class: com.taobao.calendar.synchro.SyncClient$2
            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            }
        }, calendarCancelRequest);
    }
}
