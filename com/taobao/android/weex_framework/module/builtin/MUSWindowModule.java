package com.taobao.android.weex_framework.module.builtin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.module.b;
import com.taobao.android.weex_framework.util.k;
import tb.kge;

/* loaded from: classes6.dex */
public class MUSWindowModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-254459404);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public boolean isGenerated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e95a1590", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public MUSWindowModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public void onModuleDestroy(MUSModule mUSModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d99b5", new Object[]{this, mUSModule});
        } else {
            f.a(mUSModule);
        }
    }

    @Override // com.taobao.android.weex_framework.module.MUSModule
    public Object onDispatchMethod(MUSModule mUSModule, String str, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8866c9be", new Object[]{this, mUSModule, str, mUSValueArr, obj});
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -2140931520) {
            if (hashCode != -625809843) {
                if (hashCode == -541487286 && str.equals("removeEventListener")) {
                    c = 2;
                }
            } else if (str.equals("addEventListener")) {
                c = 1;
            }
        } else if (str.equals("dispatchEvent")) {
            c = 0;
        }
        if (c == 0) {
            dispatchEvent(mUSModule, mUSValueArr, obj);
        } else if (c == 1) {
            addEventListener(mUSModule, mUSValueArr, obj);
        } else if (c == 2) {
            removeEventListener(mUSModule, mUSValueArr, obj);
        }
        return null;
    }

    public void dispatchEvent(MUSModule mUSModule, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34223b8", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            f.a(mUSModule, (String) k.a(getInstance(), obj, String.class, getArgument(mUSValueArr, 0)), getArgument(mUSValueArr, 1));
        }
    }

    public void addEventListener(MUSModule mUSModule, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7d50b", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            f.a(mUSModule, (String) k.a(getInstance(), obj, String.class, getArgument(mUSValueArr, 0)));
        }
    }

    public void removeEventListener(MUSModule mUSModule, MUSValue[] mUSValueArr, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450f7b6e", new Object[]{this, mUSModule, mUSValueArr, obj});
        } else {
            f.b(mUSModule, (String) k.a(getInstance(), obj, String.class, getArgument(mUSValueArr, 0)));
        }
    }

    /* loaded from: classes6.dex */
    public static final class a implements b<MUSWindowModule> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1156831686);
            kge.a(744458807);
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public com.taobao.android.weex_framework.bridge.c<MUSWindowModule> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (com.taobao.android.weex_framework.bridge.c) ipChange.ipc$dispatch("cf141d1a", new Object[]{this, str});
            }
            return null;
        }

        @Override // com.taobao.android.weex_framework.bridge.a
        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "[\"dispatchEvent\",\"addEventListener\",\"removeEventListener\"]";
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [com.taobao.android.weex_framework.module.builtin.MUSWindowModule, com.taobao.android.weex_framework.module.MUSModule] */
        @Override // com.taobao.android.weex_framework.module.b
        public /* synthetic */ MUSWindowModule a(String str, MUSDKInstance mUSDKInstance) throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MUSModule) ipChange.ipc$dispatch("e7693831", new Object[]{this, str, mUSDKInstance}) : b(str, mUSDKInstance);
        }

        public MUSWindowModule b(String str, MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (MUSWindowModule) ipChange.ipc$dispatch("7ceeb70e", new Object[]{this, str, mUSDKInstance}) : new MUSWindowModule(str, mUSDKInstance);
        }
    }
}
