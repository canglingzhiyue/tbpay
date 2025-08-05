package com.tmall.android.dai.internal.config;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTCodeDescription;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.tmall.android.dai.internal.config.Config;
import tb.kge;

/* loaded from: classes9.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f23690a;

    static {
        kge.a(-524682229);
        f23690a = "WalleConvert";
    }

    public static MRTTaskDescription a(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTTaskDescription) ipChange.ipc$dispatch("53483898", new Object[]{aVar});
        }
        if (aVar == null) {
            return null;
        }
        MRTTaskDescription mRTTaskDescription = new MRTTaskDescription();
        mRTTaskDescription.async = aVar.f;
        mRTTaskDescription.name = aVar.b();
        mRTTaskDescription.clnName = aVar.k();
        mRTTaskDescription.model = new MRTCodeDescription(aVar.c(), aVar.d(), null, mRTTaskDescription);
        mRTTaskDescription.resource = a(aVar, mRTTaskDescription);
        mRTTaskDescription.cid = aVar.h();
        mRTTaskDescription.extentAgr1 = aVar.g();
        return mRTTaskDescription;
    }

    private static MRTFilesDescription a(com.tmall.android.dai.model.a aVar, MRTTaskDescription mRTTaskDescription) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTFilesDescription) ipChange.ipc$dispatch("35c18c1c", new Object[]{aVar, mRTTaskDescription});
        }
        if (aVar.f() == null) {
            return null;
        }
        Config.ModelResource f = aVar.f();
        return new MRTFilesDescription(f.files, f.fileUrl, f.fileMd5, mRTTaskDescription);
    }
}
