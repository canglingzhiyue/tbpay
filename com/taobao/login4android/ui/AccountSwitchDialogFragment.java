package com.taobao.login4android.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class AccountSwitchDialogFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PAGE_NAME = "Page_AlipayTrustLogin";
    private View.OnClickListener mNagetiveListener;
    private View.OnClickListener mPositiveListener;
    private TextView mTitleTV;
    private String mTitleText;

    static {
        kge.a(1801120700);
    }

    public static /* synthetic */ Object ipc$super(AccountSwitchDialogFragment accountSwitchDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 1639966335:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ View.OnClickListener access$000(AccountSwitchDialogFragment accountSwitchDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("caf397d7", new Object[]{accountSwitchDialogFragment}) : accountSwitchDialogFragment.mPositiveListener;
    }

    public static /* synthetic */ View.OnClickListener access$100(AccountSwitchDialogFragment accountSwitchDialogFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("9222e3f6", new Object[]{accountSwitchDialogFragment}) : accountSwitchDialogFragment.mNagetiveListener;
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.AliUserDialogTheme);
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        dialog.getWindow().setLayout((int) (displayMetrics.widthPixels * 0.75d), -2);
    }

    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_account_switch_dialog;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        View inflate = layoutInflater.inflate(getLayoutContent(), viewGroup);
        this.mTitleTV = (TextView) inflate.findViewById(R.id.aliuser_account_switch_tip);
        this.mTitleTV.setMovementMethod(ScrollingMovementMethod.getInstance());
        if (!StringUtils.isEmpty(this.mTitleText)) {
            this.mTitleTV.setText(this.mTitleText);
        }
        Button button = (Button) inflate.findViewById(R.id.aliuser_account_switch_agree);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.AccountSwitchDialogFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    AccountSwitchDialogFragment.this.dismissAllowingStateLoss();
                    if (AccountSwitchDialogFragment.access$000(AccountSwitchDialogFragment.this) == null) {
                        return;
                    }
                    UserTrackAdapter.sendControlUT("Page_AlipayTrustLogin", "Switch");
                    AccountSwitchDialogFragment.access$000(AccountSwitchDialogFragment.this).onClick(view);
                }
            });
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.taobao.login4android.ui.AccountSwitchDialogFragment.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                AccountSwitchDialogFragment.this.dismissAllowingStateLoss();
                if (AccountSwitchDialogFragment.access$100(AccountSwitchDialogFragment.this) == null) {
                    return;
                }
                UserTrackAdapter.sendControlUT("Page_AlipayTrustLogin", "Cancel");
                AccountSwitchDialogFragment.access$100(AccountSwitchDialogFragment.this).onClick(view);
            }
        };
        Button button2 = (Button) inflate.findViewById(R.id.aliuser_account_switch_disagree);
        if (button2 != null) {
            button2.setOnClickListener(onClickListener);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.aliuser_account_switch_cancel);
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        setCancelable(true);
        return inflate;
    }

    public void setPositive(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac27f977", new Object[]{this, onClickListener});
        } else {
            this.mPositiveListener = onClickListener;
        }
    }

    public void setNagetive(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516f2abb", new Object[]{this, onClickListener});
        } else {
            this.mNagetiveListener = onClickListener;
        }
    }

    public void setTitleText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3edfb4", new Object[]{this, str});
            return;
        }
        this.mTitleText = str;
        TextView textView = this.mTitleTV;
        if (textView == null) {
            return;
        }
        textView.setText(str);
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

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        UserTrackAdapter.updatePageName(getActivity(), "Page_AlipayTrustLogin");
        super.onResume();
    }
}
