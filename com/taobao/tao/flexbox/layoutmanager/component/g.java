package com.taobao.tao.flexbox.layoutmanager.component;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.ah;
import tb.kge;
import tb.ogl;

/* loaded from: classes8.dex */
public class g extends Component<View, ogl> implements ah {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2130042517);
        kge.a(-64703456);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return null;
    }
}
