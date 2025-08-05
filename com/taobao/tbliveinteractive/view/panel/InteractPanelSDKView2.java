package com.taobao.tbliveinteractive.view.panel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.tbliveinteractive.InteractiveComponent;
import com.taobao.tbliveinteractive.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.ddv;
import tb.ddw;
import tb.fpr;
import tb.kge;
import tb.mto;
import tb.pmd;
import tb.pnj;
import tb.qmv;
import tb.qmy;
import tb.qnh;

/* loaded from: classes8.dex */
public class InteractPanelSDKView2 extends BasePopupView implements com.taobao.tbliveinteractive.view.panel.a, ddv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mCover;
    private AliUrlImageView mEmptyView;
    private Runnable mHideRunnable;
    private b mInteractPanelNativeOnClickListener;
    private com.taobao.tbliveinteractive.b mInteractiveComponentManager;
    private List<InteractiveComponent> mInteractiveNativeComponents;
    private c mListNativeAdapter;
    private c mListNormalAdapter;
    private RecyclerView mNativeRecyclerView;
    private RecyclerView mNormalRecyclerView;
    private e mTBLiveInteractiveManager;
    private String mToken;
    private VideoInfo mVideoInfo;

    static {
        kge.a(1570701734);
        kge.a(696083462);
        kge.a(191318335);
    }

    public static /* synthetic */ Object ipc$super(InteractPanelSDKView2 interactPanelSDKView2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode != -340027132) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.show();
            return null;
        }
    }

    @Override // tb.ddv
    public String bizCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("36951559", new Object[]{this}) : e.EVENTCENTER_BIZCODE;
    }

    @Override // com.taobao.tbliveinteractive.view.panel.BasePopupView
    public boolean isLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d5a9c4f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void access$000(InteractPanelSDKView2 interactPanelSDKView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5df5b844", new Object[]{interactPanelSDKView2});
        } else {
            interactPanelSDKView2.needHide();
        }
    }

    public static /* synthetic */ c access$100(InteractPanelSDKView2 interactPanelSDKView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("1c67b5cc", new Object[]{interactPanelSDKView2}) : interactPanelSDKView2.mListNormalAdapter;
    }

    public static /* synthetic */ c access$200(InteractPanelSDKView2 interactPanelSDKView2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2a73dfab", new Object[]{interactPanelSDKView2}) : interactPanelSDKView2.mListNativeAdapter;
    }

    public InteractPanelSDKView2(Context context, ViewGroup viewGroup, View view, String str, e eVar, com.taobao.tbliveinteractive.b bVar, boolean z, VideoInfo videoInfo) {
        super(context, viewGroup, z);
        this.mInteractiveNativeComponents = new ArrayList();
        this.mToken = str;
        this.mTBLiveInteractiveManager = eVar;
        this.mInteractiveComponentManager = bVar;
        this.mVideoInfo = videoInfo;
        init(view);
    }

    private void init(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
            return;
        }
        this.mCover = view;
        View view2 = this.mCover;
        if (view2 != null) {
            view2.setContentDescription("返回直播间");
            qmy.a(this.mCover);
        }
        View view3 = this.mCover;
        if (view3 == null) {
            return;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbliveinteractive.view.panel.InteractPanelSDKView2.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view4});
                } else {
                    InteractPanelSDKView2.access$000(InteractPanelSDKView2.this);
                }
            }
        });
    }

    @Override // com.taobao.tbliveinteractive.view.panel.a
    public void init(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d78ae423", new Object[]{this, bVar});
            return;
        }
        this.mInteractPanelNativeOnClickListener = bVar;
        ddw.a().a(this);
    }

    @Override // com.taobao.tbliveinteractive.view.panel.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mInteractiveNativeComponents.clear();
        ddw.a().b(this);
    }

    @Override // com.taobao.tbliveinteractive.view.panel.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        setVisibility(8);
        this.mContentView = viewGroup;
        if (this.mbPopFromRight) {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_interact_panel_layout2, this.mContentView, false);
        } else {
            inflate = LayoutInflater.from(getContext()).inflate(R.layout.taolive_interact_panel_layout2, this.mContentView, false);
        }
        this.mEmptyView = (AliUrlImageView) inflate.findViewById(R.id.empty_view);
        this.mNormalRecyclerView = (RecyclerView) inflate.findViewById(R.id.taolive_intercat_recycler_normal);
        this.mNormalRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.mNormalRecyclerView.setHasFixedSize(true);
        this.mListNormalAdapter = new c(this.mToken, this.mContext, this.mTBLiveInteractiveManager, "taolive_interact_panel_normal");
        ArrayList arrayList = new ArrayList();
        com.taobao.tbliveinteractive.b bVar = this.mInteractiveComponentManager;
        if (bVar != null) {
            arrayList.addAll(bVar.e());
        }
        this.mListNormalAdapter.a(arrayList);
        this.mNormalRecyclerView.setAdapter(this.mListNormalAdapter);
        this.mNormalRecyclerView.addItemDecoration(new a(this.mListNormalAdapter, "58ap"));
        ((DefaultItemAnimator) this.mNormalRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        this.mNativeRecyclerView = (RecyclerView) inflate.findViewById(R.id.taolive_intercat_recycler_native);
        this.mNativeRecyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.mNativeRecyclerView.setHasFixedSize(true);
        this.mListNativeAdapter = new c(this.mToken, this.mContext, this.mTBLiveInteractiveManager, "taolive_interact_panel_native");
        this.mListNativeAdapter.a(this.mInteractiveNativeComponents);
        this.mNativeRecyclerView.setAdapter(this.mListNativeAdapter);
        this.mNativeRecyclerView.addItemDecoration(new a(this.mListNativeAdapter, "65ap"));
        ((DefaultItemAnimator) this.mNativeRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 85;
        this.mContentView.addView(inflate, layoutParams);
        this.mContentView.setVisibility(8);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbliveinteractive.view.panel.InteractPanelSDKView2.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                }
            }
        });
        pmd.a().m().a(pnj.LOG_TAG, "InteractPanel---init");
        if (inflate != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (this.mContext instanceof Activity) {
                ((Activity) this.mContext).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            } else {
                displayMetrics = this.mContext.getResources().getDisplayMetrics();
            }
            inflate.setLayoutParams(onCreateLayoutParams(inflate, displayMetrics));
        }
        return this.mContentView;
    }

    @Override // com.taobao.tbliveinteractive.view.panel.BasePopupView, com.taobao.tbliveinteractive.view.panel.a
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        pmd.a().m().a(pnj.LOG_TAG, "InteractPanel---show");
        qnh.a(this.mTBLiveInteractiveManager, "show-tab_morefunction", new HashMap());
        if (this.mContentView != null) {
            this.mContentView.setVisibility(0);
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(0);
        }
        update();
        c cVar = this.mListNormalAdapter;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
        c cVar2 = this.mListNativeAdapter;
        if (cVar2 != null) {
            cVar2.notifyDataSetChanged();
        }
        notifyMsgEntranceChanged(true);
        if (this.mContentView == null || this.mContentView.findViewById(R.id.tv_interact) == null) {
            return;
        }
        this.mContentView.findViewById(R.id.tv_interact).sendAccessibilityEvent(8);
    }

    @Override // com.taobao.tbliveinteractive.view.panel.BasePopupView, com.taobao.tbliveinteractive.view.panel.a
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        notifyMsgEntranceChanged(false);
        pmd.a().m().a(pnj.LOG_TAG, "InteractPanel---hide");
        View view = this.mCover;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private void needHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f250e77f", new Object[]{this});
            return;
        }
        hide();
        Runnable runnable = this.mHideRunnable;
        if (runnable == null) {
            return;
        }
        runnable.run();
    }

    private void notifyMsgEntranceChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee419a67", new Object[]{this, new Boolean(z)});
        } else if (this.mListNormalAdapter == null || this.mTBLiveInteractiveManager == null) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("action", z ? "open" : "close");
            hashMap.put("snapshot", this.mListNormalAdapter.a());
            this.mTBLiveInteractiveManager.a("TBLiveWVPlugin.Event.PanelChanged", hashMap);
        }
    }

    @Override // com.taobao.tbliveinteractive.view.panel.a
    public void addNativeComponent(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96cd460", new Object[]{this, interactiveComponent});
        } else {
            addNativePanelViewItem(interactiveComponent);
        }
    }

    @Override // com.taobao.tbliveinteractive.view.panel.a
    public void addInteractComponent(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25e1a63f", new Object[]{this, interactiveComponent});
        } else {
            addNormalPanelViewItem(interactiveComponent);
        }
    }

    @Override // com.taobao.tbliveinteractive.view.panel.a
    public void removeInteractComponent(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3451fb22", new Object[]{this, interactiveComponent});
        } else {
            removeNormalPanelViewItem(interactiveComponent);
        }
    }

    private void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        c cVar = this.mListNormalAdapter;
        if (cVar == null || this.mListNativeAdapter == null || this.mNormalRecyclerView == null || this.mNativeRecyclerView == null || this.mEmptyView == null) {
            return;
        }
        if (cVar.getItemCount() <= 0 && this.mListNativeAdapter.getItemCount() <= 0) {
            this.mNormalRecyclerView.setVisibility(8);
            this.mNativeRecyclerView.setVisibility(8);
            this.mEmptyView.setVisibility(0);
            this.mEmptyView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01VnWM891K3xtcYvUJP_!!6000000001109-2-tps-930-540.png");
            return;
        }
        this.mNormalRecyclerView.setVisibility(0);
        this.mNativeRecyclerView.setVisibility(0);
        this.mEmptyView.setVisibility(8);
    }

    @Override // com.taobao.tbliveinteractive.view.panel.BasePopupView
    public ViewGroup.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("24d7a7e0", new Object[]{this, view, displayMetrics});
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        e eVar = this.mTBLiveInteractiveManager;
        if (eVar != null && (eVar.o().c(getContext()) || this.mTBLiveInteractiveManager.o().b(getContext()))) {
            int d = this.mTBLiveInteractiveManager.o().d(getContext());
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 85;
            }
            layoutParams.width = d;
            layoutParams.height = -2;
        } else {
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            if (this.mbPopFromRight) {
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 53;
                }
                layoutParams.width = min;
                layoutParams.height = min;
            } else {
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 83;
                }
                layoutParams.width = min;
                layoutParams.height = -2;
            }
        }
        return layoutParams;
    }

    @Override // tb.ddv
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.dxmanager.event".equals(str)) {
            if (!(obj instanceof qmv.a) || this.mListNormalAdapter == null) {
                return;
            }
            if (!(this.mContentView != null) || !(this.mContentView.getVisibility() == 0)) {
                return;
            }
            qmv.a aVar = (qmv.a) obj;
            if (aVar.f32947a == null || aVar.f32947a.length <= 4 || !"interact_panel_click".equals(aVar.f32947a[1])) {
                return;
            }
            String valueOf = String.valueOf(aVar.f32947a[2]);
            String valueOf2 = String.valueOf(aVar.f32947a[3]);
            String valueOf3 = String.valueOf(aVar.f32947a[4]);
            needHide();
            if ("event".equals(valueOf2)) {
                b bVar = this.mInteractPanelNativeOnClickListener;
                if (bVar != null) {
                    bVar.OnClickInteractPanelNativeListener(valueOf);
                }
            } else {
                com.taobao.tbliveinteractive.b bVar2 = this.mInteractiveComponentManager;
                if (bVar2 != null) {
                    bVar2.a(this.mContext, valueOf, valueOf2, valueOf3);
                }
            }
            com.taobao.tbliveinteractive.b bVar3 = this.mInteractiveComponentManager;
            if (bVar3 == null) {
                return;
            }
            InteractiveComponent a2 = bVar3.a(valueOf);
            e eVar = this.mTBLiveInteractiveManager;
            String[] strArr = new String[8];
            strArr[0] = "event=" + aVar.f32947a[1];
            strArr[1] = "compName=" + valueOf;
            strArr[2] = "comppos=1";
            strArr[3] = "iconAction=" + valueOf2;
            strArr[4] = "actionNavUrl=" + valueOf3;
            strArr[5] = "clickIndex=" + aVar.b;
            StringBuilder sb = new StringBuilder();
            sb.append("type=");
            String str2 = "native";
            if (a2 == null || !str2.equals(a2.type)) {
                str2 = "interact";
            }
            sb.append(str2);
            strArr[6] = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("dataComp=");
            sb2.append(a2 == null ? "null" : a2.parseJsonTBLiveInteractiveComponent().toJSONString());
            strArr[7] = sb2.toString();
            qnh.a(eVar, "RightEntrance", strArr);
        } else if (!"com.taobao.taolive.room.interactive_component_update_entrance_info".equals(str) || !(obj instanceof InteractiveComponent)) {
        } else {
            InteractiveComponent interactiveComponent = (InteractiveComponent) obj;
            if (!interactiveComponent.migrationFlag || !interactiveComponent.interactivePanelDisplayOnly) {
                return;
            }
            addNormalPanelViewItem(interactiveComponent);
        }
    }

    @Override // tb.ddv
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this}) : new String[]{"com.taobao.taolive.room.dxmanager.event", "com.taobao.taolive.room.interactive_component_update_entrance_info"};
    }

    @Override // tb.ddv
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this}) : this.mToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addNativePanelViewItem(com.taobao.tbliveinteractive.InteractiveComponent r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tbliveinteractive.view.panel.InteractPanelSDKView2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.String r7 = "32923901"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            com.taobao.tbliveinteractive.view.panel.c r0 = r6.mListNativeAdapter
            if (r0 == 0) goto L1d
            r0.a(r7)
            goto L5d
        L1d:
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.mInteractiveNativeComponents
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            com.taobao.tbliveinteractive.InteractiveComponent r1 = (com.taobao.tbliveinteractive.InteractiveComponent) r1
            java.lang.String r4 = r7.name
            java.lang.String r5 = r1.name
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L43
            java.lang.String r4 = r7.fedName
            java.lang.String r5 = r1.fedName
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 == 0) goto L23
        L43:
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.mInteractiveNativeComponents
            r0.remove(r1)
            boolean r0 = r7.isNeedShowEntrance
            if (r0 == 0) goto L51
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.mInteractiveNativeComponents
            r0.add(r7)
        L51:
            r2 = 0
        L52:
            if (r2 == 0) goto L5d
            boolean r0 = r7.isNeedShowEntrance
            if (r0 == 0) goto L5d
            java.util.List<com.taobao.tbliveinteractive.InteractiveComponent> r0 = r6.mInteractiveNativeComponents
            r0.add(r7)
        L5d:
            r6.update()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbliveinteractive.view.panel.InteractPanelSDKView2.addNativePanelViewItem(com.taobao.tbliveinteractive.InteractiveComponent):void");
    }

    public void addNormalPanelViewItem(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c253dd1", new Object[]{this, interactiveComponent});
            return;
        }
        c cVar = this.mListNormalAdapter;
        if (cVar != null) {
            cVar.a(interactiveComponent);
        } else {
            com.taobao.tbliveinteractive.b bVar = this.mInteractiveComponentManager;
            if (bVar != null) {
                bVar.b(interactiveComponent);
            }
        }
        update();
    }

    public void removeNormalPanelViewItem(InteractiveComponent interactiveComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfd3e5f4", new Object[]{this, interactiveComponent});
            return;
        }
        c cVar = this.mListNormalAdapter;
        if (cVar != null) {
            cVar.b(interactiveComponent);
        } else {
            com.taobao.tbliveinteractive.b bVar = this.mInteractiveComponentManager;
            if (bVar != null) {
                bVar.c(interactiveComponent);
            }
        }
        update();
    }

    /* loaded from: classes8.dex */
    public class a extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private c b;
        private String c;

        static {
            kge.a(2092223235);
        }

        public a(c cVar, String str) {
            this.b = cVar;
            this.c = str;
        }

        @Override // android.support.v7.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b6efc6", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            int max = Math.max(InteractPanelSDKView2.access$100(InteractPanelSDKView2.this).getItemCount(), InteractPanelSDKView2.access$200(InteractPanelSDKView2.this).getItemCount());
            int itemCount = this.b.getItemCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int a2 = fpr.a(recyclerView.getContext(), this.c, com.taobao.taolive.sdk.utils.b.a(recyclerView.getContext(), 58.0f));
            int min = Math.min(com.taobao.taolive.sdk.utils.b.b(recyclerView.getContext()), com.taobao.taolive.sdk.utils.b.c(recyclerView.getContext()));
            if (max > 5) {
                int a3 = com.taobao.taolive.sdk.utils.b.a(recyclerView.getContext(), 2.0f);
                int max2 = (int) Math.max((double) mto.a.GEO_NOT_SUPPORT, (((min - a3) / 5.3d) - a2) / 2.0d);
                rect.right = max2;
                rect.left = max2;
                if (childAdapterPosition == 0) {
                    rect.left = max2 + a3;
                }
            } else {
                int a4 = com.taobao.taolive.sdk.utils.b.a(recyclerView.getContext(), 9.0f);
                int max3 = Math.max(0, (((min - (a4 << 1)) / 5) - a2) / 2);
                rect.right = max3;
                rect.left = max3;
                if (childAdapterPosition == 0) {
                    rect.left = max3 + a4;
                }
                if (itemCount == childAdapterPosition + 1 && itemCount == 5) {
                    rect.right = max3 + a4;
                }
            }
            rect.bottom = 0;
            rect.top = 0;
        }
    }

    public void setHideRunnable(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e27286", new Object[]{this, runnable});
        } else {
            this.mHideRunnable = runnable;
        }
    }
}
