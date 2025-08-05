package com.taobao.split.diff;

import com.alibaba.android.split.PatchSplitFileInfo;
import com.alibaba.android.split.j;
import com.alibaba.android.split.k;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.bgu;
import tb.kge;
import tb.xin;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private j f19712a;
    private com.taobao.split.diff.a b;
    private bgu c;
    private h d;
    private xin e;

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final d f19713a;

        static {
            kge.a(1285174944);
            f19713a = new d();
        }

        public static /* synthetic */ d a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b1835fb7", new Object[0]) : f19713a;
        }
    }

    static {
        kge.a(508698192);
    }

    private d() {
        this.b = null;
        this.f19712a = (j) com.alibaba.android.split.a.a((Class<? extends Object>) j.class, new Object[0]);
        this.c = (bgu) com.alibaba.android.split.a.b(bgu.class, "DynamicFeatureDiffPolicy");
        this.e = (xin) com.alibaba.android.split.a.a((Class<? extends Object>) xin.class, new Object[0]);
        this.d = g.a();
        try {
            this.b = new b(k.a().b().t());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b1835fb7", new Object[0]) : a.a();
    }

    public boolean a(PatchSplitFileInfo patchSplitFileInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a67bb89", new Object[]{this, patchSplitFileInfo})).booleanValue();
        }
        File a2 = this.b.a(patchSplitFileInfo.splitName, patchSplitFileInfo.baseAppVersion);
        if (a2 == null || !a2.exists()) {
            str = "";
        } else {
            str = this.e.a(a2.getAbsolutePath());
            if (str.equals(patchSplitFileInfo.baseMd5)) {
                return true;
            }
        }
        if (a2 != null && a2.exists()) {
            try {
                this.c.d(String.format("baseFile %s exist with md5:%s mismatch with: %s", a2.getAbsolutePath(), str, patchSplitFileInfo.baseMd5), new Object[0]);
                this.f19712a.a(patchSplitFileInfo.splitName, true, "patch_downgrade", 0L, 0, "", k.a().b().a());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public File b(PatchSplitFileInfo patchSplitFileInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("d0fead87", new Object[]{this, patchSplitFileInfo});
        }
        File a2 = this.b.a(patchSplitFileInfo.splitName, patchSplitFileInfo.baseAppVersion);
        if (a2 != null && a2.exists() && this.e.a(a2.getAbsolutePath()).equals(patchSplitFileInfo.baseMd5)) {
            return a2;
        }
        return null;
    }

    public boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{this, str, str2})).booleanValue() : c.a().a(str, str2) != null && !this.d.a(str, str2);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.d.a(str);
        }
    }
}
