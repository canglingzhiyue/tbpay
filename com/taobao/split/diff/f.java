package com.taobao.split.diff;

import mtopsdk.common.util.StringUtils;
import com.alibaba.android.split.PatchSplitFileInfo;
import com.alibaba.android.split.SplitFileInfo;
import com.alibaba.android.split.k;
import com.alibaba.android.split.n;
import com.alibaba.android.split.v;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bgu;
import tb.kge;

/* loaded from: classes8.dex */
public class f extends n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private bgu f19714a = (bgu) com.alibaba.android.split.a.b(bgu.class, "PatchSplitFileInfoProvider");

    static {
        kge.a(1791112719);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == -460356523) {
            return super.a((String) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.split.n, com.alibaba.android.split.s
    public SplitFileInfo a(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplitFileInfo) ipChange.ipc$dispatch("e48f8455", new Object[]{this, str});
        }
        PatchSplitFileInfo patchSplitFileInfo = null;
        try {
            str2 = k.a().b().j().a();
        } catch (Exception e) {
            e.printStackTrace();
            str2 = null;
        }
        this.f19714a.d(str + " diff patch baseVersion:" + str2, new Object[0]);
        if (StringUtils.isEmpty(str2)) {
            return super.a(str);
        }
        if (d.a().a(str, str2) && b(str)) {
            this.f19714a.d(str + " has diff patch:", new Object[0]);
            DynamicFeatureDiffInfo a2 = c.a().a(str, str2);
            if (a2 != null) {
                patchSplitFileInfo = new PatchSplitFileInfo();
                patchSplitFileInfo.isPatch = true;
                patchSplitFileInfo.sameFile = a2.sameFile;
                patchSplitFileInfo.baseAppVersion = a2.baseAppVersion;
                patchSplitFileInfo.newMd5 = a2.newMd5;
                patchSplitFileInfo.baseMd5 = a2.baseMd5;
                patchSplitFileInfo.url = a2.url;
                patchSplitFileInfo.appVersion = a2.appVersion;
                patchSplitFileInfo.version = a2.version;
                patchSplitFileInfo.md5 = a2.md5;
                patchSplitFileInfo.fileSize = a2.size;
                patchSplitFileInfo.splitName = a2.featureName;
            }
            if (d.a().a(patchSplitFileInfo)) {
                this.f19714a.d(str + " has diff patch baseFile", new Object[0]);
                return patchSplitFileInfo;
            }
        }
        this.f19714a.d(str + " has no diff patch full download", new Object[0]);
        return super.a(str);
    }

    private boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{this, str})).booleanValue();
        }
        try {
            return v.c(k.a().b().t(), str, true);
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
