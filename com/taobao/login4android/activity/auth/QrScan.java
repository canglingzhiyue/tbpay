package com.taobao.login4android.activity.auth;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.login.ui.UserLoginActivity;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class QrScan {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(382373923);
    }

    public static void showQrScan(UserLoginActivity userLoginActivity, TextView textView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c03891f", new Object[]{userLoginActivity, textView, view});
        } else {
            showQrScan(userLoginActivity, textView, view, true);
        }
    }

    public static void showQrScan(final UserLoginActivity userLoginActivity, TextView textView, View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("346e4d95", new Object[]{userLoginActivity, textView, view, new Boolean(z)});
        } else if (userLoginActivity == null || userLoginActivity.isFinishing() || textView == null) {
        } else {
            if (userLoginActivity.supportPad()) {
                setVisible(textView);
                if (z) {
                    if (userLoginActivity.mAlipayInstall) {
                        setVisible(view);
                    } else {
                        setInvisible(view);
                    }
                } else {
                    setVisible(view);
                }
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.activity.auth.QrScan.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                            return;
                        }
                        UserLoginActivity userLoginActivity2 = UserLoginActivity.this;
                        if (userLoginActivity2 == null || userLoginActivity2.isFinishing()) {
                            return;
                        }
                        UserLoginActivity.this.gotoQrcodeFragment(new Intent());
                    }
                });
                return;
            }
            setInvisible(textView);
            setInvisible(view);
        }
    }

    public static void setVisible(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f4613b", new Object[]{view});
        } else if (view == null) {
        } else {
            view.setVisibility(0);
        }
    }

    public static void setInvisible(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188c6720", new Object[]{view});
        } else if (view == null) {
        } else {
            view.setVisibility(8);
        }
    }
}
