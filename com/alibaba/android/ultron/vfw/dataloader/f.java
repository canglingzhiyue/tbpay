package com.alibaba.android.ultron.vfw.dataloader;

import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class f implements b, i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(565510785);
        kge.a(-952869358);
        kge.a(515691582);
    }

    public j a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("bead3816", new Object[]{this, jVar}) : jVar;
    }

    @Override // com.alibaba.android.ultron.vfw.dataloader.b
    public void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5eca7a1", new Object[]{this, hVar});
        }
    }

    @Override // com.alibaba.android.ultron.vfw.dataloader.b
    public void a(h hVar, UltronError ultronError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b531dfc4", new Object[]{this, hVar, ultronError});
        }
    }

    public boolean b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7964dc4", new Object[]{this, hVar})).booleanValue();
        }
        return true;
    }
}
