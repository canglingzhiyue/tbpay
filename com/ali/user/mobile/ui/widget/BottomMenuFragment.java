package com.ali.user.mobile.ui.widget;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.log.UserTrackAdapter;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.ScreenUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.kge;

/* loaded from: classes2.dex */
public class BottomMenuFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int cancelBtnBgRes;
    private String controlHitPrefix;
    private int itemLayoutId;
    private String mMenuTitle;
    private List<MenuItem> menuItems;
    private int rootLayoutId;
    private boolean transparent = true;
    public boolean needDivider = true;

    static {
        kge.a(-1426712110);
    }

    public static /* synthetic */ Object ipc$super(BottomMenuFragment bottomMenuFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
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

    public void setTransparent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4573e19d", new Object[]{this, new Boolean(z)});
        } else {
            this.transparent = z;
        }
    }

    public void setRootLayoutId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ad4693", new Object[]{this, new Integer(i)});
        } else {
            this.rootLayoutId = i;
        }
    }

    public void setItemLayoutId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6eb2402", new Object[]{this, new Integer(i)});
        } else {
            this.itemLayoutId = i;
        }
    }

    public List<MenuItem> getMenuItems() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3df10215", new Object[]{this}) : this.menuItems;
    }

    public void setMenuItems(List<MenuItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2c5557", new Object[]{this, list});
            return;
        }
        for (MenuItem menuItem : list) {
            if (menuItem.textSize == 0.0f) {
                menuItem.textSize = DataProviderFactory.getApplicationContext().getResources().getDimension(R.dimen.aliuser_textsize_normal);
            }
            if (DataProviderFactory.getDataProvider().enableElder()) {
                menuItem.textSize = ScreenUtil.dip2px(DataProviderFactory.getApplicationContext(), ElderUtil.getScaleSize(ScreenUtil.pxTodip(DataProviderFactory.getApplicationContext(), menuItem.textSize)));
            }
        }
        this.menuItems = list;
    }

    public void setMenuTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f42948", new Object[]{this, str});
        } else {
            this.mMenuTitle = str;
        }
    }

    @Override // android.support.v4.app.DialogFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
        } else {
            super.onCreate(bundle);
        }
    }

    public void setCancelBtnBgRes(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef91181", new Object[]{this, new Integer(i)});
        } else {
            this.cancelBtnBgRes = i;
        }
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        if (this.transparent) {
            getDialog().getWindow().setWindowAnimations(R.style.AliUserMenuAnimation);
        }
        if (this.rootLayoutId <= 0) {
            this.rootLayoutId = R.layout.aliuser_fragment_bottom_menu;
        }
        View inflate = layoutInflater.inflate(this.rootLayoutId, viewGroup, false);
        if (this.menuItems == null) {
            dismissAllowingStateLoss();
            return inflate;
        }
        TextView textView = (TextView) inflate.findViewById(R.id.aliuser_cancel_tv);
        int i = this.cancelBtnBgRes;
        if (i > 0) {
            textView.setBackgroundResource(i);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.ali.user.mobile.ui.widget.BottomMenuFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    BottomMenuFragment.this.onCancelClick();
                }
            }
        });
        TextView textView2 = (TextView) inflate.findViewById(R.id.aliuser_bottom_menu_title_tv);
        View findViewById = inflate.findViewById(R.id.aliuser_bottom_menu_title_divider);
        if (StringUtils.isEmpty(this.mMenuTitle)) {
            textView2.setVisibility(8);
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            textView2.setVisibility(0);
            textView2.setText(this.mMenuTitle);
        }
        ListView listView = (ListView) inflate.findViewById(R.id.aliuser_menu_lv);
        if (!this.needDivider) {
            listView.setDividerHeight(0);
        }
        MenuItemAdapter menuItemAdapter = new MenuItemAdapter(getActivity().getBaseContext(), this.menuItems);
        menuItemAdapter.setLayoutId(this.itemLayoutId);
        listView.setAdapter((ListAdapter) menuItemAdapter);
        ElderUtil.scaleTextSize(textView);
        return inflate;
    }

    public void setControlHitPrefix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a826bb", new Object[]{this, str});
        } else {
            this.controlHitPrefix = str;
        }
    }

    public void onCancelClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454030d6", new Object[]{this});
            return;
        }
        if (!StringUtils.isEmpty(getTag())) {
            String str = "";
            if (!StringUtils.isEmpty(this.controlHitPrefix)) {
                str = (str + this.controlHitPrefix) + "_";
            }
            UserTrackAdapter.sendControlUT(getTag(), str + "cancel");
        }
        dismissAllowingStateLoss();
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
        attributes.gravity = 80;
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

    public void setNeedDivider(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a5bec", new Object[]{this, new Boolean(z)});
        } else {
            this.needDivider = z;
        }
    }
}
