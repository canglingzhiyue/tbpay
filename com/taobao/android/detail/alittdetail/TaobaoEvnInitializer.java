package com.taobao.android.detail.alittdetail;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.alibaba.ability.impl.performance.PerformanceAbility;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLoginInterface;
import com.taobao.android.autosize.h;
import com.taobao.android.autosize.l;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.detail.ttdetail.data.common.SimpleEntry;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.s;
import com.taobao.android.detail.ttdetail.platformization.business.a;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.o;
import com.taobao.application.common.c;
import com.taobao.application.common.d;
import com.taobao.browser.jsbridge.CommonJsApiManager;
import com.taobao.calendar.aidl.business.CalendarAidlAdapter;
import com.taobao.calendar.aidl.listener.CalendarListener;
import com.taobao.calendar.aidl.model.ScheduleDTO;
import com.taobao.tao.Globals;
import com.taobao.tao.TaoApplication;
import com.taobao.tao.export.flickbtn.a;
import com.taobao.zcache.n;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Map;
import tb.bbn;
import tb.eyq;
import tb.eyx;
import tb.iyw;
import tb.kge;
import tb.krd;
import tb.krh;
import tb.krr;
import tb.kvo;
import tb.kvt;
import tb.kxe;
import tb.lqv;
import tb.mqv;
import tb.nyf;
import tb.odg;
import tb.shh;
import tb.smw;
import tb.tjv;

