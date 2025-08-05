package com.alibaba.android.ultron.vfw.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import tb.bny;
import tb.kge;

/* loaded from: classes2.dex */
public class c extends b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e CREATOR;

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        }
    }

    public c(bny bnyVar) {
        super(bnyVar);
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup}) : LayoutInflater.from(this.f2738a.k()).inflate(R.layout.bundle_line_layout, viewGroup, false);
    }

    static {
        kge.a(2121632611);
        CREATOR = new e() { // from class: com.alibaba.android.ultron.vfw.viewholder.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public b a(bny bnyVar) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new c(bnyVar);
            }
        };
    }
}
