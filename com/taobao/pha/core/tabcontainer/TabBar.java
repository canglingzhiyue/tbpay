package com.taobao.pha.core.tabcontainer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.IImageLoader;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.jsbridge.c;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.TabBarItemModel;
import com.taobao.pha.core.model.TabBarModel;
import com.taobao.pha.core.p;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.nfz;
import tb.ngn;

/* loaded from: classes7.dex */
public class TabBar extends PenetrateLinearLayout implements c.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TabBar";
    private AppController mAppController;
    private b mCurrentTab;
    private a mListener;
    public int mPosition;
    private final List<b> mTabItemViews;
    private nfz mTabPageView;

    /* loaded from: classes7.dex */
    public interface a {
        void a(int i, TabBarItemModel tabBarItemModel, boolean z);
    }

    static {
        kge.a(1784560234);
        kge.a(446098399);
    }

    private String getIconUrl(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6ab4802f", new Object[]{this, str}) : str;
    }

    public static /* synthetic */ Object ipc$super(TabBar tabBar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ b access$000(TabBar tabBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("ddfc4389", new Object[]{tabBar}) : tabBar.mCurrentTab;
    }

    public static /* synthetic */ a access$100(TabBar tabBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("15ed1e89", new Object[]{tabBar}) : tabBar.mListener;
    }

    public static /* synthetic */ TabBarItemModel access$200(TabBar tabBar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TabBarItemModel) ipChange.ipc$dispatch("2e0fdb3b", new Object[]{tabBar, new Integer(i)}) : tabBar.getTabBarItemModel(i);
    }

    public static /* synthetic */ nfz access$400(TabBar tabBar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("656f7b88", new Object[]{tabBar}) : tabBar.mTabPageView;
    }

    public static /* synthetic */ String access$500(TabBar tabBar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("355c9a5b", new Object[]{tabBar, str}) : tabBar.getIconUrl(str);
    }

    public TabBar(Context context) {
        super(context);
        this.mTabItemViews = new ArrayList();
        this.mPosition = 1;
        setOrientation(0);
    }

    public TabBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabItemViews = new ArrayList();
        this.mPosition = 1;
        setOrientation(0);
    }

    public void setAppController(AppController appController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be974bf0", new Object[]{this, appController});
        } else {
            this.mAppController = appController;
        }
    }

    public void setOnTabChangeListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d2e4fb", new Object[]{this, aVar});
        } else {
            this.mListener = aVar;
        }
    }

    public void init(ManifestModel manifestModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0485d0d", new Object[]{this, manifestModel});
            return;
        }
        setTag(manifestModel);
        TabBarModel tabBarModel = getTabBarModel();
        if (tabBarModel == null) {
            return;
        }
        if (StringUtils.equals(tabBarModel.position, "absolute")) {
            this.mPosition = 2;
        }
        if (!StringUtils.isEmpty(tabBarModel.html) || !StringUtils.isEmpty(tabBarModel.getUrl())) {
            AppController appController = this.mAppController;
            if (appController != null) {
                appController.P().b(21);
            }
            initCustomTabView(tabBarModel);
            return;
        }
        initDefaultTabView(tabBarModel);
    }

    public nfz getTabPageView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nfz) ipChange.ipc$dispatch("a965916a", new Object[]{this}) : this.mTabPageView;
    }

    private void initDefaultTabView(TabBarModel tabBarModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d3cfc3", new Object[]{this, tabBarModel});
            return;
        }
        setBackgroundColor(ngn.f(tabBarModel.backgroundColor));
        List<TabBarItemModel> tabBarItemsModel = getTabBarItemsModel();
        if (tabBarItemsModel == null) {
            return;
        }
        int size = tabBarItemsModel.size();
        for (int i = 0; i < size; i++) {
            TabBarItemModel tabBarItemModel = tabBarItemsModel.get(i);
            if (tabBarItemModel != null) {
                b bVar = new b(getContext(), tabBarModel);
                bVar.a(tabBarItemModel, tabBarModel);
                View a2 = bVar.a();
                addView(a2, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                a2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.pha.core.tabcontainer.TabBar.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else if (TabBar.access$000(TabBar.this) != null && view == TabBar.access$000(TabBar.this).a()) {
                        } else {
                            int intValue = ((Integer) ((Object[]) view.getTag())[0]).intValue();
                            TabBar.this.setSelected(intValue);
                            if (TabBar.access$100(TabBar.this) == null) {
                                return;
                            }
                            TabBar.access$100(TabBar.this).a(intValue, TabBar.access$200(TabBar.this, intValue), false);
                        }
                    }
                });
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i);
                a2.setTag(objArr);
                this.mTabItemViews.add(bVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void initCustomTabView(com.taobao.pha.core.model.TabBarModel r17) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.core.tabcontainer.TabBar.initCustomTabView(com.taobao.pha.core.model.TabBarModel):void");
    }

    public void setSelected(int i) {
        TabBarItemModel tabBarItemModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a432185f", new Object[]{this, new Integer(i)});
        } else if (this.mTabPageView == null) {
            List<TabBarItemModel> tabBarItemsModel = getTabBarItemsModel();
            TabBarModel tabBarModel = getTabBarModel();
            for (int i2 = 0; tabBarItemsModel != null && tabBarModel != null && i2 < tabBarItemsModel.size(); i2++) {
                b bVar = null;
                List<b> list = this.mTabItemViews;
                if (list != null && list.size() > i2) {
                    bVar = this.mTabItemViews.get(i2);
                }
                if (bVar != null && (tabBarItemModel = tabBarItemsModel.get(i2)) != null) {
                    if (i == i2) {
                        bVar.b(tabBarItemModel, tabBarModel);
                        this.mCurrentTab = bVar;
                    } else {
                        bVar.c(tabBarItemModel, tabBarModel);
                    }
                }
            }
        }
    }

    public void updateStyle(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897bf38d", new Object[]{this, str, str2, str3});
        } else if (getTabBarModel() != null) {
            if (!StringUtils.isEmpty(str)) {
                getTabBarModel().textColor = str;
            }
            if (!StringUtils.isEmpty(str3)) {
                getTabBarModel().selectedColor = str3;
            }
            if (!StringUtils.isEmpty(str2)) {
                getTabBarModel().backgroundColor = str2;
            }
            setBackgroundColor(ngn.f(getTabBarModel().backgroundColor));
            for (b bVar : this.mTabItemViews) {
                if (this.mCurrentTab == bVar) {
                    b.a(bVar).setTextColor(ngn.f(getTabBarModel().selectedColor));
                } else {
                    b.a(bVar).setTextColor(ngn.f(getTabBarModel().textColor));
                }
            }
        }
    }

    private ManifestModel getManifestModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ManifestModel) ipChange.ipc$dispatch("d5422aff", new Object[]{this});
        }
        if (getTag() == null) {
            return null;
        }
        return (ManifestModel) getTag();
    }

    private TabBarModel getTabBarModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarModel) ipChange.ipc$dispatch("83cb21df", new Object[]{this});
        }
        ManifestModel manifestModel = getManifestModel();
        if (manifestModel == null) {
            return null;
        }
        return manifestModel.tabBar;
    }

    private List<TabBarItemModel> getTabBarItemsModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("820f7e23", new Object[]{this});
        }
        TabBarModel tabBarModel = getTabBarModel();
        if (tabBarModel == null) {
            return null;
        }
        return tabBarModel.items;
    }

    private TabBarItemModel getTabBarItemModel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBarItemModel) ipChange.ipc$dispatch("73df7e10", new Object[]{this, new Integer(i)});
        }
        List<TabBarItemModel> tabBarItemsModel = getTabBarItemsModel();
        if (tabBarItemsModel == null) {
            return null;
        }
        return tabBarItemsModel.get(i);
    }

    @Override // com.taobao.pha.core.jsbridge.c.a
    public void evaluateJavaScript(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19fb517", new Object[]{this, str});
        } else if (this.mTabPageView == null) {
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.pha.core.tabcontainer.TabBar.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            TabBar.access$400(TabBar.this).evaluateJavaScript(str);
                        }
                    }
                });
            } else {
                this.mTabPageView.evaluateJavaScript(str);
            }
        }
    }

    public void destory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        this.mListener = null;
        nfz nfzVar = this.mTabPageView;
        if (nfzVar != null) {
            nfzVar.g();
        }
        this.mTabPageView = null;
    }

    /* loaded from: classes7.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private TextView b;
        private ImageView c;
        private final View d;
        private final IImageLoader e = p.b().t();
        private int f;
        private int g;
        private int h;
        private int i;

        static {
            kge.a(-886113357);
        }

        public static /* synthetic */ TextView a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TextView) ipChange.ipc$dispatch("1a322ee5", new Object[]{bVar}) : bVar.b;
        }

        public b(Context context, TabBarModel tabBarModel) {
            this.d = View.inflate(context, R.layout.tab_item_view, null);
            float b = ngn.b() / 750.0f;
            if (tabBarModel.iconSize > 0) {
                this.g = Math.round(tabBarModel.iconSize * b);
            }
            if (tabBarModel.fontSize > 0) {
                this.f = Math.round(tabBarModel.fontSize * b);
            }
            if (tabBarModel.spacing > 0) {
                this.h = Math.round(tabBarModel.spacing * b);
            }
            if (tabBarModel.lineHeight > 0) {
                this.i = Math.round(tabBarModel.lineHeight * b);
            }
        }

        public void a(TabBarItemModel tabBarItemModel, TabBarModel tabBarModel) {
            int fontMetricsInt;
            int i;
            ImageView imageView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d068c575", new Object[]{this, tabBarItemModel, tabBarModel});
                return;
            }
            this.c = (ImageView) this.d.findViewById(R.id.pha_tab_image);
            if (this.g > 0 && (imageView = this.c) != null && (imageView.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.c.getLayoutParams();
                int i2 = this.g;
                layoutParams.width = i2;
                layoutParams.height = i2;
            }
            IImageLoader iImageLoader = this.e;
            if (iImageLoader != null) {
                iImageLoader.a(this.c, TabBar.access$500(TabBar.this, tabBarItemModel.icon));
            }
            this.b = (TextView) this.d.findViewById(R.id.pha_tab_name);
            TextView textView = this.b;
            if (textView == null) {
                return;
            }
            textView.setText(tabBarItemModel.name);
            int i3 = this.f;
            if (i3 > 0) {
                this.b.setTextSize(0, i3);
            }
            if (this.i > 0 && (i = this.i) != (fontMetricsInt = this.b.getPaint().getFontMetricsInt(null))) {
                this.b.setLineSpacing(i - fontMetricsInt, 1.0f);
            }
            if (this.h > 0 && (this.b.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
                ((LinearLayout.LayoutParams) this.b.getLayoutParams()).topMargin = this.h;
            }
            this.b.setTextColor(ngn.f(tabBarModel.textColor));
        }

        public View a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this}) : this.d;
        }

        public void b(TabBarItemModel tabBarItemModel, TabBarModel tabBarModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3eefd6b6", new Object[]{this, tabBarItemModel, tabBarModel});
                return;
            }
            IImageLoader iImageLoader = this.e;
            if (iImageLoader != null) {
                iImageLoader.a(this.c, TabBar.access$500(TabBar.this, tabBarItemModel.activeIcon));
            }
            this.b.setTextColor(ngn.f(tabBarModel.selectedColor));
        }

        public void c(TabBarItemModel tabBarItemModel, TabBarModel tabBarModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad76e7f7", new Object[]{this, tabBarItemModel, tabBarModel});
                return;
            }
            IImageLoader iImageLoader = this.e;
            if (iImageLoader != null) {
                iImageLoader.a(this.c, TabBar.access$500(TabBar.this, tabBarItemModel.icon));
            }
            this.b.setTextColor(ngn.f(tabBarModel.textColor));
        }
    }
}
