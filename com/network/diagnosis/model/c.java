package com.network.diagnosis.model;

import android.content.Context;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.d;
import com.taobao.android.x;
import tb.fmx;
import tb.nog;
import tb.rfx;

/* loaded from: classes.dex */
public class c implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f8045a = 0;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final c f8046a = new c();

        public static /* synthetic */ c a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("4e7a74e9", new Object[0]) : f8046a;
        }
    }

    public static c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("b55334aa", new Object[0]) : a.a();
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        try {
            this.f8045a = context.getSharedPreferences(rfx.INNER_USER_CONFIG, 0).getInt("user_type", 0);
            ALog.e("npm.UserTypeDetector", "[setUserType]", null, nog.PRD_USER_TYPE, Integer.valueOf(this.f8045a));
        } catch (Exception e) {
            this.f8045a = 0;
            ALog.e("npm.UserTypeDetector", "[setUserType]failed.", null, e, new Object[0]);
        }
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.f8045a;
    }

    @Override // com.network.diagnosis.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int i = this.f8045a;
        if (i != 2 && i != 1) {
            return;
        }
        try {
            fmx fmxVar = new fmx();
            fmxVar.a(nog.PRD_USER_TYPE, Integer.valueOf(this.f8045a));
            x.a().a("intranet_network_exception", fmxVar);
            ALog.e("npm.UserTypeDetector", "[reportUserLog]success", null, nog.PRD_USER_TYPE, Integer.valueOf(this.f8045a));
        } catch (Throwable unused) {
            ALog.e("npm.UserTypeDetector", "[reportUserLog]failed", null, new Object[0]);
        }
    }
}