/* loaded from: classes4.dex */
public class TaobaoEvnInitializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TaobaoEvnInitializer";

    static {
        kge.a(2044000542);
    }

    public static void initialize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b110817", new Object[0]);
        } else if (odg.a()) {
        } else {
            new odg.f().a(new odg.b() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.17
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.b
                public Application a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (Application) ipChange2.ipc$dispatch("f921f837", new Object[]{this}) : Globals.getApplication();
                }
            }).a(new odg.o() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.o
                public boolean a(Context context) {
                    nyf nyfVar;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue();
                    }
                    try {
                        AliAdaptServiceManager aliAdaptServiceManager = AliAdaptServiceManager.getInstance();
                        if (aliAdaptServiceManager != null && (nyfVar = (nyf) aliAdaptServiceManager.findAliAdaptService(nyf.class)) != null) {
                            return nyfVar.isAutoPlayVideoUnderCurrentNetwork(context);
                        }
                    } catch (Throwable th) {
                        i.a(TaobaoEvnInitializer.TAG, "canAutoPlayInCurrentNetwork error: ", th);
                    }
                    return false;
                }
            }).a(new odg.e() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.e
                public lqv a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (lqv) ipChange2.ipc$dispatch("f0773ad", new Object[]{this});
                    }
                    try {
                        d a2 = c.a();
                        if (a2 != null) {
                            int a3 = a2.a("deviceLevel", -1);
                            if (a3 == 2) {
                                return new lqv(1, "low");
                            }
                            if (a3 == 1) {
                                return new lqv(2, "middle");
                            }
                            if (a3 == 0) {
                                return new lqv(3, "high");
                            }
                            return new lqv(0, "unknown");
                        }
                    } catch (Exception e) {
                        i.a(TaobaoEvnInitializer.TAG, PerformanceAbility.API_GET_DEVICE_LEVEL, e);
                    }
                    return new lqv(0, "unknown");
                }

                @Override // tb.odg.e
                public boolean a(Context context) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : l.b(context);
                }

                @Override // tb.odg.e
                public boolean b(Context context) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue() : l.d(context);
                }

                @Override // tb.odg.e
                public boolean c(Context context) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue() : h.a().b(context);
                }
            }).a(new odg.h() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.h
                public String a(Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("bbc5dc40", new Object[]{this, context});
                    }
                    try {
                        PositionInfo b = b.b(context);
                        if (b == null) {
                            return null;
                        }
                        return b.countryCode;
                    } catch (Throwable th) {
                        i.a(TaobaoEvnInitializer.TAG, "get CountryInfo failed.", th);
                        return null;
                    }
                }

                @Override // tb.odg.h
                public String b(Context context) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("31400281", new Object[]{this, context}) : krh.a().f30277a;
                }

                @Override // tb.odg.h
                public String c(Context context) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("a6ba28c2", new Object[]{this, context}) : krh.a().b;
                }
            }).a(new odg.k() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.k
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : TaoApplication.getTTID();
                }
            }).a(new odg.a() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.a
                public void a(String str, Context context) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b6e7fbd6", new Object[]{this, str, context});
                    } else if (TextUtils.isEmpty(str) || context == null) {
                    } else {
                        UTABTest.activateServer(str, context);
                    }
                }
            }).a(new odg.j() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.j
                public boolean a(Context context, eyx eyxVar, JSONObject jSONObject, final odg.g gVar) {
                    int i;
                    Uri parse;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("7c7cf443", new Object[]{this, context, eyxVar, jSONObject, gVar})).booleanValue();
                    }
                    String b = com.taobao.android.detail.ttdetail.utils.d.b((Item) eyxVar.a().a(Item.class), "");
                    String string = jSONObject.getString("title");
                    String string2 = jSONObject.getString("link");
                    long longValue = jSONObject.getLongValue("startTime");
                    long longValue2 = jSONObject.getLongValue("endTime");
                    try {
                        i = jSONObject.getIntValue("sourceId");
                    } catch (Throwable th) {
                        i.a(TaobaoEvnInitializer.TAG, "setRemind error with sourceId", th);
                        i = 0;
                    }
                    if (TextUtils.isEmpty(b)) {
                        return false;
                    }
                    i.a(TaobaoEvnInitializer.TAG, "setReminder");
                    ScheduleDTO scheduleDTO = new ScheduleDTO();
                    scheduleDTO.setEventId(b);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
                    scheduleDTO.setSourceId(i);
                    if (string != null) {
                        scheduleDTO.setTitle(string);
                        scheduleDTO.setDescription(string);
                    }
                    try {
                        scheduleDTO.setStartTime(simpleDateFormat.format(Long.valueOf(longValue)));
                        scheduleDTO.setEndTime(simpleDateFormat.format(Long.valueOf(longValue2)));
                    } catch (Throwable th2) {
                        i.a(TaobaoEvnInitializer.TAG, "setReminder error with time", th2);
                    }
                    scheduleDTO.setRemind(180);
                    scheduleDTO.setIsallday(0);
                    try {
                        if (!TextUtils.isEmpty(string2)) {
                            parse = Uri.parse(string2);
                        } else {
                            parse = Uri.parse("https://h5.m.taobao.com/awp/core/detail.htm?id=" + b);
                        }
                        scheduleDTO.setLink(parse.buildUpon().appendQueryParameter("reminded", "1").appendQueryParameter("fromCalendar", "1").appendQueryParameter("backurl", "index").build().toString());
                        CalendarAidlAdapter.getInstance().init(context);
                        CalendarAidlAdapter.getInstance().registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.11.1
                            @Override // com.taobao.calendar.aidl.listener.CalendarListener
                            public void onSuccess(boolean z, String str, String[] strArr) {
                                i.a(TaobaoEvnInitializer.TAG, "setReminder onSuccess flag=" + z + ", eventId=" + str);
                                odg.g gVar2 = gVar;
                                if (gVar2 != null) {
                                    gVar2.a();
                                }
                            }

                            @Override // com.taobao.calendar.aidl.listener.CalendarListener
                            public void onError(String str, String str2) {
                                i.a(TaobaoEvnInitializer.TAG, "setReminder onError errCode=" + str + ", eventId=" + str2);
                                odg.g gVar2 = gVar;
                                if (gVar2 != null) {
                                    gVar2.a(str, "failed with eventId: " + str2);
                                }
                            }
                        });
                        CalendarAidlAdapter.getInstance().setReminder(scheduleDTO);
                        i.a(TaobaoEvnInitializer.TAG, "setReminder Done");
                        return true;
                    } catch (Throwable th3) {
                        i.a(TaobaoEvnInitializer.TAG, "setReminder exception", th3);
                        return false;
                    }
                }

                @Override // tb.odg.j
                public boolean b(Context context, eyx eyxVar, JSONObject jSONObject, final odg.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5cf64a44", new Object[]{this, context, eyxVar, jSONObject, gVar})).booleanValue();
                    }
                    String string = jSONObject.getString("sourceId");
                    String a2 = com.taobao.android.detail.ttdetail.utils.d.a((Item) eyxVar.a().a(Item.class));
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(a2)) {
                        CalendarAidlAdapter calendarAidlAdapter = CalendarAidlAdapter.getInstance();
                        calendarAidlAdapter.registerListener(new CalendarListener.Stub() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.11.2
                            @Override // com.taobao.calendar.aidl.listener.CalendarListener
                            public void onSuccess(boolean z, String str, String[] strArr) throws RemoteException {
                                i.a(TaobaoEvnInitializer.TAG, "checkCalendarRemind onSuccess flag=" + z + ", eventId=" + str);
                                odg.g gVar2 = gVar;
                                if (gVar2 != null) {
                                    if (z) {
                                        gVar2.a();
                                    } else {
                                        gVar2.a("calender biz error", "calender onSuccess with flag is false");
                                    }
                                }
                            }

                            @Override // com.taobao.calendar.aidl.listener.CalendarListener
                            public void onError(String str, String str2) throws RemoteException {
                                StringBuilder sb = new StringBuilder();
                                sb.append("checkCalendarRemind return error: errorCode: ");
                                String str3 = "";
                                sb.append(TextUtils.isEmpty(str) ? str3 : str);
                                sb.append(", eventId: ");
                                if (!TextUtils.isEmpty(str2)) {
                                    str3 = str2;
                                }
                                sb.append(str3);
                                i.a(TaobaoEvnInitializer.TAG, sb.toString());
                                odg.g gVar2 = gVar;
                                if (gVar2 != null) {
                                    gVar2.a(str, "failed with eventId: " + str2);
                                }
                            }
                        });
                        try {
                            calendarAidlAdapter.checkReminderExist(Integer.parseInt(string), a2);
                            return true;
                        } catch (Throwable th) {
                            i.a(TaobaoEvnInitializer.TAG, "checkCalendarRemind exception", th);
                        }
                    }
                    return false;
                }
            }).a(new odg.n() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.n
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    try {
                        return FestivalMgr.a().f();
                    } catch (Throwable unused) {
                        return false;
                    }
                }

                @Override // tb.odg.n
                public boolean b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
                    }
                    try {
                        if (!a()) {
                            if (!com.taobao.android.festival.skin.b.a().b()) {
                                return false;
                            }
                        }
                        return true;
                    } catch (Throwable unused) {
                        return false;
                    }
                }

                @Override // tb.odg.n
                public String a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
                    }
                    if (!b()) {
                        return null;
                    }
                    try {
                        if (a()) {
                            return FestivalMgr.a().a(str, str2);
                        }
                        return com.taobao.android.festival.skin.b.a().a(str, str2);
                    } catch (Throwable unused) {
                        return null;
                    }
                }

                @Override // tb.odg.n
                public int a(String str, String str2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("4dba94fa", new Object[]{this, str, str2, new Integer(i)})).intValue();
                    }
                    if (b()) {
                        try {
                            if (a()) {
                                return FestivalMgr.a().a(str, str2, i);
                            }
                            return com.taobao.android.festival.skin.b.a().a(str, str2, i);
                        } catch (Throwable unused) {
                        }
                    }
                    return i;
                }
            }).a(new odg.m() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.m
                public void a(SimpleEntry<String, String> simpleEntry) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("54628f29", new Object[]{this, simpleEntry});
                    } else if (simpleEntry == null) {
                    } else {
                        String key = simpleEntry.getKey();
                        String value = simpleEntry.getValue();
                        if (TextUtils.isEmpty(key) || TextUtils.isEmpty(value)) {
                            return;
                        }
                        n.a(Arrays.asList(key, value));
                    }
                }

                @Override // tb.odg.m
                public void a(String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3b26fb7", new Object[]{this, strArr});
                    } else if (strArr == null) {
                    } else {
                        n.a(Arrays.asList(strArr));
                    }
                }
            }).a(new odg.d() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.d
                public boolean a(String str, odg.i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b927214f", new Object[]{this, str, iVar})).booleanValue();
                    }
                    krd.a(str, iVar);
                    return true;
                }

                @Override // tb.odg.d
                public boolean a(String str, Map<String, String> map, odg.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("9e4a6c32", new Object[]{this, str, map, gVar})).booleanValue();
                    }
                    krd.a(str, map, gVar);
                    return true;
                }

                @Override // tb.odg.d
                public boolean a(String str, odg.g gVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("b9263891", new Object[]{this, str, gVar})).booleanValue();
                    }
                    krd.a(str, gVar);
                    return true;
                }

                @Override // tb.odg.d
                public boolean a(String str, int i, int i2, odg.l lVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("28cb424c", new Object[]{this, str, new Integer(i), new Integer(i2), lVar})).booleanValue();
                    }
                    krd.a(str, i, i2, lVar);
                    return true;
                }
            }).a(new odg.q() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.q
                public String a(int i) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : com.alibaba.ability.localization.b.a(i);
                }

                @Override // tb.odg.q
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : com.alibaba.ability.localization.b.c();
                }

                @Override // tb.odg.q
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : com.alibaba.ability.localization.b.d();
                }
            }).a(new odg.c() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.c
                public void a(String str, String str2, String str3, String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("50031319", new Object[]{this, str, str2, str3, strArr});
                    } else {
                        BehaviR.getInstance().commitNewTap(str, str2, str3, strArr);
                    }
                }

                @Override // tb.odg.c
                public void a(String str, String str2, String str3, View view, String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cd09d2d3", new Object[]{this, str, str2, str3, view, strArr});
                    } else {
                        BehaviR.getInstance().trackAppear(str, str2, str3, view, strArr);
                    }
                }

                @Override // tb.odg.c
                public void b(String str, String str2, String str3, View view, String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcc106d4", new Object[]{this, str, str2, str3, view, strArr});
                    } else {
                        BehaviR.getInstance().trackDisAppear(str, str2, str3, view, strArr);
                    }
                }

                @Override // tb.odg.c
                public void a(String str, String str2, Object obj, String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("55f39fc7", new Object[]{this, str, str2, obj, strArr});
                    } else {
                        com.taobao.android.behavix.h.a(str, str2, obj, strArr);
                    }
                }

                @Override // tb.odg.c
                public void b(String str, String str2, Object obj, String... strArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6ef4f166", new Object[]{this, str, str2, obj, strArr});
                    } else {
                        com.taobao.android.behavix.h.b(str, str2, obj, strArr);
                    }
                }

                @Override // tb.odg.c
                public void a(String str, Object obj, Map<String, String> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("73b43a37", new Object[]{this, str, obj, map});
                    } else {
                        com.taobao.android.behavix.h.a(str, obj, map);
                    }
                }
            }).a(new odg.r() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.r
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this});
                    }
                    AliLoginInterface a2 = o.a();
                    if (a2 != null) {
                        return a2.e();
                    }
                    return null;
                }

                @Override // tb.odg.r
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this});
                    }
                    AliLoginInterface a2 = o.a();
                    if (a2 != null) {
                        return a2.d();
                    }
                    return null;
                }

                @Override // tb.odg.r
                public boolean c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
                    }
                    AliLoginInterface a2 = o.a();
                    if (a2 != null) {
                        return a2.b();
                    }
                    return false;
                }

                @Override // tb.odg.r
                public void a(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    AliLoginInterface a2 = o.a();
                    if (a2 == null) {
                        return;
                    }
                    a2.a(z);
                }
            }).a(new odg.p() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.p
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "android_detail";
                }
            }).a(new odg.t() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.t
                public Drawable a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Drawable) ipChange2.ipc$dispatch("1e792452", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.odg.t
                public Drawable a(boolean z, boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Drawable) ipChange2.ipc$dispatch("593c73d2", new Object[]{this, new Boolean(z), new Boolean(z2)});
                    }
                    return null;
                }

                @Override // tb.odg.t
                public Drawable b(boolean z, boolean z2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Drawable) ipChange2.ipc$dispatch("60a1a8f1", new Object[]{this, new Boolean(z), new Boolean(z2)});
                    }
                    return null;
                }

                @Override // tb.odg.t
                public Drawable c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Drawable) ipChange2.ipc$dispatch("ccb50610", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.odg.t
                public Drawable d() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Drawable) ipChange2.ipc$dispatch("23d2f6ef", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.odg.t
                public Drawable e() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Drawable) ipChange2.ipc$dispatch("7af0e7ce", new Object[]{this});
                    }
                    return null;
                }

                @Override // tb.odg.t
                public iyw a(Context context, eyx eyxVar, eyq eyqVar) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (iyw) ipChange2.ipc$dispatch("cc399820", new Object[]{this, context, eyxVar, eyqVar}) : new mqv(context, eyxVar, eyqVar);
                }

                @Override // tb.odg.t
                public int b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : f.a(8.0f);
                }

                @Override // tb.odg.t
                public void a(Context context, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("61b6362a", new Object[]{this, context, str});
                    } else {
                        tjv.a().a(context, str);
                    }
                }
            }).a(new odg.s() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.s
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "a2141.7631564";
                }

                @Override // tb.odg.s
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : "pagedetail";
                }
            }).a(new odg.u() { // from class: com.taobao.android.detail.alittdetail.TaobaoEvnInitializer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.odg.u
                public boolean a(String str) {
                    int i;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
                    }
                    if (!a.BIZ_TYPE_FLIGGY.equals(str)) {
                        if (a.BIZ_TYPE_TINY_SHOP.equals(str)) {
                            if ((com.android.tools.bundleInfo.b.a().c(shh.ARTIFACT_ID) != null) && !shh.a()) {
                                shh.b();
                                i = -500006;
                                str2 = "直播小店远程化安装失败";
                            }
                        }
                        return true;
                    }
                    if (!(com.android.tools.bundleInfo.b.a().c(bbn.ARTIFACT_ID) != null) || bbn.a()) {
                        return true;
                    }
                    bbn.b();
                    i = -500005;
                    str2 = "飞猪远程化安装失败";
                    ae.a(i, str2);
                    return false;
                }
            }).a();
        }
    }

    public static void overrideOrImplementDefaultBehaviors(Context context, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a21ff9", new Object[]{context, eyxVar});
            return;
        }
        CommonJsApiManager.initCommonJsbridge();
        com.taobao.android.detail.alittdetail.share.a aVar = new com.taobao.android.detail.alittdetail.share.a(context, eyxVar);
        eyxVar.c().a("openShare", aVar);
        eyxVar.c().a("share", aVar);
        kvo kvoVar = new kvo(context, eyxVar);
        eyxVar.c().a("openRate", kvoVar);
        eyxVar.c().a(s.EVENT_TYPE_ALTERNATIVE, kvoVar);
        eyxVar.c().a(krr.EVENT_TYPE, new krr(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.alittdetail.implementor.a.EVENT_TYPE, new com.taobao.android.detail.alittdetail.implementor.a(context, eyxVar));
        eyxVar.f().a(com.taobao.tao.export.flickbtn.a.DXFLICKINGSHAREBUTTON_FLICKINGSHAREBUTTON, new a.C0828a());
        eyxVar.d().a("native", kvt.NAME, new kvt());
        eyxVar.f().a(kxe.DX_ABILITY_ID, new kxe.a());
        eyxVar.f().a("abilityHub", kxe.NAME, new kxe.a());
        eyxVar.f().a(smw.f33724a, new smw.a());
        eyxVar.f().a("abilityHub", smw.NAME, new smw.a());
    }
}
