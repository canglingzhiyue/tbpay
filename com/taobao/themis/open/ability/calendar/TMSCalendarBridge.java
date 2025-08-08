package com.taobao.themis.open.ability.calendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.calendar.api.c;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.ability.base.annotation.APIMethod;
import com.taobao.themis.kernel.ability.base.annotation.BindingApiContext;
import com.taobao.themis.kernel.ability.base.annotation.BindingCallback;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.base.annotation.ThreadType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.i;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002JP\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0007JP\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002J<\u0010\u0015\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH\u0007J<\u0010\u0016\u001a\u00020\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\fH\u0007J\b\u0010\u0017\u001a\u00020\u0006H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J8\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/taobao/themis/open/ability/calendar/TMSCalendarBridge;", "Lcom/taobao/themis/kernel/ability/base/TMSAbility;", "()V", "mDialog", "Landroid/app/Dialog;", "addCalendarPlan", "", "apiContext", "Lcom/taobao/themis/kernel/ability/base/ApiContext;", "bridgeCallback", "Lcom/alibaba/ariver/engine/api/bridge/extension/BridgeCallback;", "startDate", "", "endDate", "title", "description", "remind", "", "addOrDelCalender", "isAdd", "", "cancelCalendarPlan", "checkCalendarPlanIsExist", "onFinalized", "onInitialized", "showCalendarDialog", "context", "Landroid/content/Context;", "content", "time", "positiveListener", "Landroid/content/DialogInterface$OnClickListener;", "negativeListener", "Companion", "themis_open_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSCalendarBridge implements com.taobao.themis.kernel.ability.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion;
    public static final int ERROR_DATA_ERROR = 111;
    public static final int ERROR_DATA_FORMAT = 109;
    public static final int ERROR_REMOVE_CALENDAR_ERROR = 110;
    public static final int ERROR_USER_CANCEL = 107;
    public static final int ERROR_USER_REFUSE_SYSTEM_PERMISSION = 108;
    public static final String TAG = "TMSCalendarBridge";
    public static final String module = "calendarService";
    public static final String namespace = "themis";

    /* renamed from: a  reason: collision with root package name */
    private Dialog f22636a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ApiContext f22637a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Ref.ObjectRef e;
        public final /* synthetic */ Ref.ObjectRef f;
        public final /* synthetic */ int g;
        public final /* synthetic */ BridgeCallback h;

        public b(ApiContext apiContext, boolean z, String str, String str2, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, int i, BridgeCallback bridgeCallback) {
            this.f22637a = apiContext;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = objectRef;
            this.f = objectRef2;
            this.g = i;
            this.h = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            Activity a2 = this.f22637a.a();
            q.b(a2, "apiContext.activity");
            com.taobao.desktop.channel.calendar.api.c.a(a2.getApplicationContext(), new c.a() { // from class: com.taobao.themis.open.ability.calendar.TMSCalendarBridge.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void a() {
                    boolean b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    try {
                        if (b.this.b) {
                            Activity a3 = b.this.f22637a.a();
                            q.b(a3, "apiContext.activity");
                            Context applicationContext = a3.getApplicationContext();
                            String str = b.this.c;
                            String str2 = b.this.d;
                            Date date = (Date) b.this.e.element;
                            q.a(date);
                            long time = date.getTime();
                            Date date2 = (Date) b.this.f.element;
                            q.a(date2);
                            b = com.taobao.desktop.channel.calendar.api.c.a(applicationContext, str, str2, time, date2.getTime(), b.this.g);
                        } else {
                            Activity a4 = b.this.f22637a.a();
                            q.b(a4, "apiContext.activity");
                            Context applicationContext2 = a4.getApplicationContext();
                            String str3 = b.this.c;
                            Date date3 = (Date) b.this.e.element;
                            q.a(date3);
                            long time2 = date3.getTime();
                            Date date4 = (Date) b.this.f.element;
                            q.a(date4);
                            b = com.taobao.desktop.channel.calendar.api.c.b(applicationContext2, str3, time2, date4.getTime());
                        }
                        if (b) {
                            b.this.h.sendBridgeResponse(BridgeResponse.SUCCESS);
                        } else if (b.this.b) {
                            b.this.h.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                        } else {
                            b.this.h.sendBridgeResponse(new BridgeResponse.Error(110, "未查到对应的日历事件"));
                        }
                    } catch (Throwable th) {
                        TMSLogger.b(TMSCalendarBridge.TAG, "", th);
                        b.this.h.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                    }
                }

                @Override // com.taobao.desktop.channel.calendar.api.c.a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        b.this.h.sendBridgeResponse(new BridgeResponse.Error(108, "用户拒绝使用日历权限"));
                    }
                }
            });
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BridgeCallback f22639a;

        public c(BridgeCallback bridgeCallback) {
            this.f22639a = bridgeCallback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f22639a.sendBridgeResponse(new BridgeResponse.Error(107, "用户拒绝设置提醒"));
            }
        }
    }

    static {
        kge.a(240591236);
        kge.a(-86622547);
        Companion = new a(null);
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onFinalized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd1b9dee", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.ability.base.a
    public void onInitialized() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f2f17c", new Object[]{this});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/taobao/themis/open/ability/calendar/TMSCalendarBridge$Companion;", "", "()V", "ERROR_DATA_ERROR", "", "ERROR_DATA_FORMAT", "ERROR_REMOVE_CALENDAR_ERROR", "ERROR_USER_CANCEL", "ERROR_USER_REFUSE_SYSTEM_PERMISSION", RPCDataItems.SWITCH_TAG_LOG, "", "module", "namespace", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a {
        static {
            kge.a(203290572);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void addCalendarPlan(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"startDate"}) String startDate, @BindingParam(name = {"endDate"}) String endDate, @BindingParam(name = {"title"}) String title, @BindingParam(name = {"description"}) String description, @BindingParam(name = {"remind"}) int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3255952b", new Object[]{this, apiContext, bridgeCallback, startDate, endDate, title, description, new Integer(i)});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        q.d(startDate, "startDate");
        q.d(endDate, "endDate");
        q.d(title, "title");
        q.d(description, "description");
        a(true, apiContext, startDate, endDate, title, description, i, bridgeCallback);
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void cancelCalendarPlan(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"startDate"}) String startDate, @BindingParam(name = {"endDate"}) String endDate, @BindingParam(name = {"title"}) String title) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72009095", new Object[]{this, apiContext, bridgeCallback, startDate, endDate, title});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        q.d(startDate, "startDate");
        q.d(endDate, "endDate");
        q.d(title, "title");
        addOrDelCalender$default(this, false, apiContext, startDate, endDate, title, null, 0, bridgeCallback, 96, null);
    }

    public static /* synthetic */ void addOrDelCalender$default(TMSCalendarBridge tMSCalendarBridge, boolean z, ApiContext apiContext, String str, String str2, String str3, String str4, int i, BridgeCallback bridgeCallback, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c55759e5", new Object[]{tMSCalendarBridge, new Boolean(z), apiContext, str, str2, str3, str4, new Integer(i), bridgeCallback, new Integer(i2), obj});
        } else {
            tMSCalendarBridge.a(z, apiContext, str, str2, str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? 0 : i, bridgeCallback);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.Date] */
    /* JADX WARN: Type inference failed for: r0v20, types: [T, java.util.Date] */
    /* JADX WARN: Type inference failed for: r4v14, types: [T, java.util.Date] */
    private final void a(boolean z, ApiContext apiContext, String str, String str2, String str3, String str4, int i, BridgeCallback bridgeCallback) {
        Object m2371constructorimpl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d36ea", new Object[]{this, new Boolean(z), apiContext, str, str2, str3, str4, new Integer(i), bridgeCallback});
            return;
        }
        if ((apiContext != null ? apiContext.a() : null) == null || apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || StringUtils.isEmpty(str3)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? r4 = (Date) 0;
            objectRef.element = r4;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = r4;
            String str5 = null;
            try {
                Result.a aVar = Result.Companion;
                objectRef.element = com.taobao.themis.open.ability.calendar.a.INSTANCE.b(str);
                objectRef2.element = com.taobao.themis.open.ability.calendar.a.INSTANCE.b(str2);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                m2371constructorimpl = Result.m2371constructorimpl(i.a(th));
            }
            if (((Date) objectRef.element) != null && ((Date) objectRef2.element) != null) {
                Date date = (Date) objectRef.element;
                q.a(date);
                if (date.compareTo((Date) objectRef2.element) <= 0) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm");
                    StringBuilder sb = new StringBuilder();
                    Date date2 = (Date) objectRef.element;
                    q.a(date2);
                    sb.append(simpleDateFormat.format(Long.valueOf(date2.getTime())));
                    sb.append(" ~ ");
                    Date date3 = (Date) objectRef2.element;
                    q.a(date3);
                    sb.append(simpleDateFormat.format(Long.valueOf(date3.getTime())));
                    str5 = sb.toString();
                    m2371constructorimpl = Result.m2371constructorimpl(t.INSTANCE);
                    Throwable m2374exceptionOrNullimpl = Result.m2374exceptionOrNullimpl(m2371constructorimpl);
                    if (m2374exceptionOrNullimpl != null) {
                        TMSLogger.b("TMSCalendarAbility", "format data error", m2374exceptionOrNullimpl);
                        bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(109, "日期格式异常"));
                        return;
                    }
                    Activity a2 = apiContext.a();
                    q.b(a2, "apiContext.activity");
                    a(a2, z ? "设置日历提醒" : "取消日历提醒", str3, str5 == null ? "" : str5, new b(apiContext, z, str3, str4, objectRef, objectRef2, i, bridgeCallback), new c(bridgeCallback));
                    return;
                }
            }
            bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(111, "日期错误endDate不得早于startDate"));
        }
    }

    @ThreadType(ExecutorType.UI)
    @APIMethod
    public final void checkCalendarPlanIsExist(@BindingApiContext ApiContext apiContext, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(name = {"startDate"}) String startDate, @BindingParam(name = {"endDate"}) String endDate, @BindingParam(name = {"title"}) String title) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0edb358", new Object[]{this, apiContext, bridgeCallback, startDate, endDate, title});
            return;
        }
        q.d(bridgeCallback, "bridgeCallback");
        q.d(startDate, "startDate");
        q.d(endDate, "endDate");
        q.d(title, "title");
        if ((apiContext != null ? apiContext.a() : null) == null || apiContext.c() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
        } else if (StringUtils.isEmpty(startDate) || StringUtils.isEmpty(endDate) || StringUtils.isEmpty(title)) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.INVALID_PARAM);
        } else {
            Activity a2 = apiContext.a();
            q.b(a2, "apiContext.activity");
            com.taobao.desktop.channel.calendar.api.c.a(a2.getApplicationContext(), new d(startDate, endDate, apiContext, title, bridgeCallback));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/taobao/themis/open/ability/calendar/TMSCalendarBridge$checkCalendarPlanIsExist$1", "Lcom/taobao/desktop/channel/calendar/api/CalendarServiceProtocol$ServiceCallback;", "onError", "", "onSuccess", "themis_open_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d implements c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22640a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ApiContext c;
        public final /* synthetic */ String d;
        public final /* synthetic */ BridgeCallback e;

        public d(String str, String str2, ApiContext apiContext, String str3, BridgeCallback bridgeCallback) {
            this.f22640a = str;
            this.b = str2;
            this.c = apiContext;
            this.d = str3;
            this.e = bridgeCallback;
        }

        @Override // com.taobao.desktop.channel.calendar.api.c.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            try {
                Date b = com.taobao.themis.open.ability.calendar.a.INSTANCE.b(this.f22640a);
                q.a(b);
                long time = b.getTime();
                Date b2 = com.taobao.themis.open.ability.calendar.a.INSTANCE.b(this.b);
                q.a(b2);
                long time2 = b2.getTime();
                Activity a2 = this.c.a();
                q.b(a2, "apiContext.activity");
                boolean a3 = com.taobao.desktop.channel.calendar.api.c.a(a2.getApplicationContext(), this.d, time, time2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "isExist", (String) Boolean.valueOf(a3));
                this.e.sendBridgeResponse(new BridgeResponse(jSONObject));
            } catch (Throwable th) {
                TMSLogger.b(TMSCalendarBridge.TAG, "", th);
                this.e.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            }
        }

        @Override // com.taobao.desktop.channel.calendar.api.c.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                this.e.sendBridgeResponse(new BridgeResponse.Error(108, "用户拒绝使用日历权限"));
            }
        }
    }

    private final void a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53fc65e", new Object[]{this, context, str, str2, str3, onClickListener, onClickListener2});
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!StringUtils.isEmpty(str2)) {
            str3 = n.a("\n            " + str3 + "\n            " + str2 + "\n            ");
        }
        this.f22636a = builder.setTitle(str).setMessage(str3).setPositiveButton("同意", onClickListener).setNegativeButton("拒绝", onClickListener2).create();
        Dialog dialog = this.f22636a;
        q.a(dialog);
        dialog.show();
    }
}
