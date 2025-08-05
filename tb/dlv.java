package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.nfc.FormatException;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.Tag;
import android.nfc.TagLostException;
import android.nfc.tech.Ndef;
import android.os.Build;
import android.os.Bundle;
import com.alibaba.ability.e;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.ai;
import kotlin.j;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes4.dex */
public final class dlv implements com.alibaba.ability.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_CHECK_STATUS = "checkStatus";
    public static final String API_ON_SUBSCRIBE = "subscribe";
    public static final String API_UNSUBSCRIBE = "unSubscribe";
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private static NfcAdapter f26840a;
    private static aln b;
    private static final AtomicBoolean c;
    private static Activity d;
    private static final NfcAdapter.ReaderCallback e;
    private static final b f;

    /* loaded from: classes4.dex */
    public static final class d implements dmk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Activity b;

        public d(Activity activity) {
            this.b = activity;
        }

        @Override // tb.dmk
        public final void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            } else if (!z) {
            } else {
                Intent a2 = dlv.a(dlv.this, "android.settings.NFC_SETTINGS", this.b);
                a2.addFlags(268435456);
                this.b.startActivity(a2);
            }
        }
    }

    public static final /* synthetic */ Intent a(dlv dlvVar, String str, Activity activity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("6766878d", new Object[]{dlvVar, str, activity}) : dlvVar.a(str, activity);
    }

    public static final /* synthetic */ b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5d0bb7b2", new Object[0]) : f;
    }

    public static final /* synthetic */ void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{activity});
        } else {
            d = activity;
        }
    }

    public static final /* synthetic */ void a(NfcAdapter nfcAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4e9db4f", new Object[]{nfcAdapter});
        } else {
            f26840a = nfcAdapter;
        }
    }

    public static final /* synthetic */ void a(aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03fee55", new Object[]{alnVar});
        } else {
            b = alnVar;
        }
    }

    public static final /* synthetic */ Activity b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("233c125f", new Object[0]) : d;
    }

    public static final /* synthetic */ aln c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aln) ipChange.ipc$dispatch("1e65aa99", new Object[0]) : b;
    }

    public static final /* synthetic */ AtomicBoolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("aa60526b", new Object[0]) : c;
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1883881542);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        public static final /* synthetic */ ExecutingResult a(a aVar, Tag tag, Ndef ndef) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (ExecutingResult) ipChange.ipc$dispatch("2a8c6e6b", new Object[]{aVar, tag, ndef}) : aVar.a(tag, ndef);
        }

        public static final /* synthetic */ void a(a aVar, Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9d1205f", new Object[]{aVar, activity});
            } else {
                aVar.a(activity);
            }
        }

        private final ExecutingResult a(Tag tag, Ndef ndef) {
            String b;
            NdefRecord[] records;
            IpChange ipChange = $ipChange;
            char c = 0;
            if (ipChange instanceof IpChange) {
                return (ExecutingResult) ipChange.ipc$dispatch("2d336f0", new Object[]{this, tag, ndef});
            }
            hsx hsxVar = hsx.INSTANCE;
            String[] techList = tag.getTechList();
            String a2 = hsxVar.a(techList != null ? techList[0] : null);
            if (q.a((Object) a2, (Object) "ISO 15693")) {
                hsx hsxVar2 = hsx.INSTANCE;
                Tag tag2 = ndef.getTag();
                q.b(tag2, "ndef.tag");
                byte[] id = tag2.getId();
                q.b(id, "ndef.tag.id");
                b = hsxVar2.a(id);
            } else {
                hsx hsxVar3 = hsx.INSTANCE;
                Tag tag3 = ndef.getTag();
                q.b(tag3, "ndef.tag");
                byte[] id2 = tag3.getId();
                q.b(id2, "ndef.tag.id");
                b = hsxVar3.b(id2);
            }
            ArrayList arrayList = new ArrayList();
            try {
                NdefMessage ndefMessage = ndef.getNdefMessage();
                if (ndefMessage != null && (records = ndefMessage.getRecords()) != null) {
                    int length = records.length;
                    int i = 0;
                    while (i < length) {
                        NdefRecord curMsg = records[i];
                        Pair[] pairArr = new Pair[4];
                        q.b(curMsg, "curMsg");
                        pairArr[c] = j.a("tnf", String.valueOf((int) curMsg.getTnf()));
                        byte[] type = curMsg.getType();
                        q.b(type, "curMsg.type");
                        pairArr[1] = j.a("type", new String(type, kotlin.text.d.UTF_8));
                        byte[] id3 = curMsg.getId();
                        q.b(id3, "curMsg.id");
                        pairArr[2] = j.a("id", new String(id3, kotlin.text.d.UTF_8));
                        byte[] payload = curMsg.getPayload();
                        q.b(payload, "curMsg.payload");
                        pairArr[3] = j.a("payload", new String(payload, kotlin.text.d.UTF_8));
                        arrayList.add(new JSONObject(ai.b(pairArr)));
                        i++;
                        c = 0;
                    }
                }
                return new ExecutingResult(new JSONObject(ai.b(j.a("id", b), j.a("droidType", a2), j.a("ndefMessage", new JSONArray(arrayList)))), iao.NEXT_TAG_RECEIVER);
            } catch (FormatException | TagLostException | IOException unused) {
                return null;
            }
        }

        private final void a(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
                return;
            }
            activity.getApplication().unregisterActivityLifecycleCallbacks(dlv.a());
            dlv.a((Activity) null);
            dlv.a((NfcAdapter) null);
            dlv.a((aln) null);
            dlv.d().set(false);
        }
    }

    static {
        kge.a(-506307970);
        kge.a(-948502777);
        Companion = new a(null);
        c = new AtomicBoolean(false);
        e = c.INSTANCE;
        f = new b();
    }

    /* loaded from: classes4.dex */
    public static final class c implements NfcAdapter.ReaderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final c INSTANCE = new c();

        /* loaded from: classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ExecutingResult f26841a;

            public a(ExecutingResult executingResult) {
                this.f26841a = executingResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                aln c = dlv.c();
                if (c == null) {
                    return;
                }
                c.a(this.f26841a);
            }
        }

        @Override // android.nfc.NfcAdapter.ReaderCallback
        public final void onTagDiscovered(Tag it) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f00418e1", new Object[]{this, it});
                return;
            }
            Ndef ndef = Ndef.get(it);
            if (ndef == null) {
                e.a(AnonymousClass1.INSTANCE, 0L, 2, null);
                return;
            }
            ndef.connect();
            a aVar = dlv.Companion;
            q.b(it, "it");
            ExecutingResult a2 = a.a(aVar, it, ndef);
            if (a2 == null) {
                return;
            }
            e.a(new a(a2), 0L, 2, null);
        }

        /* renamed from: tb.dlv$c$1  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass1 implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                aln c = dlv.c();
                if (c == null) {
                    return;
                }
                c.a(new ErrorResult("1003", "当前设备不支持该类型的 NFC 芯片", (Map) null, 4, (o) null));
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, outState});
                return;
            }
            q.d(activity, "activity");
            q.d(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            } else {
                q.d(activity, "activity");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            q.d(activity, "activity");
            if (!q.a(activity, dlv.b())) {
                return;
            }
            a.a(dlv.Companion, activity);
        }
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        alt b2 = context.b();
        Context f2 = b2 != null ? b2.f() : null;
        if (!(f2 instanceof Activity)) {
            f2 = null;
        }
        Activity activity = (Activity) f2;
        if (activity == null) {
            return new ErrorResult("400", "Please set activity to AKAbilityRuntimeContext#context.", (Map) null, 4, (o) null);
        }
        if (activity.isFinishing()) {
            return new ErrorResult("2002", "当前 Activity 正在销毁", (Map) null, 4, (o) null);
        }
        int hashCode = api.hashCode();
        if (hashCode != -1707717967) {
            if (hashCode != 514841930) {
                if (hashCode == 768129818 && api.equals("checkStatus")) {
                    return d(activity);
                }
            } else if (api.equals("subscribe")) {
                a(activity, callback);
                return null;
            }
        } else if (api.equals(API_UNSUBSCRIBE)) {
            return e(activity);
        }
        return new ErrorResult("501", (String) null, (Map) null, 6, (o) null);
    }

    private final void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fdb367b", new Object[]{this, activity});
            return;
        }
        Object systemService = activity.getSystemService("nfc");
        if (!(systemService instanceof NfcManager)) {
            systemService = null;
        }
        NfcManager nfcManager = (NfcManager) systemService;
        if (nfcManager == null) {
            return;
        }
        f26840a = nfcManager.getDefaultAdapter();
    }

    private final boolean c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792c4740", new Object[]{this, activity})).booleanValue();
        }
        if (f26840a == null) {
            b(activity);
        }
        if (hsw.INSTANCE.a()) {
            return hsw.INSTANCE.b(activity);
        }
        NfcAdapter nfcAdapter = f26840a;
        return nfcAdapter != null && nfcAdapter.isEnabled();
    }

    private final ExecuteResult d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("77ee4ba2", new Object[]{this, activity});
        }
        boolean b2 = hsx.INSTANCE.b(activity);
        if (Build.VERSION.SDK_INT < 19) {
            b2 = false;
        }
        return new FinishResult(new JSONObject(ai.b(j.a("isSupportNfc", Boolean.valueOf(b2)), j.a("isReadingAvailable", Boolean.valueOf(c(activity) & b2)))), null, 2, null);
    }

    private final void a(Activity activity, aln alnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("668035a7", new Object[]{this, activity, alnVar});
        } else if (c.get()) {
            alnVar.a(new ErrorResult("1001", "当前页面已有 NFC 阅读器开始工作", (Map) null, 4, (o) null));
        } else if (hsx.INSTANCE.b(activity)) {
            if (c(activity)) {
                if (Build.VERSION.SDK_INT >= 19) {
                    if (!c.compareAndSet(false, true)) {
                        return;
                    }
                    b = alnVar;
                    d = activity;
                    activity.getApplication().registerActivityLifecycleCallbacks(f);
                    f(activity);
                    return;
                }
                alnVar.a(new ErrorResult("1002", "当前设备不支持 NFC 识别能力", (Map) null, 4, (o) null));
            } else if (Build.VERSION.SDK_INT >= 19) {
                h(activity);
            } else {
                alnVar.a(new ErrorResult("1002", "当前设备不支持 NFC 识别能力", (Map) null, 4, (o) null));
            }
        } else {
            alnVar.a(new ErrorResult("1002", "当前设备不支持 NFC 识别能力", (Map) null, 4, (o) null));
        }
    }

    private final void h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97c19b01", new Object[]{this, activity});
        } else {
            new dmj(activity, new d(activity), com.alibaba.ability.localization.b.a(R.string.app_prompt), com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_21208), com.alibaba.ability.localization.b.a(R.string.app_know), com.alibaba.ability.localization.b.a(R.string.taobao_app_1012_1_21209)).a();
        }
    }

    private final Intent a(String str, Activity activity) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("bbd5068f", new Object[]{this, str, activity});
        }
        Activity activity2 = activity;
        if (hsw.INSTANCE.a() & hsx.INSTANCE.a(activity2)) {
            intent = hsw.INSTANCE.a(activity2);
        } else {
            intent = Build.VERSION.SDK_INT >= 16 ? new Intent(str) : null;
        }
        return intent == null ? a(activity, str) : intent;
    }

    private final Intent a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f960438f", new Object[]{this, activity, str});
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        return intent;
    }

    private final ExecuteResult e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("145c4801", new Object[]{this, activity});
        }
        if (c.compareAndSet(true, false)) {
            if (Build.VERSION.SDK_INT >= 19) {
                g(activity);
            }
            a.a(Companion, activity);
            return new FinishResult(new JSONObject(ai.b(j.a("success", true))), null, 2, null);
        }
        return new ErrorResult("1004", "当前页面NFC 阅读器未开始工作", (Map) null, 4, (o) null);
    }

    private final void f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251f797f", new Object[]{this, activity});
            return;
        }
        NfcAdapter nfcAdapter = f26840a;
        if (nfcAdapter == null) {
            return;
        }
        nfcAdapter.enableReaderMode(activity, e, 31, null);
    }

    private final void g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e708a40", new Object[]{this, activity});
            return;
        }
        NfcAdapter nfcAdapter = f26840a;
        if (nfcAdapter == null) {
            return;
        }
        nfcAdapter.disableReaderMode(activity);
    }
}
