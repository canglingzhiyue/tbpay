package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.util.i;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.f;
import com.taobao.tao.shop.common.ShopConstants;
import tb.kej;
import tb.xki;

/* loaded from: classes6.dex */
public class xki implements srf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private boolean f34349a = true;
    private final BroadcastReceiver b = new BroadcastReceiver() { // from class: com.taobao.bootimage.arch.flow.bootimage.BroadcastFlowInterceptor$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent == null || !TextUtils.equals(intent.getAction(), "TBBootImageForbiddenModeBroadcast")) {
            } else {
                String stringExtra = intent.getStringExtra("stage");
                if (TextUtils.equals(stringExtra, "startForbidden")) {
                    String stringExtra2 = intent.getStringExtra("timeout");
                    int i = ShopConstants.K_ALL_WEEX_ENABLED_CACHE_TIME_DEFAULT;
                    try {
                        i = Integer.parseInt(stringExtra2);
                    } catch (Exception e) {
                        kej.a("BroadcastFlowInterceptor", "parse delay time error", e);
                    }
                    xki.a(xki.this, false);
                    xki.a(xki.this).removeCallbacksAndMessages(null);
                    int i2 = i * 1000;
                    xki.a(xki.this).sendEmptyMessageDelayed(1, i2);
                    kej.a("BroadcastFlowInterceptor", "receive 屏蔽时间：" + i2);
                    xki.a(xki.this, intent, i);
                }
                if (!TextUtils.equals(stringExtra, "stopForbidden")) {
                    return;
                }
                kej.a("BroadcastFlowInterceptor", "receive 解除屏蔽 ：");
                xki.a(xki.this, true);
            }
        }
    };
    private final i c = new i(Looper.getMainLooper()) { // from class: tb.xki.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            xki.this = this;
        }

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
            if (message.what != 1) {
                return;
            }
            kej.a("BroadcastFlowInterceptor", "屏蔽超时 ：");
            xki.a(xki.this, true);
        }
    };

    static {
        kge.a(1624540989);
        kge.a(1012900376);
    }

    public static /* synthetic */ i a(xki xkiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("2399f316", new Object[]{xkiVar}) : xkiVar.c;
    }

    public static /* synthetic */ void a(xki xkiVar, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bb429e4", new Object[]{xkiVar, intent, new Integer(i)});
        } else {
            xkiVar.a(intent, i);
        }
    }

    public static /* synthetic */ boolean a(xki xkiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e67293d6", new Object[]{xkiVar, new Boolean(z)})).booleanValue();
        }
        xkiVar.f34349a = z;
        return z;
    }

    public xki() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("TBBootImageForbiddenModeBroadcast");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        kej.a("BroadcastFlowInterceptor", "注册屏蔽广播 ：");
        LocalBroadcastManager.getInstance(f.b()).registerReceiver(this.b, intentFilter);
    }

    @Override // tb.srf
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f34349a;
    }

    private void a(Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2864bb7e", new Object[]{this, intent, new Integer(i)});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) intent.getStringExtra("bizId"));
            jSONObject.put("page", (Object) "Page_Home");
            jSONObject.put("eventId", (Object) 19999);
            jSONObject.put("arg1", (Object) "broadcastFlowInterceptor");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("scene", (Object) intent.getStringExtra("scene"));
            jSONObject2.put("ext", (Object) intent.getStringExtra("ext"));
            jSONObject2.put("timeout", (Object) Integer.valueOf(i));
            jSONObject.put("args", (Object) jSONObject2);
            ket.a(jSONObject);
        } catch (Throwable th) {
            kej.a("BroadcastFlowInterceptor", "commitUTMonitor", th);
        }
    }
}
