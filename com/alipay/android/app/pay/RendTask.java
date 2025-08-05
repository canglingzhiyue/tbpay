package com.alipay.android.app.pay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.container.MspContainerResult;
import com.alipay.android.msp.core.MspEngine;
import com.alipay.android.msp.framework.taskscheduler.MspAsyncTask;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.sdk.api.AlipaySDKJSBridge;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class RendTask extends MspAsyncTask<Object, Void, MspContainerResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f4354a;
    private OnContainerFinishListener b;

    /* loaded from: classes3.dex */
    public interface OnContainerFinishListener {
        void onContainerFinish(Context context, String str, String str2);
    }

    public static /* synthetic */ Object ipc$super(RendTask rendTask, String str, Object... objArr) {
        if (str.hashCode() == -1325021319) {
            super.onPostExecute(objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.alipay.android.msp.container.MspContainerResult, java.lang.Object] */
    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    /* renamed from: doInBackground */
    public /* synthetic */ MspContainerResult mo520doInBackground(Object[] objArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e83e4786", new Object[]{this, objArr}) : a(objArr);
    }

    @Override // com.alipay.android.msp.framework.taskscheduler.MspAsyncTask
    public /* synthetic */ void onPostExecute(MspContainerResult mspContainerResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, mspContainerResult});
        } else {
            a(mspContainerResult);
        }
    }

    public RendTask(Activity activity, OnContainerFinishListener onContainerFinishListener) {
        this.f4354a = activity;
        this.b = onContainerFinishListener;
        LogUtil.record(2, AlipaySDKJSBridge.LOG_TAG, "RendTask.RendTask", "RendTask init");
    }

    public void rend(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecac8044", new Object[]{this, str, str2});
        } else {
            execute(str, str2);
        }
    }

    public MspContainerResult a(Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("50e8871c", new Object[]{this, objArr});
        }
        MspContainerResult mspContainerResult = new MspContainerResult();
        if (objArr == null || objArr.length <= 0) {
            mspContainerResult.setErrorCode("101");
            return mspContainerResult;
        }
        String str = "";
        String obj = objArr[0] != null ? objArr[0].toString() : str;
        if (objArr.length >= 2 && objArr[1] != null) {
            str = objArr[1].toString();
        }
        if (TextUtils.isEmpty(obj)) {
            mspContainerResult.setErrorCode("101");
            return mspContainerResult;
        }
        MspContainerResult mspContainerResult2 = new MspContainerResult();
        Activity activity = this.f4354a;
        return activity == null ? mspContainerResult2 : MspEngine.startContainer(obj, str, false, activity);
    }

    public void a(MspContainerResult mspContainerResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d5c7fb", new Object[]{this, mspContainerResult});
            return;
        }
        super.onPostExecute(mspContainerResult);
        if (this.b == null || mspContainerResult == null || TextUtils.equals("400", mspContainerResult.getErrorCode())) {
            return;
        }
        this.b.onContainerFinish(this.f4354a, mspContainerResult.getErrorCode(), mspContainerResult.getBizResult());
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f4354a = null;
        this.b = null;
    }
}
