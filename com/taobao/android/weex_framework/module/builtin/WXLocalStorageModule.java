package com.taobao.android.weex_framework.module.builtin;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.WeexValueImpl;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.util.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class WXLocalStorageModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS;
    public static final String NAME = "localStorage";

    public static /* synthetic */ Object ipc$super(WXLocalStorageModule wXLocalStorageModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(671733712);
        METHODS = new String[]{"setItem", "removeItem", "getItem"};
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -75439223) {
            if (hashCode != 1098253751) {
                if (hashCode == 1984670357 && str2.equals("setItem")) {
                    c = 0;
                }
            } else if (str2.equals("removeItem")) {
                c = 1;
            }
        } else if (str2.equals("getItem")) {
            c = 2;
        }
        if (c == 0) {
            setItem(weexValueArr);
            return null;
        } else if (c == 1) {
            removeItem(weexValueArr);
            return null;
        } else if (c == 2) {
            return getItem(weexValueArr);
        } else {
            return null;
        }
    }

    private void setItem(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9bde73", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 2);
        l.a().c().a(q.a(getWeexInstance(), getArg(weexValueArr, 0).toStringValueOrNull()), getArg(weexValueArr, 1).toStringValueOrNull(), null);
    }

    private void removeItem(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c254ef95", new Object[]{this, weexValueArr});
            return;
        }
        argCount(weexValueArr, 1);
        String a2 = q.a(getWeexInstance(), getArg(weexValueArr, 0).toStringValueOrNull());
        if (a2 == null) {
            return;
        }
        l.a().c().c(a2, null);
    }

    private WeexValue getItem(WeexValue[] weexValueArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("2b97ac23", new Object[]{this, weexValueArr});
        }
        argCount(weexValueArr, 1);
        String a2 = q.a(getWeexInstance(), getArg(weexValueArr, 0).toStringValueOrNull());
        if (a2 != null) {
            return WeexValueImpl.ofString(l.a().c().a(a2));
        }
        return null;
    }
}
