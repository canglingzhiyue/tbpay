package com.taobao.split.diff;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.bgy;
import tb.kge;

/* loaded from: classes8.dex */
public class b implements a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f19709a;

    static {
        kge.a(626620628);
        kge.a(125242516);
    }

    public b(Context context) {
        this.f19709a = context;
    }

    @Override // com.taobao.split.diff.a
    public File a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("cac70111", new Object[]{this, str, str2});
        }
        try {
            return new bgy(this.f19709a, true, str2).c(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
