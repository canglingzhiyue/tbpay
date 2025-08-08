package com.taobao.android.weex_ability.windvane;

import android.content.Intent;
import android.taobao.windvane.jsbridge.h;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.p;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.f;
import com.taobao.android.weex.i;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.o;
import tb.aem;
import tb.jvb;
import tb.kge;

/* loaded from: classes6.dex */
public final class WXWindVaneModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String[] METHODS;
    public static final String NAME = "windvane";
    private p mEntryManager;
    private final a mEventListener = new a();
    private b mIWVWebView;

    public static /* synthetic */ Object ipc$super(WXWindVaneModule wXWindVaneModule, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -498459201) {
            super.onMainThreadDestroy();
            return null;
        } else if (hashCode != 1738137715) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onInit((String) objArr[0], (i) objArr[1]);
            return null;
        }
    }

    public static /* synthetic */ void access$000(WXWindVaneModule wXWindVaneModule, String str, com.taobao.android.weex.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0d9552", new Object[]{wXWindVaneModule, str, bVar});
        } else {
            wXWindVaneModule.call(str, bVar);
        }
    }

    public static /* synthetic */ p access$100(WXWindVaneModule wXWindVaneModule) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (p) ipChange.ipc$dispatch("9ca6e191", new Object[]{wXWindVaneModule}) : wXWindVaneModule.mEntryManager;
    }

    static {
        kge.a(800013068);
        METHODS = new String[]{"call", "call2"};
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        char c = 65535;
        int hashCode = str2.hashCode();
        if (hashCode != 3045982) {
            if (hashCode == 94425492 && str2.equals("call2")) {
                c = 1;
            }
        } else if (str2.equals("call")) {
            c = 0;
        }
        if (c == 0) {
            argCount(weexValueArr, 2);
            final String stringValueOrNull = getArg(weexValueArr, 0).toStringValueOrNull();
            final com.taobao.android.weex.b callback = getCallback(weexValueArr, 1);
            executeInMain(new o() { // from class: com.taobao.android.weex_ability.windvane.WXWindVaneModule.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WXWindVaneModule.access$000(WXWindVaneModule.this, stringValueOrNull, callback);
                    }
                }
            });
            return null;
        } else if (c != 1) {
            return null;
        } else {
            argCount(weexValueArr, 4);
            final String stringValueOrNull2 = getArg(weexValueArr, 0).toStringValueOrNull();
            final String stringValueOrNull3 = getArg(weexValueArr, 1).toStringValueOrNull();
            final com.taobao.android.weex.b callback2 = getCallback(weexValueArr, 2);
            final com.taobao.android.weex.b callback3 = getCallback(weexValueArr, 3);
            executeInMain(new o() { // from class: com.taobao.android.weex_ability.windvane.WXWindVaneModule.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WXWindVaneModule.this.call2(stringValueOrNull2, stringValueOrNull3, callback2, callback3);
                    }
                }
            });
            return null;
        }
    }

    public WXWindVaneModule() {
        aem.a().a(this.mEventListener);
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onInit(String str, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6799e073", new Object[]{this, str, iVar});
            return;
        }
        super.onInit(str, iVar);
        iVar.a(new f() { // from class: com.taobao.android.weex_ability.windvane.WXWindVaneModule.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex.f
            public void a(int i, int i2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
                } else if (WXWindVaneModule.access$100(WXWindVaneModule.this) == null) {
                } else {
                    WXWindVaneModule.access$100(WXWindVaneModule.this).a(i, i2, intent);
                }
            }
        });
    }

    private void call(String str, com.taobao.android.weex.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("857faaeb", new Object[]{this, str, bVar});
            return;
        }
        jvb adapterMUSInstance = ((WeexInstanceImpl) getWeexInstance()).getAdapterMUSInstance();
        if (adapterMUSInstance == null || adapterMUSInstance.getUIContext() == null || StringUtils.isEmpty(str)) {
            return;
        }
        if (this.mEntryManager == null) {
            this.mIWVWebView = new b(adapterMUSInstance);
            this.mEntryManager = new p(adapterMUSInstance.getUIContext(), this.mIWVWebView);
        }
        a aVar = this.mEventListener;
        if (aVar != null) {
            aVar.a(adapterMUSInstance);
        }
        h hVar = new h();
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject != null) {
            hVar.f1664a = this.mIWVWebView;
            hVar.d = parseObject.getString("class");
            hVar.e = parseObject.getString("method");
            hVar.f = parseObject.getString("data");
        }
        l.b().a(this.mEntryManager, hVar, new c(bVar, false, null), new c(bVar, false, null));
    }

    @MUSMethod
    public void call2(String str, String str2, com.taobao.android.weex.b bVar, com.taobao.android.weex.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e9122f", new Object[]{this, str, str2, bVar, bVar2});
            return;
        }
        jvb adapterMUSInstance = ((WeexInstanceImpl) getWeexInstance()).getAdapterMUSInstance();
        if (adapterMUSInstance == null || adapterMUSInstance.getUIContext() == null || StringUtils.isEmpty(str2)) {
            return;
        }
        if (this.mEntryManager == null) {
            this.mIWVWebView = new b(adapterMUSInstance);
            this.mEntryManager = new p(adapterMUSInstance.getUIContext(), this.mIWVWebView);
        }
        a aVar = this.mEventListener;
        if (aVar != null) {
            aVar.a(adapterMUSInstance);
        }
        h hVar = new h();
        try {
            JSON.parseObject(str2);
            if (StringUtils.isEmpty(str)) {
                if (bVar2 != null) {
                    bVar2.a(new Object[0]);
                }
                if (bVar == null) {
                    return;
                }
                bVar.a();
            } else if (str.indexOf(".") == -1) {
                if (bVar2 != null) {
                    bVar2.a(new Object[0]);
                }
                if (bVar == null) {
                    return;
                }
                bVar.a();
            } else {
                hVar.f1664a = this.mIWVWebView;
                hVar.d = str.substring(0, str.indexOf("."));
                hVar.e = str.substring(str.indexOf(".") + 1);
                hVar.f = str2;
                l.b().a(this.mEntryManager, hVar, new c(bVar2, true, bVar), new c(bVar, true, bVar2));
            }
        } catch (Throwable th) {
            g.a("Invalid param", th);
            if (bVar2 != null) {
                bVar2.a(new Object[0]);
            }
            if (bVar == null) {
                return;
            }
            bVar.a();
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule, com.taobao.android.weex.WeexModule
    public void onMainThreadDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24a1dbf", new Object[]{this});
            return;
        }
        super.onMainThreadDestroy();
        a aVar = this.mEventListener;
        if (aVar != null) {
            aVar.a();
            aem.a().b(this.mEventListener);
        }
        b bVar = this.mIWVWebView;
        if (bVar != null) {
            bVar.a();
        }
        p pVar = this.mEntryManager;
        if (pVar == null) {
            return;
        }
        pVar.a();
    }
}
