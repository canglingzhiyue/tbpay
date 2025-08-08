package com.alibaba.security.realidentity;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.login4android.qrcode.result.Result;
import tb.ihq;
import tb.ihy;
import tb.ihz;

/* loaded from: classes3.dex */
public class w2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f3592a = "w2";

    /* loaded from: classes3.dex */
    public class a implements ihy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o2 f3593a;

        public a(o2 o2Var) {
            this.f3593a = o2Var;
        }

        @Override // tb.ihy
        public void onLoadFinished(ihz ihzVar) {
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6344c753", new Object[]{this, ihzVar});
            } else if (ihzVar == null) {
                this.f3593a.remoteAssetsResult(false, e2.B0, "Null callback or result found");
            } else {
                if (ihzVar.g()) {
                    try {
                        w2.this.c();
                    } catch (Throwable unused) {
                        this.f3593a.remoteAssetsResult(false, e2.B0, "so load error");
                        return;
                    }
                }
                RSoException f = ihzVar.f();
                o2 o2Var = this.f3593a;
                boolean g = ihzVar.g();
                if (f != null) {
                    i = f.getErrorCode();
                }
                o2Var.remoteAssetsResult(g, i, f == null ? Result.MSG_SUCCESS : f.getErrorMsg());
            }
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        try {
            Class.forName("tb.ihq");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (b()) {
            return !StringUtils.isEmpty(ihq.b().a("ALBiometricsJni").b());
        }
        return false;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : ihq.a().b("ALBiometricsJni").g();
    }

    public void a(o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a315014f", new Object[]{this, o2Var});
        } else if (!b() || o2Var == null) {
        } else {
            ihq.a().a("ALBiometricsJni", new a(o2Var));
        }
    }
}
