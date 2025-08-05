package com.taobao.android.revisionswitch.core;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import org.json.JSONObject;
import tb.ilw;
import tb.ilz;

/* loaded from: classes.dex */
public class b implements ilw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ilz f14883a;
    private final com.taobao.android.revisionswitch.utils.a b;
    private a c;
    private a d;
    private a e;
    private Context f;

    public b(ilz ilzVar, com.taobao.android.revisionswitch.utils.a aVar) {
        this.f14883a = ilzVar;
        this.b = aVar;
    }

    @Override // tb.ilw
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        d();
        a aVar = this.c;
        if (aVar != null) {
            return aVar.b(str);
        }
        return false;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        a aVar = this.c;
        if (aVar != null) {
            return aVar.a();
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (LocationHelper.a(this.f) == 1) {
            TLog.loge("DosaSwitchExtractor", "insert overseasDosaSwitch: " + str);
            this.f14883a.d(str);
        } else {
            TLog.loge("DosaSwitchExtractor", "insert mDosaSwitch: " + str);
            this.f14883a.c(str);
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TLog.loge("DosaSwitchExtractor", "insert mDosaSwitch " + str);
        d();
        try {
            this.c = com.taobao.android.revisionswitch.utils.b.a(new JSONObject(str), this.c);
            if (this.c == null) {
                return;
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.b.a();
        this.f14883a.c(this.c.b());
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.f = context;
        this.d = this.f14883a.a();
        this.e = this.f14883a.b();
        d();
    }

    public a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b7034abe", new Object[]{this});
        }
        d();
        return this.c;
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("707ad85d", new Object[]{this}) : this.d;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (LocationHelper.a(this.f) == 1) {
            this.c = this.e;
        } else {
            this.c = this.d;
        }
        if (this.c != null) {
            return;
        }
        this.c = new a();
    }
}
