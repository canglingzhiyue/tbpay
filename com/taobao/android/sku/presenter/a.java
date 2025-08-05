package com.taobao.android.sku.presenter;

import android.widget.LinearLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1537909861);
        kge.a(-1436347070);
    }

    public abstract void a();

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de48d75e", new Object[]{this, eVar});
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        }
    }

    public abstract void b();

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public LinearLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("5d6221c3", new Object[]{this});
        }
        return null;
    }

    public abstract LinearLayout f();

    public LinearLayout g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("591199c5", new Object[]{this});
        }
        return null;
    }

    public LinearLayout h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("d6e955c6", new Object[]{this});
        }
        return null;
    }
}
