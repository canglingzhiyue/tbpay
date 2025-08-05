package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailRecyclerview;
import java.util.List;

/* loaded from: classes5.dex */
public interface b {
    void addItems(List<ThumbnailItem> list);

    void destroy();

    List<ThumbnailItem> getItems();

    void notifyDataChanged();

    void removeItem(int i);

    void setIThumbnailCallback(a aVar);

    void setItems(List<ThumbnailItem> list, ThumbnailRecyclerview.a aVar);

    void setSelectedIndex(int i);

    void updateCorrespondingItem(int i);
}
