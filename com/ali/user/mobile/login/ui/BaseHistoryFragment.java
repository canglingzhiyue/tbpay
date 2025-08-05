package com.ali.user.mobile.login.ui;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.rpc.HistoryAccount;
import com.ali.user.mobile.ui.widget.BottomMenuFragment;
import com.ali.user.mobile.ui.widget.MenuItem;
import com.ali.user.mobile.ui.widget.MenuItemOnClickListener;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.StringUtil;
import com.ali.user.mobile.utils.UTConstans;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.config.LoginSwitch;
import com.taobao.login4android.ui.TaobaoMobileHistoryFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class BaseHistoryFragment extends BaseLoginFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mCurrentSelectedAccount;
    public TextView mMoreLoginTV;
    public TextView mTitleView;
    public boolean pwdLoginEnable = false;
    public boolean smsLoginEnable = false;
    public boolean faceLoginEnable = false;

    static {
        kge.a(2097969766);
    }

    public static /* synthetic */ Object ipc$super(BaseHistoryFragment baseHistoryFragment, String str, Object... objArr) {
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

    public static /* synthetic */ void access$000(BaseHistoryFragment baseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcd484a", new Object[]{baseHistoryFragment, str});
        } else {
            baseHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$100(BaseHistoryFragment baseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("537b730b", new Object[]{baseHistoryFragment, str});
        } else {
            baseHistoryFragment.addControl(str);
        }
    }

    public static /* synthetic */ void access$200(BaseHistoryFragment baseHistoryFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87299dcc", new Object[]{baseHistoryFragment, str});
        } else {
            baseHistoryFragment.addControl(str);
        }
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.base.ui.BaseFragment
    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
            return;
        }
        super.initViews(view);
        this.mTitleView = (TextView) view.findViewById(R.id.aliuser_login_account_tv);
        this.mMoreLoginTV = (TextView) view.findViewById(R.id.aliuser_login_switch_more_login);
        initMode();
        generateProtocol("", "");
        setOnClickListener(this.mMoreLoginTV);
        if (!this.needAdaptElder) {
            return;
        }
        ElderUtil.scaleTextSize(this.mTitleView, this.mMoreLoginTV);
    }

    public void initMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621aedda", new Object[]{this});
        } else if (this.mUserLoginActivity.hadReadHistory && this.mUserLoginActivity.mHistoryAccount != null) {
            this.isHistoryMode = true;
            switchToHistoryMode(this.mUserLoginActivity.mHistoryAccount);
        } else {
            this.isHistoryMode = false;
            this.historyHid = 0L;
            if (LoginSwitch.getSwitch("protectNullHistory", "true")) {
                switchAccount();
            } else {
                switchMode(this.isHistoryMode, null);
            }
        }
    }

    public void switchToHistoryMode(HistoryAccount historyAccount) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db829b3", new Object[]{this, historyAccount});
        } else if (!isActivityAvaiable() || historyAccount == null) {
        } else {
            this.historyHid = historyAccount.userId;
            this.mCurrentSelectedAccount = historyAccount.userInputName;
            String dataMasking = StringUtil.dataMasking(this.mCurrentSelectedAccount, true);
            if (this.mTitleView != null && !TextUtils.isEmpty(dataMasking)) {
                this.mTitleView.setText(dataMasking);
            }
            updateAvatar(historyAccount.headImg);
            if (historyAccount.hasPwd == 1) {
                this.pwdLoginEnable = true;
            }
            if (DataProviderFactory.getDataProvider().supportFaceLogin() && (this.mUserLoginActivity.isFaceLoginEnvEnable || this.mUserLoginActivity.isFaceLoginActivate)) {
                this.faceLoginEnable = true;
            }
            this.smsLoginEnable = checkSMSLoginEnable(historyAccount);
            this.fingerLoginEnable = isFingerEnable(historyAccount);
            this.onekeyHistoryEnable = isHistoryOnekeyEnable(historyAccount);
            TextView textView = this.mMoreLoginTV;
            if (textView == null) {
                return;
            }
            if (this.smsLoginEnable || this.pwdLoginEnable) {
                this.mMoreLoginTV.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
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
        this.mUserLoginActivity.gotoPwdLoginFragment(intent);
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, com.ali.user.mobile.login.ui.BaseLoginView
    public int getLoginSite() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae3eff14", new Object[]{this})).intValue();
        }
        if (this.isHistoryMode && this.mUserLoginActivity != null && this.mUserLoginActivity.mHistoryAccount != null) {
            return this.mUserLoginActivity.mHistoryAccount.getLoginSite();
        }
        return DataProviderFactory.getDataProvider().getSite();
    }

    @Override // com.ali.user.mobile.login.ui.BaseLoginFragment, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        this.interact = true;
        if (view.getId() == R.id.aliuser_login_switch_more_login) {
            addControl(UTConstans.Controls.UT_CHOOSE_OTHER, getOnekeyEnableMap());
            showBottomMore();
            return;
        }
        super.onClick(view);
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
            menuItem.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem) { // from class: com.ali.user.mobile.login.ui.BaseHistoryFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem2});
                    } else if (!BaseHistoryFragment.this.isActive()) {
                    } else {
                        BaseHistoryFragment.access$000(BaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OHTER_PWD);
                        BaseHistoryFragment.this.switchToPwdLogin();
                    }
                }
            });
            arrayList.add(menuItem);
        }
        if (this.smsLoginEnable && !(this instanceof TaobaoMobileHistoryFragment)) {
            MenuItem menuItem2 = new MenuItem();
            menuItem2.setText(getString(R.string.aliuser_login_sms_login));
            menuItem2.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem2) { // from class: com.ali.user.mobile.login.ui.BaseHistoryFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem3});
                    } else if (!BaseHistoryFragment.this.isActive()) {
                    } else {
                        BaseHistoryFragment.access$100(BaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_SMS);
                        BaseHistoryFragment.this.switchToSmsLogin();
                    }
                }
            });
            arrayList.add(menuItem2);
        }
        if (this.faceLoginEnable && !(this instanceof AliFingerLoginFragment) && !(this instanceof BaseFaceLoginFragment)) {
            MenuItem menuItem3 = new MenuItem();
            menuItem3.setText(getString(R.string.aliuser_scan_login_text));
            menuItem3.setMenuItemOnClickListener(new MenuItemOnClickListener(bottomMenuFragment, menuItem3) { // from class: com.ali.user.mobile.login.ui.BaseHistoryFragment.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.ali.user.mobile.ui.widget.MenuItemOnClickListener
                public void onClickMenuItem(View view, MenuItem menuItem4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ab9b2c95", new Object[]{this, view, menuItem4});
                    } else if (!BaseHistoryFragment.this.isActive()) {
                    } else {
                        BaseHistoryFragment.access$200(BaseHistoryFragment.this, UTConstans.Controls.UT_CHOOSE_OTHER_FACE);
                        BaseHistoryFragment.this.addCheckAction(LoginClickAction.ACTION_FACE);
                    }
                }
            });
            arrayList.add(menuItem3);
        }
        return arrayList;
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
                this.mMoreLoginTV.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.login.ui.BaseHistoryFragment.4
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
}
