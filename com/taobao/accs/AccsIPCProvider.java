package com.taobao.accs;

import android.content.Context;
import anet.channel.GlobalAppRuntimeInfo;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import tb.kge;

/* loaded from: classes.dex */
public class AccsIPCProvider extends ARangerProvider {
    static {
        kge.a(-1702939311);
    }

    @Override // com.taobao.aranger.core.ipc.provider.ARangerProvider, android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            GlobalClientInfo.mContext = context;
        }
        UtilityImpl.debug(GlobalClientInfo.mContext);
        if (l.b()) {
            GlobalAppRuntimeInfo.setBackground(false);
        }
        return super.onCreate();
    }
}
