package com.alipay.android.app.render.api.result;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.session.standalone.model.PrepareResult;
import com.taobao.umipublish.draft.DraftMediaHelper;

@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: classes3.dex */
public class MspPrepareResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private PrepareResult f4362a;
    private boolean b;

    private MspPrepareResult() {
    }

    public MspPrepareResult(PrepareResult prepareResult, boolean z) {
        this.f4362a = prepareResult;
        this.b = z;
    }

    public PrepareResult getPrepareResult() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PrepareResult) ipChange.ipc$dispatch("1fe6b0f2", new Object[]{this}) : this.f4362a;
    }

    public boolean isAsyncLayout() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("db5b3fc7", new Object[]{this})).booleanValue() : this.b;
    }
}
