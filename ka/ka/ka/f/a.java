package ka.ka.ka.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.atools.StaticHook;
import com.taobao.keepalive.KeepAliveManager;
import com.taobao.keepalive.screenoff.PixelActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.iao;
import tb.kaq;
import tb.kge;
import tb.rty;
import tb.rtz;
import tb.syk;

/* loaded from: classes9.dex */
public class a extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f24902a = null;

    static {
        kge.a(1117338143);
        b = new AtomicBoolean();
    }

    public final void a(Context context) {
        boolean z = false;
        rty.f33380a.d("PreventKillReceiver", "delayFinishReceiver", new Object[0]);
        try {
            Field a2 = StaticHook.a(BroadcastReceiver.class, "mPendingResult");
            a2.setAccessible(true);
            this.f24902a = a2.get(this);
            a2.set(this, null);
            rty.f33380a.d("PreventKillReceiver", "delayFinishReceiver mPendingResult = null", new Object[0]);
            z = true;
        } catch (Exception e) {
            this.f24902a = null;
            rty.f33380a.b("PreventKillReceiver", "onReceive err: ", e, new Object[0]);
        }
        if (this.f24902a == null || !z) {
            return;
        }
        rtz.b().schedule(new Runnable() { // from class: ka.ka.ka.f.-$$Lambda$o1NE3MxiBtwWZgFl2YPf74QpHpA
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        }, syk.a.f33954a.f(context), TimeUnit.SECONDS);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent == null ? "" : intent.getAction();
        rty.f33380a.d("PreventKillReceiver", iao.NEXT_TAG_RECEIVER, "action", action);
        if (TextUtils.isEmpty(action)) {
            return;
        }
        if ("com.taobao.alive.kill.finish_delay".equals(action)) {
            if (KeepAliveManager.isInstrMode()) {
                return;
            }
            b.set(false);
            a(context);
        } else if (!"com.taobao.alive.kill.finish_now".equals(action)) {
        } else {
            if (this.f24902a == null) {
                rty.f33380a.d("PreventKillReceiver", "pendingResult is null", new Object[0]);
                return;
            }
            rty.f33380a.d("PreventKillReceiver", "finishReceiverNow", new Object[0]);
            try {
                Method declaredMethod = this.f24902a.getClass().getSuperclass().getDeclaredMethod("finish", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f24902a, new Object[0]);
                rty.f33380a.d("PreventKillReceiver", "pendingResult.finish() success", new Object[0]);
                if (b.get()) {
                    Intent intent2 = new Intent(kaq.a(), PixelActivity.class);
                    intent2.putExtra("start_type", "f");
                    intent2.addFlags(268435456);
                    kaq.a().startActivity(intent2);
                    rty.f33380a.d("PreventKillReceiver", "startActivity PixelActivity success", new Object[0]);
                }
            } catch (Throwable th) {
                try {
                    rty.f33380a.b("PreventKillReceiver", "pendingResult.finish() err: ", th, new Object[0]);
                } finally {
                    this.f24902a = null;
                }
            }
        }
    }

    public final void a() {
        if (this.f24902a == null) {
            rty.f33380a.d("PreventKillReceiver", "pendingResult is null", new Object[0]);
            return;
        }
        rty.f33380a.d("PreventKillReceiver", "finishReceiverNow", new Object[0]);
        try {
            Method declaredMethod = this.f24902a.getClass().getSuperclass().getDeclaredMethod("finish", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(this.f24902a, new Object[0]);
            rty.f33380a.d("PreventKillReceiver", "pendingResult.finish() success", new Object[0]);
            if (b.get()) {
                Intent intent = new Intent(kaq.a(), PixelActivity.class);
                intent.putExtra("start_type", "f");
                intent.addFlags(268435456);
                kaq.a().startActivity(intent);
                rty.f33380a.d("PreventKillReceiver", "startActivity PixelActivity success", new Object[0]);
            }
        } catch (Throwable th) {
            try {
                rty.f33380a.b("PreventKillReceiver", "pendingResult.finish() err: ", th, new Object[0]);
            } finally {
                this.f24902a = null;
            }
        }
    }
}
