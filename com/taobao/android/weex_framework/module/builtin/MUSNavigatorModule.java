package com.taobao.android.weex_framework.module.builtin;

import android.app.Dialog;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.bridge.b;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.o;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSNavigatorModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Dialog activeDialog;

    static {
        kge.a(-177601237);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ MUSValue access$000(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("ea3f0023", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$100(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("b0edc3a4", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1000(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("10b60112", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1100(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("d764c493", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1200(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("9e138814", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1300(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("64c24b95", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$1400(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("2b710f16", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$200(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("779c8725", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$300(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("3e4b4aa6", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$400(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("4fa0e27", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$500(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("cba8d1a8", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$600(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("92579529", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$700(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("590658aa", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$800(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("1fb51c2b", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public static /* synthetic */ MUSValue access$900(MUSNavigatorModule mUSNavigatorModule, MUSValue[] mUSValueArr, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MUSValue) ipChange.ipc$dispatch("e663dfac", new Object[]{mUSNavigatorModule, mUSValueArr, new Integer(i)}) : mUSNavigatorModule.getArgument(mUSValueArr, i);
    }

    public MUSNavigatorModule(String str, MUSDKInstance mUSDKInstance) {
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
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r11.equals("replace") != false) goto L10;
     */
    @Override // com.taobao.android.weex_framework.module.MUSModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object onDispatchMethod(com.taobao.android.weex_framework.module.MUSModule r10, java.lang.String r11, com.taobao.android.weex_framework.MUSValue[] r12, java.lang.Object r13) {
        /*
            r9 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 5
            if (r1 == 0) goto L1f
            java.lang.Object[] r1 = new java.lang.Object[r7]
            r1[r6] = r9
            r1[r5] = r10
            r1[r4] = r11
            r1[r3] = r12
            r1[r2] = r13
            java.lang.String r10 = "8866c9be"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            return r10
        L1f:
            r0 = 0
            r1 = -1
            int r8 = r11.hashCode()
            switch(r8) {
                case -625809843: goto L69;
                case -541487286: goto L5e;
                case 111185: goto L53;
                case 3417674: goto L48;
                case 3452698: goto L3d;
                case 94756344: goto L33;
                case 1094496948: goto L29;
                default: goto L28;
            }
        L28:
            goto L73
        L29:
            java.lang.String r3 = "replace"
            boolean r11 = r11.equals(r3)
            if (r11 == 0) goto L73
            goto L74
        L33:
            java.lang.String r2 = "close"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L73
            r2 = 1
            goto L74
        L3d:
            java.lang.String r2 = "push"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L73
            r2 = 2
            goto L74
        L48:
            java.lang.String r2 = "open"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L73
            r2 = 0
            goto L74
        L53:
            java.lang.String r2 = "pop"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L73
            r2 = 3
            goto L74
        L5e:
            java.lang.String r2 = "removeEventListener"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L73
            r2 = 6
            goto L74
        L69:
            java.lang.String r2 = "addEventListener"
            boolean r11 = r11.equals(r2)
            if (r11 == 0) goto L73
            r2 = 5
            goto L74
        L73:
            r2 = -1
        L74:
            switch(r2) {
                case 0: goto L90;
                case 1: goto L8c;
                case 2: goto L88;
                case 3: goto L84;
                case 4: goto L80;
                case 5: goto L7c;
                case 6: goto L78;
                default: goto L77;
            }
        L77:
            goto L93
        L78:
            r9.removeEventListener(r10, r12, r13)
            goto L93
        L7c:
            r9.addEventListener(r10, r12, r13)
            goto L93
        L80:
            r9.replace(r10, r12, r13)
            goto L93
        L84:
            r9.pop(r10, r12, r13)
            goto L93
        L88:
            r9.push(r10, r12, r13)
            goto L93
        L8c:
            r9.close(r10, r12, r13)
            goto L93
        L90:
            r9.open(r10, r12, r13)
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.onDispatchMethod(com.taobao.android.weex_framework.module.MUSModule, java.lang.String, com.taobao.android.weex_framework.MUSValue[], java.lang.Object):java.lang.Object");
    }

    public void open(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d6f046e", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(mUSModule, (JSONObject) k.a(MUSNavigatorModule.this.getInstance(), obj, JSONObject.class, MUSNavigatorModule.access$000(MUSNavigatorModule.this, mUSValueArr, 0)), (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$100(MUSNavigatorModule.this, mUSValueArr, 1)), (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$200(MUSNavigatorModule.this, mUSValueArr, 2)));
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
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.b(mUSModule, (JSONObject) k.a(MUSNavigatorModule.this.getInstance(), obj, JSONObject.class, MUSNavigatorModule.access$300(MUSNavigatorModule.this, mUSValueArr, 0)), (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$400(MUSNavigatorModule.this, mUSValueArr, 1)), (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$500(MUSNavigatorModule.this, mUSValueArr, 2)));
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
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.a(mUSModule, (String) k.a(MUSNavigatorModule.this.getInstance(), obj, String.class, MUSNavigatorModule.access$600(MUSNavigatorModule.this, mUSValueArr, 0)), (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$700(MUSNavigatorModule.this, mUSValueArr, 1)));
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
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.b(mUSModule, (String) k.a(MUSNavigatorModule.this.getInstance(), obj, String.class, MUSNavigatorModule.access$800(MUSNavigatorModule.this, mUSValueArr, 0)), (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$900(MUSNavigatorModule.this, mUSValueArr, 1)));
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
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        d.c(mUSModule, (String) k.a(MUSNavigatorModule.this.getInstance(), obj, String.class, MUSNavigatorModule.access$1000(MUSNavigatorModule.this, mUSValueArr, 0)), (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$1100(MUSNavigatorModule.this, mUSValueArr, 1)));
                    }
                }
            });
        }
    }

    public void addEventListener(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7d50b", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
                    String str = (String) k.a(MUSNavigatorModule.this.getInstance(), obj, String.class, MUSNavigatorModule.access$1200(MUSNavigatorModule.this, mUSValueArr, 0));
                    final b bVar = (b) k.a(MUSNavigatorModule.this.getInstance(), obj, b.class, MUSNavigatorModule.access$1300(MUSNavigatorModule.this, mUSValueArr, 1));
                    if ("goback".equalsIgnoreCase(str)) {
                        if (bVar == null) {
                            return;
                        }
                        mUSDKInstance.addGoBackEventCallback(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.6.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.weex_framework.util.o
                            public void a() throws Exception {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("56c6c68", new Object[]{this});
                                } else {
                                    bVar.b(new Object[0]);
                                }
                            }
                        });
                        return;
                    }
                    g.f("NavigatorModule", "Unknown event name: " + str);
                }
            });
        }
    }

    public void removeEventListener(final MUSModule mUSModule, final MUSValue[] mUSValueArr, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450f7b6e", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            dispatchMethodToMain(new o() { // from class: com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    String str = (String) k.a(MUSNavigatorModule.this.getInstance(), obj, String.class, MUSNavigatorModule.access$1400(MUSNavigatorModule.this, mUSValueArr, 0));
                    MUSDKInstance mUSDKInstance = (MUSDKInstance) mUSModule.getInstance();
                    if ("goback".equalsIgnoreCase(str)) {
                        mUSDKInstance.clearGoBackEventCallbacks();
                        return;
                    }
                    g.f("NavigatorModule", "Unknown event name: " + str);
                }
            });
        }
    }

    /* loaded from: classes6.dex */
    public static final class a implements com.taobao.android.weex_framework.module.b<MUSNavigatorModule> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-421412239);
            kge.a(744458807);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public com.taobao.android.weex_framework.bridge.c<MUSNavigatorModule> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("cf141d1a", new Object[]{this, str});
            }
            return null;
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "[\"open\",\"close\",\"push\",\"pop\",\"replace\",\"addEventListener\",\"removeEventListener\"]";
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.weex_framework.module.MUSModule, com.taobao.android.weex_framework.module.builtin.MUSNavigatorModule] */
        @Override // com.taobao.android.weex_framework.module.b
        public /* synthetic */ MUSNavigatorModule a(String str, MUSDKInstance mUSDKInstance) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MUSModule) ipChange.ipc$dispatch("e7693831", new Object[]{this, str, mUSDKInstance}) : b(str, mUSDKInstance);
        }

        public MUSNavigatorModule b(String str, MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MUSNavigatorModule) ipChange.ipc$dispatch("1f88ecc9", new Object[]{this, str, mUSDKInstance}) : new MUSNavigatorModule(str, mUSDKInstance);
        }
    }
}
