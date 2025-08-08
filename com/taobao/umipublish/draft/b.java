package com.taobao.umipublish.draft;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.util.an;
import com.taobao.android.litecreator.util.ba;
import com.taobao.android.litecreator.util.s;
import com.taobao.android.litecreator.util.u;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.umipublish.draft.DraftMediaHelper;
import com.taobao.umipublish.draft.c;
import com.taobao.umipublish.monitor.UmiPublishMonitor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.reg;
import tb.xpu;

/* loaded from: classes9.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_TYPE_DELETE = "delete";
    public static final String ACTION_TYPE_SAVE = "save";
    public static final String DRAFT_ACTION = "com.taobao.umipublish.draft.DraftManager.action";
    public static final String DRAFT_URL_KEY = "umi_local_draft";
    public static final String KEY_ACTION_TYPE = "actionType";
    public static final String KEY_AUTO_SAVE = "autoSave";
    public static final String KEY_BIZ = "biz";
    public static final String KEY_DRAFT_IDS = "draftIds";
    public static final String KEY_SESSION_IDS = "sessionIds";
    public static final String TAG = "umi_draft_log";

    /* renamed from: a */
    private static volatile b f23237a;
    private Context b;
    private c c;
    private ThreadPoolExecutor d;

    static {
        kge.a(1578735064);
    }

    public static /* synthetic */ void a(b bVar, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da52aa0", new Object[]{bVar, intent});
        } else {
            bVar.a(intent);
        }
    }

    private b(Context context) {
        this.b = context.getApplicationContext();
        this.c = new a(context.getApplicationContext());
        LoginBroadcastHelper.registerLoginReceiver(context, new BroadcastReceiver() { // from class: com.taobao.umipublish.draft.DraftManager$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else {
                    b.a(b.this, intent);
                }
            }
        });
        this.d = new ThreadPoolExecutor(0, 1, 3L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.umipublish.draft.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable}) : new Thread(runnable, "umi_draft_work_thread");
            }
        });
        if (s.F()) {
            this.d.allowCoreThreadTimeOut(true);
        }
    }

    public static b a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("77fe27db", new Object[]{context});
        }
        if (f23237a == null) {
            synchronized (b.class) {
                if (f23237a == null) {
                    f23237a = new b(context);
                }
            }
        }
        return f23237a;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.d.submit(runnable);
        }
    }

    private boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(b());
    }

    private String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : ba.a();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        String f = f(str);
        if (!StringUtils.isEmpty(f)) {
            return an.b(this.b, f, (String) null);
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            String f = f(str);
            if (StringUtils.isEmpty(f)) {
                return;
            }
            an.a(this.b, f, "");
            u.a(TAG, "clear auto save marker");
        }
    }

    private String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        if (a() && !StringUtils.isEmpty(str)) {
            return String.format(Locale.getDefault(), "umi_local_draft_%s_%s", str, b());
        }
        return null;
    }

    public c.a a(final IUGCMedia iUGCMedia, final DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("4b6e2c3e", new Object[]{this, iUGCMedia, draftModel});
        }
        if (draftModel == null) {
            return new c.a("102", c.a.ERROR_MSG_INVALID_PARAM);
        }
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: com.taobao.umipublish.draft.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    new reg(iUGCMedia).a(iUGCMedia, draftModel, new DraftMediaHelper.a() { // from class: com.taobao.umipublish.draft.b.2.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        {
                            AnonymousClass2.this = this;
                        }

                        @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
                        public void a() {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                            } else {
                                UmiPublishMonitor.a(b.TAG, "saveVideoDraftSuccess");
                            }
                        }

                        @Override // com.taobao.umipublish.draft.DraftMediaHelper.a
                        public void a(String str) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("f3a64c32", new Object[]{this, str});
                                return;
                            }
                            UmiPublishMonitor.a(b.TAG, "saveVideoDraftError" + str);
                        }
                    });
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        c.a a2 = a(draftModel.biz, draftModel);
        if (a2.f23241a != null) {
            if (a2.f23241a.autoSave) {
                an.a(this.b, f(a2.f23241a.biz), a2.f23241a.draftId);
                u.a(TAG, "put auto save marker: " + a2.f23241a.draftId);
            } else if (StringUtils.equals(a2.f23241a.draftId, a(a2.f23241a.biz))) {
                b(a2.f23241a.biz);
            }
            a(a2.f23241a);
        } else {
            UmiPublishMonitor a3 = UmiPublishMonitor.a();
            a3.l(a2.d + "," + a2.e + ":" + draftModel.toString());
        }
        return a2;
    }

    private void a(DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da839f83", new Object[]{this, draftModel});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>(Collections.singletonList(draftModel.draftId));
        Map<String, String> map = draftModel.urlParams;
        ArrayList<String> arrayList2 = new ArrayList<>(Collections.singletonList((map == null || !map.containsKey("umi_pub_session")) ? "" : map.get("umi_pub_session")));
        Intent a2 = a(ACTION_TYPE_SAVE, draftModel.biz, arrayList);
        a2.putExtra(KEY_AUTO_SAVE, draftModel.autoSave);
        a2.putStringArrayListExtra(KEY_SESSION_IDS, arrayList2);
        LocalBroadcastManager.getInstance(this.b).sendBroadcast(a2);
    }

    public c.a a(String str, DraftModel draftModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("4d23dc0a", new Object[]{this, str, draftModel});
        }
        if (a()) {
            return this.c.a(str, b(), draftModel);
        }
        return new c.a("104", c.a.ERROR_MSG_DRAFT_SAVE_FAILED);
    }

    public Collection<DraftModel> a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("cc209125", new Object[]{this, str, new Boolean(z)});
        }
        if (!a()) {
            return null;
        }
        Collection<DraftModel> b = this.c.b(str, b());
        if (b == null) {
            UmiPublishMonitor.a().j("");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (DraftModel draftModel : b) {
            if (draftModel != null && xpu.Companion.a(draftModel.urlParams)) {
                arrayList.add(draftModel);
            } else {
                arrayList2.add(draftModel);
            }
        }
        return z ? arrayList : arrayList2;
    }

    public DraftModel d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("2691185c", new Object[]{this, str});
        }
        if (a() && !StringUtils.isEmpty(str)) {
            return this.c.c(str, b());
        }
        return null;
    }

    public DraftModel a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DraftModel) ipChange.ipc$dispatch("1bf508f5", new Object[]{this, str, str2});
        }
        if (!a()) {
            return null;
        }
        DraftModel a2 = this.c.a(str, b(), str2);
        if (a2 != null) {
            return a2;
        }
        UmiPublishMonitor a3 = UmiPublishMonitor.a();
        a3.k("draftId=" + str2);
        return null;
    }

    public c.a a(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("649ad817", new Object[]{this, str, jSONArray});
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            UmiPublishMonitor.a().m("draftIds is empty");
            return new c.a("102", c.a.ERROR_MSG_INVALID_PARAM);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        c.a a2 = a(str, arrayList);
        if (!a2.c) {
            UmiPublishMonitor.a().m(jSONArray.toJSONString());
        }
        return a2;
    }

    public c.a e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("318a3bf3", new Object[]{this, str});
        }
        if (a()) {
            return this.c.d(str, b());
        }
        return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    public c.a a(String str, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("188d9f20", new Object[]{this, str, collection});
        }
        if (a()) {
            c.a b = this.c.b(str, b(), collection);
            if (b.c && collection.contains(a(str))) {
                b(str);
            }
            if (b.c) {
                b(str, collection);
            }
            return b;
        }
        UmiPublishMonitor.a(TAG, "no login: userid:" + b());
        return new c.a("105", c.a.ERROR_MSG_DRAFT_DELETE_FAILED);
    }

    public c.a b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c.a) ipChange.ipc$dispatch("dbee673a", new Object[]{this, str, str2}) : a(str, Collections.singletonList(str2));
    }

    public c.a a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c.a) ipChange.ipc$dispatch("910c574d", new Object[]{this, str, str2, str3, str4});
        }
        DraftModel a2 = a(this.b).a(str, str3);
        if (a2 != null) {
            a2.draftId = null;
            a2.biz = str2;
            a2.failedCode = str4;
            String uuid = UUID.randomUUID().toString();
            a2.urlParams.put("umi_pub_session", uuid);
            DraftMediaHelper draftMediaHelper = new DraftMediaHelper(Globals.getApplication());
            File a3 = draftMediaHelper.a(a2.urlParams.get("umi_pub_session"), a2);
            File a4 = draftMediaHelper.a(uuid, a2);
            if (a3 != null && a4 != null) {
                a3.renameTo(a4);
            }
            c.a a5 = this.c.a(str2, b(), a2);
            if (a5 != null && a5.c) {
                return a5;
            }
        }
        return new c.a("106", c.a.ERROR_MSG_DRAFT_MOVE_FAILED);
    }

    private void b(String str, Collection<String> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba40cae4", new Object[]{this, str, collection});
        } else {
            LocalBroadcastManager.getInstance(this.b).sendBroadcast(a("delete", str, new ArrayList<>(collection)));
        }
    }

    private Intent a(String str, String str2, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("58d327a5", new Object[]{this, str, str2, arrayList});
        }
        Intent intent = new Intent(DRAFT_ACTION);
        intent.putExtra("actionType", str);
        intent.putExtra("biz", str2);
        intent.putStringArrayListExtra(KEY_DRAFT_IDS, arrayList);
        return intent;
    }

    private void a(Intent intent) {
        LoginAction valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
        } else if (intent == null || (valueOf = LoginAction.valueOf(intent.getAction())) == null || valueOf != LoginAction.NOTIFY_LOGIN_SUCCESS) {
        } else {
            this.c.a();
        }
    }
}
