package com.taobao.android.editionswitcher.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ghj;
import tb.gho;
import tb.kge;

/* loaded from: classes.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EDITION_CODE_CHANGED = "editionCodeChanged";
    public static final String LOCATION_CHANGED = "locationChanged";
    public static final String TRIGGER_REQUEST = "triggerRequest";

    /* renamed from: a  reason: collision with root package name */
    private d f12287a;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static b f12288a;

        static {
            kge.a(1931964305);
            f12288a = new b();
        }

        public static /* synthetic */ b a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6dd2d3c4", new Object[0]) : f12288a;
        }
    }

    static {
        kge.a(-198758873);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc0e1dc2", new Object[]{this, dVar});
        } else {
            this.f12287a = dVar;
        }
    }

    public static b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("6dd2d3c4", new Object[0]) : a.a();
    }

    public void a(ghj ghjVar, gho ghoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c26791", new Object[]{this, ghjVar, ghoVar});
            return;
        }
        d dVar = this.f12287a;
        if (dVar == null) {
            return;
        }
        dVar.a(ghjVar, ghoVar);
    }
}
