package com.taobao.android.searchbaseframe.business.srp;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseTypedBean;
import java.io.Serializable;
import tb.imn;
import tb.ird;
import tb.ire;
import tb.irq;
import tb.ise;
import tb.isi;
import tb.iuk;
import tb.kge;

/* loaded from: classes6.dex */
public class SFSrpConfig implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final imn mCore;

    static {
        kge.a(1606541569);
        kge.a(1028243835);
    }

    public static /* synthetic */ imn access$000(SFSrpConfig sFSrpConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("4c863453", new Object[]{sFSrpConfig}) : sFSrpConfig.mCore;
    }

    public static void install(imn imnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c742e908", new Object[]{imnVar});
        } else {
            new SFSrpConfig(imnVar);
        }
    }

    private SFSrpConfig(imn imnVar) {
        this.mCore = imnVar;
        imnVar.c().b(new c());
        imnVar.c().a(new b());
        imnVar.m().b(new com.taobao.android.searchbaseframe.business.srp.c());
    }

    /* loaded from: classes6.dex */
    public class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2026886435);
        }

        public c() {
        }

        public void a(isi<? extends BaseTypedBean, ? extends BaseSearchResult> isiVar, ise<irq, ? extends iuk> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("736dc50e", new Object[]{this, isiVar, iseVar});
                return;
            }
            SFSrpConfig.access$000(SFSrpConfig.this).g().a(isiVar);
            SFSrpConfig.access$000(SFSrpConfig.this).i().a(isiVar.c(), iseVar);
        }
    }

    /* loaded from: classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1038075118);
        }

        public b() {
        }

        public void a(isi<? extends BaseTypedBean, ? extends BaseSearchResult> isiVar, ise<irq, ? extends iuk> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("736dc50e", new Object[]{this, isiVar, iseVar});
                return;
            }
            SFSrpConfig.access$000(SFSrpConfig.this).g().a(isiVar);
            SFSrpConfig.access$000(SFSrpConfig.this).i().a(isiVar.c(), iseVar);
        }

        public void a(isi<? extends BaseTypedBean, ? extends BaseSearchResult> isiVar, Class cls, ise<irq, ? extends iuk> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7fc6e79", new Object[]{this, isiVar, cls, iseVar});
                return;
            }
            SFSrpConfig.access$000(SFSrpConfig.this).g().a(isiVar);
            SFSrpConfig.access$000(SFSrpConfig.this).i().a(cls, iseVar);
        }

        public void e(ise<Void, ? extends ire> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8515a81", new Object[]{this, iseVar});
            } else {
                ((com.taobao.android.searchbaseframe.business.srp.c) SFSrpConfig.access$000(SFSrpConfig.this).m().b()).b = iseVar;
            }
        }

        public void f(ise<Void, ? extends ird> iseVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96d46102", new Object[]{this, iseVar});
            } else {
                ((com.taobao.android.searchbaseframe.business.srp.c) SFSrpConfig.access$000(SFSrpConfig.this).m().b()).d = iseVar;
            }
        }
    }
}
