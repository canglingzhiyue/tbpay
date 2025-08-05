package com.alibaba.security.realidentity;

import android.content.Context;
import android.util.Pair;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class t1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f3523a;
    public final b4 b;
    public volatile boolean c = false;

    public t1(Context context, b4 b4Var) {
        this.f3523a = context;
        this.b = b4Var;
    }

    public boolean a(RPBizConfig rPBizConfig, boolean z, r1 r1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8061517", new Object[]{this, rPBizConfig, new Boolean(z), r1Var})).booleanValue();
        }
        a(rPBizConfig, false);
        return a(r1Var, rPBizConfig.getBasicsConfig().verifyToken, z);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.c;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : m2.a().a(this.f3523a);
    }

    private boolean a(r1 r1Var, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af465bfb", new Object[]{this, r1Var, str, new Boolean(z)})).booleanValue();
        }
        if (z && !i2.b()) {
            r1Var.onFinish(RPResult.AUDIT_FAIL, String.valueOf((int) e2.y), "CTID SDK NOT EXIST");
            return false;
        }
        Pair<Boolean, String> a2 = a();
        if (!((Boolean) a2.first).booleanValue()) {
            r1Var.b(RPResult.AUDIT_NOT, String.valueOf((int) e2.q), (String) a2.second, str);
            return false;
        }
        Pair<Boolean, String> a3 = a(str);
        if (!((Boolean) a3.first).booleanValue()) {
            r1Var.b(RPResult.AUDIT_NOT, String.valueOf((int) e2.q), (String) a3.second, str);
            return false;
        } else if (b()) {
            r1Var.a(RPResult.AUDIT_NOT, String.valueOf((int) e2.r), "重复认证，上一次认证还未结束", str);
            return false;
        } else {
            a(true);
            return true;
        }
    }

    private Pair<Boolean, String> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Pair) ipChange.ipc$dispatch("dd4f14b2", new Object[]{this}) : this.b.d();
    }

    public Pair<Boolean, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c2e055fc", new Object[]{this, str});
        }
        RPTrack.a((LastExitTrackMsg) null);
        return this.b.a(str);
    }

    private void a(RPBizConfig rPBizConfig, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87fbe608", new Object[]{this, rPBizConfig, new Boolean(z)});
        } else {
            g1.f().b(rPBizConfig.getBasicsConfig().verifyToken, TrackLog.createStartBeginLog(rPBizConfig.getBasicsConfig().verifyStartType, rPBizConfig.getRpConfig().getFromSource(), z));
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean a(RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56f79650", new Object[]{this, rPBizConfig})).booleanValue() : m2.a().a(this.f3523a, rPBizConfig);
    }

    public void a(RPBizConfig rPBizConfig, o2 o2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d5a033", new Object[]{this, rPBizConfig, o2Var});
        } else {
            m2.a().a(this.f3523a, rPBizConfig, o2Var);
        }
    }
}
