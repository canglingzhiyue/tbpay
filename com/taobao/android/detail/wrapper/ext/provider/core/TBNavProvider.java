package com.taobao.android.detail.wrapper.ext.provider.core;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.detail.datasdk.protocol.adapter.core.INavAdapter;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class TBNavProvider implements INavAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AliNavServiceInterface mAliNavServiceInterface;

    static {
        kge.a(83738815);
        kge.a(1053356114);
    }

    public TBNavProvider(AliNavServiceInterface aliNavServiceInterface) {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBNavProvider");
        if (aliNavServiceInterface == null) {
            throw new IllegalArgumentException("TBNavProvider: AliNavServiceInterface is null");
        }
        this.mAliNavServiceInterface = aliNavServiceInterface;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.INavAdapter
    public void navigateTo(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7d8b15", new Object[]{this, context, str, bundle});
        } else if (context == null || StringUtils.isEmpty(str)) {
        } else {
            if (bundle == null) {
                this.mAliNavServiceInterface.a(context).a(str);
            } else {
                this.mAliNavServiceInterface.a(context).a(bundle).a(str);
            }
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.INavAdapter
    public void navigateTo(Context context, String str, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3344a8e", new Object[]{this, context, str, bundle, new Integer(i)});
        } else if (context == null || StringUtils.isEmpty(str)) {
        } else {
            if (bundle == null) {
                this.mAliNavServiceInterface.a(context).a(i).a(str);
            } else {
                this.mAliNavServiceInterface.a(context).a(i).a(bundle).a(str);
            }
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.INavAdapter
    public void navigateTo(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0ad3112", new Object[]{this, context, uri});
        } else if (context == null || uri == null) {
        } else {
            this.mAliNavServiceInterface.a(context).a(uri);
        }
    }
}
