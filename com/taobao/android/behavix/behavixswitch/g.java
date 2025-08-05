package com.taobao.android.behavix.behavixswitch;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class g implements f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f9176a;
    private boolean b;
    private String c;

    static {
        kge.a(139553108);
        kge.a(1781812320);
    }

    public g(String str) {
        this.c = str;
        if (TextUtils.isEmpty(this.c)) {
            this.f9176a = false;
            this.b = false;
            return;
        }
        if (this.c.startsWith(riy.MOD)) {
            this.c = this.c.substring(1);
            this.f9176a = true;
        }
        if (!this.c.endsWith(riy.MOD)) {
            return;
        }
        String str2 = this.c;
        this.c = str2.substring(0, str2.length() - 1);
        this.b = true;
    }

    @Override // com.taobao.android.behavix.behavixswitch.f
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        String str2 = this.c;
        if (str2 == null || str == null) {
            return false;
        }
        if (this.f9176a && this.b) {
            return str.contains(str2);
        }
        if (this.f9176a) {
            return str.endsWith(this.c);
        }
        return this.b ? str.startsWith(this.c) : str.equals(this.c);
    }
}
