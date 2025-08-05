package com.taobao.android.layoutmanager.setup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import anet.channel.status.NetworkStatusHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.layoutmanager.adapter.impl.aa;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IFestival;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager;
import java.util.Map;
import tb.ghi;
import tb.ghl;
import tb.ghm;
import tb.ghp;
import tb.kge;
import tb.oeb;
import tb.ogg;

/* loaded from: classes5.dex */
public class NotifyRegister {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GG_TNODE_POPLAYER_CHANGED = "com.taobao.android.action.GG_TNode_PopLayerChanged";
    public static final String ACTION_GG_TNODE_TAB_LIVE_CHANGED = "com.taobao.live.timemove.homepage.tab";
    public static final String ACTION_GG_TNODE_TAB_SELECT_CHANGED = "com.taobao.android.action.GG_TNode_TabSelectChanged";

    /* renamed from: a  reason: collision with root package name */
    private static NotifyManager.d f13270a;
    private static NotifyManager.d b;
    private static NotifyManager.d c;
    private static NotifyManager.d d;

    static {
        kge.a(364414557);
        f13270a = new NotifyManager.d() { // from class: com.taobao.android.layoutmanager.setup.NotifyRegister.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.d
            public JSONObject a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                IFestival d2 = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().d();
                if (d2 != null) {
                    jSONObject.putAll(d2.a().toMap());
                }
                return jSONObject;
            }
        };
        b = new NotifyManager.d() { // from class: com.taobao.android.layoutmanager.setup.NotifyRegister.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.d
            public JSONObject a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = jSONObject.getJSONObject("config");
                String string = jSONObject.getString("triggerEvent");
                String string2 = jSONObject.getString("nativeUri");
                String string3 = jSONObject.getString("nativeUrl");
                String string4 = jSONObject.getString("config");
                String string5 = jSONObject.getString("eventType");
                String string6 = jSONObject.getString("indexId");
                if (!TextUtils.isEmpty(string5)) {
                    jSONObject2.put("eventType", (Object) string5);
                }
                JSONObject jSONObject4 = new JSONObject();
                if (jSONObject3 != null) {
                    if (!TextUtils.isEmpty(string4)) {
                        jSONObject4.put("config", (Object) string4);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject4.put("event", (Object) string);
                    }
                    if (!TextUtils.isEmpty(string6)) {
                        jSONObject4.put("indexId", (Object) string6);
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        jSONObject4.put("nativeUrl", (Object) string3);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject4.put("nativeUri", (Object) string2);
                    }
                    jSONObject2.put("pop", (Object) jSONObject4);
                    if (!TextUtils.isEmpty(jSONObject3.getString("type"))) {
                        jSONObject2.put("type", (Object) jSONObject3.getString("type"));
                    }
                    if (!TextUtils.isEmpty(jSONObject3.getString("url"))) {
                        jSONObject2.put("url", (Object) jSONObject3.getString("url"));
                    }
                    if (!TextUtils.isEmpty(jSONObject3.getString("uri"))) {
                        jSONObject2.put("uri", (Object) jSONObject3.getString("uri"));
                    }
                    if (!TextUtils.isEmpty(jSONObject3.getString("layerType"))) {
                        jSONObject2.put("layerType", (Object) jSONObject3.getString("layerType"));
                    }
                }
                return jSONObject2;
            }
        };
        c = new NotifyManager.d() { // from class: com.taobao.android.layoutmanager.setup.NotifyRegister.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.d
            public JSONObject a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("livetab", (Object) Boolean.valueOf(TextUtils.equals(jSONObject.getString("selectStatus"), "onPageSelected")));
                return jSONObject2;
            }
        };
        d = new NotifyManager.d() { // from class: com.taobao.android.layoutmanager.setup.NotifyRegister.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.NotifyManager.d
            public JSONObject a(JSONObject jSONObject) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                int intValue = jSONObject.getIntValue("selectedTabIndex");
                boolean booleanValue = jSONObject.getBooleanValue("clickTabChange");
                jSONObject2.put("selectedTabIndex", (Object) Integer.valueOf(intValue));
                jSONObject2.put("clickTabChange", (Object) Boolean.valueOf(booleanValue));
                return jSONObject2;
            }
        };
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        NotifyManager.a("TNodeAddFollowNotify", "TAOBAO.WEITAO.AddFollowNotify", null);
        NotifyManager.a("TNodeFestivalChanged", FestivalMgr.ACTION_FESTIVAL_CHANGE, f13270a);
        NotifyManager.a("TNodeMainTabPopLayerChanged", ACTION_GG_TNODE_POPLAYER_CHANGED, b);
        NotifyManager.a("TNodeHomeLiveTabChanged", ACTION_GG_TNODE_TAB_LIVE_CHANGED, c);
        NotifyManager.a("TNodeMainTabSelectChanged", ACTION_GG_TNODE_TAB_SELECT_CHANGED, d);
        NotifyManager.a("TNodeTbVersionChanged", a.class);
        b();
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (oeb.aq()) {
            NetworkStatusHelper.addStatusChangeListener(new NetworkStatusHelper.INetworkStatusChangeListener() { // from class: com.taobao.android.layoutmanager.setup.NotifyRegister.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
                public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4275ba3b", new Object[]{this, networkStatus});
                    } else if (!NetworkStatusHelper.isConnected()) {
                    } else {
                        Intent intent = new Intent("TNodeNetworkConnectChanged");
                        intent.putExtra("connect", true);
                        LocalBroadcastManager.getInstance(ab.a()).sendBroadcast(intent);
                    }
                }
            });
        } else {
            try {
                ab.a().registerReceiver(new NetworkConnectChangedReceiver(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            } catch (Throwable th) {
                ogg.b(th.getMessage());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class NetworkConnectChangedReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1251750432);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    return;
                }
                Intent intent2 = new Intent("TNodeNetworkConnectChanged");
                intent2.putExtra("connect", true);
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);
            } catch (Throwable th) {
                ogg.b(th.getMessage());
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements ghl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.tao.flexbox.layoutmanager.module.notify.a f13272a;

        static {
            kge.a(-537032129);
            kge.a(308073653);
        }

        private b() {
        }

        public void a(com.taobao.tao.flexbox.layoutmanager.module.notify.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7cf04ec2", new Object[]{this, aVar});
            } else {
                this.f13272a = aVar;
            }
        }

        @Override // tb.ghl
        public void a(ghp ghpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea458cc9", new Object[]{this, ghpVar});
            } else if (this.f13272a != null) {
                Map a2 = aa.a(ghpVar);
                for (String str : this.f13272a.b()) {
                    this.f13272a.a(str, a2);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class a extends com.taobao.tao.flexbox.layoutmanager.module.notify.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private b f13271a;

        static {
            kge.a(-511008793);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -311380595) {
                super.a((String) objArr[0], (g.c) objArr[1]);
                return null;
            } else if (hashCode != 90991720) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.a();
                return null;
            }
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a(String str, g.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed70b58d", new Object[]{this, str, cVar});
                return;
            }
            super.a(str, cVar);
            if (this.f13271a != null) {
                return;
            }
            this.f13271a = new b();
            this.f13271a.a(this);
            ((ghm) ghi.a(ghm.class)).addChangeVersionListener(this.f13271a);
        }

        @Override // com.taobao.tao.flexbox.layoutmanager.module.notify.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            super.a();
            b bVar = this.f13271a;
            if (bVar == null) {
                return;
            }
            bVar.a((com.taobao.tao.flexbox.layoutmanager.module.notify.a) null);
            this.f13271a = null;
        }
    }
}
