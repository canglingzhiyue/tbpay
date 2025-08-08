package com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.datasdk.model.datamodel.node.GalleryNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class GalleryVideoModel implements SubItemModel, Comparable<SubItemModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GalleryNode.ContentVideo contentVideo;
    public GalleryNode.GalleryItemNode galleryItemNode;
    private boolean hiddenPlayingIcon;
    private int index;
    public GalleryNode.IndicatorImage indicatorImage;
    public TBMultiMediaModel parentModel;

    static {
        kge.a(-1786429563);
        kge.a(1162456369);
        kge.a(415966670);
    }

    public GalleryVideoModel(GalleryNode.GalleryItemNode galleryItemNode, TBMultiMediaModel tBMultiMediaModel) {
        this.galleryItemNode = galleryItemNode;
        this.parentModel = tBMultiMediaModel;
        initVideoFields();
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.subitem.GalleryVideoModel");
    }

    public GalleryVideoModel(GalleryNode.GalleryItemNode galleryItemNode, TBMultiMediaModel tBMultiMediaModel, boolean z) {
        this(galleryItemNode, tBMultiMediaModel);
        this.hiddenPlayingIcon = z;
    }

    public boolean isHiddenPlayingIcon() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("317cd4be", new Object[]{this})).booleanValue() : this.hiddenPlayingIcon;
    }

    private void initVideoFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9e626b", new Object[]{this});
            return;
        }
        GalleryNode.GalleryItemNode galleryItemNode = this.galleryItemNode;
        if (galleryItemNode == null) {
            return;
        }
        if (galleryItemNode.getContentType() == 2) {
            this.contentVideo = this.galleryItemNode.content.getVideoContentData();
        }
        if (this.galleryItemNode.getIndicatorType() != 1) {
            return;
        }
        this.indicatorImage = this.galleryItemNode.indicator.getImageIndicatorData();
    }

    public String getCoverUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7e00b", new Object[]{this});
        }
        GalleryNode.ContentVideo contentVideo = this.contentVideo;
        if (contentVideo == null) {
            return null;
        }
        return contentVideo.coverUrl;
    }

    public String getVideoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dbb94cf", new Object[]{this});
        }
        GalleryNode.ContentVideo contentVideo = this.contentVideo;
        if (contentVideo == null) {
            return null;
        }
        return contentVideo.videoUrl;
    }

    public String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        GalleryNode.ContentVideo contentVideo = this.contentVideo;
        if (contentVideo == null) {
            return null;
        }
        return contentVideo.videoId;
    }

    public String getVideoRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98d89e73", new Object[]{this});
        }
        GalleryNode.ContentVideo contentVideo = this.contentVideo;
        if (contentVideo == null) {
            return null;
        }
        return contentVideo.videoRatio;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public int getIndex() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cf396596", new Object[]{this})).intValue() : this.index;
    }

    @Override // com.taobao.android.detail.datasdk.model.viewmodel.main.SubItemModel
    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.index = i;
        }
    }

    public static boolean isVideoSize_3_4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d87272d0", new Object[]{str})).booleanValue();
        }
        if (!StringUtils.isEmpty(str)) {
            String[] split = str.split(":");
            try {
                double intValue = Integer.valueOf(split[0]).intValue() / Integer.valueOf(split[1]).intValue();
                if (intValue > 0.7d && intValue < 0.8d) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(SubItemModel subItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4143dfc", new Object[]{this, subItemModel})).intValue();
        }
        if (getIndex() > subItemModel.getIndex()) {
            return 1;
        }
        return getIndex() < subItemModel.getIndex() ? -1 : 0;
    }
}
