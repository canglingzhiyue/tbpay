package com.tanx.exposer;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.tanx.exposer.achieve.AdMonitorCommitResult;
import com.tanx.exposer.achieve.AdMonitorType;
import com.tanx.exposer.achieve.a;
import com.tanx.exposer.achieve.retry.b;
import java.util.List;
import tb.dgi;
import tb.dgj;
import tb.dgn;
import tb.dha;
import tb.kge;

/* loaded from: classes4.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f8162a;
    private dgj b;
    private Context c;
    private volatile boolean d;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static volatile d f8163a;

        static {
            kge.a(833240001);
            f8163a = new d();
        }
    }

    static {
        kge.a(1955143905);
    }

    private d() {
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("ec9bb344", new Object[0]) : a.f8163a;
    }

    public AdMonitorInitResult a(Context context, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdMonitorInitResult) ipChange.ipc$dispatch("c330554", new Object[]{this, context, bVar});
        }
        try {
            if (bVar != null) {
                this.c = context.getApplicationContext();
                this.f8162a = bVar;
                this.b = new dgj();
                dgn.a().a(bVar.f());
                b.C0310b.tanxc_do.a(context, this);
                this.d = true;
                return AdMonitorInitResult.SUCCESS;
            }
            dha.a("adMonitorInitError", "params is null");
            return AdMonitorInitResult.PARAMS_ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            dha.a("adMonitorInitError", e.getMessage());
            return AdMonitorInitResult.INTERNAL_ERROR;
        }
    }

    public void a(dgi dgiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e515bcd2", new Object[]{this, dgiVar});
            return;
        }
        dgj dgjVar = this.b;
        if (dgjVar == null) {
            return;
        }
        dgjVar.a(dgiVar);
    }

    public dgj b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dgj) ipChange.ipc$dispatch("16b54f16", new Object[]{this}) : this.b;
    }

    public Context c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this}) : this.c;
    }

    public b d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("e0a05fa3", new Object[]{this}) : this.f8162a;
    }

    public AdMonitorCommitResult a(List<String> list, c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AdMonitorCommitResult) ipChange.ipc$dispatch("1a70f073", new Object[]{this, list, cVar}) : a.C0309a.f8152a.a(AdMonitorType.EXPOSE, list, cVar);
    }

    public AdMonitorCommitResult b(List<String> list, c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AdMonitorCommitResult) ipChange.ipc$dispatch("7ccc0752", new Object[]{this, list, cVar}) : a.C0309a.f8152a.a(AdMonitorType.CLICK, list, cVar);
    }

    public AdMonitorCommitResult c(List<String> list, c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AdMonitorCommitResult) ipChange.ipc$dispatch("df271e31", new Object[]{this, list, cVar}) : a.C0309a.f8152a.a(AdMonitorType.INTERACT, list, cVar);
    }
}
