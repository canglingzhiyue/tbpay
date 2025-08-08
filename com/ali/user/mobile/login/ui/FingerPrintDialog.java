package com.ali.user.mobile.login.ui;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.user.mobile.callback.FingerCallback;
import com.ali.user.mobile.coordinator.CoordinatorWrapper;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.login.service.impl.FingerprintLoginServiceImpl;
import com.ali.user.mobile.model.CommonCallback;
import com.ali.user.mobile.service.FingerprintService;
import com.ali.user.mobile.service.ServiceFactory;
import com.ali.user.mobile.utils.ImageUtil;
import com.ali.user.mobile.utils.MainThreadExecutor;
import com.ali.user.mobile.verify.VerifyApi;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes2.dex */
public class FingerPrintDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CANCEL = 4002;
    public static final int ERROR_EXCEPTION = 4001;
    public static final int ERROR_OTHER = 4023;
    public static final int STATUS_IV = 3;
    public static final int STATUS_LOGIN = 1;
    public static final int STATUS_SET = 2;
    public TextView mCancelButton;
    public CommonCallback mCommonCallback;
    public ImageView mIconImg;
    public TextView mMessage;
    public TextView mOKButton;
    public View mSplitLine;
    public String TAG = "login.finger";
    public boolean transparent = false;
    public int status = 2;

    static {
        kge.a(-757051809);
    }

    public static /* synthetic */ Object ipc$super(FingerPrintDialog fingerPrintDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 188604040) {
            super.onStop();
            return null;
        } else if (hashCode == 1639966335) {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 2133689546) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onStart();
            return null;
        }
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : "";
    }

    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_fingerprint_dialog;
    }

    public FingerPrintDialog(CommonCallback commonCallback) {
        this.mCommonCallback = commonCallback;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        try {
            View inflate = layoutInflater.inflate(getLayoutContent(), viewGroup);
            this.mSplitLine = inflate.findViewById(R.id.passport_button_split_line);
            this.mOKButton = (TextView) inflate.findViewById(R.id.passport_button_ok);
            this.mCancelButton = (TextView) inflate.findViewById(R.id.passport_button_cancel);
            this.mMessage = (TextView) inflate.findViewById(R.id.passport_dialog_message);
            this.mIconImg = (ImageView) inflate.findViewById(R.id.passport_dialog_icon);
            ImageUtil.updateImage(this.mIconImg, "https://gw.alicdn.com/imgextra/i1/O1CN01Py8wWW1bEMczE2qjW_!!6000000003433-2-tps-214-214.png");
            this.mCancelButton.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.FingerPrintDialog.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        FingerPrintDialog.this.onCancelClick();
                    }
                }
            });
            this.mOKButton.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.FingerPrintDialog.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        FingerPrintDialog.this.changeStatus(2);
                    }
                }
            });
            try {
                if (getArguments() != null) {
                    this.status = getArguments().getInt("status");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            changeStatus(this.status);
            return inflate;
        } catch (Throwable th2) {
            String str = this.TAG;
            LoginTLogAdapter.e(str, getPageName() + " inflate layout error", th2);
            UserTrackAdapter.sendUT(getPageName(), "Inflate_Layout_Error", "ERROR", "", null);
            FingerprintLoginServiceImpl.getInstance().disableFingerprintLogin();
            CommonCallback commonCallback = this.mCommonCallback;
            if (commonCallback != null) {
                commonCallback.onFail(4001, "创建指纹识别框失败");
            }
            return null;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 17;
        getDialog().getWindow().setAttributes(attributes);
        if (this.transparent) {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        } else {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(getContext().getResources().getColor(R.color.aliuser_half_transparent_background)));
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        if (this.transparent) {
            getView().setAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.aliuser_menu_out));
        }
        super.onStop();
        stopListen();
    }

    public void changeStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a63cda", new Object[]{this, new Integer(i)});
            return;
        }
        this.status = i;
        if (i == 1) {
            startListen();
            this.mCancelButton.setText(R.string.aliuser_cancel);
            this.mMessage.setText(getActivity().getString(R.string.aliuser_fingerprint_login_tips));
            this.mSplitLine.setVisibility(8);
            this.mOKButton.setVisibility(8);
        } else if (i == 2) {
            startListen();
            this.mCancelButton.setText(R.string.aliuser_cancel);
            this.mMessage.setText(R.string.aliuser_fingerprint_check);
            this.mSplitLine.setVisibility(8);
            this.mOKButton.setVisibility(8);
        } else if (i != 3) {
        } else {
            startListen();
            this.mCancelButton.setText(R.string.aliuser_cancel);
            this.mMessage.setText(getActivity().getString(R.string.ali_fingerprint_iv));
            this.mSplitLine.setVisibility(8);
            this.mOKButton.setVisibility(8);
        }
    }

    public void showOther() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b84d1a", new Object[]{this});
        } else if (this.status != 3) {
        } else {
            try {
                this.mSplitLine.setVisibility(0);
                this.mOKButton.setVisibility(0);
                this.mOKButton.setText(getActivity().getString(R.string.ali_fingerprint_other_iv));
                this.mOKButton.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.FingerPrintDialog.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        if (FingerPrintDialog.this.mCommonCallback != null) {
                            FingerPrintDialog.this.mCommonCallback.onFail(4023, FingerPrintDialog.this.getActivity().getString(R.string.ali_fingerprint_other_iv));
                        }
                        FingerPrintDialog.this.close();
                    }
                });
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            dismissAllowingStateLoss();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (getActivity() == null) {
            return;
        }
        getActivity().finish();
    }

    public void startListen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a54864d0", new Object[]{this});
        } else {
            new CoordinatorWrapper().execute(new Runnable() { // from class: com.ali.user.mobile.login.ui.FingerPrintDialog.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        UserTrackAdapter.sendExtendUT("FingerPrintStart", "startListen", String.valueOf(FingerPrintDialog.this.status), null);
                        ((FingerprintService) ServiceFactory.getService(FingerprintService.class)).authenticate(new FingerCallback() { // from class: com.ali.user.mobile.login.ui.FingerPrintDialog.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.ali.user.mobile.callback.FingerCallback
                            public void onAuthenticationError(int i, CharSequence charSequence) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("4947938f", new Object[]{this, new Integer(i), charSequence});
                                    return;
                                }
                                FingerPrintDialog.this.showOther();
                                if (5 == i || i >= 7) {
                                    if (7 == i) {
                                        FingerPrintDialog.this.mMessage.setText(R.string.aliuser_fingerprint_try_later);
                                    } else if (100 == i) {
                                        if (FingerPrintDialog.this.status == 2) {
                                            FingerPrintDialog.this.mMessage.setText(R.string.aliuser_fingerprint_open_error);
                                        } else if (FingerPrintDialog.this.status == 1) {
                                            FingerPrintDialog.this.mMessage.setText(R.string.aliuser_finger_login_changed);
                                        } else {
                                            FingerPrintDialog.this.mMessage.setText(R.string.aliuser_finger_iv_changed);
                                        }
                                        VerifyApi.invalidAll();
                                    }
                                } else if (charSequence != null) {
                                    FingerPrintDialog.this.mMessage.setText(charSequence.toString());
                                }
                                UserTrackAdapter.sendExtendUT("FingerPrintFailed", "onAuthenticationError", String.valueOf(FingerPrintDialog.this.status), null);
                            }

                            @Override // com.ali.user.mobile.callback.FingerCallback
                            public void onAuthenticationHelp(int i, CharSequence charSequence) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("c05e8ce8", new Object[]{this, new Integer(i), charSequence});
                                    return;
                                }
                                if (i < 1000 && !StringUtils.isEmpty(charSequence)) {
                                    FingerPrintDialog.this.mMessage.setText(charSequence.toString());
                                }
                                UserTrackAdapter.sendExtendUT("FingerPrintFailed", "onAuthenticationHelp", String.valueOf(FingerPrintDialog.this.status), null);
                            }

                            @Override // com.ali.user.mobile.callback.FingerCallback
                            public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("7abbe242", new Object[]{this, authenticationResult});
                                    return;
                                }
                                UserTrackAdapter.sendExtendUT("FingerPrintSuccess", "onAuthenticationSucceeded", String.valueOf(FingerPrintDialog.this.status), null);
                                FingerPrintDialog.this.afterAuthenticatedSucceed();
                            }

                            @Override // com.ali.user.mobile.callback.FingerCallback
                            public void onAuthenticationFailed() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("d822ffdb", new Object[]{this});
                                    return;
                                }
                                UserTrackAdapter.sendExtendUT("FingerPrintFailed", "onAuthenticationFailed", String.valueOf(FingerPrintDialog.this.status), null);
                                FingerPrintDialog.this.mMessage.setText(R.string.aliuser_fingerprint_not_match);
                            }
                        });
                    } catch (Throwable th) {
                        th.printStackTrace();
                        MainThreadExecutor.execute(new Runnable() { // from class: com.ali.user.mobile.login.ui.FingerPrintDialog.4.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                TextView textView;
                                int i;
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                if (FingerPrintDialog.this.status == 2) {
                                    textView = FingerPrintDialog.this.mMessage;
                                    i = R.string.aliuser_fingerprint_open_error;
                                } else if (FingerPrintDialog.this.status == 1) {
                                    textView = FingerPrintDialog.this.mMessage;
                                    i = R.string.aliuser_fingerprint_try_other;
                                } else {
                                    textView = FingerPrintDialog.this.mMessage;
                                    i = R.string.aliuser_fingerprint_iv_try_other;
                                }
                                textView.setText(i);
                                FingerPrintDialog.this.showOther();
                            }
                        });
                        try {
                            UserTrackAdapter.sendExtendUT("FingerPrintException", th.getLocalizedMessage(), String.valueOf(FingerPrintDialog.this.status), null);
                            LoginTLogAdapter.e(FingerPrintDialog.this.TAG, th);
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                        try {
                            UserTrackAdapter.sendExtendUT("FingerPrintException", th.getLocalizedMessage());
                            LoginTLogAdapter.e(FingerPrintDialog.this.TAG, th);
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public void afterAuthenticatedSucceed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c755f816", new Object[]{this});
            return;
        }
        close();
        CommonCallback commonCallback = this.mCommonCallback;
        if (commonCallback == null) {
            return;
        }
        commonCallback.onSuccess();
    }

    public void stopListen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeba070", new Object[]{this});
        } else {
            ((FingerprintService) ServiceFactory.getService(FingerprintService.class)).cancelIdentify();
        }
    }

    @Override // android.support.v4.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61bfe67f", new Object[]{this, fragmentManager, str});
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
        } else {
            onCancelClick();
        }
    }

    public void onCancelClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454030d6", new Object[]{this});
            return;
        }
        CommonCallback commonCallback = this.mCommonCallback;
        if (commonCallback != null) {
            commonCallback.onFail(4002, "指纹验证取消");
        }
        close();
    }
}
