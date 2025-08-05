package com.taobao.taopai.material.request.musiclist;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends com.taobao.taopai.material.request.base.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int d;
    private int e;
    private int f;
    private String g;
    private String h;

    static {
        kge.a(-1332955237);
    }

    public b(String str, int i, int i2) {
        this.e = 20;
        this.b = str;
        this.d = i;
        this.f = i2;
    }

    public b(int i, int i2) {
        this.e = 20;
        this.d = i;
        this.f = i2;
    }

    public b(int i, int i2, int i3, String str) {
        this.e = 20;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
    }

    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : this.e;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.f;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.d;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("KEYWORD", this.g);
        return JSON.toJSONString(hashMap);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{category=" + this.d + ", pageSize=" + this.e + ", pageNo=" + this.f + ", searchKey='" + this.g + "', mergeCategories='" + this.h + "', bizLine='" + this.f22073a + "', bizScene='" + this.b + "', clientVer=" + this.c + '}';
    }
}
