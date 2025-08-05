package com.alibaba.wukong.plugin.remote;

import com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService;
import com.alibaba.security.client.smart.core.core.remote.OnRemoteSoLoadListener;
import com.taobao.android.remoteso.api.RSoException;
import tb.ihq;
import tb.ihy;
import tb.ihz;

/* loaded from: classes3.dex */
public class TaobaoRemoteSoPluginManager implements ITaobaoRemoteSoService {
    private boolean isRemoteSoLibraryCompiled() {
        try {
            Class.forName("tb.ihq");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService
    public boolean isRemoteSoLoaded(String str) {
        if (!isRemoteSoLibraryCompiled()) {
            return false;
        }
        return ihq.a().b(str).g();
    }

    @Override // com.alibaba.security.client.smart.core.core.remote.ITaobaoRemoteSoService
    public void loadRemoteSo(final String str, final OnRemoteSoLoadListener onRemoteSoLoadListener) {
        if (!isRemoteSoLibraryCompiled()) {
            onRemoteSoLoadListener.onResult(str, false, "remote so module not compiled");
        } else {
            ihq.a().a(str, new ihy() { // from class: com.alibaba.wukong.plugin.remote.TaobaoRemoteSoPluginManager.1
                @Override // tb.ihy
                public void onLoadFinished(ihz ihzVar) {
                    if (ihzVar == null) {
                        onRemoteSoLoadListener.onResult(str, false, "loadResult is null");
                    } else if (ihzVar.g()) {
                        onRemoteSoLoadListener.onResult(str, true, "success");
                    } else {
                        RSoException f = ihzVar.f();
                        onRemoteSoLoadListener.onResult(str, false, f == null ? "so exp is null" : f.getErrorMsg());
                    }
                }
            });
        }
    }
}
