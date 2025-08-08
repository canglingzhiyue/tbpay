package com.taobao.android.tbuprofen;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.common.b;
import tb.kge;

/* loaded from: classes6.dex */
public class TBPEngineNative {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1083556994);
    }

    public native int getVersionNative();

    public native int loadPluginNative(String str, String str2);

    public native int monitorEventNative(int i, boolean z);

    public native int nativeDestroy();

    public native int nativeInit(int i, int i2);

    public native int unLoadPluginNative(String str);

    public boolean a(b bVar) {
        int nativeInit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d0f03e6", new Object[]{this, bVar})).booleanValue();
        }
        try {
            String a2 = h.b().a(com.taobao.android.tbuprofen.common.c.ENGINE_LIB_NAME);
            if (!StringUtils.isEmpty(a2)) {
                bVar.e.a(f.ERR_LOAD_ENGINE_EXCEPTION, a2);
                com.taobao.android.tbuprofen.log.c.a("TBPEngineNative", "Failed to load tbp-engine. %s", a2);
                return false;
            }
            try {
                nativeInit = nativeInit(bVar.f, bVar.d.ordinal());
            } catch (Exception e) {
                bVar.e.a(f.ERR_INIT_ENGINE_EXCEPTION, com.taobao.android.tbuprofen.common.d.a(e));
                com.taobao.android.tbuprofen.log.c.a("TBPEngineNative", e, "Failed to init engine", new Object[0]);
            }
            if (!com.taobao.android.tbuprofen.common.d.a(nativeInit)) {
                bVar.e.a(f.ERR_INIT_ENGINE, String.valueOf(nativeInit));
                return false;
            }
            int versionNative = getVersionNative();
            String b = com.taobao.android.tbuprofen.common.d.b(versionNative);
            if (versionNative != 805372417 && versionNative != 1879114240) {
                com.taobao.android.tbuprofen.log.c.a("TBPEngineNative", "The tbp ver is invalid: %s", b);
                bVar.e.a(f.ERR_ENGINE_VER, b);
                return false;
            }
            com.taobao.android.tbuprofen.log.c.c("TBPEngineNative", "Init tbp engine successfully with ver: %s", b);
            return true;
        } catch (Exception e2) {
            bVar.e.a(f.ERR_LOAD_ENGINE_EXCEPTION, com.taobao.android.tbuprofen.common.d.a(e2));
            com.taobao.android.tbuprofen.log.c.a("TBPEngineNative", e2, "Failed to load tbp-engine", new Object[0]);
            return false;
        }
    }
}
