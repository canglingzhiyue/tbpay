package com.taobao.taolive.sdk.ui.media;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f21957a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        kge.a(-2024014392);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : !StringUtils.isEmpty(this.f21957a) && !StringUtils.isEmpty(this.b);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (a()) {
            return true;
        }
        return !StringUtils.isEmpty(this.c) && !StringUtils.isEmpty(this.d);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s sVar = (s) obj;
            if (a()) {
                String str3 = this.b;
                if (str3 != null && (str2 = sVar.b) != null && str3.equals(str2)) {
                    return true;
                }
            } else {
                String str4 = this.d;
                if (str4 != null && (str = sVar.d) != null && str4.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
