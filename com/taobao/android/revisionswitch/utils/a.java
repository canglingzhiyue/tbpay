package com.taobao.android.revisionswitch.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lifecycle.PanguApplication;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.acg;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f14895a;
    private b b;

    /* renamed from: com.taobao.android.revisionswitch.utils.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0568a {
        public static final a helper = new a();
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    public static /* synthetic */ AtomicBoolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c9a09f03", new Object[]{aVar}) : aVar.f14895a;
    }

    public static /* synthetic */ b b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5ec14ff", new Object[]{aVar}) : aVar.b;
    }

    private a() {
        this.f14895a = new AtomicBoolean(false);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f14895a.getAndSet(true);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(false);
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("taobao.action.ACTION_REVISION_SWITCH_CHANGE");
        if (z) {
            intent.putExtra("isLazy", true);
        }
        LocalBroadcastManager.getInstance(acg.a()).sendBroadcast(intent);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ac5d545", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        b bVar = this.b;
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else if (!(context instanceof PanguApplication)) {
        } else {
            ((PanguApplication) context).registerCrossActivityLifecycleCallback(new PanguApplication.CrossActivityLifecycleCallback() { // from class: com.taobao.android.revisionswitch.utils.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                public void onCreated(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5f00e362", new Object[]{this, activity});
                    }
                }

                @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                public void onDestroyed(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fc107b13", new Object[]{this, activity});
                    }
                }

                @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                public void onStopped(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("82d37207", new Object[]{this, activity});
                    }
                }

                @Override // com.taobao.android.lifecycle.PanguApplication.CrossActivityLifecycleCallback
                public void onStarted(Activity activity) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4b167bb", new Object[]{this, activity});
                    } else if (!a.a(a.this).compareAndSet(true, false)) {
                    } else {
                        a.this.a(true);
                        if (a.b(a.this) == null) {
                            return;
                        }
                        a.b(a.this).a();
                    }
                }
            });
        }
    }
}
