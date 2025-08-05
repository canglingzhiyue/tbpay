package tb;

import com.taobao.android.fluid.framework.data.datamodel.MediaContentDetailData;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.List;

/* loaded from: classes5.dex */
public interface skm {
    String getUnExposeIds();

    List getUnExposeItems();

    List<a.c> getUnExposedItems();

    List<MediaContentDetailData> getUnVisibleOrExposedItems(boolean z, boolean z2);
}
