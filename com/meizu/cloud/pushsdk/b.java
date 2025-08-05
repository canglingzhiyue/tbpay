package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.c;
import com.meizu.cloud.pushsdk.handler.e.d;
import com.meizu.cloud.pushsdk.handler.e.e;
import com.meizu.cloud.pushsdk.handler.e.f;
import com.meizu.cloud.pushsdk.handler.e.g;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f7863a;
    private final SparseArray<c> b;
    private Map<String, com.meizu.cloud.pushsdk.handler.a> c;
    private com.meizu.cloud.pushsdk.handler.e.m.a d;
    private com.meizu.cloud.pushsdk.handler.e.b.a e;

    /* loaded from: classes4.dex */
    public class a extends com.meizu.cloud.pushsdk.handler.a {
        public a() {
        }

        @Override // com.meizu.cloud.pushsdk.handler.a
        public void a(Context context, Intent intent) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, intent);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, PushSwitchStatus pushSwitchStatus) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, pushSwitchStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, RegisterStatus registerStatus) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, registerStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, SubAliasStatus subAliasStatus) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, subAliasStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, SubTagsStatus subTagsStatus) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, subTagsStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, UnRegisterStatus unRegisterStatus) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, unRegisterStatus);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, String str) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, str);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, String str, String str2) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, str, str2);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(Context context, boolean z) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(context, z);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void a(PushNotificationBuilder pushNotificationBuilder) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.a(pushNotificationBuilder);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void b(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.b(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void b(Context context, String str) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.b(context, str);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void c(Context context, MzPushMessage mzPushMessage) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.c(context, mzPushMessage);
                }
            }
        }

        @Override // com.meizu.cloud.pushsdk.handler.b
        public void c(Context context, String str) {
            for (Map.Entry entry : b.this.c.entrySet()) {
                com.meizu.cloud.pushsdk.handler.a aVar = (com.meizu.cloud.pushsdk.handler.a) entry.getValue();
                if (aVar != null) {
                    aVar.c(context, str);
                }
            }
        }
    }

    public b(Context context) {
        this(context, null);
    }

    public b(Context context, List<c> list) {
        this(context, list, null);
    }

    public b(Context context, List<c> list, com.meizu.cloud.pushsdk.handler.a aVar) {
        this.b = new SparseArray<>();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.c = new HashMap();
            a aVar2 = new a();
            if (PushConstants.PUSH_PACKAGE_NAME.equalsIgnoreCase(applicationContext.getPackageName())) {
                this.d = new com.meizu.cloud.pushsdk.handler.e.m.a(applicationContext);
                if (MinSdkChecker.isSupportNotificationSort()) {
                    this.e = new com.meizu.cloud.pushsdk.handler.e.b.a(applicationContext);
                }
            }
            if (list != null) {
                a(list);
                return;
            }
            a(new d(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.c(applicationContext, aVar2));
            a(new f(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.k.b(applicationContext, aVar2));
            a(new e(applicationContext, aVar2));
            a(new g(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.k.d(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.l.a(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.l.c(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.l.f(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.l.d(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.l.e(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.m.c(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.l.b(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.k.e(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.i.a(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.k.a(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.k.f(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.m.b(applicationContext, aVar2));
            a(new com.meizu.cloud.pushsdk.handler.e.k.c(applicationContext, aVar2));
            return;
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    public static b a(Context context) {
        if (f7863a == null) {
            synchronized (b.class) {
                if (f7863a == null) {
                    DebugLogger.i("PushMessageProxy", "PushMessageProxy init");
                    f7863a = new b(context);
                }
            }
        }
        return f7863a;
    }

    public b a(c cVar) {
        this.b.put(cVar.a(), cVar);
        return this;
    }

    public b a(String str, com.meizu.cloud.pushsdk.handler.a aVar) {
        this.c.put(str, aVar);
        return this;
    }

    public b a(List<c> list) {
        if (list != null) {
            for (c cVar : list) {
                a(cVar);
            }
            return this;
        }
        throw new IllegalArgumentException("messageManagerList must not be null.");
    }

    public com.meizu.cloud.pushsdk.handler.e.b.a a() {
        return this.e;
    }

    public void a(Intent intent) {
        DebugLogger.e("PushMessageProxy", "process message start");
        try {
            String stringExtra = intent.getStringExtra("method");
            DebugLogger.i("PushMessageProxy", "receive action " + intent.getAction() + " method " + stringExtra);
            for (int i = 0; i < this.b.size() && !this.b.valueAt(i).b(intent); i++) {
            }
        } catch (Exception e) {
            DebugLogger.e("PushMessageProxy", "process message error " + e.getMessage());
        }
    }

    public com.meizu.cloud.pushsdk.handler.e.m.a b() {
        return this.d;
    }
}
