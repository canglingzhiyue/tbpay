package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndexView;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.viewmodel.main.MultiMediaModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.VideoModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.GalleryRecyclerView;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.kge;

/* loaded from: classes5.dex */
public class MultiMediaViewModel extends RecyclerView.Adapter<f> implements Handler.Callback, g, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GALLERY_IMAGE_MIN_NUM = 2;
    private static final int MSG_REMOVE_SUBITEM = 301;
    public static final String TAG = "MultiMediaViewModel";
    public ImageView mBlacklightClosed;
    public RelativeLayout mContentView;
    private f mContentViewHolder;
    public Context mContext;
    public GalleryRecyclerView mGalleyView;
    public IndexView mIndexView;
    public RelativeLayout mPortableView;
    public ArrayList<g> mSubItemViewModels = new ArrayList<>();
    public MultiMediaModel mMultiMediaModel = null;
    public final RelativeLayout.LayoutParams RELATIVE_LAYOUT_MATCH_PARENT = new RelativeLayout.LayoutParams(-1, -1);
    private final String BLANK_BUG_API_VERSION_ENDPOINT = "gallery_blank_bug_api_version";
    private final String BLANK_BUG_DELAY_TIME = "gallery_blank_bug_time";
    private final String OPEN_BLANK_BUG_VERY_OLD_PHONE_FIX = "open_blank_bug_very_old_phone_fix";
    public String ORANGE_GROUP_NAME = "android_detail";
    private boolean firstShowFlag = true;
    public a multiMediaUtils = mo899getUtils();
    public Handler mHandler = new Handler(this);

    static {
        kge.a(-1105321496);
        kge.a(865899874);
        kge.a(-1043440182);
        kge.a(1028243835);
    }

    public static /* synthetic */ Object ipc$super(MultiMediaViewModel multiMediaViewModel, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -955520525) {
            super.onViewAttachedToWindow((MultiMediaViewModel) ((RecyclerView.ViewHolder) objArr[0]));
            return null;
        } else if (hashCode != 1216347414) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onViewDetachedFromWindow((MultiMediaViewModel) ((RecyclerView.ViewHolder) objArr[0]));
            return null;
        }
    }

    public int getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5378242a", new Object[]{this})).intValue();
        }
        return 1001;
    }

    public void setParentModelUtils(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8913dfc5", new Object[]{this, aVar});
        }
    }

    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
            return;
        }
        this.mMultiMediaModel = (MultiMediaModel) subItemModel;
        verifyChildren();
        reRenderViewHolder(this.mContentViewHolder);
        fixBlankBug();
    }

    private void verifyChildren() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae0ba1f", new Object[]{this});
            return;
        }
        ArrayList<SubItemModel> arrayList = this.mMultiMediaModel.childModels;
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = this.mMultiMediaModel.children.get(i).intValue();
            this.mMultiMediaModel.childModels.get(i);
            if (!((intValue == 1002 || intValue == 1006) ? false : true)) {
                arrayList.remove(i);
                this.mMultiMediaModel.children.remove(i);
                for (int i2 = i; i2 < arrayList.size(); i2++) {
                    SubItemModel subItemModel = arrayList.get(i);
                    subItemModel.setIndex(subItemModel.getIndex() - 1);
                }
            }
        }
    }

    private void fixBlankBug() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c33b1bc", new Object[]{this});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        String a2 = epj.h().a(this.ORANGE_GROUP_NAME, "gallery_blank_bug_api_version", "17");
        int i2 = 17;
        try {
            i2 = Integer.parseInt(a2);
        } catch (Throwable unused) {
            i.a(TAG, "parse orange error when deal with blank bug: sApi = " + a2);
        }
        if (i > i2) {
            return;
        }
        this.mGalleyView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f11207a = true;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                } else if (!this.f11207a) {
                } else {
                    MultiMediaViewModel.this.render();
                    this.f11207a = false;
                }
            }
        });
    }

    public MultiMediaViewModel(Context context) {
        this.mContext = context;
        onCreate();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel");
    }

    public f getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("10300d22", new Object[]{this});
        }
        this.mContentViewHolder = new f(this.mContentView) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.MultiMediaViewModel.2
        };
        this.mContentViewHolder.a(this);
        return this.mContentViewHolder;
    }

    private void invalidateIndexView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8099623", new Object[]{this});
            return;
        }
        this.mIndexView.setTotalCount(this.mMultiMediaModel.childModels.size() - 1);
        this.mIndexView.setSelectedIndex(0);
        this.mIndexView.setVisibility(0);
        this.mIndexView.invalidate();
    }

    private void invalidateIndicatorBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb861966", new Object[]{this});
            return;
        }
        MultiMediaModel multiMediaModel = this.mMultiMediaModel;
        if (multiMediaModel == null || multiMediaModel.childModels == null || this.mMultiMediaModel.childModels.size() == 0) {
            return;
        }
        this.mMultiMediaModel.childModels.get(0);
        new ArrayList();
    }

    private void initIndexer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80aed6", new Object[]{this});
            return;
        }
        if (this.mContext != null && this.mIndexView != null) {
            if (this.mMultiMediaModel.childModels.size() <= 2) {
                MultiMediaModel multiMediaModel = this.mMultiMediaModel;
                if (multiMediaModel != null && multiMediaModel.needIndex) {
                    this.mIndexView.setVisibility(8);
                }
            } else {
                invalidateIndexView();
            }
        }
        if (this.mContext == null || this.mIndexView == null) {
            return;
        }
        MultiMediaModel multiMediaModel2 = this.mMultiMediaModel;
        if (multiMediaModel2 != null && multiMediaModel2.childModels != null) {
            invalidateIndicatorBar();
        } else {
            this.mIndexView.setVisibility(8);
        }
    }

    public void reRenderViewHolder(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12778bb", new Object[]{this, fVar});
        } else {
            render();
        }
    }

    public void render() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        } else if (this.mMultiMediaModel == null) {
        } else {
            initIndexer();
            notifyDataSetChanged();
            MultiMediaModel multiMediaModel = this.mMultiMediaModel;
            if (multiMediaModel != null && multiMediaModel.needIndex) {
                this.mIndexView.setSelectedIndex(this.mMultiMediaModel.currentIndex);
            }
            this.mGalleyView.scrollToPosition(this.mMultiMediaModel.currentIndex);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<g> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().willAppear();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a3efa", new Object[]{this});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<g> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onAppeared();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<g> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().willDisappear();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<g> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onDisappeared();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.g
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<g> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onCreate();
        }
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<g> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<g> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onPause(z, z2);
        }
    }

    public void onResume() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ArrayList<g> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0 || (i = this.mMultiMediaModel.currentIndex) < 0 || i >= this.mSubItemViewModels.size()) {
            return;
        }
        this.mSubItemViewModels.get(i).onResume();
    }

    private g makeViewModel(int i) {
        g dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("b886da09", new Object[]{this, new Integer(i)});
        }
        if (i == 1004) {
            dVar = new d(this.mContext);
        } else if (i == 1005) {
            dVar = new b(this.mContext);
        } else {
            dVar = i != 1101 ? null : new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.a(this.mContext);
        }
        if (dVar != null) {
            dVar.setParentModelUtils(this.multiMediaUtils);
        }
        return dVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public f mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("80d691ff", new Object[]{this, viewGroup, new Integer(i)});
        }
        g makeViewModel = makeViewModel(i);
        if (makeViewModel == null) {
            throw new Error("Galley View Model null");
        }
        return makeViewModel.getViewHolder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(f fVar, int i) {
        RecyclerView.LayoutParams generateLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a79d475", new Object[]{this, fVar, new Integer(i)});
            return;
        }
        if (this.mSubItemViewModels.size() <= i) {
            this.mSubItemViewModels.add(fVar.b());
        } else {
            this.mSubItemViewModels.set(i, fVar.b());
        }
        if (this.mMultiMediaModel == null) {
            return;
        }
        g b = fVar.b();
        b.bindModel(this.mMultiMediaModel.childModels.get(i));
        b.onCreate();
        b.reRenderViewHolder(fVar);
        if (this.firstShowFlag) {
            this.firstShowFlag = false;
            b.onAppeared();
        }
        ViewGroup.LayoutParams layoutParams = b.getViewHolder().a().getLayoutParams();
        if (layoutParams == null) {
            generateLayoutParams = this.mGalleyView.getLayoutManager().generateDefaultLayoutParams();
        } else {
            generateLayoutParams = this.mGalleyView.getLayoutManager().generateLayoutParams(layoutParams);
        }
        b.getViewHolder().a().setLayoutParams(generateLayoutParams);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651c8594", new Object[]{this, fVar});
            return;
        }
        fVar.b().willAppear();
        super.onViewAttachedToWindow((MultiMediaViewModel) fVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fc4791", new Object[]{this, fVar});
            return;
        }
        fVar.b().willDisappear();
        super.onViewDetachedFromWindow((MultiMediaViewModel) fVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        MultiMediaModel multiMediaModel = this.mMultiMediaModel;
        if (multiMediaModel == null) {
            return 0;
        }
        return multiMediaModel.childModels.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        MultiMediaModel multiMediaModel = this.mMultiMediaModel;
        if (multiMediaModel == null) {
            return 0L;
        }
        return multiMediaModel.children.get(i).intValue();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.mMultiMediaModel.children.get(i).intValue();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 301) {
            int i = message.arg1;
            ArrayList<SubItemModel> arrayList = this.mMultiMediaModel.childModels;
            arrayList.remove(i);
            this.mMultiMediaModel.children.remove(i);
            for (int i2 = i; i2 < arrayList.size(); i2++) {
                SubItemModel subItemModel = arrayList.get(i2);
                subItemModel.setIndex(subItemModel.getIndex() - 1);
            }
            notifyItemRemoved(i);
            MultiMediaModel multiMediaModel = this.mMultiMediaModel;
            if (multiMediaModel != null && multiMediaModel.needIndex) {
                invalidateIndexView();
            }
        }
        return true;
    }

    /* loaded from: classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long b = 0;
        public boolean c = true;

        static {
            kge.a(-754681238);
            kge.a(1579441847);
        }

        public View.OnClickListener a(int i, GalleryViewModel.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View.OnClickListener) ipChange.ipc$dispatch("7b01892e", new Object[]{this, new Integer(i), bVar});
            }
            return null;
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            }
        }

        public void a(MultiMediaModel multiMediaModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5953b14", new Object[]{this, multiMediaModel});
            }
        }

        public a() {
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.b;
            if (0 == j || currentTimeMillis - j > 60000) {
                this.b = currentTimeMillis;
                if (NetworkUtils.ConnectType.CONNECT_TYPE_MOBILE == NetworkUtils.c(MultiMediaViewModel.this.mContext) && NetworkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_2G == NetworkUtils.e(MultiMediaViewModel.this.mContext)) {
                    z = true;
                }
                this.c = z;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("isLowNetwork = ");
            sb.append(this.c ? "true" : "false");
            i.d(MultiMediaViewModel.TAG, sb.toString());
            return this.c;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : epo.j() < 0.75d ? epo.b : epo.b(300);
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : epo.b;
        }

        public int a(SubItemModel subItemModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ae69bcfb", new Object[]{this, subItemModel})).intValue() : b();
        }
    }

    /* renamed from: getUtils */
    public a mo899getUtils() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("5afcd93e", new Object[]{this}) : new a();
    }

    public boolean hasVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3be0c", new Object[]{this})).booleanValue();
        }
        MultiMediaModel multiMediaModel = this.mMultiMediaModel;
        if (multiMediaModel != null) {
            return multiMediaModel.childModels.get(0) instanceof VideoModel;
        }
        return false;
    }
}
