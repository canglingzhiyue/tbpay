package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.main.BlackLightIndicatorBar;
import com.taobao.android.detail.core.detail.kit.view.widget.main.IndicatorBar;
import com.taobao.android.detail.core.utils.NetworkUtils;
import com.taobao.android.detail.datasdk.model.datamodel.node.ItemNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.GalleryViewModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.GalleryVideoModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.NormalImageModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.TBMultiMediaModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.VideoModel;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.c;
import com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.d;
import com.taobao.android.detail.wrapper.ext.uikit.SkuBar;
import com.taobao.avplayer.DWInstance;
import com.taobao.avplayer.common.x;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.vessel.VesselView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ecu;
import tb.emu;
import tb.epo;
import tb.epp;
import tb.fby;
import tb.kge;
import tb.rgw;

/* loaded from: classes5.dex */
public class MultiMediaViewModel extends RecyclerView.Adapter<com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a> implements Handler.Callback, b, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GALLERY_IMAGE_MIN_NUM = 2;
    private static final int MSG_ADD_GALLERY_IMG_SUB_ITEM = 303;
    private static final int MSG_ADD_GALLERY_VIDEO_SUB_ITEM = 302;
    private static final int MSG_REMOVE_SUBITEM = 301;
    private static final int MSG_REPLACE_SUB_ITEM = 304;
    public static final String TAG = "GALLERY_VIEW_MODEL";
    public BlackLightIndicatorBar mBlackLightIndicatorBar;
    public ImageView mBlacklightClosed;
    public RelativeLayout mContentView;
    private com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a mContentViewHolder;
    public Context mContext;
    public LinearLayout mDescEntrance;
    public GalleryRecyclerView mGalleyView;
    public IndicatorBar mIndicatorBar;
    public TextView mNewIndicator;
    public View mNewIndictorContainer;
    public RelativeLayout mPortableView;
    public SkuBar mSkubar;
    public rgw mVesselCallback;
    public VesselView mVesselView;
    public ArrayList<b> mSubItemViewModels = new ArrayList<>();
    public TBMultiMediaModel mTBMultiMediaModel = null;
    public final RelativeLayout.LayoutParams RELATIVE_LAYOUT_MATCH_PARENT = new RelativeLayout.LayoutParams(-1, -1);
    private final String BLANK_BUG_API_VERSION_ENDPOINT = "gallery_blank_bug_api_version";
    private final String BLANK_BUG_DELAY_TIME = "gallery_blank_bug_time";
    private final String OPEN_BLANK_BUG_VERY_OLD_PHONE_FIX = "open_blank_bug_very_old_phone_fix";
    public String ORANGE_GROUP_NAME = "android_detail";
    private boolean firstShowFlag = true;
    public int mCurrentImgIndex = 1;
    public int mShowIndex = 3;
    public boolean isWeexLoadSuccess = true;
    public a multiMediaUtils = mo897getUtils();
    public Handler mHandler = new Handler(this);
    public boolean enableCollorateConfig = ecu.E;

    static {
        kge.a(381876026);
        kge.a(-1917972144);
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

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void setParentModelUtils(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8356acef", new Object[]{this, aVar});
        }
    }

    public boolean isNewIndicator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24488aa4", new Object[]{this})).booleanValue();
        }
        TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
        if (tBMultiMediaModel != null) {
            return tBMultiMediaModel.isNewIndicator();
        }
        return false;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void bindModel(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1347cdd", new Object[]{this, subItemModel});
            return;
        }
        this.mTBMultiMediaModel = (TBMultiMediaModel) subItemModel;
        verifyChildren();
        reRenderViewHolder(this.mContentViewHolder);
        fixBlankBug();
    }

    private void verifyChildren() {
        boolean a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ae0ba1f", new Object[]{this});
            return;
        }
        ArrayList<SubItemModel> arrayList = this.mTBMultiMediaModel.childModels;
        for (int i = 0; i < arrayList.size(); i++) {
            int intValue = this.mTBMultiMediaModel.children.get(i).intValue();
            SubItemModel subItemModel = this.mTBMultiMediaModel.childModels.get(i);
            if (intValue == 1003) {
                a2 = d.a(this.mContext, subItemModel);
            } else if (intValue != 1006) {
                a2 = intValue != 1007 ? true : com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b.a(this.mContext, subItemModel);
            } else {
                a2 = false;
            }
            if (!a2) {
                arrayList.remove(i);
                this.mTBMultiMediaModel.children.remove(i);
                for (int i2 = i; i2 < arrayList.size(); i2++) {
                    SubItemModel subItemModel2 = arrayList.get(i);
                    subItemModel2.setIndex(subItemModel2.getIndex() - 1);
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
        String config = OrangeConfig.getInstance().getConfig(this.ORANGE_GROUP_NAME, "gallery_blank_bug_api_version", "17");
        int i2 = 17;
        try {
            i2 = Integer.parseInt(config);
        } catch (Throwable unused) {
            TLog.loge(TAG, "parse orange error when deal with blank bug: sApi = " + config);
        }
        if (i > i2) {
            return;
        }
        this.mGalleyView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f11158a = true;

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("df7e7eb3", new Object[]{this});
                } else if (!this.f11158a) {
                } else {
                    MultiMediaViewModel.this.render();
                    this.f11158a = false;
                }
            }
        });
    }

    public MultiMediaViewModel(Context context) {
        this.mContext = context;
        onCreate();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel");
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a getViewHolder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) ipChange.ipc$dispatch("852695bd", new Object[]{this});
        }
        this.mContentViewHolder = new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a(this.mContentView) { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel.2
        };
        this.mContentViewHolder.a(this);
        return this.mContentViewHolder;
    }

    private void invalidateIndicatorBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb861966", new Object[]{this});
            return;
        }
        TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
        if (tBMultiMediaModel == null || tBMultiMediaModel.childModels == null || this.mTBMultiMediaModel.childModels.size() == 0) {
            return;
        }
        SubItemModel subItemModel = this.mTBMultiMediaModel.childModels.get(0);
        List<ItemNode.VideoItem.AnchorInfo> arrayList = new ArrayList<>();
        if (subItemModel instanceof VideoModel) {
            arrayList = ((VideoModel) subItemModel).anchors;
        }
        IndicatorBar indicatorBar = this.mIndicatorBar;
        if (indicatorBar != null && this.mContentView != null && !indicatorBar.getHasInitialized()) {
            this.mIndicatorBar.setAnchorsAndStartInit(arrayList);
            if (this.mTBMultiMediaModel.childModels.size() == 2) {
                this.mIndicatorBar.setExtraButtonVisiblity(8);
            }
        }
        IndicatorBar indicatorBar2 = this.mIndicatorBar;
        if (indicatorBar2 != null) {
            indicatorBar2.setGalleryLeftData(this.mTBMultiMediaModel.mOpenUrlGalleryItemNode);
            this.mIndicatorBar.updateRightVideoData(this.mTBMultiMediaModel.mVideoGalleryItemNode);
        }
        BlackLightIndicatorBar blackLightIndicatorBar = this.mBlackLightIndicatorBar;
        if (blackLightIndicatorBar == null || this.mContentView == null || blackLightIndicatorBar.getHasInitialized()) {
            return;
        }
        this.mBlackLightIndicatorBar.setAnchorsAndStartInit(arrayList);
        if (this.mTBMultiMediaModel.childModels.size() != 2) {
            return;
        }
        this.mBlackLightIndicatorBar.setExtraButtonVisiblity(8);
    }

    private void initIndexer() {
        TextView textView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a80aed6", new Object[]{this});
            return;
        }
        if (this.mContext != null && this.mIndicatorBar != null) {
            TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
            if (tBMultiMediaModel != null && tBMultiMediaModel.childModels != null) {
                invalidateIndicatorBar();
            } else {
                this.mIndicatorBar.setIndicatorVisibility(8);
            }
            if (isNewIndicator() && (textView = this.mNewIndicator) != null) {
                textView.setVisibility(0);
                this.mIndicatorBar.setVisibility(8);
            }
        }
        if (this.mContext == null || this.mBlackLightIndicatorBar == null) {
            return;
        }
        TBMultiMediaModel tBMultiMediaModel2 = this.mTBMultiMediaModel;
        if (tBMultiMediaModel2 != null && tBMultiMediaModel2.childModels != null) {
            invalidateIndicatorBar();
        } else {
            this.mBlackLightIndicatorBar.setVisibility(8);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void reRenderViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48afe97e", new Object[]{this, aVar});
        } else {
            render();
        }
    }

    public void render() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        } else if (this.mTBMultiMediaModel == null) {
        } else {
            initIndexer();
            notifyDataSetChanged();
            this.mGalleyView.scrollToPosition(this.mTBMultiMediaModel.currentIndex);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c314ed0e", new Object[]{this});
            return;
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().willAppear();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onAppeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8a3efa", new Object[]{this});
            return;
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onAppeared();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void willDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6526ff8", new Object[]{this});
            return;
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().willDisappear();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDisappeared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b8232a", new Object[]{this});
            return;
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onDisappeared();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onCreate();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        VesselView vesselView = this.mVesselView;
        if (vesselView != null) {
            vesselView.onDestroy();
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onPause(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d90b75e", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        Iterator<b> it = this.mSubItemViewModels.iterator();
        while (it.hasNext()) {
            it.next().onPause(z, z2);
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.b
    public void onResume() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        ArrayList<b> arrayList = this.mSubItemViewModels;
        if (arrayList == null || arrayList.size() == 0 || (i = this.mTBMultiMediaModel.currentIndex) < 0 || i >= this.mSubItemViewModels.size()) {
            return;
        }
        this.mSubItemViewModels.get(i).onResume();
    }

    private b makeViewModel(int i) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("83e4ec14", new Object[]{this, new Integer(i)});
        }
        if (i == 1007) {
            bVar = new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b(this.mContext, this.enableCollorateConfig);
            setGalleryVideoViewModelNormalControllerListener((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) bVar);
        } else if (i != 1101) {
            switch (i) {
                case 1003:
                    bVar = new d(this.mContext, isNewIndicator());
                    setVideoViewModelNormalControllerListener((d) bVar);
                    break;
                case 1004:
                    bVar = new c(this.mContext);
                    break;
                case 1005:
                    bVar = new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.a(this.mContext);
                    break;
                default:
                    bVar = null;
                    break;
            }
        } else {
            bVar = new fby(this.mContext);
        }
        if (bVar != null) {
            bVar.setParentModelUtils(this.multiMediaUtils);
        }
        return bVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder  reason: avoid collision after fix types in other method */
    public com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a) ipChange.ipc$dispatch("3d4dbac0", new Object[]{this, viewGroup, new Integer(i)});
        }
        b makeViewModel = makeViewModel(i);
        if (makeViewModel == null) {
            throw new Error("Galley View Model null");
        }
        return makeViewModel.getViewHolder();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onBindViewHolder(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar, int i) {
        RecyclerView.LayoutParams generateLayoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dff6aa58", new Object[]{this, aVar, new Integer(i)});
            return;
        }
        if (this.mSubItemViewModels.size() <= i) {
            this.mSubItemViewModels.add(aVar.b());
        } else {
            this.mSubItemViewModels.set(i, aVar.b());
        }
        if (this.mTBMultiMediaModel == null) {
            return;
        }
        b b = aVar.b();
        b.bindModel(this.mTBMultiMediaModel.childModels.get(i));
        b.onCreate();
        b.reRenderViewHolder(aVar);
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
    public void onViewAttachedToWindow(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa5a7905", new Object[]{this, aVar});
            return;
        }
        aVar.b().willAppear();
        super.onViewAttachedToWindow((MultiMediaViewModel) aVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7eace8", new Object[]{this, aVar});
            return;
        }
        aVar.b().willDisappear();
        super.onViewDetachedFromWindow((MultiMediaViewModel) aVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
        if (tBMultiMediaModel == null) {
            return 0;
        }
        return tBMultiMediaModel.childModels.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
        if (tBMultiMediaModel == null) {
            return 0L;
        }
        return tBMultiMediaModel.children.get(i).intValue();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue() : this.mTBMultiMediaModel.children.get(i).intValue();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 301:
                if (this.enableCollorateConfig) {
                    int i = message.arg1;
                    ArrayList<SubItemModel> arrayList = this.mTBMultiMediaModel.childModels;
                    if (i <= arrayList.size() - 1) {
                        arrayList.remove(i);
                        this.mTBMultiMediaModel.children.remove(i);
                        for (int i2 = i; i2 < arrayList.size(); i2++) {
                            SubItemModel subItemModel = arrayList.get(i2);
                            subItemModel.setIndex(subItemModel.getIndex() - 1);
                        }
                        notifyItemRemoved(i);
                        if (i <= this.mTBMultiMediaModel.currentIndex) {
                            this.mTBMultiMediaModel.currentIndex--;
                            this.mCurrentImgIndex--;
                        }
                        updateFloatState();
                        updateNewIndicatorTotalSizePartString(getChildrenSize() - 1);
                        break;
                    }
                } else {
                    int i3 = message.arg1;
                    ArrayList<SubItemModel> arrayList2 = this.mTBMultiMediaModel.childModels;
                    arrayList2.remove(i3);
                    this.mTBMultiMediaModel.children.remove(i3);
                    for (int i4 = i3; i4 < arrayList2.size(); i4++) {
                        SubItemModel subItemModel2 = arrayList2.get(i4);
                        subItemModel2.setIndex(subItemModel2.getIndex() - 1);
                    }
                    notifyItemRemoved(i3);
                    updateNewIndicatorTotalSizePartString(getChildrenSize() - 1);
                    break;
                }
                break;
            case 302:
                if (this.enableCollorateConfig) {
                    Object obj = message.obj;
                    if (obj instanceof GalleryVideoModel) {
                        GalleryVideoModel galleryVideoModel = (GalleryVideoModel) obj;
                        int i5 = message.arg1;
                        if (i5 < 0) {
                            return false;
                        }
                        this.mTBMultiMediaModel.childModels.add(i5, galleryVideoModel);
                        this.mTBMultiMediaModel.children.add(i5, 1007);
                        for (int i6 = i5 + 1; i6 < this.mTBMultiMediaModel.childModels.size() - 1; i6++) {
                            this.mTBMultiMediaModel.childModels.get(i6).setIndex(i6);
                        }
                        if (i5 <= this.mTBMultiMediaModel.currentIndex) {
                            this.mTBMultiMediaModel.currentIndex++;
                            this.mCurrentImgIndex++;
                            this.mGalleyView.scrollToPosition(this.mTBMultiMediaModel.currentIndex);
                        }
                        updateFloatState();
                        notifyItemInserted(i5);
                        updateNewIndicatorTotalSizePartString(this.mTBMultiMediaModel.currentIndex + 1, getChildrenSize() - 1);
                        break;
                    }
                } else if (hasRightVideo()) {
                    return true;
                } else {
                    Object obj2 = message.obj;
                    if (obj2 instanceof GalleryVideoModel) {
                        GalleryVideoModel galleryVideoModel2 = (GalleryVideoModel) obj2;
                        int size = this.mTBMultiMediaModel.childModels.size() - 1;
                        int size2 = this.mTBMultiMediaModel.children.size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        if (size2 < 0) {
                            size2 = 0;
                        }
                        this.mTBMultiMediaModel.childModels.add(size, galleryVideoModel2);
                        galleryVideoModel2.setIndex(size);
                        this.mTBMultiMediaModel.children.add(size2, 1007);
                        int size3 = this.mTBMultiMediaModel.childModels.size() - 1;
                        this.mTBMultiMediaModel.childModels.get(size3).setIndex(size3);
                        notifyItemInserted(size);
                        updateNewIndicatorTotalSizePartString(getChildrenSize() - 1);
                        break;
                    }
                }
                break;
            case 303:
                Object obj3 = message.obj;
                if ((obj3 instanceof NormalImageModel) && this.mTBMultiMediaModel != null) {
                    int i7 = message.arg1;
                    this.mTBMultiMediaModel.childModels.add(i7, (NormalImageModel) obj3);
                    this.mTBMultiMediaModel.children.add(i7, 1004);
                    IndicatorBar indicatorBar = this.mIndicatorBar;
                    indicatorBar.setPicIndexText(indicatorBar.getCurrrentPosition() + 1, getChildrenSize() - 1);
                    updateNewIndicatorTotalSizePartString(getChildrenSize() - 1);
                    notifyDataSetChanged();
                    GalleryVideoModel galleryVideoModel3 = this.mTBMultiMediaModel.mGalleryVideoModel;
                    if (galleryVideoModel3 != null) {
                        galleryVideoModel3.setIndex(galleryVideoModel3.getIndex() + 1);
                        break;
                    }
                }
                break;
            case 304:
                if (message.obj instanceof NormalImageModel) {
                    int i8 = message.arg1;
                    this.mTBMultiMediaModel.childModels.set(i8, (NormalImageModel) message.obj);
                    this.mTBMultiMediaModel.children.set(i8, 1004);
                    notifyItemChanged(i8);
                }
                if (message.obj instanceof GalleryVideoModel) {
                    int i9 = message.arg1;
                    GalleryVideoModel galleryVideoModel4 = (GalleryVideoModel) message.obj;
                    if (this.mTBMultiMediaModel.isPopupMode) {
                        this.mTBMultiMediaModel.childModels.remove(i9);
                        this.mTBMultiMediaModel.children.remove(i9);
                        updateNewIndicatorTotalSizePartString(hasVideo() ? getChildrenSize() - 2 : getChildrenSize() - 1);
                        notifyItemRemoved(i9);
                        break;
                    } else {
                        this.mTBMultiMediaModel.childModels.set(i9, galleryVideoModel4);
                        this.mTBMultiMediaModel.children.set(i9, 1007);
                        notifyItemChanged(i9);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public void updateFloatState() {
        TBMultiMediaModel tBMultiMediaModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a971eec5", new Object[]{this});
        } else if (this.enableCollorateConfig && this.mCurrentImgIndex == this.mShowIndex && (tBMultiMediaModel = this.mTBMultiMediaModel) != null && !tBMultiMediaModel.isPopupMode && this.isWeexLoadSuccess) {
            this.mVesselView.setVisibility(0);
        } else {
            this.mVesselView.setVisibility(8);
        }
    }

    /* loaded from: classes5.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f11162a = 0;
        public boolean b = true;

        static {
            kge.a(-1882690628);
            kge.a(1579441847);
        }

        public View.OnClickListener a(int i, GalleryViewModel.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View.OnClickListener) ipChange.ipc$dispatch("7b01892e", new Object[]{this, new Integer(i), bVar});
            }
            return null;
        }

        public void a(TBMultiMediaModel tBMultiMediaModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("715d4c84", new Object[]{this, tBMultiMediaModel});
            }
        }

        public a() {
        }

        public void a(SubItemModel subItemModel) {
            int index;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ae69bd08", new Object[]{this, subItemModel});
            } else if (subItemModel == null || (index = subItemModel.getIndex()) < 0) {
            } else {
                Message obtainMessage = MultiMediaViewModel.this.mHandler.obtainMessage();
                obtainMessage.what = 301;
                obtainMessage.arg1 = index;
                MultiMediaViewModel.this.mHandler.sendMessage(obtainMessage);
            }
        }

        public void b(SubItemModel subItemModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8dab627", new Object[]{this, subItemModel});
                return;
            }
            Message obtainMessage = MultiMediaViewModel.this.mHandler.obtainMessage();
            obtainMessage.what = 304;
            obtainMessage.obj = subItemModel;
            obtainMessage.arg1 = subItemModel.getIndex();
            MultiMediaViewModel.this.mHandler.sendMessage(obtainMessage);
        }

        public void c(SubItemModel subItemModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e34baf46", new Object[]{this, subItemModel});
            } else if (!(subItemModel instanceof GalleryVideoModel)) {
            } else {
                Message obtainMessage = MultiMediaViewModel.this.mHandler.obtainMessage();
                obtainMessage.what = 302;
                obtainMessage.obj = subItemModel;
                obtainMessage.arg1 = subItemModel.getIndex();
                MultiMediaViewModel.this.mHandler.sendMessage(obtainMessage);
            }
        }

        public void d(SubItemModel subItemModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdbca865", new Object[]{this, subItemModel});
            } else if (!(subItemModel instanceof NormalImageModel)) {
            } else {
                Message obtainMessage = MultiMediaViewModel.this.mHandler.obtainMessage();
                obtainMessage.what = 303;
                obtainMessage.obj = subItemModel;
                obtainMessage.arg1 = subItemModel.getIndex();
                MultiMediaViewModel.this.mHandler.sendMessage(obtainMessage);
            }
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            boolean z = false;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f11162a;
            if (0 == j || currentTimeMillis - j > 60000) {
                this.f11162a = currentTimeMillis;
                if (NetworkUtils.ConnectType.CONNECT_TYPE_MOBILE == NetworkUtils.c(MultiMediaViewModel.this.mContext) && NetworkUtils.MobileNetworkType.MOBILE_NETWORK_TYPE_2G == NetworkUtils.e(MultiMediaViewModel.this.mContext)) {
                    z = true;
                }
                this.b = z;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("isLowNetwork = ");
            sb.append(this.b ? "true" : "false");
            epp.b(MultiMediaViewModel.TAG, sb.toString());
            return this.b;
        }

        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : epo.j() < 0.75d ? epo.b : epo.b(300);
        }

        public int c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : epo.b;
        }

        public int e(SubItemModel subItemModel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("182da177", new Object[]{this, subItemModel})).intValue() : b();
        }
    }

    /* renamed from: getUtils */
    public a mo897getUtils() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ee8b839c", new Object[]{this}) : new a();
    }

    public void setVideoViewModelNormalControllerListener(final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea514bef", new Object[]{this, dVar});
        } else if (dVar == null) {
        } else {
            dVar.a(new x() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.x
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (MultiMediaViewModel.this.mIndicatorBar == null || MultiMediaViewModel.this.mIndicatorBar.getIsPopupMode()) {
                    } else {
                        MultiMediaViewModel.this.mIndicatorBar.setBottomMarginByPixel(epo.k);
                    }
                }

                @Override // com.taobao.avplayer.common.x
                public void b() {
                    DWInstance b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (MultiMediaViewModel.this.mIndicatorBar == null || MultiMediaViewModel.this.mIndicatorBar.getIsPopupMode() || MultiMediaViewModel.this.mIndicatorBar.getExtraButtonSelected() || MultiMediaViewModel.this.mSubItemViewModels == null) {
                    } else {
                        Iterator<b> it = MultiMediaViewModel.this.mSubItemViewModels.iterator();
                        while (it.hasNext()) {
                            b next = it.next();
                            if (next != null && (next instanceof d) && (b = ((d) next).b()) != null && (b.getVideoState() == 2 || b.getVideoState() == 1)) {
                                MultiMediaViewModel.this.mIndicatorBar.setBottomMarginByPixel(dVar.e());
                            }
                        }
                    }
                }
            });
        }
    }

    public void setGalleryVideoViewModelNormalControllerListener(final com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7426843", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            bVar.a(new x() { // from class: com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.MultiMediaViewModel.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.avplayer.common.x
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (MultiMediaViewModel.this.mIndicatorBar == null || MultiMediaViewModel.this.mIndicatorBar.getIsPopupMode()) {
                    } else {
                        MultiMediaViewModel.this.mIndicatorBar.setBottomMarginByPixel(epo.k);
                    }
                }

                @Override // com.taobao.avplayer.common.x
                public void b() {
                    DWInstance b;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else if (MultiMediaViewModel.this.mIndicatorBar == null || MultiMediaViewModel.this.mIndicatorBar.getIsPopupMode() || MultiMediaViewModel.this.mSubItemViewModels == null) {
                    } else {
                        Iterator<b> it = MultiMediaViewModel.this.mSubItemViewModels.iterator();
                        while (it.hasNext()) {
                            b next = it.next();
                            if (next != null && (next instanceof com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) && (b = ((com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.b) next).b()) != null && b.getVideoState() == 1) {
                                MultiMediaViewModel.this.mIndicatorBar.setBottomMarginByPixel(bVar.c());
                            }
                        }
                    }
                }
            });
        }
    }

    public int getChildrenSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43843690", new Object[]{this})).intValue();
        }
        TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
        if (tBMultiMediaModel != null && tBMultiMediaModel.childModels != null) {
            return this.mTBMultiMediaModel.childModels.size();
        }
        return 0;
    }

    public void updateNewIndicatorTotalSizePartString(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e4a8b8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        TextView textView = this.mNewIndicator;
        if (textView == null) {
            return;
        }
        textView.setText(i + "/" + i2);
    }

    public void updateNewIndicatorTotalSizePartString(int i) {
        CharSequence text;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8093bfab", new Object[]{this, new Integer(i)});
            return;
        }
        TextView textView = this.mNewIndicator;
        if (textView == null || (text = textView.getText()) == null || text.length() <= 0 || (indexOf = text.toString().indexOf("/")) == -1) {
            return;
        }
        String substring = text.toString().substring(0, indexOf + 1);
        TextView textView2 = this.mNewIndicator;
        textView2.setText(substring + i);
    }

    public void setNewIndicatorBottomMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("999dd172", new Object[]{this, new Integer(i)});
            return;
        }
        View view = this.mNewIndictorContainer;
        if (view == null) {
            return;
        }
        view.setPadding(0, 0, 0, i);
    }

    public boolean hasVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea3be0c", new Object[]{this})).booleanValue();
        }
        TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
        if (tBMultiMediaModel != null) {
            return tBMultiMediaModel.childModels.get(0) instanceof VideoModel;
        }
        return false;
    }

    public boolean hasRightVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d51caa04", new Object[]{this})).booleanValue();
        }
        TBMultiMediaModel tBMultiMediaModel = this.mTBMultiMediaModel;
        if (tBMultiMediaModel == null) {
            return false;
        }
        if (this.enableCollorateConfig) {
            if (this.mTBMultiMediaModel.childModels.get(Math.max(tBMultiMediaModel.childModels.size() - 2, 0)) instanceof GalleryVideoModel) {
                return true;
            }
        } else {
            Iterator<SubItemModel> it = tBMultiMediaModel.childModels.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof GalleryVideoModel) {
                    return true;
                }
            }
        }
        return false;
    }
}
