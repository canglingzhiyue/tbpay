package com.alipay.android.msp.ui.views;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.content.LocalBroadcastManager;
import android.util.SparseArray;
import android.view.MotionEvent;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.i;
import com.uc.webview.export.media.MessageID;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class MspBaseActivity<T extends MspBaseContract.IPresenter<? extends MspBaseContract.IView>> extends AbsActivity implements MspBaseContract.IView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ID = "CallingPid";
    public int mBizId;
    public OnResultReceived mOnOutJumpResume;
    public OnResultReceived mOnResultReceived;
    public T mPresenter;
    private SparseArray<ResultCallback> nb = new SparseArray<>();

    /* loaded from: classes3.dex */
    public interface ResultCallback {
        void onResult(Bundle bundle);
    }

    public static /* synthetic */ Object ipc$super(MspBaseActivity mspBaseActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 885118356:
                super.finishAndRemoveTask();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2075560917:
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public abstract T createPresenter();

    public void dismissDefaultLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86216ec", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        LogUtil.i(getClass().getSimpleName(), i.b.MEASURE_ONCREATE, toString());
        this.mPresenter = createPresenter();
        T t = this.mPresenter;
        if (t != null) {
            t.attachIView(this);
        }
        Intent intent = new Intent(MspGlobalDefine.EVENT_MSP_ACTIVITY_STARTED);
        intent.putExtra("bizId", this.mBizId);
        LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        LogUtil.i(getClass().getSimpleName(), "onPause", toString());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        LogUtil.i(getClass().getSimpleName(), MessageID.onStop, toString());
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        LogUtil.i(getClass().getSimpleName(), "onResume", toString());
        OnResultReceived onResultReceived = this.mOnResultReceived;
        if (onResultReceived != null) {
            onResultReceived.onReceiveResult("");
            this.mOnResultReceived = null;
        }
        OnResultReceived onResultReceived2 = this.mOnOutJumpResume;
        if (onResultReceived2 == null) {
            return;
        }
        onResultReceived2.onReceiveResult("");
        this.mOnOutJumpResume = null;
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        LogUtil.i(getClass().getSimpleName(), "onNewIntent", toString());
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        LogUtil.i(getClass().getSimpleName(), "finish", toString());
    }

    @Override // android.app.Activity
    public void finishAndRemoveTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c1d594", new Object[]{this});
            return;
        }
        super.finishAndRemoveTask();
        LogUtil.i(getClass().getSimpleName(), "finishAndRemoveTask", toString());
    }

    public void setOnOutJumpResume(OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72284d36", new Object[]{this, onResultReceived});
        } else {
            this.mOnOutJumpResume = onResultReceived;
        }
    }

    public T getPresenter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("f11e74c9", new Object[]{this}) : this.mPresenter;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void openActivity(final Intent intent, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67402bc8", new Object[]{this, intent, onResultReceived});
            return;
        }
        try {
            String simpleName = getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(toString());
            sb.append(" data=");
            sb.append(intent == null ? "null" : intent.getDataString());
            LogUtil.i(simpleName, "openActivity", sb.toString());
            if (onResultReceived != null) {
                this.mOnResultReceived = onResultReceived;
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspBaseActivity.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspBaseActivity.this.startActivityForResult(intent, 0);
                        }
                    }
                });
                return;
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspBaseActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspBaseActivity.this.startActivity(intent);
                    }
                }
            });
        } catch (Throwable th) {
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (mspContextByBizId != null) {
                mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, th.getClass().getName(), th);
            }
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public boolean openUrl(String str, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a04f493", new Object[]{this, str, onResultReceived})).booleanValue();
        }
        this.mOnResultReceived = onResultReceived;
        String simpleName = getClass().getSimpleName();
        LogUtil.i(simpleName, "openUrl", toString() + " url=" + str);
        try {
            return PhoneCashierMspEngine.getMspJump().processUrl(this, str);
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (mspContextByBizId == null) {
                return false;
            }
            mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, "openUrlFail", e);
            return false;
        }
    }

    @Override // com.alipay.android.msp.ui.views.AbsActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LogUtil.i(getClass().getSimpleName(), MessageID.onDestroy, toString());
        T t = this.mPresenter;
        if (t == null) {
            return;
        }
        t.detachIView();
        this.mPresenter = null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showLoadingView(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272661f4", new Object[]{this, strArr});
        } else {
            LogUtil.d(getClass().getSimpleName(), "showLoadingView", toString());
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186899a6", new Object[]{this});
        } else {
            LogUtil.d(getClass().getSimpleName(), "stopLoadingView", toString());
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showDialogView(String str, String str2, List<MspDialogButton> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243919f6", new Object[]{this, str, str2, list});
            return;
        }
        String simpleName = getClass().getSimpleName();
        LogUtil.d(simpleName, "showDialogView", toString() + " " + str2);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showToastView(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772525fa", new Object[]{this, str, str2, new Long(j)});
            return;
        }
        String simpleName = getClass().getSimpleName();
        LogUtil.d(simpleName, "showToastView", toString() + " " + str);
    }

    @Override // android.app.Activity
    public boolean shouldShowRequestPermissionRationale(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2e9cee1e", new Object[]{this, str})).booleanValue() : Build.VERSION.SDK_INT >= 23 && super.shouldShowRequestPermissionRationale(str);
    }

    public void requestPermissions(final String[] strArr, final ResultCallback resultCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93628316", new Object[]{this, strArr, resultCallback});
        } else if (Build.VERSION.SDK_INT >= 23) {
            int identityHashCode = System.identityHashCode(resultCallback);
            this.nb.put(identityHashCode, resultCallback);
            requestPermissions(strArr, identityHashCode);
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.views.MspBaseActivity.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    String[] strArr2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Bundle bundle = new Bundle();
                    for (String str : strArr) {
                        bundle.putBoolean(str, MspBaseActivity.this.checkPermission(str, Process.myPid(), Process.myUid()) == 0);
                    }
                    ResultCallback resultCallback2 = resultCallback;
                    if (resultCallback2 == null) {
                        return;
                    }
                    resultCallback2.onResult(bundle);
                }
            });
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCustomOptDialog(String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81c9ab9", new Object[]{this, str, str2, list});
        } else if (isFinishing()) {
        } else {
            stopLoadingView();
            removeMaskView();
            FlybirdDialogImpl.showDialog(PhoneCashierMspEngine.getMspViSec().getVidTopActivity() != null ? PhoneCashierMspEngine.getMspViSec().getVidTopActivity() : this, str, str2, list);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.support.v4.app.ActivityCompat.OnRequestPermissionsResultCallback
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        ResultCallback resultCallback = this.nb.get(i);
        this.nb.delete(i);
        int length = strArr.length > iArr.length ? iArr.length : strArr.length;
        Bundle bundle = new Bundle();
        for (int i2 = 0; i2 < length; i2++) {
            bundle.putBoolean(strArr[i2], iArr[i2] == 0);
        }
        if (resultCallback == null) {
            return;
        }
        resultCallback.onResult(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        try {
            if ((motionEvent.getFlags() & 2) != 0) {
                z = true;
            }
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
            if (z && mspContextByBizId != null) {
                LogUtil.i(getClass().getSimpleName(), "dispatchTouchEvent", "ObscuredTouch true");
                mspContextByBizId.setObscuredTouch(true);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean hasSelfPermission(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cfb6904a", new Object[]{this, str})).booleanValue() : checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
