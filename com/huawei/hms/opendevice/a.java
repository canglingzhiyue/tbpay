package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.AAIDResult;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public class a implements Callable<AAIDResult> {

    /* renamed from: a  reason: collision with root package name */
    private Context f7496a;

    public a(Context context) {
        this.f7496a = context;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public AAIDResult call() throws Exception {
        Context context = this.f7496a;
        if (context != null) {
            String c = b.c(context);
            AAIDResult aAIDResult = new AAIDResult();
            aAIDResult.setId(c);
            return aAIDResult;
        }
        throw ErrorEnum.ERROR_ARGUMENTS_INVALID.toApiException();
    }
}
