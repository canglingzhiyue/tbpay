package com.taobao.desktop.channel.desktoplinktask.trigger;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import mtopsdk.common.util.StringUtils;
import android.util.Pair;
import anet.channel.session.dns.DnsNavConfigTask;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.DesktopTaskServiceReceiver;
import com.taobao.login4android.api.Login;
import com.taobao.weex.common.Constants;
import tb.kge;
import tb.kgz;
import tb.kha;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_FORMAT_DISPLAY_RECORD = 1;
    public static final int MSG_UPDATE_CONFIG = 4;
    public static final int MSG_UPDATE_DISPLAY_RECORD = 2;
    public static final int MSG_UPDATE_REQUEST_RECORD = 3;
    public static final int TRIGGER_TYPE_LOCAL = 2;
    public static final int TRIGGER_TYPE_ONCE = 1;

    /* renamed from: a */
    private Application f16950a;
    private Handler b;
    private long c;
    private volatile c d;

    /* loaded from: classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private static final d f16952a;

        static {
            kge.a(663070281);
            f16952a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("93b9a236", new Object[0]) : f16952a;
        }
    }

    static {
        kge.a(-1592546954);
    }

    public static /* synthetic */ void lambda$W2XOnHYspIINgjSd8qfmUmV9j7g(d dVar) {
        dVar.e();
    }

    public static /* synthetic */ void lambda$_nnlSdypUPTx1oKBfMHKjw08VAc(d dVar) {
        dVar.b();
    }

    public static /* synthetic */ void lambda$rptyMoBQGn4OTNDd_B1g0NcSyPI(d dVar, int i, String str) {
        dVar.b(i, str);
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("93b9a236", new Object[0]) : b.a();
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        this.f16950a = application;
        this.d = new c(application);
    }

    public void a(final int i, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else {
            kha.a(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.trigger.-$$Lambda$d$rptyMoBQGn4OTNDd_B1g0NcSyPI
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$rptyMoBQGn4OTNDd_B1g0NcSyPI(d.this, i, str);
                }
            });
        }
    }

    public /* synthetic */ void b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf2bb84", new Object[]{this, new Integer(i), str});
            return;
        }
        try {
            if (i == 1) {
                a(str);
            } else if (i != 2) {
            } else {
                b(str);
            }
        } catch (Throwable th) {
            kgz.a("TaskTrigger.onNewData.error", th);
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            com.taobao.desktop.channel.desktoplinktask.trigger.b bVar = new com.taobao.desktop.channel.desktoplinktask.trigger.b(this.f16950a, DesktopTaskServiceReceiver.class);
            kgz.a("TaskTrigger.triggerOnceTask.newConfig=%s", str);
            Bundle bundle = new Bundle();
            bundle.putString("config", str);
            bVar.a(1, bundle, null);
        }
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        c(str);
        b();
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            kgz.a("TaskTrigger.triggerLocalTask.newConfig=%s", str);
            Pair<String, JSONObject> b2 = this.d.b(str);
            long longValue = b2.second != null ? ((JSONObject) b2.second).getLongValue("indexId") : -1L;
            if (!StringUtils.isEmpty((CharSequence) b2.first)) {
                e.a(false, longValue);
                kgz.a("TaskTrigger.triggerLocalTask.stopOldTimer.", new Object[0]);
                return;
            }
            d();
            kgz.a("TaskTrigger.triggerLocalTask.stopOldTimer.", new Object[0]);
            this.d.a(str);
            e.a(true, longValue);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            kha.a(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.trigger.-$$Lambda$d$W2XOnHYspIINgjSd8qfmUmV9j7g
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$W2XOnHYspIINgjSd8qfmUmV9j7g(d.this);
                }
            });
        }
    }

    public /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        try {
            Pair<Boolean, JSONObject> c = c();
            if (c.first == null || !((Boolean) c.first).booleanValue()) {
                z = true;
            }
            JSONObject jSONObject = (JSONObject) c.second;
            if (jSONObject != null && jSONObject.getLongValue("endTime") * 1000 >= System.currentTimeMillis()) {
                z2 = z;
            }
            if (z2) {
                d();
                return;
            }
            this.c = jSONObject.getLongValue("loopInterval") * 1000;
            if (this.b == null) {
                this.b = new Handler(Looper.getMainLooper());
            }
            this.b.postDelayed(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.trigger.-$$Lambda$d$_nnlSdypUPTx1oKBfMHKjw08VAc
                {
                    d.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d.lambda$_nnlSdypUPTx1oKBfMHKjw08VAc(d.this);
                }
            }, this.c);
        } catch (Throwable th) {
            kgz.a("TaskTrigger.tickTimer.error", th);
        }
    }

    private Pair<Boolean, JSONObject> c() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("71b24734", new Object[]{this});
        }
        JSONObject b2 = this.d.b();
        f fVar = new f(2);
        fVar.d = new JSONObject();
        String string = b2.getString("abBucketId");
        String string2 = b2.getString(DnsNavConfigTask.MatchKey);
        fVar.d.put("abBucketId", (Object) string);
        fVar.d.put(DnsNavConfigTask.MatchKey, (Object) string2);
        if (!b2.getBooleanValue("enable")) {
            e.a(fVar.f16953a, fVar.c, fVar.d, "start", "NotEnable", "");
            return new Pair<>(false, null);
        }
        JSONArray jSONArray = b2.getJSONArray("triggers");
        if (jSONArray == null) {
            e.a(fVar.f16953a, fVar.c, fVar.d, "start", "noTriggerConfig", "");
            return new Pair<>(false, null);
        }
        int size = jSONArray.size();
        int i = 0;
        while (true) {
            if (i < size) {
                jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null && "loop".equals(jSONObject.getString("type"))) {
                    break;
                }
                i++;
            } else {
                jSONObject = null;
                break;
            }
        }
        if (jSONObject == null) {
            e.a(fVar.f16953a, fVar.c, fVar.d, "start", "noLoopTriggerConfig", "");
            return new Pair<>(false, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = jSONObject.getLongValue("endTime") * 1000;
        long longValue2 = jSONObject.getLongValue("startTime") * 1000;
        if (currentTimeMillis >= longValue) {
            e.a(fVar.f16953a, fVar.c, fVar.d, "start", "reachEndTime", "");
            return new Pair<>(false, jSONObject);
        } else if (currentTimeMillis < longValue2) {
            e.a(fVar.f16953a, fVar.c, fVar.d, "start", "beforeStartTime", "");
            return new Pair<>(true, jSONObject);
        } else if (longValue - currentTimeMillis <= 0) {
            e.a(fVar.f16953a, fVar.c, fVar.d, "start", "noLeftTime", "");
            return new Pair<>(false, jSONObject);
        } else if (jSONObject.getLongValue("loopInterval") * 1000 <= 0) {
            e.a(fVar.f16953a, fVar.c, fVar.d, "start", "intervalTimeInvalid", "");
            return new Pair<>(false, jSONObject);
        } else {
            JSONObject a2 = this.d.a();
            kgz.a("TaskTrigger.startPopFloatWindow.localConfig.recordString=%s", a2);
            if (a2 != null && !a2.isEmpty()) {
                JSONObject jSONObject4 = b2.getJSONObject("requestFatigue");
                if (jSONObject4 != null && (jSONObject3 = a2.getJSONObject("requestFatigue")) != null) {
                    if (a(jSONObject4, jSONObject3)) {
                        e.a(fVar.f16953a, fVar.c, fVar.d, "start", "requestFatigueReachMaxTimes", "");
                        return new Pair<>(false, jSONObject);
                    } else if (b(jSONObject4, jSONObject3)) {
                        e.a(fVar.f16953a, fVar.c, fVar.d, "start", "requestFatigueInInterval", "");
                        return new Pair<>(true, jSONObject);
                    }
                }
                JSONObject jSONObject5 = b2.getJSONObject("displayFatigue");
                if (jSONObject5 != null && (jSONObject2 = a2.getJSONObject("displayFatigue")) != null) {
                    if (a(jSONObject5, jSONObject2)) {
                        e.a(fVar.f16953a, fVar.c, fVar.d, "start", "displayFatigueReachMaxTimes", "");
                        return new Pair<>(false, jSONObject);
                    } else if (b(jSONObject5, jSONObject2)) {
                        e.a(fVar.f16953a, fVar.c, fVar.d, "start", "displayFatigueInInterval", "");
                        return new Pair<>(true, jSONObject);
                    }
                }
            }
            com.taobao.desktop.channel.desktoplinktask.trigger.b bVar = new com.taobao.desktop.channel.desktoplinktask.trigger.b(this.f16950a, DesktopTaskServiceReceiver.class);
            Bundle bundle = new Bundle();
            bundle.putString("abBucketId", string);
            bundle.putString(DnsNavConfigTask.MatchKey, string2);
            bundle.putString("config", b2.toJSONString());
            String str = "";
            bundle.putString("record", a2 != null ? a2.toJSONString() : str);
            String userId = Login.getUserId();
            if (!StringUtils.isEmpty(userId)) {
                str = userId;
            }
            bundle.putString("uid", str);
            bVar.a(2, bundle, new a(Looper.getMainLooper(), this.d));
            return new Pair<>(true, jSONObject);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        Handler handler = this.b;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        this.b = null;
        kgz.a("TaskTrigger.CountDownTimer.cancelTimer.done", new Object[0]);
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6f32d06c", new Object[]{this, jSONObject, jSONObject2})).booleanValue() : this.d.a(jSONObject2.getLongValue("lastTime") * 1000) && jSONObject2.getIntValue(Constants.KEY_TIMES) >= jSONObject.getIntValue(Constants.KEY_TIMES);
    }

    private boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("525e83ad", new Object[]{this, jSONObject, jSONObject2})).booleanValue() : System.currentTimeMillis() - (jSONObject2.getLongValue("lastTime") * 1000) < jSONObject.getLongValue(Constants.Name.INTERVAL) * 1000;
    }

    /* loaded from: classes7.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        private final c f16951a;

        static {
            kge.a(327255795);
        }

        public a(Looper looper, c cVar) {
            super(looper);
            this.f16951a = cVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            try {
                Bundle data = message.getData();
                int i = message.what;
                if (i == 1) {
                    this.f16951a.c();
                } else if (i == 2) {
                    this.f16951a.c(data.getString("bizCode"));
                } else if (i == 3) {
                    this.f16951a.d();
                } else if (i != 4) {
                } else {
                    this.f16951a.a(data.getString("newConfig"));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
