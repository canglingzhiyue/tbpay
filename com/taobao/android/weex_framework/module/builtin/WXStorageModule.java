package com.taobao.android.weex_framework.module.builtin;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.module.builtin.storage.b;
import com.taobao.android.weex_framework.module.builtin.storage.e;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public final class WXStorageModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS;
    public static final String NAME = "storage";
    private final b mStorageAdapter = l.a().c();

    public static /* synthetic */ Object ipc$super(WXStorageModule wXStorageModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(-1835296877);
        METHODS = new String[]{"setItem", "removeItem", "getItem", com.taobao.android.weex_framework.util.a.ATOM_length, "getAllKeys", "setItemPersistent"};
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        char c = 65535;
        switch (str2.hashCode()) {
            case -1106363674:
                if (str2.equals(com.taobao.android.weex_framework.util.a.ATOM_length)) {
                    c = 3;
                    break;
                }
                break;
            case -75439223:
                if (str2.equals("getItem")) {
                    c = 2;
                    break;
                }
                break;
            case 124428031:
                if (str2.equals("getAllKeys")) {
                    c = 4;
                    break;
                }
                break;
            case 1098253751:
                if (str2.equals("removeItem")) {
                    c = 1;
                    break;
                }
                break;
            case 1907924748:
                if (str2.equals("setItemPersistent")) {
                    c = 5;
                    break;
                }
                break;
            case 1984670357:
                if (str2.equals("setItem")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            setItem(weexValueArr);
            return null;
        } else if (c == 1) {
            removeItem(weexValueArr);
            return null;
        } else if (c == 2) {
            getItem(weexValueArr);
            return null;
        } else if (c == 3) {
            length(weexValueArr);
            return null;
        } else if (c == 4) {
            getAllKeys(weexValueArr);
            return null;
        } else if (c != 5) {
            return null;
        } else {
            setItemPersistent(weexValueArr);
            return null;
        }
    }

    private void setItem(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9bde73", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 3);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
        final com.taobao.android.weex.b callback = getCallback(weexValueArr, 2);
        if (TextUtils.isEmpty(stringValueOrNull)) {
            e.a(callback);
        } else {
            this.mStorageAdapter.a(stringValueOrNull, stringValueOrNull2, new b.a() { // from class: com.taobao.android.weex_framework.module.builtin.WXStorageModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    com.taobao.android.weex.b bVar = callback;
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(map);
                }
            });
        }
    }

    private void removeItem(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c254ef95", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        final com.taobao.android.weex.b callback = getCallback(weexValueArr, 1);
        if (TextUtils.isEmpty(stringValueOrNull)) {
            e.a(callback);
        } else {
            this.mStorageAdapter.c(stringValueOrNull, new b.a() { // from class: com.taobao.android.weex_framework.module.builtin.WXStorageModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    com.taobao.android.weex.b bVar = callback;
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(map);
                }
            });
        }
    }

    private void getItem(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae21367", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        final com.taobao.android.weex.b callback = getCallback(weexValueArr, 1);
        if (TextUtils.isEmpty(stringValueOrNull)) {
            e.a(callback);
        } else {
            this.mStorageAdapter.a(stringValueOrNull, new b.a() { // from class: com.taobao.android.weex_framework.module.builtin.WXStorageModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    com.taobao.android.weex.b bVar = callback;
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(map);
                }
            });
        }
    }

    private void length(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13c09c4", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 1);
        final com.taobao.android.weex.b callback = getCallback(weexValueArr, 0);
        this.mStorageAdapter.a(new b.a() { // from class: com.taobao.android.weex_framework.module.builtin.WXStorageModule.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                com.taobao.android.weex.b bVar = callback;
                if (bVar == null) {
                    return;
                }
                bVar.a(map);
            }
        });
    }

    private void getAllKeys(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb08a0dd", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 1);
        final com.taobao.android.weex.b callback = getCallback(weexValueArr, 0);
        this.mStorageAdapter.b(new b.a() { // from class: com.taobao.android.weex_framework.module.builtin.WXStorageModule.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
            public void a(Map<String, Object> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                com.taobao.android.weex.b bVar = callback;
                if (bVar == null) {
                    return;
                }
                bVar.a(map);
            }
        });
    }

    private void setItemPersistent(WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7378cfea", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 3);
        String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
        String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
        final com.taobao.android.weex.b callback = getCallback(weexValueArr, 2);
        if (TextUtils.isEmpty(stringValueOrNull) || stringValueOrNull2 == null) {
            e.a(callback);
        } else {
            this.mStorageAdapter.b(stringValueOrNull, stringValueOrNull2, new b.a() { // from class: com.taobao.android.weex_framework.module.builtin.WXStorageModule.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.module.builtin.storage.b.a
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        return;
                    }
                    com.taobao.android.weex.b bVar = callback;
                    if (bVar == null) {
                        return;
                    }
                    bVar.a(map);
                }
            });
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
        } else {
            this.mStorageAdapter.a();
        }
    }
}
