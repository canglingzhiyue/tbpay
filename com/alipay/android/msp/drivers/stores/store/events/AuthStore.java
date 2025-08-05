package com.alipay.android.msp.drivers.stores.store.events;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;
import com.alipay.android.msp.framework.hardwarepay.old.MspHardwarePayUtil;
import com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* loaded from: classes3.dex */
public class AuthStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static BroadcastReceiver k;
    private static BroadcastReceiver m;
    private boolean g;
    private BroadcastReceiver h;
    private int i;
    private ValidateDialogProxy j;
    private boolean l;

    public static /* synthetic */ Object ipc$super(AuthStore authStore, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(AuthStore authStore, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d35190d", new Object[]{authStore, new Integer(i)})).intValue();
        }
        authStore.i = i;
        return i;
    }

    public static /* synthetic */ MspContext a(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("b62b35e3", new Object[]{authStore}) : authStore.f4584a;
    }

    public static /* synthetic */ String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : b(str, str2);
    }

    public static /* synthetic */ void a(AuthStore authStore, ValidateDialogProxy validateDialogProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9459ab", new Object[]{authStore, validateDialogProxy});
        } else {
            authStore.a(validateDialogProxy);
        }
    }

    public static /* synthetic */ void a(AuthStore authStore, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fd43c27", new Object[]{authStore, str, str2, str3});
        } else {
            authStore.a(str, str2, str3);
        }
    }

    public static /* synthetic */ boolean a(AuthStore authStore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d3558ef", new Object[]{authStore, new Boolean(z)})).booleanValue();
        }
        authStore.l = z;
        return z;
    }

    public static /* synthetic */ MspContext b(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("71d46402", new Object[]{authStore}) : authStore.f4584a;
    }

    public static /* synthetic */ ValidateDialogProxy c(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ValidateDialogProxy) ipChange.ipc$dispatch("8ddd39cf", new Object[]{authStore}) : authStore.j;
    }

    public static /* synthetic */ Context d(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d1a06944", new Object[]{authStore}) : authStore.d;
    }

    public static /* synthetic */ MspContext e(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("a4cfee5f", new Object[]{authStore}) : authStore.f4584a;
    }

    public static /* synthetic */ MspContext f(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("60791c7e", new Object[]{authStore}) : authStore.f4584a;
    }

    public static /* synthetic */ boolean g(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9daba193", new Object[]{authStore})).booleanValue() : authStore.g;
    }

    public static /* synthetic */ MspContext h(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("d7cb78bc", new Object[]{authStore}) : authStore.f4584a;
    }

    public static /* synthetic */ int i(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("552e9904", new Object[]{authStore})).intValue() : authStore.e;
    }

    public static /* synthetic */ Context j(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("769f9dca", new Object[]{authStore}) : authStore.d;
    }

    public static /* synthetic */ Context k(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3cca268b", new Object[]{authStore}) : authStore.d;
    }

    public static /* synthetic */ BroadcastReceiver l(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BroadcastReceiver) ipChange.ipc$dispatch("af64eb4b", new Object[]{authStore}) : authStore.h;
    }

    public static /* synthetic */ MspTradeContext m(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("836fede5", new Object[]{authStore}) : authStore.b;
    }

    public static /* synthetic */ MspTradeContext n(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("5d39bb26", new Object[]{authStore}) : authStore.b;
    }

    public static /* synthetic */ boolean o(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7bb77f9b", new Object[]{authStore})).booleanValue() : authStore.l;
    }

    public static /* synthetic */ void p(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5778fb58", new Object[]{authStore});
        } else {
            authStore.a();
        }
    }

    public static /* synthetic */ int q(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("333a770c", new Object[]{authStore})).intValue() : authStore.i;
    }

    public static /* synthetic */ MspContext r(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("2c6745f2", new Object[]{authStore}) : authStore.f4584a;
    }

    public static /* synthetic */ MspContext s(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspContext) ipChange.ipc$dispatch("e8107411", new Object[]{authStore}) : authStore.f4584a;
    }

    public static /* synthetic */ int t(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c67eea4f", new Object[]{authStore})).intValue();
        }
        int i = authStore.i;
        authStore.i = i + 1;
        return i;
    }

    public static /* synthetic */ MspTradeContext u(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspTradeContext) ipChange.ipc$dispatch("51be57ed", new Object[]{authStore}) : authStore.b;
    }

    public static /* synthetic */ Context v(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c09e06d6", new Object[]{authStore}) : authStore.d;
    }

    public static /* synthetic */ Context w(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("86c88f97", new Object[]{authStore}) : authStore.d;
    }

    public static /* synthetic */ Context x(AuthStore authStore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4cf31858", new Object[]{authStore}) : authStore.d;
    }

    public AuthStore(int i) {
        super(i);
        this.i = 0;
        this.j = null;
        this.l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
        if (r5.getIntValue("fpProtocolType") == 1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5 A[Catch: Exception -> 0x0268, TryCatch #0 {Exception -> 0x0268, blocks: (B:8:0x0036, B:11:0x003b, B:13:0x003f, B:16:0x0045, B:18:0x0055, B:20:0x005f, B:22:0x0065, B:24:0x006b, B:27:0x0074, B:30:0x0080, B:33:0x00a0, B:36:0x00b2, B:38:0x00b8, B:49:0x00d1, B:52:0x00d9, B:58:0x00e5, B:60:0x00ec, B:62:0x00f2, B:64:0x00fc, B:66:0x0102, B:68:0x0107, B:70:0x010b, B:72:0x0110, B:74:0x0142, B:76:0x0146, B:78:0x0169, B:80:0x0171, B:63:0x00f7, B:41:0x00bf, B:43:0x00c5), top: B:114:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec A[Catch: Exception -> 0x0268, TryCatch #0 {Exception -> 0x0268, blocks: (B:8:0x0036, B:11:0x003b, B:13:0x003f, B:16:0x0045, B:18:0x0055, B:20:0x005f, B:22:0x0065, B:24:0x006b, B:27:0x0074, B:30:0x0080, B:33:0x00a0, B:36:0x00b2, B:38:0x00b8, B:49:0x00d1, B:52:0x00d9, B:58:0x00e5, B:60:0x00ec, B:62:0x00f2, B:64:0x00fc, B:66:0x0102, B:68:0x0107, B:70:0x010b, B:72:0x0110, B:74:0x0142, B:76:0x0146, B:78:0x0169, B:80:0x0171, B:63:0x00f7, B:41:0x00bf, B:43:0x00c5), top: B:114:0x0036 }] */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r21, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r22) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.AuthStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }

    private void a(final String[] strArr, JSONObject jSONObject, final boolean z, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7484a75", new Object[]{this, strArr, jSONObject, new Boolean(z), jSONObject2});
        } else if (this.f4584a != null && this.f4584a.getContext() != null) {
            final String localizedStringForKey = LanguageHelper.localizedStringForKey("flybird_bl_val_ok", this.f4584a.getContext().getString(R.string.flybird_bl_val_ok), new Object[0]);
            final String str = strArr.length > 5 ? strArr[5] : null;
            LogUtil.record(1, "phonecashier#bracelet", "AuthStore.handleBLAuthResponseReceiver", "FlybirdWindowManager发起支付手环校验请求");
            for (int i = 0; i < strArr.length; i++) {
                LogUtil.record(1, "phonecashier#bracelet", "AuthStore.handleBLAuthResponseReceiver", "actionParams" + i + ":" + strArr[i]);
            }
            this.i = 0;
            a((ValidateDialogProxy) null);
            if (this.c == null) {
                return;
            }
            final MspBasePresenter currentPresenter = this.c.getCurrentPresenter();
            if (this.h != null) {
                try {
                    LocalBroadcastManager.getInstance(this.f4584a.getContext()).unregisterReceiver(this.h);
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            this.h = new BroadcastReceiver() { // from class: com.alipay.android.msp.drivers.stores.store.events.AuthStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:38:0x01c5  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x022b  */
                @Override // android.content.BroadcastReceiver
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void onReceive(android.content.Context r11, android.content.Intent r12) {
                    /*
                        Method dump skipped, instructions count: 594
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
                }
            };
            if (z) {
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.AuthStore.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        AuthStore authStore = AuthStore.this;
                        AuthStore.a(authStore, new ValidateDialogProxy(2, AuthStore.k(authStore)));
                        AuthStore.c(AuthStore.this).showDialog(currentPresenter.getActivity(), 2, localizedStringForKey, new IDialogActionListener() { // from class: com.alipay.android.msp.drivers.stores.store.events.AuthStore.2.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
                            /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                            @Override // com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public void onDialogAction(int r5) {
                                /*
                                    r4 = this;
                                    com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.AnonymousClass1.$ipChange
                                    boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                                    r2 = 2
                                    if (r1 == 0) goto L1a
                                    java.lang.Object[] r1 = new java.lang.Object[r2]
                                    r2 = 0
                                    r1[r2] = r4
                                    r2 = 1
                                    java.lang.Integer r3 = new java.lang.Integer
                                    r3.<init>(r5)
                                    r1[r2] = r3
                                    java.lang.String r5 = "2d7a4c5f"
                                    r0.ipc$dispatch(r5, r1)
                                    return
                                L1a:
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.c(r0)
                                    if (r0 == 0) goto L37
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.c(r0)
                                    boolean r0 = r0.isShown()
                                    if (r0 != 0) goto L37
                                    r0 = 100
                                    if (r5 == r0) goto L37
                                    return
                                L37:
                                    java.lang.String r0 = "bncb"
                                    java.lang.String r1 = "bl"
                                    if (r5 != 0) goto L4d
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.ui.presenters.MspBasePresenter r5 = r2
                                    boolean r5 = r5 instanceof com.alipay.android.msp.ui.presenters.MspContainerPresenter
                                    if (r5 == 0) goto L7c
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    java.lang.String r2 = "{\"status\":\"0009\"}"
                                    goto L56
                                L4d:
                                    if (r5 != r2) goto L5a
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    java.lang.String r2 = "{\"status\":\"0005\"}"
                                L56:
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore.a(r5, r1, r0, r2)
                                    goto L7c
                                L5a:
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.c(r5)
                                    if (r5 == 0) goto L7c
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    com.alipay.android.msp.framework.hardwarepay.old.dialog.ValidateDialogProxy r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.c(r5)
                                    boolean r5 = r5.isValidateOk()
                                    if (r5 != 0) goto L7c
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    java.lang.String r0 = "back"
                                    java.lang.String r2 = "{\"action\":{\"name\":\"loc:back\"}}"
                                    goto L56
                                L7c:
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    android.content.BroadcastReceiver r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.l(r5)
                                    if (r5 == 0) goto La1
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    com.alipay.android.msp.core.context.MspTradeContext r5 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.m(r5)
                                    android.content.Context r5 = r5.getContext()
                                    android.support.v4.content.LocalBroadcastManager r5 = android.support.v4.content.LocalBroadcastManager.getInstance(r5)
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore$2 r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.this
                                    com.alipay.android.msp.drivers.stores.store.events.AuthStore r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.this
                                    android.content.BroadcastReceiver r0 = com.alipay.android.msp.drivers.stores.store.events.AuthStore.l(r0)
                                    r5.unregisterReceiver(r0)
                                La1:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.AuthStore.AnonymousClass2.AnonymousClass1.onDialogAction(int):void");
                            }
                        });
                        AuthStore.c(AuthStore.this).updateMsg(LanguageHelper.localizedStringForKey("flybird_bl_val_ok", AuthStore.n(AuthStore.this).getContext().getString(R.string.flybird_bl_val_ok), new Object[0]), 200, -16777216);
                    }
                });
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(MspGlobalDefine.BL_AUTHENTICATE_ACTION);
            LocalBroadcastManager.getInstance(this.b.getContext()).registerReceiver(this.h, intentFilter);
            MspHardwarePayUtil.getInstance().execute(this.b.getContext(), 2, jSONObject);
        }
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        EventAction eventAction = new EventAction(str2);
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthStore.executeEvent", "biz:" + str + " eventAction:" + eventAction + " EventData:" + str3);
        eventAction.setActionData(str3);
        ActionsCreator.get(this.f4584a).createEventAction(eventAction);
    }

    private static String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4204a5c3", new Object[]{str, str2});
        }
        return "{\"status\":\"" + str + "\",\"tip\":\"" + str2 + "\"}";
    }

    public void beforeFrameChangedClean(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ac6cf9", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            a();
            if (this.h != null) {
                LocalBroadcastManager.getInstance(this.f4584a.getContext()).unregisterReceiver(this.h);
                this.h = null;
            }
            if (this.j != null && (!this.g || (i != 12 && i != 10))) {
                this.j.dismiss(0);
                a((ValidateDialogProxy) null);
            }
            MspHardwarePayUtil.getInstance().cancel(this.d);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthStore.toUnregisterReceiver", "toUnregisterReceiver");
            if (k != null && this.f4584a != null && this.f4584a.getContext() != null) {
                this.f4584a.getContext().unregisterReceiver(k);
            }
            k = null;
            if (m != null) {
                LocalBroadcastManager.getInstance(this.d).unregisterReceiver(m);
            }
            m = null;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    private void a(ValidateDialogProxy validateDialogProxy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d792ac", new Object[]{this, validateDialogProxy});
            return;
        }
        this.j = validateDialogProxy;
        if (this.f4584a.getStoreCenter() == null) {
            return;
        }
        ((ActionStoreCenter) this.f4584a.getStoreCenter()).setDialog(validateDialogProxy);
    }

    public static /* synthetic */ void a(AuthStore authStore, String str, JSONObject jSONObject, BroadcastReceiver broadcastReceiver, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dadf0d9", new Object[]{authStore, str, jSONObject, broadcastReceiver, new Integer(i)});
            return;
        }
        LogUtil.record(1, AlipaySDKJSBridge.LOG_TAG, "AuthStore.toSubmitPay", "action:".concat(String.valueOf(str)));
        if (MspFlybirdDefine.FLYBIRD_ACTION_CASHIER_PAY.equals(str) || MspFlybirdDefine.FLYBIRD_ACTION_CASHIER_PAYMENT.equals(str)) {
            authStore.f4584a.getMspNetHandler().setNetErrorCode("6004");
        }
        MspTradeContext tradeContextByBizId = MspContextManager.getInstance().getTradeContextByBizId(authStore.e);
        if (tradeContextByBizId != null) {
            ActionsCreator.get(tradeContextByBizId).createSubmitEventAction(str, jSONObject.toJSONString(), EventAction.SubmitType.CommonRequest, i + 10);
        }
        LocalBroadcastManager.getInstance(authStore.f4584a.getContext()).unregisterReceiver(broadcastReceiver);
    }
}
