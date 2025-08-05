package com.alibaba.android.aura.datamodel.render;

import android.view.View;
import com.alibaba.android.umf.datamodel.UMFBaseIO;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class AURARenderOutput extends UMFBaseIO {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(serialize = false)
    private View mView;

    static {
        kge.a(-803029096);
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this.mView;
    }

    public void setView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
        } else {
            this.mView = view;
        }
    }
}
