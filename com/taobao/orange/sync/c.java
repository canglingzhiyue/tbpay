package com.taobao.orange.sync;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class c<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_EMPTY = -2;
    public static final int CODE_INVAILD = -5;
    public static final int CODE_MD5 = -3;
    public static final int CODE_PRASE = -4;
    public static final int CODE_UNKNOW = -1;
    public static final int CODE_UTDIDISNULL = -6;
    public String e;
    public int d = -1;
    public int f = 200;

    static {
        kge.a(-865282280);
    }

    public abstract T c();

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : String.valueOf(this.d);
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.f;
    }
}
