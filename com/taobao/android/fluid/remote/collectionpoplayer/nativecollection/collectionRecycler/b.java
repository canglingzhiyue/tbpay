package com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.collectionRecycler;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f12696a;
    private final String b;
    private final String c;
    private int d;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    public String i;
    public int j;
    public int k;

    static {
        kge.a(-999728232);
    }

    public b(String str, String str2, String str3, String str4, int i, String str5, boolean z, boolean z2) {
        this.d = -1;
        this.e = "1000";
        this.f12696a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.d = i;
        this.e = str5;
        this.g = z;
        this.h = z2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f12696a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.b;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.c;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.g;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue() : this.h;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CollectionCell{title='" + this.f12696a + "', subtitle='" + this.b + "', imageUrl='" + this.c + "', collectionIndex=" + this.d + ", likeNums='" + this.e + "', nid='" + this.f + "', isFree=" + this.g + ", isLocked=" + this.h + ", tagUrl='" + this.i + "', tagWidth=" + this.j + ", tagheight=" + this.k + '}';
    }
}
