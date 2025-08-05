package com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.dinamic;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.e;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.f;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.flexible.a;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.g;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.h;
import com.taobao.android.livehome.plugin.atype.flexalocal.dinamicx.j;
import com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2;
import java.io.Serializable;
import tb.iep;
import tb.kge;

/* loaded from: classes6.dex */
public class DinamicRegister implements DinamicSdkManager2.IDinamicRegister, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-657287014);
        kge.a(202336465);
        kge.a(1028243835);
    }

    @Override // com.taobao.android.livehome.plugin.atype.flexalocal.dxengine.DinamicSdkManager2.IDinamicRegister
    public void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
        } else if (dinamicXEngine == null) {
        } else {
            dinamicXEngine.a(iep.DX_EVENT_LOPENCHANNEL, new iep());
            dinamicXEngine.a(f.DX_EVENT_TBLCARDDATAEXPO, new f());
            dinamicXEngine.a(h.DX_EVENT_TBLVNATIVECALLCHAIN, new h());
            dinamicXEngine.a(a.DXTAOLIVEJELLYMARQUEE_TAOLIVEJELLYMARQUEE, new a.C0544a());
            dinamicXEngine.a(g.TBLMTOP, new g.a());
            dinamicXEngine.a(e.DX_PARSER_TBLGETEXPOSE, new e());
            dinamicXEngine.a(j.TBLSTABLETRACKER, new j.a());
            dinamicXEngine.a("TBLStableTracker", new j.a());
        }
    }
}
