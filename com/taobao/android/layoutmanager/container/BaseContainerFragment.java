package com.taobao.android.layoutmanager.container;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MenuItemCompat;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST;
import com.taobao.monitor.procedure.IPage;
import com.taobao.monitor.procedure.m;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule;
import com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import tb.kge;
import tb.oga;
import tb.ogb;
import tb.ogt;
import tb.ohd;

/* loaded from: classes5.dex */
public class BaseContainerFragment extends Fragment implements TNodeView.c, ab.c, PullDownCloseLayout.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INTENT_URI = "INTENT_URI";
    private IPage apmPage;
    private b delegate;
    private boolean isResumeCalled;
    private FrameLayout mContentView;
    private long mStartTime;
    private ViewGroup mTNodeContainer;
    public TNodeView tnodeView;
    private boolean tnodeViewInited;
    private Uri uri;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(672867123);
        kge.a(-124997992);
        kge.a(1566632487);
        kge.a(26727213);
    }

    public static /* synthetic */ Object ipc$super(BaseContainerFragment baseContainerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.mStartTime = System.nanoTime();
    }

    public FrameLayout getContentView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("2fdef16a", new Object[]{this}) : this.mContentView;
    }

    public ViewGroup getTNodeContainer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("7319cb8d", new Object[]{this}) : this.mTNodeContainer;
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        setHasOptionsMenu(true);
        this.mTNodeContainer = createContainerView();
        this.mContentView = (FrameLayout) layoutInflater.inflate(R.layout.tnode_common_fragment_layout, viewGroup, false);
        this.mContentView.addView(this.mTNodeContainer, new ViewGroup.LayoutParams(-1, -1));
        if (com.taobao.tao.flexbox.layoutmanager.adapter.a.a().x() != null) {
            getContext();
        }
        initData();
        return this.mContentView;
    }

    public ViewGroup createContainerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7ec9e844", new Object[]{this});
        }
        PullDownCloseLayout pullDownCloseLayout = new PullDownCloseLayout(getContext());
        pullDownCloseLayout.setOnSwipeFinishListener(this);
        return pullDownCloseLayout;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.a
    public void onSwipeFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a3ba95", new Object[]{this});
            return;
        }
        b bVar = this.delegate;
        if (bVar != null) {
            bVar.d = true;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.uri = (Uri) getArguments().getParcelable(KEY_INTENT_URI);
        if (!this.tnodeViewInited) {
            initTNodeView(getContext(), this.uri.toString(), 0, 0);
        } else {
            attachTNodeViewIfNeed();
        }
    }

    private void attachTNodeViewIfNeed() {
        TNodeView tNodeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d65a90", new Object[]{this});
        } else if (getTNodeContainer() == null || (tNodeView = this.tnodeView) == null || tNodeView.getParent() != null) {
        } else {
            getTNodeContainer().addView(this.tnodeView, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private void initTNodeView(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166a2080", new Object[]{this, context, str, new Integer(i), new Integer(i2)});
        } else if (this.tnodeViewInited) {
        } else {
            if (!StringUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                if (StringUtils.isEmpty(parse.getQueryParameter(ASK_CONST.KEY_TNODE_TIME))) {
                    str = parse.buildUpon().appendQueryParameter(ASK_CONST.KEY_TNODE_TIME, String.valueOf(System.nanoTime())).build().toString();
                }
            }
            this.tnodeView = TNodeView.create(context, this, null, str, null, null, this);
            if (i > 0 && i2 > 0) {
                this.tnodeView.prelayout(i, i2);
            }
            attachTNodeViewIfNeed();
            this.tnodeViewInited = true;
            this.apmPage = m.a().a(this.tnodeView, true);
            this.apmPage.d().a(ogt.b(str), str, new HashMap());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r0.equals("poplayer") == false) goto L25;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStartLayout(com.taobao.tao.flexbox.layoutmanager.container.m.b r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.layoutmanager.container.BaseContainerFragment.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r3] = r8
            java.lang.String r8 = "f67932cf"
            r0.ipc$dispatch(r8, r1)
            return
        L15:
            android.net.Uri r0 = r8.b
            java.lang.String r1 = "type"
            java.lang.String r0 = r0.getQueryParameter(r1)
            java.lang.String r1 = ""
            java.lang.String r0 = tb.oec.a(r0, r1)
            r1 = 0
            android.content.Context r4 = r7.getContext()
            boolean r4 = r4 instanceof com.taobao.android.layoutmanager.container.CommonContainerActivity
            if (r4 == 0) goto L33
            android.content.Context r1 = r7.getContext()
            com.taobao.android.layoutmanager.container.CommonContainerActivity r1 = (com.taobao.android.layoutmanager.container.CommonContainerActivity) r1
        L33:
            r4 = -1
            int r5 = r0.hashCode()
            r6 = -1494166844(0xffffffffa6f0d2c4, float:-1.6710474E-15)
            if (r5 == r6) goto L4c
            r6 = 664137120(0x2795eda0, float:4.161344E-15)
            if (r5 == r6) goto L43
            goto L56
        L43:
            java.lang.String r5 = "poplayer"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L56
            goto L57
        L4c:
            java.lang.String r2 = "mediabrowser"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L56
            r2 = 1
            goto L57
        L56:
            r2 = -1
        L57:
            if (r2 == 0) goto L6b
            if (r2 == r3) goto L63
            com.taobao.android.layoutmanager.container.c r0 = new com.taobao.android.layoutmanager.container.c
            r0.<init>(r1, r7, r8)
            r7.delegate = r0
            goto L72
        L63:
            com.taobao.android.layoutmanager.container.e r0 = new com.taobao.android.layoutmanager.container.e
            r0.<init>(r1, r7, r8)
            r7.delegate = r0
            goto L72
        L6b:
            com.taobao.android.layoutmanager.container.PoplayerContainerLifecycle r0 = new com.taobao.android.layoutmanager.container.PoplayerContainerLifecycle
            r0.<init>(r1, r7, r8)
            r7.delegate = r0
        L72:
            com.taobao.android.layoutmanager.container.b r0 = r7.delegate
            r0.a(r1)
            android.content.Context r0 = r7.getContext()
            boolean r0 = r0 instanceof com.taobao.android.layoutmanager.container.CommonContainerActivity
            if (r0 == 0) goto L88
            android.content.Context r0 = r7.getContext()
            com.taobao.android.layoutmanager.container.CommonContainerActivity r0 = (com.taobao.android.layoutmanager.container.CommonContainerActivity) r0
            r0.a(r8)
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.layoutmanager.container.BaseContainerFragment.onStartLayout(com.taobao.tao.flexbox.layoutmanager.container.m$b):void");
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
    public void onLayoutCompleted(aa aaVar) {
        FragmentActivity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb42811", new Object[]{this, aaVar});
        } else if (aaVar == null || (activity = getActivity()) == null) {
        } else {
            activity.invalidateOptionsMenu();
            onRenderNode(aaVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.b
    public void onLayoutError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834776a6", new Object[]{this});
        } else if (!(getActivity() instanceof CommonContainerActivity)) {
        } else {
            ((CommonContainerActivity) getActivity()).f();
        }
    }

    public void onRenderNode(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f7e666", new Object[]{this, aaVar});
            return;
        }
        if (getActivity() instanceof CommonContainerActivity) {
            ((CommonContainerActivity) getActivity()).a(aaVar);
        }
        this.delegate.a(aaVar);
    }

    public void onActivityFinish(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0c5247", new Object[]{this, aVar});
            return;
        }
        b bVar = this.delegate;
        if (bVar != null) {
            bVar.a(getActivity(), aVar);
        } else if (aVar == null) {
        } else {
            aVar.a();
        }
    }

    public boolean isInSecondPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c72dfd", new Object[]{this})).booleanValue();
        }
        if (!(getContext() instanceof ogb)) {
            return false;
        }
        return oga.a((ogb) getContext());
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.isResumeCalled = true;
        if (isInSecondPage()) {
            return;
        }
        onTNodeEngineResume();
    }

    public void onTNodeEngineResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f605ee2d", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            tNodeView.onResume();
        }
        IPage iPage = this.apmPage;
        if (iPage == null) {
            return;
        }
        iPage.d().a();
    }

    public void onTNodeEnginePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf4dc64", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            tNodeView.onPause();
        }
        IPage iPage = this.apmPage;
        if (iPage == null) {
            return;
        }
        iPage.d().c();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (isInSecondPage()) {
            return;
        }
        onTNodeEnginePause();
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        IPage iPage = this.apmPage;
        if (iPage == null) {
            return;
        }
        iPage.d().d();
    }

    @Override // android.support.v4.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        ab abVar = null;
        TNodeView tNodeView = this.tnodeView;
        if (tNodeView != null) {
            abVar = tNodeView.getEngine();
        }
        ArrayList<NavigationBarModule.b> menus = NavigationBarModule.getMenus(abVar);
        if (menus == null) {
            return;
        }
        for (int i = 0; i < menus.size(); i++) {
            addMenu(menu, menus.get(i));
        }
    }

    private void addMenu(Menu menu, final NavigationBarModule.b bVar) {
        MenuItem add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a8ede41", new Object[]{this, menu, bVar});
        } else if (menu == null) {
        } else {
            int i = 0;
            while (true) {
                if (i >= menu.size()) {
                    i = -1;
                    break;
                } else if (menu.getItem(i).getTitle().equals(bVar.b)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                add = menu.getItem(i);
            } else {
                String str = bVar.b;
                String str2 = bVar.c;
                if (!StringUtils.isEmpty(str) && str.contains("分享")) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        sb.append(getString(R.string.uik_icon_share_light));
                        sb.append(":");
                        sb.append(str);
                    } catch (Resources.NotFoundException unused) {
                        sb.append(str);
                    }
                    add = menu.add(sb.toString());
                    if (!StringUtils.isEmpty(str2)) {
                        if (RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(str2)) {
                            MenuItemCompat.setShowAsAction(add, 2);
                        }
                    } else {
                        MenuItemCompat.setShowAsAction(add, 0);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    if (!StringUtils.isEmpty(bVar.f20442a) && bVar.f20442a.startsWith("@icon-")) {
                        int d = ohd.d(getContext(), bVar.f20442a);
                        String string = d != 0 ? getString(d) : "";
                        if (!StringUtils.isEmpty(string)) {
                            sb2.append((CharSequence) string);
                            sb2.append(":");
                        }
                    }
                    if (!StringUtils.isEmpty(bVar.b)) {
                        sb2.append(bVar.b);
                    }
                    add = menu.add(sb2.toString());
                    if (!StringUtils.isEmpty(str2) && RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(str2)) {
                        MenuItemCompat.setShowAsAction(add, 2);
                    }
                }
            }
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.android.layoutmanager.container.BaseContainerFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(MenuItem menuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                    }
                    bVar.d.a((g.c) null, (Object) null);
                    return true;
                }
            });
        }
    }

    public boolean isResumeCalled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("106b2df", new Object[]{this})).booleanValue() : this.isResumeCalled;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.c
    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue() : isDetached() || isRemoving() || (getActivity() != null && getActivity().isFinishing());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.ab.c
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue() : !isDestroy();
    }
}
