package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;
import com.taobao.android.detail.core.detail.ext.view.widget.base.TouchImageView;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndexView;
import com.taobao.android.detail.core.event.DetailEvent;
import com.taobao.android.detail.core.event.basic.n;
import com.taobao.android.detail.datasdk.model.viewmodel.main.BounceImageModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.NormalImageModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.VideoModel;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.GalleryRecyclerView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel;
import com.taobao.android.trade.event.Event;
import com.taobao.android.trade.event.ThreadMode;
import com.taobao.android.trade.event.i;
import com.taobao.android.trade.event.j;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dzh;
import tb.edp;
import tb.emu;
import tb.eno;
import tb.enp;
import tb.epj;
import tb.epo;
import tb.epq;
import tb.kge;

/* loaded from: classes5.dex */
public class GalleryViewModelEx extends MultiMediaViewModel implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RecyclerViewPager.a galleryOnPageChangedListener;
    private b galleryUtils;
    private a layoutManager;
    private LinearLayoutManager linearLayoutManager;
    private DetailImageView mAivTimeTunnel;
    private int mContainerHeight;
    private boolean mNeedToJumpBackToLast;

    static {
        kge.a(-1872801162);
        kge.a(-1453870097);
    }

    public static /* synthetic */ Object ipc$super(GalleryViewModelEx galleryViewModelEx, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1322813253:
                super.reRenderViewHolder((f) objArr[0]);
                return null;
            case 20217053:
                super.bindModel((SubItemModel) objArr[0]);
                return null;
            case 271584546:
                return super.getViewHolder();
            case 712627317:
                super.onBindViewHolder((f) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case 1192889117:
                super.render();
                return null;
            case 1838200670:
                super.onPause(((Boolean) objArr[0]).booleanValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void setParentModelUtils(MultiMediaViewModel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8913dfc5", new Object[]{this, aVar});
        }
    }

    public static /* synthetic */ b access$000(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5be00e71", new Object[]{galleryViewModelEx}) : galleryViewModelEx.galleryUtils;
    }

    public static /* synthetic */ DetailImageView access$100(GalleryViewModelEx galleryViewModelEx) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailImageView) ipChange.ipc$dispatch("1675bca4", new Object[]{galleryViewModelEx}) : galleryViewModelEx.mAivTimeTunnel;
    }

    public static /* synthetic */ boolean access$200(GalleryViewModelEx galleryViewModelEx, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8f757266", new Object[]{galleryViewModelEx, new Boolean(z)})).booleanValue() : galleryViewModelEx.popMultiMedia(z);
    }

    private void resetGalleyViewSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec9be599", new Object[]{this, new Integer(i)});
        } else if (this.mMultiMediaModel == null || this.mMultiMediaModel.childModels.isEmpty() || this.mMultiMediaModel.isPopupMode || (this.mMultiMediaModel.childModels.get(i) instanceof BounceImageModel)) {
        } else {
            ViewGroup.LayoutParams layoutParams = this.mGalleyView.getLayoutParams();
            int a2 = this.galleryUtils.a(this.mMultiMediaModel.childModels.get(0));
            if (layoutParams.height == a2) {
                return;
            }
            layoutParams.height = a2;
            this.mGalleyView.setLayoutParams(layoutParams);
        }
    }

    private void switchToPopupOrNotMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9dc425d7", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mMultiMediaModel.isPopupMode = z;
        if (z) {
            this.mGalleyView.findViewById(R.id.img_gallery).setLayoutParams(this.RELATIVE_LAYOUT_MATCH_PARENT);
            this.mBlacklightClosed.setVisibility(0);
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.galleryUtils.a(this.mMultiMediaModel.childModels.get(0)));
            layoutParams.addRule(15);
            this.mGalleyView.setLayoutParams(layoutParams);
            this.mBlacklightClosed.setVisibility(8);
        }
        render();
    }

    private boolean popMultiMedia(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffd6d555", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        notifyDataSetChanged();
        if (this.mMultiMediaModel == null || this.mMultiMediaModel.isPopupMode) {
            return false;
        }
        this.mMultiMediaModel.popupParentView = this.mContentView;
        this.mMultiMediaModel.popupView = this.mPortableView;
        this.mMultiMediaModel.isFromDetailMain = true;
        switchToPopupOrNotMode(true);
        if (this.mMultiMediaModel.currentIndex == 0 && 1003 == this.mMultiMediaModel.children.get(0).intValue()) {
            ((VideoModel) this.mMultiMediaModel.childModels.get(0)).popupPlayFlag = true;
        }
        com.taobao.android.trade.event.f.a(this.mContext, new n(this.mMultiMediaModel), new com.taobao.android.trade.event.c<i>() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.trade.event.c
            public void onEventException(j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f9dab53", new Object[]{this, jVar});
                }
            }

            @Override // com.taobao.android.trade.event.c
            public void a(i iVar, j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e2d27b9", new Object[]{this, iVar, jVar});
                    return;
                }
                com.taobao.android.detail.core.utils.i.a(MultiMediaViewModel.TAG, "pop onEventComplete");
                if (!z) {
                    return;
                }
                if (GalleryViewModelEx.this.mMultiMediaModel != null) {
                    GalleryViewModelEx.this.mMultiMediaModel.currentIndex = 0;
                }
                GalleryViewModelEx.this.mGalleyView.scrollToPosition(0);
                GalleryViewModelEx.this.mIndexView.setSelectedIndex(0);
            }
        });
        return true;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a79d475", new Object[]{this, fVar, new Integer(i)});
            return;
        }
        super.onBindViewHolder(fVar, i);
        if (i != 0) {
            return;
        }
        dzh.h(this.mContext, this.mMultiMediaModel);
    }

    @Override // com.taobao.android.trade.event.j
    public i handleEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i) ipChange.ipc$dispatch("caa7474e", new Object[]{this, event});
        }
        if (this.mMultiMediaModel == null) {
            return i.SUCCESS;
        }
        if ((this.mMultiMediaModel.childModels.get(0) instanceof NormalImageModel) && TextUtils.isEmpty(((NormalImageModel) this.mMultiMediaModel.childModels.get(0)).imageUrl)) {
            return i.SUCCESS;
        }
        if (eno.a(DetailEvent.class) == event.getEventId()) {
            if (((DetailEvent) event).getEventType() == 1) {
                if (this.mMultiMediaModel != null && this.mMultiMediaModel.isPopupMode) {
                    this.galleryUtils.a(this.mMultiMediaModel);
                }
                this.mMultiMediaModel.isPopupMode = false;
                switchToPopupOrNotMode(false);
                ViewGroup viewGroup = (ViewGroup) this.mPortableView.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.mPortableView);
                }
                this.mContentView.addView(this.mPortableView, this.RELATIVE_LAYOUT_MATCH_PARENT);
                if (this.mMultiMediaModel == null) {
                    return i.SUCCESS;
                }
                this.mGalleyView.scrollToPosition(this.mMultiMediaModel.currentIndex);
                this.mIndexView.setSelectedIndex(this.mMultiMediaModel.currentIndex);
            }
        } else if (eno.a(com.taobao.android.detail.core.event.basic.d.class) == event.getEventId()) {
            if (1003 == this.mMultiMediaModel.children.get(0).intValue()) {
                VideoModel videoModel = (VideoModel) this.mMultiMediaModel.childModels.get(0);
                if (videoModel.needAutoPlay) {
                    videoModel.isPlayState = true;
                    videoModel.needAutoPlay = false;
                }
                videoModel.popupPlayFlag = true;
            }
            popMultiMedia(true);
            this.mMultiMediaModel.popGallerySource = ((com.taobao.android.detail.core.event.basic.d) event).f9699a;
        } else if (eno.a(com.taobao.android.detail.core.event.basic.e.class) == event.getEventId()) {
            com.taobao.android.detail.core.event.basic.e eVar = (com.taobao.android.detail.core.event.basic.e) event;
            if (27 == eVar.a()) {
                boolean z = this.mMultiMediaModel.isPopupMode;
            } else {
                eVar.a();
            }
        }
        return i.SUCCESS;
    }

    @Override // com.taobao.android.trade.event.j
    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this}) : ThreadMode.MainThread;
    }

    public GalleryViewModelEx(Context context) {
        super(context);
        this.linearLayoutManager = null;
        boolean z = true;
        this.mNeedToJumpBackToLast = true;
        this.mContainerHeight = 0;
        this.galleryOnPageChangedListener = new RecyclerViewPager.a() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager.a
            public void a(int i, int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                try {
                    GalleryViewModelEx.this.mSubItemViewModels.get(i).onDisappeared();
                } catch (IndexOutOfBoundsException unused) {
                }
                try {
                    GalleryViewModelEx.this.mSubItemViewModels.get(i2).onAppeared();
                } catch (IndexOutOfBoundsException unused2) {
                }
                if (GalleryViewModelEx.this.mMultiMediaModel.childModels.size() - 1 > i2) {
                    GalleryViewModelEx.this.mMultiMediaModel.currentIndex = i2;
                    if (GalleryViewModelEx.this.mMultiMediaModel != null && GalleryViewModelEx.this.mMultiMediaModel.needIndex) {
                        GalleryViewModelEx.this.mIndexView.setSelectedIndex(i2);
                    }
                }
                GalleryViewModelEx.this.setAivTimeTunnel();
                if (GalleryViewModelEx.this.mMultiMediaModel == null || GalleryViewModelEx.this.mMultiMediaModel.childModels == null || 2 > GalleryViewModelEx.this.mMultiMediaModel.childModels.size() || GalleryViewModelEx.this.mMultiMediaModel.childModels.size() - 1 != i2) {
                    return;
                }
                GalleryViewModelEx.this.mGalleyView.scrollToPosition(GalleryViewModelEx.this.mMultiMediaModel.childModels.size() - 2);
                if (GalleryViewModelEx.this.mMultiMediaModel.isPopupMode) {
                    dzh.g(GalleryViewModelEx.this.mContext, GalleryViewModelEx.this.mMultiMediaModel);
                } else {
                    dzh.f(GalleryViewModelEx.this.mContext, GalleryViewModelEx.this.mMultiMediaModel);
                }
                com.taobao.android.trade.event.f.a(GalleryViewModelEx.this.mContext, new edp());
                if (!GalleryViewModelEx.this.mMultiMediaModel.isPopupMode) {
                    return;
                }
                com.taobao.android.trade.event.f.a(GalleryViewModelEx.this.mContext, new DetailEvent(1));
            }
        };
        this.galleryUtils = mo899getUtils();
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(context);
        if (this.mMultiMediaModel != null && this.mMultiMediaModel.isPopupMode) {
            z = false;
        }
        if (a2 != null && z) {
            a2.a(eno.a(DetailEvent.class), this);
            a2.a(eno.a(com.taobao.android.detail.core.event.basic.d.class), this);
            a2.a(eno.a(com.taobao.android.detail.core.event.basic.e.class), this);
        }
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void reRenderViewHolder(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12778bb", new Object[]{this, fVar});
        } else {
            super.reRenderViewHolder(fVar);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel
    public void render() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.render();
        setAivTimeTunnel();
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
            return;
        }
        super.bindModel(subItemModel);
        resetGalleyViewSize(0);
    }

    /* loaded from: classes5.dex */
    public class a extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public AtomicBoolean f11204a;

        static {
            kge.a(-1574828929);
        }

        public a(Context context) {
            super(context);
            this.f11204a = new AtomicBoolean(false);
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public RecyclerView.LayoutParams generateDefaultLayoutParams() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (RecyclerView.LayoutParams) ipChange.ipc$dispatch("fdddbac1", new Object[]{this}) : new RecyclerView.LayoutParams(GalleryViewModelEx.access$000(GalleryViewModelEx.this).c(), -1);
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollHorizontally() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
            }
            g gVar = null;
            int i = GalleryViewModelEx.this.mMultiMediaModel.currentIndex;
            if (i >= 0 && i < GalleryViewModelEx.this.mSubItemViewModels.size()) {
                gVar = GalleryViewModelEx.this.mSubItemViewModels.get(i);
            }
            if (!(gVar instanceof d)) {
                return !GalleryViewModelEx.this.mMultiMediaModel.isPopupMode || !this.f11204a.get();
            }
            TouchImageView c = ((d) gVar).c();
            return c == null || !c.canScrollHorizontally(GalleryViewModelEx.this.mGalleyView.getDx());
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            super.onPause(z, z2);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        com.taobao.android.trade.event.d a2 = com.taobao.android.trade.event.f.a(this.mContext);
        a2.a(eno.a(DetailEvent.class));
        a2.a(eno.a(com.taobao.android.detail.core.event.basic.d.class));
        a2.b(eno.a(com.taobao.android.detail.core.event.basic.e.class), this);
        super.onDestroy();
    }

    public void customContainerView(RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b6b144", new Object[]{this, relativeLayout});
            return;
        }
        this.mIndexView.setBottomMargin(epo.k);
        this.mGalleyView.setTriggerOffset(0.15f);
        this.mGalleyView.setFlingFactor(0.25f);
        this.mGalleyView.setSinglePageFling(true);
        this.layoutManager = new a(this.mContext);
        this.layoutManager.setOrientation(0);
        this.mGalleyView.addOnPageChangedListener(this.galleryOnPageChangedListener);
        this.mGalleyView.setLayoutManager(this.layoutManager);
        if (this.mBlacklightClosed == null) {
            return;
        }
        this.mBlacklightClosed.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    GalleryViewModelEx.access$000(GalleryViewModelEx.this).a(GalleryViewModelEx.this.mMultiMediaModel);
                }
            }
        });
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel, com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public f getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("10300d22", new Object[]{this});
        }
        if (this.mContentView == null) {
            this.mContentView = (RelativeLayout) LayoutInflater.from(this.mContext).inflate(R.layout.x_detail_main_new_gallery_ex, (ViewGroup) null);
        }
        this.mPortableView = (RelativeLayout) this.mContentView.findViewById(R.id.gallery_portable_container);
        this.mGalleyView = (GalleryRecyclerView) this.mContentView.findViewById(R.id.img_gallery);
        this.mIndexView = (IndexView) this.mContentView.findViewById(R.id.detail_main_gallery_index);
        this.mBlacklightClosed = (ImageView) this.mContentView.findViewById(R.id.blacklight_close);
        customContainerView(this.mContentView);
        this.mGalleyView.setHasFixedSize(true);
        this.mGalleyView.setAdapter(this);
        this.mGalleyView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3d337638", new Object[]{this, view});
                } else {
                    com.taobao.android.detail.core.utils.i.d(MultiMediaViewModel.TAG, "view attached");
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7f64d55b", new Object[]{this, view});
                } else {
                    com.taobao.android.detail.core.utils.i.d(MultiMediaViewModel.TAG, "view detached");
                }
            }
        });
        this.mContainerHeight = this.galleryUtils.b();
        if (this.mMultiMediaModel != null && !this.mMultiMediaModel.childModels.isEmpty()) {
            this.mContainerHeight = this.galleryUtils.a(this.mMultiMediaModel.childModels.get(0));
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.mContainerHeight);
        layoutParams.addRule(15);
        this.mGalleyView.setLayoutParams(layoutParams);
        View findViewById = this.mContentView.findViewById(R.id.stub_view);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams2.height = this.mContainerHeight;
        findViewById.setLayoutParams(layoutParams2);
        return super.getViewHolder();
    }

    private boolean needShowTimeTunnel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("83942733", new Object[]{this})).booleanValue() : this.mMultiMediaModel.currentIndex == 0 && this.mMultiMediaModel.timeTunnel != null && !TextUtils.isEmpty(this.mMultiMediaModel.timeTunnel.f10001a) && !TextUtils.isEmpty(this.mMultiMediaModel.timeTunnel.c);
    }

    public void trackShowTimeTunnel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da25aca4", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("trackPage", "Page_Detail_Show_Detail");
        hashMap.put("spm", this.mMultiMediaModel.timeTunnel.e != null ? this.mMultiMediaModel.timeTunnel.e : "a2141.7631564.1999020712");
        if (!TextUtils.isEmpty(this.mMultiMediaModel.timeTunnel.f)) {
            hashMap.put("scm", this.mMultiMediaModel.timeTunnel.f);
        }
        hashMap.put("trackId", "2201");
        enp enpVar = new enp(null);
        enpVar.f27473a = hashMap;
        com.taobao.android.trade.event.f.a(this.mContext, enpVar);
    }

    public void setAivTimeTunnel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fefec48", new Object[]{this});
        } else if (!this.mMultiMediaModel.isPopupMode && needShowTimeTunnel()) {
            trackShowTimeTunnel();
            if (this.mAivTimeTunnel == null) {
                this.mAivTimeTunnel = new DetailImageView(this.mContext);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, epo.b(57));
                layoutParams.addRule(13, -1);
                epj.b().a(this.mMultiMediaModel.timeTunnel.f10001a, this.mAivTimeTunnel);
                this.mAivTimeTunnel.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        dzh.h(GalleryViewModelEx.this.mContext, GalleryViewModelEx.this.mMultiMediaModel.timeTunnel.e != null ? GalleryViewModelEx.this.mMultiMediaModel.timeTunnel.e : "a2141.7631564.1999020712", GalleryViewModelEx.this.mMultiMediaModel.timeTunnel.f);
                        Bundle bundle = new Bundle();
                        bundle.putString("itemId", GalleryViewModelEx.this.mMultiMediaModel.itemId);
                        bundle.putString("origin", "Origin_Detail");
                        epq.a(GalleryViewModelEx.this.mContext, GalleryViewModelEx.this.mMultiMediaModel.timeTunnel.c, bundle);
                    }
                });
                this.mContentView.addView(this.mAivTimeTunnel, layoutParams);
            }
            this.mAivTimeTunnel.setVisibility(0);
            this.mHandler.postDelayed(new Runnable() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    GalleryViewModelEx.access$100(GalleryViewModelEx.this).bringToFront();
                    GalleryViewModelEx.this.mContentView.requestLayout();
                    GalleryViewModelEx.this.mContentView.invalidate();
                }
            }, 500L);
        } else {
            DetailImageView detailImageView = this.mAivTimeTunnel;
            if (detailImageView == null) {
                return;
            }
            detailImageView.setVisibility(4);
        }
    }

    /* loaded from: classes5.dex */
    public class b extends MultiMediaViewModel.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2042660877);
        }

        public b() {
            super();
        }

        @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel.a
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (GalleryViewModelEx.this.mIndexView == null) {
            } else {
                GalleryViewModelEx.this.mIndexView.setVisibility(i);
            }
        }

        @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel.a
        public View.OnClickListener a(final int i, final GalleryViewModel.b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("7b01892e", new Object[]{this, new Integer(i), bVar}) : new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModelEx.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    dzh.a(GalleryViewModelEx.this.mContext, i, GalleryViewModelEx.this.mMultiMediaModel);
                    GalleryViewModelEx.access$200(GalleryViewModelEx.this, false);
                }
            };
        }

        @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel.a
        public void a(MultiMediaModel multiMediaModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5953b14", new Object[]{this, multiMediaModel});
                return;
            }
            DetailEvent detailEvent = new DetailEvent(1);
            detailEvent.params = multiMediaModel;
            com.taobao.android.trade.event.f.a(GalleryViewModelEx.this.mContext, detailEvent);
        }

        @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel.a
        public int a(SubItemModel subItemModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae69bcfb", new Object[]{this, subItemModel})).intValue();
            }
            if ((subItemModel instanceof VideoModel) && VideoModel.isVideoSize_3_4(((VideoModel) subItemModel).spatialVideoDimension)) {
                return (int) ((epo.b / 3.0d) * 4.0d);
            }
            return b();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel
    /* renamed from: getUtils */
    public b mo899getUtils() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("a4f2d2ff", new Object[]{this}) : new b();
    }
}
