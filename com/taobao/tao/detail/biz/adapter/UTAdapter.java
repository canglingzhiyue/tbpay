package com.taobao.tao.detail.biz.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.detail.biz.api5.common.AsynApiTask;
import java.io.Serializable;
import tb.kge;
import tb.tpc;

/* loaded from: classes8.dex */
public class UTAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Ut f19908a;

    /* loaded from: classes8.dex */
    public interface Ut extends Serializable {
        void asynCommitDebugInfo(String str, String str2, AsynApiTask.MtopResponseWrapper mtopResponseWrapper);

        void asynCommitSysInfo(String str, int i, Object obj, Object obj2, String str2);

        void commitEvent(String str, int i, Object obj, Object obj2, Object obj3, String str2);
    }

    static {
        kge.a(-273616586);
        tpc.a("com.taobao.tao.detail.biz.adapter.UTAdapter");
    }

    public static void a(String str, String str2, AsynApiTask.MtopResponseWrapper mtopResponseWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac647271", new Object[]{str, str2, mtopResponseWrapper});
            return;
        }
        Ut ut = f19908a;
        if (ut == null) {
            return;
        }
        ut.asynCommitDebugInfo(str, str2, mtopResponseWrapper);
    }
}
