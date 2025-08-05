package com.taobao.android.weex_framework.module.builtin;

import android.app.Dialog;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.m;
import com.taobao.android.weex_framework.util.o;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSNativeApiModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Dialog activeDialog;

    static {
        kge.a(-1525206953);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ MUSValue access$000(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("de69914f", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("a51854d0", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1000(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("4e0923e", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1100(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("cb8f55bf", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1200(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("923e1940", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1300(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("58ecdcc1", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1400(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("1f9ba042", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1500(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("e64a63c3", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1600(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("acf92744", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1700(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("73a7eac5", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1800(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("3a56ae46", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1900(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("10571c7", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("6bc71851", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$2000(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("140a3edd", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$2100(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("dab9025e", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$300(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("3275dbd2", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$400(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("f9249f53", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$500(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("bfd362d4", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$600(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("86822655", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$700(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("4d30e9d6", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$800(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("13dfad57", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$900(MUSNativeApiModule mUSNativeApiModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("da8e70d8", new Object[]{mUSNativeApiModule, mUSValueArr, new Integer(i)}) : mUSNativeApiModule.getArgument(mUSValueArr, i);
    }

    public MUSNativeApiModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onModuleCreate(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe82ab6d", new Object[]{this, mUSModule});
        } else {
            d.a(mUSModule);
        }
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onModuleDestroy(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d99b5", new Object[]{this, mUSModule});
        } else {
            d.a(mUSModule, this.activeDialog);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
        if (r11.equals(com.alipay.android.msp.drivers.actions.MspEventTypes.ACTION_STRING_POST_NOTIFICATION) != false) goto L10;
     */
    @Override // com.taobao.android.weex_framework.module.MUSModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object onDispatchMethod(com.taobao.android.weex_framework.module.MUSModule r10, java.lang.String r11, com.taobao.android.weex_framework.MUSValue[] r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.onDispatchMethod(com.taobao.android.weex_framework.module.MUSModule, java.lang.String, com.taobao.android.weex_framework.MUSValue[], java.lang.Object):java.lang.Object");
    }

    public void open(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6f046e", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(mUSModule, (JSONObject) k.a(MUSNativeApiModule.this.getInstance(), obj, JSONObject.class, MUSNativeApiModule.access$000(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$100(MUSNativeApiModule.this, mUSValueArr, 1)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$200(MUSNativeApiModule.this, mUSValueArr, 2)));
                    }
                }
            });
        }
    }

    public void close(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("385a3100", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.b(mUSModule, (JSONObject) k.a(MUSNativeApiModule.this.getInstance(), obj, JSONObject.class, MUSNativeApiModule.access$300(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$400(MUSNativeApiModule.this, mUSValueArr, 1)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$500(MUSNativeApiModule.this, mUSValueArr, 2)));
                    }
                }
            });
        }
    }

    public void push(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6497519e", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(mUSModule, (String) k.a(MUSNativeApiModule.this.getInstance(), obj, String.class, MUSNativeApiModule.access$600(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$700(MUSNativeApiModule.this, mUSValueArr, 1)));
                    }
                }
            });
        }
    }

    public void pop(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac2f487", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.b(mUSModule, (String) k.a(MUSNativeApiModule.this.getInstance(), obj, String.class, MUSNativeApiModule.access$800(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$900(MUSNativeApiModule.this, mUSValueArr, 1)));
                    }
                }
            });
        }
    }

    public void replace(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936998c4", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.c(mUSModule, (String) k.a(MUSNativeApiModule.this.getInstance(), obj, String.class, MUSNativeApiModule.access$1000(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$1100(MUSNativeApiModule.this, mUSValueArr, 1)));
                    }
                }
            });
        }
    }

    public void postNotification(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d43b3ed", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(mUSModule, (String) k.a(MUSNativeApiModule.this.getInstance(), obj, String.class, MUSNativeApiModule.access$1200(MUSNativeApiModule.this, mUSValueArr, 0)), (JSONObject) k.a(MUSNativeApiModule.this.getInstance(), obj, JSONObject.class, MUSNativeApiModule.access$1300(MUSNativeApiModule.this, mUSValueArr, 1)));
                    }
                }
            });
        }
    }

    public void toast(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5443a7f1", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(mUSModule, (JSONObject) k.a(MUSNativeApiModule.this.getInstance(), obj, JSONObject.class, MUSNativeApiModule.access$1400(MUSNativeApiModule.this, mUSValueArr, 0)));
                    }
                }
            });
        }
    }

    public void confirm(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b292738", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    m mVar = new m();
                    d.a(mUSModule, (JSONObject) k.a(MUSNativeApiModule.this.getInstance(), obj, JSONObject.class, MUSNativeApiModule.access$1500(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$1600(MUSNativeApiModule.this, mUSValueArr, 1)), mVar);
                    if (!mVar.a()) {
                        return;
                    }
                    MUSNativeApiModule.this.activeDialog = (Dialog) mVar.b();
                }
            });
        }
    }

    public void prompt(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c60ac14", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    m mVar = new m();
                    d.b(mUSModule, (JSONObject) k.a(MUSNativeApiModule.this.getInstance(), obj, JSONObject.class, MUSNativeApiModule.access$1700(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$1800(MUSNativeApiModule.this, mUSValueArr, 1)), mVar);
                    if (!mVar.a()) {
                        return;
                    }
                    MUSNativeApiModule.this.activeDialog = (Dialog) mVar.b();
                }
            });
        }
    }

    public void alert(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfba51c", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    m mVar = new m();
                    d.c(mUSModule, (JSONObject) k.a(MUSNativeApiModule.this.getInstance(), obj, JSONObject.class, MUSNativeApiModule.access$1900(MUSNativeApiModule.this, mUSValueArr, 0)), (b) k.a(MUSNativeApiModule.this.getInstance(), obj, b.class, MUSNativeApiModule.access$2000(MUSNativeApiModule.this, mUSValueArr, 1)), mVar);
                    if (!mVar.a()) {
                        return;
                    }
                    MUSNativeApiModule.this.activeDialog = (Dialog) mVar.b();
                }
            });
        }
    }

    public void addRule(MUSModule mUSModule, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506e221b", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            d.b(mUSModule, (String) k.a(getInstance(), obj, String.class, getArgument(mUSValueArr, 0)), (JSONObject) k.a(getInstance(), obj, JSONObject.class, getArgument(mUSValueArr, 1)));
        }
    }

    public Object getBoundingClientRect(MUSModule mUSModule, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e8a9e243", new Object[]{this, mUSModule, mUSValueArr, obj}) : d.a(mUSModule, (String) k.a(getInstance(), obj, String.class, getArgument(mUSValueArr, 0)));
    }

    public void vibrate(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("923277a9", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(mUSModule, (Integer) k.a(MUSNativeApiModule.this.getInstance(), obj, Integer.class, MUSNativeApiModule.access$2100(MUSNativeApiModule.this, mUSValueArr, 0)));
                    }
                }
            });
        }
    }

    public void importScript(MUSModule mUSModule, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e05b28", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            d.a(mUSModule, (String) k.a(getInstance(), obj, String.class, getArgument(mUSValueArr, 0)), (JSONObject) k.a(getInstance(), obj, JSONObject.class, getArgument(mUSValueArr, 1)), (b) k.a(getInstance(), obj, b.class, getArgument(mUSValueArr, 2)), (b) k.a(getInstance(), obj, b.class, getArgument(mUSValueArr, 3)));
        }
    }

    /* loaded from: classes6.dex */
    public static final class a implements com.taobao.android.weex_framework.module.b<MUSNativeApiModule> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1812528739);
            kge.a(744458807);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public com.taobao.android.weex_framework.bridge.c<MUSNativeApiModule> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("cf141d1a", new Object[]{this, str});
            }
            return null;
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "[\"open\",\"close\",\"push\",\"pop\",\"postNotification\",\"toast\",\"confirm\",\"prompt\",\"alert\",\"addRule\",\"getBoundingClientRect\",\"vibrate\",\"replace\", \"importScript\"]";
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.weex_framework.module.builtin.MUSNativeApiModule, com.taobao.android.weex_framework.module.MUSModule] */
        @Override // com.taobao.android.weex_framework.module.b
        public /* synthetic */ MUSNativeApiModule a(String str, MUSDKInstance mUSDKInstance) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MUSModule) ipChange.ipc$dispatch("e7693831", new Object[]{this, str, mUSDKInstance}) : b(str, mUSDKInstance);
        }

        public MUSNativeApiModule b(String str, MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MUSNativeApiModule) ipChange.ipc$dispatch("6581271d", new Object[]{this, str, mUSDKInstance}) : new MUSNativeApiModule(str, mUSDKInstance);
        }
    }
}
