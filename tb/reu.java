package tb;

import android.content.Context;
import android.os.AsyncTask;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.orange.OrangeConfig;
import com.taobao.update.datasource.accs.a;
import java.io.Serializable;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;

/* loaded from: classes9.dex */
public class reu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33087a;
    private Boolean c;
    private Boolean d;
    private Boolean f;
    public boolean subscribed = false;

    public boolean hasAccs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c098057", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public JSONObject invokePullApi(Serializable serializable, Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81f439ba", new Object[]{this, serializable, context, str, new Boolean(z)});
        }
        if (!hasMtop()) {
            Log.e("UpdateAdapter", "mtop is not found");
            return null;
        }
        if (StringUtils.isEmpty(str)) {
            str = "600000";
        }
        MtopBuilder build = Mtop.instance(z ? "OPEN" : Mtop.Id.INNER, context).build(serializable, str);
        build.mo1305reqMethod(MethodEnum.GET);
        MtopResponse syncRequest = build.syncRequest();
        if (syncRequest.isApiSuccess()) {
            try {
                String str2 = new String(syncRequest.getBytedata());
                if (!StringUtils.isEmpty(str2)) {
                    JSONObject parseObject = JSON.parseObject(str2);
                    if (parseObject.containsKey("data")) {
                        return parseObject.getJSONObject("data");
                    }
                }
            } catch (Exception e) {
                Log.e("UpdateAdapter", "get mtop data exception", e);
            }
        } else if (!StringUtils.isEmpty(syncRequest.getRetCode()) && !StringUtils.isEmpty(syncRequest.getRetMsg()) && syncRequest.getRetCode().equals("USE_ALTER_SYSTEM_DATA") && syncRequest.getRetMsg().equals("走变更sdk")) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("degrade", (Object) true);
            return jSONObject;
        } else {
            Log.e("UpdateAdapter", "invoke mtop api error, " + syncRequest.getRetMsg());
        }
        return null;
    }

    static {
        kge.a(-911620525);
        f33087a = false;
    }

    public synchronized void registerPushApi(Context context, AccsAbstractDataListener accsAbstractDataListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b388a737", new Object[]{this, context, accsAbstractDataListener});
            return;
        }
        if (hasAccs()) {
            if (f33087a) {
                return;
            }
            f33087a = true;
            ACCSManager.registerDataListener(context, a.SERVICE_ID, accsAbstractDataListener);
        }
    }

    public String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{this, str, str2, str3}) : a() ? OrangeConfig.getInstance().getConfig(str, str2, str3) : str3;
    }

    public void commitSuccess(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d3416f1", new Object[]{this, str, str2, str3});
        } else if (!hasAppMonitor()) {
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.reu$1] */
    public void executeThread(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9abe64", new Object[]{this, runnable});
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.reu.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    runnable.run();
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.c == null) {
            try {
                Class.forName(OrangeConfig.class.getName());
                this.c = true;
            } catch (Throwable unused) {
                this.c = false;
            }
        }
        return this.c.booleanValue();
    }

    public boolean hasMtop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2316b0d", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            try {
                Class.forName(Mtop.class.getName());
                this.d = true;
            } catch (Throwable unused) {
                this.d = false;
            }
        }
        return this.d.booleanValue();
    }

    public boolean hasAppMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cb10d3e", new Object[]{this})).booleanValue();
        }
        if (this.f == null) {
            try {
                Class.forName(AppMonitor.class.getName());
                this.f = true;
            } catch (Throwable unused) {
                this.f = false;
            }
        }
        return this.f.booleanValue();
    }

    public void onData(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3948f44", new Object[]{this, str, str2});
        } else if (!rfy.inited) {
        } else {
            rfy.getInstance().onUpdate(str, null, true, str2, new String[0]);
        }
    }
}
