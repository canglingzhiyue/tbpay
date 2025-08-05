package com.alibaba.ability.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes2.dex */
public final class TransParentActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    private static HashMap<String, c> b;

    /* renamed from: a  reason: collision with root package name */
    private c f1827a;

    public static /* synthetic */ Object ipc$super(TransParentActivity transParentActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static final /* synthetic */ HashMap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("be7c57cb", new Object[0]) : b;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        getWindow().addFlags(32);
        super.onCreate(bundle);
        getWindow().setGravity(51);
        Window window = getWindow();
        q.b(window, "window");
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        Window window2 = getWindow();
        q.b(window2, "window");
        window2.setAttributes(attributes);
        String stringExtra = getIntent().getStringExtra("cb_uuid");
        String str = stringExtra;
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            finish();
            return;
        }
        c remove = b.remove(stringExtra);
        if (remove == null) {
            finish();
            return;
        }
        this.f1827a = remove;
        c cVar = this.f1827a;
        if (cVar == null) {
            return;
        }
        cVar.onActivityCreated(this, bundle);
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        c cVar = this.f1827a;
        if (cVar == null) {
            return;
        }
        cVar.onActivityResumed(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        c cVar = this.f1827a;
        if (cVar == null) {
            return;
        }
        cVar.onActivityStarted(this);
    }

    @Override // android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        c cVar = this.f1827a;
        if (cVar == null) {
            return;
        }
        cVar.onActivityStopped(this);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        c cVar = this.f1827a;
        if (cVar == null) {
            return;
        }
        cVar.onActivityDestroyed(this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        c cVar = this.f1827a;
        if (cVar != null) {
            cVar.a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1380766656);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final void a(Intent intent, Context context, c activityCallBacks) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc73e098", new Object[]{this, intent, context, activityCallBacks});
                return;
            }
            q.d(intent, "intent");
            q.d(context, "context");
            q.d(activityCallBacks, "activityCallBacks");
            String uuid = UUID.randomUUID().toString();
            q.b(uuid, "UUID.randomUUID().toString()");
            TransParentActivity.a().put(uuid, activityCallBacks);
            intent.putExtra("cb_uuid", uuid);
            context.startActivity(intent);
        }

        @JvmStatic
        public final Intent a(Intent intent, c activityCallBacks) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("f0d59159", new Object[]{this, intent, activityCallBacks});
            }
            q.d(intent, "intent");
            q.d(activityCallBacks, "activityCallBacks");
            String uuid = UUID.randomUUID().toString();
            q.b(uuid, "UUID.randomUUID().toString()");
            TransParentActivity.a().put(uuid, activityCallBacks);
            intent.putExtra("cb_uuid", uuid);
            return intent;
        }
    }

    static {
        kge.a(1320590968);
        Companion = new a(null);
        b = new HashMap<>();
    }
}
