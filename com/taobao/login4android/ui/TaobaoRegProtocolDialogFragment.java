package com.taobao.login4android.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.app.dataprovider.StringOrangeResult;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.LanguageUtil;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class TaobaoRegProtocolDialogFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public View aliuser_protocal_inset_ll;
    private Activity mAttachedActivity;
    public View.OnClickListener mCancelListener;
    public TextView mContentTV;
    public View mContentView;
    public CharSequence mContextText;
    public String mLogoUrl;
    public View.OnClickListener mNagetiveListener;
    public String mNegativeBtnText;
    public String mOneKeyProtocol;
    public String mOneKeyProtocolUrl;
    public View.OnClickListener mPositiveListener;
    public String mPostiveBtnText;
    public TextView mTitleTV;
    public CharSequence mTitleText;
    public boolean needAdaptElder;
    public boolean useOrangeColor;
    public boolean useUnderLine;
    public boolean negativeVisible = true;
    public boolean contentVisible = true;
    public int height = 0;
    public String mPageName = UTConstans.PageName.UT_PAGE_ONEKEY_REG_NEW;
    public boolean first = false;

    static {
        kge.a(-1843601159);
    }

    public static /* synthetic */ Object ipc$super(TaobaoRegProtocolDialogFragment taobaoRegProtocolDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
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

    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
        }
    }

    public void setNegativeVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac7ea52", new Object[]{this, new Boolean(z)});
        } else {
            this.negativeVisible = z;
        }
    }

    public void setUseUnderLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e157e4e6", new Object[]{this, new Boolean(z)});
        } else {
            this.useUnderLine = z;
        }
    }

    public String getLogoUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fbe2b42b", new Object[]{this}) : this.mLogoUrl;
    }

    public void setLogoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87775a13", new Object[]{this, str});
        } else {
            this.mLogoUrl = str;
        }
    }

    public boolean isNeedAdaptElder() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9edda993", new Object[]{this})).booleanValue() : this.needAdaptElder;
    }

    public void setNeedAdaptElder(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602910ed", new Object[]{this, new Boolean(z)});
        } else {
            this.needAdaptElder = z;
        }
    }

    public void setPageNameSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be85f65", new Object[]{this, str});
        } else {
            this.mPageName = str;
        }
    }

    public void needAutoReg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad6119e", new Object[]{this, new Boolean(z)});
        } else {
            this.first = z;
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.mAttachedActivity = activity;
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
        if (DataProviderFactory.getDataProvider().isAdapterPadAndFold()) {
            DeviceUtils.adapterLoginDialogUIOnDevice(getActivity(), getDialog(), this.mContentView, 0.78f);
            return;
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) (this.height * displayMetrics.density);
        Window window = dialog.getWindow();
        int i2 = (int) (displayMetrics.widthPixels * 0.78d);
        if (this.height == 0) {
            i = -2;
        }
        window.setLayout(i2, i);
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        if (!DataProviderFactory.getDataProvider().isAdapterPadAndFold()) {
            return;
        }
        DeviceUtils.adapterLoginDialogUIOnDevice(getActivity(), getDialog(), this.mContentView, 0.78f);
    }

    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_reg_protocol_dialog;
    }

    public void setUseOrangeColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f0e5d", new Object[]{this, new Boolean(z)});
        } else {
            this.useOrangeColor = z;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        View inflate = layoutInflater.inflate(getLayoutContent(), viewGroup);
        this.mContentView = inflate.findViewById(R.id.aliuser_operation_content);
        this.aliuser_protocal_inset_ll = inflate.findViewById(R.id.aliuser_protocal_inset_ll);
        View view = this.aliuser_protocal_inset_ll;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else if (TaobaoRegProtocolDialogFragment.this.mCancelListener != null) {
                        TaobaoRegProtocolDialogFragment.this.mCancelListener.onClick(view2);
                    } else if (TaobaoRegProtocolDialogFragment.this.mNagetiveListener == null) {
                    } else {
                        TaobaoRegProtocolDialogFragment.this.mNagetiveListener.onClick(view2);
                    }
                }
            });
        }
        this.mTitleTV = (TextView) inflate.findViewById(R.id.aliuser_operation_tip);
        TextView textView = this.mTitleTV;
        if (textView != null) {
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
            if (!StringUtils.isEmpty(this.mTitleText)) {
                this.mTitleTV.setText(this.mTitleText);
            }
        }
        this.mContentTV = (TextView) inflate.findViewById(R.id.aliuser_operation_sencondary_tip);
        if (this.contentVisible) {
            if (!StringUtils.isEmpty(this.mContextText)) {
                this.mContentTV.setText(this.mContextText);
            } else {
                generateContent(inflate);
            }
        } else {
            this.mContentTV.setVisibility(8);
        }
        Button button = (Button) inflate.findViewById(R.id.aliuser_operation_agree);
        if (button != null) {
            button.requestFocus();
            button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    TaobaoRegProtocolDialogFragment.this.dismissAllowingStateLoss();
                    if (TaobaoRegProtocolDialogFragment.this.mPositiveListener == null) {
                        return;
                    }
                    TaobaoRegProtocolDialogFragment.this.mPositiveListener.onClick(view2);
                }
            });
            if (!StringUtils.isEmpty(this.mPostiveBtnText)) {
                button.setText(this.mPostiveBtnText);
            }
        }
        Button button2 = (Button) inflate.findViewById(R.id.aliuser_operation_disagree);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        return;
                    }
                    TaobaoRegProtocolDialogFragment.this.dismissAllowingStateLoss();
                    if (TaobaoRegProtocolDialogFragment.this.mNagetiveListener == null) {
                        return;
                    }
                    TaobaoRegProtocolDialogFragment.this.mNagetiveListener.onClick(view2);
                }
            });
            if (this.negativeVisible) {
                button2.setVisibility(0);
            } else {
                button2.setVisibility(8);
            }
            if (!StringUtils.isEmpty(this.mNegativeBtnText)) {
                button2.setText(this.mNegativeBtnText);
            }
        }
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mTitleTV, this.mContentTV, button, button2);
        }
        setCancelable(false);
        initViews(inflate);
        return inflate;
    }

    public void generateContent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b8fb27", new Object[]{this, view});
            return;
        }
        ProtocolModel protocolModel = new ProtocolModel();
        String string = getString(R.string.aliuser_reg_potocol_content);
        HashMap hashMap = new HashMap();
        StringOrangeResult customProtocol = DataProviderFactory.getOrangeConfig().customProtocol();
        if (customProtocol.orangeExist) {
            try {
                JSONArray parseArray = JSON.parseArray(customProtocol.value);
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    string = string + jSONObject.getString("title") + " ";
                    hashMap.put(jSONObject.getString("title"), jSONObject.getString("url"));
                }
            } catch (Throwable unused) {
            }
        }
        boolean isChineseLanguage = LanguageUtil.isChineseLanguage();
        if (hashMap.size() == 0) {
            hashMap.put(getString(R.string.aliuser_tb_protocal), ProtocolHelper.getTbProtocol(getActivity()));
            hashMap.put(getString(R.string.aliuser_policy_protocal), ProtocolHelper.getPrivacyProtocol(getActivity()));
            hashMap.put(getString(R.string.aliuser_alipay_protocal), ProtocolHelper.getAlipayProtocol(getActivity()));
            String str = string + getString(R.string.aliuser_tb_protocal) + " ";
            if (!isChineseLanguage) {
                str = str + ", ";
            }
            String str2 = str + getString(R.string.aliuser_policy_protocal) + " ";
            if (!isChineseLanguage) {
                str2 = (str2 + getString(R.string.aliuser_and)) + " ";
            }
            string = str2 + getString(R.string.aliuser_alipay_protocal);
        }
        if (!StringUtils.isEmpty(this.mOneKeyProtocol) && !StringUtils.isEmpty(this.mOneKeyProtocolUrl)) {
            string = string + "《" + this.mOneKeyProtocol + "》";
            hashMap.put(this.mOneKeyProtocol, this.mOneKeyProtocolUrl);
        }
        if (this.first) {
            string = string + getString(R.string.aliuser_reg_protocol_autoreg);
        } else if (!LanguageUtil.isChineseLanguage()) {
            string = string + ".";
        }
        protocolModel.protocolTitle = string;
        protocolModel.protocolItems = hashMap;
        if (this.useOrangeColor) {
            protocolModel.protocolItemColor = R.color.aliuser_edittext_bg_color_activated;
        } else {
            protocolModel.protocolItemColor = R.color.aliuser_new_edit_text_color;
        }
        ProtocolHelper.generateProtocol(protocolModel, this.mAttachedActivity, this.mContentTV, this.mPageName, this.useUnderLine);
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

    public View.OnClickListener getCancelListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("b8e68d74", new Object[]{this}) : this.mCancelListener;
    }

    public void setCancelListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0a0a02", new Object[]{this, onClickListener});
        } else {
            this.mCancelListener = onClickListener;
        }
    }

    public void setOneKeyProtocol(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c89f24", new Object[]{this, str});
        } else {
            this.mOneKeyProtocol = str;
        }
    }

    public void setOneKeyProtocolUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2e012d", new Object[]{this, str});
        } else {
            this.mOneKeyProtocolUrl = str;
        }
    }

    public void setNegativeBtnText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75200403", new Object[]{this, str});
        } else {
            this.mNegativeBtnText = str;
        }
    }

    public void setPostiveBtnText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819eb5a4", new Object[]{this, str});
        } else {
            this.mPostiveBtnText = str;
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

    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
        } else {
            this.mTitleText = charSequence;
        }
    }

    public void setContent(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588e9962", new Object[]{this, charSequence});
        } else {
            this.mContextText = charSequence;
        }
    }
}
