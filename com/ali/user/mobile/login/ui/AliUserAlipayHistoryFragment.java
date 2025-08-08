package com.ali.user.mobile.login.ui;

import android.content.Intent;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.UIBaseConstants;
import com.ali.user.mobile.login.presenter.BioPresenter;
import com.ali.user.mobile.model.LoginParam;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.CircleImageView;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class AliUserAlipayHistoryFragment extends AliUserAlipayFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mCurrentSelectedAccount;
    public CircleImageView mHeadImageView;
    public TextView mMoreLoginTV;
    public TextView mShowIdTextView;
    public boolean pwdLoginEnable = false;
    public boolean faceLoginEnable = false;
    public boolean smsLoginEnable = false;

    static {
        kge.a(1411030846);
    }

    public static /* synthetic */ Object ipc$super(AliUserAlipayHistoryFragment aliUserAlipayHistoryFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode != -1180824595) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.initViews((View) objArr[0]);
            return null;
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void doInResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ead564", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.AliUserAlipayFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : UTConstans.PageName.UT_PAGE_ALIPAY_HISTORY;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void onDeleteAccount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7b9756a", new Object[]{this});
        }
    }

    @Override // com.ali.user.mobile.login.ui.AliUserAlipayFragment
    public boolean showMenu() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a928c487", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void access$000(AliUserAlipayHistoryFragment aliUserAlipayHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9987ab76", new Object[]{aliUserAlipayHistoryFragment, str});
        } else {
            aliUserAlipayHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(AliUserAlipayHistoryFragment aliUserAlipayHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18709d5", new Object[]{aliUserAlipayHistoryFragment, str});
        } else {
            aliUserAlipayHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(AliUserAlipayHistoryFragment aliUserAlipayHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29866834", new Object[]{aliUserAlipayHistoryFragment, str});
        } else {
            aliUserAlipayHistoryFragment.addControl(str);
        }
    }

    @Override // com.ali.user.mobile.login.ui.AliUserAlipayFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.aliuser_login_switch_more_login) {
            addControl(UTConstans.Controls.UT_CHOOSE_OTHER);
            showBottomMore();
        } else {
            super.onClick(view);
        }
    }

    @Override // com.ali.user.mobile.login.ui.AliUserAlipayFragment, com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        this.mShowIdTextView = (TextView) view.findViewById(R.id.aliuser_login_account_tv);
        this.mHeadImageView = (CircleImageView) view.findViewById(R.id.aliuser_login_avatar);
        this.mMoreLoginTV = (TextView) view.findViewById(R.id.aliuser_login_switch_more_login);
        setOnClickListener(this.mMoreLoginTV);
        super.initViews(view);
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mShowIdTextView);
        }
        if (this.mBioPresenter == null) {
            this.mBioPresenter = new BioPresenter(this, new LoginParam());
        }
        handleClickMore();
    }

    public void handleClickMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84e31bc", new Object[]{this});
        } else if (this.mMoreLoginTV == null) {
        } else {
            List<MenuItem> menuItems = getMenuItems(null);
            if (menuItems == null || menuItems.size() == 0) {
                this.mMoreLoginTV.setVisibility(8);
            } else if (menuItems.size() == 1) {
                this.mMoreLoginTV.setVisibility(0);
                final MenuItem menuItem = menuItems.get(0);
                this.mMoreLoginTV.setText(menuItem.getText());
                this.mMoreLoginTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.AliUserAlipayHistoryFragment.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            menuItem.getMenuItemOnClickListener().onClick(view);
                        }
                    }
                });
            } else {
                this.mMoreLoginTV.setVisibility(0);
            }
        }
    }

    @Override // com.ali.user.mobile.login.ui.AliUserAlipayFragment
    public void switchToHistoryMode(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db829b3", new Object[]{this, historyAccount});
        } else if (!isActivityAvaiable() || historyAccount == null) {
        } else {
            this.mCurrentSelectedAccount = historyAccount.userInputName;
            String dataMasking = StringUtil.dataMasking(this.mCurrentSelectedAccount, true);
            if (StringUtils.isEmpty(dataMasking)) {
                return;
            }
            this.mShowIdTextView.setText(dataMasking);
            updateAvatar(historyAccount.headImg);
            switchMode(this.isHistoryMode, historyAccount);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void switchMode(boolean z, HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feb28ba", new Object[]{this, new Boolean(z), historyAccount});
        } else if (historyAccount == null) {
        } else {
            if (historyAccount.hasPwd == 1) {
                this.pwdLoginEnable = true;
            }
            if (DataProviderFactory.getDataProvider().supportFaceLogin() && (this.mUserLoginActivity.isFaceLoginEnvEnable || this.mUserLoginActivity.isFaceLoginActivate)) {
                this.faceLoginEnable = true;
            }
            this.smsLoginEnable = checkSMSLoginEnable(historyAccount);
            this.fingerLoginEnable = isFingerEnable(historyAccount);
            this.onekeyHistoryEnable = isHistoryOnekeyEnable(historyAccount);
        }
    }

    public void showBottomMore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439cd904", new Object[]{this});
            return;
        }
        BottomMenuFragment bottomMenuFragment = getBottomMenuFragment();
        bottomMenuFragment.setMenuItems(getMenuItems(bottomMenuFragment));
        bottomMenuFragment.show(getFragmentManager(), getPageName());
    }

    public List<MenuItem> getMenuItems(BottomMenuFragment bottomMenuFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("23afa118", new Object[]{this, bottomMenuFragment});
        }
        ArrayList arrayList = new ArrayList();
        addOnekeyHistory(bottomMenuFragment, arrayList);
        addFingeritem(bottomMenuFragment, arrayList);
        if (this.pwdLoginEnable) {
            MenuItem menuItem = new MenuItem();
            menuItem.setText(getString(R.string.aliuser_login_pwd_login));
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.AliUserAlipayHistoryFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (!AliUserAlipayHistoryFragment.this.isActive()) {
                    } else {
                        AliUserAlipayHistoryFragment.access$000(AliUserAlipayHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OHTER_PWD);
                        AliUserAlipayHistoryFragment.this.switchToPwdLogin();
                    }
                }
            });
            arrayList.add(menuItem);
        }
        if (this.smsLoginEnable) {
            MenuItem menuItem2 = new MenuItem();
            menuItem2.setText(getString(R.string.aliuser_login_sms_login));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.AliUserAlipayHistoryFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else if (!AliUserAlipayHistoryFragment.this.isActive()) {
                    } else {
                        AliUserAlipayHistoryFragment.access$100(AliUserAlipayHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SMS);
                        AliUserAlipayHistoryFragment.this.switchToSmsLogin();
                    }
                }
            });
            arrayList.add(menuItem2);
        }
        if (this.faceLoginEnable) {
            MenuItem menuItem3 = new MenuItem();
            menuItem3.setText(getString(R.string.aliuser_scan_login_text));
            menuItem3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem3) { // from class: com.ali.user.mobile.login.ui.AliUserAlipayHistoryFragment.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem4});
                    } else if (!AliUserAlipayHistoryFragment.this.isActive()) {
                    } else {
                        AliUserAlipayHistoryFragment.access$200(AliUserAlipayHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_FACE);
                        AliUserAlipayHistoryFragment.this.addCheckAction(LoginClickAction.ACTION_FACE);
                    }
                }
            });
            arrayList.add(menuItem3);
        }
        return arrayList;
    }

    public void switchToSmsLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab34886", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        if (this.mProtocolCB != null) {
            intent.putExtra("check", this.mProtocolCB.isChecked());
        }
        if (this.mUserLoginPresenter != null && this.mUserLoginPresenter.getLoginParam() != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.gotoMobileLoginFragment(intent);
    }

    public void switchToPwdLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("343fb322", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        if (this.mProtocolCB != null) {
            intent.putExtra("check", this.mProtocolCB.isChecked());
        }
        if (this.mUserLoginPresenter != null && this.mUserLoginPresenter.getLoginParam() != null) {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
        this.mUserLoginActivity.gotoPwdLoginFragment(intent);
    }

    @Override // com.ali.user.mobile.login.ui.AliUserAlipayFragment, com.ali.user.mobile.base.ui.BaseFragment
    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue() : R.layout.aliuser_fragment_history_alipay;
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment
    public void appendIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118d209a", new Object[]{this, intent});
        } else if (intent == null || this.mUserLoginPresenter == null || this.mUserLoginPresenter.getLoginParam() == null) {
        } else {
            LoginParam loginParam = new LoginParam();
            loginParam.source = this.mUserLoginPresenter.getLoginParam().source;
            intent.putExtra(UIBaseConstants.IntentExtrasNamesConstants.PARAM_LOGIN_PARAM, JSON.toJSONString(loginParam));
        }
    }
}
