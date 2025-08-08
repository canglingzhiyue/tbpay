package com.alipay.android.msp.ui.views;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.contracts.MspWebContract;
import com.alipay.android.msp.ui.web.IWebViewWindow;
import com.alipay.android.msp.ui.web.presenters.UCWebPresenter;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class MspWebActivity extends AbsActivity implements MspWebContract.IView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BACKISEXIT = "backisexit";
    public static final String BACK_DLG = "backDlg";
    public static final String BIZID = "bizid";
    public static final String BTN_HELP = "help";
    public static final String BTN_NONE = "none";
    public static final String BTN_REFRESH = "refresh";
    public static final String BTN_TYPE = "btnType";
    public static final String EXITURL = "exitUrl";
    public static final String FUNCTION_ONBACK = "onBack";
    public static final String FUNCTION_ONEXIT = "onExit";
    public static final String FUNCTION_ONFRESH = "onRefresh";
    public static final String FUNCTION_ONLOADJS = "onLoadJs";
    public static final String FUNCTION_SETTITLE = "setTitle";
    public static final String FUNCTION_SHOWBACK = "showBackButton";
    public static final String HELPURL = "helpUrl";
    public static final String JS_CALL_NATIVE_LISTENER = "javascript:window.AlipayJSBridge.callListener('%s','%s', '%s');";
    public static final String LOADTXT = "loadtxt";
    public static final String METHOD = "method";
    public static final String OFFSCREENLOADTIME = "offscreenLoadTime";
    public static final String POSTDATA = "postData";
    public static final String RESULT_RECEIVER = "web:receiver";
    public static final String TIPS = "tips";
    public static final String TYPE = "type";
    public static final String URL = "url";
    public static final String V2_FUNCTION_AUTOLOGIN = "autoLogin";
    public static final String V2_FUNCTION_CALLNATIVE = "callNativeFunc";
    public static final String V2_FUNCTION_JSFUNCB = "h5JsFuncCallback";
    public static final String V2_FUNCTION_ONBACK = "back";
    public static final String V2_FUNCTION_ONEXIT = "exit";
    public static final String V2_FUNCTION_ONFRESH = "refresh";
    public static final String V2_FUNCTION_PUSHWND = "pushWindow";
    public static final String V2_FUNCTION_SETTITLE = "title";
    public static final String V2_FUNCTION_SHOWBACK = "backButton";
    public static final String V2_FUNCTION_SHOWREFRESH = "refreshButton";

    /* renamed from: a  reason: collision with root package name */
    public MspWebContract.IPresenter<MspWebActivity> f5027a;
    private FrameLayout b = null;
    private int c = -1;
    private TextView d = null;
    private ProgressBar e = null;
    private ImageView g = null;
    private ImageView f = null;
    private String h = "";
    private long i = 0;

    /* loaded from: classes3.dex */
    public static class WebStatsEvent {
        public StEvent stEvent;
        public long startLoadUrlTime;
    }

    public static /* synthetic */ Object ipc$super(MspWebActivity mspWebActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 323739864:
                super.setRequestedOrientation(((Number) objArr[0]).intValue());
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void addMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db286f9", new Object[]{this});
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        j.b(context);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void disposeActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c89bd5", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public View getCurrentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("518ce191", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void openActivity(Intent intent, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67402bc8", new Object[]{this, intent, onResultReceived});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public boolean openUrl(String str, OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a04f493", new Object[]{this, str, onResultReceived})).booleanValue();
        }
        return false;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void removeMaskView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee44a5c", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showContentView(View view, int i, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b8f3f", new Object[]{this, view, new Integer(i), mspWindowFrame});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCusLoadingView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb7c42e", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showCustomOptDialog(String str, String str2, List<FlybirdDialogEventDesc> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81c9ab9", new Object[]{this, str, str2, list});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showDialogView(String str, String str2, List<MspDialogButton> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("243919f6", new Object[]{this, str, str2, list});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showLoadingView(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("272661f4", new Object[]{this, strArr});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void showToastView(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772525fa", new Object[]{this, str, str2, new Long(j)});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopCusLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abc0129", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
    public void stopLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186899a6", new Object[]{this});
        }
    }

    public static /* synthetic */ long a(MspWebActivity mspWebActivity, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6169ffa", new Object[]{mspWebActivity, new Long(j)})).longValue();
        }
        mspWebActivity.i = j;
        return j;
    }

    public static /* synthetic */ void a(MspWebActivity mspWebActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91bea67e", new Object[]{mspWebActivity});
        } else {
            mspWebActivity.a();
        }
    }

    public static /* synthetic */ long b(MspWebActivity mspWebActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ef957f3", new Object[]{mspWebActivity})).longValue() : mspWebActivity.i;
    }

    public static /* synthetic */ int c(MspWebActivity mspWebActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ac340973", new Object[]{mspWebActivity})).intValue() : mspWebActivity.c;
    }

    public static /* synthetic */ String d(MspWebActivity mspWebActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ae4a7bbf", new Object[]{mspWebActivity}) : mspWebActivity.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // com.alipay.android.msp.ui.views.AbsActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.views.MspWebActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IView
    public void initUI(final IWebViewWindow iWebViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cd6e20", new Object[]{this, iWebViewWindow});
            return;
        }
        View backView = iWebViewWindow.getBackView();
        this.g = iWebViewWindow.getFreshView();
        this.d = iWebViewWindow.getTitleView();
        this.e = iWebViewWindow.getProgressBar();
        this.f = iWebViewWindow.getHelpView();
        if (backView != null) {
            backView.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.views.MspWebActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        MspWebActivity.a(MspWebActivity.this);
                    }
                }
            });
        }
        this.d.setVisibility(0);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.views.MspWebActivity.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (SystemClock.elapsedRealtime() - MspWebActivity.b(MspWebActivity.this) <= 600) {
                } else {
                    MspWebActivity.a(MspWebActivity.this, SystemClock.elapsedRealtime());
                    UCWebPresenter.addStEventForBizId(MspWebActivity.c(MspWebActivity.this), "click", "webonrefresh");
                    iWebViewWindow.reload();
                    iWebViewWindow.showReFreshView(false);
                }
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.android.msp.ui.views.MspWebActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (SystemClock.elapsedRealtime() - MspWebActivity.b(MspWebActivity.this) <= 600) {
                } else {
                    MspWebActivity.a(MspWebActivity.this, SystemClock.elapsedRealtime());
                    UCWebPresenter.addStEventForBizId(MspWebActivity.c(MspWebActivity.this), "click", "webonhelp");
                    if (MspWebActivity.this.f5027a == null) {
                        return;
                    }
                    MspWebActivity.this.f5027a.pushWebviewWindow(MspWebActivity.d(MspWebActivity.this), "");
                }
            }
        });
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        } else {
            super.onStart();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        } else {
            super.onStop();
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UserFeedBackUtil.getInstance().registerScreenShotObserver(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UserFeedBackUtil.getInstance().unregisterContentObserver(this);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            a();
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (SystemClock.elapsedRealtime() - this.i <= 600) {
        } else {
            this.i = SystemClock.elapsedRealtime();
            MspWebContract.IPresenter<MspWebActivity> iPresenter = this.f5027a;
            if (iPresenter == null) {
                return;
            }
            IWebViewWindow mo546getJsWebViewWindow = iPresenter.mo546getJsWebViewWindow();
            if (mo546getJsWebViewWindow != null) {
                JSONObject backDlg = mo546getJsWebViewWindow.getBackDlg();
                if (backDlg != null) {
                    a(backDlg);
                    return;
                } else {
                    this.f5027a.onBack();
                    return;
                }
            }
            this.f5027a.onBack();
        }
    }

    private void a(JSONObject jSONObject) {
        String str;
        String str2 = "txt";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", (Object) "exp");
            Utils.postNotification(this, "MQP_LOC_H5_BACK_DLG_NOTIFY", jSONObject2, this.c);
            ArrayList arrayList = new ArrayList();
            String str3 = null;
            JSONArray jSONArray = jSONObject.containsKey("btns") ? jSONObject.getJSONArray("btns") : null;
            if (jSONObject.containsKey("msg")) {
                str3 = jSONObject.getString("msg");
            }
            String str4 = str3;
            final MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.c);
            if (jSONArray != null && mspContextByBizId != null && str4 != null) {
                int i = 0;
                while (i < jSONArray.size()) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    if (jSONObject3 == null || StringUtils.isEmpty(jSONObject3.getString(str2))) {
                        str = str2;
                    } else {
                        final JSONObject jSONObject4 = jSONObject3.getJSONObject("act");
                        final String string = jSONObject3.getString(str2);
                        str = str2;
                        arrayList.add(new FlybirdDialogEventDesc(jSONObject3.getString(str2), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.ui.views.MspWebActivity.5
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i2)});
                                    return;
                                }
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("type", (Object) "click");
                                jSONObject5.put("txt", (Object) string);
                                Utils.postNotification(this, "MQP_LOC_H5_BACK_DLG_NOTIFY", jSONObject5, MspWebActivity.c(MspWebActivity.this));
                                if (jSONObject4 == null) {
                                    return;
                                }
                                try {
                                    JSONObject jSONObject6 = new JSONObject();
                                    jSONObject6.put("action", (Object) jSONObject4.toString());
                                    ActionsCreator.get(mspContextByBizId).createDialogEventAction(jSONObject6.toJSONString());
                                    if (MspWebActivity.this.f5027a == null) {
                                        return;
                                    }
                                    MspWebActivity.this.f5027a.onBack();
                                } catch (Throwable th) {
                                    LogUtil.printExceptionStackTrace(th);
                                }
                            }
                        }));
                    }
                    i++;
                    str2 = str;
                }
                arrayList.size();
                FlybirdDialogImpl.showDialog(this, jSONObject.getString("title"), str4, arrayList);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            super.onConfigurationChanged(configuration);
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
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.b = null;
        }
        MspWebContract.IPresenter<MspWebActivity> iPresenter = this.f5027a;
        if (iPresenter != null) {
            iPresenter.onDestroy();
        }
        MspWebContract.IPresenter<MspWebActivity> iPresenter2 = this.f5027a;
        if (iPresenter2 == null) {
            return;
        }
        iPresenter2.detachIView();
        this.f5027a = null;
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        MspWebContract.IPresenter<MspWebActivity> iPresenter = this.f5027a;
        if (iPresenter != null) {
            iPresenter.notifyCaller();
        }
        UserFeedBackUtil.setFeedBackbyGuessHasShown(false);
        try {
            super.finish();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue() : super.onKeyDown(i, keyEvent);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IView
    public void setTitleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3edfb4", new Object[]{this, str});
        } else if (str == null) {
        } else {
            this.d.setText(str);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IView
    public void setProgressVisibility(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3d83adb", new Object[]{this, new Integer(i)});
        } else if (i == 100) {
            this.e.setVisibility(4);
        } else {
            if (4 == this.e.getVisibility()) {
                this.e.setVisibility(0);
            }
            this.e.setProgress(i);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IView
    public void addViewToMainLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abd1d347", new Object[]{this, view});
            return;
        }
        if (this.b == null) {
            this.b = (FrameLayout) findViewById(R.id.mini_webview_root);
        }
        if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeAllViews();
        }
        this.b.addView(view);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IView
    public void removeViewFromMainLayout(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218880f5", new Object[]{this, view});
            return;
        }
        if (this.b == null) {
            this.b = (FrameLayout) findViewById(R.id.mini_webview_root);
        }
        this.b.removeView(view);
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134be0d8", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            super.setRequestedOrientation(i);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
