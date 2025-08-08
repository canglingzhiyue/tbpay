package com.taobao.live.ubee.core;

import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.util.SparseIntArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.mtop.report.EventModel;
import com.taobao.live.ubee.mtop.report.EventReportRequest;
import com.taobao.live.ubee.mtop.report.EventReportResponse;
import com.taobao.live.ubee.utils.k;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.prt;
import tb.tfu;

/* loaded from: classes7.dex */
public class d implements prt.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] FILTERABLE_ACTIONS;
    public static final String TAG = "BehaviorStorage";

    /* renamed from: a  reason: collision with root package name */
    private b f17804a = new b();
    private Queue<a> b = new LinkedList();
    private prt c = new prt(this, 60000, Looper.getMainLooper());
    private SparseIntArray d = new SparseIntArray();

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.prt.a
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 1;
    }

    static {
        kge.a(-1334275744);
        kge.a(-1029138727);
        FILTERABLE_ACTIONS = new String[]{tfu.COMMENT};
    }

    public d() {
        this.d.put(1, 60000);
        this.c.a(this.d);
    }

    public void a(String str, String str2, Object obj, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f39fc7", new Object[]{this, str, str2, obj, strArr});
        } else if (!c()) {
        } else {
            this.f17804a.c();
        }
    }

    public void a(String str, String str2, String str3, String str4, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e010a68f", new Object[]{this, str, str2, str3, str4, strArr});
        } else {
            b(str, str2, strArr);
        }
    }

    public void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{this, str, str2, str3, strArr});
        } else {
            b(str, g4.b.i, strArr);
        }
    }

    public void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{this, str, str2, strArr});
            return;
        }
        b(str, "exit", strArr);
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c.removeCallbacksAndMessages(null);
        this.c.a(true);
        e();
    }

    private void b(String str, String str2, String... strArr) {
        JSONObject b;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49523982", new Object[]{this, str, str2, strArr});
        } else if (!c() || StringUtils.isEmpty(str) || StringUtils.isEmpty(str2) || a(str2) || (b = this.f17804a.b()) == null || (jSONObject = b.getJSONObject(str)) == null) {
        } else {
            String string = jSONObject.getString(str2);
            if (StringUtils.isEmpty(string)) {
                return;
            }
            a aVar = new a();
            aVar.f17802a = str;
            aVar.b = str2;
            aVar.c = a(strArr);
            this.b.add(aVar);
            int b2 = b(string);
            if (b2 <= 0) {
                e();
                return;
            }
            a(b2);
            if (!this.c.a()) {
                return;
            }
            this.c.a(false);
            this.c.a(1);
        }
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : FILTERABLE_ACTIONS) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i >= this.d.get(1) || i <= 0) {
        } else {
            this.d.put(1, i * 1000);
        }
    }

    private int b(String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{this, str})).intValue();
        }
        JSONObject a2 = this.f17804a.a();
        if (a2 != null && (jSONObject = a2.getJSONObject("priority")) != null) {
            return jSONObject.getIntValue(str);
        }
        return 0;
    }

    private Map<String, String> a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("78cf35ac", new Object[]{this, strArr});
        }
        HashMap hashMap = new HashMap();
        if (strArr != null && strArr.length > 0) {
            for (String str : strArr) {
                if (!StringUtils.isEmpty(str)) {
                    String[] split = str.split("=");
                    if (split.length == 2) {
                        hashMap.put(split[0].trim(), split[1].trim());
                    }
                }
            }
        }
        return hashMap;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList(this.b);
        this.b.clear();
        a((List<a>) arrayList);
    }

    public static boolean a(Collection collection) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d2847c1d", new Object[]{collection})).booleanValue() : collection == null || collection.isEmpty();
    }

    public static boolean a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("638f9910", new Object[]{charSequence})).booleanValue() : charSequence == null || charSequence.length() == 0;
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        try {
            if (!a((CharSequence) str)) {
                return Long.parseLong(str);
            }
            return 0L;
        } catch (Exception e) {
            Log.e(TAG, "parseLong exp", e);
            return 0L;
        }
    }

    public void a(List<a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!a((Collection) list)) {
            ArrayList arrayList = new ArrayList();
            long j = 0;
            long j2 = 0;
            for (a aVar : list) {
                if (aVar.c != null) {
                    j = c(aVar.c.get("accountId"));
                    j2 = c(aVar.c.get("feedId"));
                }
                arrayList.add(a(aVar));
            }
            EventReportRequest eventReportRequest = new EventReportRequest();
            eventReportRequest.liveEventsJson = JSON.toJSONString(arrayList);
            eventReportRequest.anchorId = Long.valueOf(j);
            eventReportRequest.liveId = Long.valueOf(j2);
            k.a(eventReportRequest, new IRemoteBaseListener() { // from class: com.taobao.live.ubee.core.UserBehaviorStorage$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse == null) {
                    } else {
                        Log.e(d.TAG, "onSystemError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse == null) {
                    } else {
                        Log.e(d.TAG, "onError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }
            }, EventReportResponse.class, true, false);
        }
    }

    private EventModel a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventModel) ipChange.ipc$dispatch("270b98f2", new Object[]{this, aVar});
        }
        EventModel eventModel = new EventModel();
        eventModel.scene = aVar.f17802a;
        eventModel.action = aVar.b;
        Map<String, String> map = aVar.c;
        if (map != null) {
            eventModel.feedId = map.remove("feedId");
            eventModel.accountId = map.remove("accountId");
            if (map.containsKey("type")) {
                eventModel.type = map.remove("type");
            } else {
                eventModel.type = "0";
            }
            eventModel.timestamp = map.remove("timestamp");
            eventModel.extendJson = JSON.toJSONString(map);
        }
        return eventModel;
    }

    @Override // tb.prt.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            e();
        }
    }
}
