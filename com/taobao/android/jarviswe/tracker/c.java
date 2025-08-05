package com.taobao.android.jarviswe.tracker;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.jarviswe.tracker.d;
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.room.utils.aw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.contrib.tmall.sqlite.Cursor;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import tb.gse;
import tb.gsj;
import tb.kge;
import tb.suq;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static c f12976a;
    private static final String[] b;

    public static /* synthetic */ String[] b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("11a28f78", new Object[0]) : b;
    }

    static {
        kge.a(-32345967);
        b = new String[]{"seqId", "sessionId", "bizId", "scene", "createTime", StWindow.UPDATE_TIME, "userId", "actionType", "actionName", "actionDuration", com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.ACTION_ARGS, com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.BIZ_ARGS, aw.PARAM_IS_FIRST_ENTER, "fromScene", "toScene", "reserve1", "reserve2", "dc_create_time"};
    }

    private c() {
    }

    public static synchronized c a() {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("ac602076", new Object[0]);
            }
            if (f12976a == null) {
                f12976a = new c();
            }
            return f12976a;
        }
    }

    public void a(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7144f6ee", new Object[]{this, str, aVar});
        } else {
            a("Page_SearchItemList", str, aVar);
        }
    }

    public void a(final String str, final String str2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23643664", new Object[]{this, str, str2, aVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.jarviswe.tracker.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        StringBuilder sb = new StringBuilder();
                        for (int i = 0; i < c.b().length; i++) {
                            sb.append(c.b()[i]);
                            if (i != c.b().length - 1) {
                                sb.append(",");
                            }
                        }
                        String sb2 = sb.toString();
                        HashMap hashMap = new HashMap();
                        hashMap.put("data_names", "dc_userBehavior_request_node");
                        Cursor query = DbManager.getInstance().query("select " + sb2 + " from dc_userBehavior_request_node where scene='" + str + "' and actionType='request' order by seqId desc limit 5", null, "JarvisFeature", "getPVFeature", hashMap);
                        if (query == null) {
                            aVar.a(str2, "");
                            return;
                        }
                        while (query.moveToNext()) {
                            if (str2.equals(com.tmall.android.dai.internal.util.f.a(query.getString(11), ",", "=", true).get("query"))) {
                                hashMap.put("data_names", "dc_userBehavior_expose_node,dc_userBehavior_new_edge");
                                Cursor query2 = DbManager.getInstance().query("SELECT " + sb2 + " FROM dc_userBehavior_expose_node WHERE seqId IN (SELECT rightNode from dc_userBehavior_new_edge where leftNode in (" + query.getInt(0) + ") AND leftActionType = 'request' AND rightActionType = 'expose') ", null, "JarvisFeature", "getPVFeature", hashMap);
                                hashMap.put("data_names", "dc_userBehavior_tap_node,dc_userBehavior_new_edge");
                                Cursor query3 = DbManager.getInstance().query("SELECT " + sb2 + " FROM dc_userBehavior_tap_node WHERE seqId IN (SELECT rightNode from dc_userBehavior_new_edge where leftNode in (" + query.getInt(0) + ") AND leftActionType = 'request' AND rightActionType = 'tap') ", null, "JarvisFeature", "getPVFeature", hashMap);
                                ArrayList arrayList2 = new ArrayList();
                                if (query3 != null && query2 != null) {
                                    while (query3.moveToNext()) {
                                        arrayList2.add(query3.getString(2));
                                    }
                                    query3.close();
                                    while (query2.moveToNext()) {
                                        String string = query2.getString(2);
                                        if (!arrayList2.contains(string) && !arrayList.contains(string)) {
                                            arrayList.add(string);
                                        }
                                    }
                                    query2.close();
                                }
                            }
                        }
                        query.close();
                        StringBuilder sb3 = new StringBuilder();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            sb3.append(arrayList.get(i2));
                            if (i2 != arrayList.size() - 1) {
                                sb3.append(";");
                            }
                        }
                        aVar.a(str2, sb3.toString());
                    } catch (Throwable th) {
                        aVar.b("getPvFeature", th.getMessage());
                        th.printStackTrace();
                    }
                }
            });
        }
    }

    public void a(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fd7762", new Object[]{this, str, bundle});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            for (String str2 : bundle.keySet()) {
                jSONObject2.put(str2, bundle.get(str2));
            }
            JSONObject parseObject = JSONObject.parseObject(str);
            jSONObject.put(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE, (Object) "bx_trigger");
            jSONObject.put(com.taobao.android.behavix.feature.a.FEATURE_CONTENT, (Object) parseObject);
            jSONObject.put(com.taobao.android.behavix.feature.a.TRIGGER_CONTENT, (Object) jSONObject2);
            com.taobao.android.jarviswe.a.a().a("Detail", b.EVENT_DESTORY, gsj.a(jSONObject), new gse() { // from class: com.taobao.android.jarviswe.tracker.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.gse
                public void errorReport(String str3, String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("28fdfd81", new Object[]{this, str3, str4, str5});
                    }
                }

                @Override // tb.gse
                public void notify(String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("12981c64", new Object[]{this, str3, str4});
                    }
                }
            });
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(final String str, final ArrayList<String> arrayList, final ArrayList<Map> arrayList2, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11f28f2e", new Object[]{this, str, arrayList, arrayList2, aVar});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.android.jarviswe.tracker.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        d.a().a(str, arrayList, arrayList2, new d.b() { // from class: com.taobao.android.jarviswe.tracker.c.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.jarviswe.tracker.d.b
                            public void a(Boolean bool) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("ba62f9e5", new Object[]{this, bool});
                                } else if (bool.booleanValue()) {
                                    if (aVar == null) {
                                        return;
                                    }
                                    aVar.a(null, null);
                                } else if (aVar == null) {
                                } else {
                                    aVar.b("error", "");
                                }
                            }
                        });
                    }
                }
            });
        }
    }
}
