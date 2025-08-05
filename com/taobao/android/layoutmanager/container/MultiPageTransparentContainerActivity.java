package com.taobao.android.layoutmanager.container;

import android.content.Context;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.o;
import tb.kge;

@PopLayer.PopupAllowedFromFragment
/* loaded from: classes5.dex */
public class MultiPageTransparentContainerActivity extends MultiPageContainerActivity implements o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(283367705);
        kge.a(-620996305);
    }

    public static /* synthetic */ Object ipc$super(MultiPageTransparentContainerActivity multiPageTransparentContainerActivity, String str, Object... objArr) {
        if (str.hashCode() == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.layoutmanager.container.MultiPageContainerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }
}
