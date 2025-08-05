package com.alipay.mobile.verifyidentity.module.menu.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuData;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuItem;
import com.alipay.mobile.verifyidentity.ui.APListView;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class MenuListView extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5916a = "MenuListView";
    private MenuData b;
    private MenuActivity c;
    private TextView d;
    private MenuListAdapter e;
    private LinearLayout f;
    public APListView mMenuListView;

    public static /* synthetic */ MenuData access$200(MenuListView menuListView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuData) ipChange.ipc$dispatch("e302040c", new Object[]{menuListView}) : menuListView.b;
    }

    public static /* synthetic */ String access$300() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("642796a6", new Object[0]) : f5916a;
    }

    public static /* synthetic */ MenuActivity access$400(MenuListView menuListView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MenuActivity) ipChange.ipc$dispatch("49f7712f", new Object[]{menuListView}) : menuListView.c;
    }

    public MenuListView(MenuActivity menuActivity, MenuData menuData) {
        super(menuActivity);
        this.c = menuActivity;
        this.b = menuData;
        this.f = (LinearLayout) LayoutInflater.from(menuActivity).inflate(R.layout.verify_menu_listview, this);
        this.mMenuListView = (APListView) this.f.findViewById(R.id.menuList);
        this.d = (TextView) this.f.findViewById(R.id.titleText);
        APListView aPListView = this.mMenuListView;
        if (!TextUtils.isEmpty(this.b.title)) {
            this.d.setText(this.b.title);
        }
        this.e = new MenuListAdapter(this.c, this.b.menu);
        aPListView.setAdapter((ListAdapter) this.e);
        aPListView.setOnItemClickListener(new OnMenuItemClickListener());
        setListViewHeightBasedOnChildren(aPListView);
        aPListView.setFocusable(false);
    }

    /* loaded from: classes3.dex */
    public class MenuListAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private List<MenuItem> f5917a;
        private LayoutInflater b;

        /* loaded from: classes3.dex */
        public final class ViewHolder {
            public TextView menuName;
            public View spliter;

            private ViewHolder() {
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue() : i;
        }

        public MenuListAdapter(Context context, List<MenuItem> list) {
            this.b = LayoutInflater.from(context);
            this.f5917a = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            List<MenuItem> list = this.f5917a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        /* renamed from: getItem */
        public MenuItem mo596getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MenuItem) ipChange.ipc$dispatch("353346ea", new Object[]{this, new Integer(i)});
            }
            List<MenuItem> list = this.f5917a;
            if (list != null && i < list.size()) {
                return this.f5917a.get(i);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = this.b.inflate(R.layout.verify_menu_item, viewGroup, false);
                viewHolder = new ViewHolder();
                viewHolder.menuName = (TextView) view.findViewById(R.id.moduleMenuName);
                viewHolder.spliter = view.findViewById(R.id.menu_splitter);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.menuName.setText(this.f5917a.get(i).name);
            if (i == this.f5917a.size() - 1) {
                viewHolder.spliter.setVisibility(8);
            } else {
                viewHolder.spliter.setVisibility(0);
            }
            return view;
        }
    }

    /* loaded from: classes3.dex */
    public class OnMenuItemClickListener implements AdapterView.OnItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private OnMenuItemClickListener() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dafa70", new Object[]{this, adapterView, view, new Integer(i), new Long(j)});
            } else if (MenuListView.access$200(MenuListView.this) == null || MenuListView.access$200(MenuListView.this).menu == null || j >= MenuListView.access$200(MenuListView.this).menu.size() || j < 0) {
                VerifyLogCat.e(MenuListView.access$300(), "mMenuData is not legal onItemClick");
            } else {
                MenuListView.this.writePwdBehavorLog("UC-MobileIC-20190606-7", "CLICK_ITEM", String.valueOf(i + 1));
                MenuItem menuItem = MenuListView.access$200(MenuListView.this).menu.get((int) j);
                if (menuItem == null || TextUtils.isEmpty(menuItem.token)) {
                    VerifyLogCat.e(MenuListView.access$300(), "the chosen token is empty");
                } else {
                    AsyncTaskExecutor.getInstance().execute(MenuListView.access$400(MenuListView.this).getMenuClickRpc(menuItem.token, menuItem.code), "MenuClick");
                }
            }
        }
    }

    public void setListViewHeightBasedOnChildren(APListView aPListView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50efb50", new Object[]{this, aPListView});
            return;
        }
        ListAdapter adapter = aPListView.getAdapter();
        if (adapter == null) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            View view = adapter.getView(i2, null, aPListView);
            view.measure(0, 0);
            i += view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = aPListView.getLayoutParams();
        layoutParams.height = i + (aPListView.getDividerHeight() * (adapter.getCount() - 1));
        aPListView.setLayoutParams(layoutParams);
    }

    public void writePwdBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d15438a", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", ModuleConstants.VI_MODULE_MENU);
        hashMap.put("code", str2);
        hashMap.put("index", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavv", "", "", null, hashMap);
    }
}
