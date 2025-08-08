package com.taobao.family;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.taobao.windvane.jsbridge.q;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.aem;

/* loaded from: classes7.dex */
public class FamilyManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_OLD_PEOPLE = "social_oldPeople_";
    public static final String SP_KEY_REMARK = "social_remarkName_";
    private static Application application;
    private static String currentUserId;
    public static volatile d dataStoreComponent;
    public static List<c> bubbleListeners = new CopyOnWriteArrayList();
    private static boolean init = false;

    /* renamed from: com.taobao.family.FamilyManager$6  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17129a = new int[LoginAction.values().length];

        static {
            try {
                f17129a[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17129a[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7022ea09", new Object[0]) : currentUserId;
    }

    public static /* synthetic */ String access$002(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        currentUserId = str;
        return str;
    }

    public static /* synthetic */ Application access$100() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("57e7de87", new Object[0]) : application;
    }

    public void init(Application application2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application2, hashMap});
        } else {
            doInit(application2, hashMap);
        }
    }

    public static synchronized void doInit(Application application2, HashMap<String, Object> hashMap) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f834b6", new Object[]{application2, hashMap});
            } else if (application2 == null) {
            } else {
                if (init) {
                    return;
                }
                init = true;
                application = application2;
                currentUserId = Login.getUserId();
                g.a();
                LoginBroadcastHelper.registerLoginReceiver(application2, new BroadcastReceiver() { // from class: com.taobao.family.FamilyManager.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        LoginAction valueOf;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null) {
                        } else {
                            int i = AnonymousClass6.f17129a[valueOf.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    return;
                                }
                                FamilyManager.access$002(null);
                                FamilyManager.notifyListeners(new FamilyMembers(), false);
                                return;
                            }
                            String userId = Login.getUserId();
                            if (StringUtils.isEmpty(userId) || userId.equals(FamilyManager.access$000())) {
                                return;
                            }
                            FamilyManager.sendGetFamilyRelationRequest();
                            FamilyManager.access$002(userId);
                        }
                    }
                });
                q.a(FamilyWVApiPlugin.JS_BRIDGE_CLASSNAME, (Class<? extends android.taobao.windvane.jsbridge.e>) FamilyWVApiPlugin.class);
                aem.a().a(new h());
                if (f.f17132a.b) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.family.FamilyManager.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                FamilyManager.sendGetFamilyRelationRequest();
                            }
                        }
                    });
                }
            }
        }
    }

    public static synchronized void registerBubbleDisplayListener(final c cVar) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("638b86e8", new Object[]{cVar});
            } else if (cVar == null) {
            } else {
                doInit(Globals.getApplication(), null);
                bubbleListeners.add(cVar);
                if (StringUtils.isEmpty(Login.getUserId())) {
                    cVar.a(new ArrayList());
                    cVar.b(new ArrayList());
                    return;
                }
                AsyncTask.execute(new Runnable() { // from class: com.taobao.family.FamilyManager.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        if (FamilyManager.dataStoreComponent == null) {
                            FamilyManager.dataStoreComponent = new d(FamilyManager.access$100());
                        }
                        String a2 = FamilyManager.dataStoreComponent.a(Login.getUserId());
                        if (StringUtils.isEmpty(a2)) {
                            c.this.a(new ArrayList());
                            c.this.b(new ArrayList());
                            return;
                        }
                        JSONObject jSONObject = null;
                        try {
                            jSONObject = new JSONObject(a2);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        if (jSONObject == null) {
                            c.this.a(new ArrayList());
                            c.this.b(new ArrayList());
                            return;
                        }
                        FamilyMembers familyMembers = new FamilyMembers(jSONObject);
                        c.this.a(familyMembers.getBubbleDisplayList());
                        c.this.b(familyMembers.getRelationShip());
                    }
                });
            }
        }
    }

    public static synchronized boolean unRegisterBubbleDisplayListener(c cVar) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("702c34e5", new Object[]{cVar})).booleanValue();
            } else if (cVar == null) {
                return false;
            } else {
                return bubbleListeners.remove(cVar);
            }
        }
    }

    public static synchronized void notifyListeners(FamilyMembers familyMembers, boolean z) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47b87c2d", new Object[]{familyMembers, new Boolean(z)});
            } else if (familyMembers != null) {
                if (bubbleListeners != null && bubbleListeners.size() > 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("userId", currentUserId);
                    hashMap.put("relation", familyMembers.jsonObject.toString());
                    hashMap.put("count", String.valueOf(bubbleListeners.size()));
                    k.a(k.ARG1_NOTIFY_LISTENERS, hashMap);
                    String str = "notify listeners, count " + bubbleListeners.size();
                }
                for (c cVar : bubbleListeners) {
                    if (cVar != null) {
                        cVar.a(familyMembers.getBubbleDisplayList());
                        cVar.b(familyMembers.getRelationShip());
                    }
                }
                if (z) {
                    saveDataInThread(familyMembers);
                }
            }
        }
    }

    private static void saveDataInThread(final FamilyMembers familyMembers) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa01107", new Object[]{familyMembers});
        } else {
            AsyncTask.execute(new Runnable() { // from class: com.taobao.family.FamilyManager.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String userId = Login.getUserId();
                    if (StringUtils.isEmpty(userId)) {
                        return;
                    }
                    if (FamilyManager.dataStoreComponent == null) {
                        FamilyManager.dataStoreComponent = new d(FamilyManager.access$100());
                    }
                    FamilyManager.dataStoreComponent.b(FamilyMembers.this.jsonObject.toString(), userId);
                    HashMap hashMap = new HashMap();
                    hashMap.put(FamilyManager.SP_KEY_REMARK + userId, FamilyMembers.this.getOrderString());
                    hashMap.put(FamilyManager.SP_KEY_OLD_PEOPLE + userId, FamilyMembers.this.isOldPeople() ? "1" : "0");
                    j.a(hashMap);
                }
            });
        }
    }

    public static void sendGetFamilyRelationRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a01ee8", new Object[0]);
        } else if (StringUtils.isEmpty(Login.getUserId())) {
        } else {
            e.f17131a.a(e.API_NAME_GET_FAMILY_RELATION, new HashMap(), new i() { // from class: com.taobao.family.FamilyManager.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.family.i
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("32861656", new Object[]{this, jSONObject});
                    } else if (jSONObject == null) {
                    } else {
                        if (jSONObject != null) {
                            String str = "mtop success response: " + jSONObject.toString();
                        }
                        if (jSONObject.toString().equals("{}")) {
                            return;
                        }
                        FamilyManager.notifyListeners(new FamilyMembers(jSONObject), true);
                    }
                }

                @Override // com.taobao.family.i
                public void b(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("345f6975", new Object[]{this, jSONObject});
                    } else if (jSONObject == null) {
                    } else {
                        android.taobao.util.k.a("FamilyManager", "mtop error response: " + jSONObject.toString());
                    }
                }
            });
        }
    }
}
