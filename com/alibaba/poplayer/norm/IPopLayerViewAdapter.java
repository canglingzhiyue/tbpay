package com.alibaba.poplayer.norm;

import android.net.Uri;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import java.util.List;

/* loaded from: classes.dex */
public interface IPopLayerViewAdapter {
    boolean isHitBlackList(Uri uri, BaseConfigItem baseConfigItem, List<String> list);
}
