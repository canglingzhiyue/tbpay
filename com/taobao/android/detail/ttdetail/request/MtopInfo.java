package com.taobao.android.detail.ttdetail.request;

import android.taobao.windvane.connect.e;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;

/* loaded from: classes5.dex */
public class MtopInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile int f10780a = 0;
    private volatile MtopResponse b;
    private List<byte[]> c;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface DataStatusValue {
    }

    static {
        kge.a(-320126903);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f10780a;
    }

    public MtopResponse b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtopResponse) ipChange.ipc$dispatch("23e6c092", new Object[]{this}) : this.b;
    }

    public MtopInfo a(List<byte[]> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("6a8c38e1", new Object[]{this, list});
        }
        this.c = list;
        return this;
    }

    public MtopInfo a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("ec496623", new Object[]{this, new Integer(i)});
        }
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            i = 0;
        }
        this.f10780a = i;
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        int i = this.f10780a;
        return i != 1 ? i != 2 ? i != 3 ? e.DEFAULT_HTTPS_ERROR_INVALID : "ERROR" : "SUCCESS" : "STREAMING";
    }

    public MtopInfo a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopInfo) ipChange.ipc$dispatch("4e13dbb5", new Object[]{this, mtopResponse});
        }
        this.b = mtopResponse;
        return this;
    }
}
