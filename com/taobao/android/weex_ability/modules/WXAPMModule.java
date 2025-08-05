package com.taobao.android.weex_ability.modules;

import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.util.o;
import com.taobao.tao.powermsg.model.a;
import tb.jtz;
import tb.jvw;
import tb.kge;

/* loaded from: classes6.dex */
public final class WXAPMModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS;
    public static final String NAME = "apm";

    public static /* synthetic */ Object ipc$super(WXAPMModule wXAPMModule, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void access$000(WXAPMModule wXAPMModule, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d7a02d", new Object[]{wXAPMModule, str, str2});
        } else {
            wXAPMModule.onStage(str, str2);
        }
    }

    public static /* synthetic */ void access$100(WXAPMModule wXAPMModule, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f259680c", new Object[]{wXAPMModule, str, str2});
        } else {
            wXAPMModule.addProperty(str, str2);
        }
    }

    public static /* synthetic */ void access$200(WXAPMModule wXAPMModule, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed90eaf", new Object[]{wXAPMModule, str, jSONObject});
        } else {
            wXAPMModule.mark(str, jSONObject);
        }
    }

    static {
        kge.a(-1796390671);
        METHODS = new String[]{"onStage", "addProperty", a.COL_MARK};
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != -1967421034) {
            if (hashCode != -1336895393) {
                if (hashCode == 3344077 && str2.equals(a.COL_MARK)) {
                    c = 2;
                }
            } else if (str2.equals("onStage")) {
                c = 0;
            }
        } else if (str2.equals("addProperty")) {
            c = 1;
        }
        if (c == 0) {
            argCount(weexValueArr, 2);
            final String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
            final String stringValueOrNull2 = getArg(weexValueArr, 1).toStringValueOrNull();
            executeInMain(new o() { // from class: com.taobao.android.weex_ability.modules.WXAPMModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WXAPMModule.access$000(WXAPMModule.this, stringValueOrNull, stringValueOrNull2);
                    }
                }
            });
            return null;
        } else if (c == 1) {
            argCount(weexValueArr, 2);
            final String stringValueOrNull3 = getArg(weexValueArr, 0).toStringValueOrNull();
            final String stringValueOrNull4 = getArg(weexValueArr, 1).toStringValueOrNull();
            executeInMain(new o() { // from class: com.taobao.android.weex_ability.modules.WXAPMModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WXAPMModule.access$100(WXAPMModule.this, stringValueOrNull3, stringValueOrNull4);
                    }
                }
            });
            return null;
        } else if (c != 2) {
            return null;
        } else {
            argCount(weexValueArr, 2);
            final String stringValueOrNull5 = getArg(weexValueArr, 0).toStringValueOrNull();
            final JSONObject jSONObjectOrNull = getArg(weexValueArr, 1).toJSONObjectOrNull();
            executeInMain(new o() { // from class: com.taobao.android.weex_ability.modules.WXAPMModule.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WXAPMModule.access$200(WXAPMModule.this, stringValueOrNull5, jSONObjectOrNull);
                    }
                }
            });
            return null;
        }
    }

    private jvw getApm() {
        jtz jtzVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvw) ipChange.ipc$dispatch("484e68ec", new Object[]{this});
        }
        WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) getWeexInstance();
        if (weexInstanceImpl != null && !weexInstanceImpl.isDestroyed() && (jtzVar = (jtz) weexInstanceImpl.getExtend(jtz.class)) != null) {
            return jtzVar.a();
        }
        return null;
    }

    private void onStage(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cfcf7a", new Object[]{this, str, str2});
            return;
        }
        jvw apm = getApm();
        if (apm == null) {
            return;
        }
        apm.a(str, (long) Double.parseDouble(str2));
        apm.a(getWeexInstance().getInstanceId(), str, generateUptimeFromCurrentTime((long) Double.parseDouble(str2)));
    }

    private void addProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a11efdb1", new Object[]{this, str, str2});
            return;
        }
        jvw apm = getApm();
        if (apm == null) {
            return;
        }
        apm.a(str, str2);
        if (apm.b() == null) {
            return;
        }
        apm.b().a(str, str2);
    }

    private void mark(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17eed12", new Object[]{this, str, jSONObject});
            return;
        }
        jvw apm = getApm();
        if (apm == null) {
            return;
        }
        apm.a(str, jSONObject);
        if (apm.b() == null) {
            return;
        }
        apm.b().a(getWeexInstance().getInstanceId(), str, jSONObject);
    }

    public static long generateUptimeFromCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93a91012", new Object[]{new Long(j)})).longValue();
        }
        if (j <= 0) {
            return 0L;
        }
        return (SystemClock.uptimeMillis() - System.currentTimeMillis()) + j;
    }
}
