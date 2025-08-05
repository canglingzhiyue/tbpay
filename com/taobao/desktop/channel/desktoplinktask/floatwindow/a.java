package com.taobao.desktop.channel.desktoplinktask.floatwindow;

import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.a;
import com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel;
import com.taobao.desktop.channel.desktoplinktask.trigger.e;
import com.taobao.desktop.channel.desktoplinktask.trigger.f;
import com.taobao.desktop.channel.desktoplinktask.widgetservice.d;
import tb.kge;
import tb.kgt;
import tb.kgu;
import tb.kgy;
import tb.kgz;
import tb.kha;
import tb.khm;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: com.taobao.desktop.channel.desktoplinktask.floatwindow.a$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC0651a {
        void a();

        void a(String str);
    }

    static {
        kge.a(-1322602710);
    }

    public static /* synthetic */ FloatWindow a(a aVar, Context context, View view, WindowStyleModel windowStyleModel, FloatWindow.a aVar2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FloatWindow) ipChange.ipc$dispatch("29814af2", new Object[]{aVar, context, view, windowStyleModel, aVar2}) : aVar.a(context, view, windowStyleModel, aVar2);
    }

    public static /* synthetic */ void a(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a427fe35", new Object[]{aVar, bVar});
        } else {
            aVar.b(bVar);
        }
    }

    public static /* synthetic */ boolean a(a aVar, InterfaceC0651a interfaceC0651a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3741647d", new Object[]{aVar, interfaceC0651a})).booleanValue() : aVar.a(interfaceC0651a);
    }

    public static /* synthetic */ boolean b(a aVar, b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("32b37f3a", new Object[]{aVar, bVar})).booleanValue() : aVar.a(bVar);
    }

    public void a(b bVar, String str, String str2, WindowStyleModel windowStyleModel, InterfaceC0651a interfaceC0651a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f9dfb2", new Object[]{this, bVar, str, str2, windowStyleModel, interfaceC0651a});
            return;
        }
        f fVar = bVar.f16946a;
        if (fVar == null || TextUtils.isEmpty(fVar.c)) {
            return;
        }
        kgu kguVar = new kgu(khm.a().b(), bVar, str, str2, null, new AnonymousClass1(interfaceC0651a, windowStyleModel));
        bVar.c = kguVar;
        kguVar.a();
    }

    /* renamed from: com.taobao.desktop.channel.desktoplinktask.floatwindow.a$1 */
    /* loaded from: classes7.dex */
    public class AnonymousClass1 implements kgu.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ InterfaceC0651a f16945a;
        public final /* synthetic */ WindowStyleModel b;

        public static /* synthetic */ void lambda$7VsJOVwpFqhL2e0l5_aEvg93Z6o(AnonymousClass1 anonymousClass1, b bVar, InterfaceC0651a interfaceC0651a, String str) {
            anonymousClass1.a(bVar, interfaceC0651a, str);
        }

        public static /* synthetic */ void lambda$NckeD4AcjsEphLjOJgJ7Pyx7X7c(AnonymousClass1 anonymousClass1, View view, WindowStyleModel windowStyleModel, b bVar, InterfaceC0651a interfaceC0651a) {
            anonymousClass1.a(view, windowStyleModel, bVar, interfaceC0651a);
        }

        /* renamed from: lambda$_A3NE3gMQjW_lQ6EGF9UPr-ysHQ */
        public static /* synthetic */ void m1057lambda$_A3NE3gMQjW_lQ6EGF9UPrysHQ(b bVar, View view) {
            c(bVar, view);
        }

        /* renamed from: lambda$jZbKitXN2BfGzl360eNa2Hu31-Y */
        public static /* synthetic */ void m1058lambda$jZbKitXN2BfGzl360eNa2Hu31Y(AnonymousClass1 anonymousClass1, b bVar, InterfaceC0651a interfaceC0651a) {
            anonymousClass1.a(bVar, interfaceC0651a);
        }

        public AnonymousClass1(InterfaceC0651a interfaceC0651a, WindowStyleModel windowStyleModel) {
            a.this = r1;
            this.f16945a = interfaceC0651a;
            this.b = windowStyleModel;
        }

        @Override // tb.kgu.a
        public void a(final b bVar, final View view) {
            IpChange ipChange = $ipChange;
            boolean z = true;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e15fe334", new Object[]{this, bVar, view});
                return;
            }
            Object[] objArr = new Object[1];
            if (view == null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            kgz.b("popUpWindow.onRenderSuccess.stateViewIsNotNull=%s", objArr);
            if (view == null) {
                this.f16945a.a("popUpWindowFailed.onRenderSuccess.viewIsNull");
                return;
            }
            final WindowStyleModel windowStyleModel = this.b;
            final InterfaceC0651a interfaceC0651a = this.f16945a;
            kha.b(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.floatwindow.-$$Lambda$a$1$NckeD4AcjsEphLjOJgJ7Pyx7X7c
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass1.lambda$NckeD4AcjsEphLjOJgJ7Pyx7X7c(a.AnonymousClass1.this, view, windowStyleModel, bVar, interfaceC0651a);
                }
            });
        }

        public /* synthetic */ void a(View view, WindowStyleModel windowStyleModel, final b bVar, InterfaceC0651a interfaceC0651a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f9649b0", new Object[]{this, view, windowStyleModel, bVar, interfaceC0651a});
                return;
            }
            try {
                FloatWindow a2 = a.a(a.this, khm.a().b(), view, windowStyleModel, new FloatWindow.a() { // from class: com.taobao.desktop.channel.desktoplinktask.floatwindow.-$$Lambda$a$1$v7I3rbItwZhLU0KtpkXZrPsk4Bo
                    @Override // com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.a
                    public final void onGestureStatusChange(int i, JSONObject jSONObject) {
                        a.AnonymousClass1.a(b.this, i, jSONObject);
                    }
                });
                bVar.b = a2;
                if (a2 == null) {
                    interfaceC0651a.a("popUpWindowFailed.onRenderSuccess.createFloatWindowFailed");
                } else if (!bVar.f16946a.a() && !a.a(a.this, interfaceC0651a)) {
                } else {
                    boolean b = a.b(a.this, bVar);
                    if (interfaceC0651a != null) {
                        if (b) {
                            interfaceC0651a.a();
                        } else {
                            a.a(a.this, bVar);
                            interfaceC0651a.a("displayFailed");
                        }
                    }
                    kgz.b("popUpWindow.onRenderSuccess.onViewAdded.", new Object[0]);
                }
            } catch (Throwable th) {
                kgz.a("popUpWindow.onRenderSuccess.error", th);
            }
        }

        public static /* synthetic */ void a(b bVar, int i, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65a3f9ab", new Object[]{bVar, new Integer(i), jSONObject});
                return;
            }
            try {
                kgz.a("FloatWindow.onGestureStatusChange.event=%s.params=%s", Integer.valueOf(i), jSONObject);
                if (bVar.d()) {
                    return;
                }
                String b = kgt.b(i);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sourceName", (Object) "FloatWindow");
                jSONObject2.put("event", (Object) b);
                jSONObject2.put("content", (Object) jSONObject);
                if (bVar.c == null) {
                    return;
                }
                bVar.c.a(b, jSONObject);
                bVar.c.b(kgt.a(i), jSONObject2);
            } catch (Throwable th) {
                kgz.a("onGestureStatusChange.error", th);
            }
        }

        @Override // tb.kgu.a
        public void a(final b bVar, final String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9dd3daf2", new Object[]{this, bVar, str, str2});
                return;
            }
            kgz.b("popUpWindow.onRenderFailed.reason=%s.errorMessage=%s", str, str2);
            final InterfaceC0651a interfaceC0651a = this.f16945a;
            kha.b(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.floatwindow.-$$Lambda$a$1$7VsJOVwpFqhL2e0l5_aEvg93Z6o
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass1.lambda$7VsJOVwpFqhL2e0l5_aEvg93Z6o(a.AnonymousClass1.this, bVar, interfaceC0651a, str);
                }
            });
        }

        public /* synthetic */ void a(b bVar, InterfaceC0651a interfaceC0651a, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be2f2c22", new Object[]{this, bVar, interfaceC0651a, str});
                return;
            }
            try {
                if (bVar == null) {
                    kgz.b("popUpWindow.onRenderFailed.windowViewRef=null", new Object[0]);
                    return;
                }
                boolean b = bVar.b();
                a.a(a.this, bVar);
                kgz.b("popUpWindow.onRenderFailed.close.", new Object[0]);
                if (b || interfaceC0651a == null) {
                    return;
                }
                interfaceC0651a.a(str);
            } catch (Throwable th) {
                kgz.a("popUpWindow.onRenderFailed.error", th);
            }
        }

        @Override // tb.kgu.a
        public void b(final b bVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc8e12b3", new Object[]{this, bVar, str, str2});
                return;
            }
            kgz.b("popUpWindow.onNeedClosed.reason=%s.closeMessage=%s", str, str2);
            final InterfaceC0651a interfaceC0651a = this.f16945a;
            kha.b(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.floatwindow.-$$Lambda$a$1$jZbKitXN2BfGzl360eNa2Hu31-Y
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass1.m1058lambda$jZbKitXN2BfGzl360eNa2Hu31Y(a.AnonymousClass1.this, bVar, interfaceC0651a);
                }
            });
        }

        public /* synthetic */ void a(b bVar, InterfaceC0651a interfaceC0651a) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5a26858", new Object[]{this, bVar, interfaceC0651a});
                return;
            }
            try {
                a.a(a.this, bVar);
            } catch (Throwable th) {
                kgz.a("popUpWindow.onNeedClosed.error", th);
            }
        }

        @Override // tb.kgu.a
        public void b(final b bVar, final View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10114d53", new Object[]{this, bVar, view});
                return;
            }
            kgz.b("popUpWindow.onSwitchState.", new Object[0]);
            kha.b(new Runnable() { // from class: com.taobao.desktop.channel.desktoplinktask.floatwindow.-$$Lambda$a$1$_A3NE3gMQjW_lQ6EGF9UPr-ysHQ
                @Override // java.lang.Runnable
                public final void run() {
                    a.AnonymousClass1.m1057lambda$_A3NE3gMQjW_lQ6EGF9UPrysHQ(b.this, view);
                }
            });
        }

        public static /* synthetic */ void c(b bVar, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ec2b772", new Object[]{bVar, view});
                return;
            }
            try {
                if (bVar == null) {
                    kgz.a("popUpWindow.onSwitchState.windowViewRef=null", new Object[0]);
                    return;
                }
                FloatWindow floatWindow = bVar.b;
                if (floatWindow == null) {
                    kgz.b("popUpWindow.onSwitchState.floatWindow=null", new Object[0]);
                } else {
                    floatWindow.a(view);
                }
            } catch (Throwable th) {
                kgz.a("popUpWindow.onSwitchState.error", th);
            }
        }
    }

    private boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2d53ce2", new Object[]{this, bVar})).booleanValue();
        }
        if (bVar != null) {
            try {
                if (bVar.a()) {
                    if (bVar.d()) {
                        kgz.b("display.windowRequest.butIsClosed", new Object[0]);
                        return false;
                    }
                    bVar.b.a();
                    bVar.b(true);
                    f fVar = bVar.f16946a;
                    e.b(fVar.f16953a, fVar.c, fVar.d);
                    return true;
                }
            } catch (Throwable th) {
                kgz.a("FloatWindowManager.display.byRequest.error", th);
                return false;
            }
        }
        kgz.b("display.windowRequest.invalid", new Object[0]);
        return false;
    }

    private void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e664c11f", new Object[]{this, bVar});
        } else {
            d.a().b(bVar);
        }
    }

    private boolean a(InterfaceC0651a interfaceC0651a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f999ce6", new Object[]{this, interfaceC0651a})).booleanValue();
        }
        Application b = khm.a().b();
        if (kgy.a(b)) {
            interfaceC0651a.a("checkEnvBeforeDisplay.checkBackgroundFailed");
            return false;
        } else if (!((PowerManager) b.getSystemService("power")).isScreenOn()) {
            interfaceC0651a.a("checkEnvBeforeDisplay.checkIsScreenOnFailed");
            return false;
        } else if (((KeyguardManager) b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            interfaceC0651a.a("checkEnvBeforeDisplay.checkIsScreenLockedFailed");
            return false;
        } else {
            Pair<Integer, Integer> e = kgy.e(b);
            if (((Integer) e.second).intValue() > ((Integer) e.first).intValue()) {
                return true;
            }
            interfaceC0651a.a("checkEnvBeforeDisplay.checkIsDevicePortraitScapeFailed");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x0102, code lost:
        if (r15 > 0.0f) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow a(android.content.Context r18, android.view.View r19, com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel r20, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow.a r21) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.desktop.channel.desktoplinktask.floatwindow.a.a(android.content.Context, android.view.View, com.taobao.desktop.channel.desktoplinktask.floatwindow.model.WindowStyleModel, com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow$a):com.taobao.desktop.channel.desktoplinktask.floatwindow.FloatWindow");
    }

    private int a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b6361d", new Object[]{this, context, str})).intValue();
        }
        try {
            return (int) kgy.a(context, Float.parseFloat(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }
}
