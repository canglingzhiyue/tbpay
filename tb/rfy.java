package tb;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.update.datasource.local.UpdateInfo;
import com.taobao.update.datasource.mtop.a;
import com.taobao.update.types.PatchType;
import com.taobao.vessel.utils.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class rfy implements rgb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean inited;
    public static long lastPopTime;
    public static Map<String, rfz> listenerMap;
    private static rfy q;
    public static Application sContext;
    public static String sGroup;
    public static reu sUpdateAdapter;
    private rga c;
    private HandlerThread f;
    private String m;
    private rfp n;
    private Handler o;
    private volatile boolean b = false;
    private Map<String, rfs> d = new HashMap();
    private Map<String, rfq> e = new HashMap();
    private final int g = 0;
    private final int h = 1;
    private final int i = 2;
    private final int j = 4;
    private final int k = 5;
    private rge p = rgf.getLog(rfy.class, (rge) null);

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f33130a = false;

    public static /* synthetic */ rfp a(rfy rfyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rfp) ipChange.ipc$dispatch("a24729f7", new Object[]{rfyVar}) : rfyVar.n;
    }

    public static /* synthetic */ void a(rfy rfyVar, UpdateInfo.UpdateData updateData, PatchType patchType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebba07ab", new Object[]{rfyVar, updateData, patchType});
        } else {
            rfyVar.a(updateData, patchType);
        }
    }

    public static /* synthetic */ void a(rfy rfyVar, UpdateInfo updateInfo, boolean z, rfp rfpVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92353af6", new Object[]{rfyVar, updateInfo, new Boolean(z), rfpVar, str});
        } else {
            rfyVar.a(updateInfo, z, rfpVar, str);
        }
    }

    public static /* synthetic */ rge b(rfy rfyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rge) ipChange.ipc$dispatch("89e902c2", new Object[]{rfyVar}) : rfyVar.p;
    }

    public static /* synthetic */ boolean c(rfy rfyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9f8d0f9", new Object[]{rfyVar})).booleanValue() : rfyVar.a();
    }

    public static /* synthetic */ Handler d(rfy rfyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("ec1b4790", new Object[]{rfyVar}) : rfyVar.o;
    }

    static {
        kge.a(-747842587);
        kge.a(1391779573);
        inited = false;
        sGroup = null;
        lastPopTime = 0L;
        listenerMap = new HashMap();
        q = new rfy();
    }

    public void setAddUpdateCallback(rfp rfpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29e9c928", new Object[]{this, rfpVar});
        } else {
            this.n = rfpVar;
        }
    }

    private rfy() {
        this.f = null;
        this.f = new HandlerThread(getClass().getName());
        this.f.start();
        this.o = new Handler(this.f.getLooper()) { // from class: tb.rfy.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 673877017) {
                    super.handleMessage((Message) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                super.handleMessage(message);
                int i = message.what;
                if (i == 0) {
                    rfy rfyVar = rfy.this;
                    rfy.a(rfyVar, (UpdateInfo) message.obj, true, rfy.a(rfyVar), rfx.ACCS_SOURCE);
                    try {
                        rfw.instance().run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (i == 1) {
                    rfy.a(rfy.this, (UpdateInfo) message.obj, message.getData().getBoolean("background"), rfy.a(rfy.this), rfx.MTOP_SOURCE);
                    try {
                        rfw.instance().run();
                    } catch (InterruptedException e2) {
                        e2.printStackTrace();
                    }
                } else if (i == 2) {
                    if (message.obj != null) {
                        rfy rfyVar2 = rfy.this;
                        rfy.a(rfyVar2, (UpdateInfo) message.obj, false, rfy.a(rfyVar2), rfx.SCAN);
                    }
                    try {
                        rfw.instance().run();
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                } else if (i == 4) {
                    if (message.obj != null) {
                        rfy rfyVar3 = rfy.this;
                        rfy.a(rfyVar3, (UpdateInfo) message.obj, true, rfy.a(rfyVar3), rfx.SAFE_MODE);
                    }
                    try {
                        rfw.instance().run();
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                } else if (i != 5) {
                } else {
                    rfy.a(rfy.this, (UpdateInfo) message.obj, message.getData().getBoolean("background"), rfy.a(rfy.this), "NOTICE");
                    try {
                        rfw.instance().run();
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        };
    }

    public static rfy getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rfy) ipChange.ipc$dispatch("2014650f", new Object[0]) : q;
    }

    public Application getApplication() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Application) ipChange.ipc$dispatch("5749e470", new Object[]{this}) : sContext;
    }

    public static long getLastPopTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc8d6b8d", new Object[0])).longValue();
        }
        if (lastPopTime == 0) {
            synchronized (rfy.class) {
                if (lastPopTime == 0) {
                    long lastPopTime2 = rgq.getLastPopTime();
                    lastPopTime = lastPopTime2;
                    return lastPopTime2;
                }
            }
        }
        return lastPopTime;
    }

    public static void setLastPopTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("591d1357", new Object[]{new Long(j)});
            return;
        }
        SharedPreferences.Editor edit = getInstance().getApplication().getSharedPreferences(rfx.LAST_POP_TIME_CONFIG, 0).edit();
        edit.putLong("last_pop_time", j);
        edit.apply();
        lastPopTime = j;
    }

    public void registerInterceptor(String str, rfs rfsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31c71ae4", new Object[]{this, str, rfsVar});
        } else if (listenerMap.containsKey(str)) {
            if (listenerMap.get(str) instanceof rfr) {
                ((rfr) listenerMap.get(str)).registerInterceptor(rfsVar);
                return;
            }
            rge rgeVar = this.p;
            rgeVar.e(str + " update Type not support intercept");
        } else {
            this.d.put(str, rfsVar);
        }
    }

    public void registerListener(String str, rfz rfzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c77e7b2", new Object[]{this, str, rfzVar});
            return;
        }
        listenerMap.put(str, rfzVar);
        rfs remove = this.d.remove(str);
        if (remove == null) {
            return;
        }
        if (rfzVar instanceof rfr) {
            ((rfr) rfzVar).registerInterceptor(remove);
            return;
        }
        rge rgeVar = this.p;
        rgeVar.e(str + " update Type not support intercept");
    }

    public rfz getUpdateListener(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rfz) ipChange.ipc$dispatch("15b7fe1c", new Object[]{this, str}) : listenerMap.get(str);
    }

    public rfq getUpdater(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rfq) ipChange.ipc$dispatch("d19f9605", new Object[]{this, str}) : this.e.get(str);
    }

    public synchronized void init(Application application, String str, String str2, boolean z, reu reuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ede9aa6", new Object[]{this, application, str, str2, new Boolean(z), reuVar});
        } else if (inited) {
        } else {
            inited = true;
            sGroup = str;
            this.m = str2;
            sContext = application;
            sUpdateAdapter = reuVar;
            this.c = new rga();
            a aVar = new a(application, str2, str, z);
            aVar.registerDataListener(this);
            this.e.put(rfx.MTOP_SOURCE, aVar);
            if (reuVar.hasAccs()) {
                try {
                    com.taobao.update.datasource.accs.a aVar2 = new com.taobao.update.datasource.accs.a(sUpdateAdapter);
                    aVar2.registerDataListener(this);
                    this.e.put(rfx.ACCS_SOURCE, aVar2);
                    sUpdateAdapter.registerPushApi(application, aVar2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            this.p.d(" inited ");
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.o.hasMessages(0) || this.o.hasMessages(1) || this.o.hasMessages(2);
    }

    public UpdateInfo.UpdateData getApkUpdateData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo.UpdateData) ipChange.ipc$dispatch("38565600", new Object[]{this});
        }
        UpdateInfo.UpdateData a2 = a(com.taobao.update.datasource.local.a.getInstance(sContext).getCacheData());
        if (a2 != null) {
            return a2;
        }
        UpdateInfo data = com.taobao.update.datasource.local.a.getInstance(sContext).getData();
        return this.c.isLocalDataValid(data) ? a(data) : a2;
    }

    private UpdateInfo.UpdateData a(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo.UpdateData) ipChange.ipc$dispatch("a0138e39", new Object[]{this, updateInfo});
        }
        if (updateInfo == null || updateInfo.updateList == null || !updateInfo.updateList.containsKey("main")) {
            return null;
        }
        UpdateInfo.UpdateData updateData = updateInfo.updateList.get("main");
        updateData.subFrom = rfx.CACHE_SOURCE;
        return updateData;
    }

    private rfv a(final PatchType patchType, final UpdateInfo.UpdateData updateData, String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rfv) ipChange.ipc$dispatch("90966924", new Object[]{this, patchType, updateData, str, new Boolean(z)});
        }
        final rfz rfzVar = listenerMap.get(patchType.getKey());
        return new rfu(patchType, new rft(rfzVar) { // from class: tb.rfy.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                boolean z2 = true;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                rfz rfzVar2 = rfzVar;
                if (rfzVar2 == null) {
                    return;
                }
                try {
                    if (!rfx.HOTPATCH.equals(patchType.getKey())) {
                        z2 = z;
                    }
                    rfzVar2.onUpdate(z2, updateData.value, updateData.from);
                } catch (Throwable th) {
                    th.printStackTrace();
                    rfy.a(rfy.this, updateData, patchType);
                }
            }
        }, str, z);
    }

    private synchronized void a(UpdateInfo.UpdateData updateData, PatchType patchType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e98f756", new Object[]{this, updateData, patchType});
            return;
        }
        if (!TextUtils.isEmpty(updateData.subFrom) && updateData.subFrom.equals(rfx.CACHE_SOURCE)) {
            UpdateInfo data = com.taobao.update.datasource.local.a.getInstance(sContext).getData();
            if (data != null && data.updateList != null) {
                data.updateList.remove(patchType.getKey());
            }
            com.taobao.update.datasource.local.a.getInstance(sContext).resetData(data);
        }
    }

    public void getRecentData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54d9ab72", new Object[]{this, new Boolean(z)});
        } else if (z && !sUpdateAdapter.subscribed) {
            a(true);
        } else {
            UpdateInfo data = com.taobao.update.datasource.local.a.getInstance(sContext).getData();
            if (this.c.isLocalDataValid(data)) {
                this.b = true;
                String str = null;
                if (data != null && data.updateList != null) {
                    for (UpdateInfo.UpdateData updateData : data.updateList.values()) {
                        updateData.subFrom = rfx.CACHE_SOURCE;
                        str = updateData.from;
                    }
                }
                onUpdate(str, rfx.CACHE_SOURCE, !z, JSON.toJSONString(data), new String[0]);
                return;
            }
            clearCache();
            a(z);
        }
    }

    private void a(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (this.e.get(rfx.MTOP_SOURCE) == null) {
        } else {
            ((a) this.e.get(rfx.MTOP_SOURCE)).setDegradeListener(new a.InterfaceC1006a() { // from class: tb.rfy.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.update.datasource.mtop.a.InterfaceC1006a
                public void onDegrade() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4c327e1e", new Object[]{this});
                    }
                }
            }).setMtopDataListener(new a.b() { // from class: tb.rfy.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.update.datasource.mtop.a.b
                public void hasUpdate(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7413e254", new Object[]{this, str});
                    }
                }

                @Override // com.taobao.update.datasource.mtop.a.b
                public void noUpdate() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("429a9d71", new Object[]{this});
                        return;
                    }
                    rfy.b(rfy.this).e("invoke mtop no update!");
                    if (!z) {
                        return;
                    }
                    rfy.getInstance().toast(rgq.getAppNameString(R.string.notice_noupdate));
                }
            }).startUpdate(!z, false);
        }
    }

    public void invalidUpdateInfo(String str) {
        UpdateInfo.UpdateData updateData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef01e7f", new Object[]{this, str});
            return;
        }
        UpdateInfo data = com.taobao.update.datasource.local.a.getInstance(sContext).getData();
        if (data == null || (updateData = data.updateList.get(str)) == null) {
            return;
        }
        updateData.valid = false;
        com.taobao.update.datasource.local.a.getInstance(sContext).updateData(data);
    }

    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            com.taobao.update.datasource.local.a.getInstance(sContext).clearCache();
        }
    }

    public void startUpdate(final boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5102cd2", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else if (!inited) {
        } else {
            if (this.f33130a) {
                if (z) {
                    return;
                }
                toast(rgq.getAppNameString(R.string.notice_updating));
                return;
            }
            this.f33130a = true;
            Runnable runnable = new Runnable() { // from class: tb.rfy.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rfy.this.getRecentData(!z);
                    rfy.this.f33130a = false;
                }
            };
            if (z2) {
                runnable.run();
            } else {
                sUpdateAdapter.executeThread(runnable);
            }
        }
    }

    private void a(UpdateInfo updateInfo, boolean z, rfp rfpVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba166d2b", new Object[]{this, updateInfo, new Boolean(z), rfpVar, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (updateInfo.updateList.containsKey(rfx.DYNAMICUPDATE)) {
            arrayList.add(rfx.DYNAMICUPDATE);
            rfw.instance().add(a(PatchType.DYNAMICUPDATE, updateInfo.updateList.get(rfx.DYNAMICUPDATE), str, z));
        }
        if (updateInfo.updateList.containsKey(rfx.CPPINLINEPATCH)) {
            arrayList.add(rfx.CPPINLINEPATCH);
            rfw.instance().add(a(PatchType.CPPINLINEPATCH, updateInfo.updateList.get(rfx.CPPINLINEPATCH), str, z));
        }
        if (updateInfo.updateList.containsKey(rfx.HOTPATCH)) {
            arrayList.add(rfx.HOTPATCH);
            rfw.instance().add(a(PatchType.INSTANTPATCH, updateInfo.updateList.get(rfx.HOTPATCH), str, z));
        }
        if (updateInfo.updateList.containsKey("main")) {
            arrayList.add("main");
            rfw.instance().add(a(PatchType.MAIN, updateInfo.updateList.get("main"), str, z));
        }
        if (updateInfo.updateList.containsKey("preload")) {
            arrayList.add("preload");
            rfw.instance().add(a(PatchType.PRELOAD, updateInfo.updateList.get("preload"), str, z));
        }
        if (rfpVar != null) {
            rfpVar.onAdded(arrayList);
        }
        if (arrayList.contains("main") || z || str.equals(rfx.SCAN) || !listenerMap.containsKey("main")) {
            return;
        }
        listenerMap.get("main").onUpdate(false, null, "");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [tb.rfy$6] */
    public void addUpdateInfo(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3cc7d29", new Object[]{this, str});
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: tb.rfy.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Void, java.lang.Object] */
                @Override // android.os.AsyncTask
                public /* synthetic */ Void doInBackground(Void[] voidArr) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("e83e4786", new Object[]{this, voidArr}) : a(voidArr);
                }

                public Void a(Void... voidArr) {
                    String response;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Void) ipChange2.ipc$dispatch("54f0ab29", new Object[]{this, voidArr});
                    }
                    if (str.contains("get_bundle_install_data")) {
                        final rfz rfzVar = rfy.listenerMap.get(rfx.TEST_URL);
                        if (rfzVar != null) {
                            rfw.instance().add(new rfu(PatchType.TESTURL, new rft(rfzVar) { // from class: tb.rfy.6.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                        return;
                                    }
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("url", (Object) str);
                                    rfzVar.onUpdate(false, jSONObject, rfx.SCAN);
                                }
                            }, rfx.SCAN, false));
                        }
                        if (rfy.c(rfy.this)) {
                            rfy.this.toast("已经有更新正在运行中");
                        } else {
                            rfy.d(rfy.this).obtainMessage(2).sendToTarget();
                        }
                        return null;
                    }
                    if (str.startsWith(b.HTTPS_SCHEMA) || str.startsWith("http:")) {
                        response = new rgd().getResponse(str);
                    } else {
                        response = str;
                    }
                    String str2 = response;
                    if (!TextUtils.isEmpty(str2)) {
                        rfy.this.onUpdate(rfx.SCAN, null, false, str2, new String[0]);
                    }
                    return null;
                }
            }.execute(new Void[0]);
        }
    }

    private boolean b(UpdateInfo updateInfo) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1bd57aa", new Object[]{this, updateInfo})).booleanValue() : (updateInfo == null || updateInfo.updateList == null || updateInfo.updateList.size() == 0) ? false : true;
    }

    public void toast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("864ba978", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.rfy.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(rfy.sContext, str, 1).show();
                    }
                }
            });
        }
    }

    public UpdateInfo convertData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (UpdateInfo) ipChange.ipc$dispatch("5e58b541", new Object[]{this, str, str2, str3});
        }
        JSONObject parseObject = JSON.parseObject(str3);
        if (!TextUtils.isEmpty(str2) && str2.equals(rfx.CACHE_SOURCE)) {
            return (UpdateInfo) JSON.parseObject(str3, UpdateInfo.class);
        }
        if (str.equals(rfx.ACCS_SOURCE) || str.equals(rfx.SAFE_MODE) || str.equals(rfx.SCAN)) {
            if (parseObject != null && parseObject.containsKey("data")) {
                JSONObject jSONObject = parseObject.getJSONObject("data");
                if (jSONObject.containsKey("hasUpdate")) {
                    z = jSONObject.getBoolean("hasUpdate").booleanValue();
                }
                UpdateInfo convert2UpdateInfo = xpr.convert2UpdateInfo(jSONObject, str);
                if (z && b(convert2UpdateInfo)) {
                    return convert2UpdateInfo;
                }
            }
        } else if (parseObject != null && parseObject.containsKey("hasUpdate") && parseObject.getBoolean("hasUpdate").booleanValue()) {
            UpdateInfo convert2UpdateInfo2 = xpr.convert2UpdateInfo(parseObject, str);
            if (b(convert2UpdateInfo2)) {
                return convert2UpdateInfo2;
            }
        }
        return null;
    }

    @Override // tb.rgb
    public synchronized void onUpdate(String str, String str2, boolean z, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c531bc24", new Object[]{this, str, str2, new Boolean(z), str3, strArr});
        } else if (this.c == null) {
            this.p.e("no inited");
        } else {
            try {
                if (this.c.isUpdating()) {
                    rge rgeVar = this.p;
                    rgeVar.d("is updating ... discard data from:" + str);
                    this.c.finishUpdate();
                    return;
                }
                rge rgeVar2 = this.p;
                rgeVar2.d(" >>>>>> on " + str + " update info <<<<<<   " + str3);
                if (!TextUtils.isEmpty(str3) && inited) {
                    UpdateInfo convertData = convertData(str, str2, str3);
                    if (convertData == null) {
                        this.p.e("updateInfo invalid!");
                        if (!z && listenerMap.containsKey("main")) {
                            listenerMap.get("main").onUpdate(false, null, "");
                        }
                        this.c.finishUpdate();
                        return;
                    }
                    this.c.startUpdate();
                    if ((str.equals(rfx.ACCS_SOURCE) || str.equals(rfx.MTOP_SOURCE)) && TextUtils.isEmpty(str2)) {
                        com.taobao.update.datasource.local.a.getInstance(sContext).resetData(convertData);
                    }
                    if (a()) {
                        this.p.e("handling msg......");
                        if (!str.equals(rfx.SCAN)) {
                            this.c.finishUpdate();
                            return;
                        }
                        toast("已经有更新正在运行中");
                    }
                    Message obtainMessage = this.o.obtainMessage();
                    if (str.equals(rfx.SCAN)) {
                        obtainMessage.what = 2;
                    } else if (str.equals(rfx.ACCS_SOURCE)) {
                        obtainMessage.what = 0;
                        sUpdateAdapter.commitSuccess("update_center_accs", "dispatch_message", "");
                        if (strArr != null && strArr.length > 0) {
                            sUpdateAdapter.commitSuccess("update_center_accs", "dispatch_message", strArr[0]);
                        }
                    } else if (str.equals(rfx.SAFE_MODE)) {
                        obtainMessage.what = 4;
                    } else if (str.equals(rfx.MTOP_SOURCE)) {
                        sUpdateAdapter.commitSuccess("update_center_mtop", "mtop_dispatch_message", "");
                        obtainMessage.what = 1;
                    } else if (str.equals("NOTICE")) {
                        obtainMessage.what = 5;
                    }
                    obtainMessage.obj = convertData;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("background", z);
                    obtainMessage.setData(bundle);
                    obtainMessage.sendToTarget();
                    this.c.finishUpdate();
                    return;
                }
                this.c.finishUpdate();
            } catch (Exception e) {
                e.printStackTrace();
                this.c.finishUpdate();
            }
        }
    }
}
