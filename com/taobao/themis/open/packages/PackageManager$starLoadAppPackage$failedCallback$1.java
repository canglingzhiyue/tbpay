package com.taobao.themis.open.packages;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.extension.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.t;
import tb.ruw;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<no name provided>", "", "errorCode", "", "errorMsg", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class PackageManager$starLoadAppPackage$failedCallback$1 extends Lambda implements ruw<Integer, String, t> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Ref.BooleanRef $alreadyFailed;
    public final /* synthetic */ c.a $appPackageDownloadCallback;
    public final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageManager$starLoadAppPackage$failedCallback$1(a aVar, Ref.BooleanRef booleanRef, c.a aVar2) {
        super(2);
        this.this$0 = aVar;
        this.$alreadyFailed = booleanRef;
        this.$appPackageDownloadCallback = aVar2;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.t, java.lang.Object] */
    @Override // tb.ruw
    /* renamed from: invoke */
    public /* synthetic */ t mo2423invoke(Integer num, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c951db", new Object[]{this, num, str});
        }
        invoke(num.intValue(), str);
        return t.INSTANCE;
    }

    public final void invoke(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5563eae", new Object[]{this, new Integer(i), str});
            return;
        }
        String a2 = a.a(this.this$0);
        TMSLogger.d(a2, "loadPackage error : " + i + ", " + str);
        synchronized (this.this$0) {
            if (this.$alreadyFailed.element) {
                return;
            }
            this.$alreadyFailed.element = true;
            c.a aVar = this.$appPackageDownloadCallback;
            if (aVar != null) {
                aVar.a(i, str);
                t tVar = t.INSTANCE;
            }
        }
    }
}
