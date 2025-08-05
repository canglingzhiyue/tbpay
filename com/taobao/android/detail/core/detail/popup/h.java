package com.taobao.android.detail.core.detail.popup;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, f> f9647a;

    static {
        kge.a(-1129013725);
    }

    public h() {
        emu.a("com.taobao.android.detail.core.detail.popup.PopupWindowHandlerManager");
    }

    public void a(String str, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c334e85", new Object[]{this, str, fVar});
        } else if (TextUtils.isEmpty(str) || fVar == null) {
        } else {
            if (this.f9647a == null) {
                this.f9647a = new HashMap<>();
            }
            this.f9647a.put(str, fVar);
        }
    }

    public f a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("8f2f8d9", new Object[]{this, str});
        }
        HashMap<String, f> hashMap = this.f9647a;
        if (hashMap != null) {
            return hashMap.get(str);
        }
        return null;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        HashMap<String, f> hashMap = this.f9647a;
        if (hashMap == null) {
            return;
        }
        hashMap.clear();
        this.f9647a = null;
    }
}
